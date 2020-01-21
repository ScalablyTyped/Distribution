package typings.reactDom.testUtilsMod

import typings.reactDom.TypeofReactTestUtils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "mockComponent")
@js.native
object mockComponent extends js.Object {
  def apply(mocked: MockedComponentClass): TypeofReactTestUtils = js.native
  def apply(mocked: MockedComponentClass, mockTagName: String): TypeofReactTestUtils = js.native
}

