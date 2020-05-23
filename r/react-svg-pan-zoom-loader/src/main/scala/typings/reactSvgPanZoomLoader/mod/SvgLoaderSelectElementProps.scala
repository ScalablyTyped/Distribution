package typings.reactSvgPanZoomLoader.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgLoaderSelectElementProps
  extends /* prop */ StringDictionary[js.Any] {
  var children: js.UndefOr[String] = js.undefined
  var selector: String
}

object SvgLoaderSelectElementProps {
  @scala.inline
  def apply(
    selector: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    children: String = null
  ): SvgLoaderSelectElementProps = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgLoaderSelectElementProps]
  }
}

