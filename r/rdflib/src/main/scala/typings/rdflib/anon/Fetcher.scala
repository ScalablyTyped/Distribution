package typings.rdflib.anon

import typings.rdflib.libFetcherMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fetcher extends StObject {
  
  var fetcher: default
}
object Fetcher {
  
  inline def apply(fetcher: default): Fetcher = {
    val __obj = js.Dynamic.literal(fetcher = fetcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fetcher]
  }
  
  extension [Self <: Fetcher](x: Self) {
    
    inline def setFetcher(value: default): Self = StObject.set(x, "fetcher", value.asInstanceOf[js.Any])
  }
}
