package typings
package spdyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Plain extends js.Object {
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var protocols: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ssl: js.UndefOr[scala.Boolean] = js.undefined
  var `x-forwarded-for`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Plain {
  @scala.inline
  def apply(
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    protocol: java.lang.String = null,
    protocols: js.Array[java.lang.String] = null,
    ssl: js.UndefOr[scala.Boolean] = js.undefined,
    `x-forwarded-for`: java.lang.String = null
  ): Anon_Plain = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (`x-forwarded-for` != null) __obj.updateDynamic("x-forwarded-for")(`x-forwarded-for`)
    __obj.asInstanceOf[Anon_Plain]
  }
}

