package typings.shortenDashRepoDashUrl

import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shorten-repo-url", JSImport.Namespace)
@js.native
object shortenDashRepoDashUrlMod extends js.Object {
  def apply(url: String): String = js.native
  def apply(url: String, currentUrl: String): String = js.native
  def applyToLink(link: HTMLAnchorElement): Boolean = js.native
  def applyToLink(link: HTMLAnchorElement, currentUrl: String): Boolean = js.native
}

