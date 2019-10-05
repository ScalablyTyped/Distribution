package typings.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GlideEvaluator")
@js.native
class GlideEvaluator () extends js.Object {
  def evaluateScript(grObj: typings.servicenow.servicenow.GlideRecord): js.Object = js.native
  def evaluateScript(grObj: typings.servicenow.servicenow.GlideRecord, scriptField: String): js.Object = js.native
  def evaluateScript(grObj: typings.servicenow.servicenow.GlideRecord, scriptField: String, variables: js.Object): js.Object = js.native
  def getVariable(name: String): js.Object = js.native
  def putVariable(name: String, value: js.Object): Unit = js.native
}

