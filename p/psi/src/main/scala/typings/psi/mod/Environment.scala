package typings.psi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  var benchmarkIndex: Double
  var hostUserAgent: String
  var networkUserAgent: String
}

object Environment {
  @scala.inline
  def apply(benchmarkIndex: Double, hostUserAgent: String, networkUserAgent: String): Environment = {
    val __obj = js.Dynamic.literal(benchmarkIndex = benchmarkIndex.asInstanceOf[js.Any], hostUserAgent = hostUserAgent.asInstanceOf[js.Any], networkUserAgent = networkUserAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
}

