package typings.storybookStore.ts39TypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtractOptions extends StObject {
  
  var includeDocsOnly: js.UndefOr[Boolean] = js.undefined
}
object ExtractOptions {
  
  inline def apply(): ExtractOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtractOptions]
  }
  
  extension [Self <: ExtractOptions](x: Self) {
    
    inline def setIncludeDocsOnly(value: Boolean): Self = StObject.set(x, "includeDocsOnly", value.asInstanceOf[js.Any])
    
    inline def setIncludeDocsOnlyUndefined: Self = StObject.set(x, "includeDocsOnly", js.undefined)
  }
}
