package typings.reactNativeModal

import typings.reactNativeModal.anon.AnimationOut
import typings.reactNativeModal.anon.From
import typings.reactNativeModal.typesMod.Animations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-native-modal/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def buildAnimations(hasAnimationInAnimationOut: AnimationOut): Animations = ^.asInstanceOf[js.Dynamic].applyDynamic("buildAnimations")(hasAnimationInAnimationOut.asInstanceOf[js.Any]).asInstanceOf[Animations]
  
  @scala.inline
  def initializeAnimations(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeAnimations")().asInstanceOf[Unit]
  
  @scala.inline
  def makeSlideTranslation(translationType: String, fromValue: Double, toValue: Double): From = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSlideTranslation")(translationType.asInstanceOf[js.Any], fromValue.asInstanceOf[js.Any], toValue.asInstanceOf[js.Any])).asInstanceOf[From]
  
  @scala.inline
  def reversePercentage(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("reversePercentage")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
}
