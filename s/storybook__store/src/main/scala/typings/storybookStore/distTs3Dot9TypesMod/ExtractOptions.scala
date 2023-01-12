package typings.storybookStore.distTs3Dot9TypesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtractOptions] (val x: Self) extends AnyVal {
    
    inline def setIncludeDocsOnly(value: Boolean): Self = StObject.set(x, "includeDocsOnly", value.asInstanceOf[js.Any])
    
    inline def setIncludeDocsOnlyUndefined: Self = StObject.set(x, "includeDocsOnly", js.undefined)
  }
}
