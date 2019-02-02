package typings
package sqlanywhereLib.sqlanywhereMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SybaseConnection extends js.Object {
  def close(cb: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def commit(cb: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def connect(params: ConnectionParameters, cb: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def connected(): scala.Boolean = js.native
  def disconnect(cb: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def exec(
    query: java.lang.String,
    cb: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def exec(
    query: java.lang.String,
    placeholders: js.Array[_],
    cb: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def prepare(query: java.lang.String): Statement = js.native
  def prepare(
    query: java.lang.String,
    cb: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* stmt */ Statement, scala.Unit]
  ): scala.Unit = js.native
  def rollback(cb: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
}

