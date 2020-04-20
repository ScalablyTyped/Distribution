package typings.reactIntl.injectIntlMod

import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactIntl.AnonWrappedComponentComponentType
import typings.reactIntl.reactIntlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/components/injectIntl", JSImport.Default)
@js.native
object default_true extends js.Object {
  def apply[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with (AnonWrappedComponentComponentType[P, IntlPropName]) = js.native
}

