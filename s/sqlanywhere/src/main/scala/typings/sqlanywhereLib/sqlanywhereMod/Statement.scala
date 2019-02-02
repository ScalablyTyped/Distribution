package typings
package sqlanywhereLib.sqlanywhereMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statement extends js.Object {
  def drop(cb: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def exec(args: js.Array[_]): js.Array[_] = js.native
  def exec(
    args: js.Array[_],
    cb: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* rows */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def getMoreResults(): js.Array[_] = js.native
}

