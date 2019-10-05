package typings.sixDashRuntime.Six.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object view {
  type render = js.Function3[
    /* name */ String, 
    /* runtimeConf */ js.UndefOr[runtimeConf | Null], 
    /* data */ js.UndefOr[js.Object], 
    js.Promise[js.Any]
  ]
}
