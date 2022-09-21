package typings.std

import org.scalablytyped.runtime.Instantiable2
import typings.std.anon.Proxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyConstructor
  extends StObject
     with /**
  * Creates a Proxy object. The Proxy object allows you to create an object that can be used in place of the
  * original object, but which may redefine fundamental Object operations like getting, setting, and defining
  * properties. Proxy objects are commonly used to log property accesses, validate, format, or sanitize inputs.
  * @param target A target object to wrap with Proxy.
  * @param handler An object whose properties define the behavior of Proxy when an operation is attempted on it.
  */
/* standard es2015.proxy */
Instantiable2[/* target */ js.Object, /* handler */ ProxyHandler[js.Object], js.Object] {
  
  /**
    * Creates a revocable Proxy object.
    * @param target A target object to wrap with Proxy.
    * @param handler An object whose properties define the behavior of Proxy when an operation is attempted on it.
    */
  /* standard es2015.proxy */
  def revocable[T /* <: js.Object */](target: T, handler: ProxyHandler[T]): Proxy[T] = js.native
}
