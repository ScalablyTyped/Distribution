package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  value  :T,   upstreamState__INTERNAL_DO_NOT_USE ? :recoil.recoil.TreeState}> */
trait ResolvedLoadablePromiseInfo[T] extends js.Object {
  val upstreamState__INTERNAL_DO_NOT_USE: js.UndefOr[TreeState] = js.undefined
  val value: T
}

object ResolvedLoadablePromiseInfo {
  @scala.inline
  def apply[T](value: T, upstreamState__INTERNAL_DO_NOT_USE: TreeState = null): ResolvedLoadablePromiseInfo[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (upstreamState__INTERNAL_DO_NOT_USE != null) __obj.updateDynamic("upstreamState__INTERNAL_DO_NOT_USE")(upstreamState__INTERNAL_DO_NOT_USE.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedLoadablePromiseInfo[T]]
  }
}

