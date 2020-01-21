package typings.reactIntl

import typings.react.mod.ComponentType
import typings.reactIntl.pluralMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWrappedComponentComponentType extends js.Object {
  var WrappedComponent: ComponentType[Props]
}

object AnonWrappedComponentComponentType {
  @scala.inline
  def apply(WrappedComponent: ComponentType[Props]): AnonWrappedComponentComponentType = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWrappedComponentComponentType]
  }
}

