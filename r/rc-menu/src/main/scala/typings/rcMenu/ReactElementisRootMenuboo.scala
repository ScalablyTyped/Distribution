package typings.rcMenu

import typings.react.mod.Key
import typings.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ReactElement & {  isRootMenu  :boolean,   subMenuInstance  :react.react.ReactInstance} */
trait ReactElementisRootMenuboo extends js.Object {
  var isRootMenu: Boolean
  var key: Key | Null
  var props: js.Any
  var subMenuInstance: ReactInstance
  var `type`: js.Any
}

object ReactElementisRootMenuboo {
  @scala.inline
  def apply(
    isRootMenu: Boolean,
    props: js.Any,
    subMenuInstance: ReactInstance,
    `type`: js.Any,
    key: Key = null
  ): ReactElementisRootMenuboo = {
    val __obj = js.Dynamic.literal(isRootMenu = isRootMenu.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], subMenuInstance = subMenuInstance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactElementisRootMenuboo]
  }
}

