package typings
package signaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultMethods extends js.Object {
  var DefaultMethods: signaleLib.signaleMod.signaleNs.DefaultMethods
  var Signale: signaleLib.signaleMod.signaleNs.SignaleConstructor
  var SignaleConfig: signaleLib.signaleMod.signaleNs.SignaleConfig
  var SignaleOptions: signaleLib.signaleMod.signaleNs.SignaleOptions[signaleLib.signaleMod.signaleNs.DefaultMethods]
}

object Anon_DefaultMethods {
  @scala.inline
  def apply(
    DefaultMethods: signaleLib.signaleMod.signaleNs.DefaultMethods,
    Signale: signaleLib.signaleMod.signaleNs.SignaleConstructor,
    SignaleConfig: signaleLib.signaleMod.signaleNs.SignaleConfig,
    SignaleOptions: signaleLib.signaleMod.signaleNs.SignaleOptions[signaleLib.signaleMod.signaleNs.DefaultMethods]
  ): Anon_DefaultMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DefaultMethods")(DefaultMethods)
    __obj.updateDynamic("Signale")(Signale)
    __obj.updateDynamic("SignaleConfig")(SignaleConfig)
    __obj.updateDynamic("SignaleOptions")(SignaleOptions)
    __obj.asInstanceOf[Anon_DefaultMethods]
  }
}

