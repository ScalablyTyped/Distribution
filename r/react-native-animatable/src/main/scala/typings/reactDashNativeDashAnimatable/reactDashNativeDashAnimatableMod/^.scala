package typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ClassicComponentClass
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.StatelessComponent
import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashAnimatable.Anon_Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-animatable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Image: AnimatableComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ImageProperties */ js.Any, 
    ImageStyle
  ] = js.native
  val Text: AnimatableComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any, 
    TextStyle
  ] = js.native
  val View: AnimatableComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties */ js.Any, 
    ViewStyle
  ] = js.native
  def createAnimatableComponent[P /* <: Anon_Style */, S](Component: ClassicComponentClass[P]): AnimatableComponent[P, S] = js.native
  def createAnimatableComponent[P /* <: Anon_Style */, S](Component: ComponentClass[P, ComponentState]): AnimatableComponent[P, S] = js.native
  def createAnimatableComponent[P /* <: Anon_Style */, S](Component: StatelessComponent[P]): AnimatableComponent[P, S] = js.native
  def createAnimation(animation: CustomAnimation[TextStyle with ViewStyle with ImageStyle]): js.Object = js.native
  def initializeRegistryWithDefinitions(animations: StringDictionary[CustomAnimation[TextStyle with ViewStyle with ImageStyle]]): Unit = js.native
  def registerAnimation(name: String, animation: CustomAnimation[TextStyle with ViewStyle with ImageStyle]): Unit = js.native
}

