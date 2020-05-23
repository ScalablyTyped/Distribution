package typings.sinon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<sinon.sinon.SinonFakeServerOptions> */
trait PartialSinonFakeServerOpt extends js.Object {
  var autoRespond: js.UndefOr[Boolean] = js.undefined
  var autoRespondAfter: js.UndefOr[Double] = js.undefined
  var fakeHTTPMethods: js.UndefOr[Boolean] = js.undefined
  var respondImmediately: js.UndefOr[Boolean] = js.undefined
}

object PartialSinonFakeServerOpt {
  @scala.inline
  def apply(
    autoRespond: js.UndefOr[Boolean] = js.undefined,
    autoRespondAfter: js.UndefOr[Double] = js.undefined,
    fakeHTTPMethods: js.UndefOr[Boolean] = js.undefined,
    respondImmediately: js.UndefOr[Boolean] = js.undefined
  ): PartialSinonFakeServerOpt = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRespond)) __obj.updateDynamic("autoRespond")(autoRespond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRespondAfter)) __obj.updateDynamic("autoRespondAfter")(autoRespondAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fakeHTTPMethods)) __obj.updateDynamic("fakeHTTPMethods")(fakeHTTPMethods.get.asInstanceOf[js.Any])
    if (!js.isUndefined(respondImmediately)) __obj.updateDynamic("respondImmediately")(respondImmediately.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSinonFakeServerOpt]
  }
}

