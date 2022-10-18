package typings.slate

import typings.slate.distInterfacesEditorMod.EditorInterface
import typings.slate.distInterfacesElementMod.ElementInterface
import typings.slate.distInterfacesLocationMod.LocationInterface
import typings.slate.distInterfacesLocationMod.SpanInterface
import typings.slate.distInterfacesNodeMod.NodeInterface
import typings.slate.distInterfacesOperationMod.OperationInterface
import typings.slate.distInterfacesPathMod.PathInterface
import typings.slate.distInterfacesPathRefMod.PathRefInterface
import typings.slate.distInterfacesPointMod.PointInterface
import typings.slate.distInterfacesPointRefMod.PointRefInterface
import typings.slate.distInterfacesRangeMod.RangeInterface
import typings.slate.distInterfacesRangeRefMod.RangeRefInterface
import typings.slate.distInterfacesScrubberMod.ScrubberInterface
import typings.slate.distInterfacesTextMod.TextInterface
import typings.slate.distTransformsGeneralMod.GeneralTransforms
import typings.slate.distTransformsNodeMod.NodeTransforms
import typings.slate.distTransformsSelectionMod.SelectionTransforms
import typings.slate.distTransformsTextMod.TextTransforms
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
  
  inline def createEditor(): typings.slate.distInterfacesEditorMod.Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")().asInstanceOf[typings.slate.distInterfacesEditorMod.Editor]
}
