package typings.senchaUnderscoreTouch.ExtNs.utilNs

import typings.senchaUnderscoreTouch.ExtNs.IClass
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.util.Inflector")
@js.native
class Inflector () extends js.Object

/* static members */
@JSGlobal("Ext.util.Inflector")
@js.native
object Inflector extends js.Object {
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
  /** [Method] Returns the correct Model name for a given string
  		* @param word String The word to classify
  		* @returns String The classified version of the word
  		*/
  def classify(): java.lang.String = js.native
  def classify(word: java.lang.String): java.lang.String = js.native
  /** [Method] Removes all registered pluralization rules */
  def clearPlurals(): Unit = js.native
  /** [Method] Removes all registered singularization rules */
  def clearSingulars(): Unit = js.native
  /** [Method]  */
  def destroy(): Unit = js.native
  /** [Method] Returns the initial configuration passed to constructor
  		* @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
  		* @returns Object/Mixed
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Initialize configuration for this class
  		* @param instanceConfig Object
  		* @returns Object mixins The mixin prototypes as key - value pairs
  		*/
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  /** [Method] Returns true if the given word is transnumeral the word is its own singular and plural form  e g
  		* @param word String The word to test
  		* @returns Boolean True if the word is transnumeral
  		*/
  def isTransnumeral(): Boolean = js.native
  def isTransnumeral(word: java.lang.String): Boolean = js.native
  /** [Method] Ordinalizes a given number by adding a prefix such as st nd rd or th based on the last digit of the number
  		* @param number Number The number to ordinalize
  		* @returns String The ordinalized number
  		*/
  def ordinalize(): java.lang.String = js.native
  def ordinalize(number: Double): java.lang.String = js.native
  /** [Method] Adds a new pluralization rule to the Inflector
  		* @param matcher RegExp The matcher regex
  		* @param replacer String The replacement string, which can reference matches from the matcher argument
  		*/
  def plural(): Unit = js.native
  def plural(matcher: RegExp): Unit = js.native
  def plural(matcher: RegExp, replacer: java.lang.String): Unit = js.native
  /** [Method] Returns the pluralized form of a word e g
  		* @param word String The word to pluralize
  		* @returns String The pluralized form of the word
  		*/
  def pluralize(): java.lang.String = js.native
  def pluralize(word: java.lang.String): java.lang.String = js.native
  /** [Method] Adds a new singularization rule to the Inflector
  		* @param matcher RegExp The matcher regex
  		* @param replacer String The replacement string, which can reference matches from the matcher argument
  		*/
  def singular(): Unit = js.native
  def singular(matcher: RegExp): Unit = js.native
  def singular(matcher: RegExp, replacer: java.lang.String): Unit = js.native
  /** [Method] Returns the singularized form of a word e g
  		* @param word String The word to singularize
  		* @returns String The singularized form of the word
  		*/
  def singularize(): java.lang.String = js.native
  def singularize(word: java.lang.String): java.lang.String = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): IClass = js.native
}

