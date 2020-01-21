package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadLinkOpts extends js.Object {
  /** Whether or not to follow through any upstream links when resolving the source. */
  var canonical: js.UndefOr[Boolean] = js.undefined
}

object ReadLinkOpts {
  @scala.inline
  def apply(canonical: js.UndefOr[Boolean] = js.undefined): ReadLinkOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canonical)) __obj.updateDynamic("canonical")(canonical.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadLinkOpts]
  }
}

