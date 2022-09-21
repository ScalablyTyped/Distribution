package typings.skiaCanvas.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Image * / any */ @JSImport("skia-canvas/lib", "Image")
@js.native
open class Image ()
  extends StObject
     with CanvasImageSource {
  
  def src: String = js.native
  def src_=(src: String | Buffer): Unit = js.native
}
