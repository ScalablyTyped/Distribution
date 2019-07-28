package typings.skyway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  var data: js.Any
  var src: String
}

object DataObject {
  @scala.inline
  def apply(data: js.Any, src: String): DataObject = {
    val __obj = js.Dynamic.literal(data = data, src = src)
  
    __obj.asInstanceOf[DataObject]
  }
}

