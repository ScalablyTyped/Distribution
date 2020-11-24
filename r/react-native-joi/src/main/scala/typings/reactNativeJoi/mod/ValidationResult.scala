package typings.reactNativeJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<std.Promise<T>, 'then' | 'catch'> */
@js.native
trait ValidationResult[T] extends js.Object {
  
  def `catch`[TResult](): js.Promise[T | TResult] = js.native
  @JSName("catch")
  var catch_Original: js.Function0[js.Promise[T | scala.Nothing]] = js.native
  
  var error: ValidationError = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  @JSName("then")
  var then_Original: js.Function0[js.Promise[T | scala.Nothing]] = js.native
  
  var value: T = js.native
}
