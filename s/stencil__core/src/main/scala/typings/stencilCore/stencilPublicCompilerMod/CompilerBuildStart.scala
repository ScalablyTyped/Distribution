package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerBuildStart extends StObject {
  
  var buildId: Double
  
  var timestamp: String
}
object CompilerBuildStart {
  
  inline def apply(buildId: Double, timestamp: String): CompilerBuildStart = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerBuildStart]
  }
  
  extension [Self <: CompilerBuildStart](x: Self) {
    
    inline def setBuildId(value: Double): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
