package typings.reactScroll

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Container extends StObject {
    
    var container: js.UndefOr[HTMLElement] = js.undefined
  }
  object Container {
    
    inline def apply(): Container = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Container]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object Id {
    
    inline def apply(name: String): Id = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Smooth extends StObject {
    
    var smooth: Boolean | String
  }
  object Smooth {
    
    inline def apply(smooth: Boolean | String): Smooth = {
      val __obj = js.Dynamic.literal(smooth = smooth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Smooth]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Smooth] (val x: Self) extends AnyVal {
      
      inline def setSmooth(value: Boolean | String): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    }
  }
}
