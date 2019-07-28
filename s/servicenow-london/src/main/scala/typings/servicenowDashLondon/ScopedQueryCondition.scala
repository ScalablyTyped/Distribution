package typings.servicenowDashLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopedQueryCondition extends js.Object {
  def addCondition(name: String, oper: QueryOperator, value: String): ScopedQueryCondition = js.native
  /**
    * Adds an AND condition to the current condition.
    *
    * @param name The name of a field.
    * @param oper The operator for the query.
    * If you do not specify an operator, the condition uses an equals operator.
    * @param value The value to query on.
    * @returns A reference to a GlideQueryConditon that was added to the GlideRecord.
    */
  def addCondition(name: String, oper: QueryOperator, value: js.Object): ScopedQueryCondition = js.native
  def addCondition(name: String, oper: QueryOperator, value: Double): ScopedQueryCondition = js.native
  def addCondition(name: String, value: String): ScopedQueryCondition = js.native
  /**
    * Adds an AND condition to the current condition.
    *
    * @param name The name of a field.
    * @param value The value to query on.
    * @returns A reference to a GlideQueryConditon that was added to the GlideRecord.
    * @example
    * var gr = new GlideRecord('incident');
    * var qc = gr.addQuery('category', 'Hardware');
    * qc.addCondition('category', 'Network');
    * gr.addQuery('number','INC0000003');
    * gr.next();
    * gr.number;
    * gs.info(gr.getEncodedQuery());
    */
  def addCondition(name: String, value: js.Object): ScopedQueryCondition = js.native
  def addCondition(name: String, value: Double): ScopedQueryCondition = js.native
  /**
    * Appends a 2-or-3 parameter OR condition to an existing GlideQueryCondition.
    *
    * @param name Field name
    * @param oper Query operator.
    * The available values are dependent on the data type of the value parameter.
    *
    * Numbers:
    * - =
    * - !=
    * - &gt;
    * - &gt;=
    * - &lt;
    * - &lt;=
    *
    * Strings (must be in upper case):
    * - =
    * - !=
    * - IN
    * - NOT IN
    * - STARTSWITH
    * - ENDSWITH
    * - CONTAINS
    * - DOES NOT CONTAIN
    * - INSTANCEOF
    * @param value The value to query on.
    * @returns A reference to a GlideQueryConditon that was added to the GlideRecord.
    */
  def addOrCondition(name: String, oper: QueryOperator, value: js.Any): ScopedQueryCondition = js.native
  def addOrCondition(name: String, value: String): ScopedQueryCondition = js.native
  /**
    * Appends a 2-or-3 parameter OR condition to an existing GlideQueryCondition.
    *
    * @param name Field name
    * @param value The value to query on.
    * @returns A reference to a GlideQueryConditon that was added to the GlideRecord.
    */
  def addOrCondition(name: String, value: js.Object): ScopedQueryCondition = js.native
  def addOrCondition(name: String, value: Double): ScopedQueryCondition = js.native
}

