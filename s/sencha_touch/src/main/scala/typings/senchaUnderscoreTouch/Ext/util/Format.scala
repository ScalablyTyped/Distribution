package typings.senchaUnderscoreTouch.Ext.util

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.util.Format")
@js.native
class Format () extends js.Object

/* static members */
@JSGlobal("Ext.util.Format")
@js.native
object Format extends js.Object {
  /** [Property] (String) */
  var defaultDateFormat: String = js.native
  /** [Property] (Array) */
  var potentialUndefinedKeys: Array = js.native
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
  /** [Method] Parse a value into a formatted date using the specified format pattern
  		* @param value String/Date The value to format. Strings must conform to the format expected by the JavaScript Date object's parse() method.
  		* @param format String Any valid date format string.
  		* @returns String The formatted date string.
  		*/
  def date(): String = js.native
  def date(value: js.Any): String = js.native
  def date(value: js.Any, format: String): String = js.native
  /** [Method]  */
  def destroy(): Unit = js.native
  /** [Method] Truncate a string and add an ellipsis  to the end if it exceeds the specified length
  		* @param value String The string to truncate.
  		* @param length Number The maximum length to allow before truncating.
  		* @param word Boolean True to try to find a common word break.
  		* @returns String The converted text.
  		*/
  def ellipsis(): String = js.native
  def ellipsis(value: String): String = js.native
  def ellipsis(value: String, length: Double): String = js.native
  def ellipsis(value: String, length: Double, word: Boolean): String = js.native
  /** [Method] Escapes the passed string for  and
  		* @param string String The string to escape.
  		* @returns String The escaped string.
  		*/
  def escape(): String = js.native
  def escape(string: String): String = js.native
  /** [Method] Escapes the passed string for use in a regular expression
  		* @param str String
  		* @returns String
  		*/
  def escapeRegex(): String = js.native
  def escapeRegex(str: String): String = js.native
  /** [Method] Allows you to define a tokenized string and pass an arbitrary number of arguments to replace the tokens
  		* @param string String The tokenized string to be formatted.
  		* @param values String... The values to replace token {0}, {1}, etc.
  		* @returns String The formatted string.
  		*/
  def format(string: String, values: js.Any*): String = js.native
  /** [Method] Returns the initial configuration passed to constructor
  		* @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
  		* @returns Object/Mixed
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: String): js.Any = js.native
  /** [Method] Convert certain characters  amp lt and from their HTML character equivalents
  		* @param value String The string to decode.
  		* @returns String The decoded text.
  		*/
  def htmlDecode(): String = js.native
  def htmlDecode(value: String): String = js.native
  /** [Method] Convert certain characters  amp lt and to their HTML character equivalents for literal display in web pages
  		* @param value String The string to encode.
  		* @returns String The encoded text.
  		*/
  def htmlEncode(): String = js.native
  def htmlEncode(value: String): String = js.native
  /** [Method] Initialize configuration for this class
  		* @param instanceConfig Object
  		* @returns Object mixins The mixin prototypes as key - value pairs
  		*/
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  /** [Method] Pads the left side of a string with a specified character
  		* @param string String The original string.
  		* @param size Number The total length of the output string.
  		* @param char String The character with which to pad the original string.
  		* @returns String The padded string.
  		*/
  def leftPad(): String = js.native
  def leftPad(string: String): String = js.native
  def leftPad(string: String, size: Double): String = js.native
  def leftPad(string: String, size: Double, char: String): String = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): IClass = js.native
  /** [Method] Utility function that allows you to easily switch a string between two alternating values
  		* @param string String The current string
  		* @param value String The value to compare to the current string
  		* @param other String The new value to use if the string already equals the first value passed in
  		* @returns String The new value
  		*/
  def toggle(): String = js.native
  def toggle(string: String): String = js.native
  def toggle(string: String, value: String): String = js.native
  def toggle(string: String, value: String, other: String): String = js.native
  /** [Method] Trims whitespace from either end of a string leaving spaces within the string intact
  		* @param string String The string to escape
  		* @returns String The trimmed string
  		*/
  def trim(): String = js.native
  def trim(string: String): String = js.native
}

