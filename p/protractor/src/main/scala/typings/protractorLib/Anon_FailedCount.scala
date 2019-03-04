package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailedCount extends js.Object {
  var failedCount: scala.Double
  var specResults: js.Array[protractorLib.builtPluginsMod.SpecResult]
}

object Anon_FailedCount {
  @scala.inline
  def apply(failedCount: scala.Double, specResults: js.Array[protractorLib.builtPluginsMod.SpecResult]): Anon_FailedCount = {
    val __obj = js.Dynamic.literal(failedCount = failedCount, specResults = specResults)
  
    __obj.asInstanceOf[Anon_FailedCount]
  }
}

