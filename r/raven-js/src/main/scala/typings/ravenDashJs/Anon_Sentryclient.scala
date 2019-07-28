package typings.ravenDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sentryclient extends js.Object {
  var sentry_client: String
  var sentry_key: String
  var sentry_version: String
}

object Anon_Sentryclient {
  @scala.inline
  def apply(sentry_client: String, sentry_key: String, sentry_version: String): Anon_Sentryclient = {
    val __obj = js.Dynamic.literal(sentry_client = sentry_client, sentry_key = sentry_key, sentry_version = sentry_version)
  
    __obj.asInstanceOf[Anon_Sentryclient]
  }
}

