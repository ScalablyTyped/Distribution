package typings
package sharpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: nodeLib.Buffer
  var info: sharpLib.sharpMod.OutputInfo
}

object Anon_Data {
  @scala.inline
  def apply(data: nodeLib.Buffer, info: sharpLib.sharpMod.OutputInfo): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, info = info)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

