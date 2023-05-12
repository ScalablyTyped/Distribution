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
import typings.slate.distInterfacesTransformsGeneralMod.GeneralTransforms
import typings.slate.distInterfacesTransformsNodeMod.NodeTransforms
import typings.slate.distInterfacesTransformsSelectionMod.SelectionTransforms
import typings.slate.distInterfacesTransformsTextMod.TextTransforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesMod {
  
  @JSImport("slate/dist/interfaces", "Editor")
  @js.native
  val Editor: EditorInterface = js.native
  
  @JSImport("slate/dist/interfaces", "Element")
  @js.native
  val Element: ElementInterface = js.native
  
  @JSImport("slate/dist/interfaces", "Location")
  @js.native
  val Location: LocationInterface = js.native
  
  @JSImport("slate/dist/interfaces", "Node")
  @js.native
  val Node: NodeInterface = js.native
  
  @JSImport("slate/dist/interfaces", "Operation")
  @js.native
  val Operation: OperationInterface = js.native
  
  @JSImport("slate/dist/interfaces", "Path")
  @js.native
  val Path: PathInterface = js.native
  
  @JSImport("slate/dist/interfaces", "PathRef")
  @js.native
  val PathRef: PathRefInterface = js.native
  
  @JSImport("slate/dist/interfaces", "Point")
  @js.native
  val Point: PointInterface = js.native
  
  @JSImport("slate/dist/interfaces", "PointRef")
  @js.native
  val PointRef: PointRefInterface = js.native
  
  @JSImport("slate/dist/interfaces", "Range")
  @js.native
  val Range: RangeInterface = js.native
  
  @JSImport("slate/dist/interfaces", "RangeRef")
  @js.native
  val RangeRef: RangeRefInterface = js.native
  
  @JSImport("slate/dist/interfaces", "Scrubber")
  @js.native
  val Scrubber: ScrubberInterface = js.native
  
  @JSImport("slate/dist/interfaces", "Span")
  @js.native
  val Span: SpanInterface = js.native
  
  @JSImport("slate/dist/interfaces", "Text")
  @js.native
  val Text: TextInterface = js.native
  
  @JSImport("slate/dist/interfaces", "Transforms")
  @js.native
  val Transforms: GeneralTransforms & NodeTransforms & SelectionTransforms & TextTransforms = js.native
}
