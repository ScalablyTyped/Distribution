package typings.reactRelay.mod

import typings.react.mod.Component
import typings.reactRelay.anon.CacheConfig
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-relay", "QueryRenderer")
@js.native
class QueryRenderer[TOperation /* <: OperationType */] ()
  extends Component[CacheConfig with QueryRendererProps[TOperation], js.Object, js.Any]
