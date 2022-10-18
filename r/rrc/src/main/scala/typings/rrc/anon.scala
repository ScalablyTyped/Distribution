package typings.rrc

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Inject extends StObject {
    
    var inject: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object Inject {
    
    inline def apply(): Inject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Inject]
    }
    
    extension [Self <: Inject](x: Self) {
      
      inline def setInject(value: StringDictionary[Any]): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
    }
  }
  
  trait Pathname extends StObject {
    
    var pathname: typings.history.mod.Pathname
  }
  object Pathname {
    
    inline def apply(pathname: typings.history.mod.Pathname): Pathname = {
      val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pathname]
    }
    
    extension [Self <: Pathname](x: Self) {
      
      inline def setPathname(value: typings.history.mod.Pathname): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    }
  }
}
