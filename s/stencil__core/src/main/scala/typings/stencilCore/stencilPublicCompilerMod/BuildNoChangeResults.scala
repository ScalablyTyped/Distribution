package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildNoChangeResults extends StObject {
  
  var buildId: Double
  
  var noChange: Boolean
}
object BuildNoChangeResults {
  
  inline def apply(buildId: Double, noChange: Boolean): BuildNoChangeResults = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], noChange = noChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildNoChangeResults]
  }
  
  extension [Self <: BuildNoChangeResults](x: Self) {
    
    inline def setBuildId(value: Double): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setNoChange(value: Boolean): Self = StObject.set(x, "noChange", value.asInstanceOf[js.Any])
  }
}
