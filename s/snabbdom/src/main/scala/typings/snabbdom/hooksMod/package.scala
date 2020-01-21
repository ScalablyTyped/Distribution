package typings.snabbdom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hooksMod {
  type CreateHook = js.Function2[
    /* emptyVNode */ typings.snabbdom.vnodeMod.VNode_, 
    /* vNode */ typings.snabbdom.vnodeMod.VNode_, 
    js.Any
  ]
  type DestroyHook = js.Function1[/* vNode */ typings.snabbdom.vnodeMod.VNode_, js.Any]
  type InitHook = js.Function1[/* vNode */ typings.snabbdom.vnodeMod.VNode_, js.Any]
  type InsertHook = js.Function1[/* vNode */ typings.snabbdom.vnodeMod.VNode_, js.Any]
  type PostHook = js.Function0[js.Any]
  type PostPatchHook = js.Function2[
    /* oldVNode */ typings.snabbdom.vnodeMod.VNode_, 
    /* vNode */ typings.snabbdom.vnodeMod.VNode_, 
    js.Any
  ]
  type PreHook = js.Function0[js.Any]
  type PrePatchHook = js.Function2[
    /* oldVNode */ typings.snabbdom.vnodeMod.VNode_, 
    /* vNode */ typings.snabbdom.vnodeMod.VNode_, 
    js.Any
  ]
  type RemoveHook = js.Function2[
    /* vNode */ typings.snabbdom.vnodeMod.VNode_, 
    /* removeCallback */ js.Function0[scala.Unit], 
    js.Any
  ]
  type UpdateHook = js.Function2[
    /* oldVNode */ typings.snabbdom.vnodeMod.VNode_, 
    /* vNode */ typings.snabbdom.vnodeMod.VNode_, 
    js.Any
  ]
}
