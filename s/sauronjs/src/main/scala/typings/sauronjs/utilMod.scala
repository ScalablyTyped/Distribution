package typings.sauronjs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sauronjs/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  @js.native
  object insert extends js.Object {
    def apply(params: HTMLElement): Unit = js.native
  }
  
  @js.native
  object ready extends js.Object {
    def apply(fn: js.Function0[Unit]): Unit = js.native
  }
  
}

