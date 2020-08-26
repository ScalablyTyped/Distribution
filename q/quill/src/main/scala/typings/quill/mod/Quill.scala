package typings.quill.mod

import typings.quill.quillBooleans.`false`
import typings.quill.quillBooleans.`true`
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("quill", "Quill")
@js.native
class Quill protected () extends EventEmitter {
  def this(container: String) = this()
  def this(container: Element) = this()
  def this(container: String, options: QuillOptionsStatic) = this()
  def this(container: Element, options: QuillOptionsStatic) = this()
  var clipboard: ClipboardStatic = js.native
  var keyboard: KeyboardStatic = js.native
  /**
    * @private Internal API
    */
  var root: HTMLDivElement = js.native
  var scroll: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Blot */ js.Any = js.native
  def addContainer(classNameOrDomNode: String): js.Any = js.native
  def addContainer(classNameOrDomNode: String, refNode: Node): js.Any = js.native
  def addContainer(classNameOrDomNode: Node): js.Any = js.native
  def addContainer(classNameOrDomNode: Node, refNode: Node): js.Any = js.native
  def blur(): Unit = js.native
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
@JSImport("quill", "Quill")
@js.native
object Quill extends js.Object {
  // static methods: debug, import, register, find
  def debug(level: String): Unit = js.native
  def debug(level: Boolean): Unit = js.native
  def find(domNode: Node): Quill | js.Any = js.native
  def find(domNode: Node, bubble: Boolean): Quill | js.Any = js.native
  def `import`(path: String): js.Any = js.native
  def register(defs: StringMap): Unit = js.native
  def register(defs: StringMap, suppressWarning: Boolean): Unit = js.native
  def register(path: String, `def`: js.Any): Unit = js.native
  def register(path: String, `def`: js.Any, suppressWarning: Boolean): Unit = js.native
}

