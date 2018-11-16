package typings
package sortablejsLib.sortablejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sortablejs", JSImport.Namespace)
@js.native
class namespaced protected () extends Sortable {
  /**
       * Sortable's main constructor.
       * @param element Any variety of HTMLElement.
       * @param options Sortable options object.
       */
  def this(element: stdLib.HTMLElement, options: sortablejsLib.sortablejsMod.SortableNs.Options) = this()
}

@JSImport("sortablejs", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var active: sortablejsLib.sortablejsMod.Sortable = js.native
  var utils: sortablejsLib.sortablejsMod.SortableNs.Utils = js.native
  /**
       * Creation of new instances.
       * @param element Any variety of HTMLElement.
       * @param options Sortable options object.
       */
  def create(element: stdLib.HTMLElement, options: sortablejsLib.sortablejsMod.SortableNs.Options): sortablejsLib.sortablejsMod.Sortable = js.native
}

