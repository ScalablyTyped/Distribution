package typings.reactRelay.mod

import typings.react.mod.Component
import typings.reactRelay.AnonCacheConfig
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "QueryRenderer")
@js.native
class QueryRenderer[TOperation /* <: OperationType */] ()
  extends Component[AnonCacheConfig with QueryRendererProps[TOperation], js.Object, js.Any]

