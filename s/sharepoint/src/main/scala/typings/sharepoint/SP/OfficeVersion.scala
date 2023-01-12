package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfficeVersion extends StObject {
  
  var assemblyVersion: String
  
  var majorBuildVersion: Double
  
  var majorVersion: String
  
  var majorVersionDotZero: String
  
  var previousMajorBuildVersion: Double
  
  var previousVersion: String
  
  var previousVersionDotZero: String
  
  var wssMajorVersion: String
}
object OfficeVersion {
  
  inline def apply(
    assemblyVersion: String,
    majorBuildVersion: Double,
    majorVersion: String,
    majorVersionDotZero: String,
    previousMajorBuildVersion: Double,
    previousVersion: String,
    previousVersionDotZero: String,
    wssMajorVersion: String
  ): OfficeVersion = {
    val __obj = js.Dynamic.literal(assemblyVersion = assemblyVersion.asInstanceOf[js.Any], majorBuildVersion = majorBuildVersion.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], majorVersionDotZero = majorVersionDotZero.asInstanceOf[js.Any], previousMajorBuildVersion = previousMajorBuildVersion.asInstanceOf[js.Any], previousVersion = previousVersion.asInstanceOf[js.Any], previousVersionDotZero = previousVersionDotZero.asInstanceOf[js.Any], wssMajorVersion = wssMajorVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfficeVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OfficeVersion] (val x: Self) extends AnyVal {
    
    inline def setAssemblyVersion(value: String): Self = StObject.set(x, "assemblyVersion", value.asInstanceOf[js.Any])
    
    inline def setMajorBuildVersion(value: Double): Self = StObject.set(x, "majorBuildVersion", value.asInstanceOf[js.Any])
    
    inline def setMajorVersion(value: String): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMajorVersionDotZero(value: String): Self = StObject.set(x, "majorVersionDotZero", value.asInstanceOf[js.Any])
    
    inline def setPreviousMajorBuildVersion(value: Double): Self = StObject.set(x, "previousMajorBuildVersion", value.asInstanceOf[js.Any])
    
    inline def setPreviousVersion(value: String): Self = StObject.set(x, "previousVersion", value.asInstanceOf[js.Any])
    
    inline def setPreviousVersionDotZero(value: String): Self = StObject.set(x, "previousVersionDotZero", value.asInstanceOf[js.Any])
    
    inline def setWssMajorVersion(value: String): Self = StObject.set(x, "wssMajorVersion", value.asInstanceOf[js.Any])
  }
}
