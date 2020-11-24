package typings.sha1.mod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sha1", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * js function for hashing messages with SHA1
    *
    * @param message - a string or buffer to hash
    * @param options - an options object
    * @returns the resultant SHA1 hash of the given message
    */
  def apply(message: String): String = js.native
  def apply(message: String, options: Sha1AsBytesOptions): Uint8Array = js.native
  def apply(message: String, options: Sha1AsStringOptions): String = js.native
  def apply(message: String, options: Sha1Options): String | Uint8Array = js.native
  def apply(message: Buffer): String = js.native
  def apply(message: Buffer, options: Sha1AsBytesOptions): Uint8Array = js.native
  def apply(message: Buffer, options: Sha1AsStringOptions): String = js.native
  def apply(message: Buffer, options: Sha1Options): String | Uint8Array = js.native
}
