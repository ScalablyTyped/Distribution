package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parsers extends StObject {
  
  def gexf(target: String, sigma: Sigma, callback: js.Function1[/* graph */ Sigma, Unit]): Unit
  @JSName("gexf")
  var gexf_Original: GexfParser
  
  def json(target: String, sigma: Sigma, callback: js.Function1[/* graph */ Sigma, Unit]): Unit
  @JSName("json")
  var json_Original: JsonParser
}
object Parsers {
  
  inline def apply(
    gexf: (/* target */ String, /* sigma */ Sigma, /* callback */ js.Function1[/* graph */ Sigma, Unit]) => Unit,
    json: (/* target */ String, /* sigma */ Sigma, /* callback */ js.Function1[/* graph */ Sigma, Unit]) => Unit
  ): Parsers = {
    val __obj = js.Dynamic.literal(gexf = js.Any.fromFunction3(gexf), json = js.Any.fromFunction3(json))
    __obj.asInstanceOf[Parsers]
  }
  
  extension [Self <: Parsers](x: Self) {
    
    inline def setGexf(
      value: (/* target */ String, /* sigma */ Sigma, /* callback */ js.Function1[/* graph */ Sigma, Unit]) => Unit
    ): Self = StObject.set(x, "gexf", js.Any.fromFunction3(value))
    
    inline def setJson(
      value: (/* target */ String, /* sigma */ Sigma, /* callback */ js.Function1[/* graph */ Sigma, Unit]) => Unit
    ): Self = StObject.set(x, "json", js.Any.fromFunction3(value))
  }
}
