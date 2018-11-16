package typings
package recursiveDashReaddirLib.recursiveDashReaddirMod.RecursiveReaddirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait readDir extends js.Object {
  def apply(path: java.lang.String): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def apply(path: java.lang.String, callback: Callback): scala.Unit = js.native
  def apply(path: java.lang.String, ignores: Ignores): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def apply(path: java.lang.String, ignores: Ignores, callback: Callback): scala.Unit = js.native
}

