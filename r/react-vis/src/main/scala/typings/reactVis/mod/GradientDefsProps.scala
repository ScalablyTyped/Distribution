package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradientDefsProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
}
object GradientDefsProps {
  
  @scala.inline
  def apply(): GradientDefsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GradientDefsProps]
  }
  
  @scala.inline
  implicit class GradientDefsPropsMutableBuilder[Self <: GradientDefsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
