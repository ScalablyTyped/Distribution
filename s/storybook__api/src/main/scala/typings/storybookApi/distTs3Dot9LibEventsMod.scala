package typings.storybookApi

import typings.storybookApi.anon.Ref
import typings.storybookApi.distTs3Dot9ModulesRefsMod.ComposedRef
import typings.storybookApi.mod.API
import typings.storybookApi.storybookApiStrings.external
import typings.storybookApi.storybookApiStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9LibEventsMod {
  
  @JSImport("@storybook/api/dist/ts3.9/lib/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEventMetadata(context: Meta, fullAPI: API): Ref = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventMetadata")(context.asInstanceOf[js.Any], fullAPI.asInstanceOf[js.Any])).asInstanceOf[Ref]
  
  trait Meta extends StObject {
    
    var ref: js.UndefOr[ComposedRef] = js.undefined
    
    var refId: js.UndefOr[String] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
    
    var sourceLocation: js.UndefOr[String] = js.undefined
    
    var sourceType: js.UndefOr[local | external] = js.undefined
    
    var `type`: String
    
    var v: js.UndefOr[Double] = js.undefined
  }
  object Meta {
    
    inline def apply(`type`: String): Meta = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
      
      inline def setRef(value: ComposedRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceLocation(value: String): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
      
      inline def setSourceLocationUndefined: Self = StObject.set(x, "sourceLocation", js.undefined)
      
      inline def setSourceType(value: local | external): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
    }
  }
}
