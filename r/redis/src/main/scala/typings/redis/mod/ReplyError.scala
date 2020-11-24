package typings.redis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redis", "ReplyError")
@js.native
class ReplyError () extends RedisError {
  
  var args: js.UndefOr[js.Array[_]] = js.native
  
  var code: String = js.native
  
  var command: String = js.native
}
