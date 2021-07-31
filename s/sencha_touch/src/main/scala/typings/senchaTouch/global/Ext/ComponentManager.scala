package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.ComponentManager")
@js.native
class ComponentManager ()
  extends StObject
     with typings.senchaTouch.Ext.ComponentManager
/* static members */
object ComponentManager {
  
  @JSGlobal("Ext.ComponentManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @scala.inline
  def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
  @scala.inline
  def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @scala.inline
  def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
  @scala.inline
  def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @scala.inline
  def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
  @scala.inline
  def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Creates a new Component from the specified config object using the config object s xtype to determine the class to in
    * @param component Object A configuration object for the Component you wish to create.
    * @param defaultType Function The constructor to provide the default Component type if the config object does not contain a xtype. (Optional if the config contains an xtype).
    * @returns Ext.Component The newly instantiated Component.
    */
  @scala.inline
  def create(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[IComponent]
  @scala.inline
  def create(component: js.Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(component.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  @scala.inline
  def create(component: js.Any, defaultType: js.Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(component.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  @scala.inline
  def create(component: Unit, defaultType: js.Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(component.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Method]  */
  @scala.inline
  def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  /** [Method] Returns an item by id
    * @param id String The id of the item.
    * @returns Object The item, or undefined if not found.
    */
  @scala.inline
  def get(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Any]
  @scala.inline
  def get(id: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  @scala.inline
  def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
  @scala.inline
  def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  @scala.inline
  def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
  @scala.inline
  def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Checks if an item type is registered
    * @param component String The mnemonic string by which the class may be looked up.
    * @returns Boolean Whether the type is registered.
    */
  @scala.inline
  def isRegistered(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegistered")().asInstanceOf[Boolean]
  @scala.inline
  def isRegistered(component: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegistered")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Registers an item to be managed
    * @param component Object The item to register.
    */
  @scala.inline
  def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
  @scala.inline
  def register(component: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.ComponentManager.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @scala.inline
  def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  
  /** [Method] Unregisters an item by removing it from this manager
    * @param component Object The item to unregister.
    */
  @scala.inline
  def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
  @scala.inline
  def unregister(component: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
