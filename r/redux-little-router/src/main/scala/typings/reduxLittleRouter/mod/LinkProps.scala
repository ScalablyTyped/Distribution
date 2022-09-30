package typings.reduxLittleRouter.mod

import typings.reduxLittleRouter.anon.Payload
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkProps extends StObject {
  
  var activeProps: js.UndefOr[ObjectLiteral[Any]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var href: Href
  
  var location: js.UndefOr[Location] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* event */ Event, Any]] = js.undefined
  
  var persistQuery: js.UndefOr[Boolean] = js.undefined
  
  var push: js.UndefOr[js.Function2[/* href */ Href, /* options */ LocationOptions, Payload]] = js.undefined
  
  var replace: js.UndefOr[js.Function2[/* href */ Href, /* options */ LocationOptions, Payload]] = js.undefined
  
  var replaceState: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[ObjectLiteral[Any]] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object LinkProps {
  
  inline def apply(href: Href): LinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
  
  extension [Self <: LinkProps](x: Self) {
    
    inline def setActiveProps(value: ObjectLiteral[Any]): Self = StObject.set(x, "activeProps", value.asInstanceOf[js.Any])
    
    inline def setActivePropsUndefined: Self = StObject.set(x, "activeProps", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setHref(value: Href): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setOnClick(value: /* event */ Event => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setPersistQuery(value: Boolean): Self = StObject.set(x, "persistQuery", value.asInstanceOf[js.Any])
    
    inline def setPersistQueryUndefined: Self = StObject.set(x, "persistQuery", js.undefined)
    
    inline def setPush(value: (/* href */ Href, /* options */ LocationOptions) => Payload): Self = StObject.set(x, "push", js.Any.fromFunction2(value))
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    inline def setReplace(value: (/* href */ Href, /* options */ LocationOptions) => Payload): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
    
    inline def setReplaceState(value: Boolean): Self = StObject.set(x, "replaceState", value.asInstanceOf[js.Any])
    
    inline def setReplaceStateUndefined: Self = StObject.set(x, "replaceState", js.undefined)
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setStyle(value: ObjectLiteral[Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
