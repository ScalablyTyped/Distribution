package typings.sortablejs.mod

import typings.sortablejs.pluginsMod.SortablePlugin
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sortablejs", JSImport.Namespace)
@js.native
class ^ protected () extends Sortable {
  /**
    * Sortable's main constructor.
    * @param element Any variety of HTMLElement.
    * @param options Sortable options object.
    */
  def this(element: HTMLElement, options: Options) = this()
}
@JSImport("sortablejs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var active: Sortable | Null = js.native
  
  /** The clone element. */
  @JSName("clone")
  var `clone_F^`: HTMLElement | Null = js.native
  
  /**
    * Creation of new instances.
    * @param element Any variety of HTMLElement.
    * @param options Sortable options object.
    */
  def create(element: HTMLElement): Sortable = js.native
  def create(element: HTMLElement, options: Options): Sortable = js.native
  
  /** The element being dragged. */
  var dragged: HTMLElement | Null = js.native
  
  /** Get the Sortable instance on an element. */
  def get(element: HTMLElement): js.UndefOr[Sortable] = js.native
  
  /** The ghost element.*/
  var ghost: HTMLElement | Null = js.native
  
  /**
    * Mounts a plugin to Sortable
    * @param sortablePlugin a sortable plugin.
    *
    * @example
    *
    * Sortable.mount(new MultiDrag(), new AutoScroll())
    */
  def mount(sortablePlugins: SortablePlugin*): Unit = js.native
  
  var utils: Utils = js.native
  
  /** Get the Sortable version */
  val version: String = js.native
}
