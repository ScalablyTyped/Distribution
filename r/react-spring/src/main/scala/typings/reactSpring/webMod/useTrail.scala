package typings.reactSpring.webMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spring/web", "useTrail")
@js.native
object useTrail extends js.Object {
  def apply[DS /* <: js.Object */](count: Double, getProps: js.Function0[UseSpringProps[DS]]): js.Tuple2[js.Array[AnimatedValue[ForwardedProps[DS]]], SetUpdateFn[DS]] = js.native
  def apply[DS /* <: js.Object */](count: Double, values: UseSpringProps[DS]): js.Array[AnimatedValue[ForwardedProps[DS]]] = js.native
}

