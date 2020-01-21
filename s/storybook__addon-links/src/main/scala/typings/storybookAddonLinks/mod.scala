package typings.storybookAddonLinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-links", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @JSName("LinkTo")
  def LinkTo_(): Null = js.native
  def hrefTo(kind: String, name: String): js.Promise[String] = js.native
  def linkTo(idOrKindInput: String): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def linkTo(idOrKindInput: String, storyInput: String): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def linkTo(idOrKindInput: String, storyInput: js.Function1[/* repeated */ js.Any, String]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def withLinks(storyFn: js.Function0[Unit]): Unit = js.native
}

