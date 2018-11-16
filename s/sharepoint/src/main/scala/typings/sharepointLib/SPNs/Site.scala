package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Site")
@js.native
class Site () extends ClientObject {
  def createPreviewSPSite(upgrade: scala.Boolean, sendemail: scala.Boolean): scala.Unit = js.native
  def extendUpgradeReminderDate(): scala.Unit = js.native
  def getCatalog(typeCatalog: scala.Double): List[_] = js.native
  def getChanges(query: ChangeQuery): ChangeCollection = js.native
  def getCustomListTemplates(web: Web): ListTemplateCollection = js.native
  def getWebTemplates(LCID: scala.Double, overrideCompatLevel: scala.Double): WebTemplateCollection = js.native
  def get_allowDesigner(): scala.Boolean = js.native
  def get_allowMasterPageEditing(): scala.Boolean = js.native
  def get_allowRevertFromTemplate(): scala.Boolean = js.native
  def get_allowSelfServiceUpgrade(): scala.Boolean = js.native
  def get_allowSelfServiceUpgradeEvaluation(): scala.Boolean = js.native
  def get_canUpgrade(): scala.Boolean = js.native
  def get_compatibilityLevel(): scala.Double = js.native
  def get_eventReceivers(): EventReceiverDefinitionCollection = js.native
  def get_features(): FeatureCollection = js.native
  def get_id(): Guid = js.native
  def get_lockIssue(): java.lang.String = js.native
  def get_maxItemsPerThrottledOperation(): scala.Double = js.native
  def get_owner(): User = js.native
  def get_primaryUri(): java.lang.String = js.native
  def get_readOnly(): scala.Boolean = js.native
  def get_recycleBin(): RecycleBinItemCollection = js.native
  def get_rootWeb(): Web = js.native
  def get_serverRelativeUrl(): java.lang.String = js.native
  def get_shareByLinkEnabled(): scala.Boolean = js.native
  def get_showUrlStructure(): scala.Boolean = js.native
  def get_uIVersionConfigurationEnabled(): scala.Boolean = js.native
  def get_upgradeInfo(): UpgradeInfo = js.native
  def get_upgradeReminderDate(): stdLib.Date = js.native
  def get_upgrading(): scala.Boolean = js.native
  def get_url(): java.lang.String = js.native
  def get_usage(): UsageInfo = js.native
  def get_userCustomActions(): UserCustomActionCollection = js.native
  def invalidate(): scala.Unit = js.native
  def needsUpgradeByType(versionUpgrade: scala.Boolean, recursive: scala.Boolean): BooleanResult = js.native
  def openWeb(strUrl: java.lang.String): Web = js.native
  def openWebById(gWebId: Guid): Web = js.native
  def runHealthCheck(ruleId: Guid, bRepair: scala.Boolean, bRunAlways: scala.Boolean): sharepointLib.SPNs.SiteHealthNs.SiteHealthSummary = js.native
  def runUpgradeSiteSession(versionUpgrade: scala.Boolean, queueOnly: scala.Boolean, sendEmail: scala.Boolean): scala.Unit = js.native
  def set_allowDesigner(value: scala.Boolean): scala.Unit = js.native
  def set_allowMasterPageEditing(value: scala.Boolean): scala.Unit = js.native
  def set_allowRevertFromTemplate(value: scala.Boolean): scala.Unit = js.native
  def set_allowSelfServiceUpgrade(value: scala.Boolean): scala.Unit = js.native
  def set_allowSelfServiceUpgradeEvaluation(value: scala.Boolean): scala.Unit = js.native
  def set_owner(value: User): scala.Unit = js.native
  def set_showUrlStructure(value: scala.Boolean): scala.Unit = js.native
  def set_uIVersionConfigurationEnabled(value: scala.Boolean): scala.Unit = js.native
  def updateClientObjectModelUseRemoteAPIsPermissionSetting(requireUseRemoteAPIs: scala.Boolean): scala.Unit = js.native
}

