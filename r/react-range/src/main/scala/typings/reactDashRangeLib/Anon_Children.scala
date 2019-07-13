package typings
package reactDashRangeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var disabled: scala.Boolean
  var isDragged: scala.Boolean
  var props: reactDashRangeLib.libTypesMod.ITrackProps
}

object Anon_Children {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    disabled: scala.Boolean,
    isDragged: scala.Boolean,
    props: reactDashRangeLib.libTypesMod.ITrackProps
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], disabled = disabled, isDragged = isDragged, props = props)
  
    __obj.asInstanceOf[Anon_Children]
  }
}

