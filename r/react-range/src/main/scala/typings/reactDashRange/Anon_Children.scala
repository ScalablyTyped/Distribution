package typings.reactDashRange

import typings.react.reactMod.ReactNode
import typings.reactDashRange.libTypesMod.ITrackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: ReactNode
  var disabled: Boolean
  var isDragged: Boolean
  var props: ITrackProps
}

object Anon_Children {
  @scala.inline
  def apply(children: ReactNode, disabled: Boolean, isDragged: Boolean, props: ITrackProps): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], disabled = disabled, isDragged = isDragged, props = props)
  
    __obj.asInstanceOf[Anon_Children]
  }
}

