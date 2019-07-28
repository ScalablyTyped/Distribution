package typings.atStorybookAddonDashLinks.atStorybookAddonDashLinksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-links", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hrefTo(kind: String, story: String): js.Promise[String] = js.native
  def linkTo[T](book: String): js.Function0[Unit] = js.native
  def linkTo[T](book: String, kind: String): js.Function0[Unit] = js.native
  def linkTo[T](book: String, kind: LinkToFunction): js.Function0[Unit] = js.native
  def linkTo[T](book: LinkToFunction): js.Function0[Unit] = js.native
  def linkTo[T](book: LinkToFunction, kind: String): js.Function0[Unit] = js.native
  def linkTo[T](book: LinkToFunction, kind: LinkToFunction): js.Function0[Unit] = js.native
}

