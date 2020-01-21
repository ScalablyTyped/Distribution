package typings.qiniu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type callback = js.Function3[
    /* e */ js.UndefOr[typings.std.Error], 
    /* respBody */ js.UndefOr[js.Any], 
    /* respInfo */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
