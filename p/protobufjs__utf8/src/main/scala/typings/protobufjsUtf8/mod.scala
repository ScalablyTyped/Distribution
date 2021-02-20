package typings.protobufjsUtf8

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@protobufjs/utf8", "length")
  @js.native
  def length(string: String): Double = js.native
  
  @JSImport("@protobufjs/utf8", "read")
  @js.native
  def read(buffer: Uint8Array, start: Double, end: Double): String = js.native
  
  @JSImport("@protobufjs/utf8", "write")
  @js.native
  def write(string: String, buffer: Uint8Array, offset: Double): Double = js.native
}
