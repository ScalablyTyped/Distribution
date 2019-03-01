package typings
package shpjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var buffer: stdLib.ArrayBuffer
}

object Anon_Buffer {
  @scala.inline
  def apply(buffer: stdLib.ArrayBuffer): Anon_Buffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buffer")(buffer)
    __obj.asInstanceOf[Anon_Buffer]
  }
}

