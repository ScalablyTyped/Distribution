package typings.skiaCanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CanvasRenderingContext2D * / any */ @JSImport("skia-canvas", "CanvasRenderingContext2D")
@js.native
class CanvasRenderingContext2D () extends js.Object {
  
  var fontVariant: String = js.native
  
  def measureText(text: String): TextMetrics = js.native
  
  var textTracking: Double = js.native
  
  var textWrap: Boolean = js.native
}
