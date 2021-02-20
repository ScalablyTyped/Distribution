package typings.restartHooks

import typings.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCommittedRefMod {
  
  /**
    * Creates a `Ref` whose value is updated in an effect, ensuring the most recent
    * value is the one rendered with. Generally only required for Concurrent mode usage
    * where previous work in `render()` may be discarded befor being used.
    *
    * This is safe to access in an event handler.
    *
    * @param value The `Ref` value
    */
  @JSImport("@restart/hooks/cjs/useCommittedRef", JSImport.Default)
  @js.native
  def default[TValue](value: TValue): MutableRefObject[TValue] = js.native
}
