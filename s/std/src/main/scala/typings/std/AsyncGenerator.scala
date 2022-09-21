package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncGenerator[T, TReturn, TNext]
  extends StObject
     with AsyncIterator[T, TReturn, TNext] {
  
  /* standard es2018.asyncgenerator */
  @JSName("return")
  def return_MAsyncGenerator(value: TReturn): js.Promise[IteratorResult[T, TReturn]] = js.native
  @JSName("return")
  def return_MAsyncGenerator(value: js.Thenable[TReturn]): js.Promise[IteratorResult[T, TReturn]] = js.native
  
  /* standard es2018.asyncgenerator */
  @JSName("throw")
  def throw_MAsyncGenerator(e: Any): js.Promise[IteratorResult[T, TReturn]] = js.native
}
