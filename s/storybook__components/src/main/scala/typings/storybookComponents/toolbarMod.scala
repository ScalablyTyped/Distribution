package typings.storybookComponents

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarMod {
  
  @JSImport("@storybook/components/dist/blocks/Toolbar", "Toolbar")
  @js.native
  val Toolbar: FunctionComponent[ToolbarProps] = js.native
  
  @js.native
  trait BarProps extends StObject {
    
    var border: js.UndefOr[Boolean] = js.native
  }
  object BarProps {
    
    @scala.inline
    def apply(): BarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarProps]
    }
    
    @scala.inline
    implicit class BarPropsMutableBuilder[Self <: BarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    }
  }
  
  @js.native
  trait EjectProps extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var storyId: js.UndefOr[String] = js.native
  }
  object EjectProps {
    
    @scala.inline
    def apply(): EjectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EjectProps]
    }
    
    @scala.inline
    implicit class EjectPropsMutableBuilder[Self <: EjectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoryIdUndefined: Self = StObject.set(x, "storyId", js.undefined)
    }
  }
  
  type ToolbarProps = BarProps with ZoomProps with EjectProps
  
  @js.native
  trait ZoomProps extends StObject {
    
    def resetZoom(): Unit = js.native
    
    def zoom(`val`: Double): Unit = js.native
  }
  object ZoomProps {
    
    @scala.inline
    def apply(resetZoom: () => Unit, zoom: Double => Unit): ZoomProps = {
      val __obj = js.Dynamic.literal(resetZoom = js.Any.fromFunction0(resetZoom), zoom = js.Any.fromFunction1(zoom))
      __obj.asInstanceOf[ZoomProps]
    }
    
    @scala.inline
    implicit class ZoomPropsMutableBuilder[Self <: ZoomProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResetZoom(value: () => Unit): Self = StObject.set(x, "resetZoom", js.Any.fromFunction0(value))
      
      @scala.inline
      def setZoom(value: Double => Unit): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
    }
  }
}
