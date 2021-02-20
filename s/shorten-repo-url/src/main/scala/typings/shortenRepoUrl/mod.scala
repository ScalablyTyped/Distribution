package typings.shortenRepoUrl

import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shorten-repo-url", JSImport.Namespace)
  @js.native
  def apply(url: String): String = js.native
  @JSImport("shorten-repo-url", JSImport.Namespace)
  @js.native
  def apply(url: String, currentUrl: String): String = js.native
  
  @JSImport("shorten-repo-url", "applyToLink")
  @js.native
  def applyToLink(link: HTMLAnchorElement): Boolean = js.native
  @JSImport("shorten-repo-url", "applyToLink")
  @js.native
  def applyToLink(link: HTMLAnchorElement, currentUrl: String): Boolean = js.native
}
