package typings.storybookAddonA11y

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visionSimulatorMod {
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/VisionSimulator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def VisionSimulator(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("VisionSimulator")().asInstanceOf[Element]
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/VisionSimulator", "baseList")
  @js.native
  val baseList: js.Array[Option] = js.native
  
  trait Link extends StObject {
    
    var active: Boolean
    
    var id: String
    
    def onClick(): Unit
    
    var right: js.UndefOr[ReactNode] = js.undefined
    
    var title: ReactNode
  }
  object Link {
    
    inline def apply(active: Boolean, id: String, onClick: () => Unit): Link = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick))
      __obj.asInstanceOf[Link]
    }
    
    extension [Self <: Link](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setRight(value: ReactNode): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Option extends StObject {
    
    var name: String
    
    var percentage: js.UndefOr[Double] = js.undefined
  }
  object Option {
    
    inline def apply(name: String): Option = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    }
  }
}
