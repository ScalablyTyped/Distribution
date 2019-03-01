package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaptionHeader extends js.Object {
  var captionHeader: js.UndefOr[java.lang.String] = js.undefined
  var captionText: java.lang.String
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
}

object Anon_CaptionHeader {
  @scala.inline
  def apply(
    captionText: java.lang.String,
    captionHeader: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null
  ): Anon_CaptionHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("captionText")(captionText)
    if (captionHeader != null) __obj.updateDynamic("captionHeader")(captionHeader)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    __obj.asInstanceOf[Anon_CaptionHeader]
  }
}

