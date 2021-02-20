package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearInterpolatorProps extends StObject {
  
  var around: js.UndefOr[js.Array[Double]] = js.native
  
  var transitionProps: js.UndefOr[js.Array[String]] = js.native
}
object LinearInterpolatorProps {
  
  @scala.inline
  def apply(): LinearInterpolatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearInterpolatorProps]
  }
  
  @scala.inline
  implicit class LinearInterpolatorPropsMutableBuilder[Self <: LinearInterpolatorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAround(value: js.Array[Double]): Self = StObject.set(x, "around", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAroundUndefined: Self = StObject.set(x, "around", js.undefined)
    
    @scala.inline
    def setAroundVarargs(value: Double*): Self = StObject.set(x, "around", js.Array(value :_*))
    
    @scala.inline
    def setTransitionProps(value: js.Array[String]): Self = StObject.set(x, "transitionProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionPropsUndefined: Self = StObject.set(x, "transitionProps", js.undefined)
    
    @scala.inline
    def setTransitionPropsVarargs(value: String*): Self = StObject.set(x, "transitionProps", js.Array(value :_*))
  }
}
