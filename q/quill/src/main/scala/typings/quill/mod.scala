package typings.quill

import org.scalablytyped.runtime.StringDictionary
import typings.quill.anon.Html
import typings.quill.quillBooleans.`false`
import typings.quill.quillBooleans.`true`
import typings.quill.quillStrings.`editor-change`
import typings.quill.quillStrings.`selection-change`
import typings.quill.quillStrings.`text-change`
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("quill", JSImport.Default)
  @js.native
  class default protected () extends Quill {
    def this(container: String) = this()
    def this(container: Element) = this()
    def this(container: String, options: QuillOptionsStatic) = this()
    def this(container: Element, options: QuillOptionsStatic) = this()
  }
  /* static members */
  object default {
    
    // static methods: debug, import, register, find
    @JSImport("quill", "default.debug")
    @js.native
    def debug(level: String): Unit = js.native
    @JSImport("quill", "default.debug")
    @js.native
    def debug(level: Boolean): Unit = js.native
    
    @JSImport("quill", "default.find")
    @js.native
    def find(domNode: Node): Quill | js.Any = js.native
    @JSImport("quill", "default.find")
    @js.native
    def find(domNode: Node, bubble: Boolean): Quill | js.Any = js.native
    
    @JSImport("quill", "default.register")
    @js.native
    def register(defs: StringMap): Unit = js.native
    @JSImport("quill", "default.register")
    @js.native
    def register(defs: StringMap, suppressWarning: Boolean): Unit = js.native
    @JSImport("quill", "default.register")
    @js.native
    def register(path: String, `def`: js.Any): Unit = js.native
    @JSImport("quill", "default.register")
    @js.native
    def register(path: String, `def`: js.Any, suppressWarning: Boolean): Unit = js.native
    
    @JSImport("quill", "default.import")
    @js.native
    def `import`(path: String): js.Any = js.native
  }
  
  @JSImport("quill", "Quill")
  @js.native
  class Quill protected () extends EventEmitter {
    def this(container: String) = this()
    def this(container: Element) = this()
    def this(container: String, options: QuillOptionsStatic) = this()
    def this(container: Element, options: QuillOptionsStatic) = this()
    
    def addContainer(classNameOrDomNode: String): js.Any = js.native
    def addContainer(classNameOrDomNode: String, refNode: Node): js.Any = js.native
    def addContainer(classNameOrDomNode: Node): js.Any = js.native
    def addContainer(classNameOrDomNode: Node, refNode: Node): js.Any = js.native
    
    def blur(): Unit = js.native
    
    var clipboard: ClipboardStatic = js.native
    
    def deleteText(index: Double, length: Double): js.Any = js.native
    def deleteText(index: Double, length: Double, source: Sources): js.Any = js.native
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    def enable(enabled: Boolean): Unit = js.native
    
    def focus(): Unit = js.native
    
    def format(name: String, value: js.Any): js.Any = js.native
    def format(name: String, value: js.Any, source: Sources): js.Any = js.native
    
    def formatLine(index: Double, length: Double): js.Any = js.native
    def formatLine(index: Double, length: Double, format: String, value: js.Any): js.Any = js.native
    def formatLine(index: Double, length: Double, format: String, value: js.Any, source: Sources): js.Any = js.native
    def formatLine(index: Double, length: Double, formats: StringMap): js.Any = js.native
    def formatLine(index: Double, length: Double, formats: StringMap, source: Sources): js.Any = js.native
    def formatLine(index: Double, length: Double, source: Sources): js.Any = js.native
    
    def formatText(index: Double, length: Double): js.Any = js.native
    def formatText(index: Double, length: Double, format: String, value: js.Any): js.Any = js.native
    def formatText(index: Double, length: Double, format: String, value: js.Any, source: Sources): js.Any = js.native
    def formatText(index: Double, length: Double, formats: StringMap): js.Any = js.native
    def formatText(index: Double, length: Double, formats: StringMap, source: Sources): js.Any = js.native
    def formatText(index: Double, length: Double, source: Sources): js.Any = js.native
    def formatText(range: RangeStatic, format: String, value: js.Any): js.Any = js.native
    def formatText(range: RangeStatic, format: String, value: js.Any, source: Sources): js.Any = js.native
    def formatText(range: RangeStatic, formats: StringMap): js.Any = js.native
    def formatText(range: RangeStatic, formats: StringMap, source: Sources): js.Any = js.native
    
    def getBounds(index: Double): BoundsStatic = js.native
    def getBounds(index: Double, length: Double): BoundsStatic = js.native
    
    def getContents(): js.Any = js.native
    def getContents(index: js.UndefOr[scala.Nothing], length: Double): js.Any = js.native
    def getContents(index: Double): js.Any = js.native
    def getContents(index: Double, length: Double): js.Any = js.native
    
    def getFormat(): StringMap = js.native
    def getFormat(index: Double): StringMap = js.native
    def getFormat(index: Double, length: Double): StringMap = js.native
    def getFormat(range: RangeStatic): StringMap = js.native
    
    // Blot interface is not exported on Parchment
    def getIndex(blot: js.Any): Double = js.native
    
    def getLeaf(index: Double): js.Any = js.native
    
    def getLength(): Double = js.native
    
    def getLine(index: Double): js.Tuple2[_, Double] = js.native
    
    def getLines(): js.Array[_] = js.native
    def getLines(index: js.UndefOr[scala.Nothing], length: Double): js.Array[_] = js.native
    def getLines(index: Double): js.Array[_] = js.native
    def getLines(index: Double, length: Double): js.Array[_] = js.native
    def getLines(range: RangeStatic): js.Array[_] = js.native
    
    def getModule(name: String): js.Any = js.native
    
    def getSelection(): RangeStatic | Null = js.native
    @JSName("getSelection")
    def getSelection_false(focus: `false`): RangeStatic | Null = js.native
    @JSName("getSelection")
    def getSelection_true(focus: `true`): RangeStatic = js.native
    
    def getText(): String = js.native
    def getText(index: js.UndefOr[scala.Nothing], length: Double): String = js.native
    def getText(index: Double): String = js.native
    def getText(index: Double, length: Double): String = js.native
    
    def hasFocus(): Boolean = js.native
    
    def insertEmbed(index: Double, `type`: String, value: js.Any): js.Any = js.native
    def insertEmbed(index: Double, `type`: String, value: js.Any, source: Sources): js.Any = js.native
    
    def insertText(index: Double, text: String): js.Any = js.native
    def insertText(index: Double, text: String, format: String, value: js.Any): js.Any = js.native
    def insertText(index: Double, text: String, format: String, value: js.Any, source: Sources): js.Any = js.native
    def insertText(index: Double, text: String, formats: StringMap): js.Any = js.native
    def insertText(index: Double, text: String, formats: StringMap, source: Sources): js.Any = js.native
    def insertText(index: Double, text: String, source: Sources): js.Any = js.native
    
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
    
    def removeFormat(index: Double, length: Double): js.Any = js.native
    def removeFormat(index: Double, length: Double, source: Sources): js.Any = js.native
    
    /**
      * Internal API
      */
    var root: HTMLDivElement = js.native
    
    var scroll: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Blot */ js.Any = js.native
    
    def setContents(
      delta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ js.Any
    ): js.Any = js.native
    def setContents(
      delta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ js.Any,
      source: Sources
    ): js.Any = js.native
    
    def setSelection(index: Double, length: Double): Unit = js.native
    def setSelection(index: Double, length: Double, source: Sources): Unit = js.native
    def setSelection(range: RangeStatic): Unit = js.native
    def setSelection(range: RangeStatic, source: Sources): Unit = js.native
    
    def setText(text: String): js.Any = js.native
    def setText(text: String, source: Sources): js.Any = js.native
    
    def update(): Unit = js.native
    def update(source: Sources): Unit = js.native
    
    def updateContents(
      delta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ js.Any
    ): js.Any = js.native
    def updateContents(
      delta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ js.Any,
      source: Sources
    ): js.Any = js.native
  }
  /* static members */
  object Quill {
    
    // static methods: debug, import, register, find
    @JSImport("quill", "Quill.debug")
    @js.native
    def debug(level: String): Unit = js.native
    @JSImport("quill", "Quill.debug")
    @js.native
    def debug(level: Boolean): Unit = js.native
    
    @JSImport("quill", "Quill.find")
    @js.native
    def find(domNode: Node): Quill | js.Any = js.native
    @JSImport("quill", "Quill.find")
    @js.native
    def find(domNode: Node, bubble: Boolean): Quill | js.Any = js.native
    
    @JSImport("quill", "Quill.register")
    @js.native
    def register(defs: StringMap): Unit = js.native
    @JSImport("quill", "Quill.register")
    @js.native
    def register(defs: StringMap, suppressWarning: Boolean): Unit = js.native
    @JSImport("quill", "Quill.register")
    @js.native
    def register(path: String, `def`: js.Any): Unit = js.native
    @JSImport("quill", "Quill.register")
    @js.native
    def register(path: String, `def`: js.Any, suppressWarning: Boolean): Unit = js.native
    
    @JSImport("quill", "Quill.import")
    @js.native
    def `import`(path: String): js.Any = js.native
  }
  
  @JSImport("quill", "RangeStatic")
  @js.native
  class RangeStatic () extends StObject {
    
    var index: Double = js.native
    
    var length: Double = js.native
  }
  
  @js.native
  trait BoundsStatic extends StObject {
    
    var bottom: Double = js.native
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
  }
  object BoundsStatic {
    
    @scala.inline
    def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): BoundsStatic = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundsStatic]
    }
    
    @scala.inline
    implicit class BoundsStaticMutableBuilder[Self <: BoundsStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type ClipboardMatcherCallback = js.Function2[
    /* node */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* delta */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ js.Any
  ]
  
  type ClipboardMatcherNode = String | Double
  
  @js.native
  trait ClipboardStatic extends StObject {
    
    def addMatcher(selectorOrNodeType: ClipboardMatcherNode, callback: ClipboardMatcherCallback): Unit = js.native
    
    def convert(): js.Any = js.native
    def convert(content: js.UndefOr[scala.Nothing], formats: StringMap): js.Any = js.native
    def convert(content: Html): js.Any = js.native
    def convert(content: Html, formats: StringMap): js.Any = js.native
    
    def dangerouslyPasteHTML(html: String): Unit = js.native
    def dangerouslyPasteHTML(html: String, source: Sources): Unit = js.native
    def dangerouslyPasteHTML(index: Double, html: String): Unit = js.native
    def dangerouslyPasteHTML(index: Double, html: String, source: Sources): Unit = js.native
    
    var matchers: js.Array[js.Tuple2[ClipboardMatcherNode, ClipboardMatcherCallback]] = js.native
  }
  
  /* Inlined {  insert :any | undefined,   delete :number | undefined,   retain :number | undefined} & quill.quill.OptionalAttributes */
  @js.native
  trait DeltaOperation extends StObject {
    
    var attributes: js.UndefOr[StringMap] = js.native
    
    var delete: js.UndefOr[Double] = js.native
    
    var insert: js.UndefOr[js.Any] = js.native
    
    var retain: js.UndefOr[Double] = js.native
  }
  object DeltaOperation {
    
    @scala.inline
    def apply(): DeltaOperation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeltaOperation]
    }
    
    @scala.inline
    implicit class DeltaOperationMutableBuilder[Self <: DeltaOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setDelete(value: Double): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      @scala.inline
      def setInsert(value: js.Any): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      @scala.inline
      def setRetain(value: Double): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
    }
  }
  
  type EditorChangeHandler = js.Function4[
    `text-change` | `selection-change`, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* delta */ js.Any) | (/* range */ RangeStatic), 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* oldContents */ js.Any) | (/* oldRange */ RangeStatic), 
    /* source */ Sources, 
    js.Any
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
  
  @js.native
  trait Key extends StObject {
    
    var key: String | Double = js.native
    
    var shortKey: js.UndefOr[Boolean] = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: String | Double): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortKey(value: Boolean): Self = StObject.set(x, "shortKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortKeyUndefined: Self = StObject.set(x, "shortKey", js.undefined)
    }
  }
  
  @js.native
  trait KeyboardStatic extends StObject {
    
    def addBinding(key: Key, callback: js.Function2[/* range */ RangeStatic, /* context */ js.Any, Unit]): Unit = js.native
    def addBinding(
      key: Key,
      context: js.Any,
      callback: js.Function2[/* range */ RangeStatic, /* context */ js.Any, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait OptionalAttributes extends StObject {
    
    var attributes: js.UndefOr[StringMap] = js.native
  }
  object OptionalAttributes {
    
    @scala.inline
    def apply(): OptionalAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalAttributes]
    }
    
    @scala.inline
    implicit class OptionalAttributesMutableBuilder[Self <: OptionalAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    }
  }
  
  @js.native
  trait QuillOptionsStatic extends StObject {
    
    var bounds: js.UndefOr[HTMLElement | String] = js.native
    
    var debug: js.UndefOr[String | Boolean] = js.native
    
    var formats: js.UndefOr[js.Array[String]] = js.native
    
    var modules: js.UndefOr[StringMap] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var scrollingContainer: js.UndefOr[HTMLElement | String] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
    
    var theme: js.UndefOr[String] = js.native
  }
  object QuillOptionsStatic {
    
    @scala.inline
    def apply(): QuillOptionsStatic = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuillOptionsStatic]
    }
    
    @scala.inline
    implicit class QuillOptionsStaticMutableBuilder[Self <: QuillOptionsStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: HTMLElement | String): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setDebug(value: String | Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setFormats(value: js.Array[String]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      @scala.inline
      def setFormatsVarargs(value: String*): Self = StObject.set(x, "formats", js.Array(value :_*))
      
      @scala.inline
      def setModules(value: StringMap): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setScrollingContainer(value: HTMLElement | String): Self = StObject.set(x, "scrollingContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollingContainerUndefined: Self = StObject.set(x, "scrollingContainer", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type SelectionChangeHandler = js.Function3[/* range */ RangeStatic, /* oldRange */ RangeStatic, /* source */ Sources, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.quill.quillStrings.api
    - typings.quill.quillStrings.user
    - typings.quill.quillStrings.silent
  */
  trait Sources extends StObject
  object Sources {
    
    @scala.inline
    def api: typings.quill.quillStrings.api = "api".asInstanceOf[typings.quill.quillStrings.api]
    
    @scala.inline
    def silent: typings.quill.quillStrings.silent = "silent".asInstanceOf[typings.quill.quillStrings.silent]
    
    @scala.inline
    def user: typings.quill.quillStrings.user = "user".asInstanceOf[typings.quill.quillStrings.user]
  }
  
  type StringMap = StringDictionary[js.Any]
  
  type TextChangeHandler = js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* delta */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* oldContents */ js.Any, 
    /* source */ Sources, 
    js.Any
  ]
}
