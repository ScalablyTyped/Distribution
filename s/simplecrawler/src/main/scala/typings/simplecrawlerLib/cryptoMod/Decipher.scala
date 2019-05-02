package typings
package simplecrawlerLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decipher
  extends simplecrawlerLib.NodeJSNs.ReadWriteStream {
  def `final`(): simplecrawlerLib.Buffer = js.native
  def `final`(output_encoding: java.lang.String): java.lang.String = js.native
  def setAAD(buffer: simplecrawlerLib.Buffer): scala.Unit = js.native
  def setAuthTag(tag: simplecrawlerLib.Buffer): scala.Unit = js.native
  def setAutoPadding(): scala.Unit = js.native
  def setAutoPadding(auto_padding: scala.Boolean): scala.Unit = js.native
  def update(data: java.lang.String, input_encoding: HexBase64BinaryEncoding): simplecrawlerLib.Buffer = js.native
  def update(
    data: java.lang.String,
    input_encoding: HexBase64BinaryEncoding,
    output_encoding: Utf8AsciiBinaryEncoding
  ): java.lang.String = js.native
  def update(data: simplecrawlerLib.Buffer): simplecrawlerLib.Buffer = js.native
  def update(data: simplecrawlerLib.Buffer, input_encoding: js.Any, output_encoding: Utf8AsciiBinaryEncoding): java.lang.String = js.native
}

