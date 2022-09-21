package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Anim")
@js.native
open class Anim ()
  extends StObject
     with typings.senchaTouch.Ext.Anim
/* static members */
object Anim {
  
  @JSGlobal("Ext.Anim")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Config Option] (Function) */
  @JSGlobal("Ext.Anim.after")
  @js.native
  def after: Any = js.native
  inline def after_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("after")(x.asInstanceOf[js.Any])
  
  /** [Config Option] (Boolean) */
  @JSGlobal("Ext.Anim.autoClear")
  @js.native
  def autoClear: Boolean = js.native
  inline def autoClear_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClear")(x.asInstanceOf[js.Any])
  
  /** [Config Option] (Function) */
  @JSGlobal("Ext.Anim.before")
  @js.native
  def before: Any = js.native
  inline def before_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("before")(x.asInstanceOf[js.Any])
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
  inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
  inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
  inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Config Option] (Number) */
  @JSGlobal("Ext.Anim.delay")
  @js.native
  def delay: Double = js.native
  inline def delay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delay")(x.asInstanceOf[js.Any])
  
  /** [Method]  */
  inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  /** [Config Option] (String) */
  @JSGlobal("Ext.Anim.direction")
  @js.native
  def direction: java.lang.String = js.native
  inline def direction_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
  
  /** [Config Option] (Boolean) */
  @JSGlobal("Ext.Anim.disableAnimations")
  @js.native
  def disableAnimations: Boolean = js.native
  inline def disableAnimations_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableAnimations")(x.asInstanceOf[js.Any])
  
  /** [Config Option] (Number) */
  @JSGlobal("Ext.Anim.duration")
  @js.native
  def duration: Double = js.native
  inline def duration_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("duration")(x.asInstanceOf[js.Any])
  
  /** [Config Option] (String) */
  @JSGlobal("Ext.Anim.easing")
  @js.native
  def easing: java.lang.String = js.native
  inline def easing_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easing")(x.asInstanceOf[js.Any])
  
  /** [Config Option] (Object) */
  @JSGlobal("Ext.Anim.from")
  @js.native
  def from: Any = js.native
  inline def from_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("from")(x.asInstanceOf[js.Any])
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
  inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Initialize configuration for this class
    * @param el Object
    * @param runConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
  inline def initConfig(el: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(el.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def initConfig(el: Any, runConfig: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(el.asInstanceOf[js.Any], runConfig.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def initConfig(el: Unit, runConfig: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(el.asInstanceOf[js.Any], runConfig.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Config Option] (Boolean) */
  @JSGlobal("Ext.Anim.out")
  @js.native
  def out: Boolean = js.native
  inline def out_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("out")(x.asInstanceOf[js.Any])
  
  /** [Config Option] (Boolean) */
  @JSGlobal("Ext.Anim.reverse")
  @js.native
  def reverse: Boolean = js.native
  inline def reverse_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reverse")(x.asInstanceOf[js.Any])
  
  /** [Method] Used to run an animation on a specific element
    * @param el Ext.Element/HTMLElement The element to animate.
    * @param anim String The animation type, defined in Ext.anims.
    * @param config Object The config object for the animation.
    */
  inline def run(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[Unit]
  inline def run(el: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def run(el: Any, anim: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(el.asInstanceOf[js.Any], anim.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def run(el: Any, anim: java.lang.String, config: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(el.asInstanceOf[js.Any], anim.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def run(el: Any, anim: Unit, config: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(el.asInstanceOf[js.Any], anim.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def run(el: Unit, anim: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(el.asInstanceOf[js.Any], anim.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def run(el: Unit, anim: java.lang.String, config: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(el.asInstanceOf[js.Any], anim.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def run(el: Unit, anim: Unit, config: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(el.asInstanceOf[js.Any], anim.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Config Option] (Object) */
  @JSGlobal("Ext.Anim.scope")
  @js.native
  def scope: Any = js.native
  inline def scope_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.Anim.self")
  @js.native
  def self: IClass = js.native
  inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  
  /** [Config Option] (Object) */
  @JSGlobal("Ext.Anim.to")
  @js.native
  def to: Any = js.native
  inline def to_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("to")(x.asInstanceOf[js.Any])
}
