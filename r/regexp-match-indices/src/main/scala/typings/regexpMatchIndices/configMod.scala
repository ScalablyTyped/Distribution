package typings.regexpMatchIndices

import typings.regexpMatchIndices.regexpMatchIndicesStrings.`lazy`
import typings.regexpMatchIndices.regexpMatchIndicesStrings.`spec-compliant`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("regexp-match-indices/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates the evaluation mode:
    * - `"lazy"` - The `"indices"` property is intially defined as an accessor-property on a result and is
    *   converted into a data-property when first accessed. This avoids an up-front performance penalty for
    *   all existing calls to `RegExp.prototype.exec` at the cost of spec compliance. This is the default.
    * - `"spec-compliant"` - Uses a more spec-complaint behavior that evaluates and stores `"indices"`
    *   immediately as a data-property. This can result in a performance penalty for existing calls to
    *   `RegExp.prototype.exec` that may not be already accessing `"indices"`.
    */
  @JSImport("regexp-match-indices/config", "mode")
  @js.native
  def mode: `lazy` | `spec-compliant` = js.native
  inline def mode_=(x: `lazy` | `spec-compliant`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
}
