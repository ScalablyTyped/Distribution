package typings
package qiniuLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qiniuMod {
  type callback = js.Function3[
    /* e */ js.UndefOr[nodeLib.Error], 
    /* respBody */ js.UndefOr[js.Any], 
    /* respInfo */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
