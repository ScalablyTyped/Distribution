package typings
package quillLib.quillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("quill", "Quill")
@js.native
class Quill protected () extends EventEmitter {
  def this(container: java.lang.String) = this()
  def this(container: stdLib.Element) = this()
  def this(container: java.lang.String, options: QuillOptionsStatic) = this()
  def this(container: stdLib.Element, options: QuillOptionsStatic) = this()
  var clipboard: ClipboardStatic = js.native
  var keyboard: KeyboardStatic = js.native
  /**
    * @private Internal API
    */
  var root: stdLib.HTMLDivElement = js.native
  var scroll: parchmentLib.distSrcBlotAbstractBlotMod.Blot = js.native
  def addContainer(classNameOrDomNode: java.lang.String): js.Any = js.native
  def addContainer(classNameOrDomNode: java.lang.String, refNode: stdLib.Node): js.Any = js.native
  def addContainer(classNameOrDomNode: stdLib.Node): js.Any = js.native
  def addContainer(classNameOrDomNode: stdLib.Node, refNode: stdLib.Node): js.Any = js.native
  def blur(): scala.Unit = js.native
  def deleteText(index: scala.Double, length: scala.Double): js.Any = js.native
  def deleteText(index: scala.Double, length: scala.Double, source: Sources): js.Any = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def enable(enabled: scala.Boolean): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def format(name: java.lang.String, value: js.Any): js.Any = js.native
  def format(name: java.lang.String, value: js.Any, source: Sources): js.Any = js.native
  def formatLine(index: scala.Double, length: scala.Double): js.Any = js.native
  def formatLine(index: scala.Double, length: scala.Double, format: java.lang.String, value: js.Any): js.Any = js.native
  def formatLine(
    index: scala.Double,
    length: scala.Double,
    format: java.lang.String,
    value: js.Any,
    source: Sources
  ): js.Any = js.native
  def formatLine(index: scala.Double, length: scala.Double, formats: StringMap): js.Any = js.native
  def formatLine(index: scala.Double, length: scala.Double, formats: StringMap, source: Sources): js.Any = js.native
  def formatLine(index: scala.Double, length: scala.Double, source: Sources): js.Any = js.native
  def formatText(index: scala.Double, length: scala.Double): js.Any = js.native
  def formatText(index: scala.Double, length: scala.Double, format: java.lang.String, value: js.Any): js.Any = js.native
  def formatText(
    index: scala.Double,
    length: scala.Double,
    format: java.lang.String,
    value: js.Any,
    source: Sources
  ): js.Any = js.native
  def formatText(index: scala.Double, length: scala.Double, formats: StringMap): js.Any = js.native
  def formatText(index: scala.Double, length: scala.Double, formats: StringMap, source: Sources): js.Any = js.native
  def formatText(index: scala.Double, length: scala.Double, source: Sources): js.Any = js.native
  def formatText(range: RangeStatic, format: java.lang.String, value: js.Any): js.Any = js.native
  def formatText(range: RangeStatic, format: java.lang.String, value: js.Any, source: Sources): js.Any = js.native
  def formatText(range: RangeStatic, formats: StringMap): js.Any = js.native
  def formatText(range: RangeStatic, formats: StringMap, source: Sources): js.Any = js.native
  def getBounds(index: scala.Double): BoundsStatic = js.native
  def getBounds(index: scala.Double, length: scala.Double): BoundsStatic = js.native
  def getContents(): js.Any = js.native
  def getContents(index: scala.Double): js.Any = js.native
  def getContents(index: scala.Double, length: scala.Double): js.Any = js.native
  def getFormat(): StringMap = js.native
  def getFormat(index: scala.Double): StringMap = js.native
  def getFormat(index: scala.Double, length: scala.Double): StringMap = js.native
  def getFormat(range: RangeStatic): StringMap = js.native
  // Blot interface is not exported on Parchment
  def getIndex(blot: js.Any): scala.Double = js.native
  def getLeaf(index: scala.Double): js.Any = js.native
  def getLength(): scala.Double = js.native
  def getLine(index: scala.Double): js.Tuple2[_, scala.Double] = js.native
  def getLines(): js.Array[_] = js.native
  def getLines(index: scala.Double): js.Array[_] = js.native
  def getLines(index: scala.Double, length: scala.Double): js.Array[_] = js.native
  def getLines(range: RangeStatic): js.Array[_] = js.native
  def getModule(name: java.lang.String): js.Any = js.native
  def getSelection(): RangeStatic | scala.Null = js.native
  def getSelection(focus: quillLib.quillLibNumbers.`false`): RangeStatic | scala.Null = js.native
  def getSelection(focus: quillLib.quillLibNumbers.`true`): RangeStatic = js.native
  def getText(): java.lang.String = js.native
  def getText(index: scala.Double): java.lang.String = js.native
  def getText(index: scala.Double, length: scala.Double): java.lang.String = js.native
  def hasFocus(): scala.Boolean = js.native
  def insertEmbed(index: scala.Double, `type`: java.lang.String, value: js.Any): js.Any = js.native
  def insertEmbed(index: scala.Double, `type`: java.lang.String, value: js.Any, source: Sources): js.Any = js.native
  def insertText(index: scala.Double, text: java.lang.String): js.Any = js.native
  def insertText(index: scala.Double, text: java.lang.String, format: java.lang.String, value: js.Any): js.Any = js.native
  def insertText(
    index: scala.Double,
    text: java.lang.String,
    format: java.lang.String,
    value: js.Any,
    source: Sources
  ): js.Any = js.native
  def insertText(index: scala.Double, text: java.lang.String, formats: StringMap): js.Any = js.native
  def insertText(index: scala.Double, text: java.lang.String, formats: StringMap, source: Sources): js.Any = js.native
  def insertText(index: scala.Double, text: java.lang.String, source: Sources): js.Any = js.native
  /**
    * @deprecated Remove in 2.0. Use clipboard.dangerouslyPasteHTML(html: string, source: Sources): void;
    */
  def pasteHTML(html: java.lang.String): java.lang.String = js.native
  def pasteHTML(html: java.lang.String, source: Sources): java.lang.String = js.native
  /**
    * @deprecated Remove in 2.0. Use clipboard.dangerouslyPasteHTML(index: number, html: string, source: Sources)
    */
  def pasteHTML(index: scala.Double, html: java.lang.String): java.lang.String = js.native
  def pasteHTML(index: scala.Double, html: java.lang.String, source: Sources): java.lang.String = js.native
  def removeFormat(index: scala.Double, length: scala.Double): js.Any = js.native
  def removeFormat(index: scala.Double, length: scala.Double, source: Sources): js.Any = js.native
  def setContents(delta: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Delta */ js.Any): js.Any = js.native
  def setContents(
    delta: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Delta */ js.Any,
    source: Sources
  ): js.Any = js.native
  def setSelection(index: scala.Double, length: scala.Double): scala.Unit = js.native
  def setSelection(index: scala.Double, length: scala.Double, source: Sources): scala.Unit = js.native
  def setSelection(range: RangeStatic): scala.Unit = js.native
  def setSelection(range: RangeStatic, source: Sources): scala.Unit = js.native
  def setText(text: java.lang.String): js.Any = js.native
  def setText(text: java.lang.String, source: Sources): js.Any = js.native
  def update(): scala.Unit = js.native
  def update(source: Sources): scala.Unit = js.native
  def updateContents(delta: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Delta */ js.Any): js.Any = js.native
  def updateContents(
    delta: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Delta */ js.Any,
    source: Sources
  ): js.Any = js.native
}

@JSImport("quill", "Quill")
@js.native
object Quill extends js.Object {
  // static methods: debug, import, register, find
  def debug(level: java.lang.String): scala.Unit = js.native
  def debug(level: scala.Boolean): scala.Unit = js.native
  def find(domNode: stdLib.Node): quillLib.quillMod.Quill | js.Any = js.native
  def find(domNode: stdLib.Node, bubble: scala.Boolean): quillLib.quillMod.Quill | js.Any = js.native
  def `import`(path: java.lang.String): js.Any = js.native
  def register(defs: quillLib.quillMod.StringMap): scala.Unit = js.native
  def register(defs: quillLib.quillMod.StringMap, suppressWarning: scala.Boolean): scala.Unit = js.native
  def register(path: java.lang.String, `def`: js.Any): scala.Unit = js.native
  def register(path: java.lang.String, `def`: js.Any, suppressWarning: scala.Boolean): scala.Unit = js.native
}

