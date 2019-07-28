package typings.steamDashClient.steamDashClientMod

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
  
  /* 423 */ val AIGetAppGCFlags: typings.steamDashClient.steamDashClientMod.EMsg.AIGetAppGCFlags with Double = js.native
  /* 424 */ val AIGetAppGCFlagsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AIGetAppGCFlagsResponse with Double = js.native
  /* 427 */ val AIGetAppInfo: typings.steamDashClient.steamDashClientMod.EMsg.AIGetAppInfo with Double = js.native
  /* 428 */ val AIGetAppInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.AIGetAppInfoResponse with Double = js.native
  /* 425 */ val AIGetAppList: typings.steamDashClient.steamDashClientMod.EMsg.AIGetAppList with Double = js.native
  /* 426 */ val AIGetAppListResponse: typings.steamDashClient.steamDashClientMod.EMsg.AIGetAppListResponse with Double = js.native
  /* 407 */ val AISAppInfoTableChanged: typings.steamDashClient.steamDashClientMod.EMsg.AISAppInfoTableChanged with Double = js.native
  /* 409 */ val AISCreateMarketingMessage: typings.steamDashClient.steamDashClientMod.EMsg.AISCreateMarketingMessage with Double = js.native
  /* 410 */ val AISCreateMarketingMessageResponse: typings.steamDashClient.steamDashClientMod.EMsg.AISCreateMarketingMessageResponse with Double = js.native
  /* 416 */ val AISDeleteMarketingMessage: typings.steamDashClient.steamDashClientMod.EMsg.AISDeleteMarketingMessage with Double = js.native
  /* 429 */ val AISGetCouponDefinition: typings.steamDashClient.steamDashClientMod.EMsg.AISGetCouponDefinition with Double = js.native
  /* 430 */ val AISGetCouponDefinitionResponse: typings.steamDashClient.steamDashClientMod.EMsg.AISGetCouponDefinitionResponse with Double = js.native
  /* 411 */ val AISGetMarketingMessage: typings.steamDashClient.steamDashClientMod.EMsg.AISGetMarketingMessage with Double = js.native
  /* 412 */ val AISGetMarketingMessageResponse: typings.steamDashClient.steamDashClientMod.EMsg.AISGetMarketingMessageResponse with Double = js.native
  /* 419 */ val AISGetMarketingTreatments: typings.steamDashClient.steamDashClientMod.EMsg.AISGetMarketingTreatments with Double = js.native
  /* 420 */ val AISGetMarketingTreatmentsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AISGetMarketingTreatmentsResponse with Double = js.native
  /* 405 */ val AISGetPackageChangeNumber: typings.steamDashClient.steamDashClientMod.EMsg.AISGetPackageChangeNumber with Double = js.native
  /* 406 */ val AISGetPackageChangeNumberResponse: typings.steamDashClient.steamDashClientMod.EMsg.AISGetPackageChangeNumberResponse with Double = js.native
  /* 401 */ val AISRefreshContentDescription: typings.steamDashClient.steamDashClientMod.EMsg.AISRefreshContentDescription with Double = js.native
  /* 402 */ val AISRequestContentDescription: typings.steamDashClient.steamDashClientMod.EMsg.AISRequestContentDescription with Double = js.native
  /* 415 */ val AISRequestMarketingMessageUpdate: typings.steamDashClient.steamDashClientMod.EMsg.AISRequestMarketingMessageUpdate with Double = js.native
  /* 421 */ val AISRequestMarketingTreatmentUpdate: typings.steamDashClient.steamDashClientMod.EMsg.AISRequestMarketingTreatmentUpdate with Double = js.native
  /* 422 */ val AISTestAddPackage: typings.steamDashClient.steamDashClientMod.EMsg.AISTestAddPackage with Double = js.native
  /* 433 */ val AISTestEnableGC: typings.steamDashClient.steamDashClientMod.EMsg.AISTestEnableGC with Double = js.native
  /* 403 */ val AISUpdateAppInfo: typings.steamDashClient.steamDashClientMod.EMsg.AISUpdateAppInfo with Double = js.native
  /* 413 */ val AISUpdateMarketingMessage: typings.steamDashClient.steamDashClientMod.EMsg.AISUpdateMarketingMessage with Double = js.native
  /* 414 */ val AISUpdateMarketingMessageResponse: typings.steamDashClient.steamDashClientMod.EMsg.AISUpdateMarketingMessageResponse with Double = js.native
  /* 404 */ val AISUpdatePackageCosts: typings.steamDashClient.steamDashClientMod.EMsg.AISUpdatePackageCosts with Double = js.native
  /* 408 */ val AISUpdatePackageCostsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AISUpdatePackageCostsResponse with Double = js.native
  /* 404 */ val AISUpdatePackageInfo: typings.steamDashClient.steamDashClientMod.EMsg.AISUpdatePackageInfo with Double = js.native
  /* 431 */ val AISUpdateSlaveContentDescription: typings.steamDashClient.steamDashClientMod.EMsg.AISUpdateSlaveContentDescription with Double = js.native
  /* 432 */ val AISUpdateSlaveContentDescriptionResponse: typings.steamDashClient.steamDashClientMod.EMsg.AISUpdateSlaveContentDescriptionResponse with Double = js.native
  /* 4310 */ val AMAccountPS3Unlink: typings.steamDashClient.steamDashClientMod.EMsg.AMAccountPS3Unlink with Double = js.native
  /* 4311 */ val AMAccountPS3UnlinkResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMAccountPS3UnlinkResponse with Double = js.native
  /* 4346 */ val AMAcctAllowedToPurchase: typings.steamDashClient.steamDashClientMod.EMsg.AMAcctAllowedToPurchase with Double = js.native
  /* 4347 */ val AMAcctAllowedToPurchaseResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMAcctAllowedToPurchaseResponse with Double = js.native
  /* 565 */ val AMAcknowledgeClanInvite: typings.steamDashClient.steamDashClientMod.EMsg.AMAcknowledgeClanInvite with Double = js.native
  /* 4141 */ val AMAddClanNews: typings.steamDashClient.steamDashClientMod.EMsg.AMAddClanNews with Double = js.native
  /* 4202 */ val AMAddComment: typings.steamDashClient.steamDashClientMod.EMsg.AMAddComment with Double = js.native
  /* 4203 */ val AMAddCommentResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMAddCommentResponse with Double = js.native
  /* 4061 */ val AMAddFounderToClan: typings.steamDashClient.steamDashClientMod.EMsg.AMAddFounderToClan with Double = js.native
  /* 4224 */ val AMAddFreeLicense: typings.steamDashClient.steamDashClientMod.EMsg.AMAddFreeLicense with Double = js.native
  /* 4285 */ val AMAddFreeLicenseResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMAddFreeLicenseResponse with Double = js.native
  /* 4081 */ val AMAddFriend: typings.steamDashClient.steamDashClientMod.EMsg.AMAddFriend with Double = js.native
  /* 4082 */ val AMAddFriendResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMAddFriendResponse with Double = js.native
  /* 505 */ val AMAddLicense: typings.steamDashClient.steamDashClientMod.EMsg.AMAddLicense with Double = js.native
  /* 510 */ val AMAddMinutesToLicense: typings.steamDashClient.steamDashClientMod.EMsg.AMAddMinutesToLicense with Double = js.native
  /* 4280 */ val AMAddPublisherUser: typings.steamDashClient.steamDashClientMod.EMsg.AMAddPublisherUser with Double = js.native
  /* 4234 */ val AMAddUsersToMarketingTreatment: typings.steamDashClient.steamDashClientMod.EMsg.AMAddUsersToMarketingTreatment with Double = js.native
  /* 558 */ val AMAllowUserContentQuery: typings.steamDashClient.steamDashClientMod.EMsg.AMAllowUserContentQuery with Double = js.native
  /* 559 */ val AMAllowUserContentResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMAllowUserContentResponse with Double = js.native
  /* 4156 */ val AMAllowUserFilesRequest: typings.steamDashClient.steamDashClientMod.EMsg.AMAllowUserFilesRequest with Double = js.native
  /* 4157 */ val AMAllowUserFilesResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMAllowUserFilesResponse with Double = js.native
  /* 592 */ val AMAuthenticateUser: typings.steamDashClient.steamDashClientMod.EMsg.AMAuthenticateUser with Double = js.native
  /* 593 */ val AMAuthenticateUserResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMAuthenticateUserResponse with Double = js.native
  /* 4315 */ val AMAuthenticatedPlayerList: typings.steamDashClient.steamDashClientMod.EMsg.AMAuthenticatedPlayerList with Double = js.native
  /* 4145 */ val AMBanFromChat: typings.steamDashClient.steamDashClientMod.EMsg.AMBanFromChat with Double = js.native
  /* 507 */ val AMBeginProcessingLicenses: typings.steamDashClient.steamDashClientMod.EMsg.AMBeginProcessingLicenses with Double = js.native
  /* 4410 */ val AMBitPayPayment: typings.steamDashClient.steamDashClientMod.EMsg.AMBitPayPayment with Double = js.native
  /* 4411 */ val AMBitPayPaymentResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMBitPayPaymentResponse with Double = js.native
  /* 4380 */ val AMBoaCompraPayment: typings.steamDashClient.steamDashClientMod.EMsg.AMBoaCompraPayment with Double = js.native
  /* 4381 */ val AMBoaCompraPaymentResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMBoaCompraPaymentResponse with Double = js.native
  /* 4086 */ val AMCancelEasyCollect: typings.steamDashClient.steamDashClientMod.EMsg.AMCancelEasyCollect with Double = js.native
  /* 4087 */ val AMCancelEasyCollectResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMCancelEasyCollectResponse with Double = js.native
  /* 511 */ val AMCancelLicense: typings.steamDashClient.steamDashClientMod.EMsg.AMCancelLicense with Double = js.native
  /* 522 */ val AMCancelPurchase: typings.steamDashClient.steamDashClientMod.EMsg.AMCancelPurchase with Double = js.native
  /* 4105 */ val AMChallengeNotification: typings.steamDashClient.steamDashClientMod.EMsg.AMChallengeNotification with Double = js.native
  /* 4104 */ val AMChallengeVerdict: typings.steamDashClient.steamDashClientMod.EMsg.AMChallengeVerdict with Double = js.native
  /* 4085 */ val AMChangeClanOwner: typings.steamDashClient.steamDashClientMod.EMsg.AMChangeClanOwner with Double = js.native
  /* 579 */ val AMChatActionResult: typings.steamDashClient.steamDashClientMod.EMsg.AMChatActionResult with Double = js.native
  /* 533 */ val AMChatCleanup: typings.steamDashClient.steamDashClientMod.EMsg.AMChatCleanup with Double = js.native
  /* 577 */ val AMChatEnter: typings.steamDashClient.steamDashClientMod.EMsg.AMChatEnter with Double = js.native
  /* 572 */ val AMChatInvite: typings.steamDashClient.steamDashClientMod.EMsg.AMChatInvite with Double = js.native
  /* 570 */ val AMChatMulti: typings.steamDashClient.steamDashClientMod.EMsg.AMChatMulti with Double = js.native
  /* 4118 */ val AMCheckClanInviteRateLimiting: typings.steamDashClient.steamDashClientMod.EMsg.AMCheckClanInviteRateLimiting with Double = js.native
  /* 4075 */ val AMCheckClanMembership: typings.steamDashClient.steamDashClientMod.EMsg.AMCheckClanMembership with Double = js.native
  /* 4161 */ val AMCheckClanMembershipResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMCheckClanMembershipResponse with Double = js.native
  /* 4352 */ val AMClaimUnownedUserGift: typings.steamDashClient.steamDashClientMod.EMsg.AMClaimUnownedUserGift with Double = js.native
  /* 4353 */ val AMClaimUnownedUserGiftResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMClaimUnownedUserGiftResponse with Double = js.native
  /* 534 */ val AMClanCleanup: typings.steamDashClient.steamDashClientMod.EMsg.AMClanCleanup with Double = js.native
  /* 538 */ val AMClanCleanupList: typings.steamDashClient.steamDashClientMod.EMsg.AMClanCleanupList with Double = js.native
  /* 567 */ val AMClanDataUpdated: typings.steamDashClient.steamDashClientMod.EMsg.AMClanDataUpdated with Double = js.native
  /* 4011 */ val AMClanPermissions: typings.steamDashClient.steamDashClientMod.EMsg.AMClanPermissions with Double = js.native
  /* 4012 */ val AMClanPermissionsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMClanPermissionsResponse with Double = js.native
  /* 4090 */ val AMClansInCommon: typings.steamDashClient.steamDashClientMod.EMsg.AMClansInCommon with Double = js.native
  /* 4103 */ val AMClansInCommonCount: typings.steamDashClient.steamDashClientMod.EMsg.AMClansInCommonCount with Double = js.native
  /* 4097 */ val AMClansInCommonCountResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMClansInCommonCountResponse with Double = js.native
  /* 4091 */ val AMClansInCommonResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMClansInCommonResponse with Double = js.native
  /* 4264 */ val AMClearDispute: typings.steamDashClient.steamDashClientMod.EMsg.AMClearDispute with Double = js.native
  /* 4265 */ val AMClearDisputeResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMClearDisputeResponse with Double = js.native
  /* 4306 */ val AMClearPersonaMetadataBlob: typings.steamDashClient.steamDashClientMod.EMsg.AMClearPersonaMetadataBlob with Double = js.native
  /* 576 */ val AMClientAcceptFriendInvite: typings.steamDashClient.steamDashClientMod.EMsg.AMClientAcceptFriendInvite with Double = js.native
  /* 5566 */ val AMClientAddFriendToGroup: typings.steamDashClient.steamDashClientMod.EMsg.AMClientAddFriendToGroup with Double = js.native
  /* 5567 */ val AMClientAddFriendToGroupResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMClientAddFriendToGroupResponse with Double = js.native
  /* 598 */ val AMClientChatActionRelay: typings.steamDashClient.steamDashClientMod.EMsg.AMClientChatActionRelay with Double = js.native
  /* 571 */ val AMClientChatInviteRelay: typings.steamDashClient.steamDashClientMod.EMsg.AMClientChatInviteRelay with Double = js.native
  /* 574 */ val AMClientChatMemberInfoRelay: typings.steamDashClient.steamDashClientMod.EMsg.AMClientChatMemberInfoRelay with Double = js.native
  /* 569 */ val AMClientChatMsgRelay: typings.steamDashClient.steamDashClientMod.EMsg.AMClientChatMsgRelay with Double = js.native
  /* 5560 */ val AMClientCreateFriendsGroup: typings.steamDashClient.steamDashClientMod.EMsg.AMClientCreateFriendsGroup with Double = js.native
  /* 5561 */ val AMClientCreateFriendsGroupResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMClientCreateFriendsGroupResponse with Double = js.native
  /* 5562 */ val AMClientDeleteFriendsGroup: typings.steamDashClient.steamDashClientMod.EMsg.AMClientDeleteFriendsGroup with Double = js.native
  /* 5563 */ val AMClientDeleteFriendsGroupResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMClientDeleteFriendsGroupResponse with Double = js.native
  /* 573 */ val AMClientJoinChatRelay: typings.steamDashClient.steamDashClientMod.EMsg.AMClientJoinChatRelay with Double = js.native
  /* 553 */ val AMClientNotPlaying: typings.steamDashClient.steamDashClientMod.EMsg.AMClientNotPlaying with Double = js.native
  /* 578 */ val AMClientPublishRemovalFromSource: typings.steamDashClient.steamDashClientMod.EMsg.AMClientPublishRemovalFromSource with Double = js.native
  /* 5568 */ val AMClientRemoveFriendFromGroup: typings.steamDashClient.steamDashClientMod.EMsg.AMClientRemoveFriendFromGroup with Double = js.native
  /* 5569 */ val AMClientRemoveFriendFromGroupResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMClientRemoveFriendFromGroupResponse with Double = js.native
  /* 5564 */ val AMClientRenameFriendsGroup: typings.steamDashClient.steamDashClientMod.EMsg.AMClientRenameFriendsGroup with Double = js.native
  /* 5565 */ val AMClientRenameFriendsGroupResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMClientRenameFriendsGroupResponse with Double = js.native
  /* 5588 */ val AMClientSetPlayerNickname: typings.steamDashClient.steamDashClientMod.EMsg.AMClientSetPlayerNickname with Double = js.native
  /* 5589 */ val AMClientSetPlayerNicknameResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMClientSetPlayerNicknameResponse with Double = js.native
  /* 4383 */ val AMCompleteExternalPurchase: typings.steamDashClient.steamDashClientMod.EMsg.AMCompleteExternalPurchase with Double = js.native
  /* 4384 */ val AMCompleteExternalPurchaseResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMCompleteExternalPurchaseResponse with Double = js.native
  /* 521 */ val AMCompletePurchase: typings.steamDashClient.steamDashClientMod.EMsg.AMCompletePurchase with Double = js.native
  /* 4093 */ val AMConvertClan: typings.steamDashClient.steamDashClientMod.EMsg.AMConvertClan with Double = js.native
  /* 4251 */ val AMConvertWallet: typings.steamDashClient.steamDashClientMod.EMsg.AMConvertWallet with Double = js.native
  /* 4252 */ val AMConvertWalletResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMConvertWalletResponse with Double = js.native
  /* 4109 */ val AMCreateAccountRecord: typings.steamDashClient.steamDashClientMod.EMsg.AMCreateAccountRecord with Double = js.native
  /* 4183 */ val AMCreateAccountRecordInSteam3: typings.steamDashClient.steamDashClientMod.EMsg.AMCreateAccountRecordInSteam3 with Double = js.native
  /* 129 */ val AMCreateAccountResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMCreateAccountResponse with Double = js.native
  /* 4260 */ val AMCreateChargeback: typings.steamDashClient.steamDashClientMod.EMsg.AMCreateChargeback with Double = js.native
  /* 4261 */ val AMCreateChargebackResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMCreateChargebackResponse with Double = js.native
  /* 4001 */ val AMCreateChat: typings.steamDashClient.steamDashClientMod.EMsg.AMCreateChat with Double = js.native
  /* 4002 */ val AMCreateChatResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMCreateChatResponse with Double = js.native
  /* 586 */ val AMCreateClan: typings.steamDashClient.steamDashClientMod.EMsg.AMCreateClan with Double = js.native
  /* 4027 */ val AMCreateClanAnnouncement: typings.steamDashClient.steamDashClientMod.EMsg.AMCreateClanAnnouncement with Double = js.native
  /* 4028 */ val AMCreateClanAnnouncementResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMCreateClanAnnouncementResponse with Double = js.native
  /* 4013 */ val AMCreateClanEvent: typings.steamDashClient.steamDashClientMod.EMsg.AMCreateClanEvent with Double = js.native
  /* 4014 */ val AMCreateClanEventResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMCreateClanEventResponse with Double = js.native
  /* 587 */ val AMCreateClanResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMCreateClanResponse with Double = js.native
  /* 4262 */ val AMCreateDispute: typings.steamDashClient.steamDashClientMod.EMsg.AMCreateDispute with Double = js.native
  /* 4263 */ val AMCreateDisputeResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMCreateDisputeResponse with Double = js.native
  /* 4258 */ val AMCreateRefund: typings.steamDashClient.steamDashClientMod.EMsg.AMCreateRefund with Double = js.native
  /* 4259 */ val AMCreateRefundResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMCreateRefundResponse with Double = js.native
  /* 4396 */ val AMDegicaPayment: typings.steamDashClient.steamDashClientMod.EMsg.AMDegicaPayment with Double = js.native
  /* 4397 */ val AMDegicaPaymentResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMDegicaPaymentResponse with Double = js.native
  /* 4035 */ val AMDeleteClanAnnouncement: typings.steamDashClient.steamDashClientMod.EMsg.AMDeleteClanAnnouncement with Double = js.native
  /* 4036 */ val AMDeleteClanAnnouncementResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMDeleteClanAnnouncementResponse with Double = js.native
  /* 4019 */ val AMDeleteClanEvent: typings.steamDashClient.steamDashClientMod.EMsg.AMDeleteClanEvent with Double = js.native
  /* 4020 */ val AMDeleteClanEventResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMDeleteClanEventResponse with Double = js.native
  /* 4204 */ val AMDeleteComment: typings.steamDashClient.steamDashClientMod.EMsg.AMDeleteComment with Double = js.native
  /* 4205 */ val AMDeleteCommentResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMDeleteCommentResponse with Double = js.native
  /* 4241 */ val AMDeleteStoredCard: typings.steamDashClient.steamDashClientMod.EMsg.AMDeleteStoredCard with Double = js.native
  /* 4246 */ val AMDeleteStoredPaymentInfo: typings.steamDashClient.steamDashClientMod.EMsg.AMDeleteStoredPaymentInfo with Double = js.native
  /* 4330 */ val AMDeleteStoredPaypalAgreement: typings.steamDashClient.steamDashClientMod.EMsg.AMDeleteStoredPaypalAgreement with Double = js.native
  /* 4084 */ val AMDumpClan: typings.steamDashClient.steamDashClientMod.EMsg.AMDumpClan with Double = js.native
  /* 4059 */ val AMDumpUser: typings.steamDashClient.steamDashClientMod.EMsg.AMDumpUser with Double = js.native
  /* 4398 */ val AMEClubPayment: typings.steamDashClient.steamDashClientMod.EMsg.AMEClubPayment with Double = js.native
  /* 4399 */ val AMEClubPaymentResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMEClubPaymentResponse with Double = js.native
  /* 4160 */ val AMEditBanReason: typings.steamDashClient.steamDashClientMod.EMsg.AMEditBanReason with Double = js.native
  /* 4382 */ val AMExpireCaptchaByGID: typings.steamDashClient.steamDashClientMod.EMsg.AMExpireCaptchaByGID with Double = js.native
  /* 509 */ val AMExtendLicense: typings.steamDashClient.steamDashClientMod.EMsg.AMExtendLicense with Double = js.native
  /* 4367 */ val AMFinalizePurchase: typings.steamDashClient.steamDashClientMod.EMsg.AMFinalizePurchase with Double = js.native
  /* 4368 */ val AMFinalizePurchaseResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMFinalizePurchaseResponse with Double = js.native
  /* 580 */ val AMFindAccounts: typings.steamDashClient.steamDashClientMod.EMsg.AMFindAccounts with Double = js.native
  /* 581 */ val AMFindAccountsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMFindAccountsResponse with Double = js.native
  /* 4143 */ val AMFindClanUser: typings.steamDashClient.steamDashClientMod.EMsg.AMFindClanUser with Double = js.native
  /* 4144 */ val AMFindClanUserResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMFindClanUserResponse with Double = js.native
  /* 4106 */ val AMFindGSByIP: typings.steamDashClient.steamDashClientMod.EMsg.AMFindGSByIP with Double = js.native
  /* 518 */ val AMFindHungTransactions: typings.steamDashClient.steamDashClientMod.EMsg.AMFindHungTransactions with Double = js.native
  /* 525 */ val AMFixPendingPurchase: typings.steamDashClient.steamDashClientMod.EMsg.AMFixPendingPurchase with Double = js.native
  /* 526 */ val AMFixPendingPurchaseResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMFixPendingPurchaseResponse with Double = js.native
  /* 535 */ val AMFixPendingRefund: typings.steamDashClient.steamDashClientMod.EMsg.AMFixPendingRefund with Double = js.native
  /* 4107 */ val AMFoundGSByIP: typings.steamDashClient.steamDashClientMod.EMsg.AMFoundGSByIP with Double = js.native
  /* 4100 */ val AMFriendsInCommon: typings.steamDashClient.steamDashClientMod.EMsg.AMFriendsInCommon with Double = js.native
  /* 4102 */ val AMFriendsInCommonCountResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMFriendsInCommonCountResponse with Double = js.native
  /* 4101 */ val AMFriendsInCommonResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMFriendsInCommonResponse with Double = js.native
  /* 4098 */ val AMFriendsList: typings.steamDashClient.steamDashClientMod.EMsg.AMFriendsList with Double = js.native
  /* 4099 */ val AMFriendsListResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMFriendsListResponse with Double = js.native
  /* 6406 */ val AMGMSGameServerRemove: typings.steamDashClient.steamDashClientMod.EMsg.AMGMSGameServerRemove with Double = js.native
  /* 6405 */ val AMGMSGameServerUpdate: typings.steamDashClient.steamDashClientMod.EMsg.AMGMSGameServerUpdate with Double = js.native
  /* 4213 */ val AMGSSearch: typings.steamDashClient.steamDashClientMod.EMsg.AMGSSearch with Double = js.native
  /* 4340 */ val AMGameServerAccountChangePassword: typings.steamDashClient.steamDashClientMod.EMsg.AMGameServerAccountChangePassword with Double = js.native
  /* 4341 */ val AMGameServerAccountDeleteAccount: typings.steamDashClient.steamDashClientMod.EMsg.AMGameServerAccountDeleteAccount with Double = js.native
  /* 4335 */ val AMGameServerPlayerCompatibilityCheck: typings.steamDashClient.steamDashClientMod.EMsg.AMGameServerPlayerCompatibilityCheck with Double = js.native
  /* 4336 */ val AMGameServerPlayerCompatibilityCheckResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGameServerPlayerCompatibilityCheckResponse with Double = js.native
  /* 4332 */ val AMGameServerRemove: typings.steamDashClient.steamDashClientMod.EMsg.AMGameServerRemove with Double = js.native
  /* 4331 */ val AMGameServerUpdate: typings.steamDashClient.steamDashClientMod.EMsg.AMGameServerUpdate with Double = js.native
  /* 4323 */ val AMGetAccountBanInfo: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountBanInfo with Double = js.native
  /* 4324 */ val AMGetAccountBanInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountBanInfoResponse with Double = js.native
  /* 4338 */ val AMGetAccountCommunityBanInfo: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountCommunityBanInfo with Double = js.native
  /* 4339 */ val AMGetAccountCommunityBanInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountCommunityBanInfoResponse with Double = js.native
  /* 4287 */ val AMGetAccountDetails: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountDetails with Double = js.native
  /* 4112 */ val AMGetAccountDetails2: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountDetails2 with Double = js.native
  /* 4288 */ val AMGetAccountDetailsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountDetailsResponse with Double = js.native
  /* 4113 */ val AMGetAccountDetailsResponse2: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountDetailsResponse2 with Double = js.native
  /* 4006 */ val AMGetAccountEmailAddress: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountEmailAddress with Double = js.native
  /* 4007 */ val AMGetAccountEmailAddressResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountEmailAddressResponse with Double = js.native
  /* 4294 */ val AMGetAccountFlagsForWGSpoofing: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountFlagsForWGSpoofing with Double = js.native
  /* 4295 */ val AMGetAccountFlagsForWGSpoofingResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountFlagsForWGSpoofingResponse with Double = js.native
  /* 594 */ val AMGetAccountFriendsCount: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountFriendsCount with Double = js.native
  /* 595 */ val AMGetAccountFriendsCountResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountFriendsCountResponse with Double = js.native
  /* 4069 */ val AMGetAccountLinks: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountLinks with Double = js.native
  /* 4070 */ val AMGetAccountLinksResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountLinksResponse with Double = js.native
  /* 4313 */ val AMGetAccountPSNInfo: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountPSNInfo with Double = js.native
  /* 4314 */ val AMGetAccountPSNInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountPSNInfoResponse with Double = js.native
  /* 4408 */ val AMGetAccountResetDetailsRequest: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountResetDetailsRequest with Double = js.native
  /* 4409 */ val AMGetAccountResetDetailsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountResetDetailsResponse with Double = js.native
  /* 4158 */ val AMGetAccountStatus: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountStatus with Double = js.native
  /* 4159 */ val AMGetAccountStatusResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetAccountStatusResponse with Double = js.native
  /* 4188 */ val AMGetBillingAddress: typings.steamDashClient.steamDashClientMod.EMsg.AMGetBillingAddress with Double = js.native
  /* 4189 */ val AMGetBillingAddressResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetBillingAddressResponse with Double = js.native
  /* 4134 */ val AMGetCaptchaDataByGID: typings.steamDashClient.steamDashClientMod.EMsg.AMGetCaptchaDataByGID with Double = js.native
  /* 4135 */ val AMGetCaptchaDataByGIDResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetCaptchaDataByGIDResponse with Double = js.native
  /* 4129 */ val AMGetCaptchaDataForIP: typings.steamDashClient.steamDashClientMod.EMsg.AMGetCaptchaDataForIP with Double = js.native
  /* 4130 */ val AMGetCaptchaDataForIPResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetCaptchaDataForIPResponse with Double = js.native
  /* 4239 */ val AMGetCardList: typings.steamDashClient.steamDashClientMod.EMsg.AMGetCardList with Double = js.native
  /* 4240 */ val AMGetCardListResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetCardListResponse with Double = js.native
  /* 4065 */ val AMGetChatBanList: typings.steamDashClient.steamDashClientMod.EMsg.AMGetChatBanList with Double = js.native
  /* 4066 */ val AMGetChatBanListResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetChatBanListResponse with Double = js.native
  /* 4033 */ val AMGetClanAnnouncements: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanAnnouncements with Double = js.native
  /* 4031 */ val AMGetClanAnnouncementsCount: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanAnnouncementsCount with Double = js.native
  /* 4032 */ val AMGetClanAnnouncementsCountResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanAnnouncementsCountResponse with Double = js.native
  /* 4034 */ val AMGetClanAnnouncementsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanAnnouncementsResponse with Double = js.native
  /* 588 */ val AMGetClanDetails: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanDetails with Double = js.native
  /* 4373 */ val AMGetClanDetailsForForumCreation: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanDetailsForForumCreation with Double = js.native
  /* 4374 */ val AMGetClanDetailsForForumCreationResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanDetailsForForumCreationResponse with Double = js.native
  /* 589 */ val AMGetClanDetailsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanDetailsResponse with Double = js.native
  /* 4017 */ val AMGetClanEvents: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanEvents with Double = js.native
  /* 4018 */ val AMGetClanEventsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanEventsResponse with Double = js.native
  /* 4039 */ val AMGetClanHistory: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanHistory with Double = js.native
  /* 4040 */ val AMGetClanHistoryResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanHistoryResponse with Double = js.native
  /* 4076 */ val AMGetClanMembers: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanMembers with Double = js.native
  /* 4077 */ val AMGetClanMembersResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanMembersResponse with Double = js.native
  /* 4088 */ val AMGetClanMembershipList: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanMembershipList with Double = js.native
  /* 4089 */ val AMGetClanMembershipListResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanMembershipListResponse with Double = js.native
  /* 4298 */ val AMGetClanOfficers: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanOfficers with Double = js.native
  /* 4299 */ val AMGetClanOfficersResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanOfficersResponse with Double = js.native
  /* 4054 */ val AMGetClanPOTW: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanPOTW with Double = js.native
  /* 4055 */ val AMGetClanPOTWResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanPOTWResponse with Double = js.native
  /* 4041 */ val AMGetClanPermissionBits: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanPermissionBits with Double = js.native
  /* 4042 */ val AMGetClanPermissionBitsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanPermissionBitsResponse with Double = js.native
  /* 4023 */ val AMGetClanPermissionSettings: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanPermissionSettings with Double = js.native
  /* 4024 */ val AMGetClanPermissionSettingsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanPermissionSettingsResponse with Double = js.native
  /* 4050 */ val AMGetClanRank: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanRank with Double = js.native
  /* 4051 */ val AMGetClanRankResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetClanRankResponse with Double = js.native
  /* 4200 */ val AMGetComments: typings.steamDashClient.steamDashClientMod.EMsg.AMGetComments with Double = js.native
  /* 4201 */ val AMGetCommentsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetCommentsResponse with Double = js.native
  /* 4116 */ val AMGetCommunityPrivacyState: typings.steamDashClient.steamDashClientMod.EMsg.AMGetCommunityPrivacyState with Double = js.native
  /* 4117 */ val AMGetCommunityPrivacyStateResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetCommunityPrivacyStateResponse with Double = js.native
  /* 514 */ val AMGetFinalPrice: typings.steamDashClient.steamDashClientMod.EMsg.AMGetFinalPrice with Double = js.native
  /* 515 */ val AMGetFinalPriceResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetFinalPriceResponse with Double = js.native
  /* 4124 */ val AMGetFriendRelationship: typings.steamDashClient.steamDashClientMod.EMsg.AMGetFriendRelationship with Double = js.native
  /* 4125 */ val AMGetFriendRelationshipResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetFriendRelationshipResponse with Double = js.native
  /* 4165 */ val AMGetFriendsLobbies: typings.steamDashClient.steamDashClientMod.EMsg.AMGetFriendsLobbies with Double = js.native
  /* 4166 */ val AMGetFriendsLobbiesResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetFriendsLobbiesResponse with Double = js.native
  /* 4296 */ val AMGetFriendsWishlistInfo: typings.steamDashClient.steamDashClientMod.EMsg.AMGetFriendsWishlistInfo with Double = js.native
  /* 4297 */ val AMGetFriendsWishlistInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetFriendsWishlistInfoResponse with Double = js.native
  /* 4271 */ val AMGetGSPlayerList: typings.steamDashClient.steamDashClientMod.EMsg.AMGetGSPlayerList with Double = js.native
  /* 4272 */ val AMGetGSPlayerListResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetGSPlayerListResponse with Double = js.native
  /* 4276 */ val AMGetGameMembers: typings.steamDashClient.steamDashClientMod.EMsg.AMGetGameMembers with Double = js.native
  /* 4277 */ val AMGetGameMembersResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetGameMembersResponse with Double = js.native
  /* 4094 */ val AMGetGiftTargetListRelay: typings.steamDashClient.steamDashClientMod.EMsg.AMGetGiftTargetListRelay with Double = js.native
  /* 4120 */ val AMGetIgnored: typings.steamDashClient.steamDashClientMod.EMsg.AMGetIgnored with Double = js.native
  /* 4121 */ val AMGetIgnoredResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetIgnoredResponse with Double = js.native
  /* 516 */ val AMGetLegacyGameKey: typings.steamDashClient.steamDashClientMod.EMsg.AMGetLegacyGameKey with Double = js.native
  /* 517 */ val AMGetLegacyGameKeyResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetLegacyGameKeyResponse with Double = js.native
  /* 539 */ val AMGetLicenses: typings.steamDashClient.steamDashClientMod.EMsg.AMGetLicenses with Double = js.native
  /* 540 */ val AMGetLicensesResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetLicensesResponse with Double = js.native
  /* 4136 */ val AMGetLobbyList: typings.steamDashClient.steamDashClientMod.EMsg.AMGetLobbyList with Double = js.native
  /* 4137 */ val AMGetLobbyListResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetLobbyListResponse with Double = js.native
  /* 4138 */ val AMGetLobbyMetadata: typings.steamDashClient.steamDashClientMod.EMsg.AMGetLobbyMetadata with Double = js.native
  /* 4139 */ val AMGetLobbyMetadataResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetLobbyMetadataResponse with Double = js.native
  /* 4301 */ val AMGetNameHistory: typings.steamDashClient.steamDashClientMod.EMsg.AMGetNameHistory with Double = js.native
  /* 4302 */ val AMGetNameHistoryResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetNameHistoryResponse with Double = js.native
  /* 4333 */ val AMGetPaypalAgreements: typings.steamDashClient.steamDashClientMod.EMsg.AMGetPaypalAgreements with Double = js.native
  /* 4334 */ val AMGetPaypalAgreementsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetPaypalAgreementsResponse with Double = js.native
  /* 4375 */ val AMGetPendingNotificationCount: typings.steamDashClient.steamDashClientMod.EMsg.AMGetPendingNotificationCount with Double = js.native
  /* 4376 */ val AMGetPendingNotificationCountResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetPendingNotificationCountResponse with Double = js.native
  /* 4365 */ val AMGetPlayerBanDetails: typings.steamDashClient.steamDashClientMod.EMsg.AMGetPlayerBanDetails with Double = js.native
  /* 4366 */ val AMGetPlayerBanDetailsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetPlayerBanDetailsResponse with Double = js.native
  /* 4289 */ val AMGetPlayerLinkDetails: typings.steamDashClient.steamDashClientMod.EMsg.AMGetPlayerLinkDetails with Double = js.native
  /* 4290 */ val AMGetPlayerLinkDetailsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetPlayerLinkDetailsResponse with Double = js.native
  /* 4184 */ val AMGetPreviousCBAccount: typings.steamDashClient.steamDashClientMod.EMsg.AMGetPreviousCBAccount with Double = js.native
  /* 4185 */ val AMGetPreviousCBAccountResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetPreviousCBAccountResponse with Double = js.native
  /* 4206 */ val AMGetPurchaseStatus: typings.steamDashClient.steamDashClientMod.EMsg.AMGetPurchaseStatus with Double = js.native
  /* 4037 */ val AMGetSingleClanAnnouncement: typings.steamDashClient.steamDashClientMod.EMsg.AMGetSingleClanAnnouncement with Double = js.native
  /* 4038 */ val AMGetSingleClanAnnouncementResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetSingleClanAnnouncementResponse with Double = js.native
  /* 4048 */ val AMGetSingleClanEvent: typings.steamDashClient.steamDashClientMod.EMsg.AMGetSingleClanEvent with Double = js.native
  /* 4049 */ val AMGetSingleClanEventResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetSingleClanEventResponse with Double = js.native
  /* 4278 */ val AMGetSteamIDForMicroTxn: typings.steamDashClient.steamDashClientMod.EMsg.AMGetSteamIDForMicroTxn with Double = js.native
  /* 4279 */ val AMGetSteamIDForMicroTxnResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetSteamIDForMicroTxnResponse with Double = js.native
  /* 4247 */ val AMGetStoredPaymentSummary: typings.steamDashClient.steamDashClientMod.EMsg.AMGetStoredPaymentSummary with Double = js.native
  /* 4248 */ val AMGetStoredPaymentSummaryResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetStoredPaymentSummaryResponse with Double = js.native
  /* 4119 */ val AMGetUserAchievementStatus: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserAchievementStatus with Double = js.native
  /* 4175 */ val AMGetUserClansNews: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserClansNews with Double = js.native
  /* 4174 */ val AMGetUserClansNewsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserClansNewsResponse with Double = js.native
  /* 4269 */ val AMGetUserCurrentGameInfo: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserCurrentGameInfo with Double = js.native
  /* 4270 */ val AMGetUserCurrentGameInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserCurrentGameInfoResponse with Double = js.native
  /* 4172 */ val AMGetUserFriendNewsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserFriendNewsResponse with Double = js.native
  /* 4225 */ val AMGetUserFriendsMinutesPlayed: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserFriendsMinutesPlayed with Double = js.native
  /* 4226 */ val AMGetUserFriendsMinutesPlayedResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserFriendsMinutesPlayedResponse with Double = js.native
  /* 4073 */ val AMGetUserGameStats: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserGameStats with Double = js.native
  /* 4074 */ val AMGetUserGameStatsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserGameStatsResponse with Double = js.native
  /* 4237 */ val AMGetUserGameplayInfo: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserGameplayInfo with Double = js.native
  /* 4238 */ val AMGetUserGameplayInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserGameplayInfoResponse with Double = js.native
  /* 4316 */ val AMGetUserGifts: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserGifts with Double = js.native
  /* 4317 */ val AMGetUserGiftsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserGiftsResponse with Double = js.native
  /* 921 */ val AMGetUserGroupStatus: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserGroupStatus with Double = js.native
  /* 922 */ val AMGetUserGroupStatusResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserGroupStatusResponse with Double = js.native
  /* 4154 */ val AMGetUserHistory: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserHistory with Double = js.native
  /* 4146 */ val AMGetUserHistoryResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserHistoryResponse with Double = js.native
  /* 4190 */ val AMGetUserLicenseHistory: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserLicenseHistory with Double = js.native
  /* 4191 */ val AMGetUserLicenseHistoryResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserLicenseHistoryResponse with Double = js.native
  /* 4282 */ val AMGetUserLicenseList: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserLicenseList with Double = js.native
  /* 4283 */ val AMGetUserLicenseListResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserLicenseListResponse with Double = js.native
  /* 4227 */ val AMGetUserMinutesPlayed: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserMinutesPlayed with Double = js.native
  /* 4228 */ val AMGetUserMinutesPlayedResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserMinutesPlayedResponse with Double = js.native
  /* 4150 */ val AMGetUserNews: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserNews with Double = js.native
  /* 4151 */ val AMGetUserNewsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserNewsResponse with Double = js.native
  /* 4147 */ val AMGetUserNewsSubscriptions: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserNewsSubscriptions with Double = js.native
  /* 4148 */ val AMGetUserNewsSubscriptionsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserNewsSubscriptionsResponse with Double = js.native
  /* 4211 */ val AMGetUserStats: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserStats with Double = js.native
  /* 4292 */ val AMGetUserVacBanList: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserVacBanList with Double = js.native
  /* 4293 */ val AMGetUserVacBanListResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetUserVacBanListResponse with Double = js.native
  /* 4249 */ val AMGetWalletConversionRate: typings.steamDashClient.steamDashClientMod.EMsg.AMGetWalletConversionRate with Double = js.native
  /* 4250 */ val AMGetWalletConversionRateResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetWalletConversionRateResponse with Double = js.native
  /* 4244 */ val AMGetWalletDetails: typings.steamDashClient.steamDashClientMod.EMsg.AMGetWalletDetails with Double = js.native
  /* 4245 */ val AMGetWalletDetailsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGetWalletDetailsResponse with Double = js.native
  /* 4108 */ val AMGiftRevoked: typings.steamDashClient.steamDashClientMod.EMsg.AMGiftRevoked with Double = js.native
  /* 4356 */ val AMGrantCoupon: typings.steamDashClient.steamDashClientMod.EMsg.AMGrantCoupon with Double = js.native
  /* 4357 */ val AMGrantCouponResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMGrantCouponResponse with Double = js.native
  /* 566 */ val AMGrantGuestPasses: typings.steamDashClient.steamDashClientMod.EMsg.AMGrantGuestPasses with Double = js.native
  /* 4361 */ val AMGrantGuestPasses2: typings.steamDashClient.steamDashClientMod.EMsg.AMGrantGuestPasses2 with Double = js.native
  /* 4362 */ val AMGrantGuestPasses2Response: typings.steamDashClient.steamDashClientMod.EMsg.AMGrantGuestPasses2Response with Double = js.native
  /* 4328 */ val AMHandlePendingTransaction: typings.steamDashClient.steamDashClientMod.EMsg.AMHandlePendingTransaction with Double = js.native
  /* 4360 */ val AMHandlePendingTransactionResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMHandlePendingTransactionResponse with Double = js.native
  /* 512 */ val AMInitPurchase: typings.steamDashClient.steamDashClientMod.EMsg.AMInitPurchase with Double = js.native
  /* 560 */ val AMInitPurchaseResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMInitPurchaseResponse with Double = js.native
  /* 564 */ val AMInviteUserToClan: typings.steamDashClient.steamDashClientMod.EMsg.AMInviteUserToClan with Double = js.native
  /* 4308 */ val AMIsAccountInCaptchaGracePeriod: typings.steamDashClient.steamDashClientMod.EMsg.AMIsAccountInCaptchaGracePeriod with Double = js.native
  /* 4309 */ val AMIsAccountInCaptchaGracePeriodResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMIsAccountInCaptchaGracePeriodResponse with Double = js.native
  /* 4358 */ val AMIsPackageRestrictedInUserCountry: typings.steamDashClient.steamDashClientMod.EMsg.AMIsPackageRestrictedInUserCountry with Double = js.native
  /* 4359 */ val AMIsPackageRestrictedInUserCountryResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMIsPackageRestrictedInUserCountryResponse with Double = js.native
  /* 527 */ val AMIsUserBanned: typings.steamDashClient.steamDashClientMod.EMsg.AMIsUserBanned with Double = js.native
  /* 4092 */ val AMIsValidAccountID: typings.steamDashClient.steamDashClientMod.EMsg.AMIsValidAccountID with Double = js.native
  /* 4078 */ val AMJoinPublicClan: typings.steamDashClient.steamDashClientMod.EMsg.AMJoinPublicClan with Double = js.native
  /* 4060 */ val AMKickUserFromClan: typings.steamDashClient.steamDashClientMod.EMsg.AMKickUserFromClan with Double = js.native
  /* 4010 */ val AMLeaveClan: typings.steamDashClient.steamDashClientMod.EMsg.AMLeaveClan with Double = js.native
  /* 529 */ val AMLoadActivationCodes: typings.steamDashClient.steamDashClientMod.EMsg.AMLoadActivationCodes with Double = js.native
  /* 530 */ val AMLoadActivationCodesResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMLoadActivationCodesResponse with Double = js.native
  /* 524 */ val AMLoadOEMTickets: typings.steamDashClient.steamDashClientMod.EMsg.AMLoadOEMTickets with Double = js.native
  /* 562 */ val AMLockProfile: typings.steamDashClient.steamDashClientMod.EMsg.AMLockProfile with Double = js.native
  /* 532 */ val AMLookupKey: typings.steamDashClient.steamDashClientMod.EMsg.AMLookupKey with Double = js.native
  /* 531 */ val AMLookupKeyResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMLookupKeyResponse with Double = js.native
  /* 4391 */ val AMMOLPayment: typings.steamDashClient.steamDashClientMod.EMsg.AMMOLPayment with Double = js.native
  /* 4392 */ val AMMOLPaymentResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMMOLPaymentResponse with Double = js.native
  /* 4257 */ val AMMarketingTreatmentUpdate: typings.steamDashClient.steamDashClientMod.EMsg.AMMarketingTreatmentUpdate with Double = js.native
  /* 4378 */ val AMMoPayPayment: typings.steamDashClient.steamDashClientMod.EMsg.AMMoPayPayment with Double = js.native
  /* 4379 */ val AMMoPayPaymentResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMMoPayPaymentResponse with Double = js.native
  /* 4300 */ val AMNameChange: typings.steamDashClient.steamDashClientMod.EMsg.AMNameChange with Double = js.native
  /* 523 */ val AMNewChallenge: typings.steamDashClient.steamDashClientMod.EMsg.AMNewChallenge with Double = js.native
  /* 4079 */ val AMNotifyChatOfClanChange: typings.steamDashClient.steamDashClientMod.EMsg.AMNotifyChatOfClanChange with Double = js.native
  /* 6508 */ val AMNotifySessionDeviceAuthorized: typings.steamDashClient.steamDashClientMod.EMsg.AMNotifySessionDeviceAuthorized with Double = js.native
  /* 596 */ val AMP2PIntroducerMessage: typings.steamDashClient.steamDashClientMod.EMsg.AMP2PIntroducerMessage with Double = js.native
  /* 4377 */ val AMPasswordHashUpgrade: typings.steamDashClient.steamDashClientMod.EMsg.AMPasswordHashUpgrade with Double = js.native
  /* 4400 */ val AMPayPalPaymentsHubPayment: typings.steamDashClient.steamDashClientMod.EMsg.AMPayPalPaymentsHubPayment with Double = js.native
  /* 4401 */ val AMPayPalPaymentsHubPaymentResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMPayPalPaymentsHubPaymentResponse with Double = js.native
  /* 4387 */ val AMPayelpPayment: typings.steamDashClient.steamDashClientMod.EMsg.AMPayelpPayment with Double = js.native
  /* 4388 */ val AMPayelpPaymentResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMPayelpPaymentResponse with Double = js.native
  /* 4372 */ val AMPersonaChangeResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMPersonaChangeResponse with Double = js.native
  /* 4389 */ val AMPlayerGetClanBasicDetails: typings.steamDashClient.steamDashClientMod.EMsg.AMPlayerGetClanBasicDetails with Double = js.native
  /* 4390 */ val AMPlayerGetClanBasicDetailsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMPlayerGetClanBasicDetailsResponse with Double = js.native
  /* 4322 */ val AMPlayerHostedOnGameServer: typings.steamDashClient.steamDashClientMod.EMsg.AMPlayerHostedOnGameServer with Double = js.native
  /* 4266 */ val AMPlayerNicknameList: typings.steamDashClient.steamDashClientMod.EMsg.AMPlayerNicknameList with Double = js.native
  /* 4267 */ val AMPlayerNicknameListResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMPlayerNicknameListResponse with Double = js.native
  /* 557 */ val AMPrimePersonaStateCache: typings.steamDashClient.steamDashClientMod.EMsg.AMPrimePersonaStateCache with Double = js.native
  /* 4162 */ val AMProbeClanMembershipList: typings.steamDashClient.steamDashClientMod.EMsg.AMProbeClanMembershipList with Double = js.native
  /* 4163 */ val AMProbeClanMembershipListResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMProbeClanMembershipListResponse with Double = js.native
  /* 575 */ val AMPublishChatMemberInfo: typings.steamDashClient.steamDashClientMod.EMsg.AMPublishChatMemberInfo with Double = js.native
  /* 4004 */ val AMPublishChatMetadata: typings.steamDashClient.steamDashClientMod.EMsg.AMPublishChatMetadata with Double = js.native
  /* 4025 */ val AMPublishChatRoomInfo: typings.steamDashClient.steamDashClientMod.EMsg.AMPublishChatRoomInfo with Double = js.native
  /* 513 */ val AMPurchaseResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMPurchaseResponse with Double = js.native
  /* 4325 */ val AMRecordBanEnforcement: typings.steamDashClient.steamDashClientMod.EMsg.AMRecordBanEnforcement with Double = js.native
  /* 563 */ val AMRefreshGuestPasses: typings.steamDashClient.steamDashClientMod.EMsg.AMRefreshGuestPasses with Double = js.native
  /* 2210 */ val AMRefreshSessions: typings.steamDashClient.steamDashClientMod.EMsg.AMRefreshSessions with Double = js.native
  /* 528 */ val AMRegisterKey: typings.steamDashClient.steamDashClientMod.EMsg.AMRegisterKey with Double = js.native
  /* 4253 */ val AMRelayGetFriendsWhoPlayGame: typings.steamDashClient.steamDashClientMod.EMsg.AMRelayGetFriendsWhoPlayGame with Double = js.native
  /* 4254 */ val AMRelayGetFriendsWhoPlayGameResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMRelayGetFriendsWhoPlayGameResponse with Double = js.native
  /* 555 */ val AMRelayPublishStatus: typings.steamDashClient.steamDashClientMod.EMsg.AMRelayPublishStatus with Double = js.native
  /* 2201 */ val AMRelayToGC: typings.steamDashClient.steamDashClientMod.EMsg.AMRelayToGC with Double = js.native
  /* 568 */ val AMReloadAccount: typings.steamDashClient.steamDashClientMod.EMsg.AMReloadAccount with Double = js.native
  /* 4284 */ val AMReloadGameGroupPolicy: typings.steamDashClient.steamDashClientMod.EMsg.AMReloadGameGroupPolicy with Double = js.native
  /* 4083 */ val AMRemoveFriend: typings.steamDashClient.steamDashClientMod.EMsg.AMRemoveFriend with Double = js.native
  /* 4281 */ val AMRemovePublisherUser: typings.steamDashClient.steamDashClientMod.EMsg.AMRemovePublisherUser with Double = js.native
  /* 4342 */ val AMRenewAgreement: typings.steamDashClient.steamDashClientMod.EMsg.AMRenewAgreement with Double = js.native
  /* 4337 */ val AMRenewLicense: typings.steamDashClient.steamDashClientMod.EMsg.AMRenewLicense with Double = js.native
  /* 582 */ val AMRequestAccountData: typings.steamDashClient.steamDashClientMod.EMsg.AMRequestAccountData with Double = js.native
  /* 583 */ val AMRequestAccountDataResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMRequestAccountDataResponse with Double = js.native
  /* 4058 */ val AMRequestChatMetadata: typings.steamDashClient.steamDashClientMod.EMsg.AMRequestChatMetadata with Double = js.native
  /* 4008 */ val AMRequestClanData: typings.steamDashClient.steamDashClientMod.EMsg.AMRequestClanData with Double = js.native
  /* 4329 */ val AMRequestClanDetails: typings.steamDashClient.steamDashClientMod.EMsg.AMRequestClanDetails with Double = js.native
  /* 4008 */ val AMRequestFriendData: typings.steamDashClient.steamDashClientMod.EMsg.AMRequestFriendData with Double = js.native
  /* 556 */ val AMResetCommunityContent: typings.steamDashClient.steamDashClientMod.EMsg.AMResetCommunityContent with Double = js.native
  /* 4197 */ val AMResetUserVerificationGSByIP: typings.steamDashClient.steamDashClientMod.EMsg.AMResetUserVerificationGSByIP with Double = js.native
  /* 4385 */ val AMResolveNegativeWalletCredits: typings.steamDashClient.steamDashClientMod.EMsg.AMResolveNegativeWalletCredits with Double = js.native
  /* 4386 */ val AMResolveNegativeWalletCreditsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMResolveNegativeWalletCreditsResponse with Double = js.native
  /* 4080 */ val AMResubmitPurchase: typings.steamDashClient.steamDashClientMod.EMsg.AMResubmitPurchase with Double = js.native
  /* 536 */ val AMReverseChargeback: typings.steamDashClient.steamDashClientMod.EMsg.AMReverseChargeback with Double = js.native
  /* 537 */ val AMReverseChargebackResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMReverseChargebackResponse with Double = js.native
  /* 4242 */ val AMRevokeLegacyGameKeys: typings.steamDashClient.steamDashClientMod.EMsg.AMRevokeLegacyGameKeys with Double = js.native
  /* 561 */ val AMRevokePurchaseResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMRevokePurchaseResponse with Double = js.native
  /* 4326 */ val AMRollbackGiftTransfer: typings.steamDashClient.steamDashClientMod.EMsg.AMRollbackGiftTransfer with Double = js.native
  /* 4327 */ val AMRollbackGiftTransferResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMRollbackGiftTransferResponse with Double = js.native
  /* 4219 */ val AMRouteFriendMsg: typings.steamDashClient.steamDashClientMod.EMsg.AMRouteFriendMsg with Double = js.native
  /* 4009 */ val AMRouteToClients: typings.steamDashClient.steamDashClientMod.EMsg.AMRouteToClients with Double = js.native
  /* 4412 */ val AMSendAccountInfoUpdate: typings.steamDashClient.steamDashClientMod.EMsg.AMSendAccountInfoUpdate with Double = js.native
  /* 4343 */ val AMSendEmail: typings.steamDashClient.steamDashClientMod.EMsg.AMSendEmail with Double = js.native
  /* 4152 */ val AMSendQueuedEmails: typings.steamDashClient.steamDashClientMod.EMsg.AMSendQueuedEmails with Double = js.native
  /* 508 */ val AMSendSystemIMToUser: typings.steamDashClient.steamDashClientMod.EMsg.AMSendSystemIMToUser with Double = js.native
  /* 4126 */ val AMServiceModulesCache: typings.steamDashClient.steamDashClientMod.EMsg.AMServiceModulesCache with Double = js.native
  /* 4127 */ val AMServiceModulesCall: typings.steamDashClient.steamDashClientMod.EMsg.AMServiceModulesCall with Double = js.native
  /* 4128 */ val AMServiceModulesCallResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMServiceModulesCallResponse with Double = js.native
  /* 4045 */ val AMSessionInfoRequest: typings.steamDashClient.steamDashClientMod.EMsg.AMSessionInfoRequest with Double = js.native
  /* 4046 */ val AMSessionInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMSessionInfoResponse with Double = js.native
  /* 4363 */ val AMSessionQuery: typings.steamDashClient.steamDashClientMod.EMsg.AMSessionQuery with Double = js.native
  /* 4364 */ val AMSessionQueryResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMSessionQueryResponse with Double = js.native
  /* 4064 */ val AMSetAccountDetails: typings.steamDashClient.steamDashClientMod.EMsg.AMSetAccountDetails with Double = js.native
  /* 584 */ val AMSetAccountFlags: typings.steamDashClient.steamDashClientMod.EMsg.AMSetAccountFlags with Double = js.native
  /* 4071 */ val AMSetAccountLinks: typings.steamDashClient.steamDashClientMod.EMsg.AMSetAccountLinks with Double = js.native
  /* 4072 */ val AMSetAccountLinksResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMSetAccountLinksResponse with Double = js.native
  /* 519 */ val AMSetAccountTrustedRequest: typings.steamDashClient.steamDashClientMod.EMsg.AMSetAccountTrustedRequest with Double = js.native
  /* 591 */ val AMSetAvatar: typings.steamDashClient.steamDashClientMod.EMsg.AMSetAvatar with Double = js.native
  /* 4068 */ val AMSetClanDetails: typings.steamDashClient.steamDashClientMod.EMsg.AMSetClanDetails with Double = js.native
  /* 4354 */ val AMSetClanName: typings.steamDashClient.steamDashClientMod.EMsg.AMSetClanName with Double = js.native
  /* 4355 */ val AMSetClanNameResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMSetClanNameResponse with Double = js.native
  /* 4056 */ val AMSetClanPOTW: typings.steamDashClient.steamDashClientMod.EMsg.AMSetClanPOTW with Double = js.native
  /* 4057 */ val AMSetClanPOTWResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMSetClanPOTWResponse with Double = js.native
  /* 4043 */ val AMSetClanPermissionBits: typings.steamDashClient.steamDashClientMod.EMsg.AMSetClanPermissionBits with Double = js.native
  /* 4044 */ val AMSetClanPermissionBitsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMSetClanPermissionBitsResponse with Double = js.native
  /* 4021 */ val AMSetClanPermissionSettings: typings.steamDashClient.steamDashClientMod.EMsg.AMSetClanPermissionSettings with Double = js.native
  /* 4022 */ val AMSetClanPermissionSettingsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMSetClanPermissionSettingsResponse with Double = js.native
  /* 4052 */ val AMSetClanRank: typings.steamDashClient.steamDashClientMod.EMsg.AMSetClanRank with Double = js.native
  /* 4053 */ val AMSetClanRankResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMSetClanRankResponse with Double = js.native
  /* 4114 */ val AMSetCommunityProfileSettings: typings.steamDashClient.steamDashClientMod.EMsg.AMSetCommunityProfileSettings with Double = js.native
  /* 4115 */ val AMSetCommunityProfileSettingsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMSetCommunityProfileSettingsResponse with Double = js.native
  /* 4063 */ val AMSetCommunityState: typings.steamDashClient.steamDashClientMod.EMsg.AMSetCommunityState with Double = js.native
  /* 4268 */ val AMSetDRMTestConfig: typings.steamDashClient.steamDashClientMod.EMsg.AMSetDRMTestConfig with Double = js.native
  /* 4123 */ val AMSetFriendRelationshipNone: typings.steamDashClient.steamDashClientMod.EMsg.AMSetFriendRelationshipNone with Double = js.native
  /* 4096 */ val AMSetIgnored: typings.steamDashClient.steamDashClientMod.EMsg.AMSetIgnored with Double = js.native
  /* 4122 */ val AMSetIgnoredResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMSetIgnoredResponse with Double = js.native
  /* 4153 */ val AMSetLicenseFlags: typings.steamDashClient.steamDashClientMod.EMsg.AMSetLicenseFlags with Double = js.native
  /* 590 */ val AMSetPersonaName: typings.steamDashClient.steamDashClientMod.EMsg.AMSetPersonaName with Double = js.native
  /* 4255 */ val AMSetPreApproval: typings.steamDashClient.steamDashClientMod.EMsg.AMSetPreApproval with Double = js.native
  /* 4256 */ val AMSetPreApprovalResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMSetPreApprovalResponse with Double = js.native
  /* 4005 */ val AMSetProfileURL: typings.steamDashClient.steamDashClientMod.EMsg.AMSetProfileURL with Double = js.native
  /* 4350 */ val AMSetUserGiftUnowned: typings.steamDashClient.steamDashClientMod.EMsg.AMSetUserGiftUnowned with Double = js.native
  /* 4351 */ val AMSetUserGiftUnownedResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMSetUserGiftUnownedResponse with Double = js.native
  /* 4149 */ val AMSetUserNewsSubscriptions: typings.steamDashClient.steamDashClientMod.EMsg.AMSetUserNewsSubscriptions with Double = js.native
  /* 4404 */ val AMSmart2PayPayment: typings.steamDashClient.steamDashClientMod.EMsg.AMSmart2PayPayment with Double = js.native
  /* 4405 */ val AMSmart2PayPaymentResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMSmart2PayPaymentResponse with Double = js.native
  /* 4181 */ val AMStoreCancelPurchase: typings.steamDashClient.steamDashClientMod.EMsg.AMStoreCancelPurchase with Double = js.native
  /* 4180 */ val AMStoreCompletePurchase: typings.steamDashClient.steamDashClientMod.EMsg.AMStoreCompletePurchase with Double = js.native
  /* 4178 */ val AMStoreGetFinalPrice: typings.steamDashClient.steamDashClientMod.EMsg.AMStoreGetFinalPrice with Double = js.native
  /* 4179 */ val AMStoreGetFinalPriceResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMStoreGetFinalPriceResponse with Double = js.native
  /* 4176 */ val AMStoreInitPurchase: typings.steamDashClient.steamDashClientMod.EMsg.AMStoreInitPurchase with Double = js.native
  /* 4177 */ val AMStoreInitPurchaseResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMStoreInitPurchaseResponse with Double = js.native
  /* 4182 */ val AMStorePurchaseResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMStorePurchaseResponse with Double = js.native
  /* 4236 */ val AMStoreUserStats: typings.steamDashClient.steamDashClientMod.EMsg.AMStoreUserStats with Double = js.native
  /* 4312 */ val AMStoreUserStatsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMStoreUserStatsResponse with Double = js.native
  /* 4291 */ val AMSubscribeToPersonaFeed: typings.steamDashClient.steamDashClientMod.EMsg.AMSubscribeToPersonaFeed with Double = js.native
  /* 4195 */ val AMSupportChangeEmail: typings.steamDashClient.steamDashClientMod.EMsg.AMSupportChangeEmail with Double = js.native
  /* 4194 */ val AMSupportChangePassword: typings.steamDashClient.steamDashClientMod.EMsg.AMSupportChangePassword with Double = js.native
  /* 4196 */ val AMSupportChangeSecretQA: typings.steamDashClient.steamDashClientMod.EMsg.AMSupportChangeSecretQA with Double = js.native
  /* 4199 */ val AMSupportEnableOrDisable: typings.steamDashClient.steamDashClientMod.EMsg.AMSupportEnableOrDisable with Double = js.native
  /* 4209 */ val AMSupportIsAccountEnabled: typings.steamDashClient.steamDashClientMod.EMsg.AMSupportIsAccountEnabled with Double = js.native
  /* 4210 */ val AMSupportIsAccountEnabledResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMSupportIsAccountEnabledResponse with Double = js.native
  /* 4212 */ val AMSupportKickSession: typings.steamDashClient.steamDashClientMod.EMsg.AMSupportKickSession with Double = js.native
  /* 4307 */ val AMSupportRemoveAccountSecurity: typings.steamDashClient.steamDashClientMod.EMsg.AMSupportRemoveAccountSecurity with Double = js.native
  /* 4348 */ val AMSwapKioskDeposit: typings.steamDashClient.steamDashClientMod.EMsg.AMSwapKioskDeposit with Double = js.native
  /* 4349 */ val AMSwapKioskDepositResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMSwapKioskDepositResponse with Double = js.native
  /* 4220 */ val AMTicketAuthRequestOrResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMTicketAuthRequestOrResponse with Double = js.native
  /* 5812 */ val AMToMDSGetDepotDecryptionKey: typings.steamDashClient.steamDashClientMod.EMsg.AMToMDSGetDepotDecryptionKey with Double = js.native
  /* 4133 */ val AMTrackFailedAuthByIP: typings.steamDashClient.steamDashClientMod.EMsg.AMTrackFailedAuthByIP with Double = js.native
  /* 4320 */ val AMTransferLockedGifts: typings.steamDashClient.steamDashClientMod.EMsg.AMTransferLockedGifts with Double = js.native
  /* 4321 */ val AMTransferLockedGiftsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMTransferLockedGiftsResponse with Double = js.native
  /* 4402 */ val AMTwoFactorRecoverAuthenticatorRequest: typings.steamDashClient.steamDashClientMod.EMsg.AMTwoFactorRecoverAuthenticatorRequest with Double = js.native
  /* 4403 */ val AMTwoFactorRecoverAuthenticatorResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMTwoFactorRecoverAuthenticatorResponse with Double = js.native
  /* 4067 */ val AMUnBanFromChat: typings.steamDashClient.steamDashClientMod.EMsg.AMUnBanFromChat with Double = js.native
  /* 4186 */ val AMUpdateBillingAddress: typings.steamDashClient.steamDashClientMod.EMsg.AMUpdateBillingAddress with Double = js.native
  /* 4187 */ val AMUpdateBillingAddressResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMUpdateBillingAddressResponse with Double = js.native
  /* 4003 */ val AMUpdateChatMetadata: typings.steamDashClient.steamDashClientMod.EMsg.AMUpdateChatMetadata with Double = js.native
  /* 4029 */ val AMUpdateClanAnnouncement: typings.steamDashClient.steamDashClientMod.EMsg.AMUpdateClanAnnouncement with Double = js.native
  /* 4030 */ val AMUpdateClanAnnouncementResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMUpdateClanAnnouncementResponse with Double = js.native
  /* 4015 */ val AMUpdateClanEvent: typings.steamDashClient.steamDashClientMod.EMsg.AMUpdateClanEvent with Double = js.native
  /* 4016 */ val AMUpdateClanEventResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMUpdateClanEventResponse with Double = js.native
  /* 4198 */ val AMUpdateGSPlayStats: typings.steamDashClient.steamDashClientMod.EMsg.AMUpdateGSPlayStats with Double = js.native
  /* 4275 */ val AMUpdatePersonaStateCache: typings.steamDashClient.steamDashClientMod.EMsg.AMUpdatePersonaStateCache with Double = js.native
  /* 4305 */ val AMUpdateProviderStatus: typings.steamDashClient.steamDashClientMod.EMsg.AMUpdateProviderStatus with Double = js.native
  /* 504 */ val AMUpdateUserBanRequest: typings.steamDashClient.steamDashClientMod.EMsg.AMUpdateUserBanRequest with Double = js.native
  /* 4110 */ val AMUserClanList: typings.steamDashClient.steamDashClientMod.EMsg.AMUserClanList with Double = js.native
  /* 4111 */ val AMUserClanListResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMUserClanListResponse with Double = js.native
  /* 4286 */ val AMVACStatusUpdate: typings.steamDashClient.steamDashClientMod.EMsg.AMVACStatusUpdate with Double = js.native
  /* 4131 */ val AMValidateCaptchaDataForIP: typings.steamDashClient.steamDashClientMod.EMsg.AMValidateCaptchaDataForIP with Double = js.native
  /* 4132 */ val AMValidateCaptchaDataForIPResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMValidateCaptchaDataForIPResponse with Double = js.native
  /* 4231 */ val AMValidateEmailLink: typings.steamDashClient.steamDashClientMod.EMsg.AMValidateEmailLink with Double = js.native
  /* 4232 */ val AMValidateEmailLinkResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMValidateEmailLinkResponse with Double = js.native
  /* 4406 */ val AMValidatePasswordResetCodeAndSendSmsRequest: typings.steamDashClient.steamDashClientMod.EMsg.AMValidatePasswordResetCodeAndSendSmsRequest with Double = js.native
  /* 4407 */ val AMValidatePasswordResetCodeAndSendSmsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMValidatePasswordResetCodeAndSendSmsResponse with Double = js.native
  /* 4047 */ val AMValidateWGToken: typings.steamDashClient.steamDashClientMod.EMsg.AMValidateWGToken with Double = js.native
  /* 4062 */ val AMValidateWGTokenResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMValidateWGTokenResponse with Double = js.native
  /* 552 */ val AMVerfiyUser: typings.steamDashClient.steamDashClientMod.EMsg.AMVerfiyUser with Double = js.native
  /* 4222 */ val AMVerifyDepotManagementRights: typings.steamDashClient.steamDashClientMod.EMsg.AMVerifyDepotManagementRights with Double = js.native
  /* 4223 */ val AMVerifyDepotManagementRightsResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMVerifyDepotManagementRightsResponse with Double = js.native
  /* 4095 */ val AMWipeFriendsList: typings.steamDashClient.steamDashClientMod.EMsg.AMWipeFriendsList with Double = js.native
  /* 4142 */ val AMWriteNews: typings.steamDashClient.steamDashClientMod.EMsg.AMWriteNews with Double = js.native
  /* 4344 */ val AMXsollaPayment: typings.steamDashClient.steamDashClientMod.EMsg.AMXsollaPayment with Double = js.native
  /* 4345 */ val AMXsollaPaymentResponse: typings.steamDashClient.steamDashClientMod.EMsg.AMXsollaPaymentResponse with Double = js.native
  /* 1519 */ val ATSCSPerfTestResponse: typings.steamDashClient.steamDashClientMod.EMsg.ATSCSPerfTestResponse with Double = js.native
  /* 1518 */ val ATSCSPerfTestTask: typings.steamDashClient.steamDashClientMod.EMsg.ATSCSPerfTestTask with Double = js.native
  /* 1508 */ val ATSCallTest: typings.steamDashClient.steamDashClientMod.EMsg.ATSCallTest with Double = js.native
  /* 1509 */ val ATSCallTestReply: typings.steamDashClient.steamDashClientMod.EMsg.ATSCallTestReply with Double = js.native
  /* 1506 */ val ATSCycleTCM: typings.steamDashClient.steamDashClientMod.EMsg.ATSCycleTCM with Double = js.native
  /* 1516 */ val ATSExternalStressActionResult: typings.steamDashClient.steamDashClientMod.EMsg.ATSExternalStressActionResult with Double = js.native
  /* 1512 */ val ATSExternalStressJobQueued: typings.steamDashClient.steamDashClientMod.EMsg.ATSExternalStressJobQueued with Double = js.native
  /* 1513 */ val ATSExternalStressJobRunning: typings.steamDashClient.steamDashClientMod.EMsg.ATSExternalStressJobRunning with Double = js.native
  /* 1511 */ val ATSExternalStressJobStart: typings.steamDashClient.steamDashClientMod.EMsg.ATSExternalStressJobStart with Double = js.native
  /* 1515 */ val ATSExternalStressJobStopAll: typings.steamDashClient.steamDashClientMod.EMsg.ATSExternalStressJobStopAll with Double = js.native
  /* 1514 */ val ATSExternalStressJobStopped: typings.steamDashClient.steamDashClientMod.EMsg.ATSExternalStressJobStopped with Double = js.native
  /* 1507 */ val ATSInitDRMSStressTest: typings.steamDashClient.steamDashClientMod.EMsg.ATSInitDRMSStressTest with Double = js.native
  /* 1503 */ val ATSRunFailServerTest: typings.steamDashClient.steamDashClientMod.EMsg.ATSRunFailServerTest with Double = js.native
  /* 1510 */ val ATSStartExternalStress: typings.steamDashClient.steamDashClientMod.EMsg.ATSStartExternalStress with Double = js.native
  /* 1501 */ val ATSStartStressTest: typings.steamDashClient.steamDashClientMod.EMsg.ATSStartStressTest with Double = js.native
  /* 1517 */ val ATSStarted: typings.steamDashClient.steamDashClientMod.EMsg.ATSStarted with Double = js.native
  /* 1502 */ val ATSStopStressTest: typings.steamDashClient.steamDashClientMod.EMsg.ATSStopStressTest with Double = js.native
  /* 1505 */ val ATSUFSPerfTestResponse: typings.steamDashClient.steamDashClientMod.EMsg.ATSUFSPerfTestResponse with Double = js.native
  /* 1504 */ val ATSUFSPerfTestTask: typings.steamDashClient.steamDashClientMod.EMsg.ATSUFSPerfTestTask with Double = js.native
  /* 1000 */ val AdminCmd: typings.steamDashClient.steamDashClientMod.EMsg.AdminCmd with Double = js.native
  /* 1004 */ val AdminCmdResponse: typings.steamDashClient.steamDashClientMod.EMsg.AdminCmdResponse with Double = js.native
  /* 1020 */ val AdminConsoleTitle: typings.steamDashClient.steamDashClientMod.EMsg.AdminConsoleTitle with Double = js.native
  /* 1024 */ val AdminGCCommand: typings.steamDashClient.steamDashClientMod.EMsg.AdminGCCommand with Double = js.native
  /* 1025 */ val AdminGCGetCommandList: typings.steamDashClient.steamDashClientMod.EMsg.AdminGCGetCommandList with Double = js.native
  /* 1026 */ val AdminGCGetCommandListResponse: typings.steamDashClient.steamDashClientMod.EMsg.AdminGCGetCommandListResponse with Double = js.native
  /* 1023 */ val AdminGCSpew: typings.steamDashClient.steamDashClientMod.EMsg.AdminGCSpew with Double = js.native
  /* 1006 */ val AdminLogEvent: typings.steamDashClient.steamDashClientMod.EMsg.AdminLogEvent with Double = js.native
  /* 1005 */ val AdminLogListenRequest: typings.steamDashClient.steamDashClientMod.EMsg.AdminLogListenRequest with Double = js.native
  /* 1028 */ val AdminMsgSpew: typings.steamDashClient.steamDashClientMod.EMsg.AdminMsgSpew with Double = js.native
  /* 1017 */ val AdminPwLogon: typings.steamDashClient.steamDashClientMod.EMsg.AdminPwLogon with Double = js.native
  /* 1018 */ val AdminPwLogonResponse: typings.steamDashClient.steamDashClientMod.EMsg.AdminPwLogonResponse with Double = js.native
  /* 1019 */ val AdminSpew: typings.steamDashClient.steamDashClientMod.EMsg.AdminSpew with Double = js.native
  /* 115 */ val Alert: typings.steamDashClient.steamDashClientMod.EMsg.Alert with Double = js.native
  /* 550 */ val AllowUserToPlayQuery: typings.steamDashClient.steamDashClientMod.EMsg.AllowUserToPlayQuery with Double = js.native
  /* 551 */ val AllowUserToPlayResponse: typings.steamDashClient.steamDashClientMod.EMsg.AllowUserToPlayResponse with Double = js.native
  /* 200 */ val AssignSysID: typings.steamDashClient.steamDashClientMod.EMsg.AssignSysID with Double = js.native
  /* 3619 */ val BRPCheckActivationCodes: typings.steamDashClient.steamDashClientMod.EMsg.BRPCheckActivationCodes with Double = js.native
  /* 3620 */ val BRPCheckActivationCodesResponse: typings.steamDashClient.steamDashClientMod.EMsg.BRPCheckActivationCodesResponse with Double = js.native
  /* 3610 */ val BRPCheckFinanceCloseOutDate: typings.steamDashClient.steamDashClientMod.EMsg.BRPCheckFinanceCloseOutDate with Double = js.native
  /* 3626 */ val BRPCheckSettlementReports: typings.steamDashClient.steamDashClientMod.EMsg.BRPCheckSettlementReports with Double = js.native
  /* 3607 */ val BRPCommitGC: typings.steamDashClient.steamDashClientMod.EMsg.BRPCommitGC with Double = js.native
  /* 3608 */ val BRPCommitGCResponse: typings.steamDashClient.steamDashClientMod.EMsg.BRPCommitGCResponse with Double = js.native
  /* 3621 */ val BRPCommitWP: typings.steamDashClient.steamDashClientMod.EMsg.BRPCommitWP with Double = js.native
  /* 3622 */ val BRPCommitWPResponse: typings.steamDashClient.steamDashClientMod.EMsg.BRPCommitWPResponse with Double = js.native
  /* 3615 */ val BRPConvertToCurrentKeys: typings.steamDashClient.steamDashClientMod.EMsg.BRPConvertToCurrentKeys with Double = js.native
  /* 3616 */ val BRPConvertToCurrentKeysResponse: typings.steamDashClient.steamDashClientMod.EMsg.BRPConvertToCurrentKeysResponse with Double = js.native
  /* 3609 */ val BRPFindHungTransactions: typings.steamDashClient.steamDashClientMod.EMsg.BRPFindHungTransactions with Double = js.native
  /* 3628 */ val BRPPostTaxToAvalara: typings.steamDashClient.steamDashClientMod.EMsg.BRPPostTaxToAvalara with Double = js.native
  /* 3629 */ val BRPPostTransactionTax: typings.steamDashClient.steamDashClientMod.EMsg.BRPPostTransactionTax with Double = js.native
  /* 3630 */ val BRPPostTransactionTaxResponse: typings.steamDashClient.steamDashClientMod.EMsg.BRPPostTransactionTaxResponse with Double = js.native
  /* 3603 */ val BRPProcessGCReports: typings.steamDashClient.steamDashClientMod.EMsg.BRPProcessGCReports with Double = js.native
  /* 3631 */ val BRPProcessIMReports: typings.steamDashClient.steamDashClientMod.EMsg.BRPProcessIMReports with Double = js.native
  /* 3611 */ val BRPProcessLicenses: typings.steamDashClient.steamDashClientMod.EMsg.BRPProcessLicenses with Double = js.native
  /* 3612 */ val BRPProcessLicensesResponse: typings.steamDashClient.steamDashClientMod.EMsg.BRPProcessLicensesResponse with Double = js.native
  /* 3604 */ val BRPProcessPPReports: typings.steamDashClient.steamDashClientMod.EMsg.BRPProcessPPReports with Double = js.native
  /* 3625 */ val BRPProcessPartnerPayments: typings.steamDashClient.steamDashClientMod.EMsg.BRPProcessPartnerPayments with Double = js.native
  /* 3624 */ val BRPProcessPaymentRules: typings.steamDashClient.steamDashClientMod.EMsg.BRPProcessPaymentRules with Double = js.native
  /* 3602 */ val BRPProcessUSBankReports: typings.steamDashClient.steamDashClientMod.EMsg.BRPProcessUSBankReports with Double = js.native
  /* 3623 */ val BRPProcessWPReports: typings.steamDashClient.steamDashClientMod.EMsg.BRPProcessWPReports with Double = js.native
  /* 3617 */ val BRPPruneCardUsageStats: typings.steamDashClient.steamDashClientMod.EMsg.BRPPruneCardUsageStats with Double = js.native
  /* 3618 */ val BRPPruneCardUsageStatsResponse: typings.steamDashClient.steamDashClientMod.EMsg.BRPPruneCardUsageStatsResponse with Double = js.native
  /* 3613 */ val BRPRemoveExpiredPaymentData: typings.steamDashClient.steamDashClientMod.EMsg.BRPRemoveExpiredPaymentData with Double = js.native
  /* 3614 */ val BRPRemoveExpiredPaymentDataResponse: typings.steamDashClient.steamDashClientMod.EMsg.BRPRemoveExpiredPaymentDataResponse with Double = js.native
  /* 3606 */ val BRPSettleCB: typings.steamDashClient.steamDashClientMod.EMsg.BRPSettleCB with Double = js.native
  /* 3605 */ val BRPSettleNOVA: typings.steamDashClient.steamDashClientMod.EMsg.BRPSettleNOVA with Double = js.native
  /* 3601 */ val BRPStartShippingJobs: typings.steamDashClient.steamDashClientMod.EMsg.BRPStartShippingJobs with Double = js.native
  /* 1407 */ val BSBannedRequest: typings.steamDashClient.steamDashClientMod.EMsg.BSBannedRequest with Double = js.native
  /* 1494 */ val BSBoaCompraConfirmProductDelivery: typings.steamDashClient.steamDashClientMod.EMsg.BSBoaCompraConfirmProductDelivery with Double = js.native
  /* 1495 */ val BSBoaCompraConfirmProductDeliveryResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSBoaCompraConfirmProductDeliveryResponse with Double = js.native
  /* 1416 */ val BSChaseRFRRequest: typings.steamDashClient.steamDashClientMod.EMsg.BSChaseRFRRequest with Double = js.native
  /* 1456 */ val BSCheckJobRunning: typings.steamDashClient.steamDashClientMod.EMsg.BSCheckJobRunning with Double = js.native
  /* 1457 */ val BSCheckJobRunningResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSCheckJobRunningResponse with Double = js.native
  /* 1425 */ val BSCommitGCTxn: typings.steamDashClient.steamDashClientMod.EMsg.BSCommitGCTxn with Double = js.native
  /* 1498 */ val BSCommitWPTxn: typings.steamDashClient.steamDashClientMod.EMsg.BSCommitWPTxn with Double = js.native
  /* 1474 */ val BSCompletePurchase: typings.steamDashClient.steamDashClientMod.EMsg.BSCompletePurchase with Double = js.native
  /* 1475 */ val BSCompletePurchaseResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSCompletePurchaseResponse with Double = js.native
  /* 1470 */ val BSConvertToCurrentKeys: typings.steamDashClient.steamDashClientMod.EMsg.BSConvertToCurrentKeys with Double = js.native
  /* 1471 */ val BSConvertToCurrentKeysResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSConvertToCurrentKeysResponse with Double = js.native
  /* 1496 */ val BSGenerateBoaCompraMD5: typings.steamDashClient.steamDashClientMod.EMsg.BSGenerateBoaCompraMD5 with Double = js.native
  /* 1497 */ val BSGenerateBoaCompraMD5Response: typings.steamDashClient.steamDashClientMod.EMsg.BSGenerateBoaCompraMD5Response with Double = js.native
  /* 1492 */ val BSGenerateMoPayMD5: typings.steamDashClient.steamDashClientMod.EMsg.BSGenerateMoPayMD5 with Double = js.native
  /* 1493 */ val BSGenerateMoPayMD5Response: typings.steamDashClient.steamDashClientMod.EMsg.BSGenerateMoPayMD5Response with Double = js.native
  /* 1462 */ val BSGetBillingAddress: typings.steamDashClient.steamDashClientMod.EMsg.BSGetBillingAddress with Double = js.native
  /* 1463 */ val BSGetBillingAddressResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSGetBillingAddressResponse with Double = js.native
  /* 1464 */ val BSGetCreditCardInfo: typings.steamDashClient.steamDashClientMod.EMsg.BSGetCreditCardInfo with Double = js.native
  /* 1465 */ val BSGetCreditCardInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSGetCreditCardInfoResponse with Double = js.native
  /* 1415 */ val BSGetEvents: typings.steamDashClient.steamDashClientMod.EMsg.BSGetEvents with Double = js.native
  /* 1410 */ val BSGetPayPalUserInfo: typings.steamDashClient.steamDashClientMod.EMsg.BSGetPayPalUserInfo with Double = js.native
  /* 1411 */ val BSGetPayPalUserInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSGetPayPalUserInfoResponse with Double = js.native
  /* 1454 */ val BSGetProPackOrderStatus: typings.steamDashClient.steamDashClientMod.EMsg.BSGetProPackOrderStatus with Double = js.native
  /* 1455 */ val BSGetProPackOrderStatusResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSGetProPackOrderStatusResponse with Double = js.native
  /* 1421 */ val BSInitGCBankXferTxn: typings.steamDashClient.steamDashClientMod.EMsg.BSInitGCBankXferTxn with Double = js.native
  /* 1422 */ val BSInitGCBankXferTxnResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSInitGCBankXferTxnResponse with Double = js.native
  /* 1408 */ val BSInitPayPalTxn: typings.steamDashClient.steamDashClientMod.EMsg.BSInitPayPalTxn with Double = js.native
  /* 1409 */ val BSInitPayPalTxnResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSInitPayPalTxnResponse with Double = js.native
  /* 1472 */ val BSInitPurchase: typings.steamDashClient.steamDashClientMod.EMsg.BSInitPurchase with Double = js.native
  /* 1473 */ val BSInitPurchaseResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSInitPurchaseResponse with Double = js.native
  /* 1490 */ val BSMoPayConfirmProductDelivery: typings.steamDashClient.steamDashClientMod.EMsg.BSMoPayConfirmProductDelivery with Double = js.native
  /* 1491 */ val BSMoPayConfirmProductDeliveryResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSMoPayConfirmProductDeliveryResponse with Double = js.native
  /* 1417 */ val BSPaymentInstrBan: typings.steamDashClient.steamDashClientMod.EMsg.BSPaymentInstrBan with Double = js.native
  /* 1418 */ val BSPaymentInstrBanResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSPaymentInstrBanResponse with Double = js.native
  /* 1419 */ val BSProcessGCReports: typings.steamDashClient.steamDashClientMod.EMsg.BSProcessGCReports with Double = js.native
  /* 1420 */ val BSProcessPPReports: typings.steamDashClient.steamDashClientMod.EMsg.BSProcessPPReports with Double = js.native
  /* 1436 */ val BSProcessUSBankReports: typings.steamDashClient.steamDashClientMod.EMsg.BSProcessUSBankReports with Double = js.native
  /* 1476 */ val BSPruneCardUsageStats: typings.steamDashClient.steamDashClientMod.EMsg.BSPruneCardUsageStats with Double = js.native
  /* 1477 */ val BSPruneCardUsageStatsResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSPruneCardUsageStatsResponse with Double = js.native
  /* 1402 */ val BSPurchaseResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSPurchaseResponse with Double = js.native
  /* 1437 */ val BSPurchaseRunFraudChecks: typings.steamDashClient.steamDashClientMod.EMsg.BSPurchaseRunFraudChecks with Double = js.native
  /* 1438 */ val BSPurchaseRunFraudChecksResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSPurchaseRunFraudChecksResponse with Double = js.native
  /* 1401 */ val BSPurchaseStart: typings.steamDashClient.steamDashClientMod.EMsg.BSPurchaseStart with Double = js.native
  /* 1448 */ val BSQiwiWalletInvoice: typings.steamDashClient.steamDashClientMod.EMsg.BSQiwiWalletInvoice with Double = js.native
  /* 1449 */ val BSQiwiWalletInvoiceResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSQiwiWalletInvoiceResponse with Double = js.native
  /* 1440 */ val BSQueryBankInformation: typings.steamDashClient.steamDashClientMod.EMsg.BSQueryBankInformation with Double = js.native
  /* 1441 */ val BSQueryBankInformationResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSQueryBankInformationResponse with Double = js.native
  /* 1428 */ val BSQueryCBOrderStatus: typings.steamDashClient.steamDashClientMod.EMsg.BSQueryCBOrderStatus with Double = js.native
  /* 1429 */ val BSQueryCBOrderStatusResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSQueryCBOrderStatusResponse with Double = js.native
  /* 1484 */ val BSQueryFindCreditCard: typings.steamDashClient.steamDashClientMod.EMsg.BSQueryFindCreditCard with Double = js.native
  /* 1485 */ val BSQueryFindCreditCardResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSQueryFindCreditCardResponse with Double = js.native
  /* 1423 */ val BSQueryGCBankXferTxn: typings.steamDashClient.steamDashClientMod.EMsg.BSQueryGCBankXferTxn with Double = js.native
  /* 1424 */ val BSQueryGCBankXferTxnResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSQueryGCBankXferTxnResponse with Double = js.native
  /* 1432 */ val BSQueryPaymentInstResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSQueryPaymentInstResponse with Double = js.native
  /* 1431 */ val BSQueryPaymentInstUsage: typings.steamDashClient.steamDashClientMod.EMsg.BSQueryPaymentInstUsage with Double = js.native
  /* 1426 */ val BSQueryTransactionStatus: typings.steamDashClient.steamDashClientMod.EMsg.BSQueryTransactionStatus with Double = js.native
  /* 1427 */ val BSQueryTransactionStatusResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSQueryTransactionStatusResponse with Double = js.native
  /* 1433 */ val BSQueryTxnExtendedInfo: typings.steamDashClient.steamDashClientMod.EMsg.BSQueryTxnExtendedInfo with Double = js.native
  /* 1434 */ val BSQueryTxnExtendedInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSQueryTxnExtendedInfoResponse with Double = js.native
  /* 1413 */ val BSRefundTxn: typings.steamDashClient.steamDashClientMod.EMsg.BSRefundTxn with Double = js.native
  /* 1414 */ val BSRefundTxnResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSRefundTxnResponse with Double = js.native
  /* 1468 */ val BSRemoveExpiredPaymentData: typings.steamDashClient.steamDashClientMod.EMsg.BSRemoveExpiredPaymentData with Double = js.native
  /* 1469 */ val BSRemoveExpiredPaymentDataResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSRemoveExpiredPaymentDataResponse with Double = js.native
  /* 1458 */ val BSResetPackagePurchaseRateLimit: typings.steamDashClient.steamDashClientMod.EMsg.BSResetPackagePurchaseRateLimit with Double = js.native
  /* 1459 */ val BSResetPackagePurchaseRateLimitResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSResetPackagePurchaseRateLimitResponse with Double = js.native
  /* 1482 */ val BSReverseRedeemPOSAKey: typings.steamDashClient.steamDashClientMod.EMsg.BSReverseRedeemPOSAKey with Double = js.native
  /* 1483 */ val BSReverseRedeemPOSAKeyResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSReverseRedeemPOSAKeyResponse with Double = js.native
  /* 1430 */ val BSRunRedFlagReport: typings.steamDashClient.steamDashClientMod.EMsg.BSRunRedFlagReport with Double = js.native
  /* 1452 */ val BSSendShippingRequest: typings.steamDashClient.steamDashClientMod.EMsg.BSSendShippingRequest with Double = js.native
  /* 1453 */ val BSSendShippingRequestResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSSendShippingRequestResponse with Double = js.native
  /* 1406 */ val BSSettleComplete: typings.steamDashClient.steamDashClientMod.EMsg.BSSettleComplete with Double = js.native
  /* 1404 */ val BSSettleNOVA: typings.steamDashClient.steamDashClientMod.EMsg.BSSettleNOVA with Double = js.native
  /* 1439 */ val BSStartShippingJobs: typings.steamDashClient.steamDashClientMod.EMsg.BSStartShippingJobs with Double = js.native
  /* 1486 */ val BSStatusInquiryPOSAKey: typings.steamDashClient.steamDashClientMod.EMsg.BSStatusInquiryPOSAKey with Double = js.native
  /* 1487 */ val BSStatusInquiryPOSAKeyResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSStatusInquiryPOSAKeyResponse with Double = js.native
  /* 1478 */ val BSStoreBankInformation: typings.steamDashClient.steamDashClientMod.EMsg.BSStoreBankInformation with Double = js.native
  /* 1479 */ val BSStoreBankInformationResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSStoreBankInformationResponse with Double = js.native
  /* 1435 */ val BSUpdateConversionRates: typings.steamDashClient.steamDashClientMod.EMsg.BSUpdateConversionRates with Double = js.native
  /* 1450 */ val BSUpdateInventoryFromProPack: typings.steamDashClient.steamDashClientMod.EMsg.BSUpdateInventoryFromProPack with Double = js.native
  /* 1451 */ val BSUpdateInventoryFromProPackResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSUpdateInventoryFromProPackResponse with Double = js.native
  /* 1460 */ val BSUpdatePaymentData: typings.steamDashClient.steamDashClientMod.EMsg.BSUpdatePaymentData with Double = js.native
  /* 1461 */ val BSUpdatePaymentDataResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSUpdatePaymentDataResponse with Double = js.native
  /* 1488 */ val BSValidateMoPaySignature: typings.steamDashClient.steamDashClientMod.EMsg.BSValidateMoPaySignature with Double = js.native
  /* 1489 */ val BSValidateMoPaySignatureResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSValidateMoPaySignatureResponse with Double = js.native
  /* 1445 */ val BSValidateXsollaSignature: typings.steamDashClient.steamDashClientMod.EMsg.BSValidateXsollaSignature with Double = js.native
  /* 1446 */ val BSValidateXsollaSignatureResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSValidateXsollaSignatureResponse with Double = js.native
  /* 1480 */ val BSVerifyPOSAKey: typings.steamDashClient.steamDashClientMod.EMsg.BSVerifyPOSAKey with Double = js.native
  /* 1481 */ val BSVerifyPOSAKeyResponse: typings.steamDashClient.steamDashClientMod.EMsg.BSVerifyPOSAKeyResponse with Double = js.native
  /* 8401 */ val BackpackAddToCurrency: typings.steamDashClient.steamDashClientMod.EMsg.BackpackAddToCurrency with Double = js.native
  /* 8402 */ val BackpackAddToCurrencyResponse: typings.steamDashClient.steamDashClientMod.EMsg.BackpackAddToCurrencyResponse with Double = js.native
  /* 8400 */ val BackpackBase: typings.steamDashClient.steamDashClientMod.EMsg.BackpackBase with Double = js.native
  /* 7805 */ val BadLoginIPList: typings.steamDashClient.steamDashClientMod.EMsg.BadLoginIPList with Double = js.native
  /* 400 */ val BaseAIS: typings.steamDashClient.steamDashClientMod.EMsg.BaseAIS with Double = js.native
  /* 500 */ val BaseAM: typings.steamDashClient.steamDashClientMod.EMsg.BaseAM with Double = js.native
  /* 4000 */ val BaseAMRange2: typings.steamDashClient.steamDashClientMod.EMsg.BaseAMRange2 with Double = js.native
  /* 1500 */ val BaseATS: typings.steamDashClient.steamDashClientMod.EMsg.BaseATS with Double = js.native
  /* 1000 */ val BaseAdmin: typings.steamDashClient.steamDashClientMod.EMsg.BaseAdmin with Double = js.native
  /* 3600 */ val BaseBRP: typings.steamDashClient.steamDashClientMod.EMsg.BaseBRP with Double = js.native
  /* 1400 */ val BaseBS: typings.steamDashClient.steamDashClientMod.EMsg.BaseBS with Double = js.native
  /* 3150 */ val BaseCCSRange: typings.steamDashClient.steamDashClientMod.EMsg.BaseCCSRange with Double = js.native
  /* 1700 */ val BaseCM: typings.steamDashClient.steamDashClientMod.EMsg.BaseCM with Double = js.native
  /* 650 */ val BaseCS: typings.steamDashClient.steamDashClientMod.EMsg.BaseCS with Double = js.native
  /* 1300 */ val BaseChannelAuth: typings.steamDashClient.steamDashClientMod.EMsg.BaseChannelAuth with Double = js.native
  /* 700 */ val BaseClient: typings.steamDashClient.steamDashClientMod.EMsg.BaseClient with Double = js.native
  /* 5400 */ val BaseClient2: typings.steamDashClient.steamDashClientMod.EMsg.BaseClient2 with Double = js.native
  /* 9800 */ val BaseClient3: typings.steamDashClient.steamDashClientMod.EMsg.BaseClient3 with Double = js.native
  /* 5600 */ val BaseDFS: typings.steamDashClient.steamDashClientMod.EMsg.BaseDFS with Double = js.native
  /* 1600 */ val BaseDP: typings.steamDashClient.steamDashClientMod.EMsg.BaseDP with Double = js.native
  /* 625 */ val BaseDRMS: typings.steamDashClient.steamDashClientMod.EMsg.BaseDRMS with Double = js.native
  /* 1800 */ val BaseDSS: typings.steamDashClient.steamDashClientMod.EMsg.BaseDSS with Double = js.native
  /* 1900 */ val BaseEPM: typings.steamDashClient.steamDashClientMod.EMsg.BaseEPM with Double = js.native
  /* 1100 */ val BaseFBS: typings.steamDashClient.steamDashClientMod.EMsg.BaseFBS with Double = js.native
  /* 3100 */ val BaseFTSRange: typings.steamDashClient.steamDashClientMod.EMsg.BaseFTSRange with Double = js.native
  /* 1200 */ val BaseFileXfer: typings.steamDashClient.steamDashClientMod.EMsg.BaseFileXfer with Double = js.native
  /* 2200 */ val BaseGC: typings.steamDashClient.steamDashClientMod.EMsg.BaseGC with Double = js.native
  /* 300 */ val BaseGM: typings.steamDashClient.steamDashClientMod.EMsg.BaseGM with Double = js.native
  /* 900 */ val BaseGameServer: typings.steamDashClient.steamDashClientMod.EMsg.BaseGameServer with Double = js.native
  /* 100 */ val BaseGeneral: typings.steamDashClient.steamDashClientMod.EMsg.BaseGeneral with Double = js.native
  /* 3200 */ val BaseLBSRange: typings.steamDashClient.steamDashClientMod.EMsg.BaseLBSRange with Double = js.native
  /* 5800 */ val BaseMDS: typings.steamDashClient.steamDashClientMod.EMsg.BaseMDS with Double = js.native
  /* 3400 */ val BaseOGS: typings.steamDashClient.steamDashClientMod.EMsg.BaseOGS with Double = js.native
  /* 2500 */ val BaseP2P: typings.steamDashClient.steamDashClientMod.EMsg.BaseP2P with Double = js.native
  /* 5000 */ val BasePSRange: typings.steamDashClient.steamDashClientMod.EMsg.BasePSRange with Double = js.native
  /* 2900 */ val BaseSM: typings.steamDashClient.steamDashClientMod.EMsg.BaseSM with Double = js.native
  /* 200 */ val BaseShell: typings.steamDashClient.steamDashClientMod.EMsg.BaseShell with Double = js.native
  /* 3000 */ val BaseTest: typings.steamDashClient.steamDashClientMod.EMsg.BaseTest with Double = js.native
  /* 5200 */ val BaseUFSRange: typings.steamDashClient.steamDashClientMod.EMsg.BaseUFSRange with Double = js.native
  /* 600 */ val BaseVS: typings.steamDashClient.steamDashClientMod.EMsg.BaseVS with Double = js.native
  /* 8700 */ val BoxMonitorBase: typings.steamDashClient.steamDashClientMod.EMsg.BoxMonitorBase with Double = js.native
  /* 8700 */ val BoxMonitorReportRequest: typings.steamDashClient.steamDashClientMod.EMsg.BoxMonitorReportRequest with Double = js.native
  /* 8701 */ val BoxMonitorReportResponse: typings.steamDashClient.steamDashClientMod.EMsg.BoxMonitorReportResponse with Double = js.native
  /* 3153 */ val CCSAddComment: typings.steamDashClient.steamDashClientMod.EMsg.CCSAddComment with Double = js.native
  /* 3154 */ val CCSAddCommentResponse: typings.steamDashClient.steamDashClientMod.EMsg.CCSAddCommentResponse with Double = js.native
  /* 3161 */ val CCSDeleteAllCommentsByAuthor: typings.steamDashClient.steamDashClientMod.EMsg.CCSDeleteAllCommentsByAuthor with Double = js.native
  /* 3162 */ val CCSDeleteAllCommentsByAuthorResponse: typings.steamDashClient.steamDashClientMod.EMsg.CCSDeleteAllCommentsByAuthorResponse with Double = js.native
  /* 3155 */ val CCSDeleteComment: typings.steamDashClient.steamDashClientMod.EMsg.CCSDeleteComment with Double = js.native
  /* 3156 */ val CCSDeleteCommentResponse: typings.steamDashClient.steamDashClientMod.EMsg.CCSDeleteCommentResponse with Double = js.native
  /* 3151 */ val CCSGetComments: typings.steamDashClient.steamDashClientMod.EMsg.CCSGetComments with Double = js.native
  /* 3159 */ val CCSGetCommentsForNews: typings.steamDashClient.steamDashClientMod.EMsg.CCSGetCommentsForNews with Double = js.native
  /* 3160 */ val CCSGetCommentsForNewsResponse: typings.steamDashClient.steamDashClientMod.EMsg.CCSGetCommentsForNewsResponse with Double = js.native
  /* 3152 */ val CCSGetCommentsResponse: typings.steamDashClient.steamDashClientMod.EMsg.CCSGetCommentsResponse with Double = js.native
  /* 3158 */ val CCSNotifyCommentCount: typings.steamDashClient.steamDashClientMod.EMsg.CCSNotifyCommentCount with Double = js.native
  /* 3157 */ val CCSPreloadComments: typings.steamDashClient.steamDashClientMod.EMsg.CCSPreloadComments with Double = js.native
  /* 7602 */ val CEGPropStatusDRMSRequest: typings.steamDashClient.steamDashClientMod.EMsg.CEGPropStatusDRMSRequest with Double = js.native
  /* 7603 */ val CEGPropStatusDRMSResponse: typings.steamDashClient.steamDashClientMod.EMsg.CEGPropStatusDRMSResponse with Double = js.native
  /* 7600 */ val CEGVersionSetEnableDisableRequest: typings.steamDashClient.steamDashClientMod.EMsg.CEGVersionSetEnableDisableRequest with Double = js.native
  /* 7601 */ val CEGVersionSetEnableDisableResponse: typings.steamDashClient.steamDashClientMod.EMsg.CEGVersionSetEnableDisableResponse with Double = js.native
  /* 7604 */ val CEGWhackFailureReportRequest: typings.steamDashClient.steamDashClientMod.EMsg.CEGWhackFailureReportRequest with Double = js.native
  /* 7605 */ val CEGWhackFailureReportResponse: typings.steamDashClient.steamDashClientMod.EMsg.CEGWhackFailureReportResponse with Double = js.native
  /* 1703 */ val CMAppInfoResponseDeprecated: typings.steamDashClient.steamDashClientMod.EMsg.CMAppInfoResponseDeprecated with Double = js.native
  /* 1701 */ val CMSetAllowState: typings.steamDashClient.steamDashClientMod.EMsg.CMSetAllowState with Double = js.native
  /* 1702 */ val CMSpewAllowState: typings.steamDashClient.steamDashClientMod.EMsg.CMSpewAllowState with Double = js.native
  /* 8500 */ val CREBase: typings.steamDashClient.steamDashClientMod.EMsg.CREBase with Double = js.native
  /* 8511 */ val CREEnumeratePublishedFiles: typings.steamDashClient.steamDashClientMod.EMsg.CREEnumeratePublishedFiles with Double = js.native
  /* 8512 */ val CREEnumeratePublishedFilesResponse: typings.steamDashClient.steamDashClientMod.EMsg.CREEnumeratePublishedFilesResponse with Double = js.native
  /* 8509 */ val CREGetUserPublishedItemVoteDetails: typings.steamDashClient.steamDashClientMod.EMsg.CREGetUserPublishedItemVoteDetails with Double = js.native
  /* 8510 */ val CREGetUserPublishedItemVoteDetailsResponse: typings.steamDashClient.steamDashClientMod.EMsg.CREGetUserPublishedItemVoteDetailsResponse with Double = js.native
  /* 8503 */ val CREItemVoteSummary: typings.steamDashClient.steamDashClientMod.EMsg.CREItemVoteSummary with Double = js.native
  /* 8504 */ val CREItemVoteSummaryResponse: typings.steamDashClient.steamDashClientMod.EMsg.CREItemVoteSummaryResponse with Double = js.native
  /* 8513 */ val CREPublishedFileVoteAdded: typings.steamDashClient.steamDashClientMod.EMsg.CREPublishedFileVoteAdded with Double = js.native
  /* 8501 */ val CRERankByTrend: typings.steamDashClient.steamDashClientMod.EMsg.CRERankByTrend with Double = js.native
  /* 8502 */ val CRERankByTrendResponse: typings.steamDashClient.steamDashClientMod.EMsg.CRERankByTrendResponse with Double = js.native
  /* 8505 */ val CRERankByVote: typings.steamDashClient.steamDashClientMod.EMsg.CRERankByVote with Double = js.native
  /* 8506 */ val CRERankByVoteResponse: typings.steamDashClient.steamDashClientMod.EMsg.CRERankByVoteResponse with Double = js.native
  /* 8507 */ val CREUpdateUserPublishedItemVote: typings.steamDashClient.steamDashClientMod.EMsg.CREUpdateUserPublishedItemVote with Double = js.native
  /* 8508 */ val CREUpdateUserPublishedItemVoteResponse: typings.steamDashClient.steamDashClientMod.EMsg.CREUpdateUserPublishedItemVoteResponse with Double = js.native
  /* 6200 */ val CSBase: typings.steamDashClient.steamDashClientMod.EMsg.CSBase with Double = js.native
  /* 6201 */ val CSPing: typings.steamDashClient.steamDashClientMod.EMsg.CSPing with Double = js.native
  /* 6202 */ val CSPingResponse: typings.steamDashClient.steamDashClientMod.EMsg.CSPingResponse with Double = js.native
  /* 787 */ val CSUserContentApprove: typings.steamDashClient.steamDashClientMod.EMsg.CSUserContentApprove with Double = js.native
  /* 788 */ val CSUserContentDeny: typings.steamDashClient.steamDashClientMod.EMsg.CSUserContentDeny with Double = js.native
  /* 652 */ val CSUserContentRequest: typings.steamDashClient.steamDashClientMod.EMsg.CSUserContentRequest with Double = js.native
  /* 1300 */ val ChannelAuthChallenge: typings.steamDashClient.steamDashClientMod.EMsg.ChannelAuthChallenge with Double = js.native
  /* 1301 */ val ChannelAuthResponse: typings.steamDashClient.steamDashClientMod.EMsg.ChannelAuthResponse with Double = js.native
  /* 1302 */ val ChannelAuthResult: typings.steamDashClient.steamDashClientMod.EMsg.ChannelAuthResult with Double = js.native
  /* 1303 */ val ChannelEncryptRequest: typings.steamDashClient.steamDashClientMod.EMsg.ChannelEncryptRequest with Double = js.native
  /* 1304 */ val ChannelEncryptResponse: typings.steamDashClient.steamDashClientMod.EMsg.ChannelEncryptResponse with Double = js.native
  /* 1305 */ val ChannelEncryptResult: typings.steamDashClient.steamDashClientMod.EMsg.ChannelEncryptResult with Double = js.native
  /* 5531 */ val ClientAMGetClanOfficers: typings.steamDashClient.steamDashClientMod.EMsg.ClientAMGetClanOfficers with Double = js.native
  /* 5532 */ val ClientAMGetClanOfficersResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientAMGetClanOfficersResponse with Double = js.native
  /* 5570 */ val ClientAMGetPersonaNameHistory: typings.steamDashClient.steamDashClientMod.EMsg.ClientAMGetPersonaNameHistory with Double = js.native
  /* 5571 */ val ClientAMGetPersonaNameHistoryResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientAMGetPersonaNameHistoryResponse with Double = js.native
  /* 768 */ val ClientAccountInfo: typings.steamDashClient.steamDashClientMod.EMsg.ClientAccountInfo with Double = js.native
  /* 740 */ val ClientAckGuestPass: typings.steamDashClient.steamDashClientMod.EMsg.ClientAckGuestPass with Double = js.native
  /* 796 */ val ClientAckGuestPassResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientAckGuestPassResponse with Double = js.native
  /* 735 */ val ClientAckMessageByGID: typings.steamDashClient.steamDashClientMod.EMsg.ClientAckMessageByGID with Double = js.native
  /* 737 */ val ClientAckPurchaseReceipt: typings.steamDashClient.steamDashClientMod.EMsg.ClientAckPurchaseReceipt with Double = js.native
  /* 709 */ val ClientAckVACBan: typings.steamDashClient.steamDashClientMod.EMsg.ClientAckVACBan with Double = js.native
  /* 732 */ val ClientAckVACBan2: typings.steamDashClient.steamDashClientMod.EMsg.ClientAckVACBan2 with Double = js.native
  /* 745 */ val ClientAcknowledgeClanInvite: typings.steamDashClient.steamDashClientMod.EMsg.ClientAcknowledgeClanInvite with Double = js.native
  /* 5468 */ val ClientActivateOEMLicense: typings.steamDashClient.steamDashClientMod.EMsg.ClientActivateOEMLicense with Double = js.native
  /* 791 */ val ClientAddFriend: typings.steamDashClient.steamDashClientMod.EMsg.ClientAddFriend with Double = js.native
  /* 792 */ val ClientAddFriendResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientAddFriendResponse with Double = js.native
  /* 702 */ val ClientAnonLogOn_Deprecated: typings.steamDashClient.steamDashClientMod.EMsg.ClientAnonLogOn_Deprecated with Double = js.native
  /* 5409 */ val ClientAnonUserLogOn_Deprecated: typings.steamDashClient.steamDashClientMod.EMsg.ClientAnonUserLogOn_Deprecated with Double = js.native
  /* 867 */ val ClientAppInfoChanges: typings.steamDashClient.steamDashClientMod.EMsg.ClientAppInfoChanges with Double = js.native
  /* 840 */ val ClientAppInfoRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientAppInfoRequest with Double = js.native
  /* 841 */ val ClientAppInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientAppInfoResponse with Double = js.native
  /* 866 */ val ClientAppInfoUpdate: typings.steamDashClient.steamDashClientMod.EMsg.ClientAppInfoUpdate with Double = js.native
  /* 5507 */ val ClientAppMinutesPlayedData: typings.steamDashClient.steamDashClientMod.EMsg.ClientAppMinutesPlayedData with Double = js.native
  /* 747 */ val ClientAppUsageEvent: typings.steamDashClient.steamDashClientMod.EMsg.ClientAppUsageEvent with Double = js.native
  /* 5432 */ val ClientAuthList: typings.steamDashClient.steamDashClientMod.EMsg.ClientAuthList with Double = js.native
  /* 5575 */ val ClientAuthListAck: typings.steamDashClient.steamDashClientMod.EMsg.ClientAuthListAck with Double = js.native
  /* 5428 */ val ClientAuthList_Deprecated: typings.steamDashClient.steamDashClientMod.EMsg.ClientAuthList_Deprecated with Double = js.native
  /* 6502 */ val ClientAuthorizeLocalDevice: typings.steamDashClient.steamDashClientMod.EMsg.ClientAuthorizeLocalDevice with Double = js.native
  /* 6509 */ val ClientAuthorizeLocalDeviceNotification: typings.steamDashClient.steamDashClientMod.EMsg.ClientAuthorizeLocalDeviceNotification with Double = js.native
  /* 6501 */ val ClientAuthorizeLocalDeviceRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientAuthorizeLocalDeviceRequest with Double = js.native
  /* 6502 */ val ClientAuthorizeLocalDeviceResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientAuthorizeLocalDeviceResponse with Double = js.native
  /* 9700 */ val ClientBroadcastBase: typings.steamDashClient.steamDashClientMod.EMsg.ClientBroadcastBase with Double = js.native
  /* 9702 */ val ClientBroadcastDisconnect: typings.steamDashClient.steamDashClientMod.EMsg.ClientBroadcastDisconnect with Double = js.native
  /* 9701 */ val ClientBroadcastFrames: typings.steamDashClient.steamDashClientMod.EMsg.ClientBroadcastFrames with Double = js.native
  /* 9700 */ val ClientBroadcastInit: typings.steamDashClient.steamDashClientMod.EMsg.ClientBroadcastInit with Double = js.native
  /* 9703 */ val ClientBroadcastScreenshot: typings.steamDashClient.steamDashClientMod.EMsg.ClientBroadcastScreenshot with Double = js.native
  /* 9704 */ val ClientBroadcastUploadConfig: typings.steamDashClient.steamDashClientMod.EMsg.ClientBroadcastUploadConfig with Double = js.native
  /* 783 */ val ClientCMList: typings.steamDashClient.steamDashClientMod.EMsg.ClientCMList with Double = js.native
  /* 729 */ val ClientCancelLicense: typings.steamDashClient.steamDashClientMod.EMsg.ClientCancelLicense with Double = js.native
  /* 781 */ val ClientCancelLicenseResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientCancelLicenseResponse with Double = js.native
  /* 716 */ val ClientChangeStatus: typings.steamDashClient.steamDashClientMod.EMsg.ClientChangeStatus with Double = js.native
  /* 5579 */ val ClientChangeSteamGuardOptions: typings.steamDashClient.steamDashClientMod.EMsg.ClientChangeSteamGuardOptions with Double = js.native
  /* 5580 */ val ClientChangeSteamGuardOptionsResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientChangeSteamGuardOptionsResponse with Double = js.native
  /* 597 */ val ClientChatAction: typings.steamDashClient.steamDashClientMod.EMsg.ClientChatAction with Double = js.native
  /* 814 */ val ClientChatActionResult: typings.steamDashClient.steamDashClientMod.EMsg.ClientChatActionResult with Double = js.native
  /* 5426 */ val ClientChatDeclined: typings.steamDashClient.steamDashClientMod.EMsg.ClientChatDeclined with Double = js.native
  /* 807 */ val ClientChatEnter: typings.steamDashClient.steamDashClientMod.EMsg.ClientChatEnter with Double = js.native
  /* 800 */ val ClientChatInvite: typings.steamDashClient.steamDashClientMod.EMsg.ClientChatInvite with Double = js.native
  /* 802 */ val ClientChatMemberInfo: typings.steamDashClient.steamDashClientMod.EMsg.ClientChatMemberInfo with Double = js.native
  /* 799 */ val ClientChatMsg: typings.steamDashClient.steamDashClientMod.EMsg.ClientChatMsg with Double = js.native
  /* 4026 */ val ClientChatRoomInfo: typings.steamDashClient.steamDashClientMod.EMsg.ClientChatRoomInfo with Double = js.native
  /* 5450 */ val ClientCheckAppBetaPassword: typings.steamDashClient.steamDashClientMod.EMsg.ClientCheckAppBetaPassword with Double = js.native
  /* 5451 */ val ClientCheckAppBetaPasswordResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientCheckAppBetaPasswordResponse with Double = js.native
  /* 5533 */ val ClientCheckFileSignature: typings.steamDashClient.steamDashClientMod.EMsg.ClientCheckFileSignature with Double = js.native
  /* 5534 */ val ClientCheckFileSignatureResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientCheckFileSignatureResponse with Double = js.native
  /* 845 */ val ClientCheckPassword: typings.steamDashClient.steamDashClientMod.EMsg.ClientCheckPassword with Double = js.native
  /* 848 */ val ClientCheckPasswordResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientCheckPasswordResponse with Double = js.native
  /* 822 */ val ClientClanState: typings.steamDashClient.steamDashClientMod.EMsg.ClientClanState with Double = js.native
  /* 5582 */ val ClientCommentNotifications: typings.steamDashClient.steamDashClientMod.EMsg.ClientCommentNotifications with Double = js.native
  /* 9600 */ val ClientConcurrentSessionsBase: typings.steamDashClient.steamDashClientMod.EMsg.ClientConcurrentSessionsBase with Double = js.native
  /* 710 */ val ClientConnectionStats: typings.steamDashClient.steamDashClientMod.EMsg.ClientConnectionStats with Double = js.native
  /* 731 */ val ClientContentServerLogOn_Deprecated: typings.steamDashClient.steamDashClientMod.EMsg.ClientContentServerLogOn_Deprecated with Double = js.native
  /* 5406 */ val ClientCreateAccount2: typings.steamDashClient.steamDashClientMod.EMsg.ClientCreateAccount2 with Double = js.native
  /* 5462 */ val ClientCreateAccount3: typings.steamDashClient.steamDashClientMod.EMsg.ClientCreateAccount3 with Double = js.native
  /* 5590 */ val ClientCreateAccountProto: typings.steamDashClient.steamDashClientMod.EMsg.ClientCreateAccountProto with Double = js.native
  /* 5591 */ val ClientCreateAccountProtoResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientCreateAccountProtoResponse with Double = js.native
  /* 5403 */ val ClientCreateAccountResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientCreateAccountResponse with Double = js.native
  /* 761 */ val ClientCreateAcctResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientCreateAcctResponse with Double = js.native
  /* 809 */ val ClientCreateChat: typings.steamDashClient.steamDashClientMod.EMsg.ClientCreateChat with Double = js.native
  /* 810 */ val ClientCreateChatResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientCreateChatResponse with Double = js.native
  /* 5597 */ val ClientCurrentUIMode: typings.steamDashClient.steamDashClientMod.EMsg.ClientCurrentUIMode with Double = js.native
  /* 5605 */ val ClientDFSAuthenticateRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientDFSAuthenticateRequest with Double = js.native
  /* 5606 */ val ClientDFSAuthenticateResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientDFSAuthenticateResponse with Double = js.native
  /* 5617 */ val ClientDFSDownloadStatus: typings.steamDashClient.steamDashClientMod.EMsg.ClientDFSDownloadStatus with Double = js.native
  /* 5607 */ val ClientDFSEndSession: typings.steamDashClient.steamDashClientMod.EMsg.ClientDFSEndSession with Double = js.native
  /* 1620 */ val ClientDPCheckSpecialSurvey: typings.steamDashClient.steamDashClientMod.EMsg.ClientDPCheckSpecialSurvey with Double = js.native
  /* 1621 */ val ClientDPCheckSpecialSurveyResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientDPCheckSpecialSurveyResponse with Double = js.native
  /* 1630 */ val ClientDPContentStatsReport: typings.steamDashClient.steamDashClientMod.EMsg.ClientDPContentStatsReport with Double = js.native
  /* 1622 */ val ClientDPSendSpecialSurveyResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientDPSendSpecialSurveyResponse with Double = js.native
  /* 1623 */ val ClientDPSendSpecialSurveyResponseReply: typings.steamDashClient.steamDashClientMod.EMsg.ClientDPSendSpecialSurveyResponseReply with Double = js.native
  /* 1627 */ val ClientDPSteam2AppStarted: typings.steamDashClient.steamDashClientMod.EMsg.ClientDPSteam2AppStarted with Double = js.native
  /* 1625 */ val ClientDPUpdateAppJobReport: typings.steamDashClient.steamDashClientMod.EMsg.ClientDPUpdateAppJobReport with Double = js.native
  /* 896 */ val ClientDRMBlobRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientDRMBlobRequest with Double = js.native
  /* 897 */ val ClientDRMBlobResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientDRMBlobResponse with Double = js.native
  /* 5485 */ val ClientDRMDownloadRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientDRMDownloadRequest with Double = js.native
  /* 5574 */ val ClientDRMDownloadRequestWithCrashData: typings.steamDashClient.steamDashClientMod.EMsg.ClientDRMDownloadRequestWithCrashData with Double = js.native
  /* 5486 */ val ClientDRMDownloadResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientDRMDownloadResponse with Double = js.native
  /* 5487 */ val ClientDRMFinalResult: typings.steamDashClient.steamDashClientMod.EMsg.ClientDRMFinalResult with Double = js.native
  /* 851 */ val ClientDRMProblemReport: typings.steamDashClient.steamDashClientMod.EMsg.ClientDRMProblemReport with Double = js.native
  /* 5495 */ val ClientDRMTest: typings.steamDashClient.steamDashClientMod.EMsg.ClientDRMTest with Double = js.native
  /* 5496 */ val ClientDRMTestResult: typings.steamDashClient.steamDashClientMod.EMsg.ClientDRMTestResult with Double = js.native
  /* 6504 */ val ClientDeauthorizeDevice: typings.steamDashClient.steamDashClientMod.EMsg.ClientDeauthorizeDevice with Double = js.native
  /* 6503 */ val ClientDeauthorizeDeviceRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientDeauthorizeDeviceRequest with Double = js.native
  /* 5511 */ val ClientDeregisterWithServer: typings.steamDashClient.steamDashClientMod.EMsg.ClientDeregisterWithServer with Double = js.native
  /* 5445 */ val ClientDisableTestLicense: typings.steamDashClient.steamDashClientMod.EMsg.ClientDisableTestLicense with Double = js.native
  /* 5446 */ val ClientDisableTestLicenseResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientDisableTestLicenseResponse with Double = js.native
  /* 5548 */ val ClientDownloadRateStatistics: typings.steamDashClient.steamDashClientMod.EMsg.ClientDownloadRateStatistics with Double = js.native
  /* 5456 */ val ClientEmailAddrInfo: typings.steamDashClient.steamDashClientMod.EMsg.ClientEmailAddrInfo with Double = js.native
  /* 5458 */ val ClientEmailChange3: typings.steamDashClient.steamDashClientMod.EMsg.ClientEmailChange3 with Double = js.native
  /* 5544 */ val ClientEmailChange4: typings.steamDashClient.steamDashClientMod.EMsg.ClientEmailChange4 with Double = js.native
  /* 891 */ val ClientEmailChangeResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientEmailChangeResponse with Double = js.native
  /* 5545 */ val ClientEmailChangeResponse4: typings.steamDashClient.steamDashClientMod.EMsg.ClientEmailChangeResponse4 with Double = js.native
  /* 9331 */ val ClientEmoticonList: typings.steamDashClient.steamDashClientMod.EMsg.ClientEmoticonList with Double = js.native
  /* 5443 */ val ClientEnableTestLicense: typings.steamDashClient.steamDashClientMod.EMsg.ClientEnableTestLicense with Double = js.native
  /* 5444 */ val ClientEnableTestLicenseResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientEnableTestLicenseResponse with Double = js.native
  /* 784 */ val ClientEncryptPct: typings.steamDashClient.steamDashClientMod.EMsg.ClientEncryptPct with Double = js.native
  /* 7519 */ val ClientFSEnumerateFollowingList: typings.steamDashClient.steamDashClientMod.EMsg.ClientFSEnumerateFollowingList with Double = js.native
  /* 7520 */ val ClientFSEnumerateFollowingListResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientFSEnumerateFollowingListResponse with Double = js.native
  /* 7515 */ val ClientFSGetFollowerCount: typings.steamDashClient.steamDashClientMod.EMsg.ClientFSGetFollowerCount with Double = js.native
  /* 7516 */ val ClientFSGetFollowerCountResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientFSGetFollowerCountResponse with Double = js.native
  /* 7525 */ val ClientFSGetFriendMessageHistory: typings.steamDashClient.steamDashClientMod.EMsg.ClientFSGetFriendMessageHistory with Double = js.native
  /* 7527 */ val ClientFSGetFriendMessageHistoryForOfflineMessages: typings.steamDashClient.steamDashClientMod.EMsg.ClientFSGetFriendMessageHistoryForOfflineMessages with Double = js.native
  /* 7526 */ val ClientFSGetFriendMessageHistoryResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientFSGetFriendMessageHistoryResponse with Double = js.native
  /* 7528 */ val ClientFSGetFriendsSteamLevels: typings.steamDashClient.steamDashClientMod.EMsg.ClientFSGetFriendsSteamLevels with Double = js.native
  /* 7529 */ val ClientFSGetFriendsSteamLevelsResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientFSGetFriendsSteamLevelsResponse with Double = js.native
  /* 7517 */ val ClientFSGetIsFollowing: typings.steamDashClient.steamDashClientMod.EMsg.ClientFSGetIsFollowing with Double = js.native
  /* 7518 */ val ClientFSGetIsFollowingResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientFSGetIsFollowingResponse with Double = js.native
  /* 7523 */ val ClientFSOfflineMessageNotification: typings.steamDashClient.steamDashClientMod.EMsg.ClientFSOfflineMessageNotification with Double = js.native
  /* 7524 */ val ClientFSRequestOfflineMessageCount: typings.steamDashClient.steamDashClientMod.EMsg.ClientFSRequestOfflineMessageCount with Double = js.native
  /* 786 */ val ClientFavoritesList: typings.steamDashClient.steamDashClientMod.EMsg.ClientFavoritesList with Double = js.native
  /* 5412 */ val ClientFileToDownload: typings.steamDashClient.steamDashClientMod.EMsg.ClientFileToDownload with Double = js.native
  /* 5413 */ val ClientFileToDownloadResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientFileToDownloadResponse with Double = js.native
  /* 718 */ val ClientFriendMsg: typings.steamDashClient.steamDashClientMod.EMsg.ClientFriendMsg with Double = js.native
  /* 5578 */ val ClientFriendMsgEchoToSender: typings.steamDashClient.steamDashClientMod.EMsg.ClientFriendMsgEchoToSender with Double = js.native
  /* 5427 */ val ClientFriendMsgIncoming: typings.steamDashClient.steamDashClientMod.EMsg.ClientFriendMsgIncoming with Double = js.native
  /* 5535 */ val ClientFriendProfileInfo: typings.steamDashClient.steamDashClientMod.EMsg.ClientFriendProfileInfo with Double = js.native
  /* 5536 */ val ClientFriendProfileInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientFriendProfileInfoResponse with Double = js.native
  /* 808 */ val ClientFriendRemovedFromSource: typings.steamDashClient.steamDashClientMod.EMsg.ClientFriendRemovedFromSource with Double = js.native
  /* 5596 */ val ClientFriendUserStatusPublished: typings.steamDashClient.steamDashClientMod.EMsg.ClientFriendUserStatusPublished with Double = js.native
  /* 5553 */ val ClientFriendsGroupsList: typings.steamDashClient.steamDashClientMod.EMsg.ClientFriendsGroupsList with Double = js.native
  /* 767 */ val ClientFriendsList: typings.steamDashClient.steamDashClientMod.EMsg.ClientFriendsList with Double = js.native
  /* 5453 */ val ClientFromGC: typings.steamDashClient.steamDashClientMod.EMsg.ClientFromGC with Double = js.native
  /* 5503 */ val ClientGCMsgFailed: typings.steamDashClient.steamDashClientMod.EMsg.ClientGCMsgFailed with Double = js.native
  /* 6403 */ val ClientGMSServerQuery: typings.steamDashClient.steamDashClientMod.EMsg.ClientGMSServerQuery with Double = js.native
  /* 773 */ val ClientGameConnectDeny: typings.steamDashClient.steamDashClientMod.EMsg.ClientGameConnectDeny with Double = js.native
  /* 779 */ val ClientGameConnectTokens: typings.steamDashClient.steamDashClientMod.EMsg.ClientGameConnectTokens with Double = js.native
  /* 719 */ val ClientGameConnect_obsolete: typings.steamDashClient.steamDashClientMod.EMsg.ClientGameConnect_obsolete with Double = js.native
  /* 721 */ val ClientGameEnded_obsolete: typings.steamDashClient.steamDashClientMod.EMsg.ClientGameEnded_obsolete with Double = js.native
  /* 742 */ val ClientGamesPlayed: typings.steamDashClient.steamDashClientMod.EMsg.ClientGamesPlayed with Double = js.native
  /* 720 */ val ClientGamesPlayed2_obsolete: typings.steamDashClient.steamDashClientMod.EMsg.ClientGamesPlayed2_obsolete with Double = js.native
  /* 738 */ val ClientGamesPlayed3_obsolete: typings.steamDashClient.steamDashClientMod.EMsg.ClientGamesPlayed3_obsolete with Double = js.native
  /* 715 */ val ClientGamesPlayedNoDataBlob: typings.steamDashClient.steamDashClientMod.EMsg.ClientGamesPlayedNoDataBlob with Double = js.native
  /* 5410 */ val ClientGamesPlayedWithDataBlob: typings.steamDashClient.steamDashClientMod.EMsg.ClientGamesPlayedWithDataBlob with Double = js.native
  /* 705 */ val ClientGamesPlayed_obsolete: typings.steamDashClient.steamDashClientMod.EMsg.ClientGamesPlayed_obsolete with Double = js.native
  /* 5441 */ val ClientGetAppBetaPasswords: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetAppBetaPasswords with Double = js.native
  /* 5442 */ val ClientGetAppBetaPasswordsResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetAppBetaPasswordsResponse with Double = js.native
  /* 857 */ val ClientGetAppOwnershipTicket: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetAppOwnershipTicket with Double = js.native
  /* 858 */ val ClientGetAppOwnershipTicketResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetAppOwnershipTicketResponse with Double = js.native
  /* 6506 */ val ClientGetAuthorizedDevices: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetAuthorizedDevices with Double = js.native
  /* 6507 */ val ClientGetAuthorizedDevicesResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetAuthorizedDevicesResponse with Double = js.native
  /* 5546 */ val ClientGetCDNAuthToken: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetCDNAuthToken with Double = js.native
  /* 5547 */ val ClientGetCDNAuthTokenResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetCDNAuthTokenResponse with Double = js.native
  /* 5554 */ val ClientGetClanActivityCounts: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetClanActivityCounts with Double = js.native
  /* 5555 */ val ClientGetClanActivityCountsResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetClanActivityCountsResponse with Double = js.native
  /* 5518 */ val ClientGetClientAppList: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetClientAppList with Double = js.native
  /* 5519 */ val ClientGetClientAppListResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetClientAppListResponse with Double = js.native
  /* 5515 */ val ClientGetClientDetails: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetClientDetails with Double = js.native
  /* 5516 */ val ClientGetClientDetailsResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetClientDetailsResponse with Double = js.native
  /* 5438 */ val ClientGetDepotDecryptionKey: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetDepotDecryptionKey with Double = js.native
  /* 5439 */ val ClientGetDepotDecryptionKeyResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetDepotDecryptionKeyResponse with Double = js.native
  /* 9330 */ val ClientGetEmoticonList: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetEmoticonList with Double = js.native
  /* 722 */ val ClientGetFinalPrice: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetFinalPrice with Double = js.native
  /* 775 */ val ClientGetFinalPriceResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetFinalPriceResponse with Double = js.native
  /* 5488 */ val ClientGetFriendsWhoPlayGame: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetFriendsWhoPlayGame with Double = js.native
  /* 5489 */ val ClientGetFriendsWhoPlayGameResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetFriendsWhoPlayGameResponse with Double = js.native
  /* 748 */ val ClientGetGiftTargetList: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetGiftTargetList with Double = js.native
  /* 749 */ val ClientGetGiftTargetListResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetGiftTargetListResponse with Double = js.native
  /* 730 */ val ClientGetLegacyGameKey: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetLegacyGameKey with Double = js.native
  /* 785 */ val ClientGetLegacyGameKeyResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetLegacyGameKeyResponse with Double = js.native
  /* 728 */ val ClientGetLicenses: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetLicenses with Double = js.native
  /* 860 */ val ClientGetLobbyListResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetLobbyListResponse with Double = js.native
  /* 861 */ val ClientGetLobbyMetadata: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetLobbyMetadata with Double = js.native
  /* 862 */ val ClientGetLobbyMetadataResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetLobbyMetadataResponse with Double = js.native
  /* 5508 */ val ClientGetMicroTxnInfo: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetMicroTxnInfo with Double = js.native
  /* 5509 */ val ClientGetMicroTxnInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetMicroTxnInfoResponse with Double = js.native
  /* 5436 */ val ClientGetNumberOfCurrentPlayers: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetNumberOfCurrentPlayers with Double = js.native
  /* 5592 */ val ClientGetNumberOfCurrentPlayersDP: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetNumberOfCurrentPlayersDP with Double = js.native
  /* 5593 */ val ClientGetNumberOfCurrentPlayersDPResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetNumberOfCurrentPlayersDPResponse with Double = js.native
  /* 5437 */ val ClientGetNumberOfCurrentPlayersResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetNumberOfCurrentPlayersResponse with Double = js.native
  /* 736 */ val ClientGetPurchaseReceipts: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetPurchaseReceipts with Double = js.native
  /* 818 */ val ClientGetUserStats: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetUserStats with Double = js.native
  /* 819 */ val ClientGetUserStatsResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientGetUserStatsResponse with Double = js.native
  /* 703 */ val ClientHeartBeat: typings.steamDashClient.steamDashClientMod.EMsg.ClientHeartBeat with Double = js.native
  /* 5552 */ val ClientHideFriend: typings.steamDashClient.steamDashClientMod.EMsg.ClientHideFriend with Double = js.native
  /* 708 */ val ClientInformOfCreateAccount: typings.steamDashClient.steamDashClientMod.EMsg.ClientInformOfCreateAccount with Double = js.native
  /* 5407 */ val ClientInformOfResetForgottenPassword: typings.steamDashClient.steamDashClientMod.EMsg.ClientInformOfResetForgottenPassword with Double = js.native
  /* 5408 */ val ClientInformOfResetForgottenPasswordResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientInformOfResetForgottenPasswordResponse with Double = js.native
  /* 711 */ val ClientInitPurchase: typings.steamDashClient.steamDashClientMod.EMsg.ClientInitPurchase with Double = js.native
  /* 789 */ val ClientInitPurchaseResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientInitPurchaseResponse with Double = js.native
  /* 5520 */ val ClientInstallClientApp: typings.steamDashClient.steamDashClientMod.EMsg.ClientInstallClientApp with Double = js.native
  /* 5521 */ val ClientInstallClientAppResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientInstallClientAppResponse with Double = js.native
  /* 793 */ val ClientInviteFriend: typings.steamDashClient.steamDashClientMod.EMsg.ClientInviteFriend with Double = js.native
  /* 794 */ val ClientInviteFriendResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientInviteFriendResponse with Double = js.native
  /* 744 */ val ClientInviteUserToClan: typings.steamDashClient.steamDashClientMod.EMsg.ClientInviteUserToClan with Double = js.native
  /* 5430 */ val ClientIsLimitedAccount: typings.steamDashClient.steamDashClientMod.EMsg.ClientIsLimitedAccount with Double = js.native
  /* 5576 */ val ClientItemAnnouncements: typings.steamDashClient.steamDashClientMod.EMsg.ClientItemAnnouncements with Double = js.native
  /* 801 */ val ClientJoinChat: typings.steamDashClient.steamDashClientMod.EMsg.ClientJoinChat with Double = js.native
  /* 9601 */ val ClientKickPlayingSession: typings.steamDashClient.steamDashClientMod.EMsg.ClientKickPlayingSession with Double = js.native
  /* 5416 */ val ClientLBSFindOrCreateLB: typings.steamDashClient.steamDashClientMod.EMsg.ClientLBSFindOrCreateLB with Double = js.native
  /* 5417 */ val ClientLBSFindOrCreateLBResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientLBSFindOrCreateLBResponse with Double = js.native
  /* 5418 */ val ClientLBSGetLBEntries: typings.steamDashClient.steamDashClientMod.EMsg.ClientLBSGetLBEntries with Double = js.native
  /* 5419 */ val ClientLBSGetLBEntriesResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientLBSGetLBEntriesResponse with Double = js.native
  /* 5414 */ val ClientLBSSetScore: typings.steamDashClient.steamDashClientMod.EMsg.ClientLBSSetScore with Double = js.native
  /* 5415 */ val ClientLBSSetScoreResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientLBSSetScoreResponse with Double = js.native
  /* 5529 */ val ClientLBSSetUGC: typings.steamDashClient.steamDashClientMod.EMsg.ClientLBSSetUGC with Double = js.native
  /* 5530 */ val ClientLBSSetUGCResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientLBSSetUGCResponse with Double = js.native
  /* 780 */ val ClientLicenseList: typings.steamDashClient.steamDashClientMod.EMsg.ClientLicenseList with Double = js.native
  /* 706 */ val ClientLogOff: typings.steamDashClient.steamDashClientMod.EMsg.ClientLogOff with Double = js.native
  /* 751 */ val ClientLogOnResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientLogOnResponse with Double = js.native
  /* 803 */ val ClientLogOnWithCredentials_Deprecated: typings.steamDashClient.steamDashClientMod.EMsg.ClientLogOnWithCredentials_Deprecated with Double = js.native
  /* 5465 */ val ClientLogOnWithHash_Deprecated: typings.steamDashClient.steamDashClientMod.EMsg.ClientLogOnWithHash_Deprecated with Double = js.native
  /* 701 */ val ClientLogOn_Deprecated: typings.steamDashClient.steamDashClientMod.EMsg.ClientLogOn_Deprecated with Double = js.native
  /* 757 */ val ClientLoggedOff: typings.steamDashClient.steamDashClientMod.EMsg.ClientLoggedOff with Double = js.native
  /* 5514 */ val ClientLogon: typings.steamDashClient.steamDashClientMod.EMsg.ClientLogon with Double = js.native
  /* 5559 */ val ClientLogonGameServer: typings.steamDashClient.steamDashClientMod.EMsg.ClientLogonGameServer with Double = js.native
  /* 898 */ val ClientLookupKey: typings.steamDashClient.steamDashClientMod.EMsg.ClientLookupKey with Double = js.native
  /* 899 */ val ClientLookupKeyResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientLookupKeyResponse with Double = js.native
  /* 5818 */ val ClientMDSGetDepotManifest: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSGetDepotManifest with Double = js.native
  /* 5820 */ val ClientMDSGetDepotManifestChunk: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSGetDepotManifestChunk with Double = js.native
  /* 5819 */ val ClientMDSGetDepotManifestResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSGetDepotManifestResponse with Double = js.native
  /* 5842 */ val ClientMDSGetPrevDepotBuild: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSGetPrevDepotBuild with Double = js.native
  /* 5843 */ val ClientMDSGetPrevDepotBuildResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSGetPrevDepotBuildResponse with Double = js.native
  /* 5806 */ val ClientMDSHeartbeat: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSHeartbeat with Double = js.native
  /* 5809 */ val ClientMDSInitDepotBuildRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSInitDepotBuildRequest with Double = js.native
  /* 5810 */ val ClientMDSInitDepotBuildResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSInitDepotBuildResponse with Double = js.native
  /* 5816 */ val ClientMDSInitWorkshopBuildRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSInitWorkshopBuildRequest with Double = js.native
  /* 5817 */ val ClientMDSInitWorkshopBuildResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSInitWorkshopBuildResponse with Double = js.native
  /* 5801 */ val ClientMDSLoginRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSLoginRequest with Double = js.native
  /* 5802 */ val ClientMDSLoginResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSLoginResponse with Double = js.native
  /* 5838 */ val ClientMDSRegisterAppBuild: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSRegisterAppBuild with Double = js.native
  /* 5839 */ val ClientMDSRegisterAppBuildResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSRegisterAppBuildResponse with Double = js.native
  /* 5840 */ val ClientMDSSetAppBuildLive: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSSetAppBuildLive with Double = js.native
  /* 5841 */ val ClientMDSSetAppBuildLiveResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSSetAppBuildLiveResponse with Double = js.native
  /* 5845 */ val ClientMDSSignInstallScript: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSSignInstallScript with Double = js.native
  /* 5846 */ val ClientMDSSignInstallScriptResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSSignInstallScriptResponse with Double = js.native
  /* 5805 */ val ClientMDSTransmitManifestDataChunk: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSTransmitManifestDataChunk with Double = js.native
  /* 5807 */ val ClientMDSUploadDepotChunks: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSUploadDepotChunks with Double = js.native
  /* 5808 */ val ClientMDSUploadDepotChunksResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSUploadDepotChunksResponse with Double = js.native
  /* 5803 */ val ClientMDSUploadManifestRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSUploadManifestRequest with Double = js.native
  /* 5804 */ val ClientMDSUploadManifestResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSUploadManifestResponse with Double = js.native
  /* 5823 */ val ClientMDSUploadRateTest: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSUploadRateTest with Double = js.native
  /* 5824 */ val ClientMDSUploadRateTestResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMDSUploadRateTestResponse with Double = js.native
  /* 6601 */ val ClientMMSCreateLobby: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSCreateLobby with Double = js.native
  /* 6602 */ val ClientMMSCreateLobbyResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSCreateLobbyResponse with Double = js.native
  /* 6622 */ val ClientMMSFlushFrenemyListCache: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSFlushFrenemyListCache with Double = js.native
  /* 6623 */ val ClientMMSFlushFrenemyListCacheResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSFlushFrenemyListCacheResponse with Double = js.native
  /* 6611 */ val ClientMMSGetLobbyData: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSGetLobbyData with Double = js.native
  /* 6607 */ val ClientMMSGetLobbyList: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSGetLobbyList with Double = js.native
  /* 6608 */ val ClientMMSGetLobbyListResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSGetLobbyListResponse with Double = js.native
  /* 6621 */ val ClientMMSInviteToLobby: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSInviteToLobby with Double = js.native
  /* 6603 */ val ClientMMSJoinLobby: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSJoinLobby with Double = js.native
  /* 6604 */ val ClientMMSJoinLobbyResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSJoinLobbyResponse with Double = js.native
  /* 6605 */ val ClientMMSLeaveLobby: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSLeaveLobby with Double = js.native
  /* 6606 */ val ClientMMSLeaveLobbyResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSLeaveLobbyResponse with Double = js.native
  /* 6614 */ val ClientMMSLobbyChatMsg: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSLobbyChatMsg with Double = js.native
  /* 6612 */ val ClientMMSLobbyData: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSLobbyData with Double = js.native
  /* 6618 */ val ClientMMSLobbyGameServerSet: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSLobbyGameServerSet with Double = js.native
  /* 6613 */ val ClientMMSSendLobbyChatMsg: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSSendLobbyChatMsg with Double = js.native
  /* 6609 */ val ClientMMSSetLobbyData: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSSetLobbyData with Double = js.native
  /* 6610 */ val ClientMMSSetLobbyDataResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSSetLobbyDataResponse with Double = js.native
  /* 6617 */ val ClientMMSSetLobbyGameServer: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSSetLobbyGameServer with Double = js.native
  /* 6624 */ val ClientMMSSetLobbyLinked: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSSetLobbyLinked with Double = js.native
  /* 6615 */ val ClientMMSSetLobbyOwner: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSSetLobbyOwner with Double = js.native
  /* 6616 */ val ClientMMSSetLobbyOwnerResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSSetLobbyOwnerResponse with Double = js.native
  /* 6619 */ val ClientMMSUserJoinedLobby: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSUserJoinedLobby with Double = js.native
  /* 6620 */ val ClientMMSUserLeftLobby: typings.steamDashClient.steamDashClientMod.EMsg.ClientMMSUserLeftLobby with Double = js.native
  /* 5420 */ val ClientMarketingMessageUpdate: typings.steamDashClient.steamDashClientMod.EMsg.ClientMarketingMessageUpdate with Double = js.native
  /* 5510 */ val ClientMarketingMessageUpdate2: typings.steamDashClient.steamDashClientMod.EMsg.ClientMarketingMessageUpdate2 with Double = js.native
  /* 5504 */ val ClientMicroTxnAuthRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientMicroTxnAuthRequest with Double = js.native
  /* 5505 */ val ClientMicroTxnAuthorize: typings.steamDashClient.steamDashClientMod.EMsg.ClientMicroTxnAuthorize with Double = js.native
  /* 5506 */ val ClientMicroTxnAuthorizeResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientMicroTxnAuthorizeResponse with Double = js.native
  /* 765 */ val ClientNOP: typings.steamDashClient.steamDashClientMod.EMsg.ClientNOP with Double = js.native
  /* 839 */ val ClientNatTraversalStatEvent: typings.steamDashClient.steamDashClientMod.EMsg.ClientNatTraversalStatEvent with Double = js.native
  /* 5463 */ val ClientNewLoginKey: typings.steamDashClient.steamDashClientMod.EMsg.ClientNewLoginKey with Double = js.native
  /* 5464 */ val ClientNewLoginKeyAccepted: typings.steamDashClient.steamDashClientMod.EMsg.ClientNewLoginKeyAccepted with Double = js.native
  /* 771 */ val ClientNewsUpdate: typings.steamDashClient.steamDashClientMod.EMsg.ClientNewsUpdate with Double = js.native
  /* 707 */ val ClientNoUDPConnectivity: typings.steamDashClient.steamDashClientMod.EMsg.ClientNoUDPConnectivity with Double = js.native
  /* 756 */ val ClientNotLoggedOnDeprecated: typings.steamDashClient.steamDashClientMod.EMsg.ClientNotLoggedOnDeprecated with Double = js.native
  /* 5490 */ val ClientOGSBeginSession: typings.steamDashClient.steamDashClientMod.EMsg.ClientOGSBeginSession with Double = js.native
  /* 5491 */ val ClientOGSBeginSessionResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientOGSBeginSessionResponse with Double = js.native
  /* 5492 */ val ClientOGSEndSession: typings.steamDashClient.steamDashClientMod.EMsg.ClientOGSEndSession with Double = js.native
  /* 5493 */ val ClientOGSEndSessionResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientOGSEndSessionResponse with Double = js.native
  /* 5581 */ val ClientOGSGameServerPingSample: typings.steamDashClient.steamDashClientMod.EMsg.ClientOGSGameServerPingSample with Double = js.native
  /* 5557 */ val ClientOGSReportBug: typings.steamDashClient.steamDashClientMod.EMsg.ClientOGSReportBug with Double = js.native
  /* 5556 */ val ClientOGSReportString: typings.steamDashClient.steamDashClientMod.EMsg.ClientOGSReportString with Double = js.native
  /* 5494 */ val ClientOGSWriteRow: typings.steamDashClient.steamDashClientMod.EMsg.ClientOGSWriteRow with Double = js.native
  /* 5435 */ val ClientP2PConnectionFailInfo: typings.steamDashClient.steamDashClientMod.EMsg.ClientP2PConnectionFailInfo with Double = js.native
  /* 5434 */ val ClientP2PConnectionInfo: typings.steamDashClient.steamDashClientMod.EMsg.ClientP2PConnectionInfo with Double = js.native
  /* 813 */ val ClientP2PIntroducerMessage: typings.steamDashClient.steamDashClientMod.EMsg.ClientP2PIntroducerMessage with Double = js.native
  /* 8905 */ val ClientPICSAccessTokenRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientPICSAccessTokenRequest with Double = js.native
  /* 8906 */ val ClientPICSAccessTokenResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientPICSAccessTokenResponse with Double = js.native
  /* 8901 */ val ClientPICSChangesSinceRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientPICSChangesSinceRequest with Double = js.native
  /* 8902 */ val ClientPICSChangesSinceResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientPICSChangesSinceResponse with Double = js.native
  /* 8903 */ val ClientPICSProductInfoRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientPICSProductInfoRequest with Double = js.native
  /* 8904 */ val ClientPICSProductInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientPICSProductInfoResponse with Double = js.native
  /* 833 */ val ClientPackageInfoRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientPackageInfoRequest with Double = js.native
  /* 834 */ val ClientPackageInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientPackageInfoResponse with Double = js.native
  /* 148 */ val ClientPackageVersions: typings.steamDashClient.steamDashClientMod.EMsg.ClientPackageVersions with Double = js.native
  /* 5457 */ val ClientPasswordChange3: typings.steamDashClient.steamDashClientMod.EMsg.ClientPasswordChange3 with Double = js.native
  /* 805 */ val ClientPasswordChangeResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientPasswordChangeResponse with Double = js.native
  /* 5584 */ val ClientPersonaChangeResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientPersonaChangeResponse with Double = js.native
  /* 766 */ val ClientPersonaState: typings.steamDashClient.steamDashClientMod.EMsg.ClientPersonaState with Double = js.native
  /* 5459 */ val ClientPersonalQAChange3: typings.steamDashClient.steamDashClientMod.EMsg.ClientPersonalQAChange3 with Double = js.native
  /* 764 */ val ClientPing: typings.steamDashClient.steamDashClientMod.EMsg.ClientPing with Double = js.native
  /* 712 */ val ClientPingResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientPingResponse with Double = js.native
  /* 5587 */ val ClientPlayerNicknameList: typings.steamDashClient.steamDashClientMod.EMsg.ClientPlayerNicknameList with Double = js.native
  /* 9600 */ val ClientPlayingSessionState: typings.steamDashClient.steamDashClientMod.EMsg.ClientPlayingSessionState with Double = js.native
  /* 763 */ val ClientPurchaseResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientPurchaseResponse with Double = js.native
  /* 746 */ val ClientPurchaseWithMachineID: typings.steamDashClient.steamDashClientMod.EMsg.ClientPurchaseWithMachineID with Double = js.native
  /* 5539 */ val ClientReadMachineAuth: typings.steamDashClient.steamDashClientMod.EMsg.ClientReadMachineAuth with Double = js.native
  /* 5540 */ val ClientReadMachineAuthResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientReadMachineAuthResponse with Double = js.native
  /* 741 */ val ClientRedeemGuestPass: typings.steamDashClient.steamDashClientMod.EMsg.ClientRedeemGuestPass with Double = js.native
  /* 797 */ val ClientRedeemGuestPassResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientRedeemGuestPassResponse with Double = js.native
  /* 5502 */ val ClientRegisterAuthTicketWithCM: typings.steamDashClient.steamDashClientMod.EMsg.ClientRegisterAuthTicketWithCM with Double = js.native
  /* 743 */ val ClientRegisterKey: typings.steamDashClient.steamDashClientMod.EMsg.ClientRegisterKey with Double = js.native
  /* 5469 */ val ClientRegisterOEMMachine: typings.steamDashClient.steamDashClientMod.EMsg.ClientRegisterOEMMachine with Double = js.native
  /* 5470 */ val ClientRegisterOEMMachineResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientRegisterOEMMachineResponse with Double = js.native
  /* 714 */ val ClientRemoveFriend: typings.steamDashClient.steamDashClientMod.EMsg.ClientRemoveFriend with Double = js.native
  /* 5517 */ val ClientReportOverlayDetourFailure: typings.steamDashClient.steamDashClientMod.EMsg.ClientReportOverlayDetourFailure with Double = js.native
  /* 5549 */ val ClientRequestAccountData: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestAccountData with Double = js.native
  /* 5550 */ val ClientRequestAccountDataResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestAccountDataResponse with Double = js.native
  /* 5431 */ val ClientRequestAuthList: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestAuthList with Double = js.native
  /* 5454 */ val ClientRequestChangeMail: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestChangeMail with Double = js.native
  /* 5455 */ val ClientRequestChangeMailResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestChangeMailResponse with Double = js.native
  /* 5583 */ val ClientRequestCommentNotifications: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestCommentNotifications with Double = js.native
  /* 5526 */ val ClientRequestEncryptedAppTicket: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestEncryptedAppTicket with Double = js.native
  /* 5527 */ val ClientRequestEncryptedAppTicketResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestEncryptedAppTicketResponse with Double = js.native
  /* 5401 */ val ClientRequestForgottenPasswordEmail: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestForgottenPasswordEmail with Double = js.native
  /* 5461 */ val ClientRequestForgottenPasswordEmail3: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestForgottenPasswordEmail3 with Double = js.native
  /* 5402 */ val ClientRequestForgottenPasswordEmailResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestForgottenPasswordEmailResponse with Double = js.native
  /* 5572 */ val ClientRequestFreeLicense: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestFreeLicense with Double = js.native
  /* 5573 */ val ClientRequestFreeLicenseResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestFreeLicenseResponse with Double = js.native
  /* 815 */ val ClientRequestFriendData: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestFriendData with Double = js.native
  /* 554 */ val ClientRequestFriendship: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestFriendship with Double = js.native
  /* 5577 */ val ClientRequestItemAnnouncements: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestItemAnnouncements with Double = js.native
  /* 5541 */ val ClientRequestMachineAuth: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestMachineAuth with Double = js.native
  /* 5542 */ val ClientRequestMachineAuthResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestMachineAuthResponse with Double = js.native
  /* 5590 */ val ClientRequestOAuthTokenForApp: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestOAuthTokenForApp with Double = js.native
  /* 5591 */ val ClientRequestOAuthTokenForAppResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestOAuthTokenForAppResponse with Double = js.native
  /* 5448 */ val ClientRequestValidationMail: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestValidationMail with Double = js.native
  /* 5449 */ val ClientRequestValidationMailResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestValidationMailResponse with Double = js.native
  /* 5585 */ val ClientRequestWebAPIAuthenticateUserNonce: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestWebAPIAuthenticateUserNonce with Double = js.native
  /* 5586 */ val ClientRequestWebAPIAuthenticateUserNonceResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestWebAPIAuthenticateUserNonceResponse with Double = js.native
  /* 5480 */ val ClientRequestedClientStats: typings.steamDashClient.steamDashClientMod.EMsg.ClientRequestedClientStats with Double = js.native
  /* 5404 */ val ClientResetForgottenPassword: typings.steamDashClient.steamDashClientMod.EMsg.ClientResetForgottenPassword with Double = js.native
  /* 5460 */ val ClientResetForgottenPassword3: typings.steamDashClient.steamDashClientMod.EMsg.ClientResetForgottenPassword3 with Double = js.native
  /* 5551 */ val ClientResetForgottenPassword4: typings.steamDashClient.steamDashClientMod.EMsg.ClientResetForgottenPassword4 with Double = js.native
  /* 5405 */ val ClientResetForgottenPasswordResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientResetForgottenPasswordResponse with Double = js.native
  /* 846 */ val ClientResetPassword: typings.steamDashClient.steamDashClientMod.EMsg.ClientResetPassword with Double = js.native
  /* 849 */ val ClientResetPasswordResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientResetPasswordResponse with Double = js.native
  /* 7503 */ val ClientRichPresenceInfo: typings.steamDashClient.steamDashClientMod.EMsg.ClientRichPresenceInfo with Double = js.native
  /* 7502 */ val ClientRichPresenceRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientRichPresenceRequest with Double = js.native
  /* 7501 */ val ClientRichPresenceUpload: typings.steamDashClient.steamDashClientMod.EMsg.ClientRichPresenceUpload with Double = js.native
  /* 5543 */ val ClientScreenshotsChanged: typings.steamDashClient.steamDashClientMod.EMsg.ClientScreenshotsChanged with Double = js.native
  /* 892 */ val ClientSecretQAChangeResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientSecretQAChangeResponse with Double = js.native
  /* 739 */ val ClientSendGuestPass: typings.steamDashClient.steamDashClientMod.EMsg.ClientSendGuestPass with Double = js.native
  /* 795 */ val ClientSendGuestPassResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientSendGuestPassResponse with Double = js.native
  /* 5558 */ val ClientSentLogs: typings.steamDashClient.steamDashClientMod.EMsg.ClientSentLogs with Double = js.native
  /* 880 */ val ClientServerList: typings.steamDashClient.steamDashClientMod.EMsg.ClientServerList with Double = js.native
  /* 5500 */ val ClientServerUnavailable: typings.steamDashClient.steamDashClientMod.EMsg.ClientServerUnavailable with Double = js.native
  /* 5501 */ val ClientServersAvailable: typings.steamDashClient.steamDashClientMod.EMsg.ClientServersAvailable with Double = js.native
  /* 831 */ val ClientServiceCall: typings.steamDashClient.steamDashClientMod.EMsg.ClientServiceCall with Double = js.native
  /* 832 */ val ClientServiceCallResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientServiceCallResponse with Double = js.native
  /* 5594 */ val ClientServiceMethod: typings.steamDashClient.steamDashClientMod.EMsg.ClientServiceMethod with Double = js.native
  /* 5595 */ val ClientServiceMethodResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientServiceMethodResponse with Double = js.native
  /* 830 */ val ClientServiceModule: typings.steamDashClient.steamDashClientMod.EMsg.ClientServiceModule with Double = js.native
  /* 136 */ val ClientSessionEnd: typings.steamDashClient.steamDashClientMod.EMsg.ClientSessionEnd with Double = js.native
  /* 135 */ val ClientSessionStart: typings.steamDashClient.steamDashClientMod.EMsg.ClientSessionStart with Double = js.native
  /* 850 */ val ClientSessionToken: typings.steamDashClient.steamDashClientMod.EMsg.ClientSessionToken with Double = js.native
  /* 137 */ val ClientSessionUpdate: typings.steamDashClient.steamDashClientMod.EMsg.ClientSessionUpdate with Double = js.native
  /* 137 */ val ClientSessionUpdateAuthTicket: typings.steamDashClient.steamDashClientMod.EMsg.ClientSessionUpdateAuthTicket with Double = js.native
  /* 5524 */ val ClientSetClientAppUpdateState: typings.steamDashClient.steamDashClientMod.EMsg.ClientSetClientAppUpdateState with Double = js.native
  /* 5525 */ val ClientSetClientAppUpdateStateResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientSetClientAppUpdateStateResponse with Double = js.native
  /* 755 */ val ClientSetHeartbeatRate: typings.steamDashClient.steamDashClientMod.EMsg.ClientSetHeartbeatRate with Double = js.native
  /* 855 */ val ClientSetIgnoreFriend: typings.steamDashClient.steamDashClientMod.EMsg.ClientSetIgnoreFriend with Double = js.native
  /* 856 */ val ClientSetIgnoreFriendResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientSetIgnoreFriendResponse with Double = js.native
  /* 9400 */ val ClientSharedLibraryBase: typings.steamDashClient.steamDashClientMod.EMsg.ClientSharedLibraryBase with Double = js.native
  /* 9405 */ val ClientSharedLibraryLockStatus: typings.steamDashClient.steamDashClientMod.EMsg.ClientSharedLibraryLockStatus with Double = js.native
  /* 9406 */ val ClientSharedLibraryStopPlaying: typings.steamDashClient.steamDashClientMod.EMsg.ClientSharedLibraryStopPlaying with Double = js.native
  /* 9403 */ val ClientSharedLicensesLockStatus: typings.steamDashClient.steamDashClientMod.EMsg.ClientSharedLicensesLockStatus with Double = js.native
  /* 9404 */ val ClientSharedLicensesStopPlaying: typings.steamDashClient.steamDashClientMod.EMsg.ClientSharedLicensesStopPlaying with Double = js.native
  /* 5433 */ val ClientStat: typings.steamDashClient.steamDashClientMod.EMsg.ClientStat with Double = js.native
  /* 5482 */ val ClientStat2: typings.steamDashClient.steamDashClientMod.EMsg.ClientStat2 with Double = js.native
  /* 5481 */ val ClientStat2Int32: typings.steamDashClient.steamDashClientMod.EMsg.ClientStat2Int32 with Double = js.native
  /* 5467 */ val ClientStatsUpdated: typings.steamDashClient.steamDashClientMod.EMsg.ClientStatsUpdated with Double = js.native
  /* 842 */ val ClientSteamUsageEvent: typings.steamDashClient.steamDashClientMod.EMsg.ClientSteamUsageEvent with Double = js.native
  /* 820 */ val ClientStoreUserStats: typings.steamDashClient.steamDashClientMod.EMsg.ClientStoreUserStats with Double = js.native
  /* 5466 */ val ClientStoreUserStats2: typings.steamDashClient.steamDashClientMod.EMsg.ClientStoreUserStats2 with Double = js.native
  /* 821 */ val ClientStoreUserStatsResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientStoreUserStatsResponse with Double = js.native
  /* 5512 */ val ClientSubscribeToPersonaFeed: typings.steamDashClient.steamDashClientMod.EMsg.ClientSubscribeToPersonaFeed with Double = js.native
  /* 726 */ val ClientSystemIM: typings.steamDashClient.steamDashClientMod.EMsg.ClientSystemIM with Double = js.native
  /* 727 */ val ClientSystemIMAck: typings.steamDashClient.steamDashClientMod.EMsg.ClientSystemIMAck with Double = js.native
  /* 5429 */ val ClientTicketAuthComplete: typings.steamDashClient.steamDashClientMod.EMsg.ClientTicketAuthComplete with Double = js.native
  /* 5452 */ val ClientToGC: typings.steamDashClient.steamDashClientMod.EMsg.ClientToGC with Double = js.native
  /* 7301 */ val ClientUCMAddScreenshot: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMAddScreenshot with Double = js.native
  /* 7302 */ val ClientUCMAddScreenshotResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMAddScreenshotResponse with Double = js.native
  /* 7315 */ val ClientUCMDeletePublishedFile: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMDeletePublishedFile with Double = js.native
  /* 7316 */ val ClientUCMDeletePublishedFileResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMDeletePublishedFileResponse with Double = js.native
  /* 7309 */ val ClientUCMDeleteScreenshot: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMDeleteScreenshot with Double = js.native
  /* 7310 */ val ClientUCMDeleteScreenshotResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMDeleteScreenshotResponse with Double = js.native
  /* 7366 */ val ClientUCMEnumeratePublishedFilesByUserAction: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMEnumeratePublishedFilesByUserAction with Double = js.native
  /* 7367 */ val ClientUCMEnumeratePublishedFilesByUserActionResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMEnumeratePublishedFilesByUserActionResponse with Double = js.native
  /* 7317 */ val ClientUCMEnumerateUserPublishedFiles: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMEnumerateUserPublishedFiles with Double = js.native
  /* 7318 */ val ClientUCMEnumerateUserPublishedFilesResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMEnumerateUserPublishedFilesResponse with Double = js.native
  /* 7321 */ val ClientUCMEnumerateUserSubscribedFiles: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMEnumerateUserSubscribedFiles with Double = js.native
  /* 7322 */ val ClientUCMEnumerateUserSubscribedFilesResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMEnumerateUserSubscribedFilesResponse with Double = js.native
  /* 7378 */ val ClientUCMEnumerateUserSubscribedFilesWithUpdates: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMEnumerateUserSubscribedFilesWithUpdates with Double = js.native
  /* 7379 */ val ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse with Double = js.native
  /* 7313 */ val ClientUCMGetPublishedFileDetails: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMGetPublishedFileDetails with Double = js.native
  /* 7314 */ val ClientUCMGetPublishedFileDetailsResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMGetPublishedFileDetailsResponse with Double = js.native
  /* 7360 */ val ClientUCMGetPublishedFilesForUser: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMGetPublishedFilesForUser with Double = js.native
  /* 7361 */ val ClientUCMGetPublishedFilesForUserResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMGetPublishedFilesForUserResponse with Double = js.native
  /* 7311 */ val ClientUCMPublishFile: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMPublishFile with Double = js.native
  /* 7312 */ val ClientUCMPublishFileResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMPublishFileResponse with Double = js.native
  /* 7368 */ val ClientUCMPublishedFileDeleted: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMPublishedFileDeleted with Double = js.native
  /* 7347 */ val ClientUCMPublishedFileSubscribed: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMPublishedFileSubscribed with Double = js.native
  /* 7348 */ val ClientUCMPublishedFileUnsubscribed: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMPublishedFileUnsubscribed with Double = js.native
  /* 7364 */ val ClientUCMSetUserPublishedFileAction: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMSetUserPublishedFileAction with Double = js.native
  /* 7365 */ val ClientUCMSetUserPublishedFileActionResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMSetUserPublishedFileActionResponse with Double = js.native
  /* 7319 */ val ClientUCMSubscribePublishedFile: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMSubscribePublishedFile with Double = js.native
  /* 7320 */ val ClientUCMSubscribePublishedFileResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMSubscribePublishedFileResponse with Double = js.native
  /* 7323 */ val ClientUCMUnsubscribePublishedFile: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMUnsubscribePublishedFile with Double = js.native
  /* 7324 */ val ClientUCMUnsubscribePublishedFileResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMUnsubscribePublishedFileResponse with Double = js.native
  /* 7325 */ val ClientUCMUpdatePublishedFile: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMUpdatePublishedFile with Double = js.native
  /* 7326 */ val ClientUCMUpdatePublishedFileResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUCMUpdatePublishedFileResponse with Double = js.native
  /* 7005 */ val ClientUDSInviteToGame: typings.steamDashClient.steamDashClientMod.EMsg.ClientUDSInviteToGame with Double = js.native
  /* 7002 */ val ClientUDSP2PSessionEnded: typings.steamDashClient.steamDashClientMod.EMsg.ClientUDSP2PSessionEnded with Double = js.native
  /* 7001 */ val ClientUDSP2PSessionStarted: typings.steamDashClient.steamDashClientMod.EMsg.ClientUDSP2PSessionStarted with Double = js.native
  /* 5219 */ val ClientUFSDeleteFileRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSDeleteFileRequest with Double = js.native
  /* 5220 */ val ClientUFSDeleteFileResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSDeleteFileResponse with Double = js.native
  /* 5212 */ val ClientUFSDownloadChunk: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSDownloadChunk with Double = js.native
  /* 5210 */ val ClientUFSDownloadRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSDownloadRequest with Double = js.native
  /* 5211 */ val ClientUFSDownloadResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSDownloadResponse with Double = js.native
  /* 5206 */ val ClientUFSGetFileListForApp: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSGetFileListForApp with Double = js.native
  /* 5207 */ val ClientUFSGetFileListForAppResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSGetFileListForAppResponse with Double = js.native
  /* 5230 */ val ClientUFSGetSingleFileInfo: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSGetSingleFileInfo with Double = js.native
  /* 5231 */ val ClientUFSGetSingleFileInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSGetSingleFileInfoResponse with Double = js.native
  /* 5226 */ val ClientUFSGetUGCDetails: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSGetUGCDetails with Double = js.native
  /* 5227 */ val ClientUFSGetUGCDetailsResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSGetUGCDetailsResponse with Double = js.native
  /* 5213 */ val ClientUFSLoginRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSLoginRequest with Double = js.native
  /* 5214 */ val ClientUFSLoginResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSLoginResponse with Double = js.native
  /* 5232 */ val ClientUFSShareFile: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSShareFile with Double = js.native
  /* 5233 */ val ClientUFSShareFileResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSShareFileResponse with Double = js.native
  /* 5216 */ val ClientUFSTransferHeartbeat: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSTransferHeartbeat with Double = js.native
  /* 5204 */ val ClientUFSUploadFileChunk: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSUploadFileChunk with Double = js.native
  /* 5205 */ val ClientUFSUploadFileFinished: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSUploadFileFinished with Double = js.native
  /* 5202 */ val ClientUFSUploadFileRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSUploadFileRequest with Double = js.native
  /* 5203 */ val ClientUFSUploadFileResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUFSUploadFileResponse with Double = js.native
  /* 7901 */ val ClientUGSGetGlobalStats: typings.steamDashClient.steamDashClientMod.EMsg.ClientUGSGetGlobalStats with Double = js.native
  /* 7902 */ val ClientUGSGetGlobalStatsResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUGSGetGlobalStatsResponse with Double = js.native
  /* 5522 */ val ClientUninstallClientApp: typings.steamDashClient.steamDashClientMod.EMsg.ClientUninstallClientApp with Double = js.native
  /* 5523 */ val ClientUninstallClientAppResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUninstallClientAppResponse with Double = js.native
  /* 9507 */ val ClientUnlockStreaming: typings.steamDashClient.steamDashClientMod.EMsg.ClientUnlockStreaming with Double = js.native
  /* 9508 */ val ClientUnlockStreamingResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUnlockStreamingResponse with Double = js.native
  /* 811 */ val ClientUpdateChatMetadata: typings.steamDashClient.steamDashClientMod.EMsg.ClientUpdateChatMetadata with Double = js.native
  /* 798 */ val ClientUpdateGuestPassesList: typings.steamDashClient.steamDashClientMod.EMsg.ClientUpdateGuestPassesList with Double = js.native
  /* 5537 */ val ClientUpdateMachineAuth: typings.steamDashClient.steamDashClientMod.EMsg.ClientUpdateMachineAuth with Double = js.native
  /* 5538 */ val ClientUpdateMachineAuthResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientUpdateMachineAuthResponse with Double = js.native
  /* 5411 */ val ClientUpdateUserGameInfo: typings.steamDashClient.steamDashClientMod.EMsg.ClientUpdateUserGameInfo with Double = js.native
  /* 6505 */ val ClientUseLocalDeviceAuthorizations: typings.steamDashClient.steamDashClientMod.EMsg.ClientUseLocalDeviceAuthorizations with Double = js.native
  /* 5599 */ val ClientUserNotifications: typings.steamDashClient.steamDashClientMod.EMsg.ClientUserNotifications with Double = js.native
  /* 782 */ val ClientVACBanStatus: typings.steamDashClient.steamDashClientMod.EMsg.ClientVACBanStatus with Double = js.native
  /* 753 */ val ClientVACChallenge: typings.steamDashClient.steamDashClientMod.EMsg.ClientVACChallenge with Double = js.native
  /* 704 */ val ClientVACResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientVACResponse with Double = js.native
  /* 863 */ val ClientVTTCert: typings.steamDashClient.steamDashClientMod.EMsg.ClientVTTCert with Double = js.native
  /* 770 */ val ClientVacStatusQuery: typings.steamDashClient.steamDashClientMod.EMsg.ClientVacStatusQuery with Double = js.native
  /* 717 */ val ClientVacStatusResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientVacStatusResponse with Double = js.native
  /* 5598 */ val ClientVanityURLChangedNotification: typings.steamDashClient.steamDashClientMod.EMsg.ClientVanityURLChangedNotification with Double = js.native
  /* 5483 */ val ClientVerifyPassword: typings.steamDashClient.steamDashClientMod.EMsg.ClientVerifyPassword with Double = js.native
  /* 5484 */ val ClientVerifyPasswordResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientVerifyPasswordResponse with Double = js.native
  /* 9800 */ val ClientVoiceCallPreAuthorize: typings.steamDashClient.steamDashClientMod.EMsg.ClientVoiceCallPreAuthorize with Double = js.native
  /* 9801 */ val ClientVoiceCallPreAuthorizeResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientVoiceCallPreAuthorizeResponse with Double = js.native
  /* 5528 */ val ClientWalletInfoUpdate: typings.steamDashClient.steamDashClientMod.EMsg.ClientWalletInfoUpdate with Double = js.native
  /* 7382 */ val ClientWorkshopItemChangesRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientWorkshopItemChangesRequest with Double = js.native
  /* 7383 */ val ClientWorkshopItemChangesResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientWorkshopItemChangesResponse with Double = js.native
  /* 7384 */ val ClientWorkshopItemInfoRequest: typings.steamDashClient.steamDashClientMod.EMsg.ClientWorkshopItemInfoRequest with Double = js.native
  /* 7385 */ val ClientWorkshopItemInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.ClientWorkshopItemInfoResponse with Double = js.native
  /* 4140 */ val CommunityAddFriendNews: typings.steamDashClient.steamDashClientMod.EMsg.CommunityAddFriendNews with Double = js.native
  /* 4155 */ val CommunityDeleteUserNews: typings.steamDashClient.steamDashClientMod.EMsg.CommunityDeleteUserNews with Double = js.native
  /* 4173 */ val CommunityGetUserFriendNews: typings.steamDashClient.steamDashClientMod.EMsg.CommunityGetUserFriendNews with Double = js.native
  /* 227 */ val ContentDescriptionUpdate: typings.steamDashClient.steamDashClientMod.EMsg.ContentDescriptionUpdate with Double = js.native
  /* 5611 */ val DFSAcceptedResponse: typings.steamDashClient.steamDashClientMod.EMsg.DFSAcceptedResponse with Double = js.native
  /* 5603 */ val DFSConnection: typings.steamDashClient.steamDashClientMod.EMsg.DFSConnection with Double = js.native
  /* 5604 */ val DFSConnectionReply: typings.steamDashClient.steamDashClientMod.EMsg.DFSConnectionReply with Double = js.native
  /* 5601 */ val DFSGetFile: typings.steamDashClient.steamDashClientMod.EMsg.DFSGetFile with Double = js.native
  /* 5610 */ val DFSGetFileFromServer: typings.steamDashClient.steamDashClientMod.EMsg.DFSGetFileFromServer with Double = js.native
  /* 5602 */ val DFSInstallLocalFile: typings.steamDashClient.steamDashClientMod.EMsg.DFSInstallLocalFile with Double = js.native
  /* 5608 */ val DFSPurgeFile: typings.steamDashClient.steamDashClientMod.EMsg.DFSPurgeFile with Double = js.native
  /* 5613 */ val DFSRecvTransmitFile: typings.steamDashClient.steamDashClientMod.EMsg.DFSRecvTransmitFile with Double = js.native
  /* 5612 */ val DFSRequestPingback: typings.steamDashClient.steamDashClientMod.EMsg.DFSRequestPingback with Double = js.native
  /* 5615 */ val DFSRequestPingback2: typings.steamDashClient.steamDashClientMod.EMsg.DFSRequestPingback2 with Double = js.native
  /* 5616 */ val DFSResponsePingback2: typings.steamDashClient.steamDashClientMod.EMsg.DFSResponsePingback2 with Double = js.native
  /* 5609 */ val DFSRouteFile: typings.steamDashClient.steamDashClientMod.EMsg.DFSRouteFile with Double = js.native
  /* 5620 */ val DFSRouteFileResponse: typings.steamDashClient.steamDashClientMod.EMsg.DFSRouteFileResponse with Double = js.native
  /* 5614 */ val DFSSendTransmitFile: typings.steamDashClient.steamDashClientMod.EMsg.DFSSendTransmitFile with Double = js.native
  /* 5618 */ val DFSStartTransfer: typings.steamDashClient.steamDashClientMod.EMsg.DFSStartTransfer with Double = js.native
  /* 5619 */ val DFSTransferComplete: typings.steamDashClient.steamDashClientMod.EMsg.DFSTransferComplete with Double = js.native
  /* 1614 */ val DPAccountCreationStats: typings.steamDashClient.steamDashClientMod.EMsg.DPAccountCreationStats with Double = js.native
  /* 1613 */ val DPAchievementStats: typings.steamDashClient.steamDashClientMod.EMsg.DPAchievementStats with Double = js.native
  /* 1607 */ val DPBlockingStats: typings.steamDashClient.steamDashClientMod.EMsg.DPBlockingStats with Double = js.native
  /* 1612 */ val DPCloudStats: typings.steamDashClient.steamDashClientMod.EMsg.DPCloudStats with Double = js.native
  /* 1618 */ val DPDownloadRateStatistics: typings.steamDashClient.steamDashClientMod.EMsg.DPDownloadRateStatistics with Double = js.native
  /* 1619 */ val DPFacebookStatistics: typings.steamDashClient.steamDashClientMod.EMsg.DPFacebookStatistics with Double = js.native
  /* 1602 */ val DPGamePlayedStats: typings.steamDashClient.steamDashClientMod.EMsg.DPGamePlayedStats with Double = js.native
  /* 1617 */ val DPGameServersPlayersStats: typings.steamDashClient.steamDashClientMod.EMsg.DPGameServersPlayersStats with Double = js.native
  /* 1615 */ val DPGetPlayerCount: typings.steamDashClient.steamDashClientMod.EMsg.DPGetPlayerCount with Double = js.native
  /* 1616 */ val DPGetPlayerCountResponse: typings.steamDashClient.steamDashClientMod.EMsg.DPGetPlayerCountResponse with Double = js.native
  /* 1608 */ val DPNatTraversalStats: typings.steamDashClient.steamDashClientMod.EMsg.DPNatTraversalStats with Double = js.native
  /* 1628 */ val DPPartnerMicroTxns: typings.steamDashClient.steamDashClientMod.EMsg.DPPartnerMicroTxns with Double = js.native
  /* 1629 */ val DPPartnerMicroTxnsResponse: typings.steamDashClient.steamDashClientMod.EMsg.DPPartnerMicroTxnsResponse with Double = js.native
  /* 1601 */ val DPSetPublishingState: typings.steamDashClient.steamDashClientMod.EMsg.DPSetPublishingState with Double = js.native
  /* 1609 */ val DPSteamUsageEvent: typings.steamDashClient.steamDashClientMod.EMsg.DPSteamUsageEvent with Double = js.native
  /* 1624 */ val DPStoreSaleStatistics: typings.steamDashClient.steamDashClientMod.EMsg.DPStoreSaleStatistics with Double = js.native
  /* 1604 */ val DPStreamingUniquePlayersStat: typings.steamDashClient.steamDashClientMod.EMsg.DPStreamingUniquePlayersStat with Double = js.native
  /* 1603 */ val DPUniquePlayersStat: typings.steamDashClient.steamDashClientMod.EMsg.DPUniquePlayersStat with Double = js.native
  /* 1626 */ val DPUpdateContentEvent: typings.steamDashClient.steamDashClientMod.EMsg.DPUpdateContentEvent with Double = js.native
  /* 1631 */ val DPVRUniquePlayersStat: typings.steamDashClient.steamDashClientMod.EMsg.DPVRUniquePlayersStat with Double = js.native
  /* 1606 */ val DPVacBanStats: typings.steamDashClient.steamDashClientMod.EMsg.DPVacBanStats with Double = js.native
  /* 1611 */ val DPVacCafeBanStats: typings.steamDashClient.steamDashClientMod.EMsg.DPVacCafeBanStats with Double = js.native
  /* 1610 */ val DPVacCertBanStats: typings.steamDashClient.steamDashClientMod.EMsg.DPVacCertBanStats with Double = js.native
  /* 1605 */ val DPVacInfractionStats: typings.steamDashClient.steamDashClientMod.EMsg.DPVacInfractionStats with Double = js.native
  /* 640 */ val DRMAdminUpdate: typings.steamDashClient.steamDashClientMod.EMsg.DRMAdminUpdate with Double = js.native
  /* 641 */ val DRMAdminUpdateResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMAdminUpdateResponse with Double = js.native
  /* 628 */ val DRMBuildBlobRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMBuildBlobRequest with Double = js.native
  /* 629 */ val DRMBuildBlobResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMBuildBlobResponse with Double = js.native
  /* 637 */ val DRMDetailsReportRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMDetailsReportRequest with Double = js.native
  /* 638 */ val DRMDetailsReportResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMDetailsReportResponse with Double = js.native
  /* 645 */ val DRMEmptyGuidCache: typings.steamDashClient.steamDashClientMod.EMsg.DRMEmptyGuidCache with Double = js.native
  /* 646 */ val DRMEmptyGuidCacheResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMEmptyGuidCacheResponse with Double = js.native
  /* 639 */ val DRMProcessFile: typings.steamDashClient.steamDashClientMod.EMsg.DRMProcessFile with Double = js.native
  /* 644 */ val DRMProcessFileResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMProcessFileResponse with Double = js.native
  /* 7600 */ val DRMRange2: typings.steamDashClient.steamDashClientMod.EMsg.DRMRange2 with Double = js.native
  /* 630 */ val DRMResolveGuidRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMResolveGuidRequest with Double = js.native
  /* 631 */ val DRMResolveGuidResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMResolveGuidResponse with Double = js.native
  /* 7606 */ val DRMSFetchVersionSet: typings.steamDashClient.steamDashClientMod.EMsg.DRMSFetchVersionSet with Double = js.native
  /* 7607 */ val DRMSFetchVersionSetResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMSFetchVersionSetResponse with Double = js.native
  /* 635 */ val DRMStabilityReport: typings.steamDashClient.steamDashClientMod.EMsg.DRMStabilityReport with Double = js.native
  /* 636 */ val DRMStabilityReportResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMStabilityReportResponse with Double = js.native
  /* 642 */ val DRMSync: typings.steamDashClient.steamDashClientMod.EMsg.DRMSync with Double = js.native
  /* 643 */ val DRMSyncResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMSyncResponse with Double = js.native
  /* 633 */ val DRMVariabilityReport: typings.steamDashClient.steamDashClientMod.EMsg.DRMVariabilityReport with Double = js.native
  /* 634 */ val DRMVariabilityReportResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMVariabilityReportResponse with Double = js.native
  /* 9100 */ val DRMWorkerProcess: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcess with Double = js.native
  /* 9128 */ val DRMWorkerProcessAnalyzeFileRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessAnalyzeFileRequest with Double = js.native
  /* 9129 */ val DRMWorkerProcessAnalyzeFileResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessAnalyzeFileResponse with Double = js.native
  /* 9116 */ val DRMWorkerProcessBackfillOriginalRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessBackfillOriginalRequest with Double = js.native
  /* 9117 */ val DRMWorkerProcessBackfillOriginalResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessBackfillOriginalResponse with Double = js.native
  /* 9100 */ val DRMWorkerProcessDRMAndSign: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessDRMAndSign with Double = js.native
  /* 9101 */ val DRMWorkerProcessDRMAndSignResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessDRMAndSignResponse with Double = js.native
  /* 9114 */ val DRMWorkerProcessDescribeSecretRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessDescribeSecretRequest with Double = js.native
  /* 9115 */ val DRMWorkerProcessDescribeSecretResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessDescribeSecretResponse with Double = js.native
  /* 9126 */ val DRMWorkerProcessEvaluateCrashRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessEvaluateCrashRequest with Double = js.native
  /* 9127 */ val DRMWorkerProcessEvaluateCrashResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessEvaluateCrashResponse with Double = js.native
  /* 9112 */ val DRMWorkerProcessExamineBlobRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessExamineBlobRequest with Double = js.native
  /* 9113 */ val DRMWorkerProcessExamineBlobResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessExamineBlobResponse with Double = js.native
  /* 9124 */ val DRMWorkerProcessGetBlobRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessGetBlobRequest with Double = js.native
  /* 9125 */ val DRMWorkerProcessGetBlobResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessGetBlobResponse with Double = js.native
  /* 9108 */ val DRMWorkerProcessGetDRMGuidsFromFileRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessGetDRMGuidsFromFileRequest with Double = js.native
  /* 9109 */ val DRMWorkerProcessGetDRMGuidsFromFileResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessGetDRMGuidsFromFileResponse with Double = js.native
  /* 9132 */ val DRMWorkerProcessInstallAllRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessInstallAllRequest with Double = js.native
  /* 9133 */ val DRMWorkerProcessInstallAllResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessInstallAllResponse with Double = js.native
  /* 9104 */ val DRMWorkerProcessInstallDRMDLLRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessInstallDRMDLLRequest with Double = js.native
  /* 9105 */ val DRMWorkerProcessInstallDRMDLLResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessInstallDRMDLLResponse with Double = js.native
  /* 9110 */ val DRMWorkerProcessInstallProcessedFilesRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessInstallProcessedFilesRequest with Double = js.native
  /* 9111 */ val DRMWorkerProcessInstallProcessedFilesResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessInstallProcessedFilesResponse with Double = js.native
  /* 9106 */ val DRMWorkerProcessSecretIdStringRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessSecretIdStringRequest with Double = js.native
  /* 9107 */ val DRMWorkerProcessSecretIdStringResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessSecretIdStringResponse with Double = js.native
  /* 9122 */ val DRMWorkerProcessSplitAndInstallRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessSplitAndInstallRequest with Double = js.native
  /* 9123 */ val DRMWorkerProcessSplitAndInstallResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessSplitAndInstallResponse with Double = js.native
  /* 9102 */ val DRMWorkerProcessSteamworksInfoRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessSteamworksInfoRequest with Double = js.native
  /* 9103 */ val DRMWorkerProcessSteamworksInfoResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessSteamworksInfoResponse with Double = js.native
  /* 9130 */ val DRMWorkerProcessUnpackBlobRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessUnpackBlobRequest with Double = js.native
  /* 9131 */ val DRMWorkerProcessUnpackBlobResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessUnpackBlobResponse with Double = js.native
  /* 9118 */ val DRMWorkerProcessValidateDRMDLLRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessValidateDRMDLLRequest with Double = js.native
  /* 9119 */ val DRMWorkerProcessValidateDRMDLLResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessValidateDRMDLLResponse with Double = js.native
  /* 9120 */ val DRMWorkerProcessValidateFileRequest: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessValidateFileRequest with Double = js.native
  /* 9121 */ val DRMWorkerProcessValidateFileResponse: typings.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessValidateFileResponse with Double = js.native
  /* 1802 */ val DSSCurrentFileList: typings.steamDashClient.steamDashClientMod.EMsg.DSSCurrentFileList with Double = js.native
  /* 1801 */ val DSSNewFile: typings.steamDashClient.steamDashClientMod.EMsg.DSSNewFile with Double = js.native
  /* 1803 */ val DSSSynchList: typings.steamDashClient.steamDashClientMod.EMsg.DSSSynchList with Double = js.native
  /* 1804 */ val DSSSynchListResponse: typings.steamDashClient.steamDashClientMod.EMsg.DSSSynchListResponse with Double = js.native
  /* 1805 */ val DSSSynchSubscribe: typings.steamDashClient.steamDashClientMod.EMsg.DSSSynchSubscribe with Double = js.native
  /* 1806 */ val DSSSynchUnsubscribe: typings.steamDashClient.steamDashClientMod.EMsg.DSSSynchUnsubscribe with Double = js.native
  /* 113 */ val DestJobFailed: typings.steamDashClient.steamDashClientMod.EMsg.DestJobFailed with Double = js.native
  /* 6500 */ val DeviceAuthorizationBase: typings.steamDashClient.steamDashClientMod.EMsg.DeviceAuthorizationBase with Double = js.native
  /* 202 */ val DirRequest: typings.steamDashClient.steamDashClientMod.EMsg.DirRequest with Double = js.native
  /* 203 */ val DirResponse: typings.steamDashClient.steamDashClientMod.EMsg.DirResponse with Double = js.native
  /* 1903 */ val EPMRestartProcess: typings.steamDashClient.steamDashClientMod.EMsg.EPMRestartProcess with Double = js.native
  /* 1901 */ val EPMStartProcess: typings.steamDashClient.steamDashClientMod.EMsg.EPMStartProcess with Double = js.native
  /* 1902 */ val EPMStopProcess: typings.steamDashClient.steamDashClientMod.EMsg.EPMStopProcess with Double = js.native
  /* 7700 */ val EconBase: typings.steamDashClient.steamDashClientMod.EMsg.EconBase with Double = js.native
  /* 7711 */ val EconCDKeyProcessTransaction: typings.steamDashClient.steamDashClientMod.EMsg.EconCDKeyProcessTransaction with Double = js.native
  /* 7712 */ val EconCDKeyProcessTransactionResponse: typings.steamDashClient.steamDashClientMod.EMsg.EconCDKeyProcessTransactionResponse with Double = js.native
  /* 7707 */ val EconFlushInventoryCache: typings.steamDashClient.steamDashClientMod.EMsg.EconFlushInventoryCache with Double = js.native
  /* 7708 */ val EconFlushInventoryCacheResponse: typings.steamDashClient.steamDashClientMod.EMsg.EconFlushInventoryCacheResponse with Double = js.native
  /* 7713 */ val EconGetErrorLogs: typings.steamDashClient.steamDashClientMod.EMsg.EconGetErrorLogs with Double = js.native
  /* 7714 */ val EconGetErrorLogsResponse: typings.steamDashClient.steamDashClientMod.EMsg.EconGetErrorLogsResponse with Double = js.native
  /* 7706 */ val EconTrading_CancelTradeRequest: typings.steamDashClient.steamDashClientMod.EMsg.EconTrading_CancelTradeRequest with Double = js.native
  /* 7702 */ val EconTrading_InitiateTradeProposed: typings.steamDashClient.steamDashClientMod.EMsg.EconTrading_InitiateTradeProposed with Double = js.native
  /* 7701 */ val EconTrading_InitiateTradeRequest: typings.steamDashClient.steamDashClientMod.EMsg.EconTrading_InitiateTradeRequest with Double = js.native
  /* 7703 */ val EconTrading_InitiateTradeResponse: typings.steamDashClient.steamDashClientMod.EMsg.EconTrading_InitiateTradeResponse with Double = js.native
  /* 7704 */ val EconTrading_InitiateTradeResult: typings.steamDashClient.steamDashClientMod.EMsg.EconTrading_InitiateTradeResult with Double = js.native
  /* 7705 */ val EconTrading_StartSession: typings.steamDashClient.steamDashClientMod.EMsg.EconTrading_StartSession with Double = js.native
  /* 201 */ val Exit: typings.steamDashClient.steamDashClientMod.EMsg.Exit with Double = js.native
  /* 308 */ val ExitShell: typings.steamDashClient.steamDashClientMod.EMsg.ExitShell with Double = js.native
  /* 307 */ val ExitShells: typings.steamDashClient.steamDashClientMod.EMsg.ExitShells with Double = js.native
  /* 1119 */ val FBSApplyAccountCred: typings.steamDashClient.steamDashClientMod.EMsg.FBSApplyAccountCred with Double = js.native
  /* 1120 */ val FBSApplyAccountCredResponse: typings.steamDashClient.steamDashClientMod.EMsg.FBSApplyAccountCredResponse with Double = js.native
  /* 1108 */ val FBSApplyOSUpdates: typings.steamDashClient.steamDashClientMod.EMsg.FBSApplyOSUpdates with Double = js.native
  /* 1130 */ val FBSBootstrapperGetPackageChunk: typings.steamDashClient.steamDashClientMod.EMsg.FBSBootstrapperGetPackageChunk with Double = js.native
  /* 1131 */ val FBSBootstrapperGetPackageChunkResponse: typings.steamDashClient.steamDashClientMod.EMsg.FBSBootstrapperGetPackageChunkResponse with Double = js.native
  /* 1128 */ val FBSBootstrapperPackageRequest: typings.steamDashClient.steamDashClientMod.EMsg.FBSBootstrapperPackageRequest with Double = js.native
  /* 1129 */ val FBSBootstrapperPackageResponse: typings.steamDashClient.steamDashClientMod.EMsg.FBSBootstrapperPackageResponse with Double = js.native
  /* 1132 */ val FBSBootstrapperPackageTransferProgress: typings.steamDashClient.steamDashClientMod.EMsg.FBSBootstrapperPackageTransferProgress with Double = js.native
  /* 1027 */ val FBSConnectionData: typings.steamDashClient.steamDashClientMod.EMsg.FBSConnectionData with Double = js.native
  /* 1114 */ val FBSDeployHotFixPackage: typings.steamDashClient.steamDashClientMod.EMsg.FBSDeployHotFixPackage with Double = js.native
  /* 1115 */ val FBSDeployHotFixResponse: typings.steamDashClient.steamDashClientMod.EMsg.FBSDeployHotFixResponse with Double = js.native
  /* 1104 */ val FBSDeployPackage: typings.steamDashClient.steamDashClientMod.EMsg.FBSDeployPackage with Double = js.native
  /* 1105 */ val FBSDeployResponse: typings.steamDashClient.steamDashClientMod.EMsg.FBSDeployResponse with Double = js.native
  /* 1116 */ val FBSDownloadHotFix: typings.steamDashClient.steamDashClientMod.EMsg.FBSDownloadHotFix with Double = js.native
  /* 1117 */ val FBSDownloadHotFixResponse: typings.steamDashClient.steamDashClientMod.EMsg.FBSDownloadHotFixResponse with Double = js.native
  /* 1103 */ val FBSForceBounce: typings.steamDashClient.steamDashClientMod.EMsg.FBSForceBounce with Double = js.native
  /* 1102 */ val FBSForceRefresh: typings.steamDashClient.steamDashClientMod.EMsg.FBSForceRefresh with Double = js.native
  /* 1126 */ val FBSInfoFromBootstrapper: typings.steamDashClient.steamDashClientMod.EMsg.FBSInfoFromBootstrapper with Double = js.native
  /* 1112 */ val FBSMinidumpServer: typings.steamDashClient.steamDashClientMod.EMsg.FBSMinidumpServer with Double = js.native
  /* 1123 */ val FBSQueryGMForRequest: typings.steamDashClient.steamDashClientMod.EMsg.FBSQueryGMForRequest with Double = js.native
  /* 1124 */ val FBSQueryGMResponse: typings.steamDashClient.steamDashClientMod.EMsg.FBSQueryGMResponse with Double = js.native
  /* 1110 */ val FBSRebootBox: typings.steamDashClient.steamDashClientMod.EMsg.FBSRebootBox with Double = js.native
  /* 1127 */ val FBSRebootBoxResponse: typings.steamDashClient.steamDashClientMod.EMsg.FBSRebootBoxResponse with Double = js.native
  /* 1100 */ val FBSReqVersion: typings.steamDashClient.steamDashClientMod.EMsg.FBSReqVersion with Double = js.native
  /* 1133 */ val FBSRestartBootstrapper: typings.steamDashClient.steamDashClientMod.EMsg.FBSRestartBootstrapper with Double = js.native
  /* 1109 */ val FBSRunCMDScript: typings.steamDashClient.steamDashClientMod.EMsg.FBSRunCMDScript with Double = js.native
  /* 1111 */ val FBSSetBigBrotherMode: typings.steamDashClient.steamDashClientMod.EMsg.FBSSetBigBrotherMode with Double = js.native
  /* 1121 */ val FBSSetShellCount: typings.steamDashClient.steamDashClientMod.EMsg.FBSSetShellCount with Double = js.native
  /* 1113 */ val FBSSetShellCount_obsolete: typings.steamDashClient.steamDashClientMod.EMsg.FBSSetShellCount_obsolete with Double = js.native
  /* 1107 */ val FBSSetState: typings.steamDashClient.steamDashClientMod.EMsg.FBSSetState with Double = js.native
  /* 1122 */ val FBSTerminateShell: typings.steamDashClient.steamDashClientMod.EMsg.FBSTerminateShell with Double = js.native
  /* 1125 */ val FBSTerminateZombies: typings.steamDashClient.steamDashClientMod.EMsg.FBSTerminateZombies with Double = js.native
  /* 1106 */ val FBSUpdateBootstrapper: typings.steamDashClient.steamDashClientMod.EMsg.FBSUpdateBootstrapper with Double = js.native
  /* 1118 */ val FBSUpdateTargetConfigFile: typings.steamDashClient.steamDashClientMod.EMsg.FBSUpdateTargetConfigFile with Double = js.native
  /* 1101 */ val FBSVersionInfo: typings.steamDashClient.steamDashClientMod.EMsg.FBSVersionInfo with Double = js.native
  /* 7510 */ val FSAddOrRemoveFollower: typings.steamDashClient.steamDashClientMod.EMsg.FSAddOrRemoveFollower with Double = js.native
  /* 7511 */ val FSAddOrRemoveFollowerResponse: typings.steamDashClient.steamDashClientMod.EMsg.FSAddOrRemoveFollowerResponse with Double = js.native
  /* 7500 */ val FSBase: typings.steamDashClient.steamDashClientMod.EMsg.FSBase with Double = js.native
  /* 7513 */ val FSCommentNotification: typings.steamDashClient.steamDashClientMod.EMsg.FSCommentNotification with Double = js.native
  /* 7514 */ val FSCommentNotificationViewed: typings.steamDashClient.steamDashClientMod.EMsg.FSCommentNotificationViewed with Double = js.native
  /* 7506 */ val FSComputeFrenematrix: typings.steamDashClient.steamDashClientMod.EMsg.FSComputeFrenematrix with Double = js.native
  /* 7507 */ val FSComputeFrenematrixResponse: typings.steamDashClient.steamDashClientMod.EMsg.FSComputeFrenematrixResponse with Double = js.native
  /* 7521 */ val FSGetPendingNotificationCount: typings.steamDashClient.steamDashClientMod.EMsg.FSGetPendingNotificationCount with Double = js.native
  /* 7522 */ val FSGetPendingNotificationCountResponse: typings.steamDashClient.steamDashClientMod.EMsg.FSGetPendingNotificationCountResponse with Double = js.native
  /* 7508 */ val FSPlayStatusNotification: typings.steamDashClient.steamDashClientMod.EMsg.FSPlayStatusNotification with Double = js.native
  /* 7509 */ val FSPublishPersonaStatus: typings.steamDashClient.steamDashClientMod.EMsg.FSPublishPersonaStatus with Double = js.native
  /* 7530 */ val FSRequestFriendData: typings.steamDashClient.steamDashClientMod.EMsg.FSRequestFriendData with Double = js.native
  /* 7504 */ val FSRichPresenceRequest: typings.steamDashClient.steamDashClientMod.EMsg.FSRichPresenceRequest with Double = js.native
  /* 7505 */ val FSRichPresenceResponse: typings.steamDashClient.steamDashClientMod.EMsg.FSRichPresenceResponse with Double = js.native
  /* 7512 */ val FSUpdateFollowingList: typings.steamDashClient.steamDashClientMod.EMsg.FSUpdateFollowingList with Double = js.native
  /* 3103 */ val FTSBrowseClans: typings.steamDashClient.steamDashClientMod.EMsg.FTSBrowseClans with Double = js.native
  /* 3104 */ val FTSBrowseClansResponse: typings.steamDashClient.steamDashClientMod.EMsg.FTSBrowseClansResponse with Double = js.native
  /* 3109 */ val FTSClanDeleted: typings.steamDashClient.steamDashClientMod.EMsg.FTSClanDeleted with Double = js.native
  /* 3101 */ val FTSGetBrowseCounts: typings.steamDashClient.steamDashClientMod.EMsg.FTSGetBrowseCounts with Double = js.native
  /* 3102 */ val FTSGetBrowseCountsResponse: typings.steamDashClient.steamDashClientMod.EMsg.FTSGetBrowseCountsResponse with Double = js.native
  /* 3114 */ val FTSGetGSPlayStats: typings.steamDashClient.steamDashClientMod.EMsg.FTSGetGSPlayStats with Double = js.native
  /* 3116 */ val FTSGetGSPlayStatsForServer: typings.steamDashClient.steamDashClientMod.EMsg.FTSGetGSPlayStatsForServer with Double = js.native
  /* 3117 */ val FTSGetGSPlayStatsForServerResponse: typings.steamDashClient.steamDashClientMod.EMsg.FTSGetGSPlayStatsForServerResponse with Double = js.native
  /* 3115 */ val FTSGetGSPlayStatsResponse: typings.steamDashClient.steamDashClientMod.EMsg.FTSGetGSPlayStatsResponse with Double = js.native
  /* 3118 */ val FTSReportIPUpdates: typings.steamDashClient.steamDashClientMod.EMsg.FTSReportIPUpdates with Double = js.native
  /* 3110 */ val FTSSearch: typings.steamDashClient.steamDashClientMod.EMsg.FTSSearch with Double = js.native
  /* 3105 */ val FTSSearchClansByLocation: typings.steamDashClient.steamDashClientMod.EMsg.FTSSearchClansByLocation with Double = js.native
  /* 3106 */ val FTSSearchClansByLocationResponse: typings.steamDashClient.steamDashClientMod.EMsg.FTSSearchClansByLocationResponse with Double = js.native
  /* 3107 */ val FTSSearchPlayersByLocation: typings.steamDashClient.steamDashClientMod.EMsg.FTSSearchPlayersByLocation with Double = js.native
  /* 3108 */ val FTSSearchPlayersByLocationResponse: typings.steamDashClient.steamDashClientMod.EMsg.FTSSearchPlayersByLocationResponse with Double = js.native
  /* 3111 */ val FTSSearchResponse: typings.steamDashClient.steamDashClientMod.EMsg.FTSSearchResponse with Double = js.native
  /* 3112 */ val FTSSearchStatus: typings.steamDashClient.steamDashClientMod.EMsg.FTSSearchStatus with Double = js.native
  /* 3113 */ val FTSSearchStatusResponse: typings.steamDashClient.steamDashClientMod.EMsg.FTSSearchStatusResponse with Double = js.native
  /* 3000 */ val FailServer: typings.steamDashClient.steamDashClientMod.EMsg.FailServer with Double = js.native
  /* 1202 */ val FileXferData: typings.steamDashClient.steamDashClientMod.EMsg.FileXferData with Double = js.native
  /* 1204 */ val FileXferDataAck: typings.steamDashClient.steamDashClientMod.EMsg.FileXferDataAck with Double = js.native
  /* 1203 */ val FileXferEnd: typings.steamDashClient.steamDashClientMod.EMsg.FileXferEnd with Double = js.native
  /* 1200 */ val FileXferRequest: typings.steamDashClient.steamDashClientMod.EMsg.FileXferRequest with Double = js.native
  /* 1201 */ val FileXferResponse: typings.steamDashClient.steamDashClientMod.EMsg.FileXferResponse with Double = js.native
  /* 2212 */ val GCAchievementAwarded: typings.steamDashClient.steamDashClientMod.EMsg.GCAchievementAwarded with Double = js.native
  /* 2204 */ val GCCmdBounce: typings.steamDashClient.steamDashClientMod.EMsg.GCCmdBounce with Double = js.native
  /* 2207 */ val GCCmdDeploy: typings.steamDashClient.steamDashClientMod.EMsg.GCCmdDeploy with Double = js.native
  /* 2208 */ val GCCmdDeployResponse: typings.steamDashClient.steamDashClientMod.EMsg.GCCmdDeployResponse with Double = js.native
  /* 2206 */ val GCCmdDown: typings.steamDashClient.steamDashClientMod.EMsg.GCCmdDown with Double = js.native
  /* 2205 */ val GCCmdForceBounce: typings.steamDashClient.steamDashClientMod.EMsg.GCCmdForceBounce with Double = js.native
  /* 2203 */ val GCCmdRevive: typings.steamDashClient.steamDashClientMod.EMsg.GCCmdRevive with Double = js.native
  /* 2216 */ val GCCmdStatus: typings.steamDashClient.steamDashClientMod.EMsg.GCCmdStatus with Double = js.native
  /* 2209 */ val GCCmdSwitch: typings.steamDashClient.steamDashClientMod.EMsg.GCCmdSwitch with Double = js.native
  /* 2218 */ val GCGetAccountDetails: typings.steamDashClient.steamDashClientMod.EMsg.GCGetAccountDetails with Double = js.native
  /* 2218 */ val GCGetAccountDetails_DEPRECATED: typings.steamDashClient.steamDashClientMod.EMsg.GCGetAccountDetails_DEPRECATED with Double = js.native
  /* 2220 */ val GCGetEmailTemplate: typings.steamDashClient.steamDashClientMod.EMsg.GCGetEmailTemplate with Double = js.native
  /* 2221 */ val GCGetEmailTemplateResponse: typings.steamDashClient.steamDashClientMod.EMsg.GCGetEmailTemplateResponse with Double = js.native
  /* 2234 */ val GCHAccountLockStatusChange: typings.steamDashClient.steamDashClientMod.EMsg.GCHAccountLockStatusChange with Double = js.native
  /* 2236 */ val GCHAccountPhoneNumberChange: typings.steamDashClient.steamDashClientMod.EMsg.GCHAccountPhoneNumberChange with Double = js.native
  /* 2233 */ val GCHAccountTradeBanStatusChange: typings.steamDashClient.steamDashClientMod.EMsg.GCHAccountTradeBanStatusChange with Double = js.native
  /* 2237 */ val GCHAccountTwoFactorChange: typings.steamDashClient.steamDashClientMod.EMsg.GCHAccountTwoFactorChange with Double = js.native
  /* 2228 */ val GCHAccountVacStatusChange: typings.steamDashClient.steamDashClientMod.EMsg.GCHAccountVacStatusChange with Double = js.native
  /* 2231 */ val GCHKillGC: typings.steamDashClient.steamDashClientMod.EMsg.GCHKillGC with Double = js.native
  /* 2232 */ val GCHKillGCResponse: typings.steamDashClient.steamDashClientMod.EMsg.GCHKillGCResponse with Double = js.native
  /* 2222 */ val GCHRelay: typings.steamDashClient.steamDashClientMod.EMsg.GCHRelay with Double = js.native
  /* 2223 */ val GCHRelayClientToIS: typings.steamDashClient.steamDashClientMod.EMsg.GCHRelayClientToIS with Double = js.native
  /* 2223 */ val GCHRelayToClient: typings.steamDashClient.steamDashClientMod.EMsg.GCHRelayToClient with Double = js.native
  /* 2226 */ val GCHRequestStatus: typings.steamDashClient.steamDashClientMod.EMsg.GCHRequestStatus with Double = js.native
  /* 2227 */ val GCHRequestStatusResponse: typings.steamDashClient.steamDashClientMod.EMsg.GCHRequestStatusResponse with Double = js.native
  /* 2225 */ val GCHRequestUpdateSession: typings.steamDashClient.steamDashClientMod.EMsg.GCHRequestUpdateSession with Double = js.native
  /* 2229 */ val GCHSpawnGC: typings.steamDashClient.steamDashClientMod.EMsg.GCHSpawnGC with Double = js.native
  /* 2230 */ val GCHSpawnGCResponse: typings.steamDashClient.steamDashClientMod.EMsg.GCHSpawnGCResponse with Double = js.native
  /* 2224 */ val GCHUpdateSession: typings.steamDashClient.steamDashClientMod.EMsg.GCHUpdateSession with Double = js.native
  /* 2235 */ val GCHVacVerificationChange: typings.steamDashClient.steamDashClientMod.EMsg.GCHVacVerificationChange with Double = js.native
  /* 2219 */ val GCInterAppMessage: typings.steamDashClient.steamDashClientMod.EMsg.GCInterAppMessage with Double = js.native
  /* 2217 */ val GCRegisterWebInterfaces: typings.steamDashClient.steamDashClientMod.EMsg.GCRegisterWebInterfaces with Double = js.native
  /* 2217 */ val GCRegisterWebInterfaces_Deprecated: typings.steamDashClient.steamDashClientMod.EMsg.GCRegisterWebInterfaces_Deprecated with Double = js.native
  /* 2200 */ val GCSendClient: typings.steamDashClient.steamDashClientMod.EMsg.GCSendClient with Double = js.native
  /* 2213 */ val GCSystemMessage: typings.steamDashClient.steamDashClientMod.EMsg.GCSystemMessage with Double = js.native
  /* 2211 */ val GCUpdateGSState: typings.steamDashClient.steamDashClientMod.EMsg.GCUpdateGSState with Double = js.native
  /* 2202 */ val GCUpdatePlayedState: typings.steamDashClient.steamDashClientMod.EMsg.GCUpdatePlayedState with Double = js.native
  /* 2214 */ val GCValidateSession: typings.steamDashClient.steamDashClientMod.EMsg.GCValidateSession with Double = js.native
  /* 2215 */ val GCValidateSessionResponse: typings.steamDashClient.steamDashClientMod.EMsg.GCValidateSessionResponse with Double = js.native
  /* 333 */ val GMConvertUserWallets: typings.steamDashClient.steamDashClientMod.EMsg.GMConvertUserWallets with Double = js.native
  /* 320 */ val GMDRMSync: typings.steamDashClient.steamDashClientMod.EMsg.GMDRMSync with Double = js.native
  /* 331 */ val GMGetServiceMethodRouting: typings.steamDashClient.steamDashClientMod.EMsg.GMGetServiceMethodRouting with Double = js.native
  /* 332 */ val GMGetServiceMethodRoutingResponse: typings.steamDashClient.steamDashClientMod.EMsg.GMGetServiceMethodRoutingResponse with Double = js.native
  /* 325 */ val GMLoadActivationCodes: typings.steamDashClient.steamDashClientMod.EMsg.GMLoadActivationCodes with Double = js.native
  /* 326 */ val GMQueueForFBS: typings.steamDashClient.steamDashClientMod.EMsg.GMQueueForFBS with Double = js.native
  /* 319 */ val GMReportPHPError: typings.steamDashClient.steamDashClientMod.EMsg.GMReportPHPError with Double = js.native
  /* 6400 */ val GMSBase: typings.steamDashClient.steamDashClientMod.EMsg.GMSBase with Double = js.native
  /* 6404 */ val GMSClientServerQueryResponse: typings.steamDashClient.steamDashClientMod.EMsg.GMSClientServerQueryResponse with Double = js.native
  /* 6401 */ val GMSGameServerReplicate: typings.steamDashClient.steamDashClientMod.EMsg.GMSGameServerReplicate with Double = js.native
  /* 327 */ val GMSchemaConversionResults: typings.steamDashClient.steamDashClientMod.EMsg.GMSchemaConversionResults with Double = js.native
  /* 328 */ val GMSchemaConversionResultsResponse: typings.steamDashClient.steamDashClientMod.EMsg.GMSchemaConversionResultsResponse with Double = js.native
  /* 324 */ val GMWriteConfigToSQL: typings.steamDashClient.steamDashClientMod.EMsg.GMWriteConfigToSQL with Double = js.native
  /* 329 */ val GMWriteShellFailureToSQL: typings.steamDashClient.steamDashClientMod.EMsg.GMWriteShellFailureToSQL with Double = js.native
  /* 330 */ val GMWriteStatsToSOS: typings.steamDashClient.steamDashClientMod.EMsg.GMWriteStatsToSOS with Double = js.native
  /* 758 */ val GSApprove: typings.steamDashClient.steamDashClientMod.EMsg.GSApprove with Double = js.native
  /* 938 */ val GSAssociateWithClan: typings.steamDashClient.steamDashClientMod.EMsg.GSAssociateWithClan with Double = js.native
  /* 939 */ val GSAssociateWithClanResponse: typings.steamDashClient.steamDashClientMod.EMsg.GSAssociateWithClanResponse with Double = js.native
  /* 940 */ val GSComputeNewPlayerCompatibility: typings.steamDashClient.steamDashClientMod.EMsg.GSComputeNewPlayerCompatibility with Double = js.native
  /* 941 */ val GSComputeNewPlayerCompatibilityResponse: typings.steamDashClient.steamDashClientMod.EMsg.GSComputeNewPlayerCompatibilityResponse with Double = js.native
  /* 759 */ val GSDeny: typings.steamDashClient.steamDashClientMod.EMsg.GSDeny with Double = js.native
  /* 901 */ val GSDisconnectNotice: typings.steamDashClient.steamDashClientMod.EMsg.GSDisconnectNotice with Double = js.native
  /* 918 */ val GSGetPlayStats: typings.steamDashClient.steamDashClientMod.EMsg.GSGetPlayStats with Double = js.native
  /* 919 */ val GSGetPlayStatsResponse: typings.steamDashClient.steamDashClientMod.EMsg.GSGetPlayStatsResponse with Double = js.native
  /* 936 */ val GSGetReputation: typings.steamDashClient.steamDashClientMod.EMsg.GSGetReputation with Double = js.native
  /* 937 */ val GSGetReputationResponse: typings.steamDashClient.steamDashClientMod.EMsg.GSGetReputationResponse with Double = js.native
  /* 910 */ val GSGetUserAchievementStatus: typings.steamDashClient.steamDashClientMod.EMsg.GSGetUserAchievementStatus with Double = js.native
  /* 911 */ val GSGetUserAchievementStatusResponse: typings.steamDashClient.steamDashClientMod.EMsg.GSGetUserAchievementStatusResponse with Double = js.native
  /* 920 */ val GSGetUserGroupStatus: typings.steamDashClient.steamDashClientMod.EMsg.GSGetUserGroupStatus with Double = js.native
  /* 923 */ val GSGetUserGroupStatusResponse: typings.steamDashClient.steamDashClientMod.EMsg.GSGetUserGroupStatusResponse with Double = js.native
  /* 760 */ val GSKick: typings.steamDashClient.steamDashClientMod.EMsg.GSKick with Double = js.native
  /* 5440 */ val GSPerformHardwareSurvey: typings.steamDashClient.steamDashClientMod.EMsg.GSPerformHardwareSurvey with Double = js.native
  /* 909 */ val GSPlayerList: typings.steamDashClient.steamDashClientMod.EMsg.GSPlayerList with Double = js.native
  /* 908 */ val GSServerType: typings.steamDashClient.steamDashClientMod.EMsg.GSServerType with Double = js.native
  /* 903 */ val GSStatus: typings.steamDashClient.steamDashClientMod.EMsg.GSStatus with Double = js.native
  /* 906 */ val GSStatus2: typings.steamDashClient.steamDashClientMod.EMsg.GSStatus2 with Double = js.native
  /* 774 */ val GSStatusReply: typings.steamDashClient.steamDashClientMod.EMsg.GSStatusReply with Double = js.native
  /* 907 */ val GSStatusUpdate_Unused: typings.steamDashClient.steamDashClientMod.EMsg.GSStatusUpdate_Unused with Double = js.native
  /* 905 */ val GSUserPlaying: typings.steamDashClient.steamDashClientMod.EMsg.GSUserPlaying with Double = js.native
  /* 6407 */ val GameServerOutOfDate: typings.steamDashClient.steamDashClientMod.EMsg.GameServerOutOfDate with Double = js.native
  /* 100 */ val GenericReply: typings.steamDashClient.steamDashClientMod.EMsg.GenericReply with Double = js.native
  /* 4393 */ val GetUserIPCountry: typings.steamDashClient.steamDashClientMod.EMsg.GetUserIPCountry with Double = js.native
  /* 4394 */ val GetUserIPCountryResponse: typings.steamDashClient.steamDashClientMod.EMsg.GetUserIPCountryResponse with Double = js.native
  /* 309 */ val GracefulExitShell: typings.steamDashClient.steamDashClientMod.EMsg.GracefulExitShell with Double = js.native
  /* 300 */ val Heartbeat: typings.steamDashClient.steamDashClientMod.EMsg.Heartbeat with Double = js.native
  /* 124 */ val HubConnect: typings.steamDashClient.steamDashClientMod.EMsg.HubConnect with Double = js.native
  /* 2222 */ val ISRelayToGCH: typings.steamDashClient.steamDashClientMod.EMsg.ISRelayToGCH with Double = js.native
  /* 0 */ val Invalid: typings.steamDashClient.steamDashClientMod.EMsg.Invalid with Double = js.native
  /* 145 */ val InvalidateDBOCacheItems: typings.steamDashClient.steamDashClientMod.EMsg.InvalidateDBOCacheItems with Double = js.native
  /* 123 */ val JobHeartbeat: typings.steamDashClient.steamDashClientMod.EMsg.JobHeartbeat with Double = js.native
  /* 3001 */ val JobHeartbeatTest: typings.steamDashClient.steamDashClientMod.EMsg.JobHeartbeatTest with Double = js.native
  /* 3002 */ val JobHeartbeatTestResponse: typings.steamDashClient.steamDashClientMod.EMsg.JobHeartbeatTestResponse with Double = js.native
  /* 7201 */ val KGSAllocateKeyRange: typings.steamDashClient.steamDashClientMod.EMsg.KGSAllocateKeyRange with Double = js.native
  /* 7202 */ val KGSAllocateKeyRangeResponse: typings.steamDashClient.steamDashClientMod.EMsg.KGSAllocateKeyRangeResponse with Double = js.native
  /* 7200 */ val KGSBase: typings.steamDashClient.steamDashClientMod.EMsg.KGSBase with Double = js.native
  /* 7207 */ val KGSGenerateGameStopWCKeys: typings.steamDashClient.steamDashClientMod.EMsg.KGSGenerateGameStopWCKeys with Double = js.native
  /* 7208 */ val KGSGenerateGameStopWCKeysResponse: typings.steamDashClient.steamDashClientMod.EMsg.KGSGenerateGameStopWCKeysResponse with Double = js.native
  /* 7203 */ val KGSGenerateKeys: typings.steamDashClient.steamDashClientMod.EMsg.KGSGenerateKeys with Double = js.native
  /* 7204 */ val KGSGenerateKeysResponse: typings.steamDashClient.steamDashClientMod.EMsg.KGSGenerateKeysResponse with Double = js.native
  /* 7205 */ val KGSRemapKeys: typings.steamDashClient.steamDashClientMod.EMsg.KGSRemapKeys with Double = js.native
  /* 7206 */ val KGSRemapKeysResponse: typings.steamDashClient.steamDashClientMod.EMsg.KGSRemapKeysResponse with Double = js.native
  /* 132 */ val KeepAlive: typings.steamDashClient.steamDashClientMod.EMsg.KeepAlive with Double = js.native
  /* 3210 */ val LBSDeleteLB: typings.steamDashClient.steamDashClientMod.EMsg.LBSDeleteLB with Double = js.native
  /* 3211 */ val LBSDeleteLBEntry: typings.steamDashClient.steamDashClientMod.EMsg.LBSDeleteLBEntry with Double = js.native
  /* 3214 */ val LBSDeleteLBResponse: typings.steamDashClient.steamDashClientMod.EMsg.LBSDeleteLBResponse with Double = js.native
  /* 3203 */ val LBSFindOrCreateLB: typings.steamDashClient.steamDashClientMod.EMsg.LBSFindOrCreateLB with Double = js.native
  /* 3204 */ val LBSFindOrCreateLBResponse: typings.steamDashClient.steamDashClientMod.EMsg.LBSFindOrCreateLBResponse with Double = js.native
  /* 3205 */ val LBSGetLBEntries: typings.steamDashClient.steamDashClientMod.EMsg.LBSGetLBEntries with Double = js.native
  /* 3206 */ val LBSGetLBEntriesResponse: typings.steamDashClient.steamDashClientMod.EMsg.LBSGetLBEntriesResponse with Double = js.native
  /* 3207 */ val LBSGetLBList: typings.steamDashClient.steamDashClientMod.EMsg.LBSGetLBList with Double = js.native
  /* 3208 */ val LBSGetLBListResponse: typings.steamDashClient.steamDashClientMod.EMsg.LBSGetLBListResponse with Double = js.native
  /* 3212 */ val LBSResetLB: typings.steamDashClient.steamDashClientMod.EMsg.LBSResetLB with Double = js.native
  /* 3213 */ val LBSResetLBResponse: typings.steamDashClient.steamDashClientMod.EMsg.LBSResetLBResponse with Double = js.native
  /* 3209 */ val LBSSetLBDetails: typings.steamDashClient.steamDashClientMod.EMsg.LBSSetLBDetails with Double = js.native
  /* 3201 */ val LBSSetScore: typings.steamDashClient.steamDashClientMod.EMsg.LBSSetScore with Double = js.native
  /* 3202 */ val LBSSetScoreResponse: typings.steamDashClient.steamDashClientMod.EMsg.LBSSetScoreResponse with Double = js.native
  /* 316 */ val LicenseProcessingComplete: typings.steamDashClient.steamDashClientMod.EMsg.LicenseProcessingComplete with Double = js.native
  /* 143 */ val LoadDBOCacheItem: typings.steamDashClient.steamDashClientMod.EMsg.LoadDBOCacheItem with Double = js.native
  /* 144 */ val LoadDBOCacheItemResponse: typings.steamDashClient.steamDashClientMod.EMsg.LoadDBOCacheItemResponse with Double = js.native
  /* 1009 */ val LogSearchCancel: typings.steamDashClient.steamDashClientMod.EMsg.LogSearchCancel with Double = js.native
  /* 1007 */ val LogSearchRequest: typings.steamDashClient.steamDashClientMod.EMsg.LogSearchRequest with Double = js.native
  /* 1008 */ val LogSearchResponse: typings.steamDashClient.steamDashClientMod.EMsg.LogSearchResponse with Double = js.native
  /* 8800 */ val LogsinkBase: typings.steamDashClient.steamDashClientMod.EMsg.LogsinkBase with Double = js.native
  /* 8800 */ val LogsinkWriteReport: typings.steamDashClient.steamDashClientMod.EMsg.LogsinkWriteReport with Double = js.native
  /* 5828 */ val MDSContentServerConfig: typings.steamDashClient.steamDashClientMod.EMsg.MDSContentServerConfig with Double = js.native
  /* 5827 */ val MDSContentServerConfigRequest: typings.steamDashClient.steamDashClientMod.EMsg.MDSContentServerConfigRequest with Double = js.native
  /* 5826 */ val MDSContentServerStatsBroadcast: typings.steamDashClient.steamDashClientMod.EMsg.MDSContentServerStatsBroadcast with Double = js.native
  /* 5825 */ val MDSDownloadDepotChunksAck: typings.steamDashClient.steamDashClientMod.EMsg.MDSDownloadDepotChunksAck with Double = js.native
  /* 5832 */ val MDSGetDepotChunk: typings.steamDashClient.steamDashClientMod.EMsg.MDSGetDepotChunk with Double = js.native
  /* 5834 */ val MDSGetDepotChunkChunk: typings.steamDashClient.steamDashClientMod.EMsg.MDSGetDepotChunkChunk with Double = js.native
  /* 5833 */ val MDSGetDepotChunkResponse: typings.steamDashClient.steamDashClientMod.EMsg.MDSGetDepotChunkResponse with Double = js.native
  /* 5829 */ val MDSGetDepotManifest: typings.steamDashClient.steamDashClientMod.EMsg.MDSGetDepotManifest with Double = js.native
  /* 5831 */ val MDSGetDepotManifestChunk: typings.steamDashClient.steamDashClientMod.EMsg.MDSGetDepotManifestChunk with Double = js.native
  /* 5830 */ val MDSGetDepotManifestResponse: typings.steamDashClient.steamDashClientMod.EMsg.MDSGetDepotManifestResponse with Double = js.native
  /* 5836 */ val MDSGetServerListForUser: typings.steamDashClient.steamDashClientMod.EMsg.MDSGetServerListForUser with Double = js.native
  /* 5837 */ val MDSGetServerListForUserResponse: typings.steamDashClient.steamDashClientMod.EMsg.MDSGetServerListForUserResponse with Double = js.native
  /* 5814 */ val MDSGetVersionsForDepot: typings.steamDashClient.steamDashClientMod.EMsg.MDSGetVersionsForDepot with Double = js.native
  /* 5815 */ val MDSGetVersionsForDepotResponse: typings.steamDashClient.steamDashClientMod.EMsg.MDSGetVersionsForDepotResponse with Double = js.native
  /* 5847 */ val MDSMigrateChunk: typings.steamDashClient.steamDashClientMod.EMsg.MDSMigrateChunk with Double = js.native
  /* 5848 */ val MDSMigrateChunkResponse: typings.steamDashClient.steamDashClientMod.EMsg.MDSMigrateChunkResponse with Double = js.native
  /* 5816 */ val MDSSetPublicVersionForDepot: typings.steamDashClient.steamDashClientMod.EMsg.MDSSetPublicVersionForDepot with Double = js.native
  /* 5817 */ val MDSSetPublicVersionForDepotResponse: typings.steamDashClient.steamDashClientMod.EMsg.MDSSetPublicVersionForDepotResponse with Double = js.native
  /* 5813 */ val MDSToAMGetDepotDecryptionKeyResponse: typings.steamDashClient.steamDashClientMod.EMsg.MDSToAMGetDepotDecryptionKeyResponse with Double = js.native
  /* 5844 */ val MDSToCSFlushChunk: typings.steamDashClient.steamDashClientMod.EMsg.MDSToCSFlushChunk with Double = js.native
  /* 5835 */ val MDSUpdateContentServerConfig: typings.steamDashClient.steamDashClientMod.EMsg.MDSUpdateContentServerConfig with Double = js.native
  /* 6600 */ val MMSBase: typings.steamDashClient.steamDashClientMod.EMsg.MMSBase with Double = js.native
  /* 7100 */ val MPASBase: typings.steamDashClient.steamDashClientMod.EMsg.MPASBase with Double = js.native
  /* 7101 */ val MPASVacBanReset: typings.steamDashClient.steamDashClientMod.EMsg.MPASVacBanReset with Double = js.native
  /* 4216 */ val MarketingMessageUpdate: typings.steamDashClient.steamDashClientMod.EMsg.MarketingMessageUpdate with Double = js.native
  /* 1 */ val Multi: typings.steamDashClient.steamDashClientMod.EMsg.Multi with Double = js.native
  /* 6800 */ val NonStdMsgBase: typings.steamDashClient.steamDashClientMod.EMsg.NonStdMsgBase with Double = js.native
  /* 6806 */ val NonStdMsgChase: typings.steamDashClient.steamDashClientMod.EMsg.NonStdMsgChase with Double = js.native
  /* 6807 */ val NonStdMsgDFSTransfer: typings.steamDashClient.steamDashClientMod.EMsg.NonStdMsgDFSTransfer with Double = js.native
  /* 6803 */ val NonStdMsgHTTPClient: typings.steamDashClient.steamDashClientMod.EMsg.NonStdMsgHTTPClient with Double = js.native
  /* 6802 */ val NonStdMsgHTTPServer: typings.steamDashClient.steamDashClientMod.EMsg.NonStdMsgHTTPServer with Double = js.native
  /* 6811 */ val NonStdMsgLogsink: typings.steamDashClient.steamDashClientMod.EMsg.NonStdMsgLogsink with Double = js.native
  /* 6801 */ val NonStdMsgMemcached: typings.steamDashClient.steamDashClientMod.EMsg.NonStdMsgMemcached with Double = js.native
  /* 6805 */ val NonStdMsgPHPSimulator: typings.steamDashClient.steamDashClientMod.EMsg.NonStdMsgPHPSimulator with Double = js.native
  /* 6813 */ val NonStdMsgRTMPServer: typings.steamDashClient.steamDashClientMod.EMsg.NonStdMsgRTMPServer with Double = js.native
  /* 6812 */ val NonStdMsgSteam2Emulator: typings.steamDashClient.steamDashClientMod.EMsg.NonStdMsgSteam2Emulator with Double = js.native
  /* 6810 */ val NonStdMsgSyslog: typings.steamDashClient.steamDashClientMod.EMsg.NonStdMsgSyslog with Double = js.native
  /* 6808 */ val NonStdMsgTests: typings.steamDashClient.steamDashClientMod.EMsg.NonStdMsgTests with Double = js.native
  /* 6809 */ val NonStdMsgUMQpipeAAPL: typings.steamDashClient.steamDashClientMod.EMsg.NonStdMsgUMQpipeAAPL with Double = js.native
  /* 6804 */ val NonStdMsgWGResponse: typings.steamDashClient.steamDashClientMod.EMsg.NonStdMsgWGResponse with Double = js.native
  /* 4395 */ val NotificationOfSuspiciousActivity: typings.steamDashClient.steamDashClientMod.EMsg.NotificationOfSuspiciousActivity with Double = js.native
  /* 314 */ val NotifyWatchdog: typings.steamDashClient.steamDashClientMod.EMsg.NotifyWatchdog with Double = js.native
  /* 3401 */ val OGSBeginSession: typings.steamDashClient.steamDashClientMod.EMsg.OGSBeginSession with Double = js.native
  /* 3402 */ val OGSBeginSessionResponse: typings.steamDashClient.steamDashClientMod.EMsg.OGSBeginSessionResponse with Double = js.native
  /* 3403 */ val OGSEndSession: typings.steamDashClient.steamDashClientMod.EMsg.OGSEndSession with Double = js.native
  /* 3404 */ val OGSEndSessionResponse: typings.steamDashClient.steamDashClientMod.EMsg.OGSEndSessionResponse with Double = js.native
  /* 3406 */ val OGSWriteAppSessionRow: typings.steamDashClient.steamDashClientMod.EMsg.OGSWriteAppSessionRow with Double = js.native
  /* 2502 */ val P2PIntroducerMessage: typings.steamDashClient.steamDashClientMod.EMsg.P2PIntroducerMessage with Double = js.native
  /* 8900 */ val PICSBase: typings.steamDashClient.steamDashClientMod.EMsg.PICSBase with Double = js.native
  /* 5005 */ val PSAddPackageToShoppingCart: typings.steamDashClient.steamDashClientMod.EMsg.PSAddPackageToShoppingCart with Double = js.native
  /* 5006 */ val PSAddPackageToShoppingCartResponse: typings.steamDashClient.steamDashClientMod.EMsg.PSAddPackageToShoppingCartResponse with Double = js.native
  /* 5011 */ val PSAddWalletCreditToShoppingCart: typings.steamDashClient.steamDashClientMod.EMsg.PSAddWalletCreditToShoppingCart with Double = js.native
  /* 5012 */ val PSAddWalletCreditToShoppingCartResponse: typings.steamDashClient.steamDashClientMod.EMsg.PSAddWalletCreditToShoppingCartResponse with Double = js.native
  /* 5001 */ val PSCreateShoppingCart: typings.steamDashClient.steamDashClientMod.EMsg.PSCreateShoppingCart with Double = js.native
  /* 5002 */ val PSCreateShoppingCartResponse: typings.steamDashClient.steamDashClientMod.EMsg.PSCreateShoppingCartResponse with Double = js.native
  /* 5009 */ val PSGetShoppingCartContents: typings.steamDashClient.steamDashClientMod.EMsg.PSGetShoppingCartContents with Double = js.native
  /* 5010 */ val PSGetShoppingCartContentsResponse: typings.steamDashClient.steamDashClientMod.EMsg.PSGetShoppingCartContentsResponse with Double = js.native
  /* 5003 */ val PSIsValidShoppingCart: typings.steamDashClient.steamDashClientMod.EMsg.PSIsValidShoppingCart with Double = js.native
  /* 5004 */ val PSIsValidShoppingCartResponse: typings.steamDashClient.steamDashClientMod.EMsg.PSIsValidShoppingCartResponse with Double = js.native
  /* 5007 */ val PSRemoveLineItemFromShoppingCart: typings.steamDashClient.steamDashClientMod.EMsg.PSRemoveLineItemFromShoppingCart with Double = js.native
  /* 5008 */ val PSRemoveLineItemFromShoppingCartResponse: typings.steamDashClient.steamDashClientMod.EMsg.PSRemoveLineItemFromShoppingCartResponse with Double = js.native
  /* 321 */ val PhysicalBoxInventory: typings.steamDashClient.steamDashClientMod.EMsg.PhysicalBoxInventory with Double = js.native
  /* 139 */ val Ping: typings.steamDashClient.steamDashClientMod.EMsg.Ping with Double = js.native
  /* 140 */ val PingResponse: typings.steamDashClient.steamDashClientMod.EMsg.PingResponse with Double = js.native
  /* 226 */ val PrepareToExit: typings.steamDashClient.steamDashClientMod.EMsg.PrepareToExit with Double = js.native
  /* 2 */ val ProtobufWrapped: typings.steamDashClient.steamDashClientMod.EMsg.ProtobufWrapped with Double = js.native
  /* 234 */ val ProvideWindowsEventLogEntries: typings.steamDashClient.steamDashClientMod.EMsg.ProvideWindowsEventLogEntries with Double = js.native
  /* 9300 */ val QuestServerBase: typings.steamDashClient.steamDashClientMod.EMsg.QuestServerBase with Double = js.native
  /* 318 */ val QueuedEmailsComplete: typings.steamDashClient.steamDashClientMod.EMsg.QueuedEmailsComplete with Double = js.native
  /* 7803 */ val RMDeleteMemcachedKeys: typings.steamDashClient.steamDashClientMod.EMsg.RMDeleteMemcachedKeys with Double = js.native
  /* 7806 */ val RMMsgTraceAddTrigger: typings.steamDashClient.steamDashClientMod.EMsg.RMMsgTraceAddTrigger with Double = js.native
  /* 7808 */ val RMMsgTraceEvent: typings.steamDashClient.steamDashClientMod.EMsg.RMMsgTraceEvent with Double = js.native
  /* 7807 */ val RMMsgTraceRemoveTrigger: typings.steamDashClient.steamDashClientMod.EMsg.RMMsgTraceRemoveTrigger with Double = js.native
  /* 7800 */ val RMRange: typings.steamDashClient.steamDashClientMod.EMsg.RMRange with Double = js.native
  /* 7804 */ val RMRemoteInvoke: typings.steamDashClient.steamDashClientMod.EMsg.RMRemoteInvoke with Double = js.native
  /* 7800 */ val RMTestVerisignOTP: typings.steamDashClient.steamDashClientMod.EMsg.RMTestVerisignOTP with Double = js.native
  /* 7801 */ val RMTestVerisignOTPResponse: typings.steamDashClient.steamDashClientMod.EMsg.RMTestVerisignOTPResponse with Double = js.native
  /* 9509 */ val RemoteClientAcceptEULA: typings.steamDashClient.steamDashClientMod.EMsg.RemoteClientAcceptEULA with Double = js.native
  /* 9502 */ val RemoteClientAppStatus: typings.steamDashClient.steamDashClientMod.EMsg.RemoteClientAppStatus with Double = js.native
  /* 9500 */ val RemoteClientAuth: typings.steamDashClient.steamDashClientMod.EMsg.RemoteClientAuth with Double = js.native
  /* 9501 */ val RemoteClientAuthResponse: typings.steamDashClient.steamDashClientMod.EMsg.RemoteClientAuthResponse with Double = js.native
  /* 9500 */ val RemoteClientBase: typings.steamDashClient.steamDashClientMod.EMsg.RemoteClientBase with Double = js.native
  /* 9510 */ val RemoteClientGetControllerConfig: typings.steamDashClient.steamDashClientMod.EMsg.RemoteClientGetControllerConfig with Double = js.native
  /* 9511 */ val RemoteClientGetControllerConfigResposne: typings.steamDashClient.steamDashClientMod.EMsg.RemoteClientGetControllerConfigResposne with Double = js.native
  /* 9505 */ val RemoteClientPing: typings.steamDashClient.steamDashClientMod.EMsg.RemoteClientPing with Double = js.native
  /* 9506 */ val RemoteClientPingResponse: typings.steamDashClient.steamDashClientMod.EMsg.RemoteClientPingResponse with Double = js.native
  /* 9503 */ val RemoteClientStartStream: typings.steamDashClient.steamDashClientMod.EMsg.RemoteClientStartStream with Double = js.native
  /* 9504 */ val RemoteClientStartStreamResponse: typings.steamDashClient.steamDashClientMod.EMsg.RemoteClientStartStreamResponse with Double = js.native
  /* 9512 */ val RemoteClientStreamingEnabled: typings.steamDashClient.steamDashClientMod.EMsg.RemoteClientStreamingEnabled with Double = js.native
  /* 128 */ val RemoteSysID: typings.steamDashClient.steamDashClientMod.EMsg.RemoteSysID with Double = js.native
  /* 600 */ val ReqChallenge: typings.steamDashClient.steamDashClientMod.EMsg.ReqChallenge with Double = js.native
  /* 602 */ val ReqChallengeTest: typings.steamDashClient.steamDashClientMod.EMsg.ReqChallengeTest with Double = js.native
  /* 142 */ val RequestFullStatsBlock: typings.steamDashClient.steamDashClientMod.EMsg.RequestFullStatsBlock with Double = js.native
  /* 1014 */ val RequestStatHistory: typings.steamDashClient.steamDashClientMod.EMsg.RequestStatHistory with Double = js.native
  /* 233 */ val RequestWindowsEventLogEntries: typings.steamDashClient.steamDashClientMod.EMsg.RequestWindowsEventLogEntries with Double = js.native
  /* 127 */ val RouteMessage: typings.steamDashClient.steamDashClientMod.EMsg.RouteMessage with Double = js.native
  /* 120 */ val SCIDRequest: typings.steamDashClient.steamDashClientMod.EMsg.SCIDRequest with Double = js.native
  /* 121 */ val SCIDResponse: typings.steamDashClient.steamDashClientMod.EMsg.SCIDResponse with Double = js.native
  /* 9400 */ val SLCBase: typings.steamDashClient.steamDashClientMod.EMsg.SLCBase with Double = js.native
  /* 9407 */ val SLCOwnerLibraryChanged: typings.steamDashClient.steamDashClientMod.EMsg.SLCOwnerLibraryChanged with Double = js.native
  /* 9401 */ val SLCRequestUserSessionStatus: typings.steamDashClient.steamDashClientMod.EMsg.SLCRequestUserSessionStatus with Double = js.native
  /* 9408 */ val SLCSharedLibraryChanged: typings.steamDashClient.steamDashClientMod.EMsg.SLCSharedLibraryChanged with Double = js.native
  /* 9402 */ val SLCSharedLicensesLockStatus: typings.steamDashClient.steamDashClientMod.EMsg.SLCSharedLicensesLockStatus with Double = js.native
  /* 9400 */ val SLCUserSessionStatus: typings.steamDashClient.steamDashClientMod.EMsg.SLCUserSessionStatus with Double = js.native
  /* 2902 */ val SMExpensiveReport: typings.steamDashClient.steamDashClientMod.EMsg.SMExpensiveReport with Double = js.native
  /* 2904 */ val SMFishingReport: typings.steamDashClient.steamDashClientMod.EMsg.SMFishingReport with Double = js.native
  /* 2907 */ val SMGetSchemaConversionResults: typings.steamDashClient.steamDashClientMod.EMsg.SMGetSchemaConversionResults with Double = js.native
  /* 2908 */ val SMGetSchemaConversionResultsResponse: typings.steamDashClient.steamDashClientMod.EMsg.SMGetSchemaConversionResultsResponse with Double = js.native
  /* 2903 */ val SMHourlyReport: typings.steamDashClient.steamDashClientMod.EMsg.SMHourlyReport with Double = js.native
  /* 2906 */ val SMMonitorSpace: typings.steamDashClient.steamDashClientMod.EMsg.SMMonitorSpace with Double = js.native
  /* 2905 */ val SMPartitionRenames: typings.steamDashClient.steamDashClientMod.EMsg.SMPartitionRenames with Double = js.native
  /* 8600 */ val SecretsBase: typings.steamDashClient.steamDashClientMod.EMsg.SecretsBase with Double = js.native
  /* 8601 */ val SecretsCredentialPairResponse: typings.steamDashClient.steamDashClientMod.EMsg.SecretsCredentialPairResponse with Double = js.native
  /* 8600 */ val SecretsRequestCredentialPair: typings.steamDashClient.steamDashClientMod.EMsg.SecretsRequestCredentialPair with Double = js.native
  /* 8602 */ val SecretsRequestServerIdentity: typings.steamDashClient.steamDashClientMod.EMsg.SecretsRequestServerIdentity with Double = js.native
  /* 8603 */ val SecretsServerIdentityResponse: typings.steamDashClient.steamDashClientMod.EMsg.SecretsServerIdentityResponse with Double = js.native
  /* 8604 */ val SecretsUpdateServerIdentities: typings.steamDashClient.steamDashClientMod.EMsg.SecretsUpdateServerIdentities with Double = js.native
  /* 146 */ val ServiceMethod: typings.steamDashClient.steamDashClientMod.EMsg.ServiceMethod with Double = js.native
  /* 147 */ val ServiceMethodResponse: typings.steamDashClient.steamDashClientMod.EMsg.ServiceMethodResponse with Double = js.native
  /* 317 */ val SetTestFlag: typings.steamDashClient.steamDashClientMod.EMsg.SetTestFlag with Double = js.native
  /* 237 */ val ShellCheckWindowsUpdates: typings.steamDashClient.steamDashClientMod.EMsg.ShellCheckWindowsUpdates with Double = js.native
  /* 238 */ val ShellCheckWindowsUpdatesResponse: typings.steamDashClient.steamDashClientMod.EMsg.ShellCheckWindowsUpdatesResponse with Double = js.native
  /* 230 */ val ShellConfigInfoUpdate: typings.steamDashClient.steamDashClientMod.EMsg.ShellConfigInfoUpdate with Double = js.native
  /* 301 */ val ShellFailed: typings.steamDashClient.steamDashClientMod.EMsg.ShellFailed with Double = js.native
  /* 239 */ val ShellFlushUserLicenseCache: typings.steamDashClient.steamDashClientMod.EMsg.ShellFlushUserLicenseCache with Double = js.native
  /* 235 */ val ShellSearchLogs: typings.steamDashClient.steamDashClientMod.EMsg.ShellSearchLogs with Double = js.native
  /* 236 */ val ShellSearchLogsResponse: typings.steamDashClient.steamDashClientMod.EMsg.ShellSearchLogsResponse with Double = js.native
  /* 1015 */ val StatHistory: typings.steamDashClient.steamDashClientMod.EMsg.StatHistory with Double = js.native
  /* 141 */ val Stats: typings.steamDashClient.steamDashClientMod.EMsg.Stats with Double = js.native
  /* 138 */ val StatsDeprecated: typings.steamDashClient.steamDashClientMod.EMsg.StatsDeprecated with Double = js.native
  /* 8000 */ val StoreBase: typings.steamDashClient.steamDashClientMod.EMsg.StoreBase with Double = js.native
  /* 8000 */ val StoreUpdateRecommendationCount: typings.steamDashClient.steamDashClientMod.EMsg.StoreUpdateRecommendationCount with Double = js.native
  /* 126 */ val Subscribe: typings.steamDashClient.steamDashClientMod.EMsg.Subscribe with Double = js.native
  /* 323 */ val TestInitDB: typings.steamDashClient.steamDashClientMod.EMsg.TestInitDB with Double = js.native
  /* 228 */ val TestResetServer: typings.steamDashClient.steamDashClientMod.EMsg.TestResetServer with Double = js.native
  /* 9200 */ val TestWorkerProcess: typings.steamDashClient.steamDashClientMod.EMsg.TestWorkerProcess with Double = js.native
  /* 9200 */ val TestWorkerProcessLoadUnloadModuleRequest: typings.steamDashClient.steamDashClientMod.EMsg.TestWorkerProcessLoadUnloadModuleRequest with Double = js.native
  /* 9201 */ val TestWorkerProcessLoadUnloadModuleResponse: typings.steamDashClient.steamDashClientMod.EMsg.TestWorkerProcessLoadUnloadModuleResponse with Double = js.native
  /* 9202 */ val TestWorkerProcessServiceModuleCallRequest: typings.steamDashClient.steamDashClientMod.EMsg.TestWorkerProcessServiceModuleCallRequest with Double = js.native
  /* 9203 */ val TestWorkerProcessServiceModuleCallResponse: typings.steamDashClient.steamDashClientMod.EMsg.TestWorkerProcessServiceModuleCallResponse with Double = js.native
  /* 149 */ val TimestampRequest: typings.steamDashClient.steamDashClientMod.EMsg.TimestampRequest with Double = js.native
  /* 150 */ val TimestampResponse: typings.steamDashClient.steamDashClientMod.EMsg.TimestampResponse with Double = js.native
  /* 7335 */ val UCMAddTaggedScreenshot: typings.steamDashClient.steamDashClientMod.EMsg.UCMAddTaggedScreenshot with Double = js.native
  /* 7300 */ val UCMBase: typings.steamDashClient.steamDashClientMod.EMsg.UCMBase with Double = js.native
  /* 7372 */ val UCMDeleteOldScreenshot: typings.steamDashClient.steamDashClientMod.EMsg.UCMDeleteOldScreenshot with Double = js.native
  /* 7373 */ val UCMDeleteOldScreenshotResponse: typings.steamDashClient.steamDashClientMod.EMsg.UCMDeleteOldScreenshotResponse with Double = js.native
  /* 7374 */ val UCMDeleteOldVideo: typings.steamDashClient.steamDashClientMod.EMsg.UCMDeleteOldVideo with Double = js.native
  /* 7375 */ val UCMDeleteOldVideoResponse: typings.steamDashClient.steamDashClientMod.EMsg.UCMDeleteOldVideoResponse with Double = js.native
  /* 7329 */ val UCMDeletePublishedFile: typings.steamDashClient.steamDashClientMod.EMsg.UCMDeletePublishedFile with Double = js.native
  /* 7330 */ val UCMDeletePublishedFileResponse: typings.steamDashClient.steamDashClientMod.EMsg.UCMDeletePublishedFileResponse with Double = js.native
  /* 7371 */ val UCMFixStatsPublishedFile: typings.steamDashClient.steamDashClientMod.EMsg.UCMFixStatsPublishedFile with Double = js.native
  /* 7362 */ val UCMGetPublishedFilesForUser: typings.steamDashClient.steamDashClientMod.EMsg.UCMGetPublishedFilesForUser with Double = js.native
  /* 7363 */ val UCMGetPublishedFilesForUserResponse: typings.steamDashClient.steamDashClientMod.EMsg.UCMGetPublishedFilesForUserResponse with Double = js.native
  /* 7369 */ val UCMGetUserSubscribedFiles: typings.steamDashClient.steamDashClientMod.EMsg.UCMGetUserSubscribedFiles with Double = js.native
  /* 7370 */ val UCMGetUserSubscribedFilesResponse: typings.steamDashClient.steamDashClientMod.EMsg.UCMGetUserSubscribedFilesResponse with Double = js.native
  /* 7351 */ val UCMPublishFile: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishFile with Double = js.native
  /* 7352 */ val UCMPublishFileResponse: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishFileResponse with Double = js.native
  /* 7353 */ val UCMPublishedFileChildAdd: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileChildAdd with Double = js.native
  /* 7354 */ val UCMPublishedFileChildAddResponse: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileChildAddResponse with Double = js.native
  /* 7357 */ val UCMPublishedFileChildChangeSortOrder: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileChildChangeSortOrder with Double = js.native
  /* 7358 */ val UCMPublishedFileChildChangeSortOrderResponse: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileChildChangeSortOrderResponse with Double = js.native
  /* 7355 */ val UCMPublishedFileChildRemove: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileChildRemove with Double = js.native
  /* 7356 */ val UCMPublishedFileChildRemoveResponse: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileChildRemoveResponse with Double = js.native
  /* 7380 */ val UCMPublishedFileContentUpdated: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileContentUpdated with Double = js.native
  /* 7359 */ val UCMPublishedFileParentChanged: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileParentChanged with Double = js.native
  /* 7341 */ val UCMPublishedFilePreviewAdd: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFilePreviewAdd with Double = js.native
  /* 7342 */ val UCMPublishedFilePreviewAddResponse: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFilePreviewAddResponse with Double = js.native
  /* 7345 */ val UCMPublishedFilePreviewChangeSortOrder: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFilePreviewChangeSortOrder with Double = js.native
  /* 7346 */ val UCMPublishedFilePreviewChangeSortOrderResponse: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFilePreviewChangeSortOrderResponse with Double = js.native
  /* 7343 */ val UCMPublishedFilePreviewRemove: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFilePreviewRemove with Double = js.native
  /* 7344 */ val UCMPublishedFilePreviewRemoveResponse: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFilePreviewRemoveResponse with Double = js.native
  /* 7339 */ val UCMPublishedFileReported: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileReported with Double = js.native
  /* 7349 */ val UCMPublishedFileSubscribed: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileSubscribed with Double = js.native
  /* 7350 */ val UCMPublishedFileUnsubscribed: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileUnsubscribed with Double = js.native
  /* 7381 */ val UCMPublishedFileUpdated: typings.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileUpdated with Double = js.native
  /* 7337 */ val UCMReloadPublishedFile: typings.steamDashClient.steamDashClientMod.EMsg.UCMReloadPublishedFile with Double = js.native
  /* 7338 */ val UCMReloadUserFileListCaches: typings.steamDashClient.steamDashClientMod.EMsg.UCMReloadUserFileListCaches with Double = js.native
  /* 7336 */ val UCMRemoveTaggedScreenshot: typings.steamDashClient.steamDashClientMod.EMsg.UCMRemoveTaggedScreenshot with Double = js.native
  /* 7307 */ val UCMResetCommunityContent: typings.steamDashClient.steamDashClientMod.EMsg.UCMResetCommunityContent with Double = js.native
  /* 7308 */ val UCMResetCommunityContentResponse: typings.steamDashClient.steamDashClientMod.EMsg.UCMResetCommunityContentResponse with Double = js.native
  /* 7376 */ val UCMUpdateOldScreenshotPrivacy: typings.steamDashClient.steamDashClientMod.EMsg.UCMUpdateOldScreenshotPrivacy with Double = js.native
  /* 7377 */ val UCMUpdateOldScreenshotPrivacyResponse: typings.steamDashClient.steamDashClientMod.EMsg.UCMUpdateOldScreenshotPrivacyResponse with Double = js.native
  /* 7327 */ val UCMUpdatePublishedFile: typings.steamDashClient.steamDashClientMod.EMsg.UCMUpdatePublishedFile with Double = js.native
  /* 7332 */ val UCMUpdatePublishedFileBan: typings.steamDashClient.steamDashClientMod.EMsg.UCMUpdatePublishedFileBan with Double = js.native
  /* 7333 */ val UCMUpdatePublishedFileBanResponse: typings.steamDashClient.steamDashClientMod.EMsg.UCMUpdatePublishedFileBanResponse with Double = js.native
  /* 7340 */ val UCMUpdatePublishedFileIncompatibleStatus: typings.steamDashClient.steamDashClientMod.EMsg.UCMUpdatePublishedFileIncompatibleStatus with Double = js.native
  /* 7328 */ val UCMUpdatePublishedFileResponse: typings.steamDashClient.steamDashClientMod.EMsg.UCMUpdatePublishedFileResponse with Double = js.native
  /* 7331 */ val UCMUpdatePublishedFileStat: typings.steamDashClient.steamDashClientMod.EMsg.UCMUpdatePublishedFileStat with Double = js.native
  /* 7334 */ val UCMUpdateTaggedScreenshot: typings.steamDashClient.steamDashClientMod.EMsg.UCMUpdateTaggedScreenshot with Double = js.native
  /* 7303 */ val UCMValidateObjectExists: typings.steamDashClient.steamDashClientMod.EMsg.UCMValidateObjectExists with Double = js.native
  /* 7304 */ val UCMValidateObjectExistsResponse: typings.steamDashClient.steamDashClientMod.EMsg.UCMValidateObjectExistsResponse with Double = js.native
  /* 7000 */ val UDSBase: typings.steamDashClient.steamDashClientMod.EMsg.UDSBase with Double = js.native
  /* 7006 */ val UDSFindSession: typings.steamDashClient.steamDashClientMod.EMsg.UDSFindSession with Double = js.native
  /* 7007 */ val UDSFindSessionResponse: typings.steamDashClient.steamDashClientMod.EMsg.UDSFindSessionResponse with Double = js.native
  /* 7006 */ val UDSHasSession: typings.steamDashClient.steamDashClientMod.EMsg.UDSHasSession with Double = js.native
  /* 7007 */ val UDSHasSessionResponse: typings.steamDashClient.steamDashClientMod.EMsg.UDSHasSessionResponse with Double = js.native
  /* 7003 */ val UDSRenderUserAuth: typings.steamDashClient.steamDashClientMod.EMsg.UDSRenderUserAuth with Double = js.native
  /* 7004 */ val UDSRenderUserAuthResponse: typings.steamDashClient.steamDashClientMod.EMsg.UDSRenderUserAuthResponse with Double = js.native
  /* 5223 */ val UFSDownloadChunk: typings.steamDashClient.steamDashClientMod.EMsg.UFSDownloadChunk with Double = js.native
  /* 5246 */ val UFSDownloadChunkRequest: typings.steamDashClient.steamDashClientMod.EMsg.UFSDownloadChunkRequest with Double = js.native
  /* 5247 */ val UFSDownloadChunkResponse: typings.steamDashClient.steamDashClientMod.EMsg.UFSDownloadChunkResponse with Double = js.native
  /* 5248 */ val UFSDownloadFinishRequest: typings.steamDashClient.steamDashClientMod.EMsg.UFSDownloadFinishRequest with Double = js.native
  /* 5249 */ val UFSDownloadFinishResponse: typings.steamDashClient.steamDashClientMod.EMsg.UFSDownloadFinishResponse with Double = js.native
  /* 5221 */ val UFSDownloadRequest: typings.steamDashClient.steamDashClientMod.EMsg.UFSDownloadRequest with Double = js.native
  /* 5222 */ val UFSDownloadResponse: typings.steamDashClient.steamDashClientMod.EMsg.UFSDownloadResponse with Double = js.native
  /* 5244 */ val UFSDownloadStartRequest: typings.steamDashClient.steamDashClientMod.EMsg.UFSDownloadStartRequest with Double = js.native
  /* 5245 */ val UFSDownloadStartResponse: typings.steamDashClient.steamDashClientMod.EMsg.UFSDownloadStartResponse with Double = js.native
  /* 5250 */ val UFSFlushURLCache: typings.steamDashClient.steamDashClientMod.EMsg.UFSFlushURLCache with Double = js.native
  /* 5240 */ val UFSGetUGCURLs: typings.steamDashClient.steamDashClientMod.EMsg.UFSGetUGCURLs with Double = js.native
  /* 5241 */ val UFSGetUGCURLsResponse: typings.steamDashClient.steamDashClientMod.EMsg.UFSGetUGCURLsResponse with Double = js.native
  /* 5242 */ val UFSHttpUploadFileFinishRequest: typings.steamDashClient.steamDashClientMod.EMsg.UFSHttpUploadFileFinishRequest with Double = js.native
  /* 5243 */ val UFSHttpUploadFileFinishResponse: typings.steamDashClient.steamDashClientMod.EMsg.UFSHttpUploadFileFinishResponse with Double = js.native
  /* 5238 */ val UFSMigrateFile: typings.steamDashClient.steamDashClientMod.EMsg.UFSMigrateFile with Double = js.native
  /* 5253 */ val UFSMigrateFileAppID: typings.steamDashClient.steamDashClientMod.EMsg.UFSMigrateFileAppID with Double = js.native
  /* 5254 */ val UFSMigrateFileAppIDResponse: typings.steamDashClient.steamDashClientMod.EMsg.UFSMigrateFileAppIDResponse with Double = js.native
  /* 5239 */ val UFSMigrateFileResponse: typings.steamDashClient.steamDashClientMod.EMsg.UFSMigrateFileResponse with Double = js.native
  /* 5234 */ val UFSReloadAccount: typings.steamDashClient.steamDashClientMod.EMsg.UFSReloadAccount with Double = js.native
  /* 5235 */ val UFSReloadAccountResponse: typings.steamDashClient.steamDashClientMod.EMsg.UFSReloadAccountResponse with Double = js.native
  /* 5215 */ val UFSReloadPartitionInfo: typings.steamDashClient.steamDashClientMod.EMsg.UFSReloadPartitionInfo with Double = js.native
  /* 5217 */ val UFSSynchronizeFile: typings.steamDashClient.steamDashClientMod.EMsg.UFSSynchronizeFile with Double = js.native
  /* 5218 */ val UFSSynchronizeFileResponse: typings.steamDashClient.steamDashClientMod.EMsg.UFSSynchronizeFileResponse with Double = js.native
  /* 5228 */ val UFSUpdateFileFlags: typings.steamDashClient.steamDashClientMod.EMsg.UFSUpdateFileFlags with Double = js.native
  /* 5229 */ val UFSUpdateFileFlagsResponse: typings.steamDashClient.steamDashClientMod.EMsg.UFSUpdateFileFlagsResponse with Double = js.native
  /* 5236 */ val UFSUpdateRecordBatched: typings.steamDashClient.steamDashClientMod.EMsg.UFSUpdateRecordBatched with Double = js.native
  /* 5237 */ val UFSUpdateRecordBatchedResponse: typings.steamDashClient.steamDashClientMod.EMsg.UFSUpdateRecordBatchedResponse with Double = js.native
  /* 5251 */ val UFSUploadCommit: typings.steamDashClient.steamDashClientMod.EMsg.UFSUploadCommit with Double = js.native
  /* 5252 */ val UFSUploadCommitResponse: typings.steamDashClient.steamDashClientMod.EMsg.UFSUploadCommitResponse with Double = js.native
  /* 7900 */ val UGSBase: typings.steamDashClient.steamDashClientMod.EMsg.UGSBase with Double = js.native
  /* 7900 */ val UGSUpdateGlobalStats: typings.steamDashClient.steamDashClientMod.EMsg.UGSUpdateGlobalStats with Double = js.native
  /* 8108 */ val UMQ2AM_ClientMsgBatch: typings.steamDashClient.steamDashClientMod.EMsg.UMQ2AM_ClientMsgBatch with Double = js.native
  /* 8100 */ val UMQBase: typings.steamDashClient.steamDashClientMod.EMsg.UMQBase with Double = js.native
  /* 8110 */ val UMQEnqueueMobileAnnouncements: typings.steamDashClient.steamDashClientMod.EMsg.UMQEnqueueMobileAnnouncements with Double = js.native
  /* 8109 */ val UMQEnqueueMobileSalePromotions: typings.steamDashClient.steamDashClientMod.EMsg.UMQEnqueueMobileSalePromotions with Double = js.native
  /* 8105 */ val UMQIncomingChatMessage: typings.steamDashClient.steamDashClientMod.EMsg.UMQIncomingChatMessage with Double = js.native
  /* 8102 */ val UMQLogoffRequest: typings.steamDashClient.steamDashClientMod.EMsg.UMQLogoffRequest with Double = js.native
  /* 8103 */ val UMQLogoffResponse: typings.steamDashClient.steamDashClientMod.EMsg.UMQLogoffResponse with Double = js.native
  /* 8100 */ val UMQLogonRequest: typings.steamDashClient.steamDashClientMod.EMsg.UMQLogonRequest with Double = js.native
  /* 8101 */ val UMQLogonResponse: typings.steamDashClient.steamDashClientMod.EMsg.UMQLogonResponse with Double = js.native
  /* 8106 */ val UMQPoll: typings.steamDashClient.steamDashClientMod.EMsg.UMQPoll with Double = js.native
  /* 8107 */ val UMQPollResults: typings.steamDashClient.steamDashClientMod.EMsg.UMQPollResults with Double = js.native
  /* 8104 */ val UMQSendChatMessage: typings.steamDashClient.steamDashClientMod.EMsg.UMQSendChatMessage with Double = js.native
  /* 229 */ val UniverseChanged: typings.steamDashClient.steamDashClientMod.EMsg.UniverseChanged with Double = js.native
  /* 1010 */ val UniverseData: typings.steamDashClient.steamDashClientMod.EMsg.UniverseData with Double = js.native
  /* 322 */ val UpdateConfigFile: typings.steamDashClient.steamDashClientMod.EMsg.UpdateConfigFile with Double = js.native
  /* 221 */ val UpdateCreditCardRequest: typings.steamDashClient.steamDashClientMod.EMsg.UpdateCreditCardRequest with Double = js.native
  /* 215 */ val UpdateRecordResponse: typings.steamDashClient.steamDashClientMod.EMsg.UpdateRecordResponse with Double = js.native
  /* 225 */ val UpdateUserBanResponse: typings.steamDashClient.steamDashClientMod.EMsg.UpdateUserBanResponse with Double = js.native
  /* 601 */ val VACResponse: typings.steamDashClient.steamDashClientMod.EMsg.VACResponse with Double = js.native
  /* 605 */ val VSAddCheat: typings.steamDashClient.steamDashClientMod.EMsg.VSAddCheat with Double = js.native
  /* 608 */ val VSChallengeResultText: typings.steamDashClient.steamDashClientMod.EMsg.VSChallengeResultText with Double = js.native
  /* 607 */ val VSGetChallengeResults: typings.steamDashClient.steamDashClientMod.EMsg.VSGetChallengeResults with Double = js.native
  /* 611 */ val VSLoadDBFinished: typings.steamDashClient.steamDashClientMod.EMsg.VSLoadDBFinished with Double = js.native
  /* 604 */ val VSMarkCheat: typings.steamDashClient.steamDashClientMod.EMsg.VSMarkCheat with Double = js.native
  /* 606 */ val VSPurgeCodeModDB: typings.steamDashClient.steamDashClientMod.EMsg.VSPurgeCodeModDB with Double = js.native
  /* 609 */ val VSReportLingerer: typings.steamDashClient.steamDashClientMod.EMsg.VSReportLingerer with Double = js.native
  /* 610 */ val VSRequestManagedChallenge: typings.steamDashClient.steamDashClientMod.EMsg.VSRequestManagedChallenge with Double = js.native
  /* 130 */ val WGRequest: typings.steamDashClient.steamDashClientMod.EMsg.WGRequest with Double = js.native
  /* 131 */ val WGResponse: typings.steamDashClient.steamDashClientMod.EMsg.WGResponse with Double = js.native
  /* 8300 */ val WebAPIBase: typings.steamDashClient.steamDashClientMod.EMsg.WebAPIBase with Double = js.native
  /* 8304 */ val WebAPIInvalidateOAuthClientCache: typings.steamDashClient.steamDashClientMod.EMsg.WebAPIInvalidateOAuthClientCache with Double = js.native
  /* 8305 */ val WebAPIInvalidateOAuthTokenCache: typings.steamDashClient.steamDashClientMod.EMsg.WebAPIInvalidateOAuthTokenCache with Double = js.native
  /* 8302 */ val WebAPIInvalidateTokensForAccount: typings.steamDashClient.steamDashClientMod.EMsg.WebAPIInvalidateTokensForAccount with Double = js.native
  /* 133 */ val WebAPIJobRequest: typings.steamDashClient.steamDashClientMod.EMsg.WebAPIJobRequest with Double = js.native
  /* 134 */ val WebAPIJobResponse: typings.steamDashClient.steamDashClientMod.EMsg.WebAPIJobResponse with Double = js.native
  /* 8303 */ val WebAPIRegisterGCInterfaces: typings.steamDashClient.steamDashClientMod.EMsg.WebAPIRegisterGCInterfaces with Double = js.native
  /* 8306 */ val WebAPISetSecrets: typings.steamDashClient.steamDashClientMod.EMsg.WebAPISetSecrets with Double = js.native
  /* 8300 */ val WebAPIValidateOAuth2Token: typings.steamDashClient.steamDashClientMod.EMsg.WebAPIValidateOAuth2Token with Double = js.native
  /* 8301 */ val WebAPIValidateOAuth2TokenResponse: typings.steamDashClient.steamDashClientMod.EMsg.WebAPIValidateOAuth2TokenResponse with Double = js.native
  /* 9000 */ val WorkerProcess: typings.steamDashClient.steamDashClientMod.EMsg.WorkerProcess with Double = js.native
  /* 9000 */ val WorkerProcessPingRequest: typings.steamDashClient.steamDashClientMod.EMsg.WorkerProcessPingRequest with Double = js.native
  /* 9001 */ val WorkerProcessPingResponse: typings.steamDashClient.steamDashClientMod.EMsg.WorkerProcessPingResponse with Double = js.native
  /* 9002 */ val WorkerProcessShutdown: typings.steamDashClient.steamDashClientMod.EMsg.WorkerProcessShutdown with Double = js.native
  /* 8200 */ val WorkshopAcceptTOSRequest: typings.steamDashClient.steamDashClientMod.EMsg.WorkshopAcceptTOSRequest with Double = js.native
  /* 8201 */ val WorkshopAcceptTOSResponse: typings.steamDashClient.steamDashClientMod.EMsg.WorkshopAcceptTOSResponse with Double = js.native
  /* 8200 */ val WorkshopBase: typings.steamDashClient.steamDashClientMod.EMsg.WorkshopBase with Double = js.native
  /* 204 */ val ZipRequest: typings.steamDashClient.steamDashClientMod.EMsg.ZipRequest with Double = js.native
  /* 205 */ val ZipResponse: typings.steamDashClient.steamDashClientMod.EMsg.ZipResponse with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMsg with Double] = js.native
}

