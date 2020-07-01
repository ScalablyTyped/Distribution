package typings.secureRandomPassword.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomPasswordOptions extends js.Object {
  var avoidAmbiguous: js.UndefOr[Boolean] = js.undefined
  var characters: js.UndefOr[
    String | RandomPasswordCharactersSet | (js.Array[RandomPasswordCharactersSet | String])
  ] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var predicate: js.UndefOr[js.Function1[/* result */ String, Boolean]] = js.undefined
}

object RandomPasswordOptions {
  @scala.inline
  def apply(
    avoidAmbiguous: js.UndefOr[Boolean] = js.undefined,
    characters: String | RandomPasswordCharactersSet | (js.Array[RandomPasswordCharactersSet | String]) = null,
    length: js.UndefOr[Double] = js.undefined,
    predicate: /* result */ String => Boolean = null
  ): RandomPasswordOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(avoidAmbiguous)) __obj.updateDynamic("avoidAmbiguous")(avoidAmbiguous.get.asInstanceOf[js.Any])
    if (characters != null) __obj.updateDynamic("characters")(characters.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (predicate != null) __obj.updateDynamic("predicate")(js.Any.fromFunction1(predicate))
    __obj.asInstanceOf[RandomPasswordOptions]
  }
}

