package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObserverCallback[T /* <: Ractive[T] */] extends StObject {
  
  def apply(value: js.Any, old: js.Any, keypath: String, parts: String*): Unit | js.Promise[js.Any] = js.native
}
