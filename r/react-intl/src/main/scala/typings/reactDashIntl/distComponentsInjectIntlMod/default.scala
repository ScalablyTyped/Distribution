package typings.reactDashIntl.distComponentsInjectIntlMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.FC
import typings.reactDashIntl.Anon_WrappedComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/dist/components/injectIntl", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): FC[WithIntlProps[P]] with Anon_WrappedComponent[P] = js.native
}

