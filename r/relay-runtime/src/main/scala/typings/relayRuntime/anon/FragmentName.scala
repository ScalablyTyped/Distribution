package typings.relayRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentName extends StObject {
  
  val fragmentName: String
  
  val fragmentPropName: String
}
object FragmentName {
  
  @scala.inline
  def apply(fragmentName: String, fragmentPropName: String): FragmentName = {
    val __obj = js.Dynamic.literal(fragmentName = fragmentName.asInstanceOf[js.Any], fragmentPropName = fragmentPropName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentName]
  }
  
  @scala.inline
  implicit class FragmentNameMutableBuilder[Self <: FragmentName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFragmentName(value: String): Self = StObject.set(x, "fragmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentPropName(value: String): Self = StObject.set(x, "fragmentPropName", value.asInstanceOf[js.Any])
  }
}
