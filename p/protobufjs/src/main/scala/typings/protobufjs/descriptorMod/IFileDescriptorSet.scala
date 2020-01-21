package typings.protobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileDescriptorSet extends js.Object {
  var file: js.Array[IFileDescriptorProto]
}

object IFileDescriptorSet {
  @scala.inline
  def apply(file: js.Array[IFileDescriptorProto]): IFileDescriptorSet = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFileDescriptorSet]
  }
}

