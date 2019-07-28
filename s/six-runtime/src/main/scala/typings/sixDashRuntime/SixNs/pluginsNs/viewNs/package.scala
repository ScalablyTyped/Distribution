package typings.sixDashRuntime.SixNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object viewNs {
  type render = js.Function3[
    /* name */ String, 
    /* runtimeConf */ js.UndefOr[runtimeConf | Null], 
    /* data */ js.UndefOr[js.Object], 
    js.Promise[js.Any]
  ]
}
