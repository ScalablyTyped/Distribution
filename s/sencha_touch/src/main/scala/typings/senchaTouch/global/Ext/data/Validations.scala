package typings.senchaTouch.global.Ext.data

import typings.senchaTouch.Ext.IClass
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.data.Validations")
@js.native
class Validations ()
  extends typings.senchaTouch.Ext.data.Validations

/* static members */
@JSGlobal("Ext.data.Validations")
@js.native
object Validations extends js.Object {
  /** [Property] (String) */
  var emailMessage: String = js.native
  /** [Property] (RegExp) */
  var emailRe: RegExp = js.native
  /** [Property] (String) */
  var exclusionMessage: String = js.native
  /** [Property] (String) */
  var formatMessage: String = js.native
  /** [Property] (String) */
  var inclusionMessage: String = js.native
  /** [Property] (String) */
  var lengthMessage: String = js.native
  /** [Property] (String) */
  var presenceMessage: String = js.native
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  def callOverridden(): js.Any = js.native
  def callOverridden(args: js.Any): js.Any = js.native
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  def callParent(): js.Any = js.native
  def callParent(args: js.Any): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  def callSuper(): js.Any = js.native
  def callSuper(args: js.Any): js.Any = js.native
  /** [Method]  */
  def destroy(): Unit = js.native
  /** [Method] Validates that an email string is in the correct format
    * @param config Object Config object.
    * @param email String The email address.
    * @returns Boolean true if the value passes validation.
    */
  def email(): Boolean = js.native
  def email(config: js.UndefOr[scala.Nothing], email: String): Boolean = js.native
  def email(config: js.Any): Boolean = js.native
  def email(config: js.Any, email: String): Boolean = js.native
  /** [Method] Validates that the given value is present in the configured list
    * @param config Object Config object.
    * @param value String The value to validate.
    * @returns Boolean true if the value is not present in the list.
    */
  def exclusion(): Boolean = js.native
  def exclusion(config: js.UndefOr[scala.Nothing], value: String): Boolean = js.native
  def exclusion(config: js.Any): Boolean = js.native
  def exclusion(config: js.Any, value: String): Boolean = js.native
  /** [Method] Returns true if the given value passes validation against the configured matcher regex
    * @param config Object Config object.
    * @param value String The value to validate.
    * @returns Boolean true if the value passes the format validation.
    */
  def format(): Boolean = js.native
  def format(config: js.UndefOr[scala.Nothing], value: String): Boolean = js.native
  def format(config: js.Any): Boolean = js.native
  def format(config: js.Any, value: String): Boolean = js.native
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: String): js.Any = js.native
  /** [Method] Returns the configured error message for any of the validation types
    * @param type String The type of validation you want to get the error message for.
    * @returns Object
    */
  def getMessage(): js.Any = js.native
  def getMessage(`type`: String): js.Any = js.native
  /** [Method] Validates that the given value is present in the configured list
    * @param config Object Config object.
    * @param value String The value to validate.
    * @returns Boolean true if the value is present in the list.
    */
  def inclusion(): Boolean = js.native
  def inclusion(config: js.UndefOr[scala.Nothing], value: String): Boolean = js.native
  def inclusion(config: js.Any): Boolean = js.native
  def inclusion(config: js.Any, value: String): Boolean = js.native
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  /** [Method] Returns true if the given value is between the configured min and max values
    * @param config Object Config object.
    * @param value String The value to validate.
    * @returns Boolean true if the value passes validation.
    */
  def length(): Boolean = js.native
  def length(config: js.UndefOr[scala.Nothing], value: String): Boolean = js.native
  def length(config: js.Any): Boolean = js.native
  def length(config: js.Any, value: String): Boolean = js.native
  /** [Method] Validates that the given value is present
    * @param config Object Config object.
    * @param value Object The value to validate.
    * @returns Boolean true if validation passed.
    */
  def presence(): Boolean = js.native
  def presence(config: js.UndefOr[scala.Nothing], value: js.Any): Boolean = js.native
  def presence(config: js.Any): Boolean = js.native
  def presence(config: js.Any, value: js.Any): Boolean = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  def statics(): IClass = js.native
}

