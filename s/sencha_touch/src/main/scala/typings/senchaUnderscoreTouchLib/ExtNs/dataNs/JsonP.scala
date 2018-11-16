package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.data.JsonP")
@js.native
class JsonP () extends js.Object

@JSGlobal("Ext.data.JsonP")
@js.native
object JsonP extends js.Object {
  /** [Property] (String) */
  var callbackKey: java.lang.String = js.native
  /** [Property] (Boolean) */
  var disableCaching: scala.Boolean = js.native
  /** [Property] (String) */
  var disableCachingParam: java.lang.String = js.native
  /** [Property] (Ext.Class) */
  var self: senchaUnderscoreTouchLib.ExtNs.IClass = js.native
  /** [Property] (Number) */
  var timeout: scala.Double = js.native
  /** [Method] Abort a request
  		* @param request Object/String The request to abort.
  		*/
  def abort(): scala.Unit = js.native
  /** [Method] Abort a request
  		* @param request Object/String The request to abort.
  		*/
  def abort(request: js.Any): scala.Unit = js.native
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(): js.Any = js.native
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(args: js.Any): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(args: js.Any): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(args: js.Any): js.Any = js.native
  /** [Method]  */
  def destroy(): scala.Unit = js.native
  /** [Method] Returns the initial configuration passed to constructor
  		* @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
  		* @returns Object/Mixed
  		*/
  def getInitialConfig(): js.Any = js.native
  /** [Method] Returns the initial configuration passed to constructor
  		* @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
  		* @returns Object/Mixed
  		*/
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Initialize configuration for this class
  		* @param instanceConfig Object
  		* @returns Object mixins The mixin prototypes as key - value pairs
  		*/
  def initConfig(): js.Any = js.native
  /** [Method] Initialize configuration for this class
  		* @param instanceConfig Object
  		* @returns Object mixins The mixin prototypes as key - value pairs
  		*/
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  /** [Method] Makes a JSONP request
  		* @param options Object An object which may contain the following properties. Note that options will take priority over any defaults that are specified in the class.
  		* @returns Object request An object containing the request details.
  		*/
  def request(): js.Any = js.native
  /** [Method] Makes a JSONP request
  		* @param options Object An object which may contain the following properties. Note that options will take priority over any defaults that are specified in the class.
  		* @returns Object request An object containing the request details.
  		*/
  def request(options: js.Any): js.Any = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): senchaUnderscoreTouchLib.ExtNs.IClass = js.native
}

