package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cookies extends js.Object {
  var cookies: Anon_Forward
  var headers: js.UndefOr[js.Array[String]] = js.undefined
  var queryString: Boolean
  var queryStringCacheKeys: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Cookies {
  @scala.inline
  def apply(
    cookies: Anon_Forward,
    queryString: Boolean,
    headers: js.Array[String] = null,
    queryStringCacheKeys: js.Array[String] = null
  ): Anon_Cookies = {
    val __obj = js.Dynamic.literal(cookies = cookies, queryString = queryString)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (queryStringCacheKeys != null) __obj.updateDynamic("queryStringCacheKeys")(queryStringCacheKeys)
    __obj.asInstanceOf[Anon_Cookies]
  }
}

