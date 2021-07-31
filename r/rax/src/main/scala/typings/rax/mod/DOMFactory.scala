package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMFactory[P /* <: DOMAttributes[T] */, T /* <: Element */] extends StObject {
  
  def apply(props: ClassAttributes[T] & P, children: RaxNode*): DOMElement[P, T] = js.native
  def apply(props: Null, children: RaxNode*): DOMElement[P, T] = js.native
  def apply(props: Unit, children: RaxNode*): DOMElement[P, T] = js.native
}
