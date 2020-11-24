package typings.rellax.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def this(el: js.UndefOr[scala.Nothing], options: RellaxOptions) = this()
  def this(el: String, options: RellaxOptions) = this()
  def this(el: Element, options: RellaxOptions) = this()
}
@JSImport("rellax", JSImport.Namespace)
@js.native
object ^ extends TopLevel[Rellax]
