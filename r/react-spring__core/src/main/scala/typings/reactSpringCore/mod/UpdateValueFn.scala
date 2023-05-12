package typings.reactSpringCore.mod

import typings.reactSpringCore.anon.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Update the props of a spring.
  *
  * The `T` parameter must be a primitive type for a single animated value.
  */
@js.native
trait UpdateValueFn[T]
  extends StObject
     with AnyUpdateFn[SpringValue[T], InferProps[SpringValue[T]], InferState[SpringValue[T]]] {
  
  def apply(props: `8`[T] & SpringProps[T]): js.Promise[AnimationResult[SpringValue[T]]] = js.native
}
