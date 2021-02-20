package typings.reactAriaLive

import typings.react.mod.ReactNode
import typings.reactAriaLive.reactAriaLiveStrings.assertive
import typings.reactAriaLive.reactAriaLiveStrings.polite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AnnounceAssertive extends StObject {
    
    def announceAssertive(message: String): Unit = js.native
    def announceAssertive(message: String, id: String): Unit = js.native
    
    def announcePolite(message: String): Unit = js.native
    def announcePolite(message: String, id: String): Unit = js.native
  }
  
  @js.native
  trait Arialive extends StObject {
    
    var `aria-live`: assertive | polite = js.native
    
    var clearOnUnmount: js.UndefOr[Boolean] = js.native
    
    var message: String = js.native
  }
  object Arialive {
    
    @scala.inline
    def apply(`aria-live`: assertive | polite, message: String): Arialive = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arialive]
    }
    
    @scala.inline
    implicit class ArialiveMutableBuilder[Self <: Arialive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-live`(value: assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearOnUnmount(value: Boolean): Self = StObject.set(x, "clearOnUnmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearOnUnmountUndefined: Self = StObject.set(x, "clearOnUnmount", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Children extends StObject {
    
    def children(contextProps: AnnounceAssertive): ReactNode = js.native
  }
  object Children {
    
    @scala.inline
    def apply(children: AnnounceAssertive => ReactNode): Children = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: AnnounceAssertive => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
}
