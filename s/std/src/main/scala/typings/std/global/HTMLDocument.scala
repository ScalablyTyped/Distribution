package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HTMLDocument")
@js.native
class HTMLDocument ()
  extends typings.std.HTMLDocument {
  /* CompleteClass */
  override val activeElement: typings.std.Element | Null = js.native
  /**
    * Returns document's fullscreen element.
    */
  /* CompleteClass */
  override val fullscreenElement: typings.std.Element | Null = js.native
  /* CompleteClass */
  override val pointerLockElement: typings.std.Element | Null = js.native
  /**
    * Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document.
    */
  /* CompleteClass */
  override val styleSheets: typings.std.StyleSheetList = js.native
  /* CompleteClass */
  override def caretPositionFromPoint(x: Double, y: Double): typings.std.CaretPosition | Null = js.native
  /** @deprecated */
  /* CompleteClass */
  override def caretRangeFromPoint(x: Double, y: Double): typings.std.Range = js.native
  /* CompleteClass */
  override def elementFromPoint(x: Double, y: Double): typings.std.Element | Null = js.native
  /* CompleteClass */
  override def elementsFromPoint(x: Double, y: Double): js.Array[typings.std.Element] = js.native
  /**
    * Returns the first element within node's descendants whose ID is elementId.
    */
  /* CompleteClass */
  override def getElementById(elementId: java.lang.String): typings.std.Element | Null = js.native
  /* CompleteClass */
  override def getSelection(): typings.std.Selection | Null = js.native
}

@JSGlobal("HTMLDocument")
@js.native
object HTMLDocument
  extends Instantiable0[typings.std.HTMLDocument]

