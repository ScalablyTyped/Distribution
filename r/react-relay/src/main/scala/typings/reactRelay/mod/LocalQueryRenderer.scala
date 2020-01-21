package typings.reactRelay.mod

import typings.react.mod.Component
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "LocalQueryRenderer")
@js.native
class LocalQueryRenderer[TOperation /* <: OperationType */] ()
  extends Component[QueryRendererProps[TOperation], js.Object, js.Any]

