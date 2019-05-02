package typings
package simplecrawlerLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Signer
  extends simplecrawlerLib.NodeJSNs.WritableStream {
  def sign(private_key: java.lang.String): simplecrawlerLib.Buffer = js.native
  def sign(private_key: java.lang.String, output_format: HexBase64Latin1Encoding): java.lang.String = js.native
  def sign(private_key: simplecrawlerLib.Anon_Key): simplecrawlerLib.Buffer = js.native
  def sign(private_key: simplecrawlerLib.Anon_Key, output_format: HexBase64Latin1Encoding): java.lang.String = js.native
  def update(data: java.lang.String): Signer = js.native
  def update(data: java.lang.String, input_encoding: Utf8AsciiLatin1Encoding): Signer = js.native
  def update(data: simplecrawlerLib.Buffer): Signer = js.native
  def update(data: simplecrawlerLib.Buffer, input_encoding: Utf8AsciiLatin1Encoding): Signer = js.native
}

