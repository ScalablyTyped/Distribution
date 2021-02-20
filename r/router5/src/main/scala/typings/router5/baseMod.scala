package typings.router5

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  type CancelFn = js.Function0[Unit]
  
  type DoneFn = js.Function2[/* err */ js.UndefOr[js.Any], /* state */ js.UndefOr[State], Unit]
  
  @js.native
  trait NavigationOptions
    extends /* key */ StringDictionary[js.Any] {
    
    var force: js.UndefOr[Boolean] = js.native
    
    var reload: js.UndefOr[Boolean] = js.native
    
    var replace: js.UndefOr[Boolean] = js.native
    
    var skipTransition: js.UndefOr[Boolean] = js.native
  }
  object NavigationOptions {
    
    @scala.inline
    def apply(): NavigationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationOptions]
    }
    
    @scala.inline
    implicit class NavigationOptionsMutableBuilder[Self <: NavigationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
      
      @scala.inline
      def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setSkipTransition(value: Boolean): Self = StObject.set(x, "skipTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipTransitionUndefined: Self = StObject.set(x, "skipTransition", js.undefined)
    }
  }
  
  type Params = Record[String, js.Any]
  
  @js.native
  trait SimpleState extends StObject {
    
    var name: String = js.native
    
    var params: Params = js.native
  }
  object SimpleState {
    
    @scala.inline
    def apply(name: String, params: Params): SimpleState = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleState]
    }
    
    @scala.inline
    implicit class SimpleStateMutableBuilder[Self <: SimpleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var meta: js.UndefOr[StateMeta] = js.native
    
    var name: String = js.native
    
    var params: Params = js.native
    
    var path: String = js.native
  }
  object State {
    
    @scala.inline
    def apply(name: String, params: Params, path: String): State = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeta(value: StateMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StateMeta extends StObject {
    
    var id: Double = js.native
    
    var options: NavigationOptions = js.native
    
    var params: Params = js.native
    
    var redirected: Boolean = js.native
    
    var source: js.UndefOr[String] = js.native
  }
  object StateMeta {
    
    @scala.inline
    def apply(id: Double, options: NavigationOptions, params: Params, redirected: Boolean): StateMeta = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateMeta]
    }
    
    @scala.inline
    implicit class StateMetaMutableBuilder[Self <: StateMeta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: NavigationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirected(value: Boolean): Self = StObject.set(x, "redirected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  type Unsubscribe = js.Function0[Unit]
}
