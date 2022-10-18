package typings.raml1Parser.distParserHighLevelASTMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializeOptions extends StObject {
  
  var dumpSchemaContents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For root nodes additional details can be included into output. If the option is set to `true`,
    * node content is returned as value of the **specification** root property. Other root properties are:
    *
    * * **ramlVersion** version of RAML used by the specification represented by the node
    * * **type** type of the node: Api, Overlay, Extension, Library, or any other RAML type in fragments case
    * * **errors** errors of the specification represented by the node
    * @default false
    */
  var rootNodeDetails: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to serialize metadata
    * @default true
    */
  var serializeMetadata: js.UndefOr[Boolean] = js.undefined
}
object SerializeOptions {
  
  inline def apply(): SerializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializeOptions]
  }
  
  extension [Self <: SerializeOptions](x: Self) {
    
    inline def setDumpSchemaContents(value: Boolean): Self = StObject.set(x, "dumpSchemaContents", value.asInstanceOf[js.Any])
    
    inline def setDumpSchemaContentsUndefined: Self = StObject.set(x, "dumpSchemaContents", js.undefined)
    
    inline def setRootNodeDetails(value: Boolean): Self = StObject.set(x, "rootNodeDetails", value.asInstanceOf[js.Any])
    
    inline def setRootNodeDetailsUndefined: Self = StObject.set(x, "rootNodeDetails", js.undefined)
    
    inline def setSerializeMetadata(value: Boolean): Self = StObject.set(x, "serializeMetadata", value.asInstanceOf[js.Any])
    
    inline def setSerializeMetadataUndefined: Self = StObject.set(x, "serializeMetadata", js.undefined)
  }
}
