package typings.reactAlbus

import typings.react.mod.ReactNode
import typings.reactAlbus.mod.WizardContext
import typings.reactAlbus.mod.WizardContextRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children
    extends StObject
       with WizardContextRenderProps {
    
    var children: (js.Function1[/* wizard */ WizardContext, ReactNode]) | ReactNode
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: (js.Function1[/* wizard */ WizardContext, ReactNode]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* wizard */ WizardContext => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait Render
    extends StObject
       with WizardContextRenderProps {
    
    var render: js.UndefOr[js.Function1[/* wizard */ WizardContext, ReactNode]] = js.undefined
  }
  object Render {
    
    inline def apply(): Render = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Render]
    }
    
    extension [Self <: Render](x: Self) {
      
      inline def setRender(value: /* wizard */ WizardContext => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
