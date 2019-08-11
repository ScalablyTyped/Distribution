package typings.reactDashIntl

import typings.intlDashMessageformat.libFormattersMod.PrimitiveType
import typings.react.reactMod.ComponentType
import typings.reactDashIntl.distComponentsMessageMod.Props
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WrappedComponent extends js.Object {
  var WrappedComponent: ComponentType[Props[Record[String, PrimitiveType]]]
}

object Anon_WrappedComponent {
  @scala.inline
  def apply(WrappedComponent: ComponentType[Props[Record[String, PrimitiveType]]]): Anon_WrappedComponent = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_WrappedComponent]
  }
}

