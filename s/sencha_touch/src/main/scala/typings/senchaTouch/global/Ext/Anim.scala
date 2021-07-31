package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Anim")
@js.native
class Anim ()
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
  def after: js.Any = js.native
  @scala.inline
  def after_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("after")(x.asInstanceOf[js.Any])
  
  /** [Config Option] (Boolean) */
  @JSGlobal("Ext.Anim.autoClear")
  @js.native
  def autoClear: Boolean = js.native
  @scala.inline
  def autoClear_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClear")(x.asInstanceOf[js.Any])
  
  /** [Config Option] (Function) */
  @JSGlobal("Ext.Anim.before")
  @js.native
  def before: js.Any = js.native
  @scala.inline
  def before_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("before")(x.asInstanceOf[js.Any])
  
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
  
  /** [Config Option] (Number) */
  @JSGlobal("Ext.Anim.delay")
  @js.native
  def delay: Double = js.native
  @scala.inline
  def delay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delay")(x.asInstanceOf[js.Any])
  
  /** [Method]  */
  @scala.inline
  def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  /** [Config Option] (String) */
  @JSGlobal("Ext.Anim.direction")
  @js.native
  def direction: java.lang.String = js.native
  @scala.inline
  def direction_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
  
  /** [Config Option] (Boolean) */
  @JSGlobal("Ext.Anim.disableAnimations")
  @js.native
  def disableAnimations: Boolean = js.native
  @scala.inline
  def disableAnimations_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableAnimations")(x.asInstanceOf[js.Any])
  
  /** [Config Option] (Number) */
  @JSGlobal("Ext.Anim.duration")
  @js.native
  def duration: Double = js.native
  @scala.inline
  def duration_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("duration")(x.asInstanceOf[js.Any])
  
  /** [Config Option] (String) */
  @JSGlobal("Ext.Anim.easing")
  @js.native
  def easing: java.lang.String = js.native
  @scala.inline
  def easing_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easing")(x.asInstanceOf[js.Any])
  
  /** [Config Option] (Object) */
  @JSGlobal("Ext.Anim.from")
  @js.native
  def from: js.Any = js.native
  @scala.inline
  def from_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("from")(x.asInstanceOf[js.Any])
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  @scala.inline
  def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
  @scala.inline
  def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Initialize configuration for this class
    * @param el Object
    * @param runConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  @scala.inline
  def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
  @scala.inline
  def initConfig(el: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(el.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def initConfig(el: js.Any, runConfig: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(el.asInstanceOf[js.Any], runConfig.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def initConfig(el: Unit, runConfig: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(el.asInstanceOf[js.Any], runConfig.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Config Option] (Boolean) */
  @JSGlobal("Ext.Anim.out")
  @js.native
  def out: Boolean = js.native
  @scala.inline
  def out_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("out")(x.asInstanceOf[js.Any])
  
  /** [Config Option] (Boolean) */
  @JSGlobal("Ext.Anim.reverse")
  @js.native
  def reverse: Boolean = js.native
  @scala.inline
  def reverse_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reverse")(x.asInstanceOf[js.Any])
  
  /** [Method] Used to run an animation on a specific element
    * @param el Ext.Element/HTMLElement The element to animate.
    * @param anim String The animation type, defined in Ext.anims.
    * @param config Object The config object for the animation.
    */
  @scala.inline
  def run(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[Unit]
  @scala.inline
  def run(el: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def run(el: js.Any, anim: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(el.asInstanceOf[js.Any], anim.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def run(el: js.Any, anim: java.lang.String, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(el.asInstanceOf[js.Any], anim.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def run(el: js.Any, anim: Unit, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(el.asInstanceOf[js.Any], anim.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def run(el: Unit, anim: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(el.asInstanceOf[js.Any], anim.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def run(el: Unit, anim: java.lang.String, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(el.asInstanceOf[js.Any], anim.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def run(el: Unit, anim: Unit, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(el.asInstanceOf[js.Any], anim.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Config Option] (Object) */
  @JSGlobal("Ext.Anim.scope")
  @js.native
  def scope: js.Any = js.native
  @scala.inline
  def scope_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.Anim.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @scala.inline
  def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  
  /** [Config Option] (Object) */
  @JSGlobal("Ext.Anim.to")
  @js.native
  def to: js.Any = js.native
  @scala.inline
  def to_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("to")(x.asInstanceOf[js.Any])
}
