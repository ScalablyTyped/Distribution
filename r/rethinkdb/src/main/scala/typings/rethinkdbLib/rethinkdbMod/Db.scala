package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Db extends js.Object {
  def table(name: java.lang.String): Table = js.native
  def table(name: java.lang.String, options: GetTableOptions): Table = js.native
  def tableCreate(name: java.lang.String): Operation[CreateResult] = js.native
  def tableCreate(name: java.lang.String, options: TableOptions): Operation[CreateResult] = js.native
  def tableDrop(name: java.lang.String): Operation[DropResult] = js.native
  def tableList(): Operation[js.Array[java.lang.String]] = js.native
  def wait(waitOptions: WaitOptions): Operation[WaitResult] = js.native
}

