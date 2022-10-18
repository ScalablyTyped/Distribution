package typings.sinon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonFake extends StObject {
  
  /**
    * Creates a basic fake, with no behavior
    */
  def apply[TArgs /* <: js.Array[Any] */, TReturnValue](): SinonSpy[TArgs, TReturnValue] = js.native
  /**
    * Wraps an existing Function to record all interactions, while leaving it up to the func to provide the behavior.
    * This is useful when complex behavior not covered by the sinon.fake.* methods is required or when wrapping an existing function or method.
    */
  def apply[TArgs /* <: js.Array[Any] */, TReturnValue](fn: js.Function1[/* args */ TArgs, TReturnValue]): SinonSpy[TArgs, TReturnValue] = js.native
  
  /**
    * Creates a fake that returns a rejected Promise for the passed value.
    * If an Error is passed as the value argument, then that will be the value of the promise.
    * If any other value is passed, then that will be used for the message property of the Error returned by the promise.
    * @param val Rejected promise
    */
  def rejects[TArgs /* <: js.Array[Any] */, TReturnValue](`val`: Any): SinonSpy[TArgs, TReturnValue] = js.native
  
  /**
    * Creates a fake that returns a resolved Promise for the passed value.
    * @param val Resolved promise
    */
  def resolves[TArgs /* <: js.Array[Any] */, TReturnValue](
    `val`: /* import warning: importer.ImportType#apply Failed type conversion: TReturnValue extends std.PromiseLike<infer TResolveValue> ? TResolveValue : any */ js.Any
  ): SinonSpy[TArgs, TReturnValue] = js.native
  
  /**
    * Creates a fake that returns the val argument
    * @param val Returned value
    */
  def returns[TArgs /* <: js.Array[Any] */, TReturnValue](`val`: TReturnValue): SinonSpy[TArgs, TReturnValue] = js.native
  
  def throws[TArgs /* <: js.Array[Any] */, TReturnValue](`val`: String): SinonSpy[TArgs, TReturnValue] = js.native
  /**
    * Creates a fake that throws an Error with the provided value as the message property.
    * If an Error is passed as the val argument, then that will be the thrown value. If any other value is passed, then that will be used for the message property of the thrown Error.
    * @param val Returned value or throw value if an Error
    */
  def throws[TArgs /* <: js.Array[Any] */, TReturnValue](`val`: js.Error): SinonSpy[TArgs, TReturnValue] = js.native
  
  /**
    * fake expects the last argument to be a callback and will invoke it with the given arguments.
    */
  def yields[TArgs /* <: js.Array[Any] */, TReturnValue](args: Any*): SinonSpy[TArgs, TReturnValue] = js.native
  
  /**
    * fake expects the last argument to be a callback and will invoke it asynchronously with the given arguments.
    */
  def yieldsAsync[TArgs /* <: js.Array[Any] */, TReturnValue](args: Any*): SinonSpy[TArgs, TReturnValue] = js.native
}
