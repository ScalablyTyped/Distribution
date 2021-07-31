package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.IClassManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.ClassManager")
@js.native
class ClassManager ()
  extends StObject
     with typings.senchaTouch.Ext.ClassManager
/* static members */
object ClassManager {
  
  @JSGlobal("Ext.ClassManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Adds a batch of class name to alias mappings
    * @param aliases Object The set of mappings of the form className : [values...]
    * @returns Ext.ClassManager this
    */
  @scala.inline
  def addNameAliasMappings(): IClassManager = ^.asInstanceOf[js.Dynamic].applyDynamic("addNameAliasMappings")().asInstanceOf[IClassManager]
  @scala.inline
  def addNameAliasMappings(aliases: js.Any): IClassManager = ^.asInstanceOf[js.Dynamic].applyDynamic("addNameAliasMappings")(aliases.asInstanceOf[js.Any]).asInstanceOf[IClassManager]
  
  /** [Method]
    * @param alternates Object The set of mappings of the form className : [values...]
    * @returns Ext.ClassManager this
    */
  @scala.inline
  def addNameAlternateMappings(): IClassManager = ^.asInstanceOf[js.Dynamic].applyDynamic("addNameAlternateMappings")().asInstanceOf[IClassManager]
  @scala.inline
  def addNameAlternateMappings(alternates: js.Any): IClassManager = ^.asInstanceOf[js.Dynamic].applyDynamic("addNameAlternateMappings")(alternates.asInstanceOf[js.Any]).asInstanceOf[IClassManager]
  
  /** [Method] Retrieve a class by its name
    * @param name String
    * @returns Ext.Class class
    */
  @scala.inline
  def get(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[IClass]
  @scala.inline
  def get(name: java.lang.String): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[IClass]
  
  /** [Method] Get the aliases of a class by the class name
    * @param name String
    * @returns Array aliases
    */
  @scala.inline
  def getAliasesByName(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getAliasesByName")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def getAliasesByName(name: java.lang.String): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getAliasesByName")(name.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Get a reference to the class by its alias
    * @param alias String
    * @returns Ext.Class class
    */
  @scala.inline
  def getByAlias(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("getByAlias")().asInstanceOf[IClass]
  @scala.inline
  def getByAlias(alias: java.lang.String): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("getByAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[IClass]
  
  @scala.inline
  def getClass(`object`: js.Any): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("getClass")(`object`.asInstanceOf[js.Any]).asInstanceOf[IClass]
  
  /** [Method] Get the name of the class by its reference or its instance usually invoked by the shorthand Ext getClassName Ext Cl
    * @param object Ext.Class/Object
    * @returns String className
    */
  @scala.inline
  def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
  @scala.inline
  def getName(`object`: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(`object`.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Get the name of a class by its alias
    * @param alias String
    * @returns String className
    */
  @scala.inline
  def getNameByAlias(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameByAlias")().asInstanceOf[java.lang.String]
  @scala.inline
  def getNameByAlias(alias: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameByAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Get the name of a class by its alternate name
    * @param alternate String
    * @returns String className
    */
  @scala.inline
  def getNameByAlternate(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameByAlternate")().asInstanceOf[java.lang.String]
  @scala.inline
  def getNameByAlternate(alternate: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameByAlternate")(alternate.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Converts a string expression to an array of matching class names
    * @param expression String
    * @returns Array classNames
    */
  @scala.inline
  def getNamesByExpression(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamesByExpression")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def getNamesByExpression(expression: java.lang.String): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamesByExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Instantiate a class by either full name alias or alternate name usually invoked by the convenient shorthand Ext cre
    * @param name String
    * @param args Mixed Additional arguments after the name will be passed to the class' constructor.
    * @returns Object instance
    */
  @scala.inline
  def instantiate(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")().asInstanceOf[js.Any]
  @scala.inline
  def instantiate(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def instantiate(name: java.lang.String, args: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def instantiate(name: Unit, args: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Instantiate a class by its alias usually invoked by the convenient shorthand Ext createByAlias If Ext Loader is enab
    * @param alias String
    * @param args Mixed... Additional arguments after the alias will be passed to the class constructor.
    * @returns Object instance
    */
  @scala.inline
  def instantiateByAlias(alias: java.lang.String, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateByAlias")(alias.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Checks if a class has already been created
    * @param className String
    * @returns Boolean exist
    */
  @scala.inline
  def isCreated(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreated")().asInstanceOf[Boolean]
  @scala.inline
  def isCreated(className: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreated")(className.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Sets a name reference to a class
    * @param name String
    * @param value Object
    * @returns Ext.ClassManager this
    */
  @scala.inline
  def set(): IClassManager = ^.asInstanceOf[js.Dynamic].applyDynamic("set")().asInstanceOf[IClassManager]
  @scala.inline
  def set(name: java.lang.String): IClassManager = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(name.asInstanceOf[js.Any]).asInstanceOf[IClassManager]
  @scala.inline
  def set(name: java.lang.String, value: js.Any): IClassManager = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IClassManager]
  @scala.inline
  def set(name: Unit, value: js.Any): IClassManager = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IClassManager]
  
  /** [Method] Register the alias for a class
    * @param cls Ext.Class/String a reference to a class or a className.
    * @param alias String Alias to use when referring to this class.
    * @returns Ext.ClassManager this
    */
  @scala.inline
  def setAlias(): IClassManager = ^.asInstanceOf[js.Dynamic].applyDynamic("setAlias")().asInstanceOf[IClassManager]
  @scala.inline
  def setAlias(cls: js.Any): IClassManager = ^.asInstanceOf[js.Dynamic].applyDynamic("setAlias")(cls.asInstanceOf[js.Any]).asInstanceOf[IClassManager]
  @scala.inline
  def setAlias(cls: js.Any, alias: java.lang.String): IClassManager = (^.asInstanceOf[js.Dynamic].applyDynamic("setAlias")(cls.asInstanceOf[js.Any], alias.asInstanceOf[js.Any])).asInstanceOf[IClassManager]
  @scala.inline
  def setAlias(cls: Unit, alias: java.lang.String): IClassManager = (^.asInstanceOf[js.Dynamic].applyDynamic("setAlias")(cls.asInstanceOf[js.Any], alias.asInstanceOf[js.Any])).asInstanceOf[IClassManager]
  
  /** [Method] Creates a namespace and assign the value to the created object
    * @param name String
    * @param value Mixed
    */
  @scala.inline
  def setNamespace(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNamespace")().asInstanceOf[Unit]
  @scala.inline
  def setNamespace(name: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNamespace")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def setNamespace(name: java.lang.String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setNamespace")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setNamespace(name: Unit, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setNamespace")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
