package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.FinalizationRegistryConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("FinalizationRegistry")
@js.native
class FinalizationRegistry protected ()
  extends typings.std.FinalizationRegistry {
  /**
    * Creates a finalization registry with an associated cleanup callback
    * @param cleanupCallback The callback to call after an object in the registry has been reclaimed.
    */
  def this(cleanupCallback: js.Function1[/* heldValue */ js.Any, Unit]) = this()
}
@JSGlobal("FinalizationRegistry")
@js.native
object FinalizationRegistry extends TopLevel[FinalizationRegistryConstructor]
