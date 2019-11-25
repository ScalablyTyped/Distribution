package typings.reactDashDnd.libInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragSourceOptions extends js.Object {
  /**
    * Optional. A string. By default, 'move'. In the browsers that support this feature, specifying 'copy'
    * shows a special “copying” cursor, while 'move' corresponds to the “move” cursor. You might want to use
    * this option to provide a hint to the user about whether an action is destructive.
    */
  var dropEffect: js.UndefOr[String] = js.undefined
}

object DragSourceOptions {
  @scala.inline
  def apply(dropEffect: String = null): DragSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (dropEffect != null) __obj.updateDynamic("dropEffect")(dropEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragSourceOptions]
  }
}

