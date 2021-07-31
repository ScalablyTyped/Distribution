package typings.restartHooks

import typings.restartHooks.restartHooksStrings.`use-credentials`
import typings.restartHooks.restartHooksStrings.anonymous
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useImageMod {
  
  @JSImport("@restart/hooks/cjs/useImage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): State = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[State]
  @scala.inline
  def default(imageOrUrl: String): State = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any]).asInstanceOf[State]
  @scala.inline
  def default(imageOrUrl: String, crossOrigin: String): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  @scala.inline
  def default(imageOrUrl: Null, crossOrigin: String): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  @scala.inline
  def default(imageOrUrl: Unit, crossOrigin: String): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  @scala.inline
  def default(imageOrUrl: HTMLImageElement): State = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any]).asInstanceOf[State]
  @scala.inline
  def default(imageOrUrl: HTMLImageElement, crossOrigin: String): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  
  @scala.inline
  def default_anonymous(imageOrUrl: String, crossOrigin: anonymous): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  @scala.inline
  def default_anonymous(imageOrUrl: Null, crossOrigin: anonymous): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  @scala.inline
  def default_anonymous(imageOrUrl: Unit, crossOrigin: anonymous): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  @scala.inline
  def default_anonymous(imageOrUrl: HTMLImageElement, crossOrigin: anonymous): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  
  @scala.inline
  def default_usecredentials(imageOrUrl: String, crossOrigin: `use-credentials`): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  @scala.inline
  def default_usecredentials(imageOrUrl: Null, crossOrigin: `use-credentials`): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  @scala.inline
  def default_usecredentials(imageOrUrl: Unit, crossOrigin: `use-credentials`): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  @scala.inline
  def default_usecredentials(imageOrUrl: HTMLImageElement, crossOrigin: `use-credentials`): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  
  trait State extends StObject {
    
    var error: js.Any | Null
    
    var image: HTMLImageElement | Null
  }
  object State {
    
    @scala.inline
    def apply(): State = {
      val __obj = js.Dynamic.literal(error = null, image = null)
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorNull: Self = StObject.set(x, "error", null)
      
      @scala.inline
      def setImage(value: HTMLImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageNull: Self = StObject.set(x, "image", null)
    }
  }
}
