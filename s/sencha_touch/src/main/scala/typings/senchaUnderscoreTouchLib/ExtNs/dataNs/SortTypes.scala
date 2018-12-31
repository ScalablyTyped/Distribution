package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.data.SortTypes")
@js.native
class SortTypes () extends js.Object

@JSGlobal("Ext.data.SortTypes")
@js.native
object SortTypes extends js.Object {
  /** [Property] (Ext.Class) */
  var self: senchaUnderscoreTouchLib.ExtNs.IClass = js.native
  /** [Property] (RegExp) */
  var stripTagsRE: stdLib.RegExp = js.native
  /** [Method] Date sorting
  		* @param value Object The value being converted.
  		* @returns Number The comparison value.
  		*/
  def asDate(): scala.Double = js.native
  def asDate(value: js.Any): scala.Double = js.native
  /** [Method] Float sorting
  		* @param value Object The value being converted.
  		* @returns Number The comparison value.
  		*/
  def asFloat(): scala.Double = js.native
  def asFloat(value: js.Any): scala.Double = js.native
  /** [Method] Integer sorting
  		* @param value Object The value being converted.
  		* @returns Number The comparison value.
  		*/
  def asInt(): scala.Double = js.native
  def asInt(value: js.Any): scala.Double = js.native
  /** [Method] Strips all HTML tags to sort on text only
  		* @param value Object The value being converted.
  		* @returns String The comparison value.
  		*/
  def asText(): java.lang.String = js.native
  def asText(value: js.Any): java.lang.String = js.native
  /** [Method] Case insensitive string
  		* @param value Object The value being converted.
  		* @returns String The comparison value.
  		*/
  def asUCString(): java.lang.String = js.native
  def asUCString(value: js.Any): java.lang.String = js.native
  /** [Method] Strips all HTML tags to sort on text only  case insensitive
  		* @param value Object The value being converted.
  		* @returns String The comparison value.
  		*/
  def asUCText(): java.lang.String = js.native
  def asUCText(value: js.Any): java.lang.String = js.native
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
  def destroy(): scala.Unit = js.native
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
  /** [Method] Default sort that does nothing
  		* @param value Object The value being converted.
  		* @returns Object The comparison value.
  		*/
  def none(): js.Any = js.native
  def none(value: js.Any): js.Any = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): senchaUnderscoreTouchLib.ExtNs.IClass = js.native
}

