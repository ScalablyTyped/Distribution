package typings
package stormDashReactDashDiagramsLib.distSrcBaseEntityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseListener[T /* <: BaseEntity[BaseListener[_]] */] extends js.Object {
  var lockChanged: js.UndefOr[
    js.Function1[
      /* event */ BaseEvent[T] with stormDashReactDashDiagramsLib.Anon_Locked, 
      scala.Unit
    ]
  ] = js.undefined
}

object BaseListener {
  @scala.inline
  def apply[T /* <: BaseEntity[BaseListener[_]] */](
    lockChanged: js.Function1[
      /* event */ BaseEvent[T] with stormDashReactDashDiagramsLib.Anon_Locked, 
      scala.Unit
    ] = null
  ): BaseListener[T] = {
    val __obj = js.Dynamic.literal()
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(lockChanged)
    __obj.asInstanceOf[BaseListener[T]]
  }
}

