package typings.reactDashIntl.distComponentsInjectIntlMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ProviderExoticComponent
import typings.react.reactMod.ProviderProps
import typings.reactDashIntl.Anon_WrappedComponentAny
import typings.reactDashIntl.distTypesMod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/dist/components/injectIntl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Context: typings.react.reactMod.Context[IntlShape] = js.native
  val Provider: ProviderExoticComponent[ProviderProps[IntlShape]] = js.native
  def default[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): ComponentType[WithIntlProps[P]] with Anon_WrappedComponentAny = js.native
  def default[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName]): ComponentType[WithIntlProps[P]] with Anon_WrappedComponentAny = js.native
}

