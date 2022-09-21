package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerCallback[T /* <: Ractive[T] */] extends StObject {
  
  def apply(ctx: ListenerContextHelper, args: Any*): Boolean | Unit | js.Promise[Any] = js.native
}
