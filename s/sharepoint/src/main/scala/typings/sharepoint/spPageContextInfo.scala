package typings.sharepoint

import typings.sharepoint.anon.High
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait spPageContextInfo extends js.Object {
   // -182
  var CorrelationId: String
   // 1
  var PreviewFeaturesEnabled: Boolean
   // false
  var ProfileUrl: String
   // "https://tenant-my.sharepoint.com/person.aspx"
  var PublishingFeatureOn: Boolean
   // true
  var RecycleBinItemCount: Double
  var alertsEnabled: Boolean
   // true
  var allowSilverlightPrompt: String
   // "True"
  var blockDownloadsExperienceEnabled: Boolean
   // true
  var canUserCreateMicrosoftForm: Boolean
   // true
  var cdnPrefix: String
   // "static.sharepointonline.com/bld"
  var clientServerTimeDelta: Double
   // "6161f99d-10e5-4000-ad30-1016270fe31d"
  var crossDomainPhotosEnabled: Boolean
   // true
  var currentCultureName: String
   // "ru-RU"
  var currentLanguage: Double
   // 1049
  var currentUICultureName: String
   // "ru-RU"
  var disableAppViews: Boolean
   // true
  var disableFlows: Boolean
   // true
  var env: String
   // "prod"
  var farmLabel: String
   // "0x5F3FE84E7EE9089C7D11DCDAFFB9E69CF8241E68B9EF071FA92CD419E878AC4F7C16E34696EFA667EFD0712FC1DF4945DDC0D09B5D23153A698A727AF076B5DE,07 Jun 2017 18:55:22 -0000"
  var formDigestTimeoutSeconds: Double
   // "US_4_Content"
  var formDigestValue: String
   // 1800
  var groupColor: String
   // "#d40ac7"
  var groupHasHomepage: Boolean
   // true
  var groupId: String
   //
  var guestsEnabled: Boolean
   // true
  var hasManageWebPermissions: Boolean
   // true
  var isAnonymousGuestUser: Boolean
   // true
  var isAppWeb: Boolean
   // true
  var isExternalGuestUser: Boolean
   // true
  var isNoScriptEnabled: Boolean
   // true
  var isSPO: Boolean
   // true
  var isSiteAdmin: Boolean
   // true
  var isTenantDevSite: Boolean
   // true
  var isWebWelcomePage: Boolean
   // true
  var layoutsUrl: String
    // "_layouts/15"
  var listBaseTemplate: Double
   // 119
  var listId: String
   // "{06ee6d96-f27f-4160-b6bb-c18f187b18a7}"
  var listPermsMask: High
  var listTitle: String
   // "Site Pages"
  var listUrl: String
   // "/sites/site/list"
  var maximumFileSize: Double
   // 15360
  var openInClient: Boolean
    // "{06ee6d96-f27f-4160-b6bb-c18f187b18a7}"
  var pageItemId: Double
   // true
  var pageListId: String
  var pagePermsMask: High
  var pagePersonalizationScope: String
   // true
  var preferUserTimeZone: Boolean
   // -1
  var serverRedirectedUrl: String
  var serverRequestPath: String
   // "/SPTypeScript/Lists/ConditionalFormattingTasksList/AllItems.aspx"
  var serverTime: String
   // "2017-06-07T18:55:22.3499459Z"
  var siteAbsoluteUrl: String
   // "https:// gandjustas-7b20d3715e8ed4.sharepoint.com"
  var siteClassification: String
   //
  var siteClientTag: String
   // "0$$15.0.4454.1021"
  var siteColor: String
   // "#d40ac7"
  var siteId: String
   // "{3e09a056-f68f-44a3-8e0f-ff2c123b82cb}"
  var sitePagesEnabled: Boolean
   // true
  var siteServerRelativeUrl: String
   // "/"
  var siteSubscriptionId: String
   // true
  var supportPercentStorePath: Boolean
   // 4eedf5f3-f71f-4e73-82ee-e19081363c8c
  var supportPoundStorePath: Boolean
   // true
  var systemUserKey: String
   // "i:0h.f|membership|10033fff84e7cb2b@live.com"
  var tenantAppVersion: String
   // "0"
  var themeCacheToken: String
   // "/sites/site::0:16.0.6525.1206"
  var themedCssFolderUrl: String
  var themedImageFileNames: String
  var updateFormDigestPageLoaded: String
   // "2017-06-07T18:55:25.821Z"
  var userDisplayName: String
   // "John Doe"
  var userEmail: String
   // "john.doe@fabrikam.onmicrosoft.com"
  var userId: Double
   // 12
  var userLoginName: String
   // "john.doe@fabrikam.onmicrosoft.com"
  var userPrincipalName: String
   // true
  var viewId: String
  var viewOnlyExperienceEnabled: Boolean
   // "{06ee6d96-f27f-4160-b6bb-c18f187b18a7}"
  var webAbsoluteUrl: String
   // "https:// gandjustas-7b20d3715e8ed4.sharepoint.com/SPTypeScript"
  var webDescription: String
   // "Some description"
  var webId: String
   // "{06ee6d96-f27f-4160-b6bb-c18f187b18a7}"
  var webLanguage: Double
   // 1049
  var webLogoUrl: String
   // "/_layouts/15/images/siteIcon.png?rev=23"
  var webPermMasks: High
  var webServerRelativeUrl: String
   // "/SPTypeScript"
  var webTemplate: String
   // "17"
  var webTitle: String
   // "SPTypeScript"
  var webUIVersion: Double
}

object spPageContextInfo {
  @scala.inline
  def apply(
    CorrelationId: String,
    PreviewFeaturesEnabled: Boolean,
    ProfileUrl: String,
    PublishingFeatureOn: Boolean,
    RecycleBinItemCount: Double,
    alertsEnabled: Boolean,
    allowSilverlightPrompt: String,
    blockDownloadsExperienceEnabled: Boolean,
    canUserCreateMicrosoftForm: Boolean,
    cdnPrefix: String,
    clientServerTimeDelta: Double,
    crossDomainPhotosEnabled: Boolean,
    currentCultureName: String,
    currentLanguage: Double,
    currentUICultureName: String,
    disableAppViews: Boolean,
    disableFlows: Boolean,
    env: String,
    farmLabel: String,
    formDigestTimeoutSeconds: Double,
    formDigestValue: String,
    groupColor: String,
    groupHasHomepage: Boolean,
    groupId: String,
    guestsEnabled: Boolean,
    hasManageWebPermissions: Boolean,
    isAnonymousGuestUser: Boolean,
    isAppWeb: Boolean,
    isExternalGuestUser: Boolean,
    isNoScriptEnabled: Boolean,
    isSPO: Boolean,
    isSiteAdmin: Boolean,
    isTenantDevSite: Boolean,
    isWebWelcomePage: Boolean,
    layoutsUrl: String,
    listBaseTemplate: Double,
    listId: String,
    listPermsMask: High,
    listTitle: String,
    listUrl: String,
    maximumFileSize: Double,
    openInClient: Boolean,
    pageItemId: Double,
    pageListId: String,
    pagePermsMask: High,
    pagePersonalizationScope: String,
    preferUserTimeZone: Boolean,
    serverRedirectedUrl: String,
    serverRequestPath: String,
    serverTime: String,
    siteAbsoluteUrl: String,
    siteClassification: String,
    siteClientTag: String,
    siteColor: String,
    siteId: String,
    sitePagesEnabled: Boolean,
    siteServerRelativeUrl: String,
    siteSubscriptionId: String,
    supportPercentStorePath: Boolean,
    supportPoundStorePath: Boolean,
    systemUserKey: String,
    tenantAppVersion: String,
    themeCacheToken: String,
    themedCssFolderUrl: String,
    themedImageFileNames: String,
    updateFormDigestPageLoaded: String,
    userDisplayName: String,
    userEmail: String,
    userId: Double,
    userLoginName: String,
    userPrincipalName: String,
    viewId: String,
    viewOnlyExperienceEnabled: Boolean,
    webAbsoluteUrl: String,
    webDescription: String,
    webId: String,
    webLanguage: Double,
    webLogoUrl: String,
    webPermMasks: High,
    webServerRelativeUrl: String,
    webTemplate: String,
    webTitle: String,
    webUIVersion: Double
  ): spPageContextInfo = {
    val __obj = js.Dynamic.literal(CorrelationId = CorrelationId.asInstanceOf[js.Any], PreviewFeaturesEnabled = PreviewFeaturesEnabled.asInstanceOf[js.Any], ProfileUrl = ProfileUrl.asInstanceOf[js.Any], PublishingFeatureOn = PublishingFeatureOn.asInstanceOf[js.Any], RecycleBinItemCount = RecycleBinItemCount.asInstanceOf[js.Any], alertsEnabled = alertsEnabled.asInstanceOf[js.Any], allowSilverlightPrompt = allowSilverlightPrompt.asInstanceOf[js.Any], blockDownloadsExperienceEnabled = blockDownloadsExperienceEnabled.asInstanceOf[js.Any], canUserCreateMicrosoftForm = canUserCreateMicrosoftForm.asInstanceOf[js.Any], cdnPrefix = cdnPrefix.asInstanceOf[js.Any], clientServerTimeDelta = clientServerTimeDelta.asInstanceOf[js.Any], crossDomainPhotosEnabled = crossDomainPhotosEnabled.asInstanceOf[js.Any], currentCultureName = currentCultureName.asInstanceOf[js.Any], currentLanguage = currentLanguage.asInstanceOf[js.Any], currentUICultureName = currentUICultureName.asInstanceOf[js.Any], disableAppViews = disableAppViews.asInstanceOf[js.Any], disableFlows = disableFlows.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], farmLabel = farmLabel.asInstanceOf[js.Any], formDigestTimeoutSeconds = formDigestTimeoutSeconds.asInstanceOf[js.Any], formDigestValue = formDigestValue.asInstanceOf[js.Any], groupColor = groupColor.asInstanceOf[js.Any], groupHasHomepage = groupHasHomepage.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], guestsEnabled = guestsEnabled.asInstanceOf[js.Any], hasManageWebPermissions = hasManageWebPermissions.asInstanceOf[js.Any], isAnonymousGuestUser = isAnonymousGuestUser.asInstanceOf[js.Any], isAppWeb = isAppWeb.asInstanceOf[js.Any], isExternalGuestUser = isExternalGuestUser.asInstanceOf[js.Any], isNoScriptEnabled = isNoScriptEnabled.asInstanceOf[js.Any], isSPO = isSPO.asInstanceOf[js.Any], isSiteAdmin = isSiteAdmin.asInstanceOf[js.Any], isTenantDevSite = isTenantDevSite.asInstanceOf[js.Any], isWebWelcomePage = isWebWelcomePage.asInstanceOf[js.Any], layoutsUrl = layoutsUrl.asInstanceOf[js.Any], listBaseTemplate = listBaseTemplate.asInstanceOf[js.Any], listId = listId.asInstanceOf[js.Any], listPermsMask = listPermsMask.asInstanceOf[js.Any], listTitle = listTitle.asInstanceOf[js.Any], listUrl = listUrl.asInstanceOf[js.Any], maximumFileSize = maximumFileSize.asInstanceOf[js.Any], openInClient = openInClient.asInstanceOf[js.Any], pageItemId = pageItemId.asInstanceOf[js.Any], pageListId = pageListId.asInstanceOf[js.Any], pagePermsMask = pagePermsMask.asInstanceOf[js.Any], pagePersonalizationScope = pagePersonalizationScope.asInstanceOf[js.Any], preferUserTimeZone = preferUserTimeZone.asInstanceOf[js.Any], serverRedirectedUrl = serverRedirectedUrl.asInstanceOf[js.Any], serverRequestPath = serverRequestPath.asInstanceOf[js.Any], serverTime = serverTime.asInstanceOf[js.Any], siteAbsoluteUrl = siteAbsoluteUrl.asInstanceOf[js.Any], siteClassification = siteClassification.asInstanceOf[js.Any], siteClientTag = siteClientTag.asInstanceOf[js.Any], siteColor = siteColor.asInstanceOf[js.Any], siteId = siteId.asInstanceOf[js.Any], sitePagesEnabled = sitePagesEnabled.asInstanceOf[js.Any], siteServerRelativeUrl = siteServerRelativeUrl.asInstanceOf[js.Any], siteSubscriptionId = siteSubscriptionId.asInstanceOf[js.Any], supportPercentStorePath = supportPercentStorePath.asInstanceOf[js.Any], supportPoundStorePath = supportPoundStorePath.asInstanceOf[js.Any], systemUserKey = systemUserKey.asInstanceOf[js.Any], tenantAppVersion = tenantAppVersion.asInstanceOf[js.Any], themeCacheToken = themeCacheToken.asInstanceOf[js.Any], themedCssFolderUrl = themedCssFolderUrl.asInstanceOf[js.Any], themedImageFileNames = themedImageFileNames.asInstanceOf[js.Any], updateFormDigestPageLoaded = updateFormDigestPageLoaded.asInstanceOf[js.Any], userDisplayName = userDisplayName.asInstanceOf[js.Any], userEmail = userEmail.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userLoginName = userLoginName.asInstanceOf[js.Any], userPrincipalName = userPrincipalName.asInstanceOf[js.Any], viewId = viewId.asInstanceOf[js.Any], viewOnlyExperienceEnabled = viewOnlyExperienceEnabled.asInstanceOf[js.Any], webAbsoluteUrl = webAbsoluteUrl.asInstanceOf[js.Any], webDescription = webDescription.asInstanceOf[js.Any], webId = webId.asInstanceOf[js.Any], webLanguage = webLanguage.asInstanceOf[js.Any], webLogoUrl = webLogoUrl.asInstanceOf[js.Any], webPermMasks = webPermMasks.asInstanceOf[js.Any], webServerRelativeUrl = webServerRelativeUrl.asInstanceOf[js.Any], webTemplate = webTemplate.asInstanceOf[js.Any], webTitle = webTitle.asInstanceOf[js.Any], webUIVersion = webUIVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[spPageContextInfo]
  }
}

