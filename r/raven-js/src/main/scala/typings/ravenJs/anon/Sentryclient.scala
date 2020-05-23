package typings.ravenJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sentryclient extends js.Object {
  var sentry_client: String
  var sentry_key: String
  var sentry_version: String
}

object Sentryclient {
  @scala.inline
  def apply(sentry_client: String, sentry_key: String, sentry_version: String): Sentryclient = {
    val __obj = js.Dynamic.literal(sentry_client = sentry_client.asInstanceOf[js.Any], sentry_key = sentry_key.asInstanceOf[js.Any], sentry_version = sentry_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sentryclient]
  }
}

