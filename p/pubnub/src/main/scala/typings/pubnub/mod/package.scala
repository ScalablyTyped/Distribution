package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* static member */
inline def CATEGORIES_ : typings.pubnub.mod.Categories = typings.pubnub.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CATEGORIES").asInstanceOf[typings.pubnub.mod.Categories]
inline def CATEGORIES__=(x: typings.pubnub.mod.Categories): scala.Unit = typings.pubnub.mod.^.asInstanceOf[js.Dynamic].updateDynamic("CATEGORIES")(x.asInstanceOf[js.Any])

/* static member */
inline def OPERATIONS_ : typings.pubnub.mod.Operations = typings.pubnub.mod.^.asInstanceOf[js.Dynamic].selectDynamic("OPERATIONS").asInstanceOf[typings.pubnub.mod.Operations]
inline def OPERATIONS__=(x: typings.pubnub.mod.Operations): scala.Unit = typings.pubnub.mod.^.asInstanceOf[js.Dynamic].updateDynamic("OPERATIONS")(x.asInstanceOf[js.Any])

/* static member */
inline def generateUUID(): java.lang.String = typings.pubnub.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateUUID")().asInstanceOf[java.lang.String]

/* static member */
inline def notificationPayload(title: java.lang.String, body: java.lang.String): typings.pubnub.mod.NotificationsPayload = (typings.pubnub.mod.^.asInstanceOf[js.Dynamic].applyDynamic("notificationPayload")(title.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[typings.pubnub.mod.NotificationsPayload]

type Callback[ResponseType] = js.Function2[
/* status */ typings.pubnub.mod.PubnubStatus, 
/* response */ ResponseType, 
scala.Unit]

type DeleteObjectResponse = typings.pubnub.mod.ObjectsResponse[scala.Null]

type DeleteSpaceResponse = typings.pubnub.mod.ObjectsResponse[scala.Null]

type DeleteUserResponse = typings.pubnub.mod.ObjectsResponse[scala.Null]

type GetAllChannelMetadataResponse[Custom /* <: typings.pubnub.mod.ObjectCustom */] = typings.pubnub.mod.PagedObjectsResponse[typings.pubnub.mod.ChannelMetadataObject[Custom]]

type GetAllUUIDMetadataResponse[Custom /* <: typings.pubnub.mod.ObjectCustom */] = typings.pubnub.mod.PagedObjectsResponse[typings.pubnub.mod.UUIDMetadataObject[Custom]]

type GetChannelMetadataResponse[Custom /* <: typings.pubnub.mod.ObjectCustom */] = typings.pubnub.mod.ObjectsResponse[typings.pubnub.mod.ChannelMetadataObject[Custom]]

type GetMembersResponse = typings.pubnub.mod.PagedObjectsResponse[typings.pubnub.mod.ObjectData]

type GetMembershipsResponse = typings.pubnub.mod.PagedObjectsResponse[typings.pubnub.mod.ObjectData]

type GetSpaceResponse = typings.pubnub.mod.ObjectsResponse[typings.pubnub.mod.SpaceData]

type GetSpacesResponse = typings.pubnub.mod.PagedObjectsResponse[typings.pubnub.mod.SpaceData]

type GetUUIDMetadataResponse[Custom /* <: typings.pubnub.mod.ObjectCustom */] = typings.pubnub.mod.ObjectsResponse[typings.pubnub.mod.UUIDMetadataObject[Custom]]

type GetUserResponse = typings.pubnub.mod.ObjectsResponse[typings.pubnub.mod.UserData]

type GetUsersResponse = typings.pubnub.mod.ObjectsResponse[js.Array[typings.pubnub.mod.UserData]]

type ManageChannelMembersResponse[MembershipCustom /* <: typings.pubnub.mod.ObjectCustom */, UUIDCustom /* <: typings.pubnub.mod.ObjectCustom */] = typings.pubnub.mod.PagedObjectsResponse[typings.pubnub.mod.UUIDMembershipObject[MembershipCustom, UUIDCustom]]

type ManageMembershipsResponse[MembershipCustom /* <: typings.pubnub.mod.ObjectCustom */, ChannelCustom /* <: typings.pubnub.mod.ObjectCustom */] = typings.pubnub.mod.PagedObjectsResponse[typings.pubnub.mod.ChannelMembershipObject[MembershipCustom, ChannelCustom]]

// partial but everything can be null (even with strictNullChecks)
type Nullable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]:? T[P] | null}
  */ typings.pubnub.pubnubStrings.Nullable & org.scalablytyped.runtime.TopLevel[T]

// Objects v2
// Object
type ObjectCustom = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean]

// PubnubData was renamed to MessageEvent, keep old name for backwards compatibility
type PubnubData = typings.pubnub.mod.MessageEvent

type RemoveChannelMetadataResponse = typings.pubnub.mod.ObjectsResponse[js.Object]

type RemoveUUIDMetadataResponse = typings.pubnub.mod.ObjectsResponse[js.Object]

type SetChannelMetadataResponse[Custom /* <: typings.pubnub.mod.ObjectCustom */] = typings.pubnub.mod.ObjectsResponse[typings.pubnub.mod.ChannelMetadataObject[Custom]]

type SetUUIDMetadataResponse[Custom /* <: typings.pubnub.mod.ObjectCustom */] = typings.pubnub.mod.ObjectsResponse[typings.pubnub.mod.UUIDMetadataObject[Custom]]

type StatusCallback = js.Function1[/* status */ typings.pubnub.mod.PubnubStatus, scala.Unit]
