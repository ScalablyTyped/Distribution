package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PermissionKind extends js.Object

/** Specifies permissions that are used to define user roles. Represents SPBasePermissions class. */
@JSGlobal("SP.PermissionKind")
@js.native
object PermissionKind extends js.Object {
  /** Add, change, or delete HTML pages or Web Part Pages, and edit the Web site using a SharePoint Foundation?compatible editor. */
  @js.native
  sealed trait addAndCustomizePages
    extends sharepointLib.SPNs.PermissionKind
  
  /** Add or remove personal Web Parts on a Web Part Page. */
  @js.native
  sealed trait addDelPrivateWebParts
    extends sharepointLib.SPNs.PermissionKind
  
  /** Add items to lists, add documents to document libraries, and add Web discussion comments. */
  @js.native
  sealed trait addListItems
    extends sharepointLib.SPNs.PermissionKind
  
  /** Make content of a list or document library retrieveable for anonymous users through SharePoint search. The list permissions in the site do not change.  */
  @js.native
  sealed trait anonymousSearchAccessList
    extends sharepointLib.SPNs.PermissionKind
  
  /** Content of lists and document libraries in the Web site will be retrieveable for anonymous users through SharePoint search if the list or document library has AnonymousSearchAccessList set.  */
  @js.native
  sealed trait anonymousSearchAccessWebLists
    extends sharepointLib.SPNs.PermissionKind
  
  /** Apply a style sheet (.css file) to the Web site. */
  @js.native
  sealed trait applyStyleSheets
    extends sharepointLib.SPNs.PermissionKind
  
  /** Apply a theme or borders to the entire Web site. */
  @js.native
  sealed trait applyThemeAndBorder
    extends sharepointLib.SPNs.PermissionKind
  
  /** Approve a minor version of a list item or document. */
  @js.native
  sealed trait approveItems
    extends sharepointLib.SPNs.PermissionKind
  
  /** Enumerate files and folders in a Web site using Microsoft Office SharePoint Designer 2007 and WebDAV interfaces. */
  @js.native
  sealed trait browseDirectories
    extends sharepointLib.SPNs.PermissionKind
  
  /** View information about users of the Web site. */
  @js.native
  sealed trait browseUserInfo
    extends sharepointLib.SPNs.PermissionKind
  
  /** Discard or check in a document which is checked out to another user. */
  @js.native
  sealed trait cancelCheckout
    extends sharepointLib.SPNs.PermissionKind
  
  /** Create e-mail alerts. */
  @js.native
  sealed trait createAlerts
    extends sharepointLib.SPNs.PermissionKind
  
  /** Create a group of users that can be used anywhere within the site collection. */
  @js.native
  sealed trait createGroups
    extends sharepointLib.SPNs.PermissionKind
  
  /** Create a Web site using Self-Service Site Creation. */
  @js.native
  sealed trait createSSCSite
    extends sharepointLib.SPNs.PermissionKind
  
  /** Delete items from a list, documents from a document library, and Web discussion comments in documents. */
  @js.native
  sealed trait deleteListItems
    extends sharepointLib.SPNs.PermissionKind
  
  /** Delete past versions of a list item or document. */
  @js.native
  sealed trait deleteVersions
    extends sharepointLib.SPNs.PermissionKind
  
  /** Edit items in lists, edit documents in document libraries, edit Web discussion comments in documents, and customize Web Part Pages in document libraries. */
  @js.native
  sealed trait editListItems
    extends sharepointLib.SPNs.PermissionKind
  
  /** Allows a user to change his or her user information, such as adding a picture. */
  @js.native
  sealed trait editMyUserInfo
    extends sharepointLib.SPNs.PermissionKind
  
  /** Has no permissions on the Web site. Not available through the user interface. */
  @js.native
  sealed trait emptyMask
    extends sharepointLib.SPNs.PermissionKind
  
  /** Enumerate permissions on the Web site, list, folder, document, or list item. */
  @js.native
  sealed trait enumeratePermissions
    extends sharepointLib.SPNs.PermissionKind
  
  /** Has all permissions on the Web site. Not available through the user interface. */
  @js.native
  sealed trait fullMask
    extends sharepointLib.SPNs.PermissionKind
  
  /** Manage alerts for all users of the Web site. */
  @js.native
  sealed trait manageAlerts
    extends sharepointLib.SPNs.PermissionKind
  
  /** Create and delete lists, add or remove columns in a list, and add or remove public views of a list. */
  @js.native
  sealed trait manageLists
    extends sharepointLib.SPNs.PermissionKind
  
  /** Create and change permission levels on the Web site and assign permissions to users and groups. */
  @js.native
  sealed trait managePermissions
    extends sharepointLib.SPNs.PermissionKind
  
  /** Create, change, and delete personal views of lists. */
  @js.native
  sealed trait managePersonalViews
    extends sharepointLib.SPNs.PermissionKind
  
  /** Create subsites such as team sites, Meeting Workspace sites, and Document Workspace sites.  */
  @js.native
  sealed trait manageSubwebs
    extends sharepointLib.SPNs.PermissionKind
  
  /** Grant the ability to perform all administration tasks for the Web site as well as manage content. Activate, deactivate, or edit properties of Web site scoped Features through the object model or through the user interface (UI). When granted on the root Web site of a site collection, activate, deactivate, or edit properties of site collection scoped Features through the object model. To browse to the Site Collection Features page and activate or deactivate site collection scoped Features through the UI, you must be a site collection administrator. */
  @js.native
  sealed trait manageWeb
    extends sharepointLib.SPNs.PermissionKind
  
  /** Allow users to open a Web site, list, or folder to access items inside that container. */
  @js.native
  sealed trait open
    extends sharepointLib.SPNs.PermissionKind
  
  /** View the source of documents with server-side file handlers. */
  @js.native
  sealed trait openItems
    extends sharepointLib.SPNs.PermissionKind
  
  /** Update Web Parts to display personalized information. */
  @js.native
  sealed trait updatePersonalWebParts
    extends sharepointLib.SPNs.PermissionKind
  
  /** Use features that launch client applications; otherwise, users must work on documents locally and upload changes.  */
  @js.native
  sealed trait useClientIntegration
    extends sharepointLib.SPNs.PermissionKind
  
  /** Use SOAP, WebDAV, or Microsoft Office SharePoint Designer 2007 interfaces to access the Web site. */
  @js.native
  sealed trait useRemoteAPIs
    extends sharepointLib.SPNs.PermissionKind
  
  /** View forms, views, and application pages, and enumerate lists. */
  @js.native
  sealed trait viewFormPages
    extends sharepointLib.SPNs.PermissionKind
  
  /** View items in lists, documents in document libraries, and view Web discussion comments. */
  @js.native
  sealed trait viewListItems
    extends sharepointLib.SPNs.PermissionKind
  
  /** View pages in a Web site. */
  @js.native
  sealed trait viewPages
    extends sharepointLib.SPNs.PermissionKind
  
  /** View reports on Web site usage. */
  @js.native
  sealed trait viewUsageData
    extends sharepointLib.SPNs.PermissionKind
  
  /** View past versions of a list item or document. */
  @js.native
  sealed trait viewVersions
    extends sharepointLib.SPNs.PermissionKind
  
  val addAndCustomizePages: addAndCustomizePages with java.lang.String = js.native
  val addDelPrivateWebParts: addDelPrivateWebParts with java.lang.String = js.native
  val addListItems: addListItems with java.lang.String = js.native
  val anonymousSearchAccessList: anonymousSearchAccessList with java.lang.String = js.native
  val anonymousSearchAccessWebLists: anonymousSearchAccessWebLists with java.lang.String = js.native
  val applyStyleSheets: applyStyleSheets with java.lang.String = js.native
  val applyThemeAndBorder: applyThemeAndBorder with java.lang.String = js.native
  val approveItems: approveItems with java.lang.String = js.native
  val browseDirectories: browseDirectories with java.lang.String = js.native
  val browseUserInfo: browseUserInfo with java.lang.String = js.native
  val cancelCheckout: cancelCheckout with java.lang.String = js.native
  val createAlerts: createAlerts with java.lang.String = js.native
  val createGroups: createGroups with java.lang.String = js.native
  val createSSCSite: createSSCSite with java.lang.String = js.native
  val deleteListItems: deleteListItems with java.lang.String = js.native
  val deleteVersions: deleteVersions with java.lang.String = js.native
  val editListItems: editListItems with java.lang.String = js.native
  val editMyUserInfo: editMyUserInfo with java.lang.String = js.native
  val emptyMask: emptyMask with java.lang.String = js.native
  val enumeratePermissions: enumeratePermissions with java.lang.String = js.native
  val fullMask: fullMask with java.lang.String = js.native
  val manageAlerts: manageAlerts with java.lang.String = js.native
  val manageLists: manageLists with java.lang.String = js.native
  val managePermissions: managePermissions with java.lang.String = js.native
  val managePersonalViews: managePersonalViews with java.lang.String = js.native
  val manageSubwebs: manageSubwebs with java.lang.String = js.native
  val manageWeb: manageWeb with java.lang.String = js.native
  val open: open with java.lang.String = js.native
  val openItems: openItems with java.lang.String = js.native
  val updatePersonalWebParts: updatePersonalWebParts with java.lang.String = js.native
  val useClientIntegration: useClientIntegration with java.lang.String = js.native
  val useRemoteAPIs: useRemoteAPIs with java.lang.String = js.native
  val viewFormPages: viewFormPages with java.lang.String = js.native
  val viewListItems: viewListItems with java.lang.String = js.native
  val viewPages: viewPages with java.lang.String = js.native
  val viewUsageData: viewUsageData with java.lang.String = js.native
  val viewVersions: viewVersions with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.PermissionKind with java.lang.String] = js.native
}

