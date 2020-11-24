package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Db_ extends js.Object {
  
  def table(name: String): Table_ = js.native
  def table(name: String, options: GetTableOptions): Table_ = js.native
  
  def tableCreate(name: String): Operation[CreateResult] = js.native
  def tableCreate(name: String, options: TableOptions): Operation[CreateResult] = js.native
  
  def tableDrop(name: String): Operation[DropResult] = js.native
  
  def tableList(): Operation[js.Array[String]] = js.native
  
  def wait(waitOptions: WaitOptions): Operation[WaitResult] = js.native
}
