package typings.semanticUiReact.sidebarSidebarMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.sidebarPushableMod.SidebarPushableProps
import typings.semanticUiReact.sidebarPusherMod.SidebarPusherProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidebarComponent extends ComponentClass[SidebarProps, ComponentState] {
  var Pushable: StatelessComponent[SidebarPushableProps] = js.native
  var Pusher: StatelessComponent[SidebarPusherProps] = js.native
}

