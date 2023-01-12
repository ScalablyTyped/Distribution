package typings.rollup.anon

import typings.rollup.mod._SourceMapInput
import typings.rollup.rollupStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with _SourceMapInput {
  
  var mappings: _empty
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(mappings = "")
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setMappings(value: _empty): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
  }
}
