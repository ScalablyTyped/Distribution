package typings.speechRuleEngine

import typings.speechRuleEngine.jsSemanticTreeSemanticNodeFactoryMod.SemanticNodeFactory
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSemanticTreeSemanticParserMod {
  
  /* note: abstract class */ @JSImport("speech-rule-engine/js/semantic_tree/semantic_parser", "SemanticAbstractParser")
  @js.native
  open class SemanticAbstractParser[T] protected ()
    extends StObject
       with SemanticParser[T] {
    def this(`type`: String) = this()
    
    /* private */ var factory_ : Any = js.native
    
    /* CompleteClass */
    override def getFactory(): SemanticNodeFactory = js.native
    
    /* CompleteClass */
    override def getType(): String = js.native
    
    /* CompleteClass */
    override def parse(representation: T): SemanticNode = js.native
    
    /* CompleteClass */
    override def parseList(list: js.Array[T]): js.Array[SemanticNode] = js.native
    
    /* CompleteClass */
    override def setFactory(factory: SemanticNodeFactory): Unit = js.native
    
    /* private */ var `type`: Any = js.native
  }
  
  trait SemanticParser[T] extends StObject {
    
    def getFactory(): SemanticNodeFactory
    
    def getType(): String
    
    def parse(representation: T): SemanticNode
    
    def parseList(list: js.Array[T]): js.Array[SemanticNode]
    
    def setFactory(factory: SemanticNodeFactory): Unit
  }
  object SemanticParser {
    
    inline def apply[T](
      getFactory: () => SemanticNodeFactory,
      getType: () => String,
      parse: T => SemanticNode,
      parseList: js.Array[T] => js.Array[SemanticNode],
      setFactory: SemanticNodeFactory => Unit
    ): SemanticParser[T] = {
      val __obj = js.Dynamic.literal(getFactory = js.Any.fromFunction0(getFactory), getType = js.Any.fromFunction0(getType), parse = js.Any.fromFunction1(parse), parseList = js.Any.fromFunction1(parseList), setFactory = js.Any.fromFunction1(setFactory))
      __obj.asInstanceOf[SemanticParser[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SemanticParser[?], T] (val x: Self & SemanticParser[T]) extends AnyVal {
      
      inline def setGetFactory(value: () => SemanticNodeFactory): Self = StObject.set(x, "getFactory", js.Any.fromFunction0(value))
      
      inline def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      inline def setParse(value: T => SemanticNode): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setParseList(value: js.Array[T] => js.Array[SemanticNode]): Self = StObject.set(x, "parseList", js.Any.fromFunction1(value))
      
      inline def setSetFactory(value: SemanticNodeFactory => Unit): Self = StObject.set(x, "setFactory", js.Any.fromFunction1(value))
    }
  }
}
