package typings
package sha1Lib.sha1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sha1", JSImport.Namespace)
@js.native
object sha1ModMembers extends js.Object {
  /**
    * js function for hashing messages with SHA1
    *
    * @param message - a string or buffer to hash
    * @param options - an options object
    * @returns the resultant SHA1 hash of the given message
    */
  def apply(message: java.lang.String | nodeLib.Buffer): java.lang.String | stdLib.Uint8Array = js.native
  def apply(message: java.lang.String | nodeLib.Buffer, options: Sha1Options): java.lang.String | stdLib.Uint8Array = js.native
}

