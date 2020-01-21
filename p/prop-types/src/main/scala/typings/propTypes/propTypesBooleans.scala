package typings.propTypes

import typings.propTypes.mod.IsOptional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object propTypesBooleans {
  @js.native
  sealed trait `false`
    extends IsOptional[js.Any]
  
  @js.native
  sealed trait `true`
    extends IsOptional[js.Any]
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

