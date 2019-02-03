package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.ComponentQuery")
@js.native
class ComponentQuery () extends js.Object

/* static members */
@JSGlobal("Ext.ComponentQuery")
@js.native
object ComponentQuery extends js.Object {
  /** [Method] Tests whether the passed Component matches the selector string
  		* @param component Ext.Component The Component to test.
  		* @param selector String The selector string to test against.
  		* @returns Boolean true if the Component matches the selector.
  		*/
  def is(): scala.Boolean = js.native
  def is(component: senchaUnderscoreTouchLib.ExtNs.IComponent): scala.Boolean = js.native
  def is(component: senchaUnderscoreTouchLib.ExtNs.IComponent, selector: java.lang.String): scala.Boolean = js.native
  /** [Method] Returns an array of matched Components from within the passed root object
  		* @param selector String The selector string to filter returned Components
  		* @param root Ext.Container The Container within which to perform the query. If omitted, all Components within the document are included in the search. This parameter may also be an array of Components to filter according to the selector.
  		* @returns Ext.Component[] The matched Components.
  		*/
  def query(): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  def query(selector: java.lang.String): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  def query(selector: java.lang.String, root: senchaUnderscoreTouchLib.ExtNs.IContainer): senchaUnderscoreTouchLib.ExtNs.Array = js.native
}

