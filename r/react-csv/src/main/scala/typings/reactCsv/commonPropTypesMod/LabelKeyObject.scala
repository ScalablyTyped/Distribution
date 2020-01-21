package typings.reactCsv.commonPropTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelKeyObject extends js.Object {
  var key: String
  var label: String
}

object LabelKeyObject {
  @scala.inline
  def apply(key: String, label: String): LabelKeyObject = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LabelKeyObject]
  }
}

