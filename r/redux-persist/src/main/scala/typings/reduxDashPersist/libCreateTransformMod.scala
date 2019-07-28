package typings.reduxDashPersist

import typings.reduxDashPersist.esCreateTransformMod.Transform
import typings.reduxDashPersist.esCreateTransformMod.TransformIn
import typings.reduxDashPersist.esCreateTransformMod.TransformOut
import typings.reduxDashPersist.esTypesMod.PersistConfig
import typings.reduxDashPersist.reduxDashPersistStrings.blacklist
import typings.reduxDashPersist.reduxDashPersistStrings.whitelist
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/lib/createTransform", JSImport.Namespace)
@js.native
object libCreateTransformMod extends js.Object {
  def createTransform[S, R](inbound: TransformIn[S, R], outbound: TransformOut[R, S]): Transform[S, R] = js.native
  def createTransform[S, R](
    inbound: TransformIn[S, R],
    outbound: TransformOut[R, S],
    config: Pick[PersistConfig, whitelist | blacklist]
  ): Transform[S, R] = js.native
}

