package typings.reactNativeModal

import typings.reactNativeModal.typesMod.Animations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-modal/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def buildAnimations(hasAnimationInAnimationOut: AnonAnimationInAnimationOut): Animations = js.native
  def initializeAnimations(): Unit = js.native
  def makeSlideTranslation(translationType: String, fromValue: Double, toValue: Double): AnonFrom = js.native
  def reversePercentage(x: Double): Double = js.native
}

