package typings
package atRgroveParseDashXmlLib.atRgroveParseDashXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var ignoreUndefinedEntities: js.UndefOr[scala.Boolean] = js.undefined
  var preserveCdata: js.UndefOr[scala.Boolean] = js.undefined
  var preserveComments: js.UndefOr[scala.Boolean] = js.undefined
  var resolveUndefinedEntity: js.UndefOr[js.Function1[/* ref */ java.lang.String, java.lang.String]] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    ignoreUndefinedEntities: js.UndefOr[scala.Boolean] = js.undefined,
    preserveCdata: js.UndefOr[scala.Boolean] = js.undefined,
    preserveComments: js.UndefOr[scala.Boolean] = js.undefined,
    resolveUndefinedEntity: /* ref */ java.lang.String => java.lang.String = null
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreUndefinedEntities)) __obj.updateDynamic("ignoreUndefinedEntities")(ignoreUndefinedEntities)
    if (!js.isUndefined(preserveCdata)) __obj.updateDynamic("preserveCdata")(preserveCdata)
    if (!js.isUndefined(preserveComments)) __obj.updateDynamic("preserveComments")(preserveComments)
    if (resolveUndefinedEntity != null) __obj.updateDynamic("resolveUndefinedEntity")(js.Any.fromFunction1(resolveUndefinedEntity))
    __obj.asInstanceOf[ParseOptions]
  }
}

