package typings.speechRuleEngine

import typings.speechRuleEngine.jsAudioAuditoryDescriptionMod.AuditoryDescription
import typings.speechRuleEngine.jsAudioSpanMod.Span
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsRuleEngineSpeechRuleFunctionsMod {
  
  @JSImport("speech-rule-engine/js/rule_engine/speech_rule_functions", "ContextFunctions")
  @js.native
  open class ContextFunctions ()
    extends StObject
       with FunctionsStore[ContextFunction] {
    
    /* CompleteClass */
    override def add(name: String, func: ContextFunction): Unit = js.native
    
    /* CompleteClass */
    override def addStore(store: FunctionsStore[ContextFunction]): Unit = js.native
    
    /* private */ /* CompleteClass */
    var checkCustomFunctionSyntax_ : Any = js.native
    
    /* CompleteClass */
    override def lookup(name: String): ContextFunction = js.native
    
    /* private */ /* CompleteClass */
    var prefix: Any = js.native
    
    /* private */ /* CompleteClass */
    var store: Any = js.native
  }
  
  @JSImport("speech-rule-engine/js/rule_engine/speech_rule_functions", "CustomGenerators")
  @js.native
  open class CustomGenerators ()
    extends StObject
       with FunctionsStore[CustomGenerator] {
    
    /* CompleteClass */
    override def add(name: String, func: CustomGenerator): Unit = js.native
    
    /* CompleteClass */
    override def addStore(store: FunctionsStore[CustomGenerator]): Unit = js.native
    
    /* private */ /* CompleteClass */
    var checkCustomFunctionSyntax_ : Any = js.native
    
    /* CompleteClass */
    override def lookup(name: String): CustomGenerator = js.native
    
    /* private */ /* CompleteClass */
    var prefix: Any = js.native
    
    /* private */ /* CompleteClass */
    var store: Any = js.native
  }
  
  @JSImport("speech-rule-engine/js/rule_engine/speech_rule_functions", "CustomQueries")
  @js.native
  open class CustomQueries ()
    extends StObject
       with FunctionsStore[CustomQuery] {
    
    /* CompleteClass */
    override def add(name: String, func: CustomQuery): Unit = js.native
    
    /* CompleteClass */
    override def addStore(store: FunctionsStore[CustomQuery]): Unit = js.native
    
    /* private */ /* CompleteClass */
    var checkCustomFunctionSyntax_ : Any = js.native
    
    /* CompleteClass */
    override def lookup(name: String): CustomQuery = js.native
    
    /* private */ /* CompleteClass */
    var prefix: Any = js.native
    
    /* private */ /* CompleteClass */
    var store: Any = js.native
  }
  
  @JSImport("speech-rule-engine/js/rule_engine/speech_rule_functions", "CustomStrings")
  @js.native
  open class CustomStrings ()
    extends StObject
       with FunctionsStore[CustomString] {
    
    /* CompleteClass */
    override def add(name: String, func: CustomString): Unit = js.native
    
    /* CompleteClass */
    override def addStore(store: FunctionsStore[CustomString]): Unit = js.native
    
    /* private */ /* CompleteClass */
    var checkCustomFunctionSyntax_ : Any = js.native
    
    /* CompleteClass */
    override def lookup(name: String): CustomString = js.native
    
    /* private */ /* CompleteClass */
    var prefix: Any = js.native
    
    /* private */ /* CompleteClass */
    var store: Any = js.native
  }
  
  type ContextFunction = js.Function2[
    /* p1 */ js.Array[Node] | Node, 
    /* p2 */ String | Null, 
    js.Function0[String | js.Array[AuditoryDescription]]
  ]
  
  type CustomGenerator = js.Function2[/* store */ js.UndefOr[Any], /* flag */ js.UndefOr[Boolean], js.Array[String] | Unit]
  
  type CustomQuery = js.Function1[/* p1 */ Node, js.Array[Node]]
  
  type CustomString = js.Function1[/* p1 */ Node, js.Array[Span]]
  
  trait FunctionsStore[S] extends StObject {
    
    def add(name: String, func: S): Unit
    
    def addStore(store: FunctionsStore[S]): Unit
    
    /* private */ var checkCustomFunctionSyntax_ : Any
    
    def lookup(name: String): S
    
    /* private */ var prefix: Any
    
    /* private */ var store: Any
  }
  object FunctionsStore {
    
    inline def apply[S](
      add: (String, S) => Unit,
      addStore: FunctionsStore[S] => Unit,
      checkCustomFunctionSyntax_ : Any,
      lookup: String => S,
      prefix: Any,
      store: Any
    ): FunctionsStore[S] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addStore = js.Any.fromFunction1(addStore), checkCustomFunctionSyntax_ = checkCustomFunctionSyntax_.asInstanceOf[js.Any], lookup = js.Any.fromFunction1(lookup), prefix = prefix.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionsStore[S]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FunctionsStore[?], S] (val x: Self & FunctionsStore[S]) extends AnyVal {
      
      inline def setAdd(value: (String, S) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setAddStore(value: FunctionsStore[S] => Unit): Self = StObject.set(x, "addStore", js.Any.fromFunction1(value))
      
      inline def setCheckCustomFunctionSyntax_(value: Any): Self = StObject.set(x, "checkCustomFunctionSyntax_", value.asInstanceOf[js.Any])
      
      inline def setLookup(value: String => S): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      inline def setPrefix(value: Any): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setStore(value: Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  type SpeechRuleFunction = CustomQuery | CustomString | ContextFunction | CustomGenerator
}
