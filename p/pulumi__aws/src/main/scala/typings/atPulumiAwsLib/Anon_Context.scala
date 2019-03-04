package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var grantTokens: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: java.lang.String
  var payload: java.lang.String
}

object Anon_Context {
  @scala.inline
  def apply(
    name: java.lang.String,
    payload: java.lang.String,
    context: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    grantTokens: js.Array[java.lang.String] = null
  ): Anon_Context = {
    val __obj = js.Dynamic.literal(name = name, payload = payload)
    if (context != null) __obj.updateDynamic("context")(context)
    if (grantTokens != null) __obj.updateDynamic("grantTokens")(grantTokens)
    __obj.asInstanceOf[Anon_Context]
  }
}

