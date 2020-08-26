package typings.rollup.mod

import typings.rollup.rollupStrings.`no-treeshake`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedId extends js.Object {
  var external: Boolean = js.native
  var id: String = js.native
  var moduleSideEffects: Boolean | `no-treeshake` = js.native
  var syntheticNamedExports: Boolean | String = js.native
}

object ResolvedId {
  @scala.inline
  def apply(
    external: Boolean,
    id: String,
    moduleSideEffects: Boolean | `no-treeshake`,
    syntheticNamedExports: Boolean | String
  ): ResolvedId = {
    val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], moduleSideEffects = moduleSideEffects.asInstanceOf[js.Any], syntheticNamedExports = syntheticNamedExports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedId]
  }
  @scala.inline
  implicit class ResolvedIdOps[Self <: ResolvedId] (val x: Self) extends AnyVal {
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
    def setExternal(value: Boolean): Self = this.set("external", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setModuleSideEffects(value: Boolean | `no-treeshake`): Self = this.set("moduleSideEffects", value.asInstanceOf[js.Any])
    @scala.inline
    def setSyntheticNamedExports(value: Boolean | String): Self = this.set("syntheticNamedExports", value.asInstanceOf[js.Any])
  }
  
}

