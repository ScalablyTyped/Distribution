package typings
package servicenowLib.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideQueryCondition extends js.Object {
  def addCondition(name: java.lang.String, oper: QueryOperator, value: java.lang.String): GlideQueryCondition = js.native
  def addCondition(name: java.lang.String, oper: QueryOperator, value: js.Object): GlideQueryCondition = js.native
  def addCondition(name: java.lang.String, oper: QueryOperator, value: scala.Double): GlideQueryCondition = js.native
  def addCondition(name: java.lang.String, value: java.lang.String): GlideQueryCondition = js.native
  def addCondition(name: java.lang.String, value: js.Object): GlideQueryCondition = js.native
  def addCondition(name: java.lang.String, value: scala.Double): GlideQueryCondition = js.native
  def addOrCondition(name: java.lang.String, oper: QueryOperator, value: java.lang.String): GlideQueryCondition = js.native
  def addOrCondition(name: java.lang.String, oper: QueryOperator, value: js.Object): GlideQueryCondition = js.native
  def addOrCondition(name: java.lang.String, oper: QueryOperator, value: scala.Double): GlideQueryCondition = js.native
  def addOrCondition(name: java.lang.String, value: java.lang.String): GlideQueryCondition = js.native
  def addOrCondition(name: java.lang.String, value: js.Object): GlideQueryCondition = js.native
  def addOrCondition(name: java.lang.String, value: scala.Double): GlideQueryCondition = js.native
}

