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
    
    extension [Self <: Children](x: Self) {
      
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
    
    extension [Self <: ChildrenElement](x: Self) {
      
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
    
    extension [Self <: Md](x: Self) {
      
      inline def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    }
  }
}
