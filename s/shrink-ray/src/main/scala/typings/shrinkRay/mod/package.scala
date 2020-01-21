package typings.shrinkRay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FilterFunction = js.Function2[
    /* req */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typings.express.mod.Response_, 
    scala.Boolean
  ]
  type Options = typings.std.Partial[typings.shrinkRay.AnonBrotli]
}
