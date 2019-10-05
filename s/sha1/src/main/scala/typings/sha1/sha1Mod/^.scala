package typings.sha1.sha1Mod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sha1", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(message: String): String | Uint8Array = js.native
  def apply(message: String, options: Sha1AsBytesOptions): Uint8Array = js.native
  def apply(message: String, options: Sha1AsStringOptions): String = js.native
  def apply(message: String, options: Sha1Options): String | Uint8Array = js.native
  def apply(message: Buffer): String | Uint8Array = js.native
  def apply(message: Buffer, options: Sha1AsBytesOptions): Uint8Array = js.native
  def apply(message: Buffer, options: Sha1AsStringOptions): String = js.native
  def apply(message: Buffer, options: Sha1Options): String | Uint8Array = js.native
}

