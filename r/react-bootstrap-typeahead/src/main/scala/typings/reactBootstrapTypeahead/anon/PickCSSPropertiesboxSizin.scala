package typings.reactBootstrapTypeahead.anon

import typings.csstype.mod.BoxSizingProperty
import typings.csstype.mod.WidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react.react.CSSProperties, 'boxSizing' | 'width'> */
trait PickCSSPropertiesboxSizin extends js.Object {
  var boxSizing: js.UndefOr[BoxSizingProperty] = js.undefined
  var width: js.UndefOr[WidthProperty[String | Double]] = js.undefined
}

object PickCSSPropertiesboxSizin {
  @scala.inline
  def apply(boxSizing: BoxSizingProperty = null, width: WidthProperty[String | Double] = null): PickCSSPropertiesboxSizin = {
    val __obj = js.Dynamic.literal()
    if (boxSizing != null) __obj.updateDynamic("boxSizing")(boxSizing.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCSSPropertiesboxSizin]
  }
}

