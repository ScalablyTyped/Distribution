package typings.protonNative.mod

import typings.protonNative.protonNativeStrings.evenodd
import typings.protonNative.protonNativeStrings.nonzero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaPathProps
  extends StObject
     with AreaBaseProps {
  
  /**
    * A string describing the path (uses SVG's path syntax, explanation @see https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths).
    *
    * A warning is displayed whan an unimplemented shaped are used (Quadratic Beziers and Arcs).
    */
  var d: String
  
  /**
    * Sets the methods how to determine wheter to fill a path. Explanation @see https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/fill-rule.
    */
  var fillMode: nonzero | evenodd
}
object AreaPathProps {
  
  @scala.inline
  def apply(d: String, fillMode: nonzero | evenodd): AreaPathProps = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], fillMode = fillMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaPathProps]
  }
  
  @scala.inline
  implicit class AreaPathPropsMutableBuilder[Self <: AreaPathProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillMode(value: nonzero | evenodd): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
  }
}
