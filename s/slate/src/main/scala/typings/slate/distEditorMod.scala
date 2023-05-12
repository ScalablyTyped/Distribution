package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorAboveOptions
import typings.slate.distInterfacesEditorMod.EditorAfterOptions
import typings.slate.distInterfacesEditorMod.EditorBeforeOptions
import typings.slate.distInterfacesEditorMod.EditorElementReadOnlyOptions
import typings.slate.distInterfacesEditorMod.EditorFragmentDeletionOptions
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
import typings.slate.distInterfacesElementMod.Element
import typings.slate.distInterfacesLocationMod.Location
import typings.slate.distInterfacesNodeMod.Ancestor
import typings.slate.distInterfacesNodeMod.Descendant
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesNodeMod.NodeEntry
import typings.slate.distInterfacesPathMod.Path
import typings.slate.distInterfacesPathRefMod.PathRef
import typings.slate.distInterfacesPointMod.Point
import typings.slate.distInterfacesPointRefMod.PointRef
import typings.slate.distInterfacesRangeMod.Range
import typings.slate.distInterfacesRangeRefMod.RangeRef
import typings.slate.distInterfacesTextMod.Text
import typings.slate.distInterfacesTransformsNodeMod.NodeInsertNodesOptions
import typings.slate.distInterfacesTransformsTextMod.TextInsertTextOptions
import typings.slate.distUtilsTypesMod.WithEditorFirstArg
import typings.slate.slateStrings.text_
import typings.std.Generator
import typings.std.Omit
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorMod {
  
  @JSImport("slate/dist/editor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slate/dist/editor", "above")
  @js.native
  val above: js.Function2[
    /* editor */ Editor, 
    /* options */ js.UndefOr[EditorAboveOptions[Ancestor]], 
    js.UndefOr[NodeEntry[Ancestor]]
  ] = js.native
  
  @JSImport("slate/dist/editor", "addMark")
  @js.native
  val addMark: js.Function3[/* editor */ Editor, /* key */ String, /* value */ Any, Unit] = js.native
  
  @JSImport("slate/dist/editor", "after")
  @js.native
  val after: js.Function3[
    /* editor */ Editor, 
    /* at */ Location, 
    /* options */ js.UndefOr[EditorAfterOptions], 
    js.UndefOr[Point]
  ] = js.native
  
  @JSImport("slate/dist/editor", "before")
  @js.native
  val before: js.Function3[
    /* editor */ Editor, 
    /* at */ Location, 
    /* options */ js.UndefOr[EditorBeforeOptions], 
    js.UndefOr[Point]
  ] = js.native
  
  @JSImport("slate/dist/editor", "deleteBackward")
  @js.native
  val deleteBackward: WithEditorFirstArg[
    /* import warning: importer.ImportType#apply Failed type conversion: slate.slate/dist/interfaces/editor.Editor['deleteBackward'] */ js.Any
  ] = js.native
  
  @JSImport("slate/dist/editor", "deleteForward")
  @js.native
  val deleteForward: WithEditorFirstArg[
    /* import warning: importer.ImportType#apply Failed type conversion: slate.slate/dist/interfaces/editor.Editor['deleteForward'] */ js.Any
  ] = js.native
  
  @JSImport("slate/dist/editor", "deleteFragment")
  @js.native
  val deleteFragment: js.Function2[/* editor */ Editor, /* options */ js.UndefOr[EditorFragmentDeletionOptions], Unit] = js.native
  
  @JSImport("slate/dist/editor", "edges")
  @js.native
  val edges: js.Function2[/* editor */ Editor, /* at */ Location, js.Tuple2[Point, Point]] = js.native
  
  @JSImport("slate/dist/editor", "elementReadOnly")
  @js.native
  val elementReadOnly: js.Function2[
    /* editor */ Editor, 
    /* options */ js.UndefOr[EditorElementReadOnlyOptions], 
    js.UndefOr[NodeEntry[Element]]
  ] = js.native
  
  @JSImport("slate/dist/editor", "end")
  @js.native
  val end: js.Function2[/* editor */ Editor, /* at */ Location, Point] = js.native
  
  @JSImport("slate/dist/editor", "first")
  @js.native
  val first: js.Function2[/* editor */ Editor, /* at */ Location, NodeEntry[Node]] = js.native
  
  @JSImport("slate/dist/editor", "fragment")
  @js.native
  val fragment: js.Function2[/* editor */ Editor, /* at */ Location, js.Array[Descendant]] = js.native
  
  @JSImport("slate/dist/editor", "getVoid")
  @js.native
  val getVoid: js.Function2[
    /* editor */ Editor, 
    /* options */ js.UndefOr[EditorVoidOptions], 
    js.UndefOr[NodeEntry[Element]]
  ] = js.native
  
  @JSImport("slate/dist/editor", "hasBlocks")
  @js.native
  val hasBlocks: js.Function2[/* editor */ Editor, /* element */ Element, Boolean] = js.native
  
  @JSImport("slate/dist/editor", "hasInlines")
  @js.native
  val hasInlines: js.Function2[/* editor */ Editor, /* element */ Element, Boolean] = js.native
  
  @JSImport("slate/dist/editor", "hasPath")
  @js.native
  val hasPath: js.Function2[/* editor */ Editor, /* path */ Path, Boolean] = js.native
  
  @JSImport("slate/dist/editor", "hasTexts")
  @js.native
  val hasTexts: js.Function2[/* editor */ Editor, /* element */ Element, Boolean] = js.native
  
  @JSImport("slate/dist/editor", "insertBreak")
  @js.native
  val insertBreak: js.Function1[/* editor */ Editor, Unit] = js.native
  
  @JSImport("slate/dist/editor", "insertNode")
  @js.native
  val insertNode: js.Function3[
    /* editor */ Editor, 
    /* node */ Node, 
    /* options */ js.UndefOr[NodeInsertNodesOptions[Node]], 
    Unit
  ] = js.native
  
  @JSImport("slate/dist/editor", "insertSoftBreak")
  @js.native
  val insertSoftBreak: js.Function1[/* editor */ Editor, Unit] = js.native
  
  @JSImport("slate/dist/editor", "insertText")
  @js.native
  val insertText: js.Function3[
    /* editor */ Editor, 
    /* text */ String, 
    /* options */ js.UndefOr[TextInsertTextOptions], 
    Unit
  ] = js.native
  
  @JSImport("slate/dist/editor", "isBlock")
  @js.native
  val isBlock: js.Function2[/* editor */ Editor, /* value */ Element, Boolean] = js.native
  
  @JSImport("slate/dist/editor", "isEdge")
  @js.native
  val isEdge: js.Function3[/* editor */ Editor, /* point */ Point, /* at */ Location, Boolean] = js.native
  
  @JSImport("slate/dist/editor", "isEditor")
  @js.native
  val isEditor: js.Function1[/* value */ Any, /* is slate.slate/dist/interfaces/editor.Editor */ Boolean] = js.native
  
  @JSImport("slate/dist/editor", "isEmpty")
  @js.native
  val isEmpty: js.Function2[/* editor */ Editor, /* element */ Element, Boolean] = js.native
  
  @JSImport("slate/dist/editor", "isEnd")
  @js.native
  val isEnd: js.Function3[/* editor */ Editor, /* point */ Point, /* at */ Location, Boolean] = js.native
  
  @JSImport("slate/dist/editor", "isNormalizing")
  @js.native
  val isNormalizing: js.Function1[/* editor */ Editor, Boolean] = js.native
  
  @JSImport("slate/dist/editor", "isStart")
  @js.native
  val isStart: js.Function3[/* editor */ Editor, /* point */ Point, /* at */ Location, Boolean] = js.native
  
  @JSImport("slate/dist/editor", "last")
  @js.native
  val last: js.Function2[/* editor */ Editor, /* at */ Location, NodeEntry[Node]] = js.native
  
  @JSImport("slate/dist/editor", "leaf")
  @js.native
  val leaf: js.Function3[
    /* editor */ Editor, 
    /* at */ Location, 
    /* options */ js.UndefOr[EditorLeafOptions], 
    NodeEntry[Text]
  ] = js.native
  
  inline def levels[T /* <: Node */](editor: Editor): Generator[NodeEntry[T], Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("levels")(editor.asInstanceOf[js.Any]).asInstanceOf[Generator[NodeEntry[T], Unit, Unit]]
  inline def levels[T /* <: Node */](editor: Editor, options: EditorLevelsOptions[T]): Generator[NodeEntry[T], Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("levels")(editor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[NodeEntry[T], Unit, Unit]]
  
  @JSImport("slate/dist/editor", "marks")
  @js.native
  val marks: js.Function1[/* editor */ Editor, (Omit[Text, text_]) | Null] = js.native
  
  @JSImport("slate/dist/editor", "next")
  @js.native
  val next: js.Function2[
    /* editor */ Editor, 
    /* options */ js.UndefOr[EditorNextOptions[Descendant]], 
    js.UndefOr[NodeEntry[Descendant]]
  ] = js.native
  
  @JSImport("slate/dist/editor", "node")
  @js.native
  val node: js.Function3[
    /* editor */ Editor, 
    /* at */ Location, 
    /* options */ js.UndefOr[EditorNodeOptions], 
    NodeEntry[Node]
  ] = js.native
  
  inline def nodes[T /* <: Node */](editor: Editor): Generator[NodeEntry[T], Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodes")(editor.asInstanceOf[js.Any]).asInstanceOf[Generator[NodeEntry[T], Unit, Unit]]
  inline def nodes[T /* <: Node */](editor: Editor, options: EditorNodesOptions[T]): Generator[NodeEntry[T], Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodes")(editor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[NodeEntry[T], Unit, Unit]]
  
  @JSImport("slate/dist/editor", "normalize")
  @js.native
  val normalize: js.Function2[/* editor */ Editor, /* options */ js.UndefOr[EditorNormalizeOptions], Unit] = js.native
  
  @JSImport("slate/dist/editor", "parent")
  @js.native
  val parent: js.Function3[
    /* editor */ Editor, 
    /* at */ Location, 
    /* options */ js.UndefOr[EditorParentOptions], 
    NodeEntry[Ancestor]
  ] = js.native
  
  @JSImport("slate/dist/editor", "path")
  @js.native
  val path: js.Function3[
    /* editor */ Editor, 
    /* at */ Location, 
    /* options */ js.UndefOr[EditorPathOptions], 
    Path
  ] = js.native
  
  @JSImport("slate/dist/editor", "pathRef")
  @js.native
  val pathRef: js.Function3[
    /* editor */ Editor, 
    /* path */ Path, 
    /* options */ js.UndefOr[EditorPathRefOptions], 
    PathRef
  ] = js.native
  
  @JSImport("slate/dist/editor", "pathRefs")
  @js.native
  val pathRefs: js.Function1[/* editor */ Editor, Set[PathRef]] = js.native
  
  @JSImport("slate/dist/editor", "point")
  @js.native
  val point: js.Function3[
    /* editor */ Editor, 
    /* at */ Location, 
    /* options */ js.UndefOr[EditorPointOptions], 
    Point
  ] = js.native
  
  @JSImport("slate/dist/editor", "pointRef")
  @js.native
  val pointRef: js.Function3[
    /* editor */ Editor, 
    /* point */ Point, 
    /* options */ js.UndefOr[EditorPointRefOptions], 
    PointRef
  ] = js.native
  
  @JSImport("slate/dist/editor", "pointRefs")
  @js.native
  val pointRefs: js.Function1[/* editor */ Editor, Set[PointRef]] = js.native
  
  inline def positions(editor: Editor): Generator[Point, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("positions")(editor.asInstanceOf[js.Any]).asInstanceOf[Generator[Point, Unit, Unit]]
  inline def positions(editor: Editor, options: EditorPositionsOptions): Generator[Point, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("positions")(editor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[Point, Unit, Unit]]
  
  @JSImport("slate/dist/editor", "previous")
  @js.native
  val previous: js.Function2[
    /* editor */ Editor, 
    /* options */ js.UndefOr[EditorPreviousOptions[Node]], 
    js.UndefOr[NodeEntry[Node]]
  ] = js.native
  
  @JSImport("slate/dist/editor", "range")
  @js.native
  val range: js.Function3[/* editor */ Editor, /* at */ Location, /* to */ js.UndefOr[Location], Range] = js.native
  
  @JSImport("slate/dist/editor", "rangeRef")
  @js.native
  val rangeRef: js.Function3[
    /* editor */ Editor, 
    /* range */ Range, 
    /* options */ js.UndefOr[EditorRangeRefOptions], 
    RangeRef
  ] = js.native
  
  @JSImport("slate/dist/editor", "rangeRefs")
  @js.native
  val rangeRefs: js.Function1[/* editor */ Editor, Set[RangeRef]] = js.native
  
  @JSImport("slate/dist/editor", "removeMark")
  @js.native
  val removeMark: js.Function2[/* editor */ Editor, /* key */ String, Unit] = js.native
  
  @JSImport("slate/dist/editor", "setNormalizing")
  @js.native
  val setNormalizing: js.Function2[/* editor */ Editor, /* isNormalizing */ Boolean, Unit] = js.native
  
  @JSImport("slate/dist/editor", "start")
  @js.native
  val start: js.Function2[/* editor */ Editor, /* at */ Location, Point] = js.native
  
  @JSImport("slate/dist/editor", "string")
  @js.native
  val string: js.Function3[
    /* editor */ Editor, 
    /* at */ Location, 
    /* options */ js.UndefOr[EditorStringOptions], 
    String
  ] = js.native
  
  @JSImport("slate/dist/editor", "unhangRange")
  @js.native
  val unhangRange: js.Function3[
    /* editor */ Editor, 
    /* range */ Range, 
    /* options */ js.UndefOr[EditorUnhangRangeOptions], 
    Range
  ] = js.native
  
  @JSImport("slate/dist/editor", "withoutNormalizing")
  @js.native
  val withoutNormalizing: js.Function2[/* editor */ Editor, /* fn */ js.Function0[Unit], Unit] = js.native
}
