package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: js.UndefOr[StringDictionary[String]] = js.undefined
  var grantTokens: js.UndefOr[js.Array[String]] = js.undefined
  var name: String
  var payload: String
}

object Anon_Context {
  @scala.inline
  def apply(
    name: String,
    payload: String,
    context: StringDictionary[String] = null,
    grantTokens: js.Array[String] = null
  ): Anon_Context = {
    val __obj = js.Dynamic.literal(name = name, payload = payload)
    if (context != null) __obj.updateDynamic("context")(context)
    if (grantTokens != null) __obj.updateDynamic("grantTokens")(grantTokens)
    __obj.asInstanceOf[Anon_Context]
  }
}

