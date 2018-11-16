package typings
package reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-animatable", JSImport.Namespace)
@js.native
object reactDashNativeDashAnimatableModMembers extends js.Object {
  val Image: AnimatableComponent[
    reactDashNativeLib.reactDashNativeMod.ImageProperties, 
    reactDashNativeLib.reactDashNativeMod.ImageStyle
  ] = js.native
  val Text: AnimatableComponent[
    reactDashNativeLib.reactDashNativeMod.TextProperties, 
    reactDashNativeLib.reactDashNativeMod.TextStyle
  ] = js.native
  val View: AnimatableComponent[
    reactDashNativeLib.reactDashNativeMod.ViewProperties, 
    reactDashNativeLib.reactDashNativeMod.ViewStyle
  ] = js.native
  def createAnimatableComponent[P /* <: reactDashNativeDashAnimatableLib.Anon_Style */, S](Component: reactLib.reactMod.ReactNs.ClassicComponentClass[P]): AnimatableComponent[P, S] = js.native
  def createAnimatableComponent[P /* <: reactDashNativeDashAnimatableLib.Anon_Style */, S](Component: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState]): AnimatableComponent[P, S] = js.native
  def createAnimatableComponent[P /* <: reactDashNativeDashAnimatableLib.Anon_Style */, S](Component: reactLib.reactMod.ReactNs.StatelessComponent[P]): AnimatableComponent[P, S] = js.native
  def createAnimation(
    animation: CustomAnimation[
      reactDashNativeLib.reactDashNativeMod.TextStyle with reactDashNativeLib.reactDashNativeMod.ViewStyle with reactDashNativeLib.reactDashNativeMod.ImageStyle
    ]
  ): js.Object = js.native
  def initializeRegistryWithDefinitions(
    animations: ScalablyTyped.runtime.StringDictionary[
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

