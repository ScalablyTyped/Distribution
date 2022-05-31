package typings.purl

import typings.purl.mod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Parse the current page URL
    */
  inline def purl(): Url = js.Dynamic.global.applyDynamic("purl")().asInstanceOf[Url]
  /**
    * Pass in a URI as a string and parse that
    *
    * @param someUrl the url to be parsed
    */
  inline def purl(someUrl: String): Url = js.Dynamic.global.applyDynamic("purl")(someUrl.asInstanceOf[js.Any]).asInstanceOf[Url]
}
