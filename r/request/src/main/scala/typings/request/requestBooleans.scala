package typings.request

import typings.request.mod.PoolOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object requestBooleans {
  @js.native
  sealed trait `false` extends PoolOptions
  
  @js.native
  sealed trait `true` extends js.Object
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

