package typings.reactDashIntl.distComponentsInjectIntlMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.FC
import typings.react.reactMod.ForwardRefExoticComponent
import typings.react.reactMod.PropsWithoutRef
import typings.react.reactMod.ProviderExoticComponent
import typings.react.reactMod.ProviderProps
import typings.react.reactMod.RefAttributes
import typings.reactDashIntl.Anon_WrappedComponent
import typings.reactDashIntl.distTypesMod.IntlShape
import typings.reactDashIntl.reactDashIntlNumbers.`false`
import typings.reactDashIntl.reactDashIntlNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/dist/components/injectIntl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Context: typings.react.reactMod.Context[IntlShape] = js.native
  val Provider: ProviderExoticComponent[ProviderProps[IntlShape]] = js.native
  def default[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): FC[WithIntlProps[P]] with Anon_WrappedComponent = js.native
  @JSName("default")
  def default_IntlPropName_StringP_WrappedComponentPropsIntlPropNameT_ComponentTypeP[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with Anon_WrappedComponent = js.native
  @JSName("default")
  def default_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `false`]): FC[WithIntlProps[P]] with Anon_WrappedComponent = js.native
  @JSName("default")
  def default_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with Anon_WrappedComponent = js.native
}

