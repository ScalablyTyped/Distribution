package typings.selderee

import typings.selderee.seldereeStrings.$Equalssign
import typings.selderee.seldereeStrings.AsteriskEqualssign
import typings.selderee.seldereeStrings.Equalssign
import typings.selderee.seldereeStrings.Greaterthansign
import typings.selderee.seldereeStrings.Plussign
import typings.selderee.seldereeStrings.TildeEqualssign
import typings.selderee.seldereeStrings.VerticallineEqualssign
import typings.selderee.seldereeStrings.`^Equalssign`
import typings.selderee.seldereeStrings.attrPresence
import typings.selderee.seldereeStrings.attrValue
import typings.selderee.seldereeStrings.i
import typings.selderee.seldereeStrings.matcher
import typings.selderee.seldereeStrings.popElement
import typings.selderee.seldereeStrings.pushElement
import typings.selderee.seldereeStrings.s
import typings.selderee.seldereeStrings.tagName
import typings.selderee.seldereeStrings.terminal
import typings.selderee.seldereeStrings.variant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAstMod {
  
  trait AttrPresenceNode[V]
    extends StObject
       with DecisionTreeNode[V] {
    
    var cont: js.Array[DecisionTreeNode[V]]
    
    var name: String
    
    var `type`: attrPresence
  }
  object AttrPresenceNode {
    
    inline def apply[V](cont: js.Array[DecisionTreeNode[V]], name: String): AttrPresenceNode[V] = {
      val __obj = js.Dynamic.literal(cont = cont.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("attrPresence")
      __obj.asInstanceOf[AttrPresenceNode[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttrPresenceNode[?], V] (val x: Self & AttrPresenceNode[V]) extends AnyVal {
      
      inline def setCont(value: js.Array[DecisionTreeNode[V]]): Self = StObject.set(x, "cont", value.asInstanceOf[js.Any])
      
      inline def setContVarargs(value: DecisionTreeNode[V]*): Self = StObject.set(x, "cont", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: attrPresence): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AttrValueNode[V]
    extends StObject
       with DecisionTreeNode[V] {
    
    var matchers: js.Array[MatcherNode[V]]
    
    var name: String
    
    var `type`: attrValue
  }
  object AttrValueNode {
    
    inline def apply[V](matchers: js.Array[MatcherNode[V]], name: String): AttrValueNode[V] = {
      val __obj = js.Dynamic.literal(matchers = matchers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("attrValue")
      __obj.asInstanceOf[AttrValueNode[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttrValueNode[?], V] (val x: Self & AttrValueNode[V]) extends AnyVal {
      
      inline def setMatchers(value: js.Array[MatcherNode[V]]): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
      
      inline def setMatchersVarargs(value: MatcherNode[V]*): Self = StObject.set(x, "matchers", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: attrValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.selderee.libAstMod.TerminalNode[V]
    - typings.selderee.libAstMod.TagNameNode[V]
    - typings.selderee.libAstMod.AttrPresenceNode[V]
    - typings.selderee.libAstMod.AttrValueNode[V]
    - typings.selderee.libAstMod.PushElementNode[V]
    - typings.selderee.libAstMod.PopElementNode[V]
  */
  trait DecisionTreeNode[V] extends StObject
  object DecisionTreeNode {
    
    inline def AttrPresenceNode[V](cont: js.Array[DecisionTreeNode[V]], name: String): typings.selderee.libAstMod.AttrPresenceNode[V] = {
      val __obj = js.Dynamic.literal(cont = cont.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("attrPresence")
      __obj.asInstanceOf[typings.selderee.libAstMod.AttrPresenceNode[V]]
    }
    
    inline def AttrValueNode[V](matchers: js.Array[MatcherNode[V]], name: String): typings.selderee.libAstMod.AttrValueNode[V] = {
      val __obj = js.Dynamic.literal(matchers = matchers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("attrValue")
      __obj.asInstanceOf[typings.selderee.libAstMod.AttrValueNode[V]]
    }
    
    inline def PopElementNode[V](cont: js.Array[DecisionTreeNode[V]]): typings.selderee.libAstMod.PopElementNode[V] = {
      val __obj = js.Dynamic.literal(cont = cont.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("popElement")
      __obj.asInstanceOf[typings.selderee.libAstMod.PopElementNode[V]]
    }
    
    inline def PushElementNode[V](combinator: Greaterthansign | Plussign, cont: js.Array[DecisionTreeNode[V]]): typings.selderee.libAstMod.PushElementNode[V] = {
      val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], cont = cont.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("pushElement")
      __obj.asInstanceOf[typings.selderee.libAstMod.PushElementNode[V]]
    }
    
    inline def TagNameNode[V](variants: js.Array[VariantNode[V]]): typings.selderee.libAstMod.TagNameNode[V] = {
      val __obj = js.Dynamic.literal(variants = variants.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("tagName")
      __obj.asInstanceOf[typings.selderee.libAstMod.TagNameNode[V]]
    }
    
    inline def TerminalNode[V](valueContainer: ValueContainer[V]): typings.selderee.libAstMod.TerminalNode[V] = {
      val __obj = js.Dynamic.literal(valueContainer = valueContainer.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("terminal")
      __obj.asInstanceOf[typings.selderee.libAstMod.TerminalNode[V]]
    }
  }
  
  trait MatcherNode[V] extends StObject {
    
    var cont: js.Array[DecisionTreeNode[V]]
    
    var matcher: Equalssign | TildeEqualssign | VerticallineEqualssign | `^Equalssign` | $Equalssign | AsteriskEqualssign
    
    var modifier: i | s | Null
    
    def predicate(prop: String): Boolean
    
    var `type`: matcher
    
    var value: String
  }
  object MatcherNode {
    
    inline def apply[V](
      cont: js.Array[DecisionTreeNode[V]],
      matcher: Equalssign | TildeEqualssign | VerticallineEqualssign | `^Equalssign` | $Equalssign | AsteriskEqualssign,
      predicate: String => Boolean,
      value: String
    ): MatcherNode[V] = {
      val __obj = js.Dynamic.literal(cont = cont.asInstanceOf[js.Any], matcher = matcher.asInstanceOf[js.Any], predicate = js.Any.fromFunction1(predicate), value = value.asInstanceOf[js.Any], modifier = null)
      __obj.updateDynamic("type")("matcher")
      __obj.asInstanceOf[MatcherNode[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatcherNode[?], V] (val x: Self & MatcherNode[V]) extends AnyVal {
      
      inline def setCont(value: js.Array[DecisionTreeNode[V]]): Self = StObject.set(x, "cont", value.asInstanceOf[js.Any])
      
      inline def setContVarargs(value: DecisionTreeNode[V]*): Self = StObject.set(x, "cont", js.Array(value*))
      
      inline def setMatcher(
        value: Equalssign | TildeEqualssign | VerticallineEqualssign | `^Equalssign` | $Equalssign | AsteriskEqualssign
      ): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
      
      inline def setModifier(value: i | s): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
      
      inline def setModifierNull: Self = StObject.set(x, "modifier", null)
      
      inline def setPredicate(value: String => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      inline def setType(value: matcher): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopElementNode[V]
    extends StObject
       with DecisionTreeNode[V] {
    
    var cont: js.Array[DecisionTreeNode[V]]
    
    var `type`: popElement
  }
  object PopElementNode {
    
    inline def apply[V](cont: js.Array[DecisionTreeNode[V]]): PopElementNode[V] = {
      val __obj = js.Dynamic.literal(cont = cont.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("popElement")
      __obj.asInstanceOf[PopElementNode[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopElementNode[?], V] (val x: Self & PopElementNode[V]) extends AnyVal {
      
      inline def setCont(value: js.Array[DecisionTreeNode[V]]): Self = StObject.set(x, "cont", value.asInstanceOf[js.Any])
      
      inline def setContVarargs(value: DecisionTreeNode[V]*): Self = StObject.set(x, "cont", js.Array(value*))
      
      inline def setType(value: popElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PushElementNode[V]
    extends StObject
       with DecisionTreeNode[V] {
    
    var combinator: Greaterthansign | Plussign
    
    var cont: js.Array[DecisionTreeNode[V]]
    
    var `type`: pushElement
  }
  object PushElementNode {
    
    inline def apply[V](combinator: Greaterthansign | Plussign, cont: js.Array[DecisionTreeNode[V]]): PushElementNode[V] = {
      val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], cont = cont.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("pushElement")
      __obj.asInstanceOf[PushElementNode[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PushElementNode[?], V] (val x: Self & PushElementNode[V]) extends AnyVal {
      
      inline def setCombinator(value: Greaterthansign | Plussign): Self = StObject.set(x, "combinator", value.asInstanceOf[js.Any])
      
      inline def setCont(value: js.Array[DecisionTreeNode[V]]): Self = StObject.set(x, "cont", value.asInstanceOf[js.Any])
      
      inline def setContVarargs(value: DecisionTreeNode[V]*): Self = StObject.set(x, "cont", js.Array(value*))
      
      inline def setType(value: pushElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Specificity = js.Tuple3[Double, Double, Double]
  
  trait TagNameNode[V]
    extends StObject
       with DecisionTreeNode[V] {
    
    var `type`: tagName
    
    var variants: js.Array[VariantNode[V]]
  }
  object TagNameNode {
    
    inline def apply[V](variants: js.Array[VariantNode[V]]): TagNameNode[V] = {
      val __obj = js.Dynamic.literal(variants = variants.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("tagName")
      __obj.asInstanceOf[TagNameNode[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TagNameNode[?], V] (val x: Self & TagNameNode[V]) extends AnyVal {
      
      inline def setType(value: tagName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVariants(value: js.Array[VariantNode[V]]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsVarargs(value: VariantNode[V]*): Self = StObject.set(x, "variants", js.Array(value*))
    }
  }
  
  trait TerminalNode[V]
    extends StObject
       with DecisionTreeNode[V] {
    
    var `type`: terminal
    
    var valueContainer: ValueContainer[V]
  }
  object TerminalNode {
    
    inline def apply[V](valueContainer: ValueContainer[V]): TerminalNode[V] = {
      val __obj = js.Dynamic.literal(valueContainer = valueContainer.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("terminal")
      __obj.asInstanceOf[TerminalNode[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TerminalNode[?], V] (val x: Self & TerminalNode[V]) extends AnyVal {
      
      inline def setType(value: terminal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValueContainer(value: ValueContainer[V]): Self = StObject.set(x, "valueContainer", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueContainer[V] extends StObject {
    
    var index: Double
    
    var specificity: Specificity
    
    var value: V
  }
  object ValueContainer {
    
    inline def apply[V](index: Double, specificity: Specificity, value: V): ValueContainer[V] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueContainer[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueContainer[?], V] (val x: Self & ValueContainer[V]) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setSpecificity(value: Specificity): Self = StObject.set(x, "specificity", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait VariantNode[V] extends StObject {
    
    var cont: js.Array[DecisionTreeNode[V]]
    
    var `type`: variant
    
    var value: String
  }
  object VariantNode {
    
    inline def apply[V](cont: js.Array[DecisionTreeNode[V]], value: String): VariantNode[V] = {
      val __obj = js.Dynamic.literal(cont = cont.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("variant")
      __obj.asInstanceOf[VariantNode[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VariantNode[?], V] (val x: Self & VariantNode[V]) extends AnyVal {
      
      inline def setCont(value: js.Array[DecisionTreeNode[V]]): Self = StObject.set(x, "cont", value.asInstanceOf[js.Any])
      
      inline def setContVarargs(value: DecisionTreeNode[V]*): Self = StObject.set(x, "cont", js.Array(value*))
      
      inline def setType(value: variant): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
