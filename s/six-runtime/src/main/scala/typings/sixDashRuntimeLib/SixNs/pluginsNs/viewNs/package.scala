package typings
package sixDashRuntimeLib.SixNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object viewNs {
  type render = js.Function3[
    /* name */ java.lang.String, 
    /* runtimeConf */ js.UndefOr[runtimeConf | scala.Null], 
    /* data */ js.UndefOr[js.Object], 
    stdLib.Promise[js.Any]
  ]
}
