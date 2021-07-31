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
    
    def children(wizard: WizardContext): ReactNode
  }
  object Children {
    
    @scala.inline
    def apply(children: WizardContext => ReactNode): Children = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: WizardContext => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait Render
    extends StObject
       with WizardContextRenderProps {
    
    var render: js.UndefOr[js.Function1[/* wizard */ WizardContext, ReactNode]] = js.undefined
  }
  object Render {
    
    @scala.inline
    def apply(): Render = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Render]
    }
    
    @scala.inline
    implicit class RenderMutableBuilder[Self <: Render] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: /* wizard */ WizardContext => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
