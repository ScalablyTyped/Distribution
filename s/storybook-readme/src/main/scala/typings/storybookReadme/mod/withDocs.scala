package typings.storybookReadme.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storybook-readme", "withDocs")
@js.native
object withDocs extends js.Object {
  def apply(custom: CustomComponents): js.Function1[/* readme */ Readme, HOCPattern] = js.native
  def apply(readme: Readme): DecoratorPattern = js.native
  def apply(readme: Readme, story: RenderFunction): RenderFunction = js.native
  def addFooterDocs(footerDoc: String): Unit = js.native
}

