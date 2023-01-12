package typings.reactLinkify

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-linkify", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  
  trait MatchInfo extends StObject {
    
    /**
      * Offset of matched text
      */
    var index: Double
    
    /**
      * Index of next char after the end of the matched text
      */
    var lastIndex: Double
    
    /**
      * Link schema, can be empty for fuzzy links, or for protocol-neutral links
      */
    var schema: String
    
    /**
      * Normalized text
      */
    var text: String
    
    /**
      * Link, generated from matched text
      */
    var url: String
  }
  object MatchInfo {
    
    inline def apply(index: Double, lastIndex: Double, schema: String, text: String, url: String): MatchInfo = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], lastIndex = lastIndex.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatchInfo] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLastIndex(value: Double): Self = StObject.set(x, "lastIndex", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var children: ReactNode
    
    /**
      * Custom anchor tag creator
      * Default to using exisint <a> tag with the provided href={decoratedHref}, key={key}
      * and children={decoratedText}, without additional styling
      */
    var componentDecorator: js.UndefOr[
        js.Function3[/* decoratedHref */ String, /* decoratedText */ String, /* key */ Double, ReactNode]
      ] = js.undefined
    
    /**
      * Custom href decorator or mapper on the matched (url) href
      * Default to no transformation
      */
    var hrefDecorator: js.UndefOr[js.Function1[/* urlHref */ String, String]] = js.undefined
    
    /**
      * Custom matcher for (url), that returns each match with the matching information
      * Default to https://github.com/markdown-it/linkify-it's LinkifyIt().tlds(tlds).match
      */
    var matchDecorator: js.UndefOr[js.Function1[/* text */ String, js.Array[MatchInfo] | Null]] = js.undefined
    
    /**
      * Custom text decorator or mapper on the matched (url) text
      * Default to no transformation
      */
    var textDecorator: js.UndefOr[js.Function1[/* urlText */ String, String]] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponentDecorator(value: (/* decoratedHref */ String, /* decoratedText */ String, /* key */ Double) => ReactNode): Self = StObject.set(x, "componentDecorator", js.Any.fromFunction3(value))
      
      inline def setComponentDecoratorUndefined: Self = StObject.set(x, "componentDecorator", js.undefined)
      
      inline def setHrefDecorator(value: /* urlHref */ String => String): Self = StObject.set(x, "hrefDecorator", js.Any.fromFunction1(value))
      
      inline def setHrefDecoratorUndefined: Self = StObject.set(x, "hrefDecorator", js.undefined)
      
      inline def setMatchDecorator(value: /* text */ String => js.Array[MatchInfo] | Null): Self = StObject.set(x, "matchDecorator", js.Any.fromFunction1(value))
      
      inline def setMatchDecoratorUndefined: Self = StObject.set(x, "matchDecorator", js.undefined)
      
      inline def setTextDecorator(value: /* urlText */ String => String): Self = StObject.set(x, "textDecorator", js.Any.fromFunction1(value))
      
      inline def setTextDecoratorUndefined: Self = StObject.set(x, "textDecorator", js.undefined)
    }
  }
  
  type ReactLinkify = Component[Props, js.Object, Any]
}
