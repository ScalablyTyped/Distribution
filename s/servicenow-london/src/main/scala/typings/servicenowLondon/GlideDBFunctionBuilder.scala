package typings.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideDBFunctionBuilder extends js.Object {
  /**
    * Adds the values of two or more integer fields.
    *
    * @example
    *
    * var functionBuilder = new GlideDBFunctionBuilder();
    * var myAddingFunction = functionBuilder.add();
    * myAddingFunction = functionBuilder.field('order');
    * myAddingFunction = functionBuilder.field('priority');
    * myAddingFunction = functionBuilder.build();
    */
  def add(): GlideDBFunctionBuilder = js.native
  /**
    * Builds the database function defined by the GlideDBFunctionBuilder object.
    *
    * @example
    *
    * var functionBuilder = new GlideDBFunctionBuilder();
    * var myAddingFunction = functionBuilder.add();
    * myAddingFunction = functionBuilder.field('order');
    * myAddingFunction = functionBuilder.field('priority');
    * myAddingFunction = functionBuilder.build();
    * gs.print(myAddingFunction);
    */
  def build(): String = js.native
  /**
    * Concatenates the values of two or more fields.
    * Use the `field(String field)` method to define fields on which the operation is performed.
    *
    * @example
    *
    * var functionBuilder = new GlideDBFunctionBuilder();
    * var myConcatFunction = functionBuilder.concat();
    * myConcatFunction = functionBuilder.field('short_description');
    * myConcatFunction = functionBuilder.field('caller_id.name');
    * myConcatFunction = functionBuilder.build();
    */
  def concat(): GlideDBFunctionBuilder = js.native
  /**
    * Defines a constant value to use in the function. If used with the `dayofweek()` method, the
    * string defines whether to use Sunday or Monday as the first day of the week.
    *
    * @param constant A constant value used in a function.
    *
    * When used with the `dayofweek()` method, the value defines whether the week starts on a Sunday or
    * Monday.
    *
    * - 1: Week begins on Sunday.
    * - 2: Week begins on Monday.
    *
    * This definition enables the `dayofweek()` method to return the correct day of the week from a
    * given date. If a value other than 1 or 2 is provided, the `dayofweek()` method uses Sunday as
    * the first day of the week.
    */
  def constant(constant: String): GlideDBFunctionBuilder = js.native
  /**
    * Determines the duration using a given start date/time and end date/time.
    * Use the `field(String field)` method to define start and end date/time fields.
    */
  def datediff(): GlideDBFunctionBuilder = js.native
  /**
    * Returns an integer representing the day of the week for a given date.
    *
    * @returns If the first day of the week is set to Sunday in the constant(String
    * constant) method, return values are associated with the following days
    * of the week:
    *
    * - 1: Sunday
    * - 2: Monday
    * - 3: Tuesday
    * - 4: Wednesday
    * - 5: Thursday
    * - 6: Friday
    * - 7: Saturday
    *
    * If the first day of the week is set to Monday:
    *
    * - 1: Monday
    * - 2: Tuesday
    * - 3: Wednesday
    * - 4: Thursday
    * - 5: Friday
    * - 6: Saturday
    * - 7: Sunday
    *
    * If a value other than 1 or 2 is provided in the `constant(String constant)` method, the
    * `dayofweek()` method uses Sunday as the first day of the week.
    * @example
    *
    * var functionBuilder = new GlideDBFunctionBuilder();
    * var dayOfWeekFunction = functionBuilder.dayofweek();
    * dayOfWeekFunction = functionBuilder.field('opened_at');
    * dayOfWeekFunction = functionBuilder.constant('2');
    * dayOfWeekFunction = functionBuilder.build();
    *
    * var gr = new GlideRecord('incident');
    * gr.addFunction(dayOfWeekFunction);
    * gr.query();
    * while(gr.next())
    *   gs.log(gr.getValue(dayOfWeekFunction));
    *
    */
  def dayofweek(): GlideDBFunctionBuilder = js.native
  /**
    * Divides the value of one integer field by another.
    * Use the `field(String field)` method to define fields on which the operation is performed.
    *
    * @example
    *
    * var functionBuilder = new GlideDBFunctionBuilder();
    * var myDivideFunction = functionBuilder.divide();
    * myDivideFunction = functionBuilder.field('order');
    * myDivideFunction = functionBuilder.field('priority');
    * myDivideFunction = functionBuilder.build();
    */
  def divide(): GlideDBFunctionBuilder = js.native
  /**
    * Defines a field on which a SQL operation is performed.
    *
    * @param field The field on which you are performing the SQL operation.
    * @example
    *
    * var functionBuilder = new GlideDBFunctionBuilder();
    * var myAddingFunction = functionBuilder.add();
    * myAddingFunction = functionBuilder.field('order');
    * myAddingFunction = functionBuilder.field('priority');
    * myAddingFunction = functionBuilder.build();
    */
  def field(field: String): GlideDBFunctionBuilder = js.native
  /**
    * Determines the number of code units in a field.
    * Use the `field(String field)` method to define fields on which the operation is performed.
    *
    * @example
    *
    * var functionBuilder = new GlideDBFunctionBuilder();
    * var myLengthFunction = functionBuilder.length();
    * myLengthFunction = functionBuilder.field('short_description');
    * myLengthFunction = functionBuilder.build();
    *
    */
  def length(): GlideDBFunctionBuilder = js.native
  /**
    * Multiplies the values of two integer fields.
    * Use the `field(String field)` method to define fields on which the operation is performed.
    *
    * @example
    *
    * var functionBuilder = new GlideDBFunctionBuilder();
    * var myMultiplyFunction = functionBuilder.multiply();
    * myMultiplyFunction = functionBuilder.field('order');
    * myMultiplyFunction = functionBuilder.field('priority');
    * myMultiplyFunction = functionBuilder.build();
    */
  def multiply(): GlideDBFunctionBuilder = js.native
  /**
    * Subtracts the value of one integer field from another.
    * Use the `field(String field)` method to define fields on which the operation is performed.
    *
    * @example
    *
    * var functionBuilder = new GlideDBFunctionBuilder();
    * var mySubtractFunction = functionBuilder.subtract();
    * mySubtractFunction = functionBuilder.field('order');
    * mySubtractFunction = functionBuilder.field('priority');
    * mySubtractFunction = functionBuilder.build();
    */
  def subtract(): GlideDBFunctionBuilder = js.native
}

object GlideDBFunctionBuilder {
  @scala.inline
  def apply(
    add: () => GlideDBFunctionBuilder,
    build: () => String,
    concat: () => GlideDBFunctionBuilder,
    constant: String => GlideDBFunctionBuilder,
    datediff: () => GlideDBFunctionBuilder,
    dayofweek: () => GlideDBFunctionBuilder,
    divide: () => GlideDBFunctionBuilder,
    field: String => GlideDBFunctionBuilder,
    length: () => GlideDBFunctionBuilder,
    multiply: () => GlideDBFunctionBuilder,
    subtract: () => GlideDBFunctionBuilder
  ): GlideDBFunctionBuilder = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction0(add), build = js.Any.fromFunction0(build), concat = js.Any.fromFunction0(concat), constant = js.Any.fromFunction1(constant), datediff = js.Any.fromFunction0(datediff), dayofweek = js.Any.fromFunction0(dayofweek), divide = js.Any.fromFunction0(divide), field = js.Any.fromFunction1(field), length = js.Any.fromFunction0(length), multiply = js.Any.fromFunction0(multiply), subtract = js.Any.fromFunction0(subtract))
    __obj.asInstanceOf[GlideDBFunctionBuilder]
  }
  @scala.inline
  implicit class GlideDBFunctionBuilderOps[Self <: GlideDBFunctionBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: () => GlideDBFunctionBuilder): Self = this.set("add", js.Any.fromFunction0(value))
    @scala.inline
    def setBuild(value: () => String): Self = this.set("build", js.Any.fromFunction0(value))
    @scala.inline
    def setConcat(value: () => GlideDBFunctionBuilder): Self = this.set("concat", js.Any.fromFunction0(value))
    @scala.inline
    def setConstant(value: String => GlideDBFunctionBuilder): Self = this.set("constant", js.Any.fromFunction1(value))
    @scala.inline
    def setDatediff(value: () => GlideDBFunctionBuilder): Self = this.set("datediff", js.Any.fromFunction0(value))
    @scala.inline
    def setDayofweek(value: () => GlideDBFunctionBuilder): Self = this.set("dayofweek", js.Any.fromFunction0(value))
    @scala.inline
    def setDivide(value: () => GlideDBFunctionBuilder): Self = this.set("divide", js.Any.fromFunction0(value))
    @scala.inline
    def setField(value: String => GlideDBFunctionBuilder): Self = this.set("field", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: () => GlideDBFunctionBuilder): Self = this.set("length", js.Any.fromFunction0(value))
    @scala.inline
    def setMultiply(value: () => GlideDBFunctionBuilder): Self = this.set("multiply", js.Any.fromFunction0(value))
    @scala.inline
    def setSubtract(value: () => GlideDBFunctionBuilder): Self = this.set("subtract", js.Any.fromFunction0(value))
  }
  
}

