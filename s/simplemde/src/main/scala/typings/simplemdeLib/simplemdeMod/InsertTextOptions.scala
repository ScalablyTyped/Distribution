package typings
package simplemdeLib.simplemdeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertTextOptions extends js.Object {
  var horizontalRule: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var image: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var link: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var table: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object InsertTextOptions {
  @scala.inline
  def apply(
    horizontalRule: js.Array[java.lang.String] = null,
    image: js.Array[java.lang.String] = null,
    link: js.Array[java.lang.String] = null,
    table: js.Array[java.lang.String] = null
  ): InsertTextOptions = {
    val __obj = js.Dynamic.literal()
    if (horizontalRule != null) __obj.updateDynamic("horizontalRule")(horizontalRule)
    if (image != null) __obj.updateDynamic("image")(image)
    if (link != null) __obj.updateDynamic("link")(link)
    if (table != null) __obj.updateDynamic("table")(table)
    __obj.asInstanceOf[InsertTextOptions]
  }
}

