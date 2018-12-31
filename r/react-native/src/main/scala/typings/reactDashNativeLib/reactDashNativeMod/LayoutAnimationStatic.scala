package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutAnimationStatic extends js.Object {
  var Presets: reactDashNativeLib.Anon_Spring = js.native
  var Properties: LayoutAnimationProperties = js.native
  var Types: LayoutAnimationTypes = js.native
  def configChecker(shapeTypes: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Any = js.native
  /** Schedules an animation to happen on the next layout.
    * @param config Specifies animation properties:
    * `duration` in milliseconds
    * `create`, config for animating in new views (see Anim type)
    * `update`, config for animating views that have been updated (see Anim type)
    * @param onAnimationDidEnd Called when the animation finished. Only supported on iOS.
    */
  def configureNext(config: LayoutAnimationConfig): scala.Unit = js.native
  def configureNext(config: LayoutAnimationConfig, onAnimationDidEnd: js.Function0[scala.Unit]): scala.Unit = js.native
  /** Helper for creating a config for configureNext. */
  def create(duration: scala.Double): LayoutAnimationConfig = js.native
  def create(duration: scala.Double, `type`: java.lang.String): LayoutAnimationConfig = js.native
  def create(duration: scala.Double, `type`: java.lang.String, creationProp: java.lang.String): LayoutAnimationConfig = js.native
  def easeInEaseOut(): scala.Unit = js.native
  def easeInEaseOut(onAnimationDidEnd: js.Function0[scala.Unit]): scala.Unit = js.native
  def linear(): scala.Unit = js.native
  def linear(onAnimationDidEnd: js.Function0[scala.Unit]): scala.Unit = js.native
  def spring(): scala.Unit = js.native
  def spring(onAnimationDidEnd: js.Function0[scala.Unit]): scala.Unit = js.native
}

