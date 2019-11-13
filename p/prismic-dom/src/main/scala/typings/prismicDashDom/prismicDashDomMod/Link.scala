package typings.prismicDashDom.prismicDashDomMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Link extends js.Object {
  def url(link: js.Any): String = js.native
  def url(link: js.Any, linkResolver: js.Function1[/* doc */ js.Any, String]): String = js.native
}

@JSImport("prismic-dom", "Link")
@js.native
object Link extends TopLevel[Link]

