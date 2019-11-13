package typings.prismicDashDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prismicDashDomMod {
  type HTMLSerializer[T] = js.Function5[
    /* type */ ElementType, 
    /* element */ js.Any, 
    /* text */ String | Null, 
    /* children */ js.Array[T], 
    /* index */ Double, 
    T
  ]
}
