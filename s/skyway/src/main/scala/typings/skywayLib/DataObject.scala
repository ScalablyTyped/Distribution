package typings
package skywayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  var data: js.Any
  var src: java.lang.String
}

object DataObject {
  @scala.inline
  def apply(data: js.Any, src: java.lang.String): DataObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[DataObject]
  }
}

