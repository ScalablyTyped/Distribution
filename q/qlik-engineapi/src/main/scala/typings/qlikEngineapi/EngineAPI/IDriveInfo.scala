package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DriveInfo...
  */
trait IDriveInfo extends js.Object {
  /**
    * Value of the drive
    *
    * Examples:
    * C:\\, E:\\
    */
  var qDrive: String
  /**
    * Name of the drive.
    */
  var qName: String
  /**
    * Type of the drive.
    * Fixed means physical drive.
    */
  var qType: String
  /**
    * Information about the drive type.
    */
  var qTypeIdentifier: DriveType
}

object IDriveInfo {
  @scala.inline
  def apply(qDrive: String, qName: String, qType: String, qTypeIdentifier: DriveType): IDriveInfo = {
    val __obj = js.Dynamic.literal(qDrive = qDrive.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qTypeIdentifier = qTypeIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDriveInfo]
  }
}

