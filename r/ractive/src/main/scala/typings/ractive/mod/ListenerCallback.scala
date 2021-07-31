package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerCallback[T /* <: Ractive[T] */] extends StObject {
  
  def apply(ctx: ContextHelper, args: js.Any*): Boolean | Unit | js.Promise[js.Any] = js.native
}
