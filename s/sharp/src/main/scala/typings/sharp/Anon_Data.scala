package typings.sharp

import typings.node.Buffer
import typings.sharp.sharpMod.OutputInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: Buffer
  var info: OutputInfo
}

object Anon_Data {
  @scala.inline
  def apply(data: Buffer, info: OutputInfo): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, info = info)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

