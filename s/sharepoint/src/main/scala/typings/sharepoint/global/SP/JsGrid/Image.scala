package typings.sharepoint.global.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.JsGrid.Image")
@js.native
class Image protected ()
  extends typings.sharepoint.SP.JsGrid.Image {
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
}
