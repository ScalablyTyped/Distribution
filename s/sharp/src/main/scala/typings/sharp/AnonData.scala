package typings.sharp

import typings.node.Buffer
import typings.sharp.mod.OutputInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: Buffer
  var info: OutputInfo
}

object AnonData {
  @scala.inline
  def apply(data: Buffer, info: OutputInfo): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

