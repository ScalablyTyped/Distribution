package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGTests extends js.Object {
  val requiredExtensions: SVGStringList
  val systemLanguage: SVGStringList
}

object SVGTests {
  @scala.inline
  def apply(requiredExtensions: SVGStringList, systemLanguage: SVGStringList): SVGTests = {
    val __obj = js.Dynamic.literal(requiredExtensions = requiredExtensions.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTests]
  }
}

