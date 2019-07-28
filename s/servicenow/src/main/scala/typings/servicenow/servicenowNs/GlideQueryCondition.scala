package typings.servicenow.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideQueryCondition extends js.Object {
  def addCondition(name: String, oper: QueryOperator, value: String): GlideQueryCondition = js.native
  def addCondition(name: String, oper: QueryOperator, value: js.Object): GlideQueryCondition = js.native
  def addCondition(name: String, oper: QueryOperator, value: Double): GlideQueryCondition = js.native
  def addCondition(name: String, value: String): GlideQueryCondition = js.native
  def addCondition(name: String, value: js.Object): GlideQueryCondition = js.native
  def addCondition(name: String, value: Double): GlideQueryCondition = js.native
  def addOrCondition(name: String, oper: QueryOperator, value: String): GlideQueryCondition = js.native
  def addOrCondition(name: String, oper: QueryOperator, value: js.Object): GlideQueryCondition = js.native
  def addOrCondition(name: String, oper: QueryOperator, value: Double): GlideQueryCondition = js.native
  def addOrCondition(name: String, value: String): GlideQueryCondition = js.native
  def addOrCondition(name: String, value: js.Object): GlideQueryCondition = js.native
  def addOrCondition(name: String, value: Double): GlideQueryCondition = js.native
}

