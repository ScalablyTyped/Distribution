package typings.rax

import typings.rax.mod.IsExactlyAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object raxBooleans {
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
  
  @js.native
  sealed trait `false`
    extends IsExactlyAny[js.Any]
  
  @js.native
  sealed trait `true`
    extends IsExactlyAny[js.Any]
}
