package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EMsg extends js.Object
@JSImport("steam-client", "EMsg")
@js.native
object EMsg extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMsg with Double] = js.native
  
  @js.native
  sealed trait AIGetAppGCFlags extends EMsg
  /* 423 */ @js.native
  object AIGetAppGCFlags extends TopLevel[AIGetAppGCFlags with Double]
  
  @js.native
  sealed trait AIGetAppGCFlagsResponse extends EMsg
  /* 424 */ @js.native
  object AIGetAppGCFlagsResponse extends TopLevel[AIGetAppGCFlagsResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AIGetAppInfo extends EMsg
  /* 427 */ @js.native
  object AIGetAppInfo extends TopLevel[AIGetAppInfo with Double]
  
   // obsolete
  @js.native
  sealed trait AIGetAppInfoResponse extends EMsg
  /* 428 */ @js.native
  object AIGetAppInfoResponse extends TopLevel[AIGetAppInfoResponse with Double]
  
  @js.native
  sealed trait AIGetAppList extends EMsg
  /* 425 */ @js.native
  object AIGetAppList extends TopLevel[AIGetAppList with Double]
  
  @js.native
  sealed trait AIGetAppListResponse extends EMsg
  /* 426 */ @js.native
  object AIGetAppListResponse extends TopLevel[AIGetAppListResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AISAppInfoTableChanged extends EMsg
  /* 407 */ @js.native
  object AISAppInfoTableChanged extends TopLevel[AISAppInfoTableChanged with Double]
  
  @js.native
  sealed trait AISCreateMarketingMessage extends EMsg
  /* 409 */ @js.native
  object AISCreateMarketingMessage extends TopLevel[AISCreateMarketingMessage with Double]
  
  @js.native
  sealed trait AISCreateMarketingMessageResponse extends EMsg
  /* 410 */ @js.native
  object AISCreateMarketingMessageResponse extends TopLevel[AISCreateMarketingMessageResponse with Double]
  
  @js.native
  sealed trait AISDeleteMarketingMessage extends EMsg
  /* 416 */ @js.native
  object AISDeleteMarketingMessage extends TopLevel[AISDeleteMarketingMessage with Double]
  
  @js.native
  sealed trait AISGetCouponDefinition extends EMsg
  /* 429 */ @js.native
  object AISGetCouponDefinition extends TopLevel[AISGetCouponDefinition with Double]
  
  @js.native
  sealed trait AISGetCouponDefinitionResponse extends EMsg
  /* 430 */ @js.native
  object AISGetCouponDefinitionResponse extends TopLevel[AISGetCouponDefinitionResponse with Double]
  
  @js.native
  sealed trait AISGetMarketingMessage extends EMsg
  /* 411 */ @js.native
  object AISGetMarketingMessage extends TopLevel[AISGetMarketingMessage with Double]
  
  @js.native
  sealed trait AISGetMarketingMessageResponse extends EMsg
  /* 412 */ @js.native
  object AISGetMarketingMessageResponse extends TopLevel[AISGetMarketingMessageResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AISGetMarketingTreatments extends EMsg
  /* 419 */ @js.native
  object AISGetMarketingTreatments extends TopLevel[AISGetMarketingTreatments with Double]
  
   // obsolete
  @js.native
  sealed trait AISGetMarketingTreatmentsResponse extends EMsg
  /* 420 */ @js.native
  object AISGetMarketingTreatmentsResponse extends TopLevel[AISGetMarketingTreatmentsResponse with Double]
  
  @js.native
  sealed trait AISGetPackageChangeNumber extends EMsg
  /* 405 */ @js.native
  object AISGetPackageChangeNumber extends TopLevel[AISGetPackageChangeNumber with Double]
  
  @js.native
  sealed trait AISGetPackageChangeNumberResponse extends EMsg
  /* 406 */ @js.native
  object AISGetPackageChangeNumberResponse extends TopLevel[AISGetPackageChangeNumberResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AISRefreshContentDescription extends EMsg
  /* 401 */ @js.native
  object AISRefreshContentDescription extends TopLevel[AISRefreshContentDescription with Double]
  
  @js.native
  sealed trait AISRequestContentDescription extends EMsg
  /* 402 */ @js.native
  object AISRequestContentDescription extends TopLevel[AISRequestContentDescription with Double]
  
  @js.native
  sealed trait AISRequestMarketingMessageUpdate extends EMsg
  /* 415 */ @js.native
  object AISRequestMarketingMessageUpdate extends TopLevel[AISRequestMarketingMessageUpdate with Double]
  
   // obsolete
  @js.native
  sealed trait AISRequestMarketingTreatmentUpdate extends EMsg
  /* 421 */ @js.native
  object AISRequestMarketingTreatmentUpdate extends TopLevel[AISRequestMarketingTreatmentUpdate with Double]
  
   // obsolete
  @js.native
  sealed trait AISTestAddPackage extends EMsg
  /* 422 */ @js.native
  object AISTestAddPackage extends TopLevel[AISTestAddPackage with Double]
  
  @js.native
  sealed trait AISTestEnableGC extends EMsg
  /* 433 */ @js.native
  object AISTestEnableGC extends TopLevel[AISTestEnableGC with Double]
  
  @js.native
  sealed trait AISUpdateAppInfo extends EMsg
  /* 403 */ @js.native
  object AISUpdateAppInfo extends TopLevel[AISUpdateAppInfo with Double]
  
  @js.native
  sealed trait AISUpdateMarketingMessage extends EMsg
  /* 413 */ @js.native
  object AISUpdateMarketingMessage extends TopLevel[AISUpdateMarketingMessage with Double]
  
  @js.native
  sealed trait AISUpdateMarketingMessageResponse extends EMsg
  /* 414 */ @js.native
  object AISUpdateMarketingMessageResponse extends TopLevel[AISUpdateMarketingMessageResponse with Double]
  
  @js.native
  sealed trait AISUpdatePackageCosts extends EMsg
  /* 404 */ @js.native
  object AISUpdatePackageCosts extends TopLevel[AISUpdatePackageCosts with Double]
  
  @js.native
  sealed trait AISUpdatePackageCostsResponse extends EMsg
  /* 408 */ @js.native
  object AISUpdatePackageCostsResponse extends TopLevel[AISUpdatePackageCostsResponse with Double]
  
   // obsolete "renamed to AISUpdatePackageCosts"
  @js.native
  sealed trait AISUpdatePackageInfo extends EMsg
  /* 404 */ @js.native
  object AISUpdatePackageInfo extends TopLevel[AISUpdatePackageInfo with Double]
  
  @js.native
  sealed trait AISUpdateSlaveContentDescription extends EMsg
  /* 431 */ @js.native
  object AISUpdateSlaveContentDescription extends TopLevel[AISUpdateSlaveContentDescription with Double]
  
  @js.native
  sealed trait AISUpdateSlaveContentDescriptionResponse extends EMsg
  /* 432 */ @js.native
  object AISUpdateSlaveContentDescriptionResponse extends TopLevel[AISUpdateSlaveContentDescriptionResponse with Double]
  
  @js.native
  sealed trait AMAccountPS3Unlink extends EMsg
  /* 4310 */ @js.native
  object AMAccountPS3Unlink extends TopLevel[AMAccountPS3Unlink with Double]
  
  @js.native
  sealed trait AMAccountPS3UnlinkResponse extends EMsg
  /* 4311 */ @js.native
  object AMAccountPS3UnlinkResponse extends TopLevel[AMAccountPS3UnlinkResponse with Double]
  
  @js.native
  sealed trait AMAcctAllowedToPurchase extends EMsg
  /* 4346 */ @js.native
  object AMAcctAllowedToPurchase extends TopLevel[AMAcctAllowedToPurchase with Double]
  
  @js.native
  sealed trait AMAcctAllowedToPurchaseResponse extends EMsg
  /* 4347 */ @js.native
  object AMAcctAllowedToPurchaseResponse extends TopLevel[AMAcctAllowedToPurchaseResponse with Double]
  
  @js.native
  sealed trait AMAcknowledgeClanInvite extends EMsg
  /* 565 */ @js.native
  object AMAcknowledgeClanInvite extends TopLevel[AMAcknowledgeClanInvite with Double]
  
   // obsolete
  @js.native
  sealed trait AMAddClanNews extends EMsg
  /* 4141 */ @js.native
  object AMAddClanNews extends TopLevel[AMAddClanNews with Double]
  
   // obsolete
  @js.native
  sealed trait AMAddComment extends EMsg
  /* 4202 */ @js.native
  object AMAddComment extends TopLevel[AMAddComment with Double]
  
   // obsolete
  @js.native
  sealed trait AMAddCommentResponse extends EMsg
  /* 4203 */ @js.native
  object AMAddCommentResponse extends TopLevel[AMAddCommentResponse with Double]
  
  @js.native
  sealed trait AMAddFounderToClan extends EMsg
  /* 4061 */ @js.native
  object AMAddFounderToClan extends TopLevel[AMAddFounderToClan with Double]
  
  @js.native
  sealed trait AMAddFreeLicense extends EMsg
  /* 4224 */ @js.native
  object AMAddFreeLicense extends TopLevel[AMAddFreeLicense with Double]
  
  @js.native
  sealed trait AMAddFreeLicenseResponse extends EMsg
  /* 4285 */ @js.native
  object AMAddFreeLicenseResponse extends TopLevel[AMAddFreeLicenseResponse with Double]
  
  @js.native
  sealed trait AMAddFriend extends EMsg
  /* 4081 */ @js.native
  object AMAddFriend extends TopLevel[AMAddFriend with Double]
  
  @js.native
  sealed trait AMAddFriendResponse extends EMsg
  /* 4082 */ @js.native
  object AMAddFriendResponse extends TopLevel[AMAddFriendResponse with Double]
  
  @js.native
  sealed trait AMAddLicense extends EMsg
  /* 505 */ @js.native
  object AMAddLicense extends TopLevel[AMAddLicense with Double]
  
  @js.native
  sealed trait AMAddMinutesToLicense extends EMsg
  /* 510 */ @js.native
  object AMAddMinutesToLicense extends TopLevel[AMAddMinutesToLicense with Double]
  
  @js.native
  sealed trait AMAddPublisherUser extends EMsg
  /* 4280 */ @js.native
  object AMAddPublisherUser extends TopLevel[AMAddPublisherUser with Double]
  
   // obsolete
  @js.native
  sealed trait AMAddUsersToMarketingTreatment extends EMsg
  /* 4234 */ @js.native
  object AMAddUsersToMarketingTreatment extends TopLevel[AMAddUsersToMarketingTreatment with Double]
  
   // obsolete
  @js.native
  sealed trait AMAllowUserContentQuery extends EMsg
  /* 558 */ @js.native
  object AMAllowUserContentQuery extends TopLevel[AMAllowUserContentQuery with Double]
  
   // obsolete
  @js.native
  sealed trait AMAllowUserContentResponse extends EMsg
  /* 559 */ @js.native
  object AMAllowUserContentResponse extends TopLevel[AMAllowUserContentResponse with Double]
  
  @js.native
  sealed trait AMAllowUserFilesRequest extends EMsg
  /* 4156 */ @js.native
  object AMAllowUserFilesRequest extends TopLevel[AMAllowUserFilesRequest with Double]
  
  @js.native
  sealed trait AMAllowUserFilesResponse extends EMsg
  /* 4157 */ @js.native
  object AMAllowUserFilesResponse extends TopLevel[AMAllowUserFilesResponse with Double]
  
  @js.native
  sealed trait AMAuthenticateUser extends EMsg
  /* 592 */ @js.native
  object AMAuthenticateUser extends TopLevel[AMAuthenticateUser with Double]
  
  @js.native
  sealed trait AMAuthenticateUserResponse extends EMsg
  /* 593 */ @js.native
  object AMAuthenticateUserResponse extends TopLevel[AMAuthenticateUserResponse with Double]
  
  @js.native
  sealed trait AMAuthenticatedPlayerList extends EMsg
  /* 4315 */ @js.native
  object AMAuthenticatedPlayerList extends TopLevel[AMAuthenticatedPlayerList with Double]
  
  @js.native
  sealed trait AMBanFromChat extends EMsg
  /* 4145 */ @js.native
  object AMBanFromChat extends TopLevel[AMBanFromChat with Double]
  
   // obsolete
  @js.native
  sealed trait AMBeginProcessingLicenses extends EMsg
  /* 507 */ @js.native
  object AMBeginProcessingLicenses extends TopLevel[AMBeginProcessingLicenses with Double]
  
  @js.native
  sealed trait AMBitPayPayment extends EMsg
  /* 4410 */ @js.native
  object AMBitPayPayment extends TopLevel[AMBitPayPayment with Double]
  
  @js.native
  sealed trait AMBitPayPaymentResponse extends EMsg
  /* 4411 */ @js.native
  object AMBitPayPaymentResponse extends TopLevel[AMBitPayPaymentResponse with Double]
  
  @js.native
  sealed trait AMBoaCompraPayment extends EMsg
  /* 4380 */ @js.native
  object AMBoaCompraPayment extends TopLevel[AMBoaCompraPayment with Double]
  
  @js.native
  sealed trait AMBoaCompraPaymentResponse extends EMsg
  /* 4381 */ @js.native
  object AMBoaCompraPaymentResponse extends TopLevel[AMBoaCompraPaymentResponse with Double]
  
  @js.native
  sealed trait AMCancelEasyCollect extends EMsg
  /* 4086 */ @js.native
  object AMCancelEasyCollect extends TopLevel[AMCancelEasyCollect with Double]
  
  @js.native
  sealed trait AMCancelEasyCollectResponse extends EMsg
  /* 4087 */ @js.native
  object AMCancelEasyCollectResponse extends TopLevel[AMCancelEasyCollectResponse with Double]
  
  @js.native
  sealed trait AMCancelLicense extends EMsg
  /* 511 */ @js.native
  object AMCancelLicense extends TopLevel[AMCancelLicense with Double]
  
  @js.native
  sealed trait AMCancelPurchase extends EMsg
  /* 522 */ @js.native
  object AMCancelPurchase extends TopLevel[AMCancelPurchase with Double]
  
  @js.native
  sealed trait AMChallengeNotification extends EMsg
  /* 4105 */ @js.native
  object AMChallengeNotification extends TopLevel[AMChallengeNotification with Double]
  
  @js.native
  sealed trait AMChallengeVerdict extends EMsg
  /* 4104 */ @js.native
  object AMChallengeVerdict extends TopLevel[AMChallengeVerdict with Double]
  
  @js.native
  sealed trait AMChangeClanOwner extends EMsg
  /* 4085 */ @js.native
  object AMChangeClanOwner extends TopLevel[AMChangeClanOwner with Double]
  
  @js.native
  sealed trait AMChatActionResult extends EMsg
  /* 579 */ @js.native
  object AMChatActionResult extends TopLevel[AMChatActionResult with Double]
  
  @js.native
  sealed trait AMChatCleanup extends EMsg
  /* 533 */ @js.native
  object AMChatCleanup extends TopLevel[AMChatCleanup with Double]
  
  @js.native
  sealed trait AMChatEnter extends EMsg
  /* 577 */ @js.native
  object AMChatEnter extends TopLevel[AMChatEnter with Double]
  
  @js.native
  sealed trait AMChatInvite extends EMsg
  /* 572 */ @js.native
  object AMChatInvite extends TopLevel[AMChatInvite with Double]
  
  @js.native
  sealed trait AMChatMulti extends EMsg
  /* 570 */ @js.native
  object AMChatMulti extends TopLevel[AMChatMulti with Double]
  
  @js.native
  sealed trait AMCheckClanInviteRateLimiting extends EMsg
  /* 4118 */ @js.native
  object AMCheckClanInviteRateLimiting extends TopLevel[AMCheckClanInviteRateLimiting with Double]
  
  @js.native
  sealed trait AMCheckClanMembership extends EMsg
  /* 4075 */ @js.native
  object AMCheckClanMembership extends TopLevel[AMCheckClanMembership with Double]
  
  @js.native
  sealed trait AMCheckClanMembershipResponse extends EMsg
  /* 4161 */ @js.native
  object AMCheckClanMembershipResponse extends TopLevel[AMCheckClanMembershipResponse with Double]
  
  @js.native
  sealed trait AMClaimUnownedUserGift extends EMsg
  /* 4352 */ @js.native
  object AMClaimUnownedUserGift extends TopLevel[AMClaimUnownedUserGift with Double]
  
  @js.native
  sealed trait AMClaimUnownedUserGiftResponse extends EMsg
  /* 4353 */ @js.native
  object AMClaimUnownedUserGiftResponse extends TopLevel[AMClaimUnownedUserGiftResponse with Double]
  
  @js.native
  sealed trait AMClanCleanup extends EMsg
  /* 534 */ @js.native
  object AMClanCleanup extends TopLevel[AMClanCleanup with Double]
  
  @js.native
  sealed trait AMClanCleanupList extends EMsg
  /* 538 */ @js.native
  object AMClanCleanupList extends TopLevel[AMClanCleanupList with Double]
  
  @js.native
  sealed trait AMClanDataUpdated extends EMsg
  /* 567 */ @js.native
  object AMClanDataUpdated extends TopLevel[AMClanDataUpdated with Double]
  
  @js.native
  sealed trait AMClanPermissions extends EMsg
  /* 4011 */ @js.native
  object AMClanPermissions extends TopLevel[AMClanPermissions with Double]
  
  @js.native
  sealed trait AMClanPermissionsResponse extends EMsg
  /* 4012 */ @js.native
  object AMClanPermissionsResponse extends TopLevel[AMClanPermissionsResponse with Double]
  
  @js.native
  sealed trait AMClansInCommon extends EMsg
  /* 4090 */ @js.native
  object AMClansInCommon extends TopLevel[AMClansInCommon with Double]
  
  @js.native
  sealed trait AMClansInCommonCount extends EMsg
  /* 4103 */ @js.native
  object AMClansInCommonCount extends TopLevel[AMClansInCommonCount with Double]
  
  @js.native
  sealed trait AMClansInCommonCountResponse extends EMsg
  /* 4097 */ @js.native
  object AMClansInCommonCountResponse extends TopLevel[AMClansInCommonCountResponse with Double]
  
  @js.native
  sealed trait AMClansInCommonResponse extends EMsg
  /* 4091 */ @js.native
  object AMClansInCommonResponse extends TopLevel[AMClansInCommonResponse with Double]
  
  @js.native
  sealed trait AMClearDispute extends EMsg
  /* 4264 */ @js.native
  object AMClearDispute extends TopLevel[AMClearDispute with Double]
  
  @js.native
  sealed trait AMClearDisputeResponse extends EMsg
  /* 4265 */ @js.native
  object AMClearDisputeResponse extends TopLevel[AMClearDisputeResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMClearPersonaMetadataBlob extends EMsg
  /* 4306 */ @js.native
  object AMClearPersonaMetadataBlob extends TopLevel[AMClearPersonaMetadataBlob with Double]
  
  @js.native
  sealed trait AMClientAcceptFriendInvite extends EMsg
  /* 576 */ @js.native
  object AMClientAcceptFriendInvite extends TopLevel[AMClientAcceptFriendInvite with Double]
  
  @js.native
  sealed trait AMClientAddFriendToGroup extends EMsg
  /* 5566 */ @js.native
  object AMClientAddFriendToGroup extends TopLevel[AMClientAddFriendToGroup with Double]
  
  @js.native
  sealed trait AMClientAddFriendToGroupResponse extends EMsg
  /* 5567 */ @js.native
  object AMClientAddFriendToGroupResponse extends TopLevel[AMClientAddFriendToGroupResponse with Double]
  
  @js.native
  sealed trait AMClientChatActionRelay extends EMsg
  /* 598 */ @js.native
  object AMClientChatActionRelay extends TopLevel[AMClientChatActionRelay with Double]
  
  @js.native
  sealed trait AMClientChatInviteRelay extends EMsg
  /* 571 */ @js.native
  object AMClientChatInviteRelay extends TopLevel[AMClientChatInviteRelay with Double]
  
  @js.native
  sealed trait AMClientChatMemberInfoRelay extends EMsg
  /* 574 */ @js.native
  object AMClientChatMemberInfoRelay extends TopLevel[AMClientChatMemberInfoRelay with Double]
  
  @js.native
  sealed trait AMClientChatMsgRelay extends EMsg
  /* 569 */ @js.native
  object AMClientChatMsgRelay extends TopLevel[AMClientChatMsgRelay with Double]
  
  @js.native
  sealed trait AMClientCreateFriendsGroup extends EMsg
  /* 5560 */ @js.native
  object AMClientCreateFriendsGroup extends TopLevel[AMClientCreateFriendsGroup with Double]
  
  @js.native
  sealed trait AMClientCreateFriendsGroupResponse extends EMsg
  /* 5561 */ @js.native
  object AMClientCreateFriendsGroupResponse extends TopLevel[AMClientCreateFriendsGroupResponse with Double]
  
  @js.native
  sealed trait AMClientDeleteFriendsGroup extends EMsg
  /* 5562 */ @js.native
  object AMClientDeleteFriendsGroup extends TopLevel[AMClientDeleteFriendsGroup with Double]
  
  @js.native
  sealed trait AMClientDeleteFriendsGroupResponse extends EMsg
  /* 5563 */ @js.native
  object AMClientDeleteFriendsGroupResponse extends TopLevel[AMClientDeleteFriendsGroupResponse with Double]
  
  @js.native
  sealed trait AMClientJoinChatRelay extends EMsg
  /* 573 */ @js.native
  object AMClientJoinChatRelay extends TopLevel[AMClientJoinChatRelay with Double]
  
  @js.native
  sealed trait AMClientNotPlaying extends EMsg
  /* 553 */ @js.native
  object AMClientNotPlaying extends TopLevel[AMClientNotPlaying with Double]
  
  @js.native
  sealed trait AMClientPublishRemovalFromSource extends EMsg
  /* 578 */ @js.native
  object AMClientPublishRemovalFromSource extends TopLevel[AMClientPublishRemovalFromSource with Double]
  
  @js.native
  sealed trait AMClientRemoveFriendFromGroup extends EMsg
  /* 5568 */ @js.native
  object AMClientRemoveFriendFromGroup extends TopLevel[AMClientRemoveFriendFromGroup with Double]
  
  @js.native
  sealed trait AMClientRemoveFriendFromGroupResponse extends EMsg
  /* 5569 */ @js.native
  object AMClientRemoveFriendFromGroupResponse extends TopLevel[AMClientRemoveFriendFromGroupResponse with Double]
  
  @js.native
  sealed trait AMClientRenameFriendsGroup extends EMsg
  /* 5564 */ @js.native
  object AMClientRenameFriendsGroup extends TopLevel[AMClientRenameFriendsGroup with Double]
  
  @js.native
  sealed trait AMClientRenameFriendsGroupResponse extends EMsg
  /* 5565 */ @js.native
  object AMClientRenameFriendsGroupResponse extends TopLevel[AMClientRenameFriendsGroupResponse with Double]
  
  @js.native
  sealed trait AMClientSetPlayerNickname extends EMsg
  /* 5588 */ @js.native
  object AMClientSetPlayerNickname extends TopLevel[AMClientSetPlayerNickname with Double]
  
  @js.native
  sealed trait AMClientSetPlayerNicknameResponse extends EMsg
  /* 5589 */ @js.native
  object AMClientSetPlayerNicknameResponse extends TopLevel[AMClientSetPlayerNicknameResponse with Double]
  
  @js.native
  sealed trait AMCompleteExternalPurchase extends EMsg
  /* 4383 */ @js.native
  object AMCompleteExternalPurchase extends TopLevel[AMCompleteExternalPurchase with Double]
  
  @js.native
  sealed trait AMCompleteExternalPurchaseResponse extends EMsg
  /* 4384 */ @js.native
  object AMCompleteExternalPurchaseResponse extends TopLevel[AMCompleteExternalPurchaseResponse with Double]
  
  @js.native
  sealed trait AMCompletePurchase extends EMsg
  /* 521 */ @js.native
  object AMCompletePurchase extends TopLevel[AMCompletePurchase with Double]
  
  @js.native
  sealed trait AMConvertClan extends EMsg
  /* 4093 */ @js.native
  object AMConvertClan extends TopLevel[AMConvertClan with Double]
  
  @js.native
  sealed trait AMConvertWallet extends EMsg
  /* 4251 */ @js.native
  object AMConvertWallet extends TopLevel[AMConvertWallet with Double]
  
  @js.native
  sealed trait AMConvertWalletResponse extends EMsg
  /* 4252 */ @js.native
  object AMConvertWalletResponse extends TopLevel[AMConvertWalletResponse with Double]
  
  @js.native
  sealed trait AMCreateAccountRecord extends EMsg
  /* 4109 */ @js.native
  object AMCreateAccountRecord extends TopLevel[AMCreateAccountRecord with Double]
  
   // obsolete
  @js.native
  sealed trait AMCreateAccountRecordInSteam3 extends EMsg
  /* 4183 */ @js.native
  object AMCreateAccountRecordInSteam3 extends TopLevel[AMCreateAccountRecordInSteam3 with Double]
  
  @js.native
  sealed trait AMCreateAccountResponse extends EMsg
  /* 129 */ @js.native
  object AMCreateAccountResponse extends TopLevel[AMCreateAccountResponse with Double]
  
  @js.native
  sealed trait AMCreateChargeback extends EMsg
  /* 4260 */ @js.native
  object AMCreateChargeback extends TopLevel[AMCreateChargeback with Double]
  
  @js.native
  sealed trait AMCreateChargebackResponse extends EMsg
  /* 4261 */ @js.native
  object AMCreateChargebackResponse extends TopLevel[AMCreateChargebackResponse with Double]
  
  @js.native
  sealed trait AMCreateChat extends EMsg
  /* 4001 */ @js.native
  object AMCreateChat extends TopLevel[AMCreateChat with Double]
  
  @js.native
  sealed trait AMCreateChatResponse extends EMsg
  /* 4002 */ @js.native
  object AMCreateChatResponse extends TopLevel[AMCreateChatResponse with Double]
  
  @js.native
  sealed trait AMCreateClan extends EMsg
  /* 586 */ @js.native
  object AMCreateClan extends TopLevel[AMCreateClan with Double]
  
   // obsolete
  @js.native
  sealed trait AMCreateClanAnnouncement extends EMsg
  /* 4027 */ @js.native
  object AMCreateClanAnnouncement extends TopLevel[AMCreateClanAnnouncement with Double]
  
   // obsolete
  @js.native
  sealed trait AMCreateClanAnnouncementResponse extends EMsg
  /* 4028 */ @js.native
  object AMCreateClanAnnouncementResponse extends TopLevel[AMCreateClanAnnouncementResponse with Double]
  
  @js.native
  sealed trait AMCreateClanEvent extends EMsg
  /* 4013 */ @js.native
  object AMCreateClanEvent extends TopLevel[AMCreateClanEvent with Double]
  
  @js.native
  sealed trait AMCreateClanEventResponse extends EMsg
  /* 4014 */ @js.native
  object AMCreateClanEventResponse extends TopLevel[AMCreateClanEventResponse with Double]
  
  @js.native
  sealed trait AMCreateClanResponse extends EMsg
  /* 587 */ @js.native
  object AMCreateClanResponse extends TopLevel[AMCreateClanResponse with Double]
  
  @js.native
  sealed trait AMCreateDispute extends EMsg
  /* 4262 */ @js.native
  object AMCreateDispute extends TopLevel[AMCreateDispute with Double]
  
  @js.native
  sealed trait AMCreateDisputeResponse extends EMsg
  /* 4263 */ @js.native
  object AMCreateDisputeResponse extends TopLevel[AMCreateDisputeResponse with Double]
  
  @js.native
  sealed trait AMCreateRefund extends EMsg
  /* 4258 */ @js.native
  object AMCreateRefund extends TopLevel[AMCreateRefund with Double]
  
  @js.native
  sealed trait AMCreateRefundResponse extends EMsg
  /* 4259 */ @js.native
  object AMCreateRefundResponse extends TopLevel[AMCreateRefundResponse with Double]
  
  @js.native
  sealed trait AMDegicaPayment extends EMsg
  /* 4396 */ @js.native
  object AMDegicaPayment extends TopLevel[AMDegicaPayment with Double]
  
  @js.native
  sealed trait AMDegicaPaymentResponse extends EMsg
  /* 4397 */ @js.native
  object AMDegicaPaymentResponse extends TopLevel[AMDegicaPaymentResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMDeleteClanAnnouncement extends EMsg
  /* 4035 */ @js.native
  object AMDeleteClanAnnouncement extends TopLevel[AMDeleteClanAnnouncement with Double]
  
   // obsolete
  @js.native
  sealed trait AMDeleteClanAnnouncementResponse extends EMsg
  /* 4036 */ @js.native
  object AMDeleteClanAnnouncementResponse extends TopLevel[AMDeleteClanAnnouncementResponse with Double]
  
  @js.native
  sealed trait AMDeleteClanEvent extends EMsg
  /* 4019 */ @js.native
  object AMDeleteClanEvent extends TopLevel[AMDeleteClanEvent with Double]
  
  @js.native
  sealed trait AMDeleteClanEventResponse extends EMsg
  /* 4020 */ @js.native
  object AMDeleteClanEventResponse extends TopLevel[AMDeleteClanEventResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMDeleteComment extends EMsg
  /* 4204 */ @js.native
  object AMDeleteComment extends TopLevel[AMDeleteComment with Double]
  
   // obsolete
  @js.native
  sealed trait AMDeleteCommentResponse extends EMsg
  /* 4205 */ @js.native
  object AMDeleteCommentResponse extends TopLevel[AMDeleteCommentResponse with Double]
  
  @js.native
  sealed trait AMDeleteStoredCard extends EMsg
  /* 4241 */ @js.native
  object AMDeleteStoredCard extends TopLevel[AMDeleteStoredCard with Double]
  
  @js.native
  sealed trait AMDeleteStoredPaymentInfo extends EMsg
  /* 4246 */ @js.native
  object AMDeleteStoredPaymentInfo extends TopLevel[AMDeleteStoredPaymentInfo with Double]
  
  @js.native
  sealed trait AMDeleteStoredPaypalAgreement extends EMsg
  /* 4330 */ @js.native
  object AMDeleteStoredPaypalAgreement extends TopLevel[AMDeleteStoredPaypalAgreement with Double]
  
  @js.native
  sealed trait AMDumpClan extends EMsg
  /* 4084 */ @js.native
  object AMDumpClan extends TopLevel[AMDumpClan with Double]
  
  @js.native
  sealed trait AMDumpUser extends EMsg
  /* 4059 */ @js.native
  object AMDumpUser extends TopLevel[AMDumpUser with Double]
  
  @js.native
  sealed trait AMEClubPayment extends EMsg
  /* 4398 */ @js.native
  object AMEClubPayment extends TopLevel[AMEClubPayment with Double]
  
  @js.native
  sealed trait AMEClubPaymentResponse extends EMsg
  /* 4399 */ @js.native
  object AMEClubPaymentResponse extends TopLevel[AMEClubPaymentResponse with Double]
  
  @js.native
  sealed trait AMEditBanReason extends EMsg
  /* 4160 */ @js.native
  object AMEditBanReason extends TopLevel[AMEditBanReason with Double]
  
  @js.native
  sealed trait AMExpireCaptchaByGID extends EMsg
  /* 4382 */ @js.native
  object AMExpireCaptchaByGID extends TopLevel[AMExpireCaptchaByGID with Double]
  
  @js.native
  sealed trait AMExtendLicense extends EMsg
  /* 509 */ @js.native
  object AMExtendLicense extends TopLevel[AMExtendLicense with Double]
  
  @js.native
  sealed trait AMFinalizePurchase extends EMsg
  /* 4367 */ @js.native
  object AMFinalizePurchase extends TopLevel[AMFinalizePurchase with Double]
  
  @js.native
  sealed trait AMFinalizePurchaseResponse extends EMsg
  /* 4368 */ @js.native
  object AMFinalizePurchaseResponse extends TopLevel[AMFinalizePurchaseResponse with Double]
  
  @js.native
  sealed trait AMFindAccounts extends EMsg
  /* 580 */ @js.native
  object AMFindAccounts extends TopLevel[AMFindAccounts with Double]
  
  @js.native
  sealed trait AMFindAccountsResponse extends EMsg
  /* 581 */ @js.native
  object AMFindAccountsResponse extends TopLevel[AMFindAccountsResponse with Double]
  
  @js.native
  sealed trait AMFindClanUser extends EMsg
  /* 4143 */ @js.native
  object AMFindClanUser extends TopLevel[AMFindClanUser with Double]
  
  @js.native
  sealed trait AMFindClanUserResponse extends EMsg
  /* 4144 */ @js.native
  object AMFindClanUserResponse extends TopLevel[AMFindClanUserResponse with Double]
  
  @js.native
  sealed trait AMFindGSByIP extends EMsg
  /* 4106 */ @js.native
  object AMFindGSByIP extends TopLevel[AMFindGSByIP with Double]
  
  @js.native
  sealed trait AMFindHungTransactions extends EMsg
  /* 518 */ @js.native
  object AMFindHungTransactions extends TopLevel[AMFindHungTransactions with Double]
  
  @js.native
  sealed trait AMFixPendingPurchase extends EMsg
  /* 525 */ @js.native
  object AMFixPendingPurchase extends TopLevel[AMFixPendingPurchase with Double]
  
  @js.native
  sealed trait AMFixPendingPurchaseResponse extends EMsg
  /* 526 */ @js.native
  object AMFixPendingPurchaseResponse extends TopLevel[AMFixPendingPurchaseResponse with Double]
  
  @js.native
  sealed trait AMFixPendingRefund extends EMsg
  /* 535 */ @js.native
  object AMFixPendingRefund extends TopLevel[AMFixPendingRefund with Double]
  
  @js.native
  sealed trait AMFoundGSByIP extends EMsg
  /* 4107 */ @js.native
  object AMFoundGSByIP extends TopLevel[AMFoundGSByIP with Double]
  
  @js.native
  sealed trait AMFriendsInCommon extends EMsg
  /* 4100 */ @js.native
  object AMFriendsInCommon extends TopLevel[AMFriendsInCommon with Double]
  
  @js.native
  sealed trait AMFriendsInCommonCountResponse extends EMsg
  /* 4102 */ @js.native
  object AMFriendsInCommonCountResponse extends TopLevel[AMFriendsInCommonCountResponse with Double]
  
  @js.native
  sealed trait AMFriendsInCommonResponse extends EMsg
  /* 4101 */ @js.native
  object AMFriendsInCommonResponse extends TopLevel[AMFriendsInCommonResponse with Double]
  
  @js.native
  sealed trait AMFriendsList extends EMsg
  /* 4098 */ @js.native
  object AMFriendsList extends TopLevel[AMFriendsList with Double]
  
  @js.native
  sealed trait AMFriendsListResponse extends EMsg
  /* 4099 */ @js.native
  object AMFriendsListResponse extends TopLevel[AMFriendsListResponse with Double]
  
  @js.native
  sealed trait AMGMSGameServerRemove extends EMsg
  /* 6406 */ @js.native
  object AMGMSGameServerRemove extends TopLevel[AMGMSGameServerRemove with Double]
  
  @js.native
  sealed trait AMGMSGameServerUpdate extends EMsg
  /* 6405 */ @js.native
  object AMGMSGameServerUpdate extends TopLevel[AMGMSGameServerUpdate with Double]
  
  @js.native
  sealed trait AMGSSearch extends EMsg
  /* 4213 */ @js.native
  object AMGSSearch extends TopLevel[AMGSSearch with Double]
  
  @js.native
  sealed trait AMGameServerAccountChangePassword extends EMsg
  /* 4340 */ @js.native
  object AMGameServerAccountChangePassword extends TopLevel[AMGameServerAccountChangePassword with Double]
  
  @js.native
  sealed trait AMGameServerAccountDeleteAccount extends EMsg
  /* 4341 */ @js.native
  object AMGameServerAccountDeleteAccount extends TopLevel[AMGameServerAccountDeleteAccount with Double]
  
  @js.native
  sealed trait AMGameServerPlayerCompatibilityCheck extends EMsg
  /* 4335 */ @js.native
  object AMGameServerPlayerCompatibilityCheck extends TopLevel[AMGameServerPlayerCompatibilityCheck with Double]
  
  @js.native
  sealed trait AMGameServerPlayerCompatibilityCheckResponse extends EMsg
  /* 4336 */ @js.native
  object AMGameServerPlayerCompatibilityCheckResponse extends TopLevel[AMGameServerPlayerCompatibilityCheckResponse with Double]
  
  @js.native
  sealed trait AMGameServerRemove extends EMsg
  /* 4332 */ @js.native
  object AMGameServerRemove extends TopLevel[AMGameServerRemove with Double]
  
  @js.native
  sealed trait AMGameServerUpdate extends EMsg
  /* 4331 */ @js.native
  object AMGameServerUpdate extends TopLevel[AMGameServerUpdate with Double]
  
  @js.native
  sealed trait AMGetAccountBanInfo extends EMsg
  /* 4323 */ @js.native
  object AMGetAccountBanInfo extends TopLevel[AMGetAccountBanInfo with Double]
  
  @js.native
  sealed trait AMGetAccountBanInfoResponse extends EMsg
  /* 4324 */ @js.native
  object AMGetAccountBanInfoResponse extends TopLevel[AMGetAccountBanInfoResponse with Double]
  
  @js.native
  sealed trait AMGetAccountCommunityBanInfo extends EMsg
  /* 4338 */ @js.native
  object AMGetAccountCommunityBanInfo extends TopLevel[AMGetAccountCommunityBanInfo with Double]
  
  @js.native
  sealed trait AMGetAccountCommunityBanInfoResponse extends EMsg
  /* 4339 */ @js.native
  object AMGetAccountCommunityBanInfoResponse extends TopLevel[AMGetAccountCommunityBanInfoResponse with Double]
  
  @js.native
  sealed trait AMGetAccountDetails extends EMsg
  /* 4287 */ @js.native
  object AMGetAccountDetails extends TopLevel[AMGetAccountDetails with Double]
  
  @js.native
  sealed trait AMGetAccountDetails2 extends EMsg
  /* 4112 */ @js.native
  object AMGetAccountDetails2 extends TopLevel[AMGetAccountDetails2 with Double]
  
  @js.native
  sealed trait AMGetAccountDetailsResponse extends EMsg
  /* 4288 */ @js.native
  object AMGetAccountDetailsResponse extends TopLevel[AMGetAccountDetailsResponse with Double]
  
  @js.native
  sealed trait AMGetAccountDetailsResponse2 extends EMsg
  /* 4113 */ @js.native
  object AMGetAccountDetailsResponse2 extends TopLevel[AMGetAccountDetailsResponse2 with Double]
  
  @js.native
  sealed trait AMGetAccountEmailAddress extends EMsg
  /* 4006 */ @js.native
  object AMGetAccountEmailAddress extends TopLevel[AMGetAccountEmailAddress with Double]
  
  @js.native
  sealed trait AMGetAccountEmailAddressResponse extends EMsg
  /* 4007 */ @js.native
  object AMGetAccountEmailAddressResponse extends TopLevel[AMGetAccountEmailAddressResponse with Double]
  
  @js.native
  sealed trait AMGetAccountFlagsForWGSpoofing extends EMsg
  /* 4294 */ @js.native
  object AMGetAccountFlagsForWGSpoofing extends TopLevel[AMGetAccountFlagsForWGSpoofing with Double]
  
  @js.native
  sealed trait AMGetAccountFlagsForWGSpoofingResponse extends EMsg
  /* 4295 */ @js.native
  object AMGetAccountFlagsForWGSpoofingResponse extends TopLevel[AMGetAccountFlagsForWGSpoofingResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetAccountFriendsCount extends EMsg
  /* 594 */ @js.native
  object AMGetAccountFriendsCount extends TopLevel[AMGetAccountFriendsCount with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetAccountFriendsCountResponse extends EMsg
  /* 595 */ @js.native
  object AMGetAccountFriendsCountResponse extends TopLevel[AMGetAccountFriendsCountResponse with Double]
  
  @js.native
  sealed trait AMGetAccountLinks extends EMsg
  /* 4069 */ @js.native
  object AMGetAccountLinks extends TopLevel[AMGetAccountLinks with Double]
  
  @js.native
  sealed trait AMGetAccountLinksResponse extends EMsg
  /* 4070 */ @js.native
  object AMGetAccountLinksResponse extends TopLevel[AMGetAccountLinksResponse with Double]
  
  @js.native
  sealed trait AMGetAccountPSNInfo extends EMsg
  /* 4313 */ @js.native
  object AMGetAccountPSNInfo extends TopLevel[AMGetAccountPSNInfo with Double]
  
  @js.native
  sealed trait AMGetAccountPSNInfoResponse extends EMsg
  /* 4314 */ @js.native
  object AMGetAccountPSNInfoResponse extends TopLevel[AMGetAccountPSNInfoResponse with Double]
  
  @js.native
  sealed trait AMGetAccountResetDetailsRequest extends EMsg
  /* 4408 */ @js.native
  object AMGetAccountResetDetailsRequest extends TopLevel[AMGetAccountResetDetailsRequest with Double]
  
  @js.native
  sealed trait AMGetAccountResetDetailsResponse extends EMsg
  /* 4409 */ @js.native
  object AMGetAccountResetDetailsResponse extends TopLevel[AMGetAccountResetDetailsResponse with Double]
  
  @js.native
  sealed trait AMGetAccountStatus extends EMsg
  /* 4158 */ @js.native
  object AMGetAccountStatus extends TopLevel[AMGetAccountStatus with Double]
  
  @js.native
  sealed trait AMGetAccountStatusResponse extends EMsg
  /* 4159 */ @js.native
  object AMGetAccountStatusResponse extends TopLevel[AMGetAccountStatusResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetBillingAddress extends EMsg
  /* 4188 */ @js.native
  object AMGetBillingAddress extends TopLevel[AMGetBillingAddress with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetBillingAddressResponse extends EMsg
  /* 4189 */ @js.native
  object AMGetBillingAddressResponse extends TopLevel[AMGetBillingAddressResponse with Double]
  
  @js.native
  sealed trait AMGetCaptchaDataByGID extends EMsg
  /* 4134 */ @js.native
  object AMGetCaptchaDataByGID extends TopLevel[AMGetCaptchaDataByGID with Double]
  
  @js.native
  sealed trait AMGetCaptchaDataByGIDResponse extends EMsg
  /* 4135 */ @js.native
  object AMGetCaptchaDataByGIDResponse extends TopLevel[AMGetCaptchaDataByGIDResponse with Double]
  
  @js.native
  sealed trait AMGetCaptchaDataForIP extends EMsg
  /* 4129 */ @js.native
  object AMGetCaptchaDataForIP extends TopLevel[AMGetCaptchaDataForIP with Double]
  
  @js.native
  sealed trait AMGetCaptchaDataForIPResponse extends EMsg
  /* 4130 */ @js.native
  object AMGetCaptchaDataForIPResponse extends TopLevel[AMGetCaptchaDataForIPResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetCardList extends EMsg
  /* 4239 */ @js.native
  object AMGetCardList extends TopLevel[AMGetCardList with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetCardListResponse extends EMsg
  /* 4240 */ @js.native
  object AMGetCardListResponse extends TopLevel[AMGetCardListResponse with Double]
  
  @js.native
  sealed trait AMGetChatBanList extends EMsg
  /* 4065 */ @js.native
  object AMGetChatBanList extends TopLevel[AMGetChatBanList with Double]
  
  @js.native
  sealed trait AMGetChatBanListResponse extends EMsg
  /* 4066 */ @js.native
  object AMGetChatBanListResponse extends TopLevel[AMGetChatBanListResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetClanAnnouncements extends EMsg
  /* 4033 */ @js.native
  object AMGetClanAnnouncements extends TopLevel[AMGetClanAnnouncements with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetClanAnnouncementsCount extends EMsg
  /* 4031 */ @js.native
  object AMGetClanAnnouncementsCount extends TopLevel[AMGetClanAnnouncementsCount with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetClanAnnouncementsCountResponse extends EMsg
  /* 4032 */ @js.native
  object AMGetClanAnnouncementsCountResponse extends TopLevel[AMGetClanAnnouncementsCountResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetClanAnnouncementsResponse extends EMsg
  /* 4034 */ @js.native
  object AMGetClanAnnouncementsResponse extends TopLevel[AMGetClanAnnouncementsResponse with Double]
  
  @js.native
  sealed trait AMGetClanDetails extends EMsg
  /* 588 */ @js.native
  object AMGetClanDetails extends TopLevel[AMGetClanDetails with Double]
  
  @js.native
  sealed trait AMGetClanDetailsForForumCreation extends EMsg
  /* 4373 */ @js.native
  object AMGetClanDetailsForForumCreation extends TopLevel[AMGetClanDetailsForForumCreation with Double]
  
  @js.native
  sealed trait AMGetClanDetailsForForumCreationResponse extends EMsg
  /* 4374 */ @js.native
  object AMGetClanDetailsForForumCreationResponse extends TopLevel[AMGetClanDetailsForForumCreationResponse with Double]
  
  @js.native
  sealed trait AMGetClanDetailsResponse extends EMsg
  /* 589 */ @js.native
  object AMGetClanDetailsResponse extends TopLevel[AMGetClanDetailsResponse with Double]
  
  @js.native
  sealed trait AMGetClanEvents extends EMsg
  /* 4017 */ @js.native
  object AMGetClanEvents extends TopLevel[AMGetClanEvents with Double]
  
  @js.native
  sealed trait AMGetClanEventsResponse extends EMsg
  /* 4018 */ @js.native
  object AMGetClanEventsResponse extends TopLevel[AMGetClanEventsResponse with Double]
  
  @js.native
  sealed trait AMGetClanHistory extends EMsg
  /* 4039 */ @js.native
  object AMGetClanHistory extends TopLevel[AMGetClanHistory with Double]
  
  @js.native
  sealed trait AMGetClanHistoryResponse extends EMsg
  /* 4040 */ @js.native
  object AMGetClanHistoryResponse extends TopLevel[AMGetClanHistoryResponse with Double]
  
  @js.native
  sealed trait AMGetClanMembers extends EMsg
  /* 4076 */ @js.native
  object AMGetClanMembers extends TopLevel[AMGetClanMembers with Double]
  
  @js.native
  sealed trait AMGetClanMembersResponse extends EMsg
  /* 4077 */ @js.native
  object AMGetClanMembersResponse extends TopLevel[AMGetClanMembersResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetClanMembershipList extends EMsg
  /* 4088 */ @js.native
  object AMGetClanMembershipList extends TopLevel[AMGetClanMembershipList with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetClanMembershipListResponse extends EMsg
  /* 4089 */ @js.native
  object AMGetClanMembershipListResponse extends TopLevel[AMGetClanMembershipListResponse with Double]
  
  @js.native
  sealed trait AMGetClanOfficers extends EMsg
  /* 4298 */ @js.native
  object AMGetClanOfficers extends TopLevel[AMGetClanOfficers with Double]
  
  @js.native
  sealed trait AMGetClanOfficersResponse extends EMsg
  /* 4299 */ @js.native
  object AMGetClanOfficersResponse extends TopLevel[AMGetClanOfficersResponse with Double]
  
  @js.native
  sealed trait AMGetClanPOTW extends EMsg
  /* 4054 */ @js.native
  object AMGetClanPOTW extends TopLevel[AMGetClanPOTW with Double]
  
  @js.native
  sealed trait AMGetClanPOTWResponse extends EMsg
  /* 4055 */ @js.native
  object AMGetClanPOTWResponse extends TopLevel[AMGetClanPOTWResponse with Double]
  
  @js.native
  sealed trait AMGetClanPermissionBits extends EMsg
  /* 4041 */ @js.native
  object AMGetClanPermissionBits extends TopLevel[AMGetClanPermissionBits with Double]
  
  @js.native
  sealed trait AMGetClanPermissionBitsResponse extends EMsg
  /* 4042 */ @js.native
  object AMGetClanPermissionBitsResponse extends TopLevel[AMGetClanPermissionBitsResponse with Double]
  
  @js.native
  sealed trait AMGetClanPermissionSettings extends EMsg
  /* 4023 */ @js.native
  object AMGetClanPermissionSettings extends TopLevel[AMGetClanPermissionSettings with Double]
  
  @js.native
  sealed trait AMGetClanPermissionSettingsResponse extends EMsg
  /* 4024 */ @js.native
  object AMGetClanPermissionSettingsResponse extends TopLevel[AMGetClanPermissionSettingsResponse with Double]
  
  @js.native
  sealed trait AMGetClanRank extends EMsg
  /* 4050 */ @js.native
  object AMGetClanRank extends TopLevel[AMGetClanRank with Double]
  
  @js.native
  sealed trait AMGetClanRankResponse extends EMsg
  /* 4051 */ @js.native
  object AMGetClanRankResponse extends TopLevel[AMGetClanRankResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetComments extends EMsg
  /* 4200 */ @js.native
  object AMGetComments extends TopLevel[AMGetComments with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetCommentsResponse extends EMsg
  /* 4201 */ @js.native
  object AMGetCommentsResponse extends TopLevel[AMGetCommentsResponse with Double]
  
  @js.native
  sealed trait AMGetCommunityPrivacyState extends EMsg
  /* 4116 */ @js.native
  object AMGetCommunityPrivacyState extends TopLevel[AMGetCommunityPrivacyState with Double]
  
  @js.native
  sealed trait AMGetCommunityPrivacyStateResponse extends EMsg
  /* 4117 */ @js.native
  object AMGetCommunityPrivacyStateResponse extends TopLevel[AMGetCommunityPrivacyStateResponse with Double]
  
  @js.native
  sealed trait AMGetFinalPrice extends EMsg
  /* 514 */ @js.native
  object AMGetFinalPrice extends TopLevel[AMGetFinalPrice with Double]
  
  @js.native
  sealed trait AMGetFinalPriceResponse extends EMsg
  /* 515 */ @js.native
  object AMGetFinalPriceResponse extends TopLevel[AMGetFinalPriceResponse with Double]
  
  @js.native
  sealed trait AMGetFriendRelationship extends EMsg
  /* 4124 */ @js.native
  object AMGetFriendRelationship extends TopLevel[AMGetFriendRelationship with Double]
  
  @js.native
  sealed trait AMGetFriendRelationshipResponse extends EMsg
  /* 4125 */ @js.native
  object AMGetFriendRelationshipResponse extends TopLevel[AMGetFriendRelationshipResponse with Double]
  
  @js.native
  sealed trait AMGetFriendsLobbies extends EMsg
  /* 4165 */ @js.native
  object AMGetFriendsLobbies extends TopLevel[AMGetFriendsLobbies with Double]
  
  @js.native
  sealed trait AMGetFriendsLobbiesResponse extends EMsg
  /* 4166 */ @js.native
  object AMGetFriendsLobbiesResponse extends TopLevel[AMGetFriendsLobbiesResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetFriendsWishlistInfo extends EMsg
  /* 4296 */ @js.native
  object AMGetFriendsWishlistInfo extends TopLevel[AMGetFriendsWishlistInfo with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetFriendsWishlistInfoResponse extends EMsg
  /* 4297 */ @js.native
  object AMGetFriendsWishlistInfoResponse extends TopLevel[AMGetFriendsWishlistInfoResponse with Double]
  
  @js.native
  sealed trait AMGetGSPlayerList extends EMsg
  /* 4271 */ @js.native
  object AMGetGSPlayerList extends TopLevel[AMGetGSPlayerList with Double]
  
  @js.native
  sealed trait AMGetGSPlayerListResponse extends EMsg
  /* 4272 */ @js.native
  object AMGetGSPlayerListResponse extends TopLevel[AMGetGSPlayerListResponse with Double]
  
  @js.native
  sealed trait AMGetGameMembers extends EMsg
  /* 4276 */ @js.native
  object AMGetGameMembers extends TopLevel[AMGetGameMembers with Double]
  
  @js.native
  sealed trait AMGetGameMembersResponse extends EMsg
  /* 4277 */ @js.native
  object AMGetGameMembersResponse extends TopLevel[AMGetGameMembersResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetGiftTargetListRelay extends EMsg
  /* 4094 */ @js.native
  object AMGetGiftTargetListRelay extends TopLevel[AMGetGiftTargetListRelay with Double]
  
  @js.native
  sealed trait AMGetIgnored extends EMsg
  /* 4120 */ @js.native
  object AMGetIgnored extends TopLevel[AMGetIgnored with Double]
  
  @js.native
  sealed trait AMGetIgnoredResponse extends EMsg
  /* 4121 */ @js.native
  object AMGetIgnoredResponse extends TopLevel[AMGetIgnoredResponse with Double]
  
  @js.native
  sealed trait AMGetLegacyGameKey extends EMsg
  /* 516 */ @js.native
  object AMGetLegacyGameKey extends TopLevel[AMGetLegacyGameKey with Double]
  
  @js.native
  sealed trait AMGetLegacyGameKeyResponse extends EMsg
  /* 517 */ @js.native
  object AMGetLegacyGameKeyResponse extends TopLevel[AMGetLegacyGameKeyResponse with Double]
  
  @js.native
  sealed trait AMGetLicenses extends EMsg
  /* 539 */ @js.native
  object AMGetLicenses extends TopLevel[AMGetLicenses with Double]
  
  @js.native
  sealed trait AMGetLicensesResponse extends EMsg
  /* 540 */ @js.native
  object AMGetLicensesResponse extends TopLevel[AMGetLicensesResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetLobbyList extends EMsg
  /* 4136 */ @js.native
  object AMGetLobbyList extends TopLevel[AMGetLobbyList with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetLobbyListResponse extends EMsg
  /* 4137 */ @js.native
  object AMGetLobbyListResponse extends TopLevel[AMGetLobbyListResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetLobbyMetadata extends EMsg
  /* 4138 */ @js.native
  object AMGetLobbyMetadata extends TopLevel[AMGetLobbyMetadata with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetLobbyMetadataResponse extends EMsg
  /* 4139 */ @js.native
  object AMGetLobbyMetadataResponse extends TopLevel[AMGetLobbyMetadataResponse with Double]
  
  @js.native
  sealed trait AMGetNameHistory extends EMsg
  /* 4301 */ @js.native
  object AMGetNameHistory extends TopLevel[AMGetNameHistory with Double]
  
  @js.native
  sealed trait AMGetNameHistoryResponse extends EMsg
  /* 4302 */ @js.native
  object AMGetNameHistoryResponse extends TopLevel[AMGetNameHistoryResponse with Double]
  
  @js.native
  sealed trait AMGetPaypalAgreements extends EMsg
  /* 4333 */ @js.native
  object AMGetPaypalAgreements extends TopLevel[AMGetPaypalAgreements with Double]
  
  @js.native
  sealed trait AMGetPaypalAgreementsResponse extends EMsg
  /* 4334 */ @js.native
  object AMGetPaypalAgreementsResponse extends TopLevel[AMGetPaypalAgreementsResponse with Double]
  
  @js.native
  sealed trait AMGetPendingNotificationCount extends EMsg
  /* 4375 */ @js.native
  object AMGetPendingNotificationCount extends TopLevel[AMGetPendingNotificationCount with Double]
  
  @js.native
  sealed trait AMGetPendingNotificationCountResponse extends EMsg
  /* 4376 */ @js.native
  object AMGetPendingNotificationCountResponse extends TopLevel[AMGetPendingNotificationCountResponse with Double]
  
  @js.native
  sealed trait AMGetPlayerBanDetails extends EMsg
  /* 4365 */ @js.native
  object AMGetPlayerBanDetails extends TopLevel[AMGetPlayerBanDetails with Double]
  
  @js.native
  sealed trait AMGetPlayerBanDetailsResponse extends EMsg
  /* 4366 */ @js.native
  object AMGetPlayerBanDetailsResponse extends TopLevel[AMGetPlayerBanDetailsResponse with Double]
  
  @js.native
  sealed trait AMGetPlayerLinkDetails extends EMsg
  /* 4289 */ @js.native
  object AMGetPlayerLinkDetails extends TopLevel[AMGetPlayerLinkDetails with Double]
  
  @js.native
  sealed trait AMGetPlayerLinkDetailsResponse extends EMsg
  /* 4290 */ @js.native
  object AMGetPlayerLinkDetailsResponse extends TopLevel[AMGetPlayerLinkDetailsResponse with Double]
  
  @js.native
  sealed trait AMGetPreviousCBAccount extends EMsg
  /* 4184 */ @js.native
  object AMGetPreviousCBAccount extends TopLevel[AMGetPreviousCBAccount with Double]
  
  @js.native
  sealed trait AMGetPreviousCBAccountResponse extends EMsg
  /* 4185 */ @js.native
  object AMGetPreviousCBAccountResponse extends TopLevel[AMGetPreviousCBAccountResponse with Double]
  
  @js.native
  sealed trait AMGetPurchaseStatus extends EMsg
  /* 4206 */ @js.native
  object AMGetPurchaseStatus extends TopLevel[AMGetPurchaseStatus with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetSingleClanAnnouncement extends EMsg
  /* 4037 */ @js.native
  object AMGetSingleClanAnnouncement extends TopLevel[AMGetSingleClanAnnouncement with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetSingleClanAnnouncementResponse extends EMsg
  /* 4038 */ @js.native
  object AMGetSingleClanAnnouncementResponse extends TopLevel[AMGetSingleClanAnnouncementResponse with Double]
  
  @js.native
  sealed trait AMGetSingleClanEvent extends EMsg
  /* 4048 */ @js.native
  object AMGetSingleClanEvent extends TopLevel[AMGetSingleClanEvent with Double]
  
  @js.native
  sealed trait AMGetSingleClanEventResponse extends EMsg
  /* 4049 */ @js.native
  object AMGetSingleClanEventResponse extends TopLevel[AMGetSingleClanEventResponse with Double]
  
  @js.native
  sealed trait AMGetSteamIDForMicroTxn extends EMsg
  /* 4278 */ @js.native
  object AMGetSteamIDForMicroTxn extends TopLevel[AMGetSteamIDForMicroTxn with Double]
  
  @js.native
  sealed trait AMGetSteamIDForMicroTxnResponse extends EMsg
  /* 4279 */ @js.native
  object AMGetSteamIDForMicroTxnResponse extends TopLevel[AMGetSteamIDForMicroTxnResponse with Double]
  
  @js.native
  sealed trait AMGetStoredPaymentSummary extends EMsg
  /* 4247 */ @js.native
  object AMGetStoredPaymentSummary extends TopLevel[AMGetStoredPaymentSummary with Double]
  
  @js.native
  sealed trait AMGetStoredPaymentSummaryResponse extends EMsg
  /* 4248 */ @js.native
  object AMGetStoredPaymentSummaryResponse extends TopLevel[AMGetStoredPaymentSummaryResponse with Double]
  
  @js.native
  sealed trait AMGetUserAchievementStatus extends EMsg
  /* 4119 */ @js.native
  object AMGetUserAchievementStatus extends TopLevel[AMGetUserAchievementStatus with Double]
  
  @js.native
  sealed trait AMGetUserClansNews extends EMsg
  /* 4175 */ @js.native
  object AMGetUserClansNews extends TopLevel[AMGetUserClansNews with Double]
  
  @js.native
  sealed trait AMGetUserClansNewsResponse extends EMsg
  /* 4174 */ @js.native
  object AMGetUserClansNewsResponse extends TopLevel[AMGetUserClansNewsResponse with Double]
  
  @js.native
  sealed trait AMGetUserCurrentGameInfo extends EMsg
  /* 4269 */ @js.native
  object AMGetUserCurrentGameInfo extends TopLevel[AMGetUserCurrentGameInfo with Double]
  
  @js.native
  sealed trait AMGetUserCurrentGameInfoResponse extends EMsg
  /* 4270 */ @js.native
  object AMGetUserCurrentGameInfoResponse extends TopLevel[AMGetUserCurrentGameInfoResponse with Double]
  
  @js.native
  sealed trait AMGetUserFriendNewsResponse extends EMsg
  /* 4172 */ @js.native
  object AMGetUserFriendNewsResponse extends TopLevel[AMGetUserFriendNewsResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetUserFriendsMinutesPlayed extends EMsg
  /* 4225 */ @js.native
  object AMGetUserFriendsMinutesPlayed extends TopLevel[AMGetUserFriendsMinutesPlayed with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetUserFriendsMinutesPlayedResponse extends EMsg
  /* 4226 */ @js.native
  object AMGetUserFriendsMinutesPlayedResponse extends TopLevel[AMGetUserFriendsMinutesPlayedResponse with Double]
  
  @js.native
  sealed trait AMGetUserGameStats extends EMsg
  /* 4073 */ @js.native
  object AMGetUserGameStats extends TopLevel[AMGetUserGameStats with Double]
  
  @js.native
  sealed trait AMGetUserGameStatsResponse extends EMsg
  /* 4074 */ @js.native
  object AMGetUserGameStatsResponse extends TopLevel[AMGetUserGameStatsResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetUserGameplayInfo extends EMsg
  /* 4237 */ @js.native
  object AMGetUserGameplayInfo extends TopLevel[AMGetUserGameplayInfo with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetUserGameplayInfoResponse extends EMsg
  /* 4238 */ @js.native
  object AMGetUserGameplayInfoResponse extends TopLevel[AMGetUserGameplayInfoResponse with Double]
  
  @js.native
  sealed trait AMGetUserGifts extends EMsg
  /* 4316 */ @js.native
  object AMGetUserGifts extends TopLevel[AMGetUserGifts with Double]
  
  @js.native
  sealed trait AMGetUserGiftsResponse extends EMsg
  /* 4317 */ @js.native
  object AMGetUserGiftsResponse extends TopLevel[AMGetUserGiftsResponse with Double]
  
  @js.native
  sealed trait AMGetUserGroupStatus extends EMsg
  /* 921 */ @js.native
  object AMGetUserGroupStatus extends TopLevel[AMGetUserGroupStatus with Double]
  
  @js.native
  sealed trait AMGetUserGroupStatusResponse extends EMsg
  /* 922 */ @js.native
  object AMGetUserGroupStatusResponse extends TopLevel[AMGetUserGroupStatusResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetUserHistory extends EMsg
  /* 4154 */ @js.native
  object AMGetUserHistory extends TopLevel[AMGetUserHistory with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetUserHistoryResponse extends EMsg
  /* 4146 */ @js.native
  object AMGetUserHistoryResponse extends TopLevel[AMGetUserHistoryResponse with Double]
  
  @js.native
  sealed trait AMGetUserLicenseHistory extends EMsg
  /* 4190 */ @js.native
  object AMGetUserLicenseHistory extends TopLevel[AMGetUserLicenseHistory with Double]
  
  @js.native
  sealed trait AMGetUserLicenseHistoryResponse extends EMsg
  /* 4191 */ @js.native
  object AMGetUserLicenseHistoryResponse extends TopLevel[AMGetUserLicenseHistoryResponse with Double]
  
  @js.native
  sealed trait AMGetUserLicenseList extends EMsg
  /* 4282 */ @js.native
  object AMGetUserLicenseList extends TopLevel[AMGetUserLicenseList with Double]
  
  @js.native
  sealed trait AMGetUserLicenseListResponse extends EMsg
  /* 4283 */ @js.native
  object AMGetUserLicenseListResponse extends TopLevel[AMGetUserLicenseListResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetUserMinutesPlayed extends EMsg
  /* 4227 */ @js.native
  object AMGetUserMinutesPlayed extends TopLevel[AMGetUserMinutesPlayed with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetUserMinutesPlayedResponse extends EMsg
  /* 4228 */ @js.native
  object AMGetUserMinutesPlayedResponse extends TopLevel[AMGetUserMinutesPlayedResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetUserNews extends EMsg
  /* 4150 */ @js.native
  object AMGetUserNews extends TopLevel[AMGetUserNews with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetUserNewsResponse extends EMsg
  /* 4151 */ @js.native
  object AMGetUserNewsResponse extends TopLevel[AMGetUserNewsResponse with Double]
  
  @js.native
  sealed trait AMGetUserNewsSubscriptions extends EMsg
  /* 4147 */ @js.native
  object AMGetUserNewsSubscriptions extends TopLevel[AMGetUserNewsSubscriptions with Double]
  
  @js.native
  sealed trait AMGetUserNewsSubscriptionsResponse extends EMsg
  /* 4148 */ @js.native
  object AMGetUserNewsSubscriptionsResponse extends TopLevel[AMGetUserNewsSubscriptionsResponse with Double]
  
  @js.native
  sealed trait AMGetUserStats extends EMsg
  /* 4211 */ @js.native
  object AMGetUserStats extends TopLevel[AMGetUserStats with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetUserVacBanList extends EMsg
  /* 4292 */ @js.native
  object AMGetUserVacBanList extends TopLevel[AMGetUserVacBanList with Double]
  
   // obsolete
  @js.native
  sealed trait AMGetUserVacBanListResponse extends EMsg
  /* 4293 */ @js.native
  object AMGetUserVacBanListResponse extends TopLevel[AMGetUserVacBanListResponse with Double]
  
  @js.native
  sealed trait AMGetWalletConversionRate extends EMsg
  /* 4249 */ @js.native
  object AMGetWalletConversionRate extends TopLevel[AMGetWalletConversionRate with Double]
  
  @js.native
  sealed trait AMGetWalletConversionRateResponse extends EMsg
  /* 4250 */ @js.native
  object AMGetWalletConversionRateResponse extends TopLevel[AMGetWalletConversionRateResponse with Double]
  
  @js.native
  sealed trait AMGetWalletDetails extends EMsg
  /* 4244 */ @js.native
  object AMGetWalletDetails extends TopLevel[AMGetWalletDetails with Double]
  
  @js.native
  sealed trait AMGetWalletDetailsResponse extends EMsg
  /* 4245 */ @js.native
  object AMGetWalletDetailsResponse extends TopLevel[AMGetWalletDetailsResponse with Double]
  
  @js.native
  sealed trait AMGiftRevoked extends EMsg
  /* 4108 */ @js.native
  object AMGiftRevoked extends TopLevel[AMGiftRevoked with Double]
  
  @js.native
  sealed trait AMGrantCoupon extends EMsg
  /* 4356 */ @js.native
  object AMGrantCoupon extends TopLevel[AMGrantCoupon with Double]
  
  @js.native
  sealed trait AMGrantCouponResponse extends EMsg
  /* 4357 */ @js.native
  object AMGrantCouponResponse extends TopLevel[AMGrantCouponResponse with Double]
  
  @js.native
  sealed trait AMGrantGuestPasses extends EMsg
  /* 566 */ @js.native
  object AMGrantGuestPasses extends TopLevel[AMGrantGuestPasses with Double]
  
  @js.native
  sealed trait AMGrantGuestPasses2 extends EMsg
  /* 4361 */ @js.native
  object AMGrantGuestPasses2 extends TopLevel[AMGrantGuestPasses2 with Double]
  
  @js.native
  sealed trait AMGrantGuestPasses2Response extends EMsg
  /* 4362 */ @js.native
  object AMGrantGuestPasses2Response extends TopLevel[AMGrantGuestPasses2Response with Double]
  
  @js.native
  sealed trait AMHandlePendingTransaction extends EMsg
  /* 4328 */ @js.native
  object AMHandlePendingTransaction extends TopLevel[AMHandlePendingTransaction with Double]
  
  @js.native
  sealed trait AMHandlePendingTransactionResponse extends EMsg
  /* 4360 */ @js.native
  object AMHandlePendingTransactionResponse extends TopLevel[AMHandlePendingTransactionResponse with Double]
  
  @js.native
  sealed trait AMInitPurchase extends EMsg
  /* 512 */ @js.native
  object AMInitPurchase extends TopLevel[AMInitPurchase with Double]
  
  @js.native
  sealed trait AMInitPurchaseResponse extends EMsg
  /* 560 */ @js.native
  object AMInitPurchaseResponse extends TopLevel[AMInitPurchaseResponse with Double]
  
  @js.native
  sealed trait AMInviteUserToClan extends EMsg
  /* 564 */ @js.native
  object AMInviteUserToClan extends TopLevel[AMInviteUserToClan with Double]
  
  @js.native
  sealed trait AMIsAccountInCaptchaGracePeriod extends EMsg
  /* 4308 */ @js.native
  object AMIsAccountInCaptchaGracePeriod extends TopLevel[AMIsAccountInCaptchaGracePeriod with Double]
  
  @js.native
  sealed trait AMIsAccountInCaptchaGracePeriodResponse extends EMsg
  /* 4309 */ @js.native
  object AMIsAccountInCaptchaGracePeriodResponse extends TopLevel[AMIsAccountInCaptchaGracePeriodResponse with Double]
  
  @js.native
  sealed trait AMIsPackageRestrictedInUserCountry extends EMsg
  /* 4358 */ @js.native
  object AMIsPackageRestrictedInUserCountry extends TopLevel[AMIsPackageRestrictedInUserCountry with Double]
  
  @js.native
  sealed trait AMIsPackageRestrictedInUserCountryResponse extends EMsg
  /* 4359 */ @js.native
  object AMIsPackageRestrictedInUserCountryResponse extends TopLevel[AMIsPackageRestrictedInUserCountryResponse with Double]
  
  @js.native
  sealed trait AMIsUserBanned extends EMsg
  /* 527 */ @js.native
  object AMIsUserBanned extends TopLevel[AMIsUserBanned with Double]
  
  @js.native
  sealed trait AMIsValidAccountID extends EMsg
  /* 4092 */ @js.native
  object AMIsValidAccountID extends TopLevel[AMIsValidAccountID with Double]
  
  @js.native
  sealed trait AMJoinPublicClan extends EMsg
  /* 4078 */ @js.native
  object AMJoinPublicClan extends TopLevel[AMJoinPublicClan with Double]
  
  @js.native
  sealed trait AMKickUserFromClan extends EMsg
  /* 4060 */ @js.native
  object AMKickUserFromClan extends TopLevel[AMKickUserFromClan with Double]
  
  @js.native
  sealed trait AMLeaveClan extends EMsg
  /* 4010 */ @js.native
  object AMLeaveClan extends TopLevel[AMLeaveClan with Double]
  
  @js.native
  sealed trait AMLoadActivationCodes extends EMsg
  /* 529 */ @js.native
  object AMLoadActivationCodes extends TopLevel[AMLoadActivationCodes with Double]
  
  @js.native
  sealed trait AMLoadActivationCodesResponse extends EMsg
  /* 530 */ @js.native
  object AMLoadActivationCodesResponse extends TopLevel[AMLoadActivationCodesResponse with Double]
  
  @js.native
  sealed trait AMLoadOEMTickets extends EMsg
  /* 524 */ @js.native
  object AMLoadOEMTickets extends TopLevel[AMLoadOEMTickets with Double]
  
   // obsolete
  @js.native
  sealed trait AMLockProfile extends EMsg
  /* 562 */ @js.native
  object AMLockProfile extends TopLevel[AMLockProfile with Double]
  
  @js.native
  sealed trait AMLookupKey extends EMsg
  /* 532 */ @js.native
  object AMLookupKey extends TopLevel[AMLookupKey with Double]
  
  @js.native
  sealed trait AMLookupKeyResponse extends EMsg
  /* 531 */ @js.native
  object AMLookupKeyResponse extends TopLevel[AMLookupKeyResponse with Double]
  
  @js.native
  sealed trait AMMOLPayment extends EMsg
  /* 4391 */ @js.native
  object AMMOLPayment extends TopLevel[AMMOLPayment with Double]
  
  @js.native
  sealed trait AMMOLPaymentResponse extends EMsg
  /* 4392 */ @js.native
  object AMMOLPaymentResponse extends TopLevel[AMMOLPaymentResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMMarketingTreatmentUpdate extends EMsg
  /* 4257 */ @js.native
  object AMMarketingTreatmentUpdate extends TopLevel[AMMarketingTreatmentUpdate with Double]
  
  @js.native
  sealed trait AMMoPayPayment extends EMsg
  /* 4378 */ @js.native
  object AMMoPayPayment extends TopLevel[AMMoPayPayment with Double]
  
  @js.native
  sealed trait AMMoPayPaymentResponse extends EMsg
  /* 4379 */ @js.native
  object AMMoPayPaymentResponse extends TopLevel[AMMoPayPaymentResponse with Double]
  
  @js.native
  sealed trait AMNameChange extends EMsg
  /* 4300 */ @js.native
  object AMNameChange extends TopLevel[AMNameChange with Double]
  
  @js.native
  sealed trait AMNewChallenge extends EMsg
  /* 523 */ @js.native
  object AMNewChallenge extends TopLevel[AMNewChallenge with Double]
  
  @js.native
  sealed trait AMNotifyChatOfClanChange extends EMsg
  /* 4079 */ @js.native
  object AMNotifyChatOfClanChange extends TopLevel[AMNotifyChatOfClanChange with Double]
  
  @js.native
  sealed trait AMNotifySessionDeviceAuthorized extends EMsg
  /* 6508 */ @js.native
  object AMNotifySessionDeviceAuthorized extends TopLevel[AMNotifySessionDeviceAuthorized with Double]
  
  @js.native
  sealed trait AMP2PIntroducerMessage extends EMsg
  /* 596 */ @js.native
  object AMP2PIntroducerMessage extends TopLevel[AMP2PIntroducerMessage with Double]
  
  @js.native
  sealed trait AMPasswordHashUpgrade extends EMsg
  /* 4377 */ @js.native
  object AMPasswordHashUpgrade extends TopLevel[AMPasswordHashUpgrade with Double]
  
  @js.native
  sealed trait AMPayPalPaymentsHubPayment extends EMsg
  /* 4400 */ @js.native
  object AMPayPalPaymentsHubPayment extends TopLevel[AMPayPalPaymentsHubPayment with Double]
  
  @js.native
  sealed trait AMPayPalPaymentsHubPaymentResponse extends EMsg
  /* 4401 */ @js.native
  object AMPayPalPaymentsHubPaymentResponse extends TopLevel[AMPayPalPaymentsHubPaymentResponse with Double]
  
  @js.native
  sealed trait AMPayelpPayment extends EMsg
  /* 4387 */ @js.native
  object AMPayelpPayment extends TopLevel[AMPayelpPayment with Double]
  
  @js.native
  sealed trait AMPayelpPaymentResponse extends EMsg
  /* 4388 */ @js.native
  object AMPayelpPaymentResponse extends TopLevel[AMPayelpPaymentResponse with Double]
  
  @js.native
  sealed trait AMPersonaChangeResponse extends EMsg
  /* 4372 */ @js.native
  object AMPersonaChangeResponse extends TopLevel[AMPersonaChangeResponse with Double]
  
  @js.native
  sealed trait AMPlayerGetClanBasicDetails extends EMsg
  /* 4389 */ @js.native
  object AMPlayerGetClanBasicDetails extends TopLevel[AMPlayerGetClanBasicDetails with Double]
  
  @js.native
  sealed trait AMPlayerGetClanBasicDetailsResponse extends EMsg
  /* 4390 */ @js.native
  object AMPlayerGetClanBasicDetailsResponse extends TopLevel[AMPlayerGetClanBasicDetailsResponse with Double]
  
  @js.native
  sealed trait AMPlayerHostedOnGameServer extends EMsg
  /* 4322 */ @js.native
  object AMPlayerHostedOnGameServer extends TopLevel[AMPlayerHostedOnGameServer with Double]
  
  @js.native
  sealed trait AMPlayerNicknameList extends EMsg
  /* 4266 */ @js.native
  object AMPlayerNicknameList extends TopLevel[AMPlayerNicknameList with Double]
  
  @js.native
  sealed trait AMPlayerNicknameListResponse extends EMsg
  /* 4267 */ @js.native
  object AMPlayerNicknameListResponse extends TopLevel[AMPlayerNicknameListResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMPrimePersonaStateCache extends EMsg
  /* 557 */ @js.native
  object AMPrimePersonaStateCache extends TopLevel[AMPrimePersonaStateCache with Double]
  
  @js.native
  sealed trait AMProbeClanMembershipList extends EMsg
  /* 4162 */ @js.native
  object AMProbeClanMembershipList extends TopLevel[AMProbeClanMembershipList with Double]
  
  @js.native
  sealed trait AMProbeClanMembershipListResponse extends EMsg
  /* 4163 */ @js.native
  object AMProbeClanMembershipListResponse extends TopLevel[AMProbeClanMembershipListResponse with Double]
  
  @js.native
  sealed trait AMPublishChatMemberInfo extends EMsg
  /* 575 */ @js.native
  object AMPublishChatMemberInfo extends TopLevel[AMPublishChatMemberInfo with Double]
  
   // obsolete
  @js.native
  sealed trait AMPublishChatMetadata extends EMsg
  /* 4004 */ @js.native
  object AMPublishChatMetadata extends TopLevel[AMPublishChatMetadata with Double]
  
  @js.native
  sealed trait AMPublishChatRoomInfo extends EMsg
  /* 4025 */ @js.native
  object AMPublishChatRoomInfo extends TopLevel[AMPublishChatRoomInfo with Double]
  
  @js.native
  sealed trait AMPurchaseResponse extends EMsg
  /* 513 */ @js.native
  object AMPurchaseResponse extends TopLevel[AMPurchaseResponse with Double]
  
  @js.native
  sealed trait AMRecordBanEnforcement extends EMsg
  /* 4325 */ @js.native
  object AMRecordBanEnforcement extends TopLevel[AMRecordBanEnforcement with Double]
  
  @js.native
  sealed trait AMRefreshGuestPasses extends EMsg
  /* 563 */ @js.native
  object AMRefreshGuestPasses extends TopLevel[AMRefreshGuestPasses with Double]
  
  @js.native
  sealed trait AMRefreshSessions extends EMsg
  /* 2210 */ @js.native
  object AMRefreshSessions extends TopLevel[AMRefreshSessions with Double]
  
  @js.native
  sealed trait AMRegisterKey extends EMsg
  /* 528 */ @js.native
  object AMRegisterKey extends TopLevel[AMRegisterKey with Double]
  
   // obsolete
  @js.native
  sealed trait AMRelayGetFriendsWhoPlayGame extends EMsg
  /* 4253 */ @js.native
  object AMRelayGetFriendsWhoPlayGame extends TopLevel[AMRelayGetFriendsWhoPlayGame with Double]
  
   // obsolete
  @js.native
  sealed trait AMRelayGetFriendsWhoPlayGameResponse extends EMsg
  /* 4254 */ @js.native
  object AMRelayGetFriendsWhoPlayGameResponse extends TopLevel[AMRelayGetFriendsWhoPlayGameResponse with Double]
  
  @js.native
  sealed trait AMRelayPublishStatus extends EMsg
  /* 555 */ @js.native
  object AMRelayPublishStatus extends TopLevel[AMRelayPublishStatus with Double]
  
   // obsolete
  @js.native
  sealed trait AMRelayToGC extends EMsg
  /* 2201 */ @js.native
  object AMRelayToGC extends TopLevel[AMRelayToGC with Double]
  
  @js.native
  sealed trait AMReloadAccount extends EMsg
  /* 568 */ @js.native
  object AMReloadAccount extends TopLevel[AMReloadAccount with Double]
  
  @js.native
  sealed trait AMReloadGameGroupPolicy extends EMsg
  /* 4284 */ @js.native
  object AMReloadGameGroupPolicy extends TopLevel[AMReloadGameGroupPolicy with Double]
  
  @js.native
  sealed trait AMRemoveFriend extends EMsg
  /* 4083 */ @js.native
  object AMRemoveFriend extends TopLevel[AMRemoveFriend with Double]
  
  @js.native
  sealed trait AMRemovePublisherUser extends EMsg
  /* 4281 */ @js.native
  object AMRemovePublisherUser extends TopLevel[AMRemovePublisherUser with Double]
  
  @js.native
  sealed trait AMRenewAgreement extends EMsg
  /* 4342 */ @js.native
  object AMRenewAgreement extends TopLevel[AMRenewAgreement with Double]
  
  @js.native
  sealed trait AMRenewLicense extends EMsg
  /* 4337 */ @js.native
  object AMRenewLicense extends TopLevel[AMRenewLicense with Double]
  
  @js.native
  sealed trait AMRequestAccountData extends EMsg
  /* 582 */ @js.native
  object AMRequestAccountData extends TopLevel[AMRequestAccountData with Double]
  
  @js.native
  sealed trait AMRequestAccountDataResponse extends EMsg
  /* 583 */ @js.native
  object AMRequestAccountDataResponse extends TopLevel[AMRequestAccountDataResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMRequestChatMetadata extends EMsg
  /* 4058 */ @js.native
  object AMRequestChatMetadata extends TopLevel[AMRequestChatMetadata with Double]
  
  @js.native
  sealed trait AMRequestClanData extends EMsg
  /* 4008 */ @js.native
  object AMRequestClanData extends TopLevel[AMRequestClanData with Double]
  
  @js.native
  sealed trait AMRequestClanDetails extends EMsg
  /* 4329 */ @js.native
  object AMRequestClanDetails extends TopLevel[AMRequestClanDetails with Double]
  
   // obsolete "renamed to AMRequestClanData"
  @js.native
  sealed trait AMRequestFriendData extends EMsg
  /* 4008 */ @js.native
  object AMRequestFriendData extends TopLevel[AMRequestFriendData with Double]
  
   // obsolete
  @js.native
  sealed trait AMResetCommunityContent extends EMsg
  /* 556 */ @js.native
  object AMResetCommunityContent extends TopLevel[AMResetCommunityContent with Double]
  
  @js.native
  sealed trait AMResetUserVerificationGSByIP extends EMsg
  /* 4197 */ @js.native
  object AMResetUserVerificationGSByIP extends TopLevel[AMResetUserVerificationGSByIP with Double]
  
  @js.native
  sealed trait AMResolveNegativeWalletCredits extends EMsg
  /* 4385 */ @js.native
  object AMResolveNegativeWalletCredits extends TopLevel[AMResolveNegativeWalletCredits with Double]
  
  @js.native
  sealed trait AMResolveNegativeWalletCreditsResponse extends EMsg
  /* 4386 */ @js.native
  object AMResolveNegativeWalletCreditsResponse extends TopLevel[AMResolveNegativeWalletCreditsResponse with Double]
  
  @js.native
  sealed trait AMResubmitPurchase extends EMsg
  /* 4080 */ @js.native
  object AMResubmitPurchase extends TopLevel[AMResubmitPurchase with Double]
  
  @js.native
  sealed trait AMReverseChargeback extends EMsg
  /* 536 */ @js.native
  object AMReverseChargeback extends TopLevel[AMReverseChargeback with Double]
  
  @js.native
  sealed trait AMReverseChargebackResponse extends EMsg
  /* 537 */ @js.native
  object AMReverseChargebackResponse extends TopLevel[AMReverseChargebackResponse with Double]
  
  @js.native
  sealed trait AMRevokeLegacyGameKeys extends EMsg
  /* 4242 */ @js.native
  object AMRevokeLegacyGameKeys extends TopLevel[AMRevokeLegacyGameKeys with Double]
  
  @js.native
  sealed trait AMRevokePurchaseResponse extends EMsg
  /* 561 */ @js.native
  object AMRevokePurchaseResponse extends TopLevel[AMRevokePurchaseResponse with Double]
  
  @js.native
  sealed trait AMRollbackGiftTransfer extends EMsg
  /* 4326 */ @js.native
  object AMRollbackGiftTransfer extends TopLevel[AMRollbackGiftTransfer with Double]
  
  @js.native
  sealed trait AMRollbackGiftTransferResponse extends EMsg
  /* 4327 */ @js.native
  object AMRollbackGiftTransferResponse extends TopLevel[AMRollbackGiftTransferResponse with Double]
  
  @js.native
  sealed trait AMRouteFriendMsg extends EMsg
  /* 4219 */ @js.native
  object AMRouteFriendMsg extends TopLevel[AMRouteFriendMsg with Double]
  
  @js.native
  sealed trait AMRouteToClients extends EMsg
  /* 4009 */ @js.native
  object AMRouteToClients extends TopLevel[AMRouteToClients with Double]
  
  @js.native
  sealed trait AMSendAccountInfoUpdate extends EMsg
  /* 4412 */ @js.native
  object AMSendAccountInfoUpdate extends TopLevel[AMSendAccountInfoUpdate with Double]
  
   // obsolete
  @js.native
  sealed trait AMSendEmail extends EMsg
  /* 4343 */ @js.native
  object AMSendEmail extends TopLevel[AMSendEmail with Double]
  
  @js.native
  sealed trait AMSendQueuedEmails extends EMsg
  /* 4152 */ @js.native
  object AMSendQueuedEmails extends TopLevel[AMSendQueuedEmails with Double]
  
  @js.native
  sealed trait AMSendSystemIMToUser extends EMsg
  /* 508 */ @js.native
  object AMSendSystemIMToUser extends TopLevel[AMSendSystemIMToUser with Double]
  
  @js.native
  sealed trait AMServiceModulesCache extends EMsg
  /* 4126 */ @js.native
  object AMServiceModulesCache extends TopLevel[AMServiceModulesCache with Double]
  
  @js.native
  sealed trait AMServiceModulesCall extends EMsg
  /* 4127 */ @js.native
  object AMServiceModulesCall extends TopLevel[AMServiceModulesCall with Double]
  
  @js.native
  sealed trait AMServiceModulesCallResponse extends EMsg
  /* 4128 */ @js.native
  object AMServiceModulesCallResponse extends TopLevel[AMServiceModulesCallResponse with Double]
  
  @js.native
  sealed trait AMSessionInfoRequest extends EMsg
  /* 4045 */ @js.native
  object AMSessionInfoRequest extends TopLevel[AMSessionInfoRequest with Double]
  
  @js.native
  sealed trait AMSessionInfoResponse extends EMsg
  /* 4046 */ @js.native
  object AMSessionInfoResponse extends TopLevel[AMSessionInfoResponse with Double]
  
  @js.native
  sealed trait AMSessionQuery extends EMsg
  /* 4363 */ @js.native
  object AMSessionQuery extends TopLevel[AMSessionQuery with Double]
  
  @js.native
  sealed trait AMSessionQueryResponse extends EMsg
  /* 4364 */ @js.native
  object AMSessionQueryResponse extends TopLevel[AMSessionQueryResponse with Double]
  
  @js.native
  sealed trait AMSetAccountDetails extends EMsg
  /* 4064 */ @js.native
  object AMSetAccountDetails extends TopLevel[AMSetAccountDetails with Double]
  
  @js.native
  sealed trait AMSetAccountFlags extends EMsg
  /* 584 */ @js.native
  object AMSetAccountFlags extends TopLevel[AMSetAccountFlags with Double]
  
  @js.native
  sealed trait AMSetAccountLinks extends EMsg
  /* 4071 */ @js.native
  object AMSetAccountLinks extends TopLevel[AMSetAccountLinks with Double]
  
  @js.native
  sealed trait AMSetAccountLinksResponse extends EMsg
  /* 4072 */ @js.native
  object AMSetAccountLinksResponse extends TopLevel[AMSetAccountLinksResponse with Double]
  
  @js.native
  sealed trait AMSetAccountTrustedRequest extends EMsg
  /* 519 */ @js.native
  object AMSetAccountTrustedRequest extends TopLevel[AMSetAccountTrustedRequest with Double]
  
  @js.native
  sealed trait AMSetAvatar extends EMsg
  /* 591 */ @js.native
  object AMSetAvatar extends TopLevel[AMSetAvatar with Double]
  
  @js.native
  sealed trait AMSetClanDetails extends EMsg
  /* 4068 */ @js.native
  object AMSetClanDetails extends TopLevel[AMSetClanDetails with Double]
  
  @js.native
  sealed trait AMSetClanName extends EMsg
  /* 4354 */ @js.native
  object AMSetClanName extends TopLevel[AMSetClanName with Double]
  
  @js.native
  sealed trait AMSetClanNameResponse extends EMsg
  /* 4355 */ @js.native
  object AMSetClanNameResponse extends TopLevel[AMSetClanNameResponse with Double]
  
  @js.native
  sealed trait AMSetClanPOTW extends EMsg
  /* 4056 */ @js.native
  object AMSetClanPOTW extends TopLevel[AMSetClanPOTW with Double]
  
  @js.native
  sealed trait AMSetClanPOTWResponse extends EMsg
  /* 4057 */ @js.native
  object AMSetClanPOTWResponse extends TopLevel[AMSetClanPOTWResponse with Double]
  
  @js.native
  sealed trait AMSetClanPermissionBits extends EMsg
  /* 4043 */ @js.native
  object AMSetClanPermissionBits extends TopLevel[AMSetClanPermissionBits with Double]
  
  @js.native
  sealed trait AMSetClanPermissionBitsResponse extends EMsg
  /* 4044 */ @js.native
  object AMSetClanPermissionBitsResponse extends TopLevel[AMSetClanPermissionBitsResponse with Double]
  
  @js.native
  sealed trait AMSetClanPermissionSettings extends EMsg
  /* 4021 */ @js.native
  object AMSetClanPermissionSettings extends TopLevel[AMSetClanPermissionSettings with Double]
  
  @js.native
  sealed trait AMSetClanPermissionSettingsResponse extends EMsg
  /* 4022 */ @js.native
  object AMSetClanPermissionSettingsResponse extends TopLevel[AMSetClanPermissionSettingsResponse with Double]
  
  @js.native
  sealed trait AMSetClanRank extends EMsg
  /* 4052 */ @js.native
  object AMSetClanRank extends TopLevel[AMSetClanRank with Double]
  
  @js.native
  sealed trait AMSetClanRankResponse extends EMsg
  /* 4053 */ @js.native
  object AMSetClanRankResponse extends TopLevel[AMSetClanRankResponse with Double]
  
  @js.native
  sealed trait AMSetCommunityProfileSettings extends EMsg
  /* 4114 */ @js.native
  object AMSetCommunityProfileSettings extends TopLevel[AMSetCommunityProfileSettings with Double]
  
  @js.native
  sealed trait AMSetCommunityProfileSettingsResponse extends EMsg
  /* 4115 */ @js.native
  object AMSetCommunityProfileSettingsResponse extends TopLevel[AMSetCommunityProfileSettingsResponse with Double]
  
  @js.native
  sealed trait AMSetCommunityState extends EMsg
  /* 4063 */ @js.native
  object AMSetCommunityState extends TopLevel[AMSetCommunityState with Double]
  
  @js.native
  sealed trait AMSetDRMTestConfig extends EMsg
  /* 4268 */ @js.native
  object AMSetDRMTestConfig extends TopLevel[AMSetDRMTestConfig with Double]
  
  @js.native
  sealed trait AMSetFriendRelationshipNone extends EMsg
  /* 4123 */ @js.native
  object AMSetFriendRelationshipNone extends TopLevel[AMSetFriendRelationshipNone with Double]
  
  @js.native
  sealed trait AMSetIgnored extends EMsg
  /* 4096 */ @js.native
  object AMSetIgnored extends TopLevel[AMSetIgnored with Double]
  
  @js.native
  sealed trait AMSetIgnoredResponse extends EMsg
  /* 4122 */ @js.native
  object AMSetIgnoredResponse extends TopLevel[AMSetIgnoredResponse with Double]
  
  @js.native
  sealed trait AMSetLicenseFlags extends EMsg
  /* 4153 */ @js.native
  object AMSetLicenseFlags extends TopLevel[AMSetLicenseFlags with Double]
  
  @js.native
  sealed trait AMSetPersonaName extends EMsg
  /* 590 */ @js.native
  object AMSetPersonaName extends TopLevel[AMSetPersonaName with Double]
  
  @js.native
  sealed trait AMSetPreApproval extends EMsg
  /* 4255 */ @js.native
  object AMSetPreApproval extends TopLevel[AMSetPreApproval with Double]
  
  @js.native
  sealed trait AMSetPreApprovalResponse extends EMsg
  /* 4256 */ @js.native
  object AMSetPreApprovalResponse extends TopLevel[AMSetPreApprovalResponse with Double]
  
  @js.native
  sealed trait AMSetProfileURL extends EMsg
  /* 4005 */ @js.native
  object AMSetProfileURL extends TopLevel[AMSetProfileURL with Double]
  
  @js.native
  sealed trait AMSetUserGiftUnowned extends EMsg
  /* 4350 */ @js.native
  object AMSetUserGiftUnowned extends TopLevel[AMSetUserGiftUnowned with Double]
  
  @js.native
  sealed trait AMSetUserGiftUnownedResponse extends EMsg
  /* 4351 */ @js.native
  object AMSetUserGiftUnownedResponse extends TopLevel[AMSetUserGiftUnownedResponse with Double]
  
  @js.native
  sealed trait AMSetUserNewsSubscriptions extends EMsg
  /* 4149 */ @js.native
  object AMSetUserNewsSubscriptions extends TopLevel[AMSetUserNewsSubscriptions with Double]
  
  @js.native
  sealed trait AMSmart2PayPayment extends EMsg
  /* 4404 */ @js.native
  object AMSmart2PayPayment extends TopLevel[AMSmart2PayPayment with Double]
  
  @js.native
  sealed trait AMSmart2PayPaymentResponse extends EMsg
  /* 4405 */ @js.native
  object AMSmart2PayPaymentResponse extends TopLevel[AMSmart2PayPaymentResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMStoreCancelPurchase extends EMsg
  /* 4181 */ @js.native
  object AMStoreCancelPurchase extends TopLevel[AMStoreCancelPurchase with Double]
  
   // obsolete
  @js.native
  sealed trait AMStoreCompletePurchase extends EMsg
  /* 4180 */ @js.native
  object AMStoreCompletePurchase extends TopLevel[AMStoreCompletePurchase with Double]
  
   // obsolete
  @js.native
  sealed trait AMStoreGetFinalPrice extends EMsg
  /* 4178 */ @js.native
  object AMStoreGetFinalPrice extends TopLevel[AMStoreGetFinalPrice with Double]
  
   // obsolete
  @js.native
  sealed trait AMStoreGetFinalPriceResponse extends EMsg
  /* 4179 */ @js.native
  object AMStoreGetFinalPriceResponse extends TopLevel[AMStoreGetFinalPriceResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMStoreInitPurchase extends EMsg
  /* 4176 */ @js.native
  object AMStoreInitPurchase extends TopLevel[AMStoreInitPurchase with Double]
  
   // obsolete
  @js.native
  sealed trait AMStoreInitPurchaseResponse extends EMsg
  /* 4177 */ @js.native
  object AMStoreInitPurchaseResponse extends TopLevel[AMStoreInitPurchaseResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMStorePurchaseResponse extends EMsg
  /* 4182 */ @js.native
  object AMStorePurchaseResponse extends TopLevel[AMStorePurchaseResponse with Double]
  
  @js.native
  sealed trait AMStoreUserStats extends EMsg
  /* 4236 */ @js.native
  object AMStoreUserStats extends TopLevel[AMStoreUserStats with Double]
  
  @js.native
  sealed trait AMStoreUserStatsResponse extends EMsg
  /* 4312 */ @js.native
  object AMStoreUserStatsResponse extends TopLevel[AMStoreUserStatsResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMSubscribeToPersonaFeed extends EMsg
  /* 4291 */ @js.native
  object AMSubscribeToPersonaFeed extends TopLevel[AMSubscribeToPersonaFeed with Double]
  
  @js.native
  sealed trait AMSupportChangeEmail extends EMsg
  /* 4195 */ @js.native
  object AMSupportChangeEmail extends TopLevel[AMSupportChangeEmail with Double]
  
  @js.native
  sealed trait AMSupportChangePassword extends EMsg
  /* 4194 */ @js.native
  object AMSupportChangePassword extends TopLevel[AMSupportChangePassword with Double]
  
   // obsolete
  @js.native
  sealed trait AMSupportChangeSecretQA extends EMsg
  /* 4196 */ @js.native
  object AMSupportChangeSecretQA extends TopLevel[AMSupportChangeSecretQA with Double]
  
  @js.native
  sealed trait AMSupportEnableOrDisable extends EMsg
  /* 4199 */ @js.native
  object AMSupportEnableOrDisable extends TopLevel[AMSupportEnableOrDisable with Double]
  
  @js.native
  sealed trait AMSupportIsAccountEnabled extends EMsg
  /* 4209 */ @js.native
  object AMSupportIsAccountEnabled extends TopLevel[AMSupportIsAccountEnabled with Double]
  
  @js.native
  sealed trait AMSupportIsAccountEnabledResponse extends EMsg
  /* 4210 */ @js.native
  object AMSupportIsAccountEnabledResponse extends TopLevel[AMSupportIsAccountEnabledResponse with Double]
  
  @js.native
  sealed trait AMSupportKickSession extends EMsg
  /* 4212 */ @js.native
  object AMSupportKickSession extends TopLevel[AMSupportKickSession with Double]
  
  @js.native
  sealed trait AMSupportRemoveAccountSecurity extends EMsg
  /* 4307 */ @js.native
  object AMSupportRemoveAccountSecurity extends TopLevel[AMSupportRemoveAccountSecurity with Double]
  
  @js.native
  sealed trait AMSwapKioskDeposit extends EMsg
  /* 4348 */ @js.native
  object AMSwapKioskDeposit extends TopLevel[AMSwapKioskDeposit with Double]
  
  @js.native
  sealed trait AMSwapKioskDepositResponse extends EMsg
  /* 4349 */ @js.native
  object AMSwapKioskDepositResponse extends TopLevel[AMSwapKioskDepositResponse with Double]
  
  @js.native
  sealed trait AMTicketAuthRequestOrResponse extends EMsg
  /* 4220 */ @js.native
  object AMTicketAuthRequestOrResponse extends TopLevel[AMTicketAuthRequestOrResponse with Double]
  
  @js.native
  sealed trait AMToMDSGetDepotDecryptionKey extends EMsg
  /* 5812 */ @js.native
  object AMToMDSGetDepotDecryptionKey extends TopLevel[AMToMDSGetDepotDecryptionKey with Double]
  
  @js.native
  sealed trait AMTrackFailedAuthByIP extends EMsg
  /* 4133 */ @js.native
  object AMTrackFailedAuthByIP extends TopLevel[AMTrackFailedAuthByIP with Double]
  
  @js.native
  sealed trait AMTransferLockedGifts extends EMsg
  /* 4320 */ @js.native
  object AMTransferLockedGifts extends TopLevel[AMTransferLockedGifts with Double]
  
  @js.native
  sealed trait AMTransferLockedGiftsResponse extends EMsg
  /* 4321 */ @js.native
  object AMTransferLockedGiftsResponse extends TopLevel[AMTransferLockedGiftsResponse with Double]
  
  @js.native
  sealed trait AMTwoFactorRecoverAuthenticatorRequest extends EMsg
  /* 4402 */ @js.native
  object AMTwoFactorRecoverAuthenticatorRequest extends TopLevel[AMTwoFactorRecoverAuthenticatorRequest with Double]
  
  @js.native
  sealed trait AMTwoFactorRecoverAuthenticatorResponse extends EMsg
  /* 4403 */ @js.native
  object AMTwoFactorRecoverAuthenticatorResponse extends TopLevel[AMTwoFactorRecoverAuthenticatorResponse with Double]
  
  @js.native
  sealed trait AMUnBanFromChat extends EMsg
  /* 4067 */ @js.native
  object AMUnBanFromChat extends TopLevel[AMUnBanFromChat with Double]
  
   // obsolete
  @js.native
  sealed trait AMUpdateBillingAddress extends EMsg
  /* 4186 */ @js.native
  object AMUpdateBillingAddress extends TopLevel[AMUpdateBillingAddress with Double]
  
   // obsolete
  @js.native
  sealed trait AMUpdateBillingAddressResponse extends EMsg
  /* 4187 */ @js.native
  object AMUpdateBillingAddressResponse extends TopLevel[AMUpdateBillingAddressResponse with Double]
  
   // obsolete
  @js.native
  sealed trait AMUpdateChatMetadata extends EMsg
  /* 4003 */ @js.native
  object AMUpdateChatMetadata extends TopLevel[AMUpdateChatMetadata with Double]
  
   // obsolete
  @js.native
  sealed trait AMUpdateClanAnnouncement extends EMsg
  /* 4029 */ @js.native
  object AMUpdateClanAnnouncement extends TopLevel[AMUpdateClanAnnouncement with Double]
  
   // obsolete
  @js.native
  sealed trait AMUpdateClanAnnouncementResponse extends EMsg
  /* 4030 */ @js.native
  object AMUpdateClanAnnouncementResponse extends TopLevel[AMUpdateClanAnnouncementResponse with Double]
  
  @js.native
  sealed trait AMUpdateClanEvent extends EMsg
  /* 4015 */ @js.native
  object AMUpdateClanEvent extends TopLevel[AMUpdateClanEvent with Double]
  
  @js.native
  sealed trait AMUpdateClanEventResponse extends EMsg
  /* 4016 */ @js.native
  object AMUpdateClanEventResponse extends TopLevel[AMUpdateClanEventResponse with Double]
  
  @js.native
  sealed trait AMUpdateGSPlayStats extends EMsg
  /* 4198 */ @js.native
  object AMUpdateGSPlayStats extends TopLevel[AMUpdateGSPlayStats with Double]
  
   // obsolete
  @js.native
  sealed trait AMUpdatePersonaStateCache extends EMsg
  /* 4275 */ @js.native
  object AMUpdatePersonaStateCache extends TopLevel[AMUpdatePersonaStateCache with Double]
  
  @js.native
  sealed trait AMUpdateProviderStatus extends EMsg
  /* 4305 */ @js.native
  object AMUpdateProviderStatus extends TopLevel[AMUpdateProviderStatus with Double]
  
  @js.native
  sealed trait AMUpdateUserBanRequest extends EMsg
  /* 504 */ @js.native
  object AMUpdateUserBanRequest extends TopLevel[AMUpdateUserBanRequest with Double]
  
  @js.native
  sealed trait AMUserClanList extends EMsg
  /* 4110 */ @js.native
  object AMUserClanList extends TopLevel[AMUserClanList with Double]
  
  @js.native
  sealed trait AMUserClanListResponse extends EMsg
  /* 4111 */ @js.native
  object AMUserClanListResponse extends TopLevel[AMUserClanListResponse with Double]
  
  @js.native
  sealed trait AMVACStatusUpdate extends EMsg
  /* 4286 */ @js.native
  object AMVACStatusUpdate extends TopLevel[AMVACStatusUpdate with Double]
  
  @js.native
  sealed trait AMValidateCaptchaDataForIP extends EMsg
  /* 4131 */ @js.native
  object AMValidateCaptchaDataForIP extends TopLevel[AMValidateCaptchaDataForIP with Double]
  
  @js.native
  sealed trait AMValidateCaptchaDataForIPResponse extends EMsg
  /* 4132 */ @js.native
  object AMValidateCaptchaDataForIPResponse extends TopLevel[AMValidateCaptchaDataForIPResponse with Double]
  
  @js.native
  sealed trait AMValidateEmailLink extends EMsg
  /* 4231 */ @js.native
  object AMValidateEmailLink extends TopLevel[AMValidateEmailLink with Double]
  
  @js.native
  sealed trait AMValidateEmailLinkResponse extends EMsg
  /* 4232 */ @js.native
  object AMValidateEmailLinkResponse extends TopLevel[AMValidateEmailLinkResponse with Double]
  
  @js.native
  sealed trait AMValidatePasswordResetCodeAndSendSmsRequest extends EMsg
  /* 4406 */ @js.native
  object AMValidatePasswordResetCodeAndSendSmsRequest extends TopLevel[AMValidatePasswordResetCodeAndSendSmsRequest with Double]
  
  @js.native
  sealed trait AMValidatePasswordResetCodeAndSendSmsResponse extends EMsg
  /* 4407 */ @js.native
  object AMValidatePasswordResetCodeAndSendSmsResponse extends TopLevel[AMValidatePasswordResetCodeAndSendSmsResponse with Double]
  
  @js.native
  sealed trait AMValidateWGToken extends EMsg
  /* 4047 */ @js.native
  object AMValidateWGToken extends TopLevel[AMValidateWGToken with Double]
  
  @js.native
  sealed trait AMValidateWGTokenResponse extends EMsg
  /* 4062 */ @js.native
  object AMValidateWGTokenResponse extends TopLevel[AMValidateWGTokenResponse with Double]
  
  @js.native
  sealed trait AMVerfiyUser extends EMsg
  /* 552 */ @js.native
  object AMVerfiyUser extends TopLevel[AMVerfiyUser with Double]
  
  @js.native
  sealed trait AMVerifyDepotManagementRights extends EMsg
  /* 4222 */ @js.native
  object AMVerifyDepotManagementRights extends TopLevel[AMVerifyDepotManagementRights with Double]
  
  @js.native
  sealed trait AMVerifyDepotManagementRightsResponse extends EMsg
  /* 4223 */ @js.native
  object AMVerifyDepotManagementRightsResponse extends TopLevel[AMVerifyDepotManagementRightsResponse with Double]
  
  @js.native
  sealed trait AMWipeFriendsList extends EMsg
  /* 4095 */ @js.native
  object AMWipeFriendsList extends TopLevel[AMWipeFriendsList with Double]
  
   // obsolete
  @js.native
  sealed trait AMWriteNews extends EMsg
  /* 4142 */ @js.native
  object AMWriteNews extends TopLevel[AMWriteNews with Double]
  
  @js.native
  sealed trait AMXsollaPayment extends EMsg
  /* 4344 */ @js.native
  object AMXsollaPayment extends TopLevel[AMXsollaPayment with Double]
  
  @js.native
  sealed trait AMXsollaPaymentResponse extends EMsg
  /* 4345 */ @js.native
  object AMXsollaPaymentResponse extends TopLevel[AMXsollaPaymentResponse with Double]
  
  @js.native
  sealed trait ATSCSPerfTestResponse extends EMsg
  /* 1519 */ @js.native
  object ATSCSPerfTestResponse extends TopLevel[ATSCSPerfTestResponse with Double]
  
  @js.native
  sealed trait ATSCSPerfTestTask extends EMsg
  /* 1518 */ @js.native
  object ATSCSPerfTestTask extends TopLevel[ATSCSPerfTestTask with Double]
  
  @js.native
  sealed trait ATSCallTest extends EMsg
  /* 1508 */ @js.native
  object ATSCallTest extends TopLevel[ATSCallTest with Double]
  
  @js.native
  sealed trait ATSCallTestReply extends EMsg
  /* 1509 */ @js.native
  object ATSCallTestReply extends TopLevel[ATSCallTestReply with Double]
  
  @js.native
  sealed trait ATSCycleTCM extends EMsg
  /* 1506 */ @js.native
  object ATSCycleTCM extends TopLevel[ATSCycleTCM with Double]
  
  @js.native
  sealed trait ATSExternalStressActionResult extends EMsg
  /* 1516 */ @js.native
  object ATSExternalStressActionResult extends TopLevel[ATSExternalStressActionResult with Double]
  
  @js.native
  sealed trait ATSExternalStressJobQueued extends EMsg
  /* 1512 */ @js.native
  object ATSExternalStressJobQueued extends TopLevel[ATSExternalStressJobQueued with Double]
  
  @js.native
  sealed trait ATSExternalStressJobRunning extends EMsg
  /* 1513 */ @js.native
  object ATSExternalStressJobRunning extends TopLevel[ATSExternalStressJobRunning with Double]
  
  @js.native
  sealed trait ATSExternalStressJobStart extends EMsg
  /* 1511 */ @js.native
  object ATSExternalStressJobStart extends TopLevel[ATSExternalStressJobStart with Double]
  
  @js.native
  sealed trait ATSExternalStressJobStopAll extends EMsg
  /* 1515 */ @js.native
  object ATSExternalStressJobStopAll extends TopLevel[ATSExternalStressJobStopAll with Double]
  
  @js.native
  sealed trait ATSExternalStressJobStopped extends EMsg
  /* 1514 */ @js.native
  object ATSExternalStressJobStopped extends TopLevel[ATSExternalStressJobStopped with Double]
  
  @js.native
  sealed trait ATSInitDRMSStressTest extends EMsg
  /* 1507 */ @js.native
  object ATSInitDRMSStressTest extends TopLevel[ATSInitDRMSStressTest with Double]
  
  @js.native
  sealed trait ATSRunFailServerTest extends EMsg
  /* 1503 */ @js.native
  object ATSRunFailServerTest extends TopLevel[ATSRunFailServerTest with Double]
  
  @js.native
  sealed trait ATSStartExternalStress extends EMsg
  /* 1510 */ @js.native
  object ATSStartExternalStress extends TopLevel[ATSStartExternalStress with Double]
  
  @js.native
  sealed trait ATSStartStressTest extends EMsg
  /* 1501 */ @js.native
  object ATSStartStressTest extends TopLevel[ATSStartStressTest with Double]
  
  @js.native
  sealed trait ATSStarted extends EMsg
  /* 1517 */ @js.native
  object ATSStarted extends TopLevel[ATSStarted with Double]
  
  @js.native
  sealed trait ATSStopStressTest extends EMsg
  /* 1502 */ @js.native
  object ATSStopStressTest extends TopLevel[ATSStopStressTest with Double]
  
  @js.native
  sealed trait ATSUFSPerfTestResponse extends EMsg
  /* 1505 */ @js.native
  object ATSUFSPerfTestResponse extends TopLevel[ATSUFSPerfTestResponse with Double]
  
  @js.native
  sealed trait ATSUFSPerfTestTask extends EMsg
  /* 1504 */ @js.native
  object ATSUFSPerfTestTask extends TopLevel[ATSUFSPerfTestTask with Double]
  
  @js.native
  sealed trait AdminCmd extends EMsg
  /* 1000 */ @js.native
  object AdminCmd extends TopLevel[AdminCmd with Double]
  
  @js.native
  sealed trait AdminCmdResponse extends EMsg
  /* 1004 */ @js.native
  object AdminCmdResponse extends TopLevel[AdminCmdResponse with Double]
  
  @js.native
  sealed trait AdminConsoleTitle extends EMsg
  /* 1020 */ @js.native
  object AdminConsoleTitle extends TopLevel[AdminConsoleTitle with Double]
  
  @js.native
  sealed trait AdminGCCommand extends EMsg
  /* 1024 */ @js.native
  object AdminGCCommand extends TopLevel[AdminGCCommand with Double]
  
  @js.native
  sealed trait AdminGCGetCommandList extends EMsg
  /* 1025 */ @js.native
  object AdminGCGetCommandList extends TopLevel[AdminGCGetCommandList with Double]
  
  @js.native
  sealed trait AdminGCGetCommandListResponse extends EMsg
  /* 1026 */ @js.native
  object AdminGCGetCommandListResponse extends TopLevel[AdminGCGetCommandListResponse with Double]
  
  @js.native
  sealed trait AdminGCSpew extends EMsg
  /* 1023 */ @js.native
  object AdminGCSpew extends TopLevel[AdminGCSpew with Double]
  
  @js.native
  sealed trait AdminLogEvent extends EMsg
  /* 1006 */ @js.native
  object AdminLogEvent extends TopLevel[AdminLogEvent with Double]
  
  @js.native
  sealed trait AdminLogListenRequest extends EMsg
  /* 1005 */ @js.native
  object AdminLogListenRequest extends TopLevel[AdminLogListenRequest with Double]
  
  @js.native
  sealed trait AdminMsgSpew extends EMsg
  /* 1028 */ @js.native
  object AdminMsgSpew extends TopLevel[AdminMsgSpew with Double]
  
   // obsolete
  @js.native
  sealed trait AdminPwLogon extends EMsg
  /* 1017 */ @js.native
  object AdminPwLogon extends TopLevel[AdminPwLogon with Double]
  
   // obsolete
  @js.native
  sealed trait AdminPwLogonResponse extends EMsg
  /* 1018 */ @js.native
  object AdminPwLogonResponse extends TopLevel[AdminPwLogonResponse with Double]
  
  @js.native
  sealed trait AdminSpew extends EMsg
  /* 1019 */ @js.native
  object AdminSpew extends TopLevel[AdminSpew with Double]
  
  @js.native
  sealed trait Alert extends EMsg
  /* 115 */ @js.native
  object Alert extends TopLevel[Alert with Double]
  
  @js.native
  sealed trait AllowUserToPlayQuery extends EMsg
  /* 550 */ @js.native
  object AllowUserToPlayQuery extends TopLevel[AllowUserToPlayQuery with Double]
  
  @js.native
  sealed trait AllowUserToPlayResponse extends EMsg
  /* 551 */ @js.native
  object AllowUserToPlayResponse extends TopLevel[AllowUserToPlayResponse with Double]
  
  @js.native
  sealed trait AssignSysID extends EMsg
  /* 200 */ @js.native
  object AssignSysID extends TopLevel[AssignSysID with Double]
  
  @js.native
  sealed trait BRPCheckActivationCodes extends EMsg
  /* 3619 */ @js.native
  object BRPCheckActivationCodes extends TopLevel[BRPCheckActivationCodes with Double]
  
  @js.native
  sealed trait BRPCheckActivationCodesResponse extends EMsg
  /* 3620 */ @js.native
  object BRPCheckActivationCodesResponse extends TopLevel[BRPCheckActivationCodesResponse with Double]
  
  @js.native
  sealed trait BRPCheckFinanceCloseOutDate extends EMsg
  /* 3610 */ @js.native
  object BRPCheckFinanceCloseOutDate extends TopLevel[BRPCheckFinanceCloseOutDate with Double]
  
  @js.native
  sealed trait BRPCheckSettlementReports extends EMsg
  /* 3626 */ @js.native
  object BRPCheckSettlementReports extends TopLevel[BRPCheckSettlementReports with Double]
  
  @js.native
  sealed trait BRPCommitGC extends EMsg
  /* 3607 */ @js.native
  object BRPCommitGC extends TopLevel[BRPCommitGC with Double]
  
  @js.native
  sealed trait BRPCommitGCResponse extends EMsg
  /* 3608 */ @js.native
  object BRPCommitGCResponse extends TopLevel[BRPCommitGCResponse with Double]
  
  @js.native
  sealed trait BRPCommitWP extends EMsg
  /* 3621 */ @js.native
  object BRPCommitWP extends TopLevel[BRPCommitWP with Double]
  
  @js.native
  sealed trait BRPCommitWPResponse extends EMsg
  /* 3622 */ @js.native
  object BRPCommitWPResponse extends TopLevel[BRPCommitWPResponse with Double]
  
  @js.native
  sealed trait BRPConvertToCurrentKeys extends EMsg
  /* 3615 */ @js.native
  object BRPConvertToCurrentKeys extends TopLevel[BRPConvertToCurrentKeys with Double]
  
  @js.native
  sealed trait BRPConvertToCurrentKeysResponse extends EMsg
  /* 3616 */ @js.native
  object BRPConvertToCurrentKeysResponse extends TopLevel[BRPConvertToCurrentKeysResponse with Double]
  
  @js.native
  sealed trait BRPFindHungTransactions extends EMsg
  /* 3609 */ @js.native
  object BRPFindHungTransactions extends TopLevel[BRPFindHungTransactions with Double]
  
  @js.native
  sealed trait BRPPostTaxToAvalara extends EMsg
  /* 3628 */ @js.native
  object BRPPostTaxToAvalara extends TopLevel[BRPPostTaxToAvalara with Double]
  
  @js.native
  sealed trait BRPPostTransactionTax extends EMsg
  /* 3629 */ @js.native
  object BRPPostTransactionTax extends TopLevel[BRPPostTransactionTax with Double]
  
  @js.native
  sealed trait BRPPostTransactionTaxResponse extends EMsg
  /* 3630 */ @js.native
  object BRPPostTransactionTaxResponse extends TopLevel[BRPPostTransactionTaxResponse with Double]
  
  @js.native
  sealed trait BRPProcessGCReports extends EMsg
  /* 3603 */ @js.native
  object BRPProcessGCReports extends TopLevel[BRPProcessGCReports with Double]
  
  @js.native
  sealed trait BRPProcessIMReports extends EMsg
  /* 3631 */ @js.native
  object BRPProcessIMReports extends TopLevel[BRPProcessIMReports with Double]
  
  @js.native
  sealed trait BRPProcessLicenses extends EMsg
  /* 3611 */ @js.native
  object BRPProcessLicenses extends TopLevel[BRPProcessLicenses with Double]
  
  @js.native
  sealed trait BRPProcessLicensesResponse extends EMsg
  /* 3612 */ @js.native
  object BRPProcessLicensesResponse extends TopLevel[BRPProcessLicensesResponse with Double]
  
  @js.native
  sealed trait BRPProcessPPReports extends EMsg
  /* 3604 */ @js.native
  object BRPProcessPPReports extends TopLevel[BRPProcessPPReports with Double]
  
  @js.native
  sealed trait BRPProcessPartnerPayments extends EMsg
  /* 3625 */ @js.native
  object BRPProcessPartnerPayments extends TopLevel[BRPProcessPartnerPayments with Double]
  
  @js.native
  sealed trait BRPProcessPaymentRules extends EMsg
  /* 3624 */ @js.native
  object BRPProcessPaymentRules extends TopLevel[BRPProcessPaymentRules with Double]
  
  @js.native
  sealed trait BRPProcessUSBankReports extends EMsg
  /* 3602 */ @js.native
  object BRPProcessUSBankReports extends TopLevel[BRPProcessUSBankReports with Double]
  
  @js.native
  sealed trait BRPProcessWPReports extends EMsg
  /* 3623 */ @js.native
  object BRPProcessWPReports extends TopLevel[BRPProcessWPReports with Double]
  
  @js.native
  sealed trait BRPPruneCardUsageStats extends EMsg
  /* 3617 */ @js.native
  object BRPPruneCardUsageStats extends TopLevel[BRPPruneCardUsageStats with Double]
  
  @js.native
  sealed trait BRPPruneCardUsageStatsResponse extends EMsg
  /* 3618 */ @js.native
  object BRPPruneCardUsageStatsResponse extends TopLevel[BRPPruneCardUsageStatsResponse with Double]
  
  @js.native
  sealed trait BRPRemoveExpiredPaymentData extends EMsg
  /* 3613 */ @js.native
  object BRPRemoveExpiredPaymentData extends TopLevel[BRPRemoveExpiredPaymentData with Double]
  
  @js.native
  sealed trait BRPRemoveExpiredPaymentDataResponse extends EMsg
  /* 3614 */ @js.native
  object BRPRemoveExpiredPaymentDataResponse extends TopLevel[BRPRemoveExpiredPaymentDataResponse with Double]
  
   // obsolete
  @js.native
  sealed trait BRPSettleCB extends EMsg
  /* 3606 */ @js.native
  object BRPSettleCB extends TopLevel[BRPSettleCB with Double]
  
   // obsolete
  @js.native
  sealed trait BRPSettleNOVA extends EMsg
  /* 3605 */ @js.native
  object BRPSettleNOVA extends TopLevel[BRPSettleNOVA with Double]
  
  @js.native
  sealed trait BRPStartShippingJobs extends EMsg
  /* 3601 */ @js.native
  object BRPStartShippingJobs extends TopLevel[BRPStartShippingJobs with Double]
  
   // obsolete
  @js.native
  sealed trait BSBannedRequest extends EMsg
  /* 1407 */ @js.native
  object BSBannedRequest extends TopLevel[BSBannedRequest with Double]
  
  @js.native
  sealed trait BSBoaCompraConfirmProductDelivery extends EMsg
  /* 1494 */ @js.native
  object BSBoaCompraConfirmProductDelivery extends TopLevel[BSBoaCompraConfirmProductDelivery with Double]
  
  @js.native
  sealed trait BSBoaCompraConfirmProductDeliveryResponse extends EMsg
  /* 1495 */ @js.native
  object BSBoaCompraConfirmProductDeliveryResponse extends TopLevel[BSBoaCompraConfirmProductDeliveryResponse with Double]
  
   // obsolete
  @js.native
  sealed trait BSChaseRFRRequest extends EMsg
  /* 1416 */ @js.native
  object BSChaseRFRRequest extends TopLevel[BSChaseRFRRequest with Double]
  
  @js.native
  sealed trait BSCheckJobRunning extends EMsg
  /* 1456 */ @js.native
  object BSCheckJobRunning extends TopLevel[BSCheckJobRunning with Double]
  
  @js.native
  sealed trait BSCheckJobRunningResponse extends EMsg
  /* 1457 */ @js.native
  object BSCheckJobRunningResponse extends TopLevel[BSCheckJobRunningResponse with Double]
  
  @js.native
  sealed trait BSCommitGCTxn extends EMsg
  /* 1425 */ @js.native
  object BSCommitGCTxn extends TopLevel[BSCommitGCTxn with Double]
  
  @js.native
  sealed trait BSCommitWPTxn extends EMsg
  /* 1498 */ @js.native
  object BSCommitWPTxn extends TopLevel[BSCommitWPTxn with Double]
  
  @js.native
  sealed trait BSCompletePurchase extends EMsg
  /* 1474 */ @js.native
  object BSCompletePurchase extends TopLevel[BSCompletePurchase with Double]
  
  @js.native
  sealed trait BSCompletePurchaseResponse extends EMsg
  /* 1475 */ @js.native
  object BSCompletePurchaseResponse extends TopLevel[BSCompletePurchaseResponse with Double]
  
  @js.native
  sealed trait BSConvertToCurrentKeys extends EMsg
  /* 1470 */ @js.native
  object BSConvertToCurrentKeys extends TopLevel[BSConvertToCurrentKeys with Double]
  
  @js.native
  sealed trait BSConvertToCurrentKeysResponse extends EMsg
  /* 1471 */ @js.native
  object BSConvertToCurrentKeysResponse extends TopLevel[BSConvertToCurrentKeysResponse with Double]
  
  @js.native
  sealed trait BSGenerateBoaCompraMD5 extends EMsg
  /* 1496 */ @js.native
  object BSGenerateBoaCompraMD5 extends TopLevel[BSGenerateBoaCompraMD5 with Double]
  
  @js.native
  sealed trait BSGenerateBoaCompraMD5Response extends EMsg
  /* 1497 */ @js.native
  object BSGenerateBoaCompraMD5Response extends TopLevel[BSGenerateBoaCompraMD5Response with Double]
  
  @js.native
  sealed trait BSGenerateMoPayMD5 extends EMsg
  /* 1492 */ @js.native
  object BSGenerateMoPayMD5 extends TopLevel[BSGenerateMoPayMD5 with Double]
  
  @js.native
  sealed trait BSGenerateMoPayMD5Response extends EMsg
  /* 1493 */ @js.native
  object BSGenerateMoPayMD5Response extends TopLevel[BSGenerateMoPayMD5Response with Double]
  
  @js.native
  sealed trait BSGetBillingAddress extends EMsg
  /* 1462 */ @js.native
  object BSGetBillingAddress extends TopLevel[BSGetBillingAddress with Double]
  
  @js.native
  sealed trait BSGetBillingAddressResponse extends EMsg
  /* 1463 */ @js.native
  object BSGetBillingAddressResponse extends TopLevel[BSGetBillingAddressResponse with Double]
  
  @js.native
  sealed trait BSGetCreditCardInfo extends EMsg
  /* 1464 */ @js.native
  object BSGetCreditCardInfo extends TopLevel[BSGetCreditCardInfo with Double]
  
  @js.native
  sealed trait BSGetCreditCardInfoResponse extends EMsg
  /* 1465 */ @js.native
  object BSGetCreditCardInfoResponse extends TopLevel[BSGetCreditCardInfoResponse with Double]
  
   // obsolete
  @js.native
  sealed trait BSGetEvents extends EMsg
  /* 1415 */ @js.native
  object BSGetEvents extends TopLevel[BSGetEvents with Double]
  
  @js.native
  sealed trait BSGetPayPalUserInfo extends EMsg
  /* 1410 */ @js.native
  object BSGetPayPalUserInfo extends TopLevel[BSGetPayPalUserInfo with Double]
  
  @js.native
  sealed trait BSGetPayPalUserInfoResponse extends EMsg
  /* 1411 */ @js.native
  object BSGetPayPalUserInfoResponse extends TopLevel[BSGetPayPalUserInfoResponse with Double]
  
  @js.native
  sealed trait BSGetProPackOrderStatus extends EMsg
  /* 1454 */ @js.native
  object BSGetProPackOrderStatus extends TopLevel[BSGetProPackOrderStatus with Double]
  
  @js.native
  sealed trait BSGetProPackOrderStatusResponse extends EMsg
  /* 1455 */ @js.native
  object BSGetProPackOrderStatusResponse extends TopLevel[BSGetProPackOrderStatusResponse with Double]
  
  @js.native
  sealed trait BSInitGCBankXferTxn extends EMsg
  /* 1421 */ @js.native
  object BSInitGCBankXferTxn extends TopLevel[BSInitGCBankXferTxn with Double]
  
  @js.native
  sealed trait BSInitGCBankXferTxnResponse extends EMsg
  /* 1422 */ @js.native
  object BSInitGCBankXferTxnResponse extends TopLevel[BSInitGCBankXferTxnResponse with Double]
  
  @js.native
  sealed trait BSInitPayPalTxn extends EMsg
  /* 1408 */ @js.native
  object BSInitPayPalTxn extends TopLevel[BSInitPayPalTxn with Double]
  
  @js.native
  sealed trait BSInitPayPalTxnResponse extends EMsg
  /* 1409 */ @js.native
  object BSInitPayPalTxnResponse extends TopLevel[BSInitPayPalTxnResponse with Double]
  
  @js.native
  sealed trait BSInitPurchase extends EMsg
  /* 1472 */ @js.native
  object BSInitPurchase extends TopLevel[BSInitPurchase with Double]
  
  @js.native
  sealed trait BSInitPurchaseResponse extends EMsg
  /* 1473 */ @js.native
  object BSInitPurchaseResponse extends TopLevel[BSInitPurchaseResponse with Double]
  
  @js.native
  sealed trait BSMoPayConfirmProductDelivery extends EMsg
  /* 1490 */ @js.native
  object BSMoPayConfirmProductDelivery extends TopLevel[BSMoPayConfirmProductDelivery with Double]
  
  @js.native
  sealed trait BSMoPayConfirmProductDeliveryResponse extends EMsg
  /* 1491 */ @js.native
  object BSMoPayConfirmProductDeliveryResponse extends TopLevel[BSMoPayConfirmProductDeliveryResponse with Double]
  
  @js.native
  sealed trait BSPaymentInstrBan extends EMsg
  /* 1417 */ @js.native
  object BSPaymentInstrBan extends TopLevel[BSPaymentInstrBan with Double]
  
  @js.native
  sealed trait BSPaymentInstrBanResponse extends EMsg
  /* 1418 */ @js.native
  object BSPaymentInstrBanResponse extends TopLevel[BSPaymentInstrBanResponse with Double]
  
   // obsolete
  @js.native
  sealed trait BSProcessGCReports extends EMsg
  /* 1419 */ @js.native
  object BSProcessGCReports extends TopLevel[BSProcessGCReports with Double]
  
   // obsolete
  @js.native
  sealed trait BSProcessPPReports extends EMsg
  /* 1420 */ @js.native
  object BSProcessPPReports extends TopLevel[BSProcessPPReports with Double]
  
   // obsolete
  @js.native
  sealed trait BSProcessUSBankReports extends EMsg
  /* 1436 */ @js.native
  object BSProcessUSBankReports extends TopLevel[BSProcessUSBankReports with Double]
  
  @js.native
  sealed trait BSPruneCardUsageStats extends EMsg
  /* 1476 */ @js.native
  object BSPruneCardUsageStats extends TopLevel[BSPruneCardUsageStats with Double]
  
  @js.native
  sealed trait BSPruneCardUsageStatsResponse extends EMsg
  /* 1477 */ @js.native
  object BSPruneCardUsageStatsResponse extends TopLevel[BSPruneCardUsageStatsResponse with Double]
  
   // obsolete
  @js.native
  sealed trait BSPurchaseResponse extends EMsg
  /* 1402 */ @js.native
  object BSPurchaseResponse extends TopLevel[BSPurchaseResponse with Double]
  
  @js.native
  sealed trait BSPurchaseRunFraudChecks extends EMsg
  /* 1437 */ @js.native
  object BSPurchaseRunFraudChecks extends TopLevel[BSPurchaseRunFraudChecks with Double]
  
  @js.native
  sealed trait BSPurchaseRunFraudChecksResponse extends EMsg
  /* 1438 */ @js.native
  object BSPurchaseRunFraudChecksResponse extends TopLevel[BSPurchaseRunFraudChecksResponse with Double]
  
  @js.native
  sealed trait BSPurchaseStart extends EMsg
  /* 1401 */ @js.native
  object BSPurchaseStart extends TopLevel[BSPurchaseStart with Double]
  
  @js.native
  sealed trait BSQiwiWalletInvoice extends EMsg
  /* 1448 */ @js.native
  object BSQiwiWalletInvoice extends TopLevel[BSQiwiWalletInvoice with Double]
  
  @js.native
  sealed trait BSQiwiWalletInvoiceResponse extends EMsg
  /* 1449 */ @js.native
  object BSQiwiWalletInvoiceResponse extends TopLevel[BSQiwiWalletInvoiceResponse with Double]
  
  @js.native
  sealed trait BSQueryBankInformation extends EMsg
  /* 1440 */ @js.native
  object BSQueryBankInformation extends TopLevel[BSQueryBankInformation with Double]
  
  @js.native
  sealed trait BSQueryBankInformationResponse extends EMsg
  /* 1441 */ @js.native
  object BSQueryBankInformationResponse extends TopLevel[BSQueryBankInformationResponse with Double]
  
   // obsolete
  @js.native
  sealed trait BSQueryCBOrderStatus extends EMsg
  /* 1428 */ @js.native
  object BSQueryCBOrderStatus extends TopLevel[BSQueryCBOrderStatus with Double]
  
   // obsolete
  @js.native
  sealed trait BSQueryCBOrderStatusResponse extends EMsg
  /* 1429 */ @js.native
  object BSQueryCBOrderStatusResponse extends TopLevel[BSQueryCBOrderStatusResponse with Double]
  
  @js.native
  sealed trait BSQueryFindCreditCard extends EMsg
  /* 1484 */ @js.native
  object BSQueryFindCreditCard extends TopLevel[BSQueryFindCreditCard with Double]
  
  @js.native
  sealed trait BSQueryFindCreditCardResponse extends EMsg
  /* 1485 */ @js.native
  object BSQueryFindCreditCardResponse extends TopLevel[BSQueryFindCreditCardResponse with Double]
  
   // obsolete
  @js.native
  sealed trait BSQueryGCBankXferTxn extends EMsg
  /* 1423 */ @js.native
  object BSQueryGCBankXferTxn extends TopLevel[BSQueryGCBankXferTxn with Double]
  
   // obsolete
  @js.native
  sealed trait BSQueryGCBankXferTxnResponse extends EMsg
  /* 1424 */ @js.native
  object BSQueryGCBankXferTxnResponse extends TopLevel[BSQueryGCBankXferTxnResponse with Double]
  
  @js.native
  sealed trait BSQueryPaymentInstResponse extends EMsg
  /* 1432 */ @js.native
  object BSQueryPaymentInstResponse extends TopLevel[BSQueryPaymentInstResponse with Double]
  
  @js.native
  sealed trait BSQueryPaymentInstUsage extends EMsg
  /* 1431 */ @js.native
  object BSQueryPaymentInstUsage extends TopLevel[BSQueryPaymentInstUsage with Double]
  
  @js.native
  sealed trait BSQueryTransactionStatus extends EMsg
  /* 1426 */ @js.native
  object BSQueryTransactionStatus extends TopLevel[BSQueryTransactionStatus with Double]
  
  @js.native
  sealed trait BSQueryTransactionStatusResponse extends EMsg
  /* 1427 */ @js.native
  object BSQueryTransactionStatusResponse extends TopLevel[BSQueryTransactionStatusResponse with Double]
  
  @js.native
  sealed trait BSQueryTxnExtendedInfo extends EMsg
  /* 1433 */ @js.native
  object BSQueryTxnExtendedInfo extends TopLevel[BSQueryTxnExtendedInfo with Double]
  
  @js.native
  sealed trait BSQueryTxnExtendedInfoResponse extends EMsg
  /* 1434 */ @js.native
  object BSQueryTxnExtendedInfoResponse extends TopLevel[BSQueryTxnExtendedInfoResponse with Double]
  
   // obsolete
  @js.native
  sealed trait BSRefundTxn extends EMsg
  /* 1413 */ @js.native
  object BSRefundTxn extends TopLevel[BSRefundTxn with Double]
  
   // obsolete
  @js.native
  sealed trait BSRefundTxnResponse extends EMsg
  /* 1414 */ @js.native
  object BSRefundTxnResponse extends TopLevel[BSRefundTxnResponse with Double]
  
  @js.native
  sealed trait BSRemoveExpiredPaymentData extends EMsg
  /* 1468 */ @js.native
  object BSRemoveExpiredPaymentData extends TopLevel[BSRemoveExpiredPaymentData with Double]
  
  @js.native
  sealed trait BSRemoveExpiredPaymentDataResponse extends EMsg
  /* 1469 */ @js.native
  object BSRemoveExpiredPaymentDataResponse extends TopLevel[BSRemoveExpiredPaymentDataResponse with Double]
  
  @js.native
  sealed trait BSResetPackagePurchaseRateLimit extends EMsg
  /* 1458 */ @js.native
  object BSResetPackagePurchaseRateLimit extends TopLevel[BSResetPackagePurchaseRateLimit with Double]
  
  @js.native
  sealed trait BSResetPackagePurchaseRateLimitResponse extends EMsg
  /* 1459 */ @js.native
  object BSResetPackagePurchaseRateLimitResponse extends TopLevel[BSResetPackagePurchaseRateLimitResponse with Double]
  
  @js.native
  sealed trait BSReverseRedeemPOSAKey extends EMsg
  /* 1482 */ @js.native
  object BSReverseRedeemPOSAKey extends TopLevel[BSReverseRedeemPOSAKey with Double]
  
  @js.native
  sealed trait BSReverseRedeemPOSAKeyResponse extends EMsg
  /* 1483 */ @js.native
  object BSReverseRedeemPOSAKeyResponse extends TopLevel[BSReverseRedeemPOSAKeyResponse with Double]
  
   // obsolete
  @js.native
  sealed trait BSRunRedFlagReport extends EMsg
  /* 1430 */ @js.native
  object BSRunRedFlagReport extends TopLevel[BSRunRedFlagReport with Double]
  
  @js.native
  sealed trait BSSendShippingRequest extends EMsg
  /* 1452 */ @js.native
  object BSSendShippingRequest extends TopLevel[BSSendShippingRequest with Double]
  
  @js.native
  sealed trait BSSendShippingRequestResponse extends EMsg
  /* 1453 */ @js.native
  object BSSendShippingRequestResponse extends TopLevel[BSSendShippingRequestResponse with Double]
  
  @js.native
  sealed trait BSSettleComplete extends EMsg
  /* 1406 */ @js.native
  object BSSettleComplete extends TopLevel[BSSettleComplete with Double]
  
   // obsolete
  @js.native
  sealed trait BSSettleNOVA extends EMsg
  /* 1404 */ @js.native
  object BSSettleNOVA extends TopLevel[BSSettleNOVA with Double]
  
   // obsolete
  @js.native
  sealed trait BSStartShippingJobs extends EMsg
  /* 1439 */ @js.native
  object BSStartShippingJobs extends TopLevel[BSStartShippingJobs with Double]
  
  @js.native
  sealed trait BSStatusInquiryPOSAKey extends EMsg
  /* 1486 */ @js.native
  object BSStatusInquiryPOSAKey extends TopLevel[BSStatusInquiryPOSAKey with Double]
  
  @js.native
  sealed trait BSStatusInquiryPOSAKeyResponse extends EMsg
  /* 1487 */ @js.native
  object BSStatusInquiryPOSAKeyResponse extends TopLevel[BSStatusInquiryPOSAKeyResponse with Double]
  
  @js.native
  sealed trait BSStoreBankInformation extends EMsg
  /* 1478 */ @js.native
  object BSStoreBankInformation extends TopLevel[BSStoreBankInformation with Double]
  
  @js.native
  sealed trait BSStoreBankInformationResponse extends EMsg
  /* 1479 */ @js.native
  object BSStoreBankInformationResponse extends TopLevel[BSStoreBankInformationResponse with Double]
  
  @js.native
  sealed trait BSUpdateConversionRates extends EMsg
  /* 1435 */ @js.native
  object BSUpdateConversionRates extends TopLevel[BSUpdateConversionRates with Double]
  
  @js.native
  sealed trait BSUpdateInventoryFromProPack extends EMsg
  /* 1450 */ @js.native
  object BSUpdateInventoryFromProPack extends TopLevel[BSUpdateInventoryFromProPack with Double]
  
  @js.native
  sealed trait BSUpdateInventoryFromProPackResponse extends EMsg
  /* 1451 */ @js.native
  object BSUpdateInventoryFromProPackResponse extends TopLevel[BSUpdateInventoryFromProPackResponse with Double]
  
  @js.native
  sealed trait BSUpdatePaymentData extends EMsg
  /* 1460 */ @js.native
  object BSUpdatePaymentData extends TopLevel[BSUpdatePaymentData with Double]
  
  @js.native
  sealed trait BSUpdatePaymentDataResponse extends EMsg
  /* 1461 */ @js.native
  object BSUpdatePaymentDataResponse extends TopLevel[BSUpdatePaymentDataResponse with Double]
  
  @js.native
  sealed trait BSValidateMoPaySignature extends EMsg
  /* 1488 */ @js.native
  object BSValidateMoPaySignature extends TopLevel[BSValidateMoPaySignature with Double]
  
  @js.native
  sealed trait BSValidateMoPaySignatureResponse extends EMsg
  /* 1489 */ @js.native
  object BSValidateMoPaySignatureResponse extends TopLevel[BSValidateMoPaySignatureResponse with Double]
  
  @js.native
  sealed trait BSValidateXsollaSignature extends EMsg
  /* 1445 */ @js.native
  object BSValidateXsollaSignature extends TopLevel[BSValidateXsollaSignature with Double]
  
  @js.native
  sealed trait BSValidateXsollaSignatureResponse extends EMsg
  /* 1446 */ @js.native
  object BSValidateXsollaSignatureResponse extends TopLevel[BSValidateXsollaSignatureResponse with Double]
  
  @js.native
  sealed trait BSVerifyPOSAKey extends EMsg
  /* 1480 */ @js.native
  object BSVerifyPOSAKey extends TopLevel[BSVerifyPOSAKey with Double]
  
  @js.native
  sealed trait BSVerifyPOSAKeyResponse extends EMsg
  /* 1481 */ @js.native
  object BSVerifyPOSAKeyResponse extends TopLevel[BSVerifyPOSAKeyResponse with Double]
  
  @js.native
  sealed trait BackpackAddToCurrency extends EMsg
  /* 8401 */ @js.native
  object BackpackAddToCurrency extends TopLevel[BackpackAddToCurrency with Double]
  
  @js.native
  sealed trait BackpackAddToCurrencyResponse extends EMsg
  /* 8402 */ @js.native
  object BackpackAddToCurrencyResponse extends TopLevel[BackpackAddToCurrencyResponse with Double]
  
  @js.native
  sealed trait BackpackBase extends EMsg
  /* 8400 */ @js.native
  object BackpackBase extends TopLevel[BackpackBase with Double]
  
  @js.native
  sealed trait BadLoginIPList extends EMsg
  /* 7805 */ @js.native
  object BadLoginIPList extends TopLevel[BadLoginIPList with Double]
  
  @js.native
  sealed trait BaseAIS extends EMsg
  /* 400 */ @js.native
  object BaseAIS extends TopLevel[BaseAIS with Double]
  
  @js.native
  sealed trait BaseAM extends EMsg
  /* 500 */ @js.native
  object BaseAM extends TopLevel[BaseAM with Double]
  
  @js.native
  sealed trait BaseAMRange2 extends EMsg
  /* 4000 */ @js.native
  object BaseAMRange2 extends TopLevel[BaseAMRange2 with Double]
  
  @js.native
  sealed trait BaseATS extends EMsg
  /* 1500 */ @js.native
  object BaseATS extends TopLevel[BaseATS with Double]
  
  @js.native
  sealed trait BaseAdmin extends EMsg
  /* 1000 */ @js.native
  object BaseAdmin extends TopLevel[BaseAdmin with Double]
  
  @js.native
  sealed trait BaseBRP extends EMsg
  /* 3600 */ @js.native
  object BaseBRP extends TopLevel[BaseBRP with Double]
  
  @js.native
  sealed trait BaseBS extends EMsg
  /* 1400 */ @js.native
  object BaseBS extends TopLevel[BaseBS with Double]
  
  @js.native
  sealed trait BaseCCSRange extends EMsg
  /* 3150 */ @js.native
  object BaseCCSRange extends TopLevel[BaseCCSRange with Double]
  
  @js.native
  sealed trait BaseCM extends EMsg
  /* 1700 */ @js.native
  object BaseCM extends TopLevel[BaseCM with Double]
  
  @js.native
  sealed trait BaseCS extends EMsg
  /* 650 */ @js.native
  object BaseCS extends TopLevel[BaseCS with Double]
  
  @js.native
  sealed trait BaseChannelAuth extends EMsg
  /* 1300 */ @js.native
  object BaseChannelAuth extends TopLevel[BaseChannelAuth with Double]
  
  @js.native
  sealed trait BaseClient extends EMsg
  /* 700 */ @js.native
  object BaseClient extends TopLevel[BaseClient with Double]
  
  @js.native
  sealed trait BaseClient2 extends EMsg
  /* 5400 */ @js.native
  object BaseClient2 extends TopLevel[BaseClient2 with Double]
  
  @js.native
  sealed trait BaseClient3 extends EMsg
  /* 9800 */ @js.native
  object BaseClient3 extends TopLevel[BaseClient3 with Double]
  
  @js.native
  sealed trait BaseDFS extends EMsg
  /* 5600 */ @js.native
  object BaseDFS extends TopLevel[BaseDFS with Double]
  
  @js.native
  sealed trait BaseDP extends EMsg
  /* 1600 */ @js.native
  object BaseDP extends TopLevel[BaseDP with Double]
  
  @js.native
  sealed trait BaseDRMS extends EMsg
  /* 625 */ @js.native
  object BaseDRMS extends TopLevel[BaseDRMS with Double]
  
   // obsolete
  @js.native
  sealed trait BaseDSS extends EMsg
  /* 1800 */ @js.native
  object BaseDSS extends TopLevel[BaseDSS with Double]
  
   // obsolete
  @js.native
  sealed trait BaseEPM extends EMsg
  /* 1900 */ @js.native
  object BaseEPM extends TopLevel[BaseEPM with Double]
  
  @js.native
  sealed trait BaseFBS extends EMsg
  /* 1100 */ @js.native
  object BaseFBS extends TopLevel[BaseFBS with Double]
  
  @js.native
  sealed trait BaseFTSRange extends EMsg
  /* 3100 */ @js.native
  object BaseFTSRange extends TopLevel[BaseFTSRange with Double]
  
  @js.native
  sealed trait BaseFileXfer extends EMsg
  /* 1200 */ @js.native
  object BaseFileXfer extends TopLevel[BaseFileXfer with Double]
  
  @js.native
  sealed trait BaseGC extends EMsg
  /* 2200 */ @js.native
  object BaseGC extends TopLevel[BaseGC with Double]
  
  @js.native
  sealed trait BaseGM extends EMsg
  /* 300 */ @js.native
  object BaseGM extends TopLevel[BaseGM with Double]
  
  @js.native
  sealed trait BaseGameServer extends EMsg
  /* 900 */ @js.native
  object BaseGameServer extends TopLevel[BaseGameServer with Double]
  
  @js.native
  sealed trait BaseGeneral extends EMsg
  /* 100 */ @js.native
  object BaseGeneral extends TopLevel[BaseGeneral with Double]
  
  @js.native
  sealed trait BaseLBSRange extends EMsg
  /* 3200 */ @js.native
  object BaseLBSRange extends TopLevel[BaseLBSRange with Double]
  
  @js.native
  sealed trait BaseMDS extends EMsg
  /* 5800 */ @js.native
  object BaseMDS extends TopLevel[BaseMDS with Double]
  
  @js.native
  sealed trait BaseOGS extends EMsg
  /* 3400 */ @js.native
  object BaseOGS extends TopLevel[BaseOGS with Double]
  
  @js.native
  sealed trait BaseP2P extends EMsg
  /* 2500 */ @js.native
  object BaseP2P extends TopLevel[BaseP2P with Double]
  
  @js.native
  sealed trait BasePSRange extends EMsg
  /* 5000 */ @js.native
  object BasePSRange extends TopLevel[BasePSRange with Double]
  
  @js.native
  sealed trait BaseSM extends EMsg
  /* 2900 */ @js.native
  object BaseSM extends TopLevel[BaseSM with Double]
  
  @js.native
  sealed trait BaseShell extends EMsg
  /* 200 */ @js.native
  object BaseShell extends TopLevel[BaseShell with Double]
  
  @js.native
  sealed trait BaseTest extends EMsg
  /* 3000 */ @js.native
  object BaseTest extends TopLevel[BaseTest with Double]
  
  @js.native
  sealed trait BaseUFSRange extends EMsg
  /* 5200 */ @js.native
  object BaseUFSRange extends TopLevel[BaseUFSRange with Double]
  
  @js.native
  sealed trait BaseVS extends EMsg
  /* 600 */ @js.native
  object BaseVS extends TopLevel[BaseVS with Double]
  
  @js.native
  sealed trait BoxMonitorBase extends EMsg
  /* 8700 */ @js.native
  object BoxMonitorBase extends TopLevel[BoxMonitorBase with Double]
  
  @js.native
  sealed trait BoxMonitorReportRequest extends EMsg
  /* 8700 */ @js.native
  object BoxMonitorReportRequest extends TopLevel[BoxMonitorReportRequest with Double]
  
  @js.native
  sealed trait BoxMonitorReportResponse extends EMsg
  /* 8701 */ @js.native
  object BoxMonitorReportResponse extends TopLevel[BoxMonitorReportResponse with Double]
  
   // obsolete
  @js.native
  sealed trait CCSAddComment extends EMsg
  /* 3153 */ @js.native
  object CCSAddComment extends TopLevel[CCSAddComment with Double]
  
   // obsolete
  @js.native
  sealed trait CCSAddCommentResponse extends EMsg
  /* 3154 */ @js.native
  object CCSAddCommentResponse extends TopLevel[CCSAddCommentResponse with Double]
  
  @js.native
  sealed trait CCSDeleteAllCommentsByAuthor extends EMsg
  /* 3161 */ @js.native
  object CCSDeleteAllCommentsByAuthor extends TopLevel[CCSDeleteAllCommentsByAuthor with Double]
  
  @js.native
  sealed trait CCSDeleteAllCommentsByAuthorResponse extends EMsg
  /* 3162 */ @js.native
  object CCSDeleteAllCommentsByAuthorResponse extends TopLevel[CCSDeleteAllCommentsByAuthorResponse with Double]
  
   // obsolete
  @js.native
  sealed trait CCSDeleteComment extends EMsg
  /* 3155 */ @js.native
  object CCSDeleteComment extends TopLevel[CCSDeleteComment with Double]
  
   // obsolete
  @js.native
  sealed trait CCSDeleteCommentResponse extends EMsg
  /* 3156 */ @js.native
  object CCSDeleteCommentResponse extends TopLevel[CCSDeleteCommentResponse with Double]
  
   // obsolete
  @js.native
  sealed trait CCSGetComments extends EMsg
  /* 3151 */ @js.native
  object CCSGetComments extends TopLevel[CCSGetComments with Double]
  
   // obsolete
  @js.native
  sealed trait CCSGetCommentsForNews extends EMsg
  /* 3159 */ @js.native
  object CCSGetCommentsForNews extends TopLevel[CCSGetCommentsForNews with Double]
  
   // obsolete
  @js.native
  sealed trait CCSGetCommentsForNewsResponse extends EMsg
  /* 3160 */ @js.native
  object CCSGetCommentsForNewsResponse extends TopLevel[CCSGetCommentsForNewsResponse with Double]
  
   // obsolete
  @js.native
  sealed trait CCSGetCommentsResponse extends EMsg
  /* 3152 */ @js.native
  object CCSGetCommentsResponse extends TopLevel[CCSGetCommentsResponse with Double]
  
   // obsolete
  @js.native
  sealed trait CCSNotifyCommentCount extends EMsg
  /* 3158 */ @js.native
  object CCSNotifyCommentCount extends TopLevel[CCSNotifyCommentCount with Double]
  
   // obsolete
  @js.native
  sealed trait CCSPreloadComments extends EMsg
  /* 3157 */ @js.native
  object CCSPreloadComments extends TopLevel[CCSPreloadComments with Double]
  
  @js.native
  sealed trait CEGPropStatusDRMSRequest extends EMsg
  /* 7602 */ @js.native
  object CEGPropStatusDRMSRequest extends TopLevel[CEGPropStatusDRMSRequest with Double]
  
  @js.native
  sealed trait CEGPropStatusDRMSResponse extends EMsg
  /* 7603 */ @js.native
  object CEGPropStatusDRMSResponse extends TopLevel[CEGPropStatusDRMSResponse with Double]
  
  @js.native
  sealed trait CEGVersionSetEnableDisableRequest extends EMsg
  /* 7600 */ @js.native
  object CEGVersionSetEnableDisableRequest extends TopLevel[CEGVersionSetEnableDisableRequest with Double]
  
  @js.native
  sealed trait CEGVersionSetEnableDisableResponse extends EMsg
  /* 7601 */ @js.native
  object CEGVersionSetEnableDisableResponse extends TopLevel[CEGVersionSetEnableDisableResponse with Double]
  
  @js.native
  sealed trait CEGWhackFailureReportRequest extends EMsg
  /* 7604 */ @js.native
  object CEGWhackFailureReportRequest extends TopLevel[CEGWhackFailureReportRequest with Double]
  
  @js.native
  sealed trait CEGWhackFailureReportResponse extends EMsg
  /* 7605 */ @js.native
  object CEGWhackFailureReportResponse extends TopLevel[CEGWhackFailureReportResponse with Double]
  
   // obsolete
  @js.native
  sealed trait CMAppInfoResponseDeprecated extends EMsg
  /* 1703 */ @js.native
  object CMAppInfoResponseDeprecated extends TopLevel[CMAppInfoResponseDeprecated with Double]
  
  @js.native
  sealed trait CMSetAllowState extends EMsg
  /* 1701 */ @js.native
  object CMSetAllowState extends TopLevel[CMSetAllowState with Double]
  
  @js.native
  sealed trait CMSpewAllowState extends EMsg
  /* 1702 */ @js.native
  object CMSpewAllowState extends TopLevel[CMSpewAllowState with Double]
  
  @js.native
  sealed trait CREBase extends EMsg
  /* 8500 */ @js.native
  object CREBase extends TopLevel[CREBase with Double]
  
  @js.native
  sealed trait CREEnumeratePublishedFiles extends EMsg
  /* 8511 */ @js.native
  object CREEnumeratePublishedFiles extends TopLevel[CREEnumeratePublishedFiles with Double]
  
  @js.native
  sealed trait CREEnumeratePublishedFilesResponse extends EMsg
  /* 8512 */ @js.native
  object CREEnumeratePublishedFilesResponse extends TopLevel[CREEnumeratePublishedFilesResponse with Double]
  
  @js.native
  sealed trait CREGetUserPublishedItemVoteDetails extends EMsg
  /* 8509 */ @js.native
  object CREGetUserPublishedItemVoteDetails extends TopLevel[CREGetUserPublishedItemVoteDetails with Double]
  
  @js.native
  sealed trait CREGetUserPublishedItemVoteDetailsResponse extends EMsg
  /* 8510 */ @js.native
  object CREGetUserPublishedItemVoteDetailsResponse extends TopLevel[CREGetUserPublishedItemVoteDetailsResponse with Double]
  
  @js.native
  sealed trait CREItemVoteSummary extends EMsg
  /* 8503 */ @js.native
  object CREItemVoteSummary extends TopLevel[CREItemVoteSummary with Double]
  
  @js.native
  sealed trait CREItemVoteSummaryResponse extends EMsg
  /* 8504 */ @js.native
  object CREItemVoteSummaryResponse extends TopLevel[CREItemVoteSummaryResponse with Double]
  
  @js.native
  sealed trait CREPublishedFileVoteAdded extends EMsg
  /* 8513 */ @js.native
  object CREPublishedFileVoteAdded extends TopLevel[CREPublishedFileVoteAdded with Double]
  
   // obsolete
  @js.native
  sealed trait CRERankByTrend extends EMsg
  /* 8501 */ @js.native
  object CRERankByTrend extends TopLevel[CRERankByTrend with Double]
  
   // obsolete
  @js.native
  sealed trait CRERankByTrendResponse extends EMsg
  /* 8502 */ @js.native
  object CRERankByTrendResponse extends TopLevel[CRERankByTrendResponse with Double]
  
   // obsolete
  @js.native
  sealed trait CRERankByVote extends EMsg
  /* 8505 */ @js.native
  object CRERankByVote extends TopLevel[CRERankByVote with Double]
  
   // obsolete
  @js.native
  sealed trait CRERankByVoteResponse extends EMsg
  /* 8506 */ @js.native
  object CRERankByVoteResponse extends TopLevel[CRERankByVoteResponse with Double]
  
  @js.native
  sealed trait CREUpdateUserPublishedItemVote extends EMsg
  /* 8507 */ @js.native
  object CREUpdateUserPublishedItemVote extends TopLevel[CREUpdateUserPublishedItemVote with Double]
  
  @js.native
  sealed trait CREUpdateUserPublishedItemVoteResponse extends EMsg
  /* 8508 */ @js.native
  object CREUpdateUserPublishedItemVoteResponse extends TopLevel[CREUpdateUserPublishedItemVoteResponse with Double]
  
  @js.native
  sealed trait CSBase extends EMsg
  /* 6200 */ @js.native
  object CSBase extends TopLevel[CSBase with Double]
  
  @js.native
  sealed trait CSPing extends EMsg
  /* 6201 */ @js.native
  object CSPing extends TopLevel[CSPing with Double]
  
  @js.native
  sealed trait CSPingResponse extends EMsg
  /* 6202 */ @js.native
  object CSPingResponse extends TopLevel[CSPingResponse with Double]
  
   // obsolete
  @js.native
  sealed trait CSUserContentApprove extends EMsg
  /* 787 */ @js.native
  object CSUserContentApprove extends TopLevel[CSUserContentApprove with Double]
  
   // obsolete
  @js.native
  sealed trait CSUserContentDeny extends EMsg
  /* 788 */ @js.native
  object CSUserContentDeny extends TopLevel[CSUserContentDeny with Double]
  
   // obsolete
  @js.native
  sealed trait CSUserContentRequest extends EMsg
  /* 652 */ @js.native
  object CSUserContentRequest extends TopLevel[CSUserContentRequest with Double]
  
  @js.native
  sealed trait ChannelAuthChallenge extends EMsg
  /* 1300 */ @js.native
  object ChannelAuthChallenge extends TopLevel[ChannelAuthChallenge with Double]
  
  @js.native
  sealed trait ChannelAuthResponse extends EMsg
  /* 1301 */ @js.native
  object ChannelAuthResponse extends TopLevel[ChannelAuthResponse with Double]
  
  @js.native
  sealed trait ChannelAuthResult extends EMsg
  /* 1302 */ @js.native
  object ChannelAuthResult extends TopLevel[ChannelAuthResult with Double]
  
  @js.native
  sealed trait ChannelEncryptRequest extends EMsg
  /* 1303 */ @js.native
  object ChannelEncryptRequest extends TopLevel[ChannelEncryptRequest with Double]
  
  @js.native
  sealed trait ChannelEncryptResponse extends EMsg
  /* 1304 */ @js.native
  object ChannelEncryptResponse extends TopLevel[ChannelEncryptResponse with Double]
  
  @js.native
  sealed trait ChannelEncryptResult extends EMsg
  /* 1305 */ @js.native
  object ChannelEncryptResult extends TopLevel[ChannelEncryptResult with Double]
  
  @js.native
  sealed trait ClientAMGetClanOfficers extends EMsg
  /* 5531 */ @js.native
  object ClientAMGetClanOfficers extends TopLevel[ClientAMGetClanOfficers with Double]
  
  @js.native
  sealed trait ClientAMGetClanOfficersResponse extends EMsg
  /* 5532 */ @js.native
  object ClientAMGetClanOfficersResponse extends TopLevel[ClientAMGetClanOfficersResponse with Double]
  
  @js.native
  sealed trait ClientAMGetPersonaNameHistory extends EMsg
  /* 5570 */ @js.native
  object ClientAMGetPersonaNameHistory extends TopLevel[ClientAMGetPersonaNameHistory with Double]
  
  @js.native
  sealed trait ClientAMGetPersonaNameHistoryResponse extends EMsg
  /* 5571 */ @js.native
  object ClientAMGetPersonaNameHistoryResponse extends TopLevel[ClientAMGetPersonaNameHistoryResponse with Double]
  
  @js.native
  sealed trait ClientAccountInfo extends EMsg
  /* 768 */ @js.native
  object ClientAccountInfo extends TopLevel[ClientAccountInfo with Double]
  
  @js.native
  sealed trait ClientAckGuestPass extends EMsg
  /* 740 */ @js.native
  object ClientAckGuestPass extends TopLevel[ClientAckGuestPass with Double]
  
  @js.native
  sealed trait ClientAckGuestPassResponse extends EMsg
  /* 796 */ @js.native
  object ClientAckGuestPassResponse extends TopLevel[ClientAckGuestPassResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientAckMessageByGID extends EMsg
  /* 735 */ @js.native
  object ClientAckMessageByGID extends TopLevel[ClientAckMessageByGID with Double]
  
   // obsolete
  @js.native
  sealed trait ClientAckPurchaseReceipt extends EMsg
  /* 737 */ @js.native
  object ClientAckPurchaseReceipt extends TopLevel[ClientAckPurchaseReceipt with Double]
  
   // obsolete
  @js.native
  sealed trait ClientAckVACBan extends EMsg
  /* 709 */ @js.native
  object ClientAckVACBan extends TopLevel[ClientAckVACBan with Double]
  
  @js.native
  sealed trait ClientAckVACBan2 extends EMsg
  /* 732 */ @js.native
  object ClientAckVACBan2 extends TopLevel[ClientAckVACBan2 with Double]
  
  @js.native
  sealed trait ClientAcknowledgeClanInvite extends EMsg
  /* 745 */ @js.native
  object ClientAcknowledgeClanInvite extends TopLevel[ClientAcknowledgeClanInvite with Double]
  
  @js.native
  sealed trait ClientActivateOEMLicense extends EMsg
  /* 5468 */ @js.native
  object ClientActivateOEMLicense extends TopLevel[ClientActivateOEMLicense with Double]
  
  @js.native
  sealed trait ClientAddFriend extends EMsg
  /* 791 */ @js.native
  object ClientAddFriend extends TopLevel[ClientAddFriend with Double]
  
  @js.native
  sealed trait ClientAddFriendResponse extends EMsg
  /* 792 */ @js.native
  object ClientAddFriendResponse extends TopLevel[ClientAddFriendResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientAnonLogOn_Deprecated extends EMsg
  /* 702 */ @js.native
  object ClientAnonLogOn_Deprecated extends TopLevel[ClientAnonLogOn_Deprecated with Double]
  
   // obsolete
  @js.native
  sealed trait ClientAnonUserLogOn_Deprecated extends EMsg
  /* 5409 */ @js.native
  object ClientAnonUserLogOn_Deprecated extends TopLevel[ClientAnonUserLogOn_Deprecated with Double]
  
   // obsolete
  @js.native
  sealed trait ClientAppInfoChanges extends EMsg
  /* 867 */ @js.native
  object ClientAppInfoChanges extends TopLevel[ClientAppInfoChanges with Double]
  
   // obsolete
  @js.native
  sealed trait ClientAppInfoRequest extends EMsg
  /* 840 */ @js.native
  object ClientAppInfoRequest extends TopLevel[ClientAppInfoRequest with Double]
  
   // obsolete
  @js.native
  sealed trait ClientAppInfoResponse extends EMsg
  /* 841 */ @js.native
  object ClientAppInfoResponse extends TopLevel[ClientAppInfoResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientAppInfoUpdate extends EMsg
  /* 866 */ @js.native
  object ClientAppInfoUpdate extends TopLevel[ClientAppInfoUpdate with Double]
  
  @js.native
  sealed trait ClientAppMinutesPlayedData extends EMsg
  /* 5507 */ @js.native
  object ClientAppMinutesPlayedData extends TopLevel[ClientAppMinutesPlayedData with Double]
  
  @js.native
  sealed trait ClientAppUsageEvent extends EMsg
  /* 747 */ @js.native
  object ClientAppUsageEvent extends TopLevel[ClientAppUsageEvent with Double]
  
  @js.native
  sealed trait ClientAuthList extends EMsg
  /* 5432 */ @js.native
  object ClientAuthList extends TopLevel[ClientAuthList with Double]
  
  @js.native
  sealed trait ClientAuthListAck extends EMsg
  /* 5575 */ @js.native
  object ClientAuthListAck extends TopLevel[ClientAuthListAck with Double]
  
   // obsolete
  @js.native
  sealed trait ClientAuthList_Deprecated extends EMsg
  /* 5428 */ @js.native
  object ClientAuthList_Deprecated extends TopLevel[ClientAuthList_Deprecated with Double]
  
   // obsolete
  @js.native
  sealed trait ClientAuthorizeLocalDevice extends EMsg
  /* 6502 */ @js.native
  object ClientAuthorizeLocalDevice extends TopLevel[ClientAuthorizeLocalDevice with Double]
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceNotification extends EMsg
  /* 6509 */ @js.native
  object ClientAuthorizeLocalDeviceNotification extends TopLevel[ClientAuthorizeLocalDeviceNotification with Double]
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceRequest extends EMsg
  /* 6501 */ @js.native
  object ClientAuthorizeLocalDeviceRequest extends TopLevel[ClientAuthorizeLocalDeviceRequest with Double]
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceResponse extends EMsg
  /* 6502 */ @js.native
  object ClientAuthorizeLocalDeviceResponse extends TopLevel[ClientAuthorizeLocalDeviceResponse with Double]
  
  @js.native
  sealed trait ClientBroadcastBase extends EMsg
  /* 9700 */ @js.native
  object ClientBroadcastBase extends TopLevel[ClientBroadcastBase with Double]
  
  @js.native
  sealed trait ClientBroadcastDisconnect extends EMsg
  /* 9702 */ @js.native
  object ClientBroadcastDisconnect extends TopLevel[ClientBroadcastDisconnect with Double]
  
  @js.native
  sealed trait ClientBroadcastFrames extends EMsg
  /* 9701 */ @js.native
  object ClientBroadcastFrames extends TopLevel[ClientBroadcastFrames with Double]
  
  @js.native
  sealed trait ClientBroadcastInit extends EMsg
  /* 9700 */ @js.native
  object ClientBroadcastInit extends TopLevel[ClientBroadcastInit with Double]
  
  @js.native
  sealed trait ClientBroadcastScreenshot extends EMsg
  /* 9703 */ @js.native
  object ClientBroadcastScreenshot extends TopLevel[ClientBroadcastScreenshot with Double]
  
  @js.native
  sealed trait ClientBroadcastUploadConfig extends EMsg
  /* 9704 */ @js.native
  object ClientBroadcastUploadConfig extends TopLevel[ClientBroadcastUploadConfig with Double]
  
  @js.native
  sealed trait ClientCMList extends EMsg
  /* 783 */ @js.native
  object ClientCMList extends TopLevel[ClientCMList with Double]
  
   // obsolete
  @js.native
  sealed trait ClientCancelLicense extends EMsg
  /* 729 */ @js.native
  object ClientCancelLicense extends TopLevel[ClientCancelLicense with Double]
  
   // obsolete
  @js.native
  sealed trait ClientCancelLicenseResponse extends EMsg
  /* 781 */ @js.native
  object ClientCancelLicenseResponse extends TopLevel[ClientCancelLicenseResponse with Double]
  
  @js.native
  sealed trait ClientChangeStatus extends EMsg
  /* 716 */ @js.native
  object ClientChangeStatus extends TopLevel[ClientChangeStatus with Double]
  
   // obsolete
  @js.native
  sealed trait ClientChangeSteamGuardOptions extends EMsg
  /* 5579 */ @js.native
  object ClientChangeSteamGuardOptions extends TopLevel[ClientChangeSteamGuardOptions with Double]
  
   // obsolete
  @js.native
  sealed trait ClientChangeSteamGuardOptionsResponse extends EMsg
  /* 5580 */ @js.native
  object ClientChangeSteamGuardOptionsResponse extends TopLevel[ClientChangeSteamGuardOptionsResponse with Double]
  
  @js.native
  sealed trait ClientChatAction extends EMsg
  /* 597 */ @js.native
  object ClientChatAction extends TopLevel[ClientChatAction with Double]
  
  @js.native
  sealed trait ClientChatActionResult extends EMsg
  /* 814 */ @js.native
  object ClientChatActionResult extends TopLevel[ClientChatActionResult with Double]
  
  @js.native
  sealed trait ClientChatDeclined extends EMsg
  /* 5426 */ @js.native
  object ClientChatDeclined extends TopLevel[ClientChatDeclined with Double]
  
  @js.native
  sealed trait ClientChatEnter extends EMsg
  /* 807 */ @js.native
  object ClientChatEnter extends TopLevel[ClientChatEnter with Double]
  
  @js.native
  sealed trait ClientChatInvite extends EMsg
  /* 800 */ @js.native
  object ClientChatInvite extends TopLevel[ClientChatInvite with Double]
  
  @js.native
  sealed trait ClientChatMemberInfo extends EMsg
  /* 802 */ @js.native
  object ClientChatMemberInfo extends TopLevel[ClientChatMemberInfo with Double]
  
  @js.native
  sealed trait ClientChatMsg extends EMsg
  /* 799 */ @js.native
  object ClientChatMsg extends TopLevel[ClientChatMsg with Double]
  
  @js.native
  sealed trait ClientChatRoomInfo extends EMsg
  /* 4026 */ @js.native
  object ClientChatRoomInfo extends TopLevel[ClientChatRoomInfo with Double]
  
  @js.native
  sealed trait ClientCheckAppBetaPassword extends EMsg
  /* 5450 */ @js.native
  object ClientCheckAppBetaPassword extends TopLevel[ClientCheckAppBetaPassword with Double]
  
  @js.native
  sealed trait ClientCheckAppBetaPasswordResponse extends EMsg
  /* 5451 */ @js.native
  object ClientCheckAppBetaPasswordResponse extends TopLevel[ClientCheckAppBetaPasswordResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientCheckFileSignature extends EMsg
  /* 5533 */ @js.native
  object ClientCheckFileSignature extends TopLevel[ClientCheckFileSignature with Double]
  
   // obsolete
  @js.native
  sealed trait ClientCheckFileSignatureResponse extends EMsg
  /* 5534 */ @js.native
  object ClientCheckFileSignatureResponse extends TopLevel[ClientCheckFileSignatureResponse with Double]
  
  @js.native
  sealed trait ClientCheckPassword extends EMsg
  /* 845 */ @js.native
  object ClientCheckPassword extends TopLevel[ClientCheckPassword with Double]
  
  @js.native
  sealed trait ClientCheckPasswordResponse extends EMsg
  /* 848 */ @js.native
  object ClientCheckPasswordResponse extends TopLevel[ClientCheckPasswordResponse with Double]
  
  @js.native
  sealed trait ClientClanState extends EMsg
  /* 822 */ @js.native
  object ClientClanState extends TopLevel[ClientClanState with Double]
  
  @js.native
  sealed trait ClientCommentNotifications extends EMsg
  /* 5582 */ @js.native
  object ClientCommentNotifications extends TopLevel[ClientCommentNotifications with Double]
  
  @js.native
  sealed trait ClientConcurrentSessionsBase extends EMsg
  /* 9600 */ @js.native
  object ClientConcurrentSessionsBase extends TopLevel[ClientConcurrentSessionsBase with Double]
  
  @js.native
  sealed trait ClientConnectionStats extends EMsg
  /* 710 */ @js.native
  object ClientConnectionStats extends TopLevel[ClientConnectionStats with Double]
  
   // obsolete
  @js.native
  sealed trait ClientContentServerLogOn_Deprecated extends EMsg
  /* 731 */ @js.native
  object ClientContentServerLogOn_Deprecated extends TopLevel[ClientContentServerLogOn_Deprecated with Double]
  
  @js.native
  sealed trait ClientCreateAccount2 extends EMsg
  /* 5406 */ @js.native
  object ClientCreateAccount2 extends TopLevel[ClientCreateAccount2 with Double]
  
   // obsolete
  @js.native
  sealed trait ClientCreateAccount3 extends EMsg
  /* 5462 */ @js.native
  object ClientCreateAccount3 extends TopLevel[ClientCreateAccount3 with Double]
  
  @js.native
  sealed trait ClientCreateAccountProto extends EMsg
  /* 5590 */ @js.native
  object ClientCreateAccountProto extends TopLevel[ClientCreateAccountProto with Double]
  
  @js.native
  sealed trait ClientCreateAccountProtoResponse extends EMsg
  /* 5591 */ @js.native
  object ClientCreateAccountProtoResponse extends TopLevel[ClientCreateAccountProtoResponse with Double]
  
  @js.native
  sealed trait ClientCreateAccountResponse extends EMsg
  /* 5403 */ @js.native
  object ClientCreateAccountResponse extends TopLevel[ClientCreateAccountResponse with Double]
  
  @js.native
  sealed trait ClientCreateAcctResponse extends EMsg
  /* 761 */ @js.native
  object ClientCreateAcctResponse extends TopLevel[ClientCreateAcctResponse with Double]
  
  @js.native
  sealed trait ClientCreateChat extends EMsg
  /* 809 */ @js.native
  object ClientCreateChat extends TopLevel[ClientCreateChat with Double]
  
  @js.native
  sealed trait ClientCreateChatResponse extends EMsg
  /* 810 */ @js.native
  object ClientCreateChatResponse extends TopLevel[ClientCreateChatResponse with Double]
  
  @js.native
  sealed trait ClientCurrentUIMode extends EMsg
  /* 5597 */ @js.native
  object ClientCurrentUIMode extends TopLevel[ClientCurrentUIMode with Double]
  
  @js.native
  sealed trait ClientDFSAuthenticateRequest extends EMsg
  /* 5605 */ @js.native
  object ClientDFSAuthenticateRequest extends TopLevel[ClientDFSAuthenticateRequest with Double]
  
  @js.native
  sealed trait ClientDFSAuthenticateResponse extends EMsg
  /* 5606 */ @js.native
  object ClientDFSAuthenticateResponse extends TopLevel[ClientDFSAuthenticateResponse with Double]
  
  @js.native
  sealed trait ClientDFSDownloadStatus extends EMsg
  /* 5617 */ @js.native
  object ClientDFSDownloadStatus extends TopLevel[ClientDFSDownloadStatus with Double]
  
  @js.native
  sealed trait ClientDFSEndSession extends EMsg
  /* 5607 */ @js.native
  object ClientDFSEndSession extends TopLevel[ClientDFSEndSession with Double]
  
  @js.native
  sealed trait ClientDPCheckSpecialSurvey extends EMsg
  /* 1620 */ @js.native
  object ClientDPCheckSpecialSurvey extends TopLevel[ClientDPCheckSpecialSurvey with Double]
  
  @js.native
  sealed trait ClientDPCheckSpecialSurveyResponse extends EMsg
  /* 1621 */ @js.native
  object ClientDPCheckSpecialSurveyResponse extends TopLevel[ClientDPCheckSpecialSurveyResponse with Double]
  
  @js.native
  sealed trait ClientDPContentStatsReport extends EMsg
  /* 1630 */ @js.native
  object ClientDPContentStatsReport extends TopLevel[ClientDPContentStatsReport with Double]
  
  @js.native
  sealed trait ClientDPSendSpecialSurveyResponse extends EMsg
  /* 1622 */ @js.native
  object ClientDPSendSpecialSurveyResponse extends TopLevel[ClientDPSendSpecialSurveyResponse with Double]
  
  @js.native
  sealed trait ClientDPSendSpecialSurveyResponseReply extends EMsg
  /* 1623 */ @js.native
  object ClientDPSendSpecialSurveyResponseReply extends TopLevel[ClientDPSendSpecialSurveyResponseReply with Double]
  
   // obsolete
  @js.native
  sealed trait ClientDPSteam2AppStarted extends EMsg
  /* 1627 */ @js.native
  object ClientDPSteam2AppStarted extends TopLevel[ClientDPSteam2AppStarted with Double]
  
  @js.native
  sealed trait ClientDPUpdateAppJobReport extends EMsg
  /* 1625 */ @js.native
  object ClientDPUpdateAppJobReport extends TopLevel[ClientDPUpdateAppJobReport with Double]
  
  @js.native
  sealed trait ClientDRMBlobRequest extends EMsg
  /* 896 */ @js.native
  object ClientDRMBlobRequest extends TopLevel[ClientDRMBlobRequest with Double]
  
  @js.native
  sealed trait ClientDRMBlobResponse extends EMsg
  /* 897 */ @js.native
  object ClientDRMBlobResponse extends TopLevel[ClientDRMBlobResponse with Double]
  
  @js.native
  sealed trait ClientDRMDownloadRequest extends EMsg
  /* 5485 */ @js.native
  object ClientDRMDownloadRequest extends TopLevel[ClientDRMDownloadRequest with Double]
  
  @js.native
  sealed trait ClientDRMDownloadRequestWithCrashData extends EMsg
  /* 5574 */ @js.native
  object ClientDRMDownloadRequestWithCrashData extends TopLevel[ClientDRMDownloadRequestWithCrashData with Double]
  
  @js.native
  sealed trait ClientDRMDownloadResponse extends EMsg
  /* 5486 */ @js.native
  object ClientDRMDownloadResponse extends TopLevel[ClientDRMDownloadResponse with Double]
  
  @js.native
  sealed trait ClientDRMFinalResult extends EMsg
  /* 5487 */ @js.native
  object ClientDRMFinalResult extends TopLevel[ClientDRMFinalResult with Double]
  
  @js.native
  sealed trait ClientDRMProblemReport extends EMsg
  /* 851 */ @js.native
  object ClientDRMProblemReport extends TopLevel[ClientDRMProblemReport with Double]
  
  @js.native
  sealed trait ClientDRMTest extends EMsg
  /* 5495 */ @js.native
  object ClientDRMTest extends TopLevel[ClientDRMTest with Double]
  
  @js.native
  sealed trait ClientDRMTestResult extends EMsg
  /* 5496 */ @js.native
  object ClientDRMTestResult extends TopLevel[ClientDRMTestResult with Double]
  
  @js.native
  sealed trait ClientDeauthorizeDevice extends EMsg
  /* 6504 */ @js.native
  object ClientDeauthorizeDevice extends TopLevel[ClientDeauthorizeDevice with Double]
  
  @js.native
  sealed trait ClientDeauthorizeDeviceRequest extends EMsg
  /* 6503 */ @js.native
  object ClientDeauthorizeDeviceRequest extends TopLevel[ClientDeauthorizeDeviceRequest with Double]
  
  @js.native
  sealed trait ClientDeregisterWithServer extends EMsg
  /* 5511 */ @js.native
  object ClientDeregisterWithServer extends TopLevel[ClientDeregisterWithServer with Double]
  
  @js.native
  sealed trait ClientDisableTestLicense extends EMsg
  /* 5445 */ @js.native
  object ClientDisableTestLicense extends TopLevel[ClientDisableTestLicense with Double]
  
  @js.native
  sealed trait ClientDisableTestLicenseResponse extends EMsg
  /* 5446 */ @js.native
  object ClientDisableTestLicenseResponse extends TopLevel[ClientDisableTestLicenseResponse with Double]
  
  @js.native
  sealed trait ClientDownloadRateStatistics extends EMsg
  /* 5548 */ @js.native
  object ClientDownloadRateStatistics extends TopLevel[ClientDownloadRateStatistics with Double]
  
  @js.native
  sealed trait ClientEmailAddrInfo extends EMsg
  /* 5456 */ @js.native
  object ClientEmailAddrInfo extends TopLevel[ClientEmailAddrInfo with Double]
  
  @js.native
  sealed trait ClientEmailChange3 extends EMsg
  /* 5458 */ @js.native
  object ClientEmailChange3 extends TopLevel[ClientEmailChange3 with Double]
  
  @js.native
  sealed trait ClientEmailChange4 extends EMsg
  /* 5544 */ @js.native
  object ClientEmailChange4 extends TopLevel[ClientEmailChange4 with Double]
  
  @js.native
  sealed trait ClientEmailChangeResponse extends EMsg
  /* 891 */ @js.native
  object ClientEmailChangeResponse extends TopLevel[ClientEmailChangeResponse with Double]
  
  @js.native
  sealed trait ClientEmailChangeResponse4 extends EMsg
  /* 5545 */ @js.native
  object ClientEmailChangeResponse4 extends TopLevel[ClientEmailChangeResponse4 with Double]
  
  @js.native
  sealed trait ClientEmoticonList extends EMsg
  /* 9331 */ @js.native
  object ClientEmoticonList extends TopLevel[ClientEmoticonList with Double]
  
  @js.native
  sealed trait ClientEnableTestLicense extends EMsg
  /* 5443 */ @js.native
  object ClientEnableTestLicense extends TopLevel[ClientEnableTestLicense with Double]
  
  @js.native
  sealed trait ClientEnableTestLicenseResponse extends EMsg
  /* 5444 */ @js.native
  object ClientEnableTestLicenseResponse extends TopLevel[ClientEnableTestLicenseResponse with Double]
  
  @js.native
  sealed trait ClientEncryptPct extends EMsg
  /* 784 */ @js.native
  object ClientEncryptPct extends TopLevel[ClientEncryptPct with Double]
  
  @js.native
  sealed trait ClientFSEnumerateFollowingList extends EMsg
  /* 7519 */ @js.native
  object ClientFSEnumerateFollowingList extends TopLevel[ClientFSEnumerateFollowingList with Double]
  
  @js.native
  sealed trait ClientFSEnumerateFollowingListResponse extends EMsg
  /* 7520 */ @js.native
  object ClientFSEnumerateFollowingListResponse extends TopLevel[ClientFSEnumerateFollowingListResponse with Double]
  
  @js.native
  sealed trait ClientFSGetFollowerCount extends EMsg
  /* 7515 */ @js.native
  object ClientFSGetFollowerCount extends TopLevel[ClientFSGetFollowerCount with Double]
  
  @js.native
  sealed trait ClientFSGetFollowerCountResponse extends EMsg
  /* 7516 */ @js.native
  object ClientFSGetFollowerCountResponse extends TopLevel[ClientFSGetFollowerCountResponse with Double]
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistory extends EMsg
  /* 7525 */ @js.native
  object ClientFSGetFriendMessageHistory extends TopLevel[ClientFSGetFriendMessageHistory with Double]
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistoryForOfflineMessages extends EMsg
  /* 7527 */ @js.native
  object ClientFSGetFriendMessageHistoryForOfflineMessages extends TopLevel[ClientFSGetFriendMessageHistoryForOfflineMessages with Double]
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistoryResponse extends EMsg
  /* 7526 */ @js.native
  object ClientFSGetFriendMessageHistoryResponse extends TopLevel[ClientFSGetFriendMessageHistoryResponse with Double]
  
  @js.native
  sealed trait ClientFSGetFriendsSteamLevels extends EMsg
  /* 7528 */ @js.native
  object ClientFSGetFriendsSteamLevels extends TopLevel[ClientFSGetFriendsSteamLevels with Double]
  
  @js.native
  sealed trait ClientFSGetFriendsSteamLevelsResponse extends EMsg
  /* 7529 */ @js.native
  object ClientFSGetFriendsSteamLevelsResponse extends TopLevel[ClientFSGetFriendsSteamLevelsResponse with Double]
  
  @js.native
  sealed trait ClientFSGetIsFollowing extends EMsg
  /* 7517 */ @js.native
  object ClientFSGetIsFollowing extends TopLevel[ClientFSGetIsFollowing with Double]
  
  @js.native
  sealed trait ClientFSGetIsFollowingResponse extends EMsg
  /* 7518 */ @js.native
  object ClientFSGetIsFollowingResponse extends TopLevel[ClientFSGetIsFollowingResponse with Double]
  
  @js.native
  sealed trait ClientFSOfflineMessageNotification extends EMsg
  /* 7523 */ @js.native
  object ClientFSOfflineMessageNotification extends TopLevel[ClientFSOfflineMessageNotification with Double]
  
  @js.native
  sealed trait ClientFSRequestOfflineMessageCount extends EMsg
  /* 7524 */ @js.native
  object ClientFSRequestOfflineMessageCount extends TopLevel[ClientFSRequestOfflineMessageCount with Double]
  
   // obsolete
  @js.native
  sealed trait ClientFavoritesList extends EMsg
  /* 786 */ @js.native
  object ClientFavoritesList extends TopLevel[ClientFavoritesList with Double]
  
  @js.native
  sealed trait ClientFileToDownload extends EMsg
  /* 5412 */ @js.native
  object ClientFileToDownload extends TopLevel[ClientFileToDownload with Double]
  
  @js.native
  sealed trait ClientFileToDownloadResponse extends EMsg
  /* 5413 */ @js.native
  object ClientFileToDownloadResponse extends TopLevel[ClientFileToDownloadResponse with Double]
  
  @js.native
  sealed trait ClientFriendMsg extends EMsg
  /* 718 */ @js.native
  object ClientFriendMsg extends TopLevel[ClientFriendMsg with Double]
  
  @js.native
  sealed trait ClientFriendMsgEchoToSender extends EMsg
  /* 5578 */ @js.native
  object ClientFriendMsgEchoToSender extends TopLevel[ClientFriendMsgEchoToSender with Double]
  
  @js.native
  sealed trait ClientFriendMsgIncoming extends EMsg
  /* 5427 */ @js.native
  object ClientFriendMsgIncoming extends TopLevel[ClientFriendMsgIncoming with Double]
  
  @js.native
  sealed trait ClientFriendProfileInfo extends EMsg
  /* 5535 */ @js.native
  object ClientFriendProfileInfo extends TopLevel[ClientFriendProfileInfo with Double]
  
  @js.native
  sealed trait ClientFriendProfileInfoResponse extends EMsg
  /* 5536 */ @js.native
  object ClientFriendProfileInfoResponse extends TopLevel[ClientFriendProfileInfoResponse with Double]
  
  @js.native
  sealed trait ClientFriendRemovedFromSource extends EMsg
  /* 808 */ @js.native
  object ClientFriendRemovedFromSource extends TopLevel[ClientFriendRemovedFromSource with Double]
  
  @js.native
  sealed trait ClientFriendUserStatusPublished extends EMsg
  /* 5596 */ @js.native
  object ClientFriendUserStatusPublished extends TopLevel[ClientFriendUserStatusPublished with Double]
  
  @js.native
  sealed trait ClientFriendsGroupsList extends EMsg
  /* 5553 */ @js.native
  object ClientFriendsGroupsList extends TopLevel[ClientFriendsGroupsList with Double]
  
  @js.native
  sealed trait ClientFriendsList extends EMsg
  /* 767 */ @js.native
  object ClientFriendsList extends TopLevel[ClientFriendsList with Double]
  
  @js.native
  sealed trait ClientFromGC extends EMsg
  /* 5453 */ @js.native
  object ClientFromGC extends TopLevel[ClientFromGC with Double]
  
  @js.native
  sealed trait ClientGCMsgFailed extends EMsg
  /* 5503 */ @js.native
  object ClientGCMsgFailed extends TopLevel[ClientGCMsgFailed with Double]
  
  @js.native
  sealed trait ClientGMSServerQuery extends EMsg
  /* 6403 */ @js.native
  object ClientGMSServerQuery extends TopLevel[ClientGMSServerQuery with Double]
  
  @js.native
  sealed trait ClientGameConnectDeny extends EMsg
  /* 773 */ @js.native
  object ClientGameConnectDeny extends TopLevel[ClientGameConnectDeny with Double]
  
  @js.native
  sealed trait ClientGameConnectTokens extends EMsg
  /* 779 */ @js.native
  object ClientGameConnectTokens extends TopLevel[ClientGameConnectTokens with Double]
  
   // obsolete
  @js.native
  sealed trait ClientGameConnect_obsolete extends EMsg
  /* 719 */ @js.native
  object ClientGameConnect_obsolete extends TopLevel[ClientGameConnect_obsolete with Double]
  
   // obsolete
  @js.native
  sealed trait ClientGameEnded_obsolete extends EMsg
  /* 721 */ @js.native
  object ClientGameEnded_obsolete extends TopLevel[ClientGameEnded_obsolete with Double]
  
  @js.native
  sealed trait ClientGamesPlayed extends EMsg
  /* 742 */ @js.native
  object ClientGamesPlayed extends TopLevel[ClientGamesPlayed with Double]
  
   // obsolete
  @js.native
  sealed trait ClientGamesPlayed2_obsolete extends EMsg
  /* 720 */ @js.native
  object ClientGamesPlayed2_obsolete extends TopLevel[ClientGamesPlayed2_obsolete with Double]
  
   // obsolete
  @js.native
  sealed trait ClientGamesPlayed3_obsolete extends EMsg
  /* 738 */ @js.native
  object ClientGamesPlayed3_obsolete extends TopLevel[ClientGamesPlayed3_obsolete with Double]
  
  @js.native
  sealed trait ClientGamesPlayedNoDataBlob extends EMsg
  /* 715 */ @js.native
  object ClientGamesPlayedNoDataBlob extends TopLevel[ClientGamesPlayedNoDataBlob with Double]
  
  @js.native
  sealed trait ClientGamesPlayedWithDataBlob extends EMsg
  /* 5410 */ @js.native
  object ClientGamesPlayedWithDataBlob extends TopLevel[ClientGamesPlayedWithDataBlob with Double]
  
   // obsolete
  @js.native
  sealed trait ClientGamesPlayed_obsolete extends EMsg
  /* 705 */ @js.native
  object ClientGamesPlayed_obsolete extends TopLevel[ClientGamesPlayed_obsolete with Double]
  
   // obsolete
  @js.native
  sealed trait ClientGetAppBetaPasswords extends EMsg
  /* 5441 */ @js.native
  object ClientGetAppBetaPasswords extends TopLevel[ClientGetAppBetaPasswords with Double]
  
   // obsolete
  @js.native
  sealed trait ClientGetAppBetaPasswordsResponse extends EMsg
  /* 5442 */ @js.native
  object ClientGetAppBetaPasswordsResponse extends TopLevel[ClientGetAppBetaPasswordsResponse with Double]
  
  @js.native
  sealed trait ClientGetAppOwnershipTicket extends EMsg
  /* 857 */ @js.native
  object ClientGetAppOwnershipTicket extends TopLevel[ClientGetAppOwnershipTicket with Double]
  
  @js.native
  sealed trait ClientGetAppOwnershipTicketResponse extends EMsg
  /* 858 */ @js.native
  object ClientGetAppOwnershipTicketResponse extends TopLevel[ClientGetAppOwnershipTicketResponse with Double]
  
  @js.native
  sealed trait ClientGetAuthorizedDevices extends EMsg
  /* 6506 */ @js.native
  object ClientGetAuthorizedDevices extends TopLevel[ClientGetAuthorizedDevices with Double]
  
  @js.native
  sealed trait ClientGetAuthorizedDevicesResponse extends EMsg
  /* 6507 */ @js.native
  object ClientGetAuthorizedDevicesResponse extends TopLevel[ClientGetAuthorizedDevicesResponse with Double]
  
  @js.native
  sealed trait ClientGetCDNAuthToken extends EMsg
  /* 5546 */ @js.native
  object ClientGetCDNAuthToken extends TopLevel[ClientGetCDNAuthToken with Double]
  
  @js.native
  sealed trait ClientGetCDNAuthTokenResponse extends EMsg
  /* 5547 */ @js.native
  object ClientGetCDNAuthTokenResponse extends TopLevel[ClientGetCDNAuthTokenResponse with Double]
  
  @js.native
  sealed trait ClientGetClanActivityCounts extends EMsg
  /* 5554 */ @js.native
  object ClientGetClanActivityCounts extends TopLevel[ClientGetClanActivityCounts with Double]
  
  @js.native
  sealed trait ClientGetClanActivityCountsResponse extends EMsg
  /* 5555 */ @js.native
  object ClientGetClanActivityCountsResponse extends TopLevel[ClientGetClanActivityCountsResponse with Double]
  
  @js.native
  sealed trait ClientGetClientAppList extends EMsg
  /* 5518 */ @js.native
  object ClientGetClientAppList extends TopLevel[ClientGetClientAppList with Double]
  
  @js.native
  sealed trait ClientGetClientAppListResponse extends EMsg
  /* 5519 */ @js.native
  object ClientGetClientAppListResponse extends TopLevel[ClientGetClientAppListResponse with Double]
  
  @js.native
  sealed trait ClientGetClientDetails extends EMsg
  /* 5515 */ @js.native
  object ClientGetClientDetails extends TopLevel[ClientGetClientDetails with Double]
  
  @js.native
  sealed trait ClientGetClientDetailsResponse extends EMsg
  /* 5516 */ @js.native
  object ClientGetClientDetailsResponse extends TopLevel[ClientGetClientDetailsResponse with Double]
  
  @js.native
  sealed trait ClientGetDepotDecryptionKey extends EMsg
  /* 5438 */ @js.native
  object ClientGetDepotDecryptionKey extends TopLevel[ClientGetDepotDecryptionKey with Double]
  
  @js.native
  sealed trait ClientGetDepotDecryptionKeyResponse extends EMsg
  /* 5439 */ @js.native
  object ClientGetDepotDecryptionKeyResponse extends TopLevel[ClientGetDepotDecryptionKeyResponse with Double]
  
  @js.native
  sealed trait ClientGetEmoticonList extends EMsg
  /* 9330 */ @js.native
  object ClientGetEmoticonList extends TopLevel[ClientGetEmoticonList with Double]
  
   // obsolete
  @js.native
  sealed trait ClientGetFinalPrice extends EMsg
  /* 722 */ @js.native
  object ClientGetFinalPrice extends TopLevel[ClientGetFinalPrice with Double]
  
   // obsolete
  @js.native
  sealed trait ClientGetFinalPriceResponse extends EMsg
  /* 775 */ @js.native
  object ClientGetFinalPriceResponse extends TopLevel[ClientGetFinalPriceResponse with Double]
  
  @js.native
  sealed trait ClientGetFriendsWhoPlayGame extends EMsg
  /* 5488 */ @js.native
  object ClientGetFriendsWhoPlayGame extends TopLevel[ClientGetFriendsWhoPlayGame with Double]
  
  @js.native
  sealed trait ClientGetFriendsWhoPlayGameResponse extends EMsg
  /* 5489 */ @js.native
  object ClientGetFriendsWhoPlayGameResponse extends TopLevel[ClientGetFriendsWhoPlayGameResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientGetGiftTargetList extends EMsg
  /* 748 */ @js.native
  object ClientGetGiftTargetList extends TopLevel[ClientGetGiftTargetList with Double]
  
   // obsolete
  @js.native
  sealed trait ClientGetGiftTargetListResponse extends EMsg
  /* 749 */ @js.native
  object ClientGetGiftTargetListResponse extends TopLevel[ClientGetGiftTargetListResponse with Double]
  
  @js.native
  sealed trait ClientGetLegacyGameKey extends EMsg
  /* 730 */ @js.native
  object ClientGetLegacyGameKey extends TopLevel[ClientGetLegacyGameKey with Double]
  
  @js.native
  sealed trait ClientGetLegacyGameKeyResponse extends EMsg
  /* 785 */ @js.native
  object ClientGetLegacyGameKeyResponse extends TopLevel[ClientGetLegacyGameKeyResponse with Double]
  
  @js.native
  sealed trait ClientGetLicenses extends EMsg
  /* 728 */ @js.native
  object ClientGetLicenses extends TopLevel[ClientGetLicenses with Double]
  
  @js.native
  sealed trait ClientGetLobbyListResponse extends EMsg
  /* 860 */ @js.native
  object ClientGetLobbyListResponse extends TopLevel[ClientGetLobbyListResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientGetLobbyMetadata extends EMsg
  /* 861 */ @js.native
  object ClientGetLobbyMetadata extends TopLevel[ClientGetLobbyMetadata with Double]
  
   // obsolete
  @js.native
  sealed trait ClientGetLobbyMetadataResponse extends EMsg
  /* 862 */ @js.native
  object ClientGetLobbyMetadataResponse extends TopLevel[ClientGetLobbyMetadataResponse with Double]
  
  @js.native
  sealed trait ClientGetMicroTxnInfo extends EMsg
  /* 5508 */ @js.native
  object ClientGetMicroTxnInfo extends TopLevel[ClientGetMicroTxnInfo with Double]
  
  @js.native
  sealed trait ClientGetMicroTxnInfoResponse extends EMsg
  /* 5509 */ @js.native
  object ClientGetMicroTxnInfoResponse extends TopLevel[ClientGetMicroTxnInfoResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayers extends EMsg
  /* 5436 */ @js.native
  object ClientGetNumberOfCurrentPlayers extends TopLevel[ClientGetNumberOfCurrentPlayers with Double]
  
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersDP extends EMsg
  /* 5592 */ @js.native
  object ClientGetNumberOfCurrentPlayersDP extends TopLevel[ClientGetNumberOfCurrentPlayersDP with Double]
  
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersDPResponse extends EMsg
  /* 5593 */ @js.native
  object ClientGetNumberOfCurrentPlayersDPResponse extends TopLevel[ClientGetNumberOfCurrentPlayersDPResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersResponse extends EMsg
  /* 5437 */ @js.native
  object ClientGetNumberOfCurrentPlayersResponse extends TopLevel[ClientGetNumberOfCurrentPlayersResponse with Double]
  
  @js.native
  sealed trait ClientGetPurchaseReceipts extends EMsg
  /* 736 */ @js.native
  object ClientGetPurchaseReceipts extends TopLevel[ClientGetPurchaseReceipts with Double]
  
  @js.native
  sealed trait ClientGetUserStats extends EMsg
  /* 818 */ @js.native
  object ClientGetUserStats extends TopLevel[ClientGetUserStats with Double]
  
  @js.native
  sealed trait ClientGetUserStatsResponse extends EMsg
  /* 819 */ @js.native
  object ClientGetUserStatsResponse extends TopLevel[ClientGetUserStatsResponse with Double]
  
  @js.native
  sealed trait ClientHeartBeat extends EMsg
  /* 703 */ @js.native
  object ClientHeartBeat extends TopLevel[ClientHeartBeat with Double]
  
  @js.native
  sealed trait ClientHideFriend extends EMsg
  /* 5552 */ @js.native
  object ClientHideFriend extends TopLevel[ClientHideFriend with Double]
  
  @js.native
  sealed trait ClientInformOfCreateAccount extends EMsg
  /* 708 */ @js.native
  object ClientInformOfCreateAccount extends TopLevel[ClientInformOfCreateAccount with Double]
  
  @js.native
  sealed trait ClientInformOfResetForgottenPassword extends EMsg
  /* 5407 */ @js.native
  object ClientInformOfResetForgottenPassword extends TopLevel[ClientInformOfResetForgottenPassword with Double]
  
  @js.native
  sealed trait ClientInformOfResetForgottenPasswordResponse extends EMsg
  /* 5408 */ @js.native
  object ClientInformOfResetForgottenPasswordResponse extends TopLevel[ClientInformOfResetForgottenPasswordResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientInitPurchase extends EMsg
  /* 711 */ @js.native
  object ClientInitPurchase extends TopLevel[ClientInitPurchase with Double]
  
   // obsolete
  @js.native
  sealed trait ClientInitPurchaseResponse extends EMsg
  /* 789 */ @js.native
  object ClientInitPurchaseResponse extends TopLevel[ClientInitPurchaseResponse with Double]
  
  @js.native
  sealed trait ClientInstallClientApp extends EMsg
  /* 5520 */ @js.native
  object ClientInstallClientApp extends TopLevel[ClientInstallClientApp with Double]
  
  @js.native
  sealed trait ClientInstallClientAppResponse extends EMsg
  /* 5521 */ @js.native
  object ClientInstallClientAppResponse extends TopLevel[ClientInstallClientAppResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientInviteFriend extends EMsg
  /* 793 */ @js.native
  object ClientInviteFriend extends TopLevel[ClientInviteFriend with Double]
  
   // obsolete
  @js.native
  sealed trait ClientInviteFriendResponse extends EMsg
  /* 794 */ @js.native
  object ClientInviteFriendResponse extends TopLevel[ClientInviteFriendResponse with Double]
  
  @js.native
  sealed trait ClientInviteUserToClan extends EMsg
  /* 744 */ @js.native
  object ClientInviteUserToClan extends TopLevel[ClientInviteUserToClan with Double]
  
  @js.native
  sealed trait ClientIsLimitedAccount extends EMsg
  /* 5430 */ @js.native
  object ClientIsLimitedAccount extends TopLevel[ClientIsLimitedAccount with Double]
  
  @js.native
  sealed trait ClientItemAnnouncements extends EMsg
  /* 5576 */ @js.native
  object ClientItemAnnouncements extends TopLevel[ClientItemAnnouncements with Double]
  
  @js.native
  sealed trait ClientJoinChat extends EMsg
  /* 801 */ @js.native
  object ClientJoinChat extends TopLevel[ClientJoinChat with Double]
  
  @js.native
  sealed trait ClientKickPlayingSession extends EMsg
  /* 9601 */ @js.native
  object ClientKickPlayingSession extends TopLevel[ClientKickPlayingSession with Double]
  
  @js.native
  sealed trait ClientLBSFindOrCreateLB extends EMsg
  /* 5416 */ @js.native
  object ClientLBSFindOrCreateLB extends TopLevel[ClientLBSFindOrCreateLB with Double]
  
  @js.native
  sealed trait ClientLBSFindOrCreateLBResponse extends EMsg
  /* 5417 */ @js.native
  object ClientLBSFindOrCreateLBResponse extends TopLevel[ClientLBSFindOrCreateLBResponse with Double]
  
  @js.native
  sealed trait ClientLBSGetLBEntries extends EMsg
  /* 5418 */ @js.native
  object ClientLBSGetLBEntries extends TopLevel[ClientLBSGetLBEntries with Double]
  
  @js.native
  sealed trait ClientLBSGetLBEntriesResponse extends EMsg
  /* 5419 */ @js.native
  object ClientLBSGetLBEntriesResponse extends TopLevel[ClientLBSGetLBEntriesResponse with Double]
  
  @js.native
  sealed trait ClientLBSSetScore extends EMsg
  /* 5414 */ @js.native
  object ClientLBSSetScore extends TopLevel[ClientLBSSetScore with Double]
  
  @js.native
  sealed trait ClientLBSSetScoreResponse extends EMsg
  /* 5415 */ @js.native
  object ClientLBSSetScoreResponse extends TopLevel[ClientLBSSetScoreResponse with Double]
  
  @js.native
  sealed trait ClientLBSSetUGC extends EMsg
  /* 5529 */ @js.native
  object ClientLBSSetUGC extends TopLevel[ClientLBSSetUGC with Double]
  
  @js.native
  sealed trait ClientLBSSetUGCResponse extends EMsg
  /* 5530 */ @js.native
  object ClientLBSSetUGCResponse extends TopLevel[ClientLBSSetUGCResponse with Double]
  
  @js.native
  sealed trait ClientLicenseList extends EMsg
  /* 780 */ @js.native
  object ClientLicenseList extends TopLevel[ClientLicenseList with Double]
  
  @js.native
  sealed trait ClientLogOff extends EMsg
  /* 706 */ @js.native
  object ClientLogOff extends TopLevel[ClientLogOff with Double]
  
  @js.native
  sealed trait ClientLogOnResponse extends EMsg
  /* 751 */ @js.native
  object ClientLogOnResponse extends TopLevel[ClientLogOnResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientLogOnWithCredentials_Deprecated extends EMsg
  /* 803 */ @js.native
  object ClientLogOnWithCredentials_Deprecated extends TopLevel[ClientLogOnWithCredentials_Deprecated with Double]
  
   // obsolete
  @js.native
  sealed trait ClientLogOnWithHash_Deprecated extends EMsg
  /* 5465 */ @js.native
  object ClientLogOnWithHash_Deprecated extends TopLevel[ClientLogOnWithHash_Deprecated with Double]
  
   // obsolete
  @js.native
  sealed trait ClientLogOn_Deprecated extends EMsg
  /* 701 */ @js.native
  object ClientLogOn_Deprecated extends TopLevel[ClientLogOn_Deprecated with Double]
  
  @js.native
  sealed trait ClientLoggedOff extends EMsg
  /* 757 */ @js.native
  object ClientLoggedOff extends TopLevel[ClientLoggedOff with Double]
  
  @js.native
  sealed trait ClientLogon extends EMsg
  /* 5514 */ @js.native
  object ClientLogon extends TopLevel[ClientLogon with Double]
  
  @js.native
  sealed trait ClientLogonGameServer extends EMsg
  /* 5559 */ @js.native
  object ClientLogonGameServer extends TopLevel[ClientLogonGameServer with Double]
  
   // obsolete
  @js.native
  sealed trait ClientLookupKey extends EMsg
  /* 898 */ @js.native
  object ClientLookupKey extends TopLevel[ClientLookupKey with Double]
  
   // obsolete
  @js.native
  sealed trait ClientLookupKeyResponse extends EMsg
  /* 899 */ @js.native
  object ClientLookupKeyResponse extends TopLevel[ClientLookupKeyResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetDepotManifest extends EMsg
  /* 5818 */ @js.native
  object ClientMDSGetDepotManifest extends TopLevel[ClientMDSGetDepotManifest with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetDepotManifestChunk extends EMsg
  /* 5820 */ @js.native
  object ClientMDSGetDepotManifestChunk extends TopLevel[ClientMDSGetDepotManifestChunk with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetDepotManifestResponse extends EMsg
  /* 5819 */ @js.native
  object ClientMDSGetDepotManifestResponse extends TopLevel[ClientMDSGetDepotManifestResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetPrevDepotBuild extends EMsg
  /* 5842 */ @js.native
  object ClientMDSGetPrevDepotBuild extends TopLevel[ClientMDSGetPrevDepotBuild with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetPrevDepotBuildResponse extends EMsg
  /* 5843 */ @js.native
  object ClientMDSGetPrevDepotBuildResponse extends TopLevel[ClientMDSGetPrevDepotBuildResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSHeartbeat extends EMsg
  /* 5806 */ @js.native
  object ClientMDSHeartbeat extends TopLevel[ClientMDSHeartbeat with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSInitDepotBuildRequest extends EMsg
  /* 5809 */ @js.native
  object ClientMDSInitDepotBuildRequest extends TopLevel[ClientMDSInitDepotBuildRequest with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSInitDepotBuildResponse extends EMsg
  /* 5810 */ @js.native
  object ClientMDSInitDepotBuildResponse extends TopLevel[ClientMDSInitDepotBuildResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSInitWorkshopBuildRequest extends EMsg
  /* 5816 */ @js.native
  object ClientMDSInitWorkshopBuildRequest extends TopLevel[ClientMDSInitWorkshopBuildRequest with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSInitWorkshopBuildResponse extends EMsg
  /* 5817 */ @js.native
  object ClientMDSInitWorkshopBuildResponse extends TopLevel[ClientMDSInitWorkshopBuildResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSLoginRequest extends EMsg
  /* 5801 */ @js.native
  object ClientMDSLoginRequest extends TopLevel[ClientMDSLoginRequest with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSLoginResponse extends EMsg
  /* 5802 */ @js.native
  object ClientMDSLoginResponse extends TopLevel[ClientMDSLoginResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSRegisterAppBuild extends EMsg
  /* 5838 */ @js.native
  object ClientMDSRegisterAppBuild extends TopLevel[ClientMDSRegisterAppBuild with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSRegisterAppBuildResponse extends EMsg
  /* 5839 */ @js.native
  object ClientMDSRegisterAppBuildResponse extends TopLevel[ClientMDSRegisterAppBuildResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSSetAppBuildLive extends EMsg
  /* 5840 */ @js.native
  object ClientMDSSetAppBuildLive extends TopLevel[ClientMDSSetAppBuildLive with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSSetAppBuildLiveResponse extends EMsg
  /* 5841 */ @js.native
  object ClientMDSSetAppBuildLiveResponse extends TopLevel[ClientMDSSetAppBuildLiveResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSSignInstallScript extends EMsg
  /* 5845 */ @js.native
  object ClientMDSSignInstallScript extends TopLevel[ClientMDSSignInstallScript with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSSignInstallScriptResponse extends EMsg
  /* 5846 */ @js.native
  object ClientMDSSignInstallScriptResponse extends TopLevel[ClientMDSSignInstallScriptResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSTransmitManifestDataChunk extends EMsg
  /* 5805 */ @js.native
  object ClientMDSTransmitManifestDataChunk extends TopLevel[ClientMDSTransmitManifestDataChunk with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadDepotChunks extends EMsg
  /* 5807 */ @js.native
  object ClientMDSUploadDepotChunks extends TopLevel[ClientMDSUploadDepotChunks with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadDepotChunksResponse extends EMsg
  /* 5808 */ @js.native
  object ClientMDSUploadDepotChunksResponse extends TopLevel[ClientMDSUploadDepotChunksResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadManifestRequest extends EMsg
  /* 5803 */ @js.native
  object ClientMDSUploadManifestRequest extends TopLevel[ClientMDSUploadManifestRequest with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadManifestResponse extends EMsg
  /* 5804 */ @js.native
  object ClientMDSUploadManifestResponse extends TopLevel[ClientMDSUploadManifestResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadRateTest extends EMsg
  /* 5823 */ @js.native
  object ClientMDSUploadRateTest extends TopLevel[ClientMDSUploadRateTest with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadRateTestResponse extends EMsg
  /* 5824 */ @js.native
  object ClientMDSUploadRateTestResponse extends TopLevel[ClientMDSUploadRateTestResponse with Double]
  
  @js.native
  sealed trait ClientMMSCreateLobby extends EMsg
  /* 6601 */ @js.native
  object ClientMMSCreateLobby extends TopLevel[ClientMMSCreateLobby with Double]
  
  @js.native
  sealed trait ClientMMSCreateLobbyResponse extends EMsg
  /* 6602 */ @js.native
  object ClientMMSCreateLobbyResponse extends TopLevel[ClientMMSCreateLobbyResponse with Double]
  
  @js.native
  sealed trait ClientMMSFlushFrenemyListCache extends EMsg
  /* 6622 */ @js.native
  object ClientMMSFlushFrenemyListCache extends TopLevel[ClientMMSFlushFrenemyListCache with Double]
  
  @js.native
  sealed trait ClientMMSFlushFrenemyListCacheResponse extends EMsg
  /* 6623 */ @js.native
  object ClientMMSFlushFrenemyListCacheResponse extends TopLevel[ClientMMSFlushFrenemyListCacheResponse with Double]
  
  @js.native
  sealed trait ClientMMSGetLobbyData extends EMsg
  /* 6611 */ @js.native
  object ClientMMSGetLobbyData extends TopLevel[ClientMMSGetLobbyData with Double]
  
  @js.native
  sealed trait ClientMMSGetLobbyList extends EMsg
  /* 6607 */ @js.native
  object ClientMMSGetLobbyList extends TopLevel[ClientMMSGetLobbyList with Double]
  
  @js.native
  sealed trait ClientMMSGetLobbyListResponse extends EMsg
  /* 6608 */ @js.native
  object ClientMMSGetLobbyListResponse extends TopLevel[ClientMMSGetLobbyListResponse with Double]
  
  @js.native
  sealed trait ClientMMSInviteToLobby extends EMsg
  /* 6621 */ @js.native
  object ClientMMSInviteToLobby extends TopLevel[ClientMMSInviteToLobby with Double]
  
  @js.native
  sealed trait ClientMMSJoinLobby extends EMsg
  /* 6603 */ @js.native
  object ClientMMSJoinLobby extends TopLevel[ClientMMSJoinLobby with Double]
  
  @js.native
  sealed trait ClientMMSJoinLobbyResponse extends EMsg
  /* 6604 */ @js.native
  object ClientMMSJoinLobbyResponse extends TopLevel[ClientMMSJoinLobbyResponse with Double]
  
  @js.native
  sealed trait ClientMMSLeaveLobby extends EMsg
  /* 6605 */ @js.native
  object ClientMMSLeaveLobby extends TopLevel[ClientMMSLeaveLobby with Double]
  
  @js.native
  sealed trait ClientMMSLeaveLobbyResponse extends EMsg
  /* 6606 */ @js.native
  object ClientMMSLeaveLobbyResponse extends TopLevel[ClientMMSLeaveLobbyResponse with Double]
  
  @js.native
  sealed trait ClientMMSLobbyChatMsg extends EMsg
  /* 6614 */ @js.native
  object ClientMMSLobbyChatMsg extends TopLevel[ClientMMSLobbyChatMsg with Double]
  
  @js.native
  sealed trait ClientMMSLobbyData extends EMsg
  /* 6612 */ @js.native
  object ClientMMSLobbyData extends TopLevel[ClientMMSLobbyData with Double]
  
  @js.native
  sealed trait ClientMMSLobbyGameServerSet extends EMsg
  /* 6618 */ @js.native
  object ClientMMSLobbyGameServerSet extends TopLevel[ClientMMSLobbyGameServerSet with Double]
  
  @js.native
  sealed trait ClientMMSSendLobbyChatMsg extends EMsg
  /* 6613 */ @js.native
  object ClientMMSSendLobbyChatMsg extends TopLevel[ClientMMSSendLobbyChatMsg with Double]
  
  @js.native
  sealed trait ClientMMSSetLobbyData extends EMsg
  /* 6609 */ @js.native
  object ClientMMSSetLobbyData extends TopLevel[ClientMMSSetLobbyData with Double]
  
  @js.native
  sealed trait ClientMMSSetLobbyDataResponse extends EMsg
  /* 6610 */ @js.native
  object ClientMMSSetLobbyDataResponse extends TopLevel[ClientMMSSetLobbyDataResponse with Double]
  
  @js.native
  sealed trait ClientMMSSetLobbyGameServer extends EMsg
  /* 6617 */ @js.native
  object ClientMMSSetLobbyGameServer extends TopLevel[ClientMMSSetLobbyGameServer with Double]
  
  @js.native
  sealed trait ClientMMSSetLobbyLinked extends EMsg
  /* 6624 */ @js.native
  object ClientMMSSetLobbyLinked extends TopLevel[ClientMMSSetLobbyLinked with Double]
  
  @js.native
  sealed trait ClientMMSSetLobbyOwner extends EMsg
  /* 6615 */ @js.native
  object ClientMMSSetLobbyOwner extends TopLevel[ClientMMSSetLobbyOwner with Double]
  
  @js.native
  sealed trait ClientMMSSetLobbyOwnerResponse extends EMsg
  /* 6616 */ @js.native
  object ClientMMSSetLobbyOwnerResponse extends TopLevel[ClientMMSSetLobbyOwnerResponse with Double]
  
  @js.native
  sealed trait ClientMMSUserJoinedLobby extends EMsg
  /* 6619 */ @js.native
  object ClientMMSUserJoinedLobby extends TopLevel[ClientMMSUserJoinedLobby with Double]
  
  @js.native
  sealed trait ClientMMSUserLeftLobby extends EMsg
  /* 6620 */ @js.native
  object ClientMMSUserLeftLobby extends TopLevel[ClientMMSUserLeftLobby with Double]
  
   // obsolete
  @js.native
  sealed trait ClientMarketingMessageUpdate extends EMsg
  /* 5420 */ @js.native
  object ClientMarketingMessageUpdate extends TopLevel[ClientMarketingMessageUpdate with Double]
  
  @js.native
  sealed trait ClientMarketingMessageUpdate2 extends EMsg
  /* 5510 */ @js.native
  object ClientMarketingMessageUpdate2 extends TopLevel[ClientMarketingMessageUpdate2 with Double]
  
  @js.native
  sealed trait ClientMicroTxnAuthRequest extends EMsg
  /* 5504 */ @js.native
  object ClientMicroTxnAuthRequest extends TopLevel[ClientMicroTxnAuthRequest with Double]
  
  @js.native
  sealed trait ClientMicroTxnAuthorize extends EMsg
  /* 5505 */ @js.native
  object ClientMicroTxnAuthorize extends TopLevel[ClientMicroTxnAuthorize with Double]
  
  @js.native
  sealed trait ClientMicroTxnAuthorizeResponse extends EMsg
  /* 5506 */ @js.native
  object ClientMicroTxnAuthorizeResponse extends TopLevel[ClientMicroTxnAuthorizeResponse with Double]
  
  @js.native
  sealed trait ClientNOP extends EMsg
  /* 765 */ @js.native
  object ClientNOP extends TopLevel[ClientNOP with Double]
  
  @js.native
  sealed trait ClientNatTraversalStatEvent extends EMsg
  /* 839 */ @js.native
  object ClientNatTraversalStatEvent extends TopLevel[ClientNatTraversalStatEvent with Double]
  
  @js.native
  sealed trait ClientNewLoginKey extends EMsg
  /* 5463 */ @js.native
  object ClientNewLoginKey extends TopLevel[ClientNewLoginKey with Double]
  
  @js.native
  sealed trait ClientNewLoginKeyAccepted extends EMsg
  /* 5464 */ @js.native
  object ClientNewLoginKeyAccepted extends TopLevel[ClientNewLoginKeyAccepted with Double]
  
  @js.native
  sealed trait ClientNewsUpdate extends EMsg
  /* 771 */ @js.native
  object ClientNewsUpdate extends TopLevel[ClientNewsUpdate with Double]
  
  @js.native
  sealed trait ClientNoUDPConnectivity extends EMsg
  /* 707 */ @js.native
  object ClientNoUDPConnectivity extends TopLevel[ClientNoUDPConnectivity with Double]
  
   // obsolete
  @js.native
  sealed trait ClientNotLoggedOnDeprecated extends EMsg
  /* 756 */ @js.native
  object ClientNotLoggedOnDeprecated extends TopLevel[ClientNotLoggedOnDeprecated with Double]
  
  @js.native
  sealed trait ClientOGSBeginSession extends EMsg
  /* 5490 */ @js.native
  object ClientOGSBeginSession extends TopLevel[ClientOGSBeginSession with Double]
  
  @js.native
  sealed trait ClientOGSBeginSessionResponse extends EMsg
  /* 5491 */ @js.native
  object ClientOGSBeginSessionResponse extends TopLevel[ClientOGSBeginSessionResponse with Double]
  
  @js.native
  sealed trait ClientOGSEndSession extends EMsg
  /* 5492 */ @js.native
  object ClientOGSEndSession extends TopLevel[ClientOGSEndSession with Double]
  
  @js.native
  sealed trait ClientOGSEndSessionResponse extends EMsg
  /* 5493 */ @js.native
  object ClientOGSEndSessionResponse extends TopLevel[ClientOGSEndSessionResponse with Double]
  
  @js.native
  sealed trait ClientOGSGameServerPingSample extends EMsg
  /* 5581 */ @js.native
  object ClientOGSGameServerPingSample extends TopLevel[ClientOGSGameServerPingSample with Double]
  
  @js.native
  sealed trait ClientOGSReportBug extends EMsg
  /* 5557 */ @js.native
  object ClientOGSReportBug extends TopLevel[ClientOGSReportBug with Double]
  
  @js.native
  sealed trait ClientOGSReportString extends EMsg
  /* 5556 */ @js.native
  object ClientOGSReportString extends TopLevel[ClientOGSReportString with Double]
  
  @js.native
  sealed trait ClientOGSWriteRow extends EMsg
  /* 5494 */ @js.native
  object ClientOGSWriteRow extends TopLevel[ClientOGSWriteRow with Double]
  
  @js.native
  sealed trait ClientP2PConnectionFailInfo extends EMsg
  /* 5435 */ @js.native
  object ClientP2PConnectionFailInfo extends TopLevel[ClientP2PConnectionFailInfo with Double]
  
  @js.native
  sealed trait ClientP2PConnectionInfo extends EMsg
  /* 5434 */ @js.native
  object ClientP2PConnectionInfo extends TopLevel[ClientP2PConnectionInfo with Double]
  
  @js.native
  sealed trait ClientP2PIntroducerMessage extends EMsg
  /* 813 */ @js.native
  object ClientP2PIntroducerMessage extends TopLevel[ClientP2PIntroducerMessage with Double]
  
  @js.native
  sealed trait ClientPICSAccessTokenRequest extends EMsg
  /* 8905 */ @js.native
  object ClientPICSAccessTokenRequest extends TopLevel[ClientPICSAccessTokenRequest with Double]
  
  @js.native
  sealed trait ClientPICSAccessTokenResponse extends EMsg
  /* 8906 */ @js.native
  object ClientPICSAccessTokenResponse extends TopLevel[ClientPICSAccessTokenResponse with Double]
  
  @js.native
  sealed trait ClientPICSChangesSinceRequest extends EMsg
  /* 8901 */ @js.native
  object ClientPICSChangesSinceRequest extends TopLevel[ClientPICSChangesSinceRequest with Double]
  
  @js.native
  sealed trait ClientPICSChangesSinceResponse extends EMsg
  /* 8902 */ @js.native
  object ClientPICSChangesSinceResponse extends TopLevel[ClientPICSChangesSinceResponse with Double]
  
  @js.native
  sealed trait ClientPICSProductInfoRequest extends EMsg
  /* 8903 */ @js.native
  object ClientPICSProductInfoRequest extends TopLevel[ClientPICSProductInfoRequest with Double]
  
  @js.native
  sealed trait ClientPICSProductInfoResponse extends EMsg
  /* 8904 */ @js.native
  object ClientPICSProductInfoResponse extends TopLevel[ClientPICSProductInfoResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientPackageInfoRequest extends EMsg
  /* 833 */ @js.native
  object ClientPackageInfoRequest extends TopLevel[ClientPackageInfoRequest with Double]
  
   // obsolete
  @js.native
  sealed trait ClientPackageInfoResponse extends EMsg
  /* 834 */ @js.native
  object ClientPackageInfoResponse extends TopLevel[ClientPackageInfoResponse with Double]
  
  @js.native
  sealed trait ClientPackageVersions extends EMsg
  /* 148 */ @js.native
  object ClientPackageVersions extends TopLevel[ClientPackageVersions with Double]
  
  @js.native
  sealed trait ClientPasswordChange3 extends EMsg
  /* 5457 */ @js.native
  object ClientPasswordChange3 extends TopLevel[ClientPasswordChange3 with Double]
  
  @js.native
  sealed trait ClientPasswordChangeResponse extends EMsg
  /* 805 */ @js.native
  object ClientPasswordChangeResponse extends TopLevel[ClientPasswordChangeResponse with Double]
  
  @js.native
  sealed trait ClientPersonaChangeResponse extends EMsg
  /* 5584 */ @js.native
  object ClientPersonaChangeResponse extends TopLevel[ClientPersonaChangeResponse with Double]
  
  @js.native
  sealed trait ClientPersonaState extends EMsg
  /* 766 */ @js.native
  object ClientPersonaState extends TopLevel[ClientPersonaState with Double]
  
  @js.native
  sealed trait ClientPersonalQAChange3 extends EMsg
  /* 5459 */ @js.native
  object ClientPersonalQAChange3 extends TopLevel[ClientPersonalQAChange3 with Double]
  
  @js.native
  sealed trait ClientPing extends EMsg
  /* 764 */ @js.native
  object ClientPing extends TopLevel[ClientPing with Double]
  
  @js.native
  sealed trait ClientPingResponse extends EMsg
  /* 712 */ @js.native
  object ClientPingResponse extends TopLevel[ClientPingResponse with Double]
  
  @js.native
  sealed trait ClientPlayerNicknameList extends EMsg
  /* 5587 */ @js.native
  object ClientPlayerNicknameList extends TopLevel[ClientPlayerNicknameList with Double]
  
  @js.native
  sealed trait ClientPlayingSessionState extends EMsg
  /* 9600 */ @js.native
  object ClientPlayingSessionState extends TopLevel[ClientPlayingSessionState with Double]
  
  @js.native
  sealed trait ClientPurchaseResponse extends EMsg
  /* 763 */ @js.native
  object ClientPurchaseResponse extends TopLevel[ClientPurchaseResponse with Double]
  
  @js.native
  sealed trait ClientPurchaseWithMachineID extends EMsg
  /* 746 */ @js.native
  object ClientPurchaseWithMachineID extends TopLevel[ClientPurchaseWithMachineID with Double]
  
  @js.native
  sealed trait ClientReadMachineAuth extends EMsg
  /* 5539 */ @js.native
  object ClientReadMachineAuth extends TopLevel[ClientReadMachineAuth with Double]
  
  @js.native
  sealed trait ClientReadMachineAuthResponse extends EMsg
  /* 5540 */ @js.native
  object ClientReadMachineAuthResponse extends TopLevel[ClientReadMachineAuthResponse with Double]
  
  @js.native
  sealed trait ClientRedeemGuestPass extends EMsg
  /* 741 */ @js.native
  object ClientRedeemGuestPass extends TopLevel[ClientRedeemGuestPass with Double]
  
  @js.native
  sealed trait ClientRedeemGuestPassResponse extends EMsg
  /* 797 */ @js.native
  object ClientRedeemGuestPassResponse extends TopLevel[ClientRedeemGuestPassResponse with Double]
  
  @js.native
  sealed trait ClientRegisterAuthTicketWithCM extends EMsg
  /* 5502 */ @js.native
  object ClientRegisterAuthTicketWithCM extends TopLevel[ClientRegisterAuthTicketWithCM with Double]
  
  @js.native
  sealed trait ClientRegisterKey extends EMsg
  /* 743 */ @js.native
  object ClientRegisterKey extends TopLevel[ClientRegisterKey with Double]
  
  @js.native
  sealed trait ClientRegisterOEMMachine extends EMsg
  /* 5469 */ @js.native
  object ClientRegisterOEMMachine extends TopLevel[ClientRegisterOEMMachine with Double]
  
  @js.native
  sealed trait ClientRegisterOEMMachineResponse extends EMsg
  /* 5470 */ @js.native
  object ClientRegisterOEMMachineResponse extends TopLevel[ClientRegisterOEMMachineResponse with Double]
  
  @js.native
  sealed trait ClientRemoveFriend extends EMsg
  /* 714 */ @js.native
  object ClientRemoveFriend extends TopLevel[ClientRemoveFriend with Double]
  
  @js.native
  sealed trait ClientReportOverlayDetourFailure extends EMsg
  /* 5517 */ @js.native
  object ClientReportOverlayDetourFailure extends TopLevel[ClientReportOverlayDetourFailure with Double]
  
  @js.native
  sealed trait ClientRequestAccountData extends EMsg
  /* 5549 */ @js.native
  object ClientRequestAccountData extends TopLevel[ClientRequestAccountData with Double]
  
  @js.native
  sealed trait ClientRequestAccountDataResponse extends EMsg
  /* 5550 */ @js.native
  object ClientRequestAccountDataResponse extends TopLevel[ClientRequestAccountDataResponse with Double]
  
  @js.native
  sealed trait ClientRequestAuthList extends EMsg
  /* 5431 */ @js.native
  object ClientRequestAuthList extends TopLevel[ClientRequestAuthList with Double]
  
  @js.native
  sealed trait ClientRequestChangeMail extends EMsg
  /* 5454 */ @js.native
  object ClientRequestChangeMail extends TopLevel[ClientRequestChangeMail with Double]
  
  @js.native
  sealed trait ClientRequestChangeMailResponse extends EMsg
  /* 5455 */ @js.native
  object ClientRequestChangeMailResponse extends TopLevel[ClientRequestChangeMailResponse with Double]
  
  @js.native
  sealed trait ClientRequestCommentNotifications extends EMsg
  /* 5583 */ @js.native
  object ClientRequestCommentNotifications extends TopLevel[ClientRequestCommentNotifications with Double]
  
  @js.native
  sealed trait ClientRequestEncryptedAppTicket extends EMsg
  /* 5526 */ @js.native
  object ClientRequestEncryptedAppTicket extends TopLevel[ClientRequestEncryptedAppTicket with Double]
  
  @js.native
  sealed trait ClientRequestEncryptedAppTicketResponse extends EMsg
  /* 5527 */ @js.native
  object ClientRequestEncryptedAppTicketResponse extends TopLevel[ClientRequestEncryptedAppTicketResponse with Double]
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmail extends EMsg
  /* 5401 */ @js.native
  object ClientRequestForgottenPasswordEmail extends TopLevel[ClientRequestForgottenPasswordEmail with Double]
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmail3 extends EMsg
  /* 5461 */ @js.native
  object ClientRequestForgottenPasswordEmail3 extends TopLevel[ClientRequestForgottenPasswordEmail3 with Double]
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmailResponse extends EMsg
  /* 5402 */ @js.native
  object ClientRequestForgottenPasswordEmailResponse extends TopLevel[ClientRequestForgottenPasswordEmailResponse with Double]
  
  @js.native
  sealed trait ClientRequestFreeLicense extends EMsg
  /* 5572 */ @js.native
  object ClientRequestFreeLicense extends TopLevel[ClientRequestFreeLicense with Double]
  
  @js.native
  sealed trait ClientRequestFreeLicenseResponse extends EMsg
  /* 5573 */ @js.native
  object ClientRequestFreeLicenseResponse extends TopLevel[ClientRequestFreeLicenseResponse with Double]
  
  @js.native
  sealed trait ClientRequestFriendData extends EMsg
  /* 815 */ @js.native
  object ClientRequestFriendData extends TopLevel[ClientRequestFriendData with Double]
  
  @js.native
  sealed trait ClientRequestFriendship extends EMsg
  /* 554 */ @js.native
  object ClientRequestFriendship extends TopLevel[ClientRequestFriendship with Double]
  
  @js.native
  sealed trait ClientRequestItemAnnouncements extends EMsg
  /* 5577 */ @js.native
  object ClientRequestItemAnnouncements extends TopLevel[ClientRequestItemAnnouncements with Double]
  
  @js.native
  sealed trait ClientRequestMachineAuth extends EMsg
  /* 5541 */ @js.native
  object ClientRequestMachineAuth extends TopLevel[ClientRequestMachineAuth with Double]
  
  @js.native
  sealed trait ClientRequestMachineAuthResponse extends EMsg
  /* 5542 */ @js.native
  object ClientRequestMachineAuthResponse extends TopLevel[ClientRequestMachineAuthResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientRequestOAuthTokenForApp extends EMsg
  /* 5590 */ @js.native
  object ClientRequestOAuthTokenForApp extends TopLevel[ClientRequestOAuthTokenForApp with Double]
  
   // obsolete
  @js.native
  sealed trait ClientRequestOAuthTokenForAppResponse extends EMsg
  /* 5591 */ @js.native
  object ClientRequestOAuthTokenForAppResponse extends TopLevel[ClientRequestOAuthTokenForAppResponse with Double]
  
  @js.native
  sealed trait ClientRequestValidationMail extends EMsg
  /* 5448 */ @js.native
  object ClientRequestValidationMail extends TopLevel[ClientRequestValidationMail with Double]
  
  @js.native
  sealed trait ClientRequestValidationMailResponse extends EMsg
  /* 5449 */ @js.native
  object ClientRequestValidationMailResponse extends TopLevel[ClientRequestValidationMailResponse with Double]
  
  @js.native
  sealed trait ClientRequestWebAPIAuthenticateUserNonce extends EMsg
  /* 5585 */ @js.native
  object ClientRequestWebAPIAuthenticateUserNonce extends TopLevel[ClientRequestWebAPIAuthenticateUserNonce with Double]
  
  @js.native
  sealed trait ClientRequestWebAPIAuthenticateUserNonceResponse extends EMsg
  /* 5586 */ @js.native
  object ClientRequestWebAPIAuthenticateUserNonceResponse extends TopLevel[ClientRequestWebAPIAuthenticateUserNonceResponse with Double]
  
  @js.native
  sealed trait ClientRequestedClientStats extends EMsg
  /* 5480 */ @js.native
  object ClientRequestedClientStats extends TopLevel[ClientRequestedClientStats with Double]
  
  @js.native
  sealed trait ClientResetForgottenPassword extends EMsg
  /* 5404 */ @js.native
  object ClientResetForgottenPassword extends TopLevel[ClientResetForgottenPassword with Double]
  
  @js.native
  sealed trait ClientResetForgottenPassword3 extends EMsg
  /* 5460 */ @js.native
  object ClientResetForgottenPassword3 extends TopLevel[ClientResetForgottenPassword3 with Double]
  
  @js.native
  sealed trait ClientResetForgottenPassword4 extends EMsg
  /* 5551 */ @js.native
  object ClientResetForgottenPassword4 extends TopLevel[ClientResetForgottenPassword4 with Double]
  
  @js.native
  sealed trait ClientResetForgottenPasswordResponse extends EMsg
  /* 5405 */ @js.native
  object ClientResetForgottenPasswordResponse extends TopLevel[ClientResetForgottenPasswordResponse with Double]
  
  @js.native
  sealed trait ClientResetPassword extends EMsg
  /* 846 */ @js.native
  object ClientResetPassword extends TopLevel[ClientResetPassword with Double]
  
  @js.native
  sealed trait ClientResetPasswordResponse extends EMsg
  /* 849 */ @js.native
  object ClientResetPasswordResponse extends TopLevel[ClientResetPasswordResponse with Double]
  
  @js.native
  sealed trait ClientRichPresenceInfo extends EMsg
  /* 7503 */ @js.native
  object ClientRichPresenceInfo extends TopLevel[ClientRichPresenceInfo with Double]
  
  @js.native
  sealed trait ClientRichPresenceRequest extends EMsg
  /* 7502 */ @js.native
  object ClientRichPresenceRequest extends TopLevel[ClientRichPresenceRequest with Double]
  
  @js.native
  sealed trait ClientRichPresenceUpload extends EMsg
  /* 7501 */ @js.native
  object ClientRichPresenceUpload extends TopLevel[ClientRichPresenceUpload with Double]
  
  @js.native
  sealed trait ClientScreenshotsChanged extends EMsg
  /* 5543 */ @js.native
  object ClientScreenshotsChanged extends TopLevel[ClientScreenshotsChanged with Double]
  
  @js.native
  sealed trait ClientSecretQAChangeResponse extends EMsg
  /* 892 */ @js.native
  object ClientSecretQAChangeResponse extends TopLevel[ClientSecretQAChangeResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientSendGuestPass extends EMsg
  /* 739 */ @js.native
  object ClientSendGuestPass extends TopLevel[ClientSendGuestPass with Double]
  
   // obsolete
  @js.native
  sealed trait ClientSendGuestPassResponse extends EMsg
  /* 795 */ @js.native
  object ClientSendGuestPassResponse extends TopLevel[ClientSendGuestPassResponse with Double]
  
  @js.native
  sealed trait ClientSentLogs extends EMsg
  /* 5558 */ @js.native
  object ClientSentLogs extends TopLevel[ClientSentLogs with Double]
  
  @js.native
  sealed trait ClientServerList extends EMsg
  /* 880 */ @js.native
  object ClientServerList extends TopLevel[ClientServerList with Double]
  
  @js.native
  sealed trait ClientServerUnavailable extends EMsg
  /* 5500 */ @js.native
  object ClientServerUnavailable extends TopLevel[ClientServerUnavailable with Double]
  
  @js.native
  sealed trait ClientServersAvailable extends EMsg
  /* 5501 */ @js.native
  object ClientServersAvailable extends TopLevel[ClientServersAvailable with Double]
  
  @js.native
  sealed trait ClientServiceCall extends EMsg
  /* 831 */ @js.native
  object ClientServiceCall extends TopLevel[ClientServiceCall with Double]
  
  @js.native
  sealed trait ClientServiceCallResponse extends EMsg
  /* 832 */ @js.native
  object ClientServiceCallResponse extends TopLevel[ClientServiceCallResponse with Double]
  
  @js.native
  sealed trait ClientServiceMethod extends EMsg
  /* 5594 */ @js.native
  object ClientServiceMethod extends TopLevel[ClientServiceMethod with Double]
  
  @js.native
  sealed trait ClientServiceMethodResponse extends EMsg
  /* 5595 */ @js.native
  object ClientServiceMethodResponse extends TopLevel[ClientServiceMethodResponse with Double]
  
  @js.native
  sealed trait ClientServiceModule extends EMsg
  /* 830 */ @js.native
  object ClientServiceModule extends TopLevel[ClientServiceModule with Double]
  
  @js.native
  sealed trait ClientSessionEnd extends EMsg
  /* 136 */ @js.native
  object ClientSessionEnd extends TopLevel[ClientSessionEnd with Double]
  
  @js.native
  sealed trait ClientSessionStart extends EMsg
  /* 135 */ @js.native
  object ClientSessionStart extends TopLevel[ClientSessionStart with Double]
  
  @js.native
  sealed trait ClientSessionToken extends EMsg
  /* 850 */ @js.native
  object ClientSessionToken extends TopLevel[ClientSessionToken with Double]
  
  @js.native
  sealed trait ClientSessionUpdate extends EMsg
  /* 137 */ @js.native
  object ClientSessionUpdate extends TopLevel[ClientSessionUpdate with Double]
  
   // obsolete "renamed to ClientSessionUpdate"
  @js.native
  sealed trait ClientSessionUpdateAuthTicket extends EMsg
  /* 137 */ @js.native
  object ClientSessionUpdateAuthTicket extends TopLevel[ClientSessionUpdateAuthTicket with Double]
  
  @js.native
  sealed trait ClientSetClientAppUpdateState extends EMsg
  /* 5524 */ @js.native
  object ClientSetClientAppUpdateState extends TopLevel[ClientSetClientAppUpdateState with Double]
  
  @js.native
  sealed trait ClientSetClientAppUpdateStateResponse extends EMsg
  /* 5525 */ @js.native
  object ClientSetClientAppUpdateStateResponse extends TopLevel[ClientSetClientAppUpdateStateResponse with Double]
  
  @js.native
  sealed trait ClientSetHeartbeatRate extends EMsg
  /* 755 */ @js.native
  object ClientSetHeartbeatRate extends TopLevel[ClientSetHeartbeatRate with Double]
  
  @js.native
  sealed trait ClientSetIgnoreFriend extends EMsg
  /* 855 */ @js.native
  object ClientSetIgnoreFriend extends TopLevel[ClientSetIgnoreFriend with Double]
  
  @js.native
  sealed trait ClientSetIgnoreFriendResponse extends EMsg
  /* 856 */ @js.native
  object ClientSetIgnoreFriendResponse extends TopLevel[ClientSetIgnoreFriendResponse with Double]
  
   // obsolete "renamed to SLCBase"
  @js.native
  sealed trait ClientSharedLibraryBase extends EMsg
  /* 9400 */ @js.native
  object ClientSharedLibraryBase extends TopLevel[ClientSharedLibraryBase with Double]
  
  @js.native
  sealed trait ClientSharedLibraryLockStatus extends EMsg
  /* 9405 */ @js.native
  object ClientSharedLibraryLockStatus extends TopLevel[ClientSharedLibraryLockStatus with Double]
  
  @js.native
  sealed trait ClientSharedLibraryStopPlaying extends EMsg
  /* 9406 */ @js.native
  object ClientSharedLibraryStopPlaying extends TopLevel[ClientSharedLibraryStopPlaying with Double]
  
   // obsolete
  @js.native
  sealed trait ClientSharedLicensesLockStatus extends EMsg
  /* 9403 */ @js.native
  object ClientSharedLicensesLockStatus extends TopLevel[ClientSharedLicensesLockStatus with Double]
  
   // obsolete
  @js.native
  sealed trait ClientSharedLicensesStopPlaying extends EMsg
  /* 9404 */ @js.native
  object ClientSharedLicensesStopPlaying extends TopLevel[ClientSharedLicensesStopPlaying with Double]
  
  @js.native
  sealed trait ClientStat extends EMsg
  /* 5433 */ @js.native
  object ClientStat extends TopLevel[ClientStat with Double]
  
  @js.native
  sealed trait ClientStat2 extends EMsg
  /* 5482 */ @js.native
  object ClientStat2 extends TopLevel[ClientStat2 with Double]
  
  @js.native
  sealed trait ClientStat2Int32 extends EMsg
  /* 5481 */ @js.native
  object ClientStat2Int32 extends TopLevel[ClientStat2Int32 with Double]
  
  @js.native
  sealed trait ClientStatsUpdated extends EMsg
  /* 5467 */ @js.native
  object ClientStatsUpdated extends TopLevel[ClientStatsUpdated with Double]
  
  @js.native
  sealed trait ClientSteamUsageEvent extends EMsg
  /* 842 */ @js.native
  object ClientSteamUsageEvent extends TopLevel[ClientSteamUsageEvent with Double]
  
  @js.native
  sealed trait ClientStoreUserStats extends EMsg
  /* 820 */ @js.native
  object ClientStoreUserStats extends TopLevel[ClientStoreUserStats with Double]
  
  @js.native
  sealed trait ClientStoreUserStats2 extends EMsg
  /* 5466 */ @js.native
  object ClientStoreUserStats2 extends TopLevel[ClientStoreUserStats2 with Double]
  
  @js.native
  sealed trait ClientStoreUserStatsResponse extends EMsg
  /* 821 */ @js.native
  object ClientStoreUserStatsResponse extends TopLevel[ClientStoreUserStatsResponse with Double]
  
  @js.native
  sealed trait ClientSubscribeToPersonaFeed extends EMsg
  /* 5512 */ @js.native
  object ClientSubscribeToPersonaFeed extends TopLevel[ClientSubscribeToPersonaFeed with Double]
  
  @js.native
  sealed trait ClientSystemIM extends EMsg
  /* 726 */ @js.native
  object ClientSystemIM extends TopLevel[ClientSystemIM with Double]
  
  @js.native
  sealed trait ClientSystemIMAck extends EMsg
  /* 727 */ @js.native
  object ClientSystemIMAck extends TopLevel[ClientSystemIMAck with Double]
  
  @js.native
  sealed trait ClientTicketAuthComplete extends EMsg
  /* 5429 */ @js.native
  object ClientTicketAuthComplete extends TopLevel[ClientTicketAuthComplete with Double]
  
  @js.native
  sealed trait ClientToGC extends EMsg
  /* 5452 */ @js.native
  object ClientToGC extends TopLevel[ClientToGC with Double]
  
  @js.native
  sealed trait ClientUCMAddScreenshot extends EMsg
  /* 7301 */ @js.native
  object ClientUCMAddScreenshot extends TopLevel[ClientUCMAddScreenshot with Double]
  
  @js.native
  sealed trait ClientUCMAddScreenshotResponse extends EMsg
  /* 7302 */ @js.native
  object ClientUCMAddScreenshotResponse extends TopLevel[ClientUCMAddScreenshotResponse with Double]
  
  @js.native
  sealed trait ClientUCMDeletePublishedFile extends EMsg
  /* 7315 */ @js.native
  object ClientUCMDeletePublishedFile extends TopLevel[ClientUCMDeletePublishedFile with Double]
  
  @js.native
  sealed trait ClientUCMDeletePublishedFileResponse extends EMsg
  /* 7316 */ @js.native
  object ClientUCMDeletePublishedFileResponse extends TopLevel[ClientUCMDeletePublishedFileResponse with Double]
  
  @js.native
  sealed trait ClientUCMDeleteScreenshot extends EMsg
  /* 7309 */ @js.native
  object ClientUCMDeleteScreenshot extends TopLevel[ClientUCMDeleteScreenshot with Double]
  
  @js.native
  sealed trait ClientUCMDeleteScreenshotResponse extends EMsg
  /* 7310 */ @js.native
  object ClientUCMDeleteScreenshotResponse extends TopLevel[ClientUCMDeleteScreenshotResponse with Double]
  
  @js.native
  sealed trait ClientUCMEnumeratePublishedFilesByUserAction extends EMsg
  /* 7366 */ @js.native
  object ClientUCMEnumeratePublishedFilesByUserAction extends TopLevel[ClientUCMEnumeratePublishedFilesByUserAction with Double]
  
  @js.native
  sealed trait ClientUCMEnumeratePublishedFilesByUserActionResponse extends EMsg
  /* 7367 */ @js.native
  object ClientUCMEnumeratePublishedFilesByUserActionResponse extends TopLevel[ClientUCMEnumeratePublishedFilesByUserActionResponse with Double]
  
  @js.native
  sealed trait ClientUCMEnumerateUserPublishedFiles extends EMsg
  /* 7317 */ @js.native
  object ClientUCMEnumerateUserPublishedFiles extends TopLevel[ClientUCMEnumerateUserPublishedFiles with Double]
  
  @js.native
  sealed trait ClientUCMEnumerateUserPublishedFilesResponse extends EMsg
  /* 7318 */ @js.native
  object ClientUCMEnumerateUserPublishedFilesResponse extends TopLevel[ClientUCMEnumerateUserPublishedFilesResponse with Double]
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFiles extends EMsg
  /* 7321 */ @js.native
  object ClientUCMEnumerateUserSubscribedFiles extends TopLevel[ClientUCMEnumerateUserSubscribedFiles with Double]
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesResponse extends EMsg
  /* 7322 */ @js.native
  object ClientUCMEnumerateUserSubscribedFilesResponse extends TopLevel[ClientUCMEnumerateUserSubscribedFilesResponse with Double]
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesWithUpdates extends EMsg
  /* 7378 */ @js.native
  object ClientUCMEnumerateUserSubscribedFilesWithUpdates extends TopLevel[ClientUCMEnumerateUserSubscribedFilesWithUpdates with Double]
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse extends EMsg
  /* 7379 */ @js.native
  object ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse extends TopLevel[ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientUCMGetPublishedFileDetails extends EMsg
  /* 7313 */ @js.native
  object ClientUCMGetPublishedFileDetails extends TopLevel[ClientUCMGetPublishedFileDetails with Double]
  
   // obsolete
  @js.native
  sealed trait ClientUCMGetPublishedFileDetailsResponse extends EMsg
  /* 7314 */ @js.native
  object ClientUCMGetPublishedFileDetailsResponse extends TopLevel[ClientUCMGetPublishedFileDetailsResponse with Double]
  
  @js.native
  sealed trait ClientUCMGetPublishedFilesForUser extends EMsg
  /* 7360 */ @js.native
  object ClientUCMGetPublishedFilesForUser extends TopLevel[ClientUCMGetPublishedFilesForUser with Double]
  
  @js.native
  sealed trait ClientUCMGetPublishedFilesForUserResponse extends EMsg
  /* 7361 */ @js.native
  object ClientUCMGetPublishedFilesForUserResponse extends TopLevel[ClientUCMGetPublishedFilesForUserResponse with Double]
  
  @js.native
  sealed trait ClientUCMPublishFile extends EMsg
  /* 7311 */ @js.native
  object ClientUCMPublishFile extends TopLevel[ClientUCMPublishFile with Double]
  
  @js.native
  sealed trait ClientUCMPublishFileResponse extends EMsg
  /* 7312 */ @js.native
  object ClientUCMPublishFileResponse extends TopLevel[ClientUCMPublishFileResponse with Double]
  
  @js.native
  sealed trait ClientUCMPublishedFileDeleted extends EMsg
  /* 7368 */ @js.native
  object ClientUCMPublishedFileDeleted extends TopLevel[ClientUCMPublishedFileDeleted with Double]
  
  @js.native
  sealed trait ClientUCMPublishedFileSubscribed extends EMsg
  /* 7347 */ @js.native
  object ClientUCMPublishedFileSubscribed extends TopLevel[ClientUCMPublishedFileSubscribed with Double]
  
  @js.native
  sealed trait ClientUCMPublishedFileUnsubscribed extends EMsg
  /* 7348 */ @js.native
  object ClientUCMPublishedFileUnsubscribed extends TopLevel[ClientUCMPublishedFileUnsubscribed with Double]
  
  @js.native
  sealed trait ClientUCMSetUserPublishedFileAction extends EMsg
  /* 7364 */ @js.native
  object ClientUCMSetUserPublishedFileAction extends TopLevel[ClientUCMSetUserPublishedFileAction with Double]
  
  @js.native
  sealed trait ClientUCMSetUserPublishedFileActionResponse extends EMsg
  /* 7365 */ @js.native
  object ClientUCMSetUserPublishedFileActionResponse extends TopLevel[ClientUCMSetUserPublishedFileActionResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientUCMSubscribePublishedFile extends EMsg
  /* 7319 */ @js.native
  object ClientUCMSubscribePublishedFile extends TopLevel[ClientUCMSubscribePublishedFile with Double]
  
   // obsolete
  @js.native
  sealed trait ClientUCMSubscribePublishedFileResponse extends EMsg
  /* 7320 */ @js.native
  object ClientUCMSubscribePublishedFileResponse extends TopLevel[ClientUCMSubscribePublishedFileResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientUCMUnsubscribePublishedFile extends EMsg
  /* 7323 */ @js.native
  object ClientUCMUnsubscribePublishedFile extends TopLevel[ClientUCMUnsubscribePublishedFile with Double]
  
   // obsolete
  @js.native
  sealed trait ClientUCMUnsubscribePublishedFileResponse extends EMsg
  /* 7324 */ @js.native
  object ClientUCMUnsubscribePublishedFileResponse extends TopLevel[ClientUCMUnsubscribePublishedFileResponse with Double]
  
  @js.native
  sealed trait ClientUCMUpdatePublishedFile extends EMsg
  /* 7325 */ @js.native
  object ClientUCMUpdatePublishedFile extends TopLevel[ClientUCMUpdatePublishedFile with Double]
  
  @js.native
  sealed trait ClientUCMUpdatePublishedFileResponse extends EMsg
  /* 7326 */ @js.native
  object ClientUCMUpdatePublishedFileResponse extends TopLevel[ClientUCMUpdatePublishedFileResponse with Double]
  
  @js.native
  sealed trait ClientUDSInviteToGame extends EMsg
  /* 7005 */ @js.native
  object ClientUDSInviteToGame extends TopLevel[ClientUDSInviteToGame with Double]
  
  @js.native
  sealed trait ClientUDSP2PSessionEnded extends EMsg
  /* 7002 */ @js.native
  object ClientUDSP2PSessionEnded extends TopLevel[ClientUDSP2PSessionEnded with Double]
  
  @js.native
  sealed trait ClientUDSP2PSessionStarted extends EMsg
  /* 7001 */ @js.native
  object ClientUDSP2PSessionStarted extends TopLevel[ClientUDSP2PSessionStarted with Double]
  
  @js.native
  sealed trait ClientUFSDeleteFileRequest extends EMsg
  /* 5219 */ @js.native
  object ClientUFSDeleteFileRequest extends TopLevel[ClientUFSDeleteFileRequest with Double]
  
  @js.native
  sealed trait ClientUFSDeleteFileResponse extends EMsg
  /* 5220 */ @js.native
  object ClientUFSDeleteFileResponse extends TopLevel[ClientUFSDeleteFileResponse with Double]
  
  @js.native
  sealed trait ClientUFSDownloadChunk extends EMsg
  /* 5212 */ @js.native
  object ClientUFSDownloadChunk extends TopLevel[ClientUFSDownloadChunk with Double]
  
  @js.native
  sealed trait ClientUFSDownloadRequest extends EMsg
  /* 5210 */ @js.native
  object ClientUFSDownloadRequest extends TopLevel[ClientUFSDownloadRequest with Double]
  
  @js.native
  sealed trait ClientUFSDownloadResponse extends EMsg
  /* 5211 */ @js.native
  object ClientUFSDownloadResponse extends TopLevel[ClientUFSDownloadResponse with Double]
  
  @js.native
  sealed trait ClientUFSGetFileListForApp extends EMsg
  /* 5206 */ @js.native
  object ClientUFSGetFileListForApp extends TopLevel[ClientUFSGetFileListForApp with Double]
  
  @js.native
  sealed trait ClientUFSGetFileListForAppResponse extends EMsg
  /* 5207 */ @js.native
  object ClientUFSGetFileListForAppResponse extends TopLevel[ClientUFSGetFileListForAppResponse with Double]
  
  @js.native
  sealed trait ClientUFSGetSingleFileInfo extends EMsg
  /* 5230 */ @js.native
  object ClientUFSGetSingleFileInfo extends TopLevel[ClientUFSGetSingleFileInfo with Double]
  
  @js.native
  sealed trait ClientUFSGetSingleFileInfoResponse extends EMsg
  /* 5231 */ @js.native
  object ClientUFSGetSingleFileInfoResponse extends TopLevel[ClientUFSGetSingleFileInfoResponse with Double]
  
  @js.native
  sealed trait ClientUFSGetUGCDetails extends EMsg
  /* 5226 */ @js.native
  object ClientUFSGetUGCDetails extends TopLevel[ClientUFSGetUGCDetails with Double]
  
  @js.native
  sealed trait ClientUFSGetUGCDetailsResponse extends EMsg
  /* 5227 */ @js.native
  object ClientUFSGetUGCDetailsResponse extends TopLevel[ClientUFSGetUGCDetailsResponse with Double]
  
  @js.native
  sealed trait ClientUFSLoginRequest extends EMsg
  /* 5213 */ @js.native
  object ClientUFSLoginRequest extends TopLevel[ClientUFSLoginRequest with Double]
  
  @js.native
  sealed trait ClientUFSLoginResponse extends EMsg
  /* 5214 */ @js.native
  object ClientUFSLoginResponse extends TopLevel[ClientUFSLoginResponse with Double]
  
  @js.native
  sealed trait ClientUFSShareFile extends EMsg
  /* 5232 */ @js.native
  object ClientUFSShareFile extends TopLevel[ClientUFSShareFile with Double]
  
  @js.native
  sealed trait ClientUFSShareFileResponse extends EMsg
  /* 5233 */ @js.native
  object ClientUFSShareFileResponse extends TopLevel[ClientUFSShareFileResponse with Double]
  
  @js.native
  sealed trait ClientUFSTransferHeartbeat extends EMsg
  /* 5216 */ @js.native
  object ClientUFSTransferHeartbeat extends TopLevel[ClientUFSTransferHeartbeat with Double]
  
  @js.native
  sealed trait ClientUFSUploadFileChunk extends EMsg
  /* 5204 */ @js.native
  object ClientUFSUploadFileChunk extends TopLevel[ClientUFSUploadFileChunk with Double]
  
  @js.native
  sealed trait ClientUFSUploadFileFinished extends EMsg
  /* 5205 */ @js.native
  object ClientUFSUploadFileFinished extends TopLevel[ClientUFSUploadFileFinished with Double]
  
  @js.native
  sealed trait ClientUFSUploadFileRequest extends EMsg
  /* 5202 */ @js.native
  object ClientUFSUploadFileRequest extends TopLevel[ClientUFSUploadFileRequest with Double]
  
  @js.native
  sealed trait ClientUFSUploadFileResponse extends EMsg
  /* 5203 */ @js.native
  object ClientUFSUploadFileResponse extends TopLevel[ClientUFSUploadFileResponse with Double]
  
  @js.native
  sealed trait ClientUGSGetGlobalStats extends EMsg
  /* 7901 */ @js.native
  object ClientUGSGetGlobalStats extends TopLevel[ClientUGSGetGlobalStats with Double]
  
  @js.native
  sealed trait ClientUGSGetGlobalStatsResponse extends EMsg
  /* 7902 */ @js.native
  object ClientUGSGetGlobalStatsResponse extends TopLevel[ClientUGSGetGlobalStatsResponse with Double]
  
  @js.native
  sealed trait ClientUninstallClientApp extends EMsg
  /* 5522 */ @js.native
  object ClientUninstallClientApp extends TopLevel[ClientUninstallClientApp with Double]
  
  @js.native
  sealed trait ClientUninstallClientAppResponse extends EMsg
  /* 5523 */ @js.native
  object ClientUninstallClientAppResponse extends TopLevel[ClientUninstallClientAppResponse with Double]
  
  @js.native
  sealed trait ClientUnlockStreaming extends EMsg
  /* 9507 */ @js.native
  object ClientUnlockStreaming extends TopLevel[ClientUnlockStreaming with Double]
  
  @js.native
  sealed trait ClientUnlockStreamingResponse extends EMsg
  /* 9508 */ @js.native
  object ClientUnlockStreamingResponse extends TopLevel[ClientUnlockStreamingResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientUpdateChatMetadata extends EMsg
  /* 811 */ @js.native
  object ClientUpdateChatMetadata extends TopLevel[ClientUpdateChatMetadata with Double]
  
  @js.native
  sealed trait ClientUpdateGuestPassesList extends EMsg
  /* 798 */ @js.native
  object ClientUpdateGuestPassesList extends TopLevel[ClientUpdateGuestPassesList with Double]
  
  @js.native
  sealed trait ClientUpdateMachineAuth extends EMsg
  /* 5537 */ @js.native
  object ClientUpdateMachineAuth extends TopLevel[ClientUpdateMachineAuth with Double]
  
  @js.native
  sealed trait ClientUpdateMachineAuthResponse extends EMsg
  /* 5538 */ @js.native
  object ClientUpdateMachineAuthResponse extends TopLevel[ClientUpdateMachineAuthResponse with Double]
  
  @js.native
  sealed trait ClientUpdateUserGameInfo extends EMsg
  /* 5411 */ @js.native
  object ClientUpdateUserGameInfo extends TopLevel[ClientUpdateUserGameInfo with Double]
  
  @js.native
  sealed trait ClientUseLocalDeviceAuthorizations extends EMsg
  /* 6505 */ @js.native
  object ClientUseLocalDeviceAuthorizations extends TopLevel[ClientUseLocalDeviceAuthorizations with Double]
  
  @js.native
  sealed trait ClientUserNotifications extends EMsg
  /* 5599 */ @js.native
  object ClientUserNotifications extends TopLevel[ClientUserNotifications with Double]
  
  @js.native
  sealed trait ClientVACBanStatus extends EMsg
  /* 782 */ @js.native
  object ClientVACBanStatus extends TopLevel[ClientVACBanStatus with Double]
  
   // obsolete
  @js.native
  sealed trait ClientVACChallenge extends EMsg
  /* 753 */ @js.native
  object ClientVACChallenge extends TopLevel[ClientVACChallenge with Double]
  
  @js.native
  sealed trait ClientVACResponse extends EMsg
  /* 704 */ @js.native
  object ClientVACResponse extends TopLevel[ClientVACResponse with Double]
  
   // obsolete
  @js.native
  sealed trait ClientVTTCert extends EMsg
  /* 863 */ @js.native
  object ClientVTTCert extends TopLevel[ClientVTTCert with Double]
  
   // obsolete
  @js.native
  sealed trait ClientVacStatusQuery extends EMsg
  /* 770 */ @js.native
  object ClientVacStatusQuery extends TopLevel[ClientVacStatusQuery with Double]
  
  @js.native
  sealed trait ClientVacStatusResponse extends EMsg
  /* 717 */ @js.native
  object ClientVacStatusResponse extends TopLevel[ClientVacStatusResponse with Double]
  
  @js.native
  sealed trait ClientVanityURLChangedNotification extends EMsg
  /* 5598 */ @js.native
  object ClientVanityURLChangedNotification extends TopLevel[ClientVanityURLChangedNotification with Double]
  
  @js.native
  sealed trait ClientVerifyPassword extends EMsg
  /* 5483 */ @js.native
  object ClientVerifyPassword extends TopLevel[ClientVerifyPassword with Double]
  
  @js.native
  sealed trait ClientVerifyPasswordResponse extends EMsg
  /* 5484 */ @js.native
  object ClientVerifyPasswordResponse extends TopLevel[ClientVerifyPasswordResponse with Double]
  
  @js.native
  sealed trait ClientVoiceCallPreAuthorize extends EMsg
  /* 9800 */ @js.native
  object ClientVoiceCallPreAuthorize extends TopLevel[ClientVoiceCallPreAuthorize with Double]
  
  @js.native
  sealed trait ClientVoiceCallPreAuthorizeResponse extends EMsg
  /* 9801 */ @js.native
  object ClientVoiceCallPreAuthorizeResponse extends TopLevel[ClientVoiceCallPreAuthorizeResponse with Double]
  
  @js.native
  sealed trait ClientWalletInfoUpdate extends EMsg
  /* 5528 */ @js.native
  object ClientWalletInfoUpdate extends TopLevel[ClientWalletInfoUpdate with Double]
  
  @js.native
  sealed trait ClientWorkshopItemChangesRequest extends EMsg
  /* 7382 */ @js.native
  object ClientWorkshopItemChangesRequest extends TopLevel[ClientWorkshopItemChangesRequest with Double]
  
  @js.native
  sealed trait ClientWorkshopItemChangesResponse extends EMsg
  /* 7383 */ @js.native
  object ClientWorkshopItemChangesResponse extends TopLevel[ClientWorkshopItemChangesResponse with Double]
  
  @js.native
  sealed trait ClientWorkshopItemInfoRequest extends EMsg
  /* 7384 */ @js.native
  object ClientWorkshopItemInfoRequest extends TopLevel[ClientWorkshopItemInfoRequest with Double]
  
  @js.native
  sealed trait ClientWorkshopItemInfoResponse extends EMsg
  /* 7385 */ @js.native
  object ClientWorkshopItemInfoResponse extends TopLevel[ClientWorkshopItemInfoResponse with Double]
  
  @js.native
  sealed trait CommunityAddFriendNews extends EMsg
  /* 4140 */ @js.native
  object CommunityAddFriendNews extends TopLevel[CommunityAddFriendNews with Double]
  
  @js.native
  sealed trait CommunityDeleteUserNews extends EMsg
  /* 4155 */ @js.native
  object CommunityDeleteUserNews extends TopLevel[CommunityDeleteUserNews with Double]
  
  @js.native
  sealed trait CommunityGetUserFriendNews extends EMsg
  /* 4173 */ @js.native
  object CommunityGetUserFriendNews extends TopLevel[CommunityGetUserFriendNews with Double]
  
  @js.native
  sealed trait ContentDescriptionUpdate extends EMsg
  /* 227 */ @js.native
  object ContentDescriptionUpdate extends TopLevel[ContentDescriptionUpdate with Double]
  
  @js.native
  sealed trait DFSAcceptedResponse extends EMsg
  /* 5611 */ @js.native
  object DFSAcceptedResponse extends TopLevel[DFSAcceptedResponse with Double]
  
  @js.native
  sealed trait DFSConnection extends EMsg
  /* 5603 */ @js.native
  object DFSConnection extends TopLevel[DFSConnection with Double]
  
  @js.native
  sealed trait DFSConnectionReply extends EMsg
  /* 5604 */ @js.native
  object DFSConnectionReply extends TopLevel[DFSConnectionReply with Double]
  
  @js.native
  sealed trait DFSGetFile extends EMsg
  /* 5601 */ @js.native
  object DFSGetFile extends TopLevel[DFSGetFile with Double]
  
  @js.native
  sealed trait DFSGetFileFromServer extends EMsg
  /* 5610 */ @js.native
  object DFSGetFileFromServer extends TopLevel[DFSGetFileFromServer with Double]
  
  @js.native
  sealed trait DFSInstallLocalFile extends EMsg
  /* 5602 */ @js.native
  object DFSInstallLocalFile extends TopLevel[DFSInstallLocalFile with Double]
  
  @js.native
  sealed trait DFSPurgeFile extends EMsg
  /* 5608 */ @js.native
  object DFSPurgeFile extends TopLevel[DFSPurgeFile with Double]
  
  @js.native
  sealed trait DFSRecvTransmitFile extends EMsg
  /* 5613 */ @js.native
  object DFSRecvTransmitFile extends TopLevel[DFSRecvTransmitFile with Double]
  
  @js.native
  sealed trait DFSRequestPingback extends EMsg
  /* 5612 */ @js.native
  object DFSRequestPingback extends TopLevel[DFSRequestPingback with Double]
  
  @js.native
  sealed trait DFSRequestPingback2 extends EMsg
  /* 5615 */ @js.native
  object DFSRequestPingback2 extends TopLevel[DFSRequestPingback2 with Double]
  
  @js.native
  sealed trait DFSResponsePingback2 extends EMsg
  /* 5616 */ @js.native
  object DFSResponsePingback2 extends TopLevel[DFSResponsePingback2 with Double]
  
  @js.native
  sealed trait DFSRouteFile extends EMsg
  /* 5609 */ @js.native
  object DFSRouteFile extends TopLevel[DFSRouteFile with Double]
  
  @js.native
  sealed trait DFSRouteFileResponse extends EMsg
  /* 5620 */ @js.native
  object DFSRouteFileResponse extends TopLevel[DFSRouteFileResponse with Double]
  
  @js.native
  sealed trait DFSSendTransmitFile extends EMsg
  /* 5614 */ @js.native
  object DFSSendTransmitFile extends TopLevel[DFSSendTransmitFile with Double]
  
  @js.native
  sealed trait DFSStartTransfer extends EMsg
  /* 5618 */ @js.native
  object DFSStartTransfer extends TopLevel[DFSStartTransfer with Double]
  
  @js.native
  sealed trait DFSTransferComplete extends EMsg
  /* 5619 */ @js.native
  object DFSTransferComplete extends TopLevel[DFSTransferComplete with Double]
  
  @js.native
  sealed trait DPAccountCreationStats extends EMsg
  /* 1614 */ @js.native
  object DPAccountCreationStats extends TopLevel[DPAccountCreationStats with Double]
  
  @js.native
  sealed trait DPAchievementStats extends EMsg
  /* 1613 */ @js.native
  object DPAchievementStats extends TopLevel[DPAchievementStats with Double]
  
  @js.native
  sealed trait DPBlockingStats extends EMsg
  /* 1607 */ @js.native
  object DPBlockingStats extends TopLevel[DPBlockingStats with Double]
  
  @js.native
  sealed trait DPCloudStats extends EMsg
  /* 1612 */ @js.native
  object DPCloudStats extends TopLevel[DPCloudStats with Double]
  
   // obsolete
  @js.native
  sealed trait DPDownloadRateStatistics extends EMsg
  /* 1618 */ @js.native
  object DPDownloadRateStatistics extends TopLevel[DPDownloadRateStatistics with Double]
  
  @js.native
  sealed trait DPFacebookStatistics extends EMsg
  /* 1619 */ @js.native
  object DPFacebookStatistics extends TopLevel[DPFacebookStatistics with Double]
  
   // obsolete
  @js.native
  sealed trait DPGamePlayedStats extends EMsg
  /* 1602 */ @js.native
  object DPGamePlayedStats extends TopLevel[DPGamePlayedStats with Double]
  
  @js.native
  sealed trait DPGameServersPlayersStats extends EMsg
  /* 1617 */ @js.native
  object DPGameServersPlayersStats extends TopLevel[DPGameServersPlayersStats with Double]
  
  @js.native
  sealed trait DPGetPlayerCount extends EMsg
  /* 1615 */ @js.native
  object DPGetPlayerCount extends TopLevel[DPGetPlayerCount with Double]
  
  @js.native
  sealed trait DPGetPlayerCountResponse extends EMsg
  /* 1616 */ @js.native
  object DPGetPlayerCountResponse extends TopLevel[DPGetPlayerCountResponse with Double]
  
  @js.native
  sealed trait DPNatTraversalStats extends EMsg
  /* 1608 */ @js.native
  object DPNatTraversalStats extends TopLevel[DPNatTraversalStats with Double]
  
  @js.native
  sealed trait DPPartnerMicroTxns extends EMsg
  /* 1628 */ @js.native
  object DPPartnerMicroTxns extends TopLevel[DPPartnerMicroTxns with Double]
  
  @js.native
  sealed trait DPPartnerMicroTxnsResponse extends EMsg
  /* 1629 */ @js.native
  object DPPartnerMicroTxnsResponse extends TopLevel[DPPartnerMicroTxnsResponse with Double]
  
  @js.native
  sealed trait DPSetPublishingState extends EMsg
  /* 1601 */ @js.native
  object DPSetPublishingState extends TopLevel[DPSetPublishingState with Double]
  
   // obsolete
  @js.native
  sealed trait DPSteamUsageEvent extends EMsg
  /* 1609 */ @js.native
  object DPSteamUsageEvent extends TopLevel[DPSteamUsageEvent with Double]
  
  @js.native
  sealed trait DPStoreSaleStatistics extends EMsg
  /* 1624 */ @js.native
  object DPStoreSaleStatistics extends TopLevel[DPStoreSaleStatistics with Double]
  
  @js.native
  sealed trait DPStreamingUniquePlayersStat extends EMsg
  /* 1604 */ @js.native
  object DPStreamingUniquePlayersStat extends TopLevel[DPStreamingUniquePlayersStat with Double]
  
  @js.native
  sealed trait DPUniquePlayersStat extends EMsg
  /* 1603 */ @js.native
  object DPUniquePlayersStat extends TopLevel[DPUniquePlayersStat with Double]
  
  @js.native
  sealed trait DPUpdateContentEvent extends EMsg
  /* 1626 */ @js.native
  object DPUpdateContentEvent extends TopLevel[DPUpdateContentEvent with Double]
  
  @js.native
  sealed trait DPVRUniquePlayersStat extends EMsg
  /* 1631 */ @js.native
  object DPVRUniquePlayersStat extends TopLevel[DPVRUniquePlayersStat with Double]
  
  @js.native
  sealed trait DPVacBanStats extends EMsg
  /* 1606 */ @js.native
  object DPVacBanStats extends TopLevel[DPVacBanStats with Double]
  
  @js.native
  sealed trait DPVacCafeBanStats extends EMsg
  /* 1611 */ @js.native
  object DPVacCafeBanStats extends TopLevel[DPVacCafeBanStats with Double]
  
  @js.native
  sealed trait DPVacCertBanStats extends EMsg
  /* 1610 */ @js.native
  object DPVacCertBanStats extends TopLevel[DPVacCertBanStats with Double]
  
  @js.native
  sealed trait DPVacInfractionStats extends EMsg
  /* 1605 */ @js.native
  object DPVacInfractionStats extends TopLevel[DPVacInfractionStats with Double]
  
  @js.native
  sealed trait DRMAdminUpdate extends EMsg
  /* 640 */ @js.native
  object DRMAdminUpdate extends TopLevel[DRMAdminUpdate with Double]
  
  @js.native
  sealed trait DRMAdminUpdateResponse extends EMsg
  /* 641 */ @js.native
  object DRMAdminUpdateResponse extends TopLevel[DRMAdminUpdateResponse with Double]
  
  @js.native
  sealed trait DRMBuildBlobRequest extends EMsg
  /* 628 */ @js.native
  object DRMBuildBlobRequest extends TopLevel[DRMBuildBlobRequest with Double]
  
  @js.native
  sealed trait DRMBuildBlobResponse extends EMsg
  /* 629 */ @js.native
  object DRMBuildBlobResponse extends TopLevel[DRMBuildBlobResponse with Double]
  
  @js.native
  sealed trait DRMDetailsReportRequest extends EMsg
  /* 637 */ @js.native
  object DRMDetailsReportRequest extends TopLevel[DRMDetailsReportRequest with Double]
  
  @js.native
  sealed trait DRMDetailsReportResponse extends EMsg
  /* 638 */ @js.native
  object DRMDetailsReportResponse extends TopLevel[DRMDetailsReportResponse with Double]
  
  @js.native
  sealed trait DRMEmptyGuidCache extends EMsg
  /* 645 */ @js.native
  object DRMEmptyGuidCache extends TopLevel[DRMEmptyGuidCache with Double]
  
  @js.native
  sealed trait DRMEmptyGuidCacheResponse extends EMsg
  /* 646 */ @js.native
  object DRMEmptyGuidCacheResponse extends TopLevel[DRMEmptyGuidCacheResponse with Double]
  
  @js.native
  sealed trait DRMProcessFile extends EMsg
  /* 639 */ @js.native
  object DRMProcessFile extends TopLevel[DRMProcessFile with Double]
  
  @js.native
  sealed trait DRMProcessFileResponse extends EMsg
  /* 644 */ @js.native
  object DRMProcessFileResponse extends TopLevel[DRMProcessFileResponse with Double]
  
  @js.native
  sealed trait DRMRange2 extends EMsg
  /* 7600 */ @js.native
  object DRMRange2 extends TopLevel[DRMRange2 with Double]
  
  @js.native
  sealed trait DRMResolveGuidRequest extends EMsg
  /* 630 */ @js.native
  object DRMResolveGuidRequest extends TopLevel[DRMResolveGuidRequest with Double]
  
  @js.native
  sealed trait DRMResolveGuidResponse extends EMsg
  /* 631 */ @js.native
  object DRMResolveGuidResponse extends TopLevel[DRMResolveGuidResponse with Double]
  
  @js.native
  sealed trait DRMSFetchVersionSet extends EMsg
  /* 7606 */ @js.native
  object DRMSFetchVersionSet extends TopLevel[DRMSFetchVersionSet with Double]
  
  @js.native
  sealed trait DRMSFetchVersionSetResponse extends EMsg
  /* 7607 */ @js.native
  object DRMSFetchVersionSetResponse extends TopLevel[DRMSFetchVersionSetResponse with Double]
  
  @js.native
  sealed trait DRMStabilityReport extends EMsg
  /* 635 */ @js.native
  object DRMStabilityReport extends TopLevel[DRMStabilityReport with Double]
  
  @js.native
  sealed trait DRMStabilityReportResponse extends EMsg
  /* 636 */ @js.native
  object DRMStabilityReportResponse extends TopLevel[DRMStabilityReportResponse with Double]
  
  @js.native
  sealed trait DRMSync extends EMsg
  /* 642 */ @js.native
  object DRMSync extends TopLevel[DRMSync with Double]
  
  @js.native
  sealed trait DRMSyncResponse extends EMsg
  /* 643 */ @js.native
  object DRMSyncResponse extends TopLevel[DRMSyncResponse with Double]
  
  @js.native
  sealed trait DRMVariabilityReport extends EMsg
  /* 633 */ @js.native
  object DRMVariabilityReport extends TopLevel[DRMVariabilityReport with Double]
  
  @js.native
  sealed trait DRMVariabilityReportResponse extends EMsg
  /* 634 */ @js.native
  object DRMVariabilityReportResponse extends TopLevel[DRMVariabilityReportResponse with Double]
  
  @js.native
  sealed trait DRMWorkerProcess extends EMsg
  /* 9100 */ @js.native
  object DRMWorkerProcess extends TopLevel[DRMWorkerProcess with Double]
  
  @js.native
  sealed trait DRMWorkerProcessAnalyzeFileRequest extends EMsg
  /* 9128 */ @js.native
  object DRMWorkerProcessAnalyzeFileRequest extends TopLevel[DRMWorkerProcessAnalyzeFileRequest with Double]
  
  @js.native
  sealed trait DRMWorkerProcessAnalyzeFileResponse extends EMsg
  /* 9129 */ @js.native
  object DRMWorkerProcessAnalyzeFileResponse extends TopLevel[DRMWorkerProcessAnalyzeFileResponse with Double]
  
  @js.native
  sealed trait DRMWorkerProcessBackfillOriginalRequest extends EMsg
  /* 9116 */ @js.native
  object DRMWorkerProcessBackfillOriginalRequest extends TopLevel[DRMWorkerProcessBackfillOriginalRequest with Double]
  
  @js.native
  sealed trait DRMWorkerProcessBackfillOriginalResponse extends EMsg
  /* 9117 */ @js.native
  object DRMWorkerProcessBackfillOriginalResponse extends TopLevel[DRMWorkerProcessBackfillOriginalResponse with Double]
  
  @js.native
  sealed trait DRMWorkerProcessDRMAndSign extends EMsg
  /* 9100 */ @js.native
  object DRMWorkerProcessDRMAndSign extends TopLevel[DRMWorkerProcessDRMAndSign with Double]
  
  @js.native
  sealed trait DRMWorkerProcessDRMAndSignResponse extends EMsg
  /* 9101 */ @js.native
  object DRMWorkerProcessDRMAndSignResponse extends TopLevel[DRMWorkerProcessDRMAndSignResponse with Double]
  
  @js.native
  sealed trait DRMWorkerProcessDescribeSecretRequest extends EMsg
  /* 9114 */ @js.native
  object DRMWorkerProcessDescribeSecretRequest extends TopLevel[DRMWorkerProcessDescribeSecretRequest with Double]
  
  @js.native
  sealed trait DRMWorkerProcessDescribeSecretResponse extends EMsg
  /* 9115 */ @js.native
  object DRMWorkerProcessDescribeSecretResponse extends TopLevel[DRMWorkerProcessDescribeSecretResponse with Double]
  
  @js.native
  sealed trait DRMWorkerProcessEvaluateCrashRequest extends EMsg
  /* 9126 */ @js.native
  object DRMWorkerProcessEvaluateCrashRequest extends TopLevel[DRMWorkerProcessEvaluateCrashRequest with Double]
  
  @js.native
  sealed trait DRMWorkerProcessEvaluateCrashResponse extends EMsg
  /* 9127 */ @js.native
  object DRMWorkerProcessEvaluateCrashResponse extends TopLevel[DRMWorkerProcessEvaluateCrashResponse with Double]
  
  @js.native
  sealed trait DRMWorkerProcessExamineBlobRequest extends EMsg
  /* 9112 */ @js.native
  object DRMWorkerProcessExamineBlobRequest extends TopLevel[DRMWorkerProcessExamineBlobRequest with Double]
  
  @js.native
  sealed trait DRMWorkerProcessExamineBlobResponse extends EMsg
  /* 9113 */ @js.native
  object DRMWorkerProcessExamineBlobResponse extends TopLevel[DRMWorkerProcessExamineBlobResponse with Double]
  
  @js.native
  sealed trait DRMWorkerProcessGetBlobRequest extends EMsg
  /* 9124 */ @js.native
  object DRMWorkerProcessGetBlobRequest extends TopLevel[DRMWorkerProcessGetBlobRequest with Double]
  
  @js.native
  sealed trait DRMWorkerProcessGetBlobResponse extends EMsg
  /* 9125 */ @js.native
  object DRMWorkerProcessGetBlobResponse extends TopLevel[DRMWorkerProcessGetBlobResponse with Double]
  
   // obsolete
  @js.native
  sealed trait DRMWorkerProcessGetDRMGuidsFromFileRequest extends EMsg
  /* 9108 */ @js.native
  object DRMWorkerProcessGetDRMGuidsFromFileRequest extends TopLevel[DRMWorkerProcessGetDRMGuidsFromFileRequest with Double]
  
   // obsolete
  @js.native
  sealed trait DRMWorkerProcessGetDRMGuidsFromFileResponse extends EMsg
  /* 9109 */ @js.native
  object DRMWorkerProcessGetDRMGuidsFromFileResponse extends TopLevel[DRMWorkerProcessGetDRMGuidsFromFileResponse with Double]
  
  @js.native
  sealed trait DRMWorkerProcessInstallAllRequest extends EMsg
  /* 9132 */ @js.native
  object DRMWorkerProcessInstallAllRequest extends TopLevel[DRMWorkerProcessInstallAllRequest with Double]
  
  @js.native
  sealed trait DRMWorkerProcessInstallAllResponse extends EMsg
  /* 9133 */ @js.native
  object DRMWorkerProcessInstallAllResponse extends TopLevel[DRMWorkerProcessInstallAllResponse with Double]
  
  @js.native
  sealed trait DRMWorkerProcessInstallDRMDLLRequest extends EMsg
  /* 9104 */ @js.native
  object DRMWorkerProcessInstallDRMDLLRequest extends TopLevel[DRMWorkerProcessInstallDRMDLLRequest with Double]
  
  @js.native
  sealed trait DRMWorkerProcessInstallDRMDLLResponse extends EMsg
  /* 9105 */ @js.native
  object DRMWorkerProcessInstallDRMDLLResponse extends TopLevel[DRMWorkerProcessInstallDRMDLLResponse with Double]
  
  @js.native
  sealed trait DRMWorkerProcessInstallProcessedFilesRequest extends EMsg
  /* 9110 */ @js.native
  object DRMWorkerProcessInstallProcessedFilesRequest extends TopLevel[DRMWorkerProcessInstallProcessedFilesRequest with Double]
  
  @js.native
  sealed trait DRMWorkerProcessInstallProcessedFilesResponse extends EMsg
  /* 9111 */ @js.native
  object DRMWorkerProcessInstallProcessedFilesResponse extends TopLevel[DRMWorkerProcessInstallProcessedFilesResponse with Double]
  
  @js.native
  sealed trait DRMWorkerProcessSecretIdStringRequest extends EMsg
  /* 9106 */ @js.native
  object DRMWorkerProcessSecretIdStringRequest extends TopLevel[DRMWorkerProcessSecretIdStringRequest with Double]
  
  @js.native
  sealed trait DRMWorkerProcessSecretIdStringResponse extends EMsg
  /* 9107 */ @js.native
  object DRMWorkerProcessSecretIdStringResponse extends TopLevel[DRMWorkerProcessSecretIdStringResponse with Double]
  
  @js.native
  sealed trait DRMWorkerProcessSplitAndInstallRequest extends EMsg
  /* 9122 */ @js.native
  object DRMWorkerProcessSplitAndInstallRequest extends TopLevel[DRMWorkerProcessSplitAndInstallRequest with Double]
  
  @js.native
  sealed trait DRMWorkerProcessSplitAndInstallResponse extends EMsg
  /* 9123 */ @js.native
  object DRMWorkerProcessSplitAndInstallResponse extends TopLevel[DRMWorkerProcessSplitAndInstallResponse with Double]
  
  @js.native
  sealed trait DRMWorkerProcessSteamworksInfoRequest extends EMsg
  /* 9102 */ @js.native
  object DRMWorkerProcessSteamworksInfoRequest extends TopLevel[DRMWorkerProcessSteamworksInfoRequest with Double]
  
  @js.native
  sealed trait DRMWorkerProcessSteamworksInfoResponse extends EMsg
  /* 9103 */ @js.native
  object DRMWorkerProcessSteamworksInfoResponse extends TopLevel[DRMWorkerProcessSteamworksInfoResponse with Double]
  
  @js.native
  sealed trait DRMWorkerProcessUnpackBlobRequest extends EMsg
  /* 9130 */ @js.native
  object DRMWorkerProcessUnpackBlobRequest extends TopLevel[DRMWorkerProcessUnpackBlobRequest with Double]
  
  @js.native
  sealed trait DRMWorkerProcessUnpackBlobResponse extends EMsg
  /* 9131 */ @js.native
  object DRMWorkerProcessUnpackBlobResponse extends TopLevel[DRMWorkerProcessUnpackBlobResponse with Double]
  
  @js.native
  sealed trait DRMWorkerProcessValidateDRMDLLRequest extends EMsg
  /* 9118 */ @js.native
  object DRMWorkerProcessValidateDRMDLLRequest extends TopLevel[DRMWorkerProcessValidateDRMDLLRequest with Double]
  
  @js.native
  sealed trait DRMWorkerProcessValidateDRMDLLResponse extends EMsg
  /* 9119 */ @js.native
  object DRMWorkerProcessValidateDRMDLLResponse extends TopLevel[DRMWorkerProcessValidateDRMDLLResponse with Double]
  
  @js.native
  sealed trait DRMWorkerProcessValidateFileRequest extends EMsg
  /* 9120 */ @js.native
  object DRMWorkerProcessValidateFileRequest extends TopLevel[DRMWorkerProcessValidateFileRequest with Double]
  
  @js.native
  sealed trait DRMWorkerProcessValidateFileResponse extends EMsg
  /* 9121 */ @js.native
  object DRMWorkerProcessValidateFileResponse extends TopLevel[DRMWorkerProcessValidateFileResponse with Double]
  
   // obsolete
  @js.native
  sealed trait DSSCurrentFileList extends EMsg
  /* 1802 */ @js.native
  object DSSCurrentFileList extends TopLevel[DSSCurrentFileList with Double]
  
   // obsolete
  @js.native
  sealed trait DSSNewFile extends EMsg
  /* 1801 */ @js.native
  object DSSNewFile extends TopLevel[DSSNewFile with Double]
  
   // obsolete
  @js.native
  sealed trait DSSSynchList extends EMsg
  /* 1803 */ @js.native
  object DSSSynchList extends TopLevel[DSSSynchList with Double]
  
   // obsolete
  @js.native
  sealed trait DSSSynchListResponse extends EMsg
  /* 1804 */ @js.native
  object DSSSynchListResponse extends TopLevel[DSSSynchListResponse with Double]
  
   // obsolete
  @js.native
  sealed trait DSSSynchSubscribe extends EMsg
  /* 1805 */ @js.native
  object DSSSynchSubscribe extends TopLevel[DSSSynchSubscribe with Double]
  
   // obsolete
  @js.native
  sealed trait DSSSynchUnsubscribe extends EMsg
  /* 1806 */ @js.native
  object DSSSynchUnsubscribe extends TopLevel[DSSSynchUnsubscribe with Double]
  
  @js.native
  sealed trait DestJobFailed extends EMsg
  /* 113 */ @js.native
  object DestJobFailed extends TopLevel[DestJobFailed with Double]
  
  @js.native
  sealed trait DeviceAuthorizationBase extends EMsg
  /* 6500 */ @js.native
  object DeviceAuthorizationBase extends TopLevel[DeviceAuthorizationBase with Double]
  
  @js.native
  sealed trait DirRequest extends EMsg
  /* 202 */ @js.native
  object DirRequest extends TopLevel[DirRequest with Double]
  
  @js.native
  sealed trait DirResponse extends EMsg
  /* 203 */ @js.native
  object DirResponse extends TopLevel[DirResponse with Double]
  
   // obsolete
  @js.native
  sealed trait EPMRestartProcess extends EMsg
  /* 1903 */ @js.native
  object EPMRestartProcess extends TopLevel[EPMRestartProcess with Double]
  
   // obsolete
  @js.native
  sealed trait EPMStartProcess extends EMsg
  /* 1901 */ @js.native
  object EPMStartProcess extends TopLevel[EPMStartProcess with Double]
  
   // obsolete
  @js.native
  sealed trait EPMStopProcess extends EMsg
  /* 1902 */ @js.native
  object EPMStopProcess extends TopLevel[EPMStopProcess with Double]
  
  @js.native
  sealed trait EconBase extends EMsg
  /* 7700 */ @js.native
  object EconBase extends TopLevel[EconBase with Double]
  
  @js.native
  sealed trait EconCDKeyProcessTransaction extends EMsg
  /* 7711 */ @js.native
  object EconCDKeyProcessTransaction extends TopLevel[EconCDKeyProcessTransaction with Double]
  
  @js.native
  sealed trait EconCDKeyProcessTransactionResponse extends EMsg
  /* 7712 */ @js.native
  object EconCDKeyProcessTransactionResponse extends TopLevel[EconCDKeyProcessTransactionResponse with Double]
  
  @js.native
  sealed trait EconFlushInventoryCache extends EMsg
  /* 7707 */ @js.native
  object EconFlushInventoryCache extends TopLevel[EconFlushInventoryCache with Double]
  
  @js.native
  sealed trait EconFlushInventoryCacheResponse extends EMsg
  /* 7708 */ @js.native
  object EconFlushInventoryCacheResponse extends TopLevel[EconFlushInventoryCacheResponse with Double]
  
  @js.native
  sealed trait EconGetErrorLogs extends EMsg
  /* 7713 */ @js.native
  object EconGetErrorLogs extends TopLevel[EconGetErrorLogs with Double]
  
  @js.native
  sealed trait EconGetErrorLogsResponse extends EMsg
  /* 7714 */ @js.native
  object EconGetErrorLogsResponse extends TopLevel[EconGetErrorLogsResponse with Double]
  
  @js.native
  sealed trait EconTrading_CancelTradeRequest extends EMsg
  /* 7706 */ @js.native
  object EconTrading_CancelTradeRequest extends TopLevel[EconTrading_CancelTradeRequest with Double]
  
  @js.native
  sealed trait EconTrading_InitiateTradeProposed extends EMsg
  /* 7702 */ @js.native
  object EconTrading_InitiateTradeProposed extends TopLevel[EconTrading_InitiateTradeProposed with Double]
  
  @js.native
  sealed trait EconTrading_InitiateTradeRequest extends EMsg
  /* 7701 */ @js.native
  object EconTrading_InitiateTradeRequest extends TopLevel[EconTrading_InitiateTradeRequest with Double]
  
  @js.native
  sealed trait EconTrading_InitiateTradeResponse extends EMsg
  /* 7703 */ @js.native
  object EconTrading_InitiateTradeResponse extends TopLevel[EconTrading_InitiateTradeResponse with Double]
  
  @js.native
  sealed trait EconTrading_InitiateTradeResult extends EMsg
  /* 7704 */ @js.native
  object EconTrading_InitiateTradeResult extends TopLevel[EconTrading_InitiateTradeResult with Double]
  
  @js.native
  sealed trait EconTrading_StartSession extends EMsg
  /* 7705 */ @js.native
  object EconTrading_StartSession extends TopLevel[EconTrading_StartSession with Double]
  
  @js.native
  sealed trait Exit extends EMsg
  /* 201 */ @js.native
  object Exit extends TopLevel[Exit with Double]
  
  @js.native
  sealed trait ExitShell extends EMsg
  /* 308 */ @js.native
  object ExitShell extends TopLevel[ExitShell with Double]
  
  @js.native
  sealed trait ExitShells extends EMsg
  /* 307 */ @js.native
  object ExitShells extends TopLevel[ExitShells with Double]
  
  @js.native
  sealed trait FBSApplyAccountCred extends EMsg
  /* 1119 */ @js.native
  object FBSApplyAccountCred extends TopLevel[FBSApplyAccountCred with Double]
  
  @js.native
  sealed trait FBSApplyAccountCredResponse extends EMsg
  /* 1120 */ @js.native
  object FBSApplyAccountCredResponse extends TopLevel[FBSApplyAccountCredResponse with Double]
  
  @js.native
  sealed trait FBSApplyOSUpdates extends EMsg
  /* 1108 */ @js.native
  object FBSApplyOSUpdates extends TopLevel[FBSApplyOSUpdates with Double]
  
  @js.native
  sealed trait FBSBootstrapperGetPackageChunk extends EMsg
  /* 1130 */ @js.native
  object FBSBootstrapperGetPackageChunk extends TopLevel[FBSBootstrapperGetPackageChunk with Double]
  
  @js.native
  sealed trait FBSBootstrapperGetPackageChunkResponse extends EMsg
  /* 1131 */ @js.native
  object FBSBootstrapperGetPackageChunkResponse extends TopLevel[FBSBootstrapperGetPackageChunkResponse with Double]
  
  @js.native
  sealed trait FBSBootstrapperPackageRequest extends EMsg
  /* 1128 */ @js.native
  object FBSBootstrapperPackageRequest extends TopLevel[FBSBootstrapperPackageRequest with Double]
  
  @js.native
  sealed trait FBSBootstrapperPackageResponse extends EMsg
  /* 1129 */ @js.native
  object FBSBootstrapperPackageResponse extends TopLevel[FBSBootstrapperPackageResponse with Double]
  
  @js.native
  sealed trait FBSBootstrapperPackageTransferProgress extends EMsg
  /* 1132 */ @js.native
  object FBSBootstrapperPackageTransferProgress extends TopLevel[FBSBootstrapperPackageTransferProgress with Double]
  
  @js.native
  sealed trait FBSConnectionData extends EMsg
  /* 1027 */ @js.native
  object FBSConnectionData extends TopLevel[FBSConnectionData with Double]
  
  @js.native
  sealed trait FBSDeployHotFixPackage extends EMsg
  /* 1114 */ @js.native
  object FBSDeployHotFixPackage extends TopLevel[FBSDeployHotFixPackage with Double]
  
  @js.native
  sealed trait FBSDeployHotFixResponse extends EMsg
  /* 1115 */ @js.native
  object FBSDeployHotFixResponse extends TopLevel[FBSDeployHotFixResponse with Double]
  
  @js.native
  sealed trait FBSDeployPackage extends EMsg
  /* 1104 */ @js.native
  object FBSDeployPackage extends TopLevel[FBSDeployPackage with Double]
  
  @js.native
  sealed trait FBSDeployResponse extends EMsg
  /* 1105 */ @js.native
  object FBSDeployResponse extends TopLevel[FBSDeployResponse with Double]
  
  @js.native
  sealed trait FBSDownloadHotFix extends EMsg
  /* 1116 */ @js.native
  object FBSDownloadHotFix extends TopLevel[FBSDownloadHotFix with Double]
  
  @js.native
  sealed trait FBSDownloadHotFixResponse extends EMsg
  /* 1117 */ @js.native
  object FBSDownloadHotFixResponse extends TopLevel[FBSDownloadHotFixResponse with Double]
  
  @js.native
  sealed trait FBSForceBounce extends EMsg
  /* 1103 */ @js.native
  object FBSForceBounce extends TopLevel[FBSForceBounce with Double]
  
  @js.native
  sealed trait FBSForceRefresh extends EMsg
  /* 1102 */ @js.native
  object FBSForceRefresh extends TopLevel[FBSForceRefresh with Double]
  
  @js.native
  sealed trait FBSInfoFromBootstrapper extends EMsg
  /* 1126 */ @js.native
  object FBSInfoFromBootstrapper extends TopLevel[FBSInfoFromBootstrapper with Double]
  
  @js.native
  sealed trait FBSMinidumpServer extends EMsg
  /* 1112 */ @js.native
  object FBSMinidumpServer extends TopLevel[FBSMinidumpServer with Double]
  
  @js.native
  sealed trait FBSQueryGMForRequest extends EMsg
  /* 1123 */ @js.native
  object FBSQueryGMForRequest extends TopLevel[FBSQueryGMForRequest with Double]
  
  @js.native
  sealed trait FBSQueryGMResponse extends EMsg
  /* 1124 */ @js.native
  object FBSQueryGMResponse extends TopLevel[FBSQueryGMResponse with Double]
  
  @js.native
  sealed trait FBSRebootBox extends EMsg
  /* 1110 */ @js.native
  object FBSRebootBox extends TopLevel[FBSRebootBox with Double]
  
  @js.native
  sealed trait FBSRebootBoxResponse extends EMsg
  /* 1127 */ @js.native
  object FBSRebootBoxResponse extends TopLevel[FBSRebootBoxResponse with Double]
  
  @js.native
  sealed trait FBSReqVersion extends EMsg
  /* 1100 */ @js.native
  object FBSReqVersion extends TopLevel[FBSReqVersion with Double]
  
  @js.native
  sealed trait FBSRestartBootstrapper extends EMsg
  /* 1133 */ @js.native
  object FBSRestartBootstrapper extends TopLevel[FBSRestartBootstrapper with Double]
  
  @js.native
  sealed trait FBSRunCMDScript extends EMsg
  /* 1109 */ @js.native
  object FBSRunCMDScript extends TopLevel[FBSRunCMDScript with Double]
  
  @js.native
  sealed trait FBSSetBigBrotherMode extends EMsg
  /* 1111 */ @js.native
  object FBSSetBigBrotherMode extends TopLevel[FBSSetBigBrotherMode with Double]
  
  @js.native
  sealed trait FBSSetShellCount extends EMsg
  /* 1121 */ @js.native
  object FBSSetShellCount extends TopLevel[FBSSetShellCount with Double]
  
   // obsolete
  @js.native
  sealed trait FBSSetShellCount_obsolete extends EMsg
  /* 1113 */ @js.native
  object FBSSetShellCount_obsolete extends TopLevel[FBSSetShellCount_obsolete with Double]
  
  @js.native
  sealed trait FBSSetState extends EMsg
  /* 1107 */ @js.native
  object FBSSetState extends TopLevel[FBSSetState with Double]
  
  @js.native
  sealed trait FBSTerminateShell extends EMsg
  /* 1122 */ @js.native
  object FBSTerminateShell extends TopLevel[FBSTerminateShell with Double]
  
  @js.native
  sealed trait FBSTerminateZombies extends EMsg
  /* 1125 */ @js.native
  object FBSTerminateZombies extends TopLevel[FBSTerminateZombies with Double]
  
  @js.native
  sealed trait FBSUpdateBootstrapper extends EMsg
  /* 1106 */ @js.native
  object FBSUpdateBootstrapper extends TopLevel[FBSUpdateBootstrapper with Double]
  
  @js.native
  sealed trait FBSUpdateTargetConfigFile extends EMsg
  /* 1118 */ @js.native
  object FBSUpdateTargetConfigFile extends TopLevel[FBSUpdateTargetConfigFile with Double]
  
  @js.native
  sealed trait FBSVersionInfo extends EMsg
  /* 1101 */ @js.native
  object FBSVersionInfo extends TopLevel[FBSVersionInfo with Double]
  
  @js.native
  sealed trait FSAddOrRemoveFollower extends EMsg
  /* 7510 */ @js.native
  object FSAddOrRemoveFollower extends TopLevel[FSAddOrRemoveFollower with Double]
  
  @js.native
  sealed trait FSAddOrRemoveFollowerResponse extends EMsg
  /* 7511 */ @js.native
  object FSAddOrRemoveFollowerResponse extends TopLevel[FSAddOrRemoveFollowerResponse with Double]
  
  @js.native
  sealed trait FSBase extends EMsg
  /* 7500 */ @js.native
  object FSBase extends TopLevel[FSBase with Double]
  
  @js.native
  sealed trait FSCommentNotification extends EMsg
  /* 7513 */ @js.native
  object FSCommentNotification extends TopLevel[FSCommentNotification with Double]
  
  @js.native
  sealed trait FSCommentNotificationViewed extends EMsg
  /* 7514 */ @js.native
  object FSCommentNotificationViewed extends TopLevel[FSCommentNotificationViewed with Double]
  
  @js.native
  sealed trait FSComputeFrenematrix extends EMsg
  /* 7506 */ @js.native
  object FSComputeFrenematrix extends TopLevel[FSComputeFrenematrix with Double]
  
  @js.native
  sealed trait FSComputeFrenematrixResponse extends EMsg
  /* 7507 */ @js.native
  object FSComputeFrenematrixResponse extends TopLevel[FSComputeFrenematrixResponse with Double]
  
  @js.native
  sealed trait FSGetPendingNotificationCount extends EMsg
  /* 7521 */ @js.native
  object FSGetPendingNotificationCount extends TopLevel[FSGetPendingNotificationCount with Double]
  
  @js.native
  sealed trait FSGetPendingNotificationCountResponse extends EMsg
  /* 7522 */ @js.native
  object FSGetPendingNotificationCountResponse extends TopLevel[FSGetPendingNotificationCountResponse with Double]
  
  @js.native
  sealed trait FSPlayStatusNotification extends EMsg
  /* 7508 */ @js.native
  object FSPlayStatusNotification extends TopLevel[FSPlayStatusNotification with Double]
  
  @js.native
  sealed trait FSPublishPersonaStatus extends EMsg
  /* 7509 */ @js.native
  object FSPublishPersonaStatus extends TopLevel[FSPublishPersonaStatus with Double]
  
  @js.native
  sealed trait FSRequestFriendData extends EMsg
  /* 7530 */ @js.native
  object FSRequestFriendData extends TopLevel[FSRequestFriendData with Double]
  
  @js.native
  sealed trait FSRichPresenceRequest extends EMsg
  /* 7504 */ @js.native
  object FSRichPresenceRequest extends TopLevel[FSRichPresenceRequest with Double]
  
  @js.native
  sealed trait FSRichPresenceResponse extends EMsg
  /* 7505 */ @js.native
  object FSRichPresenceResponse extends TopLevel[FSRichPresenceResponse with Double]
  
  @js.native
  sealed trait FSUpdateFollowingList extends EMsg
  /* 7512 */ @js.native
  object FSUpdateFollowingList extends TopLevel[FSUpdateFollowingList with Double]
  
   // obsolete
  @js.native
  sealed trait FTSBrowseClans extends EMsg
  /* 3103 */ @js.native
  object FTSBrowseClans extends TopLevel[FTSBrowseClans with Double]
  
   // obsolete
  @js.native
  sealed trait FTSBrowseClansResponse extends EMsg
  /* 3104 */ @js.native
  object FTSBrowseClansResponse extends TopLevel[FTSBrowseClansResponse with Double]
  
   // obsolete
  @js.native
  sealed trait FTSClanDeleted extends EMsg
  /* 3109 */ @js.native
  object FTSClanDeleted extends TopLevel[FTSClanDeleted with Double]
  
   // obsolete
  @js.native
  sealed trait FTSGetBrowseCounts extends EMsg
  /* 3101 */ @js.native
  object FTSGetBrowseCounts extends TopLevel[FTSGetBrowseCounts with Double]
  
   // obsolete
  @js.native
  sealed trait FTSGetBrowseCountsResponse extends EMsg
  /* 3102 */ @js.native
  object FTSGetBrowseCountsResponse extends TopLevel[FTSGetBrowseCountsResponse with Double]
  
   // obsolete
  @js.native
  sealed trait FTSGetGSPlayStats extends EMsg
  /* 3114 */ @js.native
  object FTSGetGSPlayStats extends TopLevel[FTSGetGSPlayStats with Double]
  
   // obsolete
  @js.native
  sealed trait FTSGetGSPlayStatsForServer extends EMsg
  /* 3116 */ @js.native
  object FTSGetGSPlayStatsForServer extends TopLevel[FTSGetGSPlayStatsForServer with Double]
  
   // obsolete
  @js.native
  sealed trait FTSGetGSPlayStatsForServerResponse extends EMsg
  /* 3117 */ @js.native
  object FTSGetGSPlayStatsForServerResponse extends TopLevel[FTSGetGSPlayStatsForServerResponse with Double]
  
   // obsolete
  @js.native
  sealed trait FTSGetGSPlayStatsResponse extends EMsg
  /* 3115 */ @js.native
  object FTSGetGSPlayStatsResponse extends TopLevel[FTSGetGSPlayStatsResponse with Double]
  
   // obsolete
  @js.native
  sealed trait FTSReportIPUpdates extends EMsg
  /* 3118 */ @js.native
  object FTSReportIPUpdates extends TopLevel[FTSReportIPUpdates with Double]
  
   // obsolete
  @js.native
  sealed trait FTSSearch extends EMsg
  /* 3110 */ @js.native
  object FTSSearch extends TopLevel[FTSSearch with Double]
  
   // obsolete
  @js.native
  sealed trait FTSSearchClansByLocation extends EMsg
  /* 3105 */ @js.native
  object FTSSearchClansByLocation extends TopLevel[FTSSearchClansByLocation with Double]
  
   // obsolete
  @js.native
  sealed trait FTSSearchClansByLocationResponse extends EMsg
  /* 3106 */ @js.native
  object FTSSearchClansByLocationResponse extends TopLevel[FTSSearchClansByLocationResponse with Double]
  
   // obsolete
  @js.native
  sealed trait FTSSearchPlayersByLocation extends EMsg
  /* 3107 */ @js.native
  object FTSSearchPlayersByLocation extends TopLevel[FTSSearchPlayersByLocation with Double]
  
   // obsolete
  @js.native
  sealed trait FTSSearchPlayersByLocationResponse extends EMsg
  /* 3108 */ @js.native
  object FTSSearchPlayersByLocationResponse extends TopLevel[FTSSearchPlayersByLocationResponse with Double]
  
   // obsolete
  @js.native
  sealed trait FTSSearchResponse extends EMsg
  /* 3111 */ @js.native
  object FTSSearchResponse extends TopLevel[FTSSearchResponse with Double]
  
   // obsolete
  @js.native
  sealed trait FTSSearchStatus extends EMsg
  /* 3112 */ @js.native
  object FTSSearchStatus extends TopLevel[FTSSearchStatus with Double]
  
   // obsolete
  @js.native
  sealed trait FTSSearchStatusResponse extends EMsg
  /* 3113 */ @js.native
  object FTSSearchStatusResponse extends TopLevel[FTSSearchStatusResponse with Double]
  
  @js.native
  sealed trait FailServer extends EMsg
  /* 3000 */ @js.native
  object FailServer extends TopLevel[FailServer with Double]
  
  @js.native
  sealed trait FileXferData extends EMsg
  /* 1202 */ @js.native
  object FileXferData extends TopLevel[FileXferData with Double]
  
  @js.native
  sealed trait FileXferDataAck extends EMsg
  /* 1204 */ @js.native
  object FileXferDataAck extends TopLevel[FileXferDataAck with Double]
  
  @js.native
  sealed trait FileXferEnd extends EMsg
  /* 1203 */ @js.native
  object FileXferEnd extends TopLevel[FileXferEnd with Double]
  
  @js.native
  sealed trait FileXferRequest extends EMsg
  /* 1200 */ @js.native
  object FileXferRequest extends TopLevel[FileXferRequest with Double]
  
  @js.native
  sealed trait FileXferResponse extends EMsg
  /* 1201 */ @js.native
  object FileXferResponse extends TopLevel[FileXferResponse with Double]
  
  @js.native
  sealed trait GCAchievementAwarded extends EMsg
  /* 2212 */ @js.native
  object GCAchievementAwarded extends TopLevel[GCAchievementAwarded with Double]
  
   // obsolete
  @js.native
  sealed trait GCCmdBounce extends EMsg
  /* 2204 */ @js.native
  object GCCmdBounce extends TopLevel[GCCmdBounce with Double]
  
  @js.native
  sealed trait GCCmdDeploy extends EMsg
  /* 2207 */ @js.native
  object GCCmdDeploy extends TopLevel[GCCmdDeploy with Double]
  
  @js.native
  sealed trait GCCmdDeployResponse extends EMsg
  /* 2208 */ @js.native
  object GCCmdDeployResponse extends TopLevel[GCCmdDeployResponse with Double]
  
  @js.native
  sealed trait GCCmdDown extends EMsg
  /* 2206 */ @js.native
  object GCCmdDown extends TopLevel[GCCmdDown with Double]
  
   // obsolete
  @js.native
  sealed trait GCCmdForceBounce extends EMsg
  /* 2205 */ @js.native
  object GCCmdForceBounce extends TopLevel[GCCmdForceBounce with Double]
  
  @js.native
  sealed trait GCCmdRevive extends EMsg
  /* 2203 */ @js.native
  object GCCmdRevive extends TopLevel[GCCmdRevive with Double]
  
  @js.native
  sealed trait GCCmdStatus extends EMsg
  /* 2216 */ @js.native
  object GCCmdStatus extends TopLevel[GCCmdStatus with Double]
  
  @js.native
  sealed trait GCCmdSwitch extends EMsg
  /* 2209 */ @js.native
  object GCCmdSwitch extends TopLevel[GCCmdSwitch with Double]
  
   // obsolete
  @js.native
  sealed trait GCGetAccountDetails extends EMsg
  /* 2218 */ @js.native
  object GCGetAccountDetails extends TopLevel[GCGetAccountDetails with Double]
  
   // obsolete
  @js.native
  sealed trait GCGetAccountDetails_DEPRECATED extends EMsg
  /* 2218 */ @js.native
  object GCGetAccountDetails_DEPRECATED extends TopLevel[GCGetAccountDetails_DEPRECATED with Double]
  
  @js.native
  sealed trait GCGetEmailTemplate extends EMsg
  /* 2220 */ @js.native
  object GCGetEmailTemplate extends TopLevel[GCGetEmailTemplate with Double]
  
  @js.native
  sealed trait GCGetEmailTemplateResponse extends EMsg
  /* 2221 */ @js.native
  object GCGetEmailTemplateResponse extends TopLevel[GCGetEmailTemplateResponse with Double]
  
  @js.native
  sealed trait GCHAccountLockStatusChange extends EMsg
  /* 2234 */ @js.native
  object GCHAccountLockStatusChange extends TopLevel[GCHAccountLockStatusChange with Double]
  
  @js.native
  sealed trait GCHAccountPhoneNumberChange extends EMsg
  /* 2236 */ @js.native
  object GCHAccountPhoneNumberChange extends TopLevel[GCHAccountPhoneNumberChange with Double]
  
  @js.native
  sealed trait GCHAccountTradeBanStatusChange extends EMsg
  /* 2233 */ @js.native
  object GCHAccountTradeBanStatusChange extends TopLevel[GCHAccountTradeBanStatusChange with Double]
  
  @js.native
  sealed trait GCHAccountTwoFactorChange extends EMsg
  /* 2237 */ @js.native
  object GCHAccountTwoFactorChange extends TopLevel[GCHAccountTwoFactorChange with Double]
  
  @js.native
  sealed trait GCHAccountVacStatusChange extends EMsg
  /* 2228 */ @js.native
  object GCHAccountVacStatusChange extends TopLevel[GCHAccountVacStatusChange with Double]
  
  @js.native
  sealed trait GCHKillGC extends EMsg
  /* 2231 */ @js.native
  object GCHKillGC extends TopLevel[GCHKillGC with Double]
  
  @js.native
  sealed trait GCHKillGCResponse extends EMsg
  /* 2232 */ @js.native
  object GCHKillGCResponse extends TopLevel[GCHKillGCResponse with Double]
  
  @js.native
  sealed trait GCHRelay extends EMsg
  /* 2222 */ @js.native
  object GCHRelay extends TopLevel[GCHRelay with Double]
  
   // obsolete "renamed to GCHRelayToClient"
  @js.native
  sealed trait GCHRelayClientToIS extends EMsg
  /* 2223 */ @js.native
  object GCHRelayClientToIS extends TopLevel[GCHRelayClientToIS with Double]
  
  @js.native
  sealed trait GCHRelayToClient extends EMsg
  /* 2223 */ @js.native
  object GCHRelayToClient extends TopLevel[GCHRelayToClient with Double]
  
  @js.native
  sealed trait GCHRequestStatus extends EMsg
  /* 2226 */ @js.native
  object GCHRequestStatus extends TopLevel[GCHRequestStatus with Double]
  
  @js.native
  sealed trait GCHRequestStatusResponse extends EMsg
  /* 2227 */ @js.native
  object GCHRequestStatusResponse extends TopLevel[GCHRequestStatusResponse with Double]
  
  @js.native
  sealed trait GCHRequestUpdateSession extends EMsg
  /* 2225 */ @js.native
  object GCHRequestUpdateSession extends TopLevel[GCHRequestUpdateSession with Double]
  
  @js.native
  sealed trait GCHSpawnGC extends EMsg
  /* 2229 */ @js.native
  object GCHSpawnGC extends TopLevel[GCHSpawnGC with Double]
  
  @js.native
  sealed trait GCHSpawnGCResponse extends EMsg
  /* 2230 */ @js.native
  object GCHSpawnGCResponse extends TopLevel[GCHSpawnGCResponse with Double]
  
  @js.native
  sealed trait GCHUpdateSession extends EMsg
  /* 2224 */ @js.native
  object GCHUpdateSession extends TopLevel[GCHUpdateSession with Double]
  
  @js.native
  sealed trait GCHVacVerificationChange extends EMsg
  /* 2235 */ @js.native
  object GCHVacVerificationChange extends TopLevel[GCHVacVerificationChange with Double]
  
  @js.native
  sealed trait GCInterAppMessage extends EMsg
  /* 2219 */ @js.native
  object GCInterAppMessage extends TopLevel[GCInterAppMessage with Double]
  
   // obsolete
  @js.native
  sealed trait GCRegisterWebInterfaces extends EMsg
  /* 2217 */ @js.native
  object GCRegisterWebInterfaces extends TopLevel[GCRegisterWebInterfaces with Double]
  
   // obsolete
  @js.native
  sealed trait GCRegisterWebInterfaces_Deprecated extends EMsg
  /* 2217 */ @js.native
  object GCRegisterWebInterfaces_Deprecated extends TopLevel[GCRegisterWebInterfaces_Deprecated with Double]
  
   // obsolete
  @js.native
  sealed trait GCSendClient extends EMsg
  /* 2200 */ @js.native
  object GCSendClient extends TopLevel[GCSendClient with Double]
  
  @js.native
  sealed trait GCSystemMessage extends EMsg
  /* 2213 */ @js.native
  object GCSystemMessage extends TopLevel[GCSystemMessage with Double]
  
   // obsolete
  @js.native
  sealed trait GCUpdateGSState extends EMsg
  /* 2211 */ @js.native
  object GCUpdateGSState extends TopLevel[GCUpdateGSState with Double]
  
   // obsolete
  @js.native
  sealed trait GCUpdatePlayedState extends EMsg
  /* 2202 */ @js.native
  object GCUpdatePlayedState extends TopLevel[GCUpdatePlayedState with Double]
  
   // obsolete
  @js.native
  sealed trait GCValidateSession extends EMsg
  /* 2214 */ @js.native
  object GCValidateSession extends TopLevel[GCValidateSession with Double]
  
   // obsolete
  @js.native
  sealed trait GCValidateSessionResponse extends EMsg
  /* 2215 */ @js.native
  object GCValidateSessionResponse extends TopLevel[GCValidateSessionResponse with Double]
  
  @js.native
  sealed trait GMConvertUserWallets extends EMsg
  /* 333 */ @js.native
  object GMConvertUserWallets extends TopLevel[GMConvertUserWallets with Double]
  
  @js.native
  sealed trait GMDRMSync extends EMsg
  /* 320 */ @js.native
  object GMDRMSync extends TopLevel[GMDRMSync with Double]
  
  @js.native
  sealed trait GMGetServiceMethodRouting extends EMsg
  /* 331 */ @js.native
  object GMGetServiceMethodRouting extends TopLevel[GMGetServiceMethodRouting with Double]
  
  @js.native
  sealed trait GMGetServiceMethodRoutingResponse extends EMsg
  /* 332 */ @js.native
  object GMGetServiceMethodRoutingResponse extends TopLevel[GMGetServiceMethodRoutingResponse with Double]
  
  @js.native
  sealed trait GMLoadActivationCodes extends EMsg
  /* 325 */ @js.native
  object GMLoadActivationCodes extends TopLevel[GMLoadActivationCodes with Double]
  
  @js.native
  sealed trait GMQueueForFBS extends EMsg
  /* 326 */ @js.native
  object GMQueueForFBS extends TopLevel[GMQueueForFBS with Double]
  
  @js.native
  sealed trait GMReportPHPError extends EMsg
  /* 319 */ @js.native
  object GMReportPHPError extends TopLevel[GMReportPHPError with Double]
  
  @js.native
  sealed trait GMSBase extends EMsg
  /* 6400 */ @js.native
  object GMSBase extends TopLevel[GMSBase with Double]
  
  @js.native
  sealed trait GMSClientServerQueryResponse extends EMsg
  /* 6404 */ @js.native
  object GMSClientServerQueryResponse extends TopLevel[GMSClientServerQueryResponse with Double]
  
  @js.native
  sealed trait GMSGameServerReplicate extends EMsg
  /* 6401 */ @js.native
  object GMSGameServerReplicate extends TopLevel[GMSGameServerReplicate with Double]
  
  @js.native
  sealed trait GMSchemaConversionResults extends EMsg
  /* 327 */ @js.native
  object GMSchemaConversionResults extends TopLevel[GMSchemaConversionResults with Double]
  
   // obsolete
  @js.native
  sealed trait GMSchemaConversionResultsResponse extends EMsg
  /* 328 */ @js.native
  object GMSchemaConversionResultsResponse extends TopLevel[GMSchemaConversionResultsResponse with Double]
  
  @js.native
  sealed trait GMWriteConfigToSQL extends EMsg
  /* 324 */ @js.native
  object GMWriteConfigToSQL extends TopLevel[GMWriteConfigToSQL with Double]
  
  @js.native
  sealed trait GMWriteShellFailureToSQL extends EMsg
  /* 329 */ @js.native
  object GMWriteShellFailureToSQL extends TopLevel[GMWriteShellFailureToSQL with Double]
  
  @js.native
  sealed trait GMWriteStatsToSOS extends EMsg
  /* 330 */ @js.native
  object GMWriteStatsToSOS extends TopLevel[GMWriteStatsToSOS with Double]
  
  @js.native
  sealed trait GSApprove extends EMsg
  /* 758 */ @js.native
  object GSApprove extends TopLevel[GSApprove with Double]
  
  @js.native
  sealed trait GSAssociateWithClan extends EMsg
  /* 938 */ @js.native
  object GSAssociateWithClan extends TopLevel[GSAssociateWithClan with Double]
  
  @js.native
  sealed trait GSAssociateWithClanResponse extends EMsg
  /* 939 */ @js.native
  object GSAssociateWithClanResponse extends TopLevel[GSAssociateWithClanResponse with Double]
  
  @js.native
  sealed trait GSComputeNewPlayerCompatibility extends EMsg
  /* 940 */ @js.native
  object GSComputeNewPlayerCompatibility extends TopLevel[GSComputeNewPlayerCompatibility with Double]
  
  @js.native
  sealed trait GSComputeNewPlayerCompatibilityResponse extends EMsg
  /* 941 */ @js.native
  object GSComputeNewPlayerCompatibilityResponse extends TopLevel[GSComputeNewPlayerCompatibilityResponse with Double]
  
  @js.native
  sealed trait GSDeny extends EMsg
  /* 759 */ @js.native
  object GSDeny extends TopLevel[GSDeny with Double]
  
  @js.native
  sealed trait GSDisconnectNotice extends EMsg
  /* 901 */ @js.native
  object GSDisconnectNotice extends TopLevel[GSDisconnectNotice with Double]
  
  @js.native
  sealed trait GSGetPlayStats extends EMsg
  /* 918 */ @js.native
  object GSGetPlayStats extends TopLevel[GSGetPlayStats with Double]
  
  @js.native
  sealed trait GSGetPlayStatsResponse extends EMsg
  /* 919 */ @js.native
  object GSGetPlayStatsResponse extends TopLevel[GSGetPlayStatsResponse with Double]
  
  @js.native
  sealed trait GSGetReputation extends EMsg
  /* 936 */ @js.native
  object GSGetReputation extends TopLevel[GSGetReputation with Double]
  
  @js.native
  sealed trait GSGetReputationResponse extends EMsg
  /* 937 */ @js.native
  object GSGetReputationResponse extends TopLevel[GSGetReputationResponse with Double]
  
  @js.native
  sealed trait GSGetUserAchievementStatus extends EMsg
  /* 910 */ @js.native
  object GSGetUserAchievementStatus extends TopLevel[GSGetUserAchievementStatus with Double]
  
  @js.native
  sealed trait GSGetUserAchievementStatusResponse extends EMsg
  /* 911 */ @js.native
  object GSGetUserAchievementStatusResponse extends TopLevel[GSGetUserAchievementStatusResponse with Double]
  
  @js.native
  sealed trait GSGetUserGroupStatus extends EMsg
  /* 920 */ @js.native
  object GSGetUserGroupStatus extends TopLevel[GSGetUserGroupStatus with Double]
  
  @js.native
  sealed trait GSGetUserGroupStatusResponse extends EMsg
  /* 923 */ @js.native
  object GSGetUserGroupStatusResponse extends TopLevel[GSGetUserGroupStatusResponse with Double]
  
  @js.native
  sealed trait GSKick extends EMsg
  /* 760 */ @js.native
  object GSKick extends TopLevel[GSKick with Double]
  
  @js.native
  sealed trait GSPerformHardwareSurvey extends EMsg
  /* 5440 */ @js.native
  object GSPerformHardwareSurvey extends TopLevel[GSPerformHardwareSurvey with Double]
  
  @js.native
  sealed trait GSPlayerList extends EMsg
  /* 909 */ @js.native
  object GSPlayerList extends TopLevel[GSPlayerList with Double]
  
  @js.native
  sealed trait GSServerType extends EMsg
  /* 908 */ @js.native
  object GSServerType extends TopLevel[GSServerType with Double]
  
  @js.native
  sealed trait GSStatus extends EMsg
  /* 903 */ @js.native
  object GSStatus extends TopLevel[GSStatus with Double]
  
  @js.native
  sealed trait GSStatus2 extends EMsg
  /* 906 */ @js.native
  object GSStatus2 extends TopLevel[GSStatus2 with Double]
  
  @js.native
  sealed trait GSStatusReply extends EMsg
  /* 774 */ @js.native
  object GSStatusReply extends TopLevel[GSStatusReply with Double]
  
  @js.native
  sealed trait GSStatusUpdate_Unused extends EMsg
  /* 907 */ @js.native
  object GSStatusUpdate_Unused extends TopLevel[GSStatusUpdate_Unused with Double]
  
  @js.native
  sealed trait GSUserPlaying extends EMsg
  /* 905 */ @js.native
  object GSUserPlaying extends TopLevel[GSUserPlaying with Double]
  
  @js.native
  sealed trait GameServerOutOfDate extends EMsg
  /* 6407 */ @js.native
  object GameServerOutOfDate extends TopLevel[GameServerOutOfDate with Double]
  
  @js.native
  sealed trait GenericReply extends EMsg
  /* 100 */ @js.native
  object GenericReply extends TopLevel[GenericReply with Double]
  
  @js.native
  sealed trait GetUserIPCountry extends EMsg
  /* 4393 */ @js.native
  object GetUserIPCountry extends TopLevel[GetUserIPCountry with Double]
  
  @js.native
  sealed trait GetUserIPCountryResponse extends EMsg
  /* 4394 */ @js.native
  object GetUserIPCountryResponse extends TopLevel[GetUserIPCountryResponse with Double]
  
  @js.native
  sealed trait GracefulExitShell extends EMsg
  /* 309 */ @js.native
  object GracefulExitShell extends TopLevel[GracefulExitShell with Double]
  
  @js.native
  sealed trait Heartbeat extends EMsg
  /* 300 */ @js.native
  object Heartbeat extends TopLevel[Heartbeat with Double]
  
  @js.native
  sealed trait HubConnect extends EMsg
  /* 124 */ @js.native
  object HubConnect extends TopLevel[HubConnect with Double]
  
   // obsolete "renamed to GCHRelay"
  @js.native
  sealed trait ISRelayToGCH extends EMsg
  /* 2222 */ @js.native
  object ISRelayToGCH extends TopLevel[ISRelayToGCH with Double]
  
  @js.native
  sealed trait Invalid extends EMsg
  /* 0 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  @js.native
  sealed trait InvalidateDBOCacheItems extends EMsg
  /* 145 */ @js.native
  object InvalidateDBOCacheItems extends TopLevel[InvalidateDBOCacheItems with Double]
  
  @js.native
  sealed trait JobHeartbeat extends EMsg
  /* 123 */ @js.native
  object JobHeartbeat extends TopLevel[JobHeartbeat with Double]
  
  @js.native
  sealed trait JobHeartbeatTest extends EMsg
  /* 3001 */ @js.native
  object JobHeartbeatTest extends TopLevel[JobHeartbeatTest with Double]
  
  @js.native
  sealed trait JobHeartbeatTestResponse extends EMsg
  /* 3002 */ @js.native
  object JobHeartbeatTestResponse extends TopLevel[JobHeartbeatTestResponse with Double]
  
   // obsolete
  @js.native
  sealed trait KGSAllocateKeyRange extends EMsg
  /* 7201 */ @js.native
  object KGSAllocateKeyRange extends TopLevel[KGSAllocateKeyRange with Double]
  
   // obsolete
  @js.native
  sealed trait KGSAllocateKeyRangeResponse extends EMsg
  /* 7202 */ @js.native
  object KGSAllocateKeyRangeResponse extends TopLevel[KGSAllocateKeyRangeResponse with Double]
  
  @js.native
  sealed trait KGSBase extends EMsg
  /* 7200 */ @js.native
  object KGSBase extends TopLevel[KGSBase with Double]
  
   // obsolete
  @js.native
  sealed trait KGSGenerateGameStopWCKeys extends EMsg
  /* 7207 */ @js.native
  object KGSGenerateGameStopWCKeys extends TopLevel[KGSGenerateGameStopWCKeys with Double]
  
   // obsolete
  @js.native
  sealed trait KGSGenerateGameStopWCKeysResponse extends EMsg
  /* 7208 */ @js.native
  object KGSGenerateGameStopWCKeysResponse extends TopLevel[KGSGenerateGameStopWCKeysResponse with Double]
  
   // obsolete
  @js.native
  sealed trait KGSGenerateKeys extends EMsg
  /* 7203 */ @js.native
  object KGSGenerateKeys extends TopLevel[KGSGenerateKeys with Double]
  
   // obsolete
  @js.native
  sealed trait KGSGenerateKeysResponse extends EMsg
  /* 7204 */ @js.native
  object KGSGenerateKeysResponse extends TopLevel[KGSGenerateKeysResponse with Double]
  
   // obsolete
  @js.native
  sealed trait KGSRemapKeys extends EMsg
  /* 7205 */ @js.native
  object KGSRemapKeys extends TopLevel[KGSRemapKeys with Double]
  
   // obsolete
  @js.native
  sealed trait KGSRemapKeysResponse extends EMsg
  /* 7206 */ @js.native
  object KGSRemapKeysResponse extends TopLevel[KGSRemapKeysResponse with Double]
  
  @js.native
  sealed trait KeepAlive extends EMsg
  /* 132 */ @js.native
  object KeepAlive extends TopLevel[KeepAlive with Double]
  
  @js.native
  sealed trait LBSDeleteLB extends EMsg
  /* 3210 */ @js.native
  object LBSDeleteLB extends TopLevel[LBSDeleteLB with Double]
  
  @js.native
  sealed trait LBSDeleteLBEntry extends EMsg
  /* 3211 */ @js.native
  object LBSDeleteLBEntry extends TopLevel[LBSDeleteLBEntry with Double]
  
  @js.native
  sealed trait LBSDeleteLBResponse extends EMsg
  /* 3214 */ @js.native
  object LBSDeleteLBResponse extends TopLevel[LBSDeleteLBResponse with Double]
  
  @js.native
  sealed trait LBSFindOrCreateLB extends EMsg
  /* 3203 */ @js.native
  object LBSFindOrCreateLB extends TopLevel[LBSFindOrCreateLB with Double]
  
  @js.native
  sealed trait LBSFindOrCreateLBResponse extends EMsg
  /* 3204 */ @js.native
  object LBSFindOrCreateLBResponse extends TopLevel[LBSFindOrCreateLBResponse with Double]
  
  @js.native
  sealed trait LBSGetLBEntries extends EMsg
  /* 3205 */ @js.native
  object LBSGetLBEntries extends TopLevel[LBSGetLBEntries with Double]
  
  @js.native
  sealed trait LBSGetLBEntriesResponse extends EMsg
  /* 3206 */ @js.native
  object LBSGetLBEntriesResponse extends TopLevel[LBSGetLBEntriesResponse with Double]
  
  @js.native
  sealed trait LBSGetLBList extends EMsg
  /* 3207 */ @js.native
  object LBSGetLBList extends TopLevel[LBSGetLBList with Double]
  
  @js.native
  sealed trait LBSGetLBListResponse extends EMsg
  /* 3208 */ @js.native
  object LBSGetLBListResponse extends TopLevel[LBSGetLBListResponse with Double]
  
  @js.native
  sealed trait LBSResetLB extends EMsg
  /* 3212 */ @js.native
  object LBSResetLB extends TopLevel[LBSResetLB with Double]
  
  @js.native
  sealed trait LBSResetLBResponse extends EMsg
  /* 3213 */ @js.native
  object LBSResetLBResponse extends TopLevel[LBSResetLBResponse with Double]
  
  @js.native
  sealed trait LBSSetLBDetails extends EMsg
  /* 3209 */ @js.native
  object LBSSetLBDetails extends TopLevel[LBSSetLBDetails with Double]
  
  @js.native
  sealed trait LBSSetScore extends EMsg
  /* 3201 */ @js.native
  object LBSSetScore extends TopLevel[LBSSetScore with Double]
  
  @js.native
  sealed trait LBSSetScoreResponse extends EMsg
  /* 3202 */ @js.native
  object LBSSetScoreResponse extends TopLevel[LBSSetScoreResponse with Double]
  
  @js.native
  sealed trait LicenseProcessingComplete extends EMsg
  /* 316 */ @js.native
  object LicenseProcessingComplete extends TopLevel[LicenseProcessingComplete with Double]
  
  @js.native
  sealed trait LoadDBOCacheItem extends EMsg
  /* 143 */ @js.native
  object LoadDBOCacheItem extends TopLevel[LoadDBOCacheItem with Double]
  
  @js.native
  sealed trait LoadDBOCacheItemResponse extends EMsg
  /* 144 */ @js.native
  object LoadDBOCacheItemResponse extends TopLevel[LoadDBOCacheItemResponse with Double]
  
   // obsolete
  @js.native
  sealed trait LogSearchCancel extends EMsg
  /* 1009 */ @js.native
  object LogSearchCancel extends TopLevel[LogSearchCancel with Double]
  
   // obsolete
  @js.native
  sealed trait LogSearchRequest extends EMsg
  /* 1007 */ @js.native
  object LogSearchRequest extends TopLevel[LogSearchRequest with Double]
  
   // obsolete
  @js.native
  sealed trait LogSearchResponse extends EMsg
  /* 1008 */ @js.native
  object LogSearchResponse extends TopLevel[LogSearchResponse with Double]
  
  @js.native
  sealed trait LogsinkBase extends EMsg
  /* 8800 */ @js.native
  object LogsinkBase extends TopLevel[LogsinkBase with Double]
  
  @js.native
  sealed trait LogsinkWriteReport extends EMsg
  /* 8800 */ @js.native
  object LogsinkWriteReport extends TopLevel[LogsinkWriteReport with Double]
  
  @js.native
  sealed trait MDSContentServerConfig extends EMsg
  /* 5828 */ @js.native
  object MDSContentServerConfig extends TopLevel[MDSContentServerConfig with Double]
  
  @js.native
  sealed trait MDSContentServerConfigRequest extends EMsg
  /* 5827 */ @js.native
  object MDSContentServerConfigRequest extends TopLevel[MDSContentServerConfigRequest with Double]
  
   // obsolete
  @js.native
  sealed trait MDSContentServerStatsBroadcast extends EMsg
  /* 5826 */ @js.native
  object MDSContentServerStatsBroadcast extends TopLevel[MDSContentServerStatsBroadcast with Double]
  
   // obsolete
  @js.native
  sealed trait MDSDownloadDepotChunksAck extends EMsg
  /* 5825 */ @js.native
  object MDSDownloadDepotChunksAck extends TopLevel[MDSDownloadDepotChunksAck with Double]
  
  @js.native
  sealed trait MDSGetDepotChunk extends EMsg
  /* 5832 */ @js.native
  object MDSGetDepotChunk extends TopLevel[MDSGetDepotChunk with Double]
  
  @js.native
  sealed trait MDSGetDepotChunkChunk extends EMsg
  /* 5834 */ @js.native
  object MDSGetDepotChunkChunk extends TopLevel[MDSGetDepotChunkChunk with Double]
  
  @js.native
  sealed trait MDSGetDepotChunkResponse extends EMsg
  /* 5833 */ @js.native
  object MDSGetDepotChunkResponse extends TopLevel[MDSGetDepotChunkResponse with Double]
  
  @js.native
  sealed trait MDSGetDepotManifest extends EMsg
  /* 5829 */ @js.native
  object MDSGetDepotManifest extends TopLevel[MDSGetDepotManifest with Double]
  
  @js.native
  sealed trait MDSGetDepotManifestChunk extends EMsg
  /* 5831 */ @js.native
  object MDSGetDepotManifestChunk extends TopLevel[MDSGetDepotManifestChunk with Double]
  
  @js.native
  sealed trait MDSGetDepotManifestResponse extends EMsg
  /* 5830 */ @js.native
  object MDSGetDepotManifestResponse extends TopLevel[MDSGetDepotManifestResponse with Double]
  
  @js.native
  sealed trait MDSGetServerListForUser extends EMsg
  /* 5836 */ @js.native
  object MDSGetServerListForUser extends TopLevel[MDSGetServerListForUser with Double]
  
  @js.native
  sealed trait MDSGetServerListForUserResponse extends EMsg
  /* 5837 */ @js.native
  object MDSGetServerListForUserResponse extends TopLevel[MDSGetServerListForUserResponse with Double]
  
   // obsolete
  @js.native
  sealed trait MDSGetVersionsForDepot extends EMsg
  /* 5814 */ @js.native
  object MDSGetVersionsForDepot extends TopLevel[MDSGetVersionsForDepot with Double]
  
   // obsolete
  @js.native
  sealed trait MDSGetVersionsForDepotResponse extends EMsg
  /* 5815 */ @js.native
  object MDSGetVersionsForDepotResponse extends TopLevel[MDSGetVersionsForDepotResponse with Double]
  
  @js.native
  sealed trait MDSMigrateChunk extends EMsg
  /* 5847 */ @js.native
  object MDSMigrateChunk extends TopLevel[MDSMigrateChunk with Double]
  
  @js.native
  sealed trait MDSMigrateChunkResponse extends EMsg
  /* 5848 */ @js.native
  object MDSMigrateChunkResponse extends TopLevel[MDSMigrateChunkResponse with Double]
  
   // obsolete
  @js.native
  sealed trait MDSSetPublicVersionForDepot extends EMsg
  /* 5816 */ @js.native
  object MDSSetPublicVersionForDepot extends TopLevel[MDSSetPublicVersionForDepot with Double]
  
   // obsolete
  @js.native
  sealed trait MDSSetPublicVersionForDepotResponse extends EMsg
  /* 5817 */ @js.native
  object MDSSetPublicVersionForDepotResponse extends TopLevel[MDSSetPublicVersionForDepotResponse with Double]
  
  @js.native
  sealed trait MDSToAMGetDepotDecryptionKeyResponse extends EMsg
  /* 5813 */ @js.native
  object MDSToAMGetDepotDecryptionKeyResponse extends TopLevel[MDSToAMGetDepotDecryptionKeyResponse with Double]
  
  @js.native
  sealed trait MDSToCSFlushChunk extends EMsg
  /* 5844 */ @js.native
  object MDSToCSFlushChunk extends TopLevel[MDSToCSFlushChunk with Double]
  
   // obsolete
  @js.native
  sealed trait MDSUpdateContentServerConfig extends EMsg
  /* 5835 */ @js.native
  object MDSUpdateContentServerConfig extends TopLevel[MDSUpdateContentServerConfig with Double]
  
  @js.native
  sealed trait MMSBase extends EMsg
  /* 6600 */ @js.native
  object MMSBase extends TopLevel[MMSBase with Double]
  
  @js.native
  sealed trait MPASBase extends EMsg
  /* 7100 */ @js.native
  object MPASBase extends TopLevel[MPASBase with Double]
  
  @js.native
  sealed trait MPASVacBanReset extends EMsg
  /* 7101 */ @js.native
  object MPASVacBanReset extends TopLevel[MPASVacBanReset with Double]
  
  @js.native
  sealed trait MarketingMessageUpdate extends EMsg
  /* 4216 */ @js.native
  object MarketingMessageUpdate extends TopLevel[MarketingMessageUpdate with Double]
  
  @js.native
  sealed trait Multi extends EMsg
  /* 1 */ @js.native
  object Multi extends TopLevel[Multi with Double]
  
  @js.native
  sealed trait NonStdMsgBase extends EMsg
  /* 6800 */ @js.native
  object NonStdMsgBase extends TopLevel[NonStdMsgBase with Double]
  
  @js.native
  sealed trait NonStdMsgChase extends EMsg
  /* 6806 */ @js.native
  object NonStdMsgChase extends TopLevel[NonStdMsgChase with Double]
  
  @js.native
  sealed trait NonStdMsgDFSTransfer extends EMsg
  /* 6807 */ @js.native
  object NonStdMsgDFSTransfer extends TopLevel[NonStdMsgDFSTransfer with Double]
  
  @js.native
  sealed trait NonStdMsgHTTPClient extends EMsg
  /* 6803 */ @js.native
  object NonStdMsgHTTPClient extends TopLevel[NonStdMsgHTTPClient with Double]
  
  @js.native
  sealed trait NonStdMsgHTTPServer extends EMsg
  /* 6802 */ @js.native
  object NonStdMsgHTTPServer extends TopLevel[NonStdMsgHTTPServer with Double]
  
  @js.native
  sealed trait NonStdMsgLogsink extends EMsg
  /* 6811 */ @js.native
  object NonStdMsgLogsink extends TopLevel[NonStdMsgLogsink with Double]
  
  @js.native
  sealed trait NonStdMsgMemcached extends EMsg
  /* 6801 */ @js.native
  object NonStdMsgMemcached extends TopLevel[NonStdMsgMemcached with Double]
  
  @js.native
  sealed trait NonStdMsgPHPSimulator extends EMsg
  /* 6805 */ @js.native
  object NonStdMsgPHPSimulator extends TopLevel[NonStdMsgPHPSimulator with Double]
  
  @js.native
  sealed trait NonStdMsgRTMPServer extends EMsg
  /* 6813 */ @js.native
  object NonStdMsgRTMPServer extends TopLevel[NonStdMsgRTMPServer with Double]
  
  @js.native
  sealed trait NonStdMsgSteam2Emulator extends EMsg
  /* 6812 */ @js.native
  object NonStdMsgSteam2Emulator extends TopLevel[NonStdMsgSteam2Emulator with Double]
  
   // obsolete
  @js.native
  sealed trait NonStdMsgSyslog extends EMsg
  /* 6810 */ @js.native
  object NonStdMsgSyslog extends TopLevel[NonStdMsgSyslog with Double]
  
  @js.native
  sealed trait NonStdMsgTests extends EMsg
  /* 6808 */ @js.native
  object NonStdMsgTests extends TopLevel[NonStdMsgTests with Double]
  
  @js.native
  sealed trait NonStdMsgUMQpipeAAPL extends EMsg
  /* 6809 */ @js.native
  object NonStdMsgUMQpipeAAPL extends TopLevel[NonStdMsgUMQpipeAAPL with Double]
  
  @js.native
  sealed trait NonStdMsgWGResponse extends EMsg
  /* 6804 */ @js.native
  object NonStdMsgWGResponse extends TopLevel[NonStdMsgWGResponse with Double]
  
  @js.native
  sealed trait NotificationOfSuspiciousActivity extends EMsg
  /* 4395 */ @js.native
  object NotificationOfSuspiciousActivity extends TopLevel[NotificationOfSuspiciousActivity with Double]
  
  @js.native
  sealed trait NotifyWatchdog extends EMsg
  /* 314 */ @js.native
  object NotifyWatchdog extends TopLevel[NotifyWatchdog with Double]
  
  @js.native
  sealed trait OGSBeginSession extends EMsg
  /* 3401 */ @js.native
  object OGSBeginSession extends TopLevel[OGSBeginSession with Double]
  
  @js.native
  sealed trait OGSBeginSessionResponse extends EMsg
  /* 3402 */ @js.native
  object OGSBeginSessionResponse extends TopLevel[OGSBeginSessionResponse with Double]
  
  @js.native
  sealed trait OGSEndSession extends EMsg
  /* 3403 */ @js.native
  object OGSEndSession extends TopLevel[OGSEndSession with Double]
  
  @js.native
  sealed trait OGSEndSessionResponse extends EMsg
  /* 3404 */ @js.native
  object OGSEndSessionResponse extends TopLevel[OGSEndSessionResponse with Double]
  
  @js.native
  sealed trait OGSWriteAppSessionRow extends EMsg
  /* 3406 */ @js.native
  object OGSWriteAppSessionRow extends TopLevel[OGSWriteAppSessionRow with Double]
  
  @js.native
  sealed trait P2PIntroducerMessage extends EMsg
  /* 2502 */ @js.native
  object P2PIntroducerMessage extends TopLevel[P2PIntroducerMessage with Double]
  
  @js.native
  sealed trait PICSBase extends EMsg
  /* 8900 */ @js.native
  object PICSBase extends TopLevel[PICSBase with Double]
  
  @js.native
  sealed trait PSAddPackageToShoppingCart extends EMsg
  /* 5005 */ @js.native
  object PSAddPackageToShoppingCart extends TopLevel[PSAddPackageToShoppingCart with Double]
  
  @js.native
  sealed trait PSAddPackageToShoppingCartResponse extends EMsg
  /* 5006 */ @js.native
  object PSAddPackageToShoppingCartResponse extends TopLevel[PSAddPackageToShoppingCartResponse with Double]
  
  @js.native
  sealed trait PSAddWalletCreditToShoppingCart extends EMsg
  /* 5011 */ @js.native
  object PSAddWalletCreditToShoppingCart extends TopLevel[PSAddWalletCreditToShoppingCart with Double]
  
  @js.native
  sealed trait PSAddWalletCreditToShoppingCartResponse extends EMsg
  /* 5012 */ @js.native
  object PSAddWalletCreditToShoppingCartResponse extends TopLevel[PSAddWalletCreditToShoppingCartResponse with Double]
  
  @js.native
  sealed trait PSCreateShoppingCart extends EMsg
  /* 5001 */ @js.native
  object PSCreateShoppingCart extends TopLevel[PSCreateShoppingCart with Double]
  
  @js.native
  sealed trait PSCreateShoppingCartResponse extends EMsg
  /* 5002 */ @js.native
  object PSCreateShoppingCartResponse extends TopLevel[PSCreateShoppingCartResponse with Double]
  
  @js.native
  sealed trait PSGetShoppingCartContents extends EMsg
  /* 5009 */ @js.native
  object PSGetShoppingCartContents extends TopLevel[PSGetShoppingCartContents with Double]
  
  @js.native
  sealed trait PSGetShoppingCartContentsResponse extends EMsg
  /* 5010 */ @js.native
  object PSGetShoppingCartContentsResponse extends TopLevel[PSGetShoppingCartContentsResponse with Double]
  
  @js.native
  sealed trait PSIsValidShoppingCart extends EMsg
  /* 5003 */ @js.native
  object PSIsValidShoppingCart extends TopLevel[PSIsValidShoppingCart with Double]
  
  @js.native
  sealed trait PSIsValidShoppingCartResponse extends EMsg
  /* 5004 */ @js.native
  object PSIsValidShoppingCartResponse extends TopLevel[PSIsValidShoppingCartResponse with Double]
  
  @js.native
  sealed trait PSRemoveLineItemFromShoppingCart extends EMsg
  /* 5007 */ @js.native
  object PSRemoveLineItemFromShoppingCart extends TopLevel[PSRemoveLineItemFromShoppingCart with Double]
  
  @js.native
  sealed trait PSRemoveLineItemFromShoppingCartResponse extends EMsg
  /* 5008 */ @js.native
  object PSRemoveLineItemFromShoppingCartResponse extends TopLevel[PSRemoveLineItemFromShoppingCartResponse with Double]
  
  @js.native
  sealed trait PhysicalBoxInventory extends EMsg
  /* 321 */ @js.native
  object PhysicalBoxInventory extends TopLevel[PhysicalBoxInventory with Double]
  
  @js.native
  sealed trait Ping extends EMsg
  /* 139 */ @js.native
  object Ping extends TopLevel[Ping with Double]
  
  @js.native
  sealed trait PingResponse extends EMsg
  /* 140 */ @js.native
  object PingResponse extends TopLevel[PingResponse with Double]
  
  @js.native
  sealed trait PrepareToExit extends EMsg
  /* 226 */ @js.native
  object PrepareToExit extends TopLevel[PrepareToExit with Double]
  
  @js.native
  sealed trait ProtobufWrapped extends EMsg
  /* 2 */ @js.native
  object ProtobufWrapped extends TopLevel[ProtobufWrapped with Double]
  
  @js.native
  sealed trait ProvideWindowsEventLogEntries extends EMsg
  /* 234 */ @js.native
  object ProvideWindowsEventLogEntries extends TopLevel[ProvideWindowsEventLogEntries with Double]
  
  @js.native
  sealed trait QuestServerBase extends EMsg
  /* 9300 */ @js.native
  object QuestServerBase extends TopLevel[QuestServerBase with Double]
  
  @js.native
  sealed trait QueuedEmailsComplete extends EMsg
  /* 318 */ @js.native
  object QueuedEmailsComplete extends TopLevel[QueuedEmailsComplete with Double]
  
  @js.native
  sealed trait RMDeleteMemcachedKeys extends EMsg
  /* 7803 */ @js.native
  object RMDeleteMemcachedKeys extends TopLevel[RMDeleteMemcachedKeys with Double]
  
  @js.native
  sealed trait RMMsgTraceAddTrigger extends EMsg
  /* 7806 */ @js.native
  object RMMsgTraceAddTrigger extends TopLevel[RMMsgTraceAddTrigger with Double]
  
  @js.native
  sealed trait RMMsgTraceEvent extends EMsg
  /* 7808 */ @js.native
  object RMMsgTraceEvent extends TopLevel[RMMsgTraceEvent with Double]
  
  @js.native
  sealed trait RMMsgTraceRemoveTrigger extends EMsg
  /* 7807 */ @js.native
  object RMMsgTraceRemoveTrigger extends TopLevel[RMMsgTraceRemoveTrigger with Double]
  
  @js.native
  sealed trait RMRange extends EMsg
  /* 7800 */ @js.native
  object RMRange extends TopLevel[RMRange with Double]
  
  @js.native
  sealed trait RMRemoteInvoke extends EMsg
  /* 7804 */ @js.native
  object RMRemoteInvoke extends TopLevel[RMRemoteInvoke with Double]
  
  @js.native
  sealed trait RMTestVerisignOTP extends EMsg
  /* 7800 */ @js.native
  object RMTestVerisignOTP extends TopLevel[RMTestVerisignOTP with Double]
  
  @js.native
  sealed trait RMTestVerisignOTPResponse extends EMsg
  /* 7801 */ @js.native
  object RMTestVerisignOTPResponse extends TopLevel[RMTestVerisignOTPResponse with Double]
  
  @js.native
  sealed trait RemoteClientAcceptEULA extends EMsg
  /* 9509 */ @js.native
  object RemoteClientAcceptEULA extends TopLevel[RemoteClientAcceptEULA with Double]
  
  @js.native
  sealed trait RemoteClientAppStatus extends EMsg
  /* 9502 */ @js.native
  object RemoteClientAppStatus extends TopLevel[RemoteClientAppStatus with Double]
  
  @js.native
  sealed trait RemoteClientAuth extends EMsg
  /* 9500 */ @js.native
  object RemoteClientAuth extends TopLevel[RemoteClientAuth with Double]
  
  @js.native
  sealed trait RemoteClientAuthResponse extends EMsg
  /* 9501 */ @js.native
  object RemoteClientAuthResponse extends TopLevel[RemoteClientAuthResponse with Double]
  
  @js.native
  sealed trait RemoteClientBase extends EMsg
  /* 9500 */ @js.native
  object RemoteClientBase extends TopLevel[RemoteClientBase with Double]
  
  @js.native
  sealed trait RemoteClientGetControllerConfig extends EMsg
  /* 9510 */ @js.native
  object RemoteClientGetControllerConfig extends TopLevel[RemoteClientGetControllerConfig with Double]
  
  @js.native
  sealed trait RemoteClientGetControllerConfigResposne extends EMsg
  /* 9511 */ @js.native
  object RemoteClientGetControllerConfigResposne extends TopLevel[RemoteClientGetControllerConfigResposne with Double]
  
  @js.native
  sealed trait RemoteClientPing extends EMsg
  /* 9505 */ @js.native
  object RemoteClientPing extends TopLevel[RemoteClientPing with Double]
  
  @js.native
  sealed trait RemoteClientPingResponse extends EMsg
  /* 9506 */ @js.native
  object RemoteClientPingResponse extends TopLevel[RemoteClientPingResponse with Double]
  
  @js.native
  sealed trait RemoteClientStartStream extends EMsg
  /* 9503 */ @js.native
  object RemoteClientStartStream extends TopLevel[RemoteClientStartStream with Double]
  
  @js.native
  sealed trait RemoteClientStartStreamResponse extends EMsg
  /* 9504 */ @js.native
  object RemoteClientStartStreamResponse extends TopLevel[RemoteClientStartStreamResponse with Double]
  
  @js.native
  sealed trait RemoteClientStreamingEnabled extends EMsg
  /* 9512 */ @js.native
  object RemoteClientStreamingEnabled extends TopLevel[RemoteClientStreamingEnabled with Double]
  
   // obsolete
  @js.native
  sealed trait RemoteSysID extends EMsg
  /* 128 */ @js.native
  object RemoteSysID extends TopLevel[RemoteSysID with Double]
  
  @js.native
  sealed trait ReqChallenge extends EMsg
  /* 600 */ @js.native
  object ReqChallenge extends TopLevel[ReqChallenge with Double]
  
  @js.native
  sealed trait ReqChallengeTest extends EMsg
  /* 602 */ @js.native
  object ReqChallengeTest extends TopLevel[ReqChallengeTest with Double]
  
  @js.native
  sealed trait RequestFullStatsBlock extends EMsg
  /* 142 */ @js.native
  object RequestFullStatsBlock extends TopLevel[RequestFullStatsBlock with Double]
  
   // obsolete
  @js.native
  sealed trait RequestStatHistory extends EMsg
  /* 1014 */ @js.native
  object RequestStatHistory extends TopLevel[RequestStatHistory with Double]
  
  @js.native
  sealed trait RequestWindowsEventLogEntries extends EMsg
  /* 233 */ @js.native
  object RequestWindowsEventLogEntries extends TopLevel[RequestWindowsEventLogEntries with Double]
  
   // obsolete
  @js.native
  sealed trait RouteMessage extends EMsg
  /* 127 */ @js.native
  object RouteMessage extends TopLevel[RouteMessage with Double]
  
  @js.native
  sealed trait SCIDRequest extends EMsg
  /* 120 */ @js.native
  object SCIDRequest extends TopLevel[SCIDRequest with Double]
  
  @js.native
  sealed trait SCIDResponse extends EMsg
  /* 121 */ @js.native
  object SCIDResponse extends TopLevel[SCIDResponse with Double]
  
  @js.native
  sealed trait SLCBase extends EMsg
  /* 9400 */ @js.native
  object SLCBase extends TopLevel[SLCBase with Double]
  
  @js.native
  sealed trait SLCOwnerLibraryChanged extends EMsg
  /* 9407 */ @js.native
  object SLCOwnerLibraryChanged extends TopLevel[SLCOwnerLibraryChanged with Double]
  
  @js.native
  sealed trait SLCRequestUserSessionStatus extends EMsg
  /* 9401 */ @js.native
  object SLCRequestUserSessionStatus extends TopLevel[SLCRequestUserSessionStatus with Double]
  
  @js.native
  sealed trait SLCSharedLibraryChanged extends EMsg
  /* 9408 */ @js.native
  object SLCSharedLibraryChanged extends TopLevel[SLCSharedLibraryChanged with Double]
  
  @js.native
  sealed trait SLCSharedLicensesLockStatus extends EMsg
  /* 9402 */ @js.native
  object SLCSharedLicensesLockStatus extends TopLevel[SLCSharedLicensesLockStatus with Double]
  
  @js.native
  sealed trait SLCUserSessionStatus extends EMsg
  /* 9400 */ @js.native
  object SLCUserSessionStatus extends TopLevel[SLCUserSessionStatus with Double]
  
  @js.native
  sealed trait SMExpensiveReport extends EMsg
  /* 2902 */ @js.native
  object SMExpensiveReport extends TopLevel[SMExpensiveReport with Double]
  
  @js.native
  sealed trait SMFishingReport extends EMsg
  /* 2904 */ @js.native
  object SMFishingReport extends TopLevel[SMFishingReport with Double]
  
   // obsolete
  @js.native
  sealed trait SMGetSchemaConversionResults extends EMsg
  /* 2907 */ @js.native
  object SMGetSchemaConversionResults extends TopLevel[SMGetSchemaConversionResults with Double]
  
   // obsolete
  @js.native
  sealed trait SMGetSchemaConversionResultsResponse extends EMsg
  /* 2908 */ @js.native
  object SMGetSchemaConversionResultsResponse extends TopLevel[SMGetSchemaConversionResultsResponse with Double]
  
  @js.native
  sealed trait SMHourlyReport extends EMsg
  /* 2903 */ @js.native
  object SMHourlyReport extends TopLevel[SMHourlyReport with Double]
  
  @js.native
  sealed trait SMMonitorSpace extends EMsg
  /* 2906 */ @js.native
  object SMMonitorSpace extends TopLevel[SMMonitorSpace with Double]
  
  @js.native
  sealed trait SMPartitionRenames extends EMsg
  /* 2905 */ @js.native
  object SMPartitionRenames extends TopLevel[SMPartitionRenames with Double]
  
  @js.native
  sealed trait SecretsBase extends EMsg
  /* 8600 */ @js.native
  object SecretsBase extends TopLevel[SecretsBase with Double]
  
  @js.native
  sealed trait SecretsCredentialPairResponse extends EMsg
  /* 8601 */ @js.native
  object SecretsCredentialPairResponse extends TopLevel[SecretsCredentialPairResponse with Double]
  
  @js.native
  sealed trait SecretsRequestCredentialPair extends EMsg
  /* 8600 */ @js.native
  object SecretsRequestCredentialPair extends TopLevel[SecretsRequestCredentialPair with Double]
  
   // obsolete
  @js.native
  sealed trait SecretsRequestServerIdentity extends EMsg
  /* 8602 */ @js.native
  object SecretsRequestServerIdentity extends TopLevel[SecretsRequestServerIdentity with Double]
  
   // obsolete
  @js.native
  sealed trait SecretsServerIdentityResponse extends EMsg
  /* 8603 */ @js.native
  object SecretsServerIdentityResponse extends TopLevel[SecretsServerIdentityResponse with Double]
  
   // obsolete
  @js.native
  sealed trait SecretsUpdateServerIdentities extends EMsg
  /* 8604 */ @js.native
  object SecretsUpdateServerIdentities extends TopLevel[SecretsUpdateServerIdentities with Double]
  
  @js.native
  sealed trait ServiceMethod extends EMsg
  /* 146 */ @js.native
  object ServiceMethod extends TopLevel[ServiceMethod with Double]
  
  @js.native
  sealed trait ServiceMethodResponse extends EMsg
  /* 147 */ @js.native
  object ServiceMethodResponse extends TopLevel[ServiceMethodResponse with Double]
  
  @js.native
  sealed trait SetTestFlag extends EMsg
  /* 317 */ @js.native
  object SetTestFlag extends TopLevel[SetTestFlag with Double]
  
  @js.native
  sealed trait ShellCheckWindowsUpdates extends EMsg
  /* 237 */ @js.native
  object ShellCheckWindowsUpdates extends TopLevel[ShellCheckWindowsUpdates with Double]
  
  @js.native
  sealed trait ShellCheckWindowsUpdatesResponse extends EMsg
  /* 238 */ @js.native
  object ShellCheckWindowsUpdatesResponse extends TopLevel[ShellCheckWindowsUpdatesResponse with Double]
  
  @js.native
  sealed trait ShellConfigInfoUpdate extends EMsg
  /* 230 */ @js.native
  object ShellConfigInfoUpdate extends TopLevel[ShellConfigInfoUpdate with Double]
  
  @js.native
  sealed trait ShellFailed extends EMsg
  /* 301 */ @js.native
  object ShellFailed extends TopLevel[ShellFailed with Double]
  
   // obsolete
  @js.native
  sealed trait ShellFlushUserLicenseCache extends EMsg
  /* 239 */ @js.native
  object ShellFlushUserLicenseCache extends TopLevel[ShellFlushUserLicenseCache with Double]
  
  @js.native
  sealed trait ShellSearchLogs extends EMsg
  /* 235 */ @js.native
  object ShellSearchLogs extends TopLevel[ShellSearchLogs with Double]
  
  @js.native
  sealed trait ShellSearchLogsResponse extends EMsg
  /* 236 */ @js.native
  object ShellSearchLogsResponse extends TopLevel[ShellSearchLogsResponse with Double]
  
   // obsolete
  @js.native
  sealed trait StatHistory extends EMsg
  /* 1015 */ @js.native
  object StatHistory extends TopLevel[StatHistory with Double]
  
  @js.native
  sealed trait Stats extends EMsg
  /* 141 */ @js.native
  object Stats extends TopLevel[Stats with Double]
  
   // obsolete
  @js.native
  sealed trait StatsDeprecated extends EMsg
  /* 138 */ @js.native
  object StatsDeprecated extends TopLevel[StatsDeprecated with Double]
  
  @js.native
  sealed trait StoreBase extends EMsg
  /* 8000 */ @js.native
  object StoreBase extends TopLevel[StoreBase with Double]
  
   // obsolete
  @js.native
  sealed trait StoreUpdateRecommendationCount extends EMsg
  /* 8000 */ @js.native
  object StoreUpdateRecommendationCount extends TopLevel[StoreUpdateRecommendationCount with Double]
  
  @js.native
  sealed trait Subscribe extends EMsg
  /* 126 */ @js.native
  object Subscribe extends TopLevel[Subscribe with Double]
  
  @js.native
  sealed trait TestInitDB extends EMsg
  /* 323 */ @js.native
  object TestInitDB extends TopLevel[TestInitDB with Double]
  
  @js.native
  sealed trait TestResetServer extends EMsg
  /* 228 */ @js.native
  object TestResetServer extends TopLevel[TestResetServer with Double]
  
  @js.native
  sealed trait TestWorkerProcess extends EMsg
  /* 9200 */ @js.native
  object TestWorkerProcess extends TopLevel[TestWorkerProcess with Double]
  
  @js.native
  sealed trait TestWorkerProcessLoadUnloadModuleRequest extends EMsg
  /* 9200 */ @js.native
  object TestWorkerProcessLoadUnloadModuleRequest extends TopLevel[TestWorkerProcessLoadUnloadModuleRequest with Double]
  
  @js.native
  sealed trait TestWorkerProcessLoadUnloadModuleResponse extends EMsg
  /* 9201 */ @js.native
  object TestWorkerProcessLoadUnloadModuleResponse extends TopLevel[TestWorkerProcessLoadUnloadModuleResponse with Double]
  
  @js.native
  sealed trait TestWorkerProcessServiceModuleCallRequest extends EMsg
  /* 9202 */ @js.native
  object TestWorkerProcessServiceModuleCallRequest extends TopLevel[TestWorkerProcessServiceModuleCallRequest with Double]
  
  @js.native
  sealed trait TestWorkerProcessServiceModuleCallResponse extends EMsg
  /* 9203 */ @js.native
  object TestWorkerProcessServiceModuleCallResponse extends TopLevel[TestWorkerProcessServiceModuleCallResponse with Double]
  
  @js.native
  sealed trait TimestampRequest extends EMsg
  /* 149 */ @js.native
  object TimestampRequest extends TopLevel[TimestampRequest with Double]
  
  @js.native
  sealed trait TimestampResponse extends EMsg
  /* 150 */ @js.native
  object TimestampResponse extends TopLevel[TimestampResponse with Double]
  
   // obsolete
  @js.native
  sealed trait UCMAddTaggedScreenshot extends EMsg
  /* 7335 */ @js.native
  object UCMAddTaggedScreenshot extends TopLevel[UCMAddTaggedScreenshot with Double]
  
  @js.native
  sealed trait UCMBase extends EMsg
  /* 7300 */ @js.native
  object UCMBase extends TopLevel[UCMBase with Double]
  
   // obsolete
  @js.native
  sealed trait UCMDeleteOldScreenshot extends EMsg
  /* 7372 */ @js.native
  object UCMDeleteOldScreenshot extends TopLevel[UCMDeleteOldScreenshot with Double]
  
   // obsolete
  @js.native
  sealed trait UCMDeleteOldScreenshotResponse extends EMsg
  /* 7373 */ @js.native
  object UCMDeleteOldScreenshotResponse extends TopLevel[UCMDeleteOldScreenshotResponse with Double]
  
   // obsolete
  @js.native
  sealed trait UCMDeleteOldVideo extends EMsg
  /* 7374 */ @js.native
  object UCMDeleteOldVideo extends TopLevel[UCMDeleteOldVideo with Double]
  
   // obsolete
  @js.native
  sealed trait UCMDeleteOldVideoResponse extends EMsg
  /* 7375 */ @js.native
  object UCMDeleteOldVideoResponse extends TopLevel[UCMDeleteOldVideoResponse with Double]
  
  @js.native
  sealed trait UCMDeletePublishedFile extends EMsg
  /* 7329 */ @js.native
  object UCMDeletePublishedFile extends TopLevel[UCMDeletePublishedFile with Double]
  
  @js.native
  sealed trait UCMDeletePublishedFileResponse extends EMsg
  /* 7330 */ @js.native
  object UCMDeletePublishedFileResponse extends TopLevel[UCMDeletePublishedFileResponse with Double]
  
  @js.native
  sealed trait UCMFixStatsPublishedFile extends EMsg
  /* 7371 */ @js.native
  object UCMFixStatsPublishedFile extends TopLevel[UCMFixStatsPublishedFile with Double]
  
   // obsolete
  @js.native
  sealed trait UCMGetPublishedFilesForUser extends EMsg
  /* 7362 */ @js.native
  object UCMGetPublishedFilesForUser extends TopLevel[UCMGetPublishedFilesForUser with Double]
  
   // obsolete
  @js.native
  sealed trait UCMGetPublishedFilesForUserResponse extends EMsg
  /* 7363 */ @js.native
  object UCMGetPublishedFilesForUserResponse extends TopLevel[UCMGetPublishedFilesForUserResponse with Double]
  
  @js.native
  sealed trait UCMGetUserSubscribedFiles extends EMsg
  /* 7369 */ @js.native
  object UCMGetUserSubscribedFiles extends TopLevel[UCMGetUserSubscribedFiles with Double]
  
  @js.native
  sealed trait UCMGetUserSubscribedFilesResponse extends EMsg
  /* 7370 */ @js.native
  object UCMGetUserSubscribedFilesResponse extends TopLevel[UCMGetUserSubscribedFilesResponse with Double]
  
  @js.native
  sealed trait UCMPublishFile extends EMsg
  /* 7351 */ @js.native
  object UCMPublishFile extends TopLevel[UCMPublishFile with Double]
  
  @js.native
  sealed trait UCMPublishFileResponse extends EMsg
  /* 7352 */ @js.native
  object UCMPublishFileResponse extends TopLevel[UCMPublishFileResponse with Double]
  
  @js.native
  sealed trait UCMPublishedFileChildAdd extends EMsg
  /* 7353 */ @js.native
  object UCMPublishedFileChildAdd extends TopLevel[UCMPublishedFileChildAdd with Double]
  
  @js.native
  sealed trait UCMPublishedFileChildAddResponse extends EMsg
  /* 7354 */ @js.native
  object UCMPublishedFileChildAddResponse extends TopLevel[UCMPublishedFileChildAddResponse with Double]
  
   // obsolete
  @js.native
  sealed trait UCMPublishedFileChildChangeSortOrder extends EMsg
  /* 7357 */ @js.native
  object UCMPublishedFileChildChangeSortOrder extends TopLevel[UCMPublishedFileChildChangeSortOrder with Double]
  
   // obsolete
  @js.native
  sealed trait UCMPublishedFileChildChangeSortOrderResponse extends EMsg
  /* 7358 */ @js.native
  object UCMPublishedFileChildChangeSortOrderResponse extends TopLevel[UCMPublishedFileChildChangeSortOrderResponse with Double]
  
  @js.native
  sealed trait UCMPublishedFileChildRemove extends EMsg
  /* 7355 */ @js.native
  object UCMPublishedFileChildRemove extends TopLevel[UCMPublishedFileChildRemove with Double]
  
  @js.native
  sealed trait UCMPublishedFileChildRemoveResponse extends EMsg
  /* 7356 */ @js.native
  object UCMPublishedFileChildRemoveResponse extends TopLevel[UCMPublishedFileChildRemoveResponse with Double]
  
  @js.native
  sealed trait UCMPublishedFileContentUpdated extends EMsg
  /* 7380 */ @js.native
  object UCMPublishedFileContentUpdated extends TopLevel[UCMPublishedFileContentUpdated with Double]
  
  @js.native
  sealed trait UCMPublishedFileParentChanged extends EMsg
  /* 7359 */ @js.native
  object UCMPublishedFileParentChanged extends TopLevel[UCMPublishedFileParentChanged with Double]
  
  @js.native
  sealed trait UCMPublishedFilePreviewAdd extends EMsg
  /* 7341 */ @js.native
  object UCMPublishedFilePreviewAdd extends TopLevel[UCMPublishedFilePreviewAdd with Double]
  
  @js.native
  sealed trait UCMPublishedFilePreviewAddResponse extends EMsg
  /* 7342 */ @js.native
  object UCMPublishedFilePreviewAddResponse extends TopLevel[UCMPublishedFilePreviewAddResponse with Double]
  
   // obsolete
  @js.native
  sealed trait UCMPublishedFilePreviewChangeSortOrder extends EMsg
  /* 7345 */ @js.native
  object UCMPublishedFilePreviewChangeSortOrder extends TopLevel[UCMPublishedFilePreviewChangeSortOrder with Double]
  
   // obsolete
  @js.native
  sealed trait UCMPublishedFilePreviewChangeSortOrderResponse extends EMsg
  /* 7346 */ @js.native
  object UCMPublishedFilePreviewChangeSortOrderResponse extends TopLevel[UCMPublishedFilePreviewChangeSortOrderResponse with Double]
  
  @js.native
  sealed trait UCMPublishedFilePreviewRemove extends EMsg
  /* 7343 */ @js.native
  object UCMPublishedFilePreviewRemove extends TopLevel[UCMPublishedFilePreviewRemove with Double]
  
  @js.native
  sealed trait UCMPublishedFilePreviewRemoveResponse extends EMsg
  /* 7344 */ @js.native
  object UCMPublishedFilePreviewRemoveResponse extends TopLevel[UCMPublishedFilePreviewRemoveResponse with Double]
  
  @js.native
  sealed trait UCMPublishedFileReported extends EMsg
  /* 7339 */ @js.native
  object UCMPublishedFileReported extends TopLevel[UCMPublishedFileReported with Double]
  
  @js.native
  sealed trait UCMPublishedFileSubscribed extends EMsg
  /* 7349 */ @js.native
  object UCMPublishedFileSubscribed extends TopLevel[UCMPublishedFileSubscribed with Double]
  
  @js.native
  sealed trait UCMPublishedFileUnsubscribed extends EMsg
  /* 7350 */ @js.native
  object UCMPublishedFileUnsubscribed extends TopLevel[UCMPublishedFileUnsubscribed with Double]
  
  @js.native
  sealed trait UCMPublishedFileUpdated extends EMsg
  /* 7381 */ @js.native
  object UCMPublishedFileUpdated extends TopLevel[UCMPublishedFileUpdated with Double]
  
  @js.native
  sealed trait UCMReloadPublishedFile extends EMsg
  /* 7337 */ @js.native
  object UCMReloadPublishedFile extends TopLevel[UCMReloadPublishedFile with Double]
  
  @js.native
  sealed trait UCMReloadUserFileListCaches extends EMsg
  /* 7338 */ @js.native
  object UCMReloadUserFileListCaches extends TopLevel[UCMReloadUserFileListCaches with Double]
  
   // obsolete
  @js.native
  sealed trait UCMRemoveTaggedScreenshot extends EMsg
  /* 7336 */ @js.native
  object UCMRemoveTaggedScreenshot extends TopLevel[UCMRemoveTaggedScreenshot with Double]
  
  @js.native
  sealed trait UCMResetCommunityContent extends EMsg
  /* 7307 */ @js.native
  object UCMResetCommunityContent extends TopLevel[UCMResetCommunityContent with Double]
  
  @js.native
  sealed trait UCMResetCommunityContentResponse extends EMsg
  /* 7308 */ @js.native
  object UCMResetCommunityContentResponse extends TopLevel[UCMResetCommunityContentResponse with Double]
  
   // obsolete
  @js.native
  sealed trait UCMUpdateOldScreenshotPrivacy extends EMsg
  /* 7376 */ @js.native
  object UCMUpdateOldScreenshotPrivacy extends TopLevel[UCMUpdateOldScreenshotPrivacy with Double]
  
   // obsolete
  @js.native
  sealed trait UCMUpdateOldScreenshotPrivacyResponse extends EMsg
  /* 7377 */ @js.native
  object UCMUpdateOldScreenshotPrivacyResponse extends TopLevel[UCMUpdateOldScreenshotPrivacyResponse with Double]
  
  @js.native
  sealed trait UCMUpdatePublishedFile extends EMsg
  /* 7327 */ @js.native
  object UCMUpdatePublishedFile extends TopLevel[UCMUpdatePublishedFile with Double]
  
  @js.native
  sealed trait UCMUpdatePublishedFileBan extends EMsg
  /* 7332 */ @js.native
  object UCMUpdatePublishedFileBan extends TopLevel[UCMUpdatePublishedFileBan with Double]
  
  @js.native
  sealed trait UCMUpdatePublishedFileBanResponse extends EMsg
  /* 7333 */ @js.native
  object UCMUpdatePublishedFileBanResponse extends TopLevel[UCMUpdatePublishedFileBanResponse with Double]
  
  @js.native
  sealed trait UCMUpdatePublishedFileIncompatibleStatus extends EMsg
  /* 7340 */ @js.native
  object UCMUpdatePublishedFileIncompatibleStatus extends TopLevel[UCMUpdatePublishedFileIncompatibleStatus with Double]
  
  @js.native
  sealed trait UCMUpdatePublishedFileResponse extends EMsg
  /* 7328 */ @js.native
  object UCMUpdatePublishedFileResponse extends TopLevel[UCMUpdatePublishedFileResponse with Double]
  
  @js.native
  sealed trait UCMUpdatePublishedFileStat extends EMsg
  /* 7331 */ @js.native
  object UCMUpdatePublishedFileStat extends TopLevel[UCMUpdatePublishedFileStat with Double]
  
   // obsolete
  @js.native
  sealed trait UCMUpdateTaggedScreenshot extends EMsg
  /* 7334 */ @js.native
  object UCMUpdateTaggedScreenshot extends TopLevel[UCMUpdateTaggedScreenshot with Double]
  
   // obsolete
  @js.native
  sealed trait UCMValidateObjectExists extends EMsg
  /* 7303 */ @js.native
  object UCMValidateObjectExists extends TopLevel[UCMValidateObjectExists with Double]
  
   // obsolete
  @js.native
  sealed trait UCMValidateObjectExistsResponse extends EMsg
  /* 7304 */ @js.native
  object UCMValidateObjectExistsResponse extends TopLevel[UCMValidateObjectExistsResponse with Double]
  
  @js.native
  sealed trait UDSBase extends EMsg
  /* 7000 */ @js.native
  object UDSBase extends TopLevel[UDSBase with Double]
  
   // obsolete "renamed to UDSHasSession"
  @js.native
  sealed trait UDSFindSession extends EMsg
  /* 7006 */ @js.native
  object UDSFindSession extends TopLevel[UDSFindSession with Double]
  
   // obsolete "renamed to UDSHasSessionResponse"
  @js.native
  sealed trait UDSFindSessionResponse extends EMsg
  /* 7007 */ @js.native
  object UDSFindSessionResponse extends TopLevel[UDSFindSessionResponse with Double]
  
  @js.native
  sealed trait UDSHasSession extends EMsg
  /* 7006 */ @js.native
  object UDSHasSession extends TopLevel[UDSHasSession with Double]
  
  @js.native
  sealed trait UDSHasSessionResponse extends EMsg
  /* 7007 */ @js.native
  object UDSHasSessionResponse extends TopLevel[UDSHasSessionResponse with Double]
  
  @js.native
  sealed trait UDSRenderUserAuth extends EMsg
  /* 7003 */ @js.native
  object UDSRenderUserAuth extends TopLevel[UDSRenderUserAuth with Double]
  
  @js.native
  sealed trait UDSRenderUserAuthResponse extends EMsg
  /* 7004 */ @js.native
  object UDSRenderUserAuthResponse extends TopLevel[UDSRenderUserAuthResponse with Double]
  
   // obsolete
  @js.native
  sealed trait UFSDownloadChunk extends EMsg
  /* 5223 */ @js.native
  object UFSDownloadChunk extends TopLevel[UFSDownloadChunk with Double]
  
  @js.native
  sealed trait UFSDownloadChunkRequest extends EMsg
  /* 5246 */ @js.native
  object UFSDownloadChunkRequest extends TopLevel[UFSDownloadChunkRequest with Double]
  
  @js.native
  sealed trait UFSDownloadChunkResponse extends EMsg
  /* 5247 */ @js.native
  object UFSDownloadChunkResponse extends TopLevel[UFSDownloadChunkResponse with Double]
  
  @js.native
  sealed trait UFSDownloadFinishRequest extends EMsg
  /* 5248 */ @js.native
  object UFSDownloadFinishRequest extends TopLevel[UFSDownloadFinishRequest with Double]
  
  @js.native
  sealed trait UFSDownloadFinishResponse extends EMsg
  /* 5249 */ @js.native
  object UFSDownloadFinishResponse extends TopLevel[UFSDownloadFinishResponse with Double]
  
   // obsolete
  @js.native
  sealed trait UFSDownloadRequest extends EMsg
  /* 5221 */ @js.native
  object UFSDownloadRequest extends TopLevel[UFSDownloadRequest with Double]
  
   // obsolete
  @js.native
  sealed trait UFSDownloadResponse extends EMsg
  /* 5222 */ @js.native
  object UFSDownloadResponse extends TopLevel[UFSDownloadResponse with Double]
  
  @js.native
  sealed trait UFSDownloadStartRequest extends EMsg
  /* 5244 */ @js.native
  object UFSDownloadStartRequest extends TopLevel[UFSDownloadStartRequest with Double]
  
  @js.native
  sealed trait UFSDownloadStartResponse extends EMsg
  /* 5245 */ @js.native
  object UFSDownloadStartResponse extends TopLevel[UFSDownloadStartResponse with Double]
  
  @js.native
  sealed trait UFSFlushURLCache extends EMsg
  /* 5250 */ @js.native
  object UFSFlushURLCache extends TopLevel[UFSFlushURLCache with Double]
  
  @js.native
  sealed trait UFSGetUGCURLs extends EMsg
  /* 5240 */ @js.native
  object UFSGetUGCURLs extends TopLevel[UFSGetUGCURLs with Double]
  
  @js.native
  sealed trait UFSGetUGCURLsResponse extends EMsg
  /* 5241 */ @js.native
  object UFSGetUGCURLsResponse extends TopLevel[UFSGetUGCURLsResponse with Double]
  
  @js.native
  sealed trait UFSHttpUploadFileFinishRequest extends EMsg
  /* 5242 */ @js.native
  object UFSHttpUploadFileFinishRequest extends TopLevel[UFSHttpUploadFileFinishRequest with Double]
  
  @js.native
  sealed trait UFSHttpUploadFileFinishResponse extends EMsg
  /* 5243 */ @js.native
  object UFSHttpUploadFileFinishResponse extends TopLevel[UFSHttpUploadFileFinishResponse with Double]
  
  @js.native
  sealed trait UFSMigrateFile extends EMsg
  /* 5238 */ @js.native
  object UFSMigrateFile extends TopLevel[UFSMigrateFile with Double]
  
  @js.native
  sealed trait UFSMigrateFileAppID extends EMsg
  /* 5253 */ @js.native
  object UFSMigrateFileAppID extends TopLevel[UFSMigrateFileAppID with Double]
  
  @js.native
  sealed trait UFSMigrateFileAppIDResponse extends EMsg
  /* 5254 */ @js.native
  object UFSMigrateFileAppIDResponse extends TopLevel[UFSMigrateFileAppIDResponse with Double]
  
  @js.native
  sealed trait UFSMigrateFileResponse extends EMsg
  /* 5239 */ @js.native
  object UFSMigrateFileResponse extends TopLevel[UFSMigrateFileResponse with Double]
  
  @js.native
  sealed trait UFSReloadAccount extends EMsg
  /* 5234 */ @js.native
  object UFSReloadAccount extends TopLevel[UFSReloadAccount with Double]
  
  @js.native
  sealed trait UFSReloadAccountResponse extends EMsg
  /* 5235 */ @js.native
  object UFSReloadAccountResponse extends TopLevel[UFSReloadAccountResponse with Double]
  
  @js.native
  sealed trait UFSReloadPartitionInfo extends EMsg
  /* 5215 */ @js.native
  object UFSReloadPartitionInfo extends TopLevel[UFSReloadPartitionInfo with Double]
  
  @js.native
  sealed trait UFSSynchronizeFile extends EMsg
  /* 5217 */ @js.native
  object UFSSynchronizeFile extends TopLevel[UFSSynchronizeFile with Double]
  
  @js.native
  sealed trait UFSSynchronizeFileResponse extends EMsg
  /* 5218 */ @js.native
  object UFSSynchronizeFileResponse extends TopLevel[UFSSynchronizeFileResponse with Double]
  
  @js.native
  sealed trait UFSUpdateFileFlags extends EMsg
  /* 5228 */ @js.native
  object UFSUpdateFileFlags extends TopLevel[UFSUpdateFileFlags with Double]
  
  @js.native
  sealed trait UFSUpdateFileFlagsResponse extends EMsg
  /* 5229 */ @js.native
  object UFSUpdateFileFlagsResponse extends TopLevel[UFSUpdateFileFlagsResponse with Double]
  
  @js.native
  sealed trait UFSUpdateRecordBatched extends EMsg
  /* 5236 */ @js.native
  object UFSUpdateRecordBatched extends TopLevel[UFSUpdateRecordBatched with Double]
  
  @js.native
  sealed trait UFSUpdateRecordBatchedResponse extends EMsg
  /* 5237 */ @js.native
  object UFSUpdateRecordBatchedResponse extends TopLevel[UFSUpdateRecordBatchedResponse with Double]
  
  @js.native
  sealed trait UFSUploadCommit extends EMsg
  /* 5251 */ @js.native
  object UFSUploadCommit extends TopLevel[UFSUploadCommit with Double]
  
  @js.native
  sealed trait UFSUploadCommitResponse extends EMsg
  /* 5252 */ @js.native
  object UFSUploadCommitResponse extends TopLevel[UFSUploadCommitResponse with Double]
  
  @js.native
  sealed trait UGSBase extends EMsg
  /* 7900 */ @js.native
  object UGSBase extends TopLevel[UGSBase with Double]
  
  @js.native
  sealed trait UGSUpdateGlobalStats extends EMsg
  /* 7900 */ @js.native
  object UGSUpdateGlobalStats extends TopLevel[UGSUpdateGlobalStats with Double]
  
  @js.native
  sealed trait UMQ2AM_ClientMsgBatch extends EMsg
  /* 8108 */ @js.native
  object UMQ2AM_ClientMsgBatch extends TopLevel[UMQ2AM_ClientMsgBatch with Double]
  
  @js.native
  sealed trait UMQBase extends EMsg
  /* 8100 */ @js.native
  object UMQBase extends TopLevel[UMQBase with Double]
  
   // obsolete
  @js.native
  sealed trait UMQEnqueueMobileAnnouncements extends EMsg
  /* 8110 */ @js.native
  object UMQEnqueueMobileAnnouncements extends TopLevel[UMQEnqueueMobileAnnouncements with Double]
  
   // obsolete
  @js.native
  sealed trait UMQEnqueueMobileSalePromotions extends EMsg
  /* 8109 */ @js.native
  object UMQEnqueueMobileSalePromotions extends TopLevel[UMQEnqueueMobileSalePromotions with Double]
  
  @js.native
  sealed trait UMQIncomingChatMessage extends EMsg
  /* 8105 */ @js.native
  object UMQIncomingChatMessage extends TopLevel[UMQIncomingChatMessage with Double]
  
  @js.native
  sealed trait UMQLogoffRequest extends EMsg
  /* 8102 */ @js.native
  object UMQLogoffRequest extends TopLevel[UMQLogoffRequest with Double]
  
  @js.native
  sealed trait UMQLogoffResponse extends EMsg
  /* 8103 */ @js.native
  object UMQLogoffResponse extends TopLevel[UMQLogoffResponse with Double]
  
  @js.native
  sealed trait UMQLogonRequest extends EMsg
  /* 8100 */ @js.native
  object UMQLogonRequest extends TopLevel[UMQLogonRequest with Double]
  
  @js.native
  sealed trait UMQLogonResponse extends EMsg
  /* 8101 */ @js.native
  object UMQLogonResponse extends TopLevel[UMQLogonResponse with Double]
  
  @js.native
  sealed trait UMQPoll extends EMsg
  /* 8106 */ @js.native
  object UMQPoll extends TopLevel[UMQPoll with Double]
  
  @js.native
  sealed trait UMQPollResults extends EMsg
  /* 8107 */ @js.native
  object UMQPollResults extends TopLevel[UMQPollResults with Double]
  
  @js.native
  sealed trait UMQSendChatMessage extends EMsg
  /* 8104 */ @js.native
  object UMQSendChatMessage extends TopLevel[UMQSendChatMessage with Double]
  
  @js.native
  sealed trait UniverseChanged extends EMsg
  /* 229 */ @js.native
  object UniverseChanged extends TopLevel[UniverseChanged with Double]
  
  @js.native
  sealed trait UniverseData extends EMsg
  /* 1010 */ @js.native
  object UniverseData extends TopLevel[UniverseData with Double]
  
  @js.native
  sealed trait UpdateConfigFile extends EMsg
  /* 322 */ @js.native
  object UpdateConfigFile extends TopLevel[UpdateConfigFile with Double]
  
  @js.native
  sealed trait UpdateCreditCardRequest extends EMsg
  /* 221 */ @js.native
  object UpdateCreditCardRequest extends TopLevel[UpdateCreditCardRequest with Double]
  
  @js.native
  sealed trait UpdateRecordResponse extends EMsg
  /* 215 */ @js.native
  object UpdateRecordResponse extends TopLevel[UpdateRecordResponse with Double]
  
  @js.native
  sealed trait UpdateUserBanResponse extends EMsg
  /* 225 */ @js.native
  object UpdateUserBanResponse extends TopLevel[UpdateUserBanResponse with Double]
  
  @js.native
  sealed trait VACResponse extends EMsg
  /* 601 */ @js.native
  object VACResponse extends TopLevel[VACResponse with Double]
  
  @js.native
  sealed trait VSAddCheat extends EMsg
  /* 605 */ @js.native
  object VSAddCheat extends TopLevel[VSAddCheat with Double]
  
  @js.native
  sealed trait VSChallengeResultText extends EMsg
  /* 608 */ @js.native
  object VSChallengeResultText extends TopLevel[VSChallengeResultText with Double]
  
  @js.native
  sealed trait VSGetChallengeResults extends EMsg
  /* 607 */ @js.native
  object VSGetChallengeResults extends TopLevel[VSGetChallengeResults with Double]
  
  @js.native
  sealed trait VSLoadDBFinished extends EMsg
  /* 611 */ @js.native
  object VSLoadDBFinished extends TopLevel[VSLoadDBFinished with Double]
  
  @js.native
  sealed trait VSMarkCheat extends EMsg
  /* 604 */ @js.native
  object VSMarkCheat extends TopLevel[VSMarkCheat with Double]
  
  @js.native
  sealed trait VSPurgeCodeModDB extends EMsg
  /* 606 */ @js.native
  object VSPurgeCodeModDB extends TopLevel[VSPurgeCodeModDB with Double]
  
  @js.native
  sealed trait VSReportLingerer extends EMsg
  /* 609 */ @js.native
  object VSReportLingerer extends TopLevel[VSReportLingerer with Double]
  
  @js.native
  sealed trait VSRequestManagedChallenge extends EMsg
  /* 610 */ @js.native
  object VSRequestManagedChallenge extends TopLevel[VSRequestManagedChallenge with Double]
  
  @js.native
  sealed trait WGRequest extends EMsg
  /* 130 */ @js.native
  object WGRequest extends TopLevel[WGRequest with Double]
  
  @js.native
  sealed trait WGResponse extends EMsg
  /* 131 */ @js.native
  object WGResponse extends TopLevel[WGResponse with Double]
  
  @js.native
  sealed trait WebAPIBase extends EMsg
  /* 8300 */ @js.native
  object WebAPIBase extends TopLevel[WebAPIBase with Double]
  
  @js.native
  sealed trait WebAPIInvalidateOAuthClientCache extends EMsg
  /* 8304 */ @js.native
  object WebAPIInvalidateOAuthClientCache extends TopLevel[WebAPIInvalidateOAuthClientCache with Double]
  
  @js.native
  sealed trait WebAPIInvalidateOAuthTokenCache extends EMsg
  /* 8305 */ @js.native
  object WebAPIInvalidateOAuthTokenCache extends TopLevel[WebAPIInvalidateOAuthTokenCache with Double]
  
   // obsolete
  @js.native
  sealed trait WebAPIInvalidateTokensForAccount extends EMsg
  /* 8302 */ @js.native
  object WebAPIInvalidateTokensForAccount extends TopLevel[WebAPIInvalidateTokensForAccount with Double]
  
  @js.native
  sealed trait WebAPIJobRequest extends EMsg
  /* 133 */ @js.native
  object WebAPIJobRequest extends TopLevel[WebAPIJobRequest with Double]
  
  @js.native
  sealed trait WebAPIJobResponse extends EMsg
  /* 134 */ @js.native
  object WebAPIJobResponse extends TopLevel[WebAPIJobResponse with Double]
  
  @js.native
  sealed trait WebAPIRegisterGCInterfaces extends EMsg
  /* 8303 */ @js.native
  object WebAPIRegisterGCInterfaces extends TopLevel[WebAPIRegisterGCInterfaces with Double]
  
  @js.native
  sealed trait WebAPISetSecrets extends EMsg
  /* 8306 */ @js.native
  object WebAPISetSecrets extends TopLevel[WebAPISetSecrets with Double]
  
  @js.native
  sealed trait WebAPIValidateOAuth2Token extends EMsg
  /* 8300 */ @js.native
  object WebAPIValidateOAuth2Token extends TopLevel[WebAPIValidateOAuth2Token with Double]
  
  @js.native
  sealed trait WebAPIValidateOAuth2TokenResponse extends EMsg
  /* 8301 */ @js.native
  object WebAPIValidateOAuth2TokenResponse extends TopLevel[WebAPIValidateOAuth2TokenResponse with Double]
  
  @js.native
  sealed trait WorkerProcess extends EMsg
  /* 9000 */ @js.native
  object WorkerProcess extends TopLevel[WorkerProcess with Double]
  
  @js.native
  sealed trait WorkerProcessPingRequest extends EMsg
  /* 9000 */ @js.native
  object WorkerProcessPingRequest extends TopLevel[WorkerProcessPingRequest with Double]
  
  @js.native
  sealed trait WorkerProcessPingResponse extends EMsg
  /* 9001 */ @js.native
  object WorkerProcessPingResponse extends TopLevel[WorkerProcessPingResponse with Double]
  
  @js.native
  sealed trait WorkerProcessShutdown extends EMsg
  /* 9002 */ @js.native
  object WorkerProcessShutdown extends TopLevel[WorkerProcessShutdown with Double]
  
   // obsolete
  @js.native
  sealed trait WorkshopAcceptTOSRequest extends EMsg
  /* 8200 */ @js.native
  object WorkshopAcceptTOSRequest extends TopLevel[WorkshopAcceptTOSRequest with Double]
  
   // obsolete
  @js.native
  sealed trait WorkshopAcceptTOSResponse extends EMsg
  /* 8201 */ @js.native
  object WorkshopAcceptTOSResponse extends TopLevel[WorkshopAcceptTOSResponse with Double]
  
  @js.native
  sealed trait WorkshopBase extends EMsg
  /* 8200 */ @js.native
  object WorkshopBase extends TopLevel[WorkshopBase with Double]
  
  @js.native
  sealed trait ZipRequest extends EMsg
  /* 204 */ @js.native
  object ZipRequest extends TopLevel[ZipRequest with Double]
  
  @js.native
  sealed trait ZipResponse extends EMsg
  /* 205 */ @js.native
  object ZipResponse extends TopLevel[ZipResponse with Double]
}
