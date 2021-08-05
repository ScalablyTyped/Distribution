package typings.storybookReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var transform: js.Array[Scale]
}
object `0` {
  
  inline def apply(transform: js.Array[Scale]): `0` = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setTransform(value: js.Array[Scale]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformVarargs(value: Scale*): Self = StObject.set(x, "transform", js.Array(value :_*))
  }
}
