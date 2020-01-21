package typings.rellax.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Element
import typings.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rellax", JSImport.Namespace)
@js.native
/**
  * Inits and starts the Parallax animations
  * @param el Single element or string with selector of elements
  * @param options Options
  */
class ^ () extends RellaxInstance {
  def this(el: String) = this()
  def this(el: Element) = this()
  def this(el: String, options: RellaxOptions) = this()
  def this(el: Element, options: RellaxOptions) = this()
  /**
    * Rellax elements
    */
  /* CompleteClass */
  override var elms: NodeListOf[Element] | js.Array[Element] = js.native
  /**
    * Options
    */
  /* CompleteClass */
  override var options: RellaxOptions = js.native
  /**
    * End Rellax and reset parallax elements to their original positions
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Destroy and create again parallax with previous settings
    */
  /* CompleteClass */
  override def refresh(): Unit = js.native
}

@JSImport("rellax", JSImport.Namespace)
@js.native
object ^ extends TopLevel[Rellax]

