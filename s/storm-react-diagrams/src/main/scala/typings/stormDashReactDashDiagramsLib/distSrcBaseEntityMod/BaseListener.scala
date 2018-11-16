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

