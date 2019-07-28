package typings.reduxDashPersist.esCreateTransformMod

import typings.reduxDashPersist.esTypesMod.PersistConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform[S, R] extends js.Object {
  var config: js.UndefOr[PersistConfig] = js.undefined
  var in: TransformIn[S, R]
  var out: TransformOut[R, S]
}

object Transform {
  @scala.inline
  def apply[S, R](in: TransformIn[S, R], out: TransformOut[R, S], config: PersistConfig = null): Transform[S, R] = {
    val __obj = js.Dynamic.literal(in = in, out = out)
    if (config != null) __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[Transform[S, R]]
  }
}

