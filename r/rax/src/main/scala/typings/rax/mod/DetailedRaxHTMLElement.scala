package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailedRaxHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */]
  extends StObject
     with DOMElement[P, T]
object DetailedRaxHTMLElement {
  
  @scala.inline
  def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](props: P, `type`: String): DetailedRaxHTMLElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null, ref = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedRaxHTMLElement[P, T]]
  }
}
