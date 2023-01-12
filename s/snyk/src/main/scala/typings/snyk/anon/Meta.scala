package typings.snyk.anon

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCTestFlags
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileScanResult
import typings.snyk.distLibPolicyFindAndLoadPolicyMod.Policy
import typings.snyk.distLibTypesMod.ProjectAttributes
import typings.snyk.distLibTypesMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Meta extends StObject {
  
  var attributes: js.UndefOr[ProjectAttributes] = js.undefined
  
  var meta: typings.snyk.distLibTypesMod.IacOutputMeta
  
  var options: IaCTestFlags
  
  var orgPublicId: String
  
  var policy: js.UndefOr[Policy] = js.undefined
  
  var projectRoot: String
  
  var results: js.Array[IacFileScanResult]
  
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
}
object Meta {
  
  inline def apply(
    meta: typings.snyk.distLibTypesMod.IacOutputMeta,
    options: IaCTestFlags,
    orgPublicId: String,
    projectRoot: String,
    results: js.Array[IacFileScanResult]
  ): Meta = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], orgPublicId = orgPublicId.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: ProjectAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setMeta(value: typings.snyk.distLibTypesMod.IacOutputMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: IaCTestFlags): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOrgPublicId(value: String): Self = StObject.set(x, "orgPublicId", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    
    inline def setResults(value: js.Array[IacFileScanResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: IacFileScanResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
