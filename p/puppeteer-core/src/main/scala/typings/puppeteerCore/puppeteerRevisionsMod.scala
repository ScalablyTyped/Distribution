package typings.puppeteerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object puppeteerRevisionsMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/revisions", "PUPPETEER_REVISIONS")
  @js.native
  val PUPPETEER_REVISIONS: Revisions = js.native
  
  /* Inlined std.Readonly<{ readonly chromium :string,  readonly firefox :string}> */
  trait Revisions extends StObject {
    
    val chromium: String
    
    val firefox: String
  }
  object Revisions {
    
    inline def apply(chromium: String, firefox: String): Revisions = {
      val __obj = js.Dynamic.literal(chromium = chromium.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any])
      __obj.asInstanceOf[Revisions]
    }
    
    extension [Self <: Revisions](x: Self) {
      
      inline def setChromium(value: String): Self = StObject.set(x, "chromium", value.asInstanceOf[js.Any])
      
      inline def setFirefox(value: String): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
    }
  }
}
