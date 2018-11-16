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

