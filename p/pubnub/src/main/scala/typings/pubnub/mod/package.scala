package typings.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pubnub.anon.AuthKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* static member */
inline def CATEGORIES_ : Categories = ^.asInstanceOf[js.Dynamic].selectDynamic("CATEGORIES").asInstanceOf[Categories]
inline def CATEGORIES__=(x: Categories): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CATEGORIES")(x.asInstanceOf[js.Any])

/* static member */
inline def OPERATIONS_ : Operations = ^.asInstanceOf[js.Dynamic].selectDynamic("OPERATIONS").asInstanceOf[Operations]
inline def OPERATIONS__=(x: Operations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPERATIONS")(x.asInstanceOf[js.Any])

/* static member */
inline def generateUUID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUUID")().asInstanceOf[String]

/* static member */
inline def notificationPayload(title: String, body: String): NotificationsPayload = (^.asInstanceOf[js.Dynamic].applyDynamic("notificationPayload")(title.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[NotificationsPayload]

type Callback[ResponseType] = js.Function2[/* status */ PubnubStatus, /* response */ ResponseType, Unit]

type GetAllChannelMetadataResponse[Custom /* <: ObjectCustom */] = PagedObjectsResponse[ChannelMetadataObject[Custom]]

type GetAllUUIDMetadataResponse[Custom /* <: ObjectCustom */] = PagedObjectsResponse[UUIDMetadataObject[Custom]]

type GetChannelMetadataResponse[Custom /* <: ObjectCustom */] = ObjectsResponse[ChannelMetadataObject[Custom]]

type GetUUIDMetadataResponse[Custom /* <: ObjectCustom */] = ObjectsResponse[UUIDMetadataObject[Custom]]

type ManageChannelMembersResponse[MembershipCustom /* <: ObjectCustom */, UUIDCustom /* <: ObjectCustom */] = PagedObjectsResponse[UUIDMembershipObject[MembershipCustom, UUIDCustom]]

type ManageMembershipsResponse[MembershipCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */] = PagedObjectsResponse[ChannelMembershipObject[MembershipCustom, ChannelCustom]]

// Objects v2
// Object
type ObjectCustom = StringDictionary[String | Double | Boolean]

type PubnubConfig = ID & AuthKey

// PubnubData was renamed to MessageEvent, keep old name for backwards compatibility
type PubnubData = MessageEvent

type RemoveChannelMetadataResponse = ObjectsResponse[js.Object]

type RemoveUUIDMetadataResponse = ObjectsResponse[js.Object]

type SetChannelMetadataResponse[Custom /* <: ObjectCustom */] = ObjectsResponse[ChannelMetadataObject[Custom]]

type SetUUIDMetadataResponse[Custom /* <: ObjectCustom */] = ObjectsResponse[UUIDMetadataObject[Custom]]

type StatusCallback = js.Function1[/* status */ PubnubStatus, Unit]
