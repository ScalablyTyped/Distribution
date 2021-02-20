package typings.sinon.mod

import typings.sinon.anon.Get
import typings.sinon.sinonStrings.get
import typings.sinon.sinonStrings.set
import typings.std.Parameters
import typings.std.PropertyDescriptor
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonSpyStatic extends StObject {
  
  /**
    * Creates an anonymous function that records arguments, this value, exceptions and return values for all calls.
    */
  def apply(): SinonSpy[js.Array[_], _] = js.native
  /**
    * Spies on the provided function
    */
  def apply[F /* <: js.Function1[/* repeated */ js.Any, _] */](func: F): SinonSpy[Parameters[F], ReturnType[F]] = js.native
  /**
    * Creates a spy for object.method and replaces the original method with the spy.
    * An exception is thrown if the property is not already a function.
    * The spy acts exactly like the original method in all cases.
    * The original method can be restored by calling object.method.restore().
    * The returned spy is the function object which replaced the original method. spy === object.method.
    */
  def apply[T, K /* <: /* keyof T */ String */](obj: T, method: K): SinonSpy[_ | js.Array[_], _] = js.native
  def apply[T, K /* <: /* keyof T */ String */](obj: T, method: K, types: js.Array[get | set]): PropertyDescriptor with (Get[T, K]) = js.native
}
