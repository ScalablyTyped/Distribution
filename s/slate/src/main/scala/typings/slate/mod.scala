package typings.slate

import typings.slate.editorMod.EditorInterface
import typings.slate.elementMod.ElementInterface
import typings.slate.generalMod.GeneralTransforms
import typings.slate.locationMod.LocationInterface
import typings.slate.locationMod.SpanInterface
import typings.slate.nodeMod.NodeInterface
import typings.slate.operationMod.OperationInterface
import typings.slate.pathMod.PathInterface
import typings.slate.pathRefMod.PathRefInterface
import typings.slate.pointMod.PointInterface
import typings.slate.pointRefMod.PointRefInterface
import typings.slate.rangeMod.RangeInterface
import typings.slate.rangeRefMod.RangeRefInterface
import typings.slate.scrubberMod.ScrubberInterface
import typings.slate.selectionMod.SelectionTransforms
import typings.slate.textMod.TextInterface
import typings.slate.transformsNodeMod.NodeTransforms
import typings.slate.transformsTextMod.TextTransforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("slate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slate", "Editor")
  @js.native
  val Editor: EditorInterface = js.native
  
  @JSImport("slate", "Element")
  @js.native
  val Element: ElementInterface = js.native
  
  @JSImport("slate", "Location")
  @js.native
  val Location: LocationInterface = js.native
  
  @JSImport("slate", "Node")
  @js.native
  val Node: NodeInterface = js.native
  
  @JSImport("slate", "Operation")
  @js.native
  val Operation: OperationInterface = js.native
  
  @JSImport("slate", "Path")
  @js.native
  val Path: PathInterface = js.native
  
  @JSImport("slate", "PathRef")
  @js.native
  val PathRef: PathRefInterface = js.native
  
  @JSImport("slate", "Point")
  @js.native
  val Point: PointInterface = js.native
  
  @JSImport("slate", "PointRef")
  @js.native
  val PointRef: PointRefInterface = js.native
  
  @JSImport("slate", "Range")
  @js.native
  val Range: RangeInterface = js.native
  
  @JSImport("slate", "RangeRef")
  @js.native
  val RangeRef: RangeRefInterface = js.native
  
  @JSImport("slate", "Scrubber")
  @js.native
  val Scrubber: ScrubberInterface = js.native
  
  @JSImport("slate", "Span")
  @js.native
  val Span: SpanInterface = js.native
  
  @JSImport("slate", "Text")
  @js.native
  val Text: TextInterface = js.native
  
  @JSImport("slate", "Transforms")
  @js.native
  val Transforms: GeneralTransforms & NodeTransforms & SelectionTransforms & TextTransforms = js.native
  
  inline def createEditor(): typings.slate.editorMod.Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")().asInstanceOf[typings.slate.editorMod.Editor]
}
