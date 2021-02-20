package typings.protobufjsBase64

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@protobufjs/base64", "decode")
  @js.native
  def decode(string: String, buffer: Uint8Array, offset: Double): Double = js.native
  
  @JSImport("@protobufjs/base64", "encode")
  @js.native
  def encode(buffer: Uint8Array, start: Double, end: Double): String = js.native
  
  @JSImport("@protobufjs/base64", "length")
  @js.native
  def length(string: String): Double = js.native
  
  @JSImport("@protobufjs/base64", "test")
  @js.native
  def test(string: String): Boolean = js.native
}
