package typings.raml1Parser.distParserArtifactsRaml08parserapiMod

import typings.raml1Parser.distParserHighLevelASTMod.IAttribute
import typings.raml1Parser.distParserHighLevelASTMod.IStructuredValue
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.BasicNode
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.ValueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceTypeRef
  extends StObject
     with Reference {
  
  /**
    * Returns referenced resource type
    **/
  def resourceType(): ResourceType
}
object ResourceTypeRef {
  
  inline def apply(
    RAMLVersion: () => String,
    highLevel: () => IAttribute,
    kind: () => String,
    meta: () => ValueMetadata,
    name: () => String,
    optional: () => Boolean,
    parent: () => BasicNode,
    resourceType: () => ResourceType,
    structuredValue: () => TypeInstance,
    toJSON: () => Any,
    value: () => IStructuredValue,
    wrapperClassName: () => String
  ): ResourceTypeRef = {
    val __obj = js.Dynamic.literal(RAMLVersion = js.Any.fromFunction0(RAMLVersion), highLevel = js.Any.fromFunction0(highLevel), kind = js.Any.fromFunction0(kind), meta = js.Any.fromFunction0(meta), name = js.Any.fromFunction0(name), optional = js.Any.fromFunction0(optional), parent = js.Any.fromFunction0(parent), resourceType = js.Any.fromFunction0(resourceType), structuredValue = js.Any.fromFunction0(structuredValue), toJSON = js.Any.fromFunction0(toJSON), value = js.Any.fromFunction0(value), wrapperClassName = js.Any.fromFunction0(wrapperClassName))
    __obj.asInstanceOf[ResourceTypeRef]
  }
  
  extension [Self <: ResourceTypeRef](x: Self) {
    
    inline def setResourceType(value: () => ResourceType): Self = StObject.set(x, "resourceType", js.Any.fromFunction0(value))
  }
}
