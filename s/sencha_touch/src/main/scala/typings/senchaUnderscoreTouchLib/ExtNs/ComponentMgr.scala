package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.ComponentMgr")
@js.native
class ComponentMgr () extends js.Object

@JSGlobal("Ext.ComponentMgr")
@js.native
object ComponentMgr extends js.Object {
  /** [Property] (Ext.Class) */
  var self: senchaUnderscoreTouchLib.ExtNs.IClass = js.native
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
  /** [Method] Creates a new Component from the specified config object using the config object s xtype to determine the class to in
  		* @param component Object A configuration object for the Component you wish to create.
  		* @param defaultType Function The constructor to provide the default Component type if the config object does not contain a xtype. (Optional if the config contains an xtype).
  		* @returns Ext.Component The newly instantiated Component.
  		*/
  def create(): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  /** [Method] Creates a new Component from the specified config object using the config object s xtype to determine the class to in
  		* @param component Object A configuration object for the Component you wish to create.
  		* @param defaultType Function The constructor to provide the default Component type if the config object does not contain a xtype. (Optional if the config contains an xtype).
  		* @returns Ext.Component The newly instantiated Component.
  		*/
  def create(component: js.Any): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  /** [Method] Creates a new Component from the specified config object using the config object s xtype to determine the class to in
  		* @param component Object A configuration object for the Component you wish to create.
  		* @param defaultType Function The constructor to provide the default Component type if the config object does not contain a xtype. (Optional if the config contains an xtype).
  		* @returns Ext.Component The newly instantiated Component.
  		*/
  def create(component: js.Any, defaultType: js.Any): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  /** [Method]  */
  def destroy(): scala.Unit = js.native
  /** [Method] Returns an item by id
  		* @param id String The id of the item.
  		* @returns Object The item, or undefined if not found.
  		*/
  def get(): js.Any = js.native
  /** [Method] Returns an item by id
  		* @param id String The id of the item.
  		* @returns Object The item, or undefined if not found.
  		*/
  def get(id: java.lang.String): js.Any = js.native
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
  /** [Method] Checks if an item type is registered
  		* @param component String The mnemonic string by which the class may be looked up.
  		* @returns Boolean Whether the type is registered.
  		*/
  def isRegistered(): scala.Boolean = js.native
  /** [Method] Checks if an item type is registered
  		* @param component String The mnemonic string by which the class may be looked up.
  		* @returns Boolean Whether the type is registered.
  		*/
  def isRegistered(component: java.lang.String): scala.Boolean = js.native
  /** [Method] Registers an item to be managed
  		* @param component Object The item to register.
  		*/
  def register(): scala.Unit = js.native
  /** [Method] Registers an item to be managed
  		* @param component Object The item to register.
  		*/
  def register(component: js.Any): scala.Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): senchaUnderscoreTouchLib.ExtNs.IClass = js.native
  /** [Method] Unregisters an item by removing it from this manager
  		* @param component Object The item to unregister.
  		*/
  def unregister(): scala.Unit = js.native
  /** [Method] Unregisters an item by removing it from this manager
  		* @param component Object The item to unregister.
  		*/
  def unregister(component: js.Any): scala.Unit = js.native
}

