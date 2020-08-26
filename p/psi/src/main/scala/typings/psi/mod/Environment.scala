package typings.psi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment extends js.Object {
  var benchmarkIndex: Double = js.native
  var hostUserAgent: String = js.native
  var networkUserAgent: String = js.native
}

object Environment {
  @scala.inline
  def apply(benchmarkIndex: Double, hostUserAgent: String, networkUserAgent: String): Environment = {
    val __obj = js.Dynamic.literal(benchmarkIndex = benchmarkIndex.asInstanceOf[js.Any], hostUserAgent = hostUserAgent.asInstanceOf[js.Any], networkUserAgent = networkUserAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
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
    def setBenchmarkIndex(value: Double): Self = this.set("benchmarkIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostUserAgent(value: String): Self = this.set("hostUserAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkUserAgent(value: String): Self = this.set("networkUserAgent", value.asInstanceOf[js.Any])
  }
  
}

