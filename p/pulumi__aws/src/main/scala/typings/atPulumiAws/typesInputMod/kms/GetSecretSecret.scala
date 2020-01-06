package typings.atPulumiAws.typesInputMod.kms

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretSecret extends js.Object {
  var context: js.UndefOr[StringDictionary[String]] = js.native
  var grantTokens: js.UndefOr[js.Array[String]] = js.native
  var name: String = js.native
  var payload: String = js.native
}

object GetSecretSecret {
  @scala.inline
  def apply(
    name: String,
    payload: String,
    context: StringDictionary[String] = null,
    grantTokens: js.Array[String] = null
  ): GetSecretSecret = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (grantTokens != null) __obj.updateDynamic("grantTokens")(grantTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretSecret]
  }
}

