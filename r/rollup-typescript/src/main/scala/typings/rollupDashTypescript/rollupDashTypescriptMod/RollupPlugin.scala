package typings.rollupDashTypescript.rollupDashTypescriptMod

import typings.rollupDashTypescript.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupPlugin extends js.Object {
  def load(id: String): String
  def resolveId(importee: String, importer: String): js.Any
  def transform(code: String, id: String): Anon_Code
}

object RollupPlugin {
  @scala.inline
  def apply(
    load: String => String,
    resolveId: (String, String) => js.Any,
    transform: (String, String) => Anon_Code
  ): RollupPlugin = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load), resolveId = js.Any.fromFunction2(resolveId), transform = js.Any.fromFunction2(transform))
  
    __obj.asInstanceOf[RollupPlugin]
  }
}

