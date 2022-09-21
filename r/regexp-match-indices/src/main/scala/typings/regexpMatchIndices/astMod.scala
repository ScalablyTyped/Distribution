package typings.regexpMatchIndices

import typings.regexpMatchIndices.anon.Format
import typings.regexpMatchIndices.anon.PartialAlternative
import typings.regexpMatchIndices.anon.PartialAstRegExp
import typings.regexpMatchIndices.anon.PartialCharacterClass
import typings.regexpMatchIndices.anon.PartialClassRange
import typings.regexpMatchIndices.anon.PartialDisjunction
import typings.regexpMatchIndices.anon.PartialRepetition
import typings.regexpMatchIndices.astMod.AstPath.Alternative
import typings.regexpMatchIndices.astMod.AstPath.Assertion
import typings.regexpMatchIndices.astMod.AstPath.Backreference
import typings.regexpMatchIndices.astMod.AstPath.Char
import typings.regexpMatchIndices.astMod.AstPath.CharacterClass
import typings.regexpMatchIndices.astMod.AstPath.ClassRange
import typings.regexpMatchIndices.astMod.AstPath.Disjunction
import typings.regexpMatchIndices.astMod.AstPath.Group
import typings.regexpMatchIndices.astMod.AstPath.Quantifier
import typings.regexpMatchIndices.astMod.AstPath.RegExp
import typings.regexpMatchIndices.astMod.AstPath.Repetition
import typings.regexpMatchIndices.regexpMatchIndicesNumbers.`0`
import typings.regexpMatchIndices.regexpMatchIndicesStrings.assertion
import typings.regexpMatchIndices.regexpMatchIndicesStrings.body
import typings.regexpMatchIndices.regexpMatchIndicesStrings.expression
import typings.regexpMatchIndices.regexpMatchIndicesStrings.expressions
import typings.regexpMatchIndices.regexpMatchIndicesStrings.from
import typings.regexpMatchIndices.regexpMatchIndicesStrings.quantifier
import typings.regexpMatchIndices.regexpMatchIndicesStrings.to
import typings.regexpTree.astMod.AstRegExp
import typings.regexpTree.astMod.CapturingGroup
import typings.regexpTree.astMod.Expression
import typings.regexpTree.astMod.LookaroundAssertion
import typings.regexpTree.astMod.NamedBackreference
import typings.regexpTree.astMod.NoncapturingGroup
import typings.regexpTree.astMod.NumericBackreference
import typings.regexpTree.astMod.RangeQuantifier
import typings.regexpTree.astMod.SimpleAssertion
import typings.regexpTree.astMod.SimpleChar
import typings.regexpTree.astMod.SimpleQuantifier
import typings.regexpTree.astMod.SpecialChar
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object astMod {
  
  /* Inlined regexp-match-indices.regexp-tree/ast.AstTypes[keyof regexp-match-indices.regexp-tree/ast.AstTypes] */
  /* Rewritten from type alias, can be one of: 
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.kind
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.from
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.to
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.quantifier
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.expressions
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.codePoint
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.value
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.escaped
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.reference
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.flags
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.expression
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.assertion
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.body
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.right
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.capturing
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.nameRaw
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.greedy
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.number
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.referenceRaw
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.left
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.name
    - typings.regexpMatchIndices.regexpMatchIndicesStrings.negative
  */
  trait AstNode extends StObject
  object AstNode {
    
    inline def assertion: typings.regexpMatchIndices.regexpMatchIndicesStrings.assertion = "assertion".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.assertion]
    
    inline def body: typings.regexpMatchIndices.regexpMatchIndicesStrings.body = "body".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.body]
    
    inline def capturing: typings.regexpMatchIndices.regexpMatchIndicesStrings.capturing = "capturing".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.capturing]
    
    inline def codePoint: typings.regexpMatchIndices.regexpMatchIndicesStrings.codePoint = "codePoint".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.codePoint]
    
    inline def escaped: typings.regexpMatchIndices.regexpMatchIndicesStrings.escaped = "escaped".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.escaped]
    
    inline def expression: typings.regexpMatchIndices.regexpMatchIndicesStrings.expression = "expression".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.expression]
    
    inline def expressions: typings.regexpMatchIndices.regexpMatchIndicesStrings.expressions = "expressions".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.expressions]
    
    inline def flags: typings.regexpMatchIndices.regexpMatchIndicesStrings.flags = "flags".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.flags]
    
    inline def from: typings.regexpMatchIndices.regexpMatchIndicesStrings.from = "from".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.from]
    
    inline def greedy: typings.regexpMatchIndices.regexpMatchIndicesStrings.greedy = "greedy".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.greedy]
    
    inline def kind: typings.regexpMatchIndices.regexpMatchIndicesStrings.kind = "kind".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.kind]
    
    inline def left: typings.regexpMatchIndices.regexpMatchIndicesStrings.left = "left".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.left]
    
    inline def name: typings.regexpMatchIndices.regexpMatchIndicesStrings.name = "name".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.name]
    
    inline def nameRaw: typings.regexpMatchIndices.regexpMatchIndicesStrings.nameRaw = "nameRaw".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.nameRaw]
    
    inline def negative: typings.regexpMatchIndices.regexpMatchIndicesStrings.negative = "negative".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.negative]
    
    inline def number: typings.regexpMatchIndices.regexpMatchIndicesStrings.number = "number".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.number]
    
    inline def quantifier: typings.regexpMatchIndices.regexpMatchIndicesStrings.quantifier = "quantifier".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.quantifier]
    
    inline def reference: typings.regexpMatchIndices.regexpMatchIndicesStrings.reference = "reference".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.reference]
    
    inline def referenceRaw: typings.regexpMatchIndices.regexpMatchIndicesStrings.referenceRaw = "referenceRaw".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.referenceRaw]
    
    inline def right: typings.regexpMatchIndices.regexpMatchIndicesStrings.right = "right".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.right]
    
    inline def to: typings.regexpMatchIndices.regexpMatchIndicesStrings.to = "to".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.to]
    
    inline def value: typings.regexpMatchIndices.regexpMatchIndicesStrings.value = "value".asInstanceOf[typings.regexpMatchIndices.regexpMatchIndicesStrings.value]
  }
  
  object AstPath {
    
    @js.native
    trait Alternative extends StObject {
      
      def appendChild(node: typings.regexpTree.astMod.Alternative): AstPath[typings.regexpTree.astMod.Alternative] = js.native
      def appendChild(node: CapturingGroup): AstPath[CapturingGroup] = js.native
      def appendChild(node: typings.regexpTree.astMod.CharacterClass): AstPath[typings.regexpTree.astMod.CharacterClass] = js.native
      def appendChild(node: typings.regexpTree.astMod.Disjunction): AstPath[typings.regexpTree.astMod.Disjunction] = js.native
      def appendChild(node: LookaroundAssertion): AstPath[LookaroundAssertion] = js.native
      def appendChild(node: NamedBackreference): AstPath[NamedBackreference] = js.native
      def appendChild(node: NoncapturingGroup): AstPath[NoncapturingGroup] = js.native
      def appendChild(node: NumericBackreference): AstPath[NumericBackreference] = js.native
      def appendChild(node: typings.regexpTree.astMod.Repetition): AstPath[typings.regexpTree.astMod.Repetition] = js.native
      def appendChild(node: SimpleAssertion): AstPath[SimpleAssertion] = js.native
      def appendChild(node: SimpleChar): AstPath[SimpleChar] = js.native
      def appendChild(node: SpecialChar): AstPath[SpecialChar] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: typings.regexpTree.astMod.Alternative, property: expressions): AstPath[typings.regexpTree.astMod.Alternative] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: CapturingGroup, property: expressions): AstPath[CapturingGroup] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: typings.regexpTree.astMod.CharacterClass, property: expressions): AstPath[typings.regexpTree.astMod.CharacterClass] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: typings.regexpTree.astMod.Disjunction, property: expressions): AstPath[typings.regexpTree.astMod.Disjunction] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: LookaroundAssertion, property: expressions): AstPath[LookaroundAssertion] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: NamedBackreference, property: expressions): AstPath[NamedBackreference] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: NoncapturingGroup, property: expressions): AstPath[NoncapturingGroup] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: NumericBackreference, property: expressions): AstPath[NumericBackreference] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: typings.regexpTree.astMod.Repetition, property: expressions): AstPath[typings.regexpTree.astMod.Repetition] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: SimpleAssertion, property: expressions): AstPath[SimpleAssertion] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: SimpleChar, property: expressions): AstPath[SimpleChar] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: SpecialChar, property: expressions): AstPath[SpecialChar] = js.native
      
      def getChild(): AstPath[Expression] = js.native
      def getChild(n: Double): AstPath[Expression] = js.native
      
      def getNextSibling(): AstPath[Expression] | Null = js.native
      
      def getParent(): (AstPath[
            AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      def getPreviousSibling(): AstPath[Expression] | Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typings.regexpTree.astMod.Alternative = js.native
      
      var parent: AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition | Null = js.native
      
      var parentPath: (AstPath[
            AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: typings.regexpTree.astMod.Alternative): AstPath[typings.regexpTree.astMod.Alternative] | Null = js.native
      def replace(node: CapturingGroup): AstPath[CapturingGroup] | Null = js.native
      def replace(node: typings.regexpTree.astMod.CharacterClass): AstPath[typings.regexpTree.astMod.CharacterClass] | Null = js.native
      def replace(node: typings.regexpTree.astMod.Disjunction): AstPath[typings.regexpTree.astMod.Disjunction] | Null = js.native
      def replace(node: LookaroundAssertion): AstPath[LookaroundAssertion] | Null = js.native
      def replace(node: NamedBackreference): AstPath[NamedBackreference] | Null = js.native
      def replace(node: NoncapturingGroup): AstPath[NoncapturingGroup] | Null = js.native
      def replace(node: NumericBackreference): AstPath[NumericBackreference] | Null = js.native
      def replace(node: typings.regexpTree.astMod.Repetition): AstPath[typings.regexpTree.astMod.Repetition] | Null = js.native
      def replace(node: SimpleAssertion): AstPath[SimpleAssertion] | Null = js.native
      def replace(node: SimpleChar): AstPath[SimpleChar] | Null = js.native
      def replace(node: SpecialChar): AstPath[SpecialChar] | Null = js.native
      
      def setChild(node: typings.regexpTree.astMod.Alternative, index: Double): AstPath[typings.regexpTree.astMod.Alternative] = js.native
      def setChild(node: CapturingGroup, index: Double): AstPath[CapturingGroup] = js.native
      def setChild(node: typings.regexpTree.astMod.CharacterClass, index: Double): AstPath[typings.regexpTree.astMod.CharacterClass] = js.native
      def setChild(node: typings.regexpTree.astMod.Disjunction, index: Double): AstPath[typings.regexpTree.astMod.Disjunction] = js.native
      def setChild(node: LookaroundAssertion, index: Double): AstPath[LookaroundAssertion] = js.native
      def setChild(node: NamedBackreference, index: Double): AstPath[NamedBackreference] = js.native
      def setChild(node: NoncapturingGroup, index: Double): AstPath[NoncapturingGroup] = js.native
      def setChild(node: NumericBackreference, index: Double): AstPath[NumericBackreference] = js.native
      def setChild(node: typings.regexpTree.astMod.Repetition, index: Double): AstPath[typings.regexpTree.astMod.Repetition] = js.native
      def setChild(node: SimpleAssertion, index: Double): AstPath[SimpleAssertion] = js.native
      def setChild(node: SimpleChar, index: Double): AstPath[SimpleChar] = js.native
      def setChild(node: SpecialChar, index: Double): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_expressions(node: typings.regexpTree.astMod.Alternative, index: Double, property: expressions): AstPath[typings.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_expressions(node: CapturingGroup, index: Double, property: expressions): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expressions(node: typings.regexpTree.astMod.CharacterClass, index: Double, property: expressions): AstPath[typings.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_expressions(node: typings.regexpTree.astMod.Disjunction, index: Double, property: expressions): AstPath[typings.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_expressions(node: LookaroundAssertion, index: Double, property: expressions): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_expressions(node: NamedBackreference, index: Double, property: expressions): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_expressions(node: NoncapturingGroup, index: Double, property: expressions): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expressions(node: NumericBackreference, index: Double, property: expressions): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_expressions(node: typings.regexpTree.astMod.Repetition, index: Double, property: expressions): AstPath[typings.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_expressions(node: SimpleAssertion, index: Double, property: expressions): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_expressions(node: SimpleChar, index: Double, property: expressions): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_expressions(node: SpecialChar, index: Double, property: expressions): AstPath[SpecialChar] = js.native
      
      def update(nodeProps: PartialAlternative): Unit = js.native
    }
    
    @js.native
    trait Assertion extends StObject {
      
      def getNextSibling(): AstPath[Expression] | Null = js.native
      
      def getParent(): (AstPath[
            AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      def getPreviousSibling(): AstPath[Expression] | Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typings.regexpTree.astMod.Assertion = js.native
      
      var parent: AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition | Null = js.native
      
      var parentPath: (AstPath[
            AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: typings.regexpTree.astMod.Alternative): AstPath[typings.regexpTree.astMod.Alternative] | Null = js.native
      def replace(node: CapturingGroup): AstPath[CapturingGroup] | Null = js.native
      def replace(node: typings.regexpTree.astMod.CharacterClass): AstPath[typings.regexpTree.astMod.CharacterClass] | Null = js.native
      def replace(node: typings.regexpTree.astMod.Disjunction): AstPath[typings.regexpTree.astMod.Disjunction] | Null = js.native
      def replace(node: LookaroundAssertion): AstPath[LookaroundAssertion] | Null = js.native
      def replace(node: NamedBackreference): AstPath[NamedBackreference] | Null = js.native
      def replace(node: NoncapturingGroup): AstPath[NoncapturingGroup] | Null = js.native
      def replace(node: NumericBackreference): AstPath[NumericBackreference] | Null = js.native
      def replace(node: typings.regexpTree.astMod.Repetition): AstPath[typings.regexpTree.astMod.Repetition] | Null = js.native
      def replace(node: SimpleAssertion): AstPath[SimpleAssertion] | Null = js.native
      def replace(node: SimpleChar): AstPath[SimpleChar] | Null = js.native
      def replace(node: SpecialChar): AstPath[SpecialChar] | Null = js.native
      
      @JSName("setChild")
      def setChild_assertion(node: Null, index: Null, property: assertion): Null = js.native
      @JSName("setChild")
      def setChild_assertion(node: Null, index: Unit, property: assertion): Null = js.native
      @JSName("setChild")
      def setChild_assertion(node: typings.regexpTree.astMod.Alternative, index: Null, property: assertion): AstPath[typings.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_assertion(node: typings.regexpTree.astMod.Alternative, index: Unit, property: assertion): AstPath[typings.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_assertion(node: CapturingGroup, index: Null, property: assertion): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_assertion(node: CapturingGroup, index: Unit, property: assertion): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_assertion(node: typings.regexpTree.astMod.CharacterClass, index: Null, property: assertion): AstPath[typings.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_assertion(node: typings.regexpTree.astMod.CharacterClass, index: Unit, property: assertion): AstPath[typings.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_assertion(node: typings.regexpTree.astMod.Disjunction, index: Null, property: assertion): AstPath[typings.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_assertion(node: typings.regexpTree.astMod.Disjunction, index: Unit, property: assertion): AstPath[typings.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_assertion(node: LookaroundAssertion, index: Null, property: assertion): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_assertion(node: LookaroundAssertion, index: Unit, property: assertion): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_assertion(node: NamedBackreference, index: Null, property: assertion): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_assertion(node: NamedBackreference, index: Unit, property: assertion): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_assertion(node: NoncapturingGroup, index: Null, property: assertion): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_assertion(node: NoncapturingGroup, index: Unit, property: assertion): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_assertion(node: NumericBackreference, index: Null, property: assertion): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_assertion(node: NumericBackreference, index: Unit, property: assertion): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_assertion(node: typings.regexpTree.astMod.Repetition, index: Null, property: assertion): AstPath[typings.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_assertion(node: typings.regexpTree.astMod.Repetition, index: Unit, property: assertion): AstPath[typings.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_assertion(node: SimpleAssertion, index: Null, property: assertion): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_assertion(node: SimpleAssertion, index: Unit, property: assertion): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_assertion(node: SimpleChar, index: Null, property: assertion): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_assertion(node: SimpleChar, index: Unit, property: assertion): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_assertion(node: SpecialChar, index: Null, property: assertion): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_assertion(node: SpecialChar, index: Unit, property: assertion): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_assertion[T /* <: Expression */](node: T, index: Null, property: assertion): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_assertion[T /* <: Expression */](node: T, index: Unit, property: assertion): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_assertion_T_Expression_Union[T /* <: Expression */](node: Null, index: Null, property: assertion): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_assertion_T_Expression_Union[T /* <: Expression */](node: Null, index: Unit, property: assertion): AstPath[T] | Null = js.native
      
      def update(nodeProps: Partial[typings.regexpTree.astMod.Assertion]): Unit = js.native
    }
    
    @js.native
    trait Backreference extends StObject {
      
      def getNextSibling(): AstPath[Expression] | Null = js.native
      
      def getParent(): (AstPath[
            AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      def getPreviousSibling(): AstPath[Expression] | Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typings.regexpTree.astMod.Backreference = js.native
      
      var parent: AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition | Null = js.native
      
      var parentPath: (AstPath[
            AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: typings.regexpTree.astMod.Alternative): AstPath[typings.regexpTree.astMod.Alternative] | Null = js.native
      def replace(node: CapturingGroup): AstPath[CapturingGroup] | Null = js.native
      def replace(node: typings.regexpTree.astMod.CharacterClass): AstPath[typings.regexpTree.astMod.CharacterClass] | Null = js.native
      def replace(node: typings.regexpTree.astMod.Disjunction): AstPath[typings.regexpTree.astMod.Disjunction] | Null = js.native
      def replace(node: LookaroundAssertion): AstPath[LookaroundAssertion] | Null = js.native
      def replace(node: NamedBackreference): AstPath[NamedBackreference] | Null = js.native
      def replace(node: NoncapturingGroup): AstPath[NoncapturingGroup] | Null = js.native
      def replace(node: NumericBackreference): AstPath[NumericBackreference] | Null = js.native
      def replace(node: typings.regexpTree.astMod.Repetition): AstPath[typings.regexpTree.astMod.Repetition] | Null = js.native
      def replace(node: SimpleAssertion): AstPath[SimpleAssertion] | Null = js.native
      def replace(node: SimpleChar): AstPath[SimpleChar] | Null = js.native
      def replace(node: SpecialChar): AstPath[SpecialChar] | Null = js.native
      
      def update(nodeProps: Partial[typings.regexpTree.astMod.Backreference]): Unit = js.native
    }
    
    @js.native
    trait Char extends StObject {
      
      def getNextSibling(): (AstPath[Expression | typings.regexpTree.astMod.ClassRange]) | Null = js.native
      
      def getParent(): (AstPath[
            AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition | typings.regexpTree.astMod.CharacterClass | typings.regexpTree.astMod.ClassRange
          ]) | Null = js.native
      
      def getPreviousSibling(): (AstPath[Expression | typings.regexpTree.astMod.ClassRange]) | Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typings.regexpTree.astMod.Char = js.native
      
      var parent: AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition | typings.regexpTree.astMod.CharacterClass | typings.regexpTree.astMod.ClassRange | Null = js.native
      
      var parentPath: (AstPath[
            AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition | typings.regexpTree.astMod.CharacterClass | typings.regexpTree.astMod.ClassRange
          ]) | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: typings.regexpTree.astMod.Alternative): AstPath[typings.regexpTree.astMod.Alternative] | Null = js.native
      def replace(node: CapturingGroup): AstPath[CapturingGroup] | Null = js.native
      def replace(node: typings.regexpTree.astMod.CharacterClass): AstPath[typings.regexpTree.astMod.CharacterClass] | Null = js.native
      def replace(node: typings.regexpTree.astMod.ClassRange): AstPath[typings.regexpTree.astMod.ClassRange] | Null = js.native
      def replace(node: typings.regexpTree.astMod.Disjunction): AstPath[typings.regexpTree.astMod.Disjunction] | Null = js.native
      def replace(node: LookaroundAssertion): AstPath[LookaroundAssertion] | Null = js.native
      def replace(node: NamedBackreference): AstPath[NamedBackreference] | Null = js.native
      def replace(node: NoncapturingGroup): AstPath[NoncapturingGroup] | Null = js.native
      def replace(node: NumericBackreference): AstPath[NumericBackreference] | Null = js.native
      def replace(node: typings.regexpTree.astMod.Repetition): AstPath[typings.regexpTree.astMod.Repetition] | Null = js.native
      def replace(node: SimpleAssertion): AstPath[SimpleAssertion] | Null = js.native
      def replace(node: SimpleChar): AstPath[SimpleChar] | Null = js.native
      def replace(node: SpecialChar): AstPath[SpecialChar] | Null = js.native
      
      def update(nodeProps: Partial[typings.regexpTree.astMod.Char]): Unit = js.native
    }
    
    @js.native
    trait CharacterClass extends StObject {
      
      def appendChild(node: typings.regexpTree.astMod.ClassRange): AstPath[typings.regexpTree.astMod.ClassRange] = js.native
      def appendChild(node: SimpleChar): AstPath[SimpleChar] = js.native
      def appendChild(node: SpecialChar): AstPath[SpecialChar] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: typings.regexpTree.astMod.ClassRange, property: expressions): AstPath[typings.regexpTree.astMod.ClassRange] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: SimpleChar, property: expressions): AstPath[SimpleChar] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: SpecialChar, property: expressions): AstPath[SpecialChar] = js.native
      
      def getChild(): AstPath[typings.regexpTree.astMod.Char | typings.regexpTree.astMod.ClassRange] = js.native
      def getChild(n: Double): AstPath[typings.regexpTree.astMod.Char | typings.regexpTree.astMod.ClassRange] = js.native
      
      def getNextSibling(): AstPath[Expression] | Null = js.native
      
      def getParent(): (AstPath[
            AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      def getPreviousSibling(): AstPath[Expression] | Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def insertChildAt(node: typings.regexpTree.astMod.ClassRange, index: Double): Unit = js.native
      def insertChildAt(node: SimpleChar, index: Double): Unit = js.native
      def insertChildAt(node: SpecialChar, index: Double): Unit = js.native
      @JSName("insertChildAt")
      def insertChildAt_expressions(node: typings.regexpTree.astMod.ClassRange, index: Double, property: expressions): Unit = js.native
      @JSName("insertChildAt")
      def insertChildAt_expressions(node: SimpleChar, index: Double, property: expressions): Unit = js.native
      @JSName("insertChildAt")
      def insertChildAt_expressions(node: SpecialChar, index: Double, property: expressions): Unit = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typings.regexpTree.astMod.CharacterClass = js.native
      
      var parent: AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition | Null = js.native
      
      var parentPath: (AstPath[
            AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: typings.regexpTree.astMod.Alternative): AstPath[typings.regexpTree.astMod.Alternative] | Null = js.native
      def replace(node: CapturingGroup): AstPath[CapturingGroup] | Null = js.native
      def replace(node: typings.regexpTree.astMod.CharacterClass): AstPath[typings.regexpTree.astMod.CharacterClass] | Null = js.native
      def replace(node: typings.regexpTree.astMod.Disjunction): AstPath[typings.regexpTree.astMod.Disjunction] | Null = js.native
      def replace(node: LookaroundAssertion): AstPath[LookaroundAssertion] | Null = js.native
      def replace(node: NamedBackreference): AstPath[NamedBackreference] | Null = js.native
      def replace(node: NoncapturingGroup): AstPath[NoncapturingGroup] | Null = js.native
      def replace(node: NumericBackreference): AstPath[NumericBackreference] | Null = js.native
      def replace(node: typings.regexpTree.astMod.Repetition): AstPath[typings.regexpTree.astMod.Repetition] | Null = js.native
      def replace(node: SimpleAssertion): AstPath[SimpleAssertion] | Null = js.native
      def replace(node: SimpleChar): AstPath[SimpleChar] | Null = js.native
      def replace(node: SpecialChar): AstPath[SpecialChar] | Null = js.native
      
      def setChild(node: typings.regexpTree.astMod.ClassRange, index: Double): AstPath[typings.regexpTree.astMod.ClassRange] = js.native
      def setChild(node: SimpleChar, index: Double): AstPath[SimpleChar] = js.native
      def setChild(node: SpecialChar, index: Double): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_expressions(node: typings.regexpTree.astMod.ClassRange, index: Double, property: expressions): AstPath[typings.regexpTree.astMod.ClassRange] = js.native
      @JSName("setChild")
      def setChild_expressions(node: SimpleChar, index: Double, property: expressions): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_expressions(node: SpecialChar, index: Double, property: expressions): AstPath[SpecialChar] = js.native
      
      def update(nodeProps: PartialCharacterClass): Unit = js.native
    }
    
    @js.native
    trait ClassRange extends StObject {
      
      def getNextSibling(): (AstPath[typings.regexpTree.astMod.Char | typings.regexpTree.astMod.ClassRange]) | Null = js.native
      
      def getParent(): AstPath[typings.regexpTree.astMod.CharacterClass] | Null = js.native
      
      def getPreviousSibling(): (AstPath[typings.regexpTree.astMod.Char | typings.regexpTree.astMod.ClassRange]) | Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typings.regexpTree.astMod.ClassRange = js.native
      
      var parent: typings.regexpTree.astMod.CharacterClass | Null = js.native
      
      var parentPath: AstPath[typings.regexpTree.astMod.CharacterClass] | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: typings.regexpTree.astMod.ClassRange): AstPath[typings.regexpTree.astMod.ClassRange] | Null = js.native
      def replace(node: SimpleChar): AstPath[SimpleChar] | Null = js.native
      def replace(node: SpecialChar): AstPath[SpecialChar] | Null = js.native
      
      def setChild(node: typings.regexpTree.astMod.Char, index: Null, property: from | to): AstPath[typings.regexpTree.astMod.Char] = js.native
      def setChild(node: typings.regexpTree.astMod.Char, index: Unit, property: from | to): AstPath[typings.regexpTree.astMod.Char] = js.native
      
      def update(nodeProps: PartialClassRange): Unit = js.native
    }
    
    @js.native
    trait Disjunction extends StObject {
      
      def appendChild(): Null = js.native
      def appendChild(node: typings.regexpTree.astMod.Alternative): AstPath[typings.regexpTree.astMod.Alternative] = js.native
      def appendChild(node: CapturingGroup): AstPath[CapturingGroup] = js.native
      def appendChild(node: typings.regexpTree.astMod.CharacterClass): AstPath[typings.regexpTree.astMod.CharacterClass] = js.native
      def appendChild(node: typings.regexpTree.astMod.Disjunction): AstPath[typings.regexpTree.astMod.Disjunction] = js.native
      def appendChild(node: LookaroundAssertion): AstPath[LookaroundAssertion] = js.native
      def appendChild(node: NamedBackreference): AstPath[NamedBackreference] = js.native
      def appendChild(node: NoncapturingGroup): AstPath[NoncapturingGroup] = js.native
      def appendChild(node: NumericBackreference): AstPath[NumericBackreference] = js.native
      def appendChild(node: typings.regexpTree.astMod.Repetition): AstPath[typings.regexpTree.astMod.Repetition] = js.native
      def appendChild(node: SimpleAssertion): AstPath[SimpleAssertion] = js.native
      def appendChild(node: SimpleChar): AstPath[SimpleChar] = js.native
      def appendChild(node: SpecialChar): AstPath[SpecialChar] = js.native
      def appendChild[T /* <: Expression */](node: T): AstPath[T] | Null = js.native
      @JSName("appendChild")
      def appendChild_T_Expression_Union[T /* <: Expression */](): AstPath[T] | Null = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: Null, property: expressions): Null = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: typings.regexpTree.astMod.Alternative, property: expressions): AstPath[typings.regexpTree.astMod.Alternative] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: CapturingGroup, property: expressions): AstPath[CapturingGroup] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: typings.regexpTree.astMod.CharacterClass, property: expressions): AstPath[typings.regexpTree.astMod.CharacterClass] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: typings.regexpTree.astMod.Disjunction, property: expressions): AstPath[typings.regexpTree.astMod.Disjunction] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: LookaroundAssertion, property: expressions): AstPath[LookaroundAssertion] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: NamedBackreference, property: expressions): AstPath[NamedBackreference] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: NoncapturingGroup, property: expressions): AstPath[NoncapturingGroup] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: NumericBackreference, property: expressions): AstPath[NumericBackreference] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: typings.regexpTree.astMod.Repetition, property: expressions): AstPath[typings.regexpTree.astMod.Repetition] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: SimpleAssertion, property: expressions): AstPath[SimpleAssertion] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: SimpleChar, property: expressions): AstPath[SimpleChar] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: SpecialChar, property: expressions): AstPath[SpecialChar] = js.native
      @JSName("appendChild")
      def appendChild_expressions[T /* <: Expression */](node: T, property: expressions): AstPath[T] | Null = js.native
      @JSName("appendChild")
      def appendChild_expressions_T_Expression_Union[T /* <: Expression */](node: Null, property: expressions): AstPath[T] | Null = js.native
      
      def getChild(): AstPath[Expression] | Null = js.native
      def getChild(n: Double): AstPath[Expression] | Null = js.native
      
      def getNextSibling(): AstPath[Expression] | Null = js.native
      
      def getParent(): (AstPath[
            AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      def getPreviousSibling(): AstPath[Expression] | Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def insertChildAt[T /* <: Expression */](node: T, index: Double): Unit = js.native
      def insertChildAt[T /* <: Expression */](node: Null, index: Double): Unit = js.native
      @JSName("insertChildAt")
      def insertChildAt_expressions[T /* <: Expression */](node: T, index: Double, property: expressions): Unit = js.native
      @JSName("insertChildAt")
      def insertChildAt_expressions[T /* <: Expression */](node: Null, index: Double, property: expressions): Unit = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typings.regexpTree.astMod.Disjunction = js.native
      
      var parent: AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition | Null = js.native
      
      var parentPath: (AstPath[
            AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: typings.regexpTree.astMod.Alternative): AstPath[typings.regexpTree.astMod.Alternative] | Null = js.native
      def replace(node: CapturingGroup): AstPath[CapturingGroup] | Null = js.native
      def replace(node: typings.regexpTree.astMod.CharacterClass): AstPath[typings.regexpTree.astMod.CharacterClass] | Null = js.native
      def replace(node: typings.regexpTree.astMod.Disjunction): AstPath[typings.regexpTree.astMod.Disjunction] | Null = js.native
      def replace(node: LookaroundAssertion): AstPath[LookaroundAssertion] | Null = js.native
      def replace(node: NamedBackreference): AstPath[NamedBackreference] | Null = js.native
      def replace(node: NoncapturingGroup): AstPath[NoncapturingGroup] | Null = js.native
      def replace(node: NumericBackreference): AstPath[NumericBackreference] | Null = js.native
      def replace(node: typings.regexpTree.astMod.Repetition): AstPath[typings.regexpTree.astMod.Repetition] | Null = js.native
      def replace(node: SimpleAssertion): AstPath[SimpleAssertion] | Null = js.native
      def replace(node: SimpleChar): AstPath[SimpleChar] | Null = js.native
      def replace(node: SpecialChar): AstPath[SpecialChar] | Null = js.native
      
      def setChild(node: Null, index: Double): Null = js.native
      def setChild(node: typings.regexpTree.astMod.Alternative, index: Double): AstPath[typings.regexpTree.astMod.Alternative] = js.native
      def setChild(node: CapturingGroup, index: Double): AstPath[CapturingGroup] = js.native
      def setChild(node: typings.regexpTree.astMod.CharacterClass, index: Double): AstPath[typings.regexpTree.astMod.CharacterClass] = js.native
      def setChild(node: typings.regexpTree.astMod.Disjunction, index: Double): AstPath[typings.regexpTree.astMod.Disjunction] = js.native
      def setChild(node: LookaroundAssertion, index: Double): AstPath[LookaroundAssertion] = js.native
      def setChild(node: NamedBackreference, index: Double): AstPath[NamedBackreference] = js.native
      def setChild(node: NoncapturingGroup, index: Double): AstPath[NoncapturingGroup] = js.native
      def setChild(node: NumericBackreference, index: Double): AstPath[NumericBackreference] = js.native
      def setChild(node: typings.regexpTree.astMod.Repetition, index: Double): AstPath[typings.regexpTree.astMod.Repetition] = js.native
      def setChild(node: SimpleAssertion, index: Double): AstPath[SimpleAssertion] = js.native
      def setChild(node: SimpleChar, index: Double): AstPath[SimpleChar] = js.native
      def setChild(node: SpecialChar, index: Double): AstPath[SpecialChar] = js.native
      def setChild[T /* <: Expression */](node: T, index: Double): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_T_Expression_Union[T /* <: Expression */](node: Null, index: Double): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_expressions(node: Null, index: Double, property: expressions): Null = js.native
      @JSName("setChild")
      def setChild_expressions(node: typings.regexpTree.astMod.Alternative, index: Double, property: expressions): AstPath[typings.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_expressions(node: CapturingGroup, index: Double, property: expressions): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expressions(node: typings.regexpTree.astMod.CharacterClass, index: Double, property: expressions): AstPath[typings.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_expressions(node: typings.regexpTree.astMod.Disjunction, index: Double, property: expressions): AstPath[typings.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_expressions(node: LookaroundAssertion, index: Double, property: expressions): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_expressions(node: NamedBackreference, index: Double, property: expressions): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_expressions(node: NoncapturingGroup, index: Double, property: expressions): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expressions(node: NumericBackreference, index: Double, property: expressions): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_expressions(node: typings.regexpTree.astMod.Repetition, index: Double, property: expressions): AstPath[typings.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_expressions(node: SimpleAssertion, index: Double, property: expressions): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_expressions(node: SimpleChar, index: Double, property: expressions): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_expressions(node: SpecialChar, index: Double, property: expressions): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_expressions[T /* <: Expression */](node: T, index: Double, property: expressions): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_expressions_T_Expression_Union[T /* <: Expression */](node: Null, index: Double, property: expressions): AstPath[T] | Null = js.native
      
      def update(nodeProps: PartialDisjunction): Unit = js.native
    }
    
    @js.native
    trait Group extends StObject {
      
      def getChild(): AstPath[Expression] | Null = js.native
      @JSName("getChild")
      def getChild_0(n: `0`): AstPath[Expression] | Null = js.native
      
      def getNextSibling(): AstPath[Expression] | Null = js.native
      
      def getParent(): (AstPath[
            AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      def getPreviousSibling(): AstPath[Expression] | Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typings.regexpTree.astMod.Group = js.native
      
      var parent: AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition | Null = js.native
      
      var parentPath: (AstPath[
            AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: typings.regexpTree.astMod.Alternative): AstPath[typings.regexpTree.astMod.Alternative] | Null = js.native
      def replace(node: CapturingGroup): AstPath[CapturingGroup] | Null = js.native
      def replace(node: typings.regexpTree.astMod.CharacterClass): AstPath[typings.regexpTree.astMod.CharacterClass] | Null = js.native
      def replace(node: typings.regexpTree.astMod.Disjunction): AstPath[typings.regexpTree.astMod.Disjunction] | Null = js.native
      def replace(node: LookaroundAssertion): AstPath[LookaroundAssertion] | Null = js.native
      def replace(node: NamedBackreference): AstPath[NamedBackreference] | Null = js.native
      def replace(node: NoncapturingGroup): AstPath[NoncapturingGroup] | Null = js.native
      def replace(node: NumericBackreference): AstPath[NumericBackreference] | Null = js.native
      def replace(node: typings.regexpTree.astMod.Repetition): AstPath[typings.regexpTree.astMod.Repetition] | Null = js.native
      def replace(node: SimpleAssertion): AstPath[SimpleAssertion] | Null = js.native
      def replace(node: SimpleChar): AstPath[SimpleChar] | Null = js.native
      def replace(node: SpecialChar): AstPath[SpecialChar] | Null = js.native
      
      def setChild(): Null = js.native
      def setChild(node: typings.regexpTree.astMod.Alternative): AstPath[typings.regexpTree.astMod.Alternative] = js.native
      def setChild(node: CapturingGroup): AstPath[CapturingGroup] = js.native
      def setChild(node: typings.regexpTree.astMod.CharacterClass): AstPath[typings.regexpTree.astMod.CharacterClass] = js.native
      def setChild(node: typings.regexpTree.astMod.Disjunction): AstPath[typings.regexpTree.astMod.Disjunction] = js.native
      def setChild(node: LookaroundAssertion): AstPath[LookaroundAssertion] = js.native
      def setChild(node: NamedBackreference): AstPath[NamedBackreference] = js.native
      def setChild(node: NoncapturingGroup): AstPath[NoncapturingGroup] = js.native
      def setChild(node: NumericBackreference): AstPath[NumericBackreference] = js.native
      def setChild(node: typings.regexpTree.astMod.Repetition): AstPath[typings.regexpTree.astMod.Repetition] = js.native
      def setChild(node: SimpleAssertion): AstPath[SimpleAssertion] = js.native
      def setChild(node: SimpleChar): AstPath[SimpleChar] = js.native
      def setChild(node: SpecialChar): AstPath[SpecialChar] = js.native
      def setChild[T /* <: Expression */](node: T): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_T_Expression_Union[T /* <: Expression */](): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_expression(node: Null, index: Null, property: expression): Null = js.native
      @JSName("setChild")
      def setChild_expression(node: Null, index: Unit, property: expression): Null = js.native
      @JSName("setChild")
      def setChild_expression(node: typings.regexpTree.astMod.Alternative, index: Null, property: expression): AstPath[typings.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_expression(node: typings.regexpTree.astMod.Alternative, index: Unit, property: expression): AstPath[typings.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_expression(node: CapturingGroup, index: Null, property: expression): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expression(node: CapturingGroup, index: Unit, property: expression): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expression(node: typings.regexpTree.astMod.CharacterClass, index: Null, property: expression): AstPath[typings.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_expression(node: typings.regexpTree.astMod.CharacterClass, index: Unit, property: expression): AstPath[typings.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_expression(node: typings.regexpTree.astMod.Disjunction, index: Null, property: expression): AstPath[typings.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_expression(node: typings.regexpTree.astMod.Disjunction, index: Unit, property: expression): AstPath[typings.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_expression(node: LookaroundAssertion, index: Null, property: expression): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_expression(node: LookaroundAssertion, index: Unit, property: expression): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_expression(node: NamedBackreference, index: Null, property: expression): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_expression(node: NamedBackreference, index: Unit, property: expression): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_expression(node: NoncapturingGroup, index: Null, property: expression): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expression(node: NoncapturingGroup, index: Unit, property: expression): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expression(node: NumericBackreference, index: Null, property: expression): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_expression(node: NumericBackreference, index: Unit, property: expression): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_expression(node: typings.regexpTree.astMod.Repetition, index: Null, property: expression): AstPath[typings.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_expression(node: typings.regexpTree.astMod.Repetition, index: Unit, property: expression): AstPath[typings.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_expression(node: SimpleAssertion, index: Null, property: expression): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_expression(node: SimpleAssertion, index: Unit, property: expression): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_expression(node: SimpleChar, index: Null, property: expression): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_expression(node: SimpleChar, index: Unit, property: expression): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_expression(node: SpecialChar, index: Null, property: expression): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_expression(node: SpecialChar, index: Unit, property: expression): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_expression[T /* <: Expression */](node: T, index: Null, property: expression): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_expression[T /* <: Expression */](node: T, index: Unit, property: expression): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_expression_T_Expression_Union[T /* <: Expression */](node: Null, index: Null, property: expression): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_expression_T_Expression_Union[T /* <: Expression */](node: Null, index: Unit, property: expression): AstPath[T] | Null = js.native
      
      def update(nodeProps: Partial[typings.regexpTree.astMod.Group]): Unit = js.native
    }
    
    @js.native
    trait Quantifier extends StObject {
      
      def getNextSibling(): Null = js.native
      
      def getParent(): AstPath[typings.regexpTree.astMod.Repetition] | Null = js.native
      
      def getPreviousSibling(): Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typings.regexpTree.astMod.Quantifier = js.native
      
      var parent: typings.regexpTree.astMod.Repetition | Null = js.native
      
      var parentPath: AstPath[typings.regexpTree.astMod.Repetition] | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: RangeQuantifier): AstPath[RangeQuantifier] | Null = js.native
      def replace(node: SimpleQuantifier): AstPath[SimpleQuantifier] | Null = js.native
      
      def update(nodeProps: Partial[typings.regexpTree.astMod.Quantifier]): Unit = js.native
    }
    
    @js.native
    trait RegExp extends StObject {
      
      def getChild(): AstPath[Expression] | Null = js.native
      def getChild(n: Double): AstPath[Expression] | Null = js.native
      
      def getNextSibling(): Null = js.native
      
      def getParent(): Null = js.native
      
      def getPreviousSibling(): Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Null = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: AstRegExp = js.native
      
      var parent: Null = js.native
      
      var parentPath: Null = js.native
      
      var property: Null = js.native
      
      def remove(): Unit = js.native
      
      @JSName("setChild")
      def setChild_body(node: Null, index: Null, property: body): Null = js.native
      @JSName("setChild")
      def setChild_body(node: Null, index: Unit, property: body): Null = js.native
      @JSName("setChild")
      def setChild_body(node: typings.regexpTree.astMod.Alternative, index: Null, property: body): AstPath[typings.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_body(node: typings.regexpTree.astMod.Alternative, index: Unit, property: body): AstPath[typings.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_body(node: CapturingGroup, index: Null, property: body): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_body(node: CapturingGroup, index: Unit, property: body): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_body(node: typings.regexpTree.astMod.CharacterClass, index: Null, property: body): AstPath[typings.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_body(node: typings.regexpTree.astMod.CharacterClass, index: Unit, property: body): AstPath[typings.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_body(node: typings.regexpTree.astMod.Disjunction, index: Null, property: body): AstPath[typings.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_body(node: typings.regexpTree.astMod.Disjunction, index: Unit, property: body): AstPath[typings.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_body(node: LookaroundAssertion, index: Null, property: body): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_body(node: LookaroundAssertion, index: Unit, property: body): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_body(node: NamedBackreference, index: Null, property: body): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_body(node: NamedBackreference, index: Unit, property: body): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_body(node: NoncapturingGroup, index: Null, property: body): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_body(node: NoncapturingGroup, index: Unit, property: body): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_body(node: NumericBackreference, index: Null, property: body): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_body(node: NumericBackreference, index: Unit, property: body): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_body(node: typings.regexpTree.astMod.Repetition, index: Null, property: body): AstPath[typings.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_body(node: typings.regexpTree.astMod.Repetition, index: Unit, property: body): AstPath[typings.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_body(node: SimpleAssertion, index: Null, property: body): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_body(node: SimpleAssertion, index: Unit, property: body): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_body(node: SimpleChar, index: Null, property: body): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_body(node: SimpleChar, index: Unit, property: body): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_body(node: SpecialChar, index: Null, property: body): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_body(node: SpecialChar, index: Unit, property: body): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_body[T /* <: Expression */](node: T, index: Null, property: body): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_body[T /* <: Expression */](node: T, index: Unit, property: body): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_body_T_Expression_Union[T /* <: Expression */](node: Null, index: Null, property: body): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_body_T_Expression_Union[T /* <: Expression */](node: Null, index: Unit, property: body): AstPath[T] | Null = js.native
      
      def update(nodeProps: PartialAstRegExp): Unit = js.native
    }
    
    @js.native
    trait Repetition extends StObject {
      
      def getChild(): AstPath[Expression] | Null = js.native
      @JSName("getChild")
      def getChild_0(n: `0`): AstPath[Expression] | Null = js.native
      
      def getNextSibling(): AstPath[Expression] | Null = js.native
      
      def getParent(): (AstPath[
            AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      def getPreviousSibling(): AstPath[Expression] | Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typings.regexpTree.astMod.Repetition = js.native
      
      var parent: AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition | Null = js.native
      
      var parentPath: (AstPath[
            AstRegExp | typings.regexpTree.astMod.Disjunction | typings.regexpTree.astMod.Alternative | typings.regexpTree.astMod.Assertion | typings.regexpTree.astMod.Group | typings.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: typings.regexpTree.astMod.Alternative): AstPath[typings.regexpTree.astMod.Alternative] | Null = js.native
      def replace(node: CapturingGroup): AstPath[CapturingGroup] | Null = js.native
      def replace(node: typings.regexpTree.astMod.CharacterClass): AstPath[typings.regexpTree.astMod.CharacterClass] | Null = js.native
      def replace(node: typings.regexpTree.astMod.Disjunction): AstPath[typings.regexpTree.astMod.Disjunction] | Null = js.native
      def replace(node: LookaroundAssertion): AstPath[LookaroundAssertion] | Null = js.native
      def replace(node: NamedBackreference): AstPath[NamedBackreference] | Null = js.native
      def replace(node: NoncapturingGroup): AstPath[NoncapturingGroup] | Null = js.native
      def replace(node: NumericBackreference): AstPath[NumericBackreference] | Null = js.native
      def replace(node: typings.regexpTree.astMod.Repetition): AstPath[typings.regexpTree.astMod.Repetition] | Null = js.native
      def replace(node: SimpleAssertion): AstPath[SimpleAssertion] | Null = js.native
      def replace(node: SimpleChar): AstPath[SimpleChar] | Null = js.native
      def replace(node: SpecialChar): AstPath[SpecialChar] | Null = js.native
      
      def setChild(node: typings.regexpTree.astMod.Alternative): AstPath[typings.regexpTree.astMod.Alternative] = js.native
      def setChild(node: CapturingGroup): AstPath[CapturingGroup] = js.native
      def setChild(node: typings.regexpTree.astMod.CharacterClass): AstPath[typings.regexpTree.astMod.CharacterClass] = js.native
      def setChild(node: typings.regexpTree.astMod.Disjunction): AstPath[typings.regexpTree.astMod.Disjunction] = js.native
      def setChild(node: LookaroundAssertion): AstPath[LookaroundAssertion] = js.native
      def setChild(node: NamedBackreference): AstPath[NamedBackreference] = js.native
      def setChild(node: NoncapturingGroup): AstPath[NoncapturingGroup] = js.native
      def setChild(node: NumericBackreference): AstPath[NumericBackreference] = js.native
      def setChild(node: typings.regexpTree.astMod.Repetition): AstPath[typings.regexpTree.astMod.Repetition] = js.native
      def setChild(node: SimpleAssertion): AstPath[SimpleAssertion] = js.native
      def setChild(node: SimpleChar): AstPath[SimpleChar] = js.native
      def setChild(node: SpecialChar): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_expression(node: typings.regexpTree.astMod.Alternative, index: Null, property: expression): AstPath[typings.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_expression(node: typings.regexpTree.astMod.Alternative, index: Unit, property: expression): AstPath[typings.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_expression(node: CapturingGroup, index: Null, property: expression): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expression(node: CapturingGroup, index: Unit, property: expression): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expression(node: typings.regexpTree.astMod.CharacterClass, index: Null, property: expression): AstPath[typings.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_expression(node: typings.regexpTree.astMod.CharacterClass, index: Unit, property: expression): AstPath[typings.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_expression(node: typings.regexpTree.astMod.Disjunction, index: Null, property: expression): AstPath[typings.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_expression(node: typings.regexpTree.astMod.Disjunction, index: Unit, property: expression): AstPath[typings.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_expression(node: LookaroundAssertion, index: Null, property: expression): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_expression(node: LookaroundAssertion, index: Unit, property: expression): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_expression(node: NamedBackreference, index: Null, property: expression): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_expression(node: NamedBackreference, index: Unit, property: expression): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_expression(node: NoncapturingGroup, index: Null, property: expression): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expression(node: NoncapturingGroup, index: Unit, property: expression): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expression(node: NumericBackreference, index: Null, property: expression): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_expression(node: NumericBackreference, index: Unit, property: expression): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_expression(node: typings.regexpTree.astMod.Repetition, index: Null, property: expression): AstPath[typings.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_expression(node: typings.regexpTree.astMod.Repetition, index: Unit, property: expression): AstPath[typings.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_expression(node: SimpleAssertion, index: Null, property: expression): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_expression(node: SimpleAssertion, index: Unit, property: expression): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_expression(node: SimpleChar, index: Null, property: expression): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_expression(node: SimpleChar, index: Unit, property: expression): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_expression(node: SpecialChar, index: Null, property: expression): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_expression(node: SpecialChar, index: Unit, property: expression): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_quantifier(node: RangeQuantifier, index: Null, property: quantifier): AstPath[RangeQuantifier] = js.native
      @JSName("setChild")
      def setChild_quantifier(node: RangeQuantifier, index: Unit, property: quantifier): AstPath[RangeQuantifier] = js.native
      @JSName("setChild")
      def setChild_quantifier(node: SimpleQuantifier, index: Null, property: quantifier): AstPath[SimpleQuantifier] = js.native
      @JSName("setChild")
      def setChild_quantifier(node: SimpleQuantifier, index: Unit, property: quantifier): AstPath[SimpleQuantifier] = js.native
      
      def update(nodeProps: PartialRepetition): Unit = js.native
    }
  }
  type AstPath[T /* <: AstNode */] = /* import warning: importer.ImportType#apply Failed type conversion: regexp-match-indices.regexp-tree/ast.AstPathTypes[T['type']] */ js.Any
  
  trait AstPathTypes extends StObject {
    
    var Alternative: typings.regexpMatchIndices.astMod.AstPath.Alternative
    
    var Assertion: typings.regexpMatchIndices.astMod.AstPath.Assertion
    
    var Backreference: typings.regexpMatchIndices.astMod.AstPath.Backreference
    
    var Char: typings.regexpMatchIndices.astMod.AstPath.Char
    
    var CharacterClass: typings.regexpMatchIndices.astMod.AstPath.CharacterClass
    
    var ClassRange: typings.regexpMatchIndices.astMod.AstPath.ClassRange
    
    var Disjunction: typings.regexpMatchIndices.astMod.AstPath.Disjunction
    
    var Group: typings.regexpMatchIndices.astMod.AstPath.Group
    
    var Quantifier: typings.regexpMatchIndices.astMod.AstPath.Quantifier
    
    var RegExp: typings.regexpMatchIndices.astMod.AstPath.RegExp
    
    var Repetition: typings.regexpMatchIndices.astMod.AstPath.Repetition
  }
  object AstPathTypes {
    
    inline def apply(
      Alternative: Alternative,
      Assertion: Assertion,
      Backreference: Backreference,
      Char: Char,
      CharacterClass: CharacterClass,
      ClassRange: ClassRange,
      Disjunction: Disjunction,
      Group: Group,
      Quantifier: Quantifier,
      RegExp: RegExp,
      Repetition: Repetition
    ): AstPathTypes = {
      val __obj = js.Dynamic.literal(Alternative = Alternative.asInstanceOf[js.Any], Assertion = Assertion.asInstanceOf[js.Any], Backreference = Backreference.asInstanceOf[js.Any], Char = Char.asInstanceOf[js.Any], CharacterClass = CharacterClass.asInstanceOf[js.Any], ClassRange = ClassRange.asInstanceOf[js.Any], Disjunction = Disjunction.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], Quantifier = Quantifier.asInstanceOf[js.Any], RegExp = RegExp.asInstanceOf[js.Any], Repetition = Repetition.asInstanceOf[js.Any])
      __obj.asInstanceOf[AstPathTypes]
    }
    
    extension [Self <: AstPathTypes](x: Self) {
      
      inline def setAlternative(value: Alternative): Self = StObject.set(x, "Alternative", value.asInstanceOf[js.Any])
      
      inline def setAssertion(value: Assertion): Self = StObject.set(x, "Assertion", value.asInstanceOf[js.Any])
      
      inline def setBackreference(value: Backreference): Self = StObject.set(x, "Backreference", value.asInstanceOf[js.Any])
      
      inline def setChar(value: Char): Self = StObject.set(x, "Char", value.asInstanceOf[js.Any])
      
      inline def setCharacterClass(value: CharacterClass): Self = StObject.set(x, "CharacterClass", value.asInstanceOf[js.Any])
      
      inline def setClassRange(value: ClassRange): Self = StObject.set(x, "ClassRange", value.asInstanceOf[js.Any])
      
      inline def setDisjunction(value: Disjunction): Self = StObject.set(x, "Disjunction", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
      
      inline def setQuantifier(value: Quantifier): Self = StObject.set(x, "Quantifier", value.asInstanceOf[js.Any])
      
      inline def setRegExp(value: RegExp): Self = StObject.set(x, "RegExp", value.asInstanceOf[js.Any])
      
      inline def setRepetition(value: Repetition): Self = StObject.set(x, "Repetition", value.asInstanceOf[js.Any])
    }
  }
  
  trait AstTypes extends StObject {
    
    var Alternative: typings.regexpTree.astMod.Alternative
    
    var Assertion: typings.regexpTree.astMod.Assertion
    
    var Backreference: typings.regexpTree.astMod.Backreference
    
    var Char: typings.regexpTree.astMod.Char
    
    var CharacterClass: typings.regexpTree.astMod.CharacterClass
    
    var ClassRange: typings.regexpTree.astMod.ClassRange
    
    var Disjunction: typings.regexpTree.astMod.Disjunction
    
    var Group: typings.regexpTree.astMod.Group
    
    var Quantifier: typings.regexpTree.astMod.Quantifier
    
    var RegExp: AstRegExp
    
    var Repetition: typings.regexpTree.astMod.Repetition
  }
  object AstTypes {
    
    inline def apply(
      Alternative: typings.regexpTree.astMod.Alternative,
      Assertion: typings.regexpTree.astMod.Assertion,
      Backreference: typings.regexpTree.astMod.Backreference,
      Char: typings.regexpTree.astMod.Char,
      CharacterClass: typings.regexpTree.astMod.CharacterClass,
      ClassRange: typings.regexpTree.astMod.ClassRange,
      Disjunction: typings.regexpTree.astMod.Disjunction,
      Group: typings.regexpTree.astMod.Group,
      Quantifier: typings.regexpTree.astMod.Quantifier,
      RegExp: AstRegExp,
      Repetition: typings.regexpTree.astMod.Repetition
    ): AstTypes = {
      val __obj = js.Dynamic.literal(Alternative = Alternative.asInstanceOf[js.Any], Assertion = Assertion.asInstanceOf[js.Any], Backreference = Backreference.asInstanceOf[js.Any], Char = Char.asInstanceOf[js.Any], CharacterClass = CharacterClass.asInstanceOf[js.Any], ClassRange = ClassRange.asInstanceOf[js.Any], Disjunction = Disjunction.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], Quantifier = Quantifier.asInstanceOf[js.Any], RegExp = RegExp.asInstanceOf[js.Any], Repetition = Repetition.asInstanceOf[js.Any])
      __obj.asInstanceOf[AstTypes]
    }
    
    extension [Self <: AstTypes](x: Self) {
      
      inline def setAlternative(value: typings.regexpTree.astMod.Alternative): Self = StObject.set(x, "Alternative", value.asInstanceOf[js.Any])
      
      inline def setAssertion(value: typings.regexpTree.astMod.Assertion): Self = StObject.set(x, "Assertion", value.asInstanceOf[js.Any])
      
      inline def setBackreference(value: typings.regexpTree.astMod.Backreference): Self = StObject.set(x, "Backreference", value.asInstanceOf[js.Any])
      
      inline def setChar(value: typings.regexpTree.astMod.Char): Self = StObject.set(x, "Char", value.asInstanceOf[js.Any])
      
      inline def setCharacterClass(value: typings.regexpTree.astMod.CharacterClass): Self = StObject.set(x, "CharacterClass", value.asInstanceOf[js.Any])
      
      inline def setClassRange(value: typings.regexpTree.astMod.ClassRange): Self = StObject.set(x, "ClassRange", value.asInstanceOf[js.Any])
      
      inline def setDisjunction(value: typings.regexpTree.astMod.Disjunction): Self = StObject.set(x, "Disjunction", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: typings.regexpTree.astMod.Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
      
      inline def setQuantifier(value: typings.regexpTree.astMod.Quantifier): Self = StObject.set(x, "Quantifier", value.asInstanceOf[js.Any])
      
      inline def setRegExp(value: AstRegExp): Self = StObject.set(x, "RegExp", value.asInstanceOf[js.Any])
      
      inline def setRepetition(value: typings.regexpTree.astMod.Repetition): Self = StObject.set(x, "Repetition", value.asInstanceOf[js.Any])
    }
  }
}
