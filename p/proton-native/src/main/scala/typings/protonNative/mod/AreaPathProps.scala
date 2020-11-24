package typings.protonNative.mod

import typings.protonNative.protonNativeStrings.evenodd
import typings.protonNative.protonNativeStrings.nonzero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaPathProps extends AreaBaseProps {
  
  /**
    * A string describing the path (uses SVG's path syntax, explanation @see https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths).
    *
    * A warning is displayed whan an unimplemented shaped are used (Quadratic Beziers and Arcs).
    */
  var d: String = js.native
  
  /**
    * Sets the methods how to determine wheter to fill a path. Explanation @see https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/fill-rule.
    */
  var fillMode: nonzero | evenodd = js.native
}
object AreaPathProps {
  
  @scala.inline
  def apply(d: String, fillMode: nonzero | evenodd): AreaPathProps = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], fillMode = fillMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaPathProps]
  }
  
  @scala.inline
  implicit class AreaPathPropsOps[Self <: AreaPathProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillMode(value: nonzero | evenodd): Self = this.set("fillMode", value.asInstanceOf[js.Any])
  }
}
