package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.IVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Browser")
@js.native
class Browser ()
  extends StObject
     with typings.senchaTouch.Ext.Browser
/* static members */
object Browser {
  
  @JSGlobal("Ext.Browser")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
  inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
  inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
  inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method]  */
  inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  /** [Property] (String) */
  @JSGlobal("Ext.Browser.engineName")
  @js.native
  def engineName: java.lang.String = js.native
  inline def engineName_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("engineName")(x.asInstanceOf[js.Any])
  
  /** [Property] (Ext.Version) */
  @JSGlobal("Ext.Browser.engineVersion")
  @js.native
  def engineVersion: IVersion = js.native
  inline def engineVersion_=(x: IVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(x.asInstanceOf[js.Any])
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
  inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  inline def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
  inline def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] A hybrid property can be either accessed as a method call for example  if Ext browser is IE
    * @param value String The OS name to check.
    * @returns Boolean
    */
  inline def is(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")().asInstanceOf[Boolean]
  inline def is(value: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.Browser.isSecure")
  @js.native
  def isSecure: Boolean = js.native
  inline def isSecure_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSecure")(x.asInstanceOf[js.Any])
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.Browser.isStrict")
  @js.native
  def isStrict: Boolean = js.native
  inline def isStrict_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isStrict")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.Browser.name")
  @js.native
  def name: java.lang.String = js.native
  inline def name_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.Browser.self")
  @js.native
  def self: IClass = js.native
  inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  
  /** [Property] (String) */
  @JSGlobal("Ext.Browser.userAgent")
  @js.native
  def userAgent: java.lang.String = js.native
  inline def userAgent_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(x.asInstanceOf[js.Any])
  
  /** [Property] (Ext.Version) */
  @JSGlobal("Ext.Browser.version")
  @js.native
  def version: IVersion = js.native
  inline def version_=(x: IVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
