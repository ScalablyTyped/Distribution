package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullscreenOptions extends StObject {
  
  var navigationUI: js.UndefOr[FullscreenNavigationUI] = js.undefined
}
object FullscreenOptions {
  
  @scala.inline
  def apply(): FullscreenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullscreenOptions]
  }
  
  @scala.inline
  implicit class FullscreenOptionsMutableBuilder[Self <: FullscreenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNavigationUI(value: FullscreenNavigationUI): Self = StObject.set(x, "navigationUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationUIUndefined: Self = StObject.set(x, "navigationUI", js.undefined)
  }
}
