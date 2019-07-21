package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientContext extends js.Object {
  var clientContext: js.UndefOr[java.lang.String] = js.undefined
  var payload: js.UndefOr[java.lang.String] = js.undefined
  var qualifier: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ClientContext {
  @scala.inline
  def apply(
    clientContext: java.lang.String = null,
    payload: java.lang.String = null,
    qualifier: java.lang.String = null
  ): Anon_ClientContext = {
    val __obj = js.Dynamic.literal()
    if (clientContext != null) __obj.updateDynamic("clientContext")(clientContext)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier)
    __obj.asInstanceOf[Anon_ClientContext]
  }
}

