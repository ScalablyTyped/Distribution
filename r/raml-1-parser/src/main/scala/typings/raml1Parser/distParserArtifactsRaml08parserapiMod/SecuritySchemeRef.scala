package typings.raml1Parser.distParserArtifactsRaml08parserapiMod

import typings.raml1Parser.distParserHighLevelASTMod.IAttribute
import typings.raml1Parser.distParserHighLevelASTMod.IStructuredValue
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.BasicNode
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.ValueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySchemeRef
  extends StObject
     with Reference {
  
  /**
    * Returns AST node of security scheme, this reference refers to, or null.
    **/
  def securityScheme(): AbstractSecurityScheme
  
  /**
    * Returns the name of security scheme, this reference refers to.
    **/
  def securitySchemeName(): String
}
object SecuritySchemeRef {
  
  inline def apply(
    RAMLVersion: () => String,
    highLevel: () => IAttribute,
    kind: () => String,
    meta: () => ValueMetadata,
    name: () => String,
    optional: () => Boolean,
    parent: () => BasicNode,
    securityScheme: () => AbstractSecurityScheme,
    securitySchemeName: () => String,
    structuredValue: () => TypeInstance,
    toJSON: () => Any,
    value: () => IStructuredValue,
    wrapperClassName: () => String
  ): SecuritySchemeRef = {
    val __obj = js.Dynamic.literal(RAMLVersion = js.Any.fromFunction0(RAMLVersion), highLevel = js.Any.fromFunction0(highLevel), kind = js.Any.fromFunction0(kind), meta = js.Any.fromFunction0(meta), name = js.Any.fromFunction0(name), optional = js.Any.fromFunction0(optional), parent = js.Any.fromFunction0(parent), securityScheme = js.Any.fromFunction0(securityScheme), securitySchemeName = js.Any.fromFunction0(securitySchemeName), structuredValue = js.Any.fromFunction0(structuredValue), toJSON = js.Any.fromFunction0(toJSON), value = js.Any.fromFunction0(value), wrapperClassName = js.Any.fromFunction0(wrapperClassName))
    __obj.asInstanceOf[SecuritySchemeRef]
  }
  
  extension [Self <: SecuritySchemeRef](x: Self) {
    
    inline def setSecurityScheme(value: () => AbstractSecurityScheme): Self = StObject.set(x, "securityScheme", js.Any.fromFunction0(value))
    
    inline def setSecuritySchemeName(value: () => String): Self = StObject.set(x, "securitySchemeName", js.Any.fromFunction0(value))
  }
}
