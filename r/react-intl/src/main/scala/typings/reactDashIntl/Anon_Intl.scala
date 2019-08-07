package typings.reactDashIntl

import typings.reactDashIntl.distComponentsProviderMod.OptionalIntlConfig
import typings.reactDashIntl.distTypesMod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Intl extends js.Object {
  var intl: IntlShape
  var prevProps: OptionalIntlConfig
}

object Anon_Intl {
  @scala.inline
  def apply(intl: IntlShape, prevProps: OptionalIntlConfig): Anon_Intl = {
    val __obj = js.Dynamic.literal(intl = intl, prevProps = prevProps)
  
    __obj.asInstanceOf[Anon_Intl]
  }
}

