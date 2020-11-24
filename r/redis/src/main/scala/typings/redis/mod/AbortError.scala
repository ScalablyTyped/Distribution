package typings.redis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redis", "AbortError")
@js.native
class AbortError () extends RedisError {
  
  var args: js.UndefOr[js.Array[_]] = js.native
  
  var code: js.UndefOr[String] = js.native
  
  var command: String = js.native
}
