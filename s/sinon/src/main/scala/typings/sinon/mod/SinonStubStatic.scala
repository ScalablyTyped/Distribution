package typings.sinon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonStubStatic extends js.Object {
  
  /* tslint:enable:no-unnecessary-generics */
  /**
    * Stubs all the object’s methods.
    * Note that it’s usually better practice to stub individual methods, particularly on objects that you don’t understand or control all the methods for (e.g. library dependencies).
    * Stubbing individual methods tests intent more precisely and is less susceptible to unexpected behavior as the object’s code evolves.
    * If you want to create a stub object of MyConstructor, but don’t want the constructor to be invoked, use this utility function.
    */
  def apply[T](obj: T): SinonStubbedInstance[T] = js.native
  /* tslint:disable:no-unnecessary-generics */
  /**
    * Creates an anonymous stub function
    */
  def apply[TArgs /* <: js.Array[_] */, R](): SinonStub[TArgs, R] = js.native
  /**
    * Replaces obj.method with a stub function.
    * An exception is thrown if the property is not already a function.
    * The original function can be restored by calling object.method.restore(); (or stub.restore();).
    */
  def apply[T, K /* <: /* keyof T */ String */](obj: T, method: K): SinonStub[_ | js.Array[_], _] = js.native
}
