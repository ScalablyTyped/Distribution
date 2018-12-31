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

