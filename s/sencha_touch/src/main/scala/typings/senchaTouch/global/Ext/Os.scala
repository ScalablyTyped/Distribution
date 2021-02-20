package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.IVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Os")
@js.native
class Os ()
  extends typings.senchaTouch.Ext.Os
/* static members */
object Os {
  
  @JSGlobal("Ext.Os")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @JSGlobal("Ext.Os.callOverridden")
  @js.native
  def callOverridden(): js.Any = js.native
  @JSGlobal("Ext.Os.callOverridden")
  @js.native
  def callOverridden(args: js.Any): js.Any = js.native
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @JSGlobal("Ext.Os.callParent")
  @js.native
  def callParent(): js.Any = js.native
  @JSGlobal("Ext.Os.callParent")
  @js.native
  def callParent(args: js.Any): js.Any = js.native
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @JSGlobal("Ext.Os.callSuper")
  @js.native
  def callSuper(): js.Any = js.native
  @JSGlobal("Ext.Os.callSuper")
  @js.native
  def callSuper(args: js.Any): js.Any = js.native
  
  /** [Method]  */
  @JSGlobal("Ext.Os.destroy")
  @js.native
  def destroy(): Unit = js.native
  
  /** [Property] (String) */
  @JSGlobal("Ext.Os.deviceType")
  @js.native
  def deviceType: java.lang.String = js.native
  @scala.inline
  def deviceType_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deviceType")(x.asInstanceOf[js.Any])
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  @JSGlobal("Ext.Os.getInitialConfig")
  @js.native
  def getInitialConfig(): js.Any = js.native
  @JSGlobal("Ext.Os.getInitialConfig")
  @js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  @JSGlobal("Ext.Os.initConfig")
  @js.native
  def initConfig(): js.Any = js.native
  @JSGlobal("Ext.Os.initConfig")
  @js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  
  /** [Method] A hybrid property can be either accessed as a method call i e  if Ext os is Android
    * @param value String The OS name to check.
    * @returns Boolean
    */
  @JSGlobal("Ext.Os.is")
  @js.native
  def is(): Boolean = js.native
  @JSGlobal("Ext.Os.is")
  @js.native
  def is(value: java.lang.String): Boolean = js.native
  
  /** [Property] (String) */
  @JSGlobal("Ext.Os.name")
  @js.native
  def name: java.lang.String = js.native
  @scala.inline
  def name_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.Os.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @JSGlobal("Ext.Os.statics")
  @js.native
  def statics(): IClass = js.native
  
  /** [Property] (Ext.Version) */
  @JSGlobal("Ext.Os.version")
  @js.native
  def version: IVersion = js.native
  @scala.inline
  def version_=(x: IVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
