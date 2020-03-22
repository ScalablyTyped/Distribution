package typings.snabbdom

import typings.snabbdom.hooksMod.CreateHook
import typings.snabbdom.hooksMod.DestroyHook
import typings.snabbdom.hooksMod.PostHook
import typings.snabbdom.hooksMod.PreHook
import typings.snabbdom.hooksMod.RemoveHook
import typings.snabbdom.hooksMod.UpdateHook
import typings.snabbdom.vnodeMod.VNode_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<snabbdom.snabbdom/modules/module.Module> */
trait PartialModule extends js.Object {
  var create: js.UndefOr[CreateHook] = js.undefined
  var destroy: js.UndefOr[DestroyHook] = js.undefined
  var post: js.UndefOr[PostHook] = js.undefined
  var pre: js.UndefOr[PreHook] = js.undefined
  var remove: js.UndefOr[RemoveHook] = js.undefined
  var update: js.UndefOr[UpdateHook] = js.undefined
}

object PartialModule {
  @scala.inline
  def apply(
    create: (/* emptyVNode */ VNode_, /* vNode */ VNode_) => js.Any = null,
    destroy: /* vNode */ VNode_ => js.Any = null,
    post: () => js.Any = null,
    pre: () => js.Any = null,
    remove: (/* vNode */ VNode_, /* removeCallback */ js.Function0[Unit]) => js.Any = null,
    update: (/* oldVNode */ VNode_, /* vNode */ VNode_) => js.Any = null
  ): PartialModule = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction0(post))
    if (pre != null) __obj.updateDynamic("pre")(js.Any.fromFunction0(pre))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2(remove))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    __obj.asInstanceOf[PartialModule]
  }
}

