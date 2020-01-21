package typings.stampit

import typings.stampit.mod.stampit.IsADescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object stampitBooleans {
  @js.native
  sealed trait `false`
    extends IsADescriptor[js.Any]
  
  @js.native
  sealed trait `true`
    extends IsADescriptor[js.Any]
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

