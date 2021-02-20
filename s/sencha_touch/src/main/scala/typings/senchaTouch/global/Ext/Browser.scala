package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.IVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Browser")
@js.native
class Browser ()
  extends typings.senchaTouch.Ext.Browser
/* static members */
object Browser {
  
  @JSGlobal("Ext.Browser")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @JSGlobal("Ext.Browser.callOverridden")
  @js.native
  def callOverridden(): js.Any = js.native
  @JSGlobal("Ext.Browser.callOverridden")
  @js.native
  def callOverridden(args: js.Any): js.Any = js.native
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @JSGlobal("Ext.Browser.callParent")
  @js.native
  def callParent(): js.Any = js.native
  @JSGlobal("Ext.Browser.callParent")
  @js.native
  def callParent(args: js.Any): js.Any = js.native
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @JSGlobal("Ext.Browser.callSuper")
  @js.native
  def callSuper(): js.Any = js.native
  @JSGlobal("Ext.Browser.callSuper")
  @js.native
  def callSuper(args: js.Any): js.Any = js.native
  
  /** [Method]  */
  @JSGlobal("Ext.Browser.destroy")
  @js.native
  def destroy(): Unit = js.native
  
  /** [Property] (String) */
  @JSGlobal("Ext.Browser.engineName")
  @js.native
  def engineName: java.lang.String = js.native
  @scala.inline
  def engineName_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("engineName")(x.asInstanceOf[js.Any])
  
  /** [Property] (Ext.Version) */
  @JSGlobal("Ext.Browser.engineVersion")
  @js.native
  def engineVersion: IVersion = js.native
  @scala.inline
  def engineVersion_=(x: IVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(x.asInstanceOf[js.Any])
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  @JSGlobal("Ext.Browser.getInitialConfig")
  @js.native
  def getInitialConfig(): js.Any = js.native
  @JSGlobal("Ext.Browser.getInitialConfig")
  @js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  @JSGlobal("Ext.Browser.initConfig")
  @js.native
  def initConfig(): js.Any = js.native
  @JSGlobal("Ext.Browser.initConfig")
  @js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  
  /** [Method] A hybrid property can be either accessed as a method call for example  if Ext browser is IE
    * @param value String The OS name to check.
    * @returns Boolean
    */
  @JSGlobal("Ext.Browser.is")
  @js.native
  def is(): Boolean = js.native
  @JSGlobal("Ext.Browser.is")
  @js.native
  def is(value: java.lang.String): Boolean = js.native
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.Browser.isSecure")
  @js.native
  def isSecure: Boolean = js.native
  @scala.inline
  def isSecure_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSecure")(x.asInstanceOf[js.Any])
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.Browser.isStrict")
  @js.native
  def isStrict: Boolean = js.native
  @scala.inline
  def isStrict_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isStrict")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.Browser.name")
  @js.native
  def name: java.lang.String = js.native
  @scala.inline
  def name_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.Browser.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @JSGlobal("Ext.Browser.statics")
  @js.native
  def statics(): IClass = js.native
  
  /** [Property] (String) */
  @JSGlobal("Ext.Browser.userAgent")
  @js.native
  def userAgent: java.lang.String = js.native
  @scala.inline
  def userAgent_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(x.asInstanceOf[js.Any])
  
  /** [Property] (Ext.Version) */
  @JSGlobal("Ext.Browser.version")
  @js.native
  def version: IVersion = js.native
  @scala.inline
  def version_=(x: IVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
