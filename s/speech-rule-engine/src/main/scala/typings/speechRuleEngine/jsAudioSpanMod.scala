package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAudioSpanMod {
  
  @JSImport("speech-rule-engine/js/audio/span", "Span")
  @js.native
  open class Span protected () extends StObject {
    def this(speech: String, attributes: SpanAttrs) = this()
    
    var attributes: SpanAttrs = js.native
    
    var speech: String = js.native
  }
  /* static members */
  object Span {
    
    @JSImport("speech-rule-engine/js/audio/span", "Span")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/audio/span", "Span.attributeList")
    @js.native
    def attributeList: js.Array[String] = js.native
    inline def attributeList_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attributeList")(x.asInstanceOf[js.Any])
    
    inline def empty(): Span = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Span]
    
    inline def getAttributes(node: Element): SpanAttrs = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttributes")(node.asInstanceOf[js.Any]).asInstanceOf[SpanAttrs]
    
    inline def node(str: String, node: Element): Span = (^.asInstanceOf[js.Dynamic].applyDynamic("node")(str.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Span]
    inline def node(str: String, node: Element, `def`: SpanAttrs): Span = (^.asInstanceOf[js.Dynamic].applyDynamic("node")(str.asInstanceOf[js.Any], node.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Span]
    
    inline def singleton(str: String): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
    inline def singleton(str: String, `def`: SpanAttrs): js.Array[Span] = (^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(str.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Span]]
    
    inline def stringAttr(str: String, attr: SpanAttrs): Span = (^.asInstanceOf[js.Dynamic].applyDynamic("stringAttr")(str.asInstanceOf[js.Any], attr.asInstanceOf[js.Any])).asInstanceOf[Span]
    
    inline def stringEmpty(str: String): Span = ^.asInstanceOf[js.Dynamic].applyDynamic("stringEmpty")(str.asInstanceOf[js.Any]).asInstanceOf[Span]
  }
  
  type SpanAttrs = StringDictionary[String]
}
