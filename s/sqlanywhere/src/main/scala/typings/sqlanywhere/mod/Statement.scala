package typings.sqlanywhere.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statement extends js.Object {
  def drop(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def exec(args: js.Array[_]): js.Array[_] = js.native
  def exec(args: js.Array[_], cb: js.Function2[/* err */ js.UndefOr[Error], /* rows */ js.Array[_], Unit]): Unit = js.native
  def getMoreResults(): js.Array[_] = js.native
}

