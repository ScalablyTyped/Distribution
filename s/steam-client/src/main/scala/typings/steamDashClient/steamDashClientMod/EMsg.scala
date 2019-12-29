package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EMsg extends js.Object

@JSImport("steam-client", "EMsg")
@js.native
object EMsg extends js.Object {
  @js.native
  sealed trait AIGetAppGCFlags extends EMsg
  
  @js.native
  sealed trait AIGetAppGCFlagsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AIGetAppInfo extends EMsg
  
   // obsolete
  @js.native
  sealed trait AIGetAppInfoResponse extends EMsg
  
  @js.native
  sealed trait AIGetAppList extends EMsg
  
  @js.native
  sealed trait AIGetAppListResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AISAppInfoTableChanged extends EMsg
  
  @js.native
  sealed trait AISCreateMarketingMessage extends EMsg
  
  @js.native
  sealed trait AISCreateMarketingMessageResponse extends EMsg
  
  @js.native
  sealed trait AISDeleteMarketingMessage extends EMsg
  
  @js.native
  sealed trait AISGetCouponDefinition extends EMsg
  
  @js.native
  sealed trait AISGetCouponDefinitionResponse extends EMsg
  
  @js.native
  sealed trait AISGetMarketingMessage extends EMsg
  
  @js.native
  sealed trait AISGetMarketingMessageResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AISGetMarketingTreatments extends EMsg
  
   // obsolete
  @js.native
  sealed trait AISGetMarketingTreatmentsResponse extends EMsg
  
  @js.native
  sealed trait AISGetPackageChangeNumber extends EMsg
  
  @js.native
  sealed trait AISGetPackageChangeNumberResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AISRefreshContentDescription extends EMsg
  
  @js.native
  sealed trait AISRequestContentDescription extends EMsg
  
  @js.native
  sealed trait AISRequestMarketingMessageUpdate extends EMsg
  
   // obsolete
  @js.native
  sealed trait AISRequestMarketingTreatmentUpdate extends EMsg
  
   // obsolete
  @js.native
  sealed trait AISTestAddPackage extends EMsg
  
  @js.native
  sealed trait AISTestEnableGC extends EMsg
  
  @js.native
  sealed trait AISUpdateAppInfo extends EMsg
  
  @js.native
  sealed trait AISUpdateMarketingMessage extends EMsg
  
  @js.native
  sealed trait AISUpdateMarketingMessageResponse extends EMsg
  
  @js.native
  sealed trait AISUpdatePackageCosts extends EMsg
  
  @js.native
  sealed trait AISUpdatePackageCostsResponse extends EMsg
  
   // obsolete "renamed to AISUpdatePackageCosts"
  @js.native
  sealed trait AISUpdatePackageInfo extends EMsg
  
  @js.native
  sealed trait AISUpdateSlaveContentDescription extends EMsg
  
  @js.native
  sealed trait AISUpdateSlaveContentDescriptionResponse extends EMsg
  
  @js.native
  sealed trait AMAccountPS3Unlink extends EMsg
  
  @js.native
  sealed trait AMAccountPS3UnlinkResponse extends EMsg
  
  @js.native
  sealed trait AMAcctAllowedToPurchase extends EMsg
  
  @js.native
  sealed trait AMAcctAllowedToPurchaseResponse extends EMsg
  
  @js.native
  sealed trait AMAcknowledgeClanInvite extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMAddClanNews extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMAddComment extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMAddCommentResponse extends EMsg
  
  @js.native
  sealed trait AMAddFounderToClan extends EMsg
  
  @js.native
  sealed trait AMAddFreeLicense extends EMsg
  
  @js.native
  sealed trait AMAddFreeLicenseResponse extends EMsg
  
  @js.native
  sealed trait AMAddFriend extends EMsg
  
  @js.native
  sealed trait AMAddFriendResponse extends EMsg
  
  @js.native
  sealed trait AMAddLicense extends EMsg
  
  @js.native
  sealed trait AMAddMinutesToLicense extends EMsg
  
  @js.native
  sealed trait AMAddPublisherUser extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMAddUsersToMarketingTreatment extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMAllowUserContentQuery extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMAllowUserContentResponse extends EMsg
  
  @js.native
  sealed trait AMAllowUserFilesRequest extends EMsg
  
  @js.native
  sealed trait AMAllowUserFilesResponse extends EMsg
  
  @js.native
  sealed trait AMAuthenticateUser extends EMsg
  
  @js.native
  sealed trait AMAuthenticateUserResponse extends EMsg
  
  @js.native
  sealed trait AMAuthenticatedPlayerList extends EMsg
  
  @js.native
  sealed trait AMBanFromChat extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMBeginProcessingLicenses extends EMsg
  
  @js.native
  sealed trait AMBitPayPayment extends EMsg
  
  @js.native
  sealed trait AMBitPayPaymentResponse extends EMsg
  
  @js.native
  sealed trait AMBoaCompraPayment extends EMsg
  
  @js.native
  sealed trait AMBoaCompraPaymentResponse extends EMsg
  
  @js.native
  sealed trait AMCancelEasyCollect extends EMsg
  
  @js.native
  sealed trait AMCancelEasyCollectResponse extends EMsg
  
  @js.native
  sealed trait AMCancelLicense extends EMsg
  
  @js.native
  sealed trait AMCancelPurchase extends EMsg
  
  @js.native
  sealed trait AMChallengeNotification extends EMsg
  
  @js.native
  sealed trait AMChallengeVerdict extends EMsg
  
  @js.native
  sealed trait AMChangeClanOwner extends EMsg
  
  @js.native
  sealed trait AMChatActionResult extends EMsg
  
  @js.native
  sealed trait AMChatCleanup extends EMsg
  
  @js.native
  sealed trait AMChatEnter extends EMsg
  
  @js.native
  sealed trait AMChatInvite extends EMsg
  
  @js.native
  sealed trait AMChatMulti extends EMsg
  
  @js.native
  sealed trait AMCheckClanInviteRateLimiting extends EMsg
  
  @js.native
  sealed trait AMCheckClanMembership extends EMsg
  
  @js.native
  sealed trait AMCheckClanMembershipResponse extends EMsg
  
  @js.native
  sealed trait AMClaimUnownedUserGift extends EMsg
  
  @js.native
  sealed trait AMClaimUnownedUserGiftResponse extends EMsg
  
  @js.native
  sealed trait AMClanCleanup extends EMsg
  
  @js.native
  sealed trait AMClanCleanupList extends EMsg
  
  @js.native
  sealed trait AMClanDataUpdated extends EMsg
  
  @js.native
  sealed trait AMClanPermissions extends EMsg
  
  @js.native
  sealed trait AMClanPermissionsResponse extends EMsg
  
  @js.native
  sealed trait AMClansInCommon extends EMsg
  
  @js.native
  sealed trait AMClansInCommonCount extends EMsg
  
  @js.native
  sealed trait AMClansInCommonCountResponse extends EMsg
  
  @js.native
  sealed trait AMClansInCommonResponse extends EMsg
  
  @js.native
  sealed trait AMClearDispute extends EMsg
  
  @js.native
  sealed trait AMClearDisputeResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMClearPersonaMetadataBlob extends EMsg
  
  @js.native
  sealed trait AMClientAcceptFriendInvite extends EMsg
  
  @js.native
  sealed trait AMClientAddFriendToGroup extends EMsg
  
  @js.native
  sealed trait AMClientAddFriendToGroupResponse extends EMsg
  
  @js.native
  sealed trait AMClientChatActionRelay extends EMsg
  
  @js.native
  sealed trait AMClientChatInviteRelay extends EMsg
  
  @js.native
  sealed trait AMClientChatMemberInfoRelay extends EMsg
  
  @js.native
  sealed trait AMClientChatMsgRelay extends EMsg
  
  @js.native
  sealed trait AMClientCreateFriendsGroup extends EMsg
  
  @js.native
  sealed trait AMClientCreateFriendsGroupResponse extends EMsg
  
  @js.native
  sealed trait AMClientDeleteFriendsGroup extends EMsg
  
  @js.native
  sealed trait AMClientDeleteFriendsGroupResponse extends EMsg
  
  @js.native
  sealed trait AMClientJoinChatRelay extends EMsg
  
  @js.native
  sealed trait AMClientNotPlaying extends EMsg
  
  @js.native
  sealed trait AMClientPublishRemovalFromSource extends EMsg
  
  @js.native
  sealed trait AMClientRemoveFriendFromGroup extends EMsg
  
  @js.native
  sealed trait AMClientRemoveFriendFromGroupResponse extends EMsg
  
  @js.native
  sealed trait AMClientRenameFriendsGroup extends EMsg
  
  @js.native
  sealed trait AMClientRenameFriendsGroupResponse extends EMsg
  
  @js.native
  sealed trait AMClientSetPlayerNickname extends EMsg
  
  @js.native
  sealed trait AMClientSetPlayerNicknameResponse extends EMsg
  
  @js.native
  sealed trait AMCompleteExternalPurchase extends EMsg
  
  @js.native
  sealed trait AMCompleteExternalPurchaseResponse extends EMsg
  
  @js.native
  sealed trait AMCompletePurchase extends EMsg
  
  @js.native
  sealed trait AMConvertClan extends EMsg
  
  @js.native
  sealed trait AMConvertWallet extends EMsg
  
  @js.native
  sealed trait AMConvertWalletResponse extends EMsg
  
  @js.native
  sealed trait AMCreateAccountRecord extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMCreateAccountRecordInSteam3 extends EMsg
  
  @js.native
  sealed trait AMCreateAccountResponse extends EMsg
  
  @js.native
  sealed trait AMCreateChargeback extends EMsg
  
  @js.native
  sealed trait AMCreateChargebackResponse extends EMsg
  
  @js.native
  sealed trait AMCreateChat extends EMsg
  
  @js.native
  sealed trait AMCreateChatResponse extends EMsg
  
  @js.native
  sealed trait AMCreateClan extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMCreateClanAnnouncement extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMCreateClanAnnouncementResponse extends EMsg
  
  @js.native
  sealed trait AMCreateClanEvent extends EMsg
  
  @js.native
  sealed trait AMCreateClanEventResponse extends EMsg
  
  @js.native
  sealed trait AMCreateClanResponse extends EMsg
  
  @js.native
  sealed trait AMCreateDispute extends EMsg
  
  @js.native
  sealed trait AMCreateDisputeResponse extends EMsg
  
  @js.native
  sealed trait AMCreateRefund extends EMsg
  
  @js.native
  sealed trait AMCreateRefundResponse extends EMsg
  
  @js.native
  sealed trait AMDegicaPayment extends EMsg
  
  @js.native
  sealed trait AMDegicaPaymentResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMDeleteClanAnnouncement extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMDeleteClanAnnouncementResponse extends EMsg
  
  @js.native
  sealed trait AMDeleteClanEvent extends EMsg
  
  @js.native
  sealed trait AMDeleteClanEventResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMDeleteComment extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMDeleteCommentResponse extends EMsg
  
  @js.native
  sealed trait AMDeleteStoredCard extends EMsg
  
  @js.native
  sealed trait AMDeleteStoredPaymentInfo extends EMsg
  
  @js.native
  sealed trait AMDeleteStoredPaypalAgreement extends EMsg
  
  @js.native
  sealed trait AMDumpClan extends EMsg
  
  @js.native
  sealed trait AMDumpUser extends EMsg
  
  @js.native
  sealed trait AMEClubPayment extends EMsg
  
  @js.native
  sealed trait AMEClubPaymentResponse extends EMsg
  
  @js.native
  sealed trait AMEditBanReason extends EMsg
  
  @js.native
  sealed trait AMExpireCaptchaByGID extends EMsg
  
  @js.native
  sealed trait AMExtendLicense extends EMsg
  
  @js.native
  sealed trait AMFinalizePurchase extends EMsg
  
  @js.native
  sealed trait AMFinalizePurchaseResponse extends EMsg
  
  @js.native
  sealed trait AMFindAccounts extends EMsg
  
  @js.native
  sealed trait AMFindAccountsResponse extends EMsg
  
  @js.native
  sealed trait AMFindClanUser extends EMsg
  
  @js.native
  sealed trait AMFindClanUserResponse extends EMsg
  
  @js.native
  sealed trait AMFindGSByIP extends EMsg
  
  @js.native
  sealed trait AMFindHungTransactions extends EMsg
  
  @js.native
  sealed trait AMFixPendingPurchase extends EMsg
  
  @js.native
  sealed trait AMFixPendingPurchaseResponse extends EMsg
  
  @js.native
  sealed trait AMFixPendingRefund extends EMsg
  
  @js.native
  sealed trait AMFoundGSByIP extends EMsg
  
  @js.native
  sealed trait AMFriendsInCommon extends EMsg
  
  @js.native
  sealed trait AMFriendsInCommonCountResponse extends EMsg
  
  @js.native
  sealed trait AMFriendsInCommonResponse extends EMsg
  
  @js.native
  sealed trait AMFriendsList extends EMsg
  
  @js.native
  sealed trait AMFriendsListResponse extends EMsg
  
  @js.native
  sealed trait AMGMSGameServerRemove extends EMsg
  
  @js.native
  sealed trait AMGMSGameServerUpdate extends EMsg
  
  @js.native
  sealed trait AMGSSearch extends EMsg
  
  @js.native
  sealed trait AMGameServerAccountChangePassword extends EMsg
  
  @js.native
  sealed trait AMGameServerAccountDeleteAccount extends EMsg
  
  @js.native
  sealed trait AMGameServerPlayerCompatibilityCheck extends EMsg
  
  @js.native
  sealed trait AMGameServerPlayerCompatibilityCheckResponse extends EMsg
  
  @js.native
  sealed trait AMGameServerRemove extends EMsg
  
  @js.native
  sealed trait AMGameServerUpdate extends EMsg
  
  @js.native
  sealed trait AMGetAccountBanInfo extends EMsg
  
  @js.native
  sealed trait AMGetAccountBanInfoResponse extends EMsg
  
  @js.native
  sealed trait AMGetAccountCommunityBanInfo extends EMsg
  
  @js.native
  sealed trait AMGetAccountCommunityBanInfoResponse extends EMsg
  
  @js.native
  sealed trait AMGetAccountDetails extends EMsg
  
  @js.native
  sealed trait AMGetAccountDetails2 extends EMsg
  
  @js.native
  sealed trait AMGetAccountDetailsResponse extends EMsg
  
  @js.native
  sealed trait AMGetAccountDetailsResponse2 extends EMsg
  
  @js.native
  sealed trait AMGetAccountEmailAddress extends EMsg
  
  @js.native
  sealed trait AMGetAccountEmailAddressResponse extends EMsg
  
  @js.native
  sealed trait AMGetAccountFlagsForWGSpoofing extends EMsg
  
  @js.native
  sealed trait AMGetAccountFlagsForWGSpoofingResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetAccountFriendsCount extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetAccountFriendsCountResponse extends EMsg
  
  @js.native
  sealed trait AMGetAccountLinks extends EMsg
  
  @js.native
  sealed trait AMGetAccountLinksResponse extends EMsg
  
  @js.native
  sealed trait AMGetAccountPSNInfo extends EMsg
  
  @js.native
  sealed trait AMGetAccountPSNInfoResponse extends EMsg
  
  @js.native
  sealed trait AMGetAccountResetDetailsRequest extends EMsg
  
  @js.native
  sealed trait AMGetAccountResetDetailsResponse extends EMsg
  
  @js.native
  sealed trait AMGetAccountStatus extends EMsg
  
  @js.native
  sealed trait AMGetAccountStatusResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetBillingAddress extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetBillingAddressResponse extends EMsg
  
  @js.native
  sealed trait AMGetCaptchaDataByGID extends EMsg
  
  @js.native
  sealed trait AMGetCaptchaDataByGIDResponse extends EMsg
  
  @js.native
  sealed trait AMGetCaptchaDataForIP extends EMsg
  
  @js.native
  sealed trait AMGetCaptchaDataForIPResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetCardList extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetCardListResponse extends EMsg
  
  @js.native
  sealed trait AMGetChatBanList extends EMsg
  
  @js.native
  sealed trait AMGetChatBanListResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetClanAnnouncements extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetClanAnnouncementsCount extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetClanAnnouncementsCountResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetClanAnnouncementsResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanDetails extends EMsg
  
  @js.native
  sealed trait AMGetClanDetailsForForumCreation extends EMsg
  
  @js.native
  sealed trait AMGetClanDetailsForForumCreationResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanDetailsResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanEvents extends EMsg
  
  @js.native
  sealed trait AMGetClanEventsResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanHistory extends EMsg
  
  @js.native
  sealed trait AMGetClanHistoryResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanMembers extends EMsg
  
  @js.native
  sealed trait AMGetClanMembersResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetClanMembershipList extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetClanMembershipListResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanOfficers extends EMsg
  
  @js.native
  sealed trait AMGetClanOfficersResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanPOTW extends EMsg
  
  @js.native
  sealed trait AMGetClanPOTWResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanPermissionBits extends EMsg
  
  @js.native
  sealed trait AMGetClanPermissionBitsResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanPermissionSettings extends EMsg
  
  @js.native
  sealed trait AMGetClanPermissionSettingsResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanRank extends EMsg
  
  @js.native
  sealed trait AMGetClanRankResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetComments extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetCommentsResponse extends EMsg
  
  @js.native
  sealed trait AMGetCommunityPrivacyState extends EMsg
  
  @js.native
  sealed trait AMGetCommunityPrivacyStateResponse extends EMsg
  
  @js.native
  sealed trait AMGetFinalPrice extends EMsg
  
  @js.native
  sealed trait AMGetFinalPriceResponse extends EMsg
  
  @js.native
  sealed trait AMGetFriendRelationship extends EMsg
  
  @js.native
  sealed trait AMGetFriendRelationshipResponse extends EMsg
  
  @js.native
  sealed trait AMGetFriendsLobbies extends EMsg
  
  @js.native
  sealed trait AMGetFriendsLobbiesResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetFriendsWishlistInfo extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetFriendsWishlistInfoResponse extends EMsg
  
  @js.native
  sealed trait AMGetGSPlayerList extends EMsg
  
  @js.native
  sealed trait AMGetGSPlayerListResponse extends EMsg
  
  @js.native
  sealed trait AMGetGameMembers extends EMsg
  
  @js.native
  sealed trait AMGetGameMembersResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetGiftTargetListRelay extends EMsg
  
  @js.native
  sealed trait AMGetIgnored extends EMsg
  
  @js.native
  sealed trait AMGetIgnoredResponse extends EMsg
  
  @js.native
  sealed trait AMGetLegacyGameKey extends EMsg
  
  @js.native
  sealed trait AMGetLegacyGameKeyResponse extends EMsg
  
  @js.native
  sealed trait AMGetLicenses extends EMsg
  
  @js.native
  sealed trait AMGetLicensesResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetLobbyList extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetLobbyListResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetLobbyMetadata extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetLobbyMetadataResponse extends EMsg
  
  @js.native
  sealed trait AMGetNameHistory extends EMsg
  
  @js.native
  sealed trait AMGetNameHistoryResponse extends EMsg
  
  @js.native
  sealed trait AMGetPaypalAgreements extends EMsg
  
  @js.native
  sealed trait AMGetPaypalAgreementsResponse extends EMsg
  
  @js.native
  sealed trait AMGetPendingNotificationCount extends EMsg
  
  @js.native
  sealed trait AMGetPendingNotificationCountResponse extends EMsg
  
  @js.native
  sealed trait AMGetPlayerBanDetails extends EMsg
  
  @js.native
  sealed trait AMGetPlayerBanDetailsResponse extends EMsg
  
  @js.native
  sealed trait AMGetPlayerLinkDetails extends EMsg
  
  @js.native
  sealed trait AMGetPlayerLinkDetailsResponse extends EMsg
  
  @js.native
  sealed trait AMGetPreviousCBAccount extends EMsg
  
  @js.native
  sealed trait AMGetPreviousCBAccountResponse extends EMsg
  
  @js.native
  sealed trait AMGetPurchaseStatus extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetSingleClanAnnouncement extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetSingleClanAnnouncementResponse extends EMsg
  
  @js.native
  sealed trait AMGetSingleClanEvent extends EMsg
  
  @js.native
  sealed trait AMGetSingleClanEventResponse extends EMsg
  
  @js.native
  sealed trait AMGetSteamIDForMicroTxn extends EMsg
  
  @js.native
  sealed trait AMGetSteamIDForMicroTxnResponse extends EMsg
  
  @js.native
  sealed trait AMGetStoredPaymentSummary extends EMsg
  
  @js.native
  sealed trait AMGetStoredPaymentSummaryResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserAchievementStatus extends EMsg
  
  @js.native
  sealed trait AMGetUserClansNews extends EMsg
  
  @js.native
  sealed trait AMGetUserClansNewsResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserCurrentGameInfo extends EMsg
  
  @js.native
  sealed trait AMGetUserCurrentGameInfoResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserFriendNewsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserFriendsMinutesPlayed extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserFriendsMinutesPlayedResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserGameStats extends EMsg
  
  @js.native
  sealed trait AMGetUserGameStatsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserGameplayInfo extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserGameplayInfoResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserGifts extends EMsg
  
  @js.native
  sealed trait AMGetUserGiftsResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserGroupStatus extends EMsg
  
  @js.native
  sealed trait AMGetUserGroupStatusResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserHistory extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserHistoryResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserLicenseHistory extends EMsg
  
  @js.native
  sealed trait AMGetUserLicenseHistoryResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserLicenseList extends EMsg
  
  @js.native
  sealed trait AMGetUserLicenseListResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserMinutesPlayed extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserMinutesPlayedResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserNews extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserNewsResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserNewsSubscriptions extends EMsg
  
  @js.native
  sealed trait AMGetUserNewsSubscriptionsResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserStats extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserVacBanList extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserVacBanListResponse extends EMsg
  
  @js.native
  sealed trait AMGetWalletConversionRate extends EMsg
  
  @js.native
  sealed trait AMGetWalletConversionRateResponse extends EMsg
  
  @js.native
  sealed trait AMGetWalletDetails extends EMsg
  
  @js.native
  sealed trait AMGetWalletDetailsResponse extends EMsg
  
  @js.native
  sealed trait AMGiftRevoked extends EMsg
  
  @js.native
  sealed trait AMGrantCoupon extends EMsg
  
  @js.native
  sealed trait AMGrantCouponResponse extends EMsg
  
  @js.native
  sealed trait AMGrantGuestPasses extends EMsg
  
  @js.native
  sealed trait AMGrantGuestPasses2 extends EMsg
  
  @js.native
  sealed trait AMGrantGuestPasses2Response extends EMsg
  
  @js.native
  sealed trait AMHandlePendingTransaction extends EMsg
  
  @js.native
  sealed trait AMHandlePendingTransactionResponse extends EMsg
  
  @js.native
  sealed trait AMInitPurchase extends EMsg
  
  @js.native
  sealed trait AMInitPurchaseResponse extends EMsg
  
  @js.native
  sealed trait AMInviteUserToClan extends EMsg
  
  @js.native
  sealed trait AMIsAccountInCaptchaGracePeriod extends EMsg
  
  @js.native
  sealed trait AMIsAccountInCaptchaGracePeriodResponse extends EMsg
  
  @js.native
  sealed trait AMIsPackageRestrictedInUserCountry extends EMsg
  
  @js.native
  sealed trait AMIsPackageRestrictedInUserCountryResponse extends EMsg
  
  @js.native
  sealed trait AMIsUserBanned extends EMsg
  
  @js.native
  sealed trait AMIsValidAccountID extends EMsg
  
  @js.native
  sealed trait AMJoinPublicClan extends EMsg
  
  @js.native
  sealed trait AMKickUserFromClan extends EMsg
  
  @js.native
  sealed trait AMLeaveClan extends EMsg
  
  @js.native
  sealed trait AMLoadActivationCodes extends EMsg
  
  @js.native
  sealed trait AMLoadActivationCodesResponse extends EMsg
  
  @js.native
  sealed trait AMLoadOEMTickets extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMLockProfile extends EMsg
  
  @js.native
  sealed trait AMLookupKey extends EMsg
  
  @js.native
  sealed trait AMLookupKeyResponse extends EMsg
  
  @js.native
  sealed trait AMMOLPayment extends EMsg
  
  @js.native
  sealed trait AMMOLPaymentResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMMarketingTreatmentUpdate extends EMsg
  
  @js.native
  sealed trait AMMoPayPayment extends EMsg
  
  @js.native
  sealed trait AMMoPayPaymentResponse extends EMsg
  
  @js.native
  sealed trait AMNameChange extends EMsg
  
  @js.native
  sealed trait AMNewChallenge extends EMsg
  
  @js.native
  sealed trait AMNotifyChatOfClanChange extends EMsg
  
  @js.native
  sealed trait AMNotifySessionDeviceAuthorized extends EMsg
  
  @js.native
  sealed trait AMP2PIntroducerMessage extends EMsg
  
  @js.native
  sealed trait AMPasswordHashUpgrade extends EMsg
  
  @js.native
  sealed trait AMPayPalPaymentsHubPayment extends EMsg
  
  @js.native
  sealed trait AMPayPalPaymentsHubPaymentResponse extends EMsg
  
  @js.native
  sealed trait AMPayelpPayment extends EMsg
  
  @js.native
  sealed trait AMPayelpPaymentResponse extends EMsg
  
  @js.native
  sealed trait AMPersonaChangeResponse extends EMsg
  
  @js.native
  sealed trait AMPlayerGetClanBasicDetails extends EMsg
  
  @js.native
  sealed trait AMPlayerGetClanBasicDetailsResponse extends EMsg
  
  @js.native
  sealed trait AMPlayerHostedOnGameServer extends EMsg
  
  @js.native
  sealed trait AMPlayerNicknameList extends EMsg
  
  @js.native
  sealed trait AMPlayerNicknameListResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMPrimePersonaStateCache extends EMsg
  
  @js.native
  sealed trait AMProbeClanMembershipList extends EMsg
  
  @js.native
  sealed trait AMProbeClanMembershipListResponse extends EMsg
  
  @js.native
  sealed trait AMPublishChatMemberInfo extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMPublishChatMetadata extends EMsg
  
  @js.native
  sealed trait AMPublishChatRoomInfo extends EMsg
  
  @js.native
  sealed trait AMPurchaseResponse extends EMsg
  
  @js.native
  sealed trait AMRecordBanEnforcement extends EMsg
  
  @js.native
  sealed trait AMRefreshGuestPasses extends EMsg
  
  @js.native
  sealed trait AMRefreshSessions extends EMsg
  
  @js.native
  sealed trait AMRegisterKey extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMRelayGetFriendsWhoPlayGame extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMRelayGetFriendsWhoPlayGameResponse extends EMsg
  
  @js.native
  sealed trait AMRelayPublishStatus extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMRelayToGC extends EMsg
  
  @js.native
  sealed trait AMReloadAccount extends EMsg
  
  @js.native
  sealed trait AMReloadGameGroupPolicy extends EMsg
  
  @js.native
  sealed trait AMRemoveFriend extends EMsg
  
  @js.native
  sealed trait AMRemovePublisherUser extends EMsg
  
  @js.native
  sealed trait AMRenewAgreement extends EMsg
  
  @js.native
  sealed trait AMRenewLicense extends EMsg
  
  @js.native
  sealed trait AMRequestAccountData extends EMsg
  
  @js.native
  sealed trait AMRequestAccountDataResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMRequestChatMetadata extends EMsg
  
  @js.native
  sealed trait AMRequestClanData extends EMsg
  
  @js.native
  sealed trait AMRequestClanDetails extends EMsg
  
   // obsolete "renamed to AMRequestClanData"
  @js.native
  sealed trait AMRequestFriendData extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMResetCommunityContent extends EMsg
  
  @js.native
  sealed trait AMResetUserVerificationGSByIP extends EMsg
  
  @js.native
  sealed trait AMResolveNegativeWalletCredits extends EMsg
  
  @js.native
  sealed trait AMResolveNegativeWalletCreditsResponse extends EMsg
  
  @js.native
  sealed trait AMResubmitPurchase extends EMsg
  
  @js.native
  sealed trait AMReverseChargeback extends EMsg
  
  @js.native
  sealed trait AMReverseChargebackResponse extends EMsg
  
  @js.native
  sealed trait AMRevokeLegacyGameKeys extends EMsg
  
  @js.native
  sealed trait AMRevokePurchaseResponse extends EMsg
  
  @js.native
  sealed trait AMRollbackGiftTransfer extends EMsg
  
  @js.native
  sealed trait AMRollbackGiftTransferResponse extends EMsg
  
  @js.native
  sealed trait AMRouteFriendMsg extends EMsg
  
  @js.native
  sealed trait AMRouteToClients extends EMsg
  
  @js.native
  sealed trait AMSendAccountInfoUpdate extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMSendEmail extends EMsg
  
  @js.native
  sealed trait AMSendQueuedEmails extends EMsg
  
  @js.native
  sealed trait AMSendSystemIMToUser extends EMsg
  
  @js.native
  sealed trait AMServiceModulesCache extends EMsg
  
  @js.native
  sealed trait AMServiceModulesCall extends EMsg
  
  @js.native
  sealed trait AMServiceModulesCallResponse extends EMsg
  
  @js.native
  sealed trait AMSessionInfoRequest extends EMsg
  
  @js.native
  sealed trait AMSessionInfoResponse extends EMsg
  
  @js.native
  sealed trait AMSessionQuery extends EMsg
  
  @js.native
  sealed trait AMSessionQueryResponse extends EMsg
  
  @js.native
  sealed trait AMSetAccountDetails extends EMsg
  
  @js.native
  sealed trait AMSetAccountFlags extends EMsg
  
  @js.native
  sealed trait AMSetAccountLinks extends EMsg
  
  @js.native
  sealed trait AMSetAccountLinksResponse extends EMsg
  
  @js.native
  sealed trait AMSetAccountTrustedRequest extends EMsg
  
  @js.native
  sealed trait AMSetAvatar extends EMsg
  
  @js.native
  sealed trait AMSetClanDetails extends EMsg
  
  @js.native
  sealed trait AMSetClanName extends EMsg
  
  @js.native
  sealed trait AMSetClanNameResponse extends EMsg
  
  @js.native
  sealed trait AMSetClanPOTW extends EMsg
  
  @js.native
  sealed trait AMSetClanPOTWResponse extends EMsg
  
  @js.native
  sealed trait AMSetClanPermissionBits extends EMsg
  
  @js.native
  sealed trait AMSetClanPermissionBitsResponse extends EMsg
  
  @js.native
  sealed trait AMSetClanPermissionSettings extends EMsg
  
  @js.native
  sealed trait AMSetClanPermissionSettingsResponse extends EMsg
  
  @js.native
  sealed trait AMSetClanRank extends EMsg
  
  @js.native
  sealed trait AMSetClanRankResponse extends EMsg
  
  @js.native
  sealed trait AMSetCommunityProfileSettings extends EMsg
  
  @js.native
  sealed trait AMSetCommunityProfileSettingsResponse extends EMsg
  
  @js.native
  sealed trait AMSetCommunityState extends EMsg
  
  @js.native
  sealed trait AMSetDRMTestConfig extends EMsg
  
  @js.native
  sealed trait AMSetFriendRelationshipNone extends EMsg
  
  @js.native
  sealed trait AMSetIgnored extends EMsg
  
  @js.native
  sealed trait AMSetIgnoredResponse extends EMsg
  
  @js.native
  sealed trait AMSetLicenseFlags extends EMsg
  
  @js.native
  sealed trait AMSetPersonaName extends EMsg
  
  @js.native
  sealed trait AMSetPreApproval extends EMsg
  
  @js.native
  sealed trait AMSetPreApprovalResponse extends EMsg
  
  @js.native
  sealed trait AMSetProfileURL extends EMsg
  
  @js.native
  sealed trait AMSetUserGiftUnowned extends EMsg
  
  @js.native
  sealed trait AMSetUserGiftUnownedResponse extends EMsg
  
  @js.native
  sealed trait AMSetUserNewsSubscriptions extends EMsg
  
  @js.native
  sealed trait AMSmart2PayPayment extends EMsg
  
  @js.native
  sealed trait AMSmart2PayPaymentResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMStoreCancelPurchase extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMStoreCompletePurchase extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMStoreGetFinalPrice extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMStoreGetFinalPriceResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMStoreInitPurchase extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMStoreInitPurchaseResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMStorePurchaseResponse extends EMsg
  
  @js.native
  sealed trait AMStoreUserStats extends EMsg
  
  @js.native
  sealed trait AMStoreUserStatsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMSubscribeToPersonaFeed extends EMsg
  
  @js.native
  sealed trait AMSupportChangeEmail extends EMsg
  
  @js.native
  sealed trait AMSupportChangePassword extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMSupportChangeSecretQA extends EMsg
  
  @js.native
  sealed trait AMSupportEnableOrDisable extends EMsg
  
  @js.native
  sealed trait AMSupportIsAccountEnabled extends EMsg
  
  @js.native
  sealed trait AMSupportIsAccountEnabledResponse extends EMsg
  
  @js.native
  sealed trait AMSupportKickSession extends EMsg
  
  @js.native
  sealed trait AMSupportRemoveAccountSecurity extends EMsg
  
  @js.native
  sealed trait AMSwapKioskDeposit extends EMsg
  
  @js.native
  sealed trait AMSwapKioskDepositResponse extends EMsg
  
  @js.native
  sealed trait AMTicketAuthRequestOrResponse extends EMsg
  
  @js.native
  sealed trait AMToMDSGetDepotDecryptionKey extends EMsg
  
  @js.native
  sealed trait AMTrackFailedAuthByIP extends EMsg
  
  @js.native
  sealed trait AMTransferLockedGifts extends EMsg
  
  @js.native
  sealed trait AMTransferLockedGiftsResponse extends EMsg
  
  @js.native
  sealed trait AMTwoFactorRecoverAuthenticatorRequest extends EMsg
  
  @js.native
  sealed trait AMTwoFactorRecoverAuthenticatorResponse extends EMsg
  
  @js.native
  sealed trait AMUnBanFromChat extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMUpdateBillingAddress extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMUpdateBillingAddressResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMUpdateChatMetadata extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMUpdateClanAnnouncement extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMUpdateClanAnnouncementResponse extends EMsg
  
  @js.native
  sealed trait AMUpdateClanEvent extends EMsg
  
  @js.native
  sealed trait AMUpdateClanEventResponse extends EMsg
  
  @js.native
  sealed trait AMUpdateGSPlayStats extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMUpdatePersonaStateCache extends EMsg
  
  @js.native
  sealed trait AMUpdateProviderStatus extends EMsg
  
  @js.native
  sealed trait AMUpdateUserBanRequest extends EMsg
  
  @js.native
  sealed trait AMUserClanList extends EMsg
  
  @js.native
  sealed trait AMUserClanListResponse extends EMsg
  
  @js.native
  sealed trait AMVACStatusUpdate extends EMsg
  
  @js.native
  sealed trait AMValidateCaptchaDataForIP extends EMsg
  
  @js.native
  sealed trait AMValidateCaptchaDataForIPResponse extends EMsg
  
  @js.native
  sealed trait AMValidateEmailLink extends EMsg
  
  @js.native
  sealed trait AMValidateEmailLinkResponse extends EMsg
  
  @js.native
  sealed trait AMValidatePasswordResetCodeAndSendSmsRequest extends EMsg
  
  @js.native
  sealed trait AMValidatePasswordResetCodeAndSendSmsResponse extends EMsg
  
  @js.native
  sealed trait AMValidateWGToken extends EMsg
  
  @js.native
  sealed trait AMValidateWGTokenResponse extends EMsg
  
  @js.native
  sealed trait AMVerfiyUser extends EMsg
  
  @js.native
  sealed trait AMVerifyDepotManagementRights extends EMsg
  
  @js.native
  sealed trait AMVerifyDepotManagementRightsResponse extends EMsg
  
  @js.native
  sealed trait AMWipeFriendsList extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMWriteNews extends EMsg
  
  @js.native
  sealed trait AMXsollaPayment extends EMsg
  
  @js.native
  sealed trait AMXsollaPaymentResponse extends EMsg
  
  @js.native
  sealed trait ATSCSPerfTestResponse extends EMsg
  
  @js.native
  sealed trait ATSCSPerfTestTask extends EMsg
  
  @js.native
  sealed trait ATSCallTest extends EMsg
  
  @js.native
  sealed trait ATSCallTestReply extends EMsg
  
  @js.native
  sealed trait ATSCycleTCM extends EMsg
  
  @js.native
  sealed trait ATSExternalStressActionResult extends EMsg
  
  @js.native
  sealed trait ATSExternalStressJobQueued extends EMsg
  
  @js.native
  sealed trait ATSExternalStressJobRunning extends EMsg
  
  @js.native
  sealed trait ATSExternalStressJobStart extends EMsg
  
  @js.native
  sealed trait ATSExternalStressJobStopAll extends EMsg
  
  @js.native
  sealed trait ATSExternalStressJobStopped extends EMsg
  
  @js.native
  sealed trait ATSInitDRMSStressTest extends EMsg
  
  @js.native
  sealed trait ATSRunFailServerTest extends EMsg
  
  @js.native
  sealed trait ATSStartExternalStress extends EMsg
  
  @js.native
  sealed trait ATSStartStressTest extends EMsg
  
  @js.native
  sealed trait ATSStarted extends EMsg
  
  @js.native
  sealed trait ATSStopStressTest extends EMsg
  
  @js.native
  sealed trait ATSUFSPerfTestResponse extends EMsg
  
  @js.native
  sealed trait ATSUFSPerfTestTask extends EMsg
  
  @js.native
  sealed trait AdminCmd extends EMsg
  
  @js.native
  sealed trait AdminCmdResponse extends EMsg
  
  @js.native
  sealed trait AdminConsoleTitle extends EMsg
  
  @js.native
  sealed trait AdminGCCommand extends EMsg
  
  @js.native
  sealed trait AdminGCGetCommandList extends EMsg
  
  @js.native
  sealed trait AdminGCGetCommandListResponse extends EMsg
  
  @js.native
  sealed trait AdminGCSpew extends EMsg
  
  @js.native
  sealed trait AdminLogEvent extends EMsg
  
  @js.native
  sealed trait AdminLogListenRequest extends EMsg
  
  @js.native
  sealed trait AdminMsgSpew extends EMsg
  
   // obsolete
  @js.native
  sealed trait AdminPwLogon extends EMsg
  
   // obsolete
  @js.native
  sealed trait AdminPwLogonResponse extends EMsg
  
  @js.native
  sealed trait AdminSpew extends EMsg
  
  @js.native
  sealed trait Alert extends EMsg
  
  @js.native
  sealed trait AllowUserToPlayQuery extends EMsg
  
  @js.native
  sealed trait AllowUserToPlayResponse extends EMsg
  
  @js.native
  sealed trait AssignSysID extends EMsg
  
  @js.native
  sealed trait BRPCheckActivationCodes extends EMsg
  
  @js.native
  sealed trait BRPCheckActivationCodesResponse extends EMsg
  
  @js.native
  sealed trait BRPCheckFinanceCloseOutDate extends EMsg
  
  @js.native
  sealed trait BRPCheckSettlementReports extends EMsg
  
  @js.native
  sealed trait BRPCommitGC extends EMsg
  
  @js.native
  sealed trait BRPCommitGCResponse extends EMsg
  
  @js.native
  sealed trait BRPCommitWP extends EMsg
  
  @js.native
  sealed trait BRPCommitWPResponse extends EMsg
  
  @js.native
  sealed trait BRPConvertToCurrentKeys extends EMsg
  
  @js.native
  sealed trait BRPConvertToCurrentKeysResponse extends EMsg
  
  @js.native
  sealed trait BRPFindHungTransactions extends EMsg
  
  @js.native
  sealed trait BRPPostTaxToAvalara extends EMsg
  
  @js.native
  sealed trait BRPPostTransactionTax extends EMsg
  
  @js.native
  sealed trait BRPPostTransactionTaxResponse extends EMsg
  
  @js.native
  sealed trait BRPProcessGCReports extends EMsg
  
  @js.native
  sealed trait BRPProcessIMReports extends EMsg
  
  @js.native
  sealed trait BRPProcessLicenses extends EMsg
  
  @js.native
  sealed trait BRPProcessLicensesResponse extends EMsg
  
  @js.native
  sealed trait BRPProcessPPReports extends EMsg
  
  @js.native
  sealed trait BRPProcessPartnerPayments extends EMsg
  
  @js.native
  sealed trait BRPProcessPaymentRules extends EMsg
  
  @js.native
  sealed trait BRPProcessUSBankReports extends EMsg
  
  @js.native
  sealed trait BRPProcessWPReports extends EMsg
  
  @js.native
  sealed trait BRPPruneCardUsageStats extends EMsg
  
  @js.native
  sealed trait BRPPruneCardUsageStatsResponse extends EMsg
  
  @js.native
  sealed trait BRPRemoveExpiredPaymentData extends EMsg
  
  @js.native
  sealed trait BRPRemoveExpiredPaymentDataResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait BRPSettleCB extends EMsg
  
   // obsolete
  @js.native
  sealed trait BRPSettleNOVA extends EMsg
  
  @js.native
  sealed trait BRPStartShippingJobs extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSBannedRequest extends EMsg
  
  @js.native
  sealed trait BSBoaCompraConfirmProductDelivery extends EMsg
  
  @js.native
  sealed trait BSBoaCompraConfirmProductDeliveryResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSChaseRFRRequest extends EMsg
  
  @js.native
  sealed trait BSCheckJobRunning extends EMsg
  
  @js.native
  sealed trait BSCheckJobRunningResponse extends EMsg
  
  @js.native
  sealed trait BSCommitGCTxn extends EMsg
  
  @js.native
  sealed trait BSCommitWPTxn extends EMsg
  
  @js.native
  sealed trait BSCompletePurchase extends EMsg
  
  @js.native
  sealed trait BSCompletePurchaseResponse extends EMsg
  
  @js.native
  sealed trait BSConvertToCurrentKeys extends EMsg
  
  @js.native
  sealed trait BSConvertToCurrentKeysResponse extends EMsg
  
  @js.native
  sealed trait BSGenerateBoaCompraMD5 extends EMsg
  
  @js.native
  sealed trait BSGenerateBoaCompraMD5Response extends EMsg
  
  @js.native
  sealed trait BSGenerateMoPayMD5 extends EMsg
  
  @js.native
  sealed trait BSGenerateMoPayMD5Response extends EMsg
  
  @js.native
  sealed trait BSGetBillingAddress extends EMsg
  
  @js.native
  sealed trait BSGetBillingAddressResponse extends EMsg
  
  @js.native
  sealed trait BSGetCreditCardInfo extends EMsg
  
  @js.native
  sealed trait BSGetCreditCardInfoResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSGetEvents extends EMsg
  
  @js.native
  sealed trait BSGetPayPalUserInfo extends EMsg
  
  @js.native
  sealed trait BSGetPayPalUserInfoResponse extends EMsg
  
  @js.native
  sealed trait BSGetProPackOrderStatus extends EMsg
  
  @js.native
  sealed trait BSGetProPackOrderStatusResponse extends EMsg
  
  @js.native
  sealed trait BSInitGCBankXferTxn extends EMsg
  
  @js.native
  sealed trait BSInitGCBankXferTxnResponse extends EMsg
  
  @js.native
  sealed trait BSInitPayPalTxn extends EMsg
  
  @js.native
  sealed trait BSInitPayPalTxnResponse extends EMsg
  
  @js.native
  sealed trait BSInitPurchase extends EMsg
  
  @js.native
  sealed trait BSInitPurchaseResponse extends EMsg
  
  @js.native
  sealed trait BSMoPayConfirmProductDelivery extends EMsg
  
  @js.native
  sealed trait BSMoPayConfirmProductDeliveryResponse extends EMsg
  
  @js.native
  sealed trait BSPaymentInstrBan extends EMsg
  
  @js.native
  sealed trait BSPaymentInstrBanResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSProcessGCReports extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSProcessPPReports extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSProcessUSBankReports extends EMsg
  
  @js.native
  sealed trait BSPruneCardUsageStats extends EMsg
  
  @js.native
  sealed trait BSPruneCardUsageStatsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSPurchaseResponse extends EMsg
  
  @js.native
  sealed trait BSPurchaseRunFraudChecks extends EMsg
  
  @js.native
  sealed trait BSPurchaseRunFraudChecksResponse extends EMsg
  
  @js.native
  sealed trait BSPurchaseStart extends EMsg
  
  @js.native
  sealed trait BSQiwiWalletInvoice extends EMsg
  
  @js.native
  sealed trait BSQiwiWalletInvoiceResponse extends EMsg
  
  @js.native
  sealed trait BSQueryBankInformation extends EMsg
  
  @js.native
  sealed trait BSQueryBankInformationResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSQueryCBOrderStatus extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSQueryCBOrderStatusResponse extends EMsg
  
  @js.native
  sealed trait BSQueryFindCreditCard extends EMsg
  
  @js.native
  sealed trait BSQueryFindCreditCardResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSQueryGCBankXferTxn extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSQueryGCBankXferTxnResponse extends EMsg
  
  @js.native
  sealed trait BSQueryPaymentInstResponse extends EMsg
  
  @js.native
  sealed trait BSQueryPaymentInstUsage extends EMsg
  
  @js.native
  sealed trait BSQueryTransactionStatus extends EMsg
  
  @js.native
  sealed trait BSQueryTransactionStatusResponse extends EMsg
  
  @js.native
  sealed trait BSQueryTxnExtendedInfo extends EMsg
  
  @js.native
  sealed trait BSQueryTxnExtendedInfoResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSRefundTxn extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSRefundTxnResponse extends EMsg
  
  @js.native
  sealed trait BSRemoveExpiredPaymentData extends EMsg
  
  @js.native
  sealed trait BSRemoveExpiredPaymentDataResponse extends EMsg
  
  @js.native
  sealed trait BSResetPackagePurchaseRateLimit extends EMsg
  
  @js.native
  sealed trait BSResetPackagePurchaseRateLimitResponse extends EMsg
  
  @js.native
  sealed trait BSReverseRedeemPOSAKey extends EMsg
  
  @js.native
  sealed trait BSReverseRedeemPOSAKeyResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSRunRedFlagReport extends EMsg
  
  @js.native
  sealed trait BSSendShippingRequest extends EMsg
  
  @js.native
  sealed trait BSSendShippingRequestResponse extends EMsg
  
  @js.native
  sealed trait BSSettleComplete extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSSettleNOVA extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSStartShippingJobs extends EMsg
  
  @js.native
  sealed trait BSStatusInquiryPOSAKey extends EMsg
  
  @js.native
  sealed trait BSStatusInquiryPOSAKeyResponse extends EMsg
  
  @js.native
  sealed trait BSStoreBankInformation extends EMsg
  
  @js.native
  sealed trait BSStoreBankInformationResponse extends EMsg
  
  @js.native
  sealed trait BSUpdateConversionRates extends EMsg
  
  @js.native
  sealed trait BSUpdateInventoryFromProPack extends EMsg
  
  @js.native
  sealed trait BSUpdateInventoryFromProPackResponse extends EMsg
  
  @js.native
  sealed trait BSUpdatePaymentData extends EMsg
  
  @js.native
  sealed trait BSUpdatePaymentDataResponse extends EMsg
  
  @js.native
  sealed trait BSValidateMoPaySignature extends EMsg
  
  @js.native
  sealed trait BSValidateMoPaySignatureResponse extends EMsg
  
  @js.native
  sealed trait BSValidateXsollaSignature extends EMsg
  
  @js.native
  sealed trait BSValidateXsollaSignatureResponse extends EMsg
  
  @js.native
  sealed trait BSVerifyPOSAKey extends EMsg
  
  @js.native
  sealed trait BSVerifyPOSAKeyResponse extends EMsg
  
  @js.native
  sealed trait BackpackAddToCurrency extends EMsg
  
  @js.native
  sealed trait BackpackAddToCurrencyResponse extends EMsg
  
  @js.native
  sealed trait BackpackBase extends EMsg
  
  @js.native
  sealed trait BadLoginIPList extends EMsg
  
  @js.native
  sealed trait BaseAIS extends EMsg
  
  @js.native
  sealed trait BaseAM extends EMsg
  
  @js.native
  sealed trait BaseAMRange2 extends EMsg
  
  @js.native
  sealed trait BaseATS extends EMsg
  
  @js.native
  sealed trait BaseAdmin extends EMsg
  
  @js.native
  sealed trait BaseBRP extends EMsg
  
  @js.native
  sealed trait BaseBS extends EMsg
  
  @js.native
  sealed trait BaseCCSRange extends EMsg
  
  @js.native
  sealed trait BaseCM extends EMsg
  
  @js.native
  sealed trait BaseCS extends EMsg
  
  @js.native
  sealed trait BaseChannelAuth extends EMsg
  
  @js.native
  sealed trait BaseClient extends EMsg
  
  @js.native
  sealed trait BaseClient2 extends EMsg
  
  @js.native
  sealed trait BaseClient3 extends EMsg
  
  @js.native
  sealed trait BaseDFS extends EMsg
  
  @js.native
  sealed trait BaseDP extends EMsg
  
  @js.native
  sealed trait BaseDRMS extends EMsg
  
   // obsolete
  @js.native
  sealed trait BaseDSS extends EMsg
  
   // obsolete
  @js.native
  sealed trait BaseEPM extends EMsg
  
  @js.native
  sealed trait BaseFBS extends EMsg
  
  @js.native
  sealed trait BaseFTSRange extends EMsg
  
  @js.native
  sealed trait BaseFileXfer extends EMsg
  
  @js.native
  sealed trait BaseGC extends EMsg
  
  @js.native
  sealed trait BaseGM extends EMsg
  
  @js.native
  sealed trait BaseGameServer extends EMsg
  
  @js.native
  sealed trait BaseGeneral extends EMsg
  
  @js.native
  sealed trait BaseLBSRange extends EMsg
  
  @js.native
  sealed trait BaseMDS extends EMsg
  
  @js.native
  sealed trait BaseOGS extends EMsg
  
  @js.native
  sealed trait BaseP2P extends EMsg
  
  @js.native
  sealed trait BasePSRange extends EMsg
  
  @js.native
  sealed trait BaseSM extends EMsg
  
  @js.native
  sealed trait BaseShell extends EMsg
  
  @js.native
  sealed trait BaseTest extends EMsg
  
  @js.native
  sealed trait BaseUFSRange extends EMsg
  
  @js.native
  sealed trait BaseVS extends EMsg
  
  @js.native
  sealed trait BoxMonitorBase extends EMsg
  
  @js.native
  sealed trait BoxMonitorReportRequest extends EMsg
  
  @js.native
  sealed trait BoxMonitorReportResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSAddComment extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSAddCommentResponse extends EMsg
  
  @js.native
  sealed trait CCSDeleteAllCommentsByAuthor extends EMsg
  
  @js.native
  sealed trait CCSDeleteAllCommentsByAuthorResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSDeleteComment extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSDeleteCommentResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSGetComments extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSGetCommentsForNews extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSGetCommentsForNewsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSGetCommentsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSNotifyCommentCount extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSPreloadComments extends EMsg
  
  @js.native
  sealed trait CEGPropStatusDRMSRequest extends EMsg
  
  @js.native
  sealed trait CEGPropStatusDRMSResponse extends EMsg
  
  @js.native
  sealed trait CEGVersionSetEnableDisableRequest extends EMsg
  
  @js.native
  sealed trait CEGVersionSetEnableDisableResponse extends EMsg
  
  @js.native
  sealed trait CEGWhackFailureReportRequest extends EMsg
  
  @js.native
  sealed trait CEGWhackFailureReportResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait CMAppInfoResponseDeprecated extends EMsg
  
  @js.native
  sealed trait CMSetAllowState extends EMsg
  
  @js.native
  sealed trait CMSpewAllowState extends EMsg
  
  @js.native
  sealed trait CREBase extends EMsg
  
  @js.native
  sealed trait CREEnumeratePublishedFiles extends EMsg
  
  @js.native
  sealed trait CREEnumeratePublishedFilesResponse extends EMsg
  
  @js.native
  sealed trait CREGetUserPublishedItemVoteDetails extends EMsg
  
  @js.native
  sealed trait CREGetUserPublishedItemVoteDetailsResponse extends EMsg
  
  @js.native
  sealed trait CREItemVoteSummary extends EMsg
  
  @js.native
  sealed trait CREItemVoteSummaryResponse extends EMsg
  
  @js.native
  sealed trait CREPublishedFileVoteAdded extends EMsg
  
   // obsolete
  @js.native
  sealed trait CRERankByTrend extends EMsg
  
   // obsolete
  @js.native
  sealed trait CRERankByTrendResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait CRERankByVote extends EMsg
  
   // obsolete
  @js.native
  sealed trait CRERankByVoteResponse extends EMsg
  
  @js.native
  sealed trait CREUpdateUserPublishedItemVote extends EMsg
  
  @js.native
  sealed trait CREUpdateUserPublishedItemVoteResponse extends EMsg
  
  @js.native
  sealed trait CSBase extends EMsg
  
  @js.native
  sealed trait CSPing extends EMsg
  
  @js.native
  sealed trait CSPingResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait CSUserContentApprove extends EMsg
  
   // obsolete
  @js.native
  sealed trait CSUserContentDeny extends EMsg
  
   // obsolete
  @js.native
  sealed trait CSUserContentRequest extends EMsg
  
  @js.native
  sealed trait ChannelAuthChallenge extends EMsg
  
  @js.native
  sealed trait ChannelAuthResponse extends EMsg
  
  @js.native
  sealed trait ChannelAuthResult extends EMsg
  
  @js.native
  sealed trait ChannelEncryptRequest extends EMsg
  
  @js.native
  sealed trait ChannelEncryptResponse extends EMsg
  
  @js.native
  sealed trait ChannelEncryptResult extends EMsg
  
  @js.native
  sealed trait ClientAMGetClanOfficers extends EMsg
  
  @js.native
  sealed trait ClientAMGetClanOfficersResponse extends EMsg
  
  @js.native
  sealed trait ClientAMGetPersonaNameHistory extends EMsg
  
  @js.native
  sealed trait ClientAMGetPersonaNameHistoryResponse extends EMsg
  
  @js.native
  sealed trait ClientAccountInfo extends EMsg
  
  @js.native
  sealed trait ClientAckGuestPass extends EMsg
  
  @js.native
  sealed trait ClientAckGuestPassResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAckMessageByGID extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAckPurchaseReceipt extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAckVACBan extends EMsg
  
  @js.native
  sealed trait ClientAckVACBan2 extends EMsg
  
  @js.native
  sealed trait ClientAcknowledgeClanInvite extends EMsg
  
  @js.native
  sealed trait ClientActivateOEMLicense extends EMsg
  
  @js.native
  sealed trait ClientAddFriend extends EMsg
  
  @js.native
  sealed trait ClientAddFriendResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAnonLogOn_Deprecated extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAnonUserLogOn_Deprecated extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAppInfoChanges extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAppInfoRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAppInfoResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAppInfoUpdate extends EMsg
  
  @js.native
  sealed trait ClientAppMinutesPlayedData extends EMsg
  
  @js.native
  sealed trait ClientAppUsageEvent extends EMsg
  
  @js.native
  sealed trait ClientAuthList extends EMsg
  
  @js.native
  sealed trait ClientAuthListAck extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAuthList_Deprecated extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAuthorizeLocalDevice extends EMsg
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceNotification extends EMsg
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceRequest extends EMsg
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceResponse extends EMsg
  
  @js.native
  sealed trait ClientBroadcastBase extends EMsg
  
  @js.native
  sealed trait ClientBroadcastDisconnect extends EMsg
  
  @js.native
  sealed trait ClientBroadcastFrames extends EMsg
  
  @js.native
  sealed trait ClientBroadcastInit extends EMsg
  
  @js.native
  sealed trait ClientBroadcastScreenshot extends EMsg
  
  @js.native
  sealed trait ClientBroadcastUploadConfig extends EMsg
  
  @js.native
  sealed trait ClientCMList extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientCancelLicense extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientCancelLicenseResponse extends EMsg
  
  @js.native
  sealed trait ClientChangeStatus extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientChangeSteamGuardOptions extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientChangeSteamGuardOptionsResponse extends EMsg
  
  @js.native
  sealed trait ClientChatAction extends EMsg
  
  @js.native
  sealed trait ClientChatActionResult extends EMsg
  
  @js.native
  sealed trait ClientChatDeclined extends EMsg
  
  @js.native
  sealed trait ClientChatEnter extends EMsg
  
  @js.native
  sealed trait ClientChatInvite extends EMsg
  
  @js.native
  sealed trait ClientChatMemberInfo extends EMsg
  
  @js.native
  sealed trait ClientChatMsg extends EMsg
  
  @js.native
  sealed trait ClientChatRoomInfo extends EMsg
  
  @js.native
  sealed trait ClientCheckAppBetaPassword extends EMsg
  
  @js.native
  sealed trait ClientCheckAppBetaPasswordResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientCheckFileSignature extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientCheckFileSignatureResponse extends EMsg
  
  @js.native
  sealed trait ClientCheckPassword extends EMsg
  
  @js.native
  sealed trait ClientCheckPasswordResponse extends EMsg
  
  @js.native
  sealed trait ClientClanState extends EMsg
  
  @js.native
  sealed trait ClientCommentNotifications extends EMsg
  
  @js.native
  sealed trait ClientConcurrentSessionsBase extends EMsg
  
  @js.native
  sealed trait ClientConnectionStats extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientContentServerLogOn_Deprecated extends EMsg
  
  @js.native
  sealed trait ClientCreateAccount2 extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientCreateAccount3 extends EMsg
  
  @js.native
  sealed trait ClientCreateAccountProto extends EMsg
  
  @js.native
  sealed trait ClientCreateAccountProtoResponse extends EMsg
  
  @js.native
  sealed trait ClientCreateAccountResponse extends EMsg
  
  @js.native
  sealed trait ClientCreateAcctResponse extends EMsg
  
  @js.native
  sealed trait ClientCreateChat extends EMsg
  
  @js.native
  sealed trait ClientCreateChatResponse extends EMsg
  
  @js.native
  sealed trait ClientCurrentUIMode extends EMsg
  
  @js.native
  sealed trait ClientDFSAuthenticateRequest extends EMsg
  
  @js.native
  sealed trait ClientDFSAuthenticateResponse extends EMsg
  
  @js.native
  sealed trait ClientDFSDownloadStatus extends EMsg
  
  @js.native
  sealed trait ClientDFSEndSession extends EMsg
  
  @js.native
  sealed trait ClientDPCheckSpecialSurvey extends EMsg
  
  @js.native
  sealed trait ClientDPCheckSpecialSurveyResponse extends EMsg
  
  @js.native
  sealed trait ClientDPContentStatsReport extends EMsg
  
  @js.native
  sealed trait ClientDPSendSpecialSurveyResponse extends EMsg
  
  @js.native
  sealed trait ClientDPSendSpecialSurveyResponseReply extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientDPSteam2AppStarted extends EMsg
  
  @js.native
  sealed trait ClientDPUpdateAppJobReport extends EMsg
  
  @js.native
  sealed trait ClientDRMBlobRequest extends EMsg
  
  @js.native
  sealed trait ClientDRMBlobResponse extends EMsg
  
  @js.native
  sealed trait ClientDRMDownloadRequest extends EMsg
  
  @js.native
  sealed trait ClientDRMDownloadRequestWithCrashData extends EMsg
  
  @js.native
  sealed trait ClientDRMDownloadResponse extends EMsg
  
  @js.native
  sealed trait ClientDRMFinalResult extends EMsg
  
  @js.native
  sealed trait ClientDRMProblemReport extends EMsg
  
  @js.native
  sealed trait ClientDRMTest extends EMsg
  
  @js.native
  sealed trait ClientDRMTestResult extends EMsg
  
  @js.native
  sealed trait ClientDeauthorizeDevice extends EMsg
  
  @js.native
  sealed trait ClientDeauthorizeDeviceRequest extends EMsg
  
  @js.native
  sealed trait ClientDeregisterWithServer extends EMsg
  
  @js.native
  sealed trait ClientDisableTestLicense extends EMsg
  
  @js.native
  sealed trait ClientDisableTestLicenseResponse extends EMsg
  
  @js.native
  sealed trait ClientDownloadRateStatistics extends EMsg
  
  @js.native
  sealed trait ClientEmailAddrInfo extends EMsg
  
  @js.native
  sealed trait ClientEmailChange3 extends EMsg
  
  @js.native
  sealed trait ClientEmailChange4 extends EMsg
  
  @js.native
  sealed trait ClientEmailChangeResponse extends EMsg
  
  @js.native
  sealed trait ClientEmailChangeResponse4 extends EMsg
  
  @js.native
  sealed trait ClientEmoticonList extends EMsg
  
  @js.native
  sealed trait ClientEnableTestLicense extends EMsg
  
  @js.native
  sealed trait ClientEnableTestLicenseResponse extends EMsg
  
  @js.native
  sealed trait ClientEncryptPct extends EMsg
  
  @js.native
  sealed trait ClientFSEnumerateFollowingList extends EMsg
  
  @js.native
  sealed trait ClientFSEnumerateFollowingListResponse extends EMsg
  
  @js.native
  sealed trait ClientFSGetFollowerCount extends EMsg
  
  @js.native
  sealed trait ClientFSGetFollowerCountResponse extends EMsg
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistory extends EMsg
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistoryForOfflineMessages extends EMsg
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistoryResponse extends EMsg
  
  @js.native
  sealed trait ClientFSGetFriendsSteamLevels extends EMsg
  
  @js.native
  sealed trait ClientFSGetFriendsSteamLevelsResponse extends EMsg
  
  @js.native
  sealed trait ClientFSGetIsFollowing extends EMsg
  
  @js.native
  sealed trait ClientFSGetIsFollowingResponse extends EMsg
  
  @js.native
  sealed trait ClientFSOfflineMessageNotification extends EMsg
  
  @js.native
  sealed trait ClientFSRequestOfflineMessageCount extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientFavoritesList extends EMsg
  
  @js.native
  sealed trait ClientFileToDownload extends EMsg
  
  @js.native
  sealed trait ClientFileToDownloadResponse extends EMsg
  
  @js.native
  sealed trait ClientFriendMsg extends EMsg
  
  @js.native
  sealed trait ClientFriendMsgEchoToSender extends EMsg
  
  @js.native
  sealed trait ClientFriendMsgIncoming extends EMsg
  
  @js.native
  sealed trait ClientFriendProfileInfo extends EMsg
  
  @js.native
  sealed trait ClientFriendProfileInfoResponse extends EMsg
  
  @js.native
  sealed trait ClientFriendRemovedFromSource extends EMsg
  
  @js.native
  sealed trait ClientFriendUserStatusPublished extends EMsg
  
  @js.native
  sealed trait ClientFriendsGroupsList extends EMsg
  
  @js.native
  sealed trait ClientFriendsList extends EMsg
  
  @js.native
  sealed trait ClientFromGC extends EMsg
  
  @js.native
  sealed trait ClientGCMsgFailed extends EMsg
  
  @js.native
  sealed trait ClientGMSServerQuery extends EMsg
  
  @js.native
  sealed trait ClientGameConnectDeny extends EMsg
  
  @js.native
  sealed trait ClientGameConnectTokens extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGameConnect_obsolete extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGameEnded_obsolete extends EMsg
  
  @js.native
  sealed trait ClientGamesPlayed extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGamesPlayed2_obsolete extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGamesPlayed3_obsolete extends EMsg
  
  @js.native
  sealed trait ClientGamesPlayedNoDataBlob extends EMsg
  
  @js.native
  sealed trait ClientGamesPlayedWithDataBlob extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGamesPlayed_obsolete extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetAppBetaPasswords extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetAppBetaPasswordsResponse extends EMsg
  
  @js.native
  sealed trait ClientGetAppOwnershipTicket extends EMsg
  
  @js.native
  sealed trait ClientGetAppOwnershipTicketResponse extends EMsg
  
  @js.native
  sealed trait ClientGetAuthorizedDevices extends EMsg
  
  @js.native
  sealed trait ClientGetAuthorizedDevicesResponse extends EMsg
  
  @js.native
  sealed trait ClientGetCDNAuthToken extends EMsg
  
  @js.native
  sealed trait ClientGetCDNAuthTokenResponse extends EMsg
  
  @js.native
  sealed trait ClientGetClanActivityCounts extends EMsg
  
  @js.native
  sealed trait ClientGetClanActivityCountsResponse extends EMsg
  
  @js.native
  sealed trait ClientGetClientAppList extends EMsg
  
  @js.native
  sealed trait ClientGetClientAppListResponse extends EMsg
  
  @js.native
  sealed trait ClientGetClientDetails extends EMsg
  
  @js.native
  sealed trait ClientGetClientDetailsResponse extends EMsg
  
  @js.native
  sealed trait ClientGetDepotDecryptionKey extends EMsg
  
  @js.native
  sealed trait ClientGetDepotDecryptionKeyResponse extends EMsg
  
  @js.native
  sealed trait ClientGetEmoticonList extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetFinalPrice extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetFinalPriceResponse extends EMsg
  
  @js.native
  sealed trait ClientGetFriendsWhoPlayGame extends EMsg
  
  @js.native
  sealed trait ClientGetFriendsWhoPlayGameResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetGiftTargetList extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetGiftTargetListResponse extends EMsg
  
  @js.native
  sealed trait ClientGetLegacyGameKey extends EMsg
  
  @js.native
  sealed trait ClientGetLegacyGameKeyResponse extends EMsg
  
  @js.native
  sealed trait ClientGetLicenses extends EMsg
  
  @js.native
  sealed trait ClientGetLobbyListResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetLobbyMetadata extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetLobbyMetadataResponse extends EMsg
  
  @js.native
  sealed trait ClientGetMicroTxnInfo extends EMsg
  
  @js.native
  sealed trait ClientGetMicroTxnInfoResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayers extends EMsg
  
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersDP extends EMsg
  
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersDPResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersResponse extends EMsg
  
  @js.native
  sealed trait ClientGetPurchaseReceipts extends EMsg
  
  @js.native
  sealed trait ClientGetUserStats extends EMsg
  
  @js.native
  sealed trait ClientGetUserStatsResponse extends EMsg
  
  @js.native
  sealed trait ClientHeartBeat extends EMsg
  
  @js.native
  sealed trait ClientHideFriend extends EMsg
  
  @js.native
  sealed trait ClientInformOfCreateAccount extends EMsg
  
  @js.native
  sealed trait ClientInformOfResetForgottenPassword extends EMsg
  
  @js.native
  sealed trait ClientInformOfResetForgottenPasswordResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientInitPurchase extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientInitPurchaseResponse extends EMsg
  
  @js.native
  sealed trait ClientInstallClientApp extends EMsg
  
  @js.native
  sealed trait ClientInstallClientAppResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientInviteFriend extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientInviteFriendResponse extends EMsg
  
  @js.native
  sealed trait ClientInviteUserToClan extends EMsg
  
  @js.native
  sealed trait ClientIsLimitedAccount extends EMsg
  
  @js.native
  sealed trait ClientItemAnnouncements extends EMsg
  
  @js.native
  sealed trait ClientJoinChat extends EMsg
  
  @js.native
  sealed trait ClientKickPlayingSession extends EMsg
  
  @js.native
  sealed trait ClientLBSFindOrCreateLB extends EMsg
  
  @js.native
  sealed trait ClientLBSFindOrCreateLBResponse extends EMsg
  
  @js.native
  sealed trait ClientLBSGetLBEntries extends EMsg
  
  @js.native
  sealed trait ClientLBSGetLBEntriesResponse extends EMsg
  
  @js.native
  sealed trait ClientLBSSetScore extends EMsg
  
  @js.native
  sealed trait ClientLBSSetScoreResponse extends EMsg
  
  @js.native
  sealed trait ClientLBSSetUGC extends EMsg
  
  @js.native
  sealed trait ClientLBSSetUGCResponse extends EMsg
  
  @js.native
  sealed trait ClientLicenseList extends EMsg
  
  @js.native
  sealed trait ClientLogOff extends EMsg
  
  @js.native
  sealed trait ClientLogOnResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientLogOnWithCredentials_Deprecated extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientLogOnWithHash_Deprecated extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientLogOn_Deprecated extends EMsg
  
  @js.native
  sealed trait ClientLoggedOff extends EMsg
  
  @js.native
  sealed trait ClientLogon extends EMsg
  
  @js.native
  sealed trait ClientLogonGameServer extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientLookupKey extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientLookupKeyResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetDepotManifest extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetDepotManifestChunk extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetDepotManifestResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetPrevDepotBuild extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetPrevDepotBuildResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSHeartbeat extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSInitDepotBuildRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSInitDepotBuildResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSInitWorkshopBuildRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSInitWorkshopBuildResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSLoginRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSLoginResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSRegisterAppBuild extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSRegisterAppBuildResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSSetAppBuildLive extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSSetAppBuildLiveResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSSignInstallScript extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSSignInstallScriptResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSTransmitManifestDataChunk extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadDepotChunks extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadDepotChunksResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadManifestRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadManifestResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadRateTest extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadRateTestResponse extends EMsg
  
  @js.native
  sealed trait ClientMMSCreateLobby extends EMsg
  
  @js.native
  sealed trait ClientMMSCreateLobbyResponse extends EMsg
  
  @js.native
  sealed trait ClientMMSFlushFrenemyListCache extends EMsg
  
  @js.native
  sealed trait ClientMMSFlushFrenemyListCacheResponse extends EMsg
  
  @js.native
  sealed trait ClientMMSGetLobbyData extends EMsg
  
  @js.native
  sealed trait ClientMMSGetLobbyList extends EMsg
  
  @js.native
  sealed trait ClientMMSGetLobbyListResponse extends EMsg
  
  @js.native
  sealed trait ClientMMSInviteToLobby extends EMsg
  
  @js.native
  sealed trait ClientMMSJoinLobby extends EMsg
  
  @js.native
  sealed trait ClientMMSJoinLobbyResponse extends EMsg
  
  @js.native
  sealed trait ClientMMSLeaveLobby extends EMsg
  
  @js.native
  sealed trait ClientMMSLeaveLobbyResponse extends EMsg
  
  @js.native
  sealed trait ClientMMSLobbyChatMsg extends EMsg
  
  @js.native
  sealed trait ClientMMSLobbyData extends EMsg
  
  @js.native
  sealed trait ClientMMSLobbyGameServerSet extends EMsg
  
  @js.native
  sealed trait ClientMMSSendLobbyChatMsg extends EMsg
  
  @js.native
  sealed trait ClientMMSSetLobbyData extends EMsg
  
  @js.native
  sealed trait ClientMMSSetLobbyDataResponse extends EMsg
  
  @js.native
  sealed trait ClientMMSSetLobbyGameServer extends EMsg
  
  @js.native
  sealed trait ClientMMSSetLobbyLinked extends EMsg
  
  @js.native
  sealed trait ClientMMSSetLobbyOwner extends EMsg
  
  @js.native
  sealed trait ClientMMSSetLobbyOwnerResponse extends EMsg
  
  @js.native
  sealed trait ClientMMSUserJoinedLobby extends EMsg
  
  @js.native
  sealed trait ClientMMSUserLeftLobby extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMarketingMessageUpdate extends EMsg
  
  @js.native
  sealed trait ClientMarketingMessageUpdate2 extends EMsg
  
  @js.native
  sealed trait ClientMicroTxnAuthRequest extends EMsg
  
  @js.native
  sealed trait ClientMicroTxnAuthorize extends EMsg
  
  @js.native
  sealed trait ClientMicroTxnAuthorizeResponse extends EMsg
  
  @js.native
  sealed trait ClientNOP extends EMsg
  
  @js.native
  sealed trait ClientNatTraversalStatEvent extends EMsg
  
  @js.native
  sealed trait ClientNewLoginKey extends EMsg
  
  @js.native
  sealed trait ClientNewLoginKeyAccepted extends EMsg
  
  @js.native
  sealed trait ClientNewsUpdate extends EMsg
  
  @js.native
  sealed trait ClientNoUDPConnectivity extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientNotLoggedOnDeprecated extends EMsg
  
  @js.native
  sealed trait ClientOGSBeginSession extends EMsg
  
  @js.native
  sealed trait ClientOGSBeginSessionResponse extends EMsg
  
  @js.native
  sealed trait ClientOGSEndSession extends EMsg
  
  @js.native
  sealed trait ClientOGSEndSessionResponse extends EMsg
  
  @js.native
  sealed trait ClientOGSGameServerPingSample extends EMsg
  
  @js.native
  sealed trait ClientOGSReportBug extends EMsg
  
  @js.native
  sealed trait ClientOGSReportString extends EMsg
  
  @js.native
  sealed trait ClientOGSWriteRow extends EMsg
  
  @js.native
  sealed trait ClientP2PConnectionFailInfo extends EMsg
  
  @js.native
  sealed trait ClientP2PConnectionInfo extends EMsg
  
  @js.native
  sealed trait ClientP2PIntroducerMessage extends EMsg
  
  @js.native
  sealed trait ClientPICSAccessTokenRequest extends EMsg
  
  @js.native
  sealed trait ClientPICSAccessTokenResponse extends EMsg
  
  @js.native
  sealed trait ClientPICSChangesSinceRequest extends EMsg
  
  @js.native
  sealed trait ClientPICSChangesSinceResponse extends EMsg
  
  @js.native
  sealed trait ClientPICSProductInfoRequest extends EMsg
  
  @js.native
  sealed trait ClientPICSProductInfoResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientPackageInfoRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientPackageInfoResponse extends EMsg
  
  @js.native
  sealed trait ClientPackageVersions extends EMsg
  
  @js.native
  sealed trait ClientPasswordChange3 extends EMsg
  
  @js.native
  sealed trait ClientPasswordChangeResponse extends EMsg
  
  @js.native
  sealed trait ClientPersonaChangeResponse extends EMsg
  
  @js.native
  sealed trait ClientPersonaState extends EMsg
  
  @js.native
  sealed trait ClientPersonalQAChange3 extends EMsg
  
  @js.native
  sealed trait ClientPing extends EMsg
  
  @js.native
  sealed trait ClientPingResponse extends EMsg
  
  @js.native
  sealed trait ClientPlayerNicknameList extends EMsg
  
  @js.native
  sealed trait ClientPlayingSessionState extends EMsg
  
  @js.native
  sealed trait ClientPurchaseResponse extends EMsg
  
  @js.native
  sealed trait ClientPurchaseWithMachineID extends EMsg
  
  @js.native
  sealed trait ClientReadMachineAuth extends EMsg
  
  @js.native
  sealed trait ClientReadMachineAuthResponse extends EMsg
  
  @js.native
  sealed trait ClientRedeemGuestPass extends EMsg
  
  @js.native
  sealed trait ClientRedeemGuestPassResponse extends EMsg
  
  @js.native
  sealed trait ClientRegisterAuthTicketWithCM extends EMsg
  
  @js.native
  sealed trait ClientRegisterKey extends EMsg
  
  @js.native
  sealed trait ClientRegisterOEMMachine extends EMsg
  
  @js.native
  sealed trait ClientRegisterOEMMachineResponse extends EMsg
  
  @js.native
  sealed trait ClientRemoveFriend extends EMsg
  
  @js.native
  sealed trait ClientReportOverlayDetourFailure extends EMsg
  
  @js.native
  sealed trait ClientRequestAccountData extends EMsg
  
  @js.native
  sealed trait ClientRequestAccountDataResponse extends EMsg
  
  @js.native
  sealed trait ClientRequestAuthList extends EMsg
  
  @js.native
  sealed trait ClientRequestChangeMail extends EMsg
  
  @js.native
  sealed trait ClientRequestChangeMailResponse extends EMsg
  
  @js.native
  sealed trait ClientRequestCommentNotifications extends EMsg
  
  @js.native
  sealed trait ClientRequestEncryptedAppTicket extends EMsg
  
  @js.native
  sealed trait ClientRequestEncryptedAppTicketResponse extends EMsg
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmail extends EMsg
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmail3 extends EMsg
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmailResponse extends EMsg
  
  @js.native
  sealed trait ClientRequestFreeLicense extends EMsg
  
  @js.native
  sealed trait ClientRequestFreeLicenseResponse extends EMsg
  
  @js.native
  sealed trait ClientRequestFriendData extends EMsg
  
  @js.native
  sealed trait ClientRequestFriendship extends EMsg
  
  @js.native
  sealed trait ClientRequestItemAnnouncements extends EMsg
  
  @js.native
  sealed trait ClientRequestMachineAuth extends EMsg
  
  @js.native
  sealed trait ClientRequestMachineAuthResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientRequestOAuthTokenForApp extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientRequestOAuthTokenForAppResponse extends EMsg
  
  @js.native
  sealed trait ClientRequestValidationMail extends EMsg
  
  @js.native
  sealed trait ClientRequestValidationMailResponse extends EMsg
  
  @js.native
  sealed trait ClientRequestWebAPIAuthenticateUserNonce extends EMsg
  
  @js.native
  sealed trait ClientRequestWebAPIAuthenticateUserNonceResponse extends EMsg
  
  @js.native
  sealed trait ClientRequestedClientStats extends EMsg
  
  @js.native
  sealed trait ClientResetForgottenPassword extends EMsg
  
  @js.native
  sealed trait ClientResetForgottenPassword3 extends EMsg
  
  @js.native
  sealed trait ClientResetForgottenPassword4 extends EMsg
  
  @js.native
  sealed trait ClientResetForgottenPasswordResponse extends EMsg
  
  @js.native
  sealed trait ClientResetPassword extends EMsg
  
  @js.native
  sealed trait ClientResetPasswordResponse extends EMsg
  
  @js.native
  sealed trait ClientRichPresenceInfo extends EMsg
  
  @js.native
  sealed trait ClientRichPresenceRequest extends EMsg
  
  @js.native
  sealed trait ClientRichPresenceUpload extends EMsg
  
  @js.native
  sealed trait ClientScreenshotsChanged extends EMsg
  
  @js.native
  sealed trait ClientSecretQAChangeResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientSendGuestPass extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientSendGuestPassResponse extends EMsg
  
  @js.native
  sealed trait ClientSentLogs extends EMsg
  
  @js.native
  sealed trait ClientServerList extends EMsg
  
  @js.native
  sealed trait ClientServerUnavailable extends EMsg
  
  @js.native
  sealed trait ClientServersAvailable extends EMsg
  
  @js.native
  sealed trait ClientServiceCall extends EMsg
  
  @js.native
  sealed trait ClientServiceCallResponse extends EMsg
  
  @js.native
  sealed trait ClientServiceMethod extends EMsg
  
  @js.native
  sealed trait ClientServiceMethodResponse extends EMsg
  
  @js.native
  sealed trait ClientServiceModule extends EMsg
  
  @js.native
  sealed trait ClientSessionEnd extends EMsg
  
  @js.native
  sealed trait ClientSessionStart extends EMsg
  
  @js.native
  sealed trait ClientSessionToken extends EMsg
  
  @js.native
  sealed trait ClientSessionUpdate extends EMsg
  
   // obsolete "renamed to ClientSessionUpdate"
  @js.native
  sealed trait ClientSessionUpdateAuthTicket extends EMsg
  
  @js.native
  sealed trait ClientSetClientAppUpdateState extends EMsg
  
  @js.native
  sealed trait ClientSetClientAppUpdateStateResponse extends EMsg
  
  @js.native
  sealed trait ClientSetHeartbeatRate extends EMsg
  
  @js.native
  sealed trait ClientSetIgnoreFriend extends EMsg
  
  @js.native
  sealed trait ClientSetIgnoreFriendResponse extends EMsg
  
   // obsolete "renamed to SLCBase"
  @js.native
  sealed trait ClientSharedLibraryBase extends EMsg
  
  @js.native
  sealed trait ClientSharedLibraryLockStatus extends EMsg
  
  @js.native
  sealed trait ClientSharedLibraryStopPlaying extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientSharedLicensesLockStatus extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientSharedLicensesStopPlaying extends EMsg
  
  @js.native
  sealed trait ClientStat extends EMsg
  
  @js.native
  sealed trait ClientStat2 extends EMsg
  
  @js.native
  sealed trait ClientStat2Int32 extends EMsg
  
  @js.native
  sealed trait ClientStatsUpdated extends EMsg
  
  @js.native
  sealed trait ClientSteamUsageEvent extends EMsg
  
  @js.native
  sealed trait ClientStoreUserStats extends EMsg
  
  @js.native
  sealed trait ClientStoreUserStats2 extends EMsg
  
  @js.native
  sealed trait ClientStoreUserStatsResponse extends EMsg
  
  @js.native
  sealed trait ClientSubscribeToPersonaFeed extends EMsg
  
  @js.native
  sealed trait ClientSystemIM extends EMsg
  
  @js.native
  sealed trait ClientSystemIMAck extends EMsg
  
  @js.native
  sealed trait ClientTicketAuthComplete extends EMsg
  
  @js.native
  sealed trait ClientToGC extends EMsg
  
  @js.native
  sealed trait ClientUCMAddScreenshot extends EMsg
  
  @js.native
  sealed trait ClientUCMAddScreenshotResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMDeletePublishedFile extends EMsg
  
  @js.native
  sealed trait ClientUCMDeletePublishedFileResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMDeleteScreenshot extends EMsg
  
  @js.native
  sealed trait ClientUCMDeleteScreenshotResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMEnumeratePublishedFilesByUserAction extends EMsg
  
  @js.native
  sealed trait ClientUCMEnumeratePublishedFilesByUserActionResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMEnumerateUserPublishedFiles extends EMsg
  
  @js.native
  sealed trait ClientUCMEnumerateUserPublishedFilesResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFiles extends EMsg
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesWithUpdates extends EMsg
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUCMGetPublishedFileDetails extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUCMGetPublishedFileDetailsResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMGetPublishedFilesForUser extends EMsg
  
  @js.native
  sealed trait ClientUCMGetPublishedFilesForUserResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMPublishFile extends EMsg
  
  @js.native
  sealed trait ClientUCMPublishFileResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMPublishedFileDeleted extends EMsg
  
  @js.native
  sealed trait ClientUCMPublishedFileSubscribed extends EMsg
  
  @js.native
  sealed trait ClientUCMPublishedFileUnsubscribed extends EMsg
  
  @js.native
  sealed trait ClientUCMSetUserPublishedFileAction extends EMsg
  
  @js.native
  sealed trait ClientUCMSetUserPublishedFileActionResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUCMSubscribePublishedFile extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUCMSubscribePublishedFileResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUCMUnsubscribePublishedFile extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUCMUnsubscribePublishedFileResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMUpdatePublishedFile extends EMsg
  
  @js.native
  sealed trait ClientUCMUpdatePublishedFileResponse extends EMsg
  
  @js.native
  sealed trait ClientUDSInviteToGame extends EMsg
  
  @js.native
  sealed trait ClientUDSP2PSessionEnded extends EMsg
  
  @js.native
  sealed trait ClientUDSP2PSessionStarted extends EMsg
  
  @js.native
  sealed trait ClientUFSDeleteFileRequest extends EMsg
  
  @js.native
  sealed trait ClientUFSDeleteFileResponse extends EMsg
  
  @js.native
  sealed trait ClientUFSDownloadChunk extends EMsg
  
  @js.native
  sealed trait ClientUFSDownloadRequest extends EMsg
  
  @js.native
  sealed trait ClientUFSDownloadResponse extends EMsg
  
  @js.native
  sealed trait ClientUFSGetFileListForApp extends EMsg
  
  @js.native
  sealed trait ClientUFSGetFileListForAppResponse extends EMsg
  
  @js.native
  sealed trait ClientUFSGetSingleFileInfo extends EMsg
  
  @js.native
  sealed trait ClientUFSGetSingleFileInfoResponse extends EMsg
  
  @js.native
  sealed trait ClientUFSGetUGCDetails extends EMsg
  
  @js.native
  sealed trait ClientUFSGetUGCDetailsResponse extends EMsg
  
  @js.native
  sealed trait ClientUFSLoginRequest extends EMsg
  
  @js.native
  sealed trait ClientUFSLoginResponse extends EMsg
  
  @js.native
  sealed trait ClientUFSShareFile extends EMsg
  
  @js.native
  sealed trait ClientUFSShareFileResponse extends EMsg
  
  @js.native
  sealed trait ClientUFSTransferHeartbeat extends EMsg
  
  @js.native
  sealed trait ClientUFSUploadFileChunk extends EMsg
  
  @js.native
  sealed trait ClientUFSUploadFileFinished extends EMsg
  
  @js.native
  sealed trait ClientUFSUploadFileRequest extends EMsg
  
  @js.native
  sealed trait ClientUFSUploadFileResponse extends EMsg
  
  @js.native
  sealed trait ClientUGSGetGlobalStats extends EMsg
  
  @js.native
  sealed trait ClientUGSGetGlobalStatsResponse extends EMsg
  
  @js.native
  sealed trait ClientUninstallClientApp extends EMsg
  
  @js.native
  sealed trait ClientUninstallClientAppResponse extends EMsg
  
  @js.native
  sealed trait ClientUnlockStreaming extends EMsg
  
  @js.native
  sealed trait ClientUnlockStreamingResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUpdateChatMetadata extends EMsg
  
  @js.native
  sealed trait ClientUpdateGuestPassesList extends EMsg
  
  @js.native
  sealed trait ClientUpdateMachineAuth extends EMsg
  
  @js.native
  sealed trait ClientUpdateMachineAuthResponse extends EMsg
  
  @js.native
  sealed trait ClientUpdateUserGameInfo extends EMsg
  
  @js.native
  sealed trait ClientUseLocalDeviceAuthorizations extends EMsg
  
  @js.native
  sealed trait ClientUserNotifications extends EMsg
  
  @js.native
  sealed trait ClientVACBanStatus extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientVACChallenge extends EMsg
  
  @js.native
  sealed trait ClientVACResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientVTTCert extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientVacStatusQuery extends EMsg
  
  @js.native
  sealed trait ClientVacStatusResponse extends EMsg
  
  @js.native
  sealed trait ClientVanityURLChangedNotification extends EMsg
  
  @js.native
  sealed trait ClientVerifyPassword extends EMsg
  
  @js.native
  sealed trait ClientVerifyPasswordResponse extends EMsg
  
  @js.native
  sealed trait ClientVoiceCallPreAuthorize extends EMsg
  
  @js.native
  sealed trait ClientVoiceCallPreAuthorizeResponse extends EMsg
  
  @js.native
  sealed trait ClientWalletInfoUpdate extends EMsg
  
  @js.native
  sealed trait ClientWorkshopItemChangesRequest extends EMsg
  
  @js.native
  sealed trait ClientWorkshopItemChangesResponse extends EMsg
  
  @js.native
  sealed trait ClientWorkshopItemInfoRequest extends EMsg
  
  @js.native
  sealed trait ClientWorkshopItemInfoResponse extends EMsg
  
  @js.native
  sealed trait CommunityAddFriendNews extends EMsg
  
  @js.native
  sealed trait CommunityDeleteUserNews extends EMsg
  
  @js.native
  sealed trait CommunityGetUserFriendNews extends EMsg
  
  @js.native
  sealed trait ContentDescriptionUpdate extends EMsg
  
  @js.native
  sealed trait DFSAcceptedResponse extends EMsg
  
  @js.native
  sealed trait DFSConnection extends EMsg
  
  @js.native
  sealed trait DFSConnectionReply extends EMsg
  
  @js.native
  sealed trait DFSGetFile extends EMsg
  
  @js.native
  sealed trait DFSGetFileFromServer extends EMsg
  
  @js.native
  sealed trait DFSInstallLocalFile extends EMsg
  
  @js.native
  sealed trait DFSPurgeFile extends EMsg
  
  @js.native
  sealed trait DFSRecvTransmitFile extends EMsg
  
  @js.native
  sealed trait DFSRequestPingback extends EMsg
  
  @js.native
  sealed trait DFSRequestPingback2 extends EMsg
  
  @js.native
  sealed trait DFSResponsePingback2 extends EMsg
  
  @js.native
  sealed trait DFSRouteFile extends EMsg
  
  @js.native
  sealed trait DFSRouteFileResponse extends EMsg
  
  @js.native
  sealed trait DFSSendTransmitFile extends EMsg
  
  @js.native
  sealed trait DFSStartTransfer extends EMsg
  
  @js.native
  sealed trait DFSTransferComplete extends EMsg
  
  @js.native
  sealed trait DPAccountCreationStats extends EMsg
  
  @js.native
  sealed trait DPAchievementStats extends EMsg
  
  @js.native
  sealed trait DPBlockingStats extends EMsg
  
  @js.native
  sealed trait DPCloudStats extends EMsg
  
   // obsolete
  @js.native
  sealed trait DPDownloadRateStatistics extends EMsg
  
  @js.native
  sealed trait DPFacebookStatistics extends EMsg
  
   // obsolete
  @js.native
  sealed trait DPGamePlayedStats extends EMsg
  
  @js.native
  sealed trait DPGameServersPlayersStats extends EMsg
  
  @js.native
  sealed trait DPGetPlayerCount extends EMsg
  
  @js.native
  sealed trait DPGetPlayerCountResponse extends EMsg
  
  @js.native
  sealed trait DPNatTraversalStats extends EMsg
  
  @js.native
  sealed trait DPPartnerMicroTxns extends EMsg
  
  @js.native
  sealed trait DPPartnerMicroTxnsResponse extends EMsg
  
  @js.native
  sealed trait DPSetPublishingState extends EMsg
  
   // obsolete
  @js.native
  sealed trait DPSteamUsageEvent extends EMsg
  
  @js.native
  sealed trait DPStoreSaleStatistics extends EMsg
  
  @js.native
  sealed trait DPStreamingUniquePlayersStat extends EMsg
  
  @js.native
  sealed trait DPUniquePlayersStat extends EMsg
  
  @js.native
  sealed trait DPUpdateContentEvent extends EMsg
  
  @js.native
  sealed trait DPVRUniquePlayersStat extends EMsg
  
  @js.native
  sealed trait DPVacBanStats extends EMsg
  
  @js.native
  sealed trait DPVacCafeBanStats extends EMsg
  
  @js.native
  sealed trait DPVacCertBanStats extends EMsg
  
  @js.native
  sealed trait DPVacInfractionStats extends EMsg
  
  @js.native
  sealed trait DRMAdminUpdate extends EMsg
  
  @js.native
  sealed trait DRMAdminUpdateResponse extends EMsg
  
  @js.native
  sealed trait DRMBuildBlobRequest extends EMsg
  
  @js.native
  sealed trait DRMBuildBlobResponse extends EMsg
  
  @js.native
  sealed trait DRMDetailsReportRequest extends EMsg
  
  @js.native
  sealed trait DRMDetailsReportResponse extends EMsg
  
  @js.native
  sealed trait DRMEmptyGuidCache extends EMsg
  
  @js.native
  sealed trait DRMEmptyGuidCacheResponse extends EMsg
  
  @js.native
  sealed trait DRMProcessFile extends EMsg
  
  @js.native
  sealed trait DRMProcessFileResponse extends EMsg
  
  @js.native
  sealed trait DRMRange2 extends EMsg
  
  @js.native
  sealed trait DRMResolveGuidRequest extends EMsg
  
  @js.native
  sealed trait DRMResolveGuidResponse extends EMsg
  
  @js.native
  sealed trait DRMSFetchVersionSet extends EMsg
  
  @js.native
  sealed trait DRMSFetchVersionSetResponse extends EMsg
  
  @js.native
  sealed trait DRMStabilityReport extends EMsg
  
  @js.native
  sealed trait DRMStabilityReportResponse extends EMsg
  
  @js.native
  sealed trait DRMSync extends EMsg
  
  @js.native
  sealed trait DRMSyncResponse extends EMsg
  
  @js.native
  sealed trait DRMVariabilityReport extends EMsg
  
  @js.native
  sealed trait DRMVariabilityReportResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcess extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessAnalyzeFileRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessAnalyzeFileResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessBackfillOriginalRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessBackfillOriginalResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessDRMAndSign extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessDRMAndSignResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessDescribeSecretRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessDescribeSecretResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessEvaluateCrashRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessEvaluateCrashResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessExamineBlobRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessExamineBlobResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessGetBlobRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessGetBlobResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait DRMWorkerProcessGetDRMGuidsFromFileRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait DRMWorkerProcessGetDRMGuidsFromFileResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessInstallAllRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessInstallAllResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessInstallDRMDLLRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessInstallDRMDLLResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessInstallProcessedFilesRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessInstallProcessedFilesResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessSecretIdStringRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessSecretIdStringResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessSplitAndInstallRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessSplitAndInstallResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessSteamworksInfoRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessSteamworksInfoResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessUnpackBlobRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessUnpackBlobResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessValidateDRMDLLRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessValidateDRMDLLResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessValidateFileRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessValidateFileResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait DSSCurrentFileList extends EMsg
  
   // obsolete
  @js.native
  sealed trait DSSNewFile extends EMsg
  
   // obsolete
  @js.native
  sealed trait DSSSynchList extends EMsg
  
   // obsolete
  @js.native
  sealed trait DSSSynchListResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait DSSSynchSubscribe extends EMsg
  
   // obsolete
  @js.native
  sealed trait DSSSynchUnsubscribe extends EMsg
  
  @js.native
  sealed trait DestJobFailed extends EMsg
  
  @js.native
  sealed trait DeviceAuthorizationBase extends EMsg
  
  @js.native
  sealed trait DirRequest extends EMsg
  
  @js.native
  sealed trait DirResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait EPMRestartProcess extends EMsg
  
   // obsolete
  @js.native
  sealed trait EPMStartProcess extends EMsg
  
   // obsolete
  @js.native
  sealed trait EPMStopProcess extends EMsg
  
  @js.native
  sealed trait EconBase extends EMsg
  
  @js.native
  sealed trait EconCDKeyProcessTransaction extends EMsg
  
  @js.native
  sealed trait EconCDKeyProcessTransactionResponse extends EMsg
  
  @js.native
  sealed trait EconFlushInventoryCache extends EMsg
  
  @js.native
  sealed trait EconFlushInventoryCacheResponse extends EMsg
  
  @js.native
  sealed trait EconGetErrorLogs extends EMsg
  
  @js.native
  sealed trait EconGetErrorLogsResponse extends EMsg
  
  @js.native
  sealed trait EconTrading_CancelTradeRequest extends EMsg
  
  @js.native
  sealed trait EconTrading_InitiateTradeProposed extends EMsg
  
  @js.native
  sealed trait EconTrading_InitiateTradeRequest extends EMsg
  
  @js.native
  sealed trait EconTrading_InitiateTradeResponse extends EMsg
  
  @js.native
  sealed trait EconTrading_InitiateTradeResult extends EMsg
  
  @js.native
  sealed trait EconTrading_StartSession extends EMsg
  
  @js.native
  sealed trait Exit extends EMsg
  
  @js.native
  sealed trait ExitShell extends EMsg
  
  @js.native
  sealed trait ExitShells extends EMsg
  
  @js.native
  sealed trait FBSApplyAccountCred extends EMsg
  
  @js.native
  sealed trait FBSApplyAccountCredResponse extends EMsg
  
  @js.native
  sealed trait FBSApplyOSUpdates extends EMsg
  
  @js.native
  sealed trait FBSBootstrapperGetPackageChunk extends EMsg
  
  @js.native
  sealed trait FBSBootstrapperGetPackageChunkResponse extends EMsg
  
  @js.native
  sealed trait FBSBootstrapperPackageRequest extends EMsg
  
  @js.native
  sealed trait FBSBootstrapperPackageResponse extends EMsg
  
  @js.native
  sealed trait FBSBootstrapperPackageTransferProgress extends EMsg
  
  @js.native
  sealed trait FBSConnectionData extends EMsg
  
  @js.native
  sealed trait FBSDeployHotFixPackage extends EMsg
  
  @js.native
  sealed trait FBSDeployHotFixResponse extends EMsg
  
  @js.native
  sealed trait FBSDeployPackage extends EMsg
  
  @js.native
  sealed trait FBSDeployResponse extends EMsg
  
  @js.native
  sealed trait FBSDownloadHotFix extends EMsg
  
  @js.native
  sealed trait FBSDownloadHotFixResponse extends EMsg
  
  @js.native
  sealed trait FBSForceBounce extends EMsg
  
  @js.native
  sealed trait FBSForceRefresh extends EMsg
  
  @js.native
  sealed trait FBSInfoFromBootstrapper extends EMsg
  
  @js.native
  sealed trait FBSMinidumpServer extends EMsg
  
  @js.native
  sealed trait FBSQueryGMForRequest extends EMsg
  
  @js.native
  sealed trait FBSQueryGMResponse extends EMsg
  
  @js.native
  sealed trait FBSRebootBox extends EMsg
  
  @js.native
  sealed trait FBSRebootBoxResponse extends EMsg
  
  @js.native
  sealed trait FBSReqVersion extends EMsg
  
  @js.native
  sealed trait FBSRestartBootstrapper extends EMsg
  
  @js.native
  sealed trait FBSRunCMDScript extends EMsg
  
  @js.native
  sealed trait FBSSetBigBrotherMode extends EMsg
  
  @js.native
  sealed trait FBSSetShellCount extends EMsg
  
   // obsolete
  @js.native
  sealed trait FBSSetShellCount_obsolete extends EMsg
  
  @js.native
  sealed trait FBSSetState extends EMsg
  
  @js.native
  sealed trait FBSTerminateShell extends EMsg
  
  @js.native
  sealed trait FBSTerminateZombies extends EMsg
  
  @js.native
  sealed trait FBSUpdateBootstrapper extends EMsg
  
  @js.native
  sealed trait FBSUpdateTargetConfigFile extends EMsg
  
  @js.native
  sealed trait FBSVersionInfo extends EMsg
  
  @js.native
  sealed trait FSAddOrRemoveFollower extends EMsg
  
  @js.native
  sealed trait FSAddOrRemoveFollowerResponse extends EMsg
  
  @js.native
  sealed trait FSBase extends EMsg
  
  @js.native
  sealed trait FSCommentNotification extends EMsg
  
  @js.native
  sealed trait FSCommentNotificationViewed extends EMsg
  
  @js.native
  sealed trait FSComputeFrenematrix extends EMsg
  
  @js.native
  sealed trait FSComputeFrenematrixResponse extends EMsg
  
  @js.native
  sealed trait FSGetPendingNotificationCount extends EMsg
  
  @js.native
  sealed trait FSGetPendingNotificationCountResponse extends EMsg
  
  @js.native
  sealed trait FSPlayStatusNotification extends EMsg
  
  @js.native
  sealed trait FSPublishPersonaStatus extends EMsg
  
  @js.native
  sealed trait FSRequestFriendData extends EMsg
  
  @js.native
  sealed trait FSRichPresenceRequest extends EMsg
  
  @js.native
  sealed trait FSRichPresenceResponse extends EMsg
  
  @js.native
  sealed trait FSUpdateFollowingList extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSBrowseClans extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSBrowseClansResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSClanDeleted extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSGetBrowseCounts extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSGetBrowseCountsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSGetGSPlayStats extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSGetGSPlayStatsForServer extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSGetGSPlayStatsForServerResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSGetGSPlayStatsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSReportIPUpdates extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearch extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchClansByLocation extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchClansByLocationResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchPlayersByLocation extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchPlayersByLocationResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchStatus extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchStatusResponse extends EMsg
  
  @js.native
  sealed trait FailServer extends EMsg
  
  @js.native
  sealed trait FileXferData extends EMsg
  
  @js.native
  sealed trait FileXferDataAck extends EMsg
  
  @js.native
  sealed trait FileXferEnd extends EMsg
  
  @js.native
  sealed trait FileXferRequest extends EMsg
  
  @js.native
  sealed trait FileXferResponse extends EMsg
  
  @js.native
  sealed trait GCAchievementAwarded extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCCmdBounce extends EMsg
  
  @js.native
  sealed trait GCCmdDeploy extends EMsg
  
  @js.native
  sealed trait GCCmdDeployResponse extends EMsg
  
  @js.native
  sealed trait GCCmdDown extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCCmdForceBounce extends EMsg
  
  @js.native
  sealed trait GCCmdRevive extends EMsg
  
  @js.native
  sealed trait GCCmdStatus extends EMsg
  
  @js.native
  sealed trait GCCmdSwitch extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCGetAccountDetails extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCGetAccountDetails_DEPRECATED extends EMsg
  
  @js.native
  sealed trait GCGetEmailTemplate extends EMsg
  
  @js.native
  sealed trait GCGetEmailTemplateResponse extends EMsg
  
  @js.native
  sealed trait GCHAccountLockStatusChange extends EMsg
  
  @js.native
  sealed trait GCHAccountPhoneNumberChange extends EMsg
  
  @js.native
  sealed trait GCHAccountTradeBanStatusChange extends EMsg
  
  @js.native
  sealed trait GCHAccountTwoFactorChange extends EMsg
  
  @js.native
  sealed trait GCHAccountVacStatusChange extends EMsg
  
  @js.native
  sealed trait GCHKillGC extends EMsg
  
  @js.native
  sealed trait GCHKillGCResponse extends EMsg
  
  @js.native
  sealed trait GCHRelay extends EMsg
  
   // obsolete "renamed to GCHRelayToClient"
  @js.native
  sealed trait GCHRelayClientToIS extends EMsg
  
  @js.native
  sealed trait GCHRelayToClient extends EMsg
  
  @js.native
  sealed trait GCHRequestStatus extends EMsg
  
  @js.native
  sealed trait GCHRequestStatusResponse extends EMsg
  
  @js.native
  sealed trait GCHRequestUpdateSession extends EMsg
  
  @js.native
  sealed trait GCHSpawnGC extends EMsg
  
  @js.native
  sealed trait GCHSpawnGCResponse extends EMsg
  
  @js.native
  sealed trait GCHUpdateSession extends EMsg
  
  @js.native
  sealed trait GCHVacVerificationChange extends EMsg
  
  @js.native
  sealed trait GCInterAppMessage extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCRegisterWebInterfaces extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCRegisterWebInterfaces_Deprecated extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCSendClient extends EMsg
  
  @js.native
  sealed trait GCSystemMessage extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCUpdateGSState extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCUpdatePlayedState extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCValidateSession extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCValidateSessionResponse extends EMsg
  
  @js.native
  sealed trait GMConvertUserWallets extends EMsg
  
  @js.native
  sealed trait GMDRMSync extends EMsg
  
  @js.native
  sealed trait GMGetServiceMethodRouting extends EMsg
  
  @js.native
  sealed trait GMGetServiceMethodRoutingResponse extends EMsg
  
  @js.native
  sealed trait GMLoadActivationCodes extends EMsg
  
  @js.native
  sealed trait GMQueueForFBS extends EMsg
  
  @js.native
  sealed trait GMReportPHPError extends EMsg
  
  @js.native
  sealed trait GMSBase extends EMsg
  
  @js.native
  sealed trait GMSClientServerQueryResponse extends EMsg
  
  @js.native
  sealed trait GMSGameServerReplicate extends EMsg
  
  @js.native
  sealed trait GMSchemaConversionResults extends EMsg
  
   // obsolete
  @js.native
  sealed trait GMSchemaConversionResultsResponse extends EMsg
  
  @js.native
  sealed trait GMWriteConfigToSQL extends EMsg
  
  @js.native
  sealed trait GMWriteShellFailureToSQL extends EMsg
  
  @js.native
  sealed trait GMWriteStatsToSOS extends EMsg
  
  @js.native
  sealed trait GSApprove extends EMsg
  
  @js.native
  sealed trait GSAssociateWithClan extends EMsg
  
  @js.native
  sealed trait GSAssociateWithClanResponse extends EMsg
  
  @js.native
  sealed trait GSComputeNewPlayerCompatibility extends EMsg
  
  @js.native
  sealed trait GSComputeNewPlayerCompatibilityResponse extends EMsg
  
  @js.native
  sealed trait GSDeny extends EMsg
  
  @js.native
  sealed trait GSDisconnectNotice extends EMsg
  
  @js.native
  sealed trait GSGetPlayStats extends EMsg
  
  @js.native
  sealed trait GSGetPlayStatsResponse extends EMsg
  
  @js.native
  sealed trait GSGetReputation extends EMsg
  
  @js.native
  sealed trait GSGetReputationResponse extends EMsg
  
  @js.native
  sealed trait GSGetUserAchievementStatus extends EMsg
  
  @js.native
  sealed trait GSGetUserAchievementStatusResponse extends EMsg
  
  @js.native
  sealed trait GSGetUserGroupStatus extends EMsg
  
  @js.native
  sealed trait GSGetUserGroupStatusResponse extends EMsg
  
  @js.native
  sealed trait GSKick extends EMsg
  
  @js.native
  sealed trait GSPerformHardwareSurvey extends EMsg
  
  @js.native
  sealed trait GSPlayerList extends EMsg
  
  @js.native
  sealed trait GSServerType extends EMsg
  
  @js.native
  sealed trait GSStatus extends EMsg
  
  @js.native
  sealed trait GSStatus2 extends EMsg
  
  @js.native
  sealed trait GSStatusReply extends EMsg
  
  @js.native
  sealed trait GSStatusUpdate_Unused extends EMsg
  
  @js.native
  sealed trait GSUserPlaying extends EMsg
  
  @js.native
  sealed trait GameServerOutOfDate extends EMsg
  
  @js.native
  sealed trait GenericReply extends EMsg
  
  @js.native
  sealed trait GetUserIPCountry extends EMsg
  
  @js.native
  sealed trait GetUserIPCountryResponse extends EMsg
  
  @js.native
  sealed trait GracefulExitShell extends EMsg
  
  @js.native
  sealed trait Heartbeat extends EMsg
  
  @js.native
  sealed trait HubConnect extends EMsg
  
   // obsolete "renamed to GCHRelay"
  @js.native
  sealed trait ISRelayToGCH extends EMsg
  
  @js.native
  sealed trait Invalid extends EMsg
  
  @js.native
  sealed trait InvalidateDBOCacheItems extends EMsg
  
  @js.native
  sealed trait JobHeartbeat extends EMsg
  
  @js.native
  sealed trait JobHeartbeatTest extends EMsg
  
  @js.native
  sealed trait JobHeartbeatTestResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait KGSAllocateKeyRange extends EMsg
  
   // obsolete
  @js.native
  sealed trait KGSAllocateKeyRangeResponse extends EMsg
  
  @js.native
  sealed trait KGSBase extends EMsg
  
   // obsolete
  @js.native
  sealed trait KGSGenerateGameStopWCKeys extends EMsg
  
   // obsolete
  @js.native
  sealed trait KGSGenerateGameStopWCKeysResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait KGSGenerateKeys extends EMsg
  
   // obsolete
  @js.native
  sealed trait KGSGenerateKeysResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait KGSRemapKeys extends EMsg
  
   // obsolete
  @js.native
  sealed trait KGSRemapKeysResponse extends EMsg
  
  @js.native
  sealed trait KeepAlive extends EMsg
  
  @js.native
  sealed trait LBSDeleteLB extends EMsg
  
  @js.native
  sealed trait LBSDeleteLBEntry extends EMsg
  
  @js.native
  sealed trait LBSDeleteLBResponse extends EMsg
  
  @js.native
  sealed trait LBSFindOrCreateLB extends EMsg
  
  @js.native
  sealed trait LBSFindOrCreateLBResponse extends EMsg
  
  @js.native
  sealed trait LBSGetLBEntries extends EMsg
  
  @js.native
  sealed trait LBSGetLBEntriesResponse extends EMsg
  
  @js.native
  sealed trait LBSGetLBList extends EMsg
  
  @js.native
  sealed trait LBSGetLBListResponse extends EMsg
  
  @js.native
  sealed trait LBSResetLB extends EMsg
  
  @js.native
  sealed trait LBSResetLBResponse extends EMsg
  
  @js.native
  sealed trait LBSSetLBDetails extends EMsg
  
  @js.native
  sealed trait LBSSetScore extends EMsg
  
  @js.native
  sealed trait LBSSetScoreResponse extends EMsg
  
  @js.native
  sealed trait LicenseProcessingComplete extends EMsg
  
  @js.native
  sealed trait LoadDBOCacheItem extends EMsg
  
  @js.native
  sealed trait LoadDBOCacheItemResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait LogSearchCancel extends EMsg
  
   // obsolete
  @js.native
  sealed trait LogSearchRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait LogSearchResponse extends EMsg
  
  @js.native
  sealed trait LogsinkBase extends EMsg
  
  @js.native
  sealed trait LogsinkWriteReport extends EMsg
  
  @js.native
  sealed trait MDSContentServerConfig extends EMsg
  
  @js.native
  sealed trait MDSContentServerConfigRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait MDSContentServerStatsBroadcast extends EMsg
  
   // obsolete
  @js.native
  sealed trait MDSDownloadDepotChunksAck extends EMsg
  
  @js.native
  sealed trait MDSGetDepotChunk extends EMsg
  
  @js.native
  sealed trait MDSGetDepotChunkChunk extends EMsg
  
  @js.native
  sealed trait MDSGetDepotChunkResponse extends EMsg
  
  @js.native
  sealed trait MDSGetDepotManifest extends EMsg
  
  @js.native
  sealed trait MDSGetDepotManifestChunk extends EMsg
  
  @js.native
  sealed trait MDSGetDepotManifestResponse extends EMsg
  
  @js.native
  sealed trait MDSGetServerListForUser extends EMsg
  
  @js.native
  sealed trait MDSGetServerListForUserResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait MDSGetVersionsForDepot extends EMsg
  
   // obsolete
  @js.native
  sealed trait MDSGetVersionsForDepotResponse extends EMsg
  
  @js.native
  sealed trait MDSMigrateChunk extends EMsg
  
  @js.native
  sealed trait MDSMigrateChunkResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait MDSSetPublicVersionForDepot extends EMsg
  
   // obsolete
  @js.native
  sealed trait MDSSetPublicVersionForDepotResponse extends EMsg
  
  @js.native
  sealed trait MDSToAMGetDepotDecryptionKeyResponse extends EMsg
  
  @js.native
  sealed trait MDSToCSFlushChunk extends EMsg
  
   // obsolete
  @js.native
  sealed trait MDSUpdateContentServerConfig extends EMsg
  
  @js.native
  sealed trait MMSBase extends EMsg
  
  @js.native
  sealed trait MPASBase extends EMsg
  
  @js.native
  sealed trait MPASVacBanReset extends EMsg
  
  @js.native
  sealed trait MarketingMessageUpdate extends EMsg
  
  @js.native
  sealed trait Multi extends EMsg
  
  @js.native
  sealed trait NonStdMsgBase extends EMsg
  
  @js.native
  sealed trait NonStdMsgChase extends EMsg
  
  @js.native
  sealed trait NonStdMsgDFSTransfer extends EMsg
  
  @js.native
  sealed trait NonStdMsgHTTPClient extends EMsg
  
  @js.native
  sealed trait NonStdMsgHTTPServer extends EMsg
  
  @js.native
  sealed trait NonStdMsgLogsink extends EMsg
  
  @js.native
  sealed trait NonStdMsgMemcached extends EMsg
  
  @js.native
  sealed trait NonStdMsgPHPSimulator extends EMsg
  
  @js.native
  sealed trait NonStdMsgRTMPServer extends EMsg
  
  @js.native
  sealed trait NonStdMsgSteam2Emulator extends EMsg
  
   // obsolete
  @js.native
  sealed trait NonStdMsgSyslog extends EMsg
  
  @js.native
  sealed trait NonStdMsgTests extends EMsg
  
  @js.native
  sealed trait NonStdMsgUMQpipeAAPL extends EMsg
  
  @js.native
  sealed trait NonStdMsgWGResponse extends EMsg
  
  @js.native
  sealed trait NotificationOfSuspiciousActivity extends EMsg
  
  @js.native
  sealed trait NotifyWatchdog extends EMsg
  
  @js.native
  sealed trait OGSBeginSession extends EMsg
  
  @js.native
  sealed trait OGSBeginSessionResponse extends EMsg
  
  @js.native
  sealed trait OGSEndSession extends EMsg
  
  @js.native
  sealed trait OGSEndSessionResponse extends EMsg
  
  @js.native
  sealed trait OGSWriteAppSessionRow extends EMsg
  
  @js.native
  sealed trait P2PIntroducerMessage extends EMsg
  
  @js.native
  sealed trait PICSBase extends EMsg
  
  @js.native
  sealed trait PSAddPackageToShoppingCart extends EMsg
  
  @js.native
  sealed trait PSAddPackageToShoppingCartResponse extends EMsg
  
  @js.native
  sealed trait PSAddWalletCreditToShoppingCart extends EMsg
  
  @js.native
  sealed trait PSAddWalletCreditToShoppingCartResponse extends EMsg
  
  @js.native
  sealed trait PSCreateShoppingCart extends EMsg
  
  @js.native
  sealed trait PSCreateShoppingCartResponse extends EMsg
  
  @js.native
  sealed trait PSGetShoppingCartContents extends EMsg
  
  @js.native
  sealed trait PSGetShoppingCartContentsResponse extends EMsg
  
  @js.native
  sealed trait PSIsValidShoppingCart extends EMsg
  
  @js.native
  sealed trait PSIsValidShoppingCartResponse extends EMsg
  
  @js.native
  sealed trait PSRemoveLineItemFromShoppingCart extends EMsg
  
  @js.native
  sealed trait PSRemoveLineItemFromShoppingCartResponse extends EMsg
  
  @js.native
  sealed trait PhysicalBoxInventory extends EMsg
  
  @js.native
  sealed trait Ping extends EMsg
  
  @js.native
  sealed trait PingResponse extends EMsg
  
  @js.native
  sealed trait PrepareToExit extends EMsg
  
  @js.native
  sealed trait ProtobufWrapped extends EMsg
  
  @js.native
  sealed trait ProvideWindowsEventLogEntries extends EMsg
  
  @js.native
  sealed trait QuestServerBase extends EMsg
  
  @js.native
  sealed trait QueuedEmailsComplete extends EMsg
  
  @js.native
  sealed trait RMDeleteMemcachedKeys extends EMsg
  
  @js.native
  sealed trait RMMsgTraceAddTrigger extends EMsg
  
  @js.native
  sealed trait RMMsgTraceEvent extends EMsg
  
  @js.native
  sealed trait RMMsgTraceRemoveTrigger extends EMsg
  
  @js.native
  sealed trait RMRange extends EMsg
  
  @js.native
  sealed trait RMRemoteInvoke extends EMsg
  
  @js.native
  sealed trait RMTestVerisignOTP extends EMsg
  
  @js.native
  sealed trait RMTestVerisignOTPResponse extends EMsg
  
  @js.native
  sealed trait RemoteClientAcceptEULA extends EMsg
  
  @js.native
  sealed trait RemoteClientAppStatus extends EMsg
  
  @js.native
  sealed trait RemoteClientAuth extends EMsg
  
  @js.native
  sealed trait RemoteClientAuthResponse extends EMsg
  
  @js.native
  sealed trait RemoteClientBase extends EMsg
  
  @js.native
  sealed trait RemoteClientGetControllerConfig extends EMsg
  
  @js.native
  sealed trait RemoteClientGetControllerConfigResposne extends EMsg
  
  @js.native
  sealed trait RemoteClientPing extends EMsg
  
  @js.native
  sealed trait RemoteClientPingResponse extends EMsg
  
  @js.native
  sealed trait RemoteClientStartStream extends EMsg
  
  @js.native
  sealed trait RemoteClientStartStreamResponse extends EMsg
  
  @js.native
  sealed trait RemoteClientStreamingEnabled extends EMsg
  
   // obsolete
  @js.native
  sealed trait RemoteSysID extends EMsg
  
  @js.native
  sealed trait ReqChallenge extends EMsg
  
  @js.native
  sealed trait ReqChallengeTest extends EMsg
  
  @js.native
  sealed trait RequestFullStatsBlock extends EMsg
  
   // obsolete
  @js.native
  sealed trait RequestStatHistory extends EMsg
  
  @js.native
  sealed trait RequestWindowsEventLogEntries extends EMsg
  
   // obsolete
  @js.native
  sealed trait RouteMessage extends EMsg
  
  @js.native
  sealed trait SCIDRequest extends EMsg
  
  @js.native
  sealed trait SCIDResponse extends EMsg
  
  @js.native
  sealed trait SLCBase extends EMsg
  
  @js.native
  sealed trait SLCOwnerLibraryChanged extends EMsg
  
  @js.native
  sealed trait SLCRequestUserSessionStatus extends EMsg
  
  @js.native
  sealed trait SLCSharedLibraryChanged extends EMsg
  
  @js.native
  sealed trait SLCSharedLicensesLockStatus extends EMsg
  
  @js.native
  sealed trait SLCUserSessionStatus extends EMsg
  
  @js.native
  sealed trait SMExpensiveReport extends EMsg
  
  @js.native
  sealed trait SMFishingReport extends EMsg
  
   // obsolete
  @js.native
  sealed trait SMGetSchemaConversionResults extends EMsg
  
   // obsolete
  @js.native
  sealed trait SMGetSchemaConversionResultsResponse extends EMsg
  
  @js.native
  sealed trait SMHourlyReport extends EMsg
  
  @js.native
  sealed trait SMMonitorSpace extends EMsg
  
  @js.native
  sealed trait SMPartitionRenames extends EMsg
  
  @js.native
  sealed trait SecretsBase extends EMsg
  
  @js.native
  sealed trait SecretsCredentialPairResponse extends EMsg
  
  @js.native
  sealed trait SecretsRequestCredentialPair extends EMsg
  
   // obsolete
  @js.native
  sealed trait SecretsRequestServerIdentity extends EMsg
  
   // obsolete
  @js.native
  sealed trait SecretsServerIdentityResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait SecretsUpdateServerIdentities extends EMsg
  
  @js.native
  sealed trait ServiceMethod extends EMsg
  
  @js.native
  sealed trait ServiceMethodResponse extends EMsg
  
  @js.native
  sealed trait SetTestFlag extends EMsg
  
  @js.native
  sealed trait ShellCheckWindowsUpdates extends EMsg
  
  @js.native
  sealed trait ShellCheckWindowsUpdatesResponse extends EMsg
  
  @js.native
  sealed trait ShellConfigInfoUpdate extends EMsg
  
  @js.native
  sealed trait ShellFailed extends EMsg
  
   // obsolete
  @js.native
  sealed trait ShellFlushUserLicenseCache extends EMsg
  
  @js.native
  sealed trait ShellSearchLogs extends EMsg
  
  @js.native
  sealed trait ShellSearchLogsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait StatHistory extends EMsg
  
  @js.native
  sealed trait Stats extends EMsg
  
   // obsolete
  @js.native
  sealed trait StatsDeprecated extends EMsg
  
  @js.native
  sealed trait StoreBase extends EMsg
  
   // obsolete
  @js.native
  sealed trait StoreUpdateRecommendationCount extends EMsg
  
  @js.native
  sealed trait Subscribe extends EMsg
  
  @js.native
  sealed trait TestInitDB extends EMsg
  
  @js.native
  sealed trait TestResetServer extends EMsg
  
  @js.native
  sealed trait TestWorkerProcess extends EMsg
  
  @js.native
  sealed trait TestWorkerProcessLoadUnloadModuleRequest extends EMsg
  
  @js.native
  sealed trait TestWorkerProcessLoadUnloadModuleResponse extends EMsg
  
  @js.native
  sealed trait TestWorkerProcessServiceModuleCallRequest extends EMsg
  
  @js.native
  sealed trait TestWorkerProcessServiceModuleCallResponse extends EMsg
  
  @js.native
  sealed trait TimestampRequest extends EMsg
  
  @js.native
  sealed trait TimestampResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMAddTaggedScreenshot extends EMsg
  
  @js.native
  sealed trait UCMBase extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMDeleteOldScreenshot extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMDeleteOldScreenshotResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMDeleteOldVideo extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMDeleteOldVideoResponse extends EMsg
  
  @js.native
  sealed trait UCMDeletePublishedFile extends EMsg
  
  @js.native
  sealed trait UCMDeletePublishedFileResponse extends EMsg
  
  @js.native
  sealed trait UCMFixStatsPublishedFile extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMGetPublishedFilesForUser extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMGetPublishedFilesForUserResponse extends EMsg
  
  @js.native
  sealed trait UCMGetUserSubscribedFiles extends EMsg
  
  @js.native
  sealed trait UCMGetUserSubscribedFilesResponse extends EMsg
  
  @js.native
  sealed trait UCMPublishFile extends EMsg
  
  @js.native
  sealed trait UCMPublishFileResponse extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileChildAdd extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileChildAddResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMPublishedFileChildChangeSortOrder extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMPublishedFileChildChangeSortOrderResponse extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileChildRemove extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileChildRemoveResponse extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileContentUpdated extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileParentChanged extends EMsg
  
  @js.native
  sealed trait UCMPublishedFilePreviewAdd extends EMsg
  
  @js.native
  sealed trait UCMPublishedFilePreviewAddResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMPublishedFilePreviewChangeSortOrder extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMPublishedFilePreviewChangeSortOrderResponse extends EMsg
  
  @js.native
  sealed trait UCMPublishedFilePreviewRemove extends EMsg
  
  @js.native
  sealed trait UCMPublishedFilePreviewRemoveResponse extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileReported extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileSubscribed extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileUnsubscribed extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileUpdated extends EMsg
  
  @js.native
  sealed trait UCMReloadPublishedFile extends EMsg
  
  @js.native
  sealed trait UCMReloadUserFileListCaches extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMRemoveTaggedScreenshot extends EMsg
  
  @js.native
  sealed trait UCMResetCommunityContent extends EMsg
  
  @js.native
  sealed trait UCMResetCommunityContentResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMUpdateOldScreenshotPrivacy extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMUpdateOldScreenshotPrivacyResponse extends EMsg
  
  @js.native
  sealed trait UCMUpdatePublishedFile extends EMsg
  
  @js.native
  sealed trait UCMUpdatePublishedFileBan extends EMsg
  
  @js.native
  sealed trait UCMUpdatePublishedFileBanResponse extends EMsg
  
  @js.native
  sealed trait UCMUpdatePublishedFileIncompatibleStatus extends EMsg
  
  @js.native
  sealed trait UCMUpdatePublishedFileResponse extends EMsg
  
  @js.native
  sealed trait UCMUpdatePublishedFileStat extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMUpdateTaggedScreenshot extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMValidateObjectExists extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMValidateObjectExistsResponse extends EMsg
  
  @js.native
  sealed trait UDSBase extends EMsg
  
   // obsolete "renamed to UDSHasSession"
  @js.native
  sealed trait UDSFindSession extends EMsg
  
   // obsolete "renamed to UDSHasSessionResponse"
  @js.native
  sealed trait UDSFindSessionResponse extends EMsg
  
  @js.native
  sealed trait UDSHasSession extends EMsg
  
  @js.native
  sealed trait UDSHasSessionResponse extends EMsg
  
  @js.native
  sealed trait UDSRenderUserAuth extends EMsg
  
  @js.native
  sealed trait UDSRenderUserAuthResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait UFSDownloadChunk extends EMsg
  
  @js.native
  sealed trait UFSDownloadChunkRequest extends EMsg
  
  @js.native
  sealed trait UFSDownloadChunkResponse extends EMsg
  
  @js.native
  sealed trait UFSDownloadFinishRequest extends EMsg
  
  @js.native
  sealed trait UFSDownloadFinishResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait UFSDownloadRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait UFSDownloadResponse extends EMsg
  
  @js.native
  sealed trait UFSDownloadStartRequest extends EMsg
  
  @js.native
  sealed trait UFSDownloadStartResponse extends EMsg
  
  @js.native
  sealed trait UFSFlushURLCache extends EMsg
  
  @js.native
  sealed trait UFSGetUGCURLs extends EMsg
  
  @js.native
  sealed trait UFSGetUGCURLsResponse extends EMsg
  
  @js.native
  sealed trait UFSHttpUploadFileFinishRequest extends EMsg
  
  @js.native
  sealed trait UFSHttpUploadFileFinishResponse extends EMsg
  
  @js.native
  sealed trait UFSMigrateFile extends EMsg
  
  @js.native
  sealed trait UFSMigrateFileAppID extends EMsg
  
  @js.native
  sealed trait UFSMigrateFileAppIDResponse extends EMsg
  
  @js.native
  sealed trait UFSMigrateFileResponse extends EMsg
  
  @js.native
  sealed trait UFSReloadAccount extends EMsg
  
  @js.native
  sealed trait UFSReloadAccountResponse extends EMsg
  
  @js.native
  sealed trait UFSReloadPartitionInfo extends EMsg
  
  @js.native
  sealed trait UFSSynchronizeFile extends EMsg
  
  @js.native
  sealed trait UFSSynchronizeFileResponse extends EMsg
  
  @js.native
  sealed trait UFSUpdateFileFlags extends EMsg
  
  @js.native
  sealed trait UFSUpdateFileFlagsResponse extends EMsg
  
  @js.native
  sealed trait UFSUpdateRecordBatched extends EMsg
  
  @js.native
  sealed trait UFSUpdateRecordBatchedResponse extends EMsg
  
  @js.native
  sealed trait UFSUploadCommit extends EMsg
  
  @js.native
  sealed trait UFSUploadCommitResponse extends EMsg
  
  @js.native
  sealed trait UGSBase extends EMsg
  
  @js.native
  sealed trait UGSUpdateGlobalStats extends EMsg
  
  @js.native
  sealed trait UMQ2AM_ClientMsgBatch extends EMsg
  
  @js.native
  sealed trait UMQBase extends EMsg
  
   // obsolete
  @js.native
  sealed trait UMQEnqueueMobileAnnouncements extends EMsg
  
   // obsolete
  @js.native
  sealed trait UMQEnqueueMobileSalePromotions extends EMsg
  
  @js.native
  sealed trait UMQIncomingChatMessage extends EMsg
  
  @js.native
  sealed trait UMQLogoffRequest extends EMsg
  
  @js.native
  sealed trait UMQLogoffResponse extends EMsg
  
  @js.native
  sealed trait UMQLogonRequest extends EMsg
  
  @js.native
  sealed trait UMQLogonResponse extends EMsg
  
  @js.native
  sealed trait UMQPoll extends EMsg
  
  @js.native
  sealed trait UMQPollResults extends EMsg
  
  @js.native
  sealed trait UMQSendChatMessage extends EMsg
  
  @js.native
  sealed trait UniverseChanged extends EMsg
  
  @js.native
  sealed trait UniverseData extends EMsg
  
  @js.native
  sealed trait UpdateConfigFile extends EMsg
  
  @js.native
  sealed trait UpdateCreditCardRequest extends EMsg
  
  @js.native
  sealed trait UpdateRecordResponse extends EMsg
  
  @js.native
  sealed trait UpdateUserBanResponse extends EMsg
  
  @js.native
  sealed trait VACResponse extends EMsg
  
  @js.native
  sealed trait VSAddCheat extends EMsg
  
  @js.native
  sealed trait VSChallengeResultText extends EMsg
  
  @js.native
  sealed trait VSGetChallengeResults extends EMsg
  
  @js.native
  sealed trait VSLoadDBFinished extends EMsg
  
  @js.native
  sealed trait VSMarkCheat extends EMsg
  
  @js.native
  sealed trait VSPurgeCodeModDB extends EMsg
  
  @js.native
  sealed trait VSReportLingerer extends EMsg
  
  @js.native
  sealed trait VSRequestManagedChallenge extends EMsg
  
  @js.native
  sealed trait WGRequest extends EMsg
  
  @js.native
  sealed trait WGResponse extends EMsg
  
  @js.native
  sealed trait WebAPIBase extends EMsg
  
  @js.native
  sealed trait WebAPIInvalidateOAuthClientCache extends EMsg
  
  @js.native
  sealed trait WebAPIInvalidateOAuthTokenCache extends EMsg
  
   // obsolete
  @js.native
  sealed trait WebAPIInvalidateTokensForAccount extends EMsg
  
  @js.native
  sealed trait WebAPIJobRequest extends EMsg
  
  @js.native
  sealed trait WebAPIJobResponse extends EMsg
  
  @js.native
  sealed trait WebAPIRegisterGCInterfaces extends EMsg
  
  @js.native
  sealed trait WebAPISetSecrets extends EMsg
  
  @js.native
  sealed trait WebAPIValidateOAuth2Token extends EMsg
  
  @js.native
  sealed trait WebAPIValidateOAuth2TokenResponse extends EMsg
  
  @js.native
  sealed trait WorkerProcess extends EMsg
  
  @js.native
  sealed trait WorkerProcessPingRequest extends EMsg
  
  @js.native
  sealed trait WorkerProcessPingResponse extends EMsg
  
  @js.native
  sealed trait WorkerProcessShutdown extends EMsg
  
   // obsolete
  @js.native
  sealed trait WorkshopAcceptTOSRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait WorkshopAcceptTOSResponse extends EMsg
  
  @js.native
  sealed trait WorkshopBase extends EMsg
  
  @js.native
  sealed trait ZipRequest extends EMsg
  
  @js.native
  sealed trait ZipResponse extends EMsg
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMsg with Double] = js.native
  /* 423 */ @js.native
  object AIGetAppGCFlags extends TopLevel[AIGetAppGCFlags with Double]
  
  /* 424 */ @js.native
  object AIGetAppGCFlagsResponse extends TopLevel[AIGetAppGCFlagsResponse with Double]
  
  /* 427 */ @js.native
  object AIGetAppInfo extends TopLevel[AIGetAppInfo with Double]
  
  /* 428 */ @js.native
  object AIGetAppInfoResponse extends TopLevel[AIGetAppInfoResponse with Double]
  
  /* 425 */ @js.native
  object AIGetAppList extends TopLevel[AIGetAppList with Double]
  
  /* 426 */ @js.native
  object AIGetAppListResponse extends TopLevel[AIGetAppListResponse with Double]
  
  /* 407 */ @js.native
  object AISAppInfoTableChanged extends TopLevel[AISAppInfoTableChanged with Double]
  
  /* 409 */ @js.native
  object AISCreateMarketingMessage extends TopLevel[AISCreateMarketingMessage with Double]
  
  /* 410 */ @js.native
  object AISCreateMarketingMessageResponse extends TopLevel[AISCreateMarketingMessageResponse with Double]
  
  /* 416 */ @js.native
  object AISDeleteMarketingMessage extends TopLevel[AISDeleteMarketingMessage with Double]
  
  /* 429 */ @js.native
  object AISGetCouponDefinition extends TopLevel[AISGetCouponDefinition with Double]
  
  /* 430 */ @js.native
  object AISGetCouponDefinitionResponse extends TopLevel[AISGetCouponDefinitionResponse with Double]
  
  /* 411 */ @js.native
  object AISGetMarketingMessage extends TopLevel[AISGetMarketingMessage with Double]
  
  /* 412 */ @js.native
  object AISGetMarketingMessageResponse extends TopLevel[AISGetMarketingMessageResponse with Double]
  
  /* 419 */ @js.native
  object AISGetMarketingTreatments extends TopLevel[AISGetMarketingTreatments with Double]
  
  /* 420 */ @js.native
  object AISGetMarketingTreatmentsResponse extends TopLevel[AISGetMarketingTreatmentsResponse with Double]
  
  /* 405 */ @js.native
  object AISGetPackageChangeNumber extends TopLevel[AISGetPackageChangeNumber with Double]
  
  /* 406 */ @js.native
  object AISGetPackageChangeNumberResponse extends TopLevel[AISGetPackageChangeNumberResponse with Double]
  
  /* 401 */ @js.native
  object AISRefreshContentDescription extends TopLevel[AISRefreshContentDescription with Double]
  
  /* 402 */ @js.native
  object AISRequestContentDescription extends TopLevel[AISRequestContentDescription with Double]
  
  /* 415 */ @js.native
  object AISRequestMarketingMessageUpdate extends TopLevel[AISRequestMarketingMessageUpdate with Double]
  
  /* 421 */ @js.native
  object AISRequestMarketingTreatmentUpdate extends TopLevel[AISRequestMarketingTreatmentUpdate with Double]
  
  /* 422 */ @js.native
  object AISTestAddPackage extends TopLevel[AISTestAddPackage with Double]
  
  /* 433 */ @js.native
  object AISTestEnableGC extends TopLevel[AISTestEnableGC with Double]
  
  /* 403 */ @js.native
  object AISUpdateAppInfo extends TopLevel[AISUpdateAppInfo with Double]
  
  /* 413 */ @js.native
  object AISUpdateMarketingMessage extends TopLevel[AISUpdateMarketingMessage with Double]
  
  /* 414 */ @js.native
  object AISUpdateMarketingMessageResponse extends TopLevel[AISUpdateMarketingMessageResponse with Double]
  
  /* 404 */ @js.native
  object AISUpdatePackageCosts extends TopLevel[AISUpdatePackageCosts with Double]
  
  /* 408 */ @js.native
  object AISUpdatePackageCostsResponse extends TopLevel[AISUpdatePackageCostsResponse with Double]
  
  /* 404 */ @js.native
  object AISUpdatePackageInfo extends TopLevel[AISUpdatePackageInfo with Double]
  
  /* 431 */ @js.native
  object AISUpdateSlaveContentDescription extends TopLevel[AISUpdateSlaveContentDescription with Double]
  
  /* 432 */ @js.native
  object AISUpdateSlaveContentDescriptionResponse extends TopLevel[AISUpdateSlaveContentDescriptionResponse with Double]
  
  /* 4310 */ @js.native
  object AMAccountPS3Unlink extends TopLevel[AMAccountPS3Unlink with Double]
  
  /* 4311 */ @js.native
  object AMAccountPS3UnlinkResponse extends TopLevel[AMAccountPS3UnlinkResponse with Double]
  
  /* 4346 */ @js.native
  object AMAcctAllowedToPurchase extends TopLevel[AMAcctAllowedToPurchase with Double]
  
  /* 4347 */ @js.native
  object AMAcctAllowedToPurchaseResponse extends TopLevel[AMAcctAllowedToPurchaseResponse with Double]
  
  /* 565 */ @js.native
  object AMAcknowledgeClanInvite extends TopLevel[AMAcknowledgeClanInvite with Double]
  
  /* 4141 */ @js.native
  object AMAddClanNews extends TopLevel[AMAddClanNews with Double]
  
  /* 4202 */ @js.native
  object AMAddComment extends TopLevel[AMAddComment with Double]
  
  /* 4203 */ @js.native
  object AMAddCommentResponse extends TopLevel[AMAddCommentResponse with Double]
  
  /* 4061 */ @js.native
  object AMAddFounderToClan extends TopLevel[AMAddFounderToClan with Double]
  
  /* 4224 */ @js.native
  object AMAddFreeLicense extends TopLevel[AMAddFreeLicense with Double]
  
  /* 4285 */ @js.native
  object AMAddFreeLicenseResponse extends TopLevel[AMAddFreeLicenseResponse with Double]
  
  /* 4081 */ @js.native
  object AMAddFriend extends TopLevel[AMAddFriend with Double]
  
  /* 4082 */ @js.native
  object AMAddFriendResponse extends TopLevel[AMAddFriendResponse with Double]
  
  /* 505 */ @js.native
  object AMAddLicense extends TopLevel[AMAddLicense with Double]
  
  /* 510 */ @js.native
  object AMAddMinutesToLicense extends TopLevel[AMAddMinutesToLicense with Double]
  
  /* 4280 */ @js.native
  object AMAddPublisherUser extends TopLevel[AMAddPublisherUser with Double]
  
  /* 4234 */ @js.native
  object AMAddUsersToMarketingTreatment extends TopLevel[AMAddUsersToMarketingTreatment with Double]
  
  /* 558 */ @js.native
  object AMAllowUserContentQuery extends TopLevel[AMAllowUserContentQuery with Double]
  
  /* 559 */ @js.native
  object AMAllowUserContentResponse extends TopLevel[AMAllowUserContentResponse with Double]
  
  /* 4156 */ @js.native
  object AMAllowUserFilesRequest extends TopLevel[AMAllowUserFilesRequest with Double]
  
  /* 4157 */ @js.native
  object AMAllowUserFilesResponse extends TopLevel[AMAllowUserFilesResponse with Double]
  
  /* 592 */ @js.native
  object AMAuthenticateUser extends TopLevel[AMAuthenticateUser with Double]
  
  /* 593 */ @js.native
  object AMAuthenticateUserResponse extends TopLevel[AMAuthenticateUserResponse with Double]
  
  /* 4315 */ @js.native
  object AMAuthenticatedPlayerList extends TopLevel[AMAuthenticatedPlayerList with Double]
  
  /* 4145 */ @js.native
  object AMBanFromChat extends TopLevel[AMBanFromChat with Double]
  
  /* 507 */ @js.native
  object AMBeginProcessingLicenses extends TopLevel[AMBeginProcessingLicenses with Double]
  
  /* 4410 */ @js.native
  object AMBitPayPayment extends TopLevel[AMBitPayPayment with Double]
  
  /* 4411 */ @js.native
  object AMBitPayPaymentResponse extends TopLevel[AMBitPayPaymentResponse with Double]
  
  /* 4380 */ @js.native
  object AMBoaCompraPayment extends TopLevel[AMBoaCompraPayment with Double]
  
  /* 4381 */ @js.native
  object AMBoaCompraPaymentResponse extends TopLevel[AMBoaCompraPaymentResponse with Double]
  
  /* 4086 */ @js.native
  object AMCancelEasyCollect extends TopLevel[AMCancelEasyCollect with Double]
  
  /* 4087 */ @js.native
  object AMCancelEasyCollectResponse extends TopLevel[AMCancelEasyCollectResponse with Double]
  
  /* 511 */ @js.native
  object AMCancelLicense extends TopLevel[AMCancelLicense with Double]
  
  /* 522 */ @js.native
  object AMCancelPurchase extends TopLevel[AMCancelPurchase with Double]
  
  /* 4105 */ @js.native
  object AMChallengeNotification extends TopLevel[AMChallengeNotification with Double]
  
  /* 4104 */ @js.native
  object AMChallengeVerdict extends TopLevel[AMChallengeVerdict with Double]
  
  /* 4085 */ @js.native
  object AMChangeClanOwner extends TopLevel[AMChangeClanOwner with Double]
  
  /* 579 */ @js.native
  object AMChatActionResult extends TopLevel[AMChatActionResult with Double]
  
  /* 533 */ @js.native
  object AMChatCleanup extends TopLevel[AMChatCleanup with Double]
  
  /* 577 */ @js.native
  object AMChatEnter extends TopLevel[AMChatEnter with Double]
  
  /* 572 */ @js.native
  object AMChatInvite extends TopLevel[AMChatInvite with Double]
  
  /* 570 */ @js.native
  object AMChatMulti extends TopLevel[AMChatMulti with Double]
  
  /* 4118 */ @js.native
  object AMCheckClanInviteRateLimiting extends TopLevel[AMCheckClanInviteRateLimiting with Double]
  
  /* 4075 */ @js.native
  object AMCheckClanMembership extends TopLevel[AMCheckClanMembership with Double]
  
  /* 4161 */ @js.native
  object AMCheckClanMembershipResponse extends TopLevel[AMCheckClanMembershipResponse with Double]
  
  /* 4352 */ @js.native
  object AMClaimUnownedUserGift extends TopLevel[AMClaimUnownedUserGift with Double]
  
  /* 4353 */ @js.native
  object AMClaimUnownedUserGiftResponse extends TopLevel[AMClaimUnownedUserGiftResponse with Double]
  
  /* 534 */ @js.native
  object AMClanCleanup extends TopLevel[AMClanCleanup with Double]
  
  /* 538 */ @js.native
  object AMClanCleanupList extends TopLevel[AMClanCleanupList with Double]
  
  /* 567 */ @js.native
  object AMClanDataUpdated extends TopLevel[AMClanDataUpdated with Double]
  
  /* 4011 */ @js.native
  object AMClanPermissions extends TopLevel[AMClanPermissions with Double]
  
  /* 4012 */ @js.native
  object AMClanPermissionsResponse extends TopLevel[AMClanPermissionsResponse with Double]
  
  /* 4090 */ @js.native
  object AMClansInCommon extends TopLevel[AMClansInCommon with Double]
  
  /* 4103 */ @js.native
  object AMClansInCommonCount extends TopLevel[AMClansInCommonCount with Double]
  
  /* 4097 */ @js.native
  object AMClansInCommonCountResponse extends TopLevel[AMClansInCommonCountResponse with Double]
  
  /* 4091 */ @js.native
  object AMClansInCommonResponse extends TopLevel[AMClansInCommonResponse with Double]
  
  /* 4264 */ @js.native
  object AMClearDispute extends TopLevel[AMClearDispute with Double]
  
  /* 4265 */ @js.native
  object AMClearDisputeResponse extends TopLevel[AMClearDisputeResponse with Double]
  
  /* 4306 */ @js.native
  object AMClearPersonaMetadataBlob extends TopLevel[AMClearPersonaMetadataBlob with Double]
  
  /* 576 */ @js.native
  object AMClientAcceptFriendInvite extends TopLevel[AMClientAcceptFriendInvite with Double]
  
  /* 5566 */ @js.native
  object AMClientAddFriendToGroup extends TopLevel[AMClientAddFriendToGroup with Double]
  
  /* 5567 */ @js.native
  object AMClientAddFriendToGroupResponse extends TopLevel[AMClientAddFriendToGroupResponse with Double]
  
  /* 598 */ @js.native
  object AMClientChatActionRelay extends TopLevel[AMClientChatActionRelay with Double]
  
  /* 571 */ @js.native
  object AMClientChatInviteRelay extends TopLevel[AMClientChatInviteRelay with Double]
  
  /* 574 */ @js.native
  object AMClientChatMemberInfoRelay extends TopLevel[AMClientChatMemberInfoRelay with Double]
  
  /* 569 */ @js.native
  object AMClientChatMsgRelay extends TopLevel[AMClientChatMsgRelay with Double]
  
  /* 5560 */ @js.native
  object AMClientCreateFriendsGroup extends TopLevel[AMClientCreateFriendsGroup with Double]
  
  /* 5561 */ @js.native
  object AMClientCreateFriendsGroupResponse extends TopLevel[AMClientCreateFriendsGroupResponse with Double]
  
  /* 5562 */ @js.native
  object AMClientDeleteFriendsGroup extends TopLevel[AMClientDeleteFriendsGroup with Double]
  
  /* 5563 */ @js.native
  object AMClientDeleteFriendsGroupResponse extends TopLevel[AMClientDeleteFriendsGroupResponse with Double]
  
  /* 573 */ @js.native
  object AMClientJoinChatRelay extends TopLevel[AMClientJoinChatRelay with Double]
  
  /* 553 */ @js.native
  object AMClientNotPlaying extends TopLevel[AMClientNotPlaying with Double]
  
  /* 578 */ @js.native
  object AMClientPublishRemovalFromSource extends TopLevel[AMClientPublishRemovalFromSource with Double]
  
  /* 5568 */ @js.native
  object AMClientRemoveFriendFromGroup extends TopLevel[AMClientRemoveFriendFromGroup with Double]
  
  /* 5569 */ @js.native
  object AMClientRemoveFriendFromGroupResponse extends TopLevel[AMClientRemoveFriendFromGroupResponse with Double]
  
  /* 5564 */ @js.native
  object AMClientRenameFriendsGroup extends TopLevel[AMClientRenameFriendsGroup with Double]
  
  /* 5565 */ @js.native
  object AMClientRenameFriendsGroupResponse extends TopLevel[AMClientRenameFriendsGroupResponse with Double]
  
  /* 5588 */ @js.native
  object AMClientSetPlayerNickname extends TopLevel[AMClientSetPlayerNickname with Double]
  
  /* 5589 */ @js.native
  object AMClientSetPlayerNicknameResponse extends TopLevel[AMClientSetPlayerNicknameResponse with Double]
  
  /* 4383 */ @js.native
  object AMCompleteExternalPurchase extends TopLevel[AMCompleteExternalPurchase with Double]
  
  /* 4384 */ @js.native
  object AMCompleteExternalPurchaseResponse extends TopLevel[AMCompleteExternalPurchaseResponse with Double]
  
  /* 521 */ @js.native
  object AMCompletePurchase extends TopLevel[AMCompletePurchase with Double]
  
  /* 4093 */ @js.native
  object AMConvertClan extends TopLevel[AMConvertClan with Double]
  
  /* 4251 */ @js.native
  object AMConvertWallet extends TopLevel[AMConvertWallet with Double]
  
  /* 4252 */ @js.native
  object AMConvertWalletResponse extends TopLevel[AMConvertWalletResponse with Double]
  
  /* 4109 */ @js.native
  object AMCreateAccountRecord extends TopLevel[AMCreateAccountRecord with Double]
  
  /* 4183 */ @js.native
  object AMCreateAccountRecordInSteam3 extends TopLevel[AMCreateAccountRecordInSteam3 with Double]
  
  /* 129 */ @js.native
  object AMCreateAccountResponse extends TopLevel[AMCreateAccountResponse with Double]
  
  /* 4260 */ @js.native
  object AMCreateChargeback extends TopLevel[AMCreateChargeback with Double]
  
  /* 4261 */ @js.native
  object AMCreateChargebackResponse extends TopLevel[AMCreateChargebackResponse with Double]
  
  /* 4001 */ @js.native
  object AMCreateChat extends TopLevel[AMCreateChat with Double]
  
  /* 4002 */ @js.native
  object AMCreateChatResponse extends TopLevel[AMCreateChatResponse with Double]
  
  /* 586 */ @js.native
  object AMCreateClan extends TopLevel[AMCreateClan with Double]
  
  /* 4027 */ @js.native
  object AMCreateClanAnnouncement extends TopLevel[AMCreateClanAnnouncement with Double]
  
  /* 4028 */ @js.native
  object AMCreateClanAnnouncementResponse extends TopLevel[AMCreateClanAnnouncementResponse with Double]
  
  /* 4013 */ @js.native
  object AMCreateClanEvent extends TopLevel[AMCreateClanEvent with Double]
  
  /* 4014 */ @js.native
  object AMCreateClanEventResponse extends TopLevel[AMCreateClanEventResponse with Double]
  
  /* 587 */ @js.native
  object AMCreateClanResponse extends TopLevel[AMCreateClanResponse with Double]
  
  /* 4262 */ @js.native
  object AMCreateDispute extends TopLevel[AMCreateDispute with Double]
  
  /* 4263 */ @js.native
  object AMCreateDisputeResponse extends TopLevel[AMCreateDisputeResponse with Double]
  
  /* 4258 */ @js.native
  object AMCreateRefund extends TopLevel[AMCreateRefund with Double]
  
  /* 4259 */ @js.native
  object AMCreateRefundResponse extends TopLevel[AMCreateRefundResponse with Double]
  
  /* 4396 */ @js.native
  object AMDegicaPayment extends TopLevel[AMDegicaPayment with Double]
  
  /* 4397 */ @js.native
  object AMDegicaPaymentResponse extends TopLevel[AMDegicaPaymentResponse with Double]
  
  /* 4035 */ @js.native
  object AMDeleteClanAnnouncement extends TopLevel[AMDeleteClanAnnouncement with Double]
  
  /* 4036 */ @js.native
  object AMDeleteClanAnnouncementResponse extends TopLevel[AMDeleteClanAnnouncementResponse with Double]
  
  /* 4019 */ @js.native
  object AMDeleteClanEvent extends TopLevel[AMDeleteClanEvent with Double]
  
  /* 4020 */ @js.native
  object AMDeleteClanEventResponse extends TopLevel[AMDeleteClanEventResponse with Double]
  
  /* 4204 */ @js.native
  object AMDeleteComment extends TopLevel[AMDeleteComment with Double]
  
  /* 4205 */ @js.native
  object AMDeleteCommentResponse extends TopLevel[AMDeleteCommentResponse with Double]
  
  /* 4241 */ @js.native
  object AMDeleteStoredCard extends TopLevel[AMDeleteStoredCard with Double]
  
  /* 4246 */ @js.native
  object AMDeleteStoredPaymentInfo extends TopLevel[AMDeleteStoredPaymentInfo with Double]
  
  /* 4330 */ @js.native
  object AMDeleteStoredPaypalAgreement extends TopLevel[AMDeleteStoredPaypalAgreement with Double]
  
  /* 4084 */ @js.native
  object AMDumpClan extends TopLevel[AMDumpClan with Double]
  
  /* 4059 */ @js.native
  object AMDumpUser extends TopLevel[AMDumpUser with Double]
  
  /* 4398 */ @js.native
  object AMEClubPayment extends TopLevel[AMEClubPayment with Double]
  
  /* 4399 */ @js.native
  object AMEClubPaymentResponse extends TopLevel[AMEClubPaymentResponse with Double]
  
  /* 4160 */ @js.native
  object AMEditBanReason extends TopLevel[AMEditBanReason with Double]
  
  /* 4382 */ @js.native
  object AMExpireCaptchaByGID extends TopLevel[AMExpireCaptchaByGID with Double]
  
  /* 509 */ @js.native
  object AMExtendLicense extends TopLevel[AMExtendLicense with Double]
  
  /* 4367 */ @js.native
  object AMFinalizePurchase extends TopLevel[AMFinalizePurchase with Double]
  
  /* 4368 */ @js.native
  object AMFinalizePurchaseResponse extends TopLevel[AMFinalizePurchaseResponse with Double]
  
  /* 580 */ @js.native
  object AMFindAccounts extends TopLevel[AMFindAccounts with Double]
  
  /* 581 */ @js.native
  object AMFindAccountsResponse extends TopLevel[AMFindAccountsResponse with Double]
  
  /* 4143 */ @js.native
  object AMFindClanUser extends TopLevel[AMFindClanUser with Double]
  
  /* 4144 */ @js.native
  object AMFindClanUserResponse extends TopLevel[AMFindClanUserResponse with Double]
  
  /* 4106 */ @js.native
  object AMFindGSByIP extends TopLevel[AMFindGSByIP with Double]
  
  /* 518 */ @js.native
  object AMFindHungTransactions extends TopLevel[AMFindHungTransactions with Double]
  
  /* 525 */ @js.native
  object AMFixPendingPurchase extends TopLevel[AMFixPendingPurchase with Double]
  
  /* 526 */ @js.native
  object AMFixPendingPurchaseResponse extends TopLevel[AMFixPendingPurchaseResponse with Double]
  
  /* 535 */ @js.native
  object AMFixPendingRefund extends TopLevel[AMFixPendingRefund with Double]
  
  /* 4107 */ @js.native
  object AMFoundGSByIP extends TopLevel[AMFoundGSByIP with Double]
  
  /* 4100 */ @js.native
  object AMFriendsInCommon extends TopLevel[AMFriendsInCommon with Double]
  
  /* 4102 */ @js.native
  object AMFriendsInCommonCountResponse extends TopLevel[AMFriendsInCommonCountResponse with Double]
  
  /* 4101 */ @js.native
  object AMFriendsInCommonResponse extends TopLevel[AMFriendsInCommonResponse with Double]
  
  /* 4098 */ @js.native
  object AMFriendsList extends TopLevel[AMFriendsList with Double]
  
  /* 4099 */ @js.native
  object AMFriendsListResponse extends TopLevel[AMFriendsListResponse with Double]
  
  /* 6406 */ @js.native
  object AMGMSGameServerRemove extends TopLevel[AMGMSGameServerRemove with Double]
  
  /* 6405 */ @js.native
  object AMGMSGameServerUpdate extends TopLevel[AMGMSGameServerUpdate with Double]
  
  /* 4213 */ @js.native
  object AMGSSearch extends TopLevel[AMGSSearch with Double]
  
  /* 4340 */ @js.native
  object AMGameServerAccountChangePassword extends TopLevel[AMGameServerAccountChangePassword with Double]
  
  /* 4341 */ @js.native
  object AMGameServerAccountDeleteAccount extends TopLevel[AMGameServerAccountDeleteAccount with Double]
  
  /* 4335 */ @js.native
  object AMGameServerPlayerCompatibilityCheck extends TopLevel[AMGameServerPlayerCompatibilityCheck with Double]
  
  /* 4336 */ @js.native
  object AMGameServerPlayerCompatibilityCheckResponse extends TopLevel[AMGameServerPlayerCompatibilityCheckResponse with Double]
  
  /* 4332 */ @js.native
  object AMGameServerRemove extends TopLevel[AMGameServerRemove with Double]
  
  /* 4331 */ @js.native
  object AMGameServerUpdate extends TopLevel[AMGameServerUpdate with Double]
  
  /* 4323 */ @js.native
  object AMGetAccountBanInfo extends TopLevel[AMGetAccountBanInfo with Double]
  
  /* 4324 */ @js.native
  object AMGetAccountBanInfoResponse extends TopLevel[AMGetAccountBanInfoResponse with Double]
  
  /* 4338 */ @js.native
  object AMGetAccountCommunityBanInfo extends TopLevel[AMGetAccountCommunityBanInfo with Double]
  
  /* 4339 */ @js.native
  object AMGetAccountCommunityBanInfoResponse extends TopLevel[AMGetAccountCommunityBanInfoResponse with Double]
  
  /* 4287 */ @js.native
  object AMGetAccountDetails extends TopLevel[AMGetAccountDetails with Double]
  
  /* 4112 */ @js.native
  object AMGetAccountDetails2 extends TopLevel[AMGetAccountDetails2 with Double]
  
  /* 4288 */ @js.native
  object AMGetAccountDetailsResponse extends TopLevel[AMGetAccountDetailsResponse with Double]
  
  /* 4113 */ @js.native
  object AMGetAccountDetailsResponse2 extends TopLevel[AMGetAccountDetailsResponse2 with Double]
  
  /* 4006 */ @js.native
  object AMGetAccountEmailAddress extends TopLevel[AMGetAccountEmailAddress with Double]
  
  /* 4007 */ @js.native
  object AMGetAccountEmailAddressResponse extends TopLevel[AMGetAccountEmailAddressResponse with Double]
  
  /* 4294 */ @js.native
  object AMGetAccountFlagsForWGSpoofing extends TopLevel[AMGetAccountFlagsForWGSpoofing with Double]
  
  /* 4295 */ @js.native
  object AMGetAccountFlagsForWGSpoofingResponse extends TopLevel[AMGetAccountFlagsForWGSpoofingResponse with Double]
  
  /* 594 */ @js.native
  object AMGetAccountFriendsCount extends TopLevel[AMGetAccountFriendsCount with Double]
  
  /* 595 */ @js.native
  object AMGetAccountFriendsCountResponse extends TopLevel[AMGetAccountFriendsCountResponse with Double]
  
  /* 4069 */ @js.native
  object AMGetAccountLinks extends TopLevel[AMGetAccountLinks with Double]
  
  /* 4070 */ @js.native
  object AMGetAccountLinksResponse extends TopLevel[AMGetAccountLinksResponse with Double]
  
  /* 4313 */ @js.native
  object AMGetAccountPSNInfo extends TopLevel[AMGetAccountPSNInfo with Double]
  
  /* 4314 */ @js.native
  object AMGetAccountPSNInfoResponse extends TopLevel[AMGetAccountPSNInfoResponse with Double]
  
  /* 4408 */ @js.native
  object AMGetAccountResetDetailsRequest extends TopLevel[AMGetAccountResetDetailsRequest with Double]
  
  /* 4409 */ @js.native
  object AMGetAccountResetDetailsResponse extends TopLevel[AMGetAccountResetDetailsResponse with Double]
  
  /* 4158 */ @js.native
  object AMGetAccountStatus extends TopLevel[AMGetAccountStatus with Double]
  
  /* 4159 */ @js.native
  object AMGetAccountStatusResponse extends TopLevel[AMGetAccountStatusResponse with Double]
  
  /* 4188 */ @js.native
  object AMGetBillingAddress extends TopLevel[AMGetBillingAddress with Double]
  
  /* 4189 */ @js.native
  object AMGetBillingAddressResponse extends TopLevel[AMGetBillingAddressResponse with Double]
  
  /* 4134 */ @js.native
  object AMGetCaptchaDataByGID extends TopLevel[AMGetCaptchaDataByGID with Double]
  
  /* 4135 */ @js.native
  object AMGetCaptchaDataByGIDResponse extends TopLevel[AMGetCaptchaDataByGIDResponse with Double]
  
  /* 4129 */ @js.native
  object AMGetCaptchaDataForIP extends TopLevel[AMGetCaptchaDataForIP with Double]
  
  /* 4130 */ @js.native
  object AMGetCaptchaDataForIPResponse extends TopLevel[AMGetCaptchaDataForIPResponse with Double]
  
  /* 4239 */ @js.native
  object AMGetCardList extends TopLevel[AMGetCardList with Double]
  
  /* 4240 */ @js.native
  object AMGetCardListResponse extends TopLevel[AMGetCardListResponse with Double]
  
  /* 4065 */ @js.native
  object AMGetChatBanList extends TopLevel[AMGetChatBanList with Double]
  
  /* 4066 */ @js.native
  object AMGetChatBanListResponse extends TopLevel[AMGetChatBanListResponse with Double]
  
  /* 4033 */ @js.native
  object AMGetClanAnnouncements extends TopLevel[AMGetClanAnnouncements with Double]
  
  /* 4031 */ @js.native
  object AMGetClanAnnouncementsCount extends TopLevel[AMGetClanAnnouncementsCount with Double]
  
  /* 4032 */ @js.native
  object AMGetClanAnnouncementsCountResponse extends TopLevel[AMGetClanAnnouncementsCountResponse with Double]
  
  /* 4034 */ @js.native
  object AMGetClanAnnouncementsResponse extends TopLevel[AMGetClanAnnouncementsResponse with Double]
  
  /* 588 */ @js.native
  object AMGetClanDetails extends TopLevel[AMGetClanDetails with Double]
  
  /* 4373 */ @js.native
  object AMGetClanDetailsForForumCreation extends TopLevel[AMGetClanDetailsForForumCreation with Double]
  
  /* 4374 */ @js.native
  object AMGetClanDetailsForForumCreationResponse extends TopLevel[AMGetClanDetailsForForumCreationResponse with Double]
  
  /* 589 */ @js.native
  object AMGetClanDetailsResponse extends TopLevel[AMGetClanDetailsResponse with Double]
  
  /* 4017 */ @js.native
  object AMGetClanEvents extends TopLevel[AMGetClanEvents with Double]
  
  /* 4018 */ @js.native
  object AMGetClanEventsResponse extends TopLevel[AMGetClanEventsResponse with Double]
  
  /* 4039 */ @js.native
  object AMGetClanHistory extends TopLevel[AMGetClanHistory with Double]
  
  /* 4040 */ @js.native
  object AMGetClanHistoryResponse extends TopLevel[AMGetClanHistoryResponse with Double]
  
  /* 4076 */ @js.native
  object AMGetClanMembers extends TopLevel[AMGetClanMembers with Double]
  
  /* 4077 */ @js.native
  object AMGetClanMembersResponse extends TopLevel[AMGetClanMembersResponse with Double]
  
  /* 4088 */ @js.native
  object AMGetClanMembershipList extends TopLevel[AMGetClanMembershipList with Double]
  
  /* 4089 */ @js.native
  object AMGetClanMembershipListResponse extends TopLevel[AMGetClanMembershipListResponse with Double]
  
  /* 4298 */ @js.native
  object AMGetClanOfficers extends TopLevel[AMGetClanOfficers with Double]
  
  /* 4299 */ @js.native
  object AMGetClanOfficersResponse extends TopLevel[AMGetClanOfficersResponse with Double]
  
  /* 4054 */ @js.native
  object AMGetClanPOTW extends TopLevel[AMGetClanPOTW with Double]
  
  /* 4055 */ @js.native
  object AMGetClanPOTWResponse extends TopLevel[AMGetClanPOTWResponse with Double]
  
  /* 4041 */ @js.native
  object AMGetClanPermissionBits extends TopLevel[AMGetClanPermissionBits with Double]
  
  /* 4042 */ @js.native
  object AMGetClanPermissionBitsResponse extends TopLevel[AMGetClanPermissionBitsResponse with Double]
  
  /* 4023 */ @js.native
  object AMGetClanPermissionSettings extends TopLevel[AMGetClanPermissionSettings with Double]
  
  /* 4024 */ @js.native
  object AMGetClanPermissionSettingsResponse extends TopLevel[AMGetClanPermissionSettingsResponse with Double]
  
  /* 4050 */ @js.native
  object AMGetClanRank extends TopLevel[AMGetClanRank with Double]
  
  /* 4051 */ @js.native
  object AMGetClanRankResponse extends TopLevel[AMGetClanRankResponse with Double]
  
  /* 4200 */ @js.native
  object AMGetComments extends TopLevel[AMGetComments with Double]
  
  /* 4201 */ @js.native
  object AMGetCommentsResponse extends TopLevel[AMGetCommentsResponse with Double]
  
  /* 4116 */ @js.native
  object AMGetCommunityPrivacyState extends TopLevel[AMGetCommunityPrivacyState with Double]
  
  /* 4117 */ @js.native
  object AMGetCommunityPrivacyStateResponse extends TopLevel[AMGetCommunityPrivacyStateResponse with Double]
  
  /* 514 */ @js.native
  object AMGetFinalPrice extends TopLevel[AMGetFinalPrice with Double]
  
  /* 515 */ @js.native
  object AMGetFinalPriceResponse extends TopLevel[AMGetFinalPriceResponse with Double]
  
  /* 4124 */ @js.native
  object AMGetFriendRelationship extends TopLevel[AMGetFriendRelationship with Double]
  
  /* 4125 */ @js.native
  object AMGetFriendRelationshipResponse extends TopLevel[AMGetFriendRelationshipResponse with Double]
  
  /* 4165 */ @js.native
  object AMGetFriendsLobbies extends TopLevel[AMGetFriendsLobbies with Double]
  
  /* 4166 */ @js.native
  object AMGetFriendsLobbiesResponse extends TopLevel[AMGetFriendsLobbiesResponse with Double]
  
  /* 4296 */ @js.native
  object AMGetFriendsWishlistInfo extends TopLevel[AMGetFriendsWishlistInfo with Double]
  
  /* 4297 */ @js.native
  object AMGetFriendsWishlistInfoResponse extends TopLevel[AMGetFriendsWishlistInfoResponse with Double]
  
  /* 4271 */ @js.native
  object AMGetGSPlayerList extends TopLevel[AMGetGSPlayerList with Double]
  
  /* 4272 */ @js.native
  object AMGetGSPlayerListResponse extends TopLevel[AMGetGSPlayerListResponse with Double]
  
  /* 4276 */ @js.native
  object AMGetGameMembers extends TopLevel[AMGetGameMembers with Double]
  
  /* 4277 */ @js.native
  object AMGetGameMembersResponse extends TopLevel[AMGetGameMembersResponse with Double]
  
  /* 4094 */ @js.native
  object AMGetGiftTargetListRelay extends TopLevel[AMGetGiftTargetListRelay with Double]
  
  /* 4120 */ @js.native
  object AMGetIgnored extends TopLevel[AMGetIgnored with Double]
  
  /* 4121 */ @js.native
  object AMGetIgnoredResponse extends TopLevel[AMGetIgnoredResponse with Double]
  
  /* 516 */ @js.native
  object AMGetLegacyGameKey extends TopLevel[AMGetLegacyGameKey with Double]
  
  /* 517 */ @js.native
  object AMGetLegacyGameKeyResponse extends TopLevel[AMGetLegacyGameKeyResponse with Double]
  
  /* 539 */ @js.native
  object AMGetLicenses extends TopLevel[AMGetLicenses with Double]
  
  /* 540 */ @js.native
  object AMGetLicensesResponse extends TopLevel[AMGetLicensesResponse with Double]
  
  /* 4136 */ @js.native
  object AMGetLobbyList extends TopLevel[AMGetLobbyList with Double]
  
  /* 4137 */ @js.native
  object AMGetLobbyListResponse extends TopLevel[AMGetLobbyListResponse with Double]
  
  /* 4138 */ @js.native
  object AMGetLobbyMetadata extends TopLevel[AMGetLobbyMetadata with Double]
  
  /* 4139 */ @js.native
  object AMGetLobbyMetadataResponse extends TopLevel[AMGetLobbyMetadataResponse with Double]
  
  /* 4301 */ @js.native
  object AMGetNameHistory extends TopLevel[AMGetNameHistory with Double]
  
  /* 4302 */ @js.native
  object AMGetNameHistoryResponse extends TopLevel[AMGetNameHistoryResponse with Double]
  
  /* 4333 */ @js.native
  object AMGetPaypalAgreements extends TopLevel[AMGetPaypalAgreements with Double]
  
  /* 4334 */ @js.native
  object AMGetPaypalAgreementsResponse extends TopLevel[AMGetPaypalAgreementsResponse with Double]
  
  /* 4375 */ @js.native
  object AMGetPendingNotificationCount extends TopLevel[AMGetPendingNotificationCount with Double]
  
  /* 4376 */ @js.native
  object AMGetPendingNotificationCountResponse extends TopLevel[AMGetPendingNotificationCountResponse with Double]
  
  /* 4365 */ @js.native
  object AMGetPlayerBanDetails extends TopLevel[AMGetPlayerBanDetails with Double]
  
  /* 4366 */ @js.native
  object AMGetPlayerBanDetailsResponse extends TopLevel[AMGetPlayerBanDetailsResponse with Double]
  
  /* 4289 */ @js.native
  object AMGetPlayerLinkDetails extends TopLevel[AMGetPlayerLinkDetails with Double]
  
  /* 4290 */ @js.native
  object AMGetPlayerLinkDetailsResponse extends TopLevel[AMGetPlayerLinkDetailsResponse with Double]
  
  /* 4184 */ @js.native
  object AMGetPreviousCBAccount extends TopLevel[AMGetPreviousCBAccount with Double]
  
  /* 4185 */ @js.native
  object AMGetPreviousCBAccountResponse extends TopLevel[AMGetPreviousCBAccountResponse with Double]
  
  /* 4206 */ @js.native
  object AMGetPurchaseStatus extends TopLevel[AMGetPurchaseStatus with Double]
  
  /* 4037 */ @js.native
  object AMGetSingleClanAnnouncement extends TopLevel[AMGetSingleClanAnnouncement with Double]
  
  /* 4038 */ @js.native
  object AMGetSingleClanAnnouncementResponse extends TopLevel[AMGetSingleClanAnnouncementResponse with Double]
  
  /* 4048 */ @js.native
  object AMGetSingleClanEvent extends TopLevel[AMGetSingleClanEvent with Double]
  
  /* 4049 */ @js.native
  object AMGetSingleClanEventResponse extends TopLevel[AMGetSingleClanEventResponse with Double]
  
  /* 4278 */ @js.native
  object AMGetSteamIDForMicroTxn extends TopLevel[AMGetSteamIDForMicroTxn with Double]
  
  /* 4279 */ @js.native
  object AMGetSteamIDForMicroTxnResponse extends TopLevel[AMGetSteamIDForMicroTxnResponse with Double]
  
  /* 4247 */ @js.native
  object AMGetStoredPaymentSummary extends TopLevel[AMGetStoredPaymentSummary with Double]
  
  /* 4248 */ @js.native
  object AMGetStoredPaymentSummaryResponse extends TopLevel[AMGetStoredPaymentSummaryResponse with Double]
  
  /* 4119 */ @js.native
  object AMGetUserAchievementStatus extends TopLevel[AMGetUserAchievementStatus with Double]
  
  /* 4175 */ @js.native
  object AMGetUserClansNews extends TopLevel[AMGetUserClansNews with Double]
  
  /* 4174 */ @js.native
  object AMGetUserClansNewsResponse extends TopLevel[AMGetUserClansNewsResponse with Double]
  
  /* 4269 */ @js.native
  object AMGetUserCurrentGameInfo extends TopLevel[AMGetUserCurrentGameInfo with Double]
  
  /* 4270 */ @js.native
  object AMGetUserCurrentGameInfoResponse extends TopLevel[AMGetUserCurrentGameInfoResponse with Double]
  
  /* 4172 */ @js.native
  object AMGetUserFriendNewsResponse extends TopLevel[AMGetUserFriendNewsResponse with Double]
  
  /* 4225 */ @js.native
  object AMGetUserFriendsMinutesPlayed extends TopLevel[AMGetUserFriendsMinutesPlayed with Double]
  
  /* 4226 */ @js.native
  object AMGetUserFriendsMinutesPlayedResponse extends TopLevel[AMGetUserFriendsMinutesPlayedResponse with Double]
  
  /* 4073 */ @js.native
  object AMGetUserGameStats extends TopLevel[AMGetUserGameStats with Double]
  
  /* 4074 */ @js.native
  object AMGetUserGameStatsResponse extends TopLevel[AMGetUserGameStatsResponse with Double]
  
  /* 4237 */ @js.native
  object AMGetUserGameplayInfo extends TopLevel[AMGetUserGameplayInfo with Double]
  
  /* 4238 */ @js.native
  object AMGetUserGameplayInfoResponse extends TopLevel[AMGetUserGameplayInfoResponse with Double]
  
  /* 4316 */ @js.native
  object AMGetUserGifts extends TopLevel[AMGetUserGifts with Double]
  
  /* 4317 */ @js.native
  object AMGetUserGiftsResponse extends TopLevel[AMGetUserGiftsResponse with Double]
  
  /* 921 */ @js.native
  object AMGetUserGroupStatus extends TopLevel[AMGetUserGroupStatus with Double]
  
  /* 922 */ @js.native
  object AMGetUserGroupStatusResponse extends TopLevel[AMGetUserGroupStatusResponse with Double]
  
  /* 4154 */ @js.native
  object AMGetUserHistory extends TopLevel[AMGetUserHistory with Double]
  
  /* 4146 */ @js.native
  object AMGetUserHistoryResponse extends TopLevel[AMGetUserHistoryResponse with Double]
  
  /* 4190 */ @js.native
  object AMGetUserLicenseHistory extends TopLevel[AMGetUserLicenseHistory with Double]
  
  /* 4191 */ @js.native
  object AMGetUserLicenseHistoryResponse extends TopLevel[AMGetUserLicenseHistoryResponse with Double]
  
  /* 4282 */ @js.native
  object AMGetUserLicenseList extends TopLevel[AMGetUserLicenseList with Double]
  
  /* 4283 */ @js.native
  object AMGetUserLicenseListResponse extends TopLevel[AMGetUserLicenseListResponse with Double]
  
  /* 4227 */ @js.native
  object AMGetUserMinutesPlayed extends TopLevel[AMGetUserMinutesPlayed with Double]
  
  /* 4228 */ @js.native
  object AMGetUserMinutesPlayedResponse extends TopLevel[AMGetUserMinutesPlayedResponse with Double]
  
  /* 4150 */ @js.native
  object AMGetUserNews extends TopLevel[AMGetUserNews with Double]
  
  /* 4151 */ @js.native
  object AMGetUserNewsResponse extends TopLevel[AMGetUserNewsResponse with Double]
  
  /* 4147 */ @js.native
  object AMGetUserNewsSubscriptions extends TopLevel[AMGetUserNewsSubscriptions with Double]
  
  /* 4148 */ @js.native
  object AMGetUserNewsSubscriptionsResponse extends TopLevel[AMGetUserNewsSubscriptionsResponse with Double]
  
  /* 4211 */ @js.native
  object AMGetUserStats extends TopLevel[AMGetUserStats with Double]
  
  /* 4292 */ @js.native
  object AMGetUserVacBanList extends TopLevel[AMGetUserVacBanList with Double]
  
  /* 4293 */ @js.native
  object AMGetUserVacBanListResponse extends TopLevel[AMGetUserVacBanListResponse with Double]
  
  /* 4249 */ @js.native
  object AMGetWalletConversionRate extends TopLevel[AMGetWalletConversionRate with Double]
  
  /* 4250 */ @js.native
  object AMGetWalletConversionRateResponse extends TopLevel[AMGetWalletConversionRateResponse with Double]
  
  /* 4244 */ @js.native
  object AMGetWalletDetails extends TopLevel[AMGetWalletDetails with Double]
  
  /* 4245 */ @js.native
  object AMGetWalletDetailsResponse extends TopLevel[AMGetWalletDetailsResponse with Double]
  
  /* 4108 */ @js.native
  object AMGiftRevoked extends TopLevel[AMGiftRevoked with Double]
  
  /* 4356 */ @js.native
  object AMGrantCoupon extends TopLevel[AMGrantCoupon with Double]
  
  /* 4357 */ @js.native
  object AMGrantCouponResponse extends TopLevel[AMGrantCouponResponse with Double]
  
  /* 566 */ @js.native
  object AMGrantGuestPasses extends TopLevel[AMGrantGuestPasses with Double]
  
  /* 4361 */ @js.native
  object AMGrantGuestPasses2 extends TopLevel[AMGrantGuestPasses2 with Double]
  
  /* 4362 */ @js.native
  object AMGrantGuestPasses2Response extends TopLevel[AMGrantGuestPasses2Response with Double]
  
  /* 4328 */ @js.native
  object AMHandlePendingTransaction extends TopLevel[AMHandlePendingTransaction with Double]
  
  /* 4360 */ @js.native
  object AMHandlePendingTransactionResponse extends TopLevel[AMHandlePendingTransactionResponse with Double]
  
  /* 512 */ @js.native
  object AMInitPurchase extends TopLevel[AMInitPurchase with Double]
  
  /* 560 */ @js.native
  object AMInitPurchaseResponse extends TopLevel[AMInitPurchaseResponse with Double]
  
  /* 564 */ @js.native
  object AMInviteUserToClan extends TopLevel[AMInviteUserToClan with Double]
  
  /* 4308 */ @js.native
  object AMIsAccountInCaptchaGracePeriod extends TopLevel[AMIsAccountInCaptchaGracePeriod with Double]
  
  /* 4309 */ @js.native
  object AMIsAccountInCaptchaGracePeriodResponse extends TopLevel[AMIsAccountInCaptchaGracePeriodResponse with Double]
  
  /* 4358 */ @js.native
  object AMIsPackageRestrictedInUserCountry extends TopLevel[AMIsPackageRestrictedInUserCountry with Double]
  
  /* 4359 */ @js.native
  object AMIsPackageRestrictedInUserCountryResponse extends TopLevel[AMIsPackageRestrictedInUserCountryResponse with Double]
  
  /* 527 */ @js.native
  object AMIsUserBanned extends TopLevel[AMIsUserBanned with Double]
  
  /* 4092 */ @js.native
  object AMIsValidAccountID extends TopLevel[AMIsValidAccountID with Double]
  
  /* 4078 */ @js.native
  object AMJoinPublicClan extends TopLevel[AMJoinPublicClan with Double]
  
  /* 4060 */ @js.native
  object AMKickUserFromClan extends TopLevel[AMKickUserFromClan with Double]
  
  /* 4010 */ @js.native
  object AMLeaveClan extends TopLevel[AMLeaveClan with Double]
  
  /* 529 */ @js.native
  object AMLoadActivationCodes extends TopLevel[AMLoadActivationCodes with Double]
  
  /* 530 */ @js.native
  object AMLoadActivationCodesResponse extends TopLevel[AMLoadActivationCodesResponse with Double]
  
  /* 524 */ @js.native
  object AMLoadOEMTickets extends TopLevel[AMLoadOEMTickets with Double]
  
  /* 562 */ @js.native
  object AMLockProfile extends TopLevel[AMLockProfile with Double]
  
  /* 532 */ @js.native
  object AMLookupKey extends TopLevel[AMLookupKey with Double]
  
  /* 531 */ @js.native
  object AMLookupKeyResponse extends TopLevel[AMLookupKeyResponse with Double]
  
  /* 4391 */ @js.native
  object AMMOLPayment extends TopLevel[AMMOLPayment with Double]
  
  /* 4392 */ @js.native
  object AMMOLPaymentResponse extends TopLevel[AMMOLPaymentResponse with Double]
  
  /* 4257 */ @js.native
  object AMMarketingTreatmentUpdate extends TopLevel[AMMarketingTreatmentUpdate with Double]
  
  /* 4378 */ @js.native
  object AMMoPayPayment extends TopLevel[AMMoPayPayment with Double]
  
  /* 4379 */ @js.native
  object AMMoPayPaymentResponse extends TopLevel[AMMoPayPaymentResponse with Double]
  
  /* 4300 */ @js.native
  object AMNameChange extends TopLevel[AMNameChange with Double]
  
  /* 523 */ @js.native
  object AMNewChallenge extends TopLevel[AMNewChallenge with Double]
  
  /* 4079 */ @js.native
  object AMNotifyChatOfClanChange extends TopLevel[AMNotifyChatOfClanChange with Double]
  
  /* 6508 */ @js.native
  object AMNotifySessionDeviceAuthorized extends TopLevel[AMNotifySessionDeviceAuthorized with Double]
  
  /* 596 */ @js.native
  object AMP2PIntroducerMessage extends TopLevel[AMP2PIntroducerMessage with Double]
  
  /* 4377 */ @js.native
  object AMPasswordHashUpgrade extends TopLevel[AMPasswordHashUpgrade with Double]
  
  /* 4400 */ @js.native
  object AMPayPalPaymentsHubPayment extends TopLevel[AMPayPalPaymentsHubPayment with Double]
  
  /* 4401 */ @js.native
  object AMPayPalPaymentsHubPaymentResponse extends TopLevel[AMPayPalPaymentsHubPaymentResponse with Double]
  
  /* 4387 */ @js.native
  object AMPayelpPayment extends TopLevel[AMPayelpPayment with Double]
  
  /* 4388 */ @js.native
  object AMPayelpPaymentResponse extends TopLevel[AMPayelpPaymentResponse with Double]
  
  /* 4372 */ @js.native
  object AMPersonaChangeResponse extends TopLevel[AMPersonaChangeResponse with Double]
  
  /* 4389 */ @js.native
  object AMPlayerGetClanBasicDetails extends TopLevel[AMPlayerGetClanBasicDetails with Double]
  
  /* 4390 */ @js.native
  object AMPlayerGetClanBasicDetailsResponse extends TopLevel[AMPlayerGetClanBasicDetailsResponse with Double]
  
  /* 4322 */ @js.native
  object AMPlayerHostedOnGameServer extends TopLevel[AMPlayerHostedOnGameServer with Double]
  
  /* 4266 */ @js.native
  object AMPlayerNicknameList extends TopLevel[AMPlayerNicknameList with Double]
  
  /* 4267 */ @js.native
  object AMPlayerNicknameListResponse extends TopLevel[AMPlayerNicknameListResponse with Double]
  
  /* 557 */ @js.native
  object AMPrimePersonaStateCache extends TopLevel[AMPrimePersonaStateCache with Double]
  
  /* 4162 */ @js.native
  object AMProbeClanMembershipList extends TopLevel[AMProbeClanMembershipList with Double]
  
  /* 4163 */ @js.native
  object AMProbeClanMembershipListResponse extends TopLevel[AMProbeClanMembershipListResponse with Double]
  
  /* 575 */ @js.native
  object AMPublishChatMemberInfo extends TopLevel[AMPublishChatMemberInfo with Double]
  
  /* 4004 */ @js.native
  object AMPublishChatMetadata extends TopLevel[AMPublishChatMetadata with Double]
  
  /* 4025 */ @js.native
  object AMPublishChatRoomInfo extends TopLevel[AMPublishChatRoomInfo with Double]
  
  /* 513 */ @js.native
  object AMPurchaseResponse extends TopLevel[AMPurchaseResponse with Double]
  
  /* 4325 */ @js.native
  object AMRecordBanEnforcement extends TopLevel[AMRecordBanEnforcement with Double]
  
  /* 563 */ @js.native
  object AMRefreshGuestPasses extends TopLevel[AMRefreshGuestPasses with Double]
  
  /* 2210 */ @js.native
  object AMRefreshSessions extends TopLevel[AMRefreshSessions with Double]
  
  /* 528 */ @js.native
  object AMRegisterKey extends TopLevel[AMRegisterKey with Double]
  
  /* 4253 */ @js.native
  object AMRelayGetFriendsWhoPlayGame extends TopLevel[AMRelayGetFriendsWhoPlayGame with Double]
  
  /* 4254 */ @js.native
  object AMRelayGetFriendsWhoPlayGameResponse extends TopLevel[AMRelayGetFriendsWhoPlayGameResponse with Double]
  
  /* 555 */ @js.native
  object AMRelayPublishStatus extends TopLevel[AMRelayPublishStatus with Double]
  
  /* 2201 */ @js.native
  object AMRelayToGC extends TopLevel[AMRelayToGC with Double]
  
  /* 568 */ @js.native
  object AMReloadAccount extends TopLevel[AMReloadAccount with Double]
  
  /* 4284 */ @js.native
  object AMReloadGameGroupPolicy extends TopLevel[AMReloadGameGroupPolicy with Double]
  
  /* 4083 */ @js.native
  object AMRemoveFriend extends TopLevel[AMRemoveFriend with Double]
  
  /* 4281 */ @js.native
  object AMRemovePublisherUser extends TopLevel[AMRemovePublisherUser with Double]
  
  /* 4342 */ @js.native
  object AMRenewAgreement extends TopLevel[AMRenewAgreement with Double]
  
  /* 4337 */ @js.native
  object AMRenewLicense extends TopLevel[AMRenewLicense with Double]
  
  /* 582 */ @js.native
  object AMRequestAccountData extends TopLevel[AMRequestAccountData with Double]
  
  /* 583 */ @js.native
  object AMRequestAccountDataResponse extends TopLevel[AMRequestAccountDataResponse with Double]
  
  /* 4058 */ @js.native
  object AMRequestChatMetadata extends TopLevel[AMRequestChatMetadata with Double]
  
  /* 4008 */ @js.native
  object AMRequestClanData extends TopLevel[AMRequestClanData with Double]
  
  /* 4329 */ @js.native
  object AMRequestClanDetails extends TopLevel[AMRequestClanDetails with Double]
  
  /* 4008 */ @js.native
  object AMRequestFriendData extends TopLevel[AMRequestFriendData with Double]
  
  /* 556 */ @js.native
  object AMResetCommunityContent extends TopLevel[AMResetCommunityContent with Double]
  
  /* 4197 */ @js.native
  object AMResetUserVerificationGSByIP extends TopLevel[AMResetUserVerificationGSByIP with Double]
  
  /* 4385 */ @js.native
  object AMResolveNegativeWalletCredits extends TopLevel[AMResolveNegativeWalletCredits with Double]
  
  /* 4386 */ @js.native
  object AMResolveNegativeWalletCreditsResponse extends TopLevel[AMResolveNegativeWalletCreditsResponse with Double]
  
  /* 4080 */ @js.native
  object AMResubmitPurchase extends TopLevel[AMResubmitPurchase with Double]
  
  /* 536 */ @js.native
  object AMReverseChargeback extends TopLevel[AMReverseChargeback with Double]
  
  /* 537 */ @js.native
  object AMReverseChargebackResponse extends TopLevel[AMReverseChargebackResponse with Double]
  
  /* 4242 */ @js.native
  object AMRevokeLegacyGameKeys extends TopLevel[AMRevokeLegacyGameKeys with Double]
  
  /* 561 */ @js.native
  object AMRevokePurchaseResponse extends TopLevel[AMRevokePurchaseResponse with Double]
  
  /* 4326 */ @js.native
  object AMRollbackGiftTransfer extends TopLevel[AMRollbackGiftTransfer with Double]
  
  /* 4327 */ @js.native
  object AMRollbackGiftTransferResponse extends TopLevel[AMRollbackGiftTransferResponse with Double]
  
  /* 4219 */ @js.native
  object AMRouteFriendMsg extends TopLevel[AMRouteFriendMsg with Double]
  
  /* 4009 */ @js.native
  object AMRouteToClients extends TopLevel[AMRouteToClients with Double]
  
  /* 4412 */ @js.native
  object AMSendAccountInfoUpdate extends TopLevel[AMSendAccountInfoUpdate with Double]
  
  /* 4343 */ @js.native
  object AMSendEmail extends TopLevel[AMSendEmail with Double]
  
  /* 4152 */ @js.native
  object AMSendQueuedEmails extends TopLevel[AMSendQueuedEmails with Double]
  
  /* 508 */ @js.native
  object AMSendSystemIMToUser extends TopLevel[AMSendSystemIMToUser with Double]
  
  /* 4126 */ @js.native
  object AMServiceModulesCache extends TopLevel[AMServiceModulesCache with Double]
  
  /* 4127 */ @js.native
  object AMServiceModulesCall extends TopLevel[AMServiceModulesCall with Double]
  
  /* 4128 */ @js.native
  object AMServiceModulesCallResponse extends TopLevel[AMServiceModulesCallResponse with Double]
  
  /* 4045 */ @js.native
  object AMSessionInfoRequest extends TopLevel[AMSessionInfoRequest with Double]
  
  /* 4046 */ @js.native
  object AMSessionInfoResponse extends TopLevel[AMSessionInfoResponse with Double]
  
  /* 4363 */ @js.native
  object AMSessionQuery extends TopLevel[AMSessionQuery with Double]
  
  /* 4364 */ @js.native
  object AMSessionQueryResponse extends TopLevel[AMSessionQueryResponse with Double]
  
  /* 4064 */ @js.native
  object AMSetAccountDetails extends TopLevel[AMSetAccountDetails with Double]
  
  /* 584 */ @js.native
  object AMSetAccountFlags extends TopLevel[AMSetAccountFlags with Double]
  
  /* 4071 */ @js.native
  object AMSetAccountLinks extends TopLevel[AMSetAccountLinks with Double]
  
  /* 4072 */ @js.native
  object AMSetAccountLinksResponse extends TopLevel[AMSetAccountLinksResponse with Double]
  
  /* 519 */ @js.native
  object AMSetAccountTrustedRequest extends TopLevel[AMSetAccountTrustedRequest with Double]
  
  /* 591 */ @js.native
  object AMSetAvatar extends TopLevel[AMSetAvatar with Double]
  
  /* 4068 */ @js.native
  object AMSetClanDetails extends TopLevel[AMSetClanDetails with Double]
  
  /* 4354 */ @js.native
  object AMSetClanName extends TopLevel[AMSetClanName with Double]
  
  /* 4355 */ @js.native
  object AMSetClanNameResponse extends TopLevel[AMSetClanNameResponse with Double]
  
  /* 4056 */ @js.native
  object AMSetClanPOTW extends TopLevel[AMSetClanPOTW with Double]
  
  /* 4057 */ @js.native
  object AMSetClanPOTWResponse extends TopLevel[AMSetClanPOTWResponse with Double]
  
  /* 4043 */ @js.native
  object AMSetClanPermissionBits extends TopLevel[AMSetClanPermissionBits with Double]
  
  /* 4044 */ @js.native
  object AMSetClanPermissionBitsResponse extends TopLevel[AMSetClanPermissionBitsResponse with Double]
  
  /* 4021 */ @js.native
  object AMSetClanPermissionSettings extends TopLevel[AMSetClanPermissionSettings with Double]
  
  /* 4022 */ @js.native
  object AMSetClanPermissionSettingsResponse extends TopLevel[AMSetClanPermissionSettingsResponse with Double]
  
  /* 4052 */ @js.native
  object AMSetClanRank extends TopLevel[AMSetClanRank with Double]
  
  /* 4053 */ @js.native
  object AMSetClanRankResponse extends TopLevel[AMSetClanRankResponse with Double]
  
  /* 4114 */ @js.native
  object AMSetCommunityProfileSettings extends TopLevel[AMSetCommunityProfileSettings with Double]
  
  /* 4115 */ @js.native
  object AMSetCommunityProfileSettingsResponse extends TopLevel[AMSetCommunityProfileSettingsResponse with Double]
  
  /* 4063 */ @js.native
  object AMSetCommunityState extends TopLevel[AMSetCommunityState with Double]
  
  /* 4268 */ @js.native
  object AMSetDRMTestConfig extends TopLevel[AMSetDRMTestConfig with Double]
  
  /* 4123 */ @js.native
  object AMSetFriendRelationshipNone extends TopLevel[AMSetFriendRelationshipNone with Double]
  
  /* 4096 */ @js.native
  object AMSetIgnored extends TopLevel[AMSetIgnored with Double]
  
  /* 4122 */ @js.native
  object AMSetIgnoredResponse extends TopLevel[AMSetIgnoredResponse with Double]
  
  /* 4153 */ @js.native
  object AMSetLicenseFlags extends TopLevel[AMSetLicenseFlags with Double]
  
  /* 590 */ @js.native
  object AMSetPersonaName extends TopLevel[AMSetPersonaName with Double]
  
  /* 4255 */ @js.native
  object AMSetPreApproval extends TopLevel[AMSetPreApproval with Double]
  
  /* 4256 */ @js.native
  object AMSetPreApprovalResponse extends TopLevel[AMSetPreApprovalResponse with Double]
  
  /* 4005 */ @js.native
  object AMSetProfileURL extends TopLevel[AMSetProfileURL with Double]
  
  /* 4350 */ @js.native
  object AMSetUserGiftUnowned extends TopLevel[AMSetUserGiftUnowned with Double]
  
  /* 4351 */ @js.native
  object AMSetUserGiftUnownedResponse extends TopLevel[AMSetUserGiftUnownedResponse with Double]
  
  /* 4149 */ @js.native
  object AMSetUserNewsSubscriptions extends TopLevel[AMSetUserNewsSubscriptions with Double]
  
  /* 4404 */ @js.native
  object AMSmart2PayPayment extends TopLevel[AMSmart2PayPayment with Double]
  
  /* 4405 */ @js.native
  object AMSmart2PayPaymentResponse extends TopLevel[AMSmart2PayPaymentResponse with Double]
  
  /* 4181 */ @js.native
  object AMStoreCancelPurchase extends TopLevel[AMStoreCancelPurchase with Double]
  
  /* 4180 */ @js.native
  object AMStoreCompletePurchase extends TopLevel[AMStoreCompletePurchase with Double]
  
  /* 4178 */ @js.native
  object AMStoreGetFinalPrice extends TopLevel[AMStoreGetFinalPrice with Double]
  
  /* 4179 */ @js.native
  object AMStoreGetFinalPriceResponse extends TopLevel[AMStoreGetFinalPriceResponse with Double]
  
  /* 4176 */ @js.native
  object AMStoreInitPurchase extends TopLevel[AMStoreInitPurchase with Double]
  
  /* 4177 */ @js.native
  object AMStoreInitPurchaseResponse extends TopLevel[AMStoreInitPurchaseResponse with Double]
  
  /* 4182 */ @js.native
  object AMStorePurchaseResponse extends TopLevel[AMStorePurchaseResponse with Double]
  
  /* 4236 */ @js.native
  object AMStoreUserStats extends TopLevel[AMStoreUserStats with Double]
  
  /* 4312 */ @js.native
  object AMStoreUserStatsResponse extends TopLevel[AMStoreUserStatsResponse with Double]
  
  /* 4291 */ @js.native
  object AMSubscribeToPersonaFeed extends TopLevel[AMSubscribeToPersonaFeed with Double]
  
  /* 4195 */ @js.native
  object AMSupportChangeEmail extends TopLevel[AMSupportChangeEmail with Double]
  
  /* 4194 */ @js.native
  object AMSupportChangePassword extends TopLevel[AMSupportChangePassword with Double]
  
  /* 4196 */ @js.native
  object AMSupportChangeSecretQA extends TopLevel[AMSupportChangeSecretQA with Double]
  
  /* 4199 */ @js.native
  object AMSupportEnableOrDisable extends TopLevel[AMSupportEnableOrDisable with Double]
  
  /* 4209 */ @js.native
  object AMSupportIsAccountEnabled extends TopLevel[AMSupportIsAccountEnabled with Double]
  
  /* 4210 */ @js.native
  object AMSupportIsAccountEnabledResponse extends TopLevel[AMSupportIsAccountEnabledResponse with Double]
  
  /* 4212 */ @js.native
  object AMSupportKickSession extends TopLevel[AMSupportKickSession with Double]
  
  /* 4307 */ @js.native
  object AMSupportRemoveAccountSecurity extends TopLevel[AMSupportRemoveAccountSecurity with Double]
  
  /* 4348 */ @js.native
  object AMSwapKioskDeposit extends TopLevel[AMSwapKioskDeposit with Double]
  
  /* 4349 */ @js.native
  object AMSwapKioskDepositResponse extends TopLevel[AMSwapKioskDepositResponse with Double]
  
  /* 4220 */ @js.native
  object AMTicketAuthRequestOrResponse extends TopLevel[AMTicketAuthRequestOrResponse with Double]
  
  /* 5812 */ @js.native
  object AMToMDSGetDepotDecryptionKey extends TopLevel[AMToMDSGetDepotDecryptionKey with Double]
  
  /* 4133 */ @js.native
  object AMTrackFailedAuthByIP extends TopLevel[AMTrackFailedAuthByIP with Double]
  
  /* 4320 */ @js.native
  object AMTransferLockedGifts extends TopLevel[AMTransferLockedGifts with Double]
  
  /* 4321 */ @js.native
  object AMTransferLockedGiftsResponse extends TopLevel[AMTransferLockedGiftsResponse with Double]
  
  /* 4402 */ @js.native
  object AMTwoFactorRecoverAuthenticatorRequest extends TopLevel[AMTwoFactorRecoverAuthenticatorRequest with Double]
  
  /* 4403 */ @js.native
  object AMTwoFactorRecoverAuthenticatorResponse extends TopLevel[AMTwoFactorRecoverAuthenticatorResponse with Double]
  
  /* 4067 */ @js.native
  object AMUnBanFromChat extends TopLevel[AMUnBanFromChat with Double]
  
  /* 4186 */ @js.native
  object AMUpdateBillingAddress extends TopLevel[AMUpdateBillingAddress with Double]
  
  /* 4187 */ @js.native
  object AMUpdateBillingAddressResponse extends TopLevel[AMUpdateBillingAddressResponse with Double]
  
  /* 4003 */ @js.native
  object AMUpdateChatMetadata extends TopLevel[AMUpdateChatMetadata with Double]
  
  /* 4029 */ @js.native
  object AMUpdateClanAnnouncement extends TopLevel[AMUpdateClanAnnouncement with Double]
  
  /* 4030 */ @js.native
  object AMUpdateClanAnnouncementResponse extends TopLevel[AMUpdateClanAnnouncementResponse with Double]
  
  /* 4015 */ @js.native
  object AMUpdateClanEvent extends TopLevel[AMUpdateClanEvent with Double]
  
  /* 4016 */ @js.native
  object AMUpdateClanEventResponse extends TopLevel[AMUpdateClanEventResponse with Double]
  
  /* 4198 */ @js.native
  object AMUpdateGSPlayStats extends TopLevel[AMUpdateGSPlayStats with Double]
  
  /* 4275 */ @js.native
  object AMUpdatePersonaStateCache extends TopLevel[AMUpdatePersonaStateCache with Double]
  
  /* 4305 */ @js.native
  object AMUpdateProviderStatus extends TopLevel[AMUpdateProviderStatus with Double]
  
  /* 504 */ @js.native
  object AMUpdateUserBanRequest extends TopLevel[AMUpdateUserBanRequest with Double]
  
  /* 4110 */ @js.native
  object AMUserClanList extends TopLevel[AMUserClanList with Double]
  
  /* 4111 */ @js.native
  object AMUserClanListResponse extends TopLevel[AMUserClanListResponse with Double]
  
  /* 4286 */ @js.native
  object AMVACStatusUpdate extends TopLevel[AMVACStatusUpdate with Double]
  
  /* 4131 */ @js.native
  object AMValidateCaptchaDataForIP extends TopLevel[AMValidateCaptchaDataForIP with Double]
  
  /* 4132 */ @js.native
  object AMValidateCaptchaDataForIPResponse extends TopLevel[AMValidateCaptchaDataForIPResponse with Double]
  
  /* 4231 */ @js.native
  object AMValidateEmailLink extends TopLevel[AMValidateEmailLink with Double]
  
  /* 4232 */ @js.native
  object AMValidateEmailLinkResponse extends TopLevel[AMValidateEmailLinkResponse with Double]
  
  /* 4406 */ @js.native
  object AMValidatePasswordResetCodeAndSendSmsRequest extends TopLevel[AMValidatePasswordResetCodeAndSendSmsRequest with Double]
  
  /* 4407 */ @js.native
  object AMValidatePasswordResetCodeAndSendSmsResponse extends TopLevel[AMValidatePasswordResetCodeAndSendSmsResponse with Double]
  
  /* 4047 */ @js.native
  object AMValidateWGToken extends TopLevel[AMValidateWGToken with Double]
  
  /* 4062 */ @js.native
  object AMValidateWGTokenResponse extends TopLevel[AMValidateWGTokenResponse with Double]
  
  /* 552 */ @js.native
  object AMVerfiyUser extends TopLevel[AMVerfiyUser with Double]
  
  /* 4222 */ @js.native
  object AMVerifyDepotManagementRights extends TopLevel[AMVerifyDepotManagementRights with Double]
  
  /* 4223 */ @js.native
  object AMVerifyDepotManagementRightsResponse extends TopLevel[AMVerifyDepotManagementRightsResponse with Double]
  
  /* 4095 */ @js.native
  object AMWipeFriendsList extends TopLevel[AMWipeFriendsList with Double]
  
  /* 4142 */ @js.native
  object AMWriteNews extends TopLevel[AMWriteNews with Double]
  
  /* 4344 */ @js.native
  object AMXsollaPayment extends TopLevel[AMXsollaPayment with Double]
  
  /* 4345 */ @js.native
  object AMXsollaPaymentResponse extends TopLevel[AMXsollaPaymentResponse with Double]
  
  /* 1519 */ @js.native
  object ATSCSPerfTestResponse extends TopLevel[ATSCSPerfTestResponse with Double]
  
  /* 1518 */ @js.native
  object ATSCSPerfTestTask extends TopLevel[ATSCSPerfTestTask with Double]
  
  /* 1508 */ @js.native
  object ATSCallTest extends TopLevel[ATSCallTest with Double]
  
  /* 1509 */ @js.native
  object ATSCallTestReply extends TopLevel[ATSCallTestReply with Double]
  
  /* 1506 */ @js.native
  object ATSCycleTCM extends TopLevel[ATSCycleTCM with Double]
  
  /* 1516 */ @js.native
  object ATSExternalStressActionResult extends TopLevel[ATSExternalStressActionResult with Double]
  
  /* 1512 */ @js.native
  object ATSExternalStressJobQueued extends TopLevel[ATSExternalStressJobQueued with Double]
  
  /* 1513 */ @js.native
  object ATSExternalStressJobRunning extends TopLevel[ATSExternalStressJobRunning with Double]
  
  /* 1511 */ @js.native
  object ATSExternalStressJobStart extends TopLevel[ATSExternalStressJobStart with Double]
  
  /* 1515 */ @js.native
  object ATSExternalStressJobStopAll extends TopLevel[ATSExternalStressJobStopAll with Double]
  
  /* 1514 */ @js.native
  object ATSExternalStressJobStopped extends TopLevel[ATSExternalStressJobStopped with Double]
  
  /* 1507 */ @js.native
  object ATSInitDRMSStressTest extends TopLevel[ATSInitDRMSStressTest with Double]
  
  /* 1503 */ @js.native
  object ATSRunFailServerTest extends TopLevel[ATSRunFailServerTest with Double]
  
  /* 1510 */ @js.native
  object ATSStartExternalStress extends TopLevel[ATSStartExternalStress with Double]
  
  /* 1501 */ @js.native
  object ATSStartStressTest extends TopLevel[ATSStartStressTest with Double]
  
  /* 1517 */ @js.native
  object ATSStarted extends TopLevel[ATSStarted with Double]
  
  /* 1502 */ @js.native
  object ATSStopStressTest extends TopLevel[ATSStopStressTest with Double]
  
  /* 1505 */ @js.native
  object ATSUFSPerfTestResponse extends TopLevel[ATSUFSPerfTestResponse with Double]
  
  /* 1504 */ @js.native
  object ATSUFSPerfTestTask extends TopLevel[ATSUFSPerfTestTask with Double]
  
  /* 1000 */ @js.native
  object AdminCmd extends TopLevel[AdminCmd with Double]
  
  /* 1004 */ @js.native
  object AdminCmdResponse extends TopLevel[AdminCmdResponse with Double]
  
  /* 1020 */ @js.native
  object AdminConsoleTitle extends TopLevel[AdminConsoleTitle with Double]
  
  /* 1024 */ @js.native
  object AdminGCCommand extends TopLevel[AdminGCCommand with Double]
  
  /* 1025 */ @js.native
  object AdminGCGetCommandList extends TopLevel[AdminGCGetCommandList with Double]
  
  /* 1026 */ @js.native
  object AdminGCGetCommandListResponse extends TopLevel[AdminGCGetCommandListResponse with Double]
  
  /* 1023 */ @js.native
  object AdminGCSpew extends TopLevel[AdminGCSpew with Double]
  
  /* 1006 */ @js.native
  object AdminLogEvent extends TopLevel[AdminLogEvent with Double]
  
  /* 1005 */ @js.native
  object AdminLogListenRequest extends TopLevel[AdminLogListenRequest with Double]
  
  /* 1028 */ @js.native
  object AdminMsgSpew extends TopLevel[AdminMsgSpew with Double]
  
  /* 1017 */ @js.native
  object AdminPwLogon extends TopLevel[AdminPwLogon with Double]
  
  /* 1018 */ @js.native
  object AdminPwLogonResponse extends TopLevel[AdminPwLogonResponse with Double]
  
  /* 1019 */ @js.native
  object AdminSpew extends TopLevel[AdminSpew with Double]
  
  /* 115 */ @js.native
  object Alert extends TopLevel[Alert with Double]
  
  /* 550 */ @js.native
  object AllowUserToPlayQuery extends TopLevel[AllowUserToPlayQuery with Double]
  
  /* 551 */ @js.native
  object AllowUserToPlayResponse extends TopLevel[AllowUserToPlayResponse with Double]
  
  /* 200 */ @js.native
  object AssignSysID extends TopLevel[AssignSysID with Double]
  
  /* 3619 */ @js.native
  object BRPCheckActivationCodes extends TopLevel[BRPCheckActivationCodes with Double]
  
  /* 3620 */ @js.native
  object BRPCheckActivationCodesResponse extends TopLevel[BRPCheckActivationCodesResponse with Double]
  
  /* 3610 */ @js.native
  object BRPCheckFinanceCloseOutDate extends TopLevel[BRPCheckFinanceCloseOutDate with Double]
  
  /* 3626 */ @js.native
  object BRPCheckSettlementReports extends TopLevel[BRPCheckSettlementReports with Double]
  
  /* 3607 */ @js.native
  object BRPCommitGC extends TopLevel[BRPCommitGC with Double]
  
  /* 3608 */ @js.native
  object BRPCommitGCResponse extends TopLevel[BRPCommitGCResponse with Double]
  
  /* 3621 */ @js.native
  object BRPCommitWP extends TopLevel[BRPCommitWP with Double]
  
  /* 3622 */ @js.native
  object BRPCommitWPResponse extends TopLevel[BRPCommitWPResponse with Double]
  
  /* 3615 */ @js.native
  object BRPConvertToCurrentKeys extends TopLevel[BRPConvertToCurrentKeys with Double]
  
  /* 3616 */ @js.native
  object BRPConvertToCurrentKeysResponse extends TopLevel[BRPConvertToCurrentKeysResponse with Double]
  
  /* 3609 */ @js.native
  object BRPFindHungTransactions extends TopLevel[BRPFindHungTransactions with Double]
  
  /* 3628 */ @js.native
  object BRPPostTaxToAvalara extends TopLevel[BRPPostTaxToAvalara with Double]
  
  /* 3629 */ @js.native
  object BRPPostTransactionTax extends TopLevel[BRPPostTransactionTax with Double]
  
  /* 3630 */ @js.native
  object BRPPostTransactionTaxResponse extends TopLevel[BRPPostTransactionTaxResponse with Double]
  
  /* 3603 */ @js.native
  object BRPProcessGCReports extends TopLevel[BRPProcessGCReports with Double]
  
  /* 3631 */ @js.native
  object BRPProcessIMReports extends TopLevel[BRPProcessIMReports with Double]
  
  /* 3611 */ @js.native
  object BRPProcessLicenses extends TopLevel[BRPProcessLicenses with Double]
  
  /* 3612 */ @js.native
  object BRPProcessLicensesResponse extends TopLevel[BRPProcessLicensesResponse with Double]
  
  /* 3604 */ @js.native
  object BRPProcessPPReports extends TopLevel[BRPProcessPPReports with Double]
  
  /* 3625 */ @js.native
  object BRPProcessPartnerPayments extends TopLevel[BRPProcessPartnerPayments with Double]
  
  /* 3624 */ @js.native
  object BRPProcessPaymentRules extends TopLevel[BRPProcessPaymentRules with Double]
  
  /* 3602 */ @js.native
  object BRPProcessUSBankReports extends TopLevel[BRPProcessUSBankReports with Double]
  
  /* 3623 */ @js.native
  object BRPProcessWPReports extends TopLevel[BRPProcessWPReports with Double]
  
  /* 3617 */ @js.native
  object BRPPruneCardUsageStats extends TopLevel[BRPPruneCardUsageStats with Double]
  
  /* 3618 */ @js.native
  object BRPPruneCardUsageStatsResponse extends TopLevel[BRPPruneCardUsageStatsResponse with Double]
  
  /* 3613 */ @js.native
  object BRPRemoveExpiredPaymentData extends TopLevel[BRPRemoveExpiredPaymentData with Double]
  
  /* 3614 */ @js.native
  object BRPRemoveExpiredPaymentDataResponse extends TopLevel[BRPRemoveExpiredPaymentDataResponse with Double]
  
  /* 3606 */ @js.native
  object BRPSettleCB extends TopLevel[BRPSettleCB with Double]
  
  /* 3605 */ @js.native
  object BRPSettleNOVA extends TopLevel[BRPSettleNOVA with Double]
  
  /* 3601 */ @js.native
  object BRPStartShippingJobs extends TopLevel[BRPStartShippingJobs with Double]
  
  /* 1407 */ @js.native
  object BSBannedRequest extends TopLevel[BSBannedRequest with Double]
  
  /* 1494 */ @js.native
  object BSBoaCompraConfirmProductDelivery extends TopLevel[BSBoaCompraConfirmProductDelivery with Double]
  
  /* 1495 */ @js.native
  object BSBoaCompraConfirmProductDeliveryResponse extends TopLevel[BSBoaCompraConfirmProductDeliveryResponse with Double]
  
  /* 1416 */ @js.native
  object BSChaseRFRRequest extends TopLevel[BSChaseRFRRequest with Double]
  
  /* 1456 */ @js.native
  object BSCheckJobRunning extends TopLevel[BSCheckJobRunning with Double]
  
  /* 1457 */ @js.native
  object BSCheckJobRunningResponse extends TopLevel[BSCheckJobRunningResponse with Double]
  
  /* 1425 */ @js.native
  object BSCommitGCTxn extends TopLevel[BSCommitGCTxn with Double]
  
  /* 1498 */ @js.native
  object BSCommitWPTxn extends TopLevel[BSCommitWPTxn with Double]
  
  /* 1474 */ @js.native
  object BSCompletePurchase extends TopLevel[BSCompletePurchase with Double]
  
  /* 1475 */ @js.native
  object BSCompletePurchaseResponse extends TopLevel[BSCompletePurchaseResponse with Double]
  
  /* 1470 */ @js.native
  object BSConvertToCurrentKeys extends TopLevel[BSConvertToCurrentKeys with Double]
  
  /* 1471 */ @js.native
  object BSConvertToCurrentKeysResponse extends TopLevel[BSConvertToCurrentKeysResponse with Double]
  
  /* 1496 */ @js.native
  object BSGenerateBoaCompraMD5 extends TopLevel[BSGenerateBoaCompraMD5 with Double]
  
  /* 1497 */ @js.native
  object BSGenerateBoaCompraMD5Response extends TopLevel[BSGenerateBoaCompraMD5Response with Double]
  
  /* 1492 */ @js.native
  object BSGenerateMoPayMD5 extends TopLevel[BSGenerateMoPayMD5 with Double]
  
  /* 1493 */ @js.native
  object BSGenerateMoPayMD5Response extends TopLevel[BSGenerateMoPayMD5Response with Double]
  
  /* 1462 */ @js.native
  object BSGetBillingAddress extends TopLevel[BSGetBillingAddress with Double]
  
  /* 1463 */ @js.native
  object BSGetBillingAddressResponse extends TopLevel[BSGetBillingAddressResponse with Double]
  
  /* 1464 */ @js.native
  object BSGetCreditCardInfo extends TopLevel[BSGetCreditCardInfo with Double]
  
  /* 1465 */ @js.native
  object BSGetCreditCardInfoResponse extends TopLevel[BSGetCreditCardInfoResponse with Double]
  
  /* 1415 */ @js.native
  object BSGetEvents extends TopLevel[BSGetEvents with Double]
  
  /* 1410 */ @js.native
  object BSGetPayPalUserInfo extends TopLevel[BSGetPayPalUserInfo with Double]
  
  /* 1411 */ @js.native
  object BSGetPayPalUserInfoResponse extends TopLevel[BSGetPayPalUserInfoResponse with Double]
  
  /* 1454 */ @js.native
  object BSGetProPackOrderStatus extends TopLevel[BSGetProPackOrderStatus with Double]
  
  /* 1455 */ @js.native
  object BSGetProPackOrderStatusResponse extends TopLevel[BSGetProPackOrderStatusResponse with Double]
  
  /* 1421 */ @js.native
  object BSInitGCBankXferTxn extends TopLevel[BSInitGCBankXferTxn with Double]
  
  /* 1422 */ @js.native
  object BSInitGCBankXferTxnResponse extends TopLevel[BSInitGCBankXferTxnResponse with Double]
  
  /* 1408 */ @js.native
  object BSInitPayPalTxn extends TopLevel[BSInitPayPalTxn with Double]
  
  /* 1409 */ @js.native
  object BSInitPayPalTxnResponse extends TopLevel[BSInitPayPalTxnResponse with Double]
  
  /* 1472 */ @js.native
  object BSInitPurchase extends TopLevel[BSInitPurchase with Double]
  
  /* 1473 */ @js.native
  object BSInitPurchaseResponse extends TopLevel[BSInitPurchaseResponse with Double]
  
  /* 1490 */ @js.native
  object BSMoPayConfirmProductDelivery extends TopLevel[BSMoPayConfirmProductDelivery with Double]
  
  /* 1491 */ @js.native
  object BSMoPayConfirmProductDeliveryResponse extends TopLevel[BSMoPayConfirmProductDeliveryResponse with Double]
  
  /* 1417 */ @js.native
  object BSPaymentInstrBan extends TopLevel[BSPaymentInstrBan with Double]
  
  /* 1418 */ @js.native
  object BSPaymentInstrBanResponse extends TopLevel[BSPaymentInstrBanResponse with Double]
  
  /* 1419 */ @js.native
  object BSProcessGCReports extends TopLevel[BSProcessGCReports with Double]
  
  /* 1420 */ @js.native
  object BSProcessPPReports extends TopLevel[BSProcessPPReports with Double]
  
  /* 1436 */ @js.native
  object BSProcessUSBankReports extends TopLevel[BSProcessUSBankReports with Double]
  
  /* 1476 */ @js.native
  object BSPruneCardUsageStats extends TopLevel[BSPruneCardUsageStats with Double]
  
  /* 1477 */ @js.native
  object BSPruneCardUsageStatsResponse extends TopLevel[BSPruneCardUsageStatsResponse with Double]
  
  /* 1402 */ @js.native
  object BSPurchaseResponse extends TopLevel[BSPurchaseResponse with Double]
  
  /* 1437 */ @js.native
  object BSPurchaseRunFraudChecks extends TopLevel[BSPurchaseRunFraudChecks with Double]
  
  /* 1438 */ @js.native
  object BSPurchaseRunFraudChecksResponse extends TopLevel[BSPurchaseRunFraudChecksResponse with Double]
  
  /* 1401 */ @js.native
  object BSPurchaseStart extends TopLevel[BSPurchaseStart with Double]
  
  /* 1448 */ @js.native
  object BSQiwiWalletInvoice extends TopLevel[BSQiwiWalletInvoice with Double]
  
  /* 1449 */ @js.native
  object BSQiwiWalletInvoiceResponse extends TopLevel[BSQiwiWalletInvoiceResponse with Double]
  
  /* 1440 */ @js.native
  object BSQueryBankInformation extends TopLevel[BSQueryBankInformation with Double]
  
  /* 1441 */ @js.native
  object BSQueryBankInformationResponse extends TopLevel[BSQueryBankInformationResponse with Double]
  
  /* 1428 */ @js.native
  object BSQueryCBOrderStatus extends TopLevel[BSQueryCBOrderStatus with Double]
  
  /* 1429 */ @js.native
  object BSQueryCBOrderStatusResponse extends TopLevel[BSQueryCBOrderStatusResponse with Double]
  
  /* 1484 */ @js.native
  object BSQueryFindCreditCard extends TopLevel[BSQueryFindCreditCard with Double]
  
  /* 1485 */ @js.native
  object BSQueryFindCreditCardResponse extends TopLevel[BSQueryFindCreditCardResponse with Double]
  
  /* 1423 */ @js.native
  object BSQueryGCBankXferTxn extends TopLevel[BSQueryGCBankXferTxn with Double]
  
  /* 1424 */ @js.native
  object BSQueryGCBankXferTxnResponse extends TopLevel[BSQueryGCBankXferTxnResponse with Double]
  
  /* 1432 */ @js.native
  object BSQueryPaymentInstResponse extends TopLevel[BSQueryPaymentInstResponse with Double]
  
  /* 1431 */ @js.native
  object BSQueryPaymentInstUsage extends TopLevel[BSQueryPaymentInstUsage with Double]
  
  /* 1426 */ @js.native
  object BSQueryTransactionStatus extends TopLevel[BSQueryTransactionStatus with Double]
  
  /* 1427 */ @js.native
  object BSQueryTransactionStatusResponse extends TopLevel[BSQueryTransactionStatusResponse with Double]
  
  /* 1433 */ @js.native
  object BSQueryTxnExtendedInfo extends TopLevel[BSQueryTxnExtendedInfo with Double]
  
  /* 1434 */ @js.native
  object BSQueryTxnExtendedInfoResponse extends TopLevel[BSQueryTxnExtendedInfoResponse with Double]
  
  /* 1413 */ @js.native
  object BSRefundTxn extends TopLevel[BSRefundTxn with Double]
  
  /* 1414 */ @js.native
  object BSRefundTxnResponse extends TopLevel[BSRefundTxnResponse with Double]
  
  /* 1468 */ @js.native
  object BSRemoveExpiredPaymentData extends TopLevel[BSRemoveExpiredPaymentData with Double]
  
  /* 1469 */ @js.native
  object BSRemoveExpiredPaymentDataResponse extends TopLevel[BSRemoveExpiredPaymentDataResponse with Double]
  
  /* 1458 */ @js.native
  object BSResetPackagePurchaseRateLimit extends TopLevel[BSResetPackagePurchaseRateLimit with Double]
  
  /* 1459 */ @js.native
  object BSResetPackagePurchaseRateLimitResponse extends TopLevel[BSResetPackagePurchaseRateLimitResponse with Double]
  
  /* 1482 */ @js.native
  object BSReverseRedeemPOSAKey extends TopLevel[BSReverseRedeemPOSAKey with Double]
  
  /* 1483 */ @js.native
  object BSReverseRedeemPOSAKeyResponse extends TopLevel[BSReverseRedeemPOSAKeyResponse with Double]
  
  /* 1430 */ @js.native
  object BSRunRedFlagReport extends TopLevel[BSRunRedFlagReport with Double]
  
  /* 1452 */ @js.native
  object BSSendShippingRequest extends TopLevel[BSSendShippingRequest with Double]
  
  /* 1453 */ @js.native
  object BSSendShippingRequestResponse extends TopLevel[BSSendShippingRequestResponse with Double]
  
  /* 1406 */ @js.native
  object BSSettleComplete extends TopLevel[BSSettleComplete with Double]
  
  /* 1404 */ @js.native
  object BSSettleNOVA extends TopLevel[BSSettleNOVA with Double]
  
  /* 1439 */ @js.native
  object BSStartShippingJobs extends TopLevel[BSStartShippingJobs with Double]
  
  /* 1486 */ @js.native
  object BSStatusInquiryPOSAKey extends TopLevel[BSStatusInquiryPOSAKey with Double]
  
  /* 1487 */ @js.native
  object BSStatusInquiryPOSAKeyResponse extends TopLevel[BSStatusInquiryPOSAKeyResponse with Double]
  
  /* 1478 */ @js.native
  object BSStoreBankInformation extends TopLevel[BSStoreBankInformation with Double]
  
  /* 1479 */ @js.native
  object BSStoreBankInformationResponse extends TopLevel[BSStoreBankInformationResponse with Double]
  
  /* 1435 */ @js.native
  object BSUpdateConversionRates extends TopLevel[BSUpdateConversionRates with Double]
  
  /* 1450 */ @js.native
  object BSUpdateInventoryFromProPack extends TopLevel[BSUpdateInventoryFromProPack with Double]
  
  /* 1451 */ @js.native
  object BSUpdateInventoryFromProPackResponse extends TopLevel[BSUpdateInventoryFromProPackResponse with Double]
  
  /* 1460 */ @js.native
  object BSUpdatePaymentData extends TopLevel[BSUpdatePaymentData with Double]
  
  /* 1461 */ @js.native
  object BSUpdatePaymentDataResponse extends TopLevel[BSUpdatePaymentDataResponse with Double]
  
  /* 1488 */ @js.native
  object BSValidateMoPaySignature extends TopLevel[BSValidateMoPaySignature with Double]
  
  /* 1489 */ @js.native
  object BSValidateMoPaySignatureResponse extends TopLevel[BSValidateMoPaySignatureResponse with Double]
  
  /* 1445 */ @js.native
  object BSValidateXsollaSignature extends TopLevel[BSValidateXsollaSignature with Double]
  
  /* 1446 */ @js.native
  object BSValidateXsollaSignatureResponse extends TopLevel[BSValidateXsollaSignatureResponse with Double]
  
  /* 1480 */ @js.native
  object BSVerifyPOSAKey extends TopLevel[BSVerifyPOSAKey with Double]
  
  /* 1481 */ @js.native
  object BSVerifyPOSAKeyResponse extends TopLevel[BSVerifyPOSAKeyResponse with Double]
  
  /* 8401 */ @js.native
  object BackpackAddToCurrency extends TopLevel[BackpackAddToCurrency with Double]
  
  /* 8402 */ @js.native
  object BackpackAddToCurrencyResponse extends TopLevel[BackpackAddToCurrencyResponse with Double]
  
  /* 8400 */ @js.native
  object BackpackBase extends TopLevel[BackpackBase with Double]
  
  /* 7805 */ @js.native
  object BadLoginIPList extends TopLevel[BadLoginIPList with Double]
  
  /* 400 */ @js.native
  object BaseAIS extends TopLevel[BaseAIS with Double]
  
  /* 500 */ @js.native
  object BaseAM extends TopLevel[BaseAM with Double]
  
  /* 4000 */ @js.native
  object BaseAMRange2 extends TopLevel[BaseAMRange2 with Double]
  
  /* 1500 */ @js.native
  object BaseATS extends TopLevel[BaseATS with Double]
  
  /* 1000 */ @js.native
  object BaseAdmin extends TopLevel[BaseAdmin with Double]
  
  /* 3600 */ @js.native
  object BaseBRP extends TopLevel[BaseBRP with Double]
  
  /* 1400 */ @js.native
  object BaseBS extends TopLevel[BaseBS with Double]
  
  /* 3150 */ @js.native
  object BaseCCSRange extends TopLevel[BaseCCSRange with Double]
  
  /* 1700 */ @js.native
  object BaseCM extends TopLevel[BaseCM with Double]
  
  /* 650 */ @js.native
  object BaseCS extends TopLevel[BaseCS with Double]
  
  /* 1300 */ @js.native
  object BaseChannelAuth extends TopLevel[BaseChannelAuth with Double]
  
  /* 700 */ @js.native
  object BaseClient extends TopLevel[BaseClient with Double]
  
  /* 5400 */ @js.native
  object BaseClient2 extends TopLevel[BaseClient2 with Double]
  
  /* 9800 */ @js.native
  object BaseClient3 extends TopLevel[BaseClient3 with Double]
  
  /* 5600 */ @js.native
  object BaseDFS extends TopLevel[BaseDFS with Double]
  
  /* 1600 */ @js.native
  object BaseDP extends TopLevel[BaseDP with Double]
  
  /* 625 */ @js.native
  object BaseDRMS extends TopLevel[BaseDRMS with Double]
  
  /* 1800 */ @js.native
  object BaseDSS extends TopLevel[BaseDSS with Double]
  
  /* 1900 */ @js.native
  object BaseEPM extends TopLevel[BaseEPM with Double]
  
  /* 1100 */ @js.native
  object BaseFBS extends TopLevel[BaseFBS with Double]
  
  /* 3100 */ @js.native
  object BaseFTSRange extends TopLevel[BaseFTSRange with Double]
  
  /* 1200 */ @js.native
  object BaseFileXfer extends TopLevel[BaseFileXfer with Double]
  
  /* 2200 */ @js.native
  object BaseGC extends TopLevel[BaseGC with Double]
  
  /* 300 */ @js.native
  object BaseGM extends TopLevel[BaseGM with Double]
  
  /* 900 */ @js.native
  object BaseGameServer extends TopLevel[BaseGameServer with Double]
  
  /* 100 */ @js.native
  object BaseGeneral extends TopLevel[BaseGeneral with Double]
  
  /* 3200 */ @js.native
  object BaseLBSRange extends TopLevel[BaseLBSRange with Double]
  
  /* 5800 */ @js.native
  object BaseMDS extends TopLevel[BaseMDS with Double]
  
  /* 3400 */ @js.native
  object BaseOGS extends TopLevel[BaseOGS with Double]
  
  /* 2500 */ @js.native
  object BaseP2P extends TopLevel[BaseP2P with Double]
  
  /* 5000 */ @js.native
  object BasePSRange extends TopLevel[BasePSRange with Double]
  
  /* 2900 */ @js.native
  object BaseSM extends TopLevel[BaseSM with Double]
  
  /* 200 */ @js.native
  object BaseShell extends TopLevel[BaseShell with Double]
  
  /* 3000 */ @js.native
  object BaseTest extends TopLevel[BaseTest with Double]
  
  /* 5200 */ @js.native
  object BaseUFSRange extends TopLevel[BaseUFSRange with Double]
  
  /* 600 */ @js.native
  object BaseVS extends TopLevel[BaseVS with Double]
  
  /* 8700 */ @js.native
  object BoxMonitorBase extends TopLevel[BoxMonitorBase with Double]
  
  /* 8700 */ @js.native
  object BoxMonitorReportRequest extends TopLevel[BoxMonitorReportRequest with Double]
  
  /* 8701 */ @js.native
  object BoxMonitorReportResponse extends TopLevel[BoxMonitorReportResponse with Double]
  
  /* 3153 */ @js.native
  object CCSAddComment extends TopLevel[CCSAddComment with Double]
  
  /* 3154 */ @js.native
  object CCSAddCommentResponse extends TopLevel[CCSAddCommentResponse with Double]
  
  /* 3161 */ @js.native
  object CCSDeleteAllCommentsByAuthor extends TopLevel[CCSDeleteAllCommentsByAuthor with Double]
  
  /* 3162 */ @js.native
  object CCSDeleteAllCommentsByAuthorResponse extends TopLevel[CCSDeleteAllCommentsByAuthorResponse with Double]
  
  /* 3155 */ @js.native
  object CCSDeleteComment extends TopLevel[CCSDeleteComment with Double]
  
  /* 3156 */ @js.native
  object CCSDeleteCommentResponse extends TopLevel[CCSDeleteCommentResponse with Double]
  
  /* 3151 */ @js.native
  object CCSGetComments extends TopLevel[CCSGetComments with Double]
  
  /* 3159 */ @js.native
  object CCSGetCommentsForNews extends TopLevel[CCSGetCommentsForNews with Double]
  
  /* 3160 */ @js.native
  object CCSGetCommentsForNewsResponse extends TopLevel[CCSGetCommentsForNewsResponse with Double]
  
  /* 3152 */ @js.native
  object CCSGetCommentsResponse extends TopLevel[CCSGetCommentsResponse with Double]
  
  /* 3158 */ @js.native
  object CCSNotifyCommentCount extends TopLevel[CCSNotifyCommentCount with Double]
  
  /* 3157 */ @js.native
  object CCSPreloadComments extends TopLevel[CCSPreloadComments with Double]
  
  /* 7602 */ @js.native
  object CEGPropStatusDRMSRequest extends TopLevel[CEGPropStatusDRMSRequest with Double]
  
  /* 7603 */ @js.native
  object CEGPropStatusDRMSResponse extends TopLevel[CEGPropStatusDRMSResponse with Double]
  
  /* 7600 */ @js.native
  object CEGVersionSetEnableDisableRequest extends TopLevel[CEGVersionSetEnableDisableRequest with Double]
  
  /* 7601 */ @js.native
  object CEGVersionSetEnableDisableResponse extends TopLevel[CEGVersionSetEnableDisableResponse with Double]
  
  /* 7604 */ @js.native
  object CEGWhackFailureReportRequest extends TopLevel[CEGWhackFailureReportRequest with Double]
  
  /* 7605 */ @js.native
  object CEGWhackFailureReportResponse extends TopLevel[CEGWhackFailureReportResponse with Double]
  
  /* 1703 */ @js.native
  object CMAppInfoResponseDeprecated extends TopLevel[CMAppInfoResponseDeprecated with Double]
  
  /* 1701 */ @js.native
  object CMSetAllowState extends TopLevel[CMSetAllowState with Double]
  
  /* 1702 */ @js.native
  object CMSpewAllowState extends TopLevel[CMSpewAllowState with Double]
  
  /* 8500 */ @js.native
  object CREBase extends TopLevel[CREBase with Double]
  
  /* 8511 */ @js.native
  object CREEnumeratePublishedFiles extends TopLevel[CREEnumeratePublishedFiles with Double]
  
  /* 8512 */ @js.native
  object CREEnumeratePublishedFilesResponse extends TopLevel[CREEnumeratePublishedFilesResponse with Double]
  
  /* 8509 */ @js.native
  object CREGetUserPublishedItemVoteDetails extends TopLevel[CREGetUserPublishedItemVoteDetails with Double]
  
  /* 8510 */ @js.native
  object CREGetUserPublishedItemVoteDetailsResponse extends TopLevel[CREGetUserPublishedItemVoteDetailsResponse with Double]
  
  /* 8503 */ @js.native
  object CREItemVoteSummary extends TopLevel[CREItemVoteSummary with Double]
  
  /* 8504 */ @js.native
  object CREItemVoteSummaryResponse extends TopLevel[CREItemVoteSummaryResponse with Double]
  
  /* 8513 */ @js.native
  object CREPublishedFileVoteAdded extends TopLevel[CREPublishedFileVoteAdded with Double]
  
  /* 8501 */ @js.native
  object CRERankByTrend extends TopLevel[CRERankByTrend with Double]
  
  /* 8502 */ @js.native
  object CRERankByTrendResponse extends TopLevel[CRERankByTrendResponse with Double]
  
  /* 8505 */ @js.native
  object CRERankByVote extends TopLevel[CRERankByVote with Double]
  
  /* 8506 */ @js.native
  object CRERankByVoteResponse extends TopLevel[CRERankByVoteResponse with Double]
  
  /* 8507 */ @js.native
  object CREUpdateUserPublishedItemVote extends TopLevel[CREUpdateUserPublishedItemVote with Double]
  
  /* 8508 */ @js.native
  object CREUpdateUserPublishedItemVoteResponse extends TopLevel[CREUpdateUserPublishedItemVoteResponse with Double]
  
  /* 6200 */ @js.native
  object CSBase extends TopLevel[CSBase with Double]
  
  /* 6201 */ @js.native
  object CSPing extends TopLevel[CSPing with Double]
  
  /* 6202 */ @js.native
  object CSPingResponse extends TopLevel[CSPingResponse with Double]
  
  /* 787 */ @js.native
  object CSUserContentApprove extends TopLevel[CSUserContentApprove with Double]
  
  /* 788 */ @js.native
  object CSUserContentDeny extends TopLevel[CSUserContentDeny with Double]
  
  /* 652 */ @js.native
  object CSUserContentRequest extends TopLevel[CSUserContentRequest with Double]
  
  /* 1300 */ @js.native
  object ChannelAuthChallenge extends TopLevel[ChannelAuthChallenge with Double]
  
  /* 1301 */ @js.native
  object ChannelAuthResponse extends TopLevel[ChannelAuthResponse with Double]
  
  /* 1302 */ @js.native
  object ChannelAuthResult extends TopLevel[ChannelAuthResult with Double]
  
  /* 1303 */ @js.native
  object ChannelEncryptRequest extends TopLevel[ChannelEncryptRequest with Double]
  
  /* 1304 */ @js.native
  object ChannelEncryptResponse extends TopLevel[ChannelEncryptResponse with Double]
  
  /* 1305 */ @js.native
  object ChannelEncryptResult extends TopLevel[ChannelEncryptResult with Double]
  
  /* 5531 */ @js.native
  object ClientAMGetClanOfficers extends TopLevel[ClientAMGetClanOfficers with Double]
  
  /* 5532 */ @js.native
  object ClientAMGetClanOfficersResponse extends TopLevel[ClientAMGetClanOfficersResponse with Double]
  
  /* 5570 */ @js.native
  object ClientAMGetPersonaNameHistory extends TopLevel[ClientAMGetPersonaNameHistory with Double]
  
  /* 5571 */ @js.native
  object ClientAMGetPersonaNameHistoryResponse extends TopLevel[ClientAMGetPersonaNameHistoryResponse with Double]
  
  /* 768 */ @js.native
  object ClientAccountInfo extends TopLevel[ClientAccountInfo with Double]
  
  /* 740 */ @js.native
  object ClientAckGuestPass extends TopLevel[ClientAckGuestPass with Double]
  
  /* 796 */ @js.native
  object ClientAckGuestPassResponse extends TopLevel[ClientAckGuestPassResponse with Double]
  
  /* 735 */ @js.native
  object ClientAckMessageByGID extends TopLevel[ClientAckMessageByGID with Double]
  
  /* 737 */ @js.native
  object ClientAckPurchaseReceipt extends TopLevel[ClientAckPurchaseReceipt with Double]
  
  /* 709 */ @js.native
  object ClientAckVACBan extends TopLevel[ClientAckVACBan with Double]
  
  /* 732 */ @js.native
  object ClientAckVACBan2 extends TopLevel[ClientAckVACBan2 with Double]
  
  /* 745 */ @js.native
  object ClientAcknowledgeClanInvite extends TopLevel[ClientAcknowledgeClanInvite with Double]
  
  /* 5468 */ @js.native
  object ClientActivateOEMLicense extends TopLevel[ClientActivateOEMLicense with Double]
  
  /* 791 */ @js.native
  object ClientAddFriend extends TopLevel[ClientAddFriend with Double]
  
  /* 792 */ @js.native
  object ClientAddFriendResponse extends TopLevel[ClientAddFriendResponse with Double]
  
  /* 702 */ @js.native
  object ClientAnonLogOn_Deprecated extends TopLevel[ClientAnonLogOn_Deprecated with Double]
  
  /* 5409 */ @js.native
  object ClientAnonUserLogOn_Deprecated extends TopLevel[ClientAnonUserLogOn_Deprecated with Double]
  
  /* 867 */ @js.native
  object ClientAppInfoChanges extends TopLevel[ClientAppInfoChanges with Double]
  
  /* 840 */ @js.native
  object ClientAppInfoRequest extends TopLevel[ClientAppInfoRequest with Double]
  
  /* 841 */ @js.native
  object ClientAppInfoResponse extends TopLevel[ClientAppInfoResponse with Double]
  
  /* 866 */ @js.native
  object ClientAppInfoUpdate extends TopLevel[ClientAppInfoUpdate with Double]
  
  /* 5507 */ @js.native
  object ClientAppMinutesPlayedData extends TopLevel[ClientAppMinutesPlayedData with Double]
  
  /* 747 */ @js.native
  object ClientAppUsageEvent extends TopLevel[ClientAppUsageEvent with Double]
  
  /* 5432 */ @js.native
  object ClientAuthList extends TopLevel[ClientAuthList with Double]
  
  /* 5575 */ @js.native
  object ClientAuthListAck extends TopLevel[ClientAuthListAck with Double]
  
  /* 5428 */ @js.native
  object ClientAuthList_Deprecated extends TopLevel[ClientAuthList_Deprecated with Double]
  
  /* 6502 */ @js.native
  object ClientAuthorizeLocalDevice extends TopLevel[ClientAuthorizeLocalDevice with Double]
  
  /* 6509 */ @js.native
  object ClientAuthorizeLocalDeviceNotification extends TopLevel[ClientAuthorizeLocalDeviceNotification with Double]
  
  /* 6501 */ @js.native
  object ClientAuthorizeLocalDeviceRequest extends TopLevel[ClientAuthorizeLocalDeviceRequest with Double]
  
  /* 6502 */ @js.native
  object ClientAuthorizeLocalDeviceResponse extends TopLevel[ClientAuthorizeLocalDeviceResponse with Double]
  
  /* 9700 */ @js.native
  object ClientBroadcastBase extends TopLevel[ClientBroadcastBase with Double]
  
  /* 9702 */ @js.native
  object ClientBroadcastDisconnect extends TopLevel[ClientBroadcastDisconnect with Double]
  
  /* 9701 */ @js.native
  object ClientBroadcastFrames extends TopLevel[ClientBroadcastFrames with Double]
  
  /* 9700 */ @js.native
  object ClientBroadcastInit extends TopLevel[ClientBroadcastInit with Double]
  
  /* 9703 */ @js.native
  object ClientBroadcastScreenshot extends TopLevel[ClientBroadcastScreenshot with Double]
  
  /* 9704 */ @js.native
  object ClientBroadcastUploadConfig extends TopLevel[ClientBroadcastUploadConfig with Double]
  
  /* 783 */ @js.native
  object ClientCMList extends TopLevel[ClientCMList with Double]
  
  /* 729 */ @js.native
  object ClientCancelLicense extends TopLevel[ClientCancelLicense with Double]
  
  /* 781 */ @js.native
  object ClientCancelLicenseResponse extends TopLevel[ClientCancelLicenseResponse with Double]
  
  /* 716 */ @js.native
  object ClientChangeStatus extends TopLevel[ClientChangeStatus with Double]
  
  /* 5579 */ @js.native
  object ClientChangeSteamGuardOptions extends TopLevel[ClientChangeSteamGuardOptions with Double]
  
  /* 5580 */ @js.native
  object ClientChangeSteamGuardOptionsResponse extends TopLevel[ClientChangeSteamGuardOptionsResponse with Double]
  
  /* 597 */ @js.native
  object ClientChatAction extends TopLevel[ClientChatAction with Double]
  
  /* 814 */ @js.native
  object ClientChatActionResult extends TopLevel[ClientChatActionResult with Double]
  
  /* 5426 */ @js.native
  object ClientChatDeclined extends TopLevel[ClientChatDeclined with Double]
  
  /* 807 */ @js.native
  object ClientChatEnter extends TopLevel[ClientChatEnter with Double]
  
  /* 800 */ @js.native
  object ClientChatInvite extends TopLevel[ClientChatInvite with Double]
  
  /* 802 */ @js.native
  object ClientChatMemberInfo extends TopLevel[ClientChatMemberInfo with Double]
  
  /* 799 */ @js.native
  object ClientChatMsg extends TopLevel[ClientChatMsg with Double]
  
  /* 4026 */ @js.native
  object ClientChatRoomInfo extends TopLevel[ClientChatRoomInfo with Double]
  
  /* 5450 */ @js.native
  object ClientCheckAppBetaPassword extends TopLevel[ClientCheckAppBetaPassword with Double]
  
  /* 5451 */ @js.native
  object ClientCheckAppBetaPasswordResponse extends TopLevel[ClientCheckAppBetaPasswordResponse with Double]
  
  /* 5533 */ @js.native
  object ClientCheckFileSignature extends TopLevel[ClientCheckFileSignature with Double]
  
  /* 5534 */ @js.native
  object ClientCheckFileSignatureResponse extends TopLevel[ClientCheckFileSignatureResponse with Double]
  
  /* 845 */ @js.native
  object ClientCheckPassword extends TopLevel[ClientCheckPassword with Double]
  
  /* 848 */ @js.native
  object ClientCheckPasswordResponse extends TopLevel[ClientCheckPasswordResponse with Double]
  
  /* 822 */ @js.native
  object ClientClanState extends TopLevel[ClientClanState with Double]
  
  /* 5582 */ @js.native
  object ClientCommentNotifications extends TopLevel[ClientCommentNotifications with Double]
  
  /* 9600 */ @js.native
  object ClientConcurrentSessionsBase extends TopLevel[ClientConcurrentSessionsBase with Double]
  
  /* 710 */ @js.native
  object ClientConnectionStats extends TopLevel[ClientConnectionStats with Double]
  
  /* 731 */ @js.native
  object ClientContentServerLogOn_Deprecated extends TopLevel[ClientContentServerLogOn_Deprecated with Double]
  
  /* 5406 */ @js.native
  object ClientCreateAccount2 extends TopLevel[ClientCreateAccount2 with Double]
  
  /* 5462 */ @js.native
  object ClientCreateAccount3 extends TopLevel[ClientCreateAccount3 with Double]
  
  /* 5590 */ @js.native
  object ClientCreateAccountProto extends TopLevel[ClientCreateAccountProto with Double]
  
  /* 5591 */ @js.native
  object ClientCreateAccountProtoResponse extends TopLevel[ClientCreateAccountProtoResponse with Double]
  
  /* 5403 */ @js.native
  object ClientCreateAccountResponse extends TopLevel[ClientCreateAccountResponse with Double]
  
  /* 761 */ @js.native
  object ClientCreateAcctResponse extends TopLevel[ClientCreateAcctResponse with Double]
  
  /* 809 */ @js.native
  object ClientCreateChat extends TopLevel[ClientCreateChat with Double]
  
  /* 810 */ @js.native
  object ClientCreateChatResponse extends TopLevel[ClientCreateChatResponse with Double]
  
  /* 5597 */ @js.native
  object ClientCurrentUIMode extends TopLevel[ClientCurrentUIMode with Double]
  
  /* 5605 */ @js.native
  object ClientDFSAuthenticateRequest extends TopLevel[ClientDFSAuthenticateRequest with Double]
  
  /* 5606 */ @js.native
  object ClientDFSAuthenticateResponse extends TopLevel[ClientDFSAuthenticateResponse with Double]
  
  /* 5617 */ @js.native
  object ClientDFSDownloadStatus extends TopLevel[ClientDFSDownloadStatus with Double]
  
  /* 5607 */ @js.native
  object ClientDFSEndSession extends TopLevel[ClientDFSEndSession with Double]
  
  /* 1620 */ @js.native
  object ClientDPCheckSpecialSurvey extends TopLevel[ClientDPCheckSpecialSurvey with Double]
  
  /* 1621 */ @js.native
  object ClientDPCheckSpecialSurveyResponse extends TopLevel[ClientDPCheckSpecialSurveyResponse with Double]
  
  /* 1630 */ @js.native
  object ClientDPContentStatsReport extends TopLevel[ClientDPContentStatsReport with Double]
  
  /* 1622 */ @js.native
  object ClientDPSendSpecialSurveyResponse extends TopLevel[ClientDPSendSpecialSurveyResponse with Double]
  
  /* 1623 */ @js.native
  object ClientDPSendSpecialSurveyResponseReply extends TopLevel[ClientDPSendSpecialSurveyResponseReply with Double]
  
  /* 1627 */ @js.native
  object ClientDPSteam2AppStarted extends TopLevel[ClientDPSteam2AppStarted with Double]
  
  /* 1625 */ @js.native
  object ClientDPUpdateAppJobReport extends TopLevel[ClientDPUpdateAppJobReport with Double]
  
  /* 896 */ @js.native
  object ClientDRMBlobRequest extends TopLevel[ClientDRMBlobRequest with Double]
  
  /* 897 */ @js.native
  object ClientDRMBlobResponse extends TopLevel[ClientDRMBlobResponse with Double]
  
  /* 5485 */ @js.native
  object ClientDRMDownloadRequest extends TopLevel[ClientDRMDownloadRequest with Double]
  
  /* 5574 */ @js.native
  object ClientDRMDownloadRequestWithCrashData extends TopLevel[ClientDRMDownloadRequestWithCrashData with Double]
  
  /* 5486 */ @js.native
  object ClientDRMDownloadResponse extends TopLevel[ClientDRMDownloadResponse with Double]
  
  /* 5487 */ @js.native
  object ClientDRMFinalResult extends TopLevel[ClientDRMFinalResult with Double]
  
  /* 851 */ @js.native
  object ClientDRMProblemReport extends TopLevel[ClientDRMProblemReport with Double]
  
  /* 5495 */ @js.native
  object ClientDRMTest extends TopLevel[ClientDRMTest with Double]
  
  /* 5496 */ @js.native
  object ClientDRMTestResult extends TopLevel[ClientDRMTestResult with Double]
  
  /* 6504 */ @js.native
  object ClientDeauthorizeDevice extends TopLevel[ClientDeauthorizeDevice with Double]
  
  /* 6503 */ @js.native
  object ClientDeauthorizeDeviceRequest extends TopLevel[ClientDeauthorizeDeviceRequest with Double]
  
  /* 5511 */ @js.native
  object ClientDeregisterWithServer extends TopLevel[ClientDeregisterWithServer with Double]
  
  /* 5445 */ @js.native
  object ClientDisableTestLicense extends TopLevel[ClientDisableTestLicense with Double]
  
  /* 5446 */ @js.native
  object ClientDisableTestLicenseResponse extends TopLevel[ClientDisableTestLicenseResponse with Double]
  
  /* 5548 */ @js.native
  object ClientDownloadRateStatistics extends TopLevel[ClientDownloadRateStatistics with Double]
  
  /* 5456 */ @js.native
  object ClientEmailAddrInfo extends TopLevel[ClientEmailAddrInfo with Double]
  
  /* 5458 */ @js.native
  object ClientEmailChange3 extends TopLevel[ClientEmailChange3 with Double]
  
  /* 5544 */ @js.native
  object ClientEmailChange4 extends TopLevel[ClientEmailChange4 with Double]
  
  /* 891 */ @js.native
  object ClientEmailChangeResponse extends TopLevel[ClientEmailChangeResponse with Double]
  
  /* 5545 */ @js.native
  object ClientEmailChangeResponse4 extends TopLevel[ClientEmailChangeResponse4 with Double]
  
  /* 9331 */ @js.native
  object ClientEmoticonList extends TopLevel[ClientEmoticonList with Double]
  
  /* 5443 */ @js.native
  object ClientEnableTestLicense extends TopLevel[ClientEnableTestLicense with Double]
  
  /* 5444 */ @js.native
  object ClientEnableTestLicenseResponse extends TopLevel[ClientEnableTestLicenseResponse with Double]
  
  /* 784 */ @js.native
  object ClientEncryptPct extends TopLevel[ClientEncryptPct with Double]
  
  /* 7519 */ @js.native
  object ClientFSEnumerateFollowingList extends TopLevel[ClientFSEnumerateFollowingList with Double]
  
  /* 7520 */ @js.native
  object ClientFSEnumerateFollowingListResponse extends TopLevel[ClientFSEnumerateFollowingListResponse with Double]
  
  /* 7515 */ @js.native
  object ClientFSGetFollowerCount extends TopLevel[ClientFSGetFollowerCount with Double]
  
  /* 7516 */ @js.native
  object ClientFSGetFollowerCountResponse extends TopLevel[ClientFSGetFollowerCountResponse with Double]
  
  /* 7525 */ @js.native
  object ClientFSGetFriendMessageHistory extends TopLevel[ClientFSGetFriendMessageHistory with Double]
  
  /* 7527 */ @js.native
  object ClientFSGetFriendMessageHistoryForOfflineMessages extends TopLevel[ClientFSGetFriendMessageHistoryForOfflineMessages with Double]
  
  /* 7526 */ @js.native
  object ClientFSGetFriendMessageHistoryResponse extends TopLevel[ClientFSGetFriendMessageHistoryResponse with Double]
  
  /* 7528 */ @js.native
  object ClientFSGetFriendsSteamLevels extends TopLevel[ClientFSGetFriendsSteamLevels with Double]
  
  /* 7529 */ @js.native
  object ClientFSGetFriendsSteamLevelsResponse extends TopLevel[ClientFSGetFriendsSteamLevelsResponse with Double]
  
  /* 7517 */ @js.native
  object ClientFSGetIsFollowing extends TopLevel[ClientFSGetIsFollowing with Double]
  
  /* 7518 */ @js.native
  object ClientFSGetIsFollowingResponse extends TopLevel[ClientFSGetIsFollowingResponse with Double]
  
  /* 7523 */ @js.native
  object ClientFSOfflineMessageNotification extends TopLevel[ClientFSOfflineMessageNotification with Double]
  
  /* 7524 */ @js.native
  object ClientFSRequestOfflineMessageCount extends TopLevel[ClientFSRequestOfflineMessageCount with Double]
  
  /* 786 */ @js.native
  object ClientFavoritesList extends TopLevel[ClientFavoritesList with Double]
  
  /* 5412 */ @js.native
  object ClientFileToDownload extends TopLevel[ClientFileToDownload with Double]
  
  /* 5413 */ @js.native
  object ClientFileToDownloadResponse extends TopLevel[ClientFileToDownloadResponse with Double]
  
  /* 718 */ @js.native
  object ClientFriendMsg extends TopLevel[ClientFriendMsg with Double]
  
  /* 5578 */ @js.native
  object ClientFriendMsgEchoToSender extends TopLevel[ClientFriendMsgEchoToSender with Double]
  
  /* 5427 */ @js.native
  object ClientFriendMsgIncoming extends TopLevel[ClientFriendMsgIncoming with Double]
  
  /* 5535 */ @js.native
  object ClientFriendProfileInfo extends TopLevel[ClientFriendProfileInfo with Double]
  
  /* 5536 */ @js.native
  object ClientFriendProfileInfoResponse extends TopLevel[ClientFriendProfileInfoResponse with Double]
  
  /* 808 */ @js.native
  object ClientFriendRemovedFromSource extends TopLevel[ClientFriendRemovedFromSource with Double]
  
  /* 5596 */ @js.native
  object ClientFriendUserStatusPublished extends TopLevel[ClientFriendUserStatusPublished with Double]
  
  /* 5553 */ @js.native
  object ClientFriendsGroupsList extends TopLevel[ClientFriendsGroupsList with Double]
  
  /* 767 */ @js.native
  object ClientFriendsList extends TopLevel[ClientFriendsList with Double]
  
  /* 5453 */ @js.native
  object ClientFromGC extends TopLevel[ClientFromGC with Double]
  
  /* 5503 */ @js.native
  object ClientGCMsgFailed extends TopLevel[ClientGCMsgFailed with Double]
  
  /* 6403 */ @js.native
  object ClientGMSServerQuery extends TopLevel[ClientGMSServerQuery with Double]
  
  /* 773 */ @js.native
  object ClientGameConnectDeny extends TopLevel[ClientGameConnectDeny with Double]
  
  /* 779 */ @js.native
  object ClientGameConnectTokens extends TopLevel[ClientGameConnectTokens with Double]
  
  /* 719 */ @js.native
  object ClientGameConnect_obsolete extends TopLevel[ClientGameConnect_obsolete with Double]
  
  /* 721 */ @js.native
  object ClientGameEnded_obsolete extends TopLevel[ClientGameEnded_obsolete with Double]
  
  /* 742 */ @js.native
  object ClientGamesPlayed extends TopLevel[ClientGamesPlayed with Double]
  
  /* 720 */ @js.native
  object ClientGamesPlayed2_obsolete extends TopLevel[ClientGamesPlayed2_obsolete with Double]
  
  /* 738 */ @js.native
  object ClientGamesPlayed3_obsolete extends TopLevel[ClientGamesPlayed3_obsolete with Double]
  
  /* 715 */ @js.native
  object ClientGamesPlayedNoDataBlob extends TopLevel[ClientGamesPlayedNoDataBlob with Double]
  
  /* 5410 */ @js.native
  object ClientGamesPlayedWithDataBlob extends TopLevel[ClientGamesPlayedWithDataBlob with Double]
  
  /* 705 */ @js.native
  object ClientGamesPlayed_obsolete extends TopLevel[ClientGamesPlayed_obsolete with Double]
  
  /* 5441 */ @js.native
  object ClientGetAppBetaPasswords extends TopLevel[ClientGetAppBetaPasswords with Double]
  
  /* 5442 */ @js.native
  object ClientGetAppBetaPasswordsResponse extends TopLevel[ClientGetAppBetaPasswordsResponse with Double]
  
  /* 857 */ @js.native
  object ClientGetAppOwnershipTicket extends TopLevel[ClientGetAppOwnershipTicket with Double]
  
  /* 858 */ @js.native
  object ClientGetAppOwnershipTicketResponse extends TopLevel[ClientGetAppOwnershipTicketResponse with Double]
  
  /* 6506 */ @js.native
  object ClientGetAuthorizedDevices extends TopLevel[ClientGetAuthorizedDevices with Double]
  
  /* 6507 */ @js.native
  object ClientGetAuthorizedDevicesResponse extends TopLevel[ClientGetAuthorizedDevicesResponse with Double]
  
  /* 5546 */ @js.native
  object ClientGetCDNAuthToken extends TopLevel[ClientGetCDNAuthToken with Double]
  
  /* 5547 */ @js.native
  object ClientGetCDNAuthTokenResponse extends TopLevel[ClientGetCDNAuthTokenResponse with Double]
  
  /* 5554 */ @js.native
  object ClientGetClanActivityCounts extends TopLevel[ClientGetClanActivityCounts with Double]
  
  /* 5555 */ @js.native
  object ClientGetClanActivityCountsResponse extends TopLevel[ClientGetClanActivityCountsResponse with Double]
  
  /* 5518 */ @js.native
  object ClientGetClientAppList extends TopLevel[ClientGetClientAppList with Double]
  
  /* 5519 */ @js.native
  object ClientGetClientAppListResponse extends TopLevel[ClientGetClientAppListResponse with Double]
  
  /* 5515 */ @js.native
  object ClientGetClientDetails extends TopLevel[ClientGetClientDetails with Double]
  
  /* 5516 */ @js.native
  object ClientGetClientDetailsResponse extends TopLevel[ClientGetClientDetailsResponse with Double]
  
  /* 5438 */ @js.native
  object ClientGetDepotDecryptionKey extends TopLevel[ClientGetDepotDecryptionKey with Double]
  
  /* 5439 */ @js.native
  object ClientGetDepotDecryptionKeyResponse extends TopLevel[ClientGetDepotDecryptionKeyResponse with Double]
  
  /* 9330 */ @js.native
  object ClientGetEmoticonList extends TopLevel[ClientGetEmoticonList with Double]
  
  /* 722 */ @js.native
  object ClientGetFinalPrice extends TopLevel[ClientGetFinalPrice with Double]
  
  /* 775 */ @js.native
  object ClientGetFinalPriceResponse extends TopLevel[ClientGetFinalPriceResponse with Double]
  
  /* 5488 */ @js.native
  object ClientGetFriendsWhoPlayGame extends TopLevel[ClientGetFriendsWhoPlayGame with Double]
  
  /* 5489 */ @js.native
  object ClientGetFriendsWhoPlayGameResponse extends TopLevel[ClientGetFriendsWhoPlayGameResponse with Double]
  
  /* 748 */ @js.native
  object ClientGetGiftTargetList extends TopLevel[ClientGetGiftTargetList with Double]
  
  /* 749 */ @js.native
  object ClientGetGiftTargetListResponse extends TopLevel[ClientGetGiftTargetListResponse with Double]
  
  /* 730 */ @js.native
  object ClientGetLegacyGameKey extends TopLevel[ClientGetLegacyGameKey with Double]
  
  /* 785 */ @js.native
  object ClientGetLegacyGameKeyResponse extends TopLevel[ClientGetLegacyGameKeyResponse with Double]
  
  /* 728 */ @js.native
  object ClientGetLicenses extends TopLevel[ClientGetLicenses with Double]
  
  /* 860 */ @js.native
  object ClientGetLobbyListResponse extends TopLevel[ClientGetLobbyListResponse with Double]
  
  /* 861 */ @js.native
  object ClientGetLobbyMetadata extends TopLevel[ClientGetLobbyMetadata with Double]
  
  /* 862 */ @js.native
  object ClientGetLobbyMetadataResponse extends TopLevel[ClientGetLobbyMetadataResponse with Double]
  
  /* 5508 */ @js.native
  object ClientGetMicroTxnInfo extends TopLevel[ClientGetMicroTxnInfo with Double]
  
  /* 5509 */ @js.native
  object ClientGetMicroTxnInfoResponse extends TopLevel[ClientGetMicroTxnInfoResponse with Double]
  
  /* 5436 */ @js.native
  object ClientGetNumberOfCurrentPlayers extends TopLevel[ClientGetNumberOfCurrentPlayers with Double]
  
  /* 5592 */ @js.native
  object ClientGetNumberOfCurrentPlayersDP extends TopLevel[ClientGetNumberOfCurrentPlayersDP with Double]
  
  /* 5593 */ @js.native
  object ClientGetNumberOfCurrentPlayersDPResponse extends TopLevel[ClientGetNumberOfCurrentPlayersDPResponse with Double]
  
  /* 5437 */ @js.native
  object ClientGetNumberOfCurrentPlayersResponse extends TopLevel[ClientGetNumberOfCurrentPlayersResponse with Double]
  
  /* 736 */ @js.native
  object ClientGetPurchaseReceipts extends TopLevel[ClientGetPurchaseReceipts with Double]
  
  /* 818 */ @js.native
  object ClientGetUserStats extends TopLevel[ClientGetUserStats with Double]
  
  /* 819 */ @js.native
  object ClientGetUserStatsResponse extends TopLevel[ClientGetUserStatsResponse with Double]
  
  /* 703 */ @js.native
  object ClientHeartBeat extends TopLevel[ClientHeartBeat with Double]
  
  /* 5552 */ @js.native
  object ClientHideFriend extends TopLevel[ClientHideFriend with Double]
  
  /* 708 */ @js.native
  object ClientInformOfCreateAccount extends TopLevel[ClientInformOfCreateAccount with Double]
  
  /* 5407 */ @js.native
  object ClientInformOfResetForgottenPassword extends TopLevel[ClientInformOfResetForgottenPassword with Double]
  
  /* 5408 */ @js.native
  object ClientInformOfResetForgottenPasswordResponse extends TopLevel[ClientInformOfResetForgottenPasswordResponse with Double]
  
  /* 711 */ @js.native
  object ClientInitPurchase extends TopLevel[ClientInitPurchase with Double]
  
  /* 789 */ @js.native
  object ClientInitPurchaseResponse extends TopLevel[ClientInitPurchaseResponse with Double]
  
  /* 5520 */ @js.native
  object ClientInstallClientApp extends TopLevel[ClientInstallClientApp with Double]
  
  /* 5521 */ @js.native
  object ClientInstallClientAppResponse extends TopLevel[ClientInstallClientAppResponse with Double]
  
  /* 793 */ @js.native
  object ClientInviteFriend extends TopLevel[ClientInviteFriend with Double]
  
  /* 794 */ @js.native
  object ClientInviteFriendResponse extends TopLevel[ClientInviteFriendResponse with Double]
  
  /* 744 */ @js.native
  object ClientInviteUserToClan extends TopLevel[ClientInviteUserToClan with Double]
  
  /* 5430 */ @js.native
  object ClientIsLimitedAccount extends TopLevel[ClientIsLimitedAccount with Double]
  
  /* 5576 */ @js.native
  object ClientItemAnnouncements extends TopLevel[ClientItemAnnouncements with Double]
  
  /* 801 */ @js.native
  object ClientJoinChat extends TopLevel[ClientJoinChat with Double]
  
  /* 9601 */ @js.native
  object ClientKickPlayingSession extends TopLevel[ClientKickPlayingSession with Double]
  
  /* 5416 */ @js.native
  object ClientLBSFindOrCreateLB extends TopLevel[ClientLBSFindOrCreateLB with Double]
  
  /* 5417 */ @js.native
  object ClientLBSFindOrCreateLBResponse extends TopLevel[ClientLBSFindOrCreateLBResponse with Double]
  
  /* 5418 */ @js.native
  object ClientLBSGetLBEntries extends TopLevel[ClientLBSGetLBEntries with Double]
  
  /* 5419 */ @js.native
  object ClientLBSGetLBEntriesResponse extends TopLevel[ClientLBSGetLBEntriesResponse with Double]
  
  /* 5414 */ @js.native
  object ClientLBSSetScore extends TopLevel[ClientLBSSetScore with Double]
  
  /* 5415 */ @js.native
  object ClientLBSSetScoreResponse extends TopLevel[ClientLBSSetScoreResponse with Double]
  
  /* 5529 */ @js.native
  object ClientLBSSetUGC extends TopLevel[ClientLBSSetUGC with Double]
  
  /* 5530 */ @js.native
  object ClientLBSSetUGCResponse extends TopLevel[ClientLBSSetUGCResponse with Double]
  
  /* 780 */ @js.native
  object ClientLicenseList extends TopLevel[ClientLicenseList with Double]
  
  /* 706 */ @js.native
  object ClientLogOff extends TopLevel[ClientLogOff with Double]
  
  /* 751 */ @js.native
  object ClientLogOnResponse extends TopLevel[ClientLogOnResponse with Double]
  
  /* 803 */ @js.native
  object ClientLogOnWithCredentials_Deprecated extends TopLevel[ClientLogOnWithCredentials_Deprecated with Double]
  
  /* 5465 */ @js.native
  object ClientLogOnWithHash_Deprecated extends TopLevel[ClientLogOnWithHash_Deprecated with Double]
  
  /* 701 */ @js.native
  object ClientLogOn_Deprecated extends TopLevel[ClientLogOn_Deprecated with Double]
  
  /* 757 */ @js.native
  object ClientLoggedOff extends TopLevel[ClientLoggedOff with Double]
  
  /* 5514 */ @js.native
  object ClientLogon extends TopLevel[ClientLogon with Double]
  
  /* 5559 */ @js.native
  object ClientLogonGameServer extends TopLevel[ClientLogonGameServer with Double]
  
  /* 898 */ @js.native
  object ClientLookupKey extends TopLevel[ClientLookupKey with Double]
  
  /* 899 */ @js.native
  object ClientLookupKeyResponse extends TopLevel[ClientLookupKeyResponse with Double]
  
  /* 5818 */ @js.native
  object ClientMDSGetDepotManifest extends TopLevel[ClientMDSGetDepotManifest with Double]
  
  /* 5820 */ @js.native
  object ClientMDSGetDepotManifestChunk extends TopLevel[ClientMDSGetDepotManifestChunk with Double]
  
  /* 5819 */ @js.native
  object ClientMDSGetDepotManifestResponse extends TopLevel[ClientMDSGetDepotManifestResponse with Double]
  
  /* 5842 */ @js.native
  object ClientMDSGetPrevDepotBuild extends TopLevel[ClientMDSGetPrevDepotBuild with Double]
  
  /* 5843 */ @js.native
  object ClientMDSGetPrevDepotBuildResponse extends TopLevel[ClientMDSGetPrevDepotBuildResponse with Double]
  
  /* 5806 */ @js.native
  object ClientMDSHeartbeat extends TopLevel[ClientMDSHeartbeat with Double]
  
  /* 5809 */ @js.native
  object ClientMDSInitDepotBuildRequest extends TopLevel[ClientMDSInitDepotBuildRequest with Double]
  
  /* 5810 */ @js.native
  object ClientMDSInitDepotBuildResponse extends TopLevel[ClientMDSInitDepotBuildResponse with Double]
  
  /* 5816 */ @js.native
  object ClientMDSInitWorkshopBuildRequest extends TopLevel[ClientMDSInitWorkshopBuildRequest with Double]
  
  /* 5817 */ @js.native
  object ClientMDSInitWorkshopBuildResponse extends TopLevel[ClientMDSInitWorkshopBuildResponse with Double]
  
  /* 5801 */ @js.native
  object ClientMDSLoginRequest extends TopLevel[ClientMDSLoginRequest with Double]
  
  /* 5802 */ @js.native
  object ClientMDSLoginResponse extends TopLevel[ClientMDSLoginResponse with Double]
  
  /* 5838 */ @js.native
  object ClientMDSRegisterAppBuild extends TopLevel[ClientMDSRegisterAppBuild with Double]
  
  /* 5839 */ @js.native
  object ClientMDSRegisterAppBuildResponse extends TopLevel[ClientMDSRegisterAppBuildResponse with Double]
  
  /* 5840 */ @js.native
  object ClientMDSSetAppBuildLive extends TopLevel[ClientMDSSetAppBuildLive with Double]
  
  /* 5841 */ @js.native
  object ClientMDSSetAppBuildLiveResponse extends TopLevel[ClientMDSSetAppBuildLiveResponse with Double]
  
  /* 5845 */ @js.native
  object ClientMDSSignInstallScript extends TopLevel[ClientMDSSignInstallScript with Double]
  
  /* 5846 */ @js.native
  object ClientMDSSignInstallScriptResponse extends TopLevel[ClientMDSSignInstallScriptResponse with Double]
  
  /* 5805 */ @js.native
  object ClientMDSTransmitManifestDataChunk extends TopLevel[ClientMDSTransmitManifestDataChunk with Double]
  
  /* 5807 */ @js.native
  object ClientMDSUploadDepotChunks extends TopLevel[ClientMDSUploadDepotChunks with Double]
  
  /* 5808 */ @js.native
  object ClientMDSUploadDepotChunksResponse extends TopLevel[ClientMDSUploadDepotChunksResponse with Double]
  
  /* 5803 */ @js.native
  object ClientMDSUploadManifestRequest extends TopLevel[ClientMDSUploadManifestRequest with Double]
  
  /* 5804 */ @js.native
  object ClientMDSUploadManifestResponse extends TopLevel[ClientMDSUploadManifestResponse with Double]
  
  /* 5823 */ @js.native
  object ClientMDSUploadRateTest extends TopLevel[ClientMDSUploadRateTest with Double]
  
  /* 5824 */ @js.native
  object ClientMDSUploadRateTestResponse extends TopLevel[ClientMDSUploadRateTestResponse with Double]
  
  /* 6601 */ @js.native
  object ClientMMSCreateLobby extends TopLevel[ClientMMSCreateLobby with Double]
  
  /* 6602 */ @js.native
  object ClientMMSCreateLobbyResponse extends TopLevel[ClientMMSCreateLobbyResponse with Double]
  
  /* 6622 */ @js.native
  object ClientMMSFlushFrenemyListCache extends TopLevel[ClientMMSFlushFrenemyListCache with Double]
  
  /* 6623 */ @js.native
  object ClientMMSFlushFrenemyListCacheResponse extends TopLevel[ClientMMSFlushFrenemyListCacheResponse with Double]
  
  /* 6611 */ @js.native
  object ClientMMSGetLobbyData extends TopLevel[ClientMMSGetLobbyData with Double]
  
  /* 6607 */ @js.native
  object ClientMMSGetLobbyList extends TopLevel[ClientMMSGetLobbyList with Double]
  
  /* 6608 */ @js.native
  object ClientMMSGetLobbyListResponse extends TopLevel[ClientMMSGetLobbyListResponse with Double]
  
  /* 6621 */ @js.native
  object ClientMMSInviteToLobby extends TopLevel[ClientMMSInviteToLobby with Double]
  
  /* 6603 */ @js.native
  object ClientMMSJoinLobby extends TopLevel[ClientMMSJoinLobby with Double]
  
  /* 6604 */ @js.native
  object ClientMMSJoinLobbyResponse extends TopLevel[ClientMMSJoinLobbyResponse with Double]
  
  /* 6605 */ @js.native
  object ClientMMSLeaveLobby extends TopLevel[ClientMMSLeaveLobby with Double]
  
  /* 6606 */ @js.native
  object ClientMMSLeaveLobbyResponse extends TopLevel[ClientMMSLeaveLobbyResponse with Double]
  
  /* 6614 */ @js.native
  object ClientMMSLobbyChatMsg extends TopLevel[ClientMMSLobbyChatMsg with Double]
  
  /* 6612 */ @js.native
  object ClientMMSLobbyData extends TopLevel[ClientMMSLobbyData with Double]
  
  /* 6618 */ @js.native
  object ClientMMSLobbyGameServerSet extends TopLevel[ClientMMSLobbyGameServerSet with Double]
  
  /* 6613 */ @js.native
  object ClientMMSSendLobbyChatMsg extends TopLevel[ClientMMSSendLobbyChatMsg with Double]
  
  /* 6609 */ @js.native
  object ClientMMSSetLobbyData extends TopLevel[ClientMMSSetLobbyData with Double]
  
  /* 6610 */ @js.native
  object ClientMMSSetLobbyDataResponse extends TopLevel[ClientMMSSetLobbyDataResponse with Double]
  
  /* 6617 */ @js.native
  object ClientMMSSetLobbyGameServer extends TopLevel[ClientMMSSetLobbyGameServer with Double]
  
  /* 6624 */ @js.native
  object ClientMMSSetLobbyLinked extends TopLevel[ClientMMSSetLobbyLinked with Double]
  
  /* 6615 */ @js.native
  object ClientMMSSetLobbyOwner extends TopLevel[ClientMMSSetLobbyOwner with Double]
  
  /* 6616 */ @js.native
  object ClientMMSSetLobbyOwnerResponse extends TopLevel[ClientMMSSetLobbyOwnerResponse with Double]
  
  /* 6619 */ @js.native
  object ClientMMSUserJoinedLobby extends TopLevel[ClientMMSUserJoinedLobby with Double]
  
  /* 6620 */ @js.native
  object ClientMMSUserLeftLobby extends TopLevel[ClientMMSUserLeftLobby with Double]
  
  /* 5420 */ @js.native
  object ClientMarketingMessageUpdate extends TopLevel[ClientMarketingMessageUpdate with Double]
  
  /* 5510 */ @js.native
  object ClientMarketingMessageUpdate2 extends TopLevel[ClientMarketingMessageUpdate2 with Double]
  
  /* 5504 */ @js.native
  object ClientMicroTxnAuthRequest extends TopLevel[ClientMicroTxnAuthRequest with Double]
  
  /* 5505 */ @js.native
  object ClientMicroTxnAuthorize extends TopLevel[ClientMicroTxnAuthorize with Double]
  
  /* 5506 */ @js.native
  object ClientMicroTxnAuthorizeResponse extends TopLevel[ClientMicroTxnAuthorizeResponse with Double]
  
  /* 765 */ @js.native
  object ClientNOP extends TopLevel[ClientNOP with Double]
  
  /* 839 */ @js.native
  object ClientNatTraversalStatEvent extends TopLevel[ClientNatTraversalStatEvent with Double]
  
  /* 5463 */ @js.native
  object ClientNewLoginKey extends TopLevel[ClientNewLoginKey with Double]
  
  /* 5464 */ @js.native
  object ClientNewLoginKeyAccepted extends TopLevel[ClientNewLoginKeyAccepted with Double]
  
  /* 771 */ @js.native
  object ClientNewsUpdate extends TopLevel[ClientNewsUpdate with Double]
  
  /* 707 */ @js.native
  object ClientNoUDPConnectivity extends TopLevel[ClientNoUDPConnectivity with Double]
  
  /* 756 */ @js.native
  object ClientNotLoggedOnDeprecated extends TopLevel[ClientNotLoggedOnDeprecated with Double]
  
  /* 5490 */ @js.native
  object ClientOGSBeginSession extends TopLevel[ClientOGSBeginSession with Double]
  
  /* 5491 */ @js.native
  object ClientOGSBeginSessionResponse extends TopLevel[ClientOGSBeginSessionResponse with Double]
  
  /* 5492 */ @js.native
  object ClientOGSEndSession extends TopLevel[ClientOGSEndSession with Double]
  
  /* 5493 */ @js.native
  object ClientOGSEndSessionResponse extends TopLevel[ClientOGSEndSessionResponse with Double]
  
  /* 5581 */ @js.native
  object ClientOGSGameServerPingSample extends TopLevel[ClientOGSGameServerPingSample with Double]
  
  /* 5557 */ @js.native
  object ClientOGSReportBug extends TopLevel[ClientOGSReportBug with Double]
  
  /* 5556 */ @js.native
  object ClientOGSReportString extends TopLevel[ClientOGSReportString with Double]
  
  /* 5494 */ @js.native
  object ClientOGSWriteRow extends TopLevel[ClientOGSWriteRow with Double]
  
  /* 5435 */ @js.native
  object ClientP2PConnectionFailInfo extends TopLevel[ClientP2PConnectionFailInfo with Double]
  
  /* 5434 */ @js.native
  object ClientP2PConnectionInfo extends TopLevel[ClientP2PConnectionInfo with Double]
  
  /* 813 */ @js.native
  object ClientP2PIntroducerMessage extends TopLevel[ClientP2PIntroducerMessage with Double]
  
  /* 8905 */ @js.native
  object ClientPICSAccessTokenRequest extends TopLevel[ClientPICSAccessTokenRequest with Double]
  
  /* 8906 */ @js.native
  object ClientPICSAccessTokenResponse extends TopLevel[ClientPICSAccessTokenResponse with Double]
  
  /* 8901 */ @js.native
  object ClientPICSChangesSinceRequest extends TopLevel[ClientPICSChangesSinceRequest with Double]
  
  /* 8902 */ @js.native
  object ClientPICSChangesSinceResponse extends TopLevel[ClientPICSChangesSinceResponse with Double]
  
  /* 8903 */ @js.native
  object ClientPICSProductInfoRequest extends TopLevel[ClientPICSProductInfoRequest with Double]
  
  /* 8904 */ @js.native
  object ClientPICSProductInfoResponse extends TopLevel[ClientPICSProductInfoResponse with Double]
  
  /* 833 */ @js.native
  object ClientPackageInfoRequest extends TopLevel[ClientPackageInfoRequest with Double]
  
  /* 834 */ @js.native
  object ClientPackageInfoResponse extends TopLevel[ClientPackageInfoResponse with Double]
  
  /* 148 */ @js.native
  object ClientPackageVersions extends TopLevel[ClientPackageVersions with Double]
  
  /* 5457 */ @js.native
  object ClientPasswordChange3 extends TopLevel[ClientPasswordChange3 with Double]
  
  /* 805 */ @js.native
  object ClientPasswordChangeResponse extends TopLevel[ClientPasswordChangeResponse with Double]
  
  /* 5584 */ @js.native
  object ClientPersonaChangeResponse extends TopLevel[ClientPersonaChangeResponse with Double]
  
  /* 766 */ @js.native
  object ClientPersonaState extends TopLevel[ClientPersonaState with Double]
  
  /* 5459 */ @js.native
  object ClientPersonalQAChange3 extends TopLevel[ClientPersonalQAChange3 with Double]
  
  /* 764 */ @js.native
  object ClientPing extends TopLevel[ClientPing with Double]
  
  /* 712 */ @js.native
  object ClientPingResponse extends TopLevel[ClientPingResponse with Double]
  
  /* 5587 */ @js.native
  object ClientPlayerNicknameList extends TopLevel[ClientPlayerNicknameList with Double]
  
  /* 9600 */ @js.native
  object ClientPlayingSessionState extends TopLevel[ClientPlayingSessionState with Double]
  
  /* 763 */ @js.native
  object ClientPurchaseResponse extends TopLevel[ClientPurchaseResponse with Double]
  
  /* 746 */ @js.native
  object ClientPurchaseWithMachineID extends TopLevel[ClientPurchaseWithMachineID with Double]
  
  /* 5539 */ @js.native
  object ClientReadMachineAuth extends TopLevel[ClientReadMachineAuth with Double]
  
  /* 5540 */ @js.native
  object ClientReadMachineAuthResponse extends TopLevel[ClientReadMachineAuthResponse with Double]
  
  /* 741 */ @js.native
  object ClientRedeemGuestPass extends TopLevel[ClientRedeemGuestPass with Double]
  
  /* 797 */ @js.native
  object ClientRedeemGuestPassResponse extends TopLevel[ClientRedeemGuestPassResponse with Double]
  
  /* 5502 */ @js.native
  object ClientRegisterAuthTicketWithCM extends TopLevel[ClientRegisterAuthTicketWithCM with Double]
  
  /* 743 */ @js.native
  object ClientRegisterKey extends TopLevel[ClientRegisterKey with Double]
  
  /* 5469 */ @js.native
  object ClientRegisterOEMMachine extends TopLevel[ClientRegisterOEMMachine with Double]
  
  /* 5470 */ @js.native
  object ClientRegisterOEMMachineResponse extends TopLevel[ClientRegisterOEMMachineResponse with Double]
  
  /* 714 */ @js.native
  object ClientRemoveFriend extends TopLevel[ClientRemoveFriend with Double]
  
  /* 5517 */ @js.native
  object ClientReportOverlayDetourFailure extends TopLevel[ClientReportOverlayDetourFailure with Double]
  
  /* 5549 */ @js.native
  object ClientRequestAccountData extends TopLevel[ClientRequestAccountData with Double]
  
  /* 5550 */ @js.native
  object ClientRequestAccountDataResponse extends TopLevel[ClientRequestAccountDataResponse with Double]
  
  /* 5431 */ @js.native
  object ClientRequestAuthList extends TopLevel[ClientRequestAuthList with Double]
  
  /* 5454 */ @js.native
  object ClientRequestChangeMail extends TopLevel[ClientRequestChangeMail with Double]
  
  /* 5455 */ @js.native
  object ClientRequestChangeMailResponse extends TopLevel[ClientRequestChangeMailResponse with Double]
  
  /* 5583 */ @js.native
  object ClientRequestCommentNotifications extends TopLevel[ClientRequestCommentNotifications with Double]
  
  /* 5526 */ @js.native
  object ClientRequestEncryptedAppTicket extends TopLevel[ClientRequestEncryptedAppTicket with Double]
  
  /* 5527 */ @js.native
  object ClientRequestEncryptedAppTicketResponse extends TopLevel[ClientRequestEncryptedAppTicketResponse with Double]
  
  /* 5401 */ @js.native
  object ClientRequestForgottenPasswordEmail extends TopLevel[ClientRequestForgottenPasswordEmail with Double]
  
  /* 5461 */ @js.native
  object ClientRequestForgottenPasswordEmail3 extends TopLevel[ClientRequestForgottenPasswordEmail3 with Double]
  
  /* 5402 */ @js.native
  object ClientRequestForgottenPasswordEmailResponse extends TopLevel[ClientRequestForgottenPasswordEmailResponse with Double]
  
  /* 5572 */ @js.native
  object ClientRequestFreeLicense extends TopLevel[ClientRequestFreeLicense with Double]
  
  /* 5573 */ @js.native
  object ClientRequestFreeLicenseResponse extends TopLevel[ClientRequestFreeLicenseResponse with Double]
  
  /* 815 */ @js.native
  object ClientRequestFriendData extends TopLevel[ClientRequestFriendData with Double]
  
  /* 554 */ @js.native
  object ClientRequestFriendship extends TopLevel[ClientRequestFriendship with Double]
  
  /* 5577 */ @js.native
  object ClientRequestItemAnnouncements extends TopLevel[ClientRequestItemAnnouncements with Double]
  
  /* 5541 */ @js.native
  object ClientRequestMachineAuth extends TopLevel[ClientRequestMachineAuth with Double]
  
  /* 5542 */ @js.native
  object ClientRequestMachineAuthResponse extends TopLevel[ClientRequestMachineAuthResponse with Double]
  
  /* 5590 */ @js.native
  object ClientRequestOAuthTokenForApp extends TopLevel[ClientRequestOAuthTokenForApp with Double]
  
  /* 5591 */ @js.native
  object ClientRequestOAuthTokenForAppResponse extends TopLevel[ClientRequestOAuthTokenForAppResponse with Double]
  
  /* 5448 */ @js.native
  object ClientRequestValidationMail extends TopLevel[ClientRequestValidationMail with Double]
  
  /* 5449 */ @js.native
  object ClientRequestValidationMailResponse extends TopLevel[ClientRequestValidationMailResponse with Double]
  
  /* 5585 */ @js.native
  object ClientRequestWebAPIAuthenticateUserNonce extends TopLevel[ClientRequestWebAPIAuthenticateUserNonce with Double]
  
  /* 5586 */ @js.native
  object ClientRequestWebAPIAuthenticateUserNonceResponse extends TopLevel[ClientRequestWebAPIAuthenticateUserNonceResponse with Double]
  
  /* 5480 */ @js.native
  object ClientRequestedClientStats extends TopLevel[ClientRequestedClientStats with Double]
  
  /* 5404 */ @js.native
  object ClientResetForgottenPassword extends TopLevel[ClientResetForgottenPassword with Double]
  
  /* 5460 */ @js.native
  object ClientResetForgottenPassword3 extends TopLevel[ClientResetForgottenPassword3 with Double]
  
  /* 5551 */ @js.native
  object ClientResetForgottenPassword4 extends TopLevel[ClientResetForgottenPassword4 with Double]
  
  /* 5405 */ @js.native
  object ClientResetForgottenPasswordResponse extends TopLevel[ClientResetForgottenPasswordResponse with Double]
  
  /* 846 */ @js.native
  object ClientResetPassword extends TopLevel[ClientResetPassword with Double]
  
  /* 849 */ @js.native
  object ClientResetPasswordResponse extends TopLevel[ClientResetPasswordResponse with Double]
  
  /* 7503 */ @js.native
  object ClientRichPresenceInfo extends TopLevel[ClientRichPresenceInfo with Double]
  
  /* 7502 */ @js.native
  object ClientRichPresenceRequest extends TopLevel[ClientRichPresenceRequest with Double]
  
  /* 7501 */ @js.native
  object ClientRichPresenceUpload extends TopLevel[ClientRichPresenceUpload with Double]
  
  /* 5543 */ @js.native
  object ClientScreenshotsChanged extends TopLevel[ClientScreenshotsChanged with Double]
  
  /* 892 */ @js.native
  object ClientSecretQAChangeResponse extends TopLevel[ClientSecretQAChangeResponse with Double]
  
  /* 739 */ @js.native
  object ClientSendGuestPass extends TopLevel[ClientSendGuestPass with Double]
  
  /* 795 */ @js.native
  object ClientSendGuestPassResponse extends TopLevel[ClientSendGuestPassResponse with Double]
  
  /* 5558 */ @js.native
  object ClientSentLogs extends TopLevel[ClientSentLogs with Double]
  
  /* 880 */ @js.native
  object ClientServerList extends TopLevel[ClientServerList with Double]
  
  /* 5500 */ @js.native
  object ClientServerUnavailable extends TopLevel[ClientServerUnavailable with Double]
  
  /* 5501 */ @js.native
  object ClientServersAvailable extends TopLevel[ClientServersAvailable with Double]
  
  /* 831 */ @js.native
  object ClientServiceCall extends TopLevel[ClientServiceCall with Double]
  
  /* 832 */ @js.native
  object ClientServiceCallResponse extends TopLevel[ClientServiceCallResponse with Double]
  
  /* 5594 */ @js.native
  object ClientServiceMethod extends TopLevel[ClientServiceMethod with Double]
  
  /* 5595 */ @js.native
  object ClientServiceMethodResponse extends TopLevel[ClientServiceMethodResponse with Double]
  
  /* 830 */ @js.native
  object ClientServiceModule extends TopLevel[ClientServiceModule with Double]
  
  /* 136 */ @js.native
  object ClientSessionEnd extends TopLevel[ClientSessionEnd with Double]
  
  /* 135 */ @js.native
  object ClientSessionStart extends TopLevel[ClientSessionStart with Double]
  
  /* 850 */ @js.native
  object ClientSessionToken extends TopLevel[ClientSessionToken with Double]
  
  /* 137 */ @js.native
  object ClientSessionUpdate extends TopLevel[ClientSessionUpdate with Double]
  
  /* 137 */ @js.native
  object ClientSessionUpdateAuthTicket extends TopLevel[ClientSessionUpdateAuthTicket with Double]
  
  /* 5524 */ @js.native
  object ClientSetClientAppUpdateState extends TopLevel[ClientSetClientAppUpdateState with Double]
  
  /* 5525 */ @js.native
  object ClientSetClientAppUpdateStateResponse extends TopLevel[ClientSetClientAppUpdateStateResponse with Double]
  
  /* 755 */ @js.native
  object ClientSetHeartbeatRate extends TopLevel[ClientSetHeartbeatRate with Double]
  
  /* 855 */ @js.native
  object ClientSetIgnoreFriend extends TopLevel[ClientSetIgnoreFriend with Double]
  
  /* 856 */ @js.native
  object ClientSetIgnoreFriendResponse extends TopLevel[ClientSetIgnoreFriendResponse with Double]
  
  /* 9400 */ @js.native
  object ClientSharedLibraryBase extends TopLevel[ClientSharedLibraryBase with Double]
  
  /* 9405 */ @js.native
  object ClientSharedLibraryLockStatus extends TopLevel[ClientSharedLibraryLockStatus with Double]
  
  /* 9406 */ @js.native
  object ClientSharedLibraryStopPlaying extends TopLevel[ClientSharedLibraryStopPlaying with Double]
  
  /* 9403 */ @js.native
  object ClientSharedLicensesLockStatus extends TopLevel[ClientSharedLicensesLockStatus with Double]
  
  /* 9404 */ @js.native
  object ClientSharedLicensesStopPlaying extends TopLevel[ClientSharedLicensesStopPlaying with Double]
  
  /* 5433 */ @js.native
  object ClientStat extends TopLevel[ClientStat with Double]
  
  /* 5482 */ @js.native
  object ClientStat2 extends TopLevel[ClientStat2 with Double]
  
  /* 5481 */ @js.native
  object ClientStat2Int32 extends TopLevel[ClientStat2Int32 with Double]
  
  /* 5467 */ @js.native
  object ClientStatsUpdated extends TopLevel[ClientStatsUpdated with Double]
  
  /* 842 */ @js.native
  object ClientSteamUsageEvent extends TopLevel[ClientSteamUsageEvent with Double]
  
  /* 820 */ @js.native
  object ClientStoreUserStats extends TopLevel[ClientStoreUserStats with Double]
  
  /* 5466 */ @js.native
  object ClientStoreUserStats2 extends TopLevel[ClientStoreUserStats2 with Double]
  
  /* 821 */ @js.native
  object ClientStoreUserStatsResponse extends TopLevel[ClientStoreUserStatsResponse with Double]
  
  /* 5512 */ @js.native
  object ClientSubscribeToPersonaFeed extends TopLevel[ClientSubscribeToPersonaFeed with Double]
  
  /* 726 */ @js.native
  object ClientSystemIM extends TopLevel[ClientSystemIM with Double]
  
  /* 727 */ @js.native
  object ClientSystemIMAck extends TopLevel[ClientSystemIMAck with Double]
  
  /* 5429 */ @js.native
  object ClientTicketAuthComplete extends TopLevel[ClientTicketAuthComplete with Double]
  
  /* 5452 */ @js.native
  object ClientToGC extends TopLevel[ClientToGC with Double]
  
  /* 7301 */ @js.native
  object ClientUCMAddScreenshot extends TopLevel[ClientUCMAddScreenshot with Double]
  
  /* 7302 */ @js.native
  object ClientUCMAddScreenshotResponse extends TopLevel[ClientUCMAddScreenshotResponse with Double]
  
  /* 7315 */ @js.native
  object ClientUCMDeletePublishedFile extends TopLevel[ClientUCMDeletePublishedFile with Double]
  
  /* 7316 */ @js.native
  object ClientUCMDeletePublishedFileResponse extends TopLevel[ClientUCMDeletePublishedFileResponse with Double]
  
  /* 7309 */ @js.native
  object ClientUCMDeleteScreenshot extends TopLevel[ClientUCMDeleteScreenshot with Double]
  
  /* 7310 */ @js.native
  object ClientUCMDeleteScreenshotResponse extends TopLevel[ClientUCMDeleteScreenshotResponse with Double]
  
  /* 7366 */ @js.native
  object ClientUCMEnumeratePublishedFilesByUserAction extends TopLevel[ClientUCMEnumeratePublishedFilesByUserAction with Double]
  
  /* 7367 */ @js.native
  object ClientUCMEnumeratePublishedFilesByUserActionResponse extends TopLevel[ClientUCMEnumeratePublishedFilesByUserActionResponse with Double]
  
  /* 7317 */ @js.native
  object ClientUCMEnumerateUserPublishedFiles extends TopLevel[ClientUCMEnumerateUserPublishedFiles with Double]
  
  /* 7318 */ @js.native
  object ClientUCMEnumerateUserPublishedFilesResponse extends TopLevel[ClientUCMEnumerateUserPublishedFilesResponse with Double]
  
  /* 7321 */ @js.native
  object ClientUCMEnumerateUserSubscribedFiles extends TopLevel[ClientUCMEnumerateUserSubscribedFiles with Double]
  
  /* 7322 */ @js.native
  object ClientUCMEnumerateUserSubscribedFilesResponse extends TopLevel[ClientUCMEnumerateUserSubscribedFilesResponse with Double]
  
  /* 7378 */ @js.native
  object ClientUCMEnumerateUserSubscribedFilesWithUpdates extends TopLevel[ClientUCMEnumerateUserSubscribedFilesWithUpdates with Double]
  
  /* 7379 */ @js.native
  object ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse extends TopLevel[ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse with Double]
  
  /* 7313 */ @js.native
  object ClientUCMGetPublishedFileDetails extends TopLevel[ClientUCMGetPublishedFileDetails with Double]
  
  /* 7314 */ @js.native
  object ClientUCMGetPublishedFileDetailsResponse extends TopLevel[ClientUCMGetPublishedFileDetailsResponse with Double]
  
  /* 7360 */ @js.native
  object ClientUCMGetPublishedFilesForUser extends TopLevel[ClientUCMGetPublishedFilesForUser with Double]
  
  /* 7361 */ @js.native
  object ClientUCMGetPublishedFilesForUserResponse extends TopLevel[ClientUCMGetPublishedFilesForUserResponse with Double]
  
  /* 7311 */ @js.native
  object ClientUCMPublishFile extends TopLevel[ClientUCMPublishFile with Double]
  
  /* 7312 */ @js.native
  object ClientUCMPublishFileResponse extends TopLevel[ClientUCMPublishFileResponse with Double]
  
  /* 7368 */ @js.native
  object ClientUCMPublishedFileDeleted extends TopLevel[ClientUCMPublishedFileDeleted with Double]
  
  /* 7347 */ @js.native
  object ClientUCMPublishedFileSubscribed extends TopLevel[ClientUCMPublishedFileSubscribed with Double]
  
  /* 7348 */ @js.native
  object ClientUCMPublishedFileUnsubscribed extends TopLevel[ClientUCMPublishedFileUnsubscribed with Double]
  
  /* 7364 */ @js.native
  object ClientUCMSetUserPublishedFileAction extends TopLevel[ClientUCMSetUserPublishedFileAction with Double]
  
  /* 7365 */ @js.native
  object ClientUCMSetUserPublishedFileActionResponse extends TopLevel[ClientUCMSetUserPublishedFileActionResponse with Double]
  
  /* 7319 */ @js.native
  object ClientUCMSubscribePublishedFile extends TopLevel[ClientUCMSubscribePublishedFile with Double]
  
  /* 7320 */ @js.native
  object ClientUCMSubscribePublishedFileResponse extends TopLevel[ClientUCMSubscribePublishedFileResponse with Double]
  
  /* 7323 */ @js.native
  object ClientUCMUnsubscribePublishedFile extends TopLevel[ClientUCMUnsubscribePublishedFile with Double]
  
  /* 7324 */ @js.native
  object ClientUCMUnsubscribePublishedFileResponse extends TopLevel[ClientUCMUnsubscribePublishedFileResponse with Double]
  
  /* 7325 */ @js.native
  object ClientUCMUpdatePublishedFile extends TopLevel[ClientUCMUpdatePublishedFile with Double]
  
  /* 7326 */ @js.native
  object ClientUCMUpdatePublishedFileResponse extends TopLevel[ClientUCMUpdatePublishedFileResponse with Double]
  
  /* 7005 */ @js.native
  object ClientUDSInviteToGame extends TopLevel[ClientUDSInviteToGame with Double]
  
  /* 7002 */ @js.native
  object ClientUDSP2PSessionEnded extends TopLevel[ClientUDSP2PSessionEnded with Double]
  
  /* 7001 */ @js.native
  object ClientUDSP2PSessionStarted extends TopLevel[ClientUDSP2PSessionStarted with Double]
  
  /* 5219 */ @js.native
  object ClientUFSDeleteFileRequest extends TopLevel[ClientUFSDeleteFileRequest with Double]
  
  /* 5220 */ @js.native
  object ClientUFSDeleteFileResponse extends TopLevel[ClientUFSDeleteFileResponse with Double]
  
  /* 5212 */ @js.native
  object ClientUFSDownloadChunk extends TopLevel[ClientUFSDownloadChunk with Double]
  
  /* 5210 */ @js.native
  object ClientUFSDownloadRequest extends TopLevel[ClientUFSDownloadRequest with Double]
  
  /* 5211 */ @js.native
  object ClientUFSDownloadResponse extends TopLevel[ClientUFSDownloadResponse with Double]
  
  /* 5206 */ @js.native
  object ClientUFSGetFileListForApp extends TopLevel[ClientUFSGetFileListForApp with Double]
  
  /* 5207 */ @js.native
  object ClientUFSGetFileListForAppResponse extends TopLevel[ClientUFSGetFileListForAppResponse with Double]
  
  /* 5230 */ @js.native
  object ClientUFSGetSingleFileInfo extends TopLevel[ClientUFSGetSingleFileInfo with Double]
  
  /* 5231 */ @js.native
  object ClientUFSGetSingleFileInfoResponse extends TopLevel[ClientUFSGetSingleFileInfoResponse with Double]
  
  /* 5226 */ @js.native
  object ClientUFSGetUGCDetails extends TopLevel[ClientUFSGetUGCDetails with Double]
  
  /* 5227 */ @js.native
  object ClientUFSGetUGCDetailsResponse extends TopLevel[ClientUFSGetUGCDetailsResponse with Double]
  
  /* 5213 */ @js.native
  object ClientUFSLoginRequest extends TopLevel[ClientUFSLoginRequest with Double]
  
  /* 5214 */ @js.native
  object ClientUFSLoginResponse extends TopLevel[ClientUFSLoginResponse with Double]
  
  /* 5232 */ @js.native
  object ClientUFSShareFile extends TopLevel[ClientUFSShareFile with Double]
  
  /* 5233 */ @js.native
  object ClientUFSShareFileResponse extends TopLevel[ClientUFSShareFileResponse with Double]
  
  /* 5216 */ @js.native
  object ClientUFSTransferHeartbeat extends TopLevel[ClientUFSTransferHeartbeat with Double]
  
  /* 5204 */ @js.native
  object ClientUFSUploadFileChunk extends TopLevel[ClientUFSUploadFileChunk with Double]
  
  /* 5205 */ @js.native
  object ClientUFSUploadFileFinished extends TopLevel[ClientUFSUploadFileFinished with Double]
  
  /* 5202 */ @js.native
  object ClientUFSUploadFileRequest extends TopLevel[ClientUFSUploadFileRequest with Double]
  
  /* 5203 */ @js.native
  object ClientUFSUploadFileResponse extends TopLevel[ClientUFSUploadFileResponse with Double]
  
  /* 7901 */ @js.native
  object ClientUGSGetGlobalStats extends TopLevel[ClientUGSGetGlobalStats with Double]
  
  /* 7902 */ @js.native
  object ClientUGSGetGlobalStatsResponse extends TopLevel[ClientUGSGetGlobalStatsResponse with Double]
  
  /* 5522 */ @js.native
  object ClientUninstallClientApp extends TopLevel[ClientUninstallClientApp with Double]
  
  /* 5523 */ @js.native
  object ClientUninstallClientAppResponse extends TopLevel[ClientUninstallClientAppResponse with Double]
  
  /* 9507 */ @js.native
  object ClientUnlockStreaming extends TopLevel[ClientUnlockStreaming with Double]
  
  /* 9508 */ @js.native
  object ClientUnlockStreamingResponse extends TopLevel[ClientUnlockStreamingResponse with Double]
  
  /* 811 */ @js.native
  object ClientUpdateChatMetadata extends TopLevel[ClientUpdateChatMetadata with Double]
  
  /* 798 */ @js.native
  object ClientUpdateGuestPassesList extends TopLevel[ClientUpdateGuestPassesList with Double]
  
  /* 5537 */ @js.native
  object ClientUpdateMachineAuth extends TopLevel[ClientUpdateMachineAuth with Double]
  
  /* 5538 */ @js.native
  object ClientUpdateMachineAuthResponse extends TopLevel[ClientUpdateMachineAuthResponse with Double]
  
  /* 5411 */ @js.native
  object ClientUpdateUserGameInfo extends TopLevel[ClientUpdateUserGameInfo with Double]
  
  /* 6505 */ @js.native
  object ClientUseLocalDeviceAuthorizations extends TopLevel[ClientUseLocalDeviceAuthorizations with Double]
  
  /* 5599 */ @js.native
  object ClientUserNotifications extends TopLevel[ClientUserNotifications with Double]
  
  /* 782 */ @js.native
  object ClientVACBanStatus extends TopLevel[ClientVACBanStatus with Double]
  
  /* 753 */ @js.native
  object ClientVACChallenge extends TopLevel[ClientVACChallenge with Double]
  
  /* 704 */ @js.native
  object ClientVACResponse extends TopLevel[ClientVACResponse with Double]
  
  /* 863 */ @js.native
  object ClientVTTCert extends TopLevel[ClientVTTCert with Double]
  
  /* 770 */ @js.native
  object ClientVacStatusQuery extends TopLevel[ClientVacStatusQuery with Double]
  
  /* 717 */ @js.native
  object ClientVacStatusResponse extends TopLevel[ClientVacStatusResponse with Double]
  
  /* 5598 */ @js.native
  object ClientVanityURLChangedNotification extends TopLevel[ClientVanityURLChangedNotification with Double]
  
  /* 5483 */ @js.native
  object ClientVerifyPassword extends TopLevel[ClientVerifyPassword with Double]
  
  /* 5484 */ @js.native
  object ClientVerifyPasswordResponse extends TopLevel[ClientVerifyPasswordResponse with Double]
  
  /* 9800 */ @js.native
  object ClientVoiceCallPreAuthorize extends TopLevel[ClientVoiceCallPreAuthorize with Double]
  
  /* 9801 */ @js.native
  object ClientVoiceCallPreAuthorizeResponse extends TopLevel[ClientVoiceCallPreAuthorizeResponse with Double]
  
  /* 5528 */ @js.native
  object ClientWalletInfoUpdate extends TopLevel[ClientWalletInfoUpdate with Double]
  
  /* 7382 */ @js.native
  object ClientWorkshopItemChangesRequest extends TopLevel[ClientWorkshopItemChangesRequest with Double]
  
  /* 7383 */ @js.native
  object ClientWorkshopItemChangesResponse extends TopLevel[ClientWorkshopItemChangesResponse with Double]
  
  /* 7384 */ @js.native
  object ClientWorkshopItemInfoRequest extends TopLevel[ClientWorkshopItemInfoRequest with Double]
  
  /* 7385 */ @js.native
  object ClientWorkshopItemInfoResponse extends TopLevel[ClientWorkshopItemInfoResponse with Double]
  
  /* 4140 */ @js.native
  object CommunityAddFriendNews extends TopLevel[CommunityAddFriendNews with Double]
  
  /* 4155 */ @js.native
  object CommunityDeleteUserNews extends TopLevel[CommunityDeleteUserNews with Double]
  
  /* 4173 */ @js.native
  object CommunityGetUserFriendNews extends TopLevel[CommunityGetUserFriendNews with Double]
  
  /* 227 */ @js.native
  object ContentDescriptionUpdate extends TopLevel[ContentDescriptionUpdate with Double]
  
  /* 5611 */ @js.native
  object DFSAcceptedResponse extends TopLevel[DFSAcceptedResponse with Double]
  
  /* 5603 */ @js.native
  object DFSConnection extends TopLevel[DFSConnection with Double]
  
  /* 5604 */ @js.native
  object DFSConnectionReply extends TopLevel[DFSConnectionReply with Double]
  
  /* 5601 */ @js.native
  object DFSGetFile extends TopLevel[DFSGetFile with Double]
  
  /* 5610 */ @js.native
  object DFSGetFileFromServer extends TopLevel[DFSGetFileFromServer with Double]
  
  /* 5602 */ @js.native
  object DFSInstallLocalFile extends TopLevel[DFSInstallLocalFile with Double]
  
  /* 5608 */ @js.native
  object DFSPurgeFile extends TopLevel[DFSPurgeFile with Double]
  
  /* 5613 */ @js.native
  object DFSRecvTransmitFile extends TopLevel[DFSRecvTransmitFile with Double]
  
  /* 5612 */ @js.native
  object DFSRequestPingback extends TopLevel[DFSRequestPingback with Double]
  
  /* 5615 */ @js.native
  object DFSRequestPingback2 extends TopLevel[DFSRequestPingback2 with Double]
  
  /* 5616 */ @js.native
  object DFSResponsePingback2 extends TopLevel[DFSResponsePingback2 with Double]
  
  /* 5609 */ @js.native
  object DFSRouteFile extends TopLevel[DFSRouteFile with Double]
  
  /* 5620 */ @js.native
  object DFSRouteFileResponse extends TopLevel[DFSRouteFileResponse with Double]
  
  /* 5614 */ @js.native
  object DFSSendTransmitFile extends TopLevel[DFSSendTransmitFile with Double]
  
  /* 5618 */ @js.native
  object DFSStartTransfer extends TopLevel[DFSStartTransfer with Double]
  
  /* 5619 */ @js.native
  object DFSTransferComplete extends TopLevel[DFSTransferComplete with Double]
  
  /* 1614 */ @js.native
  object DPAccountCreationStats extends TopLevel[DPAccountCreationStats with Double]
  
  /* 1613 */ @js.native
  object DPAchievementStats extends TopLevel[DPAchievementStats with Double]
  
  /* 1607 */ @js.native
  object DPBlockingStats extends TopLevel[DPBlockingStats with Double]
  
  /* 1612 */ @js.native
  object DPCloudStats extends TopLevel[DPCloudStats with Double]
  
  /* 1618 */ @js.native
  object DPDownloadRateStatistics extends TopLevel[DPDownloadRateStatistics with Double]
  
  /* 1619 */ @js.native
  object DPFacebookStatistics extends TopLevel[DPFacebookStatistics with Double]
  
  /* 1602 */ @js.native
  object DPGamePlayedStats extends TopLevel[DPGamePlayedStats with Double]
  
  /* 1617 */ @js.native
  object DPGameServersPlayersStats extends TopLevel[DPGameServersPlayersStats with Double]
  
  /* 1615 */ @js.native
  object DPGetPlayerCount extends TopLevel[DPGetPlayerCount with Double]
  
  /* 1616 */ @js.native
  object DPGetPlayerCountResponse extends TopLevel[DPGetPlayerCountResponse with Double]
  
  /* 1608 */ @js.native
  object DPNatTraversalStats extends TopLevel[DPNatTraversalStats with Double]
  
  /* 1628 */ @js.native
  object DPPartnerMicroTxns extends TopLevel[DPPartnerMicroTxns with Double]
  
  /* 1629 */ @js.native
  object DPPartnerMicroTxnsResponse extends TopLevel[DPPartnerMicroTxnsResponse with Double]
  
  /* 1601 */ @js.native
  object DPSetPublishingState extends TopLevel[DPSetPublishingState with Double]
  
  /* 1609 */ @js.native
  object DPSteamUsageEvent extends TopLevel[DPSteamUsageEvent with Double]
  
  /* 1624 */ @js.native
  object DPStoreSaleStatistics extends TopLevel[DPStoreSaleStatistics with Double]
  
  /* 1604 */ @js.native
  object DPStreamingUniquePlayersStat extends TopLevel[DPStreamingUniquePlayersStat with Double]
  
  /* 1603 */ @js.native
  object DPUniquePlayersStat extends TopLevel[DPUniquePlayersStat with Double]
  
  /* 1626 */ @js.native
  object DPUpdateContentEvent extends TopLevel[DPUpdateContentEvent with Double]
  
  /* 1631 */ @js.native
  object DPVRUniquePlayersStat extends TopLevel[DPVRUniquePlayersStat with Double]
  
  /* 1606 */ @js.native
  object DPVacBanStats extends TopLevel[DPVacBanStats with Double]
  
  /* 1611 */ @js.native
  object DPVacCafeBanStats extends TopLevel[DPVacCafeBanStats with Double]
  
  /* 1610 */ @js.native
  object DPVacCertBanStats extends TopLevel[DPVacCertBanStats with Double]
  
  /* 1605 */ @js.native
  object DPVacInfractionStats extends TopLevel[DPVacInfractionStats with Double]
  
  /* 640 */ @js.native
  object DRMAdminUpdate extends TopLevel[DRMAdminUpdate with Double]
  
  /* 641 */ @js.native
  object DRMAdminUpdateResponse extends TopLevel[DRMAdminUpdateResponse with Double]
  
  /* 628 */ @js.native
  object DRMBuildBlobRequest extends TopLevel[DRMBuildBlobRequest with Double]
  
  /* 629 */ @js.native
  object DRMBuildBlobResponse extends TopLevel[DRMBuildBlobResponse with Double]
  
  /* 637 */ @js.native
  object DRMDetailsReportRequest extends TopLevel[DRMDetailsReportRequest with Double]
  
  /* 638 */ @js.native
  object DRMDetailsReportResponse extends TopLevel[DRMDetailsReportResponse with Double]
  
  /* 645 */ @js.native
  object DRMEmptyGuidCache extends TopLevel[DRMEmptyGuidCache with Double]
  
  /* 646 */ @js.native
  object DRMEmptyGuidCacheResponse extends TopLevel[DRMEmptyGuidCacheResponse with Double]
  
  /* 639 */ @js.native
  object DRMProcessFile extends TopLevel[DRMProcessFile with Double]
  
  /* 644 */ @js.native
  object DRMProcessFileResponse extends TopLevel[DRMProcessFileResponse with Double]
  
  /* 7600 */ @js.native
  object DRMRange2 extends TopLevel[DRMRange2 with Double]
  
  /* 630 */ @js.native
  object DRMResolveGuidRequest extends TopLevel[DRMResolveGuidRequest with Double]
  
  /* 631 */ @js.native
  object DRMResolveGuidResponse extends TopLevel[DRMResolveGuidResponse with Double]
  
  /* 7606 */ @js.native
  object DRMSFetchVersionSet extends TopLevel[DRMSFetchVersionSet with Double]
  
  /* 7607 */ @js.native
  object DRMSFetchVersionSetResponse extends TopLevel[DRMSFetchVersionSetResponse with Double]
  
  /* 635 */ @js.native
  object DRMStabilityReport extends TopLevel[DRMStabilityReport with Double]
  
  /* 636 */ @js.native
  object DRMStabilityReportResponse extends TopLevel[DRMStabilityReportResponse with Double]
  
  /* 642 */ @js.native
  object DRMSync extends TopLevel[DRMSync with Double]
  
  /* 643 */ @js.native
  object DRMSyncResponse extends TopLevel[DRMSyncResponse with Double]
  
  /* 633 */ @js.native
  object DRMVariabilityReport extends TopLevel[DRMVariabilityReport with Double]
  
  /* 634 */ @js.native
  object DRMVariabilityReportResponse extends TopLevel[DRMVariabilityReportResponse with Double]
  
  /* 9100 */ @js.native
  object DRMWorkerProcess extends TopLevel[DRMWorkerProcess with Double]
  
  /* 9128 */ @js.native
  object DRMWorkerProcessAnalyzeFileRequest extends TopLevel[DRMWorkerProcessAnalyzeFileRequest with Double]
  
  /* 9129 */ @js.native
  object DRMWorkerProcessAnalyzeFileResponse extends TopLevel[DRMWorkerProcessAnalyzeFileResponse with Double]
  
  /* 9116 */ @js.native
  object DRMWorkerProcessBackfillOriginalRequest extends TopLevel[DRMWorkerProcessBackfillOriginalRequest with Double]
  
  /* 9117 */ @js.native
  object DRMWorkerProcessBackfillOriginalResponse extends TopLevel[DRMWorkerProcessBackfillOriginalResponse with Double]
  
  /* 9100 */ @js.native
  object DRMWorkerProcessDRMAndSign extends TopLevel[DRMWorkerProcessDRMAndSign with Double]
  
  /* 9101 */ @js.native
  object DRMWorkerProcessDRMAndSignResponse extends TopLevel[DRMWorkerProcessDRMAndSignResponse with Double]
  
  /* 9114 */ @js.native
  object DRMWorkerProcessDescribeSecretRequest extends TopLevel[DRMWorkerProcessDescribeSecretRequest with Double]
  
  /* 9115 */ @js.native
  object DRMWorkerProcessDescribeSecretResponse extends TopLevel[DRMWorkerProcessDescribeSecretResponse with Double]
  
  /* 9126 */ @js.native
  object DRMWorkerProcessEvaluateCrashRequest extends TopLevel[DRMWorkerProcessEvaluateCrashRequest with Double]
  
  /* 9127 */ @js.native
  object DRMWorkerProcessEvaluateCrashResponse extends TopLevel[DRMWorkerProcessEvaluateCrashResponse with Double]
  
  /* 9112 */ @js.native
  object DRMWorkerProcessExamineBlobRequest extends TopLevel[DRMWorkerProcessExamineBlobRequest with Double]
  
  /* 9113 */ @js.native
  object DRMWorkerProcessExamineBlobResponse extends TopLevel[DRMWorkerProcessExamineBlobResponse with Double]
  
  /* 9124 */ @js.native
  object DRMWorkerProcessGetBlobRequest extends TopLevel[DRMWorkerProcessGetBlobRequest with Double]
  
  /* 9125 */ @js.native
  object DRMWorkerProcessGetBlobResponse extends TopLevel[DRMWorkerProcessGetBlobResponse with Double]
  
  /* 9108 */ @js.native
  object DRMWorkerProcessGetDRMGuidsFromFileRequest extends TopLevel[DRMWorkerProcessGetDRMGuidsFromFileRequest with Double]
  
  /* 9109 */ @js.native
  object DRMWorkerProcessGetDRMGuidsFromFileResponse extends TopLevel[DRMWorkerProcessGetDRMGuidsFromFileResponse with Double]
  
  /* 9132 */ @js.native
  object DRMWorkerProcessInstallAllRequest extends TopLevel[DRMWorkerProcessInstallAllRequest with Double]
  
  /* 9133 */ @js.native
  object DRMWorkerProcessInstallAllResponse extends TopLevel[DRMWorkerProcessInstallAllResponse with Double]
  
  /* 9104 */ @js.native
  object DRMWorkerProcessInstallDRMDLLRequest extends TopLevel[DRMWorkerProcessInstallDRMDLLRequest with Double]
  
  /* 9105 */ @js.native
  object DRMWorkerProcessInstallDRMDLLResponse extends TopLevel[DRMWorkerProcessInstallDRMDLLResponse with Double]
  
  /* 9110 */ @js.native
  object DRMWorkerProcessInstallProcessedFilesRequest extends TopLevel[DRMWorkerProcessInstallProcessedFilesRequest with Double]
  
  /* 9111 */ @js.native
  object DRMWorkerProcessInstallProcessedFilesResponse extends TopLevel[DRMWorkerProcessInstallProcessedFilesResponse with Double]
  
  /* 9106 */ @js.native
  object DRMWorkerProcessSecretIdStringRequest extends TopLevel[DRMWorkerProcessSecretIdStringRequest with Double]
  
  /* 9107 */ @js.native
  object DRMWorkerProcessSecretIdStringResponse extends TopLevel[DRMWorkerProcessSecretIdStringResponse with Double]
  
  /* 9122 */ @js.native
  object DRMWorkerProcessSplitAndInstallRequest extends TopLevel[DRMWorkerProcessSplitAndInstallRequest with Double]
  
  /* 9123 */ @js.native
  object DRMWorkerProcessSplitAndInstallResponse extends TopLevel[DRMWorkerProcessSplitAndInstallResponse with Double]
  
  /* 9102 */ @js.native
  object DRMWorkerProcessSteamworksInfoRequest extends TopLevel[DRMWorkerProcessSteamworksInfoRequest with Double]
  
  /* 9103 */ @js.native
  object DRMWorkerProcessSteamworksInfoResponse extends TopLevel[DRMWorkerProcessSteamworksInfoResponse with Double]
  
  /* 9130 */ @js.native
  object DRMWorkerProcessUnpackBlobRequest extends TopLevel[DRMWorkerProcessUnpackBlobRequest with Double]
  
  /* 9131 */ @js.native
  object DRMWorkerProcessUnpackBlobResponse extends TopLevel[DRMWorkerProcessUnpackBlobResponse with Double]
  
  /* 9118 */ @js.native
  object DRMWorkerProcessValidateDRMDLLRequest extends TopLevel[DRMWorkerProcessValidateDRMDLLRequest with Double]
  
  /* 9119 */ @js.native
  object DRMWorkerProcessValidateDRMDLLResponse extends TopLevel[DRMWorkerProcessValidateDRMDLLResponse with Double]
  
  /* 9120 */ @js.native
  object DRMWorkerProcessValidateFileRequest extends TopLevel[DRMWorkerProcessValidateFileRequest with Double]
  
  /* 9121 */ @js.native
  object DRMWorkerProcessValidateFileResponse extends TopLevel[DRMWorkerProcessValidateFileResponse with Double]
  
  /* 1802 */ @js.native
  object DSSCurrentFileList extends TopLevel[DSSCurrentFileList with Double]
  
  /* 1801 */ @js.native
  object DSSNewFile extends TopLevel[DSSNewFile with Double]
  
  /* 1803 */ @js.native
  object DSSSynchList extends TopLevel[DSSSynchList with Double]
  
  /* 1804 */ @js.native
  object DSSSynchListResponse extends TopLevel[DSSSynchListResponse with Double]
  
  /* 1805 */ @js.native
  object DSSSynchSubscribe extends TopLevel[DSSSynchSubscribe with Double]
  
  /* 1806 */ @js.native
  object DSSSynchUnsubscribe extends TopLevel[DSSSynchUnsubscribe with Double]
  
  /* 113 */ @js.native
  object DestJobFailed extends TopLevel[DestJobFailed with Double]
  
  /* 6500 */ @js.native
  object DeviceAuthorizationBase extends TopLevel[DeviceAuthorizationBase with Double]
  
  /* 202 */ @js.native
  object DirRequest extends TopLevel[DirRequest with Double]
  
  /* 203 */ @js.native
  object DirResponse extends TopLevel[DirResponse with Double]
  
  /* 1903 */ @js.native
  object EPMRestartProcess extends TopLevel[EPMRestartProcess with Double]
  
  /* 1901 */ @js.native
  object EPMStartProcess extends TopLevel[EPMStartProcess with Double]
  
  /* 1902 */ @js.native
  object EPMStopProcess extends TopLevel[EPMStopProcess with Double]
  
  /* 7700 */ @js.native
  object EconBase extends TopLevel[EconBase with Double]
  
  /* 7711 */ @js.native
  object EconCDKeyProcessTransaction extends TopLevel[EconCDKeyProcessTransaction with Double]
  
  /* 7712 */ @js.native
  object EconCDKeyProcessTransactionResponse extends TopLevel[EconCDKeyProcessTransactionResponse with Double]
  
  /* 7707 */ @js.native
  object EconFlushInventoryCache extends TopLevel[EconFlushInventoryCache with Double]
  
  /* 7708 */ @js.native
  object EconFlushInventoryCacheResponse extends TopLevel[EconFlushInventoryCacheResponse with Double]
  
  /* 7713 */ @js.native
  object EconGetErrorLogs extends TopLevel[EconGetErrorLogs with Double]
  
  /* 7714 */ @js.native
  object EconGetErrorLogsResponse extends TopLevel[EconGetErrorLogsResponse with Double]
  
  /* 7706 */ @js.native
  object EconTrading_CancelTradeRequest extends TopLevel[EconTrading_CancelTradeRequest with Double]
  
  /* 7702 */ @js.native
  object EconTrading_InitiateTradeProposed extends TopLevel[EconTrading_InitiateTradeProposed with Double]
  
  /* 7701 */ @js.native
  object EconTrading_InitiateTradeRequest extends TopLevel[EconTrading_InitiateTradeRequest with Double]
  
  /* 7703 */ @js.native
  object EconTrading_InitiateTradeResponse extends TopLevel[EconTrading_InitiateTradeResponse with Double]
  
  /* 7704 */ @js.native
  object EconTrading_InitiateTradeResult extends TopLevel[EconTrading_InitiateTradeResult with Double]
  
  /* 7705 */ @js.native
  object EconTrading_StartSession extends TopLevel[EconTrading_StartSession with Double]
  
  /* 201 */ @js.native
  object Exit extends TopLevel[Exit with Double]
  
  /* 308 */ @js.native
  object ExitShell extends TopLevel[ExitShell with Double]
  
  /* 307 */ @js.native
  object ExitShells extends TopLevel[ExitShells with Double]
  
  /* 1119 */ @js.native
  object FBSApplyAccountCred extends TopLevel[FBSApplyAccountCred with Double]
  
  /* 1120 */ @js.native
  object FBSApplyAccountCredResponse extends TopLevel[FBSApplyAccountCredResponse with Double]
  
  /* 1108 */ @js.native
  object FBSApplyOSUpdates extends TopLevel[FBSApplyOSUpdates with Double]
  
  /* 1130 */ @js.native
  object FBSBootstrapperGetPackageChunk extends TopLevel[FBSBootstrapperGetPackageChunk with Double]
  
  /* 1131 */ @js.native
  object FBSBootstrapperGetPackageChunkResponse extends TopLevel[FBSBootstrapperGetPackageChunkResponse with Double]
  
  /* 1128 */ @js.native
  object FBSBootstrapperPackageRequest extends TopLevel[FBSBootstrapperPackageRequest with Double]
  
  /* 1129 */ @js.native
  object FBSBootstrapperPackageResponse extends TopLevel[FBSBootstrapperPackageResponse with Double]
  
  /* 1132 */ @js.native
  object FBSBootstrapperPackageTransferProgress extends TopLevel[FBSBootstrapperPackageTransferProgress with Double]
  
  /* 1027 */ @js.native
  object FBSConnectionData extends TopLevel[FBSConnectionData with Double]
  
  /* 1114 */ @js.native
  object FBSDeployHotFixPackage extends TopLevel[FBSDeployHotFixPackage with Double]
  
  /* 1115 */ @js.native
  object FBSDeployHotFixResponse extends TopLevel[FBSDeployHotFixResponse with Double]
  
  /* 1104 */ @js.native
  object FBSDeployPackage extends TopLevel[FBSDeployPackage with Double]
  
  /* 1105 */ @js.native
  object FBSDeployResponse extends TopLevel[FBSDeployResponse with Double]
  
  /* 1116 */ @js.native
  object FBSDownloadHotFix extends TopLevel[FBSDownloadHotFix with Double]
  
  /* 1117 */ @js.native
  object FBSDownloadHotFixResponse extends TopLevel[FBSDownloadHotFixResponse with Double]
  
  /* 1103 */ @js.native
  object FBSForceBounce extends TopLevel[FBSForceBounce with Double]
  
  /* 1102 */ @js.native
  object FBSForceRefresh extends TopLevel[FBSForceRefresh with Double]
  
  /* 1126 */ @js.native
  object FBSInfoFromBootstrapper extends TopLevel[FBSInfoFromBootstrapper with Double]
  
  /* 1112 */ @js.native
  object FBSMinidumpServer extends TopLevel[FBSMinidumpServer with Double]
  
  /* 1123 */ @js.native
  object FBSQueryGMForRequest extends TopLevel[FBSQueryGMForRequest with Double]
  
  /* 1124 */ @js.native
  object FBSQueryGMResponse extends TopLevel[FBSQueryGMResponse with Double]
  
  /* 1110 */ @js.native
  object FBSRebootBox extends TopLevel[FBSRebootBox with Double]
  
  /* 1127 */ @js.native
  object FBSRebootBoxResponse extends TopLevel[FBSRebootBoxResponse with Double]
  
  /* 1100 */ @js.native
  object FBSReqVersion extends TopLevel[FBSReqVersion with Double]
  
  /* 1133 */ @js.native
  object FBSRestartBootstrapper extends TopLevel[FBSRestartBootstrapper with Double]
  
  /* 1109 */ @js.native
  object FBSRunCMDScript extends TopLevel[FBSRunCMDScript with Double]
  
  /* 1111 */ @js.native
  object FBSSetBigBrotherMode extends TopLevel[FBSSetBigBrotherMode with Double]
  
  /* 1121 */ @js.native
  object FBSSetShellCount extends TopLevel[FBSSetShellCount with Double]
  
  /* 1113 */ @js.native
  object FBSSetShellCount_obsolete extends TopLevel[FBSSetShellCount_obsolete with Double]
  
  /* 1107 */ @js.native
  object FBSSetState extends TopLevel[FBSSetState with Double]
  
  /* 1122 */ @js.native
  object FBSTerminateShell extends TopLevel[FBSTerminateShell with Double]
  
  /* 1125 */ @js.native
  object FBSTerminateZombies extends TopLevel[FBSTerminateZombies with Double]
  
  /* 1106 */ @js.native
  object FBSUpdateBootstrapper extends TopLevel[FBSUpdateBootstrapper with Double]
  
  /* 1118 */ @js.native
  object FBSUpdateTargetConfigFile extends TopLevel[FBSUpdateTargetConfigFile with Double]
  
  /* 1101 */ @js.native
  object FBSVersionInfo extends TopLevel[FBSVersionInfo with Double]
  
  /* 7510 */ @js.native
  object FSAddOrRemoveFollower extends TopLevel[FSAddOrRemoveFollower with Double]
  
  /* 7511 */ @js.native
  object FSAddOrRemoveFollowerResponse extends TopLevel[FSAddOrRemoveFollowerResponse with Double]
  
  /* 7500 */ @js.native
  object FSBase extends TopLevel[FSBase with Double]
  
  /* 7513 */ @js.native
  object FSCommentNotification extends TopLevel[FSCommentNotification with Double]
  
  /* 7514 */ @js.native
  object FSCommentNotificationViewed extends TopLevel[FSCommentNotificationViewed with Double]
  
  /* 7506 */ @js.native
  object FSComputeFrenematrix extends TopLevel[FSComputeFrenematrix with Double]
  
  /* 7507 */ @js.native
  object FSComputeFrenematrixResponse extends TopLevel[FSComputeFrenematrixResponse with Double]
  
  /* 7521 */ @js.native
  object FSGetPendingNotificationCount extends TopLevel[FSGetPendingNotificationCount with Double]
  
  /* 7522 */ @js.native
  object FSGetPendingNotificationCountResponse extends TopLevel[FSGetPendingNotificationCountResponse with Double]
  
  /* 7508 */ @js.native
  object FSPlayStatusNotification extends TopLevel[FSPlayStatusNotification with Double]
  
  /* 7509 */ @js.native
  object FSPublishPersonaStatus extends TopLevel[FSPublishPersonaStatus with Double]
  
  /* 7530 */ @js.native
  object FSRequestFriendData extends TopLevel[FSRequestFriendData with Double]
  
  /* 7504 */ @js.native
  object FSRichPresenceRequest extends TopLevel[FSRichPresenceRequest with Double]
  
  /* 7505 */ @js.native
  object FSRichPresenceResponse extends TopLevel[FSRichPresenceResponse with Double]
  
  /* 7512 */ @js.native
  object FSUpdateFollowingList extends TopLevel[FSUpdateFollowingList with Double]
  
  /* 3103 */ @js.native
  object FTSBrowseClans extends TopLevel[FTSBrowseClans with Double]
  
  /* 3104 */ @js.native
  object FTSBrowseClansResponse extends TopLevel[FTSBrowseClansResponse with Double]
  
  /* 3109 */ @js.native
  object FTSClanDeleted extends TopLevel[FTSClanDeleted with Double]
  
  /* 3101 */ @js.native
  object FTSGetBrowseCounts extends TopLevel[FTSGetBrowseCounts with Double]
  
  /* 3102 */ @js.native
  object FTSGetBrowseCountsResponse extends TopLevel[FTSGetBrowseCountsResponse with Double]
  
  /* 3114 */ @js.native
  object FTSGetGSPlayStats extends TopLevel[FTSGetGSPlayStats with Double]
  
  /* 3116 */ @js.native
  object FTSGetGSPlayStatsForServer extends TopLevel[FTSGetGSPlayStatsForServer with Double]
  
  /* 3117 */ @js.native
  object FTSGetGSPlayStatsForServerResponse extends TopLevel[FTSGetGSPlayStatsForServerResponse with Double]
  
  /* 3115 */ @js.native
  object FTSGetGSPlayStatsResponse extends TopLevel[FTSGetGSPlayStatsResponse with Double]
  
  /* 3118 */ @js.native
  object FTSReportIPUpdates extends TopLevel[FTSReportIPUpdates with Double]
  
  /* 3110 */ @js.native
  object FTSSearch extends TopLevel[FTSSearch with Double]
  
  /* 3105 */ @js.native
  object FTSSearchClansByLocation extends TopLevel[FTSSearchClansByLocation with Double]
  
  /* 3106 */ @js.native
  object FTSSearchClansByLocationResponse extends TopLevel[FTSSearchClansByLocationResponse with Double]
  
  /* 3107 */ @js.native
  object FTSSearchPlayersByLocation extends TopLevel[FTSSearchPlayersByLocation with Double]
  
  /* 3108 */ @js.native
  object FTSSearchPlayersByLocationResponse extends TopLevel[FTSSearchPlayersByLocationResponse with Double]
  
  /* 3111 */ @js.native
  object FTSSearchResponse extends TopLevel[FTSSearchResponse with Double]
  
  /* 3112 */ @js.native
  object FTSSearchStatus extends TopLevel[FTSSearchStatus with Double]
  
  /* 3113 */ @js.native
  object FTSSearchStatusResponse extends TopLevel[FTSSearchStatusResponse with Double]
  
  /* 3000 */ @js.native
  object FailServer extends TopLevel[FailServer with Double]
  
  /* 1202 */ @js.native
  object FileXferData extends TopLevel[FileXferData with Double]
  
  /* 1204 */ @js.native
  object FileXferDataAck extends TopLevel[FileXferDataAck with Double]
  
  /* 1203 */ @js.native
  object FileXferEnd extends TopLevel[FileXferEnd with Double]
  
  /* 1200 */ @js.native
  object FileXferRequest extends TopLevel[FileXferRequest with Double]
  
  /* 1201 */ @js.native
  object FileXferResponse extends TopLevel[FileXferResponse with Double]
  
  /* 2212 */ @js.native
  object GCAchievementAwarded extends TopLevel[GCAchievementAwarded with Double]
  
  /* 2204 */ @js.native
  object GCCmdBounce extends TopLevel[GCCmdBounce with Double]
  
  /* 2207 */ @js.native
  object GCCmdDeploy extends TopLevel[GCCmdDeploy with Double]
  
  /* 2208 */ @js.native
  object GCCmdDeployResponse extends TopLevel[GCCmdDeployResponse with Double]
  
  /* 2206 */ @js.native
  object GCCmdDown extends TopLevel[GCCmdDown with Double]
  
  /* 2205 */ @js.native
  object GCCmdForceBounce extends TopLevel[GCCmdForceBounce with Double]
  
  /* 2203 */ @js.native
  object GCCmdRevive extends TopLevel[GCCmdRevive with Double]
  
  /* 2216 */ @js.native
  object GCCmdStatus extends TopLevel[GCCmdStatus with Double]
  
  /* 2209 */ @js.native
  object GCCmdSwitch extends TopLevel[GCCmdSwitch with Double]
  
  /* 2218 */ @js.native
  object GCGetAccountDetails extends TopLevel[GCGetAccountDetails with Double]
  
  /* 2218 */ @js.native
  object GCGetAccountDetails_DEPRECATED extends TopLevel[GCGetAccountDetails_DEPRECATED with Double]
  
  /* 2220 */ @js.native
  object GCGetEmailTemplate extends TopLevel[GCGetEmailTemplate with Double]
  
  /* 2221 */ @js.native
  object GCGetEmailTemplateResponse extends TopLevel[GCGetEmailTemplateResponse with Double]
  
  /* 2234 */ @js.native
  object GCHAccountLockStatusChange extends TopLevel[GCHAccountLockStatusChange with Double]
  
  /* 2236 */ @js.native
  object GCHAccountPhoneNumberChange extends TopLevel[GCHAccountPhoneNumberChange with Double]
  
  /* 2233 */ @js.native
  object GCHAccountTradeBanStatusChange extends TopLevel[GCHAccountTradeBanStatusChange with Double]
  
  /* 2237 */ @js.native
  object GCHAccountTwoFactorChange extends TopLevel[GCHAccountTwoFactorChange with Double]
  
  /* 2228 */ @js.native
  object GCHAccountVacStatusChange extends TopLevel[GCHAccountVacStatusChange with Double]
  
  /* 2231 */ @js.native
  object GCHKillGC extends TopLevel[GCHKillGC with Double]
  
  /* 2232 */ @js.native
  object GCHKillGCResponse extends TopLevel[GCHKillGCResponse with Double]
  
  /* 2222 */ @js.native
  object GCHRelay extends TopLevel[GCHRelay with Double]
  
  /* 2223 */ @js.native
  object GCHRelayClientToIS extends TopLevel[GCHRelayClientToIS with Double]
  
  /* 2223 */ @js.native
  object GCHRelayToClient extends TopLevel[GCHRelayToClient with Double]
  
  /* 2226 */ @js.native
  object GCHRequestStatus extends TopLevel[GCHRequestStatus with Double]
  
  /* 2227 */ @js.native
  object GCHRequestStatusResponse extends TopLevel[GCHRequestStatusResponse with Double]
  
  /* 2225 */ @js.native
  object GCHRequestUpdateSession extends TopLevel[GCHRequestUpdateSession with Double]
  
  /* 2229 */ @js.native
  object GCHSpawnGC extends TopLevel[GCHSpawnGC with Double]
  
  /* 2230 */ @js.native
  object GCHSpawnGCResponse extends TopLevel[GCHSpawnGCResponse with Double]
  
  /* 2224 */ @js.native
  object GCHUpdateSession extends TopLevel[GCHUpdateSession with Double]
  
  /* 2235 */ @js.native
  object GCHVacVerificationChange extends TopLevel[GCHVacVerificationChange with Double]
  
  /* 2219 */ @js.native
  object GCInterAppMessage extends TopLevel[GCInterAppMessage with Double]
  
  /* 2217 */ @js.native
  object GCRegisterWebInterfaces extends TopLevel[GCRegisterWebInterfaces with Double]
  
  /* 2217 */ @js.native
  object GCRegisterWebInterfaces_Deprecated extends TopLevel[GCRegisterWebInterfaces_Deprecated with Double]
  
  /* 2200 */ @js.native
  object GCSendClient extends TopLevel[GCSendClient with Double]
  
  /* 2213 */ @js.native
  object GCSystemMessage extends TopLevel[GCSystemMessage with Double]
  
  /* 2211 */ @js.native
  object GCUpdateGSState extends TopLevel[GCUpdateGSState with Double]
  
  /* 2202 */ @js.native
  object GCUpdatePlayedState extends TopLevel[GCUpdatePlayedState with Double]
  
  /* 2214 */ @js.native
  object GCValidateSession extends TopLevel[GCValidateSession with Double]
  
  /* 2215 */ @js.native
  object GCValidateSessionResponse extends TopLevel[GCValidateSessionResponse with Double]
  
  /* 333 */ @js.native
  object GMConvertUserWallets extends TopLevel[GMConvertUserWallets with Double]
  
  /* 320 */ @js.native
  object GMDRMSync extends TopLevel[GMDRMSync with Double]
  
  /* 331 */ @js.native
  object GMGetServiceMethodRouting extends TopLevel[GMGetServiceMethodRouting with Double]
  
  /* 332 */ @js.native
  object GMGetServiceMethodRoutingResponse extends TopLevel[GMGetServiceMethodRoutingResponse with Double]
  
  /* 325 */ @js.native
  object GMLoadActivationCodes extends TopLevel[GMLoadActivationCodes with Double]
  
  /* 326 */ @js.native
  object GMQueueForFBS extends TopLevel[GMQueueForFBS with Double]
  
  /* 319 */ @js.native
  object GMReportPHPError extends TopLevel[GMReportPHPError with Double]
  
  /* 6400 */ @js.native
  object GMSBase extends TopLevel[GMSBase with Double]
  
  /* 6404 */ @js.native
  object GMSClientServerQueryResponse extends TopLevel[GMSClientServerQueryResponse with Double]
  
  /* 6401 */ @js.native
  object GMSGameServerReplicate extends TopLevel[GMSGameServerReplicate with Double]
  
  /* 327 */ @js.native
  object GMSchemaConversionResults extends TopLevel[GMSchemaConversionResults with Double]
  
  /* 328 */ @js.native
  object GMSchemaConversionResultsResponse extends TopLevel[GMSchemaConversionResultsResponse with Double]
  
  /* 324 */ @js.native
  object GMWriteConfigToSQL extends TopLevel[GMWriteConfigToSQL with Double]
  
  /* 329 */ @js.native
  object GMWriteShellFailureToSQL extends TopLevel[GMWriteShellFailureToSQL with Double]
  
  /* 330 */ @js.native
  object GMWriteStatsToSOS extends TopLevel[GMWriteStatsToSOS with Double]
  
  /* 758 */ @js.native
  object GSApprove extends TopLevel[GSApprove with Double]
  
  /* 938 */ @js.native
  object GSAssociateWithClan extends TopLevel[GSAssociateWithClan with Double]
  
  /* 939 */ @js.native
  object GSAssociateWithClanResponse extends TopLevel[GSAssociateWithClanResponse with Double]
  
  /* 940 */ @js.native
  object GSComputeNewPlayerCompatibility extends TopLevel[GSComputeNewPlayerCompatibility with Double]
  
  /* 941 */ @js.native
  object GSComputeNewPlayerCompatibilityResponse extends TopLevel[GSComputeNewPlayerCompatibilityResponse with Double]
  
  /* 759 */ @js.native
  object GSDeny extends TopLevel[GSDeny with Double]
  
  /* 901 */ @js.native
  object GSDisconnectNotice extends TopLevel[GSDisconnectNotice with Double]
  
  /* 918 */ @js.native
  object GSGetPlayStats extends TopLevel[GSGetPlayStats with Double]
  
  /* 919 */ @js.native
  object GSGetPlayStatsResponse extends TopLevel[GSGetPlayStatsResponse with Double]
  
  /* 936 */ @js.native
  object GSGetReputation extends TopLevel[GSGetReputation with Double]
  
  /* 937 */ @js.native
  object GSGetReputationResponse extends TopLevel[GSGetReputationResponse with Double]
  
  /* 910 */ @js.native
  object GSGetUserAchievementStatus extends TopLevel[GSGetUserAchievementStatus with Double]
  
  /* 911 */ @js.native
  object GSGetUserAchievementStatusResponse extends TopLevel[GSGetUserAchievementStatusResponse with Double]
  
  /* 920 */ @js.native
  object GSGetUserGroupStatus extends TopLevel[GSGetUserGroupStatus with Double]
  
  /* 923 */ @js.native
  object GSGetUserGroupStatusResponse extends TopLevel[GSGetUserGroupStatusResponse with Double]
  
  /* 760 */ @js.native
  object GSKick extends TopLevel[GSKick with Double]
  
  /* 5440 */ @js.native
  object GSPerformHardwareSurvey extends TopLevel[GSPerformHardwareSurvey with Double]
  
  /* 909 */ @js.native
  object GSPlayerList extends TopLevel[GSPlayerList with Double]
  
  /* 908 */ @js.native
  object GSServerType extends TopLevel[GSServerType with Double]
  
  /* 903 */ @js.native
  object GSStatus extends TopLevel[GSStatus with Double]
  
  /* 906 */ @js.native
  object GSStatus2 extends TopLevel[GSStatus2 with Double]
  
  /* 774 */ @js.native
  object GSStatusReply extends TopLevel[GSStatusReply with Double]
  
  /* 907 */ @js.native
  object GSStatusUpdate_Unused extends TopLevel[GSStatusUpdate_Unused with Double]
  
  /* 905 */ @js.native
  object GSUserPlaying extends TopLevel[GSUserPlaying with Double]
  
  /* 6407 */ @js.native
  object GameServerOutOfDate extends TopLevel[GameServerOutOfDate with Double]
  
  /* 100 */ @js.native
  object GenericReply extends TopLevel[GenericReply with Double]
  
  /* 4393 */ @js.native
  object GetUserIPCountry extends TopLevel[GetUserIPCountry with Double]
  
  /* 4394 */ @js.native
  object GetUserIPCountryResponse extends TopLevel[GetUserIPCountryResponse with Double]
  
  /* 309 */ @js.native
  object GracefulExitShell extends TopLevel[GracefulExitShell with Double]
  
  /* 300 */ @js.native
  object Heartbeat extends TopLevel[Heartbeat with Double]
  
  /* 124 */ @js.native
  object HubConnect extends TopLevel[HubConnect with Double]
  
  /* 2222 */ @js.native
  object ISRelayToGCH extends TopLevel[ISRelayToGCH with Double]
  
  /* 0 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /* 145 */ @js.native
  object InvalidateDBOCacheItems extends TopLevel[InvalidateDBOCacheItems with Double]
  
  /* 123 */ @js.native
  object JobHeartbeat extends TopLevel[JobHeartbeat with Double]
  
  /* 3001 */ @js.native
  object JobHeartbeatTest extends TopLevel[JobHeartbeatTest with Double]
  
  /* 3002 */ @js.native
  object JobHeartbeatTestResponse extends TopLevel[JobHeartbeatTestResponse with Double]
  
  /* 7201 */ @js.native
  object KGSAllocateKeyRange extends TopLevel[KGSAllocateKeyRange with Double]
  
  /* 7202 */ @js.native
  object KGSAllocateKeyRangeResponse extends TopLevel[KGSAllocateKeyRangeResponse with Double]
  
  /* 7200 */ @js.native
  object KGSBase extends TopLevel[KGSBase with Double]
  
  /* 7207 */ @js.native
  object KGSGenerateGameStopWCKeys extends TopLevel[KGSGenerateGameStopWCKeys with Double]
  
  /* 7208 */ @js.native
  object KGSGenerateGameStopWCKeysResponse extends TopLevel[KGSGenerateGameStopWCKeysResponse with Double]
  
  /* 7203 */ @js.native
  object KGSGenerateKeys extends TopLevel[KGSGenerateKeys with Double]
  
  /* 7204 */ @js.native
  object KGSGenerateKeysResponse extends TopLevel[KGSGenerateKeysResponse with Double]
  
  /* 7205 */ @js.native
  object KGSRemapKeys extends TopLevel[KGSRemapKeys with Double]
  
  /* 7206 */ @js.native
  object KGSRemapKeysResponse extends TopLevel[KGSRemapKeysResponse with Double]
  
  /* 132 */ @js.native
  object KeepAlive extends TopLevel[KeepAlive with Double]
  
  /* 3210 */ @js.native
  object LBSDeleteLB extends TopLevel[LBSDeleteLB with Double]
  
  /* 3211 */ @js.native
  object LBSDeleteLBEntry extends TopLevel[LBSDeleteLBEntry with Double]
  
  /* 3214 */ @js.native
  object LBSDeleteLBResponse extends TopLevel[LBSDeleteLBResponse with Double]
  
  /* 3203 */ @js.native
  object LBSFindOrCreateLB extends TopLevel[LBSFindOrCreateLB with Double]
  
  /* 3204 */ @js.native
  object LBSFindOrCreateLBResponse extends TopLevel[LBSFindOrCreateLBResponse with Double]
  
  /* 3205 */ @js.native
  object LBSGetLBEntries extends TopLevel[LBSGetLBEntries with Double]
  
  /* 3206 */ @js.native
  object LBSGetLBEntriesResponse extends TopLevel[LBSGetLBEntriesResponse with Double]
  
  /* 3207 */ @js.native
  object LBSGetLBList extends TopLevel[LBSGetLBList with Double]
  
  /* 3208 */ @js.native
  object LBSGetLBListResponse extends TopLevel[LBSGetLBListResponse with Double]
  
  /* 3212 */ @js.native
  object LBSResetLB extends TopLevel[LBSResetLB with Double]
  
  /* 3213 */ @js.native
  object LBSResetLBResponse extends TopLevel[LBSResetLBResponse with Double]
  
  /* 3209 */ @js.native
  object LBSSetLBDetails extends TopLevel[LBSSetLBDetails with Double]
  
  /* 3201 */ @js.native
  object LBSSetScore extends TopLevel[LBSSetScore with Double]
  
  /* 3202 */ @js.native
  object LBSSetScoreResponse extends TopLevel[LBSSetScoreResponse with Double]
  
  /* 316 */ @js.native
  object LicenseProcessingComplete extends TopLevel[LicenseProcessingComplete with Double]
  
  /* 143 */ @js.native
  object LoadDBOCacheItem extends TopLevel[LoadDBOCacheItem with Double]
  
  /* 144 */ @js.native
  object LoadDBOCacheItemResponse extends TopLevel[LoadDBOCacheItemResponse with Double]
  
  /* 1009 */ @js.native
  object LogSearchCancel extends TopLevel[LogSearchCancel with Double]
  
  /* 1007 */ @js.native
  object LogSearchRequest extends TopLevel[LogSearchRequest with Double]
  
  /* 1008 */ @js.native
  object LogSearchResponse extends TopLevel[LogSearchResponse with Double]
  
  /* 8800 */ @js.native
  object LogsinkBase extends TopLevel[LogsinkBase with Double]
  
  /* 8800 */ @js.native
  object LogsinkWriteReport extends TopLevel[LogsinkWriteReport with Double]
  
  /* 5828 */ @js.native
  object MDSContentServerConfig extends TopLevel[MDSContentServerConfig with Double]
  
  /* 5827 */ @js.native
  object MDSContentServerConfigRequest extends TopLevel[MDSContentServerConfigRequest with Double]
  
  /* 5826 */ @js.native
  object MDSContentServerStatsBroadcast extends TopLevel[MDSContentServerStatsBroadcast with Double]
  
  /* 5825 */ @js.native
  object MDSDownloadDepotChunksAck extends TopLevel[MDSDownloadDepotChunksAck with Double]
  
  /* 5832 */ @js.native
  object MDSGetDepotChunk extends TopLevel[MDSGetDepotChunk with Double]
  
  /* 5834 */ @js.native
  object MDSGetDepotChunkChunk extends TopLevel[MDSGetDepotChunkChunk with Double]
  
  /* 5833 */ @js.native
  object MDSGetDepotChunkResponse extends TopLevel[MDSGetDepotChunkResponse with Double]
  
  /* 5829 */ @js.native
  object MDSGetDepotManifest extends TopLevel[MDSGetDepotManifest with Double]
  
  /* 5831 */ @js.native
  object MDSGetDepotManifestChunk extends TopLevel[MDSGetDepotManifestChunk with Double]
  
  /* 5830 */ @js.native
  object MDSGetDepotManifestResponse extends TopLevel[MDSGetDepotManifestResponse with Double]
  
  /* 5836 */ @js.native
  object MDSGetServerListForUser extends TopLevel[MDSGetServerListForUser with Double]
  
  /* 5837 */ @js.native
  object MDSGetServerListForUserResponse extends TopLevel[MDSGetServerListForUserResponse with Double]
  
  /* 5814 */ @js.native
  object MDSGetVersionsForDepot extends TopLevel[MDSGetVersionsForDepot with Double]
  
  /* 5815 */ @js.native
  object MDSGetVersionsForDepotResponse extends TopLevel[MDSGetVersionsForDepotResponse with Double]
  
  /* 5847 */ @js.native
  object MDSMigrateChunk extends TopLevel[MDSMigrateChunk with Double]
  
  /* 5848 */ @js.native
  object MDSMigrateChunkResponse extends TopLevel[MDSMigrateChunkResponse with Double]
  
  /* 5816 */ @js.native
  object MDSSetPublicVersionForDepot extends TopLevel[MDSSetPublicVersionForDepot with Double]
  
  /* 5817 */ @js.native
  object MDSSetPublicVersionForDepotResponse extends TopLevel[MDSSetPublicVersionForDepotResponse with Double]
  
  /* 5813 */ @js.native
  object MDSToAMGetDepotDecryptionKeyResponse extends TopLevel[MDSToAMGetDepotDecryptionKeyResponse with Double]
  
  /* 5844 */ @js.native
  object MDSToCSFlushChunk extends TopLevel[MDSToCSFlushChunk with Double]
  
  /* 5835 */ @js.native
  object MDSUpdateContentServerConfig extends TopLevel[MDSUpdateContentServerConfig with Double]
  
  /* 6600 */ @js.native
  object MMSBase extends TopLevel[MMSBase with Double]
  
  /* 7100 */ @js.native
  object MPASBase extends TopLevel[MPASBase with Double]
  
  /* 7101 */ @js.native
  object MPASVacBanReset extends TopLevel[MPASVacBanReset with Double]
  
  /* 4216 */ @js.native
  object MarketingMessageUpdate extends TopLevel[MarketingMessageUpdate with Double]
  
  /* 1 */ @js.native
  object Multi extends TopLevel[Multi with Double]
  
  /* 6800 */ @js.native
  object NonStdMsgBase extends TopLevel[NonStdMsgBase with Double]
  
  /* 6806 */ @js.native
  object NonStdMsgChase extends TopLevel[NonStdMsgChase with Double]
  
  /* 6807 */ @js.native
  object NonStdMsgDFSTransfer extends TopLevel[NonStdMsgDFSTransfer with Double]
  
  /* 6803 */ @js.native
  object NonStdMsgHTTPClient extends TopLevel[NonStdMsgHTTPClient with Double]
  
  /* 6802 */ @js.native
  object NonStdMsgHTTPServer extends TopLevel[NonStdMsgHTTPServer with Double]
  
  /* 6811 */ @js.native
  object NonStdMsgLogsink extends TopLevel[NonStdMsgLogsink with Double]
  
  /* 6801 */ @js.native
  object NonStdMsgMemcached extends TopLevel[NonStdMsgMemcached with Double]
  
  /* 6805 */ @js.native
  object NonStdMsgPHPSimulator extends TopLevel[NonStdMsgPHPSimulator with Double]
  
  /* 6813 */ @js.native
  object NonStdMsgRTMPServer extends TopLevel[NonStdMsgRTMPServer with Double]
  
  /* 6812 */ @js.native
  object NonStdMsgSteam2Emulator extends TopLevel[NonStdMsgSteam2Emulator with Double]
  
  /* 6810 */ @js.native
  object NonStdMsgSyslog extends TopLevel[NonStdMsgSyslog with Double]
  
  /* 6808 */ @js.native
  object NonStdMsgTests extends TopLevel[NonStdMsgTests with Double]
  
  /* 6809 */ @js.native
  object NonStdMsgUMQpipeAAPL extends TopLevel[NonStdMsgUMQpipeAAPL with Double]
  
  /* 6804 */ @js.native
  object NonStdMsgWGResponse extends TopLevel[NonStdMsgWGResponse with Double]
  
  /* 4395 */ @js.native
  object NotificationOfSuspiciousActivity extends TopLevel[NotificationOfSuspiciousActivity with Double]
  
  /* 314 */ @js.native
  object NotifyWatchdog extends TopLevel[NotifyWatchdog with Double]
  
  /* 3401 */ @js.native
  object OGSBeginSession extends TopLevel[OGSBeginSession with Double]
  
  /* 3402 */ @js.native
  object OGSBeginSessionResponse extends TopLevel[OGSBeginSessionResponse with Double]
  
  /* 3403 */ @js.native
  object OGSEndSession extends TopLevel[OGSEndSession with Double]
  
  /* 3404 */ @js.native
  object OGSEndSessionResponse extends TopLevel[OGSEndSessionResponse with Double]
  
  /* 3406 */ @js.native
  object OGSWriteAppSessionRow extends TopLevel[OGSWriteAppSessionRow with Double]
  
  /* 2502 */ @js.native
  object P2PIntroducerMessage extends TopLevel[P2PIntroducerMessage with Double]
  
  /* 8900 */ @js.native
  object PICSBase extends TopLevel[PICSBase with Double]
  
  /* 5005 */ @js.native
  object PSAddPackageToShoppingCart extends TopLevel[PSAddPackageToShoppingCart with Double]
  
  /* 5006 */ @js.native
  object PSAddPackageToShoppingCartResponse extends TopLevel[PSAddPackageToShoppingCartResponse with Double]
  
  /* 5011 */ @js.native
  object PSAddWalletCreditToShoppingCart extends TopLevel[PSAddWalletCreditToShoppingCart with Double]
  
  /* 5012 */ @js.native
  object PSAddWalletCreditToShoppingCartResponse extends TopLevel[PSAddWalletCreditToShoppingCartResponse with Double]
  
  /* 5001 */ @js.native
  object PSCreateShoppingCart extends TopLevel[PSCreateShoppingCart with Double]
  
  /* 5002 */ @js.native
  object PSCreateShoppingCartResponse extends TopLevel[PSCreateShoppingCartResponse with Double]
  
  /* 5009 */ @js.native
  object PSGetShoppingCartContents extends TopLevel[PSGetShoppingCartContents with Double]
  
  /* 5010 */ @js.native
  object PSGetShoppingCartContentsResponse extends TopLevel[PSGetShoppingCartContentsResponse with Double]
  
  /* 5003 */ @js.native
  object PSIsValidShoppingCart extends TopLevel[PSIsValidShoppingCart with Double]
  
  /* 5004 */ @js.native
  object PSIsValidShoppingCartResponse extends TopLevel[PSIsValidShoppingCartResponse with Double]
  
  /* 5007 */ @js.native
  object PSRemoveLineItemFromShoppingCart extends TopLevel[PSRemoveLineItemFromShoppingCart with Double]
  
  /* 5008 */ @js.native
  object PSRemoveLineItemFromShoppingCartResponse extends TopLevel[PSRemoveLineItemFromShoppingCartResponse with Double]
  
  /* 321 */ @js.native
  object PhysicalBoxInventory extends TopLevel[PhysicalBoxInventory with Double]
  
  /* 139 */ @js.native
  object Ping extends TopLevel[Ping with Double]
  
  /* 140 */ @js.native
  object PingResponse extends TopLevel[PingResponse with Double]
  
  /* 226 */ @js.native
  object PrepareToExit extends TopLevel[PrepareToExit with Double]
  
  /* 2 */ @js.native
  object ProtobufWrapped extends TopLevel[ProtobufWrapped with Double]
  
  /* 234 */ @js.native
  object ProvideWindowsEventLogEntries extends TopLevel[ProvideWindowsEventLogEntries with Double]
  
  /* 9300 */ @js.native
  object QuestServerBase extends TopLevel[QuestServerBase with Double]
  
  /* 318 */ @js.native
  object QueuedEmailsComplete extends TopLevel[QueuedEmailsComplete with Double]
  
  /* 7803 */ @js.native
  object RMDeleteMemcachedKeys extends TopLevel[RMDeleteMemcachedKeys with Double]
  
  /* 7806 */ @js.native
  object RMMsgTraceAddTrigger extends TopLevel[RMMsgTraceAddTrigger with Double]
  
  /* 7808 */ @js.native
  object RMMsgTraceEvent extends TopLevel[RMMsgTraceEvent with Double]
  
  /* 7807 */ @js.native
  object RMMsgTraceRemoveTrigger extends TopLevel[RMMsgTraceRemoveTrigger with Double]
  
  /* 7800 */ @js.native
  object RMRange extends TopLevel[RMRange with Double]
  
  /* 7804 */ @js.native
  object RMRemoteInvoke extends TopLevel[RMRemoteInvoke with Double]
  
  /* 7800 */ @js.native
  object RMTestVerisignOTP extends TopLevel[RMTestVerisignOTP with Double]
  
  /* 7801 */ @js.native
  object RMTestVerisignOTPResponse extends TopLevel[RMTestVerisignOTPResponse with Double]
  
  /* 9509 */ @js.native
  object RemoteClientAcceptEULA extends TopLevel[RemoteClientAcceptEULA with Double]
  
  /* 9502 */ @js.native
  object RemoteClientAppStatus extends TopLevel[RemoteClientAppStatus with Double]
  
  /* 9500 */ @js.native
  object RemoteClientAuth extends TopLevel[RemoteClientAuth with Double]
  
  /* 9501 */ @js.native
  object RemoteClientAuthResponse extends TopLevel[RemoteClientAuthResponse with Double]
  
  /* 9500 */ @js.native
  object RemoteClientBase extends TopLevel[RemoteClientBase with Double]
  
  /* 9510 */ @js.native
  object RemoteClientGetControllerConfig extends TopLevel[RemoteClientGetControllerConfig with Double]
  
  /* 9511 */ @js.native
  object RemoteClientGetControllerConfigResposne extends TopLevel[RemoteClientGetControllerConfigResposne with Double]
  
  /* 9505 */ @js.native
  object RemoteClientPing extends TopLevel[RemoteClientPing with Double]
  
  /* 9506 */ @js.native
  object RemoteClientPingResponse extends TopLevel[RemoteClientPingResponse with Double]
  
  /* 9503 */ @js.native
  object RemoteClientStartStream extends TopLevel[RemoteClientStartStream with Double]
  
  /* 9504 */ @js.native
  object RemoteClientStartStreamResponse extends TopLevel[RemoteClientStartStreamResponse with Double]
  
  /* 9512 */ @js.native
  object RemoteClientStreamingEnabled extends TopLevel[RemoteClientStreamingEnabled with Double]
  
  /* 128 */ @js.native
  object RemoteSysID extends TopLevel[RemoteSysID with Double]
  
  /* 600 */ @js.native
  object ReqChallenge extends TopLevel[ReqChallenge with Double]
  
  /* 602 */ @js.native
  object ReqChallengeTest extends TopLevel[ReqChallengeTest with Double]
  
  /* 142 */ @js.native
  object RequestFullStatsBlock extends TopLevel[RequestFullStatsBlock with Double]
  
  /* 1014 */ @js.native
  object RequestStatHistory extends TopLevel[RequestStatHistory with Double]
  
  /* 233 */ @js.native
  object RequestWindowsEventLogEntries extends TopLevel[RequestWindowsEventLogEntries with Double]
  
  /* 127 */ @js.native
  object RouteMessage extends TopLevel[RouteMessage with Double]
  
  /* 120 */ @js.native
  object SCIDRequest extends TopLevel[SCIDRequest with Double]
  
  /* 121 */ @js.native
  object SCIDResponse extends TopLevel[SCIDResponse with Double]
  
  /* 9400 */ @js.native
  object SLCBase extends TopLevel[SLCBase with Double]
  
  /* 9407 */ @js.native
  object SLCOwnerLibraryChanged extends TopLevel[SLCOwnerLibraryChanged with Double]
  
  /* 9401 */ @js.native
  object SLCRequestUserSessionStatus extends TopLevel[SLCRequestUserSessionStatus with Double]
  
  /* 9408 */ @js.native
  object SLCSharedLibraryChanged extends TopLevel[SLCSharedLibraryChanged with Double]
  
  /* 9402 */ @js.native
  object SLCSharedLicensesLockStatus extends TopLevel[SLCSharedLicensesLockStatus with Double]
  
  /* 9400 */ @js.native
  object SLCUserSessionStatus extends TopLevel[SLCUserSessionStatus with Double]
  
  /* 2902 */ @js.native
  object SMExpensiveReport extends TopLevel[SMExpensiveReport with Double]
  
  /* 2904 */ @js.native
  object SMFishingReport extends TopLevel[SMFishingReport with Double]
  
  /* 2907 */ @js.native
  object SMGetSchemaConversionResults extends TopLevel[SMGetSchemaConversionResults with Double]
  
  /* 2908 */ @js.native
  object SMGetSchemaConversionResultsResponse extends TopLevel[SMGetSchemaConversionResultsResponse with Double]
  
  /* 2903 */ @js.native
  object SMHourlyReport extends TopLevel[SMHourlyReport with Double]
  
  /* 2906 */ @js.native
  object SMMonitorSpace extends TopLevel[SMMonitorSpace with Double]
  
  /* 2905 */ @js.native
  object SMPartitionRenames extends TopLevel[SMPartitionRenames with Double]
  
  /* 8600 */ @js.native
  object SecretsBase extends TopLevel[SecretsBase with Double]
  
  /* 8601 */ @js.native
  object SecretsCredentialPairResponse extends TopLevel[SecretsCredentialPairResponse with Double]
  
  /* 8600 */ @js.native
  object SecretsRequestCredentialPair extends TopLevel[SecretsRequestCredentialPair with Double]
  
  /* 8602 */ @js.native
  object SecretsRequestServerIdentity extends TopLevel[SecretsRequestServerIdentity with Double]
  
  /* 8603 */ @js.native
  object SecretsServerIdentityResponse extends TopLevel[SecretsServerIdentityResponse with Double]
  
  /* 8604 */ @js.native
  object SecretsUpdateServerIdentities extends TopLevel[SecretsUpdateServerIdentities with Double]
  
  /* 146 */ @js.native
  object ServiceMethod extends TopLevel[ServiceMethod with Double]
  
  /* 147 */ @js.native
  object ServiceMethodResponse extends TopLevel[ServiceMethodResponse with Double]
  
  /* 317 */ @js.native
  object SetTestFlag extends TopLevel[SetTestFlag with Double]
  
  /* 237 */ @js.native
  object ShellCheckWindowsUpdates extends TopLevel[ShellCheckWindowsUpdates with Double]
  
  /* 238 */ @js.native
  object ShellCheckWindowsUpdatesResponse extends TopLevel[ShellCheckWindowsUpdatesResponse with Double]
  
  /* 230 */ @js.native
  object ShellConfigInfoUpdate extends TopLevel[ShellConfigInfoUpdate with Double]
  
  /* 301 */ @js.native
  object ShellFailed extends TopLevel[ShellFailed with Double]
  
  /* 239 */ @js.native
  object ShellFlushUserLicenseCache extends TopLevel[ShellFlushUserLicenseCache with Double]
  
  /* 235 */ @js.native
  object ShellSearchLogs extends TopLevel[ShellSearchLogs with Double]
  
  /* 236 */ @js.native
  object ShellSearchLogsResponse extends TopLevel[ShellSearchLogsResponse with Double]
  
  /* 1015 */ @js.native
  object StatHistory extends TopLevel[StatHistory with Double]
  
  /* 141 */ @js.native
  object Stats extends TopLevel[Stats with Double]
  
  /* 138 */ @js.native
  object StatsDeprecated extends TopLevel[StatsDeprecated with Double]
  
  /* 8000 */ @js.native
  object StoreBase extends TopLevel[StoreBase with Double]
  
  /* 8000 */ @js.native
  object StoreUpdateRecommendationCount extends TopLevel[StoreUpdateRecommendationCount with Double]
  
  /* 126 */ @js.native
  object Subscribe extends TopLevel[Subscribe with Double]
  
  /* 323 */ @js.native
  object TestInitDB extends TopLevel[TestInitDB with Double]
  
  /* 228 */ @js.native
  object TestResetServer extends TopLevel[TestResetServer with Double]
  
  /* 9200 */ @js.native
  object TestWorkerProcess extends TopLevel[TestWorkerProcess with Double]
  
  /* 9200 */ @js.native
  object TestWorkerProcessLoadUnloadModuleRequest extends TopLevel[TestWorkerProcessLoadUnloadModuleRequest with Double]
  
  /* 9201 */ @js.native
  object TestWorkerProcessLoadUnloadModuleResponse extends TopLevel[TestWorkerProcessLoadUnloadModuleResponse with Double]
  
  /* 9202 */ @js.native
  object TestWorkerProcessServiceModuleCallRequest extends TopLevel[TestWorkerProcessServiceModuleCallRequest with Double]
  
  /* 9203 */ @js.native
  object TestWorkerProcessServiceModuleCallResponse extends TopLevel[TestWorkerProcessServiceModuleCallResponse with Double]
  
  /* 149 */ @js.native
  object TimestampRequest extends TopLevel[TimestampRequest with Double]
  
  /* 150 */ @js.native
  object TimestampResponse extends TopLevel[TimestampResponse with Double]
  
  /* 7335 */ @js.native
  object UCMAddTaggedScreenshot extends TopLevel[UCMAddTaggedScreenshot with Double]
  
  /* 7300 */ @js.native
  object UCMBase extends TopLevel[UCMBase with Double]
  
  /* 7372 */ @js.native
  object UCMDeleteOldScreenshot extends TopLevel[UCMDeleteOldScreenshot with Double]
  
  /* 7373 */ @js.native
  object UCMDeleteOldScreenshotResponse extends TopLevel[UCMDeleteOldScreenshotResponse with Double]
  
  /* 7374 */ @js.native
  object UCMDeleteOldVideo extends TopLevel[UCMDeleteOldVideo with Double]
  
  /* 7375 */ @js.native
  object UCMDeleteOldVideoResponse extends TopLevel[UCMDeleteOldVideoResponse with Double]
  
  /* 7329 */ @js.native
  object UCMDeletePublishedFile extends TopLevel[UCMDeletePublishedFile with Double]
  
  /* 7330 */ @js.native
  object UCMDeletePublishedFileResponse extends TopLevel[UCMDeletePublishedFileResponse with Double]
  
  /* 7371 */ @js.native
  object UCMFixStatsPublishedFile extends TopLevel[UCMFixStatsPublishedFile with Double]
  
  /* 7362 */ @js.native
  object UCMGetPublishedFilesForUser extends TopLevel[UCMGetPublishedFilesForUser with Double]
  
  /* 7363 */ @js.native
  object UCMGetPublishedFilesForUserResponse extends TopLevel[UCMGetPublishedFilesForUserResponse with Double]
  
  /* 7369 */ @js.native
  object UCMGetUserSubscribedFiles extends TopLevel[UCMGetUserSubscribedFiles with Double]
  
  /* 7370 */ @js.native
  object UCMGetUserSubscribedFilesResponse extends TopLevel[UCMGetUserSubscribedFilesResponse with Double]
  
  /* 7351 */ @js.native
  object UCMPublishFile extends TopLevel[UCMPublishFile with Double]
  
  /* 7352 */ @js.native
  object UCMPublishFileResponse extends TopLevel[UCMPublishFileResponse with Double]
  
  /* 7353 */ @js.native
  object UCMPublishedFileChildAdd extends TopLevel[UCMPublishedFileChildAdd with Double]
  
  /* 7354 */ @js.native
  object UCMPublishedFileChildAddResponse extends TopLevel[UCMPublishedFileChildAddResponse with Double]
  
  /* 7357 */ @js.native
  object UCMPublishedFileChildChangeSortOrder extends TopLevel[UCMPublishedFileChildChangeSortOrder with Double]
  
  /* 7358 */ @js.native
  object UCMPublishedFileChildChangeSortOrderResponse extends TopLevel[UCMPublishedFileChildChangeSortOrderResponse with Double]
  
  /* 7355 */ @js.native
  object UCMPublishedFileChildRemove extends TopLevel[UCMPublishedFileChildRemove with Double]
  
  /* 7356 */ @js.native
  object UCMPublishedFileChildRemoveResponse extends TopLevel[UCMPublishedFileChildRemoveResponse with Double]
  
  /* 7380 */ @js.native
  object UCMPublishedFileContentUpdated extends TopLevel[UCMPublishedFileContentUpdated with Double]
  
  /* 7359 */ @js.native
  object UCMPublishedFileParentChanged extends TopLevel[UCMPublishedFileParentChanged with Double]
  
  /* 7341 */ @js.native
  object UCMPublishedFilePreviewAdd extends TopLevel[UCMPublishedFilePreviewAdd with Double]
  
  /* 7342 */ @js.native
  object UCMPublishedFilePreviewAddResponse extends TopLevel[UCMPublishedFilePreviewAddResponse with Double]
  
  /* 7345 */ @js.native
  object UCMPublishedFilePreviewChangeSortOrder extends TopLevel[UCMPublishedFilePreviewChangeSortOrder with Double]
  
  /* 7346 */ @js.native
  object UCMPublishedFilePreviewChangeSortOrderResponse extends TopLevel[UCMPublishedFilePreviewChangeSortOrderResponse with Double]
  
  /* 7343 */ @js.native
  object UCMPublishedFilePreviewRemove extends TopLevel[UCMPublishedFilePreviewRemove with Double]
  
  /* 7344 */ @js.native
  object UCMPublishedFilePreviewRemoveResponse extends TopLevel[UCMPublishedFilePreviewRemoveResponse with Double]
  
  /* 7339 */ @js.native
  object UCMPublishedFileReported extends TopLevel[UCMPublishedFileReported with Double]
  
  /* 7349 */ @js.native
  object UCMPublishedFileSubscribed extends TopLevel[UCMPublishedFileSubscribed with Double]
  
  /* 7350 */ @js.native
  object UCMPublishedFileUnsubscribed extends TopLevel[UCMPublishedFileUnsubscribed with Double]
  
  /* 7381 */ @js.native
  object UCMPublishedFileUpdated extends TopLevel[UCMPublishedFileUpdated with Double]
  
  /* 7337 */ @js.native
  object UCMReloadPublishedFile extends TopLevel[UCMReloadPublishedFile with Double]
  
  /* 7338 */ @js.native
  object UCMReloadUserFileListCaches extends TopLevel[UCMReloadUserFileListCaches with Double]
  
  /* 7336 */ @js.native
  object UCMRemoveTaggedScreenshot extends TopLevel[UCMRemoveTaggedScreenshot with Double]
  
  /* 7307 */ @js.native
  object UCMResetCommunityContent extends TopLevel[UCMResetCommunityContent with Double]
  
  /* 7308 */ @js.native
  object UCMResetCommunityContentResponse extends TopLevel[UCMResetCommunityContentResponse with Double]
  
  /* 7376 */ @js.native
  object UCMUpdateOldScreenshotPrivacy extends TopLevel[UCMUpdateOldScreenshotPrivacy with Double]
  
  /* 7377 */ @js.native
  object UCMUpdateOldScreenshotPrivacyResponse extends TopLevel[UCMUpdateOldScreenshotPrivacyResponse with Double]
  
  /* 7327 */ @js.native
  object UCMUpdatePublishedFile extends TopLevel[UCMUpdatePublishedFile with Double]
  
  /* 7332 */ @js.native
  object UCMUpdatePublishedFileBan extends TopLevel[UCMUpdatePublishedFileBan with Double]
  
  /* 7333 */ @js.native
  object UCMUpdatePublishedFileBanResponse extends TopLevel[UCMUpdatePublishedFileBanResponse with Double]
  
  /* 7340 */ @js.native
  object UCMUpdatePublishedFileIncompatibleStatus extends TopLevel[UCMUpdatePublishedFileIncompatibleStatus with Double]
  
  /* 7328 */ @js.native
  object UCMUpdatePublishedFileResponse extends TopLevel[UCMUpdatePublishedFileResponse with Double]
  
  /* 7331 */ @js.native
  object UCMUpdatePublishedFileStat extends TopLevel[UCMUpdatePublishedFileStat with Double]
  
  /* 7334 */ @js.native
  object UCMUpdateTaggedScreenshot extends TopLevel[UCMUpdateTaggedScreenshot with Double]
  
  /* 7303 */ @js.native
  object UCMValidateObjectExists extends TopLevel[UCMValidateObjectExists with Double]
  
  /* 7304 */ @js.native
  object UCMValidateObjectExistsResponse extends TopLevel[UCMValidateObjectExistsResponse with Double]
  
  /* 7000 */ @js.native
  object UDSBase extends TopLevel[UDSBase with Double]
  
  /* 7006 */ @js.native
  object UDSFindSession extends TopLevel[UDSFindSession with Double]
  
  /* 7007 */ @js.native
  object UDSFindSessionResponse extends TopLevel[UDSFindSessionResponse with Double]
  
  /* 7006 */ @js.native
  object UDSHasSession extends TopLevel[UDSHasSession with Double]
  
  /* 7007 */ @js.native
  object UDSHasSessionResponse extends TopLevel[UDSHasSessionResponse with Double]
  
  /* 7003 */ @js.native
  object UDSRenderUserAuth extends TopLevel[UDSRenderUserAuth with Double]
  
  /* 7004 */ @js.native
  object UDSRenderUserAuthResponse extends TopLevel[UDSRenderUserAuthResponse with Double]
  
  /* 5223 */ @js.native
  object UFSDownloadChunk extends TopLevel[UFSDownloadChunk with Double]
  
  /* 5246 */ @js.native
  object UFSDownloadChunkRequest extends TopLevel[UFSDownloadChunkRequest with Double]
  
  /* 5247 */ @js.native
  object UFSDownloadChunkResponse extends TopLevel[UFSDownloadChunkResponse with Double]
  
  /* 5248 */ @js.native
  object UFSDownloadFinishRequest extends TopLevel[UFSDownloadFinishRequest with Double]
  
  /* 5249 */ @js.native
  object UFSDownloadFinishResponse extends TopLevel[UFSDownloadFinishResponse with Double]
  
  /* 5221 */ @js.native
  object UFSDownloadRequest extends TopLevel[UFSDownloadRequest with Double]
  
  /* 5222 */ @js.native
  object UFSDownloadResponse extends TopLevel[UFSDownloadResponse with Double]
  
  /* 5244 */ @js.native
  object UFSDownloadStartRequest extends TopLevel[UFSDownloadStartRequest with Double]
  
  /* 5245 */ @js.native
  object UFSDownloadStartResponse extends TopLevel[UFSDownloadStartResponse with Double]
  
  /* 5250 */ @js.native
  object UFSFlushURLCache extends TopLevel[UFSFlushURLCache with Double]
  
  /* 5240 */ @js.native
  object UFSGetUGCURLs extends TopLevel[UFSGetUGCURLs with Double]
  
  /* 5241 */ @js.native
  object UFSGetUGCURLsResponse extends TopLevel[UFSGetUGCURLsResponse with Double]
  
  /* 5242 */ @js.native
  object UFSHttpUploadFileFinishRequest extends TopLevel[UFSHttpUploadFileFinishRequest with Double]
  
  /* 5243 */ @js.native
  object UFSHttpUploadFileFinishResponse extends TopLevel[UFSHttpUploadFileFinishResponse with Double]
  
  /* 5238 */ @js.native
  object UFSMigrateFile extends TopLevel[UFSMigrateFile with Double]
  
  /* 5253 */ @js.native
  object UFSMigrateFileAppID extends TopLevel[UFSMigrateFileAppID with Double]
  
  /* 5254 */ @js.native
  object UFSMigrateFileAppIDResponse extends TopLevel[UFSMigrateFileAppIDResponse with Double]
  
  /* 5239 */ @js.native
  object UFSMigrateFileResponse extends TopLevel[UFSMigrateFileResponse with Double]
  
  /* 5234 */ @js.native
  object UFSReloadAccount extends TopLevel[UFSReloadAccount with Double]
  
  /* 5235 */ @js.native
  object UFSReloadAccountResponse extends TopLevel[UFSReloadAccountResponse with Double]
  
  /* 5215 */ @js.native
  object UFSReloadPartitionInfo extends TopLevel[UFSReloadPartitionInfo with Double]
  
  /* 5217 */ @js.native
  object UFSSynchronizeFile extends TopLevel[UFSSynchronizeFile with Double]
  
  /* 5218 */ @js.native
  object UFSSynchronizeFileResponse extends TopLevel[UFSSynchronizeFileResponse with Double]
  
  /* 5228 */ @js.native
  object UFSUpdateFileFlags extends TopLevel[UFSUpdateFileFlags with Double]
  
  /* 5229 */ @js.native
  object UFSUpdateFileFlagsResponse extends TopLevel[UFSUpdateFileFlagsResponse with Double]
  
  /* 5236 */ @js.native
  object UFSUpdateRecordBatched extends TopLevel[UFSUpdateRecordBatched with Double]
  
  /* 5237 */ @js.native
  object UFSUpdateRecordBatchedResponse extends TopLevel[UFSUpdateRecordBatchedResponse with Double]
  
  /* 5251 */ @js.native
  object UFSUploadCommit extends TopLevel[UFSUploadCommit with Double]
  
  /* 5252 */ @js.native
  object UFSUploadCommitResponse extends TopLevel[UFSUploadCommitResponse with Double]
  
  /* 7900 */ @js.native
  object UGSBase extends TopLevel[UGSBase with Double]
  
  /* 7900 */ @js.native
  object UGSUpdateGlobalStats extends TopLevel[UGSUpdateGlobalStats with Double]
  
  /* 8108 */ @js.native
  object UMQ2AM_ClientMsgBatch extends TopLevel[UMQ2AM_ClientMsgBatch with Double]
  
  /* 8100 */ @js.native
  object UMQBase extends TopLevel[UMQBase with Double]
  
  /* 8110 */ @js.native
  object UMQEnqueueMobileAnnouncements extends TopLevel[UMQEnqueueMobileAnnouncements with Double]
  
  /* 8109 */ @js.native
  object UMQEnqueueMobileSalePromotions extends TopLevel[UMQEnqueueMobileSalePromotions with Double]
  
  /* 8105 */ @js.native
  object UMQIncomingChatMessage extends TopLevel[UMQIncomingChatMessage with Double]
  
  /* 8102 */ @js.native
  object UMQLogoffRequest extends TopLevel[UMQLogoffRequest with Double]
  
  /* 8103 */ @js.native
  object UMQLogoffResponse extends TopLevel[UMQLogoffResponse with Double]
  
  /* 8100 */ @js.native
  object UMQLogonRequest extends TopLevel[UMQLogonRequest with Double]
  
  /* 8101 */ @js.native
  object UMQLogonResponse extends TopLevel[UMQLogonResponse with Double]
  
  /* 8106 */ @js.native
  object UMQPoll extends TopLevel[UMQPoll with Double]
  
  /* 8107 */ @js.native
  object UMQPollResults extends TopLevel[UMQPollResults with Double]
  
  /* 8104 */ @js.native
  object UMQSendChatMessage extends TopLevel[UMQSendChatMessage with Double]
  
  /* 229 */ @js.native
  object UniverseChanged extends TopLevel[UniverseChanged with Double]
  
  /* 1010 */ @js.native
  object UniverseData extends TopLevel[UniverseData with Double]
  
  /* 322 */ @js.native
  object UpdateConfigFile extends TopLevel[UpdateConfigFile with Double]
  
  /* 221 */ @js.native
  object UpdateCreditCardRequest extends TopLevel[UpdateCreditCardRequest with Double]
  
  /* 215 */ @js.native
  object UpdateRecordResponse extends TopLevel[UpdateRecordResponse with Double]
  
  /* 225 */ @js.native
  object UpdateUserBanResponse extends TopLevel[UpdateUserBanResponse with Double]
  
  /* 601 */ @js.native
  object VACResponse extends TopLevel[VACResponse with Double]
  
  /* 605 */ @js.native
  object VSAddCheat extends TopLevel[VSAddCheat with Double]
  
  /* 608 */ @js.native
  object VSChallengeResultText extends TopLevel[VSChallengeResultText with Double]
  
  /* 607 */ @js.native
  object VSGetChallengeResults extends TopLevel[VSGetChallengeResults with Double]
  
  /* 611 */ @js.native
  object VSLoadDBFinished extends TopLevel[VSLoadDBFinished with Double]
  
  /* 604 */ @js.native
  object VSMarkCheat extends TopLevel[VSMarkCheat with Double]
  
  /* 606 */ @js.native
  object VSPurgeCodeModDB extends TopLevel[VSPurgeCodeModDB with Double]
  
  /* 609 */ @js.native
  object VSReportLingerer extends TopLevel[VSReportLingerer with Double]
  
  /* 610 */ @js.native
  object VSRequestManagedChallenge extends TopLevel[VSRequestManagedChallenge with Double]
  
  /* 130 */ @js.native
  object WGRequest extends TopLevel[WGRequest with Double]
  
  /* 131 */ @js.native
  object WGResponse extends TopLevel[WGResponse with Double]
  
  /* 8300 */ @js.native
  object WebAPIBase extends TopLevel[WebAPIBase with Double]
  
  /* 8304 */ @js.native
  object WebAPIInvalidateOAuthClientCache extends TopLevel[WebAPIInvalidateOAuthClientCache with Double]
  
  /* 8305 */ @js.native
  object WebAPIInvalidateOAuthTokenCache extends TopLevel[WebAPIInvalidateOAuthTokenCache with Double]
  
  /* 8302 */ @js.native
  object WebAPIInvalidateTokensForAccount extends TopLevel[WebAPIInvalidateTokensForAccount with Double]
  
  /* 133 */ @js.native
  object WebAPIJobRequest extends TopLevel[WebAPIJobRequest with Double]
  
  /* 134 */ @js.native
  object WebAPIJobResponse extends TopLevel[WebAPIJobResponse with Double]
  
  /* 8303 */ @js.native
  object WebAPIRegisterGCInterfaces extends TopLevel[WebAPIRegisterGCInterfaces with Double]
  
  /* 8306 */ @js.native
  object WebAPISetSecrets extends TopLevel[WebAPISetSecrets with Double]
  
  /* 8300 */ @js.native
  object WebAPIValidateOAuth2Token extends TopLevel[WebAPIValidateOAuth2Token with Double]
  
  /* 8301 */ @js.native
  object WebAPIValidateOAuth2TokenResponse extends TopLevel[WebAPIValidateOAuth2TokenResponse with Double]
  
  /* 9000 */ @js.native
  object WorkerProcess extends TopLevel[WorkerProcess with Double]
  
  /* 9000 */ @js.native
  object WorkerProcessPingRequest extends TopLevel[WorkerProcessPingRequest with Double]
  
  /* 9001 */ @js.native
  object WorkerProcessPingResponse extends TopLevel[WorkerProcessPingResponse with Double]
  
  /* 9002 */ @js.native
  object WorkerProcessShutdown extends TopLevel[WorkerProcessShutdown with Double]
  
  /* 8200 */ @js.native
  object WorkshopAcceptTOSRequest extends TopLevel[WorkshopAcceptTOSRequest with Double]
  
  /* 8201 */ @js.native
  object WorkshopAcceptTOSResponse extends TopLevel[WorkshopAcceptTOSResponse with Double]
  
  /* 8200 */ @js.native
  object WorkshopBase extends TopLevel[WorkshopBase with Double]
  
  /* 204 */ @js.native
  object ZipRequest extends TopLevel[ZipRequest with Double]
  
  /* 205 */ @js.native
  object ZipResponse extends TopLevel[ZipResponse with Double]
  
}

