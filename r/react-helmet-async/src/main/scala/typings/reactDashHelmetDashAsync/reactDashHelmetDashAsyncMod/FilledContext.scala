package typings.reactDashHelmetDashAsync.reactDashHelmetDashAsyncMod

import typings.reactDashHelmet.reactDashHelmetMod.HelmetData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilledContext extends js.Object {
  var helmet: HelmetData
}

object FilledContext {
  @scala.inline
  def apply(helmet: HelmetData): FilledContext = {
    val __obj = js.Dynamic.literal(helmet = helmet)
  
    __obj.asInstanceOf[FilledContext]
  }
}

