package typings.rollup.anon

import typings.rollup.mod.CustomPluginOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assertions extends StObject {
  
  var assertions: js.UndefOr[Record[String, String]] = js.undefined
  
  var custom: js.UndefOr[CustomPluginOptions] = js.undefined
  
  var isEntry: js.UndefOr[Boolean] = js.undefined
  
  var skipSelf: js.UndefOr[Boolean] = js.undefined
}
object Assertions {
  
  inline def apply(): Assertions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Assertions]
  }
  
  extension [Self <: Assertions](x: Self) {
    
    inline def setAssertions(value: Record[String, String]): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
    
    inline def setAssertionsUndefined: Self = StObject.set(x, "assertions", js.undefined)
    
    inline def setCustom(value: CustomPluginOptions): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setIsEntry(value: Boolean): Self = StObject.set(x, "isEntry", value.asInstanceOf[js.Any])
    
    inline def setIsEntryUndefined: Self = StObject.set(x, "isEntry", js.undefined)
    
    inline def setSkipSelf(value: Boolean): Self = StObject.set(x, "skipSelf", value.asInstanceOf[js.Any])
    
    inline def setSkipSelfUndefined: Self = StObject.set(x, "skipSelf", js.undefined)
  }
}
