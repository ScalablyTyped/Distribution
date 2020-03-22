package typings.request

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
    maxSockets: Int | Double = null
  ): keystringAgentAgentExtraP = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    __obj.asInstanceOf[keystringAgentAgentExtraP]
  }
}

