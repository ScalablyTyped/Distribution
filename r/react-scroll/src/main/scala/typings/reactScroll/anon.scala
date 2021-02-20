package typings.reactScroll

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Container extends StObject {
    
    var container: js.UndefOr[HTMLElement] = js.native
  }
  object Container {
    
    @scala.inline
    def apply(): Container = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Container]
    }
    
    @scala.inline
    implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: js.UndefOr[String] = js.native
    
    var name: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(name: String): Id = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Smooth extends StObject {
    
    var smooth: Boolean | String = js.native
  }
  object Smooth {
    
    @scala.inline
    def apply(smooth: Boolean | String): Smooth = {
      val __obj = js.Dynamic.literal(smooth = smooth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Smooth]
    }
    
    @scala.inline
    implicit class SmoothMutableBuilder[Self <: Smooth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSmooth(value: Boolean | String): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    }
  }
}
