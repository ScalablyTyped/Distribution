package typings.react

import typings.react.mod.IsExactlyAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactBooleans {
  @js.native
  sealed trait `false`
    extends IsExactlyAny[js.Any]
  
  @js.native
  sealed trait `true`
    extends IsExactlyAny[js.Any]
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

