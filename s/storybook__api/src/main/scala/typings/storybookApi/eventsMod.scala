package typings.storybookApi

import typings.storybookApi.anon.Ref
import typings.storybookApi.mod.API
import typings.storybookApi.refsMod.ComposedRef
import typings.storybookApi.storybookApiStrings.external
import typings.storybookApi.storybookApiStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("@storybook/api/dist/lib/events", "getEventMetadata")
  @js.native
  def getEventMetadata(context: Meta, fullAPI: API): Ref = js.native
  
  @js.native
  trait Meta extends StObject {
    
    var ref: js.UndefOr[ComposedRef] = js.native
    
    var refId: js.UndefOr[String] = js.native
    
    var source: js.UndefOr[String] = js.native
    
    var sourceLocation: js.UndefOr[String] = js.native
    
    var sourceType: js.UndefOr[local | external] = js.native
    
    var `type`: String = js.native
    
    var v: js.UndefOr[Double] = js.native
  }
  object Meta {
    
    @scala.inline
    def apply(`type`: String): Meta = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meta]
    }
    
    @scala.inline
    implicit class MetaMutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRef(value: ComposedRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceLocation(value: String): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceLocationUndefined: Self = StObject.set(x, "sourceLocation", js.undefined)
      
      @scala.inline
      def setSourceType(value: local | external): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVUndefined: Self = StObject.set(x, "v", js.undefined)
    }
  }
}
