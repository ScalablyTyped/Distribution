package typings.reactSpringCore.mod

import typings.reactSpringCore.anon.`5`
import typings.reactSpringCore.anon.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyUpdateFn[T /* <: SpringValue[scala.Any] | Controller[scala.Any] */, Props /* <: js.Object */, State] extends StObject {
  
  def apply(to: (`5`[T] & Props & `6`[State]) | SpringTo[State]): js.Promise[AnimationResult[T]] = js.native
  def apply(to: SpringTo[State], props: Props): js.Promise[AnimationResult[T]] = js.native
}
