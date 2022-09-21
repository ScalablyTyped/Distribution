package typings.sharepoint.global.SP.JsGrid

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.JsGrid.Image")
@js.native
open class Image protected ()
  extends StObject
     with typings.sharepoint.SP.JsGrid.Image {
  /** optOuterCssNames and optImgCssNames are strings that contain css class names separated by spaces.
    optImgCssNames are applied to the img tag.
    if bIsClustered, image is rendered inside div, and optOuterCssNames are applied to the div. */
  def this(
    imgSrc: String,
    bIsClustered: Boolean,
    optOuterCssNames: String,
    optImgCssNames: String,
    bIsAnimated: Boolean
  ) = this()
  
  /** Renders the image with specified alternative text and on-click handler.
    If bHideTooltip == false, then alternative text is also shown as the tooltip (title attribute). */
  /* CompleteClass */
  override def Render(altText: String, clickFn: js.Function1[/* eventInfo */ DomEvent, Unit], bHideTooltip: Boolean): HTMLElement = js.native
  
  /* CompleteClass */
  var bIsAnimated: Boolean = js.native
  
  /* CompleteClass */
  var bIsClustered: Boolean = js.native
  
  /* CompleteClass */
  var imgCssNames: String = js.native
  
  /* CompleteClass */
  var imgSrc: String = js.native
  
  /* CompleteClass */
  var optOuterCssNames: String = js.native
}
