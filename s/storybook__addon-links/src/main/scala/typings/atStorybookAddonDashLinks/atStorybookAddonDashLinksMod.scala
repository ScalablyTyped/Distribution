package typings.atStorybookAddonDashLinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-links", JSImport.Namespace)
@js.native
object atStorybookAddonDashLinksMod extends js.Object {
  def LinkTo(): Null = js.native
  def hrefTo(kind: String, name: String): js.Promise[String] = js.native
  def linkTo(kind: String): js.Function1[/* repeated */ String, Unit] = js.native
  def linkTo(kind: String, story: String): js.Function1[/* repeated */ String, Unit] = js.native
  def withLinks(storyFn: js.Function0[Unit]): Unit = js.native
}

