package typings.signale

import typings.signale.signaleMod.DefaultMethods
import typings.signale.signaleMod.SignaleConfig
import typings.signale.signaleMod.SignaleConstructor
import typings.signale.signaleMod.SignaleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultMethods extends js.Object {
  var DefaultMethods: typings.signale.signaleMod.DefaultMethods
  var Signale: SignaleConstructor
  var SignaleConfig: typings.signale.signaleMod.SignaleConfig
  var SignaleOptions: typings.signale.signaleMod.SignaleOptions[DefaultMethods]
}

object Anon_DefaultMethods {
  @scala.inline
  def apply(
    DefaultMethods: DefaultMethods,
    Signale: SignaleConstructor,
    SignaleConfig: SignaleConfig,
    SignaleOptions: SignaleOptions[DefaultMethods]
  ): Anon_DefaultMethods = {
    val __obj = js.Dynamic.literal(DefaultMethods = DefaultMethods.asInstanceOf[js.Any], Signale = Signale.asInstanceOf[js.Any], SignaleConfig = SignaleConfig.asInstanceOf[js.Any], SignaleOptions = SignaleOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DefaultMethods]
  }
}

