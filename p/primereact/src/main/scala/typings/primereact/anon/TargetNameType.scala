package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetNameType extends js.Object {
  var originalEvent: typings.std.Event
  var target: NameType
  var value: Boolean
}

object TargetNameType {
  @scala.inline
  def apply(originalEvent: typings.std.Event, target: NameType, value: Boolean): TargetNameType = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetNameType]
  }
}

