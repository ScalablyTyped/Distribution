package typings.reactSpring.webMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spring/web", "useSprings")
@js.native
object useSprings extends js.Object {
  def apply[DS /* <: js.Object */](count: Double, getProps: js.Function1[/* i */ Double, UseSpringProps[DS]]): js.Tuple2[js.Array[AnimatedValue[ForwardedProps[DS]]], SetUpdateCallbackFn[DS]] = js.native
  def apply[TItem, DS /* <: CSSProperties */](count: Double, items: js.Array[TItem]): js.Array[ForwardedProps[DS]] = js.native
}

