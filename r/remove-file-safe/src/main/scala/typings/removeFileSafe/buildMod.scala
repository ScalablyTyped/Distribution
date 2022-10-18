package typings.removeFileSafe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("remove-file-safe/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeFile(path: String): js.Promise[js.UndefOr[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Boolean]]]
  inline def removeFile(path: String, options: Options): js.Promise[js.UndefOr[Boolean]] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Boolean]]]
  
  inline def removeFileSync(path: String): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  inline def removeFileSync(path: String, options: Options): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  trait Options extends StObject {
    
    /**
      * Allow removals outside of current working directory, or OS temp directory. Default: `false`
      */
    var unsafe: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setUnsafe(value: Boolean): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      inline def setUnsafeUndefined: Self = StObject.set(x, "unsafe", js.undefined)
    }
  }
}
