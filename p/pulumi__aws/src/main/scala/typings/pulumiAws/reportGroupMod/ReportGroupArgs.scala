package typings.pulumiAws.reportGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.codebuild.ReportGroupExportConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportGroupArgs extends js.Object {
  
  /**
    * Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
    */
  val exportConfig: Input[ReportGroupExportConfig] = js.native
  
  /**
    * The name of a Report Group.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The export configuration type. Valid values are `S3` and `NO_EXPORT`.
    */
  val `type`: Input[String] = js.native
}
object ReportGroupArgs {
  
  @scala.inline
  def apply(exportConfig: Input[ReportGroupExportConfig], `type`: Input[String]): ReportGroupArgs = {
    val __obj = js.Dynamic.literal(exportConfig = exportConfig.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportGroupArgs]
  }
  
  @scala.inline
  implicit class ReportGroupArgsOps[Self <: ReportGroupArgs] (val x: Self) extends AnyVal {
    
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
    def setExportConfig(value: Input[ReportGroupExportConfig]): Self = this.set("exportConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
