package typings.prismaBinding.typesMod

import typings.graphqlBinding.distTypesMod.FragmentReplacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePrismaOptions extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var disableCache: js.UndefOr[Boolean] = js.undefined
  var endpoint: js.UndefOr[String] = js.undefined
  var fragmentReplacements: js.UndefOr[js.Array[FragmentReplacement]] = js.undefined
  var secret: js.UndefOr[String] = js.undefined
}

object BasePrismaOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    disableCache: js.UndefOr[Boolean] = js.undefined,
    endpoint: String = null,
    fragmentReplacements: js.Array[FragmentReplacement] = null,
    secret: String = null
  ): BasePrismaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCache)) __obj.updateDynamic("disableCache")(disableCache.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (fragmentReplacements != null) __obj.updateDynamic("fragmentReplacements")(fragmentReplacements.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePrismaOptions]
  }
}

