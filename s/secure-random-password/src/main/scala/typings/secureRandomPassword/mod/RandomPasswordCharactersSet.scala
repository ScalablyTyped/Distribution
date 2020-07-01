package typings.secureRandomPassword.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomPasswordCharactersSet extends js.Object {
  var characters: String
  var exactly: js.UndefOr[Double] = js.undefined
}

object RandomPasswordCharactersSet {
  @scala.inline
  def apply(characters: String, exactly: js.UndefOr[Double] = js.undefined): RandomPasswordCharactersSet = {
    val __obj = js.Dynamic.literal(characters = characters.asInstanceOf[js.Any])
    if (!js.isUndefined(exactly)) __obj.updateDynamic("exactly")(exactly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomPasswordCharactersSet]
  }
}

