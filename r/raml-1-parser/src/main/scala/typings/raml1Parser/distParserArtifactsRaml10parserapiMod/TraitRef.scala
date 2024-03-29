package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import typings.raml1Parser.distParserHighLevelASTMod.IAttribute
import typings.raml1Parser.distParserHighLevelASTMod.IStructuredValue
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.BasicNode
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.ValueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraitRef
  extends StObject
     with Reference {
  
  /**
    * Returns referenced trait
    **/
  def `trait`(): Trait
}
object TraitRef {
  
  inline def apply(
    RAMLVersion: () => String,
    highLevel: () => IAttribute,
    kind: () => String,
    meta: () => ValueMetadata,
    name: () => String,
    optional: () => Boolean,
    parent: () => BasicNode,
    structuredValue: () => TypeInstance,
    toJSON: () => Any,
    `trait`: () => Trait,
    value: () => IStructuredValue,
    wrapperClassName: () => String
  ): TraitRef = {
    val __obj = js.Dynamic.literal(RAMLVersion = js.Any.fromFunction0(RAMLVersion), highLevel = js.Any.fromFunction0(highLevel), kind = js.Any.fromFunction0(kind), meta = js.Any.fromFunction0(meta), name = js.Any.fromFunction0(name), optional = js.Any.fromFunction0(optional), parent = js.Any.fromFunction0(parent), structuredValue = js.Any.fromFunction0(structuredValue), toJSON = js.Any.fromFunction0(toJSON), value = js.Any.fromFunction0(value), wrapperClassName = js.Any.fromFunction0(wrapperClassName))
    __obj.updateDynamic("trait")(js.Any.fromFunction0(`trait`))
    __obj.asInstanceOf[TraitRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TraitRef] (val x: Self) extends AnyVal {
    
    inline def setTrait(value: () => Trait): Self = StObject.set(x, "trait", js.Any.fromFunction0(value))
  }
}
