package typings.rax.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionComponent[P] extends StObject {
  
  def apply(props: PropsWithChildren[P]): (RaxElement[js.Any, String | JSXElementConstructor[js.Any]]) | Null = js.native
  def apply(props: PropsWithChildren[P], context: js.Any): (RaxElement[js.Any, String | JSXElementConstructor[js.Any]]) | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  
  var defaultProps: js.UndefOr[Partial[P]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMap[P]] = js.native
}
