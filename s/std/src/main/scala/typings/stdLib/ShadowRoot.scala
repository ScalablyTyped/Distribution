package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShadowRoot
  extends DocumentFragment
     with DocumentOrShadowRoot
     with InnerHTML {
  val host: Element = js.native
  val mode: ShadowRootMode = js.native
}

@JSGlobal("ShadowRoot")
@js.native
class ShadowRootCls () extends ShadowRoot {
  /* CompleteClass */
  override val activeElement: Element | scala.Null = js.native
  /* CompleteClass */
  override val fullscreenElement: Element | scala.Null = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /* CompleteClass */
  override val pointerLockElement: Element | scala.Null = js.native
  /**
    * Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document.
    */
  /* CompleteClass */
  override val styleSheets: StyleSheetList = js.native
  /* CompleteClass */
  override def caretPositionFromPoint(x: scala.Double, y: scala.Double): CaretPosition | scala.Null = js.native
  /** @deprecated */
  /* CompleteClass */
  override def caretRangeFromPoint(x: scala.Double, y: scala.Double): Range = js.native
  /* CompleteClass */
  override def elementFromPoint(x: scala.Double, y: scala.Double): Element | scala.Null = js.native
  /* CompleteClass */
  override def elementsFromPoint(x: scala.Double, y: scala.Double): js.Array[Element] = js.native
  /**
    * Returns the first element within node's descendants whose ID is elementId.
    */
  /* CompleteClass */
  override def getElementById(elementId: java.lang.String): Element | scala.Null = js.native
  /* CompleteClass */
  override def getSelection(): Selection | scala.Null = js.native
}

@JSGlobal("ShadowRoot")
@js.native
object ShadowRoot
  extends org.scalablytyped.runtime.Instantiable0[ShadowRoot]

