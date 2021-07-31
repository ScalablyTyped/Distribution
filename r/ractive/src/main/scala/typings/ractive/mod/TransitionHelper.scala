package typings.ractive.mod

import typings.ractive.ractiveStrings.fast
import typings.ractive.ractiveStrings.slow
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionHelper extends StObject {
  
  /**
  	 * Animate the given map of properties.
  	 * @param map a map of prop -> value to animate
  	 * @param opts a map of options, including duration to use when animating
  	 * @param complete an optional callback to call when the animation is complete
  	 * @returns a Promise that resolves when the animation is complete
  	 */
  def animateStyle(map: ValueMap, opts: typings.ractive.anon.TransitionOpts): js.Promise[Unit] = js.native
  def animateStyle(map: ValueMap, opts: typings.ractive.anon.TransitionOpts, complete: js.Function0[Unit]): js.Promise[Unit] = js.native
  /**
  	 * Animate the given property to the given value.
  	 * @param prop the css property to animate
  	 * @param value the value to which to animate the prop
  	 * @param opts a map of options, including duration to use when animating
  	 * @param complete an optional callback to call when the animation is complete
  	 * @returns a Promise that resolves when the animation is complete
  	 */
  def animateStyle(prop: String, value: js.Any, opts: typings.ractive.anon.TransitionOpts): js.Promise[Unit] = js.native
  def animateStyle(
    prop: String,
    value: js.Any,
    opts: typings.ractive.anon.TransitionOpts,
    complete: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  
  /**
  	 * The function to call when the transition is complete. This is used to control the Promises returned by mutation methods.j
  	 * @param noReset whether or not to skip resetting the styles back to their starting points - defaults to false
  	 */
  def complete(): Unit = js.native
  def complete(noReset: Boolean): Unit = js.native
  
  /**
  	 * Use getComputedStyle to retrieve the current value of the given prop.
  	 */
  def getStyle(prop: String): js.Any = js.native
  /**
  	 * Use getComputedStyle to retrieve the current values of multiple props.
  	 */
  def getStyle(props: js.Array[String]): ValueMap = js.native
  
  /** true if this transition is an intro */
  var isIntro: Boolean = js.native
  
  /** true if this transition is an outro */
  var isOutro: Boolean = js.native
  
  /** The name of the transition e.g. foo in foo-in-out. */
  var name: String = js.native
  
  /** The node to which the transition is being applied. */
  var node: HTMLElement = js.native
  
  def processParams(params: String): ValueMap = js.native
  def processParams(params: String, defaults: ValueMap): ValueMap = js.native
  /**
  	 * Merge the given params into a map, adding any defaults to the resulting object.
  	 * @param params
  	 * 	if a number, the duration in milliseconds
  	 *  if slow, 600ms
  	 *  if fast, 200ms
  	 *  if any other string, 400ms
  	 *  if a map, it is applied over defaultsj
  	 */
  def processParams(params: Double): ValueMap = js.native
  def processParams(params: Double, defaults: ValueMap): ValueMap = js.native
  def processParams(params: ValueMap): ValueMap = js.native
  def processParams(params: ValueMap, defaults: ValueMap): ValueMap = js.native
  @JSName("processParams")
  def processParams_fast(params: fast): ValueMap = js.native
  @JSName("processParams")
  def processParams_fast(params: fast, defaults: ValueMap): ValueMap = js.native
  @JSName("processParams")
  def processParams_slow(params: slow): ValueMap = js.native
  @JSName("processParams")
  def processParams_slow(params: slow, defaults: ValueMap): ValueMap = js.native
  
  /** Set inline styles for the given map of prop -> value. */
  def setStyle(map: ValueMap): Unit = js.native
  /**
  	 * Set an inline style for the given prop at the given value.
  	 */
  def setStyle(prop: String, value: js.Any): Unit = js.native
}
