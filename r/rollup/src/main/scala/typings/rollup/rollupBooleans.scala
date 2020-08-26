package typings.rollup

import typings.rollup.mod.PreserveEntrySignaturesOption
import typings.rollup.mod._ResolveIdResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rollupBooleans {
  @js.native
  sealed trait `false`
    extends PreserveEntrySignaturesOption
       with _ResolveIdResult
  
  @js.native
  sealed trait `true` extends js.Object
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

