package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashCopyDashWriteLib {
  // It'd be nice if this could somehow be improved! Perhaps we need variadic
  // kinds plus infer keyword? Alternatively unions may solve our issue if we had
  // the ability to restrict type widening.
  type AnyDeepMemberOfState[T] = js.Any
  type ConsumerProps[T] = js.Any
  type MutateFn[T] = js.Function2[/* draft */ T, /* state */ stdLib.Readonly[T], scala.Unit]
  type Mutator[T] = js.Function1[/* mutator */ MutateFn[T], scala.Unit]
  type RenderFn[T] = js.Function1[
    /* repeated */stdLib.Readonly[stdLib.ReturnType[SelectorFn[T]]], 
    reactLib.reactMod.Global.JSXNs.Element | js.Array[reactLib.reactMod.Global.JSXNs.Element] | scala.Null
  ]
  type SelectorFn[T] = js.Function1[/* state */ T, AnyDeepMemberOfState[T]]
}
