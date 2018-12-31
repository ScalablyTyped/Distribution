package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a list on a SharePoint Web site. */
@JSGlobal("SP.List")
@js.native
class List[T] () extends SecurableObject {
  /** Creates a new list item in the list. */
  def addItem(parameters: ListItemCreationInformation): ListItem[T] = js.native
  /** Deletes the list. */
  def deleteObject(): scala.Unit = js.native
  /** Returns the collection of changes from the change log that have occurred within the list, based on the specified query. */
  def getChanges(query: ChangeQuery): ChangeCollection = js.native
  /** Gets item by id. */
  def getItemById(id: scala.Double): ListItem[T] = js.native
  /** Returns collection of list items based on the specified CAML query. */
  def getItems(query: CamlQuery): ListItemCollection[T] = js.native
  /** Returns array of items describing changes since time specified in the query */
  def getListItemChangesSinceToken(query: ChangeLogItemQuery): js.Array[_] = js.native
  /** Returns a collection of lookup fields that use this list as a data source and that have FieldLookup.IsRelationship set to true. */
  def getRelatedFields(): RelatedFieldCollection = js.native
  /** This member is reserved for internal use and is not intended to be used directly from your code. */
  def getRelatedFieldsExtendedData(): RelatedFieldExtendedDataCollection = js.native
  /** Gets the effective permissions that a specified user has on the list. */
  def getUserEffectivePermissions(userName: java.lang.String): BasePermissions = js.native
  /** Returns the list view with the specified view identifier. */
  def getView(viewGuid: Guid): View = js.native
  /** Gets a value that specifies whether the list supports content types. */
  def get_allowContentTypes(): scala.Boolean = js.native
  /** Gets the list definition type on which the list is based. For lists based on OOTB list definitions, return value corresponds the SP.ListTemplateType enumeration. */
  def get_baseTemplate(): scala.Double = js.native
  /** Gets base type for the list. */
  def get_baseType(): BaseType = js.native
  /** Gets a value that specifies the override of the web application's BrowserFileHandling property at the list level. */
  def get_browserFileHandling(): BrowserFileHandling = js.native
  /** Gets the content types that are associated with the list. */
  def get_contentTypes(): ContentTypeCollection = js.native
  /** Gets a value that specifies whether content types are enabled for the list. */
  def get_contentTypesEnabled(): scala.Boolean = js.native
  /** Gets a value that specifies when the list was created. */
  def get_created(): microsoftDashAjaxLib.Date = js.native
  /** Gets the data source associated with the list, or null if the list is not a virtual list. */
  def get_dataSource(): ListDataSource = js.native
  /** Gets a value that specifies the default workflow identifier for content approval on the list. */
  def get_defaultContentApprovalWorkflowId(): Guid = js.native
  /** Gets a value that specifies the location of the default display form for the list. */
  def get_defaultDisplayFormUrl(): java.lang.String = js.native
  /** Gets a value that specifies the URL of the edit form to use for list items in the list. */
  def get_defaultEditFormUrl(): java.lang.String = js.native
  /** Gets a value that specifies the location of the default new form for the list. */
  def get_defaultNewFormUrl(): java.lang.String = js.native
  /** Gets default view for the list. */
  def get_defaultView(): View = js.native
  /** Get URL of the default view for the list. */
  def get_defaultViewUrl(): java.lang.String = js.native
  /** Gets a value that specifies the description of the list. */
  def get_description(): java.lang.String = js.native
  /** Gets a value that specifies the reading order of the list. */
  def get_direction(): java.lang.String = js.native
  /** Gets a value that specifies the server-relative URL of the document template for the list */
  def get_documentTemplateUrl(): java.lang.String = js.native
  /** Gets a value that specifies the minimum permission required to view minor versions and drafts within the list. */
  def get_draftVersionVisibility(): DraftVisibilityType = js.native
  /** Gets a value that specifies the effective permissions on the list that are assigned to the current user. */
  def get_effectiveBasePermissions(): BasePermissions = js.native
  /** Gets the effective base permissions for the current user, as they should be displayed in UI. This will only differ from EffectiveBasePermissions if ReadOnlyUI is set to true, and in all cases will be a subset of EffectiveBasePermissions. To put it another way, EffectiveBasePermissionsForUI will always be as or more restrictive than EffectiveBasePermissions. */
  def get_effectiveBasePermissionsForUI(): BasePermissions = js.native
  /** Gets a value that specifies whether list item attachments are enabled for the list. */
  def get_enableAttachments(): scala.Boolean = js.native
  /** Gets a value that specifies whether new list folders can be added to the list. */
  def get_enableFolderCreation(): scala.Boolean = js.native
  /** Gets a value that specifies whether minor versions are enabled for the list. */
  def get_enableMinorVersions(): scala.Boolean = js.native
  /** Gets a value that specifies whether content approval is enabled for the list. */
  def get_enableModeration(): scala.Boolean = js.native
  /** Gets a value that specifies whether historical versions of list items and documents can be created in the list */
  def get_enableVersioning(): scala.Boolean = js.native
  /** The entity type name. */
  def get_entityTypeName(): java.lang.String = js.native
  /** Gets collection of event receiver objects associated with the list. */
  def get_eventReceivers(): EventReceiverDefinitionCollection = js.native
  /** Gets a value that specifies the collection of all fields in the list. */
  def get_fields(): FieldCollection = js.native
  /** Gets a value that indicates whether forced checkout is enabled for the document library. */
  def get_forceCheckout(): scala.Boolean = js.native
  /** Gets collections of forms associated with the list. */
  def get_forms(): FormCollection = js.native
  /** Returns true if this is external list. */
  def get_hasExternalDataSource(): scala.Boolean = js.native
  /** Gets wherever the list is hidden */
  def get_hidden(): scala.Boolean = js.native
  /** Gets id of the list */
  def get_id(): Guid = js.native
  /** Gets a value that specifies the URI for the icon of the list */
  def get_imageUrl(): java.lang.String = js.native
  /** Settings of document library Information Rights Management (IRM)  */
  def get_informationRightsManagementSettings(): InformationRightsManagementSettings = js.native
  /** Gets a value that specifies whether Information Rights Management (IRM) is enabled for the list.  */
  def get_irmEnabled(): scala.Boolean = js.native
  /** Gets a value that specifies whether Information Rights Management (IRM) expiration is enabled for the list.  */
  def get_irmExpire(): scala.Boolean = js.native
  /** Gets a value that specifies whether Information Rights Management (IRM) rejection is enabled for the list.  */
  def get_irmReject(): scala.Boolean = js.native
  /** Indicates whether this list should be treated as a top level navigation object or not.  */
  def get_isApplicationList(): scala.Boolean = js.native
  /** Gets a value that specifies whether the list is a gallery. */
  def get_isCatalog(): scala.Boolean = js.native
  /** Gets a value that indicates whether the document library is a private list with restricted permissions, such as for Solutions.  */
  def get_isPrivate(): scala.Boolean = js.native
  /** Gets a value that indicates whether the list is designated as a default asset location for images or other files which the users upload to their wiki pages. */
  def get_isSiteAssetsLibrary(): scala.Boolean = js.native
  /** Gets a value that specifies the number of list items in the list */
  def get_itemCount(): scala.Double = js.native
  /** Gets a value that specifies the last time a list item was deleted from the list. */
  def get_lastItemDeletedDate(): microsoftDashAjaxLib.Date = js.native
  /** Gets a value that specifies the last time a list item, field, or property of the list was modified. */
  def get_lastItemModifiedDate(): microsoftDashAjaxLib.Date = js.native
  /** The entity type full name of the list item in the list. */
  def get_listItemEntityTypeFullName(): java.lang.String = js.native
  /** Gets a value that indicates whether the list in a Meeting Workspace site contains data for multiple meeting instances within the site */
  def get_multipleDataList(): scala.Boolean = js.native
  /** Gets a value that specifies that the crawler must not crawl the list */
  def get_noCrawl(): scala.Boolean = js.native
  /** Gets a value that specifies whether the list appears on the Quick Launch of the site */
  def get_onQuickLaunch(): scala.Boolean = js.native
  /** Gets a value that specifies the site that contains the list. */
  def get_parentWeb(): Web = js.native
  /** Gets a value that specifies the server-relative URL of the site that contains the list. */
  def get_parentWebUrl(): java.lang.String = js.native
  /** Gets the root folder that contains the files in the list and any related files. */
  def get_rootFolder(): Folder = js.native
  /** Gets a value that specifies the list schema of the list. */
  def get_schemaXml(): java.lang.String = js.native
  /** Gets a value that indicates whether folders can be created within the list. */
  def get_serverTemplateCanCreateFolders(): scala.Boolean = js.native
  /** Gets a value that specifies the feature identifier of the feature that contains the list schema for the list. */
  def get_templateFeatureId(): Guid = js.native
  /** Gets the list title. You can determine list URL from it's root folder URL. */
  def get_title(): java.lang.String = js.native
  /** Gets collection of custom actions associated with the list. */
  def get_userCustomActions(): UserCustomActionCollection = js.native
  /** Gets a value that specifies the data validation criteria for a list item. */
  def get_validationFormula(): java.lang.String = js.native
  /** Gets a value that specifies the error message returned when data validation fails for a list item. */
  def get_validationMessage(): java.lang.String = js.native
  /** Returns collection of views added to the list */
  def get_views(): ViewCollection = js.native
  /** Gets the collection of workflow association objects that represents all the workflows that are associated with the list. */
  def get_workflowAssociations(): sharepointLib.SPNs.WorkflowNs.WorkflowAssociationCollection = js.native
  /** Sends the list to the site recycle bin. */
  def recycle(): GuidResult = js.native
  /** Returns the data for the specified query view. */
  def renderListData(viewXml: java.lang.String): StringResult = js.native
  /** Returns json string which contains all information necessary for rendering the specified list form for the specified itemId. Mode is SP.ControlMode */
  def renderListFormData(itemId: scala.Double, formId: java.lang.String, mode: ControlMode): StringResult = js.native
  /** This member is reserved for internal use and is not intended to be used directly from your code. */
  def reserveListItemId(): IntResult = js.native
  /** First tries to find if the view already exists. Overwrite it if yes, add a new view if no. Then extract all the adhoc filter/sort info from the URL and build and update the view's xml Returns the url of the new/overwritten view.
    @param oldName The name of the view the user did the adhoc filter on (is currently on).
    @param newName The desired name the user typed
    @param privateView Boolean true when the user wants make a new view that's personal
    @param uri Url that keeps all the adhoc filter/sort inforatmion */
  def saveAsNewView(
    oldName: java.lang.String,
    newName: java.lang.String,
    privateView: scala.Boolean,
    uri: java.lang.String
  ): StringResult = js.native
  /** Sets a value that specifies whether content types are enabled for the list. */
  def set_contentTypesEnabled(value: scala.Boolean): scala.Unit = js.native
  /** Sets a value that specifies the default workflow identifier for content approval on the list. */
  def set_defaultContentApprovalWorkflowId(value: Guid): scala.Unit = js.native
  /** Sets a value that specifies the location of the default display form for the list. */
  def set_defaultDisplayFormUrl(value: java.lang.String): scala.Unit = js.native
  /** Sets a value that specifies the URL of the edit form to use for list items in the list. */
  def set_defaultEditFormUrl(value: java.lang.String): scala.Unit = js.native
  /** Sets a value that specifies the location of the default new form for the list. */
  def set_defaultNewFormUrl(value: java.lang.String): scala.Unit = js.native
  /** Sets a value that specifies the description of the list. */
  def set_description(value: java.lang.String): scala.Unit = js.native
  /** Sets a value that specifies the reading order of the list. */
  def set_direction(value: java.lang.String): scala.Unit = js.native
  /** Sets a value that specifies the server-relative URL of the document template for the list */
  def set_documentTemplateUrl(value: java.lang.String): scala.Unit = js.native
  /** Sets a value that specifies the minimum permission required to view minor versions and drafts within the list. */
  def set_draftVersionVisibility(value: DraftVisibilityType): scala.Unit = js.native
  /** Sets a value that specifies whether list item attachments are enabled for the list. */
  def set_enableAttachments(value: scala.Boolean): scala.Unit = js.native
  /** Sets a value that specifies whether new list folders can be added to the list. */
  def set_enableFolderCreation(value: scala.Boolean): scala.Unit = js.native
  /** Sets a value that specifies whether minor versions are enabled for the list. */
  def set_enableMinorVersions(value: scala.Boolean): scala.Unit = js.native
  /** Sets a value that specifies whether content approval is enabled for the list */
  def set_enableModeration(value: scala.Boolean): scala.Unit = js.native
  /** Sets a value that specifies whether historical versions of list items and documents can be created in the list */
  def set_enableVersioning(value: scala.Boolean): scala.Unit = js.native
  /** Sets a value that indicates whether forced checkout is enabled for the document library */
  def set_forceCheckout(value: scala.Boolean): scala.Unit = js.native
  /** Sets if the list is hidden from "All site contents" or not. */
  def set_hidden(value: scala.Boolean): scala.Unit = js.native
  /** Sets a value that specifies the URI for the icon of the list */
  def set_imageUrl(value: java.lang.String): scala.Unit = js.native
  /** Sets a value that specifies whether Information Rights Management (IRM) is enabled for the list.  */
  def set_irmEnabled(value: scala.Boolean): scala.Unit = js.native
  /** Sets a value that specifies whether Information Rights Management (IRM) expiration is enabled for the list.  */
  def set_irmExpire(value: scala.Boolean): scala.Unit = js.native
  /** Sets a value that specifies whether Information Rights Management (IRM) rejection is enabled for the list.  */
  def set_irmReject(value: scala.Boolean): scala.Unit = js.native
  /** Sets a value that indicates whether this list should be treated as a top level navigation object or not.  */
  def set_isApplicationList(value: scala.Boolean): scala.Unit = js.native
  /** Sets a value that specifies the last time the list was modified. */
  def set_lastItemModifiedDate(value: microsoftDashAjaxLib.Date): scala.Unit = js.native
  /** Sets a value that indicates whether the list in a Meeting Workspace site contains data for multiple meeting instances within the site */
  def set_multipleDataList(value: scala.Boolean): scala.Unit = js.native
  /** Sets a value that specifies that the crawler must not crawl the list */
  def set_noCrawl(value: scala.Boolean): scala.Unit = js.native
  /** Sets a value that specifies whether the list appears on the Quick Launch of the site */
  def set_onQuickLaunch(value: scala.Boolean): scala.Unit = js.native
  /** Sets the list title. To change list URL you should change name of the root folder. */
  def set_title(value: java.lang.String): scala.Unit = js.native
  /** Sets a value that specifies the data validation criteria for a list item. */
  def set_validationFormula(value: java.lang.String): scala.Unit = js.native
  /** Sets a value that specifies the error message returned when data validation fails for a list item. */
  def set_validationMessage(value: java.lang.String): scala.Unit = js.native
  /** Updates the database with changes that are made to the list object. */
  def update(): scala.Unit = js.native
}

