package typings.sharepoint.SPNs.UtilitiesNs

import typings.sharepoint.SPNs.AppLicenseCollection
import typings.sharepoint.SPNs.BooleanResult
import typings.sharepoint.SPNs.ClientObjectList
import typings.sharepoint.SPNs.ClientRuntimeContext
import typings.sharepoint.SPNs.FieldUser
import typings.sharepoint.SPNs.File
import typings.sharepoint.SPNs.Guid
import typings.sharepoint.SPNs.GuidResult
import typings.sharepoint.SPNs.IntResult
import typings.sharepoint.SPNs.List
import typings.sharepoint.SPNs.ListItemCollection
import typings.sharepoint.SPNs.StringResult
import typings.sharepoint.SPNs.UserCollection
import typings.sharepoint.SPNs.Web
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Utilities.Utility")
@js.native
class Utility () extends js.Object {
  var lAYOUTS_LATESTVERSION_RELATIVE_URL: String = js.native
  var lAYOUTS_LATESTVERSION_URL: String = js.native
}

/* static members */
@JSGlobal("SP.Utilities.Utility")
@js.native
object Utility extends js.Object {
  def createEmailBodyForInvitation(context: ClientRuntimeContext, pageAddress: String): StringResult = js.native
  def createNewDiscussion[T](context: ClientRuntimeContext, list: List[_], title: String): typings.sharepoint.SPNs.ListItem[T] = js.native
  def createNewDiscussionReply[T](context: ClientRuntimeContext, parent: typings.sharepoint.SPNs.ListItem[T]): typings.sharepoint.SPNs.ListItem[T] = js.native
  def createWikiPageInContextWeb(context: ClientRuntimeContext, parameters: WikiPageCreationInformation): File = js.native
  def formatDateTime(context: ClientRuntimeContext, web: Web, datetime: Date, format: DateTimeFormat): StringResult = js.native
  def getAppLicenseDeploymentId(context: ClientRuntimeContext): GuidResult = js.native
  def getAppLicenseInformation(context: ClientRuntimeContext, productId: Guid): AppLicenseCollection = js.native
  def getCurrentUserEmailAddresses(context: ClientRuntimeContext): StringResult = js.native
  def getImageUrl(imageName: String): String = js.native
  def getLayoutsPageUrl(pageName: String): String = js.native
  def getLocalizedString(context: ClientRuntimeContext, source: String, defaultResourceFile: String, language: Double): StringResult = js.native
  def getLowerCaseString(context: ClientRuntimeContext, sourceValue: String, lcid: Double): StringResult = js.native
  def getPeoplePickerURL(context: ClientRuntimeContext, web: Web, fieldUser: FieldUser): StringResult = js.native
  def get_layoutsLatestVersionRelativeUrl(): String = js.native
  def get_layoutsLatestVersionUrl(): String = js.native
  def importAppLicense(
    context: ClientRuntimeContext,
    licenseTokenToImport: String,
    contentMarket: String,
    billingMarket: String,
    appName: String,
    iconUrl: String,
    providerName: String,
    appSubtype: Double
  ): Unit = js.native
  def isUserLicensedForEntityInContext(context: ClientRuntimeContext, licensableEntity: String): BooleanResult = js.native
  def localizeWebPartGallery(context: ClientRuntimeContext, items: ListItemCollection[_]): ClientObjectList[typings.sharepoint.SPNs.ListItem[_]] = js.native
  def logCustomAppError(context: ClientRuntimeContext, error: String): IntResult = js.native
  def logCustomRemoteAppError(context: ClientRuntimeContext, productId: Guid, error: String): IntResult = js.native
  def markDiscussionAsFeatured(context: ClientRuntimeContext, listID: String, topicIDs: String): Unit = js.native
  def resolvePrincipal(
    context: ClientRuntimeContext,
    web: Web,
    input: String,
    scopes: PrincipalType,
    sources: PrincipalSource,
    usersContainer: UserCollection,
    inputIsEmailOnly: Boolean
  ): PrincipalInfo = js.native
  def searchPrincipals(
    context: ClientRuntimeContext,
    web: Web,
    input: String,
    scopes: PrincipalType,
    sources: PrincipalSource,
    usersContainer: UserCollection,
    maxCount: Double
  ): js.Array[PrincipalInfo] = js.native
  def unmarkDiscussionAsFeatured(context: ClientRuntimeContext, listID: String, topicIDs: String): Unit = js.native
}

