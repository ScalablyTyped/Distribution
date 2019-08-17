package typings.snabbdom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hooksMod {
  import typings.snabbdom.vnodeMod.VNode

  type CreateHook = js.Function2[/* emptyVNode */ VNode, /* vNode */ VNode, js.Any]
  type DestroyHook = js.Function1[/* vNode */ VNode, js.Any]
  type InitHook = js.Function1[/* vNode */ VNode, js.Any]
  type InsertHook = js.Function1[/* vNode */ VNode, js.Any]
  type PostHook = js.Function0[js.Any]
  type PostPatchHook = js.Function2[/* oldVNode */ VNode, /* vNode */ VNode, js.Any]
  type PreHook = js.Function0[js.Any]
  type PrePatchHook = js.Function2[/* oldVNode */ VNode, /* vNode */ VNode, js.Any]
  type RemoveHook = js.Function2[/* vNode */ VNode, /* removeCallback */ js.Function0[Unit], js.Any]
  type UpdateHook = js.Function2[/* oldVNode */ VNode, /* vNode */ VNode, js.Any]
}
