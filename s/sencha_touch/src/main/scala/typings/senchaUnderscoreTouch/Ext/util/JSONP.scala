package typings.senchaUnderscoreTouch.Ext.util

import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.util.JSONP")
@js.native
class JSONP () extends js.Object

/* static members */
@JSGlobal("Ext.util.JSONP")
@js.native
object JSONP extends js.Object {
  /** [Property] (String) */
  var callbackKey: String = js.native
  /** [Property] (Boolean) */
  var disableCaching: Boolean = js.native
  /** [Property] (String) */
  var disableCachingParam: String = js.native
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  /** [Property] (Number) */
  var timeout: Double = js.native
  /** [Method] Abort a request
  		* @param request Object/String The request to abort.
  		*/
  def abort(): Unit = js.native
  def abort(request: js.Any): Unit = js.native
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
  /** [Method] Returns the initial configuration passed to constructor
  		* @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
  		* @returns Object/Mixed
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: String): js.Any = js.native
  /** [Method] Initialize configuration for this class
  		* @param instanceConfig Object
  		* @returns Object mixins The mixin prototypes as key - value pairs
  		*/
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  /** [Method] Makes a JSONP request
  		* @param options Object An object which may contain the following properties. Note that options will take priority over any defaults that are specified in the class.
  		* @returns Object request An object containing the request details.
  		*/
  def request(): js.Any = js.native
  def request(options: js.Any): js.Any = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): IClass = js.native
}

