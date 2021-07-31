package typings.react.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */]
  extends StObject
     with DOMElement[P, T]
object DetailedReactHTMLElement {
  
  @scala.inline
  def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](props: js.Any, `type`: js.Any): DetailedReactHTMLElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null, ref = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedReactHTMLElement[P, T]]
  }
}
