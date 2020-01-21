package typings.sipJs.distGrammarMod

import typings.sipJs.sipJsStrings.end
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEndExpectation extends Expectation {
  var `type`: end
}

object IEndExpectation {
  @scala.inline
  def apply(`type`: end): IEndExpectation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEndExpectation]
  }
}

