package typings.reactSpringAnimated.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactSpringAnimated.anon.AnimatedWithAnimated
import typings.reactSpringAnimated.anon.PartialHostConfigApplyAnimatedValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-spring/animated", "createHost")
@js.native
object createHost extends js.Object {
  
  def apply(components: js.Array[AnimatableComponent]): AnimatedWithAnimated = js.native
  def apply(
    components: js.Array[AnimatableComponent],
    hasApplyAnimatedValuesCreateAnimatedStyleGetComponentProps: PartialHostConfigApplyAnimatedValues
  ): AnimatedWithAnimated = js.native
  def apply(components: StringDictionary[AnimatableComponent]): AnimatedWithAnimated = js.native
  def apply(
    components: StringDictionary[AnimatableComponent],
    hasApplyAnimatedValuesCreateAnimatedStyleGetComponentProps: PartialHostConfigApplyAnimatedValues
  ): AnimatedWithAnimated = js.native
}
