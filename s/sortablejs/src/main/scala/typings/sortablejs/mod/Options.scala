package typings.sortablejs.mod

import typings.sortablejs.pluginsMod.AutoScrollOptions
import typings.sortablejs.pluginsMod.MultiDragOptions
import typings.sortablejs.pluginsMod.OnSpillOptions
import typings.sortablejs.pluginsMod.SwapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options
  extends SortableOptions
     with AutoScrollOptions
     with MultiDragOptions
     with OnSpillOptions
     with SwapOptions
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
}
