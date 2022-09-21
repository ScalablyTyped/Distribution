package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conversion extends StObject {
  
  /**
    * The locations of the analysis tool's per-run log files.
    */
  var analysisToolLogFiles: js.UndefOr[js.Array[ArtifactLocation]] = js.undefined
  
  /**
    * An invocation object that describes the invocation of the converter.
    */
  var invocation: js.UndefOr[Invocation] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the conversion.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * A tool object that describes the converter.
    */
  var tool: Tool
}
object Conversion {
  
  inline def apply(tool: Tool): Conversion = {
    val __obj = js.Dynamic.literal(tool = tool.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversion]
  }
  
  extension [Self <: Conversion](x: Self) {
    
    inline def setAnalysisToolLogFiles(value: js.Array[ArtifactLocation]): Self = StObject.set(x, "analysisToolLogFiles", value.asInstanceOf[js.Any])
    
    inline def setAnalysisToolLogFilesUndefined: Self = StObject.set(x, "analysisToolLogFiles", js.undefined)
    
    inline def setAnalysisToolLogFilesVarargs(value: ArtifactLocation*): Self = StObject.set(x, "analysisToolLogFiles", js.Array(value*))
    
    inline def setInvocation(value: Invocation): Self = StObject.set(x, "invocation", value.asInstanceOf[js.Any])
    
    inline def setInvocationUndefined: Self = StObject.set(x, "invocation", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setTool(value: Tool): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
  }
}
