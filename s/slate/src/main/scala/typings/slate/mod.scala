package typings.slate

import typings.slate.anon.Always
import typings.slate.anon.At
import typings.slate.anon.Compare
import typings.slate.anon.Hanging
import typings.slate.anon.Match
import typings.slate.anon.Mode
import typings.slate.anon.Split
import typings.slate.distInterfacesEditorMod.EditorAboveOptions
import typings.slate.distInterfacesEditorMod.EditorAfterOptions
import typings.slate.distInterfacesEditorMod.EditorBeforeOptions
import typings.slate.distInterfacesEditorMod.EditorElementReadOnlyOptions
import typings.slate.distInterfacesEditorMod.EditorFragmentDeletionOptions
import typings.slate.distInterfacesEditorMod.EditorInterface
import typings.slate.distInterfacesEditorMod.EditorLeafOptions
import typings.slate.distInterfacesEditorMod.EditorLevelsOptions
import typings.slate.distInterfacesEditorMod.EditorNextOptions
import typings.slate.distInterfacesEditorMod.EditorNodeOptions
import typings.slate.distInterfacesEditorMod.EditorNodesOptions
import typings.slate.distInterfacesEditorMod.EditorNormalizeOptions
import typings.slate.distInterfacesEditorMod.EditorParentOptions
import typings.slate.distInterfacesEditorMod.EditorPathOptions
import typings.slate.distInterfacesEditorMod.EditorPathRefOptions
import typings.slate.distInterfacesEditorMod.EditorPointOptions
import typings.slate.distInterfacesEditorMod.EditorPointRefOptions
import typings.slate.distInterfacesEditorMod.EditorPositionsOptions
import typings.slate.distInterfacesEditorMod.EditorPreviousOptions
import typings.slate.distInterfacesEditorMod.EditorRangeRefOptions
import typings.slate.distInterfacesEditorMod.EditorStringOptions
import typings.slate.distInterfacesEditorMod.EditorUnhangRangeOptions
import typings.slate.distInterfacesEditorMod.EditorVoidOptions
import typings.slate.distInterfacesElementMod.ElementInterface
import typings.slate.distInterfacesLocationMod.LocationInterface
import typings.slate.distInterfacesLocationMod.SpanInterface
import typings.slate.distInterfacesNodeMod.Ancestor
import typings.slate.distInterfacesNodeMod.Descendant
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesNodeMod.NodeEntry
import typings.slate.distInterfacesNodeMod.NodeInterface
import typings.slate.distInterfacesOperationMod.OperationInterface
import typings.slate.distInterfacesPathMod.Path
import typings.slate.distInterfacesPathMod.PathInterface
import typings.slate.distInterfacesPathRefMod.PathRef
import typings.slate.distInterfacesPathRefMod.PathRefInterface
import typings.slate.distInterfacesPointMod.Point
import typings.slate.distInterfacesPointMod.PointInterface
import typings.slate.distInterfacesPointRefMod.PointRef
import typings.slate.distInterfacesPointRefMod.PointRefInterface
import typings.slate.distInterfacesRangeMod.Range
import typings.slate.distInterfacesRangeMod.RangeInterface
import typings.slate.distInterfacesRangeRefMod.RangeRef
import typings.slate.distInterfacesRangeRefMod.RangeRefInterface
import typings.slate.distInterfacesScrubberMod.ScrubberInterface
import typings.slate.distInterfacesTextMod.TextInterface
import typings.slate.distInterfacesTransformsGeneralMod.GeneralTransforms
import typings.slate.distInterfacesTransformsNodeMod.NodeInsertNodesOptions
import typings.slate.distInterfacesTransformsNodeMod.NodeTransforms
import typings.slate.distInterfacesTransformsSelectionMod.SelectionCollapseOptions
import typings.slate.distInterfacesTransformsSelectionMod.SelectionMoveOptions
import typings.slate.distInterfacesTransformsSelectionMod.SelectionSetPointOptions
import typings.slate.distInterfacesTransformsSelectionMod.SelectionTransforms
import typings.slate.distInterfacesTransformsTextMod.TextDeleteOptions
import typings.slate.distInterfacesTransformsTextMod.TextInsertFragmentOptions
import typings.slate.distInterfacesTransformsTextMod.TextInsertTextOptions
import typings.slate.distInterfacesTransformsTextMod.TextTransforms
import typings.slate.distUtilsTypesMod.WithEditorFirstArg
import typings.slate.slateStrings.text_
import typings.std.Generator
import typings.std.Omit
import typings.std.Partial
import typings.std.Set
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
  val Node_ : NodeInterface = js.native
  
  @JSImport("slate", "Operation")
  @js.native
  val Operation: OperationInterface = js.native
  
  @JSImport("slate", "PathRef")
  @js.native
  val PathRef_ : PathRefInterface = js.native
  
  @JSImport("slate", "Path")
  @js.native
  val Path_ : PathInterface = js.native
  
  @JSImport("slate", "PointRef")
  @js.native
  val PointRef_ : PointRefInterface = js.native
  
  @JSImport("slate", "Point")
  @js.native
  val Point_ : PointInterface = js.native
  
  @JSImport("slate", "RangeRef")
  @js.native
  val RangeRef_ : RangeRefInterface = js.native
  
  @JSImport("slate", "Range")
  @js.native
  val Range_ : RangeInterface = js.native
  
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
  
  @JSImport("slate", "above")
  @js.native
  val above: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* options */ js.UndefOr[EditorAboveOptions[Ancestor]], 
    js.UndefOr[NodeEntry[Ancestor]]
  ] = js.native
  
  @JSImport("slate", "addMark")
  @js.native
  val addMark: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* key */ String, 
    /* value */ Any, 
    Unit
  ] = js.native
  
  @JSImport("slate", "after")
  @js.native
  val after: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* at */ typings.slate.distInterfacesLocationMod.Location, 
    /* options */ js.UndefOr[EditorAfterOptions], 
    js.UndefOr[Point]
  ] = js.native
  
  @JSImport("slate", "apply")
  @js.native
  val apply: WithEditorFirstArg[
    /* import warning: importer.ImportType#apply Failed type conversion: slate.slate/dist/interfaces/editor.Editor['apply'] */ js.Any
  ] = js.native
  
  @JSImport("slate", "before")
  @js.native
  val before: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* at */ typings.slate.distInterfacesLocationMod.Location, 
    /* options */ js.UndefOr[EditorBeforeOptions], 
    js.UndefOr[Point]
  ] = js.native
  
  @JSImport("slate", "collapse")
  @js.native
  val collapse: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* options */ js.UndefOr[SelectionCollapseOptions], 
    Unit
  ] = js.native
  
  inline def createEditor(): typings.slate.distInterfacesEditorMod.Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")().asInstanceOf[typings.slate.distInterfacesEditorMod.Editor]
  
  @JSImport("slate", "deleteBackward")
  @js.native
  val deleteBackward: WithEditorFirstArg[
    /* import warning: importer.ImportType#apply Failed type conversion: slate.slate/dist/interfaces/editor.Editor['deleteBackward'] */ js.Any
  ] = js.native
  
  @JSImport("slate", "deleteForward")
  @js.native
  val deleteForward: WithEditorFirstArg[
    /* import warning: importer.ImportType#apply Failed type conversion: slate.slate/dist/interfaces/editor.Editor['deleteForward'] */ js.Any
  ] = js.native
  
  @JSImport("slate", "deleteFragment")
  @js.native
  val deleteFragment: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* options */ js.UndefOr[EditorFragmentDeletionOptions], 
    Unit
  ] = js.native
  
  @JSImport("slate", "deleteText")
  @js.native
  val deleteText: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* options */ js.UndefOr[TextDeleteOptions], 
    Unit
  ] = js.native
  
  @JSImport("slate", "deselect")
  @js.native
  val deselect: js.Function1[/* editor */ typings.slate.distInterfacesEditorMod.Editor, Unit] = js.native
  
  @JSImport("slate", "edges")
  @js.native
  val edges: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* at */ typings.slate.distInterfacesLocationMod.Location, 
    js.Tuple2[Point, Point]
  ] = js.native
  
  @JSImport("slate", "elementReadOnly")
  @js.native
  val elementReadOnly: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* options */ js.UndefOr[EditorElementReadOnlyOptions], 
    js.UndefOr[NodeEntry[typings.slate.distInterfacesElementMod.Element]]
  ] = js.native
  
  @JSImport("slate", "end")
  @js.native
  val end: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* at */ typings.slate.distInterfacesLocationMod.Location, 
    Point
  ] = js.native
  
  @JSImport("slate", "first")
  @js.native
  val first: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* at */ typings.slate.distInterfacesLocationMod.Location, 
    NodeEntry[Node]
  ] = js.native
  
  @JSImport("slate", "fragment")
  @js.native
  val fragment: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* at */ typings.slate.distInterfacesLocationMod.Location, 
    js.Array[Descendant]
  ] = js.native
  
  @JSImport("slate", "getDirtyPaths")
  @js.native
  val getDirtyPaths: WithEditorFirstArg[
    /* import warning: importer.ImportType#apply Failed type conversion: slate.slate/dist/interfaces/editor.Editor['getDirtyPaths'] */ js.Any
  ] = js.native
  
  @JSImport("slate", "getFragment")
  @js.native
  val getFragment: WithEditorFirstArg[
    /* import warning: importer.ImportType#apply Failed type conversion: slate.slate/dist/interfaces/editor.Editor['getFragment'] */ js.Any
  ] = js.native
  
  @JSImport("slate", "getVoid")
  @js.native
  val getVoid: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* options */ js.UndefOr[EditorVoidOptions], 
    js.UndefOr[NodeEntry[typings.slate.distInterfacesElementMod.Element]]
  ] = js.native
  
  @JSImport("slate", "hasBlocks")
  @js.native
  val hasBlocks: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* element */ typings.slate.distInterfacesElementMod.Element, 
    Boolean
  ] = js.native
  
  @JSImport("slate", "hasInlines")
  @js.native
  val hasInlines: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* element */ typings.slate.distInterfacesElementMod.Element, 
    Boolean
  ] = js.native
  
  @JSImport("slate", "hasPath")
  @js.native
  val hasPath: js.Function2[/* editor */ typings.slate.distInterfacesEditorMod.Editor, /* path */ Path, Boolean] = js.native
  
  @JSImport("slate", "hasTexts")
  @js.native
  val hasTexts: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* element */ typings.slate.distInterfacesElementMod.Element, 
    Boolean
  ] = js.native
  
  @JSImport("slate", "insertBreak")
  @js.native
  val insertBreak: js.Function1[/* editor */ typings.slate.distInterfacesEditorMod.Editor, Unit] = js.native
  
  @JSImport("slate", "insertFragment")
  @js.native
  val insertFragment: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* fragment */ js.Array[Node], 
    /* options */ js.UndefOr[TextInsertFragmentOptions], 
    Unit
  ] = js.native
  
  @JSImport("slate", "insertNode")
  @js.native
  val insertNode: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* node */ Node, 
    /* options */ js.UndefOr[NodeInsertNodesOptions[Node]], 
    Unit
  ] = js.native
  
  @JSImport("slate", "insertNodes")
  @js.native
  val insertNodes: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* nodes */ Node | js.Array[Node], 
    /* options */ js.UndefOr[NodeInsertNodesOptions[Node]], 
    Unit
  ] = js.native
  
  @JSImport("slate", "insertSoftBreak")
  @js.native
  val insertSoftBreak: js.Function1[/* editor */ typings.slate.distInterfacesEditorMod.Editor, Unit] = js.native
  
  @JSImport("slate", "insertText")
  @js.native
  val insertText: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* text */ String, 
    /* options */ js.UndefOr[TextInsertTextOptions], 
    Unit
  ] = js.native
  
  @JSImport("slate", "isBlock")
  @js.native
  val isBlock: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* value */ typings.slate.distInterfacesElementMod.Element, 
    Boolean
  ] = js.native
  
  @JSImport("slate", "isEdge")
  @js.native
  val isEdge: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* point */ Point, 
    /* at */ typings.slate.distInterfacesLocationMod.Location, 
    Boolean
  ] = js.native
  
  @JSImport("slate", "isEditor")
  @js.native
  val isEditor: js.Function1[/* value */ Any, /* is slate.slate/dist/interfaces/editor.Editor */ Boolean] = js.native
  
  @JSImport("slate", "isEmpty")
  @js.native
  val isEmpty: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* element */ typings.slate.distInterfacesElementMod.Element, 
    Boolean
  ] = js.native
  
  @JSImport("slate", "isEnd")
  @js.native
  val isEnd: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* point */ Point, 
    /* at */ typings.slate.distInterfacesLocationMod.Location, 
    Boolean
  ] = js.native
  
  @JSImport("slate", "isNormalizing")
  @js.native
  val isNormalizing: js.Function1[/* editor */ typings.slate.distInterfacesEditorMod.Editor, Boolean] = js.native
  
  @JSImport("slate", "isStart")
  @js.native
  val isStart: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* point */ Point, 
    /* at */ typings.slate.distInterfacesLocationMod.Location, 
    Boolean
  ] = js.native
  
  @JSImport("slate", "last")
  @js.native
  val last: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* at */ typings.slate.distInterfacesLocationMod.Location, 
    NodeEntry[Node]
  ] = js.native
  
  @JSImport("slate", "leaf")
  @js.native
  val leaf: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* at */ typings.slate.distInterfacesLocationMod.Location, 
    /* options */ js.UndefOr[EditorLeafOptions], 
    NodeEntry[typings.slate.distInterfacesTextMod.Text]
  ] = js.native
  
  inline def levels[T /* <: Node */](editor: typings.slate.distInterfacesEditorMod.Editor): Generator[NodeEntry[T], Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("levels")(editor.asInstanceOf[js.Any]).asInstanceOf[Generator[NodeEntry[T], Unit, Unit]]
  inline def levels[T /* <: Node */](editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorLevelsOptions[T]): Generator[NodeEntry[T], Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("levels")(editor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[NodeEntry[T], Unit, Unit]]
  
  @JSImport("slate", "liftNodes")
  @js.native
  val liftNodes: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* options */ js.UndefOr[At[Node]], 
    Unit
  ] = js.native
  
  @JSImport("slate", "marks")
  @js.native
  val marks: js.Function1[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    (Omit[typings.slate.distInterfacesTextMod.Text, text_]) | Null
  ] = js.native
  
  @JSImport("slate", "mergeNodes")
  @js.native
  val mergeNodes: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* options */ js.UndefOr[Hanging[Node]], 
    Unit
  ] = js.native
  
  @JSImport("slate", "move")
  @js.native
  val move: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* options */ js.UndefOr[SelectionMoveOptions], 
    Unit
  ] = js.native
  
  @JSImport("slate", "moveNodes")
  @js.native
  val moveNodes: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* options */ Match[Node], 
    Unit
  ] = js.native
  
  @JSImport("slate", "next")
  @js.native
  val next: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* options */ js.UndefOr[EditorNextOptions[Descendant]], 
    js.UndefOr[NodeEntry[Descendant]]
  ] = js.native
  
  @JSImport("slate", "node")
  @js.native
  val node: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* at */ typings.slate.distInterfacesLocationMod.Location, 
    /* options */ js.UndefOr[EditorNodeOptions], 
    NodeEntry[Node]
  ] = js.native
  
  inline def nodes[T /* <: Node */](editor: typings.slate.distInterfacesEditorMod.Editor): Generator[NodeEntry[T], Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodes")(editor.asInstanceOf[js.Any]).asInstanceOf[Generator[NodeEntry[T], Unit, Unit]]
  inline def nodes[T /* <: Node */](editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorNodesOptions[T]): Generator[NodeEntry[T], Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodes")(editor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[NodeEntry[T], Unit, Unit]]
  
  @JSImport("slate", "normalize")
  @js.native
  val normalize: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* options */ js.UndefOr[EditorNormalizeOptions], 
    Unit
  ] = js.native
  
  @JSImport("slate", "normalizeNode")
  @js.native
  val normalizeNode: WithEditorFirstArg[
    /* import warning: importer.ImportType#apply Failed type conversion: slate.slate/dist/interfaces/editor.Editor['normalizeNode'] */ js.Any
  ] = js.native
  
  @JSImport("slate", "parent")
  @js.native
  val parent: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* at */ typings.slate.distInterfacesLocationMod.Location, 
    /* options */ js.UndefOr[EditorParentOptions], 
    NodeEntry[Ancestor]
  ] = js.native
  
  @JSImport("slate", "path")
  @js.native
  val path: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* at */ typings.slate.distInterfacesLocationMod.Location, 
    /* options */ js.UndefOr[EditorPathOptions], 
    Path
  ] = js.native
  
  @JSImport("slate", "pathRef")
  @js.native
  val pathRef: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* path */ Path, 
    /* options */ js.UndefOr[EditorPathRefOptions], 
    PathRef
  ] = js.native
  
  @JSImport("slate", "pathRefs")
  @js.native
  val pathRefs: js.Function1[/* editor */ typings.slate.distInterfacesEditorMod.Editor, Set[PathRef]] = js.native
  
  @JSImport("slate", "point")
  @js.native
  val point: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* at */ typings.slate.distInterfacesLocationMod.Location, 
    /* options */ js.UndefOr[EditorPointOptions], 
    Point
  ] = js.native
  
  @JSImport("slate", "pointRef")
  @js.native
  val pointRef: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* point */ Point, 
    /* options */ js.UndefOr[EditorPointRefOptions], 
    PointRef
  ] = js.native
  
  @JSImport("slate", "pointRefs")
  @js.native
  val pointRefs: js.Function1[/* editor */ typings.slate.distInterfacesEditorMod.Editor, Set[PointRef]] = js.native
  
  inline def positions(editor: typings.slate.distInterfacesEditorMod.Editor): Generator[Point, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("positions")(editor.asInstanceOf[js.Any]).asInstanceOf[Generator[Point, Unit, Unit]]
  inline def positions(editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorPositionsOptions): Generator[Point, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("positions")(editor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[Point, Unit, Unit]]
  
  @JSImport("slate", "previous")
  @js.native
  val previous: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* options */ js.UndefOr[EditorPreviousOptions[Node]], 
    js.UndefOr[NodeEntry[Node]]
  ] = js.native
  
  @JSImport("slate", "range")
  @js.native
  val range: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* at */ typings.slate.distInterfacesLocationMod.Location, 
    /* to */ js.UndefOr[typings.slate.distInterfacesLocationMod.Location], 
    Range
  ] = js.native
  
  @JSImport("slate", "rangeRef")
  @js.native
  val rangeRef: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* range */ Range, 
    /* options */ js.UndefOr[EditorRangeRefOptions], 
    RangeRef
  ] = js.native
  
  @JSImport("slate", "rangeRefs")
  @js.native
  val rangeRefs: js.Function1[/* editor */ typings.slate.distInterfacesEditorMod.Editor, Set[RangeRef]] = js.native
  
  @JSImport("slate", "removeMark")
  @js.native
  val removeMark: js.Function2[/* editor */ typings.slate.distInterfacesEditorMod.Editor, /* key */ String, Unit] = js.native
  
  @JSImport("slate", "removeNodes")
  @js.native
  val removeNodes: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* options */ js.UndefOr[Hanging[Node]], 
    Unit
  ] = js.native
  
  @JSImport("slate", "select")
  @js.native
  val select: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* target */ typings.slate.distInterfacesLocationMod.Location, 
    Unit
  ] = js.native
  
  @JSImport("slate", "setNodes")
  @js.native
  val setNodes: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* props */ Partial[Node], 
    /* options */ js.UndefOr[Compare[Node]], 
    Unit
  ] = js.native
  
  @JSImport("slate", "setNormalizing")
  @js.native
  val setNormalizing: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* isNormalizing */ Boolean, 
    Unit
  ] = js.native
  
  @JSImport("slate", "setPoint")
  @js.native
  val setPoint: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* props */ Partial[Point], 
    /* options */ js.UndefOr[SelectionSetPointOptions], 
    Unit
  ] = js.native
  
  @JSImport("slate", "setSelection")
  @js.native
  val setSelection: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* props */ Partial[Range], 
    Unit
  ] = js.native
  
  @JSImport("slate", "shouldNormalize")
  @js.native
  val shouldNormalize: WithEditorFirstArg[
    /* import warning: importer.ImportType#apply Failed type conversion: slate.slate/dist/interfaces/editor.Editor['shouldNormalize'] */ js.Any
  ] = js.native
  
  @JSImport("slate", "splitNodes")
  @js.native
  val splitNodes: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* options */ js.UndefOr[Always[Node]], 
    Unit
  ] = js.native
  
  @JSImport("slate", "start")
  @js.native
  val start: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* at */ typings.slate.distInterfacesLocationMod.Location, 
    Point
  ] = js.native
  
  @JSImport("slate", "string")
  @js.native
  val string: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* at */ typings.slate.distInterfacesLocationMod.Location, 
    /* options */ js.UndefOr[EditorStringOptions], 
    String
  ] = js.native
  
  @JSImport("slate", "unhangRange")
  @js.native
  val unhangRange: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* range */ Range, 
    /* options */ js.UndefOr[EditorUnhangRangeOptions], 
    Range
  ] = js.native
  
  @JSImport("slate", "unsetNodes")
  @js.native
  val unsetNodes: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* props */ String | js.Array[String], 
    /* options */ js.UndefOr[Mode[Node]], 
    Unit
  ] = js.native
  
  @JSImport("slate", "unwrapNodes")
  @js.native
  val unwrapNodes: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* options */ js.UndefOr[Split[Node]], 
    Unit
  ] = js.native
  
  @JSImport("slate", "withoutNormalizing")
  @js.native
  val withoutNormalizing: js.Function2[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* fn */ js.Function0[Unit], 
    Unit
  ] = js.native
  
  @JSImport("slate", "wrapNodes")
  @js.native
  val wrapNodes: js.Function3[
    /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
    /* element */ typings.slate.distInterfacesElementMod.Element, 
    /* options */ js.UndefOr[Split[Node]], 
    Unit
  ] = js.native
}
