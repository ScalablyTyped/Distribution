package typings
package atStorybookThemingLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Brand extends js.Object {
  var image: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object Brand {
  @scala.inline
  def apply(image: java.lang.String = null, title: java.lang.String = null, url: java.lang.String = null): Brand = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Brand]
  }
}

