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
  
  @scala.inline
  def apply(): TransformProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformProps]
  }
  
  @scala.inline
  implicit class TransformPropsMutableBuilder[Self <: TransformProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransform(value: ColumnMajorTransformMatrix | String | TransformObject): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
