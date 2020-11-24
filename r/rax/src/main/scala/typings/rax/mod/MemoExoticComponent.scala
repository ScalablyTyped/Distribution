package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// will show `Memo(${Component.displayName || Component.name})` in devtools by default,
// but can be given its own specific name
/* Inlined rax.rax.NamedExoticComponent<rax.rax.ComponentPropsWithRef<T>> & { readonly type :T} */
@js.native
trait MemoExoticComponent[T /* <: ComponentType[_] */] extends js.Object {
  
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: ComponentPropsWithRef[T]): (RaxElement[_, String | JSXElementConstructor[_]]) | Null = js.native
  
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  val `type`: T = js.native
}
