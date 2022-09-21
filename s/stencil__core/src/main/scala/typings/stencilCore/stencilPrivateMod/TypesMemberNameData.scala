package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypesMemberNameData extends StObject {
  
  /**
    * An alias that Stencil may apply to the `localName` to avoid naming collisions. This name does not appear in the
    * file that is using `localName`.
    */
  var importName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the type as it's used within a file.
    */
  var localName: String
}
object TypesMemberNameData {
  
  inline def apply(localName: String): TypesMemberNameData = {
    val __obj = js.Dynamic.literal(localName = localName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypesMemberNameData]
  }
  
  extension [Self <: TypesMemberNameData](x: Self) {
    
    inline def setImportName(value: String): Self = StObject.set(x, "importName", value.asInstanceOf[js.Any])
    
    inline def setImportNameUndefined: Self = StObject.set(x, "importName", js.undefined)
    
    inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
  }
}
