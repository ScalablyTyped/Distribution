package typings.ski

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ski", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def I[T](x: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("I")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def K[T, S](x: T): js.Function1[/* y */ js.UndefOr[S], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("K")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* y */ js.UndefOr[S], T]]
  
  @scala.inline
  def S[T, S, U](x: js.Function1[/* z */ U, js.Function1[/* y */ S, T]], y: js.Function1[/* z */ U, S], z: U): T = (^.asInstanceOf[js.Dynamic].applyDynamic("S")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[T]
}
