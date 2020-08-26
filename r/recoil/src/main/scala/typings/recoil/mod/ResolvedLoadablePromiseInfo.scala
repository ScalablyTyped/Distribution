package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  value :T,   upstreamState__INTERNAL_DO_NOT_USE :recoil.recoil.TreeState | undefined}> */
@js.native
trait ResolvedLoadablePromiseInfo[T] extends js.Object {
  val upstreamState__INTERNAL_DO_NOT_USE: js.UndefOr[TreeState] = js.native
  val value: T = js.native
}

object ResolvedLoadablePromiseInfo {
  @scala.inline
  def apply[T](value: T): ResolvedLoadablePromiseInfo[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedLoadablePromiseInfo[T]]
  }
  @scala.inline
  implicit class ResolvedLoadablePromiseInfoOps[Self <: ResolvedLoadablePromiseInfo[_], T] (val x: Self with ResolvedLoadablePromiseInfo[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpstreamState__INTERNAL_DO_NOT_USE(value: TreeState): Self = this.set("upstreamState__INTERNAL_DO_NOT_USE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpstreamState__INTERNAL_DO_NOT_USE: Self = this.set("upstreamState__INTERNAL_DO_NOT_USE", js.undefined)
  }
  
}

