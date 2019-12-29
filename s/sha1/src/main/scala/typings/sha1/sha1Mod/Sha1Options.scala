package typings.sha1.sha1Mod

import typings.sha1.sha1Booleans.`false`
import typings.sha1.sha1Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sha1.sha1Mod.Sha1AsStringOptions
  - typings.sha1.sha1Mod.Sha1AsBytesOptions
*/
trait Sha1Options extends js.Object

object Sha1Options {
  @scala.inline
  def Sha1AsStringOptions(asBytes: `false` = null, asString: js.UndefOr[Boolean] = js.undefined): Sha1Options = {
    val __obj = js.Dynamic.literal()
    if (asBytes != null) __obj.updateDynamic("asBytes")(asBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(asString)) __obj.updateDynamic("asString")(asString.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha1Options]
  }
  @scala.inline
  def Sha1AsBytesOptions(asBytes: `true`, asString: `false` = null): Sha1Options = {
    val __obj = js.Dynamic.literal(asBytes = asBytes.asInstanceOf[js.Any])
    if (asString != null) __obj.updateDynamic("asString")(asString.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha1Options]
  }
}

