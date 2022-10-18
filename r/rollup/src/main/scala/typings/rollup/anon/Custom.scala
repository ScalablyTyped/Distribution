package typings.rollup.anon

import typings.rollup.mod.CustomPluginOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Custom extends StObject {
  
  var assertions: Record[String, String]
  
  var custom: js.UndefOr[CustomPluginOptions] = js.undefined
  
  var isEntry: Boolean
}
object Custom {
  
  inline def apply(assertions: Record[String, String], isEntry: Boolean): Custom = {
    val __obj = js.Dynamic.literal(assertions = assertions.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom]
  }
  
  extension [Self <: Custom](x: Self) {
    
    inline def setAssertions(value: Record[String, String]): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
    
    inline def setCustom(value: CustomPluginOptions): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setIsEntry(value: Boolean): Self = StObject.set(x, "isEntry", value.asInstanceOf[js.Any])
  }
}
