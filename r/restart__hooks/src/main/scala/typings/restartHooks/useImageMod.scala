package typings.restartHooks

import typings.restartHooks.restartHooksStrings.`use-credentials`
import typings.restartHooks.restartHooksStrings.anonymous
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useImageMod {
  
  @JSImport("@restart/hooks/cjs/useImage", JSImport.Default)
  @js.native
  def default(): State = js.native
  @JSImport("@restart/hooks/cjs/useImage", JSImport.Default)
  @js.native
  def default(imageOrUrl: js.UndefOr[scala.Nothing], crossOrigin: String): State = js.native
  @JSImport("@restart/hooks/cjs/useImage", JSImport.Default)
  @js.native
  def default(imageOrUrl: String): State = js.native
  @JSImport("@restart/hooks/cjs/useImage", JSImport.Default)
  @js.native
  def default(imageOrUrl: String, crossOrigin: String): State = js.native
  @JSImport("@restart/hooks/cjs/useImage", JSImport.Default)
  @js.native
  def default(imageOrUrl: Null, crossOrigin: String): State = js.native
  @JSImport("@restart/hooks/cjs/useImage", JSImport.Default)
  @js.native
  def default(imageOrUrl: HTMLImageElement): State = js.native
  @JSImport("@restart/hooks/cjs/useImage", JSImport.Default)
  @js.native
  def default(imageOrUrl: HTMLImageElement, crossOrigin: String): State = js.native
  @JSImport("@restart/hooks/cjs/useImage", JSImport.Default)
  @js.native
  def default_anonymous(imageOrUrl: js.UndefOr[scala.Nothing], crossOrigin: anonymous): State = js.native
  @JSImport("@restart/hooks/cjs/useImage", JSImport.Default)
  @js.native
  def default_anonymous(imageOrUrl: String, crossOrigin: anonymous): State = js.native
  @JSImport("@restart/hooks/cjs/useImage", JSImport.Default)
  @js.native
  def default_anonymous(imageOrUrl: Null, crossOrigin: anonymous): State = js.native
  @JSImport("@restart/hooks/cjs/useImage", JSImport.Default)
  @js.native
  def default_anonymous(imageOrUrl: HTMLImageElement, crossOrigin: anonymous): State = js.native
  @JSImport("@restart/hooks/cjs/useImage", JSImport.Default)
  @js.native
  def default_usecredentials(imageOrUrl: js.UndefOr[scala.Nothing], crossOrigin: `use-credentials`): State = js.native
  @JSImport("@restart/hooks/cjs/useImage", JSImport.Default)
  @js.native
  def default_usecredentials(imageOrUrl: String, crossOrigin: `use-credentials`): State = js.native
  @JSImport("@restart/hooks/cjs/useImage", JSImport.Default)
  @js.native
  def default_usecredentials(imageOrUrl: Null, crossOrigin: `use-credentials`): State = js.native
  @JSImport("@restart/hooks/cjs/useImage", JSImport.Default)
  @js.native
  def default_usecredentials(imageOrUrl: HTMLImageElement, crossOrigin: `use-credentials`): State = js.native
  
  @js.native
  trait State extends StObject {
    
    var error: js.Any | Null = js.native
    
    var image: HTMLImageElement | Null = js.native
  }
  object State {
    
    @scala.inline
    def apply(): State = {
      val __obj = js.Dynamic.literal()
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
