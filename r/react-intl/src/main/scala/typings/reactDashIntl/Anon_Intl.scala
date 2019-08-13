package typings.reactDashIntl

import typings.react.reactMod.ComponentType
import typings.reactDashIntl.distComponentsInjectIntlMod.WrappedComponentProps
import typings.reactDashIntl.distTypesMod.CustomFormatConfig
import typings.reactDashIntl.reactDashIntlStrings.intl
import typings.std.IntlNs.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Intl extends js.Object {
  var WrappedComponent: ComponentType[
    DateTimeFormatOptions with CustomFormatConfig with WrappedComponentProps[intl] with Anon_Value
  ]
}

object Anon_Intl {
  @scala.inline
  def apply(
    WrappedComponent: ComponentType[
      DateTimeFormatOptions with CustomFormatConfig with WrappedComponentProps[intl] with Anon_Value
    ]
  ): Anon_Intl = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Intl]
  }
}

