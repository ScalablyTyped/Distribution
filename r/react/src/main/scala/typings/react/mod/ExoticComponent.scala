package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: similar to how Fragment is actually a symbol, the values returned from createContext,
// forwardRef and memo are actually objects that are treated specially by the renderer; see:
// https://github.com/facebook/react/blob/v16.6.0/packages/react/src/ReactContext.js#L35-L48
// https://github.com/facebook/react/blob/v16.6.0/packages/react/src/forwardRef.js#L42-L45
// https://github.com/facebook/react/blob/v16.6.0/packages/react/src/memo.js#L27-L31
// However, we have no way of telling the JSX parser that it's a JSX element type or its props other than
// by pretending to be a normal component.
//
// We don't just use ComponentType or SFC types because you are not supposed to attach statics to this
// object, but rather to the original function.
@js.native
trait ExoticComponent[P] extends js.Object {
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: P): ReactElement | Null = js.native
}

