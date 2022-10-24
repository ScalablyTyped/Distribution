package typings.slateReact

import typings.react.mod.global.JSX.Element
import typings.slate.distInterfacesEditorMod.BaseEditor
import typings.slate.distInterfacesEditorMod.BaseSelection
import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesPathMod.Path
import typings.slate.distInterfacesPointMod.Point
import typings.slate.distInterfacesRangeMod.Range
import typings.slateReact.anon.Children
import typings.slateReact.anon.Editable
import typings.slateReact.anon.ExactMatch
import typings.slateReact.anon.SuppressThrow
import typings.slateReact.distComponentsEditableMod.EditableProps
import typings.slateReact.distComponentsEditableMod.RenderElementProps
import typings.slateReact.distComponentsEditableMod.RenderLeafProps
import typings.slateReact.distComponentsEditableMod.RenderPlaceholderProps
import typings.slateReact.distPluginReactEditorMod.ReactEditor
import typings.slateReact.distUtilsDiffTextMod.TextDiff
import typings.slateReact.distUtilsDomMod.DOMPoint
import typings.slateReact.distUtilsDomMod.global.Window
import typings.slateReact.distUtilsKeyMod.Key
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

object mod {
  
  @JSImport("slate-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DefaultElement(props: RenderElementProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultElement")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def DefaultLeaf(props: RenderLeafProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultLeaf")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def DefaultPlaceholder(param0: RenderPlaceholderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultPlaceholder")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Editable(props: EditableProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Editable")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object ReactEditor {
    
    @JSImport("slate-react", "ReactEditor")
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
    inline def blur(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("blur")(editor.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Deselect the editor.
      */
    inline def deselect(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deselect")(editor.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Find the DOM node that implements DocumentOrShadowRoot for the editor.
      */
    inline def findDocumentOrShadowRoot(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor): Document | ShadowRoot = ^.asInstanceOf[js.Dynamic].applyDynamic("findDocumentOrShadowRoot")(editor.asInstanceOf[js.Any]).asInstanceOf[Document | ShadowRoot]
    
    /**
      * Get the target range from a DOM `event`.
      */
    inline def findEventRange(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor, event: Any): Range = (^.asInstanceOf[js.Dynamic].applyDynamic("findEventRange")(editor.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Range]
    
    /**
      * Find a key for a Slate node.
      */
    inline def findKey(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor, node: Node): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("findKey")(editor.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Key]
    
    /**
      * Find the path of Slate node.
      */
    inline def findPath(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor, node: Node): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("findPath")(editor.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Path]
    
    /**
      * Focus the editor.
      */
    inline def focus(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focus")(editor.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Return the host window of the current editor.
      */
    inline def getWindow(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindow")(editor.asInstanceOf[js.Any]).asInstanceOf[Window]
    
    /**
      * Check if a DOM node is within the editor.
      */
    inline def hasDOMNode(
      editor: typings.slateReact.distPluginReactEditorMod.ReactEditor,
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode */ Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasDOMNode")(editor.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def hasDOMNode(
      editor: typings.slateReact.distPluginReactEditorMod.ReactEditor,
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode */ Any,
      options: Editable
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasDOMNode")(editor.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def hasRange(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor, range: Range): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasRange")(editor.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Insert data from a `DataTransfer` into the editor.
      */
    inline def insertData(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor, data: DataTransfer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertData")(editor.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Insert fragment data from a `DataTransfer` into the editor.
      */
    inline def insertFragmentData(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor, data: DataTransfer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFragmentData")(editor.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Insert text data from a `DataTransfer` into the editor.
      */
    inline def insertTextData(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor, data: DataTransfer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("insertTextData")(editor.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if the user is currently composing inside the editor.
      */
    inline def isComposing(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComposing")(editor.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the editor is focused.
      */
    inline def isFocused(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocused")(editor.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Check if the editor is in read-only mode.
      */
    inline def isReadOnly(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadOnly")(editor.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Sets data from the currently selected fragment on a `DataTransfer`.
      */
    inline def setFragmentData(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor, data: DataTransfer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFragmentData")(editor.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setFragmentData(
      editor: typings.slateReact.distPluginReactEditorMod.ReactEditor,
      data: DataTransfer,
      originEvent: drag | copy | cut
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFragmentData")(editor.asInstanceOf[js.Any], data.asInstanceOf[js.Any], originEvent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Find the native DOM element from a Slate node.
      */
    inline def toDOMNode(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor, node: Node): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toDOMNode")(editor.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    /**
      * Find a native DOM selection point from a Slate point.
      */
    inline def toDOMPoint(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor, point: Point): DOMPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("toDOMPoint")(editor.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[DOMPoint]
    
    /**
      * Find a native DOM range from a Slate `range`.
      *
      * Notice: the returned range will always be ordinal regardless of the direction of Slate `range` due to DOM API limit.
      *
      * there is no way to create a reverse DOM Range using Range.setStart/setEnd
      * according to https://dom.spec.whatwg.org/#concept-range-bp-set.
      */
    inline def toDOMRange(editor: typings.slateReact.distPluginReactEditorMod.ReactEditor, range: Range): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toDOMRange")(editor.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Find a Slate node from a native DOM `element`.
      */
    inline def toSlateNode(
      editor: typings.slateReact.distPluginReactEditorMod.ReactEditor,
      domNode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode */ Any
    ): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("toSlateNode")(editor.asInstanceOf[js.Any], domNode.asInstanceOf[js.Any])).asInstanceOf[Node]
    
    /**
      * Find a Slate point from a DOM selection's `domNode` and `domOffset`.
      */
    inline def toSlatePoint[T /* <: Boolean */](
      editor: typings.slateReact.distPluginReactEditorMod.ReactEditor,
      domPoint: DOMPoint,
      options: ExactMatch[T]
    ): /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? slate.slate/dist/interfaces/point.BasePoint | null : slate.slate/dist/interfaces/point.BasePoint */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toSlatePoint")(editor.asInstanceOf[js.Any], domPoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends true ? slate.slate/dist/interfaces/point.BasePoint | null : slate.slate/dist/interfaces/point.BasePoint */ js.Any]
    
    /**
      * Find a Slate range from a DOM range or selection.
      */
    inline def toSlateRange[T_1 /* <: Boolean */](
      editor: typings.slateReact.distPluginReactEditorMod.ReactEditor,
      domRange: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMRange */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMStaticRange */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMSelection */ Any,
      options: SuppressThrow[T_1]
    ): /* import warning: importer.ImportType#apply Failed type conversion: T_1 extends true ? slate.slate/dist/interfaces/editor.BaseSelection : / * Inlined slate.slate.BaseRange & {  placeholder :string | undefined} * /
    {  anchor :slate.slate/dist/interfaces/point.Point,   focus :slate.slate/dist/interfaces/point.Point,   placeholder :string | undefined} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toSlateRange")(editor.asInstanceOf[js.Any], domRange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T_1 extends true ? slate.slate/dist/interfaces/editor.BaseSelection : / * Inlined slate.slate.BaseRange & {  placeholder :string | undefined} * /
    {  anchor :slate.slate/dist/interfaces/point.Point,   focus :slate.slate/dist/interfaces/point.Point,   placeholder :string | undefined} */ js.Any]
  }
  
  inline def Slate(props: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Slate")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useEditor(): ReactEditor = ^.asInstanceOf[js.Dynamic].applyDynamic("useEditor")().asInstanceOf[ReactEditor]
  
  inline def useFocused(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocused")().asInstanceOf[Boolean]
  
  inline def useReadOnly(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useReadOnly")().asInstanceOf[Boolean]
  
  inline def useSelected(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelected")().asInstanceOf[Boolean]
  
  inline def useSlate(): Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlate")().asInstanceOf[Editor]
  
  inline def useSlateSelection(): BaseSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlateSelection")().asInstanceOf[BaseSelection]
  
  inline def useSlateSelector[T](selector: js.Function1[/* editor */ Editor, T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlateSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useSlateSelector[T](
    selector: js.Function1[/* editor */ Editor, T],
    equalityFn: js.Function2[/* a */ T, /* b */ T, Boolean]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useSlateSelector")(selector.asInstanceOf[js.Any], equalityFn.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useSlateStatic(): Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlateStatic")().asInstanceOf[Editor]
  
  inline def useSlateWithV(): typings.slateReact.anon.Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlateWithV")().asInstanceOf[typings.slateReact.anon.Editor]
  
  inline def withReact[T /* <: BaseEditor */](editor: T): T & ReactEditor = ^.asInstanceOf[js.Dynamic].applyDynamic("withReact")(editor.asInstanceOf[js.Any]).asInstanceOf[T & ReactEditor]
}
