package typings.reactDashVirtualized

import typings.react.reactMod.ReactNode
import typings.react.reactMod.Validator
import typings.reactDashVirtualized.distEsScrollSyncMod.ScrollSyncChildProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenProps extends js.Object {
  var children: Validator[js.Function1[/* props */ ScrollSyncChildProps, ReactNode]]
}

object Anon_ChildrenProps {
  @scala.inline
  def apply(children: Validator[js.Function1[/* props */ ScrollSyncChildProps, ReactNode]]): Anon_ChildrenProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ChildrenProps]
  }
}

