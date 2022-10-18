package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsNewFormatSpec0Dot8CommonMod {
  
  trait ElementSourceInfo
    extends StObject
       with SourceInfo {
    
    /**
      * Source information for fields which are defined in another file rather then their owning component.
      * If all scalar fields of the component are defined in the same file, the 'scalarsSources' field is undefined.
      */
    var scalarsSources: js.UndefOr[StringDictionary[js.Array[SourceInfo]]] = js.undefined
  }
  object ElementSourceInfo {
    
    inline def apply(): ElementSourceInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementSourceInfo]
    }
    
    extension [Self <: ElementSourceInfo](x: Self) {
      
      inline def setScalarsSources(value: StringDictionary[js.Array[SourceInfo]]): Self = StObject.set(x, "scalarsSources", value.asInstanceOf[js.Any])
      
      inline def setScalarsSourcesUndefined: Self = StObject.set(x, "scalarsSources", js.undefined)
    }
  }
  
  trait HasSource extends StObject {
    
    var __METADATA__ : js.UndefOr[Any] = js.undefined
    
    var sourceMap: js.UndefOr[ElementSourceInfo] = js.undefined
  }
  object HasSource {
    
    inline def apply(): HasSource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HasSource]
    }
    
    extension [Self <: HasSource](x: Self) {
      
      inline def setSourceMap(value: ElementSourceInfo): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def set__METADATA__(value: Any): Self = StObject.set(x, "__METADATA__", value.asInstanceOf[js.Any])
      
      inline def set__METADATA__Undefined: Self = StObject.set(x, "__METADATA__", js.undefined)
    }
  }
  
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
}
