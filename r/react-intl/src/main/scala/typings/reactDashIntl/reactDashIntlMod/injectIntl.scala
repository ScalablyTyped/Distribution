package typings.reactDashIntl.reactDashIntlMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.FC
import typings.reactDashIntl.Anon_WrappedComponentComponentTypeP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl", "injectIntl")
@js.native
object injectIntl extends js.Object {
  def apply[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): FC[WithIntlProps[P]] with Anon_WrappedComponentComponentTypeP[P] = js.native
}

