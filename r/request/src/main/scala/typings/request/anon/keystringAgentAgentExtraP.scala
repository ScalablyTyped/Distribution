package typings.request.anon

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.Agent
import typings.request.mod.PoolOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[key: string] : node.http.Agent | node.https.Agent} & request.request.ExtraPoolOptions */
trait keystringAgentAgentExtraP
  extends /* key */ StringDictionary[Agent | typings.node.httpsMod.Agent]
     with PoolOptions {
  var maxSockets: js.UndefOr[Double] = js.undefined
}

object keystringAgentAgentExtraP {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[Agent | typings.node.httpsMod.Agent] = null,
    maxSockets: js.UndefOr[Double] = js.undefined
  ): keystringAgentAgentExtraP = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(maxSockets)) __obj.updateDynamic("maxSockets")(maxSockets.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[keystringAgentAgentExtraP]
  }
}

