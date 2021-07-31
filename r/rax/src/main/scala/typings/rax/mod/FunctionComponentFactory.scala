package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionComponentFactory[P] extends StObject {
  
  def apply(props: Attributes & P, children: RaxNode*): FunctionComponentElement[P] = js.native
  def apply(props: Unit, children: RaxNode*): FunctionComponentElement[P] = js.native
}
