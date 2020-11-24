package typings.sqlJs.moduleMod.SqlJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sql.js/module", "SqlJs.Statement")
@js.native
class Statement () extends js.Object {
  
  def bind(): Boolean = js.native
  def bind(values: js.Array[ValueType]): Boolean = js.native
  def bind(values: ParamsObject): Boolean = js.native
  
  def free(): Boolean = js.native
  
  def freemem(): Unit = js.native
  
  def get(): js.Array[ValueType] = js.native
  def get(params: js.Array[ValueType]): js.Array[ValueType] = js.native
  def get(params: ParamsObject): js.Array[ValueType] = js.native
  
  def getAsObject(): ParamsObject = js.native
  def getAsObject(params: js.Array[ValueType]): ParamsObject = js.native
  def getAsObject(params: ParamsObject): ParamsObject = js.native
  
  def getColumnNames(): js.Array[String] = js.native
  
  def reset(): Unit = js.native
  
  def run(): Unit = js.native
  def run(values: js.Array[ValueType]): Unit = js.native
  def run(values: ParamsObject): Unit = js.native
  
  def step(): Boolean = js.native
}
