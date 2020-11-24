package typings.sqlanywhere.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SybaseConnection extends js.Object {
  
  def close(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  def commit(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  def connect(params: ConnectionParameters, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  def connected(): Boolean = js.native
  
  def disconnect(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  def exec(query: String, cb: js.Function2[/* err */ js.UndefOr[Error], /* result */ js.Any, Unit]): Unit = js.native
  def exec(
    query: String,
    placeholders: js.Array[_],
    cb: js.Function2[/* err */ js.UndefOr[Error], /* result */ js.Any, Unit]
  ): Unit = js.native
  
  def prepare(query: String): Statement = js.native
  def prepare(query: String, cb: js.Function2[/* err */ js.UndefOr[Error], /* stmt */ Statement, Unit]): Unit = js.native
  
  def rollback(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
}
