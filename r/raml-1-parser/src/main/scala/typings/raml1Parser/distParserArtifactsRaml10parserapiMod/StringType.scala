package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import typings.raml1Parser.distParserHighLevelASTMod.IAttribute
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.BasicNode
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.ValueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringType
  extends StObject
     with ValueType
object StringType {
  
  inline def apply(
    RAMLVersion: () => String,
    highLevel: () => IAttribute,
    kind: () => String,
    meta: () => ValueMetadata,
    optional: () => Boolean,
    parent: () => BasicNode,
    toJSON: () => Any,
    value: () => Any,
    wrapperClassName: () => String
  ): StringType = {
    val __obj = js.Dynamic.literal(RAMLVersion = js.Any.fromFunction0(RAMLVersion), highLevel = js.Any.fromFunction0(highLevel), kind = js.Any.fromFunction0(kind), meta = js.Any.fromFunction0(meta), optional = js.Any.fromFunction0(optional), parent = js.Any.fromFunction0(parent), toJSON = js.Any.fromFunction0(toJSON), value = js.Any.fromFunction0(value), wrapperClassName = js.Any.fromFunction0(wrapperClassName))
    __obj.asInstanceOf[StringType]
  }
}
