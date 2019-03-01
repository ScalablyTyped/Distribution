package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qDrive: java.lang.String
  /**
    * Name of the drive.
    */
  var qName: java.lang.String
  /**
    * Type of the drive.
    * Fixed means physical drive.
    */
  var qType: java.lang.String
  /**
    * Information about the drive type.
    */
  var qTypeIdentifier: DriveType
}

object IDriveInfo {
  @scala.inline
  def apply(
    qDrive: java.lang.String,
    qName: java.lang.String,
    qType: java.lang.String,
    qTypeIdentifier: DriveType
  ): IDriveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qDrive")(qDrive)
    __obj.updateDynamic("qName")(qName)
    __obj.updateDynamic("qType")(qType)
    __obj.updateDynamic("qTypeIdentifier")(qTypeIdentifier)
    __obj.asInstanceOf[IDriveInfo]
  }
}

