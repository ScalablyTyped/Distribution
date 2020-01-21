package typings.signale

import typings.signale.mod.DefaultMethods
import typings.signale.mod.SignaleConfig
import typings.signale.mod.SignaleConstructor
import typings.signale.mod.SignaleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultMethods extends js.Object {
  var DefaultMethods: typings.signale.mod.DefaultMethods
  var Signale: SignaleConstructor
  var SignaleConfig: typings.signale.mod.SignaleConfig
  var SignaleOptions: typings.signale.mod.SignaleOptions[DefaultMethods]
}

object AnonDefaultMethods {
  @scala.inline
  def apply(
    DefaultMethods: DefaultMethods,
    Signale: SignaleConstructor,
    SignaleConfig: SignaleConfig,
    SignaleOptions: SignaleOptions[DefaultMethods]
  ): AnonDefaultMethods = {
    val __obj = js.Dynamic.literal(DefaultMethods = DefaultMethods.asInstanceOf[js.Any], Signale = Signale.asInstanceOf[js.Any], SignaleConfig = SignaleConfig.asInstanceOf[js.Any], SignaleOptions = SignaleOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefaultMethods]
  }
}

