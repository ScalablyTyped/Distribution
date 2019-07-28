package typings.snabbdom.hooksMod

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
    create: CreateHook = null,
    destroy: DestroyHook = null,
    init: InitHook = null,
    insert: InsertHook = null,
    post: PostHook = null,
    postpatch: PostPatchHook = null,
    pre: PreHook = null,
    prepatch: PrePatchHook = null,
    remove: RemoveHook = null,
    update: UpdateHook = null
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (init != null) __obj.updateDynamic("init")(init)
    if (insert != null) __obj.updateDynamic("insert")(insert)
    if (post != null) __obj.updateDynamic("post")(post)
    if (postpatch != null) __obj.updateDynamic("postpatch")(postpatch)
    if (pre != null) __obj.updateDynamic("pre")(pre)
    if (prepatch != null) __obj.updateDynamic("prepatch")(prepatch)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Hooks]
  }
}

