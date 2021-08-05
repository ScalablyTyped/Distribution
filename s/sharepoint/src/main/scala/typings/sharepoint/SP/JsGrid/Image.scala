package typings.sharepoint.SP.JsGrid

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  /** Renders the image with specified alternative text and on-click handler.
    If bHideTooltip == false, then alternative text is also shown as the tooltip (title attribute). */
  def Render(altText: String, clickFn: js.Function1[/* eventInfo */ DomEvent, Unit], bHideTooltip: Boolean): HTMLElement
  
  var bIsAnimated: Boolean
  
  var bIsClustered: Boolean
  
  var imgCssNames: String
  
  var imgSrc: String
  
  var optOuterCssNames: String
}
object Image {
  
  inline def apply(
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
  
  extension [Self <: Image](x: Self) {
    
    inline def setBIsAnimated(value: Boolean): Self = StObject.set(x, "bIsAnimated", value.asInstanceOf[js.Any])
    
    inline def setBIsClustered(value: Boolean): Self = StObject.set(x, "bIsClustered", value.asInstanceOf[js.Any])
    
    inline def setImgCssNames(value: String): Self = StObject.set(x, "imgCssNames", value.asInstanceOf[js.Any])
    
    inline def setImgSrc(value: String): Self = StObject.set(x, "imgSrc", value.asInstanceOf[js.Any])
    
    inline def setOptOuterCssNames(value: String): Self = StObject.set(x, "optOuterCssNames", value.asInstanceOf[js.Any])
    
    inline def setRender(value: (String, js.Function1[/* eventInfo */ DomEvent, Unit], Boolean) => HTMLElement): Self = StObject.set(x, "Render", js.Any.fromFunction3(value))
  }
}
