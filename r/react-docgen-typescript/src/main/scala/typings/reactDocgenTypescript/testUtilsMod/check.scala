package typings.reactDocgenTypescript.testUtilsMod

import typings.reactDocgenTypescript.parserMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-docgen-typescript/lib/@/tests/testUtils", "check")
@js.native
object check extends js.Object {
  
  def apply(componentName: String, expected: ExpectedComponents): Unit = js.native
  def apply(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: js.UndefOr[scala.Nothing],
    description: js.UndefOr[scala.Nothing],
    parserOpts: ParserOptions
  ): Unit = js.native
  def apply(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: js.UndefOr[scala.Nothing],
    description: String
  ): Unit = js.native
  def apply(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: js.UndefOr[scala.Nothing],
    description: String,
    parserOpts: ParserOptions
  ): Unit = js.native
  def apply(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: js.UndefOr[scala.Nothing],
    description: Null,
    parserOpts: ParserOptions
  ): Unit = js.native
  def apply(componentName: String, expected: ExpectedComponents, exactProperties: Boolean): Unit = js.native
  def apply(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: Boolean,
    description: js.UndefOr[scala.Nothing],
    parserOpts: ParserOptions
  ): Unit = js.native
  def apply(componentName: String, expected: ExpectedComponents, exactProperties: Boolean, description: String): Unit = js.native
  def apply(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: Boolean,
    description: String,
    parserOpts: ParserOptions
  ): Unit = js.native
  def apply(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: Boolean,
    description: Null,
    parserOpts: ParserOptions
  ): Unit = js.native
}
