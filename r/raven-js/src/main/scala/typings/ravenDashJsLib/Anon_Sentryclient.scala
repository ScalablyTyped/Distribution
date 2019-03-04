package typings
package ravenDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sentryclient extends js.Object {
  var sentry_client: java.lang.String
  var sentry_key: java.lang.String
  var sentry_version: java.lang.String
}

object Anon_Sentryclient {
  @scala.inline
  def apply(sentry_client: java.lang.String, sentry_key: java.lang.String, sentry_version: java.lang.String): Anon_Sentryclient = {
    val __obj = js.Dynamic.literal(sentry_client = sentry_client, sentry_key = sentry_key, sentry_version = sentry_version)
  
    __obj.asInstanceOf[Anon_Sentryclient]
  }
}

