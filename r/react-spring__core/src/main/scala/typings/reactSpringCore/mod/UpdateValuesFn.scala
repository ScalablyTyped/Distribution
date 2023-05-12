package typings.reactSpringCore.mod

import typings.reactSpringCore.anon.`7`
import typings.reactSpringTypes.mod.Lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Update the props of a `Controller` object or `useSpring` call.
  *
  * The `T` parameter must be a set of animated values (as an object type).
  */
@js.native
trait UpdateValuesFn[State /* <: Lookup[scala.Any] */]
  extends StObject
     with AnyUpdateFn[Controller[State], InferProps[Controller[State]], InferState[Controller[State]]] {
  
  def apply(props: `7`[State] & (ControllerProps[State, Unit])): js.Promise[AnimationResult[Controller[State]]] = js.native
  def apply(props: InlineToProps[State] & (ControllerProps[State, Unit])): js.Promise[AnimationResult[Controller[State]]] = js.native
}
