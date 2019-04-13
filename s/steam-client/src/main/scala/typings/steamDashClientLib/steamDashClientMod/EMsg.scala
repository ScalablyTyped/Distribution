package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EMsg extends js.Object

@JSImport("steam-client", "EMsg")
@js.native
object EMsg extends js.Object {
  @js.native
  sealed trait AIGetAppGCFlags
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AIGetAppGCFlagsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AIGetAppInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AIGetAppInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AIGetAppList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AIGetAppListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AISAppInfoTableChanged
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISCreateMarketingMessage
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISCreateMarketingMessageResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISDeleteMarketingMessage
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISGetCouponDefinition
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISGetCouponDefinitionResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISGetMarketingMessage
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISGetMarketingMessageResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AISGetMarketingTreatments
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AISGetMarketingTreatmentsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISGetPackageChangeNumber
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISGetPackageChangeNumberResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AISRefreshContentDescription
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISRequestContentDescription
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISRequestMarketingMessageUpdate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AISRequestMarketingTreatmentUpdate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AISTestAddPackage
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISTestEnableGC
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISUpdateAppInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISUpdateMarketingMessage
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISUpdateMarketingMessageResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISUpdatePackageCosts
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISUpdatePackageCostsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete "renamed to AISUpdatePackageCosts"
  @js.native
  sealed trait AISUpdatePackageInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISUpdateSlaveContentDescription
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AISUpdateSlaveContentDescriptionResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMAccountPS3Unlink
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMAccountPS3UnlinkResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMAcctAllowedToPurchase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMAcctAllowedToPurchaseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMAcknowledgeClanInvite
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMAddClanNews
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMAddComment
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMAddCommentResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMAddFounderToClan
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMAddFreeLicense
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMAddFreeLicenseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMAddFriend
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMAddFriendResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMAddLicense
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMAddMinutesToLicense
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMAddPublisherUser
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMAddUsersToMarketingTreatment
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMAllowUserContentQuery
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMAllowUserContentResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMAllowUserFilesRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMAllowUserFilesResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMAuthenticateUser
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMAuthenticateUserResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMAuthenticatedPlayerList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMBanFromChat
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMBeginProcessingLicenses
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMBitPayPayment
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMBitPayPaymentResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMBoaCompraPayment
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMBoaCompraPaymentResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCancelEasyCollect
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCancelEasyCollectResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCancelLicense
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCancelPurchase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMChallengeNotification
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMChallengeVerdict
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMChangeClanOwner
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMChatActionResult
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMChatCleanup
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMChatEnter
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMChatInvite
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMChatMulti
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCheckClanInviteRateLimiting
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCheckClanMembership
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCheckClanMembershipResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClaimUnownedUserGift
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClaimUnownedUserGiftResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClanCleanup
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClanCleanupList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClanDataUpdated
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClanPermissions
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClanPermissionsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClansInCommon
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClansInCommonCount
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClansInCommonCountResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClansInCommonResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClearDispute
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClearDisputeResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMClearPersonaMetadataBlob
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientAcceptFriendInvite
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientAddFriendToGroup
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientAddFriendToGroupResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientChatActionRelay
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientChatInviteRelay
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientChatMemberInfoRelay
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientChatMsgRelay
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientCreateFriendsGroup
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientCreateFriendsGroupResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientDeleteFriendsGroup
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientDeleteFriendsGroupResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientJoinChatRelay
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientNotPlaying
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientPublishRemovalFromSource
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientRemoveFriendFromGroup
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientRemoveFriendFromGroupResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientRenameFriendsGroup
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientRenameFriendsGroupResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientSetPlayerNickname
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMClientSetPlayerNicknameResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCompleteExternalPurchase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCompleteExternalPurchaseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCompletePurchase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMConvertClan
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMConvertWallet
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMConvertWalletResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCreateAccountRecord
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMCreateAccountRecordInSteam3
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCreateAccountResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCreateChargeback
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCreateChargebackResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCreateChat
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCreateChatResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCreateClan
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMCreateClanAnnouncement
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMCreateClanAnnouncementResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCreateClanEvent
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCreateClanEventResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCreateClanResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCreateDispute
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCreateDisputeResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCreateRefund
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMCreateRefundResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMDegicaPayment
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMDegicaPaymentResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMDeleteClanAnnouncement
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMDeleteClanAnnouncementResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMDeleteClanEvent
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMDeleteClanEventResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMDeleteComment
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMDeleteCommentResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMDeleteStoredCard
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMDeleteStoredPaymentInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMDeleteStoredPaypalAgreement
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMDumpClan
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMDumpUser
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMEClubPayment
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMEClubPaymentResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMEditBanReason
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMExpireCaptchaByGID
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMExtendLicense
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMFinalizePurchase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMFinalizePurchaseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMFindAccounts
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMFindAccountsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMFindClanUser
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMFindClanUserResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMFindGSByIP
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMFindHungTransactions
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMFixPendingPurchase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMFixPendingPurchaseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMFixPendingRefund
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMFoundGSByIP
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMFriendsInCommon
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMFriendsInCommonCountResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMFriendsInCommonResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMFriendsList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMFriendsListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGMSGameServerRemove
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGMSGameServerUpdate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGSSearch
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGameServerAccountChangePassword
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGameServerAccountDeleteAccount
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGameServerPlayerCompatibilityCheck
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGameServerPlayerCompatibilityCheckResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGameServerRemove
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGameServerUpdate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountBanInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountBanInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountCommunityBanInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountCommunityBanInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountDetails
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountDetails2
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountDetailsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountDetailsResponse2
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountEmailAddress
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountEmailAddressResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountFlagsForWGSpoofing
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountFlagsForWGSpoofingResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetAccountFriendsCount
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetAccountFriendsCountResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountLinks
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountLinksResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountPSNInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountPSNInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountResetDetailsRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountResetDetailsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetAccountStatusResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetBillingAddress
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetBillingAddressResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetCaptchaDataByGID
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetCaptchaDataByGIDResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetCaptchaDataForIP
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetCaptchaDataForIPResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetCardList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetCardListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetChatBanList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetChatBanListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetClanAnnouncements
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetClanAnnouncementsCount
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetClanAnnouncementsCountResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetClanAnnouncementsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanDetails
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanDetailsForForumCreation
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanDetailsForForumCreationResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanDetailsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanEvents
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanEventsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanHistory
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanHistoryResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanMembers
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanMembersResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetClanMembershipList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetClanMembershipListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanOfficers
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanOfficersResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanPOTW
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanPOTWResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanPermissionBits
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanPermissionBitsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanPermissionSettings
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanPermissionSettingsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanRank
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetClanRankResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetComments
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetCommentsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetCommunityPrivacyState
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetCommunityPrivacyStateResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetFinalPrice
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetFinalPriceResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetFriendRelationship
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetFriendRelationshipResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetFriendsLobbies
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetFriendsLobbiesResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetFriendsWishlistInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetFriendsWishlistInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetGSPlayerList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetGSPlayerListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetGameMembers
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetGameMembersResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetGiftTargetListRelay
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetIgnored
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetIgnoredResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetLegacyGameKey
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetLegacyGameKeyResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetLicenses
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetLicensesResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetLobbyList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetLobbyListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetLobbyMetadata
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetLobbyMetadataResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetNameHistory
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetNameHistoryResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetPaypalAgreements
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetPaypalAgreementsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetPendingNotificationCount
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetPendingNotificationCountResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetPlayerBanDetails
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetPlayerBanDetailsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetPlayerLinkDetails
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetPlayerLinkDetailsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetPreviousCBAccount
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetPreviousCBAccountResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetPurchaseStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetSingleClanAnnouncement
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetSingleClanAnnouncementResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetSingleClanEvent
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetSingleClanEventResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetSteamIDForMicroTxn
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetSteamIDForMicroTxnResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetStoredPaymentSummary
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetStoredPaymentSummaryResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserAchievementStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserClansNews
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserClansNewsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserCurrentGameInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserCurrentGameInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserFriendNewsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserFriendsMinutesPlayed
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserFriendsMinutesPlayedResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserGameStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserGameStatsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserGameplayInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserGameplayInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserGifts
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserGiftsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserGroupStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserGroupStatusResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserHistory
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserHistoryResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserLicenseHistory
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserLicenseHistoryResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserLicenseList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserLicenseListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserMinutesPlayed
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserMinutesPlayedResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserNews
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserNewsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserNewsSubscriptions
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserNewsSubscriptionsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetUserStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserVacBanList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserVacBanListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetWalletConversionRate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetWalletConversionRateResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetWalletDetails
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGetWalletDetailsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGiftRevoked
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGrantCoupon
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGrantCouponResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGrantGuestPasses
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGrantGuestPasses2
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMGrantGuestPasses2Response
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMHandlePendingTransaction
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMHandlePendingTransactionResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMInitPurchase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMInitPurchaseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMInviteUserToClan
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMIsAccountInCaptchaGracePeriod
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMIsAccountInCaptchaGracePeriodResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMIsPackageRestrictedInUserCountry
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMIsPackageRestrictedInUserCountryResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMIsUserBanned
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMIsValidAccountID
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMJoinPublicClan
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMKickUserFromClan
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMLeaveClan
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMLoadActivationCodes
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMLoadActivationCodesResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMLoadOEMTickets
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMLockProfile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMLookupKey
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMLookupKeyResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMMOLPayment
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMMOLPaymentResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMMarketingTreatmentUpdate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMMoPayPayment
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMMoPayPaymentResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMNameChange
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMNewChallenge
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMNotifyChatOfClanChange
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMNotifySessionDeviceAuthorized
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMP2PIntroducerMessage
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMPasswordHashUpgrade
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMPayPalPaymentsHubPayment
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMPayPalPaymentsHubPaymentResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMPayelpPayment
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMPayelpPaymentResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMPersonaChangeResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMPlayerGetClanBasicDetails
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMPlayerGetClanBasicDetailsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMPlayerHostedOnGameServer
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMPlayerNicknameList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMPlayerNicknameListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMPrimePersonaStateCache
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMProbeClanMembershipList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMProbeClanMembershipListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMPublishChatMemberInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMPublishChatMetadata
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMPublishChatRoomInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMPurchaseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRecordBanEnforcement
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRefreshGuestPasses
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRefreshSessions
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRegisterKey
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMRelayGetFriendsWhoPlayGame
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMRelayGetFriendsWhoPlayGameResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRelayPublishStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMRelayToGC
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMReloadAccount
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMReloadGameGroupPolicy
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRemoveFriend
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRemovePublisherUser
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRenewAgreement
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRenewLicense
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRequestAccountData
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRequestAccountDataResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMRequestChatMetadata
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRequestClanData
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRequestClanDetails
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete "renamed to AMRequestClanData"
  @js.native
  sealed trait AMRequestFriendData
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMResetCommunityContent
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMResetUserVerificationGSByIP
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMResolveNegativeWalletCredits
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMResolveNegativeWalletCreditsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMResubmitPurchase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMReverseChargeback
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMReverseChargebackResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRevokeLegacyGameKeys
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRevokePurchaseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRollbackGiftTransfer
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRollbackGiftTransferResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRouteFriendMsg
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMRouteToClients
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSendAccountInfoUpdate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMSendEmail
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSendQueuedEmails
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSendSystemIMToUser
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMServiceModulesCache
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMServiceModulesCall
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMServiceModulesCallResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSessionInfoRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSessionInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSessionQuery
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSessionQueryResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetAccountDetails
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetAccountFlags
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetAccountLinks
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetAccountLinksResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetAccountTrustedRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetAvatar
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetClanDetails
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetClanName
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetClanNameResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetClanPOTW
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetClanPOTWResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetClanPermissionBits
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetClanPermissionBitsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetClanPermissionSettings
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetClanPermissionSettingsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetClanRank
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetClanRankResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetCommunityProfileSettings
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetCommunityProfileSettingsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetCommunityState
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetDRMTestConfig
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetFriendRelationshipNone
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetIgnored
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetIgnoredResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetLicenseFlags
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetPersonaName
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetPreApproval
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetPreApprovalResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetProfileURL
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetUserGiftUnowned
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetUserGiftUnownedResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSetUserNewsSubscriptions
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSmart2PayPayment
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSmart2PayPaymentResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMStoreCancelPurchase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMStoreCompletePurchase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMStoreGetFinalPrice
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMStoreGetFinalPriceResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMStoreInitPurchase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMStoreInitPurchaseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMStorePurchaseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMStoreUserStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMStoreUserStatsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMSubscribeToPersonaFeed
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSupportChangeEmail
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSupportChangePassword
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMSupportChangeSecretQA
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSupportEnableOrDisable
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSupportIsAccountEnabled
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSupportIsAccountEnabledResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSupportKickSession
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSupportRemoveAccountSecurity
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSwapKioskDeposit
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMSwapKioskDepositResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMTicketAuthRequestOrResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMToMDSGetDepotDecryptionKey
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMTrackFailedAuthByIP
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMTransferLockedGifts
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMTransferLockedGiftsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMTwoFactorRecoverAuthenticatorRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMTwoFactorRecoverAuthenticatorResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMUnBanFromChat
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMUpdateBillingAddress
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMUpdateBillingAddressResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMUpdateChatMetadata
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMUpdateClanAnnouncement
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMUpdateClanAnnouncementResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMUpdateClanEvent
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMUpdateClanEventResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMUpdateGSPlayStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMUpdatePersonaStateCache
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMUpdateProviderStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMUpdateUserBanRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMUserClanList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMUserClanListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMVACStatusUpdate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMValidateCaptchaDataForIP
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMValidateCaptchaDataForIPResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMValidateEmailLink
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMValidateEmailLinkResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMValidatePasswordResetCodeAndSendSmsRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMValidatePasswordResetCodeAndSendSmsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMValidateWGToken
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMValidateWGTokenResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMVerfiyUser
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMVerifyDepotManagementRights
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMVerifyDepotManagementRightsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMWipeFriendsList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AMWriteNews
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMXsollaPayment
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AMXsollaPaymentResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSCSPerfTestResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSCSPerfTestTask
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSCallTest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSCallTestReply
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSCycleTCM
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSExternalStressActionResult
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSExternalStressJobQueued
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSExternalStressJobRunning
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSExternalStressJobStart
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSExternalStressJobStopAll
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSExternalStressJobStopped
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSInitDRMSStressTest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSRunFailServerTest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSStartExternalStress
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSStartStressTest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSStarted
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSStopStressTest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSUFSPerfTestResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ATSUFSPerfTestTask
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AdminCmd
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AdminCmdResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AdminConsoleTitle
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AdminGCCommand
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AdminGCGetCommandList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AdminGCGetCommandListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AdminGCSpew
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AdminLogEvent
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AdminLogListenRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AdminMsgSpew
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AdminPwLogon
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait AdminPwLogonResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AdminSpew
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait Alert
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AllowUserToPlayQuery
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AllowUserToPlayResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait AssignSysID
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPCheckActivationCodes
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPCheckActivationCodesResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPCheckFinanceCloseOutDate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPCheckSettlementReports
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPCommitGC
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPCommitGCResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPCommitWP
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPCommitWPResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPConvertToCurrentKeys
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPConvertToCurrentKeysResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPFindHungTransactions
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPPostTaxToAvalara
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPPostTransactionTax
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPPostTransactionTaxResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPProcessGCReports
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPProcessIMReports
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPProcessLicenses
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPProcessLicensesResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPProcessPPReports
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPProcessPartnerPayments
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPProcessPaymentRules
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPProcessUSBankReports
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPProcessWPReports
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPPruneCardUsageStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPPruneCardUsageStatsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPRemoveExpiredPaymentData
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPRemoveExpiredPaymentDataResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BRPSettleCB
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BRPSettleNOVA
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BRPStartShippingJobs
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BSBannedRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSBoaCompraConfirmProductDelivery
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSBoaCompraConfirmProductDeliveryResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BSChaseRFRRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSCheckJobRunning
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSCheckJobRunningResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSCommitGCTxn
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSCommitWPTxn
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSCompletePurchase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSCompletePurchaseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSConvertToCurrentKeys
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSConvertToCurrentKeysResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSGenerateBoaCompraMD5
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSGenerateBoaCompraMD5Response
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSGenerateMoPayMD5
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSGenerateMoPayMD5Response
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSGetBillingAddress
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSGetBillingAddressResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSGetCreditCardInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSGetCreditCardInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BSGetEvents
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSGetPayPalUserInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSGetPayPalUserInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSGetProPackOrderStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSGetProPackOrderStatusResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSInitGCBankXferTxn
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSInitGCBankXferTxnResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSInitPayPalTxn
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSInitPayPalTxnResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSInitPurchase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSInitPurchaseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSMoPayConfirmProductDelivery
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSMoPayConfirmProductDeliveryResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSPaymentInstrBan
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSPaymentInstrBanResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BSProcessGCReports
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BSProcessPPReports
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BSProcessUSBankReports
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSPruneCardUsageStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSPruneCardUsageStatsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BSPurchaseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSPurchaseRunFraudChecks
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSPurchaseRunFraudChecksResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSPurchaseStart
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSQiwiWalletInvoice
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSQiwiWalletInvoiceResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSQueryBankInformation
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSQueryBankInformationResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BSQueryCBOrderStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BSQueryCBOrderStatusResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSQueryFindCreditCard
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSQueryFindCreditCardResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BSQueryGCBankXferTxn
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BSQueryGCBankXferTxnResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSQueryPaymentInstResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSQueryPaymentInstUsage
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSQueryTransactionStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSQueryTransactionStatusResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSQueryTxnExtendedInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSQueryTxnExtendedInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BSRefundTxn
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BSRefundTxnResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSRemoveExpiredPaymentData
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSRemoveExpiredPaymentDataResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSResetPackagePurchaseRateLimit
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSResetPackagePurchaseRateLimitResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSReverseRedeemPOSAKey
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSReverseRedeemPOSAKeyResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BSRunRedFlagReport
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSSendShippingRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSSendShippingRequestResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSSettleComplete
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BSSettleNOVA
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BSStartShippingJobs
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSStatusInquiryPOSAKey
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSStatusInquiryPOSAKeyResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSStoreBankInformation
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSStoreBankInformationResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSUpdateConversionRates
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSUpdateInventoryFromProPack
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSUpdateInventoryFromProPackResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSUpdatePaymentData
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSUpdatePaymentDataResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSValidateMoPaySignature
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSValidateMoPaySignatureResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSValidateXsollaSignature
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSValidateXsollaSignatureResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSVerifyPOSAKey
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BSVerifyPOSAKeyResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BackpackAddToCurrency
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BackpackAddToCurrencyResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BackpackBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BadLoginIPList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseAIS
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseAM
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseAMRange2
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseATS
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseAdmin
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseBRP
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseBS
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseCCSRange
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseCM
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseCS
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseChannelAuth
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseClient
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseClient2
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseClient3
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseDFS
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseDP
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseDRMS
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BaseDSS
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait BaseEPM
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseFBS
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseFTSRange
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseFileXfer
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseGC
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseGM
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseGameServer
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseGeneral
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseLBSRange
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseMDS
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseOGS
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseP2P
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BasePSRange
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseSM
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseShell
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseTest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseUFSRange
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BaseVS
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BoxMonitorBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BoxMonitorReportRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait BoxMonitorReportResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait CCSAddComment
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait CCSAddCommentResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CCSDeleteAllCommentsByAuthor
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CCSDeleteAllCommentsByAuthorResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait CCSDeleteComment
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait CCSDeleteCommentResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait CCSGetComments
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait CCSGetCommentsForNews
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait CCSGetCommentsForNewsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait CCSGetCommentsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait CCSNotifyCommentCount
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait CCSPreloadComments
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CEGPropStatusDRMSRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CEGPropStatusDRMSResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CEGVersionSetEnableDisableRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CEGVersionSetEnableDisableResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CEGWhackFailureReportRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CEGWhackFailureReportResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait CMAppInfoResponseDeprecated
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CMSetAllowState
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CMSpewAllowState
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CREBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CREEnumeratePublishedFiles
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CREEnumeratePublishedFilesResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CREGetUserPublishedItemVoteDetails
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CREGetUserPublishedItemVoteDetailsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CREItemVoteSummary
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CREItemVoteSummaryResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CREPublishedFileVoteAdded
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait CRERankByTrend
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait CRERankByTrendResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait CRERankByVote
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait CRERankByVoteResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CREUpdateUserPublishedItemVote
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CREUpdateUserPublishedItemVoteResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CSBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CSPing
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CSPingResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait CSUserContentApprove
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait CSUserContentDeny
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait CSUserContentRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ChannelAuthChallenge
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ChannelAuthResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ChannelAuthResult
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ChannelEncryptRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ChannelEncryptResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ChannelEncryptResult
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientAMGetClanOfficers
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientAMGetClanOfficersResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientAMGetPersonaNameHistory
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientAMGetPersonaNameHistoryResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientAccountInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientAckGuestPass
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientAckGuestPassResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAckMessageByGID
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAckPurchaseReceipt
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAckVACBan
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientAckVACBan2
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientAcknowledgeClanInvite
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientActivateOEMLicense
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientAddFriend
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientAddFriendResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAnonLogOn_Deprecated
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAnonUserLogOn_Deprecated
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAppInfoChanges
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAppInfoRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAppInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAppInfoUpdate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientAppMinutesPlayedData
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientAppUsageEvent
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientAuthList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientAuthListAck
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAuthList_Deprecated
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAuthorizeLocalDevice
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceNotification
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientBroadcastBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientBroadcastDisconnect
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientBroadcastFrames
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientBroadcastInit
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientBroadcastScreenshot
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientBroadcastUploadConfig
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientCMList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientCancelLicense
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientCancelLicenseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientChangeStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientChangeSteamGuardOptions
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientChangeSteamGuardOptionsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientChatAction
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientChatActionResult
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientChatDeclined
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientChatEnter
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientChatInvite
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientChatMemberInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientChatMsg
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientChatRoomInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientCheckAppBetaPassword
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientCheckAppBetaPasswordResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientCheckFileSignature
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientCheckFileSignatureResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientCheckPassword
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientCheckPasswordResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientClanState
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientCommentNotifications
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientConcurrentSessionsBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientConnectionStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientContentServerLogOn_Deprecated
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientCreateAccount2
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientCreateAccount3
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientCreateAccountProto
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientCreateAccountProtoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientCreateAccountResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientCreateAcctResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientCreateChat
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientCreateChatResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientCurrentUIMode
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDFSAuthenticateRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDFSAuthenticateResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDFSDownloadStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDFSEndSession
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDPCheckSpecialSurvey
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDPCheckSpecialSurveyResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDPContentStatsReport
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDPSendSpecialSurveyResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDPSendSpecialSurveyResponseReply
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientDPSteam2AppStarted
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDPUpdateAppJobReport
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDRMBlobRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDRMBlobResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDRMDownloadRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDRMDownloadRequestWithCrashData
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDRMDownloadResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDRMFinalResult
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDRMProblemReport
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDRMTest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDRMTestResult
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDeauthorizeDevice
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDeauthorizeDeviceRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDeregisterWithServer
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDisableTestLicense
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDisableTestLicenseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientDownloadRateStatistics
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientEmailAddrInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientEmailChange3
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientEmailChange4
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientEmailChangeResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientEmailChangeResponse4
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientEmoticonList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientEnableTestLicense
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientEnableTestLicenseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientEncryptPct
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFSEnumerateFollowingList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFSEnumerateFollowingListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFSGetFollowerCount
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFSGetFollowerCountResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistory
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistoryForOfflineMessages
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistoryResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFSGetFriendsSteamLevels
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFSGetFriendsSteamLevelsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFSGetIsFollowing
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFSGetIsFollowingResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFSOfflineMessageNotification
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFSRequestOfflineMessageCount
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientFavoritesList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFileToDownload
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFileToDownloadResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFriendMsg
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFriendMsgEchoToSender
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFriendMsgIncoming
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFriendProfileInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFriendProfileInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFriendRemovedFromSource
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFriendUserStatusPublished
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFriendsGroupsList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFriendsList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientFromGC
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGCMsgFailed
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGMSServerQuery
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGameConnectDeny
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGameConnectTokens
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGameConnect_obsolete
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGameEnded_obsolete
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGamesPlayed
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGamesPlayed2_obsolete
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGamesPlayed3_obsolete
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGamesPlayedNoDataBlob
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGamesPlayedWithDataBlob
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGamesPlayed_obsolete
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetAppBetaPasswords
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetAppBetaPasswordsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetAppOwnershipTicket
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetAppOwnershipTicketResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetAuthorizedDevices
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetAuthorizedDevicesResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetCDNAuthToken
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetCDNAuthTokenResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetClanActivityCounts
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetClanActivityCountsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetClientAppList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetClientAppListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetClientDetails
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetClientDetailsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetDepotDecryptionKey
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetDepotDecryptionKeyResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetEmoticonList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetFinalPrice
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetFinalPriceResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetFriendsWhoPlayGame
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetFriendsWhoPlayGameResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetGiftTargetList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetGiftTargetListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetLegacyGameKey
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetLegacyGameKeyResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetLicenses
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetLobbyListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetLobbyMetadata
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetLobbyMetadataResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetMicroTxnInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetMicroTxnInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayers
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersDP
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersDPResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetPurchaseReceipts
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetUserStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientGetUserStatsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientHeartBeat
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientHideFriend
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientInformOfCreateAccount
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientInformOfResetForgottenPassword
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientInformOfResetForgottenPasswordResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientInitPurchase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientInitPurchaseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientInstallClientApp
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientInstallClientAppResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientInviteFriend
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientInviteFriendResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientInviteUserToClan
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientIsLimitedAccount
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientItemAnnouncements
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientJoinChat
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientKickPlayingSession
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientLBSFindOrCreateLB
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientLBSFindOrCreateLBResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientLBSGetLBEntries
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientLBSGetLBEntriesResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientLBSSetScore
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientLBSSetScoreResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientLBSSetUGC
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientLBSSetUGCResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientLicenseList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientLogOff
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientLogOnResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientLogOnWithCredentials_Deprecated
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientLogOnWithHash_Deprecated
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientLogOn_Deprecated
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientLoggedOff
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientLogon
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientLogonGameServer
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientLookupKey
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientLookupKeyResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetDepotManifest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetDepotManifestChunk
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetDepotManifestResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetPrevDepotBuild
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetPrevDepotBuildResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSHeartbeat
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSInitDepotBuildRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSInitDepotBuildResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSInitWorkshopBuildRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSInitWorkshopBuildResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSLoginRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSLoginResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSRegisterAppBuild
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSRegisterAppBuildResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSSetAppBuildLive
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSSetAppBuildLiveResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSSignInstallScript
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSSignInstallScriptResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSTransmitManifestDataChunk
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadDepotChunks
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadDepotChunksResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadManifestRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadManifestResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadRateTest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadRateTestResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSCreateLobby
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSCreateLobbyResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSFlushFrenemyListCache
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSFlushFrenemyListCacheResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSGetLobbyData
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSGetLobbyList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSGetLobbyListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSInviteToLobby
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSJoinLobby
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSJoinLobbyResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSLeaveLobby
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSLeaveLobbyResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSLobbyChatMsg
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSLobbyData
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSLobbyGameServerSet
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSSendLobbyChatMsg
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSSetLobbyData
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSSetLobbyDataResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSSetLobbyGameServer
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSSetLobbyLinked
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSSetLobbyOwner
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSSetLobbyOwnerResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSUserJoinedLobby
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMMSUserLeftLobby
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMarketingMessageUpdate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMarketingMessageUpdate2
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMicroTxnAuthRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMicroTxnAuthorize
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientMicroTxnAuthorizeResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientNOP
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientNatTraversalStatEvent
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientNewLoginKey
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientNewLoginKeyAccepted
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientNewsUpdate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientNoUDPConnectivity
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientNotLoggedOnDeprecated
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientOGSBeginSession
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientOGSBeginSessionResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientOGSEndSession
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientOGSEndSessionResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientOGSGameServerPingSample
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientOGSReportBug
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientOGSReportString
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientOGSWriteRow
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientP2PConnectionFailInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientP2PConnectionInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientP2PIntroducerMessage
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientPICSAccessTokenRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientPICSAccessTokenResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientPICSChangesSinceRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientPICSChangesSinceResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientPICSProductInfoRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientPICSProductInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientPackageInfoRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientPackageInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientPackageVersions
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientPasswordChange3
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientPasswordChangeResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientPersonaChangeResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientPersonaState
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientPersonalQAChange3
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientPing
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientPingResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientPlayerNicknameList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientPlayingSessionState
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientPurchaseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientPurchaseWithMachineID
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientReadMachineAuth
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientReadMachineAuthResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRedeemGuestPass
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRedeemGuestPassResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRegisterAuthTicketWithCM
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRegisterKey
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRegisterOEMMachine
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRegisterOEMMachineResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRemoveFriend
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientReportOverlayDetourFailure
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestAccountData
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestAccountDataResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestAuthList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestChangeMail
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestChangeMailResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestCommentNotifications
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestEncryptedAppTicket
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestEncryptedAppTicketResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmail
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmail3
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmailResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestFreeLicense
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestFreeLicenseResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestFriendData
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestFriendship
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestItemAnnouncements
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestMachineAuth
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestMachineAuthResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientRequestOAuthTokenForApp
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientRequestOAuthTokenForAppResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestValidationMail
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestValidationMailResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestWebAPIAuthenticateUserNonce
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestWebAPIAuthenticateUserNonceResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRequestedClientStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientResetForgottenPassword
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientResetForgottenPassword3
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientResetForgottenPassword4
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientResetForgottenPasswordResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientResetPassword
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientResetPasswordResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRichPresenceInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRichPresenceRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientRichPresenceUpload
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientScreenshotsChanged
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientSecretQAChangeResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientSendGuestPass
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientSendGuestPassResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientSentLogs
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientServerList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientServerUnavailable
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientServersAvailable
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientServiceCall
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientServiceCallResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientServiceMethod
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientServiceMethodResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientServiceModule
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientSessionEnd
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientSessionStart
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientSessionToken
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientSessionUpdate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete "renamed to ClientSessionUpdate"
  @js.native
  sealed trait ClientSessionUpdateAuthTicket
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientSetClientAppUpdateState
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientSetClientAppUpdateStateResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientSetHeartbeatRate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientSetIgnoreFriend
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientSetIgnoreFriendResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete "renamed to SLCBase"
  @js.native
  sealed trait ClientSharedLibraryBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientSharedLibraryLockStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientSharedLibraryStopPlaying
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientSharedLicensesLockStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientSharedLicensesStopPlaying
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientStat
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientStat2
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientStat2Int32
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientStatsUpdated
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientSteamUsageEvent
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientStoreUserStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientStoreUserStats2
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientStoreUserStatsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientSubscribeToPersonaFeed
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientSystemIM
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientSystemIMAck
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientTicketAuthComplete
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientToGC
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMAddScreenshot
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMAddScreenshotResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMDeletePublishedFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMDeletePublishedFileResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMDeleteScreenshot
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMDeleteScreenshotResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMEnumeratePublishedFilesByUserAction
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMEnumeratePublishedFilesByUserActionResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMEnumerateUserPublishedFiles
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMEnumerateUserPublishedFilesResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFiles
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesWithUpdates
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUCMGetPublishedFileDetails
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUCMGetPublishedFileDetailsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMGetPublishedFilesForUser
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMGetPublishedFilesForUserResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMPublishFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMPublishFileResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMPublishedFileDeleted
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMPublishedFileSubscribed
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMPublishedFileUnsubscribed
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMSetUserPublishedFileAction
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMSetUserPublishedFileActionResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUCMSubscribePublishedFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUCMSubscribePublishedFileResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUCMUnsubscribePublishedFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUCMUnsubscribePublishedFileResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMUpdatePublishedFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUCMUpdatePublishedFileResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUDSInviteToGame
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUDSP2PSessionEnded
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUDSP2PSessionStarted
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSDeleteFileRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSDeleteFileResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSDownloadChunk
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSDownloadRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSDownloadResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSGetFileListForApp
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSGetFileListForAppResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSGetSingleFileInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSGetSingleFileInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSGetUGCDetails
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSGetUGCDetailsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSLoginRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSLoginResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSShareFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSShareFileResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSTransferHeartbeat
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSUploadFileChunk
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSUploadFileFinished
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSUploadFileRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUFSUploadFileResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUGSGetGlobalStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUGSGetGlobalStatsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUninstallClientApp
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUninstallClientAppResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUnlockStreaming
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUnlockStreamingResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUpdateChatMetadata
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUpdateGuestPassesList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUpdateMachineAuth
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUpdateMachineAuthResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUpdateUserGameInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUseLocalDeviceAuthorizations
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientUserNotifications
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientVACBanStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientVACChallenge
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientVACResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientVTTCert
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ClientVacStatusQuery
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientVacStatusResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientVanityURLChangedNotification
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientVerifyPassword
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientVerifyPasswordResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientVoiceCallPreAuthorize
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientVoiceCallPreAuthorizeResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientWalletInfoUpdate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientWorkshopItemChangesRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientWorkshopItemChangesResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientWorkshopItemInfoRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ClientWorkshopItemInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CommunityAddFriendNews
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CommunityDeleteUserNews
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait CommunityGetUserFriendNews
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ContentDescriptionUpdate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DFSAcceptedResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DFSConnection
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DFSConnectionReply
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DFSGetFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DFSGetFileFromServer
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DFSInstallLocalFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DFSPurgeFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DFSRecvTransmitFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DFSRequestPingback
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DFSRequestPingback2
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DFSResponsePingback2
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DFSRouteFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DFSRouteFileResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DFSSendTransmitFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DFSStartTransfer
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DFSTransferComplete
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPAccountCreationStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPAchievementStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPBlockingStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPCloudStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait DPDownloadRateStatistics
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPFacebookStatistics
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait DPGamePlayedStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPGameServersPlayersStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPGetPlayerCount
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPGetPlayerCountResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPNatTraversalStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPPartnerMicroTxns
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPPartnerMicroTxnsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPSetPublishingState
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait DPSteamUsageEvent
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPStoreSaleStatistics
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPStreamingUniquePlayersStat
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPUniquePlayersStat
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPUpdateContentEvent
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPVRUniquePlayersStat
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPVacBanStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPVacCafeBanStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPVacCertBanStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DPVacInfractionStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMAdminUpdate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMAdminUpdateResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMBuildBlobRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMBuildBlobResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMDetailsReportRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMDetailsReportResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMEmptyGuidCache
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMEmptyGuidCacheResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMProcessFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMProcessFileResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMRange2
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMResolveGuidRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMResolveGuidResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMSFetchVersionSet
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMSFetchVersionSetResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMStabilityReport
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMStabilityReportResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMSync
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMSyncResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMVariabilityReport
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMVariabilityReportResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcess
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessAnalyzeFileRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessAnalyzeFileResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessBackfillOriginalRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessBackfillOriginalResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessDRMAndSign
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessDRMAndSignResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessDescribeSecretRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessDescribeSecretResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessEvaluateCrashRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessEvaluateCrashResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessExamineBlobRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessExamineBlobResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessGetBlobRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessGetBlobResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait DRMWorkerProcessGetDRMGuidsFromFileRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait DRMWorkerProcessGetDRMGuidsFromFileResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessInstallAllRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessInstallAllResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessInstallDRMDLLRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessInstallDRMDLLResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessInstallProcessedFilesRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessInstallProcessedFilesResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessSecretIdStringRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessSecretIdStringResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessSplitAndInstallRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessSplitAndInstallResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessSteamworksInfoRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessSteamworksInfoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessUnpackBlobRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessUnpackBlobResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessValidateDRMDLLRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessValidateDRMDLLResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessValidateFileRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DRMWorkerProcessValidateFileResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait DSSCurrentFileList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait DSSNewFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait DSSSynchList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait DSSSynchListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait DSSSynchSubscribe
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait DSSSynchUnsubscribe
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DestJobFailed
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DeviceAuthorizationBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DirRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait DirResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait EPMRestartProcess
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait EPMStartProcess
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait EPMStopProcess
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait EconBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait EconCDKeyProcessTransaction
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait EconCDKeyProcessTransactionResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait EconFlushInventoryCache
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait EconFlushInventoryCacheResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait EconGetErrorLogs
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait EconGetErrorLogsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait EconTrading_CancelTradeRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait EconTrading_InitiateTradeProposed
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait EconTrading_InitiateTradeRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait EconTrading_InitiateTradeResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait EconTrading_InitiateTradeResult
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait EconTrading_StartSession
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait Exit
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ExitShell
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ExitShells
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSApplyAccountCred
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSApplyAccountCredResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSApplyOSUpdates
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSBootstrapperGetPackageChunk
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSBootstrapperGetPackageChunkResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSBootstrapperPackageRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSBootstrapperPackageResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSBootstrapperPackageTransferProgress
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSConnectionData
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSDeployHotFixPackage
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSDeployHotFixResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSDeployPackage
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSDeployResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSDownloadHotFix
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSDownloadHotFixResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSForceBounce
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSForceRefresh
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSInfoFromBootstrapper
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSMinidumpServer
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSQueryGMForRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSQueryGMResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSRebootBox
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSRebootBoxResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSReqVersion
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSRestartBootstrapper
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSRunCMDScript
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSSetBigBrotherMode
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSSetShellCount
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FBSSetShellCount_obsolete
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSSetState
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSTerminateShell
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSTerminateZombies
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSUpdateBootstrapper
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSUpdateTargetConfigFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FBSVersionInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FSAddOrRemoveFollower
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FSAddOrRemoveFollowerResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FSBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FSCommentNotification
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FSCommentNotificationViewed
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FSComputeFrenematrix
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FSComputeFrenematrixResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FSGetPendingNotificationCount
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FSGetPendingNotificationCountResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FSPlayStatusNotification
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FSPublishPersonaStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FSRequestFriendData
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FSRichPresenceRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FSRichPresenceResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FSUpdateFollowingList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FTSBrowseClans
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FTSBrowseClansResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FTSClanDeleted
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FTSGetBrowseCounts
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FTSGetBrowseCountsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FTSGetGSPlayStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FTSGetGSPlayStatsForServer
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FTSGetGSPlayStatsForServerResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FTSGetGSPlayStatsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FTSReportIPUpdates
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearch
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchClansByLocation
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchClansByLocationResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchPlayersByLocation
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchPlayersByLocationResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchStatusResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FailServer
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FileXferData
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FileXferDataAck
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FileXferEnd
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FileXferRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait FileXferResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCAchievementAwarded
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait GCCmdBounce
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCCmdDeploy
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCCmdDeployResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCCmdDown
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait GCCmdForceBounce
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCCmdRevive
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCCmdStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCCmdSwitch
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait GCGetAccountDetails
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait GCGetAccountDetails_DEPRECATED
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCGetEmailTemplate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCGetEmailTemplateResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCHAccountLockStatusChange
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCHAccountPhoneNumberChange
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCHAccountTradeBanStatusChange
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCHAccountTwoFactorChange
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCHAccountVacStatusChange
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCHKillGC
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCHKillGCResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCHRelay
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete "renamed to GCHRelayToClient"
  @js.native
  sealed trait GCHRelayClientToIS
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCHRelayToClient
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCHRequestStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCHRequestStatusResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCHRequestUpdateSession
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCHSpawnGC
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCHSpawnGCResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCHUpdateSession
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCHVacVerificationChange
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCInterAppMessage
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait GCRegisterWebInterfaces
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait GCRegisterWebInterfaces_Deprecated
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait GCSendClient
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GCSystemMessage
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait GCUpdateGSState
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait GCUpdatePlayedState
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait GCValidateSession
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait GCValidateSessionResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GMConvertUserWallets
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GMDRMSync
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GMGetServiceMethodRouting
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GMGetServiceMethodRoutingResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GMLoadActivationCodes
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GMQueueForFBS
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GMReportPHPError
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GMSBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GMSClientServerQueryResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GMSGameServerReplicate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GMSchemaConversionResults
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait GMSchemaConversionResultsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GMWriteConfigToSQL
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GMWriteShellFailureToSQL
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GMWriteStatsToSOS
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSApprove
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSAssociateWithClan
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSAssociateWithClanResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSComputeNewPlayerCompatibility
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSComputeNewPlayerCompatibilityResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSDeny
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSDisconnectNotice
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSGetPlayStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSGetPlayStatsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSGetReputation
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSGetReputationResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSGetUserAchievementStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSGetUserAchievementStatusResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSGetUserGroupStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSGetUserGroupStatusResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSKick
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSPerformHardwareSurvey
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSPlayerList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSServerType
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSStatus2
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSStatusReply
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSStatusUpdate_Unused
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GSUserPlaying
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GameServerOutOfDate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GenericReply
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GetUserIPCountry
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GetUserIPCountryResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait GracefulExitShell
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait Heartbeat
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait HubConnect
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete "renamed to GCHRelay"
  @js.native
  sealed trait ISRelayToGCH
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait Invalid
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait InvalidateDBOCacheItems
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait JobHeartbeat
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait JobHeartbeatTest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait JobHeartbeatTestResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait KGSAllocateKeyRange
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait KGSAllocateKeyRangeResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait KGSBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait KGSGenerateGameStopWCKeys
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait KGSGenerateGameStopWCKeysResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait KGSGenerateKeys
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait KGSGenerateKeysResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait KGSRemapKeys
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait KGSRemapKeysResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait KeepAlive
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LBSDeleteLB
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LBSDeleteLBEntry
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LBSDeleteLBResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LBSFindOrCreateLB
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LBSFindOrCreateLBResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LBSGetLBEntries
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LBSGetLBEntriesResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LBSGetLBList
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LBSGetLBListResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LBSResetLB
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LBSResetLBResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LBSSetLBDetails
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LBSSetScore
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LBSSetScoreResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LicenseProcessingComplete
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LoadDBOCacheItem
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LoadDBOCacheItemResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait LogSearchCancel
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait LogSearchRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait LogSearchResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LogsinkBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait LogsinkWriteReport
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait MDSContentServerConfig
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait MDSContentServerConfigRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait MDSContentServerStatsBroadcast
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait MDSDownloadDepotChunksAck
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait MDSGetDepotChunk
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait MDSGetDepotChunkChunk
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait MDSGetDepotChunkResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait MDSGetDepotManifest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait MDSGetDepotManifestChunk
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait MDSGetDepotManifestResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait MDSGetServerListForUser
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait MDSGetServerListForUserResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait MDSGetVersionsForDepot
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait MDSGetVersionsForDepotResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait MDSMigrateChunk
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait MDSMigrateChunkResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait MDSSetPublicVersionForDepot
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait MDSSetPublicVersionForDepotResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait MDSToAMGetDepotDecryptionKeyResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait MDSToCSFlushChunk
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait MDSUpdateContentServerConfig
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait MMSBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait MPASBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait MPASVacBanReset
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait MarketingMessageUpdate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait Multi
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait NonStdMsgBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait NonStdMsgChase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait NonStdMsgDFSTransfer
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait NonStdMsgHTTPClient
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait NonStdMsgHTTPServer
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait NonStdMsgLogsink
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait NonStdMsgMemcached
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait NonStdMsgPHPSimulator
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait NonStdMsgRTMPServer
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait NonStdMsgSteam2Emulator
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait NonStdMsgSyslog
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait NonStdMsgTests
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait NonStdMsgUMQpipeAAPL
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait NonStdMsgWGResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait NotificationOfSuspiciousActivity
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait NotifyWatchdog
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait OGSBeginSession
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait OGSBeginSessionResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait OGSEndSession
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait OGSEndSessionResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait OGSWriteAppSessionRow
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait P2PIntroducerMessage
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait PICSBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait PSAddPackageToShoppingCart
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait PSAddPackageToShoppingCartResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait PSAddWalletCreditToShoppingCart
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait PSAddWalletCreditToShoppingCartResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait PSCreateShoppingCart
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait PSCreateShoppingCartResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait PSGetShoppingCartContents
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait PSGetShoppingCartContentsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait PSIsValidShoppingCart
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait PSIsValidShoppingCartResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait PSRemoveLineItemFromShoppingCart
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait PSRemoveLineItemFromShoppingCartResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait PhysicalBoxInventory
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait Ping
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait PingResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait PrepareToExit
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ProtobufWrapped
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ProvideWindowsEventLogEntries
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait QuestServerBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait QueuedEmailsComplete
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RMDeleteMemcachedKeys
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RMMsgTraceAddTrigger
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RMMsgTraceEvent
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RMMsgTraceRemoveTrigger
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RMRange
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RMRemoteInvoke
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RMTestVerisignOTP
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RMTestVerisignOTPResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RemoteClientAcceptEULA
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RemoteClientAppStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RemoteClientAuth
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RemoteClientAuthResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RemoteClientBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RemoteClientGetControllerConfig
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RemoteClientGetControllerConfigResposne
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RemoteClientPing
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RemoteClientPingResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RemoteClientStartStream
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RemoteClientStartStreamResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RemoteClientStreamingEnabled
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait RemoteSysID
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ReqChallenge
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ReqChallengeTest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RequestFullStatsBlock
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait RequestStatHistory
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait RequestWindowsEventLogEntries
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait RouteMessage
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait SCIDRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait SCIDResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait SLCBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait SLCOwnerLibraryChanged
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait SLCRequestUserSessionStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait SLCSharedLibraryChanged
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait SLCSharedLicensesLockStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait SLCUserSessionStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait SMExpensiveReport
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait SMFishingReport
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait SMGetSchemaConversionResults
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait SMGetSchemaConversionResultsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait SMHourlyReport
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait SMMonitorSpace
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait SMPartitionRenames
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait SecretsBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait SecretsCredentialPairResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait SecretsRequestCredentialPair
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait SecretsRequestServerIdentity
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait SecretsServerIdentityResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait SecretsUpdateServerIdentities
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ServiceMethod
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ServiceMethodResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait SetTestFlag
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ShellCheckWindowsUpdates
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ShellCheckWindowsUpdatesResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ShellConfigInfoUpdate
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ShellFailed
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait ShellFlushUserLicenseCache
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ShellSearchLogs
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ShellSearchLogsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait StatHistory
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait Stats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait StatsDeprecated
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait StoreBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait StoreUpdateRecommendationCount
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait Subscribe
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait TestInitDB
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait TestResetServer
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait TestWorkerProcess
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait TestWorkerProcessLoadUnloadModuleRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait TestWorkerProcessLoadUnloadModuleResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait TestWorkerProcessServiceModuleCallRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait TestWorkerProcessServiceModuleCallResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait TimestampRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait TimestampResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UCMAddTaggedScreenshot
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UCMDeleteOldScreenshot
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UCMDeleteOldScreenshotResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UCMDeleteOldVideo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UCMDeleteOldVideoResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMDeletePublishedFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMDeletePublishedFileResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMFixStatsPublishedFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UCMGetPublishedFilesForUser
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UCMGetPublishedFilesForUserResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMGetUserSubscribedFiles
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMGetUserSubscribedFilesResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMPublishFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMPublishFileResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMPublishedFileChildAdd
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMPublishedFileChildAddResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UCMPublishedFileChildChangeSortOrder
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UCMPublishedFileChildChangeSortOrderResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMPublishedFileChildRemove
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMPublishedFileChildRemoveResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMPublishedFileContentUpdated
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMPublishedFileParentChanged
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMPublishedFilePreviewAdd
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMPublishedFilePreviewAddResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UCMPublishedFilePreviewChangeSortOrder
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UCMPublishedFilePreviewChangeSortOrderResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMPublishedFilePreviewRemove
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMPublishedFilePreviewRemoveResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMPublishedFileReported
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMPublishedFileSubscribed
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMPublishedFileUnsubscribed
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMPublishedFileUpdated
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMReloadPublishedFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMReloadUserFileListCaches
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UCMRemoveTaggedScreenshot
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMResetCommunityContent
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMResetCommunityContentResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UCMUpdateOldScreenshotPrivacy
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UCMUpdateOldScreenshotPrivacyResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMUpdatePublishedFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMUpdatePublishedFileBan
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMUpdatePublishedFileBanResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMUpdatePublishedFileIncompatibleStatus
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMUpdatePublishedFileResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UCMUpdatePublishedFileStat
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UCMUpdateTaggedScreenshot
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UCMValidateObjectExists
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UCMValidateObjectExistsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UDSBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete "renamed to UDSHasSession"
  @js.native
  sealed trait UDSFindSession
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete "renamed to UDSHasSessionResponse"
  @js.native
  sealed trait UDSFindSessionResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UDSHasSession
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UDSHasSessionResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UDSRenderUserAuth
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UDSRenderUserAuthResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UFSDownloadChunk
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSDownloadChunkRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSDownloadChunkResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSDownloadFinishRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSDownloadFinishResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UFSDownloadRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UFSDownloadResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSDownloadStartRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSDownloadStartResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSFlushURLCache
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSGetUGCURLs
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSGetUGCURLsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSHttpUploadFileFinishRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSHttpUploadFileFinishResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSMigrateFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSMigrateFileAppID
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSMigrateFileAppIDResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSMigrateFileResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSReloadAccount
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSReloadAccountResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSReloadPartitionInfo
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSSynchronizeFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSSynchronizeFileResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSUpdateFileFlags
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSUpdateFileFlagsResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSUpdateRecordBatched
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSUpdateRecordBatchedResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSUploadCommit
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UFSUploadCommitResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UGSBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UGSUpdateGlobalStats
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UMQ2AM_ClientMsgBatch
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UMQBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UMQEnqueueMobileAnnouncements
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait UMQEnqueueMobileSalePromotions
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UMQIncomingChatMessage
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UMQLogoffRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UMQLogoffResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UMQLogonRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UMQLogonResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UMQPoll
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UMQPollResults
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UMQSendChatMessage
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UniverseChanged
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UniverseData
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UpdateConfigFile
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UpdateCreditCardRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UpdateRecordResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait UpdateUserBanResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait VACResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait VSAddCheat
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait VSChallengeResultText
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait VSGetChallengeResults
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait VSLoadDBFinished
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait VSMarkCheat
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait VSPurgeCodeModDB
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait VSReportLingerer
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait VSRequestManagedChallenge
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait WGRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait WGResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait WebAPIBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait WebAPIInvalidateOAuthClientCache
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait WebAPIInvalidateOAuthTokenCache
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait WebAPIInvalidateTokensForAccount
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait WebAPIJobRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait WebAPIJobResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait WebAPIRegisterGCInterfaces
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait WebAPISetSecrets
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait WebAPIValidateOAuth2Token
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait WebAPIValidateOAuth2TokenResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait WorkerProcess
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait WorkerProcessPingRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait WorkerProcessPingResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait WorkerProcessShutdown
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait WorkshopAcceptTOSRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
   // obsolete
  @js.native
  sealed trait WorkshopAcceptTOSResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait WorkshopBase
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ZipRequest
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  @js.native
  sealed trait ZipResponse
    extends steamDashClientLib.steamDashClientMod.EMsg
  
  /* 423 */ val AIGetAppGCFlags: AIGetAppGCFlags with scala.Double = js.native
  /* 424 */ val AIGetAppGCFlagsResponse: AIGetAppGCFlagsResponse with scala.Double = js.native
  /* 427 */ val AIGetAppInfo: AIGetAppInfo with scala.Double = js.native
  /* 428 */ val AIGetAppInfoResponse: AIGetAppInfoResponse with scala.Double = js.native
  /* 425 */ val AIGetAppList: AIGetAppList with scala.Double = js.native
  /* 426 */ val AIGetAppListResponse: AIGetAppListResponse with scala.Double = js.native
  /* 407 */ val AISAppInfoTableChanged: AISAppInfoTableChanged with scala.Double = js.native
  /* 409 */ val AISCreateMarketingMessage: AISCreateMarketingMessage with scala.Double = js.native
  /* 410 */ val AISCreateMarketingMessageResponse: AISCreateMarketingMessageResponse with scala.Double = js.native
  /* 416 */ val AISDeleteMarketingMessage: AISDeleteMarketingMessage with scala.Double = js.native
  /* 429 */ val AISGetCouponDefinition: AISGetCouponDefinition with scala.Double = js.native
  /* 430 */ val AISGetCouponDefinitionResponse: AISGetCouponDefinitionResponse with scala.Double = js.native
  /* 411 */ val AISGetMarketingMessage: AISGetMarketingMessage with scala.Double = js.native
  /* 412 */ val AISGetMarketingMessageResponse: AISGetMarketingMessageResponse with scala.Double = js.native
  /* 419 */ val AISGetMarketingTreatments: AISGetMarketingTreatments with scala.Double = js.native
  /* 420 */ val AISGetMarketingTreatmentsResponse: AISGetMarketingTreatmentsResponse with scala.Double = js.native
  /* 405 */ val AISGetPackageChangeNumber: AISGetPackageChangeNumber with scala.Double = js.native
  /* 406 */ val AISGetPackageChangeNumberResponse: AISGetPackageChangeNumberResponse with scala.Double = js.native
  /* 401 */ val AISRefreshContentDescription: AISRefreshContentDescription with scala.Double = js.native
  /* 402 */ val AISRequestContentDescription: AISRequestContentDescription with scala.Double = js.native
  /* 415 */ val AISRequestMarketingMessageUpdate: AISRequestMarketingMessageUpdate with scala.Double = js.native
  /* 421 */ val AISRequestMarketingTreatmentUpdate: AISRequestMarketingTreatmentUpdate with scala.Double = js.native
  /* 422 */ val AISTestAddPackage: AISTestAddPackage with scala.Double = js.native
  /* 433 */ val AISTestEnableGC: AISTestEnableGC with scala.Double = js.native
  /* 403 */ val AISUpdateAppInfo: AISUpdateAppInfo with scala.Double = js.native
  /* 413 */ val AISUpdateMarketingMessage: AISUpdateMarketingMessage with scala.Double = js.native
  /* 414 */ val AISUpdateMarketingMessageResponse: AISUpdateMarketingMessageResponse with scala.Double = js.native
  /* 404 */ val AISUpdatePackageCosts: AISUpdatePackageCosts with scala.Double = js.native
  /* 408 */ val AISUpdatePackageCostsResponse: AISUpdatePackageCostsResponse with scala.Double = js.native
  /* 404 */ val AISUpdatePackageInfo: AISUpdatePackageInfo with scala.Double = js.native
  /* 431 */ val AISUpdateSlaveContentDescription: AISUpdateSlaveContentDescription with scala.Double = js.native
  /* 432 */ val AISUpdateSlaveContentDescriptionResponse: AISUpdateSlaveContentDescriptionResponse with scala.Double = js.native
  /* 4310 */ val AMAccountPS3Unlink: AMAccountPS3Unlink with scala.Double = js.native
  /* 4311 */ val AMAccountPS3UnlinkResponse: AMAccountPS3UnlinkResponse with scala.Double = js.native
  /* 4346 */ val AMAcctAllowedToPurchase: AMAcctAllowedToPurchase with scala.Double = js.native
  /* 4347 */ val AMAcctAllowedToPurchaseResponse: AMAcctAllowedToPurchaseResponse with scala.Double = js.native
  /* 565 */ val AMAcknowledgeClanInvite: AMAcknowledgeClanInvite with scala.Double = js.native
  /* 4141 */ val AMAddClanNews: AMAddClanNews with scala.Double = js.native
  /* 4202 */ val AMAddComment: AMAddComment with scala.Double = js.native
  /* 4203 */ val AMAddCommentResponse: AMAddCommentResponse with scala.Double = js.native
  /* 4061 */ val AMAddFounderToClan: AMAddFounderToClan with scala.Double = js.native
  /* 4224 */ val AMAddFreeLicense: AMAddFreeLicense with scala.Double = js.native
  /* 4285 */ val AMAddFreeLicenseResponse: AMAddFreeLicenseResponse with scala.Double = js.native
  /* 4081 */ val AMAddFriend: AMAddFriend with scala.Double = js.native
  /* 4082 */ val AMAddFriendResponse: AMAddFriendResponse with scala.Double = js.native
  /* 505 */ val AMAddLicense: AMAddLicense with scala.Double = js.native
  /* 510 */ val AMAddMinutesToLicense: AMAddMinutesToLicense with scala.Double = js.native
  /* 4280 */ val AMAddPublisherUser: AMAddPublisherUser with scala.Double = js.native
  /* 4234 */ val AMAddUsersToMarketingTreatment: AMAddUsersToMarketingTreatment with scala.Double = js.native
  /* 558 */ val AMAllowUserContentQuery: AMAllowUserContentQuery with scala.Double = js.native
  /* 559 */ val AMAllowUserContentResponse: AMAllowUserContentResponse with scala.Double = js.native
  /* 4156 */ val AMAllowUserFilesRequest: AMAllowUserFilesRequest with scala.Double = js.native
  /* 4157 */ val AMAllowUserFilesResponse: AMAllowUserFilesResponse with scala.Double = js.native
  /* 592 */ val AMAuthenticateUser: AMAuthenticateUser with scala.Double = js.native
  /* 593 */ val AMAuthenticateUserResponse: AMAuthenticateUserResponse with scala.Double = js.native
  /* 4315 */ val AMAuthenticatedPlayerList: AMAuthenticatedPlayerList with scala.Double = js.native
  /* 4145 */ val AMBanFromChat: AMBanFromChat with scala.Double = js.native
  /* 507 */ val AMBeginProcessingLicenses: AMBeginProcessingLicenses with scala.Double = js.native
  /* 4410 */ val AMBitPayPayment: AMBitPayPayment with scala.Double = js.native
  /* 4411 */ val AMBitPayPaymentResponse: AMBitPayPaymentResponse with scala.Double = js.native
  /* 4380 */ val AMBoaCompraPayment: AMBoaCompraPayment with scala.Double = js.native
  /* 4381 */ val AMBoaCompraPaymentResponse: AMBoaCompraPaymentResponse with scala.Double = js.native
  /* 4086 */ val AMCancelEasyCollect: AMCancelEasyCollect with scala.Double = js.native
  /* 4087 */ val AMCancelEasyCollectResponse: AMCancelEasyCollectResponse with scala.Double = js.native
  /* 511 */ val AMCancelLicense: AMCancelLicense with scala.Double = js.native
  /* 522 */ val AMCancelPurchase: AMCancelPurchase with scala.Double = js.native
  /* 4105 */ val AMChallengeNotification: AMChallengeNotification with scala.Double = js.native
  /* 4104 */ val AMChallengeVerdict: AMChallengeVerdict with scala.Double = js.native
  /* 4085 */ val AMChangeClanOwner: AMChangeClanOwner with scala.Double = js.native
  /* 579 */ val AMChatActionResult: AMChatActionResult with scala.Double = js.native
  /* 533 */ val AMChatCleanup: AMChatCleanup with scala.Double = js.native
  /* 577 */ val AMChatEnter: AMChatEnter with scala.Double = js.native
  /* 572 */ val AMChatInvite: AMChatInvite with scala.Double = js.native
  /* 570 */ val AMChatMulti: AMChatMulti with scala.Double = js.native
  /* 4118 */ val AMCheckClanInviteRateLimiting: AMCheckClanInviteRateLimiting with scala.Double = js.native
  /* 4075 */ val AMCheckClanMembership: AMCheckClanMembership with scala.Double = js.native
  /* 4161 */ val AMCheckClanMembershipResponse: AMCheckClanMembershipResponse with scala.Double = js.native
  /* 4352 */ val AMClaimUnownedUserGift: AMClaimUnownedUserGift with scala.Double = js.native
  /* 4353 */ val AMClaimUnownedUserGiftResponse: AMClaimUnownedUserGiftResponse with scala.Double = js.native
  /* 534 */ val AMClanCleanup: AMClanCleanup with scala.Double = js.native
  /* 538 */ val AMClanCleanupList: AMClanCleanupList with scala.Double = js.native
  /* 567 */ val AMClanDataUpdated: AMClanDataUpdated with scala.Double = js.native
  /* 4011 */ val AMClanPermissions: AMClanPermissions with scala.Double = js.native
  /* 4012 */ val AMClanPermissionsResponse: AMClanPermissionsResponse with scala.Double = js.native
  /* 4090 */ val AMClansInCommon: AMClansInCommon with scala.Double = js.native
  /* 4103 */ val AMClansInCommonCount: AMClansInCommonCount with scala.Double = js.native
  /* 4097 */ val AMClansInCommonCountResponse: AMClansInCommonCountResponse with scala.Double = js.native
  /* 4091 */ val AMClansInCommonResponse: AMClansInCommonResponse with scala.Double = js.native
  /* 4264 */ val AMClearDispute: AMClearDispute with scala.Double = js.native
  /* 4265 */ val AMClearDisputeResponse: AMClearDisputeResponse with scala.Double = js.native
  /* 4306 */ val AMClearPersonaMetadataBlob: AMClearPersonaMetadataBlob with scala.Double = js.native
  /* 576 */ val AMClientAcceptFriendInvite: AMClientAcceptFriendInvite with scala.Double = js.native
  /* 5566 */ val AMClientAddFriendToGroup: AMClientAddFriendToGroup with scala.Double = js.native
  /* 5567 */ val AMClientAddFriendToGroupResponse: AMClientAddFriendToGroupResponse with scala.Double = js.native
  /* 598 */ val AMClientChatActionRelay: AMClientChatActionRelay with scala.Double = js.native
  /* 571 */ val AMClientChatInviteRelay: AMClientChatInviteRelay with scala.Double = js.native
  /* 574 */ val AMClientChatMemberInfoRelay: AMClientChatMemberInfoRelay with scala.Double = js.native
  /* 569 */ val AMClientChatMsgRelay: AMClientChatMsgRelay with scala.Double = js.native
  /* 5560 */ val AMClientCreateFriendsGroup: AMClientCreateFriendsGroup with scala.Double = js.native
  /* 5561 */ val AMClientCreateFriendsGroupResponse: AMClientCreateFriendsGroupResponse with scala.Double = js.native
  /* 5562 */ val AMClientDeleteFriendsGroup: AMClientDeleteFriendsGroup with scala.Double = js.native
  /* 5563 */ val AMClientDeleteFriendsGroupResponse: AMClientDeleteFriendsGroupResponse with scala.Double = js.native
  /* 573 */ val AMClientJoinChatRelay: AMClientJoinChatRelay with scala.Double = js.native
  /* 553 */ val AMClientNotPlaying: AMClientNotPlaying with scala.Double = js.native
  /* 578 */ val AMClientPublishRemovalFromSource: AMClientPublishRemovalFromSource with scala.Double = js.native
  /* 5568 */ val AMClientRemoveFriendFromGroup: AMClientRemoveFriendFromGroup with scala.Double = js.native
  /* 5569 */ val AMClientRemoveFriendFromGroupResponse: AMClientRemoveFriendFromGroupResponse with scala.Double = js.native
  /* 5564 */ val AMClientRenameFriendsGroup: AMClientRenameFriendsGroup with scala.Double = js.native
  /* 5565 */ val AMClientRenameFriendsGroupResponse: AMClientRenameFriendsGroupResponse with scala.Double = js.native
  /* 5588 */ val AMClientSetPlayerNickname: AMClientSetPlayerNickname with scala.Double = js.native
  /* 5589 */ val AMClientSetPlayerNicknameResponse: AMClientSetPlayerNicknameResponse with scala.Double = js.native
  /* 4383 */ val AMCompleteExternalPurchase: AMCompleteExternalPurchase with scala.Double = js.native
  /* 4384 */ val AMCompleteExternalPurchaseResponse: AMCompleteExternalPurchaseResponse with scala.Double = js.native
  /* 521 */ val AMCompletePurchase: AMCompletePurchase with scala.Double = js.native
  /* 4093 */ val AMConvertClan: AMConvertClan with scala.Double = js.native
  /* 4251 */ val AMConvertWallet: AMConvertWallet with scala.Double = js.native
  /* 4252 */ val AMConvertWalletResponse: AMConvertWalletResponse with scala.Double = js.native
  /* 4109 */ val AMCreateAccountRecord: AMCreateAccountRecord with scala.Double = js.native
  /* 4183 */ val AMCreateAccountRecordInSteam3: AMCreateAccountRecordInSteam3 with scala.Double = js.native
  /* 129 */ val AMCreateAccountResponse: AMCreateAccountResponse with scala.Double = js.native
  /* 4260 */ val AMCreateChargeback: AMCreateChargeback with scala.Double = js.native
  /* 4261 */ val AMCreateChargebackResponse: AMCreateChargebackResponse with scala.Double = js.native
  /* 4001 */ val AMCreateChat: AMCreateChat with scala.Double = js.native
  /* 4002 */ val AMCreateChatResponse: AMCreateChatResponse with scala.Double = js.native
  /* 586 */ val AMCreateClan: AMCreateClan with scala.Double = js.native
  /* 4027 */ val AMCreateClanAnnouncement: AMCreateClanAnnouncement with scala.Double = js.native
  /* 4028 */ val AMCreateClanAnnouncementResponse: AMCreateClanAnnouncementResponse with scala.Double = js.native
  /* 4013 */ val AMCreateClanEvent: AMCreateClanEvent with scala.Double = js.native
  /* 4014 */ val AMCreateClanEventResponse: AMCreateClanEventResponse with scala.Double = js.native
  /* 587 */ val AMCreateClanResponse: AMCreateClanResponse with scala.Double = js.native
  /* 4262 */ val AMCreateDispute: AMCreateDispute with scala.Double = js.native
  /* 4263 */ val AMCreateDisputeResponse: AMCreateDisputeResponse with scala.Double = js.native
  /* 4258 */ val AMCreateRefund: AMCreateRefund with scala.Double = js.native
  /* 4259 */ val AMCreateRefundResponse: AMCreateRefundResponse with scala.Double = js.native
  /* 4396 */ val AMDegicaPayment: AMDegicaPayment with scala.Double = js.native
  /* 4397 */ val AMDegicaPaymentResponse: AMDegicaPaymentResponse with scala.Double = js.native
  /* 4035 */ val AMDeleteClanAnnouncement: AMDeleteClanAnnouncement with scala.Double = js.native
  /* 4036 */ val AMDeleteClanAnnouncementResponse: AMDeleteClanAnnouncementResponse with scala.Double = js.native
  /* 4019 */ val AMDeleteClanEvent: AMDeleteClanEvent with scala.Double = js.native
  /* 4020 */ val AMDeleteClanEventResponse: AMDeleteClanEventResponse with scala.Double = js.native
  /* 4204 */ val AMDeleteComment: AMDeleteComment with scala.Double = js.native
  /* 4205 */ val AMDeleteCommentResponse: AMDeleteCommentResponse with scala.Double = js.native
  /* 4241 */ val AMDeleteStoredCard: AMDeleteStoredCard with scala.Double = js.native
  /* 4246 */ val AMDeleteStoredPaymentInfo: AMDeleteStoredPaymentInfo with scala.Double = js.native
  /* 4330 */ val AMDeleteStoredPaypalAgreement: AMDeleteStoredPaypalAgreement with scala.Double = js.native
  /* 4084 */ val AMDumpClan: AMDumpClan with scala.Double = js.native
  /* 4059 */ val AMDumpUser: AMDumpUser with scala.Double = js.native
  /* 4398 */ val AMEClubPayment: AMEClubPayment with scala.Double = js.native
  /* 4399 */ val AMEClubPaymentResponse: AMEClubPaymentResponse with scala.Double = js.native
  /* 4160 */ val AMEditBanReason: AMEditBanReason with scala.Double = js.native
  /* 4382 */ val AMExpireCaptchaByGID: AMExpireCaptchaByGID with scala.Double = js.native
  /* 509 */ val AMExtendLicense: AMExtendLicense with scala.Double = js.native
  /* 4367 */ val AMFinalizePurchase: AMFinalizePurchase with scala.Double = js.native
  /* 4368 */ val AMFinalizePurchaseResponse: AMFinalizePurchaseResponse with scala.Double = js.native
  /* 580 */ val AMFindAccounts: AMFindAccounts with scala.Double = js.native
  /* 581 */ val AMFindAccountsResponse: AMFindAccountsResponse with scala.Double = js.native
  /* 4143 */ val AMFindClanUser: AMFindClanUser with scala.Double = js.native
  /* 4144 */ val AMFindClanUserResponse: AMFindClanUserResponse with scala.Double = js.native
  /* 4106 */ val AMFindGSByIP: AMFindGSByIP with scala.Double = js.native
  /* 518 */ val AMFindHungTransactions: AMFindHungTransactions with scala.Double = js.native
  /* 525 */ val AMFixPendingPurchase: AMFixPendingPurchase with scala.Double = js.native
  /* 526 */ val AMFixPendingPurchaseResponse: AMFixPendingPurchaseResponse with scala.Double = js.native
  /* 535 */ val AMFixPendingRefund: AMFixPendingRefund with scala.Double = js.native
  /* 4107 */ val AMFoundGSByIP: AMFoundGSByIP with scala.Double = js.native
  /* 4100 */ val AMFriendsInCommon: AMFriendsInCommon with scala.Double = js.native
  /* 4102 */ val AMFriendsInCommonCountResponse: AMFriendsInCommonCountResponse with scala.Double = js.native
  /* 4101 */ val AMFriendsInCommonResponse: AMFriendsInCommonResponse with scala.Double = js.native
  /* 4098 */ val AMFriendsList: AMFriendsList with scala.Double = js.native
  /* 4099 */ val AMFriendsListResponse: AMFriendsListResponse with scala.Double = js.native
  /* 6406 */ val AMGMSGameServerRemove: AMGMSGameServerRemove with scala.Double = js.native
  /* 6405 */ val AMGMSGameServerUpdate: AMGMSGameServerUpdate with scala.Double = js.native
  /* 4213 */ val AMGSSearch: AMGSSearch with scala.Double = js.native
  /* 4340 */ val AMGameServerAccountChangePassword: AMGameServerAccountChangePassword with scala.Double = js.native
  /* 4341 */ val AMGameServerAccountDeleteAccount: AMGameServerAccountDeleteAccount with scala.Double = js.native
  /* 4335 */ val AMGameServerPlayerCompatibilityCheck: AMGameServerPlayerCompatibilityCheck with scala.Double = js.native
  /* 4336 */ val AMGameServerPlayerCompatibilityCheckResponse: AMGameServerPlayerCompatibilityCheckResponse with scala.Double = js.native
  /* 4332 */ val AMGameServerRemove: AMGameServerRemove with scala.Double = js.native
  /* 4331 */ val AMGameServerUpdate: AMGameServerUpdate with scala.Double = js.native
  /* 4323 */ val AMGetAccountBanInfo: AMGetAccountBanInfo with scala.Double = js.native
  /* 4324 */ val AMGetAccountBanInfoResponse: AMGetAccountBanInfoResponse with scala.Double = js.native
  /* 4338 */ val AMGetAccountCommunityBanInfo: AMGetAccountCommunityBanInfo with scala.Double = js.native
  /* 4339 */ val AMGetAccountCommunityBanInfoResponse: AMGetAccountCommunityBanInfoResponse with scala.Double = js.native
  /* 4287 */ val AMGetAccountDetails: AMGetAccountDetails with scala.Double = js.native
  /* 4112 */ val AMGetAccountDetails2: AMGetAccountDetails2 with scala.Double = js.native
  /* 4288 */ val AMGetAccountDetailsResponse: AMGetAccountDetailsResponse with scala.Double = js.native
  /* 4113 */ val AMGetAccountDetailsResponse2: AMGetAccountDetailsResponse2 with scala.Double = js.native
  /* 4006 */ val AMGetAccountEmailAddress: AMGetAccountEmailAddress with scala.Double = js.native
  /* 4007 */ val AMGetAccountEmailAddressResponse: AMGetAccountEmailAddressResponse with scala.Double = js.native
  /* 4294 */ val AMGetAccountFlagsForWGSpoofing: AMGetAccountFlagsForWGSpoofing with scala.Double = js.native
  /* 4295 */ val AMGetAccountFlagsForWGSpoofingResponse: AMGetAccountFlagsForWGSpoofingResponse with scala.Double = js.native
  /* 594 */ val AMGetAccountFriendsCount: AMGetAccountFriendsCount with scala.Double = js.native
  /* 595 */ val AMGetAccountFriendsCountResponse: AMGetAccountFriendsCountResponse with scala.Double = js.native
  /* 4069 */ val AMGetAccountLinks: AMGetAccountLinks with scala.Double = js.native
  /* 4070 */ val AMGetAccountLinksResponse: AMGetAccountLinksResponse with scala.Double = js.native
  /* 4313 */ val AMGetAccountPSNInfo: AMGetAccountPSNInfo with scala.Double = js.native
  /* 4314 */ val AMGetAccountPSNInfoResponse: AMGetAccountPSNInfoResponse with scala.Double = js.native
  /* 4408 */ val AMGetAccountResetDetailsRequest: AMGetAccountResetDetailsRequest with scala.Double = js.native
  /* 4409 */ val AMGetAccountResetDetailsResponse: AMGetAccountResetDetailsResponse with scala.Double = js.native
  /* 4158 */ val AMGetAccountStatus: AMGetAccountStatus with scala.Double = js.native
  /* 4159 */ val AMGetAccountStatusResponse: AMGetAccountStatusResponse with scala.Double = js.native
  /* 4188 */ val AMGetBillingAddress: AMGetBillingAddress with scala.Double = js.native
  /* 4189 */ val AMGetBillingAddressResponse: AMGetBillingAddressResponse with scala.Double = js.native
  /* 4134 */ val AMGetCaptchaDataByGID: AMGetCaptchaDataByGID with scala.Double = js.native
  /* 4135 */ val AMGetCaptchaDataByGIDResponse: AMGetCaptchaDataByGIDResponse with scala.Double = js.native
  /* 4129 */ val AMGetCaptchaDataForIP: AMGetCaptchaDataForIP with scala.Double = js.native
  /* 4130 */ val AMGetCaptchaDataForIPResponse: AMGetCaptchaDataForIPResponse with scala.Double = js.native
  /* 4239 */ val AMGetCardList: AMGetCardList with scala.Double = js.native
  /* 4240 */ val AMGetCardListResponse: AMGetCardListResponse with scala.Double = js.native
  /* 4065 */ val AMGetChatBanList: AMGetChatBanList with scala.Double = js.native
  /* 4066 */ val AMGetChatBanListResponse: AMGetChatBanListResponse with scala.Double = js.native
  /* 4033 */ val AMGetClanAnnouncements: AMGetClanAnnouncements with scala.Double = js.native
  /* 4031 */ val AMGetClanAnnouncementsCount: AMGetClanAnnouncementsCount with scala.Double = js.native
  /* 4032 */ val AMGetClanAnnouncementsCountResponse: AMGetClanAnnouncementsCountResponse with scala.Double = js.native
  /* 4034 */ val AMGetClanAnnouncementsResponse: AMGetClanAnnouncementsResponse with scala.Double = js.native
  /* 588 */ val AMGetClanDetails: AMGetClanDetails with scala.Double = js.native
  /* 4373 */ val AMGetClanDetailsForForumCreation: AMGetClanDetailsForForumCreation with scala.Double = js.native
  /* 4374 */ val AMGetClanDetailsForForumCreationResponse: AMGetClanDetailsForForumCreationResponse with scala.Double = js.native
  /* 589 */ val AMGetClanDetailsResponse: AMGetClanDetailsResponse with scala.Double = js.native
  /* 4017 */ val AMGetClanEvents: AMGetClanEvents with scala.Double = js.native
  /* 4018 */ val AMGetClanEventsResponse: AMGetClanEventsResponse with scala.Double = js.native
  /* 4039 */ val AMGetClanHistory: AMGetClanHistory with scala.Double = js.native
  /* 4040 */ val AMGetClanHistoryResponse: AMGetClanHistoryResponse with scala.Double = js.native
  /* 4076 */ val AMGetClanMembers: AMGetClanMembers with scala.Double = js.native
  /* 4077 */ val AMGetClanMembersResponse: AMGetClanMembersResponse with scala.Double = js.native
  /* 4088 */ val AMGetClanMembershipList: AMGetClanMembershipList with scala.Double = js.native
  /* 4089 */ val AMGetClanMembershipListResponse: AMGetClanMembershipListResponse with scala.Double = js.native
  /* 4298 */ val AMGetClanOfficers: AMGetClanOfficers with scala.Double = js.native
  /* 4299 */ val AMGetClanOfficersResponse: AMGetClanOfficersResponse with scala.Double = js.native
  /* 4054 */ val AMGetClanPOTW: AMGetClanPOTW with scala.Double = js.native
  /* 4055 */ val AMGetClanPOTWResponse: AMGetClanPOTWResponse with scala.Double = js.native
  /* 4041 */ val AMGetClanPermissionBits: AMGetClanPermissionBits with scala.Double = js.native
  /* 4042 */ val AMGetClanPermissionBitsResponse: AMGetClanPermissionBitsResponse with scala.Double = js.native
  /* 4023 */ val AMGetClanPermissionSettings: AMGetClanPermissionSettings with scala.Double = js.native
  /* 4024 */ val AMGetClanPermissionSettingsResponse: AMGetClanPermissionSettingsResponse with scala.Double = js.native
  /* 4050 */ val AMGetClanRank: AMGetClanRank with scala.Double = js.native
  /* 4051 */ val AMGetClanRankResponse: AMGetClanRankResponse with scala.Double = js.native
  /* 4200 */ val AMGetComments: AMGetComments with scala.Double = js.native
  /* 4201 */ val AMGetCommentsResponse: AMGetCommentsResponse with scala.Double = js.native
  /* 4116 */ val AMGetCommunityPrivacyState: AMGetCommunityPrivacyState with scala.Double = js.native
  /* 4117 */ val AMGetCommunityPrivacyStateResponse: AMGetCommunityPrivacyStateResponse with scala.Double = js.native
  /* 514 */ val AMGetFinalPrice: AMGetFinalPrice with scala.Double = js.native
  /* 515 */ val AMGetFinalPriceResponse: AMGetFinalPriceResponse with scala.Double = js.native
  /* 4124 */ val AMGetFriendRelationship: AMGetFriendRelationship with scala.Double = js.native
  /* 4125 */ val AMGetFriendRelationshipResponse: AMGetFriendRelationshipResponse with scala.Double = js.native
  /* 4165 */ val AMGetFriendsLobbies: AMGetFriendsLobbies with scala.Double = js.native
  /* 4166 */ val AMGetFriendsLobbiesResponse: AMGetFriendsLobbiesResponse with scala.Double = js.native
  /* 4296 */ val AMGetFriendsWishlistInfo: AMGetFriendsWishlistInfo with scala.Double = js.native
  /* 4297 */ val AMGetFriendsWishlistInfoResponse: AMGetFriendsWishlistInfoResponse with scala.Double = js.native
  /* 4271 */ val AMGetGSPlayerList: AMGetGSPlayerList with scala.Double = js.native
  /* 4272 */ val AMGetGSPlayerListResponse: AMGetGSPlayerListResponse with scala.Double = js.native
  /* 4276 */ val AMGetGameMembers: AMGetGameMembers with scala.Double = js.native
  /* 4277 */ val AMGetGameMembersResponse: AMGetGameMembersResponse with scala.Double = js.native
  /* 4094 */ val AMGetGiftTargetListRelay: AMGetGiftTargetListRelay with scala.Double = js.native
  /* 4120 */ val AMGetIgnored: AMGetIgnored with scala.Double = js.native
  /* 4121 */ val AMGetIgnoredResponse: AMGetIgnoredResponse with scala.Double = js.native
  /* 516 */ val AMGetLegacyGameKey: AMGetLegacyGameKey with scala.Double = js.native
  /* 517 */ val AMGetLegacyGameKeyResponse: AMGetLegacyGameKeyResponse with scala.Double = js.native
  /* 539 */ val AMGetLicenses: AMGetLicenses with scala.Double = js.native
  /* 540 */ val AMGetLicensesResponse: AMGetLicensesResponse with scala.Double = js.native
  /* 4136 */ val AMGetLobbyList: AMGetLobbyList with scala.Double = js.native
  /* 4137 */ val AMGetLobbyListResponse: AMGetLobbyListResponse with scala.Double = js.native
  /* 4138 */ val AMGetLobbyMetadata: AMGetLobbyMetadata with scala.Double = js.native
  /* 4139 */ val AMGetLobbyMetadataResponse: AMGetLobbyMetadataResponse with scala.Double = js.native
  /* 4301 */ val AMGetNameHistory: AMGetNameHistory with scala.Double = js.native
  /* 4302 */ val AMGetNameHistoryResponse: AMGetNameHistoryResponse with scala.Double = js.native
  /* 4333 */ val AMGetPaypalAgreements: AMGetPaypalAgreements with scala.Double = js.native
  /* 4334 */ val AMGetPaypalAgreementsResponse: AMGetPaypalAgreementsResponse with scala.Double = js.native
  /* 4375 */ val AMGetPendingNotificationCount: AMGetPendingNotificationCount with scala.Double = js.native
  /* 4376 */ val AMGetPendingNotificationCountResponse: AMGetPendingNotificationCountResponse with scala.Double = js.native
  /* 4365 */ val AMGetPlayerBanDetails: AMGetPlayerBanDetails with scala.Double = js.native
  /* 4366 */ val AMGetPlayerBanDetailsResponse: AMGetPlayerBanDetailsResponse with scala.Double = js.native
  /* 4289 */ val AMGetPlayerLinkDetails: AMGetPlayerLinkDetails with scala.Double = js.native
  /* 4290 */ val AMGetPlayerLinkDetailsResponse: AMGetPlayerLinkDetailsResponse with scala.Double = js.native
  /* 4184 */ val AMGetPreviousCBAccount: AMGetPreviousCBAccount with scala.Double = js.native
  /* 4185 */ val AMGetPreviousCBAccountResponse: AMGetPreviousCBAccountResponse with scala.Double = js.native
  /* 4206 */ val AMGetPurchaseStatus: AMGetPurchaseStatus with scala.Double = js.native
  /* 4037 */ val AMGetSingleClanAnnouncement: AMGetSingleClanAnnouncement with scala.Double = js.native
  /* 4038 */ val AMGetSingleClanAnnouncementResponse: AMGetSingleClanAnnouncementResponse with scala.Double = js.native
  /* 4048 */ val AMGetSingleClanEvent: AMGetSingleClanEvent with scala.Double = js.native
  /* 4049 */ val AMGetSingleClanEventResponse: AMGetSingleClanEventResponse with scala.Double = js.native
  /* 4278 */ val AMGetSteamIDForMicroTxn: AMGetSteamIDForMicroTxn with scala.Double = js.native
  /* 4279 */ val AMGetSteamIDForMicroTxnResponse: AMGetSteamIDForMicroTxnResponse with scala.Double = js.native
  /* 4247 */ val AMGetStoredPaymentSummary: AMGetStoredPaymentSummary with scala.Double = js.native
  /* 4248 */ val AMGetStoredPaymentSummaryResponse: AMGetStoredPaymentSummaryResponse with scala.Double = js.native
  /* 4119 */ val AMGetUserAchievementStatus: AMGetUserAchievementStatus with scala.Double = js.native
  /* 4175 */ val AMGetUserClansNews: AMGetUserClansNews with scala.Double = js.native
  /* 4174 */ val AMGetUserClansNewsResponse: AMGetUserClansNewsResponse with scala.Double = js.native
  /* 4269 */ val AMGetUserCurrentGameInfo: AMGetUserCurrentGameInfo with scala.Double = js.native
  /* 4270 */ val AMGetUserCurrentGameInfoResponse: AMGetUserCurrentGameInfoResponse with scala.Double = js.native
  /* 4172 */ val AMGetUserFriendNewsResponse: AMGetUserFriendNewsResponse with scala.Double = js.native
  /* 4225 */ val AMGetUserFriendsMinutesPlayed: AMGetUserFriendsMinutesPlayed with scala.Double = js.native
  /* 4226 */ val AMGetUserFriendsMinutesPlayedResponse: AMGetUserFriendsMinutesPlayedResponse with scala.Double = js.native
  /* 4073 */ val AMGetUserGameStats: AMGetUserGameStats with scala.Double = js.native
  /* 4074 */ val AMGetUserGameStatsResponse: AMGetUserGameStatsResponse with scala.Double = js.native
  /* 4237 */ val AMGetUserGameplayInfo: AMGetUserGameplayInfo with scala.Double = js.native
  /* 4238 */ val AMGetUserGameplayInfoResponse: AMGetUserGameplayInfoResponse with scala.Double = js.native
  /* 4316 */ val AMGetUserGifts: AMGetUserGifts with scala.Double = js.native
  /* 4317 */ val AMGetUserGiftsResponse: AMGetUserGiftsResponse with scala.Double = js.native
  /* 921 */ val AMGetUserGroupStatus: AMGetUserGroupStatus with scala.Double = js.native
  /* 922 */ val AMGetUserGroupStatusResponse: AMGetUserGroupStatusResponse with scala.Double = js.native
  /* 4154 */ val AMGetUserHistory: AMGetUserHistory with scala.Double = js.native
  /* 4146 */ val AMGetUserHistoryResponse: AMGetUserHistoryResponse with scala.Double = js.native
  /* 4190 */ val AMGetUserLicenseHistory: AMGetUserLicenseHistory with scala.Double = js.native
  /* 4191 */ val AMGetUserLicenseHistoryResponse: AMGetUserLicenseHistoryResponse with scala.Double = js.native
  /* 4282 */ val AMGetUserLicenseList: AMGetUserLicenseList with scala.Double = js.native
  /* 4283 */ val AMGetUserLicenseListResponse: AMGetUserLicenseListResponse with scala.Double = js.native
  /* 4227 */ val AMGetUserMinutesPlayed: AMGetUserMinutesPlayed with scala.Double = js.native
  /* 4228 */ val AMGetUserMinutesPlayedResponse: AMGetUserMinutesPlayedResponse with scala.Double = js.native
  /* 4150 */ val AMGetUserNews: AMGetUserNews with scala.Double = js.native
  /* 4151 */ val AMGetUserNewsResponse: AMGetUserNewsResponse with scala.Double = js.native
  /* 4147 */ val AMGetUserNewsSubscriptions: AMGetUserNewsSubscriptions with scala.Double = js.native
  /* 4148 */ val AMGetUserNewsSubscriptionsResponse: AMGetUserNewsSubscriptionsResponse with scala.Double = js.native
  /* 4211 */ val AMGetUserStats: AMGetUserStats with scala.Double = js.native
  /* 4292 */ val AMGetUserVacBanList: AMGetUserVacBanList with scala.Double = js.native
  /* 4293 */ val AMGetUserVacBanListResponse: AMGetUserVacBanListResponse with scala.Double = js.native
  /* 4249 */ val AMGetWalletConversionRate: AMGetWalletConversionRate with scala.Double = js.native
  /* 4250 */ val AMGetWalletConversionRateResponse: AMGetWalletConversionRateResponse with scala.Double = js.native
  /* 4244 */ val AMGetWalletDetails: AMGetWalletDetails with scala.Double = js.native
  /* 4245 */ val AMGetWalletDetailsResponse: AMGetWalletDetailsResponse with scala.Double = js.native
  /* 4108 */ val AMGiftRevoked: AMGiftRevoked with scala.Double = js.native
  /* 4356 */ val AMGrantCoupon: AMGrantCoupon with scala.Double = js.native
  /* 4357 */ val AMGrantCouponResponse: AMGrantCouponResponse with scala.Double = js.native
  /* 566 */ val AMGrantGuestPasses: AMGrantGuestPasses with scala.Double = js.native
  /* 4361 */ val AMGrantGuestPasses2: AMGrantGuestPasses2 with scala.Double = js.native
  /* 4362 */ val AMGrantGuestPasses2Response: AMGrantGuestPasses2Response with scala.Double = js.native
  /* 4328 */ val AMHandlePendingTransaction: AMHandlePendingTransaction with scala.Double = js.native
  /* 4360 */ val AMHandlePendingTransactionResponse: AMHandlePendingTransactionResponse with scala.Double = js.native
  /* 512 */ val AMInitPurchase: AMInitPurchase with scala.Double = js.native
  /* 560 */ val AMInitPurchaseResponse: AMInitPurchaseResponse with scala.Double = js.native
  /* 564 */ val AMInviteUserToClan: AMInviteUserToClan with scala.Double = js.native
  /* 4308 */ val AMIsAccountInCaptchaGracePeriod: AMIsAccountInCaptchaGracePeriod with scala.Double = js.native
  /* 4309 */ val AMIsAccountInCaptchaGracePeriodResponse: AMIsAccountInCaptchaGracePeriodResponse with scala.Double = js.native
  /* 4358 */ val AMIsPackageRestrictedInUserCountry: AMIsPackageRestrictedInUserCountry with scala.Double = js.native
  /* 4359 */ val AMIsPackageRestrictedInUserCountryResponse: AMIsPackageRestrictedInUserCountryResponse with scala.Double = js.native
  /* 527 */ val AMIsUserBanned: AMIsUserBanned with scala.Double = js.native
  /* 4092 */ val AMIsValidAccountID: AMIsValidAccountID with scala.Double = js.native
  /* 4078 */ val AMJoinPublicClan: AMJoinPublicClan with scala.Double = js.native
  /* 4060 */ val AMKickUserFromClan: AMKickUserFromClan with scala.Double = js.native
  /* 4010 */ val AMLeaveClan: AMLeaveClan with scala.Double = js.native
  /* 529 */ val AMLoadActivationCodes: AMLoadActivationCodes with scala.Double = js.native
  /* 530 */ val AMLoadActivationCodesResponse: AMLoadActivationCodesResponse with scala.Double = js.native
  /* 524 */ val AMLoadOEMTickets: AMLoadOEMTickets with scala.Double = js.native
  /* 562 */ val AMLockProfile: AMLockProfile with scala.Double = js.native
  /* 532 */ val AMLookupKey: AMLookupKey with scala.Double = js.native
  /* 531 */ val AMLookupKeyResponse: AMLookupKeyResponse with scala.Double = js.native
  /* 4391 */ val AMMOLPayment: AMMOLPayment with scala.Double = js.native
  /* 4392 */ val AMMOLPaymentResponse: AMMOLPaymentResponse with scala.Double = js.native
  /* 4257 */ val AMMarketingTreatmentUpdate: AMMarketingTreatmentUpdate with scala.Double = js.native
  /* 4378 */ val AMMoPayPayment: AMMoPayPayment with scala.Double = js.native
  /* 4379 */ val AMMoPayPaymentResponse: AMMoPayPaymentResponse with scala.Double = js.native
  /* 4300 */ val AMNameChange: AMNameChange with scala.Double = js.native
  /* 523 */ val AMNewChallenge: AMNewChallenge with scala.Double = js.native
  /* 4079 */ val AMNotifyChatOfClanChange: AMNotifyChatOfClanChange with scala.Double = js.native
  /* 6508 */ val AMNotifySessionDeviceAuthorized: AMNotifySessionDeviceAuthorized with scala.Double = js.native
  /* 596 */ val AMP2PIntroducerMessage: AMP2PIntroducerMessage with scala.Double = js.native
  /* 4377 */ val AMPasswordHashUpgrade: AMPasswordHashUpgrade with scala.Double = js.native
  /* 4400 */ val AMPayPalPaymentsHubPayment: AMPayPalPaymentsHubPayment with scala.Double = js.native
  /* 4401 */ val AMPayPalPaymentsHubPaymentResponse: AMPayPalPaymentsHubPaymentResponse with scala.Double = js.native
  /* 4387 */ val AMPayelpPayment: AMPayelpPayment with scala.Double = js.native
  /* 4388 */ val AMPayelpPaymentResponse: AMPayelpPaymentResponse with scala.Double = js.native
  /* 4372 */ val AMPersonaChangeResponse: AMPersonaChangeResponse with scala.Double = js.native
  /* 4389 */ val AMPlayerGetClanBasicDetails: AMPlayerGetClanBasicDetails with scala.Double = js.native
  /* 4390 */ val AMPlayerGetClanBasicDetailsResponse: AMPlayerGetClanBasicDetailsResponse with scala.Double = js.native
  /* 4322 */ val AMPlayerHostedOnGameServer: AMPlayerHostedOnGameServer with scala.Double = js.native
  /* 4266 */ val AMPlayerNicknameList: AMPlayerNicknameList with scala.Double = js.native
  /* 4267 */ val AMPlayerNicknameListResponse: AMPlayerNicknameListResponse with scala.Double = js.native
  /* 557 */ val AMPrimePersonaStateCache: AMPrimePersonaStateCache with scala.Double = js.native
  /* 4162 */ val AMProbeClanMembershipList: AMProbeClanMembershipList with scala.Double = js.native
  /* 4163 */ val AMProbeClanMembershipListResponse: AMProbeClanMembershipListResponse with scala.Double = js.native
  /* 575 */ val AMPublishChatMemberInfo: AMPublishChatMemberInfo with scala.Double = js.native
  /* 4004 */ val AMPublishChatMetadata: AMPublishChatMetadata with scala.Double = js.native
  /* 4025 */ val AMPublishChatRoomInfo: AMPublishChatRoomInfo with scala.Double = js.native
  /* 513 */ val AMPurchaseResponse: AMPurchaseResponse with scala.Double = js.native
  /* 4325 */ val AMRecordBanEnforcement: AMRecordBanEnforcement with scala.Double = js.native
  /* 563 */ val AMRefreshGuestPasses: AMRefreshGuestPasses with scala.Double = js.native
  /* 2210 */ val AMRefreshSessions: AMRefreshSessions with scala.Double = js.native
  /* 528 */ val AMRegisterKey: AMRegisterKey with scala.Double = js.native
  /* 4253 */ val AMRelayGetFriendsWhoPlayGame: AMRelayGetFriendsWhoPlayGame with scala.Double = js.native
  /* 4254 */ val AMRelayGetFriendsWhoPlayGameResponse: AMRelayGetFriendsWhoPlayGameResponse with scala.Double = js.native
  /* 555 */ val AMRelayPublishStatus: AMRelayPublishStatus with scala.Double = js.native
  /* 2201 */ val AMRelayToGC: AMRelayToGC with scala.Double = js.native
  /* 568 */ val AMReloadAccount: AMReloadAccount with scala.Double = js.native
  /* 4284 */ val AMReloadGameGroupPolicy: AMReloadGameGroupPolicy with scala.Double = js.native
  /* 4083 */ val AMRemoveFriend: AMRemoveFriend with scala.Double = js.native
  /* 4281 */ val AMRemovePublisherUser: AMRemovePublisherUser with scala.Double = js.native
  /* 4342 */ val AMRenewAgreement: AMRenewAgreement with scala.Double = js.native
  /* 4337 */ val AMRenewLicense: AMRenewLicense with scala.Double = js.native
  /* 582 */ val AMRequestAccountData: AMRequestAccountData with scala.Double = js.native
  /* 583 */ val AMRequestAccountDataResponse: AMRequestAccountDataResponse with scala.Double = js.native
  /* 4058 */ val AMRequestChatMetadata: AMRequestChatMetadata with scala.Double = js.native
  /* 4008 */ val AMRequestClanData: AMRequestClanData with scala.Double = js.native
  /* 4329 */ val AMRequestClanDetails: AMRequestClanDetails with scala.Double = js.native
  /* 4008 */ val AMRequestFriendData: AMRequestFriendData with scala.Double = js.native
  /* 556 */ val AMResetCommunityContent: AMResetCommunityContent with scala.Double = js.native
  /* 4197 */ val AMResetUserVerificationGSByIP: AMResetUserVerificationGSByIP with scala.Double = js.native
  /* 4385 */ val AMResolveNegativeWalletCredits: AMResolveNegativeWalletCredits with scala.Double = js.native
  /* 4386 */ val AMResolveNegativeWalletCreditsResponse: AMResolveNegativeWalletCreditsResponse with scala.Double = js.native
  /* 4080 */ val AMResubmitPurchase: AMResubmitPurchase with scala.Double = js.native
  /* 536 */ val AMReverseChargeback: AMReverseChargeback with scala.Double = js.native
  /* 537 */ val AMReverseChargebackResponse: AMReverseChargebackResponse with scala.Double = js.native
  /* 4242 */ val AMRevokeLegacyGameKeys: AMRevokeLegacyGameKeys with scala.Double = js.native
  /* 561 */ val AMRevokePurchaseResponse: AMRevokePurchaseResponse with scala.Double = js.native
  /* 4326 */ val AMRollbackGiftTransfer: AMRollbackGiftTransfer with scala.Double = js.native
  /* 4327 */ val AMRollbackGiftTransferResponse: AMRollbackGiftTransferResponse with scala.Double = js.native
  /* 4219 */ val AMRouteFriendMsg: AMRouteFriendMsg with scala.Double = js.native
  /* 4009 */ val AMRouteToClients: AMRouteToClients with scala.Double = js.native
  /* 4412 */ val AMSendAccountInfoUpdate: AMSendAccountInfoUpdate with scala.Double = js.native
  /* 4343 */ val AMSendEmail: AMSendEmail with scala.Double = js.native
  /* 4152 */ val AMSendQueuedEmails: AMSendQueuedEmails with scala.Double = js.native
  /* 508 */ val AMSendSystemIMToUser: AMSendSystemIMToUser with scala.Double = js.native
  /* 4126 */ val AMServiceModulesCache: AMServiceModulesCache with scala.Double = js.native
  /* 4127 */ val AMServiceModulesCall: AMServiceModulesCall with scala.Double = js.native
  /* 4128 */ val AMServiceModulesCallResponse: AMServiceModulesCallResponse with scala.Double = js.native
  /* 4045 */ val AMSessionInfoRequest: AMSessionInfoRequest with scala.Double = js.native
  /* 4046 */ val AMSessionInfoResponse: AMSessionInfoResponse with scala.Double = js.native
  /* 4363 */ val AMSessionQuery: AMSessionQuery with scala.Double = js.native
  /* 4364 */ val AMSessionQueryResponse: AMSessionQueryResponse with scala.Double = js.native
  /* 4064 */ val AMSetAccountDetails: AMSetAccountDetails with scala.Double = js.native
  /* 584 */ val AMSetAccountFlags: AMSetAccountFlags with scala.Double = js.native
  /* 4071 */ val AMSetAccountLinks: AMSetAccountLinks with scala.Double = js.native
  /* 4072 */ val AMSetAccountLinksResponse: AMSetAccountLinksResponse with scala.Double = js.native
  /* 519 */ val AMSetAccountTrustedRequest: AMSetAccountTrustedRequest with scala.Double = js.native
  /* 591 */ val AMSetAvatar: AMSetAvatar with scala.Double = js.native
  /* 4068 */ val AMSetClanDetails: AMSetClanDetails with scala.Double = js.native
  /* 4354 */ val AMSetClanName: AMSetClanName with scala.Double = js.native
  /* 4355 */ val AMSetClanNameResponse: AMSetClanNameResponse with scala.Double = js.native
  /* 4056 */ val AMSetClanPOTW: AMSetClanPOTW with scala.Double = js.native
  /* 4057 */ val AMSetClanPOTWResponse: AMSetClanPOTWResponse with scala.Double = js.native
  /* 4043 */ val AMSetClanPermissionBits: AMSetClanPermissionBits with scala.Double = js.native
  /* 4044 */ val AMSetClanPermissionBitsResponse: AMSetClanPermissionBitsResponse with scala.Double = js.native
  /* 4021 */ val AMSetClanPermissionSettings: AMSetClanPermissionSettings with scala.Double = js.native
  /* 4022 */ val AMSetClanPermissionSettingsResponse: AMSetClanPermissionSettingsResponse with scala.Double = js.native
  /* 4052 */ val AMSetClanRank: AMSetClanRank with scala.Double = js.native
  /* 4053 */ val AMSetClanRankResponse: AMSetClanRankResponse with scala.Double = js.native
  /* 4114 */ val AMSetCommunityProfileSettings: AMSetCommunityProfileSettings with scala.Double = js.native
  /* 4115 */ val AMSetCommunityProfileSettingsResponse: AMSetCommunityProfileSettingsResponse with scala.Double = js.native
  /* 4063 */ val AMSetCommunityState: AMSetCommunityState with scala.Double = js.native
  /* 4268 */ val AMSetDRMTestConfig: AMSetDRMTestConfig with scala.Double = js.native
  /* 4123 */ val AMSetFriendRelationshipNone: AMSetFriendRelationshipNone with scala.Double = js.native
  /* 4096 */ val AMSetIgnored: AMSetIgnored with scala.Double = js.native
  /* 4122 */ val AMSetIgnoredResponse: AMSetIgnoredResponse with scala.Double = js.native
  /* 4153 */ val AMSetLicenseFlags: AMSetLicenseFlags with scala.Double = js.native
  /* 590 */ val AMSetPersonaName: AMSetPersonaName with scala.Double = js.native
  /* 4255 */ val AMSetPreApproval: AMSetPreApproval with scala.Double = js.native
  /* 4256 */ val AMSetPreApprovalResponse: AMSetPreApprovalResponse with scala.Double = js.native
  /* 4005 */ val AMSetProfileURL: AMSetProfileURL with scala.Double = js.native
  /* 4350 */ val AMSetUserGiftUnowned: AMSetUserGiftUnowned with scala.Double = js.native
  /* 4351 */ val AMSetUserGiftUnownedResponse: AMSetUserGiftUnownedResponse with scala.Double = js.native
  /* 4149 */ val AMSetUserNewsSubscriptions: AMSetUserNewsSubscriptions with scala.Double = js.native
  /* 4404 */ val AMSmart2PayPayment: AMSmart2PayPayment with scala.Double = js.native
  /* 4405 */ val AMSmart2PayPaymentResponse: AMSmart2PayPaymentResponse with scala.Double = js.native
  /* 4181 */ val AMStoreCancelPurchase: AMStoreCancelPurchase with scala.Double = js.native
  /* 4180 */ val AMStoreCompletePurchase: AMStoreCompletePurchase with scala.Double = js.native
  /* 4178 */ val AMStoreGetFinalPrice: AMStoreGetFinalPrice with scala.Double = js.native
  /* 4179 */ val AMStoreGetFinalPriceResponse: AMStoreGetFinalPriceResponse with scala.Double = js.native
  /* 4176 */ val AMStoreInitPurchase: AMStoreInitPurchase with scala.Double = js.native
  /* 4177 */ val AMStoreInitPurchaseResponse: AMStoreInitPurchaseResponse with scala.Double = js.native
  /* 4182 */ val AMStorePurchaseResponse: AMStorePurchaseResponse with scala.Double = js.native
  /* 4236 */ val AMStoreUserStats: AMStoreUserStats with scala.Double = js.native
  /* 4312 */ val AMStoreUserStatsResponse: AMStoreUserStatsResponse with scala.Double = js.native
  /* 4291 */ val AMSubscribeToPersonaFeed: AMSubscribeToPersonaFeed with scala.Double = js.native
  /* 4195 */ val AMSupportChangeEmail: AMSupportChangeEmail with scala.Double = js.native
  /* 4194 */ val AMSupportChangePassword: AMSupportChangePassword with scala.Double = js.native
  /* 4196 */ val AMSupportChangeSecretQA: AMSupportChangeSecretQA with scala.Double = js.native
  /* 4199 */ val AMSupportEnableOrDisable: AMSupportEnableOrDisable with scala.Double = js.native
  /* 4209 */ val AMSupportIsAccountEnabled: AMSupportIsAccountEnabled with scala.Double = js.native
  /* 4210 */ val AMSupportIsAccountEnabledResponse: AMSupportIsAccountEnabledResponse with scala.Double = js.native
  /* 4212 */ val AMSupportKickSession: AMSupportKickSession with scala.Double = js.native
  /* 4307 */ val AMSupportRemoveAccountSecurity: AMSupportRemoveAccountSecurity with scala.Double = js.native
  /* 4348 */ val AMSwapKioskDeposit: AMSwapKioskDeposit with scala.Double = js.native
  /* 4349 */ val AMSwapKioskDepositResponse: AMSwapKioskDepositResponse with scala.Double = js.native
  /* 4220 */ val AMTicketAuthRequestOrResponse: AMTicketAuthRequestOrResponse with scala.Double = js.native
  /* 5812 */ val AMToMDSGetDepotDecryptionKey: AMToMDSGetDepotDecryptionKey with scala.Double = js.native
  /* 4133 */ val AMTrackFailedAuthByIP: AMTrackFailedAuthByIP with scala.Double = js.native
  /* 4320 */ val AMTransferLockedGifts: AMTransferLockedGifts with scala.Double = js.native
  /* 4321 */ val AMTransferLockedGiftsResponse: AMTransferLockedGiftsResponse with scala.Double = js.native
  /* 4402 */ val AMTwoFactorRecoverAuthenticatorRequest: AMTwoFactorRecoverAuthenticatorRequest with scala.Double = js.native
  /* 4403 */ val AMTwoFactorRecoverAuthenticatorResponse: AMTwoFactorRecoverAuthenticatorResponse with scala.Double = js.native
  /* 4067 */ val AMUnBanFromChat: AMUnBanFromChat with scala.Double = js.native
  /* 4186 */ val AMUpdateBillingAddress: AMUpdateBillingAddress with scala.Double = js.native
  /* 4187 */ val AMUpdateBillingAddressResponse: AMUpdateBillingAddressResponse with scala.Double = js.native
  /* 4003 */ val AMUpdateChatMetadata: AMUpdateChatMetadata with scala.Double = js.native
  /* 4029 */ val AMUpdateClanAnnouncement: AMUpdateClanAnnouncement with scala.Double = js.native
  /* 4030 */ val AMUpdateClanAnnouncementResponse: AMUpdateClanAnnouncementResponse with scala.Double = js.native
  /* 4015 */ val AMUpdateClanEvent: AMUpdateClanEvent with scala.Double = js.native
  /* 4016 */ val AMUpdateClanEventResponse: AMUpdateClanEventResponse with scala.Double = js.native
  /* 4198 */ val AMUpdateGSPlayStats: AMUpdateGSPlayStats with scala.Double = js.native
  /* 4275 */ val AMUpdatePersonaStateCache: AMUpdatePersonaStateCache with scala.Double = js.native
  /* 4305 */ val AMUpdateProviderStatus: AMUpdateProviderStatus with scala.Double = js.native
  /* 504 */ val AMUpdateUserBanRequest: AMUpdateUserBanRequest with scala.Double = js.native
  /* 4110 */ val AMUserClanList: AMUserClanList with scala.Double = js.native
  /* 4111 */ val AMUserClanListResponse: AMUserClanListResponse with scala.Double = js.native
  /* 4286 */ val AMVACStatusUpdate: AMVACStatusUpdate with scala.Double = js.native
  /* 4131 */ val AMValidateCaptchaDataForIP: AMValidateCaptchaDataForIP with scala.Double = js.native
  /* 4132 */ val AMValidateCaptchaDataForIPResponse: AMValidateCaptchaDataForIPResponse with scala.Double = js.native
  /* 4231 */ val AMValidateEmailLink: AMValidateEmailLink with scala.Double = js.native
  /* 4232 */ val AMValidateEmailLinkResponse: AMValidateEmailLinkResponse with scala.Double = js.native
  /* 4406 */ val AMValidatePasswordResetCodeAndSendSmsRequest: AMValidatePasswordResetCodeAndSendSmsRequest with scala.Double = js.native
  /* 4407 */ val AMValidatePasswordResetCodeAndSendSmsResponse: AMValidatePasswordResetCodeAndSendSmsResponse with scala.Double = js.native
  /* 4047 */ val AMValidateWGToken: AMValidateWGToken with scala.Double = js.native
  /* 4062 */ val AMValidateWGTokenResponse: AMValidateWGTokenResponse with scala.Double = js.native
  /* 552 */ val AMVerfiyUser: AMVerfiyUser with scala.Double = js.native
  /* 4222 */ val AMVerifyDepotManagementRights: AMVerifyDepotManagementRights with scala.Double = js.native
  /* 4223 */ val AMVerifyDepotManagementRightsResponse: AMVerifyDepotManagementRightsResponse with scala.Double = js.native
  /* 4095 */ val AMWipeFriendsList: AMWipeFriendsList with scala.Double = js.native
  /* 4142 */ val AMWriteNews: AMWriteNews with scala.Double = js.native
  /* 4344 */ val AMXsollaPayment: AMXsollaPayment with scala.Double = js.native
  /* 4345 */ val AMXsollaPaymentResponse: AMXsollaPaymentResponse with scala.Double = js.native
  /* 1519 */ val ATSCSPerfTestResponse: ATSCSPerfTestResponse with scala.Double = js.native
  /* 1518 */ val ATSCSPerfTestTask: ATSCSPerfTestTask with scala.Double = js.native
  /* 1508 */ val ATSCallTest: ATSCallTest with scala.Double = js.native
  /* 1509 */ val ATSCallTestReply: ATSCallTestReply with scala.Double = js.native
  /* 1506 */ val ATSCycleTCM: ATSCycleTCM with scala.Double = js.native
  /* 1516 */ val ATSExternalStressActionResult: ATSExternalStressActionResult with scala.Double = js.native
  /* 1512 */ val ATSExternalStressJobQueued: ATSExternalStressJobQueued with scala.Double = js.native
  /* 1513 */ val ATSExternalStressJobRunning: ATSExternalStressJobRunning with scala.Double = js.native
  /* 1511 */ val ATSExternalStressJobStart: ATSExternalStressJobStart with scala.Double = js.native
  /* 1515 */ val ATSExternalStressJobStopAll: ATSExternalStressJobStopAll with scala.Double = js.native
  /* 1514 */ val ATSExternalStressJobStopped: ATSExternalStressJobStopped with scala.Double = js.native
  /* 1507 */ val ATSInitDRMSStressTest: ATSInitDRMSStressTest with scala.Double = js.native
  /* 1503 */ val ATSRunFailServerTest: ATSRunFailServerTest with scala.Double = js.native
  /* 1510 */ val ATSStartExternalStress: ATSStartExternalStress with scala.Double = js.native
  /* 1501 */ val ATSStartStressTest: ATSStartStressTest with scala.Double = js.native
  /* 1517 */ val ATSStarted: ATSStarted with scala.Double = js.native
  /* 1502 */ val ATSStopStressTest: ATSStopStressTest with scala.Double = js.native
  /* 1505 */ val ATSUFSPerfTestResponse: ATSUFSPerfTestResponse with scala.Double = js.native
  /* 1504 */ val ATSUFSPerfTestTask: ATSUFSPerfTestTask with scala.Double = js.native
  /* 1000 */ val AdminCmd: AdminCmd with scala.Double = js.native
  /* 1004 */ val AdminCmdResponse: AdminCmdResponse with scala.Double = js.native
  /* 1020 */ val AdminConsoleTitle: AdminConsoleTitle with scala.Double = js.native
  /* 1024 */ val AdminGCCommand: AdminGCCommand with scala.Double = js.native
  /* 1025 */ val AdminGCGetCommandList: AdminGCGetCommandList with scala.Double = js.native
  /* 1026 */ val AdminGCGetCommandListResponse: AdminGCGetCommandListResponse with scala.Double = js.native
  /* 1023 */ val AdminGCSpew: AdminGCSpew with scala.Double = js.native
  /* 1006 */ val AdminLogEvent: AdminLogEvent with scala.Double = js.native
  /* 1005 */ val AdminLogListenRequest: AdminLogListenRequest with scala.Double = js.native
  /* 1028 */ val AdminMsgSpew: AdminMsgSpew with scala.Double = js.native
  /* 1017 */ val AdminPwLogon: AdminPwLogon with scala.Double = js.native
  /* 1018 */ val AdminPwLogonResponse: AdminPwLogonResponse with scala.Double = js.native
  /* 1019 */ val AdminSpew: AdminSpew with scala.Double = js.native
  /* 115 */ val Alert: Alert with scala.Double = js.native
  /* 550 */ val AllowUserToPlayQuery: AllowUserToPlayQuery with scala.Double = js.native
  /* 551 */ val AllowUserToPlayResponse: AllowUserToPlayResponse with scala.Double = js.native
  /* 200 */ val AssignSysID: AssignSysID with scala.Double = js.native
  /* 3619 */ val BRPCheckActivationCodes: BRPCheckActivationCodes with scala.Double = js.native
  /* 3620 */ val BRPCheckActivationCodesResponse: BRPCheckActivationCodesResponse with scala.Double = js.native
  /* 3610 */ val BRPCheckFinanceCloseOutDate: BRPCheckFinanceCloseOutDate with scala.Double = js.native
  /* 3626 */ val BRPCheckSettlementReports: BRPCheckSettlementReports with scala.Double = js.native
  /* 3607 */ val BRPCommitGC: BRPCommitGC with scala.Double = js.native
  /* 3608 */ val BRPCommitGCResponse: BRPCommitGCResponse with scala.Double = js.native
  /* 3621 */ val BRPCommitWP: BRPCommitWP with scala.Double = js.native
  /* 3622 */ val BRPCommitWPResponse: BRPCommitWPResponse with scala.Double = js.native
  /* 3615 */ val BRPConvertToCurrentKeys: BRPConvertToCurrentKeys with scala.Double = js.native
  /* 3616 */ val BRPConvertToCurrentKeysResponse: BRPConvertToCurrentKeysResponse with scala.Double = js.native
  /* 3609 */ val BRPFindHungTransactions: BRPFindHungTransactions with scala.Double = js.native
  /* 3628 */ val BRPPostTaxToAvalara: BRPPostTaxToAvalara with scala.Double = js.native
  /* 3629 */ val BRPPostTransactionTax: BRPPostTransactionTax with scala.Double = js.native
  /* 3630 */ val BRPPostTransactionTaxResponse: BRPPostTransactionTaxResponse with scala.Double = js.native
  /* 3603 */ val BRPProcessGCReports: BRPProcessGCReports with scala.Double = js.native
  /* 3631 */ val BRPProcessIMReports: BRPProcessIMReports with scala.Double = js.native
  /* 3611 */ val BRPProcessLicenses: BRPProcessLicenses with scala.Double = js.native
  /* 3612 */ val BRPProcessLicensesResponse: BRPProcessLicensesResponse with scala.Double = js.native
  /* 3604 */ val BRPProcessPPReports: BRPProcessPPReports with scala.Double = js.native
  /* 3625 */ val BRPProcessPartnerPayments: BRPProcessPartnerPayments with scala.Double = js.native
  /* 3624 */ val BRPProcessPaymentRules: BRPProcessPaymentRules with scala.Double = js.native
  /* 3602 */ val BRPProcessUSBankReports: BRPProcessUSBankReports with scala.Double = js.native
  /* 3623 */ val BRPProcessWPReports: BRPProcessWPReports with scala.Double = js.native
  /* 3617 */ val BRPPruneCardUsageStats: BRPPruneCardUsageStats with scala.Double = js.native
  /* 3618 */ val BRPPruneCardUsageStatsResponse: BRPPruneCardUsageStatsResponse with scala.Double = js.native
  /* 3613 */ val BRPRemoveExpiredPaymentData: BRPRemoveExpiredPaymentData with scala.Double = js.native
  /* 3614 */ val BRPRemoveExpiredPaymentDataResponse: BRPRemoveExpiredPaymentDataResponse with scala.Double = js.native
  /* 3606 */ val BRPSettleCB: BRPSettleCB with scala.Double = js.native
  /* 3605 */ val BRPSettleNOVA: BRPSettleNOVA with scala.Double = js.native
  /* 3601 */ val BRPStartShippingJobs: BRPStartShippingJobs with scala.Double = js.native
  /* 1407 */ val BSBannedRequest: BSBannedRequest with scala.Double = js.native
  /* 1494 */ val BSBoaCompraConfirmProductDelivery: BSBoaCompraConfirmProductDelivery with scala.Double = js.native
  /* 1495 */ val BSBoaCompraConfirmProductDeliveryResponse: BSBoaCompraConfirmProductDeliveryResponse with scala.Double = js.native
  /* 1416 */ val BSChaseRFRRequest: BSChaseRFRRequest with scala.Double = js.native
  /* 1456 */ val BSCheckJobRunning: BSCheckJobRunning with scala.Double = js.native
  /* 1457 */ val BSCheckJobRunningResponse: BSCheckJobRunningResponse with scala.Double = js.native
  /* 1425 */ val BSCommitGCTxn: BSCommitGCTxn with scala.Double = js.native
  /* 1498 */ val BSCommitWPTxn: BSCommitWPTxn with scala.Double = js.native
  /* 1474 */ val BSCompletePurchase: BSCompletePurchase with scala.Double = js.native
  /* 1475 */ val BSCompletePurchaseResponse: BSCompletePurchaseResponse with scala.Double = js.native
  /* 1470 */ val BSConvertToCurrentKeys: BSConvertToCurrentKeys with scala.Double = js.native
  /* 1471 */ val BSConvertToCurrentKeysResponse: BSConvertToCurrentKeysResponse with scala.Double = js.native
  /* 1496 */ val BSGenerateBoaCompraMD5: BSGenerateBoaCompraMD5 with scala.Double = js.native
  /* 1497 */ val BSGenerateBoaCompraMD5Response: BSGenerateBoaCompraMD5Response with scala.Double = js.native
  /* 1492 */ val BSGenerateMoPayMD5: BSGenerateMoPayMD5 with scala.Double = js.native
  /* 1493 */ val BSGenerateMoPayMD5Response: BSGenerateMoPayMD5Response with scala.Double = js.native
  /* 1462 */ val BSGetBillingAddress: BSGetBillingAddress with scala.Double = js.native
  /* 1463 */ val BSGetBillingAddressResponse: BSGetBillingAddressResponse with scala.Double = js.native
  /* 1464 */ val BSGetCreditCardInfo: BSGetCreditCardInfo with scala.Double = js.native
  /* 1465 */ val BSGetCreditCardInfoResponse: BSGetCreditCardInfoResponse with scala.Double = js.native
  /* 1415 */ val BSGetEvents: BSGetEvents with scala.Double = js.native
  /* 1410 */ val BSGetPayPalUserInfo: BSGetPayPalUserInfo with scala.Double = js.native
  /* 1411 */ val BSGetPayPalUserInfoResponse: BSGetPayPalUserInfoResponse with scala.Double = js.native
  /* 1454 */ val BSGetProPackOrderStatus: BSGetProPackOrderStatus with scala.Double = js.native
  /* 1455 */ val BSGetProPackOrderStatusResponse: BSGetProPackOrderStatusResponse with scala.Double = js.native
  /* 1421 */ val BSInitGCBankXferTxn: BSInitGCBankXferTxn with scala.Double = js.native
  /* 1422 */ val BSInitGCBankXferTxnResponse: BSInitGCBankXferTxnResponse with scala.Double = js.native
  /* 1408 */ val BSInitPayPalTxn: BSInitPayPalTxn with scala.Double = js.native
  /* 1409 */ val BSInitPayPalTxnResponse: BSInitPayPalTxnResponse with scala.Double = js.native
  /* 1472 */ val BSInitPurchase: BSInitPurchase with scala.Double = js.native
  /* 1473 */ val BSInitPurchaseResponse: BSInitPurchaseResponse with scala.Double = js.native
  /* 1490 */ val BSMoPayConfirmProductDelivery: BSMoPayConfirmProductDelivery with scala.Double = js.native
  /* 1491 */ val BSMoPayConfirmProductDeliveryResponse: BSMoPayConfirmProductDeliveryResponse with scala.Double = js.native
  /* 1417 */ val BSPaymentInstrBan: BSPaymentInstrBan with scala.Double = js.native
  /* 1418 */ val BSPaymentInstrBanResponse: BSPaymentInstrBanResponse with scala.Double = js.native
  /* 1419 */ val BSProcessGCReports: BSProcessGCReports with scala.Double = js.native
  /* 1420 */ val BSProcessPPReports: BSProcessPPReports with scala.Double = js.native
  /* 1436 */ val BSProcessUSBankReports: BSProcessUSBankReports with scala.Double = js.native
  /* 1476 */ val BSPruneCardUsageStats: BSPruneCardUsageStats with scala.Double = js.native
  /* 1477 */ val BSPruneCardUsageStatsResponse: BSPruneCardUsageStatsResponse with scala.Double = js.native
  /* 1402 */ val BSPurchaseResponse: BSPurchaseResponse with scala.Double = js.native
  /* 1437 */ val BSPurchaseRunFraudChecks: BSPurchaseRunFraudChecks with scala.Double = js.native
  /* 1438 */ val BSPurchaseRunFraudChecksResponse: BSPurchaseRunFraudChecksResponse with scala.Double = js.native
  /* 1401 */ val BSPurchaseStart: BSPurchaseStart with scala.Double = js.native
  /* 1448 */ val BSQiwiWalletInvoice: BSQiwiWalletInvoice with scala.Double = js.native
  /* 1449 */ val BSQiwiWalletInvoiceResponse: BSQiwiWalletInvoiceResponse with scala.Double = js.native
  /* 1440 */ val BSQueryBankInformation: BSQueryBankInformation with scala.Double = js.native
  /* 1441 */ val BSQueryBankInformationResponse: BSQueryBankInformationResponse with scala.Double = js.native
  /* 1428 */ val BSQueryCBOrderStatus: BSQueryCBOrderStatus with scala.Double = js.native
  /* 1429 */ val BSQueryCBOrderStatusResponse: BSQueryCBOrderStatusResponse with scala.Double = js.native
  /* 1484 */ val BSQueryFindCreditCard: BSQueryFindCreditCard with scala.Double = js.native
  /* 1485 */ val BSQueryFindCreditCardResponse: BSQueryFindCreditCardResponse with scala.Double = js.native
  /* 1423 */ val BSQueryGCBankXferTxn: BSQueryGCBankXferTxn with scala.Double = js.native
  /* 1424 */ val BSQueryGCBankXferTxnResponse: BSQueryGCBankXferTxnResponse with scala.Double = js.native
  /* 1432 */ val BSQueryPaymentInstResponse: BSQueryPaymentInstResponse with scala.Double = js.native
  /* 1431 */ val BSQueryPaymentInstUsage: BSQueryPaymentInstUsage with scala.Double = js.native
  /* 1426 */ val BSQueryTransactionStatus: BSQueryTransactionStatus with scala.Double = js.native
  /* 1427 */ val BSQueryTransactionStatusResponse: BSQueryTransactionStatusResponse with scala.Double = js.native
  /* 1433 */ val BSQueryTxnExtendedInfo: BSQueryTxnExtendedInfo with scala.Double = js.native
  /* 1434 */ val BSQueryTxnExtendedInfoResponse: BSQueryTxnExtendedInfoResponse with scala.Double = js.native
  /* 1413 */ val BSRefundTxn: BSRefundTxn with scala.Double = js.native
  /* 1414 */ val BSRefundTxnResponse: BSRefundTxnResponse with scala.Double = js.native
  /* 1468 */ val BSRemoveExpiredPaymentData: BSRemoveExpiredPaymentData with scala.Double = js.native
  /* 1469 */ val BSRemoveExpiredPaymentDataResponse: BSRemoveExpiredPaymentDataResponse with scala.Double = js.native
  /* 1458 */ val BSResetPackagePurchaseRateLimit: BSResetPackagePurchaseRateLimit with scala.Double = js.native
  /* 1459 */ val BSResetPackagePurchaseRateLimitResponse: BSResetPackagePurchaseRateLimitResponse with scala.Double = js.native
  /* 1482 */ val BSReverseRedeemPOSAKey: BSReverseRedeemPOSAKey with scala.Double = js.native
  /* 1483 */ val BSReverseRedeemPOSAKeyResponse: BSReverseRedeemPOSAKeyResponse with scala.Double = js.native
  /* 1430 */ val BSRunRedFlagReport: BSRunRedFlagReport with scala.Double = js.native
  /* 1452 */ val BSSendShippingRequest: BSSendShippingRequest with scala.Double = js.native
  /* 1453 */ val BSSendShippingRequestResponse: BSSendShippingRequestResponse with scala.Double = js.native
  /* 1406 */ val BSSettleComplete: BSSettleComplete with scala.Double = js.native
  /* 1404 */ val BSSettleNOVA: BSSettleNOVA with scala.Double = js.native
  /* 1439 */ val BSStartShippingJobs: BSStartShippingJobs with scala.Double = js.native
  /* 1486 */ val BSStatusInquiryPOSAKey: BSStatusInquiryPOSAKey with scala.Double = js.native
  /* 1487 */ val BSStatusInquiryPOSAKeyResponse: BSStatusInquiryPOSAKeyResponse with scala.Double = js.native
  /* 1478 */ val BSStoreBankInformation: BSStoreBankInformation with scala.Double = js.native
  /* 1479 */ val BSStoreBankInformationResponse: BSStoreBankInformationResponse with scala.Double = js.native
  /* 1435 */ val BSUpdateConversionRates: BSUpdateConversionRates with scala.Double = js.native
  /* 1450 */ val BSUpdateInventoryFromProPack: BSUpdateInventoryFromProPack with scala.Double = js.native
  /* 1451 */ val BSUpdateInventoryFromProPackResponse: BSUpdateInventoryFromProPackResponse with scala.Double = js.native
  /* 1460 */ val BSUpdatePaymentData: BSUpdatePaymentData with scala.Double = js.native
  /* 1461 */ val BSUpdatePaymentDataResponse: BSUpdatePaymentDataResponse with scala.Double = js.native
  /* 1488 */ val BSValidateMoPaySignature: BSValidateMoPaySignature with scala.Double = js.native
  /* 1489 */ val BSValidateMoPaySignatureResponse: BSValidateMoPaySignatureResponse with scala.Double = js.native
  /* 1445 */ val BSValidateXsollaSignature: BSValidateXsollaSignature with scala.Double = js.native
  /* 1446 */ val BSValidateXsollaSignatureResponse: BSValidateXsollaSignatureResponse with scala.Double = js.native
  /* 1480 */ val BSVerifyPOSAKey: BSVerifyPOSAKey with scala.Double = js.native
  /* 1481 */ val BSVerifyPOSAKeyResponse: BSVerifyPOSAKeyResponse with scala.Double = js.native
  /* 8401 */ val BackpackAddToCurrency: BackpackAddToCurrency with scala.Double = js.native
  /* 8402 */ val BackpackAddToCurrencyResponse: BackpackAddToCurrencyResponse with scala.Double = js.native
  /* 8400 */ val BackpackBase: BackpackBase with scala.Double = js.native
  /* 7805 */ val BadLoginIPList: BadLoginIPList with scala.Double = js.native
  /* 400 */ val BaseAIS: BaseAIS with scala.Double = js.native
  /* 500 */ val BaseAM: BaseAM with scala.Double = js.native
  /* 4000 */ val BaseAMRange2: BaseAMRange2 with scala.Double = js.native
  /* 1500 */ val BaseATS: BaseATS with scala.Double = js.native
  /* 1000 */ val BaseAdmin: BaseAdmin with scala.Double = js.native
  /* 3600 */ val BaseBRP: BaseBRP with scala.Double = js.native
  /* 1400 */ val BaseBS: BaseBS with scala.Double = js.native
  /* 3150 */ val BaseCCSRange: BaseCCSRange with scala.Double = js.native
  /* 1700 */ val BaseCM: BaseCM with scala.Double = js.native
  /* 650 */ val BaseCS: BaseCS with scala.Double = js.native
  /* 1300 */ val BaseChannelAuth: BaseChannelAuth with scala.Double = js.native
  /* 700 */ val BaseClient: BaseClient with scala.Double = js.native
  /* 5400 */ val BaseClient2: BaseClient2 with scala.Double = js.native
  /* 9800 */ val BaseClient3: BaseClient3 with scala.Double = js.native
  /* 5600 */ val BaseDFS: BaseDFS with scala.Double = js.native
  /* 1600 */ val BaseDP: BaseDP with scala.Double = js.native
  /* 625 */ val BaseDRMS: BaseDRMS with scala.Double = js.native
  /* 1800 */ val BaseDSS: BaseDSS with scala.Double = js.native
  /* 1900 */ val BaseEPM: BaseEPM with scala.Double = js.native
  /* 1100 */ val BaseFBS: BaseFBS with scala.Double = js.native
  /* 3100 */ val BaseFTSRange: BaseFTSRange with scala.Double = js.native
  /* 1200 */ val BaseFileXfer: BaseFileXfer with scala.Double = js.native
  /* 2200 */ val BaseGC: BaseGC with scala.Double = js.native
  /* 300 */ val BaseGM: BaseGM with scala.Double = js.native
  /* 900 */ val BaseGameServer: BaseGameServer with scala.Double = js.native
  /* 100 */ val BaseGeneral: BaseGeneral with scala.Double = js.native
  /* 3200 */ val BaseLBSRange: BaseLBSRange with scala.Double = js.native
  /* 5800 */ val BaseMDS: BaseMDS with scala.Double = js.native
  /* 3400 */ val BaseOGS: BaseOGS with scala.Double = js.native
  /* 2500 */ val BaseP2P: BaseP2P with scala.Double = js.native
  /* 5000 */ val BasePSRange: BasePSRange with scala.Double = js.native
  /* 2900 */ val BaseSM: BaseSM with scala.Double = js.native
  /* 200 */ val BaseShell: BaseShell with scala.Double = js.native
  /* 3000 */ val BaseTest: BaseTest with scala.Double = js.native
  /* 5200 */ val BaseUFSRange: BaseUFSRange with scala.Double = js.native
  /* 600 */ val BaseVS: BaseVS with scala.Double = js.native
  /* 8700 */ val BoxMonitorBase: BoxMonitorBase with scala.Double = js.native
  /* 8700 */ val BoxMonitorReportRequest: BoxMonitorReportRequest with scala.Double = js.native
  /* 8701 */ val BoxMonitorReportResponse: BoxMonitorReportResponse with scala.Double = js.native
  /* 3153 */ val CCSAddComment: CCSAddComment with scala.Double = js.native
  /* 3154 */ val CCSAddCommentResponse: CCSAddCommentResponse with scala.Double = js.native
  /* 3161 */ val CCSDeleteAllCommentsByAuthor: CCSDeleteAllCommentsByAuthor with scala.Double = js.native
  /* 3162 */ val CCSDeleteAllCommentsByAuthorResponse: CCSDeleteAllCommentsByAuthorResponse with scala.Double = js.native
  /* 3155 */ val CCSDeleteComment: CCSDeleteComment with scala.Double = js.native
  /* 3156 */ val CCSDeleteCommentResponse: CCSDeleteCommentResponse with scala.Double = js.native
  /* 3151 */ val CCSGetComments: CCSGetComments with scala.Double = js.native
  /* 3159 */ val CCSGetCommentsForNews: CCSGetCommentsForNews with scala.Double = js.native
  /* 3160 */ val CCSGetCommentsForNewsResponse: CCSGetCommentsForNewsResponse with scala.Double = js.native
  /* 3152 */ val CCSGetCommentsResponse: CCSGetCommentsResponse with scala.Double = js.native
  /* 3158 */ val CCSNotifyCommentCount: CCSNotifyCommentCount with scala.Double = js.native
  /* 3157 */ val CCSPreloadComments: CCSPreloadComments with scala.Double = js.native
  /* 7602 */ val CEGPropStatusDRMSRequest: CEGPropStatusDRMSRequest with scala.Double = js.native
  /* 7603 */ val CEGPropStatusDRMSResponse: CEGPropStatusDRMSResponse with scala.Double = js.native
  /* 7600 */ val CEGVersionSetEnableDisableRequest: CEGVersionSetEnableDisableRequest with scala.Double = js.native
  /* 7601 */ val CEGVersionSetEnableDisableResponse: CEGVersionSetEnableDisableResponse with scala.Double = js.native
  /* 7604 */ val CEGWhackFailureReportRequest: CEGWhackFailureReportRequest with scala.Double = js.native
  /* 7605 */ val CEGWhackFailureReportResponse: CEGWhackFailureReportResponse with scala.Double = js.native
  /* 1703 */ val CMAppInfoResponseDeprecated: CMAppInfoResponseDeprecated with scala.Double = js.native
  /* 1701 */ val CMSetAllowState: CMSetAllowState with scala.Double = js.native
  /* 1702 */ val CMSpewAllowState: CMSpewAllowState with scala.Double = js.native
  /* 8500 */ val CREBase: CREBase with scala.Double = js.native
  /* 8511 */ val CREEnumeratePublishedFiles: CREEnumeratePublishedFiles with scala.Double = js.native
  /* 8512 */ val CREEnumeratePublishedFilesResponse: CREEnumeratePublishedFilesResponse with scala.Double = js.native
  /* 8509 */ val CREGetUserPublishedItemVoteDetails: CREGetUserPublishedItemVoteDetails with scala.Double = js.native
  /* 8510 */ val CREGetUserPublishedItemVoteDetailsResponse: CREGetUserPublishedItemVoteDetailsResponse with scala.Double = js.native
  /* 8503 */ val CREItemVoteSummary: CREItemVoteSummary with scala.Double = js.native
  /* 8504 */ val CREItemVoteSummaryResponse: CREItemVoteSummaryResponse with scala.Double = js.native
  /* 8513 */ val CREPublishedFileVoteAdded: CREPublishedFileVoteAdded with scala.Double = js.native
  /* 8501 */ val CRERankByTrend: CRERankByTrend with scala.Double = js.native
  /* 8502 */ val CRERankByTrendResponse: CRERankByTrendResponse with scala.Double = js.native
  /* 8505 */ val CRERankByVote: CRERankByVote with scala.Double = js.native
  /* 8506 */ val CRERankByVoteResponse: CRERankByVoteResponse with scala.Double = js.native
  /* 8507 */ val CREUpdateUserPublishedItemVote: CREUpdateUserPublishedItemVote with scala.Double = js.native
  /* 8508 */ val CREUpdateUserPublishedItemVoteResponse: CREUpdateUserPublishedItemVoteResponse with scala.Double = js.native
  /* 6200 */ val CSBase: CSBase with scala.Double = js.native
  /* 6201 */ val CSPing: CSPing with scala.Double = js.native
  /* 6202 */ val CSPingResponse: CSPingResponse with scala.Double = js.native
  /* 787 */ val CSUserContentApprove: CSUserContentApprove with scala.Double = js.native
  /* 788 */ val CSUserContentDeny: CSUserContentDeny with scala.Double = js.native
  /* 652 */ val CSUserContentRequest: CSUserContentRequest with scala.Double = js.native
  /* 1300 */ val ChannelAuthChallenge: ChannelAuthChallenge with scala.Double = js.native
  /* 1301 */ val ChannelAuthResponse: ChannelAuthResponse with scala.Double = js.native
  /* 1302 */ val ChannelAuthResult: ChannelAuthResult with scala.Double = js.native
  /* 1303 */ val ChannelEncryptRequest: ChannelEncryptRequest with scala.Double = js.native
  /* 1304 */ val ChannelEncryptResponse: ChannelEncryptResponse with scala.Double = js.native
  /* 1305 */ val ChannelEncryptResult: ChannelEncryptResult with scala.Double = js.native
  /* 5531 */ val ClientAMGetClanOfficers: ClientAMGetClanOfficers with scala.Double = js.native
  /* 5532 */ val ClientAMGetClanOfficersResponse: ClientAMGetClanOfficersResponse with scala.Double = js.native
  /* 5570 */ val ClientAMGetPersonaNameHistory: ClientAMGetPersonaNameHistory with scala.Double = js.native
  /* 5571 */ val ClientAMGetPersonaNameHistoryResponse: ClientAMGetPersonaNameHistoryResponse with scala.Double = js.native
  /* 768 */ val ClientAccountInfo: ClientAccountInfo with scala.Double = js.native
  /* 740 */ val ClientAckGuestPass: ClientAckGuestPass with scala.Double = js.native
  /* 796 */ val ClientAckGuestPassResponse: ClientAckGuestPassResponse with scala.Double = js.native
  /* 735 */ val ClientAckMessageByGID: ClientAckMessageByGID with scala.Double = js.native
  /* 737 */ val ClientAckPurchaseReceipt: ClientAckPurchaseReceipt with scala.Double = js.native
  /* 709 */ val ClientAckVACBan: ClientAckVACBan with scala.Double = js.native
  /* 732 */ val ClientAckVACBan2: ClientAckVACBan2 with scala.Double = js.native
  /* 745 */ val ClientAcknowledgeClanInvite: ClientAcknowledgeClanInvite with scala.Double = js.native
  /* 5468 */ val ClientActivateOEMLicense: ClientActivateOEMLicense with scala.Double = js.native
  /* 791 */ val ClientAddFriend: ClientAddFriend with scala.Double = js.native
  /* 792 */ val ClientAddFriendResponse: ClientAddFriendResponse with scala.Double = js.native
  /* 702 */ val ClientAnonLogOn_Deprecated: ClientAnonLogOn_Deprecated with scala.Double = js.native
  /* 5409 */ val ClientAnonUserLogOn_Deprecated: ClientAnonUserLogOn_Deprecated with scala.Double = js.native
  /* 867 */ val ClientAppInfoChanges: ClientAppInfoChanges with scala.Double = js.native
  /* 840 */ val ClientAppInfoRequest: ClientAppInfoRequest with scala.Double = js.native
  /* 841 */ val ClientAppInfoResponse: ClientAppInfoResponse with scala.Double = js.native
  /* 866 */ val ClientAppInfoUpdate: ClientAppInfoUpdate with scala.Double = js.native
  /* 5507 */ val ClientAppMinutesPlayedData: ClientAppMinutesPlayedData with scala.Double = js.native
  /* 747 */ val ClientAppUsageEvent: ClientAppUsageEvent with scala.Double = js.native
  /* 5432 */ val ClientAuthList: ClientAuthList with scala.Double = js.native
  /* 5575 */ val ClientAuthListAck: ClientAuthListAck with scala.Double = js.native
  /* 5428 */ val ClientAuthList_Deprecated: ClientAuthList_Deprecated with scala.Double = js.native
  /* 6502 */ val ClientAuthorizeLocalDevice: ClientAuthorizeLocalDevice with scala.Double = js.native
  /* 6509 */ val ClientAuthorizeLocalDeviceNotification: ClientAuthorizeLocalDeviceNotification with scala.Double = js.native
  /* 6501 */ val ClientAuthorizeLocalDeviceRequest: ClientAuthorizeLocalDeviceRequest with scala.Double = js.native
  /* 6502 */ val ClientAuthorizeLocalDeviceResponse: ClientAuthorizeLocalDeviceResponse with scala.Double = js.native
  /* 9700 */ val ClientBroadcastBase: ClientBroadcastBase with scala.Double = js.native
  /* 9702 */ val ClientBroadcastDisconnect: ClientBroadcastDisconnect with scala.Double = js.native
  /* 9701 */ val ClientBroadcastFrames: ClientBroadcastFrames with scala.Double = js.native
  /* 9700 */ val ClientBroadcastInit: ClientBroadcastInit with scala.Double = js.native
  /* 9703 */ val ClientBroadcastScreenshot: ClientBroadcastScreenshot with scala.Double = js.native
  /* 9704 */ val ClientBroadcastUploadConfig: ClientBroadcastUploadConfig with scala.Double = js.native
  /* 783 */ val ClientCMList: ClientCMList with scala.Double = js.native
  /* 729 */ val ClientCancelLicense: ClientCancelLicense with scala.Double = js.native
  /* 781 */ val ClientCancelLicenseResponse: ClientCancelLicenseResponse with scala.Double = js.native
  /* 716 */ val ClientChangeStatus: ClientChangeStatus with scala.Double = js.native
  /* 5579 */ val ClientChangeSteamGuardOptions: ClientChangeSteamGuardOptions with scala.Double = js.native
  /* 5580 */ val ClientChangeSteamGuardOptionsResponse: ClientChangeSteamGuardOptionsResponse with scala.Double = js.native
  /* 597 */ val ClientChatAction: ClientChatAction with scala.Double = js.native
  /* 814 */ val ClientChatActionResult: ClientChatActionResult with scala.Double = js.native
  /* 5426 */ val ClientChatDeclined: ClientChatDeclined with scala.Double = js.native
  /* 807 */ val ClientChatEnter: ClientChatEnter with scala.Double = js.native
  /* 800 */ val ClientChatInvite: ClientChatInvite with scala.Double = js.native
  /* 802 */ val ClientChatMemberInfo: ClientChatMemberInfo with scala.Double = js.native
  /* 799 */ val ClientChatMsg: ClientChatMsg with scala.Double = js.native
  /* 4026 */ val ClientChatRoomInfo: ClientChatRoomInfo with scala.Double = js.native
  /* 5450 */ val ClientCheckAppBetaPassword: ClientCheckAppBetaPassword with scala.Double = js.native
  /* 5451 */ val ClientCheckAppBetaPasswordResponse: ClientCheckAppBetaPasswordResponse with scala.Double = js.native
  /* 5533 */ val ClientCheckFileSignature: ClientCheckFileSignature with scala.Double = js.native
  /* 5534 */ val ClientCheckFileSignatureResponse: ClientCheckFileSignatureResponse with scala.Double = js.native
  /* 845 */ val ClientCheckPassword: ClientCheckPassword with scala.Double = js.native
  /* 848 */ val ClientCheckPasswordResponse: ClientCheckPasswordResponse with scala.Double = js.native
  /* 822 */ val ClientClanState: ClientClanState with scala.Double = js.native
  /* 5582 */ val ClientCommentNotifications: ClientCommentNotifications with scala.Double = js.native
  /* 9600 */ val ClientConcurrentSessionsBase: ClientConcurrentSessionsBase with scala.Double = js.native
  /* 710 */ val ClientConnectionStats: ClientConnectionStats with scala.Double = js.native
  /* 731 */ val ClientContentServerLogOn_Deprecated: ClientContentServerLogOn_Deprecated with scala.Double = js.native
  /* 5406 */ val ClientCreateAccount2: ClientCreateAccount2 with scala.Double = js.native
  /* 5462 */ val ClientCreateAccount3: ClientCreateAccount3 with scala.Double = js.native
  /* 5590 */ val ClientCreateAccountProto: ClientCreateAccountProto with scala.Double = js.native
  /* 5591 */ val ClientCreateAccountProtoResponse: ClientCreateAccountProtoResponse with scala.Double = js.native
  /* 5403 */ val ClientCreateAccountResponse: ClientCreateAccountResponse with scala.Double = js.native
  /* 761 */ val ClientCreateAcctResponse: ClientCreateAcctResponse with scala.Double = js.native
  /* 809 */ val ClientCreateChat: ClientCreateChat with scala.Double = js.native
  /* 810 */ val ClientCreateChatResponse: ClientCreateChatResponse with scala.Double = js.native
  /* 5597 */ val ClientCurrentUIMode: ClientCurrentUIMode with scala.Double = js.native
  /* 5605 */ val ClientDFSAuthenticateRequest: ClientDFSAuthenticateRequest with scala.Double = js.native
  /* 5606 */ val ClientDFSAuthenticateResponse: ClientDFSAuthenticateResponse with scala.Double = js.native
  /* 5617 */ val ClientDFSDownloadStatus: ClientDFSDownloadStatus with scala.Double = js.native
  /* 5607 */ val ClientDFSEndSession: ClientDFSEndSession with scala.Double = js.native
  /* 1620 */ val ClientDPCheckSpecialSurvey: ClientDPCheckSpecialSurvey with scala.Double = js.native
  /* 1621 */ val ClientDPCheckSpecialSurveyResponse: ClientDPCheckSpecialSurveyResponse with scala.Double = js.native
  /* 1630 */ val ClientDPContentStatsReport: ClientDPContentStatsReport with scala.Double = js.native
  /* 1622 */ val ClientDPSendSpecialSurveyResponse: ClientDPSendSpecialSurveyResponse with scala.Double = js.native
  /* 1623 */ val ClientDPSendSpecialSurveyResponseReply: ClientDPSendSpecialSurveyResponseReply with scala.Double = js.native
  /* 1627 */ val ClientDPSteam2AppStarted: ClientDPSteam2AppStarted with scala.Double = js.native
  /* 1625 */ val ClientDPUpdateAppJobReport: ClientDPUpdateAppJobReport with scala.Double = js.native
  /* 896 */ val ClientDRMBlobRequest: ClientDRMBlobRequest with scala.Double = js.native
  /* 897 */ val ClientDRMBlobResponse: ClientDRMBlobResponse with scala.Double = js.native
  /* 5485 */ val ClientDRMDownloadRequest: ClientDRMDownloadRequest with scala.Double = js.native
  /* 5574 */ val ClientDRMDownloadRequestWithCrashData: ClientDRMDownloadRequestWithCrashData with scala.Double = js.native
  /* 5486 */ val ClientDRMDownloadResponse: ClientDRMDownloadResponse with scala.Double = js.native
  /* 5487 */ val ClientDRMFinalResult: ClientDRMFinalResult with scala.Double = js.native
  /* 851 */ val ClientDRMProblemReport: ClientDRMProblemReport with scala.Double = js.native
  /* 5495 */ val ClientDRMTest: ClientDRMTest with scala.Double = js.native
  /* 5496 */ val ClientDRMTestResult: ClientDRMTestResult with scala.Double = js.native
  /* 6504 */ val ClientDeauthorizeDevice: ClientDeauthorizeDevice with scala.Double = js.native
  /* 6503 */ val ClientDeauthorizeDeviceRequest: ClientDeauthorizeDeviceRequest with scala.Double = js.native
  /* 5511 */ val ClientDeregisterWithServer: ClientDeregisterWithServer with scala.Double = js.native
  /* 5445 */ val ClientDisableTestLicense: ClientDisableTestLicense with scala.Double = js.native
  /* 5446 */ val ClientDisableTestLicenseResponse: ClientDisableTestLicenseResponse with scala.Double = js.native
  /* 5548 */ val ClientDownloadRateStatistics: ClientDownloadRateStatistics with scala.Double = js.native
  /* 5456 */ val ClientEmailAddrInfo: ClientEmailAddrInfo with scala.Double = js.native
  /* 5458 */ val ClientEmailChange3: ClientEmailChange3 with scala.Double = js.native
  /* 5544 */ val ClientEmailChange4: ClientEmailChange4 with scala.Double = js.native
  /* 891 */ val ClientEmailChangeResponse: ClientEmailChangeResponse with scala.Double = js.native
  /* 5545 */ val ClientEmailChangeResponse4: ClientEmailChangeResponse4 with scala.Double = js.native
  /* 9331 */ val ClientEmoticonList: ClientEmoticonList with scala.Double = js.native
  /* 5443 */ val ClientEnableTestLicense: ClientEnableTestLicense with scala.Double = js.native
  /* 5444 */ val ClientEnableTestLicenseResponse: ClientEnableTestLicenseResponse with scala.Double = js.native
  /* 784 */ val ClientEncryptPct: ClientEncryptPct with scala.Double = js.native
  /* 7519 */ val ClientFSEnumerateFollowingList: ClientFSEnumerateFollowingList with scala.Double = js.native
  /* 7520 */ val ClientFSEnumerateFollowingListResponse: ClientFSEnumerateFollowingListResponse with scala.Double = js.native
  /* 7515 */ val ClientFSGetFollowerCount: ClientFSGetFollowerCount with scala.Double = js.native
  /* 7516 */ val ClientFSGetFollowerCountResponse: ClientFSGetFollowerCountResponse with scala.Double = js.native
  /* 7525 */ val ClientFSGetFriendMessageHistory: ClientFSGetFriendMessageHistory with scala.Double = js.native
  /* 7527 */ val ClientFSGetFriendMessageHistoryForOfflineMessages: ClientFSGetFriendMessageHistoryForOfflineMessages with scala.Double = js.native
  /* 7526 */ val ClientFSGetFriendMessageHistoryResponse: ClientFSGetFriendMessageHistoryResponse with scala.Double = js.native
  /* 7528 */ val ClientFSGetFriendsSteamLevels: ClientFSGetFriendsSteamLevels with scala.Double = js.native
  /* 7529 */ val ClientFSGetFriendsSteamLevelsResponse: ClientFSGetFriendsSteamLevelsResponse with scala.Double = js.native
  /* 7517 */ val ClientFSGetIsFollowing: ClientFSGetIsFollowing with scala.Double = js.native
  /* 7518 */ val ClientFSGetIsFollowingResponse: ClientFSGetIsFollowingResponse with scala.Double = js.native
  /* 7523 */ val ClientFSOfflineMessageNotification: ClientFSOfflineMessageNotification with scala.Double = js.native
  /* 7524 */ val ClientFSRequestOfflineMessageCount: ClientFSRequestOfflineMessageCount with scala.Double = js.native
  /* 786 */ val ClientFavoritesList: ClientFavoritesList with scala.Double = js.native
  /* 5412 */ val ClientFileToDownload: ClientFileToDownload with scala.Double = js.native
  /* 5413 */ val ClientFileToDownloadResponse: ClientFileToDownloadResponse with scala.Double = js.native
  /* 718 */ val ClientFriendMsg: ClientFriendMsg with scala.Double = js.native
  /* 5578 */ val ClientFriendMsgEchoToSender: ClientFriendMsgEchoToSender with scala.Double = js.native
  /* 5427 */ val ClientFriendMsgIncoming: ClientFriendMsgIncoming with scala.Double = js.native
  /* 5535 */ val ClientFriendProfileInfo: ClientFriendProfileInfo with scala.Double = js.native
  /* 5536 */ val ClientFriendProfileInfoResponse: ClientFriendProfileInfoResponse with scala.Double = js.native
  /* 808 */ val ClientFriendRemovedFromSource: ClientFriendRemovedFromSource with scala.Double = js.native
  /* 5596 */ val ClientFriendUserStatusPublished: ClientFriendUserStatusPublished with scala.Double = js.native
  /* 5553 */ val ClientFriendsGroupsList: ClientFriendsGroupsList with scala.Double = js.native
  /* 767 */ val ClientFriendsList: ClientFriendsList with scala.Double = js.native
  /* 5453 */ val ClientFromGC: ClientFromGC with scala.Double = js.native
  /* 5503 */ val ClientGCMsgFailed: ClientGCMsgFailed with scala.Double = js.native
  /* 6403 */ val ClientGMSServerQuery: ClientGMSServerQuery with scala.Double = js.native
  /* 773 */ val ClientGameConnectDeny: ClientGameConnectDeny with scala.Double = js.native
  /* 779 */ val ClientGameConnectTokens: ClientGameConnectTokens with scala.Double = js.native
  /* 719 */ val ClientGameConnect_obsolete: ClientGameConnect_obsolete with scala.Double = js.native
  /* 721 */ val ClientGameEnded_obsolete: ClientGameEnded_obsolete with scala.Double = js.native
  /* 742 */ val ClientGamesPlayed: ClientGamesPlayed with scala.Double = js.native
  /* 720 */ val ClientGamesPlayed2_obsolete: ClientGamesPlayed2_obsolete with scala.Double = js.native
  /* 738 */ val ClientGamesPlayed3_obsolete: ClientGamesPlayed3_obsolete with scala.Double = js.native
  /* 715 */ val ClientGamesPlayedNoDataBlob: ClientGamesPlayedNoDataBlob with scala.Double = js.native
  /* 5410 */ val ClientGamesPlayedWithDataBlob: ClientGamesPlayedWithDataBlob with scala.Double = js.native
  /* 705 */ val ClientGamesPlayed_obsolete: ClientGamesPlayed_obsolete with scala.Double = js.native
  /* 5441 */ val ClientGetAppBetaPasswords: ClientGetAppBetaPasswords with scala.Double = js.native
  /* 5442 */ val ClientGetAppBetaPasswordsResponse: ClientGetAppBetaPasswordsResponse with scala.Double = js.native
  /* 857 */ val ClientGetAppOwnershipTicket: ClientGetAppOwnershipTicket with scala.Double = js.native
  /* 858 */ val ClientGetAppOwnershipTicketResponse: ClientGetAppOwnershipTicketResponse with scala.Double = js.native
  /* 6506 */ val ClientGetAuthorizedDevices: ClientGetAuthorizedDevices with scala.Double = js.native
  /* 6507 */ val ClientGetAuthorizedDevicesResponse: ClientGetAuthorizedDevicesResponse with scala.Double = js.native
  /* 5546 */ val ClientGetCDNAuthToken: ClientGetCDNAuthToken with scala.Double = js.native
  /* 5547 */ val ClientGetCDNAuthTokenResponse: ClientGetCDNAuthTokenResponse with scala.Double = js.native
  /* 5554 */ val ClientGetClanActivityCounts: ClientGetClanActivityCounts with scala.Double = js.native
  /* 5555 */ val ClientGetClanActivityCountsResponse: ClientGetClanActivityCountsResponse with scala.Double = js.native
  /* 5518 */ val ClientGetClientAppList: ClientGetClientAppList with scala.Double = js.native
  /* 5519 */ val ClientGetClientAppListResponse: ClientGetClientAppListResponse with scala.Double = js.native
  /* 5515 */ val ClientGetClientDetails: ClientGetClientDetails with scala.Double = js.native
  /* 5516 */ val ClientGetClientDetailsResponse: ClientGetClientDetailsResponse with scala.Double = js.native
  /* 5438 */ val ClientGetDepotDecryptionKey: ClientGetDepotDecryptionKey with scala.Double = js.native
  /* 5439 */ val ClientGetDepotDecryptionKeyResponse: ClientGetDepotDecryptionKeyResponse with scala.Double = js.native
  /* 9330 */ val ClientGetEmoticonList: ClientGetEmoticonList with scala.Double = js.native
  /* 722 */ val ClientGetFinalPrice: ClientGetFinalPrice with scala.Double = js.native
  /* 775 */ val ClientGetFinalPriceResponse: ClientGetFinalPriceResponse with scala.Double = js.native
  /* 5488 */ val ClientGetFriendsWhoPlayGame: ClientGetFriendsWhoPlayGame with scala.Double = js.native
  /* 5489 */ val ClientGetFriendsWhoPlayGameResponse: ClientGetFriendsWhoPlayGameResponse with scala.Double = js.native
  /* 748 */ val ClientGetGiftTargetList: ClientGetGiftTargetList with scala.Double = js.native
  /* 749 */ val ClientGetGiftTargetListResponse: ClientGetGiftTargetListResponse with scala.Double = js.native
  /* 730 */ val ClientGetLegacyGameKey: ClientGetLegacyGameKey with scala.Double = js.native
  /* 785 */ val ClientGetLegacyGameKeyResponse: ClientGetLegacyGameKeyResponse with scala.Double = js.native
  /* 728 */ val ClientGetLicenses: ClientGetLicenses with scala.Double = js.native
  /* 860 */ val ClientGetLobbyListResponse: ClientGetLobbyListResponse with scala.Double = js.native
  /* 861 */ val ClientGetLobbyMetadata: ClientGetLobbyMetadata with scala.Double = js.native
  /* 862 */ val ClientGetLobbyMetadataResponse: ClientGetLobbyMetadataResponse with scala.Double = js.native
  /* 5508 */ val ClientGetMicroTxnInfo: ClientGetMicroTxnInfo with scala.Double = js.native
  /* 5509 */ val ClientGetMicroTxnInfoResponse: ClientGetMicroTxnInfoResponse with scala.Double = js.native
  /* 5436 */ val ClientGetNumberOfCurrentPlayers: ClientGetNumberOfCurrentPlayers with scala.Double = js.native
  /* 5592 */ val ClientGetNumberOfCurrentPlayersDP: ClientGetNumberOfCurrentPlayersDP with scala.Double = js.native
  /* 5593 */ val ClientGetNumberOfCurrentPlayersDPResponse: ClientGetNumberOfCurrentPlayersDPResponse with scala.Double = js.native
  /* 5437 */ val ClientGetNumberOfCurrentPlayersResponse: ClientGetNumberOfCurrentPlayersResponse with scala.Double = js.native
  /* 736 */ val ClientGetPurchaseReceipts: ClientGetPurchaseReceipts with scala.Double = js.native
  /* 818 */ val ClientGetUserStats: ClientGetUserStats with scala.Double = js.native
  /* 819 */ val ClientGetUserStatsResponse: ClientGetUserStatsResponse with scala.Double = js.native
  /* 703 */ val ClientHeartBeat: ClientHeartBeat with scala.Double = js.native
  /* 5552 */ val ClientHideFriend: ClientHideFriend with scala.Double = js.native
  /* 708 */ val ClientInformOfCreateAccount: ClientInformOfCreateAccount with scala.Double = js.native
  /* 5407 */ val ClientInformOfResetForgottenPassword: ClientInformOfResetForgottenPassword with scala.Double = js.native
  /* 5408 */ val ClientInformOfResetForgottenPasswordResponse: ClientInformOfResetForgottenPasswordResponse with scala.Double = js.native
  /* 711 */ val ClientInitPurchase: ClientInitPurchase with scala.Double = js.native
  /* 789 */ val ClientInitPurchaseResponse: ClientInitPurchaseResponse with scala.Double = js.native
  /* 5520 */ val ClientInstallClientApp: ClientInstallClientApp with scala.Double = js.native
  /* 5521 */ val ClientInstallClientAppResponse: ClientInstallClientAppResponse with scala.Double = js.native
  /* 793 */ val ClientInviteFriend: ClientInviteFriend with scala.Double = js.native
  /* 794 */ val ClientInviteFriendResponse: ClientInviteFriendResponse with scala.Double = js.native
  /* 744 */ val ClientInviteUserToClan: ClientInviteUserToClan with scala.Double = js.native
  /* 5430 */ val ClientIsLimitedAccount: ClientIsLimitedAccount with scala.Double = js.native
  /* 5576 */ val ClientItemAnnouncements: ClientItemAnnouncements with scala.Double = js.native
  /* 801 */ val ClientJoinChat: ClientJoinChat with scala.Double = js.native
  /* 9601 */ val ClientKickPlayingSession: ClientKickPlayingSession with scala.Double = js.native
  /* 5416 */ val ClientLBSFindOrCreateLB: ClientLBSFindOrCreateLB with scala.Double = js.native
  /* 5417 */ val ClientLBSFindOrCreateLBResponse: ClientLBSFindOrCreateLBResponse with scala.Double = js.native
  /* 5418 */ val ClientLBSGetLBEntries: ClientLBSGetLBEntries with scala.Double = js.native
  /* 5419 */ val ClientLBSGetLBEntriesResponse: ClientLBSGetLBEntriesResponse with scala.Double = js.native
  /* 5414 */ val ClientLBSSetScore: ClientLBSSetScore with scala.Double = js.native
  /* 5415 */ val ClientLBSSetScoreResponse: ClientLBSSetScoreResponse with scala.Double = js.native
  /* 5529 */ val ClientLBSSetUGC: ClientLBSSetUGC with scala.Double = js.native
  /* 5530 */ val ClientLBSSetUGCResponse: ClientLBSSetUGCResponse with scala.Double = js.native
  /* 780 */ val ClientLicenseList: ClientLicenseList with scala.Double = js.native
  /* 706 */ val ClientLogOff: ClientLogOff with scala.Double = js.native
  /* 751 */ val ClientLogOnResponse: ClientLogOnResponse with scala.Double = js.native
  /* 803 */ val ClientLogOnWithCredentials_Deprecated: ClientLogOnWithCredentials_Deprecated with scala.Double = js.native
  /* 5465 */ val ClientLogOnWithHash_Deprecated: ClientLogOnWithHash_Deprecated with scala.Double = js.native
  /* 701 */ val ClientLogOn_Deprecated: ClientLogOn_Deprecated with scala.Double = js.native
  /* 757 */ val ClientLoggedOff: ClientLoggedOff with scala.Double = js.native
  /* 5514 */ val ClientLogon: ClientLogon with scala.Double = js.native
  /* 5559 */ val ClientLogonGameServer: ClientLogonGameServer with scala.Double = js.native
  /* 898 */ val ClientLookupKey: ClientLookupKey with scala.Double = js.native
  /* 899 */ val ClientLookupKeyResponse: ClientLookupKeyResponse with scala.Double = js.native
  /* 5818 */ val ClientMDSGetDepotManifest: ClientMDSGetDepotManifest with scala.Double = js.native
  /* 5820 */ val ClientMDSGetDepotManifestChunk: ClientMDSGetDepotManifestChunk with scala.Double = js.native
  /* 5819 */ val ClientMDSGetDepotManifestResponse: ClientMDSGetDepotManifestResponse with scala.Double = js.native
  /* 5842 */ val ClientMDSGetPrevDepotBuild: ClientMDSGetPrevDepotBuild with scala.Double = js.native
  /* 5843 */ val ClientMDSGetPrevDepotBuildResponse: ClientMDSGetPrevDepotBuildResponse with scala.Double = js.native
  /* 5806 */ val ClientMDSHeartbeat: ClientMDSHeartbeat with scala.Double = js.native
  /* 5809 */ val ClientMDSInitDepotBuildRequest: ClientMDSInitDepotBuildRequest with scala.Double = js.native
  /* 5810 */ val ClientMDSInitDepotBuildResponse: ClientMDSInitDepotBuildResponse with scala.Double = js.native
  /* 5816 */ val ClientMDSInitWorkshopBuildRequest: ClientMDSInitWorkshopBuildRequest with scala.Double = js.native
  /* 5817 */ val ClientMDSInitWorkshopBuildResponse: ClientMDSInitWorkshopBuildResponse with scala.Double = js.native
  /* 5801 */ val ClientMDSLoginRequest: ClientMDSLoginRequest with scala.Double = js.native
  /* 5802 */ val ClientMDSLoginResponse: ClientMDSLoginResponse with scala.Double = js.native
  /* 5838 */ val ClientMDSRegisterAppBuild: ClientMDSRegisterAppBuild with scala.Double = js.native
  /* 5839 */ val ClientMDSRegisterAppBuildResponse: ClientMDSRegisterAppBuildResponse with scala.Double = js.native
  /* 5840 */ val ClientMDSSetAppBuildLive: ClientMDSSetAppBuildLive with scala.Double = js.native
  /* 5841 */ val ClientMDSSetAppBuildLiveResponse: ClientMDSSetAppBuildLiveResponse with scala.Double = js.native
  /* 5845 */ val ClientMDSSignInstallScript: ClientMDSSignInstallScript with scala.Double = js.native
  /* 5846 */ val ClientMDSSignInstallScriptResponse: ClientMDSSignInstallScriptResponse with scala.Double = js.native
  /* 5805 */ val ClientMDSTransmitManifestDataChunk: ClientMDSTransmitManifestDataChunk with scala.Double = js.native
  /* 5807 */ val ClientMDSUploadDepotChunks: ClientMDSUploadDepotChunks with scala.Double = js.native
  /* 5808 */ val ClientMDSUploadDepotChunksResponse: ClientMDSUploadDepotChunksResponse with scala.Double = js.native
  /* 5803 */ val ClientMDSUploadManifestRequest: ClientMDSUploadManifestRequest with scala.Double = js.native
  /* 5804 */ val ClientMDSUploadManifestResponse: ClientMDSUploadManifestResponse with scala.Double = js.native
  /* 5823 */ val ClientMDSUploadRateTest: ClientMDSUploadRateTest with scala.Double = js.native
  /* 5824 */ val ClientMDSUploadRateTestResponse: ClientMDSUploadRateTestResponse with scala.Double = js.native
  /* 6601 */ val ClientMMSCreateLobby: ClientMMSCreateLobby with scala.Double = js.native
  /* 6602 */ val ClientMMSCreateLobbyResponse: ClientMMSCreateLobbyResponse with scala.Double = js.native
  /* 6622 */ val ClientMMSFlushFrenemyListCache: ClientMMSFlushFrenemyListCache with scala.Double = js.native
  /* 6623 */ val ClientMMSFlushFrenemyListCacheResponse: ClientMMSFlushFrenemyListCacheResponse with scala.Double = js.native
  /* 6611 */ val ClientMMSGetLobbyData: ClientMMSGetLobbyData with scala.Double = js.native
  /* 6607 */ val ClientMMSGetLobbyList: ClientMMSGetLobbyList with scala.Double = js.native
  /* 6608 */ val ClientMMSGetLobbyListResponse: ClientMMSGetLobbyListResponse with scala.Double = js.native
  /* 6621 */ val ClientMMSInviteToLobby: ClientMMSInviteToLobby with scala.Double = js.native
  /* 6603 */ val ClientMMSJoinLobby: ClientMMSJoinLobby with scala.Double = js.native
  /* 6604 */ val ClientMMSJoinLobbyResponse: ClientMMSJoinLobbyResponse with scala.Double = js.native
  /* 6605 */ val ClientMMSLeaveLobby: ClientMMSLeaveLobby with scala.Double = js.native
  /* 6606 */ val ClientMMSLeaveLobbyResponse: ClientMMSLeaveLobbyResponse with scala.Double = js.native
  /* 6614 */ val ClientMMSLobbyChatMsg: ClientMMSLobbyChatMsg with scala.Double = js.native
  /* 6612 */ val ClientMMSLobbyData: ClientMMSLobbyData with scala.Double = js.native
  /* 6618 */ val ClientMMSLobbyGameServerSet: ClientMMSLobbyGameServerSet with scala.Double = js.native
  /* 6613 */ val ClientMMSSendLobbyChatMsg: ClientMMSSendLobbyChatMsg with scala.Double = js.native
  /* 6609 */ val ClientMMSSetLobbyData: ClientMMSSetLobbyData with scala.Double = js.native
  /* 6610 */ val ClientMMSSetLobbyDataResponse: ClientMMSSetLobbyDataResponse with scala.Double = js.native
  /* 6617 */ val ClientMMSSetLobbyGameServer: ClientMMSSetLobbyGameServer with scala.Double = js.native
  /* 6624 */ val ClientMMSSetLobbyLinked: ClientMMSSetLobbyLinked with scala.Double = js.native
  /* 6615 */ val ClientMMSSetLobbyOwner: ClientMMSSetLobbyOwner with scala.Double = js.native
  /* 6616 */ val ClientMMSSetLobbyOwnerResponse: ClientMMSSetLobbyOwnerResponse with scala.Double = js.native
  /* 6619 */ val ClientMMSUserJoinedLobby: ClientMMSUserJoinedLobby with scala.Double = js.native
  /* 6620 */ val ClientMMSUserLeftLobby: ClientMMSUserLeftLobby with scala.Double = js.native
  /* 5420 */ val ClientMarketingMessageUpdate: ClientMarketingMessageUpdate with scala.Double = js.native
  /* 5510 */ val ClientMarketingMessageUpdate2: ClientMarketingMessageUpdate2 with scala.Double = js.native
  /* 5504 */ val ClientMicroTxnAuthRequest: ClientMicroTxnAuthRequest with scala.Double = js.native
  /* 5505 */ val ClientMicroTxnAuthorize: ClientMicroTxnAuthorize with scala.Double = js.native
  /* 5506 */ val ClientMicroTxnAuthorizeResponse: ClientMicroTxnAuthorizeResponse with scala.Double = js.native
  /* 765 */ val ClientNOP: ClientNOP with scala.Double = js.native
  /* 839 */ val ClientNatTraversalStatEvent: ClientNatTraversalStatEvent with scala.Double = js.native
  /* 5463 */ val ClientNewLoginKey: ClientNewLoginKey with scala.Double = js.native
  /* 5464 */ val ClientNewLoginKeyAccepted: ClientNewLoginKeyAccepted with scala.Double = js.native
  /* 771 */ val ClientNewsUpdate: ClientNewsUpdate with scala.Double = js.native
  /* 707 */ val ClientNoUDPConnectivity: ClientNoUDPConnectivity with scala.Double = js.native
  /* 756 */ val ClientNotLoggedOnDeprecated: ClientNotLoggedOnDeprecated with scala.Double = js.native
  /* 5490 */ val ClientOGSBeginSession: ClientOGSBeginSession with scala.Double = js.native
  /* 5491 */ val ClientOGSBeginSessionResponse: ClientOGSBeginSessionResponse with scala.Double = js.native
  /* 5492 */ val ClientOGSEndSession: ClientOGSEndSession with scala.Double = js.native
  /* 5493 */ val ClientOGSEndSessionResponse: ClientOGSEndSessionResponse with scala.Double = js.native
  /* 5581 */ val ClientOGSGameServerPingSample: ClientOGSGameServerPingSample with scala.Double = js.native
  /* 5557 */ val ClientOGSReportBug: ClientOGSReportBug with scala.Double = js.native
  /* 5556 */ val ClientOGSReportString: ClientOGSReportString with scala.Double = js.native
  /* 5494 */ val ClientOGSWriteRow: ClientOGSWriteRow with scala.Double = js.native
  /* 5435 */ val ClientP2PConnectionFailInfo: ClientP2PConnectionFailInfo with scala.Double = js.native
  /* 5434 */ val ClientP2PConnectionInfo: ClientP2PConnectionInfo with scala.Double = js.native
  /* 813 */ val ClientP2PIntroducerMessage: ClientP2PIntroducerMessage with scala.Double = js.native
  /* 8905 */ val ClientPICSAccessTokenRequest: ClientPICSAccessTokenRequest with scala.Double = js.native
  /* 8906 */ val ClientPICSAccessTokenResponse: ClientPICSAccessTokenResponse with scala.Double = js.native
  /* 8901 */ val ClientPICSChangesSinceRequest: ClientPICSChangesSinceRequest with scala.Double = js.native
  /* 8902 */ val ClientPICSChangesSinceResponse: ClientPICSChangesSinceResponse with scala.Double = js.native
  /* 8903 */ val ClientPICSProductInfoRequest: ClientPICSProductInfoRequest with scala.Double = js.native
  /* 8904 */ val ClientPICSProductInfoResponse: ClientPICSProductInfoResponse with scala.Double = js.native
  /* 833 */ val ClientPackageInfoRequest: ClientPackageInfoRequest with scala.Double = js.native
  /* 834 */ val ClientPackageInfoResponse: ClientPackageInfoResponse with scala.Double = js.native
  /* 148 */ val ClientPackageVersions: ClientPackageVersions with scala.Double = js.native
  /* 5457 */ val ClientPasswordChange3: ClientPasswordChange3 with scala.Double = js.native
  /* 805 */ val ClientPasswordChangeResponse: ClientPasswordChangeResponse with scala.Double = js.native
  /* 5584 */ val ClientPersonaChangeResponse: ClientPersonaChangeResponse with scala.Double = js.native
  /* 766 */ val ClientPersonaState: ClientPersonaState with scala.Double = js.native
  /* 5459 */ val ClientPersonalQAChange3: ClientPersonalQAChange3 with scala.Double = js.native
  /* 764 */ val ClientPing: ClientPing with scala.Double = js.native
  /* 712 */ val ClientPingResponse: ClientPingResponse with scala.Double = js.native
  /* 5587 */ val ClientPlayerNicknameList: ClientPlayerNicknameList with scala.Double = js.native
  /* 9600 */ val ClientPlayingSessionState: ClientPlayingSessionState with scala.Double = js.native
  /* 763 */ val ClientPurchaseResponse: ClientPurchaseResponse with scala.Double = js.native
  /* 746 */ val ClientPurchaseWithMachineID: ClientPurchaseWithMachineID with scala.Double = js.native
  /* 5539 */ val ClientReadMachineAuth: ClientReadMachineAuth with scala.Double = js.native
  /* 5540 */ val ClientReadMachineAuthResponse: ClientReadMachineAuthResponse with scala.Double = js.native
  /* 741 */ val ClientRedeemGuestPass: ClientRedeemGuestPass with scala.Double = js.native
  /* 797 */ val ClientRedeemGuestPassResponse: ClientRedeemGuestPassResponse with scala.Double = js.native
  /* 5502 */ val ClientRegisterAuthTicketWithCM: ClientRegisterAuthTicketWithCM with scala.Double = js.native
  /* 743 */ val ClientRegisterKey: ClientRegisterKey with scala.Double = js.native
  /* 5469 */ val ClientRegisterOEMMachine: ClientRegisterOEMMachine with scala.Double = js.native
  /* 5470 */ val ClientRegisterOEMMachineResponse: ClientRegisterOEMMachineResponse with scala.Double = js.native
  /* 714 */ val ClientRemoveFriend: ClientRemoveFriend with scala.Double = js.native
  /* 5517 */ val ClientReportOverlayDetourFailure: ClientReportOverlayDetourFailure with scala.Double = js.native
  /* 5549 */ val ClientRequestAccountData: ClientRequestAccountData with scala.Double = js.native
  /* 5550 */ val ClientRequestAccountDataResponse: ClientRequestAccountDataResponse with scala.Double = js.native
  /* 5431 */ val ClientRequestAuthList: ClientRequestAuthList with scala.Double = js.native
  /* 5454 */ val ClientRequestChangeMail: ClientRequestChangeMail with scala.Double = js.native
  /* 5455 */ val ClientRequestChangeMailResponse: ClientRequestChangeMailResponse with scala.Double = js.native
  /* 5583 */ val ClientRequestCommentNotifications: ClientRequestCommentNotifications with scala.Double = js.native
  /* 5526 */ val ClientRequestEncryptedAppTicket: ClientRequestEncryptedAppTicket with scala.Double = js.native
  /* 5527 */ val ClientRequestEncryptedAppTicketResponse: ClientRequestEncryptedAppTicketResponse with scala.Double = js.native
  /* 5401 */ val ClientRequestForgottenPasswordEmail: ClientRequestForgottenPasswordEmail with scala.Double = js.native
  /* 5461 */ val ClientRequestForgottenPasswordEmail3: ClientRequestForgottenPasswordEmail3 with scala.Double = js.native
  /* 5402 */ val ClientRequestForgottenPasswordEmailResponse: ClientRequestForgottenPasswordEmailResponse with scala.Double = js.native
  /* 5572 */ val ClientRequestFreeLicense: ClientRequestFreeLicense with scala.Double = js.native
  /* 5573 */ val ClientRequestFreeLicenseResponse: ClientRequestFreeLicenseResponse with scala.Double = js.native
  /* 815 */ val ClientRequestFriendData: ClientRequestFriendData with scala.Double = js.native
  /* 554 */ val ClientRequestFriendship: ClientRequestFriendship with scala.Double = js.native
  /* 5577 */ val ClientRequestItemAnnouncements: ClientRequestItemAnnouncements with scala.Double = js.native
  /* 5541 */ val ClientRequestMachineAuth: ClientRequestMachineAuth with scala.Double = js.native
  /* 5542 */ val ClientRequestMachineAuthResponse: ClientRequestMachineAuthResponse with scala.Double = js.native
  /* 5590 */ val ClientRequestOAuthTokenForApp: ClientRequestOAuthTokenForApp with scala.Double = js.native
  /* 5591 */ val ClientRequestOAuthTokenForAppResponse: ClientRequestOAuthTokenForAppResponse with scala.Double = js.native
  /* 5448 */ val ClientRequestValidationMail: ClientRequestValidationMail with scala.Double = js.native
  /* 5449 */ val ClientRequestValidationMailResponse: ClientRequestValidationMailResponse with scala.Double = js.native
  /* 5585 */ val ClientRequestWebAPIAuthenticateUserNonce: ClientRequestWebAPIAuthenticateUserNonce with scala.Double = js.native
  /* 5586 */ val ClientRequestWebAPIAuthenticateUserNonceResponse: ClientRequestWebAPIAuthenticateUserNonceResponse with scala.Double = js.native
  /* 5480 */ val ClientRequestedClientStats: ClientRequestedClientStats with scala.Double = js.native
  /* 5404 */ val ClientResetForgottenPassword: ClientResetForgottenPassword with scala.Double = js.native
  /* 5460 */ val ClientResetForgottenPassword3: ClientResetForgottenPassword3 with scala.Double = js.native
  /* 5551 */ val ClientResetForgottenPassword4: ClientResetForgottenPassword4 with scala.Double = js.native
  /* 5405 */ val ClientResetForgottenPasswordResponse: ClientResetForgottenPasswordResponse with scala.Double = js.native
  /* 846 */ val ClientResetPassword: ClientResetPassword with scala.Double = js.native
  /* 849 */ val ClientResetPasswordResponse: ClientResetPasswordResponse with scala.Double = js.native
  /* 7503 */ val ClientRichPresenceInfo: ClientRichPresenceInfo with scala.Double = js.native
  /* 7502 */ val ClientRichPresenceRequest: ClientRichPresenceRequest with scala.Double = js.native
  /* 7501 */ val ClientRichPresenceUpload: ClientRichPresenceUpload with scala.Double = js.native
  /* 5543 */ val ClientScreenshotsChanged: ClientScreenshotsChanged with scala.Double = js.native
  /* 892 */ val ClientSecretQAChangeResponse: ClientSecretQAChangeResponse with scala.Double = js.native
  /* 739 */ val ClientSendGuestPass: ClientSendGuestPass with scala.Double = js.native
  /* 795 */ val ClientSendGuestPassResponse: ClientSendGuestPassResponse with scala.Double = js.native
  /* 5558 */ val ClientSentLogs: ClientSentLogs with scala.Double = js.native
  /* 880 */ val ClientServerList: ClientServerList with scala.Double = js.native
  /* 5500 */ val ClientServerUnavailable: ClientServerUnavailable with scala.Double = js.native
  /* 5501 */ val ClientServersAvailable: ClientServersAvailable with scala.Double = js.native
  /* 831 */ val ClientServiceCall: ClientServiceCall with scala.Double = js.native
  /* 832 */ val ClientServiceCallResponse: ClientServiceCallResponse with scala.Double = js.native
  /* 5594 */ val ClientServiceMethod: ClientServiceMethod with scala.Double = js.native
  /* 5595 */ val ClientServiceMethodResponse: ClientServiceMethodResponse with scala.Double = js.native
  /* 830 */ val ClientServiceModule: ClientServiceModule with scala.Double = js.native
  /* 136 */ val ClientSessionEnd: ClientSessionEnd with scala.Double = js.native
  /* 135 */ val ClientSessionStart: ClientSessionStart with scala.Double = js.native
  /* 850 */ val ClientSessionToken: ClientSessionToken with scala.Double = js.native
  /* 137 */ val ClientSessionUpdate: ClientSessionUpdate with scala.Double = js.native
  /* 137 */ val ClientSessionUpdateAuthTicket: ClientSessionUpdateAuthTicket with scala.Double = js.native
  /* 5524 */ val ClientSetClientAppUpdateState: ClientSetClientAppUpdateState with scala.Double = js.native
  /* 5525 */ val ClientSetClientAppUpdateStateResponse: ClientSetClientAppUpdateStateResponse with scala.Double = js.native
  /* 755 */ val ClientSetHeartbeatRate: ClientSetHeartbeatRate with scala.Double = js.native
  /* 855 */ val ClientSetIgnoreFriend: ClientSetIgnoreFriend with scala.Double = js.native
  /* 856 */ val ClientSetIgnoreFriendResponse: ClientSetIgnoreFriendResponse with scala.Double = js.native
  /* 9400 */ val ClientSharedLibraryBase: ClientSharedLibraryBase with scala.Double = js.native
  /* 9405 */ val ClientSharedLibraryLockStatus: ClientSharedLibraryLockStatus with scala.Double = js.native
  /* 9406 */ val ClientSharedLibraryStopPlaying: ClientSharedLibraryStopPlaying with scala.Double = js.native
  /* 9403 */ val ClientSharedLicensesLockStatus: ClientSharedLicensesLockStatus with scala.Double = js.native
  /* 9404 */ val ClientSharedLicensesStopPlaying: ClientSharedLicensesStopPlaying with scala.Double = js.native
  /* 5433 */ val ClientStat: ClientStat with scala.Double = js.native
  /* 5482 */ val ClientStat2: ClientStat2 with scala.Double = js.native
  /* 5481 */ val ClientStat2Int32: ClientStat2Int32 with scala.Double = js.native
  /* 5467 */ val ClientStatsUpdated: ClientStatsUpdated with scala.Double = js.native
  /* 842 */ val ClientSteamUsageEvent: ClientSteamUsageEvent with scala.Double = js.native
  /* 820 */ val ClientStoreUserStats: ClientStoreUserStats with scala.Double = js.native
  /* 5466 */ val ClientStoreUserStats2: ClientStoreUserStats2 with scala.Double = js.native
  /* 821 */ val ClientStoreUserStatsResponse: ClientStoreUserStatsResponse with scala.Double = js.native
  /* 5512 */ val ClientSubscribeToPersonaFeed: ClientSubscribeToPersonaFeed with scala.Double = js.native
  /* 726 */ val ClientSystemIM: ClientSystemIM with scala.Double = js.native
  /* 727 */ val ClientSystemIMAck: ClientSystemIMAck with scala.Double = js.native
  /* 5429 */ val ClientTicketAuthComplete: ClientTicketAuthComplete with scala.Double = js.native
  /* 5452 */ val ClientToGC: ClientToGC with scala.Double = js.native
  /* 7301 */ val ClientUCMAddScreenshot: ClientUCMAddScreenshot with scala.Double = js.native
  /* 7302 */ val ClientUCMAddScreenshotResponse: ClientUCMAddScreenshotResponse with scala.Double = js.native
  /* 7315 */ val ClientUCMDeletePublishedFile: ClientUCMDeletePublishedFile with scala.Double = js.native
  /* 7316 */ val ClientUCMDeletePublishedFileResponse: ClientUCMDeletePublishedFileResponse with scala.Double = js.native
  /* 7309 */ val ClientUCMDeleteScreenshot: ClientUCMDeleteScreenshot with scala.Double = js.native
  /* 7310 */ val ClientUCMDeleteScreenshotResponse: ClientUCMDeleteScreenshotResponse with scala.Double = js.native
  /* 7366 */ val ClientUCMEnumeratePublishedFilesByUserAction: ClientUCMEnumeratePublishedFilesByUserAction with scala.Double = js.native
  /* 7367 */ val ClientUCMEnumeratePublishedFilesByUserActionResponse: ClientUCMEnumeratePublishedFilesByUserActionResponse with scala.Double = js.native
  /* 7317 */ val ClientUCMEnumerateUserPublishedFiles: ClientUCMEnumerateUserPublishedFiles with scala.Double = js.native
  /* 7318 */ val ClientUCMEnumerateUserPublishedFilesResponse: ClientUCMEnumerateUserPublishedFilesResponse with scala.Double = js.native
  /* 7321 */ val ClientUCMEnumerateUserSubscribedFiles: ClientUCMEnumerateUserSubscribedFiles with scala.Double = js.native
  /* 7322 */ val ClientUCMEnumerateUserSubscribedFilesResponse: ClientUCMEnumerateUserSubscribedFilesResponse with scala.Double = js.native
  /* 7378 */ val ClientUCMEnumerateUserSubscribedFilesWithUpdates: ClientUCMEnumerateUserSubscribedFilesWithUpdates with scala.Double = js.native
  /* 7379 */ val ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse: ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse with scala.Double = js.native
  /* 7313 */ val ClientUCMGetPublishedFileDetails: ClientUCMGetPublishedFileDetails with scala.Double = js.native
  /* 7314 */ val ClientUCMGetPublishedFileDetailsResponse: ClientUCMGetPublishedFileDetailsResponse with scala.Double = js.native
  /* 7360 */ val ClientUCMGetPublishedFilesForUser: ClientUCMGetPublishedFilesForUser with scala.Double = js.native
  /* 7361 */ val ClientUCMGetPublishedFilesForUserResponse: ClientUCMGetPublishedFilesForUserResponse with scala.Double = js.native
  /* 7311 */ val ClientUCMPublishFile: ClientUCMPublishFile with scala.Double = js.native
  /* 7312 */ val ClientUCMPublishFileResponse: ClientUCMPublishFileResponse with scala.Double = js.native
  /* 7368 */ val ClientUCMPublishedFileDeleted: ClientUCMPublishedFileDeleted with scala.Double = js.native
  /* 7347 */ val ClientUCMPublishedFileSubscribed: ClientUCMPublishedFileSubscribed with scala.Double = js.native
  /* 7348 */ val ClientUCMPublishedFileUnsubscribed: ClientUCMPublishedFileUnsubscribed with scala.Double = js.native
  /* 7364 */ val ClientUCMSetUserPublishedFileAction: ClientUCMSetUserPublishedFileAction with scala.Double = js.native
  /* 7365 */ val ClientUCMSetUserPublishedFileActionResponse: ClientUCMSetUserPublishedFileActionResponse with scala.Double = js.native
  /* 7319 */ val ClientUCMSubscribePublishedFile: ClientUCMSubscribePublishedFile with scala.Double = js.native
  /* 7320 */ val ClientUCMSubscribePublishedFileResponse: ClientUCMSubscribePublishedFileResponse with scala.Double = js.native
  /* 7323 */ val ClientUCMUnsubscribePublishedFile: ClientUCMUnsubscribePublishedFile with scala.Double = js.native
  /* 7324 */ val ClientUCMUnsubscribePublishedFileResponse: ClientUCMUnsubscribePublishedFileResponse with scala.Double = js.native
  /* 7325 */ val ClientUCMUpdatePublishedFile: ClientUCMUpdatePublishedFile with scala.Double = js.native
  /* 7326 */ val ClientUCMUpdatePublishedFileResponse: ClientUCMUpdatePublishedFileResponse with scala.Double = js.native
  /* 7005 */ val ClientUDSInviteToGame: ClientUDSInviteToGame with scala.Double = js.native
  /* 7002 */ val ClientUDSP2PSessionEnded: ClientUDSP2PSessionEnded with scala.Double = js.native
  /* 7001 */ val ClientUDSP2PSessionStarted: ClientUDSP2PSessionStarted with scala.Double = js.native
  /* 5219 */ val ClientUFSDeleteFileRequest: ClientUFSDeleteFileRequest with scala.Double = js.native
  /* 5220 */ val ClientUFSDeleteFileResponse: ClientUFSDeleteFileResponse with scala.Double = js.native
  /* 5212 */ val ClientUFSDownloadChunk: ClientUFSDownloadChunk with scala.Double = js.native
  /* 5210 */ val ClientUFSDownloadRequest: ClientUFSDownloadRequest with scala.Double = js.native
  /* 5211 */ val ClientUFSDownloadResponse: ClientUFSDownloadResponse with scala.Double = js.native
  /* 5206 */ val ClientUFSGetFileListForApp: ClientUFSGetFileListForApp with scala.Double = js.native
  /* 5207 */ val ClientUFSGetFileListForAppResponse: ClientUFSGetFileListForAppResponse with scala.Double = js.native
  /* 5230 */ val ClientUFSGetSingleFileInfo: ClientUFSGetSingleFileInfo with scala.Double = js.native
  /* 5231 */ val ClientUFSGetSingleFileInfoResponse: ClientUFSGetSingleFileInfoResponse with scala.Double = js.native
  /* 5226 */ val ClientUFSGetUGCDetails: ClientUFSGetUGCDetails with scala.Double = js.native
  /* 5227 */ val ClientUFSGetUGCDetailsResponse: ClientUFSGetUGCDetailsResponse with scala.Double = js.native
  /* 5213 */ val ClientUFSLoginRequest: ClientUFSLoginRequest with scala.Double = js.native
  /* 5214 */ val ClientUFSLoginResponse: ClientUFSLoginResponse with scala.Double = js.native
  /* 5232 */ val ClientUFSShareFile: ClientUFSShareFile with scala.Double = js.native
  /* 5233 */ val ClientUFSShareFileResponse: ClientUFSShareFileResponse with scala.Double = js.native
  /* 5216 */ val ClientUFSTransferHeartbeat: ClientUFSTransferHeartbeat with scala.Double = js.native
  /* 5204 */ val ClientUFSUploadFileChunk: ClientUFSUploadFileChunk with scala.Double = js.native
  /* 5205 */ val ClientUFSUploadFileFinished: ClientUFSUploadFileFinished with scala.Double = js.native
  /* 5202 */ val ClientUFSUploadFileRequest: ClientUFSUploadFileRequest with scala.Double = js.native
  /* 5203 */ val ClientUFSUploadFileResponse: ClientUFSUploadFileResponse with scala.Double = js.native
  /* 7901 */ val ClientUGSGetGlobalStats: ClientUGSGetGlobalStats with scala.Double = js.native
  /* 7902 */ val ClientUGSGetGlobalStatsResponse: ClientUGSGetGlobalStatsResponse with scala.Double = js.native
  /* 5522 */ val ClientUninstallClientApp: ClientUninstallClientApp with scala.Double = js.native
  /* 5523 */ val ClientUninstallClientAppResponse: ClientUninstallClientAppResponse with scala.Double = js.native
  /* 9507 */ val ClientUnlockStreaming: ClientUnlockStreaming with scala.Double = js.native
  /* 9508 */ val ClientUnlockStreamingResponse: ClientUnlockStreamingResponse with scala.Double = js.native
  /* 811 */ val ClientUpdateChatMetadata: ClientUpdateChatMetadata with scala.Double = js.native
  /* 798 */ val ClientUpdateGuestPassesList: ClientUpdateGuestPassesList with scala.Double = js.native
  /* 5537 */ val ClientUpdateMachineAuth: ClientUpdateMachineAuth with scala.Double = js.native
  /* 5538 */ val ClientUpdateMachineAuthResponse: ClientUpdateMachineAuthResponse with scala.Double = js.native
  /* 5411 */ val ClientUpdateUserGameInfo: ClientUpdateUserGameInfo with scala.Double = js.native
  /* 6505 */ val ClientUseLocalDeviceAuthorizations: ClientUseLocalDeviceAuthorizations with scala.Double = js.native
  /* 5599 */ val ClientUserNotifications: ClientUserNotifications with scala.Double = js.native
  /* 782 */ val ClientVACBanStatus: ClientVACBanStatus with scala.Double = js.native
  /* 753 */ val ClientVACChallenge: ClientVACChallenge with scala.Double = js.native
  /* 704 */ val ClientVACResponse: ClientVACResponse with scala.Double = js.native
  /* 863 */ val ClientVTTCert: ClientVTTCert with scala.Double = js.native
  /* 770 */ val ClientVacStatusQuery: ClientVacStatusQuery with scala.Double = js.native
  /* 717 */ val ClientVacStatusResponse: ClientVacStatusResponse with scala.Double = js.native
  /* 5598 */ val ClientVanityURLChangedNotification: ClientVanityURLChangedNotification with scala.Double = js.native
  /* 5483 */ val ClientVerifyPassword: ClientVerifyPassword with scala.Double = js.native
  /* 5484 */ val ClientVerifyPasswordResponse: ClientVerifyPasswordResponse with scala.Double = js.native
  /* 9800 */ val ClientVoiceCallPreAuthorize: ClientVoiceCallPreAuthorize with scala.Double = js.native
  /* 9801 */ val ClientVoiceCallPreAuthorizeResponse: ClientVoiceCallPreAuthorizeResponse with scala.Double = js.native
  /* 5528 */ val ClientWalletInfoUpdate: ClientWalletInfoUpdate with scala.Double = js.native
  /* 7382 */ val ClientWorkshopItemChangesRequest: ClientWorkshopItemChangesRequest with scala.Double = js.native
  /* 7383 */ val ClientWorkshopItemChangesResponse: ClientWorkshopItemChangesResponse with scala.Double = js.native
  /* 7384 */ val ClientWorkshopItemInfoRequest: ClientWorkshopItemInfoRequest with scala.Double = js.native
  /* 7385 */ val ClientWorkshopItemInfoResponse: ClientWorkshopItemInfoResponse with scala.Double = js.native
  /* 4140 */ val CommunityAddFriendNews: CommunityAddFriendNews with scala.Double = js.native
  /* 4155 */ val CommunityDeleteUserNews: CommunityDeleteUserNews with scala.Double = js.native
  /* 4173 */ val CommunityGetUserFriendNews: CommunityGetUserFriendNews with scala.Double = js.native
  /* 227 */ val ContentDescriptionUpdate: ContentDescriptionUpdate with scala.Double = js.native
  /* 5611 */ val DFSAcceptedResponse: DFSAcceptedResponse with scala.Double = js.native
  /* 5603 */ val DFSConnection: DFSConnection with scala.Double = js.native
  /* 5604 */ val DFSConnectionReply: DFSConnectionReply with scala.Double = js.native
  /* 5601 */ val DFSGetFile: DFSGetFile with scala.Double = js.native
  /* 5610 */ val DFSGetFileFromServer: DFSGetFileFromServer with scala.Double = js.native
  /* 5602 */ val DFSInstallLocalFile: DFSInstallLocalFile with scala.Double = js.native
  /* 5608 */ val DFSPurgeFile: DFSPurgeFile with scala.Double = js.native
  /* 5613 */ val DFSRecvTransmitFile: DFSRecvTransmitFile with scala.Double = js.native
  /* 5612 */ val DFSRequestPingback: DFSRequestPingback with scala.Double = js.native
  /* 5615 */ val DFSRequestPingback2: DFSRequestPingback2 with scala.Double = js.native
  /* 5616 */ val DFSResponsePingback2: DFSResponsePingback2 with scala.Double = js.native
  /* 5609 */ val DFSRouteFile: DFSRouteFile with scala.Double = js.native
  /* 5620 */ val DFSRouteFileResponse: DFSRouteFileResponse with scala.Double = js.native
  /* 5614 */ val DFSSendTransmitFile: DFSSendTransmitFile with scala.Double = js.native
  /* 5618 */ val DFSStartTransfer: DFSStartTransfer with scala.Double = js.native
  /* 5619 */ val DFSTransferComplete: DFSTransferComplete with scala.Double = js.native
  /* 1614 */ val DPAccountCreationStats: DPAccountCreationStats with scala.Double = js.native
  /* 1613 */ val DPAchievementStats: DPAchievementStats with scala.Double = js.native
  /* 1607 */ val DPBlockingStats: DPBlockingStats with scala.Double = js.native
  /* 1612 */ val DPCloudStats: DPCloudStats with scala.Double = js.native
  /* 1618 */ val DPDownloadRateStatistics: DPDownloadRateStatistics with scala.Double = js.native
  /* 1619 */ val DPFacebookStatistics: DPFacebookStatistics with scala.Double = js.native
  /* 1602 */ val DPGamePlayedStats: DPGamePlayedStats with scala.Double = js.native
  /* 1617 */ val DPGameServersPlayersStats: DPGameServersPlayersStats with scala.Double = js.native
  /* 1615 */ val DPGetPlayerCount: DPGetPlayerCount with scala.Double = js.native
  /* 1616 */ val DPGetPlayerCountResponse: DPGetPlayerCountResponse with scala.Double = js.native
  /* 1608 */ val DPNatTraversalStats: DPNatTraversalStats with scala.Double = js.native
  /* 1628 */ val DPPartnerMicroTxns: DPPartnerMicroTxns with scala.Double = js.native
  /* 1629 */ val DPPartnerMicroTxnsResponse: DPPartnerMicroTxnsResponse with scala.Double = js.native
  /* 1601 */ val DPSetPublishingState: DPSetPublishingState with scala.Double = js.native
  /* 1609 */ val DPSteamUsageEvent: DPSteamUsageEvent with scala.Double = js.native
  /* 1624 */ val DPStoreSaleStatistics: DPStoreSaleStatistics with scala.Double = js.native
  /* 1604 */ val DPStreamingUniquePlayersStat: DPStreamingUniquePlayersStat with scala.Double = js.native
  /* 1603 */ val DPUniquePlayersStat: DPUniquePlayersStat with scala.Double = js.native
  /* 1626 */ val DPUpdateContentEvent: DPUpdateContentEvent with scala.Double = js.native
  /* 1631 */ val DPVRUniquePlayersStat: DPVRUniquePlayersStat with scala.Double = js.native
  /* 1606 */ val DPVacBanStats: DPVacBanStats with scala.Double = js.native
  /* 1611 */ val DPVacCafeBanStats: DPVacCafeBanStats with scala.Double = js.native
  /* 1610 */ val DPVacCertBanStats: DPVacCertBanStats with scala.Double = js.native
  /* 1605 */ val DPVacInfractionStats: DPVacInfractionStats with scala.Double = js.native
  /* 640 */ val DRMAdminUpdate: DRMAdminUpdate with scala.Double = js.native
  /* 641 */ val DRMAdminUpdateResponse: DRMAdminUpdateResponse with scala.Double = js.native
  /* 628 */ val DRMBuildBlobRequest: DRMBuildBlobRequest with scala.Double = js.native
  /* 629 */ val DRMBuildBlobResponse: DRMBuildBlobResponse with scala.Double = js.native
  /* 637 */ val DRMDetailsReportRequest: DRMDetailsReportRequest with scala.Double = js.native
  /* 638 */ val DRMDetailsReportResponse: DRMDetailsReportResponse with scala.Double = js.native
  /* 645 */ val DRMEmptyGuidCache: DRMEmptyGuidCache with scala.Double = js.native
  /* 646 */ val DRMEmptyGuidCacheResponse: DRMEmptyGuidCacheResponse with scala.Double = js.native
  /* 639 */ val DRMProcessFile: DRMProcessFile with scala.Double = js.native
  /* 644 */ val DRMProcessFileResponse: DRMProcessFileResponse with scala.Double = js.native
  /* 7600 */ val DRMRange2: DRMRange2 with scala.Double = js.native
  /* 630 */ val DRMResolveGuidRequest: DRMResolveGuidRequest with scala.Double = js.native
  /* 631 */ val DRMResolveGuidResponse: DRMResolveGuidResponse with scala.Double = js.native
  /* 7606 */ val DRMSFetchVersionSet: DRMSFetchVersionSet with scala.Double = js.native
  /* 7607 */ val DRMSFetchVersionSetResponse: DRMSFetchVersionSetResponse with scala.Double = js.native
  /* 635 */ val DRMStabilityReport: DRMStabilityReport with scala.Double = js.native
  /* 636 */ val DRMStabilityReportResponse: DRMStabilityReportResponse with scala.Double = js.native
  /* 642 */ val DRMSync: DRMSync with scala.Double = js.native
  /* 643 */ val DRMSyncResponse: DRMSyncResponse with scala.Double = js.native
  /* 633 */ val DRMVariabilityReport: DRMVariabilityReport with scala.Double = js.native
  /* 634 */ val DRMVariabilityReportResponse: DRMVariabilityReportResponse with scala.Double = js.native
  /* 9100 */ val DRMWorkerProcess: DRMWorkerProcess with scala.Double = js.native
  /* 9128 */ val DRMWorkerProcessAnalyzeFileRequest: DRMWorkerProcessAnalyzeFileRequest with scala.Double = js.native
  /* 9129 */ val DRMWorkerProcessAnalyzeFileResponse: DRMWorkerProcessAnalyzeFileResponse with scala.Double = js.native
  /* 9116 */ val DRMWorkerProcessBackfillOriginalRequest: DRMWorkerProcessBackfillOriginalRequest with scala.Double = js.native
  /* 9117 */ val DRMWorkerProcessBackfillOriginalResponse: DRMWorkerProcessBackfillOriginalResponse with scala.Double = js.native
  /* 9100 */ val DRMWorkerProcessDRMAndSign: DRMWorkerProcessDRMAndSign with scala.Double = js.native
  /* 9101 */ val DRMWorkerProcessDRMAndSignResponse: DRMWorkerProcessDRMAndSignResponse with scala.Double = js.native
  /* 9114 */ val DRMWorkerProcessDescribeSecretRequest: DRMWorkerProcessDescribeSecretRequest with scala.Double = js.native
  /* 9115 */ val DRMWorkerProcessDescribeSecretResponse: DRMWorkerProcessDescribeSecretResponse with scala.Double = js.native
  /* 9126 */ val DRMWorkerProcessEvaluateCrashRequest: DRMWorkerProcessEvaluateCrashRequest with scala.Double = js.native
  /* 9127 */ val DRMWorkerProcessEvaluateCrashResponse: DRMWorkerProcessEvaluateCrashResponse with scala.Double = js.native
  /* 9112 */ val DRMWorkerProcessExamineBlobRequest: DRMWorkerProcessExamineBlobRequest with scala.Double = js.native
  /* 9113 */ val DRMWorkerProcessExamineBlobResponse: DRMWorkerProcessExamineBlobResponse with scala.Double = js.native
  /* 9124 */ val DRMWorkerProcessGetBlobRequest: DRMWorkerProcessGetBlobRequest with scala.Double = js.native
  /* 9125 */ val DRMWorkerProcessGetBlobResponse: DRMWorkerProcessGetBlobResponse with scala.Double = js.native
  /* 9108 */ val DRMWorkerProcessGetDRMGuidsFromFileRequest: DRMWorkerProcessGetDRMGuidsFromFileRequest with scala.Double = js.native
  /* 9109 */ val DRMWorkerProcessGetDRMGuidsFromFileResponse: DRMWorkerProcessGetDRMGuidsFromFileResponse with scala.Double = js.native
  /* 9132 */ val DRMWorkerProcessInstallAllRequest: DRMWorkerProcessInstallAllRequest with scala.Double = js.native
  /* 9133 */ val DRMWorkerProcessInstallAllResponse: DRMWorkerProcessInstallAllResponse with scala.Double = js.native
  /* 9104 */ val DRMWorkerProcessInstallDRMDLLRequest: DRMWorkerProcessInstallDRMDLLRequest with scala.Double = js.native
  /* 9105 */ val DRMWorkerProcessInstallDRMDLLResponse: DRMWorkerProcessInstallDRMDLLResponse with scala.Double = js.native
  /* 9110 */ val DRMWorkerProcessInstallProcessedFilesRequest: DRMWorkerProcessInstallProcessedFilesRequest with scala.Double = js.native
  /* 9111 */ val DRMWorkerProcessInstallProcessedFilesResponse: DRMWorkerProcessInstallProcessedFilesResponse with scala.Double = js.native
  /* 9106 */ val DRMWorkerProcessSecretIdStringRequest: DRMWorkerProcessSecretIdStringRequest with scala.Double = js.native
  /* 9107 */ val DRMWorkerProcessSecretIdStringResponse: DRMWorkerProcessSecretIdStringResponse with scala.Double = js.native
  /* 9122 */ val DRMWorkerProcessSplitAndInstallRequest: DRMWorkerProcessSplitAndInstallRequest with scala.Double = js.native
  /* 9123 */ val DRMWorkerProcessSplitAndInstallResponse: DRMWorkerProcessSplitAndInstallResponse with scala.Double = js.native
  /* 9102 */ val DRMWorkerProcessSteamworksInfoRequest: DRMWorkerProcessSteamworksInfoRequest with scala.Double = js.native
  /* 9103 */ val DRMWorkerProcessSteamworksInfoResponse: DRMWorkerProcessSteamworksInfoResponse with scala.Double = js.native
  /* 9130 */ val DRMWorkerProcessUnpackBlobRequest: DRMWorkerProcessUnpackBlobRequest with scala.Double = js.native
  /* 9131 */ val DRMWorkerProcessUnpackBlobResponse: DRMWorkerProcessUnpackBlobResponse with scala.Double = js.native
  /* 9118 */ val DRMWorkerProcessValidateDRMDLLRequest: DRMWorkerProcessValidateDRMDLLRequest with scala.Double = js.native
  /* 9119 */ val DRMWorkerProcessValidateDRMDLLResponse: DRMWorkerProcessValidateDRMDLLResponse with scala.Double = js.native
  /* 9120 */ val DRMWorkerProcessValidateFileRequest: DRMWorkerProcessValidateFileRequest with scala.Double = js.native
  /* 9121 */ val DRMWorkerProcessValidateFileResponse: DRMWorkerProcessValidateFileResponse with scala.Double = js.native
  /* 1802 */ val DSSCurrentFileList: DSSCurrentFileList with scala.Double = js.native
  /* 1801 */ val DSSNewFile: DSSNewFile with scala.Double = js.native
  /* 1803 */ val DSSSynchList: DSSSynchList with scala.Double = js.native
  /* 1804 */ val DSSSynchListResponse: DSSSynchListResponse with scala.Double = js.native
  /* 1805 */ val DSSSynchSubscribe: DSSSynchSubscribe with scala.Double = js.native
  /* 1806 */ val DSSSynchUnsubscribe: DSSSynchUnsubscribe with scala.Double = js.native
  /* 113 */ val DestJobFailed: DestJobFailed with scala.Double = js.native
  /* 6500 */ val DeviceAuthorizationBase: DeviceAuthorizationBase with scala.Double = js.native
  /* 202 */ val DirRequest: DirRequest with scala.Double = js.native
  /* 203 */ val DirResponse: DirResponse with scala.Double = js.native
  /* 1903 */ val EPMRestartProcess: EPMRestartProcess with scala.Double = js.native
  /* 1901 */ val EPMStartProcess: EPMStartProcess with scala.Double = js.native
  /* 1902 */ val EPMStopProcess: EPMStopProcess with scala.Double = js.native
  /* 7700 */ val EconBase: EconBase with scala.Double = js.native
  /* 7711 */ val EconCDKeyProcessTransaction: EconCDKeyProcessTransaction with scala.Double = js.native
  /* 7712 */ val EconCDKeyProcessTransactionResponse: EconCDKeyProcessTransactionResponse with scala.Double = js.native
  /* 7707 */ val EconFlushInventoryCache: EconFlushInventoryCache with scala.Double = js.native
  /* 7708 */ val EconFlushInventoryCacheResponse: EconFlushInventoryCacheResponse with scala.Double = js.native
  /* 7713 */ val EconGetErrorLogs: EconGetErrorLogs with scala.Double = js.native
  /* 7714 */ val EconGetErrorLogsResponse: EconGetErrorLogsResponse with scala.Double = js.native
  /* 7706 */ val EconTrading_CancelTradeRequest: EconTrading_CancelTradeRequest with scala.Double = js.native
  /* 7702 */ val EconTrading_InitiateTradeProposed: EconTrading_InitiateTradeProposed with scala.Double = js.native
  /* 7701 */ val EconTrading_InitiateTradeRequest: EconTrading_InitiateTradeRequest with scala.Double = js.native
  /* 7703 */ val EconTrading_InitiateTradeResponse: EconTrading_InitiateTradeResponse with scala.Double = js.native
  /* 7704 */ val EconTrading_InitiateTradeResult: EconTrading_InitiateTradeResult with scala.Double = js.native
  /* 7705 */ val EconTrading_StartSession: EconTrading_StartSession with scala.Double = js.native
  /* 201 */ val Exit: Exit with scala.Double = js.native
  /* 308 */ val ExitShell: ExitShell with scala.Double = js.native
  /* 307 */ val ExitShells: ExitShells with scala.Double = js.native
  /* 1119 */ val FBSApplyAccountCred: FBSApplyAccountCred with scala.Double = js.native
  /* 1120 */ val FBSApplyAccountCredResponse: FBSApplyAccountCredResponse with scala.Double = js.native
  /* 1108 */ val FBSApplyOSUpdates: FBSApplyOSUpdates with scala.Double = js.native
  /* 1130 */ val FBSBootstrapperGetPackageChunk: FBSBootstrapperGetPackageChunk with scala.Double = js.native
  /* 1131 */ val FBSBootstrapperGetPackageChunkResponse: FBSBootstrapperGetPackageChunkResponse with scala.Double = js.native
  /* 1128 */ val FBSBootstrapperPackageRequest: FBSBootstrapperPackageRequest with scala.Double = js.native
  /* 1129 */ val FBSBootstrapperPackageResponse: FBSBootstrapperPackageResponse with scala.Double = js.native
  /* 1132 */ val FBSBootstrapperPackageTransferProgress: FBSBootstrapperPackageTransferProgress with scala.Double = js.native
  /* 1027 */ val FBSConnectionData: FBSConnectionData with scala.Double = js.native
  /* 1114 */ val FBSDeployHotFixPackage: FBSDeployHotFixPackage with scala.Double = js.native
  /* 1115 */ val FBSDeployHotFixResponse: FBSDeployHotFixResponse with scala.Double = js.native
  /* 1104 */ val FBSDeployPackage: FBSDeployPackage with scala.Double = js.native
  /* 1105 */ val FBSDeployResponse: FBSDeployResponse with scala.Double = js.native
  /* 1116 */ val FBSDownloadHotFix: FBSDownloadHotFix with scala.Double = js.native
  /* 1117 */ val FBSDownloadHotFixResponse: FBSDownloadHotFixResponse with scala.Double = js.native
  /* 1103 */ val FBSForceBounce: FBSForceBounce with scala.Double = js.native
  /* 1102 */ val FBSForceRefresh: FBSForceRefresh with scala.Double = js.native
  /* 1126 */ val FBSInfoFromBootstrapper: FBSInfoFromBootstrapper with scala.Double = js.native
  /* 1112 */ val FBSMinidumpServer: FBSMinidumpServer with scala.Double = js.native
  /* 1123 */ val FBSQueryGMForRequest: FBSQueryGMForRequest with scala.Double = js.native
  /* 1124 */ val FBSQueryGMResponse: FBSQueryGMResponse with scala.Double = js.native
  /* 1110 */ val FBSRebootBox: FBSRebootBox with scala.Double = js.native
  /* 1127 */ val FBSRebootBoxResponse: FBSRebootBoxResponse with scala.Double = js.native
  /* 1100 */ val FBSReqVersion: FBSReqVersion with scala.Double = js.native
  /* 1133 */ val FBSRestartBootstrapper: FBSRestartBootstrapper with scala.Double = js.native
  /* 1109 */ val FBSRunCMDScript: FBSRunCMDScript with scala.Double = js.native
  /* 1111 */ val FBSSetBigBrotherMode: FBSSetBigBrotherMode with scala.Double = js.native
  /* 1121 */ val FBSSetShellCount: FBSSetShellCount with scala.Double = js.native
  /* 1113 */ val FBSSetShellCount_obsolete: FBSSetShellCount_obsolete with scala.Double = js.native
  /* 1107 */ val FBSSetState: FBSSetState with scala.Double = js.native
  /* 1122 */ val FBSTerminateShell: FBSTerminateShell with scala.Double = js.native
  /* 1125 */ val FBSTerminateZombies: FBSTerminateZombies with scala.Double = js.native
  /* 1106 */ val FBSUpdateBootstrapper: FBSUpdateBootstrapper with scala.Double = js.native
  /* 1118 */ val FBSUpdateTargetConfigFile: FBSUpdateTargetConfigFile with scala.Double = js.native
  /* 1101 */ val FBSVersionInfo: FBSVersionInfo with scala.Double = js.native
  /* 7510 */ val FSAddOrRemoveFollower: FSAddOrRemoveFollower with scala.Double = js.native
  /* 7511 */ val FSAddOrRemoveFollowerResponse: FSAddOrRemoveFollowerResponse with scala.Double = js.native
  /* 7500 */ val FSBase: FSBase with scala.Double = js.native
  /* 7513 */ val FSCommentNotification: FSCommentNotification with scala.Double = js.native
  /* 7514 */ val FSCommentNotificationViewed: FSCommentNotificationViewed with scala.Double = js.native
  /* 7506 */ val FSComputeFrenematrix: FSComputeFrenematrix with scala.Double = js.native
  /* 7507 */ val FSComputeFrenematrixResponse: FSComputeFrenematrixResponse with scala.Double = js.native
  /* 7521 */ val FSGetPendingNotificationCount: FSGetPendingNotificationCount with scala.Double = js.native
  /* 7522 */ val FSGetPendingNotificationCountResponse: FSGetPendingNotificationCountResponse with scala.Double = js.native
  /* 7508 */ val FSPlayStatusNotification: FSPlayStatusNotification with scala.Double = js.native
  /* 7509 */ val FSPublishPersonaStatus: FSPublishPersonaStatus with scala.Double = js.native
  /* 7530 */ val FSRequestFriendData: FSRequestFriendData with scala.Double = js.native
  /* 7504 */ val FSRichPresenceRequest: FSRichPresenceRequest with scala.Double = js.native
  /* 7505 */ val FSRichPresenceResponse: FSRichPresenceResponse with scala.Double = js.native
  /* 7512 */ val FSUpdateFollowingList: FSUpdateFollowingList with scala.Double = js.native
  /* 3103 */ val FTSBrowseClans: FTSBrowseClans with scala.Double = js.native
  /* 3104 */ val FTSBrowseClansResponse: FTSBrowseClansResponse with scala.Double = js.native
  /* 3109 */ val FTSClanDeleted: FTSClanDeleted with scala.Double = js.native
  /* 3101 */ val FTSGetBrowseCounts: FTSGetBrowseCounts with scala.Double = js.native
  /* 3102 */ val FTSGetBrowseCountsResponse: FTSGetBrowseCountsResponse with scala.Double = js.native
  /* 3114 */ val FTSGetGSPlayStats: FTSGetGSPlayStats with scala.Double = js.native
  /* 3116 */ val FTSGetGSPlayStatsForServer: FTSGetGSPlayStatsForServer with scala.Double = js.native
  /* 3117 */ val FTSGetGSPlayStatsForServerResponse: FTSGetGSPlayStatsForServerResponse with scala.Double = js.native
  /* 3115 */ val FTSGetGSPlayStatsResponse: FTSGetGSPlayStatsResponse with scala.Double = js.native
  /* 3118 */ val FTSReportIPUpdates: FTSReportIPUpdates with scala.Double = js.native
  /* 3110 */ val FTSSearch: FTSSearch with scala.Double = js.native
  /* 3105 */ val FTSSearchClansByLocation: FTSSearchClansByLocation with scala.Double = js.native
  /* 3106 */ val FTSSearchClansByLocationResponse: FTSSearchClansByLocationResponse with scala.Double = js.native
  /* 3107 */ val FTSSearchPlayersByLocation: FTSSearchPlayersByLocation with scala.Double = js.native
  /* 3108 */ val FTSSearchPlayersByLocationResponse: FTSSearchPlayersByLocationResponse with scala.Double = js.native
  /* 3111 */ val FTSSearchResponse: FTSSearchResponse with scala.Double = js.native
  /* 3112 */ val FTSSearchStatus: FTSSearchStatus with scala.Double = js.native
  /* 3113 */ val FTSSearchStatusResponse: FTSSearchStatusResponse with scala.Double = js.native
  /* 3000 */ val FailServer: FailServer with scala.Double = js.native
  /* 1202 */ val FileXferData: FileXferData with scala.Double = js.native
  /* 1204 */ val FileXferDataAck: FileXferDataAck with scala.Double = js.native
  /* 1203 */ val FileXferEnd: FileXferEnd with scala.Double = js.native
  /* 1200 */ val FileXferRequest: FileXferRequest with scala.Double = js.native
  /* 1201 */ val FileXferResponse: FileXferResponse with scala.Double = js.native
  /* 2212 */ val GCAchievementAwarded: GCAchievementAwarded with scala.Double = js.native
  /* 2204 */ val GCCmdBounce: GCCmdBounce with scala.Double = js.native
  /* 2207 */ val GCCmdDeploy: GCCmdDeploy with scala.Double = js.native
  /* 2208 */ val GCCmdDeployResponse: GCCmdDeployResponse with scala.Double = js.native
  /* 2206 */ val GCCmdDown: GCCmdDown with scala.Double = js.native
  /* 2205 */ val GCCmdForceBounce: GCCmdForceBounce with scala.Double = js.native
  /* 2203 */ val GCCmdRevive: GCCmdRevive with scala.Double = js.native
  /* 2216 */ val GCCmdStatus: GCCmdStatus with scala.Double = js.native
  /* 2209 */ val GCCmdSwitch: GCCmdSwitch with scala.Double = js.native
  /* 2218 */ val GCGetAccountDetails: GCGetAccountDetails with scala.Double = js.native
  /* 2218 */ val GCGetAccountDetails_DEPRECATED: GCGetAccountDetails_DEPRECATED with scala.Double = js.native
  /* 2220 */ val GCGetEmailTemplate: GCGetEmailTemplate with scala.Double = js.native
  /* 2221 */ val GCGetEmailTemplateResponse: GCGetEmailTemplateResponse with scala.Double = js.native
  /* 2234 */ val GCHAccountLockStatusChange: GCHAccountLockStatusChange with scala.Double = js.native
  /* 2236 */ val GCHAccountPhoneNumberChange: GCHAccountPhoneNumberChange with scala.Double = js.native
  /* 2233 */ val GCHAccountTradeBanStatusChange: GCHAccountTradeBanStatusChange with scala.Double = js.native
  /* 2237 */ val GCHAccountTwoFactorChange: GCHAccountTwoFactorChange with scala.Double = js.native
  /* 2228 */ val GCHAccountVacStatusChange: GCHAccountVacStatusChange with scala.Double = js.native
  /* 2231 */ val GCHKillGC: GCHKillGC with scala.Double = js.native
  /* 2232 */ val GCHKillGCResponse: GCHKillGCResponse with scala.Double = js.native
  /* 2222 */ val GCHRelay: GCHRelay with scala.Double = js.native
  /* 2223 */ val GCHRelayClientToIS: GCHRelayClientToIS with scala.Double = js.native
  /* 2223 */ val GCHRelayToClient: GCHRelayToClient with scala.Double = js.native
  /* 2226 */ val GCHRequestStatus: GCHRequestStatus with scala.Double = js.native
  /* 2227 */ val GCHRequestStatusResponse: GCHRequestStatusResponse with scala.Double = js.native
  /* 2225 */ val GCHRequestUpdateSession: GCHRequestUpdateSession with scala.Double = js.native
  /* 2229 */ val GCHSpawnGC: GCHSpawnGC with scala.Double = js.native
  /* 2230 */ val GCHSpawnGCResponse: GCHSpawnGCResponse with scala.Double = js.native
  /* 2224 */ val GCHUpdateSession: GCHUpdateSession with scala.Double = js.native
  /* 2235 */ val GCHVacVerificationChange: GCHVacVerificationChange with scala.Double = js.native
  /* 2219 */ val GCInterAppMessage: GCInterAppMessage with scala.Double = js.native
  /* 2217 */ val GCRegisterWebInterfaces: GCRegisterWebInterfaces with scala.Double = js.native
  /* 2217 */ val GCRegisterWebInterfaces_Deprecated: GCRegisterWebInterfaces_Deprecated with scala.Double = js.native
  /* 2200 */ val GCSendClient: GCSendClient with scala.Double = js.native
  /* 2213 */ val GCSystemMessage: GCSystemMessage with scala.Double = js.native
  /* 2211 */ val GCUpdateGSState: GCUpdateGSState with scala.Double = js.native
  /* 2202 */ val GCUpdatePlayedState: GCUpdatePlayedState with scala.Double = js.native
  /* 2214 */ val GCValidateSession: GCValidateSession with scala.Double = js.native
  /* 2215 */ val GCValidateSessionResponse: GCValidateSessionResponse with scala.Double = js.native
  /* 333 */ val GMConvertUserWallets: GMConvertUserWallets with scala.Double = js.native
  /* 320 */ val GMDRMSync: GMDRMSync with scala.Double = js.native
  /* 331 */ val GMGetServiceMethodRouting: GMGetServiceMethodRouting with scala.Double = js.native
  /* 332 */ val GMGetServiceMethodRoutingResponse: GMGetServiceMethodRoutingResponse with scala.Double = js.native
  /* 325 */ val GMLoadActivationCodes: GMLoadActivationCodes with scala.Double = js.native
  /* 326 */ val GMQueueForFBS: GMQueueForFBS with scala.Double = js.native
  /* 319 */ val GMReportPHPError: GMReportPHPError with scala.Double = js.native
  /* 6400 */ val GMSBase: GMSBase with scala.Double = js.native
  /* 6404 */ val GMSClientServerQueryResponse: GMSClientServerQueryResponse with scala.Double = js.native
  /* 6401 */ val GMSGameServerReplicate: GMSGameServerReplicate with scala.Double = js.native
  /* 327 */ val GMSchemaConversionResults: GMSchemaConversionResults with scala.Double = js.native
  /* 328 */ val GMSchemaConversionResultsResponse: GMSchemaConversionResultsResponse with scala.Double = js.native
  /* 324 */ val GMWriteConfigToSQL: GMWriteConfigToSQL with scala.Double = js.native
  /* 329 */ val GMWriteShellFailureToSQL: GMWriteShellFailureToSQL with scala.Double = js.native
  /* 330 */ val GMWriteStatsToSOS: GMWriteStatsToSOS with scala.Double = js.native
  /* 758 */ val GSApprove: GSApprove with scala.Double = js.native
  /* 938 */ val GSAssociateWithClan: GSAssociateWithClan with scala.Double = js.native
  /* 939 */ val GSAssociateWithClanResponse: GSAssociateWithClanResponse with scala.Double = js.native
  /* 940 */ val GSComputeNewPlayerCompatibility: GSComputeNewPlayerCompatibility with scala.Double = js.native
  /* 941 */ val GSComputeNewPlayerCompatibilityResponse: GSComputeNewPlayerCompatibilityResponse with scala.Double = js.native
  /* 759 */ val GSDeny: GSDeny with scala.Double = js.native
  /* 901 */ val GSDisconnectNotice: GSDisconnectNotice with scala.Double = js.native
  /* 918 */ val GSGetPlayStats: GSGetPlayStats with scala.Double = js.native
  /* 919 */ val GSGetPlayStatsResponse: GSGetPlayStatsResponse with scala.Double = js.native
  /* 936 */ val GSGetReputation: GSGetReputation with scala.Double = js.native
  /* 937 */ val GSGetReputationResponse: GSGetReputationResponse with scala.Double = js.native
  /* 910 */ val GSGetUserAchievementStatus: GSGetUserAchievementStatus with scala.Double = js.native
  /* 911 */ val GSGetUserAchievementStatusResponse: GSGetUserAchievementStatusResponse with scala.Double = js.native
  /* 920 */ val GSGetUserGroupStatus: GSGetUserGroupStatus with scala.Double = js.native
  /* 923 */ val GSGetUserGroupStatusResponse: GSGetUserGroupStatusResponse with scala.Double = js.native
  /* 760 */ val GSKick: GSKick with scala.Double = js.native
  /* 5440 */ val GSPerformHardwareSurvey: GSPerformHardwareSurvey with scala.Double = js.native
  /* 909 */ val GSPlayerList: GSPlayerList with scala.Double = js.native
  /* 908 */ val GSServerType: GSServerType with scala.Double = js.native
  /* 903 */ val GSStatus: GSStatus with scala.Double = js.native
  /* 906 */ val GSStatus2: GSStatus2 with scala.Double = js.native
  /* 774 */ val GSStatusReply: GSStatusReply with scala.Double = js.native
  /* 907 */ val GSStatusUpdate_Unused: GSStatusUpdate_Unused with scala.Double = js.native
  /* 905 */ val GSUserPlaying: GSUserPlaying with scala.Double = js.native
  /* 6407 */ val GameServerOutOfDate: GameServerOutOfDate with scala.Double = js.native
  /* 100 */ val GenericReply: GenericReply with scala.Double = js.native
  /* 4393 */ val GetUserIPCountry: GetUserIPCountry with scala.Double = js.native
  /* 4394 */ val GetUserIPCountryResponse: GetUserIPCountryResponse with scala.Double = js.native
  /* 309 */ val GracefulExitShell: GracefulExitShell with scala.Double = js.native
  /* 300 */ val Heartbeat: Heartbeat with scala.Double = js.native
  /* 124 */ val HubConnect: HubConnect with scala.Double = js.native
  /* 2222 */ val ISRelayToGCH: ISRelayToGCH with scala.Double = js.native
  /* 0 */ val Invalid: Invalid with scala.Double = js.native
  /* 145 */ val InvalidateDBOCacheItems: InvalidateDBOCacheItems with scala.Double = js.native
  /* 123 */ val JobHeartbeat: JobHeartbeat with scala.Double = js.native
  /* 3001 */ val JobHeartbeatTest: JobHeartbeatTest with scala.Double = js.native
  /* 3002 */ val JobHeartbeatTestResponse: JobHeartbeatTestResponse with scala.Double = js.native
  /* 7201 */ val KGSAllocateKeyRange: KGSAllocateKeyRange with scala.Double = js.native
  /* 7202 */ val KGSAllocateKeyRangeResponse: KGSAllocateKeyRangeResponse with scala.Double = js.native
  /* 7200 */ val KGSBase: KGSBase with scala.Double = js.native
  /* 7207 */ val KGSGenerateGameStopWCKeys: KGSGenerateGameStopWCKeys with scala.Double = js.native
  /* 7208 */ val KGSGenerateGameStopWCKeysResponse: KGSGenerateGameStopWCKeysResponse with scala.Double = js.native
  /* 7203 */ val KGSGenerateKeys: KGSGenerateKeys with scala.Double = js.native
  /* 7204 */ val KGSGenerateKeysResponse: KGSGenerateKeysResponse with scala.Double = js.native
  /* 7205 */ val KGSRemapKeys: KGSRemapKeys with scala.Double = js.native
  /* 7206 */ val KGSRemapKeysResponse: KGSRemapKeysResponse with scala.Double = js.native
  /* 132 */ val KeepAlive: KeepAlive with scala.Double = js.native
  /* 3210 */ val LBSDeleteLB: LBSDeleteLB with scala.Double = js.native
  /* 3211 */ val LBSDeleteLBEntry: LBSDeleteLBEntry with scala.Double = js.native
  /* 3214 */ val LBSDeleteLBResponse: LBSDeleteLBResponse with scala.Double = js.native
  /* 3203 */ val LBSFindOrCreateLB: LBSFindOrCreateLB with scala.Double = js.native
  /* 3204 */ val LBSFindOrCreateLBResponse: LBSFindOrCreateLBResponse with scala.Double = js.native
  /* 3205 */ val LBSGetLBEntries: LBSGetLBEntries with scala.Double = js.native
  /* 3206 */ val LBSGetLBEntriesResponse: LBSGetLBEntriesResponse with scala.Double = js.native
  /* 3207 */ val LBSGetLBList: LBSGetLBList with scala.Double = js.native
  /* 3208 */ val LBSGetLBListResponse: LBSGetLBListResponse with scala.Double = js.native
  /* 3212 */ val LBSResetLB: LBSResetLB with scala.Double = js.native
  /* 3213 */ val LBSResetLBResponse: LBSResetLBResponse with scala.Double = js.native
  /* 3209 */ val LBSSetLBDetails: LBSSetLBDetails with scala.Double = js.native
  /* 3201 */ val LBSSetScore: LBSSetScore with scala.Double = js.native
  /* 3202 */ val LBSSetScoreResponse: LBSSetScoreResponse with scala.Double = js.native
  /* 316 */ val LicenseProcessingComplete: LicenseProcessingComplete with scala.Double = js.native
  /* 143 */ val LoadDBOCacheItem: LoadDBOCacheItem with scala.Double = js.native
  /* 144 */ val LoadDBOCacheItemResponse: LoadDBOCacheItemResponse with scala.Double = js.native
  /* 1009 */ val LogSearchCancel: LogSearchCancel with scala.Double = js.native
  /* 1007 */ val LogSearchRequest: LogSearchRequest with scala.Double = js.native
  /* 1008 */ val LogSearchResponse: LogSearchResponse with scala.Double = js.native
  /* 8800 */ val LogsinkBase: LogsinkBase with scala.Double = js.native
  /* 8800 */ val LogsinkWriteReport: LogsinkWriteReport with scala.Double = js.native
  /* 5828 */ val MDSContentServerConfig: MDSContentServerConfig with scala.Double = js.native
  /* 5827 */ val MDSContentServerConfigRequest: MDSContentServerConfigRequest with scala.Double = js.native
  /* 5826 */ val MDSContentServerStatsBroadcast: MDSContentServerStatsBroadcast with scala.Double = js.native
  /* 5825 */ val MDSDownloadDepotChunksAck: MDSDownloadDepotChunksAck with scala.Double = js.native
  /* 5832 */ val MDSGetDepotChunk: MDSGetDepotChunk with scala.Double = js.native
  /* 5834 */ val MDSGetDepotChunkChunk: MDSGetDepotChunkChunk with scala.Double = js.native
  /* 5833 */ val MDSGetDepotChunkResponse: MDSGetDepotChunkResponse with scala.Double = js.native
  /* 5829 */ val MDSGetDepotManifest: MDSGetDepotManifest with scala.Double = js.native
  /* 5831 */ val MDSGetDepotManifestChunk: MDSGetDepotManifestChunk with scala.Double = js.native
  /* 5830 */ val MDSGetDepotManifestResponse: MDSGetDepotManifestResponse with scala.Double = js.native
  /* 5836 */ val MDSGetServerListForUser: MDSGetServerListForUser with scala.Double = js.native
  /* 5837 */ val MDSGetServerListForUserResponse: MDSGetServerListForUserResponse with scala.Double = js.native
  /* 5814 */ val MDSGetVersionsForDepot: MDSGetVersionsForDepot with scala.Double = js.native
  /* 5815 */ val MDSGetVersionsForDepotResponse: MDSGetVersionsForDepotResponse with scala.Double = js.native
  /* 5847 */ val MDSMigrateChunk: MDSMigrateChunk with scala.Double = js.native
  /* 5848 */ val MDSMigrateChunkResponse: MDSMigrateChunkResponse with scala.Double = js.native
  /* 5816 */ val MDSSetPublicVersionForDepot: MDSSetPublicVersionForDepot with scala.Double = js.native
  /* 5817 */ val MDSSetPublicVersionForDepotResponse: MDSSetPublicVersionForDepotResponse with scala.Double = js.native
  /* 5813 */ val MDSToAMGetDepotDecryptionKeyResponse: MDSToAMGetDepotDecryptionKeyResponse with scala.Double = js.native
  /* 5844 */ val MDSToCSFlushChunk: MDSToCSFlushChunk with scala.Double = js.native
  /* 5835 */ val MDSUpdateContentServerConfig: MDSUpdateContentServerConfig with scala.Double = js.native
  /* 6600 */ val MMSBase: MMSBase with scala.Double = js.native
  /* 7100 */ val MPASBase: MPASBase with scala.Double = js.native
  /* 7101 */ val MPASVacBanReset: MPASVacBanReset with scala.Double = js.native
  /* 4216 */ val MarketingMessageUpdate: MarketingMessageUpdate with scala.Double = js.native
  /* 1 */ val Multi: Multi with scala.Double = js.native
  /* 6800 */ val NonStdMsgBase: NonStdMsgBase with scala.Double = js.native
  /* 6806 */ val NonStdMsgChase: NonStdMsgChase with scala.Double = js.native
  /* 6807 */ val NonStdMsgDFSTransfer: NonStdMsgDFSTransfer with scala.Double = js.native
  /* 6803 */ val NonStdMsgHTTPClient: NonStdMsgHTTPClient with scala.Double = js.native
  /* 6802 */ val NonStdMsgHTTPServer: NonStdMsgHTTPServer with scala.Double = js.native
  /* 6811 */ val NonStdMsgLogsink: NonStdMsgLogsink with scala.Double = js.native
  /* 6801 */ val NonStdMsgMemcached: NonStdMsgMemcached with scala.Double = js.native
  /* 6805 */ val NonStdMsgPHPSimulator: NonStdMsgPHPSimulator with scala.Double = js.native
  /* 6813 */ val NonStdMsgRTMPServer: NonStdMsgRTMPServer with scala.Double = js.native
  /* 6812 */ val NonStdMsgSteam2Emulator: NonStdMsgSteam2Emulator with scala.Double = js.native
  /* 6810 */ val NonStdMsgSyslog: NonStdMsgSyslog with scala.Double = js.native
  /* 6808 */ val NonStdMsgTests: NonStdMsgTests with scala.Double = js.native
  /* 6809 */ val NonStdMsgUMQpipeAAPL: NonStdMsgUMQpipeAAPL with scala.Double = js.native
  /* 6804 */ val NonStdMsgWGResponse: NonStdMsgWGResponse with scala.Double = js.native
  /* 4395 */ val NotificationOfSuspiciousActivity: NotificationOfSuspiciousActivity with scala.Double = js.native
  /* 314 */ val NotifyWatchdog: NotifyWatchdog with scala.Double = js.native
  /* 3401 */ val OGSBeginSession: OGSBeginSession with scala.Double = js.native
  /* 3402 */ val OGSBeginSessionResponse: OGSBeginSessionResponse with scala.Double = js.native
  /* 3403 */ val OGSEndSession: OGSEndSession with scala.Double = js.native
  /* 3404 */ val OGSEndSessionResponse: OGSEndSessionResponse with scala.Double = js.native
  /* 3406 */ val OGSWriteAppSessionRow: OGSWriteAppSessionRow with scala.Double = js.native
  /* 2502 */ val P2PIntroducerMessage: P2PIntroducerMessage with scala.Double = js.native
  /* 8900 */ val PICSBase: PICSBase with scala.Double = js.native
  /* 5005 */ val PSAddPackageToShoppingCart: PSAddPackageToShoppingCart with scala.Double = js.native
  /* 5006 */ val PSAddPackageToShoppingCartResponse: PSAddPackageToShoppingCartResponse with scala.Double = js.native
  /* 5011 */ val PSAddWalletCreditToShoppingCart: PSAddWalletCreditToShoppingCart with scala.Double = js.native
  /* 5012 */ val PSAddWalletCreditToShoppingCartResponse: PSAddWalletCreditToShoppingCartResponse with scala.Double = js.native
  /* 5001 */ val PSCreateShoppingCart: PSCreateShoppingCart with scala.Double = js.native
  /* 5002 */ val PSCreateShoppingCartResponse: PSCreateShoppingCartResponse with scala.Double = js.native
  /* 5009 */ val PSGetShoppingCartContents: PSGetShoppingCartContents with scala.Double = js.native
  /* 5010 */ val PSGetShoppingCartContentsResponse: PSGetShoppingCartContentsResponse with scala.Double = js.native
  /* 5003 */ val PSIsValidShoppingCart: PSIsValidShoppingCart with scala.Double = js.native
  /* 5004 */ val PSIsValidShoppingCartResponse: PSIsValidShoppingCartResponse with scala.Double = js.native
  /* 5007 */ val PSRemoveLineItemFromShoppingCart: PSRemoveLineItemFromShoppingCart with scala.Double = js.native
  /* 5008 */ val PSRemoveLineItemFromShoppingCartResponse: PSRemoveLineItemFromShoppingCartResponse with scala.Double = js.native
  /* 321 */ val PhysicalBoxInventory: PhysicalBoxInventory with scala.Double = js.native
  /* 139 */ val Ping: Ping with scala.Double = js.native
  /* 140 */ val PingResponse: PingResponse with scala.Double = js.native
  /* 226 */ val PrepareToExit: PrepareToExit with scala.Double = js.native
  /* 2 */ val ProtobufWrapped: ProtobufWrapped with scala.Double = js.native
  /* 234 */ val ProvideWindowsEventLogEntries: ProvideWindowsEventLogEntries with scala.Double = js.native
  /* 9300 */ val QuestServerBase: QuestServerBase with scala.Double = js.native
  /* 318 */ val QueuedEmailsComplete: QueuedEmailsComplete with scala.Double = js.native
  /* 7803 */ val RMDeleteMemcachedKeys: RMDeleteMemcachedKeys with scala.Double = js.native
  /* 7806 */ val RMMsgTraceAddTrigger: RMMsgTraceAddTrigger with scala.Double = js.native
  /* 7808 */ val RMMsgTraceEvent: RMMsgTraceEvent with scala.Double = js.native
  /* 7807 */ val RMMsgTraceRemoveTrigger: RMMsgTraceRemoveTrigger with scala.Double = js.native
  /* 7800 */ val RMRange: RMRange with scala.Double = js.native
  /* 7804 */ val RMRemoteInvoke: RMRemoteInvoke with scala.Double = js.native
  /* 7800 */ val RMTestVerisignOTP: RMTestVerisignOTP with scala.Double = js.native
  /* 7801 */ val RMTestVerisignOTPResponse: RMTestVerisignOTPResponse with scala.Double = js.native
  /* 9509 */ val RemoteClientAcceptEULA: RemoteClientAcceptEULA with scala.Double = js.native
  /* 9502 */ val RemoteClientAppStatus: RemoteClientAppStatus with scala.Double = js.native
  /* 9500 */ val RemoteClientAuth: RemoteClientAuth with scala.Double = js.native
  /* 9501 */ val RemoteClientAuthResponse: RemoteClientAuthResponse with scala.Double = js.native
  /* 9500 */ val RemoteClientBase: RemoteClientBase with scala.Double = js.native
  /* 9510 */ val RemoteClientGetControllerConfig: RemoteClientGetControllerConfig with scala.Double = js.native
  /* 9511 */ val RemoteClientGetControllerConfigResposne: RemoteClientGetControllerConfigResposne with scala.Double = js.native
  /* 9505 */ val RemoteClientPing: RemoteClientPing with scala.Double = js.native
  /* 9506 */ val RemoteClientPingResponse: RemoteClientPingResponse with scala.Double = js.native
  /* 9503 */ val RemoteClientStartStream: RemoteClientStartStream with scala.Double = js.native
  /* 9504 */ val RemoteClientStartStreamResponse: RemoteClientStartStreamResponse with scala.Double = js.native
  /* 9512 */ val RemoteClientStreamingEnabled: RemoteClientStreamingEnabled with scala.Double = js.native
  /* 128 */ val RemoteSysID: RemoteSysID with scala.Double = js.native
  /* 600 */ val ReqChallenge: ReqChallenge with scala.Double = js.native
  /* 602 */ val ReqChallengeTest: ReqChallengeTest with scala.Double = js.native
  /* 142 */ val RequestFullStatsBlock: RequestFullStatsBlock with scala.Double = js.native
  /* 1014 */ val RequestStatHistory: RequestStatHistory with scala.Double = js.native
  /* 233 */ val RequestWindowsEventLogEntries: RequestWindowsEventLogEntries with scala.Double = js.native
  /* 127 */ val RouteMessage: RouteMessage with scala.Double = js.native
  /* 120 */ val SCIDRequest: SCIDRequest with scala.Double = js.native
  /* 121 */ val SCIDResponse: SCIDResponse with scala.Double = js.native
  /* 9400 */ val SLCBase: SLCBase with scala.Double = js.native
  /* 9407 */ val SLCOwnerLibraryChanged: SLCOwnerLibraryChanged with scala.Double = js.native
  /* 9401 */ val SLCRequestUserSessionStatus: SLCRequestUserSessionStatus with scala.Double = js.native
  /* 9408 */ val SLCSharedLibraryChanged: SLCSharedLibraryChanged with scala.Double = js.native
  /* 9402 */ val SLCSharedLicensesLockStatus: SLCSharedLicensesLockStatus with scala.Double = js.native
  /* 9400 */ val SLCUserSessionStatus: SLCUserSessionStatus with scala.Double = js.native
  /* 2902 */ val SMExpensiveReport: SMExpensiveReport with scala.Double = js.native
  /* 2904 */ val SMFishingReport: SMFishingReport with scala.Double = js.native
  /* 2907 */ val SMGetSchemaConversionResults: SMGetSchemaConversionResults with scala.Double = js.native
  /* 2908 */ val SMGetSchemaConversionResultsResponse: SMGetSchemaConversionResultsResponse with scala.Double = js.native
  /* 2903 */ val SMHourlyReport: SMHourlyReport with scala.Double = js.native
  /* 2906 */ val SMMonitorSpace: SMMonitorSpace with scala.Double = js.native
  /* 2905 */ val SMPartitionRenames: SMPartitionRenames with scala.Double = js.native
  /* 8600 */ val SecretsBase: SecretsBase with scala.Double = js.native
  /* 8601 */ val SecretsCredentialPairResponse: SecretsCredentialPairResponse with scala.Double = js.native
  /* 8600 */ val SecretsRequestCredentialPair: SecretsRequestCredentialPair with scala.Double = js.native
  /* 8602 */ val SecretsRequestServerIdentity: SecretsRequestServerIdentity with scala.Double = js.native
  /* 8603 */ val SecretsServerIdentityResponse: SecretsServerIdentityResponse with scala.Double = js.native
  /* 8604 */ val SecretsUpdateServerIdentities: SecretsUpdateServerIdentities with scala.Double = js.native
  /* 146 */ val ServiceMethod: ServiceMethod with scala.Double = js.native
  /* 147 */ val ServiceMethodResponse: ServiceMethodResponse with scala.Double = js.native
  /* 317 */ val SetTestFlag: SetTestFlag with scala.Double = js.native
  /* 237 */ val ShellCheckWindowsUpdates: ShellCheckWindowsUpdates with scala.Double = js.native
  /* 238 */ val ShellCheckWindowsUpdatesResponse: ShellCheckWindowsUpdatesResponse with scala.Double = js.native
  /* 230 */ val ShellConfigInfoUpdate: ShellConfigInfoUpdate with scala.Double = js.native
  /* 301 */ val ShellFailed: ShellFailed with scala.Double = js.native
  /* 239 */ val ShellFlushUserLicenseCache: ShellFlushUserLicenseCache with scala.Double = js.native
  /* 235 */ val ShellSearchLogs: ShellSearchLogs with scala.Double = js.native
  /* 236 */ val ShellSearchLogsResponse: ShellSearchLogsResponse with scala.Double = js.native
  /* 1015 */ val StatHistory: StatHistory with scala.Double = js.native
  /* 141 */ val Stats: Stats with scala.Double = js.native
  /* 138 */ val StatsDeprecated: StatsDeprecated with scala.Double = js.native
  /* 8000 */ val StoreBase: StoreBase with scala.Double = js.native
  /* 8000 */ val StoreUpdateRecommendationCount: StoreUpdateRecommendationCount with scala.Double = js.native
  /* 126 */ val Subscribe: Subscribe with scala.Double = js.native
  /* 323 */ val TestInitDB: TestInitDB with scala.Double = js.native
  /* 228 */ val TestResetServer: TestResetServer with scala.Double = js.native
  /* 9200 */ val TestWorkerProcess: TestWorkerProcess with scala.Double = js.native
  /* 9200 */ val TestWorkerProcessLoadUnloadModuleRequest: TestWorkerProcessLoadUnloadModuleRequest with scala.Double = js.native
  /* 9201 */ val TestWorkerProcessLoadUnloadModuleResponse: TestWorkerProcessLoadUnloadModuleResponse with scala.Double = js.native
  /* 9202 */ val TestWorkerProcessServiceModuleCallRequest: TestWorkerProcessServiceModuleCallRequest with scala.Double = js.native
  /* 9203 */ val TestWorkerProcessServiceModuleCallResponse: TestWorkerProcessServiceModuleCallResponse with scala.Double = js.native
  /* 149 */ val TimestampRequest: TimestampRequest with scala.Double = js.native
  /* 150 */ val TimestampResponse: TimestampResponse with scala.Double = js.native
  /* 7335 */ val UCMAddTaggedScreenshot: UCMAddTaggedScreenshot with scala.Double = js.native
  /* 7300 */ val UCMBase: UCMBase with scala.Double = js.native
  /* 7372 */ val UCMDeleteOldScreenshot: UCMDeleteOldScreenshot with scala.Double = js.native
  /* 7373 */ val UCMDeleteOldScreenshotResponse: UCMDeleteOldScreenshotResponse with scala.Double = js.native
  /* 7374 */ val UCMDeleteOldVideo: UCMDeleteOldVideo with scala.Double = js.native
  /* 7375 */ val UCMDeleteOldVideoResponse: UCMDeleteOldVideoResponse with scala.Double = js.native
  /* 7329 */ val UCMDeletePublishedFile: UCMDeletePublishedFile with scala.Double = js.native
  /* 7330 */ val UCMDeletePublishedFileResponse: UCMDeletePublishedFileResponse with scala.Double = js.native
  /* 7371 */ val UCMFixStatsPublishedFile: UCMFixStatsPublishedFile with scala.Double = js.native
  /* 7362 */ val UCMGetPublishedFilesForUser: UCMGetPublishedFilesForUser with scala.Double = js.native
  /* 7363 */ val UCMGetPublishedFilesForUserResponse: UCMGetPublishedFilesForUserResponse with scala.Double = js.native
  /* 7369 */ val UCMGetUserSubscribedFiles: UCMGetUserSubscribedFiles with scala.Double = js.native
  /* 7370 */ val UCMGetUserSubscribedFilesResponse: UCMGetUserSubscribedFilesResponse with scala.Double = js.native
  /* 7351 */ val UCMPublishFile: UCMPublishFile with scala.Double = js.native
  /* 7352 */ val UCMPublishFileResponse: UCMPublishFileResponse with scala.Double = js.native
  /* 7353 */ val UCMPublishedFileChildAdd: UCMPublishedFileChildAdd with scala.Double = js.native
  /* 7354 */ val UCMPublishedFileChildAddResponse: UCMPublishedFileChildAddResponse with scala.Double = js.native
  /* 7357 */ val UCMPublishedFileChildChangeSortOrder: UCMPublishedFileChildChangeSortOrder with scala.Double = js.native
  /* 7358 */ val UCMPublishedFileChildChangeSortOrderResponse: UCMPublishedFileChildChangeSortOrderResponse with scala.Double = js.native
  /* 7355 */ val UCMPublishedFileChildRemove: UCMPublishedFileChildRemove with scala.Double = js.native
  /* 7356 */ val UCMPublishedFileChildRemoveResponse: UCMPublishedFileChildRemoveResponse with scala.Double = js.native
  /* 7380 */ val UCMPublishedFileContentUpdated: UCMPublishedFileContentUpdated with scala.Double = js.native
  /* 7359 */ val UCMPublishedFileParentChanged: UCMPublishedFileParentChanged with scala.Double = js.native
  /* 7341 */ val UCMPublishedFilePreviewAdd: UCMPublishedFilePreviewAdd with scala.Double = js.native
  /* 7342 */ val UCMPublishedFilePreviewAddResponse: UCMPublishedFilePreviewAddResponse with scala.Double = js.native
  /* 7345 */ val UCMPublishedFilePreviewChangeSortOrder: UCMPublishedFilePreviewChangeSortOrder with scala.Double = js.native
  /* 7346 */ val UCMPublishedFilePreviewChangeSortOrderResponse: UCMPublishedFilePreviewChangeSortOrderResponse with scala.Double = js.native
  /* 7343 */ val UCMPublishedFilePreviewRemove: UCMPublishedFilePreviewRemove with scala.Double = js.native
  /* 7344 */ val UCMPublishedFilePreviewRemoveResponse: UCMPublishedFilePreviewRemoveResponse with scala.Double = js.native
  /* 7339 */ val UCMPublishedFileReported: UCMPublishedFileReported with scala.Double = js.native
  /* 7349 */ val UCMPublishedFileSubscribed: UCMPublishedFileSubscribed with scala.Double = js.native
  /* 7350 */ val UCMPublishedFileUnsubscribed: UCMPublishedFileUnsubscribed with scala.Double = js.native
  /* 7381 */ val UCMPublishedFileUpdated: UCMPublishedFileUpdated with scala.Double = js.native
  /* 7337 */ val UCMReloadPublishedFile: UCMReloadPublishedFile with scala.Double = js.native
  /* 7338 */ val UCMReloadUserFileListCaches: UCMReloadUserFileListCaches with scala.Double = js.native
  /* 7336 */ val UCMRemoveTaggedScreenshot: UCMRemoveTaggedScreenshot with scala.Double = js.native
  /* 7307 */ val UCMResetCommunityContent: UCMResetCommunityContent with scala.Double = js.native
  /* 7308 */ val UCMResetCommunityContentResponse: UCMResetCommunityContentResponse with scala.Double = js.native
  /* 7376 */ val UCMUpdateOldScreenshotPrivacy: UCMUpdateOldScreenshotPrivacy with scala.Double = js.native
  /* 7377 */ val UCMUpdateOldScreenshotPrivacyResponse: UCMUpdateOldScreenshotPrivacyResponse with scala.Double = js.native
  /* 7327 */ val UCMUpdatePublishedFile: UCMUpdatePublishedFile with scala.Double = js.native
  /* 7332 */ val UCMUpdatePublishedFileBan: UCMUpdatePublishedFileBan with scala.Double = js.native
  /* 7333 */ val UCMUpdatePublishedFileBanResponse: UCMUpdatePublishedFileBanResponse with scala.Double = js.native
  /* 7340 */ val UCMUpdatePublishedFileIncompatibleStatus: UCMUpdatePublishedFileIncompatibleStatus with scala.Double = js.native
  /* 7328 */ val UCMUpdatePublishedFileResponse: UCMUpdatePublishedFileResponse with scala.Double = js.native
  /* 7331 */ val UCMUpdatePublishedFileStat: UCMUpdatePublishedFileStat with scala.Double = js.native
  /* 7334 */ val UCMUpdateTaggedScreenshot: UCMUpdateTaggedScreenshot with scala.Double = js.native
  /* 7303 */ val UCMValidateObjectExists: UCMValidateObjectExists with scala.Double = js.native
  /* 7304 */ val UCMValidateObjectExistsResponse: UCMValidateObjectExistsResponse with scala.Double = js.native
  /* 7000 */ val UDSBase: UDSBase with scala.Double = js.native
  /* 7006 */ val UDSFindSession: UDSFindSession with scala.Double = js.native
  /* 7007 */ val UDSFindSessionResponse: UDSFindSessionResponse with scala.Double = js.native
  /* 7006 */ val UDSHasSession: UDSHasSession with scala.Double = js.native
  /* 7007 */ val UDSHasSessionResponse: UDSHasSessionResponse with scala.Double = js.native
  /* 7003 */ val UDSRenderUserAuth: UDSRenderUserAuth with scala.Double = js.native
  /* 7004 */ val UDSRenderUserAuthResponse: UDSRenderUserAuthResponse with scala.Double = js.native
  /* 5223 */ val UFSDownloadChunk: UFSDownloadChunk with scala.Double = js.native
  /* 5246 */ val UFSDownloadChunkRequest: UFSDownloadChunkRequest with scala.Double = js.native
  /* 5247 */ val UFSDownloadChunkResponse: UFSDownloadChunkResponse with scala.Double = js.native
  /* 5248 */ val UFSDownloadFinishRequest: UFSDownloadFinishRequest with scala.Double = js.native
  /* 5249 */ val UFSDownloadFinishResponse: UFSDownloadFinishResponse with scala.Double = js.native
  /* 5221 */ val UFSDownloadRequest: UFSDownloadRequest with scala.Double = js.native
  /* 5222 */ val UFSDownloadResponse: UFSDownloadResponse with scala.Double = js.native
  /* 5244 */ val UFSDownloadStartRequest: UFSDownloadStartRequest with scala.Double = js.native
  /* 5245 */ val UFSDownloadStartResponse: UFSDownloadStartResponse with scala.Double = js.native
  /* 5250 */ val UFSFlushURLCache: UFSFlushURLCache with scala.Double = js.native
  /* 5240 */ val UFSGetUGCURLs: UFSGetUGCURLs with scala.Double = js.native
  /* 5241 */ val UFSGetUGCURLsResponse: UFSGetUGCURLsResponse with scala.Double = js.native
  /* 5242 */ val UFSHttpUploadFileFinishRequest: UFSHttpUploadFileFinishRequest with scala.Double = js.native
  /* 5243 */ val UFSHttpUploadFileFinishResponse: UFSHttpUploadFileFinishResponse with scala.Double = js.native
  /* 5238 */ val UFSMigrateFile: UFSMigrateFile with scala.Double = js.native
  /* 5253 */ val UFSMigrateFileAppID: UFSMigrateFileAppID with scala.Double = js.native
  /* 5254 */ val UFSMigrateFileAppIDResponse: UFSMigrateFileAppIDResponse with scala.Double = js.native
  /* 5239 */ val UFSMigrateFileResponse: UFSMigrateFileResponse with scala.Double = js.native
  /* 5234 */ val UFSReloadAccount: UFSReloadAccount with scala.Double = js.native
  /* 5235 */ val UFSReloadAccountResponse: UFSReloadAccountResponse with scala.Double = js.native
  /* 5215 */ val UFSReloadPartitionInfo: UFSReloadPartitionInfo with scala.Double = js.native
  /* 5217 */ val UFSSynchronizeFile: UFSSynchronizeFile with scala.Double = js.native
  /* 5218 */ val UFSSynchronizeFileResponse: UFSSynchronizeFileResponse with scala.Double = js.native
  /* 5228 */ val UFSUpdateFileFlags: UFSUpdateFileFlags with scala.Double = js.native
  /* 5229 */ val UFSUpdateFileFlagsResponse: UFSUpdateFileFlagsResponse with scala.Double = js.native
  /* 5236 */ val UFSUpdateRecordBatched: UFSUpdateRecordBatched with scala.Double = js.native
  /* 5237 */ val UFSUpdateRecordBatchedResponse: UFSUpdateRecordBatchedResponse with scala.Double = js.native
  /* 5251 */ val UFSUploadCommit: UFSUploadCommit with scala.Double = js.native
  /* 5252 */ val UFSUploadCommitResponse: UFSUploadCommitResponse with scala.Double = js.native
  /* 7900 */ val UGSBase: UGSBase with scala.Double = js.native
  /* 7900 */ val UGSUpdateGlobalStats: UGSUpdateGlobalStats with scala.Double = js.native
  /* 8108 */ val UMQ2AM_ClientMsgBatch: UMQ2AM_ClientMsgBatch with scala.Double = js.native
  /* 8100 */ val UMQBase: UMQBase with scala.Double = js.native
  /* 8110 */ val UMQEnqueueMobileAnnouncements: UMQEnqueueMobileAnnouncements with scala.Double = js.native
  /* 8109 */ val UMQEnqueueMobileSalePromotions: UMQEnqueueMobileSalePromotions with scala.Double = js.native
  /* 8105 */ val UMQIncomingChatMessage: UMQIncomingChatMessage with scala.Double = js.native
  /* 8102 */ val UMQLogoffRequest: UMQLogoffRequest with scala.Double = js.native
  /* 8103 */ val UMQLogoffResponse: UMQLogoffResponse with scala.Double = js.native
  /* 8100 */ val UMQLogonRequest: UMQLogonRequest with scala.Double = js.native
  /* 8101 */ val UMQLogonResponse: UMQLogonResponse with scala.Double = js.native
  /* 8106 */ val UMQPoll: UMQPoll with scala.Double = js.native
  /* 8107 */ val UMQPollResults: UMQPollResults with scala.Double = js.native
  /* 8104 */ val UMQSendChatMessage: UMQSendChatMessage with scala.Double = js.native
  /* 229 */ val UniverseChanged: UniverseChanged with scala.Double = js.native
  /* 1010 */ val UniverseData: UniverseData with scala.Double = js.native
  /* 322 */ val UpdateConfigFile: UpdateConfigFile with scala.Double = js.native
  /* 221 */ val UpdateCreditCardRequest: UpdateCreditCardRequest with scala.Double = js.native
  /* 215 */ val UpdateRecordResponse: UpdateRecordResponse with scala.Double = js.native
  /* 225 */ val UpdateUserBanResponse: UpdateUserBanResponse with scala.Double = js.native
  /* 601 */ val VACResponse: VACResponse with scala.Double = js.native
  /* 605 */ val VSAddCheat: VSAddCheat with scala.Double = js.native
  /* 608 */ val VSChallengeResultText: VSChallengeResultText with scala.Double = js.native
  /* 607 */ val VSGetChallengeResults: VSGetChallengeResults with scala.Double = js.native
  /* 611 */ val VSLoadDBFinished: VSLoadDBFinished with scala.Double = js.native
  /* 604 */ val VSMarkCheat: VSMarkCheat with scala.Double = js.native
  /* 606 */ val VSPurgeCodeModDB: VSPurgeCodeModDB with scala.Double = js.native
  /* 609 */ val VSReportLingerer: VSReportLingerer with scala.Double = js.native
  /* 610 */ val VSRequestManagedChallenge: VSRequestManagedChallenge with scala.Double = js.native
  /* 130 */ val WGRequest: WGRequest with scala.Double = js.native
  /* 131 */ val WGResponse: WGResponse with scala.Double = js.native
  /* 8300 */ val WebAPIBase: WebAPIBase with scala.Double = js.native
  /* 8304 */ val WebAPIInvalidateOAuthClientCache: WebAPIInvalidateOAuthClientCache with scala.Double = js.native
  /* 8305 */ val WebAPIInvalidateOAuthTokenCache: WebAPIInvalidateOAuthTokenCache with scala.Double = js.native
  /* 8302 */ val WebAPIInvalidateTokensForAccount: WebAPIInvalidateTokensForAccount with scala.Double = js.native
  /* 133 */ val WebAPIJobRequest: WebAPIJobRequest with scala.Double = js.native
  /* 134 */ val WebAPIJobResponse: WebAPIJobResponse with scala.Double = js.native
  /* 8303 */ val WebAPIRegisterGCInterfaces: WebAPIRegisterGCInterfaces with scala.Double = js.native
  /* 8306 */ val WebAPISetSecrets: WebAPISetSecrets with scala.Double = js.native
  /* 8300 */ val WebAPIValidateOAuth2Token: WebAPIValidateOAuth2Token with scala.Double = js.native
  /* 8301 */ val WebAPIValidateOAuth2TokenResponse: WebAPIValidateOAuth2TokenResponse with scala.Double = js.native
  /* 9000 */ val WorkerProcess: WorkerProcess with scala.Double = js.native
  /* 9000 */ val WorkerProcessPingRequest: WorkerProcessPingRequest with scala.Double = js.native
  /* 9001 */ val WorkerProcessPingResponse: WorkerProcessPingResponse with scala.Double = js.native
  /* 9002 */ val WorkerProcessShutdown: WorkerProcessShutdown with scala.Double = js.native
  /* 8200 */ val WorkshopAcceptTOSRequest: WorkshopAcceptTOSRequest with scala.Double = js.native
  /* 8201 */ val WorkshopAcceptTOSResponse: WorkshopAcceptTOSResponse with scala.Double = js.native
  /* 8200 */ val WorkshopBase: WorkshopBase with scala.Double = js.native
  /* 204 */ val ZipRequest: ZipRequest with scala.Double = js.native
  /* 205 */ val ZipResponse: ZipResponse with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EMsg with scala.Double] = js.native
}

