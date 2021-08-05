package typings.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheFrom extends StObject {
  
  /**
    * An optional list of build stages to use for caching. Each build stage in this list will be built explicitly and
    * pushed to the target repository. A given stage's image will be tagged as "[stage-name]".
    */
  var stages: js.UndefOr[js.Array[String]] = js.undefined
}
object CacheFrom {
  
  inline def apply(): CacheFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheFrom]
  }
  
  extension [Self <: CacheFrom](x: Self) {
    
    inline def setStages(value: js.Array[String]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    inline def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
    
    inline def setStagesVarargs(value: String*): Self = StObject.set(x, "stages", js.Array(value :_*))
  }
}
