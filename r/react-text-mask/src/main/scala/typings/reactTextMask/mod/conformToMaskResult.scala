package typings.reactTextMask.mod

import typings.reactTextMask.anon.SomeCharsRejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait conformToMaskResult extends js.Object {
  var conformedValue: String
  var meta: SomeCharsRejected
}

object conformToMaskResult {
  @scala.inline
  def apply(conformedValue: String, meta: SomeCharsRejected): conformToMaskResult = {
    val __obj = js.Dynamic.literal(conformedValue = conformedValue.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[conformToMaskResult]
  }
}

