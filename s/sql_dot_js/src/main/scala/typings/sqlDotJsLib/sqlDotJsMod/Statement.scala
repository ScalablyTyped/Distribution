package typings
package sqlDotJsLib.sqlDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sql.js", "Statement")
@js.native
class Statement () extends js.Object {
  def bind(): scala.Boolean = js.native
  def bind(values: js.Array[ValueType]): scala.Boolean = js.native
  def bind(values: ParamsObject): scala.Boolean = js.native
  def free(): scala.Boolean = js.native
  def freemem(): scala.Unit = js.native
  def get(): js.Array[ValueType] = js.native
  def get(params: js.Array[ValueType]): js.Array[ValueType] = js.native
  def get(params: ParamsObject): js.Array[ValueType] = js.native
  def getAsObject(): ParamsObject = js.native
  def getAsObject(params: js.Array[ValueType]): ParamsObject = js.native
  def getAsObject(params: ParamsObject): ParamsObject = js.native
  def getColumnNames(): js.Array[java.lang.String] = js.native
  def reset(): scala.Unit = js.native
  def run(): scala.Unit = js.native
  def run(values: js.Array[ValueType]): scala.Unit = js.native
  def run(values: ParamsObject): scala.Unit = js.native
  def step(): scala.Boolean = js.native
}

