package typings.reactDashGa.reactDashGaMod

import org.scalablytyped.runtime.TopLevel
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.HTMLProps
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-ga", "OutboundLink")
@js.native
class OutboundLink protected ()
  extends Component[OutboundLinkProps with HTMLProps[HTMLAnchorElement], ComponentState, js.Any] {
  def this(props: OutboundLinkProps with HTMLProps[HTMLAnchorElement]) = this()
  def this(props: OutboundLinkProps with HTMLProps[HTMLAnchorElement], context: js.Any) = this()
}

@JSImport("react-ga", "OutboundLink")
@js.native
object OutboundLink extends TopLevel[
      ComponentClass[OutboundLinkProps with HTMLProps[HTMLAnchorElement], ComponentState]
    ]

@JSImport("react-ga", "outboundLink")
@js.native
object outboundLink extends js.Object {
  def apply(args: OutboundLinkArgs, hitCallback: js.Function0[Unit]): Unit = js.native
  def apply(args: OutboundLinkArgs, hitCallback: js.Function0[Unit], trackerNames: TrackerNames): Unit = js.native
}

