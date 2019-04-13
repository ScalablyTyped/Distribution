package typings
package sortablejsLib.sortablejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sortablejs", JSImport.Namespace)
@js.native
class ^ protected () extends Sortable {
  /**
    * Sortable's main constructor.
    * @param element Any variety of HTMLElement.
    * @param options Sortable options object.
    */
  def this(element: stdLib.HTMLElement, options: Options) = this()
}

@JSImport("sortablejs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var active: Sortable = js.native
  var utils: Utils = js.native
  /**
    * Creation of new instances.
    * @param element Any variety of HTMLElement.
    * @param options Sortable options object.
    */
  def create(element: stdLib.HTMLElement, options: Options): Sortable = js.native
}

