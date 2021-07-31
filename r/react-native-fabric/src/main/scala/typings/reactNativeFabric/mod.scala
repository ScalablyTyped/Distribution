package typings.reactNativeFabric

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeFabric.anon.Crash
import typings.reactNativeFabric.anon.LogAddToCart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-fabric", JSImport.Namespace)
  @js.native
  val ^ : Fabric = js.native
  
  /**
    * A key/value pair of strings.
    */
  type Attributes = StringDictionary[String]
  
  trait Fabric extends StObject {
    
    /**
      * API for interacting with the Answers kit.
      *
      * https://docs.fabric.io/ios/answers/index.html
      */
    var Answers: LogAddToCart
    
    /**
      * API for interacting with the Crashlytics kit.
      *
      * https://docs.fabric.io/ios/crashlytics/index.html
      */        
    var Crashlytics: Crash
  }
  object Fabric {
    
    @scala.inline
    def apply(Answers: LogAddToCart, Crashlytics: Crash): Fabric = {
      val __obj = js.Dynamic.literal(Answers = Answers.asInstanceOf[js.Any], Crashlytics = Crashlytics.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fabric]
    }
    
    @scala.inline
    implicit class FabricMutableBuilder[Self <: Fabric] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnswers(value: LogAddToCart): Self = StObject.set(x, "Answers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrashlytics(value: Crash): Self = StObject.set(x, "Crashlytics", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Fabric
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Fabric = ^
}
