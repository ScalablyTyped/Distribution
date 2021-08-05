package typings.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object config {
  
  @js.native
  trait Config extends StObject {
    
    /**
      * Fetches the remote config data from Firebase, defined in the dashboard.
      * The default expiration duration is 43200 seconds (12 hours)
      */
    def activateFetched(): js.Promise[Boolean] = js.native
    
    /** Enable Remote Config developer mode to allow for frequent refreshes of the cache. */
    def enableDeveloperMode(): Unit = js.native
    
    /**
      * Fetches the remote config data from Firebase, defined in the dashboard.
      * If duration is defined (seconds), data will be locally cached for this duration.
      *
      * The default duration is 43200 seconds (12 hours).
      * To force a cache refresh call the method with a duration of 0.
      */
    def fetch(): js.Promise[String] = js.native
    def fetch(duration: Double): js.Promise[String] = js.native
    
    /**
      * Returns all keys as an array by a prefix. If no prefix is defined all keys are returned.
      */
    def getKeysByPrefix(): js.Promise[js.Array[String]] = js.native
    def getKeysByPrefix(prefix: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Gets a config item by key.
      * Returns a snapshot containing source (default, remote or static) and val function.
      */
    def getValue(key: String): js.Promise[ConfigSnapshot] = js.native
    
    /**
      * Gets multiple values by key.
      * Returns a snapshot object with snapshot keys e.g. snapshots.foo.val().
      */
    def getValues(array: js.Array[String]): js.Promise[Object[ConfigSnapshot]] = js.native
    
    /**
      * Sets default values for the app to use when accessing values.
      * Any data fetched and activated will override any default values.
      * Any values in the defaults but not on Firebase will be untouched.
      */
    def setDefaults(defaults: js.Object): Unit = js.native
    
    /**
      * Sets the default values from a resource:
      * - Android: Id for the XML resource, which should be in your application's res/xml folder.
      * - iOS: The plist file name, with no file name extension.
      */
    def setDefaultsFromResource(resource: String): Unit = js.native
    def setDefaultsFromResource(resource: Double): Unit = js.native
  }
  
  trait ConfigSnapshot extends StObject {
    
    var source: String
    
    def `val`(): js.Any
  }
  object ConfigSnapshot {
    
    inline def apply(source: String, `val`: () => js.Any): ConfigSnapshot = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
      __obj.asInstanceOf[ConfigSnapshot]
    }
    
    extension [Self <: ConfigSnapshot](x: Self) {
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setVal(value: () => js.Any): Self = StObject.set(x, "val", js.Any.fromFunction0(value))
    }
  }
  
  type Object[ConfigSnapshot] = StringDictionary[ConfigSnapshot]
}
