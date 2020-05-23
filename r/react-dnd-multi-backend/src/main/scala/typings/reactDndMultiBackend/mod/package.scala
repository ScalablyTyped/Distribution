package typings.reactDndMultiBackend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CheckFunction[E /* <: typings.std.UIEvent */] = js.Function1[/* event */ E, scala.Boolean]
  type PreviewGenerator[T] = js.Function1[
    /* arg */ typings.reactDndMultiBackend.mod.PreviewGeneratorArg[T], 
    typings.react.mod.ReactNode
  ]
}
