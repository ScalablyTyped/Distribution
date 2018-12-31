package typings
package snabbdomLib.hooksMod

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

