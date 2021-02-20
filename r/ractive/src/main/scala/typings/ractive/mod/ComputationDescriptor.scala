package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputationDescriptor[T /* <: Ractive[T] */] extends StObject {
  
  /**
  	 * Called when Ractive needs to get the computed value. Computations are lazy, so this is only called when a dependency asks for a value.
  	 */
  def get(): js.Any = js.native
  /**
  	 * Called when Ractive needs to get the computed value. Computations are lazy, so this is only called when a dependency asks for a value.
  	 */
  @JSName("get")
  var get_Original: ComputationFn[T] = js.native
  
  /**
  	 * Called when Ractive is asked to set a computed keypath.
  	 */
  var set: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
}
