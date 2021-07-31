package typings.reachRouter.mod

import typings.react.mod.Ref
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkProps[TState]
  extends StObject
     with AnchorProps {
  
  var getProps: js.UndefOr[js.Function1[/* props */ LinkGetProps, js.Object]] = js.undefined
  
  /** @deprecated If using React >= 16.4, use ref instead. */
  var innerRef: js.UndefOr[Ref[HTMLAnchorElement]] = js.undefined
  
  var replace: js.UndefOr[Boolean] = js.undefined
  
  var state: js.UndefOr[TState] = js.undefined
  
  var to: String
}
object LinkProps {
  
  @scala.inline
  def apply[TState](to: String): LinkProps[TState] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps[TState]]
  }
  
  @scala.inline
  implicit class LinkPropsMutableBuilder[Self <: LinkProps[?], TState] (val x: Self & LinkProps[TState]) extends AnyVal {
    
    @scala.inline
    def setGetProps(value: /* props */ LinkGetProps => js.Object): Self = StObject.set(x, "getProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPropsUndefined: Self = StObject.set(x, "getProps", js.undefined)
    
    @scala.inline
    def setInnerRef(value: Ref[HTMLAnchorElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ HTMLAnchorElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    @scala.inline
    def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    
    @scala.inline
    def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    @scala.inline
    def setState(value: TState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
