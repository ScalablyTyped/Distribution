package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ======================================================================
  * Rax Factories
  * ======================================================================
  */
@js.native
trait Factory[P] extends StObject {
  
  def apply(props: Attributes & P, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[js.Any]] = js.native
  def apply(props: Unit, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[js.Any]] = js.native
}
