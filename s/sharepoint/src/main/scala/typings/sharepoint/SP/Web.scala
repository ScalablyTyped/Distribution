package typings.sharepoint.SP

import typings.sharepoint.SP.BusinessData.AppBdcCatalog
import typings.sharepoint.SP.BusinessData.Entity
import typings.sharepoint.SP.Utilities.IconSize
import typings.sharepoint.SP.Workflow.WorkflowAssociationCollection
import typings.sharepoint.SP.Workflow.WorkflowTemplateCollection
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Web extends SecurableObject {
  
  def applyTheme(
    colorPaletteUrl: String,
    fontSchemeUrl: String,
    backgroundImageUrl: String,
    shareGenerated: Boolean
  ): Unit = js.native
  
  def applyWebTemplate(webTemplate: String): Unit = js.native
  
  def deleteObject(): Unit = js.native
  
  def doesPushNotificationSubscriberExist(deviceAppInstanceId: Guid): BooleanResult = js.native
  
  def doesUserHavePermissions(permissionMask: BasePermissions): BooleanResult = js.native
  
  def ensureUser(logonName: String): User = js.native
  
  def getAppBdcCatalog(): AppBdcCatalog = js.native
  
  def getAppBdcCatalogForAppInstance(appInstanceId: Guid): AppBdcCatalog = js.native
  
  def getAppInstanceById(appInstanceId: Guid): AppInstance = js.native
  
  def getAppInstancesByProductId(productId: Guid): ClientObjectList[AppInstance] = js.native
  
  def getAvailableWebTemplates(lcid: Double, doIncludeCrossLanguage: Boolean): WebTemplateCollection = js.native
  
  def getCatalog(typeCatalog: Double): List[_] = js.native
  
  def getChanges(query: ChangeQuery): ChangeCollection = js.native
  
  def getEntity(namespace: String, name: String): Entity = js.native
  
  def getFileByServerRelativeUrl(serverRelativeUrl: String): File = js.native
  
  def getFolderByServerRelativeUrl(serverRelativeUrl: String): Folder = js.native
  
  /** Available after March 2015 CU for SharePoint 2013*/
  def getList(url: String): List[_] = js.native
  
  def getPushNotificationSubscriber(deviceAppInstanceId: Guid): PushNotificationSubscriber = js.native
  
  def getPushNotificationSubscribersByArgs(customArgs: String): PushNotificationSubscriberCollection = js.native
  
  def getPushNotificationSubscribersByUser(userName: String): PushNotificationSubscriberCollection = js.native
  
  def getSubwebsForCurrentUser(query: SubwebQuery): WebCollection = js.native
  
  def getUserById(userId: Double): User = js.native
  
  def getUserEffectivePermissions(userName: String): BasePermissions = js.native
  
  def get_allProperties(): PropertyValues = js.native
  
  def get_allowDesignerForCurrentUser(): Boolean = js.native
  
  def get_allowMasterPageEditingForCurrentUser(): Boolean = js.native
  
  def get_allowRevertFromTemplateForCurrentUser(): Boolean = js.native
  
  def get_allowRssFeeds(): Boolean = js.native
  
  def get_appInstanceId(): Guid = js.native
  
  def get_associatedMemberGroup(): Group = js.native
  
  def get_associatedOwnerGroup(): Group = js.native
  
  def get_associatedVisitorGroup(): Group = js.native
  
  def get_availableContentTypes(): ContentTypeCollection = js.native
  
  def get_availableFields(): FieldCollection = js.native
  
  def get_configuration(): Double = js.native
  
  def get_contentTypes(): ContentTypeCollection = js.native
  
  def get_created(): Date = js.native
  
  def get_currentUser(): User = js.native
  
  def get_customMasterUrl(): String = js.native
  
  def get_description(): String = js.native
  
  def get_documentLibraryCalloutOfficeWebAppPreviewersDisabled(): Boolean = js.native
  
  def get_effectiveBasePermissions(): BasePermissions = js.native
  
  def get_enableMinimalDownload(): Boolean = js.native
  
  def get_eventReceivers(): EventReceiverDefinitionCollection = js.native
  
  def get_features(): FeatureCollection = js.native
  
  def get_fields(): FieldCollection = js.native
  
  def get_folders(): FolderCollection = js.native
  
  def get_id(): Guid = js.native
  
  def get_language(): Double = js.native
  
  def get_lastItemModifiedDate(): Date = js.native
  
  def get_listTemplates(): ListTemplateCollection = js.native
  
  def get_lists(): ListCollection = js.native
  
  def get_masterUrl(): String = js.native
  
  def get_navigation(): Navigation = js.native
  
  def get_parentWeb(): WebInformation = js.native
  
  def get_pushNotificationSubscribers(): PushNotificationSubscriberCollection = js.native
  
  def get_quickLaunchEnabled(): Boolean = js.native
  
  def get_recycleBin(): RecycleBinItemCollection = js.native
  
  def get_recycleBinEnabled(): Boolean = js.native
  
  def get_regionalSettings(): RegionalSettings = js.native
  
  def get_roleDefinitions(): RoleDefinitionCollection = js.native
  
  def get_rootFolder(): Folder = js.native
  
  def get_saveSiteAsTemplateEnabled(): Boolean = js.native
  
  def get_serverRelativeUrl(): String = js.native
  
  def get_showUrlStructureForCurrentUser(): Boolean = js.native
  
  def get_siteGroups(): GroupCollection = js.native
  
  def get_siteLogoUrl(): String = js.native
  
  def get_siteUserInfoList(): List[_] = js.native
  
  def get_siteUsers(): UserCollection = js.native
  
  def get_supportedUILanguageIds(): js.Array[Double] = js.native
  
  def get_syndicationEnabled(): Boolean = js.native
  
  def get_themeInfo(): ThemeInfo = js.native
  
  def get_title(): String = js.native
  
  def get_treeViewEnabled(): Boolean = js.native
  
  def get_uIVersion(): Double = js.native
  
  def get_uIVersionConfigurationEnabled(): Boolean = js.native
  
  def get_url(): String = js.native
  
  def get_userCustomActions(): UserCustomActionCollection = js.native
  
  def get_webTemplate(): String = js.native
  
  def get_webs(): WebCollection = js.native
  
  def get_workflowAssociations(): WorkflowAssociationCollection = js.native
  
  def get_workflowTemplates(): WorkflowTemplateCollection = js.native
  
  def loadAndInstallApp(appPackageStream: Base64EncodedByteArray): AppInstance = js.native
  
  def loadAndInstallAppInSpecifiedLocale(appPackageStream: Base64EncodedByteArray, installationLocaleLCID: Double): AppInstance = js.native
  
  def loadApp(appPackageStream: Base64EncodedByteArray, installationLocaleLCID: Double): AppInstance = js.native
  
  def mapToIcon(fileName: String, progId: String, size: IconSize): StringResult = js.native
  
  def registerPushNotificationSubscriber(deviceAppInstanceId: Guid, serviceToken: String): PushNotificationSubscriber = js.native
  
  def set_associatedMemberGroup(value: Group): Unit = js.native
  
  def set_associatedOwnerGroup(value: Group): Unit = js.native
  
  def set_associatedVisitorGroup(value: Group): Unit = js.native
  
  def set_customMasterUrl(value: String): Unit = js.native
  
  def set_description(value: String): Unit = js.native
  
  def set_enableMinimalDownload(value: Boolean): Unit = js.native
  
  def set_masterUrl(value: String): Unit = js.native
  
  def set_quickLaunchEnabled(value: Boolean): Unit = js.native
  
  def set_saveSiteAsTemplateEnabled(value: Boolean): Unit = js.native
  
  def set_serverRelativeUrl(value: String): Unit = js.native
  
  def set_syndicationEnabled(value: Boolean): Unit = js.native
  
  def set_title(value: String): Unit = js.native
  
  def set_treeViewEnabled(value: Boolean): Unit = js.native
  
  def set_uIVersion(value: Double): Unit = js.native
  
  def set_uIVersionConfigurationEnabled(value: Boolean): Unit = js.native
  
  def unregisterPushNotificationSubscriber(deviceAppInstanceId: Guid): Unit = js.native
  
  def update(): Unit = js.native
}
