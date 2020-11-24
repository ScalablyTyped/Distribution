package typings.reactIntl.messageMod

import typings.react.mod.Component
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormattedMessage[V /* <: Record[String, _] */]
  extends Component[Props[V], js.Object, js.Any] {
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MFormattedMessage(nextProps: Props[V]): Boolean = js.native
}
