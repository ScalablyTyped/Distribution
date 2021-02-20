package typings.sharepoint.SP.JsGrid

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends StObject {
  
  /** Renders the image with specified alternative text and on-click handler.
    If bHideTooltip == false, then alternative text is also shown as the tooltip (title attribute). */
  def Render(altText: String, clickFn: js.Function1[/* eventInfo */ DomEvent, Unit], bHideTooltip: Boolean): HTMLElement = js.native
  
  var bIsAnimated: Boolean = js.native
  
  var bIsClustered: Boolean = js.native
  
  var imgCssNames: String = js.native
  
  var imgSrc: String = js.native
  
  var optOuterCssNames: String = js.native
}
object Image {
  
  @scala.inline
  def apply(
    Render: (String, js.Function1[/* eventInfo */ DomEvent, Unit], Boolean) => HTMLElement,
    bIsAnimated: Boolean,
    bIsClustered: Boolean,
    imgCssNames: String,
    imgSrc: String,
    optOuterCssNames: String
  ): Image = {
    val __obj = js.Dynamic.literal(Render = js.Any.fromFunction3(Render), bIsAnimated = bIsAnimated.asInstanceOf[js.Any], bIsClustered = bIsClustered.asInstanceOf[js.Any], imgCssNames = imgCssNames.asInstanceOf[js.Any], imgSrc = imgSrc.asInstanceOf[js.Any], optOuterCssNames = optOuterCssNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBIsAnimated(value: Boolean): Self = StObject.set(x, "bIsAnimated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBIsClustered(value: Boolean): Self = StObject.set(x, "bIsClustered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgCssNames(value: String): Self = StObject.set(x, "imgCssNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgSrc(value: String): Self = StObject.set(x, "imgSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptOuterCssNames(value: String): Self = StObject.set(x, "optOuterCssNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: (String, js.Function1[/* eventInfo */ DomEvent, Unit], Boolean) => HTMLElement): Self = StObject.set(x, "Render", js.Any.fromFunction3(value))
  }
}
