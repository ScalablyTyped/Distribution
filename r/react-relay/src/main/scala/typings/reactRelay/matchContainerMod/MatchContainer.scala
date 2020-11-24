package typings.reactRelay.matchContainerMod

import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-relay/lib/relay-experimental/MatchContainer", "MatchContainer")
@js.native
object MatchContainer extends js.Object {
  
  def apply[TProps, TFallback](props: MatchContainerProps[TProps, TFallback]): ElementType[TProps] | TFallback | Null = js.native
}
