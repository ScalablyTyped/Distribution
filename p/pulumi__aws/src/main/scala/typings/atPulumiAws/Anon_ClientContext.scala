package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientContext extends js.Object {
  var clientContext: js.UndefOr[String] = js.undefined
  var payload: js.UndefOr[String] = js.undefined
  var qualifier: js.UndefOr[String] = js.undefined
}

object Anon_ClientContext {
  @scala.inline
  def apply(clientContext: String = null, payload: String = null, qualifier: String = null): Anon_ClientContext = {
    val __obj = js.Dynamic.literal()
    if (clientContext != null) __obj.updateDynamic("clientContext")(clientContext)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier)
    __obj.asInstanceOf[Anon_ClientContext]
  }
}

