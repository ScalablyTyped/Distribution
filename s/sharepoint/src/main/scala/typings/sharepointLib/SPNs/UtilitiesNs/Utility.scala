package typings
package sharepointLib.SPNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Utilities.Utility")
@js.native
class Utility () extends js.Object {
  var lAYOUTS_LATESTVERSION_RELATIVE_URL: java.lang.String = js.native
  var lAYOUTS_LATESTVERSION_URL: java.lang.String = js.native
}

/* static members */
@JSGlobal("SP.Utilities.Utility")
@js.native
object Utility extends js.Object {
  def createEmailBodyForInvitation(context: sharepointLib.SPNs.ClientRuntimeContext, pageAddress: java.lang.String): sharepointLib.SPNs.StringResult = js.native
  def createNewDiscussion[T](
    context: sharepointLib.SPNs.ClientRuntimeContext,
    list: sharepointLib.SPNs.List[_],
    title: java.lang.String
  ): sharepointLib.SPNs.ListItem[T] = js.native
  def createNewDiscussionReply[T](context: sharepointLib.SPNs.ClientRuntimeContext, parent: sharepointLib.SPNs.ListItem[T]): sharepointLib.SPNs.ListItem[T] = js.native
  def createWikiPageInContextWeb(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    parameters: sharepointLib.SPNs.UtilitiesNs.WikiPageCreationInformation
  ): sharepointLib.SPNs.File = js.native
  def formatDateTime(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    web: sharepointLib.SPNs.Web,
    datetime: stdLib.Date,
    format: sharepointLib.SPNs.UtilitiesNs.DateTimeFormat
  ): sharepointLib.SPNs.StringResult = js.native
  def getAppLicenseDeploymentId(context: sharepointLib.SPNs.ClientRuntimeContext): sharepointLib.SPNs.GuidResult = js.native
  def getAppLicenseInformation(context: sharepointLib.SPNs.ClientRuntimeContext, productId: sharepointLib.SPNs.Guid): sharepointLib.SPNs.AppLicenseCollection = js.native
  def getCurrentUserEmailAddresses(context: sharepointLib.SPNs.ClientRuntimeContext): sharepointLib.SPNs.StringResult = js.native
  def getImageUrl(imageName: java.lang.String): java.lang.String = js.native
  def getLayoutsPageUrl(pageName: java.lang.String): java.lang.String = js.native
  def getLocalizedString(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    source: java.lang.String,
    defaultResourceFile: java.lang.String,
    language: scala.Double
  ): sharepointLib.SPNs.StringResult = js.native
  def getLowerCaseString(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    sourceValue: java.lang.String,
    lcid: scala.Double
  ): sharepointLib.SPNs.StringResult = js.native
  def getPeoplePickerURL(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    web: sharepointLib.SPNs.Web,
    fieldUser: sharepointLib.SPNs.FieldUser
  ): sharepointLib.SPNs.StringResult = js.native
  def get_layoutsLatestVersionRelativeUrl(): java.lang.String = js.native
  def get_layoutsLatestVersionUrl(): java.lang.String = js.native
  def importAppLicense(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    licenseTokenToImport: java.lang.String,
    contentMarket: java.lang.String,
    billingMarket: java.lang.String,
    appName: java.lang.String,
    iconUrl: java.lang.String,
    providerName: java.lang.String,
    appSubtype: scala.Double
  ): scala.Unit = js.native
  def isUserLicensedForEntityInContext(context: sharepointLib.SPNs.ClientRuntimeContext, licensableEntity: java.lang.String): sharepointLib.SPNs.BooleanResult = js.native
  def localizeWebPartGallery(context: sharepointLib.SPNs.ClientRuntimeContext, items: sharepointLib.SPNs.ListItemCollection[_]): sharepointLib.SPNs.ClientObjectList[sharepointLib.SPNs.ListItem[_]] = js.native
  def logCustomAppError(context: sharepointLib.SPNs.ClientRuntimeContext, error: java.lang.String): sharepointLib.SPNs.IntResult = js.native
  def logCustomRemoteAppError(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    productId: sharepointLib.SPNs.Guid,
    error: java.lang.String
  ): sharepointLib.SPNs.IntResult = js.native
  def markDiscussionAsFeatured(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    listID: java.lang.String,
    topicIDs: java.lang.String
  ): scala.Unit = js.native
  def resolvePrincipal(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    web: sharepointLib.SPNs.Web,
    input: java.lang.String,
    scopes: sharepointLib.SPNs.UtilitiesNs.PrincipalType,
    sources: sharepointLib.SPNs.UtilitiesNs.PrincipalSource,
    usersContainer: sharepointLib.SPNs.UserCollection,
    inputIsEmailOnly: scala.Boolean
  ): sharepointLib.SPNs.UtilitiesNs.PrincipalInfo = js.native
  def searchPrincipals(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    web: sharepointLib.SPNs.Web,
    input: java.lang.String,
    scopes: sharepointLib.SPNs.UtilitiesNs.PrincipalType,
    sources: sharepointLib.SPNs.UtilitiesNs.PrincipalSource,
    usersContainer: sharepointLib.SPNs.UserCollection,
    maxCount: scala.Double
  ): js.Array[sharepointLib.SPNs.UtilitiesNs.PrincipalInfo] = js.native
  def unmarkDiscussionAsFeatured(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    listID: java.lang.String,
    topicIDs: java.lang.String
  ): scala.Unit = js.native
}

