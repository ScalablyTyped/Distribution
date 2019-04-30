package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qunitLib {
  type moduleFunc1 = js.Function3[
    /* name */ java.lang.String, 
    /* hooks */ js.UndefOr[Hooks], 
    /* nested */ js.UndefOr[js.Function1[/* hooks */ NestedHooks, scala.Unit]], 
    scala.Unit
  ]
  type moduleFunc2 = js.Function2[
    /* name */ java.lang.String, 
    /* nested */ js.UndefOr[js.Function1[/* hooks */ NestedHooks, scala.Unit]], 
    scala.Unit
  ]
}
