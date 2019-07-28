package typings.senchaUnderscoreTouch.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.Anim")
@js.native
class Anim () extends js.Object

/* static members */
@JSGlobal("Ext.Anim")
@js.native
object Anim extends js.Object {
  /** [Config Option] (Function) */
  var after: js.Any = js.native
  /** [Config Option] (Boolean) */
  var autoClear: Boolean = js.native
  /** [Config Option] (Function) */
  var before: js.Any = js.native
  /** [Config Option] (Number) */
  var delay: Double = js.native
  /** [Config Option] (String) */
  var direction: java.lang.String = js.native
  /** [Config Option] (Boolean) */
  var disableAnimations: Boolean = js.native
  /** [Config Option] (Number) */
  var duration: Double = js.native
  /** [Config Option] (String) */
  var easing: java.lang.String = js.native
  /** [Config Option] (Object) */
  var from: js.Any = js.native
  /** [Config Option] (Boolean) */
  var out: Boolean = js.native
  /** [Config Option] (Boolean) */
  var reverse: Boolean = js.native
  /** [Config Option] (Object) */
  var scope: js.Any = js.native
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  /** [Config Option] (Object) */
  var to: js.Any = js.native
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(): js.Any = js.native
  def callOverridden(args: js.Any): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(): js.Any = js.native
  def callParent(args: js.Any): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(): js.Any = js.native
  def callSuper(args: js.Any): js.Any = js.native
  /** [Method]  */
  def destroy(): Unit = js.native
  /** [Method] Returns the initial configuration passed to constructor
  		* @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
  		* @returns Object/Mixed
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Initialize configuration for this class
  		* @param el Object
  		* @param runConfig Object
  		* @returns Object mixins The mixin prototypes as key - value pairs
  		*/
  def initConfig(): js.Any = js.native
  def initConfig(el: js.Any): js.Any = js.native
  def initConfig(el: js.Any, runConfig: js.Any): js.Any = js.native
  /** [Method] Used to run an animation on a specific element
  		* @param el Ext.Element/HTMLElement The element to animate.
  		* @param anim String The animation type, defined in Ext.anims.
  		* @param config Object The config object for the animation.
  		*/
  def run(): Unit = js.native
  def run(el: js.Any): Unit = js.native
  def run(el: js.Any, anim: java.lang.String): Unit = js.native
  def run(el: js.Any, anim: java.lang.String, config: js.Any): Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): IClass = js.native
}

