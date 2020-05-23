package typings.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QName extends js.Object {
  var qName: String
}

object QName {
  @scala.inline
  def apply(qName: String): QName = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[QName]
  }
}

