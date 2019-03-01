package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Asset extends js.Object {
  var fileName: java.lang.String
  var name: java.lang.String
  var source: java.lang.String | nodeLib.Buffer
}

object Asset {
  @scala.inline
  def apply(fileName: java.lang.String, name: java.lang.String, source: java.lang.String | nodeLib.Buffer): Asset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asset]
  }
}

