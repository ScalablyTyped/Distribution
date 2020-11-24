package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context[T] extends js.Object {
  
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def Consumer(props: ConsumerProps[T]): (RaxElement[_, String | JSXElementConstructor[_]]) | Null = js.native
  @JSName("Consumer")
  var Consumer_Original: Consumer[T] = js.native
  
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def Provider(props: ProviderProps[T]): (RaxElement[_, String | JSXElementConstructor[_]]) | Null = js.native
  @JSName("Provider")
  var Provider_Original: Provider[T] = js.native
  
  var displayName: js.UndefOr[String] = js.native
}
