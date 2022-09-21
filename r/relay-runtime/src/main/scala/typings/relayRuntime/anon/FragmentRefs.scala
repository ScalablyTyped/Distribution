package typings.relayRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentRefs extends StObject {
  
  @JSName("$data")
  val $data: js.UndefOr[Any] = js.undefined
  
  @JSName("$fragmentRefs")
  val $fragmentRefs: Any
  
  @JSName("$fragmentSpreads")
  val $fragmentSpreads: Any
}
object FragmentRefs {
  
  inline def apply($fragmentRefs: Any, $fragmentSpreads: Any): FragmentRefs = {
    val __obj = js.Dynamic.literal($fragmentRefs = $fragmentRefs.asInstanceOf[js.Any], $fragmentSpreads = $fragmentSpreads.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentRefs]
  }
  
  extension [Self <: FragmentRefs](x: Self) {
    
    inline def set$data(value: Any): Self = StObject.set(x, "$data", value.asInstanceOf[js.Any])
    
    inline def set$dataUndefined: Self = StObject.set(x, "$data", js.undefined)
    
    inline def set$fragmentRefs(value: Any): Self = StObject.set(x, "$fragmentRefs", value.asInstanceOf[js.Any])
    
    inline def set$fragmentSpreads(value: Any): Self = StObject.set(x, "$fragmentSpreads", value.asInstanceOf[js.Any])
  }
}
