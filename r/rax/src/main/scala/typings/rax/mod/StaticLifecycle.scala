package typings.rax.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Unfortunately, we have no way of declaring that the component constructor must implement this
trait StaticLifecycle[P, S] extends StObject {
  
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[P, S]] = js.undefined
  
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[P, S]] = js.undefined
}
object StaticLifecycle {
  
  inline def apply[P, S](): StaticLifecycle[P, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticLifecycle[P, S]]
  }
  
  extension [Self <: StaticLifecycle[?, ?], P, S](x: Self & (StaticLifecycle[P, S])) {
    
    inline def setGetDerivedStateFromError(value: /* error */ Any => Partial[S] | Null): Self = StObject.set(x, "getDerivedStateFromError", js.Any.fromFunction1(value))
    
    inline def setGetDerivedStateFromErrorUndefined: Self = StObject.set(x, "getDerivedStateFromError", js.undefined)
    
    inline def setGetDerivedStateFromProps(value: (P, S) => Partial[S] | Null): Self = StObject.set(x, "getDerivedStateFromProps", js.Any.fromFunction2(value))
    
    inline def setGetDerivedStateFromPropsUndefined: Self = StObject.set(x, "getDerivedStateFromProps", js.undefined)
  }
}
