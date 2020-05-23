package typings.sharp.anon

import typings.sharp.mod.OutputInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: typings.node.Buffer
  var info: OutputInfo
}

object Data {
  @scala.inline
  def apply(data: typings.node.Buffer, info: OutputInfo): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

