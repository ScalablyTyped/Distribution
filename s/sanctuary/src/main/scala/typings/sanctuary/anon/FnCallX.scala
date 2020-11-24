package typings.sanctuary.anon

import typings.sanctuary.mod.Apply
import typings.sanctuary.mod.Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallX[A, B, C] extends js.Object {
  
  def apply(x: Apply[A]): js.Function1[/* y */ Apply[B], Apply[C]] = js.native
  def apply[X](x: Fn[X, A]): js.Function1[/* y */ Fn[X, B], Fn[X, C]] = js.native
}
