package typings.protractorHelpers.mod

import typings.protractorHelpers.mod.global.protractor.ElementArrayFinder
import typings.protractorHelpers.mod.global.protractor.ElementFinder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor-helpers", "createMessage")
@js.native
object createMessage extends js.Object {
  def apply(actual: String, message: String, isNot: js.Any): String = js.native
  def apply(actual: ElementArrayFinder, message: String, isNot: js.Any): String = js.native
  def apply(actual: ElementFinder, message: String, isNot: js.Any): String = js.native
}

