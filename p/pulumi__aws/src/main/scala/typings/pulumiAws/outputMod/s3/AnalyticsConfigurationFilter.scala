package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsConfigurationFilter extends StObject {
  
  /**
    * Object prefix for filtering.
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * Set of object tags for filtering.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.undefined
}
object AnalyticsConfigurationFilter {
  
  inline def apply(): AnalyticsConfigurationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsConfigurationFilter]
  }
  
  extension [Self <: AnalyticsConfigurationFilter](x: Self) {
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
