package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import typings.raml1Parser.distParserHighLevelASTMod.IAttribute
import typings.raml1Parser.distParserHighLevelASTMod.IStructuredValue
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.BasicNode
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.ValueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationRef
  extends StObject
     with Reference {
  
  /**
    * Returns referenced annotation
    **/
  def annotation(): TypeDeclaration
}
object AnnotationRef {
  
  inline def apply(
    RAMLVersion: () => String,
    annotation: () => TypeDeclaration,
    highLevel: () => IAttribute,
    kind: () => String,
    meta: () => ValueMetadata,
    name: () => String,
    optional: () => Boolean,
    parent: () => BasicNode,
    structuredValue: () => TypeInstance,
    toJSON: () => Any,
    value: () => IStructuredValue,
    wrapperClassName: () => String
  ): AnnotationRef = {
    val __obj = js.Dynamic.literal(RAMLVersion = js.Any.fromFunction0(RAMLVersion), annotation = js.Any.fromFunction0(annotation), highLevel = js.Any.fromFunction0(highLevel), kind = js.Any.fromFunction0(kind), meta = js.Any.fromFunction0(meta), name = js.Any.fromFunction0(name), optional = js.Any.fromFunction0(optional), parent = js.Any.fromFunction0(parent), structuredValue = js.Any.fromFunction0(structuredValue), toJSON = js.Any.fromFunction0(toJSON), value = js.Any.fromFunction0(value), wrapperClassName = js.Any.fromFunction0(wrapperClassName))
    __obj.asInstanceOf[AnnotationRef]
  }
  
  extension [Self <: AnnotationRef](x: Self) {
    
    inline def setAnnotation(value: () => TypeDeclaration): Self = StObject.set(x, "annotation", js.Any.fromFunction0(value))
  }
}
