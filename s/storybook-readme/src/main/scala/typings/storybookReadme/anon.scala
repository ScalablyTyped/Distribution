package typings.storybookReadme

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: ReactNode
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait ChildrenElement extends StObject {
    
    var children: Element
  }
  object ChildrenElement {
    
    inline def apply(children: Element): ChildrenElement = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildrenElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChildrenElement] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: Element): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  trait Md extends StObject {
    
    var md: String
  }
  object Md {
    
    inline def apply(md: String): Md = {
      val __obj = js.Dynamic.literal(md = md.asInstanceOf[js.Any])
      __obj.asInstanceOf[Md]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Md] (val x: Self) extends AnyVal {
      
      inline def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    }
  }
}
