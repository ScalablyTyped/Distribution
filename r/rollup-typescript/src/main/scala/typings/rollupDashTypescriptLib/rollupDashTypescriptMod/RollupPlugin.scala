package typings
package rollupDashTypescriptLib.rollupDashTypescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupPlugin extends js.Object {
  def load(id: java.lang.String): java.lang.String
  def resolveId(importee: java.lang.String, importer: java.lang.String): js.Any
  def transform(code: java.lang.String, id: java.lang.String): rollupDashTypescriptLib.Anon_Code
}

object RollupPlugin {
  @scala.inline
  def apply(
    load: js.Function1[java.lang.String, java.lang.String],
    resolveId: js.Function2[java.lang.String, java.lang.String, js.Any],
    transform: js.Function2[java.lang.String, java.lang.String, rollupDashTypescriptLib.Anon_Code]
  ): RollupPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("resolveId")(resolveId)
    __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[RollupPlugin]
  }
}

