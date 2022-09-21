package typings.shortenRepoUrl

import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String): String = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(url: String, currentUrl: String): String = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], currentUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("shorten-repo-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Shortens a GitHub URL in a DOM anchor.
  	@param anchor An HTMLAnchorElement
  	@param url The GitHub URL to shorten.
  	@example https://github.com/nodejs/node/tree/v0.12/doc becomes nodejs/node@<code>v0.12</code>
  	*/
  inline def applyToLink(anchor: HTMLAnchorElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyToLink")(anchor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def applyToLink(anchor: HTMLAnchorElement, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyToLink")(anchor.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
