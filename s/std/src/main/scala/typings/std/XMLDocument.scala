package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An XML document. It inherits from the generic Document and does not add any specific methods or properties to it: nevertheless, several algorithms behave differently with the two types of documents. */
@js.native
trait XMLDocument extends Document

@JSGlobal("XMLDocument")
@js.native
class XMLDocumentCls () extends XMLDocument {
  /* CompleteClass */
  override val activeElement: Element | Null = js.native
  /**
    * Returns document's fullscreen element.
    */
  /* CompleteClass */
  override val fullscreenElement: Element | Null = js.native
  /* CompleteClass */
  override val pointerLockElement: Element | Null = js.native
  /**
    * Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document.
    */
  /* CompleteClass */
  override val styleSheets: StyleSheetList = js.native
  /* CompleteClass */
  override def caretPositionFromPoint(x: Double, y: Double): CaretPosition | Null = js.native
  /** @deprecated */
  /* CompleteClass */
  override def caretRangeFromPoint(x: Double, y: Double): Range = js.native
  /* CompleteClass */
  override def elementFromPoint(x: Double, y: Double): Element | Null = js.native
  /* CompleteClass */
  override def elementsFromPoint(x: Double, y: Double): js.Array[Element] = js.native
  /**
    * Returns the first element within node's descendants whose ID is elementId.
    */
  /* CompleteClass */
  override def getElementById(elementId: java.lang.String): Element | Null = js.native
  /* CompleteClass */
  override def getSelection(): Selection | Null = js.native
}

@JSGlobal("XMLDocument")
@js.native
object XMLDocument extends Instantiable0[XMLDocument]

