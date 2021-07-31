package typings.rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseLike[T] extends StObject {
  
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  def `then`[TResult](): PromiseLike[TResult] = js.native
  def `then`[TResult](onfulfilled: js.Function1[/* value */ T, TResult | PromiseLike[TResult]]): PromiseLike[TResult] = js.native
  def `then`[TResult](
    onfulfilled: js.Function1[/* value */ T, PromiseLike[TResult] | TResult],
    onrejected: js.Function1[/* reason */ js.Any, PromiseLike[TResult] | TResult | Unit]
  ): PromiseLike[TResult] = js.native
  def `then`[TResult](
    onfulfilled: Unit,
    onrejected: js.Function1[/* reason */ js.Any, PromiseLike[TResult] | TResult | Unit]
  ): PromiseLike[TResult] = js.native
}
