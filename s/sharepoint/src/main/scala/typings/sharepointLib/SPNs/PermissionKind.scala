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
  
  /* 16 */ val addAndCustomizePages: addAndCustomizePages with scala.Double = js.native
  /* 26 */ val addDelPrivateWebParts: addDelPrivateWebParts with scala.Double = js.native
  /* 2 */ val addListItems: addListItems with scala.Double = js.native
  /* 13 */ val anonymousSearchAccessList: anonymousSearchAccessList with scala.Double = js.native
  /* 29 */ val anonymousSearchAccessWebLists: anonymousSearchAccessWebLists with scala.Double = js.native
  /* 18 */ val applyStyleSheets: applyStyleSheets with scala.Double = js.native
  /* 17 */ val applyThemeAndBorder: applyThemeAndBorder with scala.Double = js.native
  /* 5 */ val approveItems: approveItems with scala.Double = js.native
  /* 24 */ val browseDirectories: browseDirectories with scala.Double = js.native
  /* 25 */ val browseUserInfo: browseUserInfo with scala.Double = js.native
  /* 9 */ val cancelCheckout: cancelCheckout with scala.Double = js.native
  /* 33 */ val createAlerts: createAlerts with scala.Double = js.native
  /* 22 */ val createGroups: createGroups with scala.Double = js.native
  /* 20 */ val createSSCSite: createSSCSite with scala.Double = js.native
  /* 4 */ val deleteListItems: deleteListItems with scala.Double = js.native
  /* 8 */ val deleteVersions: deleteVersions with scala.Double = js.native
  /* 3 */ val editListItems: editListItems with scala.Double = js.native
  /* 34 */ val editMyUserInfo: editMyUserInfo with scala.Double = js.native
  /* 0 */ val emptyMask: emptyMask with scala.Double = js.native
  /* 35 */ val enumeratePermissions: enumeratePermissions with scala.Double = js.native
  /* 36 */ val fullMask: fullMask with scala.Double = js.native
  /* 32 */ val manageAlerts: manageAlerts with scala.Double = js.native
  /* 11 */ val manageLists: manageLists with scala.Double = js.native
  /* 23 */ val managePermissions: managePermissions with scala.Double = js.native
  /* 10 */ val managePersonalViews: managePersonalViews with scala.Double = js.native
  /* 21 */ val manageSubwebs: manageSubwebs with scala.Double = js.native
  /* 28 */ val manageWeb: manageWeb with scala.Double = js.native
  /* 14 */ val open: open with scala.Double = js.native
  /* 6 */ val openItems: openItems with scala.Double = js.native
  /* 27 */ val updatePersonalWebParts: updatePersonalWebParts with scala.Double = js.native
  /* 30 */ val useClientIntegration: useClientIntegration with scala.Double = js.native
  /* 31 */ val useRemoteAPIs: useRemoteAPIs with scala.Double = js.native
  /* 12 */ val viewFormPages: viewFormPages with scala.Double = js.native
  /* 1 */ val viewListItems: viewListItems with scala.Double = js.native
  /* 15 */ val viewPages: viewPages with scala.Double = js.native
  /* 19 */ val viewUsageData: viewUsageData with scala.Double = js.native
  /* 7 */ val viewVersions: viewVersions with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.PermissionKind with scala.Double] = js.native
}

