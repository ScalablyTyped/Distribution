package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.DomQuery")
@js.native
class DomQuery () extends js.Object

/* static members */
@JSGlobal("Ext.DomQuery")
@js.native
object DomQuery extends js.Object {
  /** [Property] (Ext.Class) */
  var self: senchaUnderscoreTouchLib.ExtNs.IClass = js.native
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
  /** [Method] Returns true if the passed element s match the passed simple selector e g
  		* @param el String/HTMLElement/Array An element id, element or array of elements
  		* @param selector String The simple selector to test
  		* @returns Boolean
  		*/
  def is(): scala.Boolean = js.native
  def is(el: js.Any): scala.Boolean = js.native
  def is(el: js.Any, selector: java.lang.String): scala.Boolean = js.native
  /** [Method] Selects a group of elements
  		* @param selector String The selector/xpath query (can be a comma separated list of selectors)
  		* @param root HTMLElement/String The start of the query (defaults to document).
  		* @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
  		*/
  def select(): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  def select(selector: java.lang.String): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  def select(selector: java.lang.String, root: js.Any): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  /** [Method] Selects a single element
  		* @param selector String The selector/xpath query
  		* @param root HTMLElement/String The start of the query (defaults to document).
  		* @returns HTMLElement The DOM element which matched the selector.
  		*/
  def selectNode(): stdLib.HTMLElement = js.native
  def selectNode(selector: java.lang.String): stdLib.HTMLElement = js.native
  def selectNode(selector: java.lang.String, root: js.Any): stdLib.HTMLElement = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): senchaUnderscoreTouchLib.ExtNs.IClass = js.native
}

