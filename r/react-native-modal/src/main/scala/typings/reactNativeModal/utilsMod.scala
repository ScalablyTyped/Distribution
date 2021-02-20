package typings.reactNativeModal

import typings.reactNativeModal.anon.AnimationOut
import typings.reactNativeModal.anon.From
import typings.reactNativeModal.typesMod.Animations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-native-modal/dist/utils", "buildAnimations")
  @js.native
  def buildAnimations(hasAnimationInAnimationOut: AnimationOut): Animations = js.native
  
  @JSImport("react-native-modal/dist/utils", "initializeAnimations")
  @js.native
  def initializeAnimations(): Unit = js.native
  
  @JSImport("react-native-modal/dist/utils", "makeSlideTranslation")
  @js.native
  def makeSlideTranslation(translationType: String, fromValue: Double, toValue: Double): From = js.native
  
  @JSImport("react-native-modal/dist/utils", "reversePercentage")
  @js.native
  def reversePercentage(x: Double): Double = js.native
}
