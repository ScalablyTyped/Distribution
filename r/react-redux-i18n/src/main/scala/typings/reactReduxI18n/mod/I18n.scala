package typings.reactReduxI18n.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper methods
  */
@js.native
trait I18n extends js.Object {
  def l(timestamp: Double): String = js.native
  def l(timestamp: Double, options: js.Any): String = js.native
  def t(code: String): String = js.native
  def t(code: String, options: js.Any): String = js.native
}

@JSImport("react-redux-i18n", "I18n")
@js.native
object I18n extends TopLevel[I18n]

