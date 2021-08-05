package typings.relayRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentName extends StObject {
  
  val fragmentName: String
  
  val fragmentPropName: String
}
object FragmentName {
  
  inline def apply(fragmentName: String, fragmentPropName: String): FragmentName = {
    val __obj = js.Dynamic.literal(fragmentName = fragmentName.asInstanceOf[js.Any], fragmentPropName = fragmentPropName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentName]
  }
  
  extension [Self <: FragmentName](x: Self) {
    
    inline def setFragmentName(value: String): Self = StObject.set(x, "fragmentName", value.asInstanceOf[js.Any])
    
    inline def setFragmentPropName(value: String): Self = StObject.set(x, "fragmentPropName", value.asInstanceOf[js.Any])
  }
}
