package typings.shpjs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var buffer: ArrayBuffer
}

object Anon_Buffer {
  @scala.inline
  def apply(buffer: ArrayBuffer): Anon_Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer)
  
    __obj.asInstanceOf[Anon_Buffer]
  }
}

