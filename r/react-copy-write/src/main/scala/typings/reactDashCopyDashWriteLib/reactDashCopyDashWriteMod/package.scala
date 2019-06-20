package typings
package reactDashCopyDashWriteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashCopyDashWriteMod {
  type Consumer[T] = reactLib.reactMod.Component[ConsumerProps[T], js.Object, js.Any]
  type MutateFn[T] = js.Function2[/* draft */ T, /* state */ T, scala.Unit]
  type Mutator[T] = js.Function1[/* mutator */ MutateFn[T], scala.Unit]
  type Provider[T] = reactLib.reactMod.Component[ProviderProps[T], js.Object, js.Any]
  type RenderFn[T] = js.Function1[
    /* repeated */ stdLib.ReturnType[SelectorFn[T]], 
    reactLib.reactMod.Global.JSXNs.Element | js.Array[reactLib.reactMod.Global.JSXNs.Element] | scala.Null
  ]
  type SelectorFn[T] = js.Function1[/* state */ T, reactDashCopyDashWriteLib.AnyDeepMemberOfState[T]]
}
