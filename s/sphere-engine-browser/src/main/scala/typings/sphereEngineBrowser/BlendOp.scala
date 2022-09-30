package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies how colors are combined with the existing contents of a surface.
  */
trait BlendOp extends StObject {
  
  /* private */ var _workaround: Null
}
object BlendOp {
  
  inline def apply(_workaround: Null): BlendOp = {
    val __obj = js.Dynamic.literal(_workaround = _workaround.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlendOp]
  }
  
  extension [Self <: BlendOp](x: Self) {
    
    inline def set_workaround(value: Null): Self = StObject.set(x, "_workaround", value.asInstanceOf[js.Any])
  }
}
