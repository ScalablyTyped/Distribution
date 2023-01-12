package typings.snyk.anon

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCTestFlags
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacShareResultsFormat
import typings.snyk.distLibPolicyFindAndLoadPolicyMod.Policy
import typings.snyk.distLibTypesMod.ProjectAttributes
import typings.snyk.distLibTypesMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  var attributes: js.UndefOr[ProjectAttributes] = js.undefined
  
  var meta: typings.snyk.distLibTypesMod.IacOutputMeta
  
  var options: IaCTestFlags
  
  var policy: js.UndefOr[Policy] = js.undefined
  
  var results: js.Array[IacShareResultsFormat]
  
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
}
object Attributes {
  
  inline def apply(
    meta: typings.snyk.distLibTypesMod.IacOutputMeta,
    options: IaCTestFlags,
    results: js.Array[IacShareResultsFormat]
  ): Attributes = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: ProjectAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setMeta(value: typings.snyk.distLibTypesMod.IacOutputMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: IaCTestFlags): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setResults(value: js.Array[IacShareResultsFormat]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: IacShareResultsFormat*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
