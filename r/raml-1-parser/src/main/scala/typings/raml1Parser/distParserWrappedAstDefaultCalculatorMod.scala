package typings.raml1Parser

import typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import typings.raml1Parser.distParserHighLevelASTMod.IProperty
import typings.raml1Parser.distParserWrappedAstParserCoreMod.BasicNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserWrappedAstDefaultCalculatorMod {
  
  @JSImport("raml-1-parser/dist/parser/wrapped-ast/defaultCalculator", "AttributeDefaultsCalculator")
  @js.native
  open class AttributeDefaultsCalculator protected () extends StObject {
    /**
      / **
      *
      * @param enabled - if false, defaults calculator will not return defaults from
      * attrValueOrDefault method, only original values.
      * @constructor
      */
    def this(enabled: Boolean) = this()
    def this(enabled: Boolean, toHighLevel: Boolean) = this()
    
    /**
      * Return attribute default value if defaults calculator is enabled.
      * If attribute value is null or undefined, returns attribute default.
      */
    def attributeDefaultIfEnabled(node: IHighLevelNode, attributeProperty: IProperty): Any = js.native
    
    /* private */ var enabled: Any = js.native
    
    /**
      * Returns attribute default.
      */
    def getAttributeDefault(node: IHighLevelNode, attributeProperty: IProperty): Any = js.native
    
    /**
      * Returns attribute default.
      * There are so many arguments instead of just providing a single AST node and getting
      * anything we want from it as sometimes we create fake nodes in helpers and thus
      * do not have actual high-level nodes at hands.
      */
    def getAttributeDefault2(attributeProperty: IProperty, node: IHighLevelNode): Any = js.native
    
    def getUnconditionalAttributeDefault(attributeProperty: IProperty, node: IHighLevelNode): Any = js.native
    
    def getWrapperAttributeDefault(wrapperNode: BasicNode, attributeName: String): Any = js.native
    
    def insertionKind(node: IHighLevelNode, attributeProperty: IProperty): InsertionKind = js.native
    
    def isEnabled(): Boolean = js.native
    
    /* private */ var toHighLevel: Any = js.native
    
    /**
      * These calculators are only applied when default calculator is generally disabled (this.enabled==false)
      * and should cover the cases when we -need- to insert some calculated value in any case
      * and helpers should be avoided for some reason.
      * @type {UnconditionalRequiredPropertyCalculator[]}
      */
    var unconditionalValueCalculators: js.Array[ValueCalculator] = js.native
    
    var valueCalculators: js.Array[ValueCalculator] = js.native
  }
  
  @js.native
  sealed trait InsertionKind extends StObject
  @JSImport("raml-1-parser/dist/parser/wrapped-ast/defaultCalculator", "InsertionKind")
  @js.native
  object InsertionKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InsertionKind & Double] = js.native
    
    @js.native
    sealed trait BY_DEFAULT
      extends StObject
         with InsertionKind
    /* 1 */ val BY_DEFAULT: typings.raml1Parser.distParserWrappedAstDefaultCalculatorMod.InsertionKind.BY_DEFAULT & Double = js.native
    
    @js.native
    sealed trait CALCULATED
      extends StObject
         with InsertionKind
    /* 0 */ val CALCULATED: typings.raml1Parser.distParserWrappedAstDefaultCalculatorMod.InsertionKind.CALCULATED & Double = js.native
  }
  
  trait ValueCalculator extends StObject {
    
    def calculate(attributeProperty: IProperty, node: IHighLevelNode): Any
    
    def kind(node: IHighLevelNode, attributeProperty: IProperty): InsertionKind
    
    def matches(attributeProperty: IProperty, node: IHighLevelNode): Boolean
  }
  object ValueCalculator {
    
    inline def apply(
      calculate: (IProperty, IHighLevelNode) => Any,
      kind: (IHighLevelNode, IProperty) => InsertionKind,
      matches: (IProperty, IHighLevelNode) => Boolean
    ): ValueCalculator = {
      val __obj = js.Dynamic.literal(calculate = js.Any.fromFunction2(calculate), kind = js.Any.fromFunction2(kind), matches = js.Any.fromFunction2(matches))
      __obj.asInstanceOf[ValueCalculator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueCalculator] (val x: Self) extends AnyVal {
      
      inline def setCalculate(value: (IProperty, IHighLevelNode) => Any): Self = StObject.set(x, "calculate", js.Any.fromFunction2(value))
      
      inline def setKind(value: (IHighLevelNode, IProperty) => InsertionKind): Self = StObject.set(x, "kind", js.Any.fromFunction2(value))
      
      inline def setMatches(value: (IProperty, IHighLevelNode) => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction2(value))
    }
  }
}
