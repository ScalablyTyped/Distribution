package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a file in a SharePoint Web site that can be a Web Part Page, an item in a document library, or a file in a folder. */
@JSGlobal("SP.File")
@js.native
class File () extends ClientObject {
  /** Approves the file submitted for content approval with the specified comment.  */
  def approve(comment: java.lang.String): scala.Unit = js.native
  def checkIn(comment: java.lang.String, checkInType: CheckinType): scala.Unit = js.native
  def checkOut(): scala.Unit = js.native
  def copyTo(strNewUrl: java.lang.String, bOverWrite: scala.Boolean): scala.Unit = js.native
  def deleteObject(): scala.Unit = js.native
  /** Denies the file submitted for content approval. */
  def deny(comment: java.lang.String): scala.Unit = js.native
  def getLimitedWebPartManager(scope: sharepointLib.SPNs.WebPartsNs.PersonalizationScope): sharepointLib.SPNs.WebPartsNs.LimitedWebPartManager = js.native
  def get_author(): User = js.native
  /** Returns the comment that was specified when the document was checked into the document library. */
  def get_checkInComment(): java.lang.String = js.native
  /** The type of checkout that exists on the document. */
  def get_checkOutType(): CheckOutType = js.native
  /** Returns the user who has checked out the file. */
  def get_checkedOutByUser(): User = js.native
  def get_contentTag(): java.lang.String = js.native
  /** Gets the customization(ghost) status of the SPFile. */
  def get_customizedPageStatus(): CustomizedPageStatus = js.native
  /** Gets the ETag of the file  */
  def get_eTag(): java.lang.String = js.native
  /** Specifies whether the file exists  */
  def get_exists(): scala.Boolean = js.native
  def get_length(): scala.Double = js.native
  def get_level(): FileLevel = js.native
  /** Specifies the SPListItem corresponding to this file if this file belongs to a doclib. Values for all fields are returned also. */
  def get_listItemAllFields[T](): ListItem[T] = js.native
  /** Returns the user that owns the current lock on the file. MUST return null if there is no lock. */
  def get_lockedByUser(): User = js.native
  /** Specifies the major version of the file. */
  def get_majorVersion(): scala.Double = js.native
  /** Specifies the minor version of the file. */
  def get_minorVersion(): scala.Double = js.native
  def get_modifiedBy(): User = js.native
  def get_name(): java.lang.String = js.native
  def get_serverRelativeUrl(): java.lang.String = js.native
  /** Specifies when the file was created. */
  def get_timeCreated(): stdLib.Date = js.native
  /** Specifies when the file was created. */
  def get_timeLastModified(): stdLib.Date = js.native
  def get_title(): java.lang.String = js.native
  /** Specifies the implementation-specific version identifier of the file. */
  def get_uIVersion(): scala.Double = js.native
  /** Specifies the implementation-specific version identifier of the file. */
  def get_uIVersionLabel(): java.lang.String = js.native
  /** Returns a collection of file version objects that represent the versions of the file. */
  def get_versions(): FileVersionCollection = js.native
  def moveTo(newUrl: java.lang.String, flags: MoveOperations): scala.Unit = js.native
  def publish(comment: java.lang.String): scala.Unit = js.native
  /** Moves the file to the recycle bin. MUST return the identifier of the new Recycle Bin item */
  def recycle(): GuidResult = js.native
  def saveBinary(parameters: FileSaveBinaryInformation): scala.Unit = js.native
  /** Removes the file from content approval with the specified comment. */
  def unPublish(comment: java.lang.String): scala.Unit = js.native
  /** Reverts an existing online or offline checkout for the file. */
  def undoCheckOut(): scala.Unit = js.native
}

/** Represents a file in a SharePoint Web site that can be a Web Part Page, an item in a document library, or a file in a folder. */
@JSGlobal("SP.File")
@js.native
object File extends js.Object {
  def getContentVerFromTag(context: sharepointLib.SPNs.ClientRuntimeContext, contentTag: java.lang.String): sharepointLib.SPNs.IntResult = js.native
}

