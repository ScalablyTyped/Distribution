package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// RaxSVG for RaxSVGElement
@js.native
trait RaxSVGElement extends DOMElement[SVGAttributes[SVGElement], SVGElement]
object RaxSVGElement {
  
  @scala.inline
  def apply(props: SVGAttributes[SVGElement], `type`: String): RaxSVGElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaxSVGElement]
  }
}
