package typings.pulumiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apiMod {
  type HttpEndpoint = typings.pulumiCloud.apiMod.API
  type RouteHandler = js.Function3[
    /* req */ typings.pulumiCloud.apiMod.Request, 
    /* res */ typings.pulumiCloud.apiMod.Response, 
    /* next */ js.Function0[scala.Unit], 
    scala.Unit
  ]
}
