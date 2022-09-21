package typings.quill

import org.scalablytyped.runtime.StringDictionary
import typings.quill.anon.Html
import typings.quill.quillBooleans.`false`
import typings.quill.quillBooleans.`true`
import typings.quill.quillStrings.`editor-change`
import typings.quill.quillStrings.`selection-change`
import typings.quill.quillStrings.`text-change`
import typings.quill.quillStrings.api
import typings.quill.quillStrings.silent
import typings.quill.quillStrings.user
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("quill", JSImport.Default)
  @js.native
  open class default protected () extends Quill {
    def this(container: String) = this()
    def this(container: Element) = this()
    def this(container: String, options: QuillOptionsStatic) = this()
    def this(container: Element, options: QuillOptionsStatic) = this()
  }
  /* static members */
  object default {
    
    @JSImport("quill", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // static methods: debug, import, register, find
    inline def debug(level: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def debug(level: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def find(domNode: Node): Quill | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(domNode.asInstanceOf[js.Any]).asInstanceOf[Quill | Any]
    inline def find(domNode: Node, bubble: Boolean): Quill | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(domNode.asInstanceOf[js.Any], bubble.asInstanceOf[js.Any])).asInstanceOf[Quill | Any]
    
    inline def `import`(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("import")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def register(defs: StringMap): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(defs.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def register(defs: StringMap, suppressWarning: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(defs.asInstanceOf[js.Any], suppressWarning.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def register(path: String, `def`: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(path.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def register(path: String, `def`: Any, suppressWarning: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(path.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], suppressWarning.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("quill", "default.sources")
    @js.native
    val sources: SourceMap = js.native
  }
  
  @JSImport("quill", "Quill")
  @js.native
  open class Quill protected ()
    extends StObject
       with EventEmitter {
    def this(container: String) = this()
    def this(container: Element) = this()
    def this(container: String, options: QuillOptionsStatic) = this()
    def this(container: Element, options: QuillOptionsStatic) = this()
    
    def addContainer(classNameOrDomNode: String): Any = js.native
    def addContainer(classNameOrDomNode: String, refNode: Node): Any = js.native
    def addContainer(classNameOrDomNode: Node): Any = js.native
    def addContainer(classNameOrDomNode: Node, refNode: Node): Any = js.native
    
    def blur(): Unit = js.native
    
    var clipboard: ClipboardStatic = js.native
    
    def deleteText(index: Double, length: Double): Any = js.native
    def deleteText(index: Double, length: Double, source: Sources): Any = js.native
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    def enable(enabled: Boolean): Unit = js.native
    
    def focus(): Unit = js.native
    
    def format(name: String, value: Any): Any = js.native
    def format(name: String, value: Any, source: Sources): Any = js.native
    
    def formatLine(index: Double, length: Double): Any = js.native
    def formatLine(index: Double, length: Double, format: String, value: Any): Any = js.native
    def formatLine(index: Double, length: Double, format: String, value: Any, source: Sources): Any = js.native
    def formatLine(index: Double, length: Double, formats: StringMap): Any = js.native
    def formatLine(index: Double, length: Double, formats: StringMap, source: Sources): Any = js.native
    def formatLine(index: Double, length: Double, source: Sources): Any = js.native
    
    def formatText(index: Double, length: Double): Any = js.native
    def formatText(index: Double, length: Double, format: String, value: Any): Any = js.native
    def formatText(index: Double, length: Double, format: String, value: Any, source: Sources): Any = js.native
    def formatText(index: Double, length: Double, formats: StringMap): Any = js.native
    def formatText(index: Double, length: Double, formats: StringMap, source: Sources): Any = js.native
    def formatText(index: Double, length: Double, source: Sources): Any = js.native
    def formatText(range: RangeStatic, format: String, value: Any): Any = js.native
    def formatText(range: RangeStatic, format: String, value: Any, source: Sources): Any = js.native
    def formatText(range: RangeStatic, formats: StringMap): Any = js.native
    def formatText(range: RangeStatic, formats: StringMap, source: Sources): Any = js.native
    
    def getBounds(index: Double): BoundsStatic = js.native
    def getBounds(index: Double, length: Double): BoundsStatic = js.native
    
    def getContents(): Any = js.native
    def getContents(index: Double): Any = js.native
    def getContents(index: Double, length: Double): Any = js.native
    def getContents(index: Unit, length: Double): Any = js.native
    
    def getFormat(): StringMap = js.native
    def getFormat(index: Double): StringMap = js.native
    def getFormat(index: Double, length: Double): StringMap = js.native
    def getFormat(range: RangeStatic): StringMap = js.native
    
    // Blot interface is not exported on Parchment
    def getIndex(blot: Any): Double = js.native
    
    def getLeaf(index: Double): Any = js.native
    
    def getLength(): Double = js.native
    
    def getLine(index: Double): js.Tuple2[Any, Double] = js.native
    
    def getLines(): js.Array[Any] = js.native
    def getLines(index: Double): js.Array[Any] = js.native
    def getLines(index: Double, length: Double): js.Array[Any] = js.native
    def getLines(index: Unit, length: Double): js.Array[Any] = js.native
    def getLines(range: RangeStatic): js.Array[Any] = js.native
    
    def getModule(name: String): Any = js.native
    
    def getSelection(): RangeStatic | Null = js.native
    @JSName("getSelection")
    def getSelection_false(focus: `false`): RangeStatic | Null = js.native
    @JSName("getSelection")
    def getSelection_true(focus: `true`): RangeStatic = js.native
    
    def getText(): String = js.native
    def getText(index: Double): String = js.native
    def getText(index: Double, length: Double): String = js.native
    def getText(index: Unit, length: Double): String = js.native
    
    def hasFocus(): Boolean = js.native
    
    def insertEmbed(index: Double, `type`: String, value: Any): Any = js.native
    def insertEmbed(index: Double, `type`: String, value: Any, source: Sources): Any = js.native
    
    def insertText(index: Double, text: String): Any = js.native
    def insertText(index: Double, text: String, format: String, value: Any): Any = js.native
    def insertText(index: Double, text: String, format: String, value: Any, source: Sources): Any = js.native
    def insertText(index: Double, text: String, formats: StringMap): Any = js.native
    def insertText(index: Double, text: String, formats: StringMap, source: Sources): Any = js.native
    def insertText(index: Double, text: String, source: Sources): Any = js.native
    
    def isEnabled(): Boolean = js.native
    
    var keyboard: KeyboardStatic = js.native
    
    /**
      * @deprecated Remove in 2.0. Use clipboard.dangerouslyPasteHTML(html: string, source: Sources): void;
      */
    def pasteHTML(html: String): String = js.native
    def pasteHTML(html: String, source: Sources): String = js.native
    /**
      * @deprecated Remove in 2.0. Use clipboard.dangerouslyPasteHTML(index: number, html: string, source: Sources)
      */
    def pasteHTML(index: Double, html: String): String = js.native
    def pasteHTML(index: Double, html: String, source: Sources): String = js.native
    
    def removeFormat(index: Double, length: Double): Any = js.native
    def removeFormat(index: Double, length: Double, source: Sources): Any = js.native
    
    /**
      * Internal API
      */
    var root: HTMLDivElement = js.native
    
    var scroll: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Blot */ Any = js.native
    
    def setContents(
      delta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ Any
    ): Any = js.native
    def setContents(
      delta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ Any,
      source: Sources
    ): Any = js.native
    
    def setSelection(index: Double, length: Double): Unit = js.native
    def setSelection(index: Double, length: Double, source: Sources): Unit = js.native
    def setSelection(range: RangeStatic): Unit = js.native
    def setSelection(range: RangeStatic, source: Sources): Unit = js.native
    
    def setText(text: String): Any = js.native
    def setText(text: String, source: Sources): Any = js.native
    
    def update(): Unit = js.native
    def update(source: Sources): Unit = js.native
    
    def updateContents(
      delta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ Any
    ): Any = js.native
    def updateContents(
      delta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ Any,
      source: Sources
    ): Any = js.native
  }
  /* static members */
  object Quill {
    
    @JSImport("quill", "Quill")
    @js.native
    val ^ : js.Any = js.native
    
    // static methods: debug, import, register, find
    inline def debug(level: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def debug(level: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def find(domNode: Node): Quill | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(domNode.asInstanceOf[js.Any]).asInstanceOf[Quill | Any]
    inline def find(domNode: Node, bubble: Boolean): Quill | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(domNode.asInstanceOf[js.Any], bubble.asInstanceOf[js.Any])).asInstanceOf[Quill | Any]
    
    inline def `import`(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("import")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def register(defs: StringMap): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(defs.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def register(defs: StringMap, suppressWarning: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(defs.asInstanceOf[js.Any], suppressWarning.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def register(path: String, `def`: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(path.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def register(path: String, `def`: Any, suppressWarning: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(path.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], suppressWarning.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("quill", "Quill.sources")
    @js.native
    val sources: SourceMap = js.native
  }
  
  @JSImport("quill", "RangeStatic")
  @js.native
  open class RangeStatic () extends StObject {
    
    var index: Double = js.native
    
    var length: Double = js.native
  }
  
  trait BoundsStatic extends StObject {
    
    var bottom: Double
    
    var height: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
    
    var width: Double
  }
  object BoundsStatic {
    
    inline def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): BoundsStatic = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundsStatic]
    }
    
    extension [Self <: BoundsStatic](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type ClipboardMatcherCallback = js.Function2[
    /* node */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* delta */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ Any
  ]
  
  type ClipboardMatcherNode = String | Double
  
  @js.native
  trait ClipboardStatic extends StObject {
    
    def addMatcher(selectorOrNodeType: ClipboardMatcherNode, callback: ClipboardMatcherCallback): Unit = js.native
    
    def convert(): Any = js.native
    def convert(content: Unit, formats: StringMap): Any = js.native
    def convert(content: Html): Any = js.native
    def convert(content: Html, formats: StringMap): Any = js.native
    
    def dangerouslyPasteHTML(html: String): Unit = js.native
    def dangerouslyPasteHTML(html: String, source: Sources): Unit = js.native
    def dangerouslyPasteHTML(index: Double, html: String): Unit = js.native
    def dangerouslyPasteHTML(index: Double, html: String, source: Sources): Unit = js.native
    
    var matchers: js.Array[js.Tuple2[ClipboardMatcherNode, ClipboardMatcherCallback]] = js.native
  }
  
  trait DeltaOperation
    extends StObject
       with OptionalAttributes {
    
    var delete: js.UndefOr[Double] = js.undefined
    
    var insert: js.UndefOr[Any] = js.undefined
    
    var retain: js.UndefOr[Double] = js.undefined
  }
  object DeltaOperation {
    
    inline def apply(): DeltaOperation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeltaOperation]
    }
    
    extension [Self <: DeltaOperation](x: Self) {
      
      inline def setDelete(value: Double): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setInsert(value: Any): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setRetain(value: Double): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      inline def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
    }
  }
  
  type EditorChangeHandler = js.Function4[
    `text-change` | `selection-change`, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* delta */ Any) | (/* range */ RangeStatic), 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* oldContents */ Any) | (/* oldRange */ RangeStatic), 
    /* source */ Sources, 
    Any
  ]
  
  @js.native
  trait EventEmitter extends StObject {
    
    @JSName("off")
    def off_editorchange(eventName: `editor-change`, handler: EditorChangeHandler): EventEmitter = js.native
    @JSName("off")
    def off_selectionchange(eventName: `selection-change`, handler: SelectionChangeHandler): EventEmitter = js.native
    @JSName("off")
    def off_textchange(eventName: `text-change`, handler: TextChangeHandler): EventEmitter = js.native
    
    @JSName("on")
    def on_editorchange(eventName: `editor-change`, handler: EditorChangeHandler): EventEmitter = js.native
    @JSName("on")
    def on_selectionchange(eventName: `selection-change`, handler: SelectionChangeHandler): EventEmitter = js.native
    @JSName("on")
    def on_textchange(eventName: `text-change`, handler: TextChangeHandler): EventEmitter = js.native
    
    @JSName("once")
    def once_editorchange(eventName: `editor-change`, handler: EditorChangeHandler): EventEmitter = js.native
    @JSName("once")
    def once_selectionchange(eventName: `selection-change`, handler: SelectionChangeHandler): EventEmitter = js.native
    @JSName("once")
    def once_textchange(eventName: `text-change`, handler: TextChangeHandler): EventEmitter = js.native
  }
  
  trait Key extends StObject {
    
    var altKey: js.UndefOr[Boolean | Null] = js.undefined
    
    var ctrlKey: js.UndefOr[Boolean | Null] = js.undefined
    
    var key: String | Double
    
    var metaKey: js.UndefOr[Boolean | Null] = js.undefined
    
    var shiftKey: js.UndefOr[Boolean | Null] = js.undefined
    
    var shortKey: js.UndefOr[Boolean | Null] = js.undefined
  }
  object Key {
    
    inline def apply(key: String | Double): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setAltKeyNull: Self = StObject.set(x, "altKey", null)
      
      inline def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setCtrlKeyNull: Self = StObject.set(x, "ctrlKey", null)
      
      inline def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setMetaKeyNull: Self = StObject.set(x, "metaKey", null)
      
      inline def setMetaKeyUndefined: Self = StObject.set(x, "metaKey", js.undefined)
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKeyNull: Self = StObject.set(x, "shiftKey", null)
      
      inline def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
      
      inline def setShortKey(value: Boolean): Self = StObject.set(x, "shortKey", value.asInstanceOf[js.Any])
      
      inline def setShortKeyNull: Self = StObject.set(x, "shortKey", null)
      
      inline def setShortKeyUndefined: Self = StObject.set(x, "shortKey", js.undefined)
    }
  }
  
  @js.native
  trait KeyboardStatic extends StObject {
    
    def addBinding(key: Key, callback: js.Function2[/* range */ RangeStatic, /* context */ Any, Unit]): Unit = js.native
    def addBinding(key: Key, context: Any, callback: js.Function2[/* range */ RangeStatic, /* context */ Any, Unit]): Unit = js.native
  }
  
  trait OptionalAttributes extends StObject {
    
    var attributes: js.UndefOr[StringMap] = js.undefined
  }
  object OptionalAttributes {
    
    inline def apply(): OptionalAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalAttributes]
    }
    
    extension [Self <: OptionalAttributes](x: Self) {
      
      inline def setAttributes(value: StringMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    }
  }
  
  trait QuillOptionsStatic extends StObject {
    
    var bounds: js.UndefOr[HTMLElement | String] = js.undefined
    
    var debug: js.UndefOr[String | Boolean] = js.undefined
    
    var formats: js.UndefOr[js.Array[String]] = js.undefined
    
    var modules: js.UndefOr[StringMap] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var scrollingContainer: js.UndefOr[HTMLElement | String] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
  }
  object QuillOptionsStatic {
    
    inline def apply(): QuillOptionsStatic = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuillOptionsStatic]
    }
    
    extension [Self <: QuillOptionsStatic](x: Self) {
      
      inline def setBounds(value: HTMLElement | String): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setDebug(value: String | Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setFormats(value: js.Array[String]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setFormatsVarargs(value: String*): Self = StObject.set(x, "formats", js.Array(value*))
      
      inline def setModules(value: StringMap): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setScrollingContainer(value: HTMLElement | String): Self = StObject.set(x, "scrollingContainer", value.asInstanceOf[js.Any])
      
      inline def setScrollingContainerUndefined: Self = StObject.set(x, "scrollingContainer", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type SelectionChangeHandler = js.Function3[/* range */ RangeStatic, /* oldRange */ RangeStatic, /* source */ Sources, Any]
  
  trait SourceMap extends StObject {
    
    var API: api
    
    var SILENT: silent
    
    var USER: user
  }
  object SourceMap {
    
    inline def apply(): SourceMap = {
      val __obj = js.Dynamic.literal(API = "api", SILENT = "silent", USER = "user")
      __obj.asInstanceOf[SourceMap]
    }
    
    extension [Self <: SourceMap](x: Self) {
      
      inline def setAPI(value: api): Self = StObject.set(x, "API", value.asInstanceOf[js.Any])
      
      inline def setSILENT(value: silent): Self = StObject.set(x, "SILENT", value.asInstanceOf[js.Any])
      
      inline def setUSER(value: user): Self = StObject.set(x, "USER", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.quill.quillStrings.api
    - typings.quill.quillStrings.user
    - typings.quill.quillStrings.silent
  */
  trait Sources extends StObject
  object Sources {
    
    inline def api: typings.quill.quillStrings.api = "api".asInstanceOf[typings.quill.quillStrings.api]
    
    inline def silent: typings.quill.quillStrings.silent = "silent".asInstanceOf[typings.quill.quillStrings.silent]
    
    inline def user: typings.quill.quillStrings.user = "user".asInstanceOf[typings.quill.quillStrings.user]
  }
  
  type StringMap = StringDictionary[Any]
  
  type TextChangeHandler = js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* delta */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* oldContents */ Any, 
    /* source */ Sources, 
    Any
  ]
}
