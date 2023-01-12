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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Render] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToJSON] (val x: Self) extends AnyVal {
      
      inline def setToJSON(value: `true`): Self = StObject.set(x, "toJSON", value.asInstanceOf[js.Any])
    }
  }
}
