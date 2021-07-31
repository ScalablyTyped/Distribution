package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SP.UserProfiles.FollowResultType
import typings.sharepoint.SP.UserProfiles.FollowedItemType
import typings.sharepoint.SP.UserProfiles.HashTagCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UserProfiles {
  
  /** Specifies types of changes made in the user profile store. */
  @JSGlobal("SP.UserProfiles.ChangeTypes")
  @js.native
  object ChangeTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.UserProfiles.ChangeTypes & Double] = js.native
    
    /* 1 */ val add: typings.sharepoint.SP.UserProfiles.ChangeTypes.add & Double = js.native
    
    /* 5 */ val all: typings.sharepoint.SP.UserProfiles.ChangeTypes.all & Double = js.native
    
    /* 4 */ val metadata: typings.sharepoint.SP.UserProfiles.ChangeTypes.metadata & Double = js.native
    
    /* 2 */ val modify: typings.sharepoint.SP.UserProfiles.ChangeTypes.modify & Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.UserProfiles.ChangeTypes.none & Double = js.native
    
    /* 3 */ val remove: typings.sharepoint.SP.UserProfiles.ChangeTypes.remove & Double = js.native
  }
  
  /** Returns information about a request to follow an item. */
  @JSGlobal("SP.UserProfiles.FollowResult")
  @js.native
  class FollowResult ()
    extends StObject
       with typings.sharepoint.SP.UserProfiles.FollowResult {
    
    /* CompleteClass */
    override def customFromJson(obj: js.Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: js.Any): Unit = js.native
    
    /** Contains the item being followed. */
    /* CompleteClass */
    override def get_item(): typings.sharepoint.SP.UserProfiles.FollowedItem = js.native
    
    /** Provides information about the attempt to follow an item. */
    /* CompleteClass */
    override def get_resultType(): FollowResultType = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @JSGlobal("SP.UserProfiles.FollowResultType")
  @js.native
  object FollowResultType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.UserProfiles.FollowResultType & Double] = js.native
    
    /* 4 */ val failed: typings.sharepoint.SP.UserProfiles.FollowResultType.failed & Double = js.native
    
    /* 1 */ val followed: typings.sharepoint.SP.UserProfiles.FollowResultType.followed & Double = js.native
    
    /* 3 */ val hitFollowLimit: typings.sharepoint.SP.UserProfiles.FollowResultType.hitFollowLimit & Double = js.native
    
    /* 2 */ val refollowed: typings.sharepoint.SP.UserProfiles.FollowResultType.refollowed & Double = js.native
    
    /* 0 */ val unknown: typings.sharepoint.SP.UserProfiles.FollowResultType.unknown & Double = js.native
  }
  
  /** Provides access to followed content items. */
  @JSGlobal("SP.UserProfiles.FollowedContent")
  @js.native
  class FollowedContent protected ()
    extends StObject
       with typings.sharepoint.SP.UserProfiles.FollowedContent {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext) = this()
  }
  object FollowedContent {
    
    @JSGlobal("SP.UserProfiles.FollowedContent")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def newObject(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.UserProfiles.FollowedContent = ^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SP.UserProfiles.FollowedContent]
  }
  
  @JSGlobal("SP.UserProfiles.FollowedContentExceptionType")
  @js.native
  object FollowedContentExceptionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType & Double] = js.native
    
    /* 5 */ val followLimitReached: typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType.followLimitReached & Double = js.native
    
    /* 8 */ val internalError: typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType.internalError & Double = js.native
    
    /* 2 */ val invalidQueryString: typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType.invalidQueryString & Double = js.native
    
    /* 3 */ val invalidSubtypeValue: typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType.invalidSubtypeValue & Double = js.native
    
    /* 0 */ val itemAlreadyExists: typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType.itemAlreadyExists & Double = js.native
    
    /* 1 */ val itemDoesNotExist: typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType.itemDoesNotExist & Double = js.native
    
    /* 4 */ val unsupportedItemType: typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType.unsupportedItemType & Double = js.native
    
    /* 7 */ val unsupportedSite: typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType.unsupportedSite & Double = js.native
    
    /* 6 */ val untrustedSource: typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType.untrustedSource & Double = js.native
  }
  
  @JSGlobal("SP.UserProfiles.FollowedContentQueryOptions")
  @js.native
  object FollowedContentQueryOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.UserProfiles.FollowedContentQueryOptions & Double] = js.native
    
    /* 6 */ val all: typings.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.all & Double = js.native
    
    /* 5 */ val defaultOptions: typings.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.defaultOptions & Double = js.native
    
    /* 2 */ val documents: typings.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.documents & Double = js.native
    
    /* 3 */ val hidden: typings.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.hidden & Double = js.native
    
    /* 4 */ val nonFeed: typings.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.nonFeed & Double = js.native
    
    /* 1 */ val sites: typings.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.sites & Double = js.native
    
    /* 0 */ val unset: typings.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.unset & Double = js.native
  }
  
  /** Represents a followed content resource. */
  @JSGlobal("SP.UserProfiles.FollowedItem")
  @js.native
  class FollowedItem ()
    extends StObject
       with typings.sharepoint.SP.UserProfiles.FollowedItem {
    
    /* CompleteClass */
    override def customFromJson(obj: js.Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: js.Any): Unit = js.native
    
    /** Additional metadata associated with this item */
    /* CompleteClass */
    override def get_data(): StringDictionary[js.Any] = js.native
    
    /** Specifies the type of the file if this item is a file. Otherwise, this property is the empty string. */
    /* CompleteClass */
    override def get_fileType(): String = js.native
    
    /** Provides information about the application that opens a followed document. */
    /* CompleteClass */
    override def get_fileTypeProgid(): String = js.native
    
    /** Specifies additional information about the followed item.
      The server stores the data so that it can return it to the client. */
    /* CompleteClass */
    override def get_flags(): String = js.native
    
    /** Indicates whether the followed site has a feed. */
    /* CompleteClass */
    override def get_hasFeed(): Boolean = js.native
    
    /** Specifies if the item is hidden from the user. If true this item will not generate activity in the user's feed. */
    /* CompleteClass */
    override def get_hidden(): Boolean = js.native
    
    /** Specifies the URL of an icon to represent this item. */
    /* CompleteClass */
    override def get_iconUrl(): String = js.native
    
    /** Specifies the identification for this item in the Content database. */
    /* CompleteClass */
    override def get_itemId(): Double = js.native
    
    /** Specifies the type of this item. */
    /* CompleteClass */
    override def get_itemType(): FollowedItemType = js.native
    
    /** The ListId property specifies the list identification (GUID) for this item in the Content database if this item is a list or the list identification for its parent list.
      If the ItemType is Document, this property is specified, but if the ItemType is Site, then this property is not specified. */
    /* CompleteClass */
    override def get_listId(): String = js.native
    
    /** Specifies the URL of this item's parent list or web. */
    /* CompleteClass */
    override def get_parentUrl(): String = js.native
    
    /** Provides information about the followed document to the application that opens it. */
    /* CompleteClass */
    override def get_serverUrlProgid(): String = js.native
    
    /** Specifies the site identification (GUID) in the Content database for this item if this item is a site, or for its parent site if this item is not a site. */
    /* CompleteClass */
    override def get_siteId(): String = js.native
    
    /** Specifies the subtype of this item.
      If the ItemType is Site, the Subtype specifies the web template identification.
      If the ItemType is Document, the Subtype has a value of 1. */
    /* CompleteClass */
    override def get_subtype(): Double = js.native
    
    /** Specifies the item of this item */
    /* CompleteClass */
    override def get_title(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /** Specifies the GUID for this item in the Content database. */
    /* CompleteClass */
    override def get_uniqueId(): typings.sharepoint.SP.Guid = js.native
    
    /** Specifies the URL of this item. */
    /* CompleteClass */
    override def get_url(): String = js.native
    
    /** Specifies the site identification (GUID) in the Content database for this item if it is a site, or the identification of its parent site if this item is a document. */
    /* CompleteClass */
    override def get_webId(): typings.sharepoint.SP.Guid = js.native
    
    /** Additional metadata associated with this item */
    /* CompleteClass */
    override def set_data(value: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
    
    /** Specifies the type of the file if this item is a file. Otherwise, this property is the empty string. */
    /* CompleteClass */
    override def set_fileType(value: String): String = js.native
    
    /** Provides information about the application that opens a followed document. */
    /* CompleteClass */
    override def set_fileTypeProgid(value: String): String = js.native
    
    /** Specifies additional information about the followed item.
      The server stores the data so that it can return it to the client. */
    /* CompleteClass */
    override def set_flags(value: String): String = js.native
    
    /** Indicates whether the followed site has a feed. */
    /* CompleteClass */
    override def set_hasFeed(value: Boolean): Boolean = js.native
    
    /** Specifies if the item is hidden from the user. If true this item will not generate activity in the user's feed. */
    /* CompleteClass */
    override def set_hidden(value: Boolean): Boolean = js.native
    
    /** Specifies the URL of an icon to represent this item. */
    /* CompleteClass */
    override def set_iconUrl(value: String): String = js.native
    
    /** Specifies the identification for this item in the Content database. */
    /* CompleteClass */
    override def set_itemId(value: Double): Double = js.native
    
    /** Specifies the type of this item. */
    /* CompleteClass */
    override def set_itemType(value: FollowedItemType): FollowedItemType = js.native
    
    /** The ListId property specifies the list identification (GUID) for this item in the Content database if this item is a list or the list identification for its parent list.
      If the ItemType is Document, this property is specified, but if the ItemType is Site, then this property is not specified. */
    /* CompleteClass */
    override def set_listId(value: String): String = js.native
    
    /** Specifies the URL of this item's parent list or web. */
    /* CompleteClass */
    override def set_parentUrl(value: String): String = js.native
    
    /** Provides information about the followed document to the application that opens it. */
    /* CompleteClass */
    override def set_serverUrlProgid(value: String): String = js.native
    
    /** Specifies the site identification (GUID) in the Content database for this item if this item is a site, or for its parent site if this item is not a site. */
    /* CompleteClass */
    override def set_siteId(value: String): String = js.native
    
    /** Specifies the subtype of this item.
      If the ItemType is Site, the Subtype specifies the web template identification.
      If the ItemType is Document, the Subtype has a value of 1. */
    /* CompleteClass */
    override def set_subtype(value: Double): Double = js.native
    
    /** Specifies the item of this item */
    /* CompleteClass */
    override def set_title(value: String): String = js.native
    
    /** Specifies the GUID for this item in the Content database. */
    /* CompleteClass */
    override def set_uniqueId(value: typings.sharepoint.SP.Guid): typings.sharepoint.SP.Guid = js.native
    
    /** Specifies the URL of this item. */
    /* CompleteClass */
    override def set_url(value: String): String = js.native
    
    /** Specifies the site identification (GUID) in the Content database for this item if it is a site, or the identification of its parent site if this item is a document. */
    /* CompleteClass */
    override def set_webId(value: typings.sharepoint.SP.Guid): js.Any = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  /** Contains additional data that can be attached to a FollowedItem object */
  @JSGlobal("SP.UserProfiles.FollowedItemData")
  @js.native
  class FollowedItemData ()
    extends StObject
       with typings.sharepoint.SP.UserProfiles.FollowedItemData
  
  @JSGlobal("SP.UserProfiles.FollowedItemType")
  @js.native
  object FollowedItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.UserProfiles.FollowedItemType & Double] = js.native
    
    /* 3 */ val all: typings.sharepoint.SP.UserProfiles.FollowedItemType.all & Double = js.native
    
    /* 1 */ val document: typings.sharepoint.SP.UserProfiles.FollowedItemType.document & Double = js.native
    
    /* 2 */ val site: typings.sharepoint.SP.UserProfiles.FollowedItemType.site & Double = js.native
    
    /* 0 */ val unknown: typings.sharepoint.SP.UserProfiles.FollowedItemType.unknown & Double = js.native
  }
  
  @JSGlobal("SP.UserProfiles.FollowedStatus")
  @js.native
  object FollowedStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.UserProfiles.FollowedStatus & Double] = js.native
    
    /* 0 */ val followed: typings.sharepoint.SP.UserProfiles.FollowedStatus.followed & Double = js.native
    
    /* 2 */ val notFollowable: typings.sharepoint.SP.UserProfiles.FollowedStatus.notFollowable & Double = js.native
    
    /* 1 */ val notFollowed: typings.sharepoint.SP.UserProfiles.FollowedStatus.notFollowed & Double = js.native
  }
  
  @JSGlobal("SP.UserProfiles.HashTag")
  @js.native
  class HashTag ()
    extends StObject
       with typings.sharepoint.SP.UserProfiles.HashTag {
    
    /* CompleteClass */
    override def customFromJson(obj: js.Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def get_name(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def get_useCount(): Double = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  /** Specifies types of user-related objects that can be changed in the user profile store. */
  @JSGlobal("SP.UserProfiles.ObjectTypes")
  @js.native
  object ObjectTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.UserProfiles.ObjectTypes & Double] = js.native
    
    /* 14 */ val all: typings.sharepoint.SP.UserProfiles.ObjectTypes.all & Double = js.native
    
    /* 3 */ val anniversary: typings.sharepoint.SP.UserProfiles.ObjectTypes.anniversary & Double = js.native
    
    /* 7 */ val colleague: typings.sharepoint.SP.UserProfiles.ObjectTypes.colleague & Double = js.native
    
    /* 11 */ val custom: typings.sharepoint.SP.UserProfiles.ObjectTypes.custom & Double = js.native
    
    /* 4 */ val dlMembership: typings.sharepoint.SP.UserProfiles.ObjectTypes.dlMembership & Double = js.native
    
    /* 2 */ val multiValueProperty: typings.sharepoint.SP.UserProfiles.ObjectTypes.multiValueProperty & Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.UserProfiles.ObjectTypes.none & Double = js.native
    
    /* 13 */ val organizationMembership: typings.sharepoint.SP.UserProfiles.ObjectTypes.organizationMembership & Double = js.native
    
    /* 12 */ val organizationProfile: typings.sharepoint.SP.UserProfiles.ObjectTypes.organizationProfile & Double = js.native
    
    /* 8 */ val personalizationSite: typings.sharepoint.SP.UserProfiles.ObjectTypes.personalizationSite & Double = js.native
    
    /* 6 */ val quickLink: typings.sharepoint.SP.UserProfiles.ObjectTypes.quickLink & Double = js.native
    
    /* 1 */ val singleValueProperty: typings.sharepoint.SP.UserProfiles.ObjectTypes.singleValueProperty & Double = js.native
    
    /* 5 */ val siteMembership: typings.sharepoint.SP.UserProfiles.ObjectTypes.siteMembership & Double = js.native
    
    /* 9 */ val userProfile: typings.sharepoint.SP.UserProfiles.ObjectTypes.userProfile & Double = js.native
    
    /* 10 */ val webLog: typings.sharepoint.SP.UserProfiles.ObjectTypes.webLog & Double = js.native
  }
  
  /** Provides methods for operations related to people.
    Note: The SocialFollowingManager object is the recommended object for performing Following People and Following Content tasks.
    However, PeopleManager provides some methods that SocialFollowingManager doesn't. */
  @JSGlobal("SP.UserProfiles.PeopleManager")
  @js.native
  class PeopleManager protected ()
    extends StObject
       with typings.sharepoint.SP.UserProfiles.PeopleManager {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext) = this()
  }
  object PeopleManager {
    
    @JSGlobal("SP.UserProfiles.PeopleManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def getTrendingTags(context: typings.sharepoint.SP.ClientRuntimeContext): HashTagCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("getTrendingTags")(context.asInstanceOf[js.Any]).asInstanceOf[HashTagCollection]
    
    /** Checks whether the first user is following the second user. */
    /* static member */
    @scala.inline
    def isFollowing(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      possibleFollowerAccountName: String,
      possibleFolloweeAccountName: String
    ): typings.sharepoint.SP.BooleanResult = (^.asInstanceOf[js.Dynamic].applyDynamic("isFollowing")(context.asInstanceOf[js.Any], possibleFollowerAccountName.asInstanceOf[js.Any], possibleFolloweeAccountName.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.BooleanResult]
  }
  
  /** Represents user properties. */
  @JSGlobal("SP.UserProfiles.PersonProperties")
  @js.native
  class PersonProperties ()
    extends StObject
       with typings.sharepoint.SP.UserProfiles.PersonProperties
  
  /** Specifies the capabilities of a personal site. */
  @JSGlobal("SP.UserProfiles.PersonalSiteCapabilities")
  @js.native
  object PersonalSiteCapabilities extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities & Double] = js.native
    
    /* 5 */ val education: typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.education & Double = js.native
    
    /* 6 */ val guest: typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.guest & Double = js.native
    
    /* 4 */ val myTasksDashboard: typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.myTasksDashboard & Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.none & Double = js.native
    
    /* 1 */ val profile: typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.profile & Double = js.native
    
    /* 2 */ val social: typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.social & Double = js.native
    
    /* 3 */ val storage: typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.storage & Double = js.native
  }
  
  /** Specifies an exception or status code for the state of a personal site instantiation. */
  @JSGlobal("SP.UserProfiles.PersonalSiteInstantiationState")
  @js.native
  object PersonalSiteInstantiationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState & Double] = js.native
    
    /* 2 */ val created: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.created & Double = js.native
    
    /* 3 */ val deleted: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.deleted & Double = js.native
    
    /* 1 */ val enqueued: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.enqueued & Double = js.native
    
    /* 11 */ val errorGeneralFailure: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorGeneralFailure & Double = js.native
    
    /* 13 */ val errorLanguageNotInstalled: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorLanguageNotInstalled & Double = js.native
    
    /* 12 */ val errorManagedPathDoesNotExist: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorManagedPathDoesNotExist & Double = js.native
    
    /* 14 */ val errorPartialCreate: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorPartialCreate & Double = js.native
    
    /* 15 */ val errorPersonalSiteAlreadyExists: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorPersonalSiteAlreadyExists & Double = js.native
    
    /* 16 */ val errorRootSiteNotPresent: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorRootSiteNotPresent & Double = js.native
    
    /* 17 */ val errorSelfServiceSiteCreateCallFailed: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorSelfServiceSiteCreateCallFailed & Double = js.native
    
    /* 9 */ val permissionsEmptyHostUrl: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsEmptyHostUrl & Double = js.native
    
    /* 4 */ val permissionsGeneralFailure: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsGeneralFailure & Double = js.native
    
    /* 10 */ val permissionsHostFailedToInitializePersonalSiteContext: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsHostFailedToInitializePersonalSiteContext & Double = js.native
    
    /* 8 */ val permissionsNoMySitesInPeopleLight: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsNoMySitesInPeopleLight & Double = js.native
    
    /* 7 */ val permissionsSelfServiceSiteCreationDisabled: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsSelfServiceSiteCreationDisabled & Double = js.native
    
    /* 5 */ val permissionsUPANotGranted: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsUPANotGranted & Double = js.native
    
    /* 6 */ val permissionsUserNotLicensed: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsUserNotLicensed & Double = js.native
    
    /* 0 */ val uninitialized: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.uninitialized & Double = js.native
  }
  
  /** Provides an alternate entry point to user profiles rather than calling methods directly. */
  @JSGlobal("SP.UserProfiles.ProfileLoader")
  @js.native
  class ProfileLoader ()
    extends StObject
       with typings.sharepoint.SP.UserProfiles.ProfileLoader
  object ProfileLoader {
    
    @JSGlobal("SP.UserProfiles.ProfileLoader")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def getProfileLoader(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.UserProfiles.ProfileLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfileLoader")(context.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SP.UserProfiles.ProfileLoader]
  }
  
  @JSGlobal("SP.UserProfiles.SocialDataStoreExceptionCode")
  @js.native
  object SocialDataStoreExceptionCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode & Double] = js.native
    
    /* 2 */ val cannotCreatePersonalSite: typings.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode.cannotCreatePersonalSite & Double = js.native
    
    /* 3 */ val noSocialFeatures: typings.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode.noSocialFeatures & Double = js.native
    
    /* 1 */ val personalSiteNotFound: typings.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode.personalSiteNotFound & Double = js.native
    
    /* 0 */ val socialListNotFound: typings.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode.socialListNotFound & Double = js.native
  }
  
  /** Represents a client-side user profile for a person.
    Note: The client-side UserProfile object provides methods you can use to create a personal site for the current user.
    However, it does not contain the user properties that the server-side UserProfile object contains.
    To access user properties from client-side code, use PeopleManager */
  @JSGlobal("SP.UserProfiles.UserProfile")
  @js.native
  class UserProfile ()
    extends StObject
       with typings.sharepoint.SP.UserProfiles.UserProfile
  
  /** Represents a set of user profile properties for a specified user. */
  @JSGlobal("SP.UserProfiles.UserProfilePropertiesForUser")
  @js.native
  class UserProfilePropertiesForUser protected ()
    extends StObject
       with typings.sharepoint.SP.UserProfiles.UserProfilePropertiesForUser {
    /** Creates new UserProfilePropertiesForUser object
      @param context Specifies the client context to use.
      @param accountName Specifies the user by account name.
      @param propertyNames Specifies an array of strings that specify the properties to retrieve. */
    def this(context: typings.sharepoint.SP.ClientContext, accountName: String, propertyNames: js.Array[String]) = this()
  }
}
