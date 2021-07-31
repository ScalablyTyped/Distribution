package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.semanticUiReact.segmentSegmentMod.SegmentComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Segment", JSImport.Default)
  @js.native
  val default: SegmentComponent = js.native
  
  type _To = SegmentComponent
  
  /* This means you don't have to write `default`, but can instead just say `segmentMod.foo` */
  override def _to: SegmentComponent = default
}
