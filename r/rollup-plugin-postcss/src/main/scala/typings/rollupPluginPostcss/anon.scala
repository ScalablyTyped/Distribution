package typings.rollupPluginPostcss

import typings.rollupPluginPostcss.rollupPluginPostcssStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ctx extends StObject {
    
    var ctx: js.Any
    
    var path: String
  }
  object Ctx {
    
    inline def apply(ctx: js.Any, path: String): Ctx = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ctx]
    }
    
    extension [Self <: Ctx](x: Self) {
      
      inline def setCtx(value: js.Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait InsertAt extends StObject {
    
    var insertAt: js.UndefOr[top | String] = js.undefined
  }
  object InsertAt {
    
    inline def apply(): InsertAt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InsertAt]
    }
    
    extension [Self <: InsertAt](x: Self) {
      
      inline def setInsertAt(value: top | String): Self = StObject.set(x, "insertAt", value.asInstanceOf[js.Any])
      
      inline def setInsertAtUndefined: Self = StObject.set(x, "insertAt", js.undefined)
    }
  }
}
