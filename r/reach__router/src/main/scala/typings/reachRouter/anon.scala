package typings.reachRouter

import org.scalablytyped.runtime.StringDictionary
import typings.history.mod.LocationState
import typings.reachRouter.mod.NavigateFn
import typings.reachRouter.mod.WindowLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Default extends StObject {
    
    var default: js.UndefOr[Boolean] = js.undefined
    
    var location: js.UndefOr[WindowLocation[LocationState]] = js.undefined
    
    var navigate: js.UndefOr[NavigateFn] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
  }
  object Default {
    
    @scala.inline
    def apply(): Default = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setNavigate(value: NavigateFn): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
  
  trait Dictparam
    extends StObject
       with /* param */ StringDictionary[String] {
    
    var path: String
    
    var uri: String
  }
  object Dictparam {
    
    @scala.inline
    def apply(path: String, uri: String): Dictparam = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictparam]
    }
    
    @scala.inline
    implicit class DictparamMutableBuilder[Self <: Dictparam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait Path extends StObject {
    
    var path: String
    
    var uri: String
  }
  object Path {
    
    @scala.inline
    def apply(path: String, uri: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait PushState extends StObject {
    
    def pushState(state: js.Any, title: String, uri: String): Unit
    
    def replaceState(state: js.Any, title: String, uri: String): Unit
    
    val state: js.Any
  }
  object PushState {
    
    @scala.inline
    def apply(
      pushState: (js.Any, String, String) => Unit,
      replaceState: (js.Any, String, String) => Unit,
      state: js.Any
    ): PushState = {
      val __obj = js.Dynamic.literal(pushState = js.Any.fromFunction3(pushState), replaceState = js.Any.fromFunction3(replaceState), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushState]
    }
    
    @scala.inline
    implicit class PushStateMutableBuilder[Self <: PushState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPushState(value: (js.Any, String, String) => Unit): Self = StObject.set(x, "pushState", js.Any.fromFunction3(value))
      
      @scala.inline
      def setReplaceState(value: (js.Any, String, String) => Unit): Self = StObject.set(x, "replaceState", js.Any.fromFunction3(value))
      
      @scala.inline
      def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var state: js.UndefOr[js.Any] = js.undefined
  }
  object State {
    
    @scala.inline
    def apply(): State = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
