package typings.slateReact

import typings.slate.editorMod.BaseEditor
import typings.slate.editorMod.BaseSelection
import typings.slate.editorMod.Editor
import typings.slate.nodeMod.Node
import typings.slate.pathMod.Path
import typings.slate.pointMod.BasePoint
import typings.slate.pointMod.Point
import typings.slate.rangeMod.Range
import typings.slateReact.anon.BaseRangeplaceholderstrin
import typings.slateReact.anon.Editable
import typings.slateReact.anon.ExactMatch
import typings.slateReact.anon.SuppressThrow
import typings.slateReact.diffTextMod.TextDiff
import typings.slateReact.domMod.DOMPoint
import typings.slateReact.domMod.global.Window
import typings.slateReact.keyMod.Key
import typings.slateReact.slateReactStrings.copy
import typings.slateReact.slateReactStrings.cut
import typings.slateReact.slateReactStrings.drag
import typings.std.DataTransfer
import typings.std.Document
import typings.std.HTMLElement
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactEditorMod {
  
  @js.native
  trait ReactEditor
    extends StObject
       with BaseEditor {
    
    def hasRange(editor: ReactEditor, range: Range): Boolean = js.native
    
    def insertData(data: DataTransfer): Unit = js.native
    
    def insertFragmentData(data: DataTransfer): Boolean = js.native
    
    def insertTextData(data: DataTransfer): Boolean = js.native
    
    def setFragmentData(data: DataTransfer): Unit = js.native
    def setFragmentData(data: DataTransfer, originEvent: drag | copy | cut): Unit = js.native
  }
  object ReactEditor {
    
    @JSImport("slate-react/dist/plugin/react-editor", "ReactEditor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Experimental and android specific: Get pending diffs
      */
    inline def androidPendingDiffs(editor: Editor): js.UndefOr[js.Array[TextDiff]] = ^.asInstanceOf[js.Dynamic].applyDynamic("androidPendingDiffs")(editor.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[TextDiff]]]
    
    /**
      * Experimental and android specific: Flush all pending diffs and cancel composition at the next possible time.
      */
    inline def androidScheduleFlush(editor: Editor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("androidScheduleFlush")(editor.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Blur the editor.
      */
    inline def blur(editor: ReactEditor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("blur")(editor.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Deselect the editor.
      */
    inline def deselect(editor: ReactEditor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deselect")(editor.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Find the DOM node that implements DocumentOrShadowRoot for the editor.
      */
    inline def findDocumentOrShadowRoot(editor: ReactEditor): Document | ShadowRoot = ^.asInstanceOf[js.Dynamic].applyDynamic("findDocumentOrShadowRoot")(editor.asInstanceOf[js.Any]).asInstanceOf[Document | ShadowRoot]
    
    /**
      * Get the target range from a DOM `event`.
      */
    inline def findEventRange(editor: ReactEditor, event: Any): Range = (^.asInstanceOf[js.Dynamic].applyDynamic("findEventRange")(editor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Range]
    
    /**
      * Find a key for a Slate node.
      */
    inline def findKey(editor: ReactEditor, node: Node): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("findKey")(editor.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Key]
    
    /**
      * Find the path of Slate node.
      */
    inline def findPath(editor: ReactEditor, node: Node): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("findPath")(editor.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Path]
    
    /**
      * Focus the editor.
      */
    inline def focus(editor: ReactEditor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focus")(editor.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Return the host window of the current editor.
      */
    inline def getWindow(editor: ReactEditor): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindow")(editor.asInstanceOf[js.Any]).asInstanceOf[Window]
    
    /**
      * Check if a DOM node is within the editor.
      */
    inline def hasDOMNode(
      editor: ReactEditor,
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode */ Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasDOMNode")(editor.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def hasDOMNode(
      editor: ReactEditor,
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode */ Any,
      options: Editable
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasDOMNode")(editor.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def hasRange(editor: ReactEditor, range: Range): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasRange")(editor.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Insert data from a `DataTransfer` into the editor.
      */
    inline def insertData(editor: ReactEditor, data: DataTransfer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertData")(editor.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Insert fragment data from a `DataTransfer` into the editor.
      */
    inline def insertFragmentData(editor: ReactEditor, data: DataTransfer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFragmentData")(editor.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Insert text data from a `DataTransfer` into the editor.
      */
    inline def insertTextData(editor: ReactEditor, data: DataTransfer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("insertTextData")(editor.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the user is currently composing inside the editor.
      */
    inline def isComposing(editor: ReactEditor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComposing")(editor.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the editor is focused.
      */
    inline def isFocused(editor: ReactEditor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocused")(editor.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the editor is in read-only mode.
      */
    inline def isReadOnly(editor: ReactEditor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadOnly")(editor.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Sets data from the currently selected fragment on a `DataTransfer`.
      */
    inline def setFragmentData(editor: ReactEditor, data: DataTransfer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFragmentData")(editor.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setFragmentData(editor: ReactEditor, data: DataTransfer, originEvent: drag | copy | cut): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFragmentData")(editor.asInstanceOf[js.Any], data.asInstanceOf[js.Any], originEvent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Find the native DOM element from a Slate node.
      */
    inline def toDOMNode(editor: ReactEditor, node: Node): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toDOMNode")(editor.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    /**
      * Find a native DOM selection point from a Slate point.
      */
    inline def toDOMPoint(editor: ReactEditor, point: Point): DOMPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("toDOMPoint")(editor.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[DOMPoint]
    
    /**
      * Find a native DOM range from a Slate `range`.
      *
      * Notice: the returned range will always be ordinal regardless of the direction of Slate `range` due to DOM API limit.
      *
      * there is no way to create a reverse DOM Range using Range.setStart/setEnd
      * according to https://dom.spec.whatwg.org/#concept-range-bp-set.
      */
    inline def toDOMRange(editor: ReactEditor, range: Range): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toDOMRange")(editor.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Find a Slate node from a native DOM `element`.
      */
    inline def toSlateNode(
      editor: ReactEditor,
      domNode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode */ Any
    ): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("toSlateNode")(editor.asInstanceOf[js.Any], domNode.asInstanceOf[js.Any])).asInstanceOf[Node]
    
    /**
      * Find a Slate point from a DOM selection's `domNode` and `domOffset`.
      */
    inline def toSlatePoint[T /* <: Boolean */](editor: ReactEditor, domPoint: DOMPoint, options: ExactMatch[T]): BasePoint | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("toSlatePoint")(editor.asInstanceOf[js.Any], domPoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BasePoint | Null]
    
    /**
      * Find a Slate range from a DOM range or selection.
      */
    inline def toSlateRange[T_1 /* <: Boolean */](
      editor: ReactEditor,
      domRange: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMRange */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMStaticRange */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMSelection */ Any,
      options: SuppressThrow[T_1]
    ): BaseRangeplaceholderstrin | BaseSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("toSlateRange")(editor.asInstanceOf[js.Any], domRange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BaseRangeplaceholderstrin | BaseSelection]
  }
}
