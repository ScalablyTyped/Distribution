package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rax", "useCallback")
@js.native
object useCallback extends js.Object {
  // I made 'inputs' required here and in useMemo as there's no point to memoizing without the memoization key
  // useCallback(X) is identical to just using X, useMemo(() => Y) is identical to just using Y.
  /**
    * `useCallback` will return a memoized version of the callback that only changes if one of the `inputs`
    * has changed.
    */
  // TODO (TypeScript 3.0): <T extends (...args: never[]) => unknown>
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T, deps: DependencyList): T = js.native
}

