package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CookiesHeaders extends js.Object {
  var cookies: Input[Anon_ForwardWhitelistedNames]
  var headers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var queryString: Input[Boolean]
  var queryStringCacheKeys: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object Anon_CookiesHeaders {
  @scala.inline
  def apply(
    cookies: Input[Anon_ForwardWhitelistedNames],
    queryString: Input[Boolean],
    headers: Input[js.Array[Input[String]]] = null,
    queryStringCacheKeys: Input[js.Array[Input[String]]] = null
  ): Anon_CookiesHeaders = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (queryStringCacheKeys != null) __obj.updateDynamic("queryStringCacheKeys")(queryStringCacheKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CookiesHeaders]
  }
}

