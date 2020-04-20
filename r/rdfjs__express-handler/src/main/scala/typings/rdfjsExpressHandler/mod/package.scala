package typings.rdfjsExpressHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BaseIriFromRequest = js.Function1[
    /* req */ typings.rdfjsExpressHandler.mod.expressAugmentingMod.Request, 
    js.Promise[java.lang.String] | java.lang.String
  ]
}
