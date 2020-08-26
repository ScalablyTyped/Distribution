package typings.rollupPluginutils.anon

import typings.rollupPluginutils.rollupPluginutilsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolve extends js.Object {
  var resolve: js.UndefOr[String | `false` | Null] = js.native
}

object Resolve {
  @scala.inline
  def apply(): Resolve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resolve]
  }
  @scala.inline
  implicit class ResolveOps[Self <: Resolve] (val x: Self) extends AnyVal {
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
    def setResolve(value: String | `false`): Self = this.set("resolve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    @scala.inline
    def setResolveNull: Self = this.set("resolve", null)
  }
  
}

