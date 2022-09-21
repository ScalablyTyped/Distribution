package typings.sentryUtils.anon

import typings.sentryUtils.requestdataMod.InjectedNodeDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deps extends StObject {
  
  var deps: js.UndefOr[InjectedNodeDeps] = js.undefined
  
  var include: js.UndefOr[js.Array[String]] = js.undefined
}
object Deps {
  
  inline def apply(): Deps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deps]
  }
  
  extension [Self <: Deps](x: Self) {
    
    inline def setDeps(value: InjectedNodeDeps): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
  }
}
