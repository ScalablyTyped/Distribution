package typings.senchaUnderscoreTouch.ExtNs.uxNs.deviceNs

import typings.senchaUnderscoreTouch.ExtNs.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.ux.device.Analytics")
@js.native
class Analytics () extends js.Object

/* static members */
@JSGlobal("Ext.ux.device.Analytics")
@js.native
object Analytics extends js.Object {
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
  /** [Method] Returns the value of accountID
  		* @returns Object
  		*/
  def getAccountID(): js.Any = js.native
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
  /** [Method] Registers yur Google Analytics account
  		* @param accountID String Your Google Analytics account ID
  		*/
  def registerAccount(): Unit = js.native
  def registerAccount(accountID: java.lang.String): Unit = js.native
  /** [Method] Sets the value of accountID
  		* @param accountID Object The new value.
  		*/
  def setAccountID(): Unit = js.native
  def setAccountID(accountID: js.Any): Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): IClass = js.native
  /** [Method] Track an event in your application
  		* @param config Object
  		*/
  def trackEvent(): Unit = js.native
  def trackEvent(config: js.Any): Unit = js.native
  /** [Method] Track an pageview in your application
  		* @param config String The page you want to track (must start with a slash).
  		*/
  def trackPageview(): Unit = js.native
  def trackPageview(config: java.lang.String): Unit = js.native
}

