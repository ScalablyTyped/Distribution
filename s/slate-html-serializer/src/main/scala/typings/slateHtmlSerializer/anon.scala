package typings.slateHtmlSerializer

import typings.slateHtmlSerializer.slateHtmlSerializerBooleans.`false`
import typings.slateHtmlSerializer.slateHtmlSerializerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var toJSON: js.UndefOr[`false`] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setToJSON(value: `false`): Self = StObject.set(x, "toJSON", value.asInstanceOf[js.Any])
      
      inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    }
  }
  
  trait `1` extends StObject {
    
    var render: `false`
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal(render = false)
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setRender(value: `false`): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    }
  }
  
  trait Render extends StObject {
    
    var render: js.UndefOr[`true`] = js.undefined
  }
  object Render {
    
    inline def apply(): Render = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Render]
    }
    
    extension [Self <: Render](x: Self) {
      
      inline def setRender(value: `true`): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  trait ToJSON extends StObject {
    
    var toJSON: `true`
  }
  object ToJSON {
    
    inline def apply(): ToJSON = {
      val __obj = js.Dynamic.literal(toJSON = true)
      __obj.asInstanceOf[ToJSON]
    }
    
    extension [Self <: ToJSON](x: Self) {
      
      inline def setToJSON(value: `true`): Self = StObject.set(x, "toJSON", value.asInstanceOf[js.Any])
    }
  }
}
