package typings.reactDashIntl

import typings.react.reactMod.ComponentType
import typings.reactDashIntl.ReactIntlNs.InjectedIntlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WrappedComponent[P] extends js.Object {
  var WrappedComponent: ComponentType[P with InjectedIntlProps]
}

object Anon_WrappedComponent {
  @scala.inline
  def apply[P](WrappedComponent: ComponentType[P with InjectedIntlProps]): Anon_WrappedComponent[P] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_WrappedComponent[P]]
  }
}

