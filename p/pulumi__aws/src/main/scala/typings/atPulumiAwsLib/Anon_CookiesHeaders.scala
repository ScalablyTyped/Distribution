package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CookiesHeaders extends js.Object {
  var cookies: atPulumiPulumiLib.outputMod.Input[Anon_ForwardWhitelistedNames]
  var headers: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var queryString: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
  var queryStringCacheKeys: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
}

object Anon_CookiesHeaders {
  @scala.inline
  def apply(
    cookies: atPulumiPulumiLib.outputMod.Input[Anon_ForwardWhitelistedNames],
    queryString: atPulumiPulumiLib.outputMod.Input[scala.Boolean],
    headers: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    queryStringCacheKeys: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): Anon_CookiesHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    __obj.updateDynamic("queryString")(queryString.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (queryStringCacheKeys != null) __obj.updateDynamic("queryStringCacheKeys")(queryStringCacheKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CookiesHeaders]
  }
}

