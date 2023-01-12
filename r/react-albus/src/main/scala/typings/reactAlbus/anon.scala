package typings.reactAlbus

import typings.history.mod.History
import typings.react.mod.ReactNode
import typings.reactAlbus.mod.WizardContext
import typings.reactAlbus.mod.WizardContextRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Basename extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var history: js.UndefOr[History] = js.undefined
    
    var onNext: js.UndefOr[js.Function1[/* wizard */ WizardContext, Unit]] = js.undefined
  }
  object Basename {
    
    inline def apply(): Basename = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Basename]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Basename] (val x: Self) extends AnyVal {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setOnNext(value: /* wizard */ WizardContext => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
      
      inline def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
    }
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Render] (val x: Self) extends AnyVal {
      
      inline def setRender(value: /* wizard */ WizardContext => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
