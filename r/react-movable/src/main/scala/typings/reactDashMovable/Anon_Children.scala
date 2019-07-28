package typings.reactDashMovable

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: ReactNode
  var isDragged: Boolean
  var props: Anon_Ref
}

object Anon_Children {
  @scala.inline
  def apply(children: ReactNode, isDragged: Boolean, props: Anon_Ref): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isDragged = isDragged, props = props)
  
    __obj.asInstanceOf[Anon_Children]
  }
}

