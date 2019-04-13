package typings
package reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-animatable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Image: AnimatableComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ImageProperties */ js.Any, 
    reactDashNativeLib.reactDashNativeMod.ImageStyle
  ] = js.native
  val Text: AnimatableComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any, 
    reactDashNativeLib.reactDashNativeMod.TextStyle
  ] = js.native
  val View: AnimatableComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties */ js.Any, 
    reactDashNativeLib.reactDashNativeMod.ViewStyle
  ] = js.native
  def createAnimatableComponent[P /* <: reactDashNativeDashAnimatableLib.Anon_Style */, S](Component: reactLib.reactMod.ClassicComponentClass[P]): AnimatableComponent[P, S] = js.native
  def createAnimatableComponent[P /* <: reactDashNativeDashAnimatableLib.Anon_Style */, S](Component: reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState]): AnimatableComponent[P, S] = js.native
  def createAnimatableComponent[P /* <: reactDashNativeDashAnimatableLib.Anon_Style */, S](Component: reactLib.reactMod.StatelessComponent[P]): AnimatableComponent[P, S] = js.native
  def createAnimation(
    animation: CustomAnimation[
      reactDashNativeLib.reactDashNativeMod.TextStyle with reactDashNativeLib.reactDashNativeMod.ViewStyle with reactDashNativeLib.reactDashNativeMod.ImageStyle
    ]
  ): js.Object = js.native
  def initializeRegistryWithDefinitions(
    animations: org.scalablytyped.runtime.StringDictionary[
      CustomAnimation[
        reactDashNativeLib.reactDashNativeMod.TextStyle with reactDashNativeLib.reactDashNativeMod.ViewStyle with reactDashNativeLib.reactDashNativeMod.ImageStyle
      ]
    ]
  ): scala.Unit = js.native
  def registerAnimation(
    name: java.lang.String,
    animation: CustomAnimation[
      reactDashNativeLib.reactDashNativeMod.TextStyle with reactDashNativeLib.reactDashNativeMod.ViewStyle with reactDashNativeLib.reactDashNativeMod.ImageStyle
    ]
  ): scala.Unit = js.native
}

