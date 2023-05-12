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
import typings.slate.distInterfacesTransformsNodeMod.NodeInsertNodesOptions
import typings.slate.distInterfacesTransformsTextMod.TextInsertFragmentOptions
import typings.slate.distInterfacesTransformsTextMod.TextInsertTextOptions
import typings.slate.slateStrings.text_
import typings.std.Generator
import typings.std.Omit
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorInterface extends StObject {
  
  /**
    * Get the ancestor above a location in the document.
    */
  def above[T /* <: Ancestor */](editor: typings.slate.distInterfacesEditorMod.Editor): js.UndefOr[NodeEntry[T]] = js.native
  def above[T /* <: Ancestor */](editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorAboveOptions[T]): js.UndefOr[NodeEntry[T]] = js.native
  
  /**
    * Add a custom property to the leaf text nodes in the current selection.
    *
    * If the selection is currently collapsed, the marks will be added to the
    * `editor.marks` property instead, and applied when text is inserted next.
    */
  def addMark(editor: typings.slate.distInterfacesEditorMod.Editor, key: String, value: Any): Unit = js.native
  
  /**
    * Get the point after a location.
    */
  def after(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): js.UndefOr[Point] = js.native
  def after(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location, options: EditorAfterOptions): js.UndefOr[Point] = js.native
  
  /**
    * Get the point before a location.
    */
  def before(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): js.UndefOr[Point] = js.native
  def before(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location, options: EditorBeforeOptions): js.UndefOr[Point] = js.native
  
  /**
    * Delete content in the editor backward from the current selection.
    */
  def deleteBackward(editor: typings.slate.distInterfacesEditorMod.Editor): Unit = js.native
  def deleteBackward(editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorDirectedDeletionOptions): Unit = js.native
  
  /**
    * Delete content in the editor forward from the current selection.
    */
  def deleteForward(editor: typings.slate.distInterfacesEditorMod.Editor): Unit = js.native
  def deleteForward(editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorDirectedDeletionOptions): Unit = js.native
  
  /**
    * Delete the content in the current selection.
    */
  def deleteFragment(editor: typings.slate.distInterfacesEditorMod.Editor): Unit = js.native
  def deleteFragment(editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorFragmentDeletionOptions): Unit = js.native
  
  /**
    * Get the start and end points of a location.
    */
  def edges(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): js.Tuple2[Point, Point] = js.native
  
  /**
    * Match a read-only element in the current branch of the editor.
    */
  def elementReadOnly(editor: typings.slate.distInterfacesEditorMod.Editor): js.UndefOr[NodeEntry[Element]] = js.native
  def elementReadOnly(editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorElementReadOnlyOptions): js.UndefOr[NodeEntry[Element]] = js.native
  
  /**
    * Get the end point of a location.
    */
  def end(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): Point = js.native
  
  /**
    * Get the first node at a location.
    */
  def first(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): NodeEntry[Node] = js.native
  
  /**
    * Get the fragment at a location.
    */
  def fragment(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): js.Array[Descendant] = js.native
  
  /**
    * Check if a node has block children.
    */
  def hasBlocks(editor: typings.slate.distInterfacesEditorMod.Editor, element: Element): Boolean = js.native
  
  /**
    * Check if a node has inline and text children.
    */
  def hasInlines(editor: typings.slate.distInterfacesEditorMod.Editor, element: Element): Boolean = js.native
  
  def hasPath(editor: typings.slate.distInterfacesEditorMod.Editor, path: Path): Boolean = js.native
  
  /**
    * Check if a node has text children.
    */
  def hasTexts(editor: typings.slate.distInterfacesEditorMod.Editor, element: Element): Boolean = js.native
  
  /**
    * Insert a block break at the current selection.
    *
    * If the selection is currently expanded, it will be deleted first.
    */
  def insertBreak(editor: typings.slate.distInterfacesEditorMod.Editor): Unit = js.native
  
  /**
    * Inserts a fragment
    * at the specified location or (if not defined) the current selection or (if not defined) the end of the document.
    */
  def insertFragment(editor: typings.slate.distInterfacesEditorMod.Editor, fragment: js.Array[Node]): Unit = js.native
  def insertFragment(
    editor: typings.slate.distInterfacesEditorMod.Editor,
    fragment: js.Array[Node],
    options: TextInsertFragmentOptions
  ): Unit = js.native
  
  /**
    * Atomically inserts `nodes`
    * at the specified location or (if not defined) the current selection or (if not defined) the end of the document.
    */
  def insertNode[T /* <: Node */](editor: typings.slate.distInterfacesEditorMod.Editor, node: Node): Unit = js.native
  def insertNode[T /* <: Node */](
    editor: typings.slate.distInterfacesEditorMod.Editor,
    node: Node,
    options: NodeInsertNodesOptions[T]
  ): Unit = js.native
  
  /**
    * Insert a soft break at the current selection.
    *
    * If the selection is currently expanded, it will be deleted first.
    */
  def insertSoftBreak(editor: typings.slate.distInterfacesEditorMod.Editor): Unit = js.native
  
  /**
    * Insert a string of text
    * at the specified location or (if not defined) the current selection or (if not defined) the end of the document.
    */
  def insertText(editor: typings.slate.distInterfacesEditorMod.Editor, text: String): Unit = js.native
  def insertText(editor: typings.slate.distInterfacesEditorMod.Editor, text: String, options: TextInsertTextOptions): Unit = js.native
  
  /**
    * Check if a value is a block `Element` object.
    */
  def isBlock(editor: typings.slate.distInterfacesEditorMod.Editor, value: Element): Boolean = js.native
  
  /**
    * Check if a point is an edge of a location.
    */
  def isEdge(editor: typings.slate.distInterfacesEditorMod.Editor, point: Point, at: Location): Boolean = js.native
  
  /**
    * Check if a value is an `Editor` object.
    */
  def isEditor(value: Any): /* is slate.slate/dist/interfaces/editor.Editor */ Boolean = js.native
  
  /**
    * Check if a value is a read-only `Element` object.
    */
  def isElementReadOnly(editor: typings.slate.distInterfacesEditorMod.Editor, element: Element): Boolean = js.native
  
  /**
    * Check if an element is empty, accounting for void nodes.
    */
  def isEmpty(editor: typings.slate.distInterfacesEditorMod.Editor, element: Element): Boolean = js.native
  
  /**
    * Check if a point is the end point of a location.
    */
  def isEnd(editor: typings.slate.distInterfacesEditorMod.Editor, point: Point, at: Location): Boolean = js.native
  
  /**
    * Check if a value is an inline `Element` object.
    */
  def isInline(editor: typings.slate.distInterfacesEditorMod.Editor, value: Element): Boolean = js.native
  
  /**
    * Check if the editor is currently normalizing after each operation.
    */
  def isNormalizing(editor: typings.slate.distInterfacesEditorMod.Editor): Boolean = js.native
  
  /**
    * Check if a value is a selectable `Element` object.
    */
  def isSelectable(editor: typings.slate.distInterfacesEditorMod.Editor, element: Element): Boolean = js.native
  
  /**
    * Check if a point is the start point of a location.
    */
  def isStart(editor: typings.slate.distInterfacesEditorMod.Editor, point: Point, at: Location): Boolean = js.native
  
  /**
    * Check if a value is a void `Element` object.
    */
  def isVoid(editor: typings.slate.distInterfacesEditorMod.Editor, value: Element): Boolean = js.native
  
  /**
    * Get the last node at a location.
    */
  def last(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): NodeEntry[Node] = js.native
  
  /**
    * Get the leaf text node at a location.
    */
  def leaf(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): NodeEntry[Text] = js.native
  def leaf(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location, options: EditorLeafOptions): NodeEntry[Text] = js.native
  
  /**
    * Iterate through all of the levels at a location.
    */
  def levels[T /* <: Node */](editor: typings.slate.distInterfacesEditorMod.Editor): Generator[NodeEntry[T], Unit, Unit] = js.native
  def levels[T /* <: Node */](editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorLevelsOptions[T]): Generator[NodeEntry[T], Unit, Unit] = js.native
  
  /**
    * Get the marks that would be added to text at the current selection.
    */
  def marks(editor: typings.slate.distInterfacesEditorMod.Editor): (Omit[Text, text_]) | Null = js.native
  
  /**
    * Get the matching node in the branch of the document after a location.
    */
  def next[T /* <: Descendant */](editor: typings.slate.distInterfacesEditorMod.Editor): js.UndefOr[NodeEntry[T]] = js.native
  def next[T /* <: Descendant */](editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorNextOptions[T]): js.UndefOr[NodeEntry[T]] = js.native
  
  /**
    * Get the node at a location.
    */
  def node(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): NodeEntry[Node] = js.native
  def node(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location, options: EditorNodeOptions): NodeEntry[Node] = js.native
  
  /**
    * Iterate through all of the nodes in the Editor.
    */
  def nodes[T /* <: Node */](editor: typings.slate.distInterfacesEditorMod.Editor): Generator[NodeEntry[T], Unit, Unit] = js.native
  def nodes[T /* <: Node */](editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorNodesOptions[T]): Generator[NodeEntry[T], Unit, Unit] = js.native
  
  /**
    * Normalize any dirty objects in the editor.
    */
  def normalize(editor: typings.slate.distInterfacesEditorMod.Editor): Unit = js.native
  def normalize(editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorNormalizeOptions): Unit = js.native
  
  /**
    * Get the parent node of a location.
    */
  def parent(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): NodeEntry[Ancestor] = js.native
  def parent(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location, options: EditorParentOptions): NodeEntry[Ancestor] = js.native
  
  /**
    * Get the path of a location.
    */
  def path(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): Path = js.native
  def path(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location, options: EditorPathOptions): Path = js.native
  
  /**
    * Create a mutable ref for a `Path` object, which will stay in sync as new
    * operations are applied to the editor.
    */
  def pathRef(editor: typings.slate.distInterfacesEditorMod.Editor, path: Path): PathRef = js.native
  def pathRef(editor: typings.slate.distInterfacesEditorMod.Editor, path: Path, options: EditorPathRefOptions): PathRef = js.native
  
  /**
    * Get the set of currently tracked path refs of the editor.
    */
  def pathRefs(editor: typings.slate.distInterfacesEditorMod.Editor): Set[PathRef] = js.native
  
  /**
    * Get the start or end point of a location.
    */
  def point(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): Point = js.native
  def point(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location, options: EditorPointOptions): Point = js.native
  
  /**
    * Create a mutable ref for a `Point` object, which will stay in sync as new
    * operations are applied to the editor.
    */
  def pointRef(editor: typings.slate.distInterfacesEditorMod.Editor, point: Point): PointRef = js.native
  def pointRef(editor: typings.slate.distInterfacesEditorMod.Editor, point: Point, options: EditorPointRefOptions): PointRef = js.native
  
  /**
    * Get the set of currently tracked point refs of the editor.
    */
  def pointRefs(editor: typings.slate.distInterfacesEditorMod.Editor): Set[PointRef] = js.native
  
  /**
    * Return all the positions in `at` range where a `Point` can be placed.
    *
    * By default, moves forward by individual offsets at a time, but
    * the `unit` option can be used to to move by character, word, line, or block.
    *
    * The `reverse` option can be used to change iteration direction.
    *
    * Note: By default void nodes are treated as a single point and iteration
    * will not happen inside their content unless you pass in true for the
    * `voids` option, then iteration will occur.
    */
  def positions(editor: typings.slate.distInterfacesEditorMod.Editor): Generator[Point, Unit, Unit] = js.native
  def positions(editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorPositionsOptions): Generator[Point, Unit, Unit] = js.native
  
  /**
    * Get the matching node in the branch of the document before a location.
    */
  def previous[T /* <: Node */](editor: typings.slate.distInterfacesEditorMod.Editor): js.UndefOr[NodeEntry[T]] = js.native
  def previous[T /* <: Node */](editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorPreviousOptions[T]): js.UndefOr[NodeEntry[T]] = js.native
  
  /**
    * Get a range of a location.
    */
  def range(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): Range = js.native
  def range(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location, to: Location): Range = js.native
  
  /**
    * Create a mutable ref for a `Range` object, which will stay in sync as new
    * operations are applied to the editor.
    */
  def rangeRef(editor: typings.slate.distInterfacesEditorMod.Editor, range: Range): RangeRef = js.native
  def rangeRef(editor: typings.slate.distInterfacesEditorMod.Editor, range: Range, options: EditorRangeRefOptions): RangeRef = js.native
  
  /**
    * Get the set of currently tracked range refs of the editor.
    */
  def rangeRefs(editor: typings.slate.distInterfacesEditorMod.Editor): Set[RangeRef] = js.native
  
  /**
    * Remove a custom property from all of the leaf text nodes in the current
    * selection.
    *
    * If the selection is currently collapsed, the removal will be stored on
    * `editor.marks` and applied to the text inserted next.
    */
  def removeMark(editor: typings.slate.distInterfacesEditorMod.Editor, key: String): Unit = js.native
  
  /**
    * Manually set if the editor should currently be normalizing.
    *
    * Note: Using this incorrectly can leave the editor in an invalid state.
    *
    */
  def setNormalizing(editor: typings.slate.distInterfacesEditorMod.Editor, isNormalizing: Boolean): Unit = js.native
  
  /**
    * Get the start point of a location.
    */
  def start(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): Point = js.native
  
  /**
    * Get the text string content of a location.
    *
    * Note: by default the text of void nodes is considered to be an empty
    * string, regardless of content, unless you pass in true for the voids option
    */
  def string(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location): String = js.native
  def string(editor: typings.slate.distInterfacesEditorMod.Editor, at: Location, options: EditorStringOptions): String = js.native
  
  /**
    * Convert a range into a non-hanging one.
    */
  def unhangRange(editor: typings.slate.distInterfacesEditorMod.Editor, range: Range): Range = js.native
  def unhangRange(
    editor: typings.slate.distInterfacesEditorMod.Editor,
    range: Range,
    options: EditorUnhangRangeOptions
  ): Range = js.native
  
  /**
    * Match a void node in the current branch of the editor.
    */
  def void(editor: typings.slate.distInterfacesEditorMod.Editor): js.UndefOr[NodeEntry[Element]] = js.native
  def void(editor: typings.slate.distInterfacesEditorMod.Editor, options: EditorVoidOptions): js.UndefOr[NodeEntry[Element]] = js.native
  
  /**
    * Call a function, deferring normalization until after it completes.
    */
  def withoutNormalizing(editor: typings.slate.distInterfacesEditorMod.Editor, fn: js.Function0[Unit]): Unit = js.native
}
