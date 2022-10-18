package typings.slateHtmlSerializer

import typings.react.mod.ReactNode
import typings.slate.distInterfacesNodeMod.Node
import typings.slateHtmlSerializer.anon.Render
import typings.slateHtmlSerializer.anon.ToJSON
import typings.slateHtmlSerializer.anon.`0`
import typings.slateHtmlSerializer.anon.`1`
import typings.std.ChildNode
import typings.std.Element
import typings.std.HTMLElement
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("slate-html-serializer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Html {
    def this(options: HtmlOptions) = this()
  }
  
  @js.native
  trait Html extends StObject {
    
    /* protected */ var defaultBlock: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockProperties */ Any = js.native
    
    def deserialize(html: String): Any = js.native
    def deserialize(html: String, options: ToJSON): Any = js.native
    def deserialize(html: String, options: `0`): Any = js.native
    
    /* protected */ def deserializeElement(element: HTMLElement): Any = js.native
    
    /* protected */ def deserializeElements(elements: js.Array[HTMLElement]): js.Array[Node] = js.native
    
    /* protected */ def deserializeMark(
      mark: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Mark */ Any
    ): js.Array[Node] = js.native
    
    /* protected */ def parseHtml(html: String): HTMLElement = js.native
    
    /* protected */ var rules: js.Array[Rule] = js.native
    
    def serialize(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Value */ Any
    ): String = js.native
    def serialize(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Value */ Any,
      options: Render
    ): String = js.native
    def serialize(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Value */ Any,
      options: `1`
    ): js.Array[Element] = js.native
    
    /* protected */ def serializeLeaf(
      leaf: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Leaf */ Any
    ): String = js.native
    
    /* protected */ def serializeNode(node: Node): String = js.native
    
    /* protected */ def serializeString(string: String): String = js.native
  }
  
  trait HtmlOptions extends StObject {
    
    var defaultBlock: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockProperties */ Any) | String
      ] = js.undefined
    
    var parseHtml: js.UndefOr[js.Function1[/* html */ String, HTMLElement]] = js.undefined
    
    var rules: js.UndefOr[js.Array[Rule]] = js.undefined
  }
  object HtmlOptions {
    
    inline def apply(): HtmlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlOptions]
    }
    
    extension [Self <: HtmlOptions](x: Self) {
      
      inline def setDefaultBlock(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockProperties */ Any) | String
      ): Self = StObject.set(x, "defaultBlock", value.asInstanceOf[js.Any])
      
      inline def setDefaultBlockUndefined: Self = StObject.set(x, "defaultBlock", js.undefined)
      
      inline def setParseHtml(value: /* html */ String => HTMLElement): Self = StObject.set(x, "parseHtml", js.Any.fromFunction1(value))
      
      inline def setParseHtmlUndefined: Self = StObject.set(x, "parseHtml", js.undefined)
      
      inline def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value*))
    }
  }
  
  trait Rule extends StObject {
    
    var deserialize: js.UndefOr[
        js.Function2[
          /* el */ Element, 
          /* next */ js.Function1[
            /* elements */ (js.Array[(typings.std.Node & ChildNode) | Element]) | NodeList, 
            Any
          ], 
          Any
        ]
      ] = js.undefined
    
    var serialize: js.UndefOr[js.Function2[/* obj */ Any, /* children */ String, ReactNode]] = js.undefined
  }
  object Rule {
    
    inline def apply(): Rule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Rule]
    }
    
    extension [Self <: Rule](x: Self) {
      
      inline def setDeserialize(
        value: (/* el */ Element, /* next */ js.Function1[
              /* elements */ (js.Array[(typings.std.Node & ChildNode) | Element]) | NodeList, 
              Any
            ]) => Any
      ): Self = StObject.set(x, "deserialize", js.Any.fromFunction2(value))
      
      inline def setDeserializeUndefined: Self = StObject.set(x, "deserialize", js.undefined)
      
      inline def setSerialize(value: (/* obj */ Any, /* children */ String) => ReactNode): Self = StObject.set(x, "serialize", js.Any.fromFunction2(value))
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
    }
  }
}
