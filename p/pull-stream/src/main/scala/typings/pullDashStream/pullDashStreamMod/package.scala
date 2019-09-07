package typings.pullDashStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pullDashStreamMod {
  import typings.std.Error

  type Sink[T] = js.Function1[/* source */ Source[T], js.UndefOr[scala.Nothing]]
  type Source[T] = js.Function2[
    /* endOrError */ Error | Boolean | Null, 
    /* cb */ js.Function2[/* endOrError */ Error | Boolean | Null, /* data */ T, js.Any], 
    js.UndefOr[scala.Nothing]
  ]
  type Through[T, U] = js.Function1[/* source */ Source[T], Source[U]]
}
