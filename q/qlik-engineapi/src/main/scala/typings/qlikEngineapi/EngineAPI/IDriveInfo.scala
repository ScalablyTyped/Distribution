package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DriveInfo...
  */
@js.native
trait IDriveInfo extends js.Object {
  /**
    * Value of the drive
    *
    * Examples:
    * C:\\, E:\\
    */
  var qDrive: String = js.native
  /**
    * Name of the drive.
    */
  var qName: String = js.native
  /**
    * Type of the drive.
    * Fixed means physical drive.
    */
  var qType: String = js.native
  /**
    * Information about the drive type.
    */
  var qTypeIdentifier: DriveType = js.native
}

object IDriveInfo {
  @scala.inline
  def apply(qDrive: String, qName: String, qType: String, qTypeIdentifier: DriveType): IDriveInfo = {
    val __obj = js.Dynamic.literal(qDrive = qDrive.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qTypeIdentifier = qTypeIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDriveInfo]
  }
  @scala.inline
  implicit class IDriveInfoOps[Self <: IDriveInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQDrive(value: String): Self = this.set("qDrive", value.asInstanceOf[js.Any])
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQType(value: String): Self = this.set("qType", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTypeIdentifier(value: DriveType): Self = this.set("qTypeIdentifier", value.asInstanceOf[js.Any])
  }
  
}

