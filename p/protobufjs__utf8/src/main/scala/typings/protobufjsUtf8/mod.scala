package typings.protobufjsUtf8

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@protobufjs/utf8", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def length(string: String): Double = js.native
  
  def read(buffer: Uint8Array, start: Double, end: Double): String = js.native
  
  def write(string: String, buffer: Uint8Array, offset: Double): Double = js.native
}
