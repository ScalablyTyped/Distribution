package typings.serverless.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompiledCloudFormationTemplate extends StObject {
  
  var compiledCloudFormationTemplate: Outputs
  
  var layers: js.UndefOr[js.Array[String | (Record[String, String])]] = js.undefined
  
  var name: String
  
  var region: String
  
  var runtime: js.UndefOr[String] = js.undefined
  
  var stackTags: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var stage: String
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var versionFunctions: Boolean
}
object CompiledCloudFormationTemplate {
  
  inline def apply(
    compiledCloudFormationTemplate: Outputs,
    name: String,
    region: String,
    stage: String,
    versionFunctions: Boolean
  ): CompiledCloudFormationTemplate = {
    val __obj = js.Dynamic.literal(compiledCloudFormationTemplate = compiledCloudFormationTemplate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], versionFunctions = versionFunctions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledCloudFormationTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompiledCloudFormationTemplate] (val x: Self) extends AnyVal {
    
    inline def setCompiledCloudFormationTemplate(value: Outputs): Self = StObject.set(x, "compiledCloudFormationTemplate", value.asInstanceOf[js.Any])
    
    inline def setLayers(value: js.Array[String | (Record[String, String])]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: (String | (Record[String, String]))*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setStackTags(value: StringDictionary[Any]): Self = StObject.set(x, "stackTags", value.asInstanceOf[js.Any])
    
    inline def setStackTagsUndefined: Self = StObject.set(x, "stackTags", js.undefined)
    
    inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setVersionFunctions(value: Boolean): Self = StObject.set(x, "versionFunctions", value.asInstanceOf[js.Any])
  }
}
