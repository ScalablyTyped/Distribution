package typings
package rsmqLib.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var client: js.UndefOr[redisLib.redisMod.RedisClient] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var ns: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[redisLib.redisMod.ClientOpts] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
}

