package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenProps extends js.Object {
  var children: reactLib.reactMod.Validator[
    js.Function1[
      /* props */ reactDashVirtualizedLib.distEsScrollSyncMod.ScrollSyncChildProps, 
      reactLib.reactMod.ReactNode
    ]
  ]
}

object Anon_ChildrenProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.Validator[
      js.Function1[
        /* props */ reactDashVirtualizedLib.distEsScrollSyncMod.ScrollSyncChildProps, 
        reactLib.reactMod.ReactNode
      ]
    ]
  ): Anon_ChildrenProps = {
    val __obj = js.Dynamic.literal(children = children)
  
    __obj.asInstanceOf[Anon_ChildrenProps]
  }
}

