package typings.storybookComponents

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollAreaMod {
  
  @JSImport("@storybook/components/dist/ScrollArea/ScrollArea", "ScrollArea")
  @js.native
  val ScrollArea: FunctionComponent[ScrollAreaProps] = js.native
  
  trait ScrollAreaProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object ScrollAreaProps {
    
    inline def apply(): ScrollAreaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollAreaProps]
    }
    
    extension [Self <: ScrollAreaProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait ScrollProps
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object ScrollProps {
    
    inline def apply(): ScrollProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollProps]
    }
    
    extension [Self <: ScrollProps](x: Self) {
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
