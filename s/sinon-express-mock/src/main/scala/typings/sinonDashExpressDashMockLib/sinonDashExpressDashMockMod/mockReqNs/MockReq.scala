package typings
package sinonDashExpressDashMockLib.sinonDashExpressDashMockMod.mockReqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockReq extends js.Object {
  var accepts: sinonLib.sinonMod.SinonNs.SinonStub
  var acceptsCharsets: sinonLib.sinonMod.SinonNs.SinonStub
  var acceptsEncodings: sinonLib.sinonMod.SinonNs.SinonStub
  var acceptsLanguages: sinonLib.sinonMod.SinonNs.SinonStub
  var body: js.Object
  var flash: sinonLib.sinonMod.SinonNs.SinonStub
  var get: sinonLib.sinonMod.SinonNs.SinonStub
  var is: sinonLib.sinonMod.SinonNs.SinonStub
  var params: js.Object
  var query: js.Object
  var session: js.Object
}

object MockReq {
  @scala.inline
  def apply(
    accepts: sinonLib.sinonMod.SinonNs.SinonStub,
    acceptsCharsets: sinonLib.sinonMod.SinonNs.SinonStub,
    acceptsEncodings: sinonLib.sinonMod.SinonNs.SinonStub,
    acceptsLanguages: sinonLib.sinonMod.SinonNs.SinonStub,
    body: js.Object,
    flash: sinonLib.sinonMod.SinonNs.SinonStub,
    get: sinonLib.sinonMod.SinonNs.SinonStub,
    is: sinonLib.sinonMod.SinonNs.SinonStub,
    params: js.Object,
    query: js.Object,
    session: js.Object
  ): MockReq = {
    val __obj = js.Dynamic.literal(accepts = accepts, acceptsCharsets = acceptsCharsets, acceptsEncodings = acceptsEncodings, acceptsLanguages = acceptsLanguages, body = body, flash = flash, get = get, is = is, params = params, query = query, session = session)
  
    __obj.asInstanceOf[MockReq]
  }
}

