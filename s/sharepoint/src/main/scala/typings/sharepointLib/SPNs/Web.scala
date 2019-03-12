package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Web")
@js.native
class Web () extends SecurableObject {
  def applyTheme(
    colorPaletteUrl: java.lang.String,
    fontSchemeUrl: java.lang.String,
    backgroundImageUrl: java.lang.String,
    shareGenerated: scala.Boolean
  ): scala.Unit = js.native
  def applyWebTemplate(webTemplate: java.lang.String): scala.Unit = js.native
  def deleteObject(): scala.Unit = js.native
  def doesPushNotificationSubscriberExist(deviceAppInstanceId: Guid): BooleanResult = js.native
  def doesUserHavePermissions(permissionMask: BasePermissions): BooleanResult = js.native
  def ensureUser(logonName: java.lang.String): User = js.native
  def getAppBdcCatalog(): sharepointLib.SPNs.BusinessDataNs.AppBdcCatalog = js.native
  def getAppBdcCatalogForAppInstance(appInstanceId: Guid): sharepointLib.SPNs.BusinessDataNs.AppBdcCatalog = js.native
  def getAppInstanceById(appInstanceId: Guid): AppInstance = js.native
  def getAppInstancesByProductId(productId: Guid): ClientObjectList[AppInstance] = js.native
  def getAvailableWebTemplates(lcid: scala.Double, doIncludeCrossLanguage: scala.Boolean): WebTemplateCollection = js.native
  def getCatalog(typeCatalog: scala.Double): List[_] = js.native
  def getChanges(query: ChangeQuery): ChangeCollection = js.native
  def getEntity(namespace: java.lang.String, name: java.lang.String): sharepointLib.SPNs.BusinessDataNs.Entity = js.native
  def getFileByServerRelativeUrl(serverRelativeUrl: java.lang.String): File = js.native
  def getFolderByServerRelativeUrl(serverRelativeUrl: java.lang.String): Folder = js.native
  /** Available after March 2015 CU for SharePoint 2013*/
  def getList(url: java.lang.String): List[_] = js.native
  def getPushNotificationSubscriber(deviceAppInstanceId: Guid): PushNotificationSubscriber = js.native
  def getPushNotificationSubscribersByArgs(customArgs: java.lang.String): PushNotificationSubscriberCollection = js.native
  def getPushNotificationSubscribersByUser(userName: java.lang.String): PushNotificationSubscriberCollection = js.native
  def getSubwebsForCurrentUser(query: SubwebQuery): WebCollection = js.native
  def getUserById(userId: scala.Double): User = js.native
  def getUserEffectivePermissions(userName: java.lang.String): BasePermissions = js.native
  def get_allProperties(): PropertyValues = js.native
  def get_allowDesignerForCurrentUser(): scala.Boolean = js.native
  def get_allowMasterPageEditingForCurrentUser(): scala.Boolean = js.native
  def get_allowRevertFromTemplateForCurrentUser(): scala.Boolean = js.native
  def get_allowRssFeeds(): scala.Boolean = js.native
  def get_appInstanceId(): Guid = js.native
  def get_associatedMemberGroup(): Group = js.native
  def get_associatedOwnerGroup(): Group = js.native
  def get_associatedVisitorGroup(): Group = js.native
  def get_availableContentTypes(): ContentTypeCollection = js.native
  def get_availableFields(): FieldCollection = js.native
  def get_configuration(): scala.Double = js.native
  def get_contentTypes(): ContentTypeCollection = js.native
  def get_created(): stdLib.Date = js.native
  def get_currentUser(): User = js.native
  def get_customMasterUrl(): java.lang.String = js.native
  def get_description(): java.lang.String = js.native
  def get_documentLibraryCalloutOfficeWebAppPreviewersDisabled(): scala.Boolean = js.native
  def get_effectiveBasePermissions(): BasePermissions = js.native
  def get_enableMinimalDownload(): scala.Boolean = js.native
  def get_eventReceivers(): EventReceiverDefinitionCollection = js.native
  def get_features(): FeatureCollection = js.native
  def get_fields(): FieldCollection = js.native
  def get_folders(): FolderCollection = js.native
  def get_id(): Guid = js.native
  def get_language(): scala.Double = js.native
  def get_lastItemModifiedDate(): stdLib.Date = js.native
  def get_listTemplates(): ListTemplateCollection = js.native
  def get_lists(): ListCollection = js.native
  def get_masterUrl(): java.lang.String = js.native
  def get_navigation(): Navigation = js.native
  def get_parentWeb(): WebInformation = js.native
  def get_pushNotificationSubscribers(): PushNotificationSubscriberCollection = js.native
  def get_quickLaunchEnabled(): scala.Boolean = js.native
  def get_recycleBin(): RecycleBinItemCollection = js.native
  def get_recycleBinEnabled(): scala.Boolean = js.native
  def get_regionalSettings(): RegionalSettings = js.native
  def get_roleDefinitions(): RoleDefinitionCollection = js.native
  def get_rootFolder(): Folder = js.native
  def get_saveSiteAsTemplateEnabled(): scala.Boolean = js.native
  def get_serverRelativeUrl(): java.lang.String = js.native
  def get_showUrlStructureForCurrentUser(): scala.Boolean = js.native
  def get_siteGroups(): GroupCollection = js.native
  def get_siteLogoUrl(): java.lang.String = js.native
  def get_siteUserInfoList(): List[_] = js.native
  def get_siteUsers(): UserCollection = js.native
  def get_supportedUILanguageIds(): js.Array[scala.Double] = js.native
  def get_syndicationEnabled(): scala.Boolean = js.native
  def get_themeInfo(): ThemeInfo = js.native
  def get_title(): java.lang.String = js.native
  def get_treeViewEnabled(): scala.Boolean = js.native
  def get_uIVersion(): scala.Double = js.native
  def get_uIVersionConfigurationEnabled(): scala.Boolean = js.native
  def get_url(): java.lang.String = js.native
  def get_userCustomActions(): UserCustomActionCollection = js.native
  def get_webTemplate(): java.lang.String = js.native
  def get_webs(): WebCollection = js.native
  def get_workflowAssociations(): sharepointLib.SPNs.WorkflowNs.WorkflowAssociationCollection = js.native
  def get_workflowTemplates(): sharepointLib.SPNs.WorkflowNs.WorkflowTemplateCollection = js.native
  def loadAndInstallApp(appPackageStream: Base64EncodedByteArray): AppInstance = js.native
  def loadAndInstallAppInSpecifiedLocale(appPackageStream: Base64EncodedByteArray, installationLocaleLCID: scala.Double): AppInstance = js.native
  def loadApp(appPackageStream: Base64EncodedByteArray, installationLocaleLCID: scala.Double): AppInstance = js.native
  def mapToIcon(
    fileName: java.lang.String,
    progId: java.lang.String,
    size: sharepointLib.SPNs.UtilitiesNs.IconSize
  ): StringResult = js.native
  def registerPushNotificationSubscriber(deviceAppInstanceId: Guid, serviceToken: java.lang.String): PushNotificationSubscriber = js.native
  def set_associatedMemberGroup(value: Group): scala.Unit = js.native
  def set_associatedOwnerGroup(value: Group): scala.Unit = js.native
  def set_associatedVisitorGroup(value: Group): scala.Unit = js.native
  def set_customMasterUrl(value: java.lang.String): scala.Unit = js.native
  def set_description(value: java.lang.String): scala.Unit = js.native
  def set_enableMinimalDownload(value: scala.Boolean): scala.Unit = js.native
  def set_masterUrl(value: java.lang.String): scala.Unit = js.native
  def set_quickLaunchEnabled(value: scala.Boolean): scala.Unit = js.native
  def set_saveSiteAsTemplateEnabled(value: scala.Boolean): scala.Unit = js.native
  def set_serverRelativeUrl(value: java.lang.String): scala.Unit = js.native
  def set_syndicationEnabled(value: scala.Boolean): scala.Unit = js.native
  def set_title(value: java.lang.String): scala.Unit = js.native
  def set_treeViewEnabled(value: scala.Boolean): scala.Unit = js.native
  def set_uIVersion(value: scala.Double): scala.Unit = js.native
  def set_uIVersionConfigurationEnabled(value: scala.Boolean): scala.Unit = js.native
  def unregisterPushNotificationSubscriber(deviceAppInstanceId: Guid): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

