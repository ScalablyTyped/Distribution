package typings
package simplecrawlerLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Verify
  extends simplecrawlerLib.NodeJSNs.WritableStream {
  def update(data: java.lang.String): Verify = js.native
  def update(data: java.lang.String, input_encoding: Utf8AsciiLatin1Encoding): Verify = js.native
  def update(data: simplecrawlerLib.Buffer): Verify = js.native
  def update(data: simplecrawlerLib.Buffer, input_encoding: Utf8AsciiLatin1Encoding): Verify = js.native
  def verify(`object`: java.lang.String, signature: java.lang.String, signature_format: HexBase64Latin1Encoding): scala.Boolean = js.native
  def verify(`object`: java.lang.String, signature: simplecrawlerLib.Buffer): scala.Boolean = js.native
}

