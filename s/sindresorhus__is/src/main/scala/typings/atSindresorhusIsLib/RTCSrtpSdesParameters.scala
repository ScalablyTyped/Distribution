package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCSrtpSdesParameters extends js.Object {
  var cryptoSuite: js.UndefOr[java.lang.String] = js.undefined
  var keyParams: js.UndefOr[Array[RTCSrtpKeyParam]] = js.undefined
  var sessionParams: js.UndefOr[Array[java.lang.String]] = js.undefined
  var tag: js.UndefOr[scala.Double] = js.undefined
}

object RTCSrtpSdesParameters {
  @scala.inline
  def apply(
    cryptoSuite: java.lang.String = null,
    keyParams: Array[RTCSrtpKeyParam] = null,
    sessionParams: Array[java.lang.String] = null,
    tag: scala.Int | scala.Double = null
  ): RTCSrtpSdesParameters = {
    val __obj = js.Dynamic.literal()
    if (cryptoSuite != null) __obj.updateDynamic("cryptoSuite")(cryptoSuite)
    if (keyParams != null) __obj.updateDynamic("keyParams")(keyParams)
    if (sessionParams != null) __obj.updateDynamic("sessionParams")(sessionParams)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSrtpSdesParameters]
  }
}

