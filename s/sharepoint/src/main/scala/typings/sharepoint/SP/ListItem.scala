package typings.sharepoint.SP

import typings.sharepoint.SP.Utilities.SPWOPIFrameAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an item or row in a list. */
@js.native
trait ListItem[T]
  extends StObject
     with SecurableObject {
  
  /** Deletes the list item */
  def deleteObject(): Unit = js.native
  
  /** Gets effective permissions for the specified user. */
  def getUserEffectivePermissions(userName: String): BasePermissions = js.native
  
  def getWOPIFrameUrl(action: SPWOPIFrameAction): StringResult = js.native
  
  /** Gets collection of objects that represent attachments for the list item. */
  def get_attachmentFiles(): AttachmentCollection = js.native
  
  /** Gets the content type of the item. */
  def get_contentType(): ContentType = js.native
  
  /** Gets a value that specifies the display name of the list item.
    This property is not available by default when you return list items. Trying to call this method returns a PropertyOrFieldNotInitializedException if you try to access one of these properties. To access this property, use the Include method as part of the query string. */
  def get_displayName(): String = js.native
  
  /** Gets a value that specifies the effective permissions on the list item that are assigned to the current user.
    This property is not available by default when you return list items. Trying to call this method returns a PropertyOrFieldNotInitializedException if you try to access one of these properties. To access this property, use the Include method as part of the query string. */
  def get_effectiveBasePermissions(): BasePermissions = js.native
  
  /** Gets the effective base permissions for the current user, as they should be displayed in UI.
    This will only differ from EffectiveBasePermissions if ReadOnlyUI is set to true on the item's parent list, and in all cases will be a subset of EffectiveBasePermissions. To put it another way, EffectiveBasePermissionsForUI will always be as or more restrictive than EffectiveBasePermissions.
    This property is not available by default when you return list items. Trying to call this method returns a PropertyOrFieldNotInitializedException if you try to access one of these properties. To access this property, use the Include method as part of the query string.  */
  def get_effectiveBasePermissionsForUI(): BasePermissions = js.native
  
  def get_fieldValues(): T = js.native
  
  def get_fieldValuesAsHtml(): FieldStringValues = js.native
  
  def get_fieldValuesAsText(): FieldStringValues = js.native
  
  def get_fieldValuesForEdit(): FieldStringValues = js.native
  
  /** Gets the file that is represented by the item from a document library. Only for document libraries. */
  def get_file(): File = js.native
  
  /** Gets or sets the file system object type for the item (file, folder or invalid). */
  def get_fileSystemObjectType(): FileSystemObjectType = js.native
  
  /** Gets the parent folder for the list item */
  def get_folder(): Folder = js.native
  
  /** Gets id of the item */
  def get_id(): Double = js.native
  
  /** Gets the specified field value for the list item. Field value is returned as string, but it can be casted to a specific field value type, e.g. SP.LookupFieldValue, etc. */
  def get_item[K /* <: /* keyof T */ String */](fieldInternalName: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
  
  /** Get the list in which the item resides. */
  def get_parentList(): List[js.Any] = js.native
  
  /** Sets the value of the field for the list item based on an implementation specific transformation of the value. */
  def parseAndSetFieldValue(fieldInternalName: String, value: String): Unit = js.native
  
  /** Moves the list item to the Recycle Bin and returns the identifier of the new Recycle Bin item. */
  def recycle(): GuidResult = js.native
  
  /** Sets the specified field value for the list item. Consider using parseAndSetFieldValue instead. */
  def set_item[K /* <: /* keyof T */ String */](
    fieldInternalName: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): Unit = js.native
  
  /** Commits changed properties of the list item. The actual update is performed during context.executeQueryAsync method call. */
  def update(): Unit = js.native
  
  /** Validates form values specified for the list item. Errors are returned through hasException and errorMessage properties of the ListItemFormUpdateValue objects */
  def validateUpdateListItem(formValues: js.Array[ListItemFormUpdateValue], bNewDocumentUpdate: Boolean): js.Array[ListItemFormUpdateValue] = js.native
}
