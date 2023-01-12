package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnimationsOptions extends StObject {
  
  /* standard dom */
  var subtree: js.UndefOr[scala.Boolean] = js.undefined
}
object GetAnimationsOptions {
  
  inline def apply(): GetAnimationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAnimationsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAnimationsOptions] (val x: Self) extends AnyVal {
    
    inline def setSubtree(value: scala.Boolean): Self = StObject.set(x, "subtree", value.asInstanceOf[js.Any])
    
    inline def setSubtreeUndefined: Self = StObject.set(x, "subtree", js.undefined)
  }
}
