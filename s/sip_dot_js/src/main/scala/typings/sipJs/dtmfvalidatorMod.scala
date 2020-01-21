package typings.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Session/DTMFValidator", JSImport.Namespace)
@js.native
object dtmfvalidatorMod extends js.Object {
  @js.native
  class DTMFValidator () extends js.Object
  
  /* static members */
  @js.native
  object DTMFValidator extends js.Object {
    var generateInvalidToneError: js.Any = js.native
    def validate(tone: ToneType): String = js.native
    def validate(tone: ToneType, moreThanOneTone: Boolean): String = js.native
  }
  
  type ToneType = Double | String
}

