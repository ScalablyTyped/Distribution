package typings.sarif.mod

import typings.sarif.mod.ReportingConfiguration.level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportingConfiguration_ extends js.Object {
  /**
    * Specifies whether the report may be produced during the scan.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the failure level for the report.
    */
  var level: js.UndefOr[level] = js.native
  /**
    * Contains configuration information specific to a report.
    */
  var parameters: js.UndefOr[PropertyBag] = js.native
  /**
    * Key/value pairs that provide additional information about the reporting configuration.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * Specifies the relative priority of the report. Used for analysis output only.
    */
  var rank: js.UndefOr[Double] = js.native
}

object ReportingConfiguration_ {
  @scala.inline
  def apply(): ReportingConfiguration_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportingConfiguration_]
  }
  @scala.inline
  implicit class ReportingConfiguration_Ops[Self <: ReportingConfiguration_] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setLevel(value: level): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setParameters(value: PropertyBag): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
  }
  
}

