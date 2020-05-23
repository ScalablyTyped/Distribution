package typings.refNapi

import typings.refNapi.mod.global.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait FnCall extends js.Object {
    def apply(buffer: Buffer, offset: Double, input: String): Unit = js.native
    def apply(buffer: Buffer, offset: Double, input: Double): Unit = js.native
  }
  
}

