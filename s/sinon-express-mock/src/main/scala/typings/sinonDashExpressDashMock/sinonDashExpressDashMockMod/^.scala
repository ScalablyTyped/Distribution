package typings.sinonDashExpressDashMock.sinonDashExpressDashMockMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.sinonDashExpressDashMock.sinonDashExpressDashMockMod.mockReqNs.MockReq
import typings.sinonDashExpressDashMock.sinonDashExpressDashMockMod.mockResNs.MockRes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sinon-express-mock", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def mockReq[T /* <: js.Object */](): MockReq with T with Request = js.native
  def mockReq[T /* <: js.Object */](options: T): MockReq with T with Request = js.native
  def mockRes[T /* <: js.Object */](): MockRes with T with Response = js.native
  def mockRes[T /* <: js.Object */](options: T): MockRes with T with Response = js.native
}

