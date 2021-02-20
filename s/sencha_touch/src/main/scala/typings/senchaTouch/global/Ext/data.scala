package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.data.IModel
import typings.senchaTouch.Ext.data.IStore
import typings.senchaTouch.Ext.util.ICollection
import typings.senchaTouch.Ext.util.IHashMap
import typings.senchaTouch.Ext.util.IMixedCollection
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object data {
  
  @JSGlobal("Ext.data.JsonP")
  @js.native
  class JsonP ()
    extends typings.senchaTouch.Ext.data.JsonP
  /* static members */
  object JsonP {
    
    @JSGlobal("Ext.data.JsonP")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Abort a request
      * @param request Object/String The request to abort.
      */
    @JSGlobal("Ext.data.JsonP.abort")
    @js.native
    def abort(): Unit = js.native
    @JSGlobal("Ext.data.JsonP.abort")
    @js.native
    def abort(request: js.Any): Unit = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.data.JsonP.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.data.JsonP.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.data.JsonP.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.data.JsonP.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.data.JsonP.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.data.JsonP.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.JsonP.callbackKey")
    @js.native
    def callbackKey: java.lang.String = js.native
    @scala.inline
    def callbackKey_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("callbackKey")(x.asInstanceOf[js.Any])
    
    /** [Method]  */
    @JSGlobal("Ext.data.JsonP.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.JsonP.disableCaching")
    @js.native
    def disableCaching: Boolean = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.JsonP.disableCachingParam")
    @js.native
    def disableCachingParam: java.lang.String = js.native
    @scala.inline
    def disableCachingParam_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCachingParam")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def disableCaching_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCaching")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.data.JsonP.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.data.JsonP.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.data.JsonP.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.data.JsonP.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] Makes a JSONP request
      * @param options Object An object which may contain the following properties. Note that options will take priority over any defaults that are specified in the class.
      * @returns Object request An object containing the request details.
      */
    @JSGlobal("Ext.data.JsonP.request")
    @js.native
    def request(): js.Any = js.native
    @JSGlobal("Ext.data.JsonP.request")
    @js.native
    def request(options: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.JsonP.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.data.JsonP.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.data.JsonP.timeout")
    @js.native
    def timeout: Double = js.native
    @scala.inline
    def timeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Ext.data.Model")
  @js.native
  class Model ()
    extends typings.senchaTouch.Ext.data.Model
  /* static members */
  object Model {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.data.Model.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.data.Model.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.data.Model.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.data.Model.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method]
      * @param args Object
      */
    @JSGlobal("Ext.data.Model.callParent")
    @js.native
    def callParent(): Unit = js.native
    @JSGlobal("Ext.data.Model.callParent")
    @js.native
    def callParent(args: js.Any): Unit = js.native
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @JSGlobal("Ext.data.Model.create")
    @js.native
    def create(): js.Any = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.data.Model.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.data.Model.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Model.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Model.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.data.Model.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Asynchronously loads a model instance by id
      * @param id Number The id of the model to load
      * @param config Object Config object containing fields:
      * @param scope Object Same as config.scope.
      */
    @JSGlobal("Ext.data.Model.load")
    @js.native
    def load(): Unit = js.native
    @JSGlobal("Ext.data.Model.load")
    @js.native
    def load(id: js.UndefOr[scala.Nothing], config: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Model.load")
    @js.native
    def load(id: js.UndefOr[scala.Nothing], config: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Model.load")
    @js.native
    def load(id: js.UndefOr[scala.Nothing], config: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Model.load")
    @js.native
    def load(id: Double): Unit = js.native
    @JSGlobal("Ext.data.Model.load")
    @js.native
    def load(id: Double, config: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Model.load")
    @js.native
    def load(id: Double, config: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Model.load")
    @js.native
    def load(id: Double, config: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.data.Model.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.data.Model.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.data.ModelManager")
  @js.native
  class ModelManager ()
    extends typings.senchaTouch.Ext.data.ModelManager
  /* static members */
  object ModelManager {
    
    @JSGlobal("Ext.data.ModelManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Property] (Ext.util.HashMap) */
    @JSGlobal("Ext.data.ModelManager.all")
    @js.native
    def all: IHashMap = js.native
    @scala.inline
    def all_=(x: IHashMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.ModelManager.associationStack")
    @js.native
    def associationStack: js.Any = js.native
    @scala.inline
    def associationStack_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("associationStack")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.data.ModelManager.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.data.ModelManager.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.data.ModelManager.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.data.ModelManager.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.data.ModelManager.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.data.ModelManager.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Creates a new instance of a Model using the given data
      * @param data Object Data to initialize the Model's fields with.
      * @param name String The name of the model to create.
      * @param id Number Unique id of the Model instance (see Ext.data.Model).
      * @returns Object
      */
    @JSGlobal("Ext.data.ModelManager.create")
    @js.native
    def create(): js.Any = js.native
    @JSGlobal("Ext.data.ModelManager.create")
    @js.native
    def create(data: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], id: Double): js.Any = js.native
    @JSGlobal("Ext.data.ModelManager.create")
    @js.native
    def create(data: js.UndefOr[scala.Nothing], name: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.ModelManager.create")
    @js.native
    def create(data: js.UndefOr[scala.Nothing], name: java.lang.String, id: Double): js.Any = js.native
    @JSGlobal("Ext.data.ModelManager.create")
    @js.native
    def create(data: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.ModelManager.create")
    @js.native
    def create(data: js.Any, name: js.UndefOr[scala.Nothing], id: Double): js.Any = js.native
    @JSGlobal("Ext.data.ModelManager.create")
    @js.native
    def create(data: js.Any, name: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.ModelManager.create")
    @js.native
    def create(data: js.Any, name: java.lang.String, id: Double): js.Any = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.ModelManager.defaultProxyType")
    @js.native
    def defaultProxyType: js.Any = js.native
    @scala.inline
    def defaultProxyType_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProxyType")(x.asInstanceOf[js.Any])
    
    /** [Method]  */
    @JSGlobal("Ext.data.ModelManager.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Executes the specified function once for each item in the collection
      * @param fn Function The function to execute.
      * @param scope Object The scope to execute in.
      */
    @JSGlobal("Ext.data.ModelManager.each")
    @js.native
    def each(): Unit = js.native
    @JSGlobal("Ext.data.ModelManager.each")
    @js.native
    def each(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.ModelManager.each")
    @js.native
    def each(fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.ModelManager.each")
    @js.native
    def each(fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Returns an item by id
      * @param id String The id of the item.
      * @returns Object The item, undefined if not found.
      */
    @JSGlobal("Ext.data.ModelManager.get")
    @js.native
    def get(): js.Any = js.native
    @JSGlobal("Ext.data.ModelManager.get")
    @js.native
    def get(id: java.lang.String): js.Any = js.native
    
    /** [Method] Gets the number of items in the collection
      * @returns Number The number of items in the collection.
      */
    @JSGlobal("Ext.data.ModelManager.getCount")
    @js.native
    def getCount(): Double = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.data.ModelManager.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.data.ModelManager.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Returns the Ext data Model for a given model name
      * @param id String/Object The id of the model or the model instance.
      * @returns Ext.data.Model A model class.
      */
    @JSGlobal("Ext.data.ModelManager.getModel")
    @js.native
    def getModel(): IModel = js.native
    @JSGlobal("Ext.data.ModelManager.getModel")
    @js.native
    def getModel(id: js.Any): IModel = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.data.ModelManager.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.data.ModelManager.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] Checks if an item type is registered
      * @param type String The mnemonic string by which the class may be looked up.
      * @returns Boolean Whether the type is registered.
      */
    @JSGlobal("Ext.data.ModelManager.isRegistered")
    @js.native
    def isRegistered(): Boolean = js.native
    @JSGlobal("Ext.data.ModelManager.isRegistered")
    @js.native
    def isRegistered(`type`: java.lang.String): Boolean = js.native
    
    /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
      * @param id String The item id.
      * @param fn Function The callback function. Called with a single parameter, the item.
      * @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
      */
    @JSGlobal("Ext.data.ModelManager.onAvailable")
    @js.native
    def onAvailable(): Unit = js.native
    @JSGlobal("Ext.data.ModelManager.onAvailable")
    @js.native
    def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.ModelManager.onAvailable")
    @js.native
    def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.ModelManager.onAvailable")
    @js.native
    def onAvailable(id: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.ModelManager.onAvailable")
    @js.native
    def onAvailable(id: java.lang.String): Unit = js.native
    @JSGlobal("Ext.data.ModelManager.onAvailable")
    @js.native
    def onAvailable(id: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.ModelManager.onAvailable")
    @js.native
    def onAvailable(id: java.lang.String, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.ModelManager.onAvailable")
    @js.native
    def onAvailable(id: java.lang.String, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Registers an item to be managed
      * @param item Object The item to register.
      */
    @JSGlobal("Ext.data.ModelManager.register")
    @js.native
    def register(): Unit = js.native
    @JSGlobal("Ext.data.ModelManager.register")
    @js.native
    def register(item: js.Any): Unit = js.native
    
    /** [Method] Registers a model definition
      * @param name String
      * @param config Object
      * @returns Object
      */
    @JSGlobal("Ext.data.ModelManager.registerType")
    @js.native
    def registerType(): js.Any = js.native
    @JSGlobal("Ext.data.ModelManager.registerType")
    @js.native
    def registerType(name: js.UndefOr[scala.Nothing], config: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.ModelManager.registerType")
    @js.native
    def registerType(name: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.ModelManager.registerType")
    @js.native
    def registerType(name: java.lang.String, config: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.ModelManager.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.data.ModelManager.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Unregisters an item by removing it from this manager
      * @param item Object The item to unregister.
      */
    @JSGlobal("Ext.data.ModelManager.unregister")
    @js.native
    def unregister(): Unit = js.native
    @JSGlobal("Ext.data.ModelManager.unregister")
    @js.native
    def unregister(item: js.Any): Unit = js.native
  }
  
  @JSGlobal("Ext.data.Node")
  @js.native
  class Node ()
    extends typings.senchaTouch.Ext.data.Node
  /* static members */
  object Node {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.data.Node.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.data.Node.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.data.Node.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.data.Node.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method]
      * @param args Object
      */
    @JSGlobal("Ext.data.Node.callParent")
    @js.native
    def callParent(): Unit = js.native
    @JSGlobal("Ext.data.Node.callParent")
    @js.native
    def callParent(args: js.Any): Unit = js.native
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @JSGlobal("Ext.data.Node.create")
    @js.native
    def create(): js.Any = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.data.Node.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.data.Node.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Node.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Node.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] This method allows you to decorate a Record s prototype to implement the NodeInterface
      * @param record Ext.data.Model The Record you want to decorate the prototype of.
      */
    @JSGlobal("Ext.data.Node.decorate")
    @js.native
    def decorate(): Unit = js.native
    @JSGlobal("Ext.data.Node.decorate")
    @js.native
    def decorate(record: IModel): Unit = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.data.Node.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.data.Node.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.data.Node.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.data.NodeInterface")
  @js.native
  class NodeInterface ()
    extends typings.senchaTouch.Ext.data.NodeInterface
  /* static members */
  object NodeInterface {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.data.NodeInterface.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.data.NodeInterface.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.data.NodeInterface.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.data.NodeInterface.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method]
      * @param args Object
      */
    @JSGlobal("Ext.data.NodeInterface.callParent")
    @js.native
    def callParent(): Unit = js.native
    @JSGlobal("Ext.data.NodeInterface.callParent")
    @js.native
    def callParent(args: js.Any): Unit = js.native
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @JSGlobal("Ext.data.NodeInterface.create")
    @js.native
    def create(): js.Any = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.data.NodeInterface.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.data.NodeInterface.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.data.NodeInterface.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.data.NodeInterface.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] This method allows you to decorate a Record s prototype to implement the NodeInterface
      * @param record Ext.data.Model The Record you want to decorate the prototype of.
      */
    @JSGlobal("Ext.data.NodeInterface.decorate")
    @js.native
    def decorate(): Unit = js.native
    @JSGlobal("Ext.data.NodeInterface.decorate")
    @js.native
    def decorate(record: IModel): Unit = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.data.NodeInterface.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.data.NodeInterface.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.data.NodeInterface.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.data.Record")
  @js.native
  class Record ()
    extends typings.senchaTouch.Ext.data.Record
  /* static members */
  object Record {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.data.Record.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.data.Record.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.data.Record.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.data.Record.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method]
      * @param args Object
      */
    @JSGlobal("Ext.data.Record.callParent")
    @js.native
    def callParent(): Unit = js.native
    @JSGlobal("Ext.data.Record.callParent")
    @js.native
    def callParent(args: js.Any): Unit = js.native
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @JSGlobal("Ext.data.Record.create")
    @js.native
    def create(): js.Any = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.data.Record.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.data.Record.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Record.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Record.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.data.Record.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Asynchronously loads a model instance by id
      * @param id Number The id of the model to load
      * @param config Object Config object containing fields:
      * @param scope Object Same as config.scope.
      */
    @JSGlobal("Ext.data.Record.load")
    @js.native
    def load(): Unit = js.native
    @JSGlobal("Ext.data.Record.load")
    @js.native
    def load(id: js.UndefOr[scala.Nothing], config: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Record.load")
    @js.native
    def load(id: js.UndefOr[scala.Nothing], config: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Record.load")
    @js.native
    def load(id: js.UndefOr[scala.Nothing], config: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Record.load")
    @js.native
    def load(id: Double): Unit = js.native
    @JSGlobal("Ext.data.Record.load")
    @js.native
    def load(id: Double, config: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Record.load")
    @js.native
    def load(id: Double, config: js.Any): Unit = js.native
    @JSGlobal("Ext.data.Record.load")
    @js.native
    def load(id: Double, config: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.data.Record.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.data.Record.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.data.SortTypes")
  @js.native
  class SortTypes ()
    extends typings.senchaTouch.Ext.data.SortTypes
  /* static members */
  object SortTypes {
    
    @JSGlobal("Ext.data.SortTypes")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Date sorting
      * @param value Object The value being converted.
      * @returns Number The comparison value.
      */
    @JSGlobal("Ext.data.SortTypes.asDate")
    @js.native
    def asDate(): Double = js.native
    @JSGlobal("Ext.data.SortTypes.asDate")
    @js.native
    def asDate(value: js.Any): Double = js.native
    
    /** [Method] Float sorting
      * @param value Object The value being converted.
      * @returns Number The comparison value.
      */
    @JSGlobal("Ext.data.SortTypes.asFloat")
    @js.native
    def asFloat(): Double = js.native
    @JSGlobal("Ext.data.SortTypes.asFloat")
    @js.native
    def asFloat(value: js.Any): Double = js.native
    
    /** [Method] Integer sorting
      * @param value Object The value being converted.
      * @returns Number The comparison value.
      */
    @JSGlobal("Ext.data.SortTypes.asInt")
    @js.native
    def asInt(): Double = js.native
    @JSGlobal("Ext.data.SortTypes.asInt")
    @js.native
    def asInt(value: js.Any): Double = js.native
    
    /** [Method] Strips all HTML tags to sort on text only
      * @param value Object The value being converted.
      * @returns String The comparison value.
      */
    @JSGlobal("Ext.data.SortTypes.asText")
    @js.native
    def asText(): java.lang.String = js.native
    @JSGlobal("Ext.data.SortTypes.asText")
    @js.native
    def asText(value: js.Any): java.lang.String = js.native
    
    /** [Method] Case insensitive string
      * @param value Object The value being converted.
      * @returns String The comparison value.
      */
    @JSGlobal("Ext.data.SortTypes.asUCString")
    @js.native
    def asUCString(): java.lang.String = js.native
    @JSGlobal("Ext.data.SortTypes.asUCString")
    @js.native
    def asUCString(value: js.Any): java.lang.String = js.native
    
    /** [Method] Strips all HTML tags to sort on text only  case insensitive
      * @param value Object The value being converted.
      * @returns String The comparison value.
      */
    @JSGlobal("Ext.data.SortTypes.asUCText")
    @js.native
    def asUCText(): java.lang.String = js.native
    @JSGlobal("Ext.data.SortTypes.asUCText")
    @js.native
    def asUCText(value: js.Any): java.lang.String = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.data.SortTypes.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.data.SortTypes.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.data.SortTypes.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.data.SortTypes.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.data.SortTypes.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.data.SortTypes.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.data.SortTypes.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.data.SortTypes.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.data.SortTypes.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.data.SortTypes.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.data.SortTypes.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] Default sort that does nothing
      * @param value Object The value being converted.
      * @returns Object The comparison value.
      */
    @JSGlobal("Ext.data.SortTypes.none")
    @js.native
    def none(): js.Any = js.native
    @JSGlobal("Ext.data.SortTypes.none")
    @js.native
    def none(value: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.SortTypes.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.data.SortTypes.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Property] (RegExp) */
    @JSGlobal("Ext.data.SortTypes.stripTagsRE")
    @js.native
    def stripTagsRE: RegExp = js.native
    @scala.inline
    def stripTagsRE_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripTagsRE")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Ext.data.StoreManager")
  @js.native
  class StoreManager ()
    extends typings.senchaTouch.Ext.data.StoreManager
  /* static members */
  object StoreManager {
    
    @JSGlobal("Ext.data.StoreManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Adds an item to the collection
      * @param key String The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
      * @param item Object The item to add.
      * @returns Object The item added.
      */
    @JSGlobal("Ext.data.StoreManager.add")
    @js.native
    def add(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.add")
    @js.native
    def add(key: js.UndefOr[scala.Nothing], item: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.add")
    @js.native
    def add(key: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.add")
    @js.native
    def add(key: java.lang.String, item: js.Any): js.Any = js.native
    
    /** [Method] Adds all elements of an Array or an Object to the collection
      * @param addItems Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if {@link} Ext.util.MixedCollection.allowFunctions allowFunctions} has been set to true.
      */
    @JSGlobal("Ext.data.StoreManager.addAll")
    @js.native
    def addAll(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.addAll")
    @js.native
    def addAll(addItems: js.Any): Unit = js.native
    
    /** [Method] This method adds a filter
      * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
      */
    @JSGlobal("Ext.data.StoreManager.addFilter")
    @js.native
    def addFilter(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.addFilter")
    @js.native
    def addFilter(filter: js.Any): Unit = js.native
    
    /** [Method] This method adds all the filters in a passed array
      * @param filters Object
      * @returns Object
      */
    @JSGlobal("Ext.data.StoreManager.addFilters")
    @js.native
    def addFilters(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.addFilters")
    @js.native
    def addFilters(filters: js.Any): js.Any = js.native
    
    /** [Method] This method adds a sorter
      * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
      */
    @JSGlobal("Ext.data.StoreManager.addSorter")
    @js.native
    def addSorter(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.addSorter")
    @js.native
    def addSorter(sorter: js.UndefOr[scala.Nothing], defaultDirection: java.lang.String): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.addSorter")
    @js.native
    def addSorter(sorter: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.addSorter")
    @js.native
    def addSorter(sorter: js.Any, defaultDirection: java.lang.String): Unit = js.native
    
    /** [Method] This method adds all the sorters in a passed array
      * @param sorters Array An array with sorters. A sorter can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
      */
    @JSGlobal("Ext.data.StoreManager.addSorters")
    @js.native
    def addSorters(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.addSorters")
    @js.native
    def addSorters(sorters: js.UndefOr[scala.Nothing], defaultDirection: java.lang.String): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.addSorters")
    @js.native
    def addSorters(sorters: typings.senchaTouch.Ext.Array): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.addSorters")
    @js.native
    def addSorters(sorters: typings.senchaTouch.Ext.Array, defaultDirection: java.lang.String): Unit = js.native
    
    /** [Property] (Array) */
    @JSGlobal("Ext.data.StoreManager.all")
    @js.native
    def all: typings.senchaTouch.Ext.Array = js.native
    @scala.inline
    def all_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.data.StoreManager.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.data.StoreManager.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.data.StoreManager.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Removes all items from the collection  */
    @JSGlobal("Ext.data.StoreManager.clear")
    @js.native
    def clear(): Unit = js.native
    
    /** [Method] Returns true if the collection contains the passed Object as an item
      * @param item Object The Object to look for in the collection.
      * @returns Boolean true if the collection contains the Object as an item.
      */
    @JSGlobal("Ext.data.StoreManager.contains")
    @js.native
    def contains(): Boolean = js.native
    @JSGlobal("Ext.data.StoreManager.contains")
    @js.native
    def contains(item: js.Any): Boolean = js.native
    
    /** [Method] Returns true if the collection contains the passed Object as a key
      * @param key String The key to look for in the collection.
      * @returns Boolean true if the collection contains the Object as a key.
      */
    @JSGlobal("Ext.data.StoreManager.containsKey")
    @js.native
    def containsKey(): Boolean = js.native
    @JSGlobal("Ext.data.StoreManager.containsKey")
    @js.native
    def containsKey(key: java.lang.String): Boolean = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.StoreManager.currentSortFn")
    @js.native
    def currentSortFn: js.Any = js.native
    @scala.inline
    def currentSortFn_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentSortFn")(x.asInstanceOf[js.Any])
    
    /** [Method]  */
    @JSGlobal("Ext.data.StoreManager.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreManager.dirtyFilterFn")
    @js.native
    def dirtyFilterFn: Boolean = js.native
    @scala.inline
    def dirtyFilterFn_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dirtyFilterFn")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreManager.dirtySortFn")
    @js.native
    def dirtySortFn: Boolean = js.native
    @scala.inline
    def dirtySortFn_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dirtySortFn")(x.asInstanceOf[js.Any])
    
    /** [Method] Executes the specified function once for every item in the collection
      * @param fn Function The function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
      */
    @JSGlobal("Ext.data.StoreManager.each")
    @js.native
    def each(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.each")
    @js.native
    def each(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.each")
    @js.native
    def each(fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.each")
    @js.native
    def each(fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
      * @param fn Function The function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
      */
    @JSGlobal("Ext.data.StoreManager.eachKey")
    @js.native
    def eachKey(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.eachKey")
    @js.native
    def eachKey(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.eachKey")
    @js.native
    def eachKey(fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.eachKey")
    @js.native
    def eachKey(fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] This method will sort a collection based on the currently configured sorters
      * @param property Object
      * @param value Object
      * @param anyMatch Object
      * @param caseSensitive Object
      * @returns Array
      */
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: js.Any
    ): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], anyMatch: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      anyMatch: js.Any,
      caseSensitive: js.Any
    ): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.UndefOr[scala.Nothing], value: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(
      property: js.UndefOr[scala.Nothing],
      value: js.Any,
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: js.Any
    ): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.UndefOr[scala.Nothing], value: js.Any, anyMatch: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.UndefOr[scala.Nothing], value: js.Any, anyMatch: js.Any, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(
      property: js.Any,
      value: js.UndefOr[scala.Nothing],
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: js.Any
    ): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.Any, value: js.UndefOr[scala.Nothing], anyMatch: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.Any, value: js.UndefOr[scala.Nothing], anyMatch: js.Any, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.Any, value: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.Any, value: js.Any, anyMatch: js.UndefOr[scala.Nothing], caseSensitive: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.Any, value: js.Any, anyMatch: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.filter")
    @js.native
    def filter(property: js.Any, value: js.Any, anyMatch: js.Any, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = js.native
    
    /** [Method] Filter by a function
      * @param fn Function The function to be called.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
      * @returns Ext.util.MixedCollection The new filtered collection
      */
    @JSGlobal("Ext.data.StoreManager.filterBy")
    @js.native
    def filterBy(): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filterBy")
    @js.native
    def filterBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filterBy")
    @js.native
    def filterBy(fn: js.Any): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.filterBy")
    @js.native
    def filterBy(fn: js.Any, scope: js.Any): IMixedCollection = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreManager.filtered")
    @js.native
    def filtered: Boolean = js.native
    @scala.inline
    def filtered_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filtered")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
      * @param fn Function The selection function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
      * @returns Object The first item in the collection which returned true from the selection function.
      */
    @JSGlobal("Ext.data.StoreManager.findBy")
    @js.native
    def findBy(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.findBy")
    @js.native
    def findBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.findBy")
    @js.native
    def findBy(fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.findBy")
    @js.native
    def findBy(fn: js.Any, scope: js.Any): js.Any = js.native
    
    /** [Method] Find the index of the first matching object in this collection by a function
      * @param fn Function The function to be called.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
      * @param start Number The index to start searching at.
      * @returns Number The matched index, or -1 if the item was not found.
      */
    @JSGlobal("Ext.data.StoreManager.findIndexBy")
    @js.native
    def findIndexBy(): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndexBy")
    @js.native
    def findIndexBy(fn: js.UndefOr[scala.Nothing], scope: js.UndefOr[scala.Nothing], start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndexBy")
    @js.native
    def findIndexBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndexBy")
    @js.native
    def findIndexBy(fn: js.UndefOr[scala.Nothing], scope: js.Any, start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndexBy")
    @js.native
    def findIndexBy(fn: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndexBy")
    @js.native
    def findIndexBy(fn: js.Any, scope: js.UndefOr[scala.Nothing], start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndexBy")
    @js.native
    def findIndexBy(fn: js.Any, scope: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findIndexBy")
    @js.native
    def findIndexBy(fn: js.Any, scope: js.Any, start: Double): Double = js.native
    
    /** [Method] This method returns the index that a given item would be inserted into a given array based on the current sorters
      * @param items Array The array that you want to insert the item into.
      * @param item Mixed The item that you want to insert into the items array.
      * @returns Number The index for the given item in the given array based on the current sorters.
      */
    @JSGlobal("Ext.data.StoreManager.findInsertionIndex")
    @js.native
    def findInsertionIndex(): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findInsertionIndex")
    @js.native
    def findInsertionIndex(items: js.UndefOr[scala.Nothing], item: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findInsertionIndex")
    @js.native
    def findInsertionIndex(items: typings.senchaTouch.Ext.Array): Double = js.native
    @JSGlobal("Ext.data.StoreManager.findInsertionIndex")
    @js.native
    def findInsertionIndex(items: typings.senchaTouch.Ext.Array, item: js.Any): Double = js.native
    
    /** [Method] Returns the first item in the collection
      * @returns Object the first item in the collection.
      */
    @JSGlobal("Ext.data.StoreManager.first")
    @js.native
    def first(): js.Any = js.native
    
    /** [Method] Returns the item associated with the passed key OR index
      * @param key String/Number The key or index of the item.
      * @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
      */
    @JSGlobal("Ext.data.StoreManager.get")
    @js.native
    def get(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.get")
    @js.native
    def get(key: js.Any): js.Any = js.native
    
    /** [Method] Returns the item at the specified index
      * @param index Number The index of the item.
      * @returns Object The item at the specified index.
      */
    @JSGlobal("Ext.data.StoreManager.getAt")
    @js.native
    def getAt(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.getAt")
    @js.native
    def getAt(index: Double): js.Any = js.native
    
    /** [Method] Returns the value of autoFilter
      * @returns Boolean
      */
    @JSGlobal("Ext.data.StoreManager.getAutoFilter")
    @js.native
    def getAutoFilter(): Boolean = js.native
    
    /** [Method] Returns the value of autoSort
      * @returns Boolean
      */
    @JSGlobal("Ext.data.StoreManager.getAutoSort")
    @js.native
    def getAutoSort(): Boolean = js.native
    
    /** [Method] Returns the item associated with the passed key
      * @param key String/Number The key of the item.
      * @returns Object The item associated with the passed key.
      */
    @JSGlobal("Ext.data.StoreManager.getByKey")
    @js.native
    def getByKey(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.getByKey")
    @js.native
    def getByKey(key: js.Any): js.Any = js.native
    
    /** [Method] Returns the number of items in the collection
      * @returns Number the number of items in the collection.
      */
    @JSGlobal("Ext.data.StoreManager.getCount")
    @js.native
    def getCount(): Double = js.native
    
    /** [Method] Returns the value of defaultSortDirection
      * @returns String
      */
    @JSGlobal("Ext.data.StoreManager.getDefaultSortDirection")
    @js.native
    def getDefaultSortDirection(): java.lang.String = js.native
    
    /** [Method] Returns an up to date sort function
      * @returns Function sortFn The sort function.
      */
    @JSGlobal("Ext.data.StoreManager.getFilterFn")
    @js.native
    def getFilterFn(): js.Any = js.native
    
    /** [Method] Returns the value of filterRoot
      * @returns String
      */
    @JSGlobal("Ext.data.StoreManager.getFilterRoot")
    @js.native
    def getFilterRoot(): java.lang.String = js.native
    
    /** [Method] Returns the value of filters
      * @returns Array
      */
    @JSGlobal("Ext.data.StoreManager.getFilters")
    @js.native
    def getFilters(): typings.senchaTouch.Ext.Array = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.data.StoreManager.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] getKey implementation for MixedCollection
      * @param o Object
      * @returns Object The key for the passed item.
      */
    @JSGlobal("Ext.data.StoreManager.getKey")
    @js.native
    def getKey(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.getKey")
    @js.native
    def getKey(o: js.Any): js.Any = js.native
    
    /** [Method] Returns a range of items in this collection
      * @param start Number The starting index.
      * @param end Number The ending index. Defaults to the last item.
      * @returns Array An array of items.
      */
    @JSGlobal("Ext.data.StoreManager.getRange")
    @js.native
    def getRange(): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.getRange")
    @js.native
    def getRange(start: js.UndefOr[scala.Nothing], end: Double): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.getRange")
    @js.native
    def getRange(start: Double): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.getRange")
    @js.native
    def getRange(start: Double, end: Double): typings.senchaTouch.Ext.Array = js.native
    
    /** [Method] Returns an up to date sort function
      * @returns Function The sort function.
      */
    @JSGlobal("Ext.data.StoreManager.getSortFn")
    @js.native
    def getSortFn(): js.Any = js.native
    
    /** [Method] Returns the value of sortRoot
      * @returns String
      */
    @JSGlobal("Ext.data.StoreManager.getSortRoot")
    @js.native
    def getSortRoot(): java.lang.String = js.native
    
    /** [Method] Returns the value of sorters
      * @returns Array
      */
    @JSGlobal("Ext.data.StoreManager.getSorters")
    @js.native
    def getSorters(): typings.senchaTouch.Ext.Array = js.native
    
    /** [Method] Returns index within the collection of the passed Object
      * @param item Object The item to find the index of.
      * @returns Number Index of the item. Returns -1 if not found.
      */
    @JSGlobal("Ext.data.StoreManager.indexOf")
    @js.native
    def indexOf(): Double = js.native
    @JSGlobal("Ext.data.StoreManager.indexOf")
    @js.native
    def indexOf(item: js.Any): Double = js.native
    
    /** [Method] Returns index within the collection of the passed key
      * @param key String The key to find the index of.
      * @returns Number Index of the key.
      */
    @JSGlobal("Ext.data.StoreManager.indexOfKey")
    @js.native
    def indexOfKey(): Double = js.native
    @JSGlobal("Ext.data.StoreManager.indexOfKey")
    @js.native
    def indexOfKey(key: java.lang.String): Double = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.StoreManager.indices")
    @js.native
    def indices: js.Any = js.native
    @scala.inline
    def indices_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indices")(x.asInstanceOf[js.Any])
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.data.StoreManager.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] Inserts an item at the specified index in the collection
      * @param index Number The index to insert the item at.
      * @param key String The key to associate with the new item, or the item itself.
      * @param item Object If the second parameter was a key, the new item.
      * @returns Object The item inserted.
      */
    @JSGlobal("Ext.data.StoreManager.insert")
    @js.native
    def insert(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.insert")
    @js.native
    def insert(index: js.UndefOr[scala.Nothing], key: js.UndefOr[scala.Nothing], item: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.insert")
    @js.native
    def insert(index: js.UndefOr[scala.Nothing], key: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.insert")
    @js.native
    def insert(index: js.UndefOr[scala.Nothing], key: java.lang.String, item: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.insert")
    @js.native
    def insert(index: Double): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.insert")
    @js.native
    def insert(index: Double, key: js.UndefOr[scala.Nothing], item: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.insert")
    @js.native
    def insert(index: Double, key: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.insert")
    @js.native
    def insert(index: Double, key: java.lang.String, item: js.Any): js.Any = js.native
    
    /** [Method] This method adds a filter at a given index
      * @param index Number The index at which to insert the filter.
      * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
      * @returns Object
      */
    @JSGlobal("Ext.data.StoreManager.insertFilter")
    @js.native
    def insertFilter(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.insertFilter")
    @js.native
    def insertFilter(index: js.UndefOr[scala.Nothing], filter: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.insertFilter")
    @js.native
    def insertFilter(index: Double): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.insertFilter")
    @js.native
    def insertFilter(index: Double, filter: js.Any): js.Any = js.native
    
    /** [Method] This method inserts all the filters in the passed array at the given index
      * @param index Number The index at which to insert the filters.
      * @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
      * @returns Array
      */
    @JSGlobal("Ext.data.StoreManager.insertFilters")
    @js.native
    def insertFilters(): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.insertFilters")
    @js.native
    def insertFilters(index: js.UndefOr[scala.Nothing], filters: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.insertFilters")
    @js.native
    def insertFilters(index: Double): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.insertFilters")
    @js.native
    def insertFilters(index: Double, filters: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
    
    /** [Method] This method adds a sorter at a given index
      * @param index Number The index at which to insert the sorter.
      * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
      */
    @JSGlobal("Ext.data.StoreManager.insertSorter")
    @js.native
    def insertSorter(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.insertSorter")
    @js.native
    def insertSorter(
      index: js.UndefOr[scala.Nothing],
      sorter: js.UndefOr[scala.Nothing],
      defaultDirection: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.insertSorter")
    @js.native
    def insertSorter(index: js.UndefOr[scala.Nothing], sorter: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.insertSorter")
    @js.native
    def insertSorter(index: js.UndefOr[scala.Nothing], sorter: js.Any, defaultDirection: java.lang.String): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.insertSorter")
    @js.native
    def insertSorter(index: Double): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.insertSorter")
    @js.native
    def insertSorter(index: Double, sorter: js.UndefOr[scala.Nothing], defaultDirection: java.lang.String): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.insertSorter")
    @js.native
    def insertSorter(index: Double, sorter: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.insertSorter")
    @js.native
    def insertSorter(index: Double, sorter: js.Any, defaultDirection: java.lang.String): Unit = js.native
    
    /** [Method] This method inserts all the sorters in the passed array at the given index
      * @returns Ext.util.Collection this
      */
    @JSGlobal("Ext.data.StoreManager.insertSorters")
    @js.native
    def insertSorters(): ICollection = js.native
    
    /** [Property] (Array) */
    @JSGlobal("Ext.data.StoreManager.items")
    @js.native
    def items: typings.senchaTouch.Ext.Array = js.native
    @scala.inline
    def items_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
    
    /** [Property] (Array) */
    @JSGlobal("Ext.data.StoreManager.keys")
    @js.native
    def keys: typings.senchaTouch.Ext.Array = js.native
    @scala.inline
    def keys_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keys")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the last item in the collection
      * @returns Object the last item in the collection.
      */
    @JSGlobal("Ext.data.StoreManager.last")
    @js.native
    def last(): js.Any = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.data.StoreManager.length")
    @js.native
    def length: Double = js.native
    @scala.inline
    def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    /** [Method] Gets a registered Store by its id returns a passed store instance or returns a new instance of a store created with
      * @param store String/Object The id of the Store, or a Store instance, or a store configuration.
      * @returns Ext.data.Store
      */
    @JSGlobal("Ext.data.StoreManager.lookup")
    @js.native
    def lookup(): IStore = js.native
    @JSGlobal("Ext.data.StoreManager.lookup")
    @js.native
    def lookup(store: js.Any): IStore = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.StoreManager.map")
    @js.native
    def map: js.Any = js.native
    @scala.inline
    def map_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
    
    /** [Method] Registers one or more Stores with the StoreManager
      * @param stores Ext.data.Store... Any number of Store instances.
      */
    @JSGlobal("Ext.data.StoreManager.register")
    @js.native
    def register(stores: IStore): Unit = js.native
    
    /** [Method] Remove an item from the collection
      * @param item Object The item to remove.
      * @returns Object The item removed or false if no item was removed.
      */
    @JSGlobal("Ext.data.StoreManager.remove")
    @js.native
    def remove(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.remove")
    @js.native
    def remove(item: js.Any): js.Any = js.native
    
    /** [Method] Remove all items in the passed array from the collection
      * @param items Array An array of items to be removed.
      * @returns Ext.util.MixedCollection this object
      */
    @JSGlobal("Ext.data.StoreManager.removeAll")
    @js.native
    def removeAll(): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreManager.removeAll")
    @js.native
    def removeAll(items: typings.senchaTouch.Ext.Array): IMixedCollection = js.native
    
    /** [Method] Remove an item from a specified index in the collection
      * @param index Number The index within the collection of the item to remove.
      * @returns Object The item removed or false if no item was removed.
      */
    @JSGlobal("Ext.data.StoreManager.removeAt")
    @js.native
    def removeAt(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.removeAt")
    @js.native
    def removeAt(index: Double): js.Any = js.native
    
    /** [Method] Removed an item associated with the passed key from the collection
      * @param key String The key of the item to remove.
      * @returns Object/Boolean The item removed or false if no item was removed.
      */
    @JSGlobal("Ext.data.StoreManager.removeAtKey")
    @js.native
    def removeAtKey(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.removeAtKey")
    @js.native
    def removeAtKey(key: java.lang.String): js.Any = js.native
    
    /** [Method] This method removes all the filters in a passed array
      * @param filters Object
      * @returns Ext.util.Collection this
      */
    @JSGlobal("Ext.data.StoreManager.removeFilters")
    @js.native
    def removeFilters(): ICollection = js.native
    @JSGlobal("Ext.data.StoreManager.removeFilters")
    @js.native
    def removeFilters(filters: js.Any): ICollection = js.native
    
    /** [Method] This method removes a sorter
      * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      */
    @JSGlobal("Ext.data.StoreManager.removeSorter")
    @js.native
    def removeSorter(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.removeSorter")
    @js.native
    def removeSorter(sorter: js.Any): Unit = js.native
    
    /** [Method] This method removes all the sorters in a passed array
      * @param sorters Object
      * @returns Ext.util.Collection this
      */
    @JSGlobal("Ext.data.StoreManager.removeSorters")
    @js.native
    def removeSorters(): ICollection = js.native
    @JSGlobal("Ext.data.StoreManager.removeSorters")
    @js.native
    def removeSorters(sorters: js.Any): ICollection = js.native
    
    /** [Method] Replaces an item in the collection
      * @param oldKey String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
      * @param item Object {Object} item (optional) If the first parameter passed was a key, the item to associate with that key.
      * @returns Object The new item.
      */
    @JSGlobal("Ext.data.StoreManager.replace")
    @js.native
    def replace(): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.replace")
    @js.native
    def replace(oldKey: js.UndefOr[scala.Nothing], item: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.replace")
    @js.native
    def replace(oldKey: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.StoreManager.replace")
    @js.native
    def replace(oldKey: java.lang.String, item: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.StoreManager.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of autoFilter
      * @param autoFilter Boolean The new value.
      */
    @JSGlobal("Ext.data.StoreManager.setAutoFilter")
    @js.native
    def setAutoFilter(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.setAutoFilter")
    @js.native
    def setAutoFilter(autoFilter: Boolean): Unit = js.native
    
    /** [Method] Sets the value of autoSort
      * @param autoSort Boolean The new value.
      */
    @JSGlobal("Ext.data.StoreManager.setAutoSort")
    @js.native
    def setAutoSort(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.setAutoSort")
    @js.native
    def setAutoSort(autoSort: Boolean): Unit = js.native
    
    /** [Method] Sets the value of defaultSortDirection
      * @param defaultSortDirection String The new value.
      */
    @JSGlobal("Ext.data.StoreManager.setDefaultSortDirection")
    @js.native
    def setDefaultSortDirection(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.setDefaultSortDirection")
    @js.native
    def setDefaultSortDirection(defaultSortDirection: java.lang.String): Unit = js.native
    
    /** [Method] Sets the value of filterRoot
      * @param filterRoot String The new value.
      */
    @JSGlobal("Ext.data.StoreManager.setFilterRoot")
    @js.native
    def setFilterRoot(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.setFilterRoot")
    @js.native
    def setFilterRoot(filterRoot: java.lang.String): Unit = js.native
    
    /** [Method] Sets the value of filters
      * @param filters Array The new value.
      */
    @JSGlobal("Ext.data.StoreManager.setFilters")
    @js.native
    def setFilters(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.setFilters")
    @js.native
    def setFilters(filters: typings.senchaTouch.Ext.Array): Unit = js.native
    
    /** [Method] Sets the value of sortRoot
      * @param sortRoot String The new value.
      */
    @JSGlobal("Ext.data.StoreManager.setSortRoot")
    @js.native
    def setSortRoot(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.setSortRoot")
    @js.native
    def setSortRoot(sortRoot: java.lang.String): Unit = js.native
    
    /** [Method] Sets the value of sorters
      * @param sorters Array The new value.
      */
    @JSGlobal("Ext.data.StoreManager.setSorters")
    @js.native
    def setSorters(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.setSorters")
    @js.native
    def setSorters(sorters: typings.senchaTouch.Ext.Array): Unit = js.native
    
    /** [Method] This method will sort an array based on the currently configured sorters
      * @param sorters Object
      * @param defaultDirection Object
      * @returns Array The array you passed after it is sorted.
      */
    @JSGlobal("Ext.data.StoreManager.sort")
    @js.native
    def sort(): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.sort")
    @js.native
    def sort(sorters: js.UndefOr[scala.Nothing], defaultDirection: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.sort")
    @js.native
    def sort(sorters: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreManager.sort")
    @js.native
    def sort(sorters: js.Any, defaultDirection: js.Any): typings.senchaTouch.Ext.Array = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreManager.sorted")
    @js.native
    def sorted: Boolean = js.native
    @scala.inline
    def sorted_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sorted")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.data.StoreManager.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Unregisters one or more Stores with the StoreManager
      * @param stores String/Object... Any number of Store instances or ID-s.
      */
    @JSGlobal("Ext.data.StoreManager.unregister")
    @js.native
    def unregister(): Unit = js.native
    @JSGlobal("Ext.data.StoreManager.unregister")
    @js.native
    def unregister(stores: js.Any): Unit = js.native
  }
  
  @JSGlobal("Ext.data.StoreMgr")
  @js.native
  class StoreMgr ()
    extends typings.senchaTouch.Ext.data.StoreMgr
  /* static members */
  object StoreMgr {
    
    @JSGlobal("Ext.data.StoreMgr")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Adds an item to the collection
      * @param key String The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
      * @param item Object The item to add.
      * @returns Object The item added.
      */
    @JSGlobal("Ext.data.StoreMgr.add")
    @js.native
    def add(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.add")
    @js.native
    def add(key: js.UndefOr[scala.Nothing], item: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.add")
    @js.native
    def add(key: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.add")
    @js.native
    def add(key: java.lang.String, item: js.Any): js.Any = js.native
    
    /** [Method] Adds all elements of an Array or an Object to the collection
      * @param addItems Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if {@link} Ext.util.MixedCollection.allowFunctions allowFunctions} has been set to true.
      */
    @JSGlobal("Ext.data.StoreMgr.addAll")
    @js.native
    def addAll(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.addAll")
    @js.native
    def addAll(addItems: js.Any): Unit = js.native
    
    /** [Method] This method adds a filter
      * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
      */
    @JSGlobal("Ext.data.StoreMgr.addFilter")
    @js.native
    def addFilter(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.addFilter")
    @js.native
    def addFilter(filter: js.Any): Unit = js.native
    
    /** [Method] This method adds all the filters in a passed array
      * @param filters Object
      * @returns Object
      */
    @JSGlobal("Ext.data.StoreMgr.addFilters")
    @js.native
    def addFilters(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.addFilters")
    @js.native
    def addFilters(filters: js.Any): js.Any = js.native
    
    /** [Method] This method adds a sorter
      * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
      */
    @JSGlobal("Ext.data.StoreMgr.addSorter")
    @js.native
    def addSorter(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.addSorter")
    @js.native
    def addSorter(sorter: js.UndefOr[scala.Nothing], defaultDirection: java.lang.String): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.addSorter")
    @js.native
    def addSorter(sorter: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.addSorter")
    @js.native
    def addSorter(sorter: js.Any, defaultDirection: java.lang.String): Unit = js.native
    
    /** [Method] This method adds all the sorters in a passed array
      * @param sorters Array An array with sorters. A sorter can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
      */
    @JSGlobal("Ext.data.StoreMgr.addSorters")
    @js.native
    def addSorters(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.addSorters")
    @js.native
    def addSorters(sorters: js.UndefOr[scala.Nothing], defaultDirection: java.lang.String): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.addSorters")
    @js.native
    def addSorters(sorters: typings.senchaTouch.Ext.Array): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.addSorters")
    @js.native
    def addSorters(sorters: typings.senchaTouch.Ext.Array, defaultDirection: java.lang.String): Unit = js.native
    
    /** [Property] (Array) */
    @JSGlobal("Ext.data.StoreMgr.all")
    @js.native
    def all: typings.senchaTouch.Ext.Array = js.native
    @scala.inline
    def all_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.data.StoreMgr.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.data.StoreMgr.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.data.StoreMgr.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Removes all items from the collection  */
    @JSGlobal("Ext.data.StoreMgr.clear")
    @js.native
    def clear(): Unit = js.native
    
    /** [Method] Returns true if the collection contains the passed Object as an item
      * @param item Object The Object to look for in the collection.
      * @returns Boolean true if the collection contains the Object as an item.
      */
    @JSGlobal("Ext.data.StoreMgr.contains")
    @js.native
    def contains(): Boolean = js.native
    @JSGlobal("Ext.data.StoreMgr.contains")
    @js.native
    def contains(item: js.Any): Boolean = js.native
    
    /** [Method] Returns true if the collection contains the passed Object as a key
      * @param key String The key to look for in the collection.
      * @returns Boolean true if the collection contains the Object as a key.
      */
    @JSGlobal("Ext.data.StoreMgr.containsKey")
    @js.native
    def containsKey(): Boolean = js.native
    @JSGlobal("Ext.data.StoreMgr.containsKey")
    @js.native
    def containsKey(key: java.lang.String): Boolean = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.StoreMgr.currentSortFn")
    @js.native
    def currentSortFn: js.Any = js.native
    @scala.inline
    def currentSortFn_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentSortFn")(x.asInstanceOf[js.Any])
    
    /** [Method]  */
    @JSGlobal("Ext.data.StoreMgr.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreMgr.dirtyFilterFn")
    @js.native
    def dirtyFilterFn: Boolean = js.native
    @scala.inline
    def dirtyFilterFn_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dirtyFilterFn")(x.asInstanceOf[js.Any])
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreMgr.dirtySortFn")
    @js.native
    def dirtySortFn: Boolean = js.native
    @scala.inline
    def dirtySortFn_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dirtySortFn")(x.asInstanceOf[js.Any])
    
    /** [Method] Executes the specified function once for every item in the collection
      * @param fn Function The function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
      */
    @JSGlobal("Ext.data.StoreMgr.each")
    @js.native
    def each(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.each")
    @js.native
    def each(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.each")
    @js.native
    def each(fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.each")
    @js.native
    def each(fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
      * @param fn Function The function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
      */
    @JSGlobal("Ext.data.StoreMgr.eachKey")
    @js.native
    def eachKey(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.eachKey")
    @js.native
    def eachKey(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.eachKey")
    @js.native
    def eachKey(fn: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.eachKey")
    @js.native
    def eachKey(fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] This method will sort a collection based on the currently configured sorters
      * @param property Object
      * @param value Object
      * @param anyMatch Object
      * @param caseSensitive Object
      * @returns Array
      */
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: js.Any
    ): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], anyMatch: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(
      property: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      anyMatch: js.Any,
      caseSensitive: js.Any
    ): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.UndefOr[scala.Nothing], value: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(
      property: js.UndefOr[scala.Nothing],
      value: js.Any,
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: js.Any
    ): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.UndefOr[scala.Nothing], value: js.Any, anyMatch: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.UndefOr[scala.Nothing], value: js.Any, anyMatch: js.Any, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(
      property: js.Any,
      value: js.UndefOr[scala.Nothing],
      anyMatch: js.UndefOr[scala.Nothing],
      caseSensitive: js.Any
    ): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.Any, value: js.UndefOr[scala.Nothing], anyMatch: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.Any, value: js.UndefOr[scala.Nothing], anyMatch: js.Any, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.Any, value: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.Any, value: js.Any, anyMatch: js.UndefOr[scala.Nothing], caseSensitive: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.Any, value: js.Any, anyMatch: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.filter")
    @js.native
    def filter(property: js.Any, value: js.Any, anyMatch: js.Any, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = js.native
    
    /** [Method] Filter by a function
      * @param fn Function The function to be called.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
      * @returns Ext.util.MixedCollection The new filtered collection
      */
    @JSGlobal("Ext.data.StoreMgr.filterBy")
    @js.native
    def filterBy(): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filterBy")
    @js.native
    def filterBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filterBy")
    @js.native
    def filterBy(fn: js.Any): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.filterBy")
    @js.native
    def filterBy(fn: js.Any, scope: js.Any): IMixedCollection = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreMgr.filtered")
    @js.native
    def filtered: Boolean = js.native
    @scala.inline
    def filtered_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filtered")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
      * @param fn Function The selection function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
      * @returns Object The first item in the collection which returned true from the selection function.
      */
    @JSGlobal("Ext.data.StoreMgr.findBy")
    @js.native
    def findBy(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.findBy")
    @js.native
    def findBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.findBy")
    @js.native
    def findBy(fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.findBy")
    @js.native
    def findBy(fn: js.Any, scope: js.Any): js.Any = js.native
    
    /** [Method] Find the index of the first matching object in this collection by a function
      * @param fn Function The function to be called.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
      * @param start Number The index to start searching at.
      * @returns Number The matched index, or -1 if the item was not found.
      */
    @JSGlobal("Ext.data.StoreMgr.findIndexBy")
    @js.native
    def findIndexBy(): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndexBy")
    @js.native
    def findIndexBy(fn: js.UndefOr[scala.Nothing], scope: js.UndefOr[scala.Nothing], start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndexBy")
    @js.native
    def findIndexBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndexBy")
    @js.native
    def findIndexBy(fn: js.UndefOr[scala.Nothing], scope: js.Any, start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndexBy")
    @js.native
    def findIndexBy(fn: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndexBy")
    @js.native
    def findIndexBy(fn: js.Any, scope: js.UndefOr[scala.Nothing], start: Double): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndexBy")
    @js.native
    def findIndexBy(fn: js.Any, scope: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findIndexBy")
    @js.native
    def findIndexBy(fn: js.Any, scope: js.Any, start: Double): Double = js.native
    
    /** [Method] This method returns the index that a given item would be inserted into a given array based on the current sorters
      * @param items Array The array that you want to insert the item into.
      * @param item Mixed The item that you want to insert into the items array.
      * @returns Number The index for the given item in the given array based on the current sorters.
      */
    @JSGlobal("Ext.data.StoreMgr.findInsertionIndex")
    @js.native
    def findInsertionIndex(): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findInsertionIndex")
    @js.native
    def findInsertionIndex(items: js.UndefOr[scala.Nothing], item: js.Any): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findInsertionIndex")
    @js.native
    def findInsertionIndex(items: typings.senchaTouch.Ext.Array): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.findInsertionIndex")
    @js.native
    def findInsertionIndex(items: typings.senchaTouch.Ext.Array, item: js.Any): Double = js.native
    
    /** [Method] Returns the first item in the collection
      * @returns Object the first item in the collection.
      */
    @JSGlobal("Ext.data.StoreMgr.first")
    @js.native
    def first(): js.Any = js.native
    
    /** [Method] Returns the item associated with the passed key OR index
      * @param key String/Number The key or index of the item.
      * @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
      */
    @JSGlobal("Ext.data.StoreMgr.get")
    @js.native
    def get(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.get")
    @js.native
    def get(key: js.Any): js.Any = js.native
    
    /** [Method] Returns the item at the specified index
      * @param index Number The index of the item.
      * @returns Object The item at the specified index.
      */
    @JSGlobal("Ext.data.StoreMgr.getAt")
    @js.native
    def getAt(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.getAt")
    @js.native
    def getAt(index: Double): js.Any = js.native
    
    /** [Method] Returns the value of autoFilter
      * @returns Boolean
      */
    @JSGlobal("Ext.data.StoreMgr.getAutoFilter")
    @js.native
    def getAutoFilter(): Boolean = js.native
    
    /** [Method] Returns the value of autoSort
      * @returns Boolean
      */
    @JSGlobal("Ext.data.StoreMgr.getAutoSort")
    @js.native
    def getAutoSort(): Boolean = js.native
    
    /** [Method] Returns the item associated with the passed key
      * @param key String/Number The key of the item.
      * @returns Object The item associated with the passed key.
      */
    @JSGlobal("Ext.data.StoreMgr.getByKey")
    @js.native
    def getByKey(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.getByKey")
    @js.native
    def getByKey(key: js.Any): js.Any = js.native
    
    /** [Method] Returns the number of items in the collection
      * @returns Number the number of items in the collection.
      */
    @JSGlobal("Ext.data.StoreMgr.getCount")
    @js.native
    def getCount(): Double = js.native
    
    /** [Method] Returns the value of defaultSortDirection
      * @returns String
      */
    @JSGlobal("Ext.data.StoreMgr.getDefaultSortDirection")
    @js.native
    def getDefaultSortDirection(): java.lang.String = js.native
    
    /** [Method] Returns an up to date sort function
      * @returns Function sortFn The sort function.
      */
    @JSGlobal("Ext.data.StoreMgr.getFilterFn")
    @js.native
    def getFilterFn(): js.Any = js.native
    
    /** [Method] Returns the value of filterRoot
      * @returns String
      */
    @JSGlobal("Ext.data.StoreMgr.getFilterRoot")
    @js.native
    def getFilterRoot(): java.lang.String = js.native
    
    /** [Method] Returns the value of filters
      * @returns Array
      */
    @JSGlobal("Ext.data.StoreMgr.getFilters")
    @js.native
    def getFilters(): typings.senchaTouch.Ext.Array = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.data.StoreMgr.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] getKey implementation for MixedCollection
      * @param o Object
      * @returns Object The key for the passed item.
      */
    @JSGlobal("Ext.data.StoreMgr.getKey")
    @js.native
    def getKey(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.getKey")
    @js.native
    def getKey(o: js.Any): js.Any = js.native
    
    /** [Method] Returns a range of items in this collection
      * @param start Number The starting index.
      * @param end Number The ending index. Defaults to the last item.
      * @returns Array An array of items.
      */
    @JSGlobal("Ext.data.StoreMgr.getRange")
    @js.native
    def getRange(): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.getRange")
    @js.native
    def getRange(start: js.UndefOr[scala.Nothing], end: Double): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.getRange")
    @js.native
    def getRange(start: Double): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.getRange")
    @js.native
    def getRange(start: Double, end: Double): typings.senchaTouch.Ext.Array = js.native
    
    /** [Method] Returns an up to date sort function
      * @returns Function The sort function.
      */
    @JSGlobal("Ext.data.StoreMgr.getSortFn")
    @js.native
    def getSortFn(): js.Any = js.native
    
    /** [Method] Returns the value of sortRoot
      * @returns String
      */
    @JSGlobal("Ext.data.StoreMgr.getSortRoot")
    @js.native
    def getSortRoot(): java.lang.String = js.native
    
    /** [Method] Returns the value of sorters
      * @returns Array
      */
    @JSGlobal("Ext.data.StoreMgr.getSorters")
    @js.native
    def getSorters(): typings.senchaTouch.Ext.Array = js.native
    
    /** [Method] Returns index within the collection of the passed Object
      * @param item Object The item to find the index of.
      * @returns Number Index of the item. Returns -1 if not found.
      */
    @JSGlobal("Ext.data.StoreMgr.indexOf")
    @js.native
    def indexOf(): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.indexOf")
    @js.native
    def indexOf(item: js.Any): Double = js.native
    
    /** [Method] Returns index within the collection of the passed key
      * @param key String The key to find the index of.
      * @returns Number Index of the key.
      */
    @JSGlobal("Ext.data.StoreMgr.indexOfKey")
    @js.native
    def indexOfKey(): Double = js.native
    @JSGlobal("Ext.data.StoreMgr.indexOfKey")
    @js.native
    def indexOfKey(key: java.lang.String): Double = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.StoreMgr.indices")
    @js.native
    def indices: js.Any = js.native
    @scala.inline
    def indices_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indices")(x.asInstanceOf[js.Any])
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.data.StoreMgr.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] Inserts an item at the specified index in the collection
      * @param index Number The index to insert the item at.
      * @param key String The key to associate with the new item, or the item itself.
      * @param item Object If the second parameter was a key, the new item.
      * @returns Object The item inserted.
      */
    @JSGlobal("Ext.data.StoreMgr.insert")
    @js.native
    def insert(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.insert")
    @js.native
    def insert(index: js.UndefOr[scala.Nothing], key: js.UndefOr[scala.Nothing], item: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.insert")
    @js.native
    def insert(index: js.UndefOr[scala.Nothing], key: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.insert")
    @js.native
    def insert(index: js.UndefOr[scala.Nothing], key: java.lang.String, item: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.insert")
    @js.native
    def insert(index: Double): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.insert")
    @js.native
    def insert(index: Double, key: js.UndefOr[scala.Nothing], item: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.insert")
    @js.native
    def insert(index: Double, key: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.insert")
    @js.native
    def insert(index: Double, key: java.lang.String, item: js.Any): js.Any = js.native
    
    /** [Method] This method adds a filter at a given index
      * @param index Number The index at which to insert the filter.
      * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
      * @returns Object
      */
    @JSGlobal("Ext.data.StoreMgr.insertFilter")
    @js.native
    def insertFilter(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.insertFilter")
    @js.native
    def insertFilter(index: js.UndefOr[scala.Nothing], filter: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.insertFilter")
    @js.native
    def insertFilter(index: Double): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.insertFilter")
    @js.native
    def insertFilter(index: Double, filter: js.Any): js.Any = js.native
    
    /** [Method] This method inserts all the filters in the passed array at the given index
      * @param index Number The index at which to insert the filters.
      * @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
      * @returns Array
      */
    @JSGlobal("Ext.data.StoreMgr.insertFilters")
    @js.native
    def insertFilters(): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.insertFilters")
    @js.native
    def insertFilters(index: js.UndefOr[scala.Nothing], filters: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.insertFilters")
    @js.native
    def insertFilters(index: Double): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.insertFilters")
    @js.native
    def insertFilters(index: Double, filters: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
    
    /** [Method] This method adds a sorter at a given index
      * @param index Number The index at which to insert the sorter.
      * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
      */
    @JSGlobal("Ext.data.StoreMgr.insertSorter")
    @js.native
    def insertSorter(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.insertSorter")
    @js.native
    def insertSorter(
      index: js.UndefOr[scala.Nothing],
      sorter: js.UndefOr[scala.Nothing],
      defaultDirection: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.insertSorter")
    @js.native
    def insertSorter(index: js.UndefOr[scala.Nothing], sorter: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.insertSorter")
    @js.native
    def insertSorter(index: js.UndefOr[scala.Nothing], sorter: js.Any, defaultDirection: java.lang.String): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.insertSorter")
    @js.native
    def insertSorter(index: Double): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.insertSorter")
    @js.native
    def insertSorter(index: Double, sorter: js.UndefOr[scala.Nothing], defaultDirection: java.lang.String): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.insertSorter")
    @js.native
    def insertSorter(index: Double, sorter: js.Any): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.insertSorter")
    @js.native
    def insertSorter(index: Double, sorter: js.Any, defaultDirection: java.lang.String): Unit = js.native
    
    /** [Method] This method inserts all the sorters in the passed array at the given index
      * @returns Ext.util.Collection this
      */
    @JSGlobal("Ext.data.StoreMgr.insertSorters")
    @js.native
    def insertSorters(): ICollection = js.native
    
    /** [Property] (Array) */
    @JSGlobal("Ext.data.StoreMgr.items")
    @js.native
    def items: typings.senchaTouch.Ext.Array = js.native
    @scala.inline
    def items_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
    
    /** [Property] (Array) */
    @JSGlobal("Ext.data.StoreMgr.keys")
    @js.native
    def keys: typings.senchaTouch.Ext.Array = js.native
    @scala.inline
    def keys_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keys")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the last item in the collection
      * @returns Object the last item in the collection.
      */
    @JSGlobal("Ext.data.StoreMgr.last")
    @js.native
    def last(): js.Any = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.data.StoreMgr.length")
    @js.native
    def length: Double = js.native
    @scala.inline
    def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    /** [Method] Gets a registered Store by its id returns a passed store instance or returns a new instance of a store created with
      * @param store String/Object The id of the Store, or a Store instance, or a store configuration.
      * @returns Ext.data.Store
      */
    @JSGlobal("Ext.data.StoreMgr.lookup")
    @js.native
    def lookup(): IStore = js.native
    @JSGlobal("Ext.data.StoreMgr.lookup")
    @js.native
    def lookup(store: js.Any): IStore = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.StoreMgr.map")
    @js.native
    def map: js.Any = js.native
    @scala.inline
    def map_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
    
    /** [Method] Registers one or more Stores with the StoreManager
      * @param stores Ext.data.Store... Any number of Store instances.
      */
    @JSGlobal("Ext.data.StoreMgr.register")
    @js.native
    def register(stores: IStore): Unit = js.native
    
    /** [Method] Remove an item from the collection
      * @param item Object The item to remove.
      * @returns Object The item removed or false if no item was removed.
      */
    @JSGlobal("Ext.data.StoreMgr.remove")
    @js.native
    def remove(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.remove")
    @js.native
    def remove(item: js.Any): js.Any = js.native
    
    /** [Method] Remove all items in the passed array from the collection
      * @param items Array An array of items to be removed.
      * @returns Ext.util.MixedCollection this object
      */
    @JSGlobal("Ext.data.StoreMgr.removeAll")
    @js.native
    def removeAll(): IMixedCollection = js.native
    @JSGlobal("Ext.data.StoreMgr.removeAll")
    @js.native
    def removeAll(items: typings.senchaTouch.Ext.Array): IMixedCollection = js.native
    
    /** [Method] Remove an item from a specified index in the collection
      * @param index Number The index within the collection of the item to remove.
      * @returns Object The item removed or false if no item was removed.
      */
    @JSGlobal("Ext.data.StoreMgr.removeAt")
    @js.native
    def removeAt(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.removeAt")
    @js.native
    def removeAt(index: Double): js.Any = js.native
    
    /** [Method] Removed an item associated with the passed key from the collection
      * @param key String The key of the item to remove.
      * @returns Object/Boolean The item removed or false if no item was removed.
      */
    @JSGlobal("Ext.data.StoreMgr.removeAtKey")
    @js.native
    def removeAtKey(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.removeAtKey")
    @js.native
    def removeAtKey(key: java.lang.String): js.Any = js.native
    
    /** [Method] This method removes all the filters in a passed array
      * @param filters Object
      * @returns Ext.util.Collection this
      */
    @JSGlobal("Ext.data.StoreMgr.removeFilters")
    @js.native
    def removeFilters(): ICollection = js.native
    @JSGlobal("Ext.data.StoreMgr.removeFilters")
    @js.native
    def removeFilters(filters: js.Any): ICollection = js.native
    
    /** [Method] This method removes a sorter
      * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      */
    @JSGlobal("Ext.data.StoreMgr.removeSorter")
    @js.native
    def removeSorter(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.removeSorter")
    @js.native
    def removeSorter(sorter: js.Any): Unit = js.native
    
    /** [Method] This method removes all the sorters in a passed array
      * @param sorters Object
      * @returns Ext.util.Collection this
      */
    @JSGlobal("Ext.data.StoreMgr.removeSorters")
    @js.native
    def removeSorters(): ICollection = js.native
    @JSGlobal("Ext.data.StoreMgr.removeSorters")
    @js.native
    def removeSorters(sorters: js.Any): ICollection = js.native
    
    /** [Method] Replaces an item in the collection
      * @param oldKey String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
      * @param item Object {Object} item (optional) If the first parameter passed was a key, the item to associate with that key.
      * @returns Object The new item.
      */
    @JSGlobal("Ext.data.StoreMgr.replace")
    @js.native
    def replace(): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.replace")
    @js.native
    def replace(oldKey: js.UndefOr[scala.Nothing], item: js.Any): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.replace")
    @js.native
    def replace(oldKey: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.data.StoreMgr.replace")
    @js.native
    def replace(oldKey: java.lang.String, item: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.StoreMgr.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of autoFilter
      * @param autoFilter Boolean The new value.
      */
    @JSGlobal("Ext.data.StoreMgr.setAutoFilter")
    @js.native
    def setAutoFilter(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.setAutoFilter")
    @js.native
    def setAutoFilter(autoFilter: Boolean): Unit = js.native
    
    /** [Method] Sets the value of autoSort
      * @param autoSort Boolean The new value.
      */
    @JSGlobal("Ext.data.StoreMgr.setAutoSort")
    @js.native
    def setAutoSort(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.setAutoSort")
    @js.native
    def setAutoSort(autoSort: Boolean): Unit = js.native
    
    /** [Method] Sets the value of defaultSortDirection
      * @param defaultSortDirection String The new value.
      */
    @JSGlobal("Ext.data.StoreMgr.setDefaultSortDirection")
    @js.native
    def setDefaultSortDirection(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.setDefaultSortDirection")
    @js.native
    def setDefaultSortDirection(defaultSortDirection: java.lang.String): Unit = js.native
    
    /** [Method] Sets the value of filterRoot
      * @param filterRoot String The new value.
      */
    @JSGlobal("Ext.data.StoreMgr.setFilterRoot")
    @js.native
    def setFilterRoot(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.setFilterRoot")
    @js.native
    def setFilterRoot(filterRoot: java.lang.String): Unit = js.native
    
    /** [Method] Sets the value of filters
      * @param filters Array The new value.
      */
    @JSGlobal("Ext.data.StoreMgr.setFilters")
    @js.native
    def setFilters(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.setFilters")
    @js.native
    def setFilters(filters: typings.senchaTouch.Ext.Array): Unit = js.native
    
    /** [Method] Sets the value of sortRoot
      * @param sortRoot String The new value.
      */
    @JSGlobal("Ext.data.StoreMgr.setSortRoot")
    @js.native
    def setSortRoot(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.setSortRoot")
    @js.native
    def setSortRoot(sortRoot: java.lang.String): Unit = js.native
    
    /** [Method] Sets the value of sorters
      * @param sorters Array The new value.
      */
    @JSGlobal("Ext.data.StoreMgr.setSorters")
    @js.native
    def setSorters(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.setSorters")
    @js.native
    def setSorters(sorters: typings.senchaTouch.Ext.Array): Unit = js.native
    
    /** [Method] This method will sort an array based on the currently configured sorters
      * @param sorters Object
      * @param defaultDirection Object
      * @returns Array The array you passed after it is sorted.
      */
    @JSGlobal("Ext.data.StoreMgr.sort")
    @js.native
    def sort(): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.sort")
    @js.native
    def sort(sorters: js.UndefOr[scala.Nothing], defaultDirection: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.sort")
    @js.native
    def sort(sorters: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.data.StoreMgr.sort")
    @js.native
    def sort(sorters: js.Any, defaultDirection: js.Any): typings.senchaTouch.Ext.Array = js.native
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.data.StoreMgr.sorted")
    @js.native
    def sorted: Boolean = js.native
    @scala.inline
    def sorted_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sorted")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.data.StoreMgr.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Unregisters one or more Stores with the StoreManager
      * @param stores String/Object... Any number of Store instances or ID-s.
      */
    @JSGlobal("Ext.data.StoreMgr.unregister")
    @js.native
    def unregister(): Unit = js.native
    @JSGlobal("Ext.data.StoreMgr.unregister")
    @js.native
    def unregister(stores: js.Any): Unit = js.native
  }
  
  @JSGlobal("Ext.data.Types")
  @js.native
  class Types ()
    extends typings.senchaTouch.Ext.data.Types
  /* static members */
  object Types {
    
    @JSGlobal("Ext.data.Types")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.AUTO")
    @js.native
    def AUTO: js.Any = js.native
    @scala.inline
    def AUTO_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.BOOL")
    @js.native
    def BOOL: js.Any = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.BOOLEAN")
    @js.native
    def BOOLEAN: js.Any = js.native
    @scala.inline
    def BOOLEAN_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOLEAN")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def BOOL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOL")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.DATE")
    @js.native
    def DATE: js.Any = js.native
    @scala.inline
    def DATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATE")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.FLOAT")
    @js.native
    def FLOAT: js.Any = js.native
    @scala.inline
    def FLOAT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLOAT")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.INT")
    @js.native
    def INT: js.Any = js.native
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.INTEGER")
    @js.native
    def INTEGER: js.Any = js.native
    @scala.inline
    def INTEGER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTEGER")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def INT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INT")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.NUMBER")
    @js.native
    def NUMBER: js.Any = js.native
    @scala.inline
    def NUMBER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER")(x.asInstanceOf[js.Any])
    
    /** [Property] (Object) */
    @JSGlobal("Ext.data.Types.STRING")
    @js.native
    def STRING: js.Any = js.native
    @scala.inline
    def STRING_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.data.Types.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.data.Types.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.data.Types.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.data.Types.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.data.Types.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.data.Types.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.data.Types.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.data.Types.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.data.Types.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.data.Types.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.data.Types.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.Types.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.data.Types.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Property] (RegExp) */
    @JSGlobal("Ext.data.Types.stripRe")
    @js.native
    def stripRe: RegExp = js.native
    @scala.inline
    def stripRe_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripRe")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Ext.data.Validations")
  @js.native
  class Validations ()
    extends typings.senchaTouch.Ext.data.Validations
  /* static members */
  object Validations {
    
    @JSGlobal("Ext.data.Validations")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.data.Validations.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.data.Validations.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.data.Validations.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.data.Validations.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.data.Validations.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.data.Validations.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.data.Validations.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Validates that an email string is in the correct format
      * @param config Object Config object.
      * @param email String The email address.
      * @returns Boolean true if the value passes validation.
      */
    @JSGlobal("Ext.data.Validations.email")
    @js.native
    def email(): Boolean = js.native
    @JSGlobal("Ext.data.Validations.email")
    @js.native
    def email(config: js.UndefOr[scala.Nothing], email: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.data.Validations.email")
    @js.native
    def email(config: js.Any): Boolean = js.native
    @JSGlobal("Ext.data.Validations.email")
    @js.native
    def email(config: js.Any, email: java.lang.String): Boolean = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.emailMessage")
    @js.native
    def emailMessage: java.lang.String = js.native
    @scala.inline
    def emailMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emailMessage")(x.asInstanceOf[js.Any])
    
    /** [Property] (RegExp) */
    @JSGlobal("Ext.data.Validations.emailRe")
    @js.native
    def emailRe: RegExp = js.native
    @scala.inline
    def emailRe_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emailRe")(x.asInstanceOf[js.Any])
    
    /** [Method] Validates that the given value is present in the configured list
      * @param config Object Config object.
      * @param value String The value to validate.
      * @returns Boolean true if the value is not present in the list.
      */
    @JSGlobal("Ext.data.Validations.exclusion")
    @js.native
    def exclusion(): Boolean = js.native
    @JSGlobal("Ext.data.Validations.exclusion")
    @js.native
    def exclusion(config: js.UndefOr[scala.Nothing], value: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.data.Validations.exclusion")
    @js.native
    def exclusion(config: js.Any): Boolean = js.native
    @JSGlobal("Ext.data.Validations.exclusion")
    @js.native
    def exclusion(config: js.Any, value: java.lang.String): Boolean = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.exclusionMessage")
    @js.native
    def exclusionMessage: java.lang.String = js.native
    @scala.inline
    def exclusionMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exclusionMessage")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns true if the given value passes validation against the configured matcher regex
      * @param config Object Config object.
      * @param value String The value to validate.
      * @returns Boolean true if the value passes the format validation.
      */
    @JSGlobal("Ext.data.Validations.format")
    @js.native
    def format(): Boolean = js.native
    @JSGlobal("Ext.data.Validations.format")
    @js.native
    def format(config: js.UndefOr[scala.Nothing], value: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.data.Validations.format")
    @js.native
    def format(config: js.Any): Boolean = js.native
    @JSGlobal("Ext.data.Validations.format")
    @js.native
    def format(config: js.Any, value: java.lang.String): Boolean = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.formatMessage")
    @js.native
    def formatMessage: java.lang.String = js.native
    @scala.inline
    def formatMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatMessage")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.data.Validations.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.data.Validations.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Returns the configured error message for any of the validation types
      * @param type String The type of validation you want to get the error message for.
      * @returns Object
      */
    @JSGlobal("Ext.data.Validations.getMessage")
    @js.native
    def getMessage(): js.Any = js.native
    @JSGlobal("Ext.data.Validations.getMessage")
    @js.native
    def getMessage(`type`: java.lang.String): js.Any = js.native
    
    /** [Method] Validates that the given value is present in the configured list
      * @param config Object Config object.
      * @param value String The value to validate.
      * @returns Boolean true if the value is present in the list.
      */
    @JSGlobal("Ext.data.Validations.inclusion")
    @js.native
    def inclusion(): Boolean = js.native
    @JSGlobal("Ext.data.Validations.inclusion")
    @js.native
    def inclusion(config: js.UndefOr[scala.Nothing], value: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.data.Validations.inclusion")
    @js.native
    def inclusion(config: js.Any): Boolean = js.native
    @JSGlobal("Ext.data.Validations.inclusion")
    @js.native
    def inclusion(config: js.Any, value: java.lang.String): Boolean = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.inclusionMessage")
    @js.native
    def inclusionMessage: java.lang.String = js.native
    @scala.inline
    def inclusionMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inclusionMessage")(x.asInstanceOf[js.Any])
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.data.Validations.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.data.Validations.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] Returns true if the given value is between the configured min and max values
      * @param config Object Config object.
      * @param value String The value to validate.
      * @returns Boolean true if the value passes validation.
      */
    @JSGlobal("Ext.data.Validations.length")
    @js.native
    def length(): Boolean = js.native
    @JSGlobal("Ext.data.Validations.length")
    @js.native
    def length(config: js.UndefOr[scala.Nothing], value: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.data.Validations.length")
    @js.native
    def length(config: js.Any): Boolean = js.native
    @JSGlobal("Ext.data.Validations.length")
    @js.native
    def length(config: js.Any, value: java.lang.String): Boolean = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.lengthMessage")
    @js.native
    def lengthMessage: java.lang.String = js.native
    @scala.inline
    def lengthMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lengthMessage")(x.asInstanceOf[js.Any])
    
    /** [Method] Validates that the given value is present
      * @param config Object Config object.
      * @param value Object The value to validate.
      * @returns Boolean true if validation passed.
      */
    @JSGlobal("Ext.data.Validations.presence")
    @js.native
    def presence(): Boolean = js.native
    @JSGlobal("Ext.data.Validations.presence")
    @js.native
    def presence(config: js.UndefOr[scala.Nothing], value: js.Any): Boolean = js.native
    @JSGlobal("Ext.data.Validations.presence")
    @js.native
    def presence(config: js.Any): Boolean = js.native
    @JSGlobal("Ext.data.Validations.presence")
    @js.native
    def presence(config: js.Any, value: js.Any): Boolean = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.data.Validations.presenceMessage")
    @js.native
    def presenceMessage: java.lang.String = js.native
    @scala.inline
    def presenceMessage_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("presenceMessage")(x.asInstanceOf[js.Any])
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.data.Validations.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.data.Validations.statics")
    @js.native
    def statics(): IClass = js.native
  }
}
