package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeakRef[T /* <: js.Object */] extends StObject {
  
  /**
    * Returns the WeakRef instance's target object, or undefined if the target object has been
    * reclaimed.
    */
  /* standard es2021.weakref */
  def deref(): js.UndefOr[T] = js.native
  
  /* standard es2021.weakref */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: "WeakRef" = js.native
}
