package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExoticComponent[P] extends StObject {
  
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: P): (RaxElement[_, String | JSXElementConstructor[_]]) | Null = js.native
  
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
}
