package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Generator[T, TReturn, TNext]
  extends StObject
     with Iterator[T, TReturn, TNext] {
  
  /* standard es2015.generator */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[Generator[T, TReturn, TNext]] = js.native
  
  /* standard es2015.generator */
  @JSName("return")
  def return_MGenerator(value: TReturn): IteratorResult[T, TReturn] = js.native
  
  /* standard es2015.generator */
  @JSName("throw")
  def throw_MGenerator(e: Any): IteratorResult[T, TReturn] = js.native
}
