package typings.snabbdom.hooksMod

import typings.snabbdom.vnodeMod.VNode_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks extends js.Object {
  var create: js.UndefOr[CreateHook] = js.undefined
  var destroy: js.UndefOr[DestroyHook] = js.undefined
  var init: js.UndefOr[InitHook] = js.undefined
  var insert: js.UndefOr[InsertHook] = js.undefined
  var post: js.UndefOr[PostHook] = js.undefined
  var postpatch: js.UndefOr[PostPatchHook] = js.undefined
  var pre: js.UndefOr[PreHook] = js.undefined
  var prepatch: js.UndefOr[PrePatchHook] = js.undefined
  var remove: js.UndefOr[RemoveHook] = js.undefined
  var update: js.UndefOr[UpdateHook] = js.undefined
}

object Hooks {
  @scala.inline
  def apply(
    create: (/* emptyVNode */ VNode_, /* vNode */ VNode_) => js.Any = null,
    destroy: /* vNode */ VNode_ => js.Any = null,
    init: /* vNode */ VNode_ => js.Any = null,
    insert: /* vNode */ VNode_ => js.Any = null,
    post: () => js.Any = null,
    postpatch: (/* oldVNode */ VNode_, /* vNode */ VNode_) => js.Any = null,
    pre: () => js.Any = null,
    prepatch: (/* oldVNode */ VNode_, /* vNode */ VNode_) => js.Any = null,
    remove: (/* vNode */ VNode_, /* removeCallback */ js.Function0[Unit]) => js.Any = null,
    update: (/* oldVNode */ VNode_, /* vNode */ VNode_) => js.Any = null
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction1(insert))
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction0(post))
    if (postpatch != null) __obj.updateDynamic("postpatch")(js.Any.fromFunction2(postpatch))
    if (pre != null) __obj.updateDynamic("pre")(js.Any.fromFunction0(pre))
    if (prepatch != null) __obj.updateDynamic("prepatch")(js.Any.fromFunction2(prepatch))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2(remove))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    __obj.asInstanceOf[Hooks]
  }
}

