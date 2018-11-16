package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#compose
@JSImport("recompose/compose", JSImport.Namespace)
@js.native
object composeMod extends js.Object {
  def default[TInner, TOutter](functions: js.Function*): recomposeLib.recomposeMod.ComponentEnhancer[TInner, TOutter] = js.native
}

