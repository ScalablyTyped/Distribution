package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyConstructor
  extends org.scalablytyped.runtime.Instantiable2[/* target */ js.Object, /* handler */ ProxyHandler[js.Object], js.Object] {
  def revocable[T /* <: js.Object */](target: T, handler: ProxyHandler[T]): Anon_Revoke[T] = js.native
}

