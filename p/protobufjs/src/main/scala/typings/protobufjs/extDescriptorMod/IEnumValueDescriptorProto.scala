package typings.protobufjs.extDescriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnumValueDescriptorProto extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
}

object IEnumValueDescriptorProto {
  @scala.inline
  def apply(name: String = null, number: Int | Double = null, options: js.Any = null): IEnumValueDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnumValueDescriptorProto]
  }
}

