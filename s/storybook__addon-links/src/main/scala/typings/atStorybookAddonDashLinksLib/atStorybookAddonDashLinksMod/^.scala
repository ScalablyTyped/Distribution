package typings
package atStorybookAddonDashLinksLib.atStorybookAddonDashLinksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-links", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hrefTo(kind: java.lang.String, story: java.lang.String): js.Promise[java.lang.String] = js.native
  def linkTo[T](book: LinkToFunction): js.Function0[scala.Unit] = js.native
  def linkTo[T](book: LinkToFunction, kind: LinkToFunction): js.Function0[scala.Unit] = js.native
  def linkTo[T](book: LinkToFunction, kind: java.lang.String): js.Function0[scala.Unit] = js.native
  def linkTo[T](book: java.lang.String): js.Function0[scala.Unit] = js.native
  def linkTo[T](book: java.lang.String, kind: LinkToFunction): js.Function0[scala.Unit] = js.native
  def linkTo[T](book: java.lang.String, kind: java.lang.String): js.Function0[scala.Unit] = js.native
}

