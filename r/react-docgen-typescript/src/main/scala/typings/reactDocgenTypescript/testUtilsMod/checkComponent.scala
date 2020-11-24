package typings.reactDocgenTypescript.testUtilsMod

import typings.reactDocgenTypescript.parserMod.ComponentDoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-docgen-typescript/lib/@/tests/testUtils", "checkComponent")
@js.native
object checkComponent extends js.Object {
  
  def apply(actual: js.Array[ComponentDoc], expected: ExpectedComponents): Unit = js.native
  def apply(
    actual: js.Array[ComponentDoc],
    expected: ExpectedComponents,
    exactProperties: js.UndefOr[scala.Nothing],
    description: String
  ): Unit = js.native
  def apply(actual: js.Array[ComponentDoc], expected: ExpectedComponents, exactProperties: Boolean): Unit = js.native
  def apply(
    actual: js.Array[ComponentDoc],
    expected: ExpectedComponents,
    exactProperties: Boolean,
    description: String
  ): Unit = js.native
}
