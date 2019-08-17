package typings.qiniu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qiniuMod {
  import typings.std.Error

  type callback = js.Function3[
    /* e */ js.UndefOr[Error], 
    /* respBody */ js.UndefOr[js.Any], 
    /* respInfo */ js.UndefOr[js.Any], 
    Unit
  ]
}
