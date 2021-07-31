package typings.shortenRepoUrl

import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(url: String): String = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(url: String, currentUrl: String): String = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], currentUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("shorten-repo-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def applyToLink(link: HTMLAnchorElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("applyToLink")(link.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def applyToLink(link: HTMLAnchorElement, currentUrl: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("applyToLink")(link.asInstanceOf[js.Any], currentUrl.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
