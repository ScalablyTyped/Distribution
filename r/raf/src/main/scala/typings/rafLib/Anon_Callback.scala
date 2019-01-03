package typings
package rafLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  var cancel: js.Function1[/* handle */ scala.Double, scala.Unit] = js.native
  var polyfill: js.Function1[/* globalObject */ js.UndefOr[js.Any], scala.Unit] = js.native
  def apply(callback: js.Function1[/* timestamp */ scala.Double, scala.Unit]): scala.Double = js.native
}

