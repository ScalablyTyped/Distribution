package typings.prismaBinding.typesMod

import typings.graphqlBinding.distTypesMod.FragmentReplacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrismaOptions extends BasePrismaOptions {
  var typeDefs: String
}

object PrismaOptions {
  @scala.inline
  def apply(
    typeDefs: String,
    debug: js.UndefOr[Boolean] = js.undefined,
    disableCache: js.UndefOr[Boolean] = js.undefined,
    endpoint: String = null,
    fragmentReplacements: js.Array[FragmentReplacement] = null,
    secret: String = null
  ): PrismaOptions = {
    val __obj = js.Dynamic.literal(typeDefs = typeDefs.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCache)) __obj.updateDynamic("disableCache")(disableCache.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (fragmentReplacements != null) __obj.updateDynamic("fragmentReplacements")(fragmentReplacements.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrismaOptions]
  }
}

