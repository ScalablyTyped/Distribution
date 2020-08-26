package typings.rcInputNumber

import typings.rcInputNumber.anon.AutoComplete
import typings.rcInputNumber.interfaceMod.InputNumberProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-input-number", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default protected ()
    extends typings.rcInputNumber.inputNumberMod.default {
    def this(props: InputNumberProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AutoComplete = js.native
  }
  
}

