package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Feature")
@js.native
class Feature ()
  extends typings.senchaTouch.Ext.Feature
/* static members */
object Feature {
  
  @JSGlobal("Ext.Feature")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @JSGlobal("Ext.Feature.callOverridden")
  @js.native
  def callOverridden(): js.Any = js.native
  @JSGlobal("Ext.Feature.callOverridden")
  @js.native
  def callOverridden(args: js.Any): js.Any = js.native
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @JSGlobal("Ext.Feature.callParent")
  @js.native
  def callParent(): js.Any = js.native
  @JSGlobal("Ext.Feature.callParent")
  @js.native
  def callParent(args: js.Any): js.Any = js.native
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @JSGlobal("Ext.Feature.callSuper")
  @js.native
  def callSuper(): js.Any = js.native
  @JSGlobal("Ext.Feature.callSuper")
  @js.native
  def callSuper(args: js.Any): js.Any = js.native
  
  /** [Method]  */
  @JSGlobal("Ext.Feature.destroy")
  @js.native
  def destroy(): Unit = js.native
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  @JSGlobal("Ext.Feature.getInitialConfig")
  @js.native
  def getInitialConfig(): js.Any = js.native
  @JSGlobal("Ext.Feature.getInitialConfig")
  @js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  
  /** [Method] Verifies if a browser feature exists or not on the current device
    * @param value String The feature name to check.
    * @returns Boolean
    */
  @JSGlobal("Ext.Feature.has")
  @js.native
  def has(): Boolean = js.native
  @JSGlobal("Ext.Feature.has")
  @js.native
  def has(value: java.lang.String): Boolean = js.native
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  @JSGlobal("Ext.Feature.initConfig")
  @js.native
  def initConfig(): js.Any = js.native
  @JSGlobal("Ext.Feature.initConfig")
  @js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.Feature.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @JSGlobal("Ext.Feature.statics")
  @js.native
  def statics(): IClass = js.native
}
