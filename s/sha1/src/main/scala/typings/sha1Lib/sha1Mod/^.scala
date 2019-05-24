package typings
package sha1Lib.sha1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sha1", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(message: java.lang.String | nodeLib.Buffer): java.lang.String | stdLib.Uint8Array = js.native
  def apply(message: java.lang.String | nodeLib.Buffer, options: Sha1AsBytesOptions): stdLib.Uint8Array = js.native
  def apply(message: java.lang.String | nodeLib.Buffer, options: Sha1AsStringOptions): java.lang.String = js.native
  def apply(message: java.lang.String | nodeLib.Buffer, options: Sha1Options): java.lang.String | stdLib.Uint8Array = js.native
}

