package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Image")
@js.native
class Image ()
  extends typings.std.HTMLImageElement {
  def this(width: Double) = this()
  def this(width: Double, height: Double) = this()
  /* CompleteClass */
  override val assignedSlot: typings.std.HTMLSlotElement | Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: typings.std.Element | Null = js.native
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: typings.std.Element | Null = js.native
  /* CompleteClass */
  override val style: typings.std.CSSStyleDeclaration = js.native
}

@JSGlobal("Image")
@js.native
object Image
  extends Instantiable0[typings.std.HTMLImageElement]
     with Instantiable1[/* width */ Double, typings.std.HTMLImageElement]
     with Instantiable2[/* width */ Double, /* height */ Double, typings.std.HTMLImageElement]

