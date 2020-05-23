package typings.sixRuntime.Six.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object view {
  type render = js.Function3[
    /* name */ java.lang.String, 
    /* runtimeConf */ js.UndefOr[typings.sixRuntime.Six.plugins.view.runtimeConf | scala.Null], 
    /* data */ js.UndefOr[js.Object], 
    js.Promise[js.Any]
  ]
}
