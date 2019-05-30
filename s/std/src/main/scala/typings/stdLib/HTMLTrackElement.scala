package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTMLTrackElement */
@js.native
trait HTMLTrackElement extends HTMLElement {
  val ERROR: scala.Double = js.native
  val LOADED: scala.Double = js.native
  val LOADING: scala.Double = js.native
  val NONE: scala.Double = js.native
  var default: scala.Boolean = js.native
  var kind: java.lang.String = js.native
  var label: java.lang.String = js.native
  val readyState: scala.Double = js.native
  var src: java.lang.String = js.native
  var srclang: java.lang.String = js.native
  val track: TextTrack = js.native
}

@JSGlobal("HTMLTrackElement")
@js.native
class HTMLTrackElementCls () extends HTMLTrackElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | scala.Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}

@JSGlobal("HTMLTrackElement")
@js.native
object HTMLTrackElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLTrackElement] {
  val ERROR: scala.Double = js.native
  val LOADED: scala.Double = js.native
  val LOADING: scala.Double = js.native
  val NONE: scala.Double = js.native
}

