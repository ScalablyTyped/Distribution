package typings.reactTextMask.mod

import typings.reactTextMask.AnonSomeCharsRejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait conformToMaskResult extends js.Object {
  var conformedValue: String
  var meta: AnonSomeCharsRejected
}

object conformToMaskResult {
  @scala.inline
  def apply(conformedValue: String, meta: AnonSomeCharsRejected): conformToMaskResult = {
    val __obj = js.Dynamic.literal(conformedValue = conformedValue.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[conformToMaskResult]
  }
}

