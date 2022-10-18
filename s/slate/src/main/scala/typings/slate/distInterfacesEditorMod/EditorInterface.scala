package typings.slate.distInterfacesEditorMod

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
import typings.slate.slateStrings.text_
import typings.std.Generator
import typings.std.Omit
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorInterface extends StObject {
  
  def above[T /* <: Ancestor */](editor: typings.slate.distInterfacesEditorMod.Editor): js.UndefOr[NodeEntry[T]] = js.native
  def above[T /* <: Ancestor */](editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorAboveOptions[T]): js.UndefOr[NodeEntry[T]] = js.native
  
  def addMark(editor: typings.slate.distInterfacesEditorMod.Editor, key: String, value: Any): Unit = js.native
  
  def after(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): js.UndefOr[Point] = js.native
  def after(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location, options: EditorAfterOptions): js.UndefOr[Point] = js.native
  
  def before(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): js.UndefOr[Point] = js.native
  def before(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location, options: EditorBeforeOptions): js.UndefOr[Point] = js.native
  
  def deleteBackward(editor: typings.slate.distInterfacesEditorMod.Editor): Unit = js.native
  def deleteBackward(editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorDirectedDeletionOptions): Unit = js.native
  
  def deleteForward(editor: typings.slate.distInterfacesEditorMod.Editor): Unit = js.native
  def deleteForward(editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorDirectedDeletionOptions): Unit = js.native
  
  def deleteFragment(editor: typings.slate.distInterfacesEditorMod.Editor): Unit = js.native
  def deleteFragment(editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorFragmentDeletionOptions): Unit = js.native
  
  def edges(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): js.Tuple2[Point, Point] = js.native
  
  def end(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): Point = js.native
  
  def first(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): NodeEntry[Node] = js.native
  
  def fragment(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): js.Array[Descendant] = js.native
  
  def hasBlocks(editor: typings.slate.distInterfacesEditorMod.Editor, element: Element): Boolean = js.native
  
  def hasInlines(editor: typings.slate.distInterfacesEditorMod.Editor, element: Element): Boolean = js.native
  
  def hasPath(editor: typings.slate.distInterfacesEditorMod.Editor, path: Path): Boolean = js.native
  
  def hasTexts(editor: typings.slate.distInterfacesEditorMod.Editor, element: Element): Boolean = js.native
  
  def insertBreak(editor: typings.slate.distInterfacesEditorMod.Editor): Unit = js.native
  
  def insertFragment(editor: typings.slate.distInterfacesEditorMod.Editor, fragment: js.Array[Node]): Unit = js.native
  
  def insertNode(editor: typings.slate.distInterfacesEditorMod.Editor, node: Node): Unit = js.native
  
  def insertSoftBreak(editor: typings.slate.distInterfacesEditorMod.Editor): Unit = js.native
  
  def insertText(editor: typings.slate.distInterfacesEditorMod.Editor, text: String): Unit = js.native
  
  def isBlock(editor: typings.slate.distInterfacesEditorMod.Editor, value: Any): /* is slate.slate/dist/interfaces/element.Element */ Boolean = js.native
  
  def isEdge(editor: typings.slate.distInterfacesEditorMod.Editor, point: Point, at: Location): Boolean = js.native
  
  def isEditor(value: Any): /* is slate.slate/dist/interfaces/editor.Editor */ Boolean = js.native
  
  def isEmpty(editor: typings.slate.distInterfacesEditorMod.Editor, element: Element): Boolean = js.native
  
  def isEnd(editor: typings.slate.distInterfacesEditorMod.Editor, point: Point, at: Location): Boolean = js.native
  
  def isInline(editor: typings.slate.distInterfacesEditorMod.Editor, value: Any): /* is slate.slate/dist/interfaces/element.Element */ Boolean = js.native
  
  def isNormalizing(editor: typings.slate.distInterfacesEditorMod.Editor): Boolean = js.native
  
  def isStart(editor: typings.slate.distInterfacesEditorMod.Editor, point: Point, at: Location): Boolean = js.native
  
  def isVoid(editor: typings.slate.distInterfacesEditorMod.Editor, value: Any): /* is slate.slate/dist/interfaces/element.Element */ Boolean = js.native
  
  def last(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): NodeEntry[Node] = js.native
  
  def leaf(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): NodeEntry[Text] = js.native
  def leaf(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location, options: EditorLeafOptions): NodeEntry[Text] = js.native
  
  def levels[T /* <: Node */](editor: typings.slate.distInterfacesEditorMod.Editor): Generator[NodeEntry[T], Unit, Unit] = js.native
  def levels[T /* <: Node */](editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorLevelsOptions[T]): Generator[NodeEntry[T], Unit, Unit] = js.native
  
  def marks(editor: typings.slate.distInterfacesEditorMod.Editor): (Omit[Text, text_]) | Null = js.native
  
  def next[T /* <: Descendant */](editor: typings.slate.distInterfacesEditorMod.Editor): js.UndefOr[NodeEntry[T]] = js.native
  def next[T /* <: Descendant */](editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorNextOptions[T]): js.UndefOr[NodeEntry[T]] = js.native
  
  def node(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): NodeEntry[Node] = js.native
  def node(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location, options: EditorNodeOptions): NodeEntry[Node] = js.native
  
  def nodes[T /* <: Node */](editor: typings.slate.distInterfacesEditorMod.Editor): Generator[NodeEntry[T], Unit, Unit] = js.native
  def nodes[T /* <: Node */](editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorNodesOptions[T]): Generator[NodeEntry[T], Unit, Unit] = js.native
  
  def normalize(editor: typings.slate.distInterfacesEditorMod.Editor): Unit = js.native
  def normalize(editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorNormalizeOptions): Unit = js.native
  
  def parent(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): NodeEntry[Ancestor] = js.native
  def parent(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location, options: EditorParentOptions): NodeEntry[Ancestor] = js.native
  
  def path(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): Path = js.native
  def path(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location, options: EditorPathOptions): Path = js.native
  
  def pathRef(editor: typings.slate.distInterfacesEditorMod.Editor, path: Path): PathRef = js.native
  def pathRef(editor: typings.slate.distInterfacesEditorMod.Editor, path: Path, options: EditorPathRefOptions): PathRef = js.native
  
  def pathRefs(editor: typings.slate.distInterfacesEditorMod.Editor): Set[PathRef] = js.native
  
  def point(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): Point = js.native
  def point(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location, options: EditorPointOptions): Point = js.native
  
  def pointRef(editor: typings.slate.distInterfacesEditorMod.Editor, point: Point): PointRef = js.native
  def pointRef(editor: typings.slate.distInterfacesEditorMod.Editor, point: Point, options: EditorPointRefOptions): PointRef = js.native
  
  def pointRefs(editor: typings.slate.distInterfacesEditorMod.Editor): Set[PointRef] = js.native
  
  def positions(editor: typings.slate.distInterfacesEditorMod.Editor): Generator[Point, Unit, Unit] = js.native
  def positions(editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorPositionsOptions): Generator[Point, Unit, Unit] = js.native
  
  def previous[T /* <: Node */](editor: typings.slate.distInterfacesEditorMod.Editor): js.UndefOr[NodeEntry[T]] = js.native
  def previous[T /* <: Node */](editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorPreviousOptions[T]): js.UndefOr[NodeEntry[T]] = js.native
  
  def range(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): Range = js.native
  def range(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location, to: Location): Range = js.native
  
  def rangeRef(editor: typings.slate.distInterfacesEditorMod.Editor, range: Range): RangeRef = js.native
  def rangeRef(editor: typings.slate.distInterfacesEditorMod.Editor, range: Range, options: EditorRangeRefOptions): RangeRef = js.native
  
  def rangeRefs(editor: typings.slate.distInterfacesEditorMod.Editor): Set[RangeRef] = js.native
  
  def removeMark(editor: typings.slate.distInterfacesEditorMod.Editor, key: String): Unit = js.native
  
  def setNormalizing(editor: typings.slate.distInterfacesEditorMod.Editor, isNormalizing: Boolean): Unit = js.native
  
  def start(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): Point = js.native
  
  def string(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): String = js.native
  def string(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location, options: EditorStringOptions): String = js.native
  
  def unhangRange(editor: typings.slate.distInterfacesEditorMod.Editor, range: Range): Range = js.native
  def unhangRange(
    editor: typings.slate.distInterfacesEditorMod.Editor,
    range: Range,
    options: EditorUnhangRangeOptions
  ): Range = js.native
  
  def void(editor: typings.slate.distInterfacesEditorMod.Editor): js.UndefOr[NodeEntry[Element]] = js.native
  def void(editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorVoidOptions): js.UndefOr[NodeEntry[Element]] = js.native
  
  def withoutNormalizing(editor: typings.slate.distInterfacesEditorMod.Editor, fn: js.Function0[Unit]): Unit = js.native
}
