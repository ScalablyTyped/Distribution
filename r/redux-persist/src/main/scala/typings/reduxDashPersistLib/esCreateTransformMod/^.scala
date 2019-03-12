package typings
package reduxDashPersistLib.esCreateTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/es/createTransform", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createTransform[S, R](inbound: TransformIn[S, R], outbound: TransformOut[R, S]): Transform[S, R] = js.native
  def createTransform[S, R](
    inbound: TransformIn[S, R],
    outbound: TransformOut[R, S],
    config: stdLib.Pick[
      reduxDashPersistLib.esTypesMod.PersistConfig, 
      reduxDashPersistLib.reduxDashPersistLibStrings.whitelist | reduxDashPersistLib.reduxDashPersistLibStrings.blacklist
    ]
  ): Transform[S, R] = js.native
}

