package typings.reactDashRedux

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WrappedComponent[C /* <: ComponentType[_] */] extends js.Object {
  var WrappedComponent: C
}

object Anon_WrappedComponent {
  @scala.inline
  def apply[C /* <: ComponentType[_] */](WrappedComponent: C): Anon_WrappedComponent[C] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_WrappedComponent[C]]
  }
}

