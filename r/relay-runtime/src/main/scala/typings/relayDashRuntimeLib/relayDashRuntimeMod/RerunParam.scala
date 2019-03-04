package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RerunParam extends js.Object {
  var `import`: java.lang.String
  var max_runs: scala.Double
  var param: java.lang.String
}

object RerunParam {
  @scala.inline
  def apply(`import`: java.lang.String, max_runs: scala.Double, param: java.lang.String): RerunParam = {
    val __obj = js.Dynamic.literal(max_runs = max_runs, param = param)
    __obj.updateDynamic("import")(`import`)
    __obj.asInstanceOf[RerunParam]
  }
}

