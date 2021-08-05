package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// RaxSVG for RaxSVGElement
trait RaxSVGElement
  extends StObject
     with DOMElement[SVGAttributes[SVGElement], SVGElement]
object RaxSVGElement {
  
  inline def apply(props: SVGAttributes[SVGElement], `type`: String): RaxSVGElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null, ref = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaxSVGElement]
  }
}
