package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticFLOATS
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.semanticUiReactStrings.big
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.massive
import typings.semanticUiReact.semanticUiReactStrings.mini
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.semanticUiReact.semanticUiReactStrings.very
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object railRailMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Rail/Rail", JSImport.Default)
  @js.native
  val default: StatelessComponent[RailProps] = js.native
  
  trait RailProps
    extends StObject
       with StrictRailProps
       with /* key */ StringDictionary[js.Any]
  object RailProps {
    
    inline def apply(position: SemanticFLOATS): RailProps = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[RailProps]
    }
  }
  
  trait StrictRailProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** A rail can appear attached to the main viewport. */
    var attached: js.UndefOr[Boolean] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** A rail can appear closer to the main viewport. */
    var close: js.UndefOr[Boolean | very] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A rail can create a division between itself and a container. */
    var dividing: js.UndefOr[Boolean] = js.undefined
    
    /** A rail can attach itself to the inside of a container. */
    var internal: js.UndefOr[Boolean] = js.undefined
    
    /** A rail can be presented on the left or right side of a container. */
    var position: SemanticFLOATS
    
    /** A rail can have different sizes. */
    var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.undefined
  }
  object StrictRailProps {
    
    inline def apply(position: SemanticFLOATS): StrictRailProps = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrictRailProps]
    }
    
    extension [Self <: StrictRailProps](x: Self) {
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAttached(value: Boolean): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClose(value: Boolean | very): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDividing(value: Boolean): Self = StObject.set(x, "dividing", value.asInstanceOf[js.Any])
      
      inline def setDividingUndefined: Self = StObject.set(x, "dividing", js.undefined)
      
      inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
      
      inline def setPosition(value: SemanticFLOATS): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setSize(value: mini | tiny | small | large | big | huge | massive): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = StatelessComponent[RailProps]
  
  /* This means you don't have to write `default`, but can instead just say `railRailMod.foo` */
  override def _to: StatelessComponent[RailProps] = default
}
