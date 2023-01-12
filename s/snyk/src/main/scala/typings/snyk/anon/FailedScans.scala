package typings.snyk.anon

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileScanResult
import typings.snyk.distLibTypesMod.IacFileInDirectory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedScans extends StObject {
  
  var failedScans: js.Array[IacFileInDirectory]
  
  var scannedFiles: js.Array[IacFileScanResult]
}
object FailedScans {
  
  inline def apply(failedScans: js.Array[IacFileInDirectory], scannedFiles: js.Array[IacFileScanResult]): FailedScans = {
    val __obj = js.Dynamic.literal(failedScans = failedScans.asInstanceOf[js.Any], scannedFiles = scannedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedScans]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailedScans] (val x: Self) extends AnyVal {
    
    inline def setFailedScans(value: js.Array[IacFileInDirectory]): Self = StObject.set(x, "failedScans", value.asInstanceOf[js.Any])
    
    inline def setFailedScansVarargs(value: IacFileInDirectory*): Self = StObject.set(x, "failedScans", js.Array(value*))
    
    inline def setScannedFiles(value: js.Array[IacFileScanResult]): Self = StObject.set(x, "scannedFiles", value.asInstanceOf[js.Any])
    
    inline def setScannedFilesVarargs(value: IacFileScanResult*): Self = StObject.set(x, "scannedFiles", js.Array(value*))
  }
}
