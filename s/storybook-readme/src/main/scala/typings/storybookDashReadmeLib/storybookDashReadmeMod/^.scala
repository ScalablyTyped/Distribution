package typings
package storybookDashReadmeLib.storybookDashReadmeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storybook-readme", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val addReadme: MakeDecoratorResult = js.native
  def addFooter(md: java.lang.String): scala.Unit = js.native
  def addHeader(md: java.lang.String): scala.Unit = js.native
  def configureReadme(config: ConfigureReadmeConfig): scala.Unit = js.native
  def doc(readme: java.lang.String): RenderFunction = js.native
  def withDocs(custom: CustomComponents): js.Function1[/* readme */ Readme, HOCPattern] = js.native
  def withDocs(readme: Readme): DecoratorPattern = js.native
  def withDocs(readme: Readme, story: RenderFunction): RenderFunction = js.native
  def withReadme(readme: Readme): DecoratorPattern = js.native
  def withReadme(readme: Readme, story: RenderFunction): RenderFunction = js.native
}

