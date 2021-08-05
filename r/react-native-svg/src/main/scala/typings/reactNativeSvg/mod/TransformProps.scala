package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformProps
  extends StObject
     with TransformObject {
  
  var transform: js.UndefOr[ColumnMajorTransformMatrix | String | TransformObject] = js.undefined
}
object TransformProps {
  
  inline def apply(): TransformProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformProps]
  }
  
  extension [Self <: TransformProps](x: Self) {
    
    inline def setTransform(value: ColumnMajorTransformMatrix | String | TransformObject): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
