package typings
package reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-animatable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Image: reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableMod.AnimatableComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ImageProperties */ js.Any, 
    reactDashNativeLib.reactDashNativeMod.ImageStyle
  ] = js.native
  val Text: reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableMod.AnimatableComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any, 
    reactDashNativeLib.reactDashNativeMod.TextStyle
  ] = js.native
  val View: reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableMod.AnimatableComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties */ js.Any, 
    reactDashNativeLib.reactDashNativeMod.ViewStyle
  ] = js.native
  def createAnimatableComponent[P /* <: reactDashNativeDashAnimatableLib.Anon_Style */, S](Component: reactLib.reactMod.ReactNs.ClassicComponentClass[P]): reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableMod.AnimatableComponent[P, S] = js.native
  def createAnimatableComponent[P /* <: reactDashNativeDashAnimatableLib.Anon_Style */, S](Component: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState]): reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableMod.AnimatableComponent[P, S] = js.native
  def createAnimatableComponent[P /* <: reactDashNativeDashAnimatableLib.Anon_Style */, S](Component: reactLib.reactMod.ReactNs.StatelessComponent[P]): reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableMod.AnimatableComponent[P, S] = js.native
  def createAnimation(
    animation: reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableMod.CustomAnimation[
      reactDashNativeLib.reactDashNativeMod.TextStyle with reactDashNativeLib.reactDashNativeMod.ViewStyle with reactDashNativeLib.reactDashNativeMod.ImageStyle
    ]
  ): js.Object = js.native
  def initializeRegistryWithDefinitions(
    animations: org.scalablytyped.runtime.StringDictionary[
      reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableMod.CustomAnimation[
        reactDashNativeLib.reactDashNativeMod.TextStyle with reactDashNativeLib.reactDashNativeMod.ViewStyle with reactDashNativeLib.reactDashNativeMod.ImageStyle
      ]
    ]
  ): scala.Unit = js.native
  def registerAnimation(
    name: java.lang.String,
    animation: reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableMod.CustomAnimation[
      reactDashNativeLib.reactDashNativeMod.TextStyle with reactDashNativeLib.reactDashNativeMod.ViewStyle with reactDashNativeLib.reactDashNativeMod.ImageStyle
    ]
  ): scala.Unit = js.native
}

