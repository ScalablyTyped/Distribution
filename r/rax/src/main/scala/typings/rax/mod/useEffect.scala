package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rax", "useEffect")
@js.native
object useEffect extends js.Object {
  /**
    * Accepts a function that contains imperative, possibly effectful code.
    *
    * @param effect Imperative function that can return a cleanup function
    * @param deps If present, effect will only activate if the values in the list change.
    */
  def apply(effect: EffectCallback): Unit = js.native
  def apply(effect: EffectCallback, deps: DependencyList): Unit = js.native
}

