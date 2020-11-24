package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizedTreeshakingOptions extends js.Object {
  
  var annotations: Boolean = js.native
  
  def moduleSideEffects(id: String, external: Boolean): Boolean = js.native
  @JSName("moduleSideEffects")
  var moduleSideEffects_Original: HasModuleSideEffects = js.native
  
  var propertyReadSideEffects: Boolean = js.native
  
  var tryCatchDeoptimization: Boolean = js.native
  
  var unknownGlobalSideEffects: Boolean = js.native
}
