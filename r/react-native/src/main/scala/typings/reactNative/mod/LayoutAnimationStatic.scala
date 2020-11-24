package typings.reactNative.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.anon.EaseInEaseOut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutAnimationStatic extends js.Object {
  
  var Presets: EaseInEaseOut = js.native
  
  var Properties: LayoutAnimationProperties = js.native
  
  var Types: LayoutAnimationTypes = js.native
  
  def configChecker(shapeTypes: StringDictionary[js.Any]): js.Any = js.native
  
  /** Schedules an animation to happen on the next layout.
    * @param config Specifies animation properties:
    * `duration` in milliseconds
    * `create`, config for animating in new views (see Anim type)
    * `update`, config for animating views that have been updated (see Anim type)
    * @param onAnimationDidEnd Called when the animation finished. Only supported on iOS.
    */
  def configureNext(config: LayoutAnimationConfig): Unit = js.native
  def configureNext(config: LayoutAnimationConfig, onAnimationDidEnd: js.Function0[Unit]): Unit = js.native
  
  /** Helper for creating a config for configureNext. */
  def create(duration: Double): LayoutAnimationConfig = js.native
  def create(duration: Double, `type`: js.UndefOr[scala.Nothing], creationProp: String): LayoutAnimationConfig = js.native
  def create(duration: Double, `type`: String): LayoutAnimationConfig = js.native
  def create(duration: Double, `type`: String, creationProp: String): LayoutAnimationConfig = js.native
  
  def easeInEaseOut(): Unit = js.native
  def easeInEaseOut(onAnimationDidEnd: js.Function0[Unit]): Unit = js.native
  
  def linear(): Unit = js.native
  def linear(onAnimationDidEnd: js.Function0[Unit]): Unit = js.native
  
  def spring(): Unit = js.native
  def spring(onAnimationDidEnd: js.Function0[Unit]): Unit = js.native
}
