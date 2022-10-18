package typings.ramlTypesystem.distSrcTypesystemInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceInfo extends StObject {
  
  /**
    * Namespace of defining library if any
    */
  var namespace: js.UndefOr[String] = js.undefined
  
  /**
    * Path to file which contains definition
    */
  var path: js.UndefOr[String] = js.undefined
}
object SourceInfo {
  
  inline def apply(): SourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceInfo]
  }
  
  extension [Self <: SourceInfo](x: Self) {
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
