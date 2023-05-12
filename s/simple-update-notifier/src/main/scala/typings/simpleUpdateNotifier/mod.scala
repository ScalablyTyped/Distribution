package typings.simpleUpdateNotifier

import typings.simpleUpdateNotifier.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simple-update-notifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: IUpdate): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait IUpdate extends StObject {
    
    var alwaysRun: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var distTag: js.UndefOr[String] = js.undefined
    
    var pkg: Name
    
    var shouldNotifyInNpmScript: js.UndefOr[Boolean] = js.undefined
    
    var updateCheckInterval: js.UndefOr[Double] = js.undefined
  }
  object IUpdate {
    
    inline def apply(pkg: Name): IUpdate = {
      val __obj = js.Dynamic.literal(pkg = pkg.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUpdate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IUpdate] (val x: Self) extends AnyVal {
      
      inline def setAlwaysRun(value: Boolean): Self = StObject.set(x, "alwaysRun", value.asInstanceOf[js.Any])
      
      inline def setAlwaysRunUndefined: Self = StObject.set(x, "alwaysRun", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDistTag(value: String): Self = StObject.set(x, "distTag", value.asInstanceOf[js.Any])
      
      inline def setDistTagUndefined: Self = StObject.set(x, "distTag", js.undefined)
      
      inline def setPkg(value: Name): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setShouldNotifyInNpmScript(value: Boolean): Self = StObject.set(x, "shouldNotifyInNpmScript", value.asInstanceOf[js.Any])
      
      inline def setShouldNotifyInNpmScriptUndefined: Self = StObject.set(x, "shouldNotifyInNpmScript", js.undefined)
      
      inline def setUpdateCheckInterval(value: Double): Self = StObject.set(x, "updateCheckInterval", value.asInstanceOf[js.Any])
      
      inline def setUpdateCheckIntervalUndefined: Self = StObject.set(x, "updateCheckInterval", js.undefined)
    }
  }
}
