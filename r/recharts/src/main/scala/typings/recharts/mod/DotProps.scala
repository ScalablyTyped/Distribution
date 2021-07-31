package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DotProps
  extends StObject
     with EventAttributes {
  
  var className: js.UndefOr[String] = js.undefined
  
  var cx: js.UndefOr[Double] = js.undefined
  
  var cy: js.UndefOr[Double] = js.undefined
  
  var r: js.UndefOr[Double] = js.undefined
}
object DotProps {
  
  @scala.inline
  def apply(): DotProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotProps]
  }
  
  @scala.inline
  implicit class DotPropsMutableBuilder[Self <: DotProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    @scala.inline
    def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
  }
}
