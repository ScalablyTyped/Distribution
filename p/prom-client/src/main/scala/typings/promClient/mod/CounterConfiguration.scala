package typings.promClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CounterConfiguration extends js.Object {
  var aggregator: js.UndefOr[Aggregator] = js.native
  var help: String = js.native
  var labelNames: js.UndefOr[js.Array[String]] = js.native
  var name: String = js.native
  var registers: js.UndefOr[js.Array[Registry]] = js.native
}

object CounterConfiguration {
  @scala.inline
  def apply(help: String, name: String): CounterConfiguration = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CounterConfiguration]
  }
  @scala.inline
  implicit class CounterConfigurationOps[Self <: CounterConfiguration] (val x: Self) extends AnyVal {
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
    def setHelp(value: String): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAggregator(value: Aggregator): Self = this.set("aggregator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregator: Self = this.set("aggregator", js.undefined)
    @scala.inline
    def setLabelNamesVarargs(value: String*): Self = this.set("labelNames", js.Array(value :_*))
    @scala.inline
    def setLabelNames(value: js.Array[String]): Self = this.set("labelNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelNames: Self = this.set("labelNames", js.undefined)
    @scala.inline
    def setRegistersVarargs(value: Registry*): Self = this.set("registers", js.Array(value :_*))
    @scala.inline
    def setRegisters(value: js.Array[Registry]): Self = this.set("registers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisters: Self = this.set("registers", js.undefined)
  }
  
}

