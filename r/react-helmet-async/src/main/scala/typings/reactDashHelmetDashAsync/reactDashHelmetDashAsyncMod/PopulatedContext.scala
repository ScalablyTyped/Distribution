package typings.reactDashHelmetDashAsync.reactDashHelmetDashAsyncMod

import typings.reactDashHelmet.reactDashHelmetMod.HelmetData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopulatedContext extends js.Object {
  var helmet: HelmetData
}

object PopulatedContext {
  @scala.inline
  def apply(helmet: HelmetData): PopulatedContext = {
    val __obj = js.Dynamic.literal(helmet = helmet)
  
    __obj.asInstanceOf[PopulatedContext]
  }
}

