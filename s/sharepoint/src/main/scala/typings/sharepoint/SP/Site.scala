package typings.sharepoint.SP

import typings.sharepoint.SP.SiteHealth.SiteHealthSummary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Site extends ClientObject {
  def createPreviewSPSite(upgrade: Boolean, sendemail: Boolean): Unit = js.native
  def extendUpgradeReminderDate(): Unit = js.native
  def getCatalog(typeCatalog: Double): List[_] = js.native
  def getChanges(query: ChangeQuery): ChangeCollection = js.native
  def getCustomListTemplates(web: Web): ListTemplateCollection = js.native
  def getWebTemplates(LCID: Double, overrideCompatLevel: Double): WebTemplateCollection = js.native
  def get_allowDesigner(): Boolean = js.native
  def get_allowMasterPageEditing(): Boolean = js.native
  def get_allowRevertFromTemplate(): Boolean = js.native
  def get_allowSelfServiceUpgrade(): Boolean = js.native
  def get_allowSelfServiceUpgradeEvaluation(): Boolean = js.native
  def get_canUpgrade(): Boolean = js.native
  def get_compatibilityLevel(): Double = js.native
  def get_eventReceivers(): EventReceiverDefinitionCollection = js.native
  def get_features(): FeatureCollection = js.native
  def get_id(): Guid = js.native
  def get_lockIssue(): String = js.native
  def get_maxItemsPerThrottledOperation(): Double = js.native
  def get_owner(): User = js.native
  def get_primaryUri(): String = js.native
  def get_readOnly(): Boolean = js.native
  def get_recycleBin(): RecycleBinItemCollection = js.native
  def get_rootWeb(): Web = js.native
  def get_serverRelativeUrl(): String = js.native
  def get_shareByLinkEnabled(): Boolean = js.native
  def get_showUrlStructure(): Boolean = js.native
  def get_uIVersionConfigurationEnabled(): Boolean = js.native
  def get_upgradeInfo(): UpgradeInfo = js.native
  def get_upgradeReminderDate(): Date = js.native
  def get_upgrading(): Boolean = js.native
  def get_url(): String = js.native
  def get_usage(): UsageInfo = js.native
  def get_userCustomActions(): UserCustomActionCollection = js.native
  def invalidate(): Unit = js.native
  def needsUpgradeByType(versionUpgrade: Boolean, recursive: Boolean): BooleanResult = js.native
  def openWeb(strUrl: String): Web = js.native
  def openWebById(gWebId: Guid): Web = js.native
  def runHealthCheck(ruleId: Guid, bRepair: Boolean, bRunAlways: Boolean): SiteHealthSummary = js.native
  def runUpgradeSiteSession(versionUpgrade: Boolean, queueOnly: Boolean, sendEmail: Boolean): Unit = js.native
  def set_allowDesigner(value: Boolean): Unit = js.native
  def set_allowMasterPageEditing(value: Boolean): Unit = js.native
  def set_allowRevertFromTemplate(value: Boolean): Unit = js.native
  def set_allowSelfServiceUpgrade(value: Boolean): Unit = js.native
  def set_allowSelfServiceUpgradeEvaluation(value: Boolean): Unit = js.native
  def set_owner(value: User): Unit = js.native
  def set_showUrlStructure(value: Boolean): Unit = js.native
  def set_uIVersionConfigurationEnabled(value: Boolean): Unit = js.native
  def updateClientObjectModelUseRemoteAPIsPermissionSetting(requireUseRemoteAPIs: Boolean): Unit = js.native
}

