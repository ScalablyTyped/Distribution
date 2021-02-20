package typings.progressjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressJsOptions extends StObject {
  
  /**
    * to consider CSS3 transitions in events
    */
  var considerTransition: js.UndefOr[Boolean] = js.native
  
  /**
    * overlay mode makes an overlay layer in the target element
    */
  var overlayMode: js.UndefOr[Boolean] = js.native
  
  /**
    * progress bar theme
    */
  var theme: js.UndefOr[String] = js.native
}
object ProgressJsOptions {
  
  @scala.inline
  def apply(): ProgressJsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressJsOptions]
  }
  
  @scala.inline
  implicit class ProgressJsOptionsMutableBuilder[Self <: ProgressJsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsiderTransition(value: Boolean): Self = StObject.set(x, "considerTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsiderTransitionUndefined: Self = StObject.set(x, "considerTransition", js.undefined)
    
    @scala.inline
    def setOverlayMode(value: Boolean): Self = StObject.set(x, "overlayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayModeUndefined: Self = StObject.set(x, "overlayMode", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
