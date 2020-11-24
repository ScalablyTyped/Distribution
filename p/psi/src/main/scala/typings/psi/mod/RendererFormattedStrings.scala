package typings.psi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RendererFormattedStrings extends js.Object {
  
  var auditGroupExpandTooltip: String = js.native
  
  var crcInitialNavigation: String = js.native
  
  var crcLongestDurationLabel: String = js.native
  
  var errorLabel: String = js.native
  
  var errorMissingAuditInfo: String = js.native
  
  var labDataTitle: String = js.native
  
  var lsPerformanceCategoryDescription: String = js.native
  
  var manualAuditsGroupTitle: String = js.native
  
  var notApplicableAuditsGroupTitle: String = js.native
  
  var opportunityResourceColumnLabel: String = js.native
  
  var opportunitySavingsColumnLabel: String = js.native
  
  var passedAuditsGroupTitle: String = js.native
  
  var scorescaleLabel: String = js.native
  
  var toplevelWarningsMessage: String = js.native
  
  var varianceDisclaimer: String = js.native
  
  var warningHeader: String = js.native
}
object RendererFormattedStrings {
  
  @scala.inline
  def apply(
    auditGroupExpandTooltip: String,
    crcInitialNavigation: String,
    crcLongestDurationLabel: String,
    errorLabel: String,
    errorMissingAuditInfo: String,
    labDataTitle: String,
    lsPerformanceCategoryDescription: String,
    manualAuditsGroupTitle: String,
    notApplicableAuditsGroupTitle: String,
    opportunityResourceColumnLabel: String,
    opportunitySavingsColumnLabel: String,
    passedAuditsGroupTitle: String,
    scorescaleLabel: String,
    toplevelWarningsMessage: String,
    varianceDisclaimer: String,
    warningHeader: String
  ): RendererFormattedStrings = {
    val __obj = js.Dynamic.literal(auditGroupExpandTooltip = auditGroupExpandTooltip.asInstanceOf[js.Any], crcInitialNavigation = crcInitialNavigation.asInstanceOf[js.Any], crcLongestDurationLabel = crcLongestDurationLabel.asInstanceOf[js.Any], errorLabel = errorLabel.asInstanceOf[js.Any], errorMissingAuditInfo = errorMissingAuditInfo.asInstanceOf[js.Any], labDataTitle = labDataTitle.asInstanceOf[js.Any], lsPerformanceCategoryDescription = lsPerformanceCategoryDescription.asInstanceOf[js.Any], manualAuditsGroupTitle = manualAuditsGroupTitle.asInstanceOf[js.Any], notApplicableAuditsGroupTitle = notApplicableAuditsGroupTitle.asInstanceOf[js.Any], opportunityResourceColumnLabel = opportunityResourceColumnLabel.asInstanceOf[js.Any], opportunitySavingsColumnLabel = opportunitySavingsColumnLabel.asInstanceOf[js.Any], passedAuditsGroupTitle = passedAuditsGroupTitle.asInstanceOf[js.Any], scorescaleLabel = scorescaleLabel.asInstanceOf[js.Any], toplevelWarningsMessage = toplevelWarningsMessage.asInstanceOf[js.Any], varianceDisclaimer = varianceDisclaimer.asInstanceOf[js.Any], warningHeader = warningHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererFormattedStrings]
  }
  
  @scala.inline
  implicit class RendererFormattedStringsOps[Self <: RendererFormattedStrings] (val x: Self) extends AnyVal {
    
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
    def setAuditGroupExpandTooltip(value: String): Self = this.set("auditGroupExpandTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrcInitialNavigation(value: String): Self = this.set("crcInitialNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrcLongestDurationLabel(value: String): Self = this.set("crcLongestDurationLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorLabel(value: String): Self = this.set("errorLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMissingAuditInfo(value: String): Self = this.set("errorMissingAuditInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabDataTitle(value: String): Self = this.set("labDataTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLsPerformanceCategoryDescription(value: String): Self = this.set("lsPerformanceCategoryDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualAuditsGroupTitle(value: String): Self = this.set("manualAuditsGroupTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotApplicableAuditsGroupTitle(value: String): Self = this.set("notApplicableAuditsGroupTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpportunityResourceColumnLabel(value: String): Self = this.set("opportunityResourceColumnLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpportunitySavingsColumnLabel(value: String): Self = this.set("opportunitySavingsColumnLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassedAuditsGroupTitle(value: String): Self = this.set("passedAuditsGroupTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScorescaleLabel(value: String): Self = this.set("scorescaleLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToplevelWarningsMessage(value: String): Self = this.set("toplevelWarningsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarianceDisclaimer(value: String): Self = this.set("varianceDisclaimer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningHeader(value: String): Self = this.set("warningHeader", value.asInstanceOf[js.Any])
  }
}
