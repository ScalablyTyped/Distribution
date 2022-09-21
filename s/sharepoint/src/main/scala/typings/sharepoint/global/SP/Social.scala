package typings.sharepoint.global.SP

import typings.sharepoint.SP.Social.SocialActorType
import typings.sharepoint.SP.Social.SocialAttachmentActionKind
import typings.sharepoint.SP.Social.SocialAttachmentKind
import typings.sharepoint.SP.Social.SocialDataItemType
import typings.sharepoint.SP.Social.SocialDataOverlayType
import typings.sharepoint.SP.Social.SocialFeedAttributes
import typings.sharepoint.SP.Social.SocialPostAttributes
import typings.sharepoint.SP.Social.SocialPostDefinitionDataItemType
import typings.sharepoint.SP.Social.SocialPostType
import typings.sharepoint.SP.Social.SocialStatusCode
import typings.sharepoint.SP.Social.SocialThreadAttributes
import typings.sharepoint.SP.Social.SocialThreadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Social {
  
  /** Contains information about an actor retrieved from server. An actor is a user, document, site, or tag. */
  @JSGlobal("SP.Social.SocialActor")
  @js.native
  open class SocialActor ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialActor {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /** The AccountName property returns the user account name.
      This property is only available for social actors of type "user". */
    /* CompleteClass */
    override def get_accountName(): String = js.native
    
    /** Identifies whether the actor is a user, document, site, or tag. */
    /* CompleteClass */
    override def get_actorType(): SocialActorType = js.native
    
    /** Specifies whether the actor can be followed by the current user. */
    /* CompleteClass */
    override def get_canFollow(): Boolean = js.native
    
    /** Returns the URI of the document or site content.
      This property is only available for social actors of type Document or Site. */
    /* CompleteClass */
    override def get_contentUri(): String = js.native
    
    /* CompleteClass */
    override def get_emailAddress(): String = js.native
    
    /** Returns the URI of the user's followed content folder.
      This property is only available for social actors of type "user". */
    /* CompleteClass */
    override def get_followedContentUri(): String = js.native
    
    /** Returns the actor's unique identifier. */
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /** Returns the URI of the image representing the actor.
      This property is only available if actor is User, Document, or Site. */
    /* CompleteClass */
    override def get_imageUri(): String = js.native
    
    /** Returns true if the current user is following the actor; otherwise, it returns false. */
    /* CompleteClass */
    override def get_isFollowed(): Boolean = js.native
    
    /** Returns the URI of the library containing the document.
      This property is only available for social actors of type "document". */
    /* CompleteClass */
    override def get_libraryUri(): String = js.native
    
    /** The Name property returns the actor's display name. */
    /* CompleteClass */
    override def get_name(): String = js.native
    
    /** Returns the URI of the user's personal site.
      This property is only available for social actors of type "user". */
    /* CompleteClass */
    override def get_personalSiteUri(): String = js.native
    
    /** Represents the status of retrieving the actor */
    /* CompleteClass */
    override def get_status(): SocialStatusCode = js.native
    
    /** The StatusText property returns the most recent post of the user.
      This property is only available for social actors of type "user". */
    /* CompleteClass */
    override def get_statusText(): String = js.native
    
    /** Returns the GUID of the tag.
      Only available for social actors of type "tag" */
    /* CompleteClass */
    override def get_tagGuid(): String = js.native
    
    /** Returns the user's title
      This property is only available for social actors of type "user". */
    /* CompleteClass */
    override def get_title(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /** Returns the URI of the actor. */
    /* CompleteClass */
    override def get_uri(): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  /** Identifies an actor to the server. An actor can be a user, document, site, or tag. */
  @JSGlobal("SP.Social.SocialActorInfo")
  @js.native
  open class SocialActorInfo ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialActorInfo {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /** User account name.
      This property is only available for social actors of type "user". */
    /* CompleteClass */
    override def get_accountName(): String = js.native
    
    /** Identifies whether the actor is a user, document, site, or tag. */
    /* CompleteClass */
    override def get_actorType(): SocialActorType = js.native
    
    /** URI of the document or site content.
      This property is only available for social actors of type Document or Site. */
    /* CompleteClass */
    override def get_contentUri(): String = js.native
    
    /** Actor's unique identifier. */
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /** GUID of the tag.
      Only available for social actors of type "tag" */
    /* CompleteClass */
    override def get_tagGuid(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /** User account name.
      This property is only available for social actors of type "user". */
    /* CompleteClass */
    override def set_accountName(value: String): String = js.native
    
    /** Identifies whether the actor is a user, document, site, or tag. */
    /* CompleteClass */
    override def set_actorType(value: SocialActorType): SocialActorType = js.native
    
    /** URI of the document or site content.
      This property is only available for social actors of type Document or Site. */
    /* CompleteClass */
    override def set_contentUri(value: String): String = js.native
    
    /** Actor's unique identifier. */
    /* CompleteClass */
    override def set_id(value: String): String = js.native
    
    /** GUID of the tag.
      Only available for social actors of type "tag" */
    /* CompleteClass */
    override def set_tagGuid(value: String): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  /** Identifies an actor as a user, document, site, or tag. */
  @JSGlobal("SP.Social.SocialActorType")
  @js.native
  object SocialActorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialActorType & Double] = js.native
    
    /* 1 */ val document: typings.sharepoint.SP.Social.SocialActorType.document & Double = js.native
    
    /* 2 */ val site: typings.sharepoint.SP.Social.SocialActorType.site & Double = js.native
    
    /* 3 */ val tag: typings.sharepoint.SP.Social.SocialActorType.tag & Double = js.native
    
    /* 0 */ val user: typings.sharepoint.SP.Social.SocialActorType.user & Double = js.native
  }
  
  /** Specifies one or more actor types in a query to the server. */
  @JSGlobal("SP.Social.SocialActorTypes")
  @js.native
  object SocialActorTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialActorTypes & Double] = js.native
    
    /* 6 */ val all: typings.sharepoint.SP.Social.SocialActorTypes.all & Double = js.native
    
    /* 2 */ val documents: typings.sharepoint.SP.Social.SocialActorTypes.documents & Double = js.native
    
    /* 5 */ val excludeContentWithoutFeeds: typings.sharepoint.SP.Social.SocialActorTypes.excludeContentWithoutFeeds & Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.Social.SocialActorTypes.none & Double = js.native
    
    /* 3 */ val sites: typings.sharepoint.SP.Social.SocialActorTypes.sites & Double = js.native
    
    /* 4 */ val tags: typings.sharepoint.SP.Social.SocialActorTypes.tags & Double = js.native
    
    /* 1 */ val users: typings.sharepoint.SP.Social.SocialActorTypes.users & Double = js.native
  }
  
  /** Represents an image, document preview, or video preview attachment.  */
  @JSGlobal("SP.Social.SocialAttachment")
  @js.native
  open class SocialAttachment ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialAttachment {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /** Specifies the type of object that the attachment contains. */
    /* CompleteClass */
    override def get_attachmentKind(): SocialAttachmentKind = js.native
    
    /** Specifies the action to take when the user selects the attachment.
      This property is only present if the AttachmentKind is Video. */
    /* CompleteClass */
    override def get_clickAction(): typings.sharepoint.SP.Social.SocialAttachmentAction = js.native
    
    /** Specifies the URI of the attachment content. */
    /* CompleteClass */
    override def get_contentUri(): String = js.native
    
    /** Provides a text description of the attachment. */
    /* CompleteClass */
    override def get_description(): String = js.native
    
    /** Specifies the height of the attachment or of the attachment preview. */
    /* CompleteClass */
    override def get_height(): Double = js.native
    
    /** Specifies the duration of the attachment in seconds. This property is only present if the AttachmentKind is Video. */
    /* CompleteClass */
    override def get_length(): Double = js.native
    
    /** Provides the attachment name. */
    /* CompleteClass */
    override def get_name(): String = js.native
    
    /** Specifies the URI of the attachment's preview thumbnail.
      This property is only present if the AttachmentKind is Document or Video. */
    /* CompleteClass */
    override def get_previewUri(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /** Provides the attachment URI. */
    /* CompleteClass */
    override def get_uri(): String = js.native
    
    /** Specifies the width of the attachment or of the attachment preview. */
    /* CompleteClass */
    override def get_width(): Double = js.native
    
    /** Specifies the type of object that the attachment contains. */
    /* CompleteClass */
    override def set_attachmentKind(value: SocialAttachmentKind): SocialAttachmentKind = js.native
    
    /** Specifies the action to take when the user selects the attachment.
      This property is only present if the AttachmentKind is Video. */
    /* CompleteClass */
    override def set_clickAction(value: typings.sharepoint.SP.Social.SocialAttachmentAction): typings.sharepoint.SP.Social.SocialAttachmentAction = js.native
    
    /** Specifies the URI of the attachment content. */
    /* CompleteClass */
    override def set_contentUri(value: String): String = js.native
    
    /** Provides a text description of the attachment. */
    /* CompleteClass */
    override def set_description(value: String): String = js.native
    
    /** Specifies the height of the attachment or of the attachment preview. */
    /* CompleteClass */
    override def set_height(value: Double): Double = js.native
    
    /** Specifies the duration of the attachment in seconds. This property is only present if the AttachmentKind is Video. */
    /* CompleteClass */
    override def set_length(value: Double): Double = js.native
    
    /** Provides the attachment name. */
    /* CompleteClass */
    override def set_name(value: String): String = js.native
    
    /** Specifies the URI of the attachment's preview thumbnail.
      This property is only present if the AttachmentKind is Document or Video. */
    /* CompleteClass */
    override def set_previewUri(value: String): String = js.native
    
    /** Provides the attachment URI. */
    /* CompleteClass */
    override def set_uri(value: String): String = js.native
    
    /** Specifies the width of the attachment or of the attachment preview. */
    /* CompleteClass */
    override def set_width(value: Double): Double = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  /** Specifies the user actions that are allowed for the attachment object. */
  @JSGlobal("SP.Social.SocialAttachmentAction")
  @js.native
  open class SocialAttachmentAction ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialAttachmentAction {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /** Specifies whether the action is to navigate to a URI or an action that is dependent on the context in which the object is presented to the user. */
    /* CompleteClass */
    override def get_actionKind(): SocialAttachmentActionKind = js.native
    
    /** Specifies the URI associated with the action. */
    /* CompleteClass */
    override def get_actionUri(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /** Specifies whether the action is to navigate to a URI or an action that is dependent on the context in which the object is presented to the user. */
    /* CompleteClass */
    override def set_actionKind(value: SocialAttachmentActionKind): SocialAttachmentActionKind = js.native
    
    /** Specifies the URI associated with the action. */
    /* CompleteClass */
    override def set_actionUri(value: String): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  /** Specifies whether the action is to navigate to the attachment or to perform some action dependent on the context in which the attachment is presented to the user. */
  @JSGlobal("SP.Social.SocialAttachmentActionKind")
  @js.native
  object SocialAttachmentActionKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialAttachmentActionKind & Double] = js.native
    
    /* 1 */ val adHocAction: typings.sharepoint.SP.Social.SocialAttachmentActionKind.adHocAction & Double = js.native
    
    /* 0 */ val navigate: typings.sharepoint.SP.Social.SocialAttachmentActionKind.navigate & Double = js.native
  }
  
  @JSGlobal("SP.Social.SocialAttachmentKind")
  @js.native
  object SocialAttachmentKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialAttachmentKind & Double] = js.native
    
    /* 2 */ val document: typings.sharepoint.SP.Social.SocialAttachmentKind.document & Double = js.native
    
    /* 0 */ val image: typings.sharepoint.SP.Social.SocialAttachmentKind.image & Double = js.native
    
    /* 1 */ val video: typings.sharepoint.SP.Social.SocialAttachmentKind.video & Double = js.native
  }
  
  /** Defines a user, document, site, tag, or link to be inserted in a new post.
    The SocialPostCreationData class defines the content text that contains substitution strings.
    Each substitution string is replaced by a SocialDataItem value. */
  @JSGlobal("SP.Social.SocialDataItem")
  @js.native
  open class SocialDataItem ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialDataItem {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /** Identifies the user.  */
    /* CompleteClass */
    override def get_accountName(): String = js.native
    
    /** Specifies whether the item being inserted is a user, document, site, tag, or link. */
    /* CompleteClass */
    override def get_itemType(): SocialDataItemType = js.native
    
    /** Identifies the tag.  */
    /* CompleteClass */
    override def get_tagGuid(): String = js.native
    
    /** Specifies the plain text to be inserted in the created post. The server can use the specified text or can use text that identifies the item, for example the name specified in a user profile.  */
    /* CompleteClass */
    override def get_text(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /** Identifies the site, document, or link.  */
    /* CompleteClass */
    override def get_uri(): String = js.native
    
    /** Identifies the user.  */
    /* CompleteClass */
    override def set_accountName(value: String): String = js.native
    
    /** Specifies whether the item being inserted is a user, document, site, tag, or link. */
    /* CompleteClass */
    override def set_itemType(value: SocialDataItemType): SocialDataItemType = js.native
    
    /** Identifies the tag.  */
    /* CompleteClass */
    override def set_tagGuid(value: String): String = js.native
    
    /** Specifies the plain text to be inserted in the created post. The server can use the specified text or can use text that identifies the item, for example the name specified in a user profile.  */
    /* CompleteClass */
    override def set_text(value: String): String = js.native
    
    /** Identifies the site, document, or link.  */
    /* CompleteClass */
    override def set_uri(value: String): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  /** Specifies whether the item being inserted is a user, document, site, tag, or link. */
  @JSGlobal("SP.Social.SocialDataItemType")
  @js.native
  object SocialDataItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialDataItemType & Double] = js.native
    
    /* 1 */ val document: typings.sharepoint.SP.Social.SocialDataItemType.document & Double = js.native
    
    /* 4 */ val link: typings.sharepoint.SP.Social.SocialDataItemType.link & Double = js.native
    
    /* 2 */ val site: typings.sharepoint.SP.Social.SocialDataItemType.site & Double = js.native
    
    /* 3 */ val tag: typings.sharepoint.SP.Social.SocialDataItemType.tag & Double = js.native
    
    /* 0 */ val user: typings.sharepoint.SP.Social.SocialDataItemType.user & Double = js.native
  }
  
  /** Provides information about an overlay.
    An overlay is a substring in a post that represents a user, document, site, tag, or link.
    The SocialPost class contains an array of SocialDataOverlay objects.
    Each of the SocialDataOverlay objects specifies a link or one or more actors. */
  @JSGlobal("SP.Social.SocialDataOverlay")
  @js.native
  open class SocialDataOverlay ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialDataOverlay {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /** Specifies one or more actors as an array of integers where each integer specifies an index into the SocialThreadActors array.
      This property is only available if the get_overlayType() has a value of SocialDataOverlayType.actors. */
    /* CompleteClass */
    override def get_actorIndexes(): js.Array[Double] = js.native
    
    /** The Index property specifies the starting position of the overlay in the SocialPostText string  */
    /* CompleteClass */
    override def get_index(): Double = js.native
    
    /** The Length property specifies the number of characters in the overlay.  */
    /* CompleteClass */
    override def get_length(): Double = js.native
    
    /** The LinkUri property specifies the URI of the link.
      This property is only available if the get_overlayType() has a value of SocialDataOverlayType.link.  */
    /* CompleteClass */
    override def get_linkUri(): String = js.native
    
    /** Specifies whether the overlay is a link or one or more actors. */
    /* CompleteClass */
    override def get_overlayType(): SocialDataOverlayType = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  /** Specifies whether the overlay is a link or one or more actors. */
  @JSGlobal("SP.Social.SocialDataOverlayType")
  @js.native
  object SocialDataOverlayType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialDataOverlayType & Double] = js.native
    
    /* 1 */ val actors: typings.sharepoint.SP.Social.SocialDataOverlayType.actors & Double = js.native
    
    /* 0 */ val link: typings.sharepoint.SP.Social.SocialDataOverlayType.link & Double = js.native
  }
  
  /** Specifies information about errors that the server has encountered. */
  @JSGlobal("SP.Social.SocialExceptionDetails")
  @js.native
  open class SocialExceptionDetails ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialExceptionDetails {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_internalErrorCode(): Double = js.native
    
    /* CompleteClass */
    override def get_internalMessage(): String = js.native
    
    /* CompleteClass */
    override def get_internalStackTrace(): String = js.native
    
    /** Specifies a type name associated with the internal error if a type name is available. */
    /* CompleteClass */
    override def get_internalTypeName(): String = js.native
    
    /* CompleteClass */
    override def get_status(): SocialStatusCode = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  /** Specifies a feed, which contains an array of SocialThreads, each of which specifies a root SocialPost object and an array of response SocialPost objects. */
  @JSGlobal("SP.Social.SocialFeed")
  @js.native
  open class SocialFeed ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialFeed {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /** Specifies attributes of the returned feed.
      The attributes specify if the requested feed has additional threads that were not included in the returned thread. */
    /* CompleteClass */
    override def get_attributes(): SocialFeedAttributes = js.native
    
    /** Returns the date-time of the most recent post that was requested.
      The most recent post that was requested can be removed from the feed if the current user does not have access to it.
      Consequently, the feed does not always contain the post with the date specified in this property. */
    /* CompleteClass */
    override def get_newestProcessed(): String = js.native
    
    /** The OldestProcessed property returns the date-time of the oldest post that was requested.
      The oldest post that was requested can be removed from the feed if the current user does not have access to it.
      Consequently, the feed does not always contain the post with the date specified in this property */
    /* CompleteClass */
    override def get_oldestProcessed(): String = js.native
    
    /** Contains the social threads in the feed. */
    /* CompleteClass */
    override def get_threads(): js.Array[typings.sharepoint.SP.Social.SocialThread] = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /** Returns the number of mentions of the current user that have been added to the feed on the server since the time that the unread mention count was cleared for the current user. */
    /* CompleteClass */
    override def get_unreadMentionCount(): Double = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  // For some reasons this enum doesn't exist
  // enum SocialFollowResult {
  //    ok = 0,
  //    alreadyFollowing = 1,
  //    limitReached = 2,
  //    internalError = 3
  // }
  /** Provides information about the feed.
    This type provides information about whether the feed on the server contains additional threads that were not returned. */
  @JSGlobal("SP.Social.SocialFeedAttributes")
  @js.native
  object SocialFeedAttributes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialFeedAttributes & Double] = js.native
    
    /* 1 */ val moreThreadsAvailable: typings.sharepoint.SP.Social.SocialFeedAttributes.moreThreadsAvailable & Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.Social.SocialFeedAttributes.none & Double = js.native
  }
  
  /** Provides access to social feeds.
    It provides methods to create posts, delete posts, read posts, and perform other operations on posts. */
  @JSGlobal("SP.Social.SocialFeedManager")
  @js.native
  open class SocialFeedManager protected ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialFeedManager {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext) = this()
  }
  
  @JSGlobal("SP.Social.SocialFeedOptions")
  @js.native
  open class SocialFeedOptions ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialFeedOptions
  
  /** Specifies whether the sort order is by creation time or modification time. */
  @JSGlobal("SP.Social.SocialFeedSortOrder")
  @js.native
  object SocialFeedSortOrder extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialFeedSortOrder & Double] = js.native
    
    /* 1 */ val byCreatedTime: typings.sharepoint.SP.Social.SocialFeedSortOrder.byCreatedTime & Double = js.native
    
    /* 0 */ val byModifiedTime: typings.sharepoint.SP.Social.SocialFeedSortOrder.byModifiedTime & Double = js.native
  }
  
  /** Identifies the kind of post to be retrieved.  */
  @JSGlobal("SP.Social.SocialFeedType")
  @js.native
  object SocialFeedType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialFeedType & Double] = js.native
    
    /* 4 */ val everyone: typings.sharepoint.SP.Social.SocialFeedType.everyone & Double = js.native
    
    /* 3 */ val likes: typings.sharepoint.SP.Social.SocialFeedType.likes & Double = js.native
    
    /* 1 */ val news: typings.sharepoint.SP.Social.SocialFeedType.news & Double = js.native
    
    /* 0 */ val personal: typings.sharepoint.SP.Social.SocialFeedType.personal & Double = js.native
    
    /* 2 */ val timeline: typings.sharepoint.SP.Social.SocialFeedType.timeline & Double = js.native
  }
  
  /** Provides properties and methods for managing a user's list of followed actors.
    Actors can be users, documents, sites, and tags. */
  @JSGlobal("SP.Social.SocialFollowingManager")
  @js.native
  open class SocialFollowingManager protected ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialFollowingManager {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext) = this()
  }
  
  /** Defines a link that includes a URI and text representation.
    This class is used to represent the location of a web site.  */
  @JSGlobal("SP.Social.SocialLink")
  @js.native
  open class SocialLink ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialLink {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_text(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def get_uri(): String = js.native
    
    /* CompleteClass */
    override def set_text(value: String): String = js.native
    
    /* CompleteClass */
    override def set_uri(value: String): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  /** Specifies a post read from the server. */
  @JSGlobal("SP.Social.SocialPost")
  @js.native
  open class SocialPost ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialPost {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /** Specifies an image, document preview, or video preview attachment */
    /* CompleteClass */
    override def get_attachment(): typings.sharepoint.SP.Social.SocialAttachment = js.native
    
    /** Describes attributes about the post, such as whether the current user can delete or like the post.  */
    /* CompleteClass */
    override def get_attributes(): SocialPostAttributes = js.native
    
    /** Specifies the author of the post as an index to the social thread's Actors array. */
    /* CompleteClass */
    override def get_authorIndex(): Double = js.native
    
    /** Specifies the date and time that the post was created on the server. */
    /* CompleteClass */
    override def get_createdTime(): String = js.native
    
    /** Specifies the unique identifier of the post. */
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /** Specifies information about users who like the post. */
    /* CompleteClass */
    override def get_likerInfo(): typings.sharepoint.SP.Social.SocialPostActorInfo = js.native
    
    /** Specifies the date and time that the post was last modified on the server. */
    /* CompleteClass */
    override def get_modifiedTime(): String = js.native
    
    /** An array of objects in a post, where each object represents a user, document, site, tag, or link. */
    /* CompleteClass */
    override def get_overlays(): js.Array[typings.sharepoint.SP.Social.SocialDataOverlay] = js.native
    
    /** Specifies whether a post is the root post or a reply post in a thread */
    /* CompleteClass */
    override def get_postType(): SocialPostType = js.native
    
    /** Specifies the URI of the image to be displayed with the post.  */
    /* CompleteClass */
    override def get_preferredImageUri(): String = js.native
    
    /** Specifies the link to a web site associated with the application that created the post. */
    /* CompleteClass */
    override def get_source(): typings.sharepoint.SP.Social.SocialLink = js.native
    
    /** Specifies the text of the post. */
    /* CompleteClass */
    override def get_text(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  /** Specifies a set of users, documents, sites, and tags by an index into the SocialThreadActors array  */
  @JSGlobal("SP.Social.SocialPostActorInfo")
  @js.native
  open class SocialPostActorInfo ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialPostActorInfo {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_includesCurrentUser(): Boolean = js.native
    
    /** Specifies an array of indexes into the SocialThreadActors array.
      The server can choose to return a limited set of actors. For example, the server can choose to return a subset of the users that like a post. */
    /* CompleteClass */
    override def get_indexes(): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def get_totalCount(): Double = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  /** Specifies attributes of the post, such as whether the current user can like or delete the post. */
  @JSGlobal("SP.Social.SocialPostAttributes")
  @js.native
  object SocialPostAttributes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialPostAttributes & Double] = js.native
    
    /* 2 */ val canDelete: typings.sharepoint.SP.Social.SocialPostAttributes.canDelete & Double = js.native
    
    /* 5 */ val canFollowUp: typings.sharepoint.SP.Social.SocialPostAttributes.canFollowUp & Double = js.native
    
    /* 1 */ val canLike: typings.sharepoint.SP.Social.SocialPostAttributes.canLike & Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.Social.SocialPostAttributes.none & Double = js.native
    
    /* 3 */ val useAuthorImage: typings.sharepoint.SP.Social.SocialPostAttributes.useAuthorImage & Double = js.native
    
    /* 4 */ val useSmallImage: typings.sharepoint.SP.Social.SocialPostAttributes.useSmallImage & Double = js.native
  }
  
  /** Specifies the content of a post in the SocialFeedManager.createPost method.
    The post consists of a text message, which can optionally include social tags, mentions of users, and links. */
  @JSGlobal("SP.Social.SocialPostCreationData")
  @js.native
  open class SocialPostCreationData ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialPostCreationData {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /** Specifies an image, document preview, or video preview to be used in the post. */
    /* CompleteClass */
    override def get_attachment(): typings.sharepoint.SP.Social.SocialAttachment = js.native
    
    /** Specifies an array consisting of social tags, user mentions, links to documents, links to sites, and generic links.
      Each element in the array is inserted into the ContentText string if there is a substitution reference to the array element in the string. */
    /* CompleteClass */
    override def get_contentItems(): js.Array[typings.sharepoint.SP.Social.SocialDataItem] = js.native
    
    /** Contains the text body of the post. */
    /* CompleteClass */
    override def get_contentText(): String = js.native
    
    /** Specifies additional information when creating server-generated posts */
    /* CompleteClass */
    override def get_definitionData(): typings.sharepoint.SP.Social.SocialPostDefinitionData = js.native
    
    /** Specifies that access to the post SHOULD be restricted to users that have access to the objects identified by the array of URIs */
    /* CompleteClass */
    override def get_securityUris(): js.Array[String] = js.native
    
    /** Specifies the link to a web site associated with the application that created the post */
    /* CompleteClass */
    override def get_source(): typings.sharepoint.SP.Social.SocialLink = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /** Indicates whether the post is to be used as the current user's new status message. */
    /* CompleteClass */
    override def get_updateStatusText(): Boolean = js.native
    
    /** Specifies an image, document preview, or video preview to be used in the post. */
    /* CompleteClass */
    override def set_attachment(value: typings.sharepoint.SP.Social.SocialAttachment): typings.sharepoint.SP.Social.SocialAttachment = js.native
    
    /** Specifies an array consisting of social tags, user mentions, links to documents, links to sites, and generic links.
      Each element in the array is inserted into the ContentText string if there is a substitution reference to the array element in the string. */
    /* CompleteClass */
    override def set_contentItems(value: js.Array[typings.sharepoint.SP.Social.SocialDataItem]): js.Array[typings.sharepoint.SP.Social.SocialDataItem] = js.native
    
    /** Contains the text body of the post.
      It can optionally contain one or more substitution references to elements in the zero-based ContentItems array.
      A substitution reference consists of a series of characters that consist of an open-brace character ({) followed by one of more digits in the range 0 to 9 and terminated by a close-brace character (}).
      The substitution reference is replaced by the text value of the element in the in the array at the offset specified by the value of the digits.
      For example, the text string "{0}" is replaced by the first element in the ContentItems array. */
    /* CompleteClass */
    override def set_contentText(value: String): String = js.native
    
    /** Specifies additional information when creating server-generated posts */
    /* CompleteClass */
    override def set_definitionData(value: typings.sharepoint.SP.Social.SocialPostDefinitionData): typings.sharepoint.SP.Social.SocialPostDefinitionData = js.native
    
    /** Specifies that access to the post SHOULD be restricted to users that have access to the objects identified by the array of URIs */
    /* CompleteClass */
    override def set_securityUris(value: js.Array[String]): js.Array[String] = js.native
    
    /** Specifies the link to a web site associated with the application that created the post */
    /* CompleteClass */
    override def set_source(value: typings.sharepoint.SP.Social.SocialLink): typings.sharepoint.SP.Social.SocialLink = js.native
    
    /** Indicates whether the post is to be used as the current user's new status message. */
    /* CompleteClass */
    override def set_updateStatusText(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  /** Provides additional information about server-generated posts.
    This type can only be specified in a server-to-server call. */
  @JSGlobal("SP.Social.SocialPostDefinitionData")
  @js.native
  open class SocialPostDefinitionData ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialPostDefinitionData {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_items(): js.Array[typings.sharepoint.SP.Social.SocialPostDefinitionDataItem] = js.native
    
    /* CompleteClass */
    override def get_name(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def set_items(value: js.Array[typings.sharepoint.SP.Social.SocialPostDefinitionDataItem]): js.Array[typings.sharepoint.SP.Social.SocialPostDefinitionDataItem] = js.native
    
    /* CompleteClass */
    override def set_name(value: String): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  /** Specifies an item to be inserted in a post by replacing a token in the post definition.
    This type can only be specified in a server-to-server call. */
  @JSGlobal("SP.Social.SocialPostDefinitionDataItem")
  @js.native
  open class SocialPostDefinitionDataItem ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialPostDefinitionDataItem {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /** Specifies the name of the user.
      This property is only used if the ItemType property specifies that the item is a User. */
    /* CompleteClass */
    override def get_accountName(): String = js.native
    
    /** Specifies whether the item being formatted is a text element, a user, a document, a site, a tag, or a link. */
    /* CompleteClass */
    override def get_itemType(): SocialPostDefinitionDataItemType = js.native
    
    /** Specifies the post definition token to be replaced by the item */
    /* CompleteClass */
    override def get_placeholderName(): String = js.native
    
    /** Specifies the GUID that identifies the tag.
      This property is only used if the ItemType property specifies that the item is a Tag. */
    /* CompleteClass */
    override def get_tagGuid(): String = js.native
    
    /** Specifies the text that is substituted for the placeholder */
    /* CompleteClass */
    override def get_text(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /** Specifies the URI of the document, site, or link.
      This property is only available if the ItemType property specifies that the item is a Document, Link, or Site. */
    /* CompleteClass */
    override def get_uri(): String = js.native
    
    /** Specifies the name of the user.
      This property is only used if the ItemType property specifies that the item is a User. */
    /* CompleteClass */
    override def set_accountName(value: String): String = js.native
    
    /** Specifies whether the item being formatted is a text element, a user, a document, a site, a tag, or a link. */
    /* CompleteClass */
    override def set_itemType(value: SocialPostDefinitionDataItemType): SocialPostDefinitionDataItemType = js.native
    
    /** Specifies the post definition token to be replaced by the item */
    /* CompleteClass */
    override def set_placeholderName(value: String): String = js.native
    
    /** Specifies the GUID that identifies the tag.
      This property is only used if the ItemType property specifies that the item is a Tag. */
    /* CompleteClass */
    override def set_tagGuid(value: String): String = js.native
    
    /** Specifies the text that is substituted for the placeholder */
    /* CompleteClass */
    override def set_text(value: String): String = js.native
    
    /** Specifies the URI of the document, site, or link.
      This property is only available if the ItemType property specifies that the item is a Document, Link, or Site. */
    /* CompleteClass */
    override def set_uri(value: String): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  /** Defines the type of item being specified in the SocialPostDefinitionDataItem.
    This type is only available in server-to-server calls. */
  @JSGlobal("SP.Social.SocialPostDefinitionDataItemType")
  @js.native
  object SocialPostDefinitionDataItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialPostDefinitionDataItemType & Double] = js.native
    
    /* 2 */ val document: typings.sharepoint.SP.Social.SocialPostDefinitionDataItemType.document & Double = js.native
    
    /* 5 */ val link: typings.sharepoint.SP.Social.SocialPostDefinitionDataItemType.link & Double = js.native
    
    /* 3 */ val site: typings.sharepoint.SP.Social.SocialPostDefinitionDataItemType.site & Double = js.native
    
    /* 4 */ val tag: typings.sharepoint.SP.Social.SocialPostDefinitionDataItemType.tag & Double = js.native
    
    /* 0 */ val text: typings.sharepoint.SP.Social.SocialPostDefinitionDataItemType.text & Double = js.native
    
    /* 1 */ val user: typings.sharepoint.SP.Social.SocialPostDefinitionDataItemType.user & Double = js.native
  }
  
  /** Specifies a reference to a post in another thread.
    The referenced post can be a post with a tag, a post that is liked, a post that mentions a user, or a post that is a reply. */
  @JSGlobal("SP.Social.SocialPostReference")
  @js.native
  open class SocialPostReference ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialPostReference {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /** Provides a digest of the thread containing the referenced post */
    /* CompleteClass */
    override def get_digest(): typings.sharepoint.SP.Social.SocialThread = js.native
    
    /* CompleteClass */
    override def get_post(): typings.sharepoint.SP.Social.SocialPost = js.native
    
    /** Specifies the unique identifier of the thread containing the referenced post. */
    /* CompleteClass */
    override def get_threadId(): String = js.native
    
    /** Specifies the current owner of the thread as an index into the SocialThreadActors array. */
    /* CompleteClass */
    override def get_threadOwnerIndex(): Double = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Social.SocialPostType")
  @js.native
  object SocialPostType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialPostType & Double] = js.native
    
    /* 1 */ val reply: typings.sharepoint.SP.Social.SocialPostType.reply & Double = js.native
    
    /* 0 */ val root: typings.sharepoint.SP.Social.SocialPostType.root & Double = js.native
  }
  
  /** Specifies a status or error code. */
  @JSGlobal("SP.Social.SocialStatusCode")
  @js.native
  object SocialStatusCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialStatusCode & Double] = js.native
    
    /* 0 */ val OK: typings.sharepoint.SP.Social.SocialStatusCode.OK & Double = js.native
    
    /* 2 */ val accessDenied: typings.sharepoint.SP.Social.SocialStatusCode.accessDenied & Double = js.native
    
    /* 14 */ val attachmentError: typings.sharepoint.SP.Social.SocialStatusCode.attachmentError & Double = js.native
    
    /* 7 */ val cacheReadError: typings.sharepoint.SP.Social.SocialStatusCode.cacheReadError & Double = js.native
    
    /* 8 */ val cacheUpdateError: typings.sharepoint.SP.Social.SocialStatusCode.cacheUpdateError & Double = js.native
    
    /* 12 */ val cannotCreatePersonalSite: typings.sharepoint.SP.Social.SocialStatusCode.cannotCreatePersonalSite & Double = js.native
    
    /* 10 */ val failedToCreatePersonalSite: typings.sharepoint.SP.Social.SocialStatusCode.failedToCreatePersonalSite & Double = js.native
    
    /* 16 */ val featureDisabled: typings.sharepoint.SP.Social.SocialStatusCode.featureDisabled & Double = js.native
    
    /* 6 */ val internalError: typings.sharepoint.SP.Social.SocialStatusCode.internalError & Double = js.native
    
    /* 4 */ val invalidOperation: typings.sharepoint.SP.Social.SocialStatusCode.invalidOperation & Double = js.native
    
    /* 1 */ val invalidRequest: typings.sharepoint.SP.Social.SocialStatusCode.invalidRequest & Double = js.native
    
    /* 3 */ val itemNotFound: typings.sharepoint.SP.Social.SocialStatusCode.itemNotFound & Double = js.native
    
    /* 5 */ val itemNotModified: typings.sharepoint.SP.Social.SocialStatusCode.itemNotModified & Double = js.native
    
    /* 13 */ val limitReached: typings.sharepoint.SP.Social.SocialStatusCode.limitReached & Double = js.native
    
    /* 11 */ val notAuthorizedToCreatePersonalSite: typings.sharepoint.SP.Social.SocialStatusCode.notAuthorizedToCreatePersonalSite & Double = js.native
    
    /* 15 */ val partialData: typings.sharepoint.SP.Social.SocialStatusCode.partialData & Double = js.native
    
    /* 9 */ val personalSiteNotFound: typings.sharepoint.SP.Social.SocialStatusCode.personalSiteNotFound & Double = js.native
  }
  
  /** Specifies a thread that is stored on the server.
    The thread contains a root post and zero or more reply posts. */
  @JSGlobal("SP.Social.SocialThread")
  @js.native
  open class SocialThread ()
    extends StObject
       with typings.sharepoint.SP.Social.SocialThread {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /** Specifies the users who have created a post in the returned thread and also contains any users, documents, sites, and tags that are referenced in any of the posts in the returned thread. */
    /* CompleteClass */
    override def get_actors(): js.Array[typings.sharepoint.SP.Social.SocialActor] = js.native
    
    /** Specifies attributes of the thread, such as whether the current user can reply or lock the thread and whether the thread is a digest of a thread on the server, whether the number of replies has reached the maximum, and whether the thread is locked. */
    /* CompleteClass */
    override def get_attributes(): SocialThreadAttributes = js.native
    
    /** Specifies the unique identification of the thread. */
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /** Specifies the thread owner as an index into the Actors array.
      Typically, the thread owner is the user who created the root post, but the thread owner can be any user included in the Actors array. */
    /* CompleteClass */
    override def get_ownerIndex(): Double = js.native
    
    /** Specifies a URI that is a permanent reference to the thread, if such a permanent reference is available.  */
    /* CompleteClass */
    override def get_permalink(): String = js.native
    
    /** Specifies a reference to a post in another thread.
      The PostReference property is available only if the ThreadType has a value of ReplyReference, LikeReference, MentionReference, or TagReference.  */
    /* CompleteClass */
    override def get_postReference(): typings.sharepoint.SP.Social.SocialPostReference = js.native
    
    /** Returns an array of zero or more reply posts.
      The server can return a subset of the reply posts that are stored on the server. */
    /* CompleteClass */
    override def get_replies(): js.Array[typings.sharepoint.SP.Social.SocialPost] = js.native
    
    /* CompleteClass */
    override def get_rootPost(): typings.sharepoint.SP.Social.SocialPost = js.native
    
    /** Provides information about conditions that were encountered retrieving the thread that did not prevent the operation from completing. */
    /* CompleteClass */
    override def get_status(): SocialStatusCode = js.native
    
    /** Specifies if the thread is a normal thread created by one or more CreatePost calls or a reference post generated by the server when a user replies to a post, likes a post, or creates a post with a tag or mention */
    /* CompleteClass */
    override def get_threadType(): SocialThreadType = js.native
    
    /* CompleteClass */
    override def get_totalReplyCount(): Double = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  /** Specifies properties of the thread. */
  @JSGlobal("SP.Social.SocialThreadAttributes")
  @js.native
  object SocialThreadAttributes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialThreadAttributes & Double] = js.native
    
    /* 3 */ val canLock: typings.sharepoint.SP.Social.SocialThreadAttributes.canLock & Double = js.native
    
    /* 2 */ val canReply: typings.sharepoint.SP.Social.SocialThreadAttributes.canReply & Double = js.native
    
    /* 1 */ val isDigest: typings.sharepoint.SP.Social.SocialThreadAttributes.isDigest & Double = js.native
    
    /* 4 */ val isLocked: typings.sharepoint.SP.Social.SocialThreadAttributes.isLocked & Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.Social.SocialThreadAttributes.none & Double = js.native
    
    /* 5 */ val replyLimitReached: typings.sharepoint.SP.Social.SocialThreadAttributes.replyLimitReached & Double = js.native
  }
  
  @JSGlobal("SP.Social.SocialThreadType")
  @js.native
  object SocialThreadType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialThreadType & Double] = js.native
    
    /* 1 */ val likeReference: typings.sharepoint.SP.Social.SocialThreadType.likeReference & Double = js.native
    
    /* 3 */ val mentionReference: typings.sharepoint.SP.Social.SocialThreadType.mentionReference & Double = js.native
    
    /* 0 */ val normal: typings.sharepoint.SP.Social.SocialThreadType.normal & Double = js.native
    
    /* 2 */ val replyReference: typings.sharepoint.SP.Social.SocialThreadType.replyReference & Double = js.native
    
    /* 4 */ val tagReference: typings.sharepoint.SP.Social.SocialThreadType.tagReference & Double = js.native
  }
}
