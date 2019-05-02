package typings
package simplecrawlerLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hash
  extends simplecrawlerLib.NodeJSNs.ReadWriteStream {
  def digest(): simplecrawlerLib.Buffer = js.native
  def digest(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def update(data: java.lang.String): Hash = js.native
  def update(data: java.lang.String, input_encoding: Utf8AsciiLatin1Encoding): Hash = js.native
  def update(data: simplecrawlerLib.Buffer): Hash = js.native
  def update(data: simplecrawlerLib.Buffer, input_encoding: Utf8AsciiLatin1Encoding): Hash = js.native
}

