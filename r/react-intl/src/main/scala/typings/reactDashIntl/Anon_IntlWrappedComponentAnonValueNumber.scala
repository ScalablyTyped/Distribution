package typings.reactDashIntl

import typings.react.reactMod.ComponentType
import typings.reactDashIntl.distComponentsInjectIntlMod.WrappedComponentProps
import typings.reactDashIntl.distTypesMod.CustomFormatConfig
import typings.reactDashIntl.reactDashIntlStrings.intl
import typings.std.IntlNs.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IntlWrappedComponentAnonValueNumber extends js.Object {
  var WrappedComponent: ComponentType[
    NumberFormatOptions with CustomFormatConfig with WrappedComponentProps[intl] with Anon_ValueNumber
  ]
}

object Anon_IntlWrappedComponentAnonValueNumber {
  @scala.inline
  def apply(
    WrappedComponent: ComponentType[
      NumberFormatOptions with CustomFormatConfig with WrappedComponentProps[intl] with Anon_ValueNumber
    ]
  ): Anon_IntlWrappedComponentAnonValueNumber = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IntlWrappedComponentAnonValueNumber]
  }
}

