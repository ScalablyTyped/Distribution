package typings.rollup.anon

import typings.rollup.mod._SourceMapInput
import typings.rollup.rollupStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`
  extends StObject
     with _SourceMapInput {
  
  var mappings: _empty
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal(mappings = "")
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setMappings(value: _empty): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
  }
}
