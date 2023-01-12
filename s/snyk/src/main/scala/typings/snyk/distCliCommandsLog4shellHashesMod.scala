package typings.snyk

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsLog4shellHashesMod {
  
  @JSImport("snyk/dist/cli/commands/log4shell-hashes", "vulnerableSignatures")
  @js.native
  val vulnerableSignatures: VulnerableSignatures_ = js.native
  
  trait FileSignatureDetails extends StObject {
    
    var filename: String
    
    var versions: js.Array[String]
  }
  object FileSignatureDetails {
    
    inline def apply(filename: String, versions: js.Array[String]): FileSignatureDetails = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileSignatureDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileSignatureDetails] (val x: Self) extends AnyVal {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setVersions(value: js.Array[String]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value*))
    }
  }
  
  type VulnerableSignatures_ = StringDictionary[FileSignatureDetails]
}
