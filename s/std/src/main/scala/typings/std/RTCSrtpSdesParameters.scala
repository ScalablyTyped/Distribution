package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCSrtpSdesParameters extends js.Object {
  var cryptoSuite: js.UndefOr[java.lang.String] = js.undefined
  var keyParams: js.UndefOr[js.Array[RTCSrtpKeyParam]] = js.undefined
  var sessionParams: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var tag: js.UndefOr[Double] = js.undefined
}

object RTCSrtpSdesParameters {
  @scala.inline
  def apply(
    cryptoSuite: java.lang.String = null,
    keyParams: js.Array[RTCSrtpKeyParam] = null,
    sessionParams: js.Array[java.lang.String] = null,
    tag: js.UndefOr[Double] = js.undefined
  ): RTCSrtpSdesParameters = {
    val __obj = js.Dynamic.literal()
    if (cryptoSuite != null) __obj.updateDynamic("cryptoSuite")(cryptoSuite.asInstanceOf[js.Any])
    if (keyParams != null) __obj.updateDynamic("keyParams")(keyParams.asInstanceOf[js.Any])
    if (sessionParams != null) __obj.updateDynamic("sessionParams")(sessionParams.asInstanceOf[js.Any])
    if (!js.isUndefined(tag)) __obj.updateDynamic("tag")(tag.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSrtpSdesParameters]
  }
}

