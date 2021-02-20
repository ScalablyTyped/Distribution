package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.data.IModel
import typings.senchaTouch.Ext.util.IHashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.ModelMgr")
@js.native
class ModelMgr ()
  extends typings.senchaTouch.Ext.ModelMgr
/* static members */
object ModelMgr {
  
  @JSGlobal("Ext.ModelMgr")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Property] (Ext.util.HashMap) */
  @JSGlobal("Ext.ModelMgr.all")
  @js.native
  def all: IHashMap = js.native
  @scala.inline
  def all_=(x: IHashMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
  
  /** [Property] (Object) */
  @JSGlobal("Ext.ModelMgr.associationStack")
  @js.native
  def associationStack: js.Any = js.native
  @scala.inline
  def associationStack_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("associationStack")(x.asInstanceOf[js.Any])
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @JSGlobal("Ext.ModelMgr.callOverridden")
  @js.native
  def callOverridden(): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.callOverridden")
  @js.native
  def callOverridden(args: js.Any): js.Any = js.native
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @JSGlobal("Ext.ModelMgr.callParent")
  @js.native
  def callParent(): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.callParent")
  @js.native
  def callParent(args: js.Any): js.Any = js.native
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @JSGlobal("Ext.ModelMgr.callSuper")
  @js.native
  def callSuper(): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.callSuper")
  @js.native
  def callSuper(args: js.Any): js.Any = js.native
  
  /** [Method] Creates a new instance of a Model using the given data
    * @param data Object Data to initialize the Model's fields with.
    * @param name String The name of the model to create.
    * @param id Number Unique id of the Model instance (see Ext.data.Model).
    * @returns Object
    */
  @JSGlobal("Ext.ModelMgr.create")
  @js.native
  def create(): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.create")
  @js.native
  def create(data: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], id: Double): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.create")
  @js.native
  def create(data: js.UndefOr[scala.Nothing], name: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.create")
  @js.native
  def create(data: js.UndefOr[scala.Nothing], name: java.lang.String, id: Double): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.create")
  @js.native
  def create(data: js.Any): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.create")
  @js.native
  def create(data: js.Any, name: js.UndefOr[scala.Nothing], id: Double): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.create")
  @js.native
  def create(data: js.Any, name: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.create")
  @js.native
  def create(data: js.Any, name: java.lang.String, id: Double): js.Any = js.native
  
  /** [Property] (Object) */
  @JSGlobal("Ext.ModelMgr.defaultProxyType")
  @js.native
  def defaultProxyType: js.Any = js.native
  @scala.inline
  def defaultProxyType_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProxyType")(x.asInstanceOf[js.Any])
  
  /** [Method]  */
  @JSGlobal("Ext.ModelMgr.destroy")
  @js.native
  def destroy(): Unit = js.native
  
  /** [Method] Executes the specified function once for each item in the collection
    * @param fn Function The function to execute.
    * @param scope Object The scope to execute in.
    */
  @JSGlobal("Ext.ModelMgr.each")
  @js.native
  def each(): Unit = js.native
  @JSGlobal("Ext.ModelMgr.each")
  @js.native
  def each(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.ModelMgr.each")
  @js.native
  def each(fn: js.Any): Unit = js.native
  @JSGlobal("Ext.ModelMgr.each")
  @js.native
  def each(fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Returns an item by id
    * @param id String The id of the item.
    * @returns Object The item, undefined if not found.
    */
  @JSGlobal("Ext.ModelMgr.get")
  @js.native
  def get(): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.get")
  @js.native
  def get(id: java.lang.String): js.Any = js.native
  
  /** [Method] Gets the number of items in the collection
    * @returns Number The number of items in the collection.
    */
  @JSGlobal("Ext.ModelMgr.getCount")
  @js.native
  def getCount(): Double = js.native
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  @JSGlobal("Ext.ModelMgr.getInitialConfig")
  @js.native
  def getInitialConfig(): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.getInitialConfig")
  @js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  
  /** [Method] Returns the Ext data Model for a given model name
    * @param id String/Object The id of the model or the model instance.
    * @returns Ext.data.Model A model class.
    */
  @JSGlobal("Ext.ModelMgr.getModel")
  @js.native
  def getModel(): IModel = js.native
  @JSGlobal("Ext.ModelMgr.getModel")
  @js.native
  def getModel(id: js.Any): IModel = js.native
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  @JSGlobal("Ext.ModelMgr.initConfig")
  @js.native
  def initConfig(): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.initConfig")
  @js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  
  /** [Method] Checks if an item type is registered
    * @param type String The mnemonic string by which the class may be looked up.
    * @returns Boolean Whether the type is registered.
    */
  @JSGlobal("Ext.ModelMgr.isRegistered")
  @js.native
  def isRegistered(): Boolean = js.native
  @JSGlobal("Ext.ModelMgr.isRegistered")
  @js.native
  def isRegistered(`type`: java.lang.String): Boolean = js.native
  
  /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
    * @param id String The item id.
    * @param fn Function The callback function. Called with a single parameter, the item.
    * @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
    */
  @JSGlobal("Ext.ModelMgr.onAvailable")
  @js.native
  def onAvailable(): Unit = js.native
  @JSGlobal("Ext.ModelMgr.onAvailable")
  @js.native
  def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.ModelMgr.onAvailable")
  @js.native
  def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.ModelMgr.onAvailable")
  @js.native
  def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.ModelMgr.onAvailable")
  @js.native
  def onAvailable(id: java.lang.String): Unit = js.native
  @JSGlobal("Ext.ModelMgr.onAvailable")
  @js.native
  def onAvailable(id: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.ModelMgr.onAvailable")
  @js.native
  def onAvailable(id: java.lang.String, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.ModelMgr.onAvailable")
  @js.native
  def onAvailable(id: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Registers an item to be managed
    * @param item Object The item to register.
    */
  @JSGlobal("Ext.ModelMgr.register")
  @js.native
  def register(): Unit = js.native
  @JSGlobal("Ext.ModelMgr.register")
  @js.native
  def register(item: js.Any): Unit = js.native
  
  /** [Method] Registers a model definition
    * @param name String
    * @param config Object
    * @returns Object
    */
  @JSGlobal("Ext.ModelMgr.registerType")
  @js.native
  def registerType(): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.registerType")
  @js.native
  def registerType(name: js.UndefOr[scala.Nothing], config: js.Any): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.registerType")
  @js.native
  def registerType(name: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.ModelMgr.registerType")
  @js.native
  def registerType(name: java.lang.String, config: js.Any): js.Any = js.native
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.ModelMgr.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @JSGlobal("Ext.ModelMgr.statics")
  @js.native
  def statics(): IClass = js.native
  
  /** [Method] Unregisters an item by removing it from this manager
    * @param item Object The item to unregister.
    */
  @JSGlobal("Ext.ModelMgr.unregister")
  @js.native
  def unregister(): Unit = js.native
  @JSGlobal("Ext.ModelMgr.unregister")
  @js.native
  def unregister(item: js.Any): Unit = js.native
}
