package typings.reactIntl.mod

import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.reactIntl.AnonWrappedComponentComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl", "injectIntl")
@js.native
object injectIntl extends js.Object {
  def apply[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): FC[WithIntlProps[P]] with AnonWrappedComponentComponentType[P] = js.native
}

