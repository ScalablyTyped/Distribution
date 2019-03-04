package typings
package recorderDashJsLib.recorderDashJsMod.RecorderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderResult extends js.Object {
  var blob: stdLib.Blob
  var buffer: js.Array[stdLib.Float32Array]
}

object RecorderResult {
  @scala.inline
  def apply(blob: stdLib.Blob, buffer: js.Array[stdLib.Float32Array]): RecorderResult = {
    val __obj = js.Dynamic.literal(blob = blob, buffer = buffer)
  
    __obj.asInstanceOf[RecorderResult]
  }
}

