package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.feedContentMod.FeedContentProps
import typings.semanticUiReact.feedDateMod.FeedDateProps
import typings.semanticUiReact.feedEventMod.FeedEventProps
import typings.semanticUiReact.feedExtraMod.FeedExtraProps
import typings.semanticUiReact.feedLabelMod.FeedLabelProps
import typings.semanticUiReact.feedLikeMod.FeedLikeProps
import typings.semanticUiReact.feedMetaMod.FeedMetaProps
import typings.semanticUiReact.feedSummaryMod.FeedSummaryProps
import typings.semanticUiReact.feedUserMod.FeedUserProps
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feedFeedMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/Feed", JSImport.Default)
  @js.native
  val default: FeedComponent = js.native
  
  @js.native
  trait FeedComponent
    extends StObject
       with FunctionComponent[FeedProps] {
    
    var Content: StatelessComponent[FeedContentProps] = js.native
    
    var Date: StatelessComponent[FeedDateProps] = js.native
    
    var Event: StatelessComponent[FeedEventProps] = js.native
    
    var Extra: StatelessComponent[FeedExtraProps] = js.native
    
    var Label: StatelessComponent[FeedLabelProps] = js.native
    
    var Like: StatelessComponent[FeedLikeProps] = js.native
    
    var Meta: StatelessComponent[FeedMetaProps] = js.native
    
    var Summary: StatelessComponent[FeedSummaryProps] = js.native
    
    var User: StatelessComponent[FeedUserProps] = js.native
  }
  
  trait FeedProps
    extends StObject
       with StrictFeedProps
       with /* key */ StringDictionary[js.Any]
  object FeedProps {
    
    inline def apply(): FeedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedProps]
    }
  }
  
  trait StrictFeedProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand array of props for FeedEvent. */
    var events: js.UndefOr[SemanticShorthandCollection[FeedEventProps]] = js.undefined
    
    /** A feed can have different sizes. */
    var size: js.UndefOr[small | large] = js.undefined
  }
  object StrictFeedProps {
    
    inline def apply(): StrictFeedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFeedProps]
    }
    
    extension [Self <: StrictFeedProps](x: Self) {
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEvents(value: SemanticShorthandCollection[FeedEventProps]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(value: SemanticShorthandItem[FeedEventProps]*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      inline def setSize(value: small | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FeedComponent
  
  /* This means you don't have to write `default`, but can instead just say `feedFeedMod.foo` */
  override def _to: FeedComponent = default
}
