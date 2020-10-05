package typings.react.mod

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ReactSVG for ReactSVGElement
@js.native
trait ReactSVGElement extends DOMElement[SVGAttributes[SVGElement], SVGElement]

object ReactSVGElement {
  @scala.inline
  def apply(props: js.Any, `type`: js.Any): ReactSVGElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSVGElement]
  }
}

