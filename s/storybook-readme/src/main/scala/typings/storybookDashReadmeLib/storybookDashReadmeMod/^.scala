package typings
package storybookDashReadmeLib.storybookDashReadmeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storybook-readme", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def doc(readme: java.lang.String): storybookDashReadmeLib.storybookDashReadmeMod.RenderFunction = js.native
  def withDocs(custom: storybookDashReadmeLib.storybookDashReadmeMod.CustomComponents): js.Function1[
    /* readme */ storybookDashReadmeLib.storybookDashReadmeMod.Readme, 
    storybookDashReadmeLib.storybookDashReadmeMod.HOCPattern
  ] = js.native
  def withDocs(readme: storybookDashReadmeLib.storybookDashReadmeMod.Readme): storybookDashReadmeLib.storybookDashReadmeMod.DecoratorPattern = js.native
  def withDocs(
    readme: storybookDashReadmeLib.storybookDashReadmeMod.Readme,
    story: storybookDashReadmeLib.storybookDashReadmeMod.RenderFunction
  ): storybookDashReadmeLib.storybookDashReadmeMod.RenderFunction = js.native
  def withReadme(readme: storybookDashReadmeLib.storybookDashReadmeMod.Readme): storybookDashReadmeLib.storybookDashReadmeMod.DecoratorPattern = js.native
  def withReadme(
    readme: storybookDashReadmeLib.storybookDashReadmeMod.Readme,
    story: storybookDashReadmeLib.storybookDashReadmeMod.RenderFunction
  ): storybookDashReadmeLib.storybookDashReadmeMod.RenderFunction = js.native
}

