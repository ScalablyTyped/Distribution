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
    load: java.lang.String => java.lang.String,
    resolveId: (java.lang.String, java.lang.String) => js.Any,
    transform: (java.lang.String, java.lang.String) => rollupDashTypescriptLib.Anon_Code
  ): RollupPlugin = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load), resolveId = js.Any.fromFunction2(resolveId), transform = js.Any.fromFunction2(transform))
  
    __obj.asInstanceOf[RollupPlugin]
  }
}

