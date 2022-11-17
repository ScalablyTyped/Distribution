package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinalizationRegistry[T] extends StObject {
  
  /**
    * Registers an object with the registry.
    * @param target The target object to register.
    * @param heldValue The value to pass to the finalizer for this object. This cannot be the
    * target object.
    * @param unregisterToken The token to pass to the unregister method to unregister the target
    * object. If provided (and not undefined), this must be an object. If not provided, the target
    * cannot be unregistered.
    */
  /* standard es2021.weakref */
  def register(target: js.Object, heldValue: T): Unit = js.native
  def register(target: js.Object, heldValue: T, unregisterToken: js.Object): Unit = js.native
  
  /* standard es2021.weakref */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: "FinalizationRegistry" = js.native
  
  /**
    * Unregisters an object from the registry.
    * @param unregisterToken The token that was used as the unregisterToken argument when calling
    * register to register the target object.
    */
  /* standard es2021.weakref */
  def unregister(unregisterToken: js.Object): Unit = js.native
}
