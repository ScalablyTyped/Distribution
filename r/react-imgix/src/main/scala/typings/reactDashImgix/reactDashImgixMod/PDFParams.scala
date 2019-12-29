package typings.reactDashImgix.reactDashImgixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFParams extends js.Object {
  var page: js.UndefOr[ImgixParamType] = js.undefined
}

object PDFParams {
  @scala.inline
  def apply(page: ImgixParamType = null): PDFParams = {
    val __obj = js.Dynamic.literal()
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFParams]
  }
}

