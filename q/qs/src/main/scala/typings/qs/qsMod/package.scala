package typings.qs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qsMod {
  type defaultDecoder = js.Function3[
    /* str */ String, 
    /* decoder */ js.UndefOr[js.Any], 
    /* charset */ js.UndefOr[String], 
    String
  ]
  type defaultEncoder = js.Function3[
    /* str */ js.Any, 
    /* defaultEncoder */ js.UndefOr[js.Any], 
    /* charset */ js.UndefOr[String], 
    String
  ]
}
