package typings.restartHooks

import typings.restartHooks.restartHooksStrings.`use-credentials`
import typings.restartHooks.restartHooksStrings.anonymous
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUseImageMod {
  
  @JSImport("@restart/hooks/cjs/useImage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): State = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[State]
  inline def default(imageOrUrl: String): State = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any]).asInstanceOf[State]
  inline def default(imageOrUrl: String, crossOrigin: anonymous | `use-credentials`): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def default(imageOrUrl: String, crossOrigin: String): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def default(imageOrUrl: Null, crossOrigin: anonymous | `use-credentials`): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def default(imageOrUrl: Null, crossOrigin: String): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def default(imageOrUrl: Unit, crossOrigin: anonymous | `use-credentials`): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def default(imageOrUrl: Unit, crossOrigin: String): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def default(imageOrUrl: HTMLImageElement): State = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any]).asInstanceOf[State]
  inline def default(imageOrUrl: HTMLImageElement, crossOrigin: anonymous | `use-credentials`): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def default(imageOrUrl: HTMLImageElement, crossOrigin: String): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  
  trait State extends StObject {
    
    var error: Any | Null
    
    var image: HTMLImageElement | Null
  }
  object State {
    
    inline def apply(): State = {
      val __obj = js.Dynamic.literal(error = null, image = null)
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setImage(value: HTMLImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
    }
  }
}
