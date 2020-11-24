package typings.ski

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ski", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def I[T](x: T): T = js.native
  
  def K[T, S](x: T): js.Function1[/* y */ js.UndefOr[S], T] = js.native
  
  def S[T, S, U](x: js.Function1[/* z */ U, js.Function1[/* y */ S, T]], y: js.Function1[/* z */ U, S], z: U): T = js.native
}
