package typings.regexpMatchIndices

import typings.regexpMatchIndices.anon.TraversalKind
import typings.regexpMatchIndices.anon.`0`
import typings.regexpMatchIndices.astMod.AstNode
import typings.regexpMatchIndices.regexpMatchIndicesStrings.Ast
import typings.regexpMatchIndices.regexpMatchIndicesStrings.AstPath
import typings.regexpTree.astMod.Alternative
import typings.regexpTree.astMod.Assertion
import typings.regexpTree.astMod.AstRegExp
import typings.regexpTree.astMod.Backreference
import typings.regexpTree.astMod.Char
import typings.regexpTree.astMod.CharacterClass
import typings.regexpTree.astMod.ClassRange
import typings.regexpTree.astMod.Disjunction
import typings.regexpTree.astMod.Group
import typings.regexpTree.astMod.Quantifier
import typings.regexpTree.astMod.Repetition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object regexpTreeMod {
  
  @JSImport("regexp-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("regexp-tree", "TransformResult")
  @js.native
  open class TransformResult[T /* <: AstNode */, E] protected () extends StObject {
    def this(ast: T) = this()
    def this(ast: T, extra: E) = this()
    
    /* private */ var _ast: Any = js.native
    
    /* private */ var _extra: Any = js.native
    
    /* private */ var _regexp: Any = js.native
    
    /* private */ var _source: Any = js.native
    
    /* private */ var _string: Any = js.native
    
    def getAST(): T = js.native
    
    def getExtra(): E = js.native
    
    def getFlags(): String = js.native
    
    def getSource(): String = js.native
    
    def setExtra(extra: E): Unit = js.native
    
    def toRegExp(): js.RegExp = js.native
  }
  
  inline def transform(
    regexp: String | js.RegExp,
    handlers: TransformHandlers[AstRegExp] | js.Array[TransformHandlers[AstRegExp]]
  ): TransformResult[AstRegExp, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(regexp.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[TransformResult[AstRegExp, Any]]
  
  inline def transform_T_AstNode[T /* <: AstNode */](ast: T, handlers: TransformHandlers[T] | js.Array[TransformHandlers[T]]): TransformResult[T, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(ast.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[TransformResult[T, Any]]
  
  inline def traverse_Ast[T /* <: AstNode */](
    ast: T,
    handlers: (TraversalHandlers[T, Ast]) | (js.Array[TraversalHandlers[T, Ast]]),
    options: TraversalKind
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(ast.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def traverse_AstPath[T /* <: AstNode */](
    ast: T,
    handlers: (TraversalHandlers[T, AstPath]) | (js.Array[TraversalHandlers[T, AstPath]]),
    options: js.UndefOr[`0`]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(ast.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait CommonTraversalHandlers[T /* <: AstNode */, TraversalKind /* <: Ast | AstPath */] extends StObject {
    
    @JSName("*")
    var Asterisk: js.UndefOr[TraversalCallback[AstNode, TraversalKind]] = js.undefined
    
    var init: js.UndefOr[js.Function1[/* ast */ T, Unit]] = js.undefined
    
    var shouldRun: js.UndefOr[js.Function1[/* ast */ T, Boolean]] = js.undefined
  }
  object CommonTraversalHandlers {
    
    inline def apply[T /* <: AstNode */, TraversalKind /* <: Ast | AstPath */](): CommonTraversalHandlers[T, TraversalKind] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonTraversalHandlers[T, TraversalKind]]
    }
    
    extension [Self <: CommonTraversalHandlers[?, ?], T /* <: AstNode */, TraversalKind /* <: Ast | AstPath */](x: Self & (CommonTraversalHandlers[T, TraversalKind])) {
      
      inline def setAsterisk(value: TraversalCallback[AstNode, TraversalKind]): Self = StObject.set(x, "*", value.asInstanceOf[js.Any])
      
      inline def setAsteriskUndefined: Self = StObject.set(x, "*", js.undefined)
      
      inline def setInit(value: /* ast */ T => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setShouldRun(value: /* ast */ T => Boolean): Self = StObject.set(x, "shouldRun", js.Any.fromFunction1(value))
      
      inline def setShouldRunUndefined: Self = StObject.set(x, "shouldRun", js.undefined)
    }
  }
  
  /* Inlined {[ N in keyof regexp-match-indices.regexp-tree/ast.AstTypes ]:? regexp-match-indices.regexp-tree.Traversal<regexp-match-indices.regexp-tree/ast.AstTypes[N], TraversalKind>} */
  trait SpecificTraversalHandlers[TraversalKind /* <: Ast | AstPath */] extends StObject {
    
    var Alternative: js.UndefOr[Traversal[typings.regexpTree.astMod.Alternative, TraversalKind]] = js.undefined
    
    var Assertion: js.UndefOr[Traversal[typings.regexpTree.astMod.Assertion, TraversalKind]] = js.undefined
    
    var Backreference: js.UndefOr[Traversal[typings.regexpTree.astMod.Backreference, TraversalKind]] = js.undefined
    
    var Char: js.UndefOr[Traversal[typings.regexpTree.astMod.Char, TraversalKind]] = js.undefined
    
    var CharacterClass: js.UndefOr[Traversal[typings.regexpTree.astMod.CharacterClass, TraversalKind]] = js.undefined
    
    var ClassRange: js.UndefOr[Traversal[typings.regexpTree.astMod.ClassRange, TraversalKind]] = js.undefined
    
    var Disjunction: js.UndefOr[Traversal[typings.regexpTree.astMod.Disjunction, TraversalKind]] = js.undefined
    
    var Group: js.UndefOr[Traversal[typings.regexpTree.astMod.Group, TraversalKind]] = js.undefined
    
    var Quantifier: js.UndefOr[Traversal[typings.regexpTree.astMod.Quantifier, TraversalKind]] = js.undefined
    
    var RegExp: js.UndefOr[Traversal[AstRegExp, TraversalKind]] = js.undefined
    
    var Repetition: js.UndefOr[Traversal[typings.regexpTree.astMod.Repetition, TraversalKind]] = js.undefined
  }
  object SpecificTraversalHandlers {
    
    inline def apply[TraversalKind /* <: Ast | AstPath */](): SpecificTraversalHandlers[TraversalKind] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpecificTraversalHandlers[TraversalKind]]
    }
    
    extension [Self <: SpecificTraversalHandlers[?], TraversalKind /* <: Ast | AstPath */](x: Self & SpecificTraversalHandlers[TraversalKind]) {
      
      inline def setAlternative(value: Traversal[Alternative, TraversalKind]): Self = StObject.set(x, "Alternative", value.asInstanceOf[js.Any])
      
      inline def setAlternativeUndefined: Self = StObject.set(x, "Alternative", js.undefined)
      
      inline def setAssertion(value: Traversal[Assertion, TraversalKind]): Self = StObject.set(x, "Assertion", value.asInstanceOf[js.Any])
      
      inline def setAssertionUndefined: Self = StObject.set(x, "Assertion", js.undefined)
      
      inline def setBackreference(value: Traversal[Backreference, TraversalKind]): Self = StObject.set(x, "Backreference", value.asInstanceOf[js.Any])
      
      inline def setBackreferenceUndefined: Self = StObject.set(x, "Backreference", js.undefined)
      
      inline def setChar(value: Traversal[Char, TraversalKind]): Self = StObject.set(x, "Char", value.asInstanceOf[js.Any])
      
      inline def setCharUndefined: Self = StObject.set(x, "Char", js.undefined)
      
      inline def setCharacterClass(value: Traversal[CharacterClass, TraversalKind]): Self = StObject.set(x, "CharacterClass", value.asInstanceOf[js.Any])
      
      inline def setCharacterClassUndefined: Self = StObject.set(x, "CharacterClass", js.undefined)
      
      inline def setClassRange(value: Traversal[ClassRange, TraversalKind]): Self = StObject.set(x, "ClassRange", value.asInstanceOf[js.Any])
      
      inline def setClassRangeUndefined: Self = StObject.set(x, "ClassRange", js.undefined)
      
      inline def setDisjunction(value: Traversal[Disjunction, TraversalKind]): Self = StObject.set(x, "Disjunction", value.asInstanceOf[js.Any])
      
      inline def setDisjunctionUndefined: Self = StObject.set(x, "Disjunction", js.undefined)
      
      inline def setGroup(value: Traversal[Group, TraversalKind]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
      
      inline def setQuantifier(value: Traversal[Quantifier, TraversalKind]): Self = StObject.set(x, "Quantifier", value.asInstanceOf[js.Any])
      
      inline def setQuantifierUndefined: Self = StObject.set(x, "Quantifier", js.undefined)
      
      inline def setRegExp(value: Traversal[AstRegExp, TraversalKind]): Self = StObject.set(x, "RegExp", value.asInstanceOf[js.Any])
      
      inline def setRegExpUndefined: Self = StObject.set(x, "RegExp", js.undefined)
      
      inline def setRepetition(value: Traversal[Repetition, TraversalKind]): Self = StObject.set(x, "Repetition", value.asInstanceOf[js.Any])
      
      inline def setRepetitionUndefined: Self = StObject.set(x, "Repetition", js.undefined)
    }
  }
  
  /* Inlined regexp-match-indices.regexp-tree.TraversalHandlers<T, 'AstPath'> */
  trait TransformHandlers[T /* <: AstNode */] extends StObject {
    
    var Alternative: js.UndefOr[Traversal[typings.regexpTree.astMod.Alternative, AstPath]] = js.undefined
    
    var Assertion: js.UndefOr[Traversal[typings.regexpTree.astMod.Assertion, AstPath]] = js.undefined
    
    @JSName("*")
    var Asterisk: js.UndefOr[TraversalCallback[AstNode, AstPath]] = js.undefined
    
    var Backreference: js.UndefOr[Traversal[typings.regexpTree.astMod.Backreference, AstPath]] = js.undefined
    
    var Char: js.UndefOr[Traversal[typings.regexpTree.astMod.Char, AstPath]] = js.undefined
    
    var CharacterClass: js.UndefOr[Traversal[typings.regexpTree.astMod.CharacterClass, AstPath]] = js.undefined
    
    var ClassRange: js.UndefOr[Traversal[typings.regexpTree.astMod.ClassRange, AstPath]] = js.undefined
    
    var Disjunction: js.UndefOr[Traversal[typings.regexpTree.astMod.Disjunction, AstPath]] = js.undefined
    
    var Group: js.UndefOr[Traversal[typings.regexpTree.astMod.Group, AstPath]] = js.undefined
    
    var Quantifier: js.UndefOr[Traversal[typings.regexpTree.astMod.Quantifier, AstPath]] = js.undefined
    
    var RegExp: js.UndefOr[Traversal[AstRegExp, AstPath]] = js.undefined
    
    var Repetition: js.UndefOr[Traversal[typings.regexpTree.astMod.Repetition, AstPath]] = js.undefined
    
    var init: js.UndefOr[js.Function1[/* ast */ T, Unit]] = js.undefined
    
    var shouldRun: js.UndefOr[js.Function1[/* ast */ T, Boolean]] = js.undefined
  }
  object TransformHandlers {
    
    inline def apply[T /* <: AstNode */](): TransformHandlers[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformHandlers[T]]
    }
    
    extension [Self <: TransformHandlers[?], T /* <: AstNode */](x: Self & TransformHandlers[T]) {
      
      inline def setAlternative(value: Traversal[Alternative, AstPath]): Self = StObject.set(x, "Alternative", value.asInstanceOf[js.Any])
      
      inline def setAlternativeUndefined: Self = StObject.set(x, "Alternative", js.undefined)
      
      inline def setAssertion(value: Traversal[Assertion, AstPath]): Self = StObject.set(x, "Assertion", value.asInstanceOf[js.Any])
      
      inline def setAssertionUndefined: Self = StObject.set(x, "Assertion", js.undefined)
      
      inline def setAsterisk(value: TraversalCallback[AstNode, AstPath]): Self = StObject.set(x, "*", value.asInstanceOf[js.Any])
      
      inline def setAsteriskUndefined: Self = StObject.set(x, "*", js.undefined)
      
      inline def setBackreference(value: Traversal[Backreference, AstPath]): Self = StObject.set(x, "Backreference", value.asInstanceOf[js.Any])
      
      inline def setBackreferenceUndefined: Self = StObject.set(x, "Backreference", js.undefined)
      
      inline def setChar(value: Traversal[Char, AstPath]): Self = StObject.set(x, "Char", value.asInstanceOf[js.Any])
      
      inline def setCharUndefined: Self = StObject.set(x, "Char", js.undefined)
      
      inline def setCharacterClass(value: Traversal[CharacterClass, AstPath]): Self = StObject.set(x, "CharacterClass", value.asInstanceOf[js.Any])
      
      inline def setCharacterClassUndefined: Self = StObject.set(x, "CharacterClass", js.undefined)
      
      inline def setClassRange(value: Traversal[ClassRange, AstPath]): Self = StObject.set(x, "ClassRange", value.asInstanceOf[js.Any])
      
      inline def setClassRangeUndefined: Self = StObject.set(x, "ClassRange", js.undefined)
      
      inline def setDisjunction(value: Traversal[Disjunction, AstPath]): Self = StObject.set(x, "Disjunction", value.asInstanceOf[js.Any])
      
      inline def setDisjunctionUndefined: Self = StObject.set(x, "Disjunction", js.undefined)
      
      inline def setGroup(value: Traversal[Group, AstPath]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
      
      inline def setInit(value: /* ast */ T => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setQuantifier(value: Traversal[Quantifier, AstPath]): Self = StObject.set(x, "Quantifier", value.asInstanceOf[js.Any])
      
      inline def setQuantifierUndefined: Self = StObject.set(x, "Quantifier", js.undefined)
      
      inline def setRegExp(value: Traversal[AstRegExp, AstPath]): Self = StObject.set(x, "RegExp", value.asInstanceOf[js.Any])
      
      inline def setRegExpUndefined: Self = StObject.set(x, "RegExp", js.undefined)
      
      inline def setRepetition(value: Traversal[Repetition, AstPath]): Self = StObject.set(x, "Repetition", value.asInstanceOf[js.Any])
      
      inline def setRepetitionUndefined: Self = StObject.set(x, "Repetition", js.undefined)
      
      inline def setShouldRun(value: /* ast */ T => Boolean): Self = StObject.set(x, "shouldRun", js.Any.fromFunction1(value))
      
      inline def setShouldRunUndefined: Self = StObject.set(x, "shouldRun", js.undefined)
    }
  }
  
  type Traversal[T /* <: AstNode */, TraversalKind /* <: Ast | AstPath */] = (TraversalCallback[T, TraversalKind]) | (TraversalCallbacks[T, TraversalKind])
  
  type TraversalCallback[T /* <: AstNode */, TraversalKind /* <: Ast | AstPath */] = /* import warning: importer.ImportType#apply Failed type conversion: regexp-match-indices.anon.Ast<T>[TraversalKind] */ js.Any
  
  trait TraversalCallbacks[T /* <: AstNode */, TraversalKind /* <: Ast | AstPath */] extends StObject {
    
    var post: js.UndefOr[TraversalCallback[T, TraversalKind]] = js.undefined
    
    var pre: js.UndefOr[TraversalCallback[T, TraversalKind]] = js.undefined
  }
  object TraversalCallbacks {
    
    inline def apply[T /* <: AstNode */, TraversalKind /* <: Ast | AstPath */](): TraversalCallbacks[T, TraversalKind] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraversalCallbacks[T, TraversalKind]]
    }
    
    extension [Self <: TraversalCallbacks[?, ?], T /* <: AstNode */, TraversalKind /* <: Ast | AstPath */](x: Self & (TraversalCallbacks[T, TraversalKind])) {
      
      inline def setPost(value: TraversalCallback[T, TraversalKind]): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPre(value: TraversalCallback[T, TraversalKind]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    }
  }
  
  /* Inlined regexp-match-indices.regexp-tree.CommonTraversalHandlers<T, TraversalKind> & regexp-match-indices.regexp-tree.SpecificTraversalHandlers<TraversalKind> */
  trait TraversalHandlers[T /* <: AstNode */, TraversalKind /* <: Ast | AstPath */] extends StObject {
    
    var Alternative: js.UndefOr[Traversal[typings.regexpTree.astMod.Alternative, TraversalKind]] = js.undefined
    
    var Assertion: js.UndefOr[Traversal[typings.regexpTree.astMod.Assertion, TraversalKind]] = js.undefined
    
    @JSName("*")
    var Asterisk: js.UndefOr[TraversalCallback[AstNode, TraversalKind]] = js.undefined
    
    var Backreference: js.UndefOr[Traversal[typings.regexpTree.astMod.Backreference, TraversalKind]] = js.undefined
    
    var Char: js.UndefOr[Traversal[typings.regexpTree.astMod.Char, TraversalKind]] = js.undefined
    
    var CharacterClass: js.UndefOr[Traversal[typings.regexpTree.astMod.CharacterClass, TraversalKind]] = js.undefined
    
    var ClassRange: js.UndefOr[Traversal[typings.regexpTree.astMod.ClassRange, TraversalKind]] = js.undefined
    
    var Disjunction: js.UndefOr[Traversal[typings.regexpTree.astMod.Disjunction, TraversalKind]] = js.undefined
    
    var Group: js.UndefOr[Traversal[typings.regexpTree.astMod.Group, TraversalKind]] = js.undefined
    
    var Quantifier: js.UndefOr[Traversal[typings.regexpTree.astMod.Quantifier, TraversalKind]] = js.undefined
    
    var RegExp: js.UndefOr[Traversal[AstRegExp, TraversalKind]] = js.undefined
    
    var Repetition: js.UndefOr[Traversal[typings.regexpTree.astMod.Repetition, TraversalKind]] = js.undefined
    
    var init: js.UndefOr[js.Function1[/* ast */ T, Unit]] = js.undefined
    
    var shouldRun: js.UndefOr[js.Function1[/* ast */ T, Boolean]] = js.undefined
  }
  object TraversalHandlers {
    
    inline def apply[T /* <: AstNode */, TraversalKind /* <: Ast | AstPath */](): TraversalHandlers[T, TraversalKind] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraversalHandlers[T, TraversalKind]]
    }
    
    extension [Self <: TraversalHandlers[?, ?], T /* <: AstNode */, TraversalKind /* <: Ast | AstPath */](x: Self & (TraversalHandlers[T, TraversalKind])) {
      
      inline def setAlternative(value: Traversal[Alternative, TraversalKind]): Self = StObject.set(x, "Alternative", value.asInstanceOf[js.Any])
      
      inline def setAlternativeUndefined: Self = StObject.set(x, "Alternative", js.undefined)
      
      inline def setAssertion(value: Traversal[Assertion, TraversalKind]): Self = StObject.set(x, "Assertion", value.asInstanceOf[js.Any])
      
      inline def setAssertionUndefined: Self = StObject.set(x, "Assertion", js.undefined)
      
      inline def setAsterisk(value: TraversalCallback[AstNode, TraversalKind]): Self = StObject.set(x, "*", value.asInstanceOf[js.Any])
      
      inline def setAsteriskUndefined: Self = StObject.set(x, "*", js.undefined)
      
      inline def setBackreference(value: Traversal[Backreference, TraversalKind]): Self = StObject.set(x, "Backreference", value.asInstanceOf[js.Any])
      
      inline def setBackreferenceUndefined: Self = StObject.set(x, "Backreference", js.undefined)
      
      inline def setChar(value: Traversal[Char, TraversalKind]): Self = StObject.set(x, "Char", value.asInstanceOf[js.Any])
      
      inline def setCharUndefined: Self = StObject.set(x, "Char", js.undefined)
      
      inline def setCharacterClass(value: Traversal[CharacterClass, TraversalKind]): Self = StObject.set(x, "CharacterClass", value.asInstanceOf[js.Any])
      
      inline def setCharacterClassUndefined: Self = StObject.set(x, "CharacterClass", js.undefined)
      
      inline def setClassRange(value: Traversal[ClassRange, TraversalKind]): Self = StObject.set(x, "ClassRange", value.asInstanceOf[js.Any])
      
      inline def setClassRangeUndefined: Self = StObject.set(x, "ClassRange", js.undefined)
      
      inline def setDisjunction(value: Traversal[Disjunction, TraversalKind]): Self = StObject.set(x, "Disjunction", value.asInstanceOf[js.Any])
      
      inline def setDisjunctionUndefined: Self = StObject.set(x, "Disjunction", js.undefined)
      
      inline def setGroup(value: Traversal[Group, TraversalKind]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
      
      inline def setInit(value: /* ast */ T => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setQuantifier(value: Traversal[Quantifier, TraversalKind]): Self = StObject.set(x, "Quantifier", value.asInstanceOf[js.Any])
      
      inline def setQuantifierUndefined: Self = StObject.set(x, "Quantifier", js.undefined)
      
      inline def setRegExp(value: Traversal[AstRegExp, TraversalKind]): Self = StObject.set(x, "RegExp", value.asInstanceOf[js.Any])
      
      inline def setRegExpUndefined: Self = StObject.set(x, "RegExp", js.undefined)
      
      inline def setRepetition(value: Traversal[Repetition, TraversalKind]): Self = StObject.set(x, "Repetition", value.asInstanceOf[js.Any])
      
      inline def setRepetitionUndefined: Self = StObject.set(x, "Repetition", js.undefined)
      
      inline def setShouldRun(value: /* ast */ T => Boolean): Self = StObject.set(x, "shouldRun", js.Any.fromFunction1(value))
      
      inline def setShouldRunUndefined: Self = StObject.set(x, "shouldRun", js.undefined)
    }
  }
}
