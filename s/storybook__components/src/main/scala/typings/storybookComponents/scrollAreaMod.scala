package typings.storybookComponents

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollAreaMod {
  
  @JSImport("@storybook/components/dist/ScrollArea/ScrollArea", "ScrollArea")
  @js.native
  val ScrollArea: FunctionComponent[ScrollAreaProps] = js.native
  
  @js.native
  trait ScrollAreaProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var horizontal: js.UndefOr[Boolean] = js.native
    
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object ScrollAreaProps {
    
    @scala.inline
    def apply(): ScrollAreaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollAreaProps]
    }
    
    @scala.inline
    implicit class ScrollAreaPropsMutableBuilder[Self <: ScrollAreaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  @js.native
  trait ScrollProps
    extends /* key */ StringDictionary[js.Any] {
    
    var horizontal: js.UndefOr[Boolean] = js.native
    
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object ScrollProps {
    
    @scala.inline
    def apply(): ScrollProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollProps]
    }
    
    @scala.inline
    implicit class ScrollPropsMutableBuilder[Self <: ScrollProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
