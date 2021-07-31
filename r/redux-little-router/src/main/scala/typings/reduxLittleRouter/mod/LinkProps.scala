package typings.reduxLittleRouter.mod

import typings.reduxLittleRouter.anon.Payload
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkProps extends StObject {
  
  var activeProps: js.UndefOr[ObjectLiteral[js.Any]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var href: Href
  
  var location: js.UndefOr[Location] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* event */ Event, js.Any]] = js.undefined
  
  var persistQuery: js.UndefOr[Boolean] = js.undefined
  
  var push: js.UndefOr[js.Function2[/* href */ Href, /* options */ LocationOptions, Payload]] = js.undefined
  
  var replace: js.UndefOr[js.Function2[/* href */ Href, /* options */ LocationOptions, Payload]] = js.undefined
  
  var replaceState: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[ObjectLiteral[js.Any]] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object LinkProps {
  
  @scala.inline
  def apply(href: Href): LinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
  
  @scala.inline
  implicit class LinkPropsMutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveProps(value: ObjectLiteral[js.Any]): Self = StObject.set(x, "activeProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivePropsUndefined: Self = StObject.set(x, "activeProps", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setHref(value: Href): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* event */ Event => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setPersistQuery(value: Boolean): Self = StObject.set(x, "persistQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistQueryUndefined: Self = StObject.set(x, "persistQuery", js.undefined)
    
    @scala.inline
    def setPush(value: (/* href */ Href, /* options */ LocationOptions) => Payload): Self = StObject.set(x, "push", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    @scala.inline
    def setReplace(value: (/* href */ Href, /* options */ LocationOptions) => Payload): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplaceState(value: Boolean): Self = StObject.set(x, "replaceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceStateUndefined: Self = StObject.set(x, "replaceState", js.undefined)
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    @scala.inline
    def setStyle(value: ObjectLiteral[js.Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
