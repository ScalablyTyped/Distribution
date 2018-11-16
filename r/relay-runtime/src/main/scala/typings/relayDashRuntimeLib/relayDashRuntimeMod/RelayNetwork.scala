package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayNetwork extends js.Object {
  @JSName("execute")
  var execute_Original: ExecuteFunction = js.native
  def execute(operation: js.Object, variables: Variables, cacheConfig: CacheConfig): stdLib.Promise[_] = js.native
  def execute(operation: js.Object, variables: Variables, cacheConfig: CacheConfig, uploadables: UploadableMap): stdLib.Promise[_] = js.native
}

