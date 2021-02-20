package typings.sharepoint.global.SP

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SP.DateTimeUtil.SimpleDate
import typings.sharepoint.SP.ListItemCollection
import typings.sharepoint.SP.UserCollection
import typings.sharepoint.SP.Utilities.DateTimeFormat
import typings.sharepoint.SP.Utilities.PrincipalSource
import typings.sharepoint.SP.Utilities.PrincipalType
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Utilities {
  
  @JSGlobal("SP.Utilities.DateTimeFormat")
  @js.native
  object DateTimeFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Utilities.DateTimeFormat with Double] = js.native
    
    /* 1 */ val dateOnly: typings.sharepoint.SP.Utilities.DateTimeFormat.dateOnly with Double = js.native
    
    /* 0 */ val dateTime: typings.sharepoint.SP.Utilities.DateTimeFormat.dateTime with Double = js.native
    
    /* 3 */ val iSO8601: typings.sharepoint.SP.Utilities.DateTimeFormat.iSO8601 with Double = js.native
    
    /* 6 */ val longDate: typings.sharepoint.SP.Utilities.DateTimeFormat.longDate with Double = js.native
    
    /* 4 */ val monthDayOnly: typings.sharepoint.SP.Utilities.DateTimeFormat.monthDayOnly with Double = js.native
    
    /* 5 */ val monthYearOnly: typings.sharepoint.SP.Utilities.DateTimeFormat.monthYearOnly with Double = js.native
    
    /* 2 */ val timeOnly: typings.sharepoint.SP.Utilities.DateTimeFormat.timeOnly with Double = js.native
    
    /* 7 */ val unknownFormat: typings.sharepoint.SP.Utilities.DateTimeFormat.unknownFormat with Double = js.native
  }
  
  @JSGlobal("SP.Utilities.DateUtility")
  @js.native
  class DateUtility ()
    extends typings.sharepoint.SP.Utilities.DateUtility
  object DateUtility {
    
    /* static member */
    @JSGlobal("SP.Utilities.DateUtility.dateToJulianDay")
    @js.native
    def dateToJulianDay(year: Double, month: Double, day: Double): Double = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.DateUtility.daysInMonth")
    @js.native
    def daysInMonth(year: Double, month: Double): Double = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.DateUtility.isLeapYear")
    @js.native
    def isLeapYear(year: Double): Boolean = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.DateUtility.julianDayToDate")
    @js.native
    def julianDayToDate(julianDay: Double): SimpleDate = js.native
  }
  
  @JSGlobal("SP.Utilities.EmailProperties")
  @js.native
  class EmailProperties ()
    extends typings.sharepoint.SP.Utilities.EmailProperties
  
  @JSGlobal("SP.Utilities.HttpUtility")
  @js.native
  class HttpUtility ()
    extends typings.sharepoint.SP.Utilities.HttpUtility
  object HttpUtility {
    
    /** Appends correct "Source" parameter to the specified url, and then navigates to this url.
      "Source" parameter is recognized in many places in SharePoint, usually to determine "Cancel" behavior. */
    /* static member */
    @JSGlobal("SP.Utilities.HttpUtility.appendSourceAndNavigateTo")
    @js.native
    def appendSourceAndNavigateTo(url: String): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.HttpUtility.ecmaScriptStringLiteralEncode")
    @js.native
    def ecmaScriptStringLiteralEncode(scriptLiteralToEncode: String): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.HttpUtility.escapeXmlText")
    @js.native
    def escapeXmlText(stringToEscape: String): String = js.native
    
    /** Official version of STSHtmlEncode. Calls it internally. */
    /* static member */
    @JSGlobal("SP.Utilities.HttpUtility.htmlEncode")
    @js.native
    def htmlEncode(stringToEncode: String): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.HttpUtility.navigateHttpFolder")
    @js.native
    def navigateHttpFolder(urlSrc: String, frameTarget: String): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.HttpUtility.navigateTo")
    @js.native
    def navigateTo(url: String): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.HttpUtility.urlKeyValueEncode")
    @js.native
    def urlKeyValueEncode(keyOrValueToEncode: String): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.HttpUtility.urlPathEncode")
    @js.native
    def urlPathEncode(stringToEncode: String): String = js.native
  }
  
  @JSGlobal("SP.Utilities.IconSize")
  @js.native
  object IconSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Utilities.IconSize with Double] = js.native
    
    /* 0 */ val size16: typings.sharepoint.SP.Utilities.IconSize.size16 with Double = js.native
    
    /* 2 */ val size256: typings.sharepoint.SP.Utilities.IconSize.size256 with Double = js.native
    
    /* 1 */ val size32: typings.sharepoint.SP.Utilities.IconSize.size32 with Double = js.native
  }
  
  @JSGlobal("SP.Utilities.LocUtility")
  @js.native
  class LocUtility ()
    extends typings.sharepoint.SP.Utilities.LocUtility
  object LocUtility {
    
    /* static member */
    @JSGlobal("SP.Utilities.LocUtility.getLocalizedCountValue")
    @js.native
    def getLocalizedCountValue(locText: String, intervals: String, count: Double): String = js.native
  }
  
  @JSGlobal("SP.Utilities.LogAppErrorResult")
  @js.native
  object LogAppErrorResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Utilities.LogAppErrorResult with Double] = js.native
    
    /* 2 */ val accessDenied: typings.sharepoint.SP.Utilities.LogAppErrorResult.accessDenied with Double = js.native
    
    /* 1 */ val errorsThrottled: typings.sharepoint.SP.Utilities.LogAppErrorResult.errorsThrottled with Double = js.native
    
    /* 0 */ val success: typings.sharepoint.SP.Utilities.LogAppErrorResult.success with Double = js.native
  }
  
  @JSGlobal("SP.Utilities.PrincipalInfo")
  @js.native
  class PrincipalInfo ()
    extends typings.sharepoint.SP.Utilities.PrincipalInfo
  
  @JSGlobal("SP.Utilities.PrincipalSource")
  @js.native
  object PrincipalSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Utilities.PrincipalSource with Double] = js.native
    
    /* 5 */ val all: typings.sharepoint.SP.Utilities.PrincipalSource.all with Double = js.native
    
    /* 3 */ val membershipProvider: typings.sharepoint.SP.Utilities.PrincipalSource.membershipProvider with Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.Utilities.PrincipalSource.none with Double = js.native
    
    /* 4 */ val roleProvider: typings.sharepoint.SP.Utilities.PrincipalSource.roleProvider with Double = js.native
    
    /* 1 */ val userInfoList: typings.sharepoint.SP.Utilities.PrincipalSource.userInfoList with Double = js.native
    
    /* 2 */ val windows: typings.sharepoint.SP.Utilities.PrincipalSource.windows with Double = js.native
  }
  
  @JSGlobal("SP.Utilities.PrincipalType")
  @js.native
  object PrincipalType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Utilities.PrincipalType with Double] = js.native
    
    /* 5 */ val all: typings.sharepoint.SP.Utilities.PrincipalType.all with Double = js.native
    
    /* 2 */ val distributionList: typings.sharepoint.SP.Utilities.PrincipalType.distributionList with Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.Utilities.PrincipalType.none with Double = js.native
    
    /* 3 */ val securityGroup: typings.sharepoint.SP.Utilities.PrincipalType.securityGroup with Double = js.native
    
    /* 4 */ val sharePointGroup: typings.sharepoint.SP.Utilities.PrincipalType.sharePointGroup with Double = js.native
    
    /* 1 */ val user: typings.sharepoint.SP.Utilities.PrincipalType.user with Double = js.native
  }
  
  @JSGlobal("SP.Utilities.SPWOPIFrameAction")
  @js.native
  object SPWOPIFrameAction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Utilities.SPWOPIFrameAction with Double] = js.native
    
    /* 1 */ val edit: typings.sharepoint.SP.Utilities.SPWOPIFrameAction.edit with Double = js.native
    
    /* 3 */ val interactivePreview: typings.sharepoint.SP.Utilities.SPWOPIFrameAction.interactivePreview with Double = js.native
    
    /* 2 */ val mobileView: typings.sharepoint.SP.Utilities.SPWOPIFrameAction.mobileView with Double = js.native
    
    /* 0 */ val view: typings.sharepoint.SP.Utilities.SPWOPIFrameAction.view with Double = js.native
  }
  
  @JSGlobal("SP.Utilities.Set")
  @js.native
  class Set ()
    extends typings.sharepoint.SP.Utilities.Set {
    def this(items: NumberDictionary[Double]) = this()
    def this(items: StringDictionary[Double]) = this()
  }
  
  @JSGlobal("SP.Utilities.UrlBuilder")
  @js.native
  class UrlBuilder protected ()
    extends typings.sharepoint.SP.Utilities.UrlBuilder {
    def this(path: String) = this()
  }
  object UrlBuilder {
    
    /* static member */
    @JSGlobal("SP.Utilities.UrlBuilder.removeQueryString")
    @js.native
    def removeQueryString(url: String, key: String): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.UrlBuilder.replaceOrAddQueryString")
    @js.native
    def replaceOrAddQueryString(url: String, key: String, value: String): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.UrlBuilder.urlCombine")
    @js.native
    def urlCombine(path1: String, path2: String): String = js.native
  }
  
  @JSGlobal("SP.Utilities.Utility")
  @js.native
  class Utility ()
    extends typings.sharepoint.SP.Utilities.Utility
  object Utility {
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.createEmailBodyForInvitation")
    @js.native
    def createEmailBodyForInvitation(context: typings.sharepoint.SP.ClientRuntimeContext, pageAddress: String): typings.sharepoint.SP.StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.createNewDiscussion")
    @js.native
    def createNewDiscussion[T](
      context: typings.sharepoint.SP.ClientRuntimeContext,
      list: typings.sharepoint.SP.List[_],
      title: String
    ): typings.sharepoint.SP.ListItem[T] = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.createNewDiscussionReply")
    @js.native
    def createNewDiscussionReply[T](context: typings.sharepoint.SP.ClientRuntimeContext, parent: typings.sharepoint.SP.ListItem[T]): typings.sharepoint.SP.ListItem[T] = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.createWikiPageInContextWeb")
    @js.native
    def createWikiPageInContextWeb(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      parameters: typings.sharepoint.SP.Utilities.WikiPageCreationInformation
    ): typings.sharepoint.SP.File = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.formatDateTime")
    @js.native
    def formatDateTime(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      web: typings.sharepoint.SP.Web,
      datetime: Date,
      format: DateTimeFormat
    ): typings.sharepoint.SP.StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.getAppLicenseDeploymentId")
    @js.native
    def getAppLicenseDeploymentId(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.GuidResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.getAppLicenseInformation")
    @js.native
    def getAppLicenseInformation(context: typings.sharepoint.SP.ClientRuntimeContext, productId: typings.sharepoint.SP.Guid): typings.sharepoint.SP.AppLicenseCollection = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.getCurrentUserEmailAddresses")
    @js.native
    def getCurrentUserEmailAddresses(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.getImageUrl")
    @js.native
    def getImageUrl(imageName: String): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.get_layoutsLatestVersionRelativeUrl")
    @js.native
    def getLayoutsLatestVersionRelativeUrl(): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.get_layoutsLatestVersionUrl")
    @js.native
    def getLayoutsLatestVersionUrl(): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.getLayoutsPageUrl")
    @js.native
    def getLayoutsPageUrl(pageName: String): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.getLocalizedString")
    @js.native
    def getLocalizedString(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      source: String,
      defaultResourceFile: String,
      language: Double
    ): typings.sharepoint.SP.StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.getLowerCaseString")
    @js.native
    def getLowerCaseString(context: typings.sharepoint.SP.ClientRuntimeContext, sourceValue: String, lcid: Double): typings.sharepoint.SP.StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.getPeoplePickerURL")
    @js.native
    def getPeoplePickerURL(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      web: typings.sharepoint.SP.Web,
      fieldUser: typings.sharepoint.SP.FieldUser
    ): typings.sharepoint.SP.StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.importAppLicense")
    @js.native
    def importAppLicense(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      licenseTokenToImport: String,
      contentMarket: String,
      billingMarket: String,
      appName: String,
      iconUrl: String,
      providerName: String,
      appSubtype: Double
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.isUserLicensedForEntityInContext")
    @js.native
    def isUserLicensedForEntityInContext(context: typings.sharepoint.SP.ClientRuntimeContext, licensableEntity: String): typings.sharepoint.SP.BooleanResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.localizeWebPartGallery")
    @js.native
    def localizeWebPartGallery(context: typings.sharepoint.SP.ClientRuntimeContext, items: ListItemCollection[_]): typings.sharepoint.SP.ClientObjectList[typings.sharepoint.SP.ListItem[_]] = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.logCustomAppError")
    @js.native
    def logCustomAppError(context: typings.sharepoint.SP.ClientRuntimeContext, error: String): typings.sharepoint.SP.IntResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.logCustomRemoteAppError")
    @js.native
    def logCustomRemoteAppError(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      productId: typings.sharepoint.SP.Guid,
      error: String
    ): typings.sharepoint.SP.IntResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.markDiscussionAsFeatured")
    @js.native
    def markDiscussionAsFeatured(context: typings.sharepoint.SP.ClientRuntimeContext, listID: String, topicIDs: String): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.resolvePrincipal")
    @js.native
    def resolvePrincipal(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      web: typings.sharepoint.SP.Web,
      input: String,
      scopes: PrincipalType,
      sources: PrincipalSource,
      usersContainer: UserCollection,
      inputIsEmailOnly: Boolean
    ): typings.sharepoint.SP.Utilities.PrincipalInfo = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.searchPrincipals")
    @js.native
    def searchPrincipals(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      web: typings.sharepoint.SP.Web,
      input: String,
      scopes: PrincipalType,
      sources: PrincipalSource,
      usersContainer: UserCollection,
      maxCount: Double
    ): js.Array[typings.sharepoint.SP.Utilities.PrincipalInfo] = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.unmarkDiscussionAsFeatured")
    @js.native
    def unmarkDiscussionAsFeatured(context: typings.sharepoint.SP.ClientRuntimeContext, listID: String, topicIDs: String): Unit = js.native
  }
  
  @JSGlobal("SP.Utilities.VersionUtility")
  @js.native
  class VersionUtility ()
    extends typings.sharepoint.SP.Utilities.VersionUtility
  object VersionUtility {
    
    /* static member */
    @JSGlobal("SP.Utilities.VersionUtility.getImageUrl")
    @js.native
    def getImageUrl(imageName: String): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.VersionUtility.get_layoutsLatestVersionRelativeUrl")
    @js.native
    def getLayoutsLatestVersionRelativeUrl(): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.VersionUtility.get_layoutsLatestVersionUrl")
    @js.native
    def getLayoutsLatestVersionUrl(): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.VersionUtility.getLayoutsPageUrl")
    @js.native
    def getLayoutsPageUrl(pageName: String): String = js.native
  }
  
  @JSGlobal("SP.Utilities.WikiPageCreationInformation")
  @js.native
  class WikiPageCreationInformation ()
    extends typings.sharepoint.SP.Utilities.WikiPageCreationInformation
}
