package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DriveInfo...
  */
trait IDriveInfo extends StObject {
  
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
  
  inline def apply(qDrive: String, qName: String, qType: String, qTypeIdentifier: DriveType): IDriveInfo = {
    val __obj = js.Dynamic.literal(qDrive = qDrive.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qTypeIdentifier = qTypeIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDriveInfo]
  }
  
  extension [Self <: IDriveInfo](x: Self) {
    
    inline def setQDrive(value: String): Self = StObject.set(x, "qDrive", value.asInstanceOf[js.Any])
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    inline def setQType(value: String): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
    
    inline def setQTypeIdentifier(value: DriveType): Self = StObject.set(x, "qTypeIdentifier", value.asInstanceOf[js.Any])
  }
}
