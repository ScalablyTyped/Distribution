package typings.storybookComponents

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarMod {
  
  @JSImport("@storybook/components/dist/blocks/Toolbar", "Toolbar")
  @js.native
  val Toolbar: FunctionComponent[ToolbarProps] = js.native
  
  trait BarProps extends StObject {
    
    var border: js.UndefOr[Boolean] = js.undefined
  }
  object BarProps {
    
    inline def apply(): BarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarProps]
    }
    
    extension [Self <: BarProps](x: Self) {
      
      inline def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    }
  }
  
  trait EjectProps extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var storyId: js.UndefOr[String] = js.undefined
  }
  object EjectProps {
    
    inline def apply(): EjectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EjectProps]
    }
    
    extension [Self <: EjectProps](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      inline def setStoryIdUndefined: Self = StObject.set(x, "storyId", js.undefined)
    }
  }
  
  trait ToolbarProps
    extends StObject
       with BarProps
       with ZoomProps
       with EjectProps
  object ToolbarProps {
    
    inline def apply(resetZoom: () => Unit, zoom: Double => Unit): ToolbarProps = {
      val __obj = js.Dynamic.literal(resetZoom = js.Any.fromFunction0(resetZoom), zoom = js.Any.fromFunction1(zoom))
      __obj.asInstanceOf[ToolbarProps]
    }
  }
  
  trait ZoomProps extends StObject {
    
    def resetZoom(): Unit
    
    def zoom(`val`: Double): Unit
  }
  object ZoomProps {
    
    inline def apply(resetZoom: () => Unit, zoom: Double => Unit): ZoomProps = {
      val __obj = js.Dynamic.literal(resetZoom = js.Any.fromFunction0(resetZoom), zoom = js.Any.fromFunction1(zoom))
      __obj.asInstanceOf[ZoomProps]
    }
    
    extension [Self <: ZoomProps](x: Self) {
      
      inline def setResetZoom(value: () => Unit): Self = StObject.set(x, "resetZoom", js.Any.fromFunction0(value))
      
      inline def setZoom(value: Double => Unit): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
    }
  }
}
