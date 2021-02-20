package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Social {
  
  /** Contains information about an actor retrieved from server. An actor is a user, document, site, or tag. */
  @JSGlobal("SP.Social.SocialActor")
  @js.native
  class SocialActor ()
    extends typings.sharepoint.SP.Social.SocialActor
  
  /** Identifies an actor to the server. An actor can be a user, document, site, or tag. */
  @JSGlobal("SP.Social.SocialActorInfo")
  @js.native
  class SocialActorInfo ()
    extends typings.sharepoint.SP.Social.SocialActorInfo
  
  /** Identifies an actor as a user, document, site, or tag. */
  @JSGlobal("SP.Social.SocialActorType")
  @js.native
  object SocialActorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialActorType with Double] = js.native
    
    /* 1 */ val document: typings.sharepoint.SP.Social.SocialActorType.document with Double = js.native
    
    /* 2 */ val site: typings.sharepoint.SP.Social.SocialActorType.site with Double = js.native
    
    /* 3 */ val tag: typings.sharepoint.SP.Social.SocialActorType.tag with Double = js.native
    
    /* 0 */ val user: typings.sharepoint.SP.Social.SocialActorType.user with Double = js.native
  }
  
  /** Specifies one or more actor types in a query to the server. */
  @JSGlobal("SP.Social.SocialActorTypes")
  @js.native
  object SocialActorTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialActorTypes with Double] = js.native
    
    /* 6 */ val all: typings.sharepoint.SP.Social.SocialActorTypes.all with Double = js.native
    
    /* 2 */ val documents: typings.sharepoint.SP.Social.SocialActorTypes.documents with Double = js.native
    
    /* 5 */ val excludeContentWithoutFeeds: typings.sharepoint.SP.Social.SocialActorTypes.excludeContentWithoutFeeds with Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.Social.SocialActorTypes.none with Double = js.native
    
    /* 3 */ val sites: typings.sharepoint.SP.Social.SocialActorTypes.sites with Double = js.native
    
    /* 4 */ val tags: typings.sharepoint.SP.Social.SocialActorTypes.tags with Double = js.native
    
    /* 1 */ val users: typings.sharepoint.SP.Social.SocialActorTypes.users with Double = js.native
  }
  
  /** Represents an image, document preview, or video preview attachment.  */
  @JSGlobal("SP.Social.SocialAttachment")
  @js.native
  class SocialAttachment ()
    extends typings.sharepoint.SP.Social.SocialAttachment
  
  /** Specifies the user actions that are allowed for the attachment object. */
  @JSGlobal("SP.Social.SocialAttachmentAction")
  @js.native
  class SocialAttachmentAction ()
    extends typings.sharepoint.SP.Social.SocialAttachmentAction
  
  /** Specifies whether the action is to navigate to the attachment or to perform some action dependent on the context in which the attachment is presented to the user. */
  @JSGlobal("SP.Social.SocialAttachmentActionKind")
  @js.native
  object SocialAttachmentActionKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialAttachmentActionKind with Double] = js.native
    
    /* 1 */ val adHocAction: typings.sharepoint.SP.Social.SocialAttachmentActionKind.adHocAction with Double = js.native
    
    /* 0 */ val navigate: typings.sharepoint.SP.Social.SocialAttachmentActionKind.navigate with Double = js.native
  }
  
  @JSGlobal("SP.Social.SocialAttachmentKind")
  @js.native
  object SocialAttachmentKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialAttachmentKind with Double] = js.native
    
    /* 2 */ val document: typings.sharepoint.SP.Social.SocialAttachmentKind.document with Double = js.native
    
    /* 0 */ val image: typings.sharepoint.SP.Social.SocialAttachmentKind.image with Double = js.native
    
    /* 1 */ val video: typings.sharepoint.SP.Social.SocialAttachmentKind.video with Double = js.native
  }
  
  /** Defines a user, document, site, tag, or link to be inserted in a new post.
    The SocialPostCreationData class defines the content text that contains substitution strings.
    Each substitution string is replaced by a SocialDataItem value. */
  @JSGlobal("SP.Social.SocialDataItem")
  @js.native
  class SocialDataItem ()
    extends typings.sharepoint.SP.Social.SocialDataItem
  
  /** Specifies whether the item being inserted is a user, document, site, tag, or link. */
  @JSGlobal("SP.Social.SocialDataItemType")
  @js.native
  object SocialDataItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialDataItemType with Double] = js.native
    
    /* 1 */ val document: typings.sharepoint.SP.Social.SocialDataItemType.document with Double = js.native
    
    /* 4 */ val link: typings.sharepoint.SP.Social.SocialDataItemType.link with Double = js.native
    
    /* 2 */ val site: typings.sharepoint.SP.Social.SocialDataItemType.site with Double = js.native
    
    /* 3 */ val tag: typings.sharepoint.SP.Social.SocialDataItemType.tag with Double = js.native
    
    /* 0 */ val user: typings.sharepoint.SP.Social.SocialDataItemType.user with Double = js.native
  }
  
  /** Provides information about an overlay.
    An overlay is a substring in a post that represents a user, document, site, tag, or link.
    The SocialPost class contains an array of SocialDataOverlay objects.
    Each of the SocialDataOverlay objects specifies a link or one or more actors. */
  @JSGlobal("SP.Social.SocialDataOverlay")
  @js.native
  class SocialDataOverlay ()
    extends typings.sharepoint.SP.Social.SocialDataOverlay
  
  /** Specifies whether the overlay is a link or one or more actors. */
  @JSGlobal("SP.Social.SocialDataOverlayType")
  @js.native
  object SocialDataOverlayType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialDataOverlayType with Double] = js.native
    
    /* 1 */ val actors: typings.sharepoint.SP.Social.SocialDataOverlayType.actors with Double = js.native
    
    /* 0 */ val link: typings.sharepoint.SP.Social.SocialDataOverlayType.link with Double = js.native
  }
  
  /** Specifies information about errors that the server has encountered. */
  @JSGlobal("SP.Social.SocialExceptionDetails")
  @js.native
  class SocialExceptionDetails ()
    extends typings.sharepoint.SP.Social.SocialExceptionDetails
  
  /** Specifies a feed, which contains an array of SocialThreads, each of which specifies a root SocialPost object and an array of response SocialPost objects. */
  @JSGlobal("SP.Social.SocialFeed")
  @js.native
  class SocialFeed ()
    extends typings.sharepoint.SP.Social.SocialFeed
  
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
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialFeedAttributes with Double] = js.native
    
    /* 1 */ val moreThreadsAvailable: typings.sharepoint.SP.Social.SocialFeedAttributes.moreThreadsAvailable with Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.Social.SocialFeedAttributes.none with Double = js.native
  }
  
  /** Provides access to social feeds.
    It provides methods to create posts, delete posts, read posts, and perform other operations on posts. */
  @JSGlobal("SP.Social.SocialFeedManager")
  @js.native
  class SocialFeedManager protected ()
    extends typings.sharepoint.SP.Social.SocialFeedManager {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext) = this()
  }
  
  @JSGlobal("SP.Social.SocialFeedOptions")
  @js.native
  class SocialFeedOptions ()
    extends typings.sharepoint.SP.Social.SocialFeedOptions
  
  /** Specifies whether the sort order is by creation time or modification time. */
  @JSGlobal("SP.Social.SocialFeedSortOrder")
  @js.native
  object SocialFeedSortOrder extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialFeedSortOrder with Double] = js.native
    
    /* 1 */ val byCreatedTime: typings.sharepoint.SP.Social.SocialFeedSortOrder.byCreatedTime with Double = js.native
    
    /* 0 */ val byModifiedTime: typings.sharepoint.SP.Social.SocialFeedSortOrder.byModifiedTime with Double = js.native
  }
  
  /** Identifies the kind of post to be retrieved.  */
  @JSGlobal("SP.Social.SocialFeedType")
  @js.native
  object SocialFeedType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialFeedType with Double] = js.native
    
    /* 4 */ val everyone: typings.sharepoint.SP.Social.SocialFeedType.everyone with Double = js.native
    
    /* 3 */ val likes: typings.sharepoint.SP.Social.SocialFeedType.likes with Double = js.native
    
    /* 1 */ val news: typings.sharepoint.SP.Social.SocialFeedType.news with Double = js.native
    
    /* 0 */ val personal: typings.sharepoint.SP.Social.SocialFeedType.personal with Double = js.native
    
    /* 2 */ val timeline: typings.sharepoint.SP.Social.SocialFeedType.timeline with Double = js.native
  }
  
  /** Provides properties and methods for managing a user's list of followed actors.
    Actors can be users, documents, sites, and tags. */
  @JSGlobal("SP.Social.SocialFollowingManager")
  @js.native
  class SocialFollowingManager protected ()
    extends typings.sharepoint.SP.Social.SocialFollowingManager {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext) = this()
  }
  
  /** Defines a link that includes a URI and text representation.
    This class is used to represent the location of a web site.  */
  @JSGlobal("SP.Social.SocialLink")
  @js.native
  class SocialLink ()
    extends typings.sharepoint.SP.Social.SocialLink
  
  /** Specifies a post read from the server. */
  @JSGlobal("SP.Social.SocialPost")
  @js.native
  class SocialPost ()
    extends typings.sharepoint.SP.Social.SocialPost
  
  /** Specifies a set of users, documents, sites, and tags by an index into the SocialThreadActors array  */
  @JSGlobal("SP.Social.SocialPostActorInfo")
  @js.native
  class SocialPostActorInfo ()
    extends typings.sharepoint.SP.Social.SocialPostActorInfo
  
  /** Specifies attributes of the post, such as whether the current user can like or delete the post. */
  @JSGlobal("SP.Social.SocialPostAttributes")
  @js.native
  object SocialPostAttributes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialPostAttributes with Double] = js.native
    
    /* 2 */ val canDelete: typings.sharepoint.SP.Social.SocialPostAttributes.canDelete with Double = js.native
    
    /* 5 */ val canFollowUp: typings.sharepoint.SP.Social.SocialPostAttributes.canFollowUp with Double = js.native
    
    /* 1 */ val canLike: typings.sharepoint.SP.Social.SocialPostAttributes.canLike with Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.Social.SocialPostAttributes.none with Double = js.native
    
    /* 3 */ val useAuthorImage: typings.sharepoint.SP.Social.SocialPostAttributes.useAuthorImage with Double = js.native
    
    /* 4 */ val useSmallImage: typings.sharepoint.SP.Social.SocialPostAttributes.useSmallImage with Double = js.native
  }
  
  /** Specifies the content of a post in the SocialFeedManager.createPost method.
    The post consists of a text message, which can optionally include social tags, mentions of users, and links. */
  @JSGlobal("SP.Social.SocialPostCreationData")
  @js.native
  class SocialPostCreationData ()
    extends typings.sharepoint.SP.Social.SocialPostCreationData
  
  /** Provides additional information about server-generated posts.
    This type can only be specified in a server-to-server call. */
  @JSGlobal("SP.Social.SocialPostDefinitionData")
  @js.native
  class SocialPostDefinitionData ()
    extends typings.sharepoint.SP.Social.SocialPostDefinitionData
  
  /** Specifies an item to be inserted in a post by replacing a token in the post definition.
    This type can only be specified in a server-to-server call. */
  @JSGlobal("SP.Social.SocialPostDefinitionDataItem")
  @js.native
  class SocialPostDefinitionDataItem ()
    extends typings.sharepoint.SP.Social.SocialPostDefinitionDataItem
  
  /** Defines the type of item being specified in the SocialPostDefinitionDataItem.
    This type is only available in server-to-server calls. */
  @JSGlobal("SP.Social.SocialPostDefinitionDataItemType")
  @js.native
  object SocialPostDefinitionDataItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialPostDefinitionDataItemType with Double] = js.native
    
    /* 2 */ val document: typings.sharepoint.SP.Social.SocialPostDefinitionDataItemType.document with Double = js.native
    
    /* 5 */ val link: typings.sharepoint.SP.Social.SocialPostDefinitionDataItemType.link with Double = js.native
    
    /* 3 */ val site: typings.sharepoint.SP.Social.SocialPostDefinitionDataItemType.site with Double = js.native
    
    /* 4 */ val tag: typings.sharepoint.SP.Social.SocialPostDefinitionDataItemType.tag with Double = js.native
    
    /* 0 */ val text: typings.sharepoint.SP.Social.SocialPostDefinitionDataItemType.text with Double = js.native
    
    /* 1 */ val user: typings.sharepoint.SP.Social.SocialPostDefinitionDataItemType.user with Double = js.native
  }
  
  /** Specifies a reference to a post in another thread.
    The referenced post can be a post with a tag, a post that is liked, a post that mentions a user, or a post that is a reply. */
  @JSGlobal("SP.Social.SocialPostReference")
  @js.native
  class SocialPostReference ()
    extends typings.sharepoint.SP.Social.SocialPostReference
  
  @JSGlobal("SP.Social.SocialPostType")
  @js.native
  object SocialPostType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialPostType with Double] = js.native
    
    /* 1 */ val reply: typings.sharepoint.SP.Social.SocialPostType.reply with Double = js.native
    
    /* 0 */ val root: typings.sharepoint.SP.Social.SocialPostType.root with Double = js.native
  }
  
  /** Specifies a status or error code. */
  @JSGlobal("SP.Social.SocialStatusCode")
  @js.native
  object SocialStatusCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialStatusCode with Double] = js.native
    
    /* 0 */ val OK: typings.sharepoint.SP.Social.SocialStatusCode.OK with Double = js.native
    
    /* 2 */ val accessDenied: typings.sharepoint.SP.Social.SocialStatusCode.accessDenied with Double = js.native
    
    /* 14 */ val attachmentError: typings.sharepoint.SP.Social.SocialStatusCode.attachmentError with Double = js.native
    
    /* 7 */ val cacheReadError: typings.sharepoint.SP.Social.SocialStatusCode.cacheReadError with Double = js.native
    
    /* 8 */ val cacheUpdateError: typings.sharepoint.SP.Social.SocialStatusCode.cacheUpdateError with Double = js.native
    
    /* 12 */ val cannotCreatePersonalSite: typings.sharepoint.SP.Social.SocialStatusCode.cannotCreatePersonalSite with Double = js.native
    
    /* 10 */ val failedToCreatePersonalSite: typings.sharepoint.SP.Social.SocialStatusCode.failedToCreatePersonalSite with Double = js.native
    
    /* 16 */ val featureDisabled: typings.sharepoint.SP.Social.SocialStatusCode.featureDisabled with Double = js.native
    
    /* 6 */ val internalError: typings.sharepoint.SP.Social.SocialStatusCode.internalError with Double = js.native
    
    /* 4 */ val invalidOperation: typings.sharepoint.SP.Social.SocialStatusCode.invalidOperation with Double = js.native
    
    /* 1 */ val invalidRequest: typings.sharepoint.SP.Social.SocialStatusCode.invalidRequest with Double = js.native
    
    /* 3 */ val itemNotFound: typings.sharepoint.SP.Social.SocialStatusCode.itemNotFound with Double = js.native
    
    /* 5 */ val itemNotModified: typings.sharepoint.SP.Social.SocialStatusCode.itemNotModified with Double = js.native
    
    /* 13 */ val limitReached: typings.sharepoint.SP.Social.SocialStatusCode.limitReached with Double = js.native
    
    /* 11 */ val notAuthorizedToCreatePersonalSite: typings.sharepoint.SP.Social.SocialStatusCode.notAuthorizedToCreatePersonalSite with Double = js.native
    
    /* 15 */ val partialData: typings.sharepoint.SP.Social.SocialStatusCode.partialData with Double = js.native
    
    /* 9 */ val personalSiteNotFound: typings.sharepoint.SP.Social.SocialStatusCode.personalSiteNotFound with Double = js.native
  }
  
  /** Specifies a thread that is stored on the server.
    The thread contains a root post and zero or more reply posts. */
  @JSGlobal("SP.Social.SocialThread")
  @js.native
  class SocialThread ()
    extends typings.sharepoint.SP.Social.SocialThread
  
  /** Specifies properties of the thread. */
  @JSGlobal("SP.Social.SocialThreadAttributes")
  @js.native
  object SocialThreadAttributes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialThreadAttributes with Double] = js.native
    
    /* 3 */ val canLock: typings.sharepoint.SP.Social.SocialThreadAttributes.canLock with Double = js.native
    
    /* 2 */ val canReply: typings.sharepoint.SP.Social.SocialThreadAttributes.canReply with Double = js.native
    
    /* 1 */ val isDigest: typings.sharepoint.SP.Social.SocialThreadAttributes.isDigest with Double = js.native
    
    /* 4 */ val isLocked: typings.sharepoint.SP.Social.SocialThreadAttributes.isLocked with Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.Social.SocialThreadAttributes.none with Double = js.native
    
    /* 5 */ val replyLimitReached: typings.sharepoint.SP.Social.SocialThreadAttributes.replyLimitReached with Double = js.native
  }
  
  @JSGlobal("SP.Social.SocialThreadType")
  @js.native
  object SocialThreadType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialThreadType with Double] = js.native
    
    /* 1 */ val likeReference: typings.sharepoint.SP.Social.SocialThreadType.likeReference with Double = js.native
    
    /* 3 */ val mentionReference: typings.sharepoint.SP.Social.SocialThreadType.mentionReference with Double = js.native
    
    /* 0 */ val normal: typings.sharepoint.SP.Social.SocialThreadType.normal with Double = js.native
    
    /* 2 */ val replyReference: typings.sharepoint.SP.Social.SocialThreadType.replyReference with Double = js.native
    
    /* 4 */ val tagReference: typings.sharepoint.SP.Social.SocialThreadType.tagReference with Double = js.native
  }
}
