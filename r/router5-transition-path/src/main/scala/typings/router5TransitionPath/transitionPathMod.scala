package typings.router5TransitionPath

import org.scalablytyped.runtime.StringDictionary
import typings.router5TransitionPath.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionPathMod {
  
  @JSImport("router5-transition-path/dist/transitionPath", JSImport.Default)
  @js.native
  def default(toState: State): TransitionPath = js.native
  @JSImport("router5-transition-path/dist/transitionPath", JSImport.Default)
  @js.native
  def default(toState: State, fromState: State): TransitionPath = js.native
  
  @JSImport("router5-transition-path/dist/transitionPath", "nameToIDs")
  @js.native
  def nameToIDs(name: String): js.Array[String] = js.native
  
  type SegementParams = StringDictionary[String]
  
  @js.native
  trait State
    extends /* key */ StringDictionary[js.Any] {
    
    var meta: js.UndefOr[Options] = js.native
    
    var name: String = js.native
    
    var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object State {
    
    @scala.inline
    def apply(name: String): State = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeta(value: Options): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  @js.native
  trait TransitionPath extends StObject {
    
    var intersection: String = js.native
    
    var toActivate: js.Array[String] = js.native
    
    var toDeactivate: js.Array[String] = js.native
  }
  object TransitionPath {
    
    @scala.inline
    def apply(intersection: String, toActivate: js.Array[String], toDeactivate: js.Array[String]): TransitionPath = {
      val __obj = js.Dynamic.literal(intersection = intersection.asInstanceOf[js.Any], toActivate = toActivate.asInstanceOf[js.Any], toDeactivate = toDeactivate.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionPath]
    }
    
    @scala.inline
    implicit class TransitionPathMutableBuilder[Self <: TransitionPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIntersection(value: String): Self = StObject.set(x, "intersection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToActivate(value: js.Array[String]): Self = StObject.set(x, "toActivate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToActivateVarargs(value: String*): Self = StObject.set(x, "toActivate", js.Array(value :_*))
      
      @scala.inline
      def setToDeactivate(value: js.Array[String]): Self = StObject.set(x, "toDeactivate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToDeactivateVarargs(value: String*): Self = StObject.set(x, "toDeactivate", js.Array(value :_*))
    }
  }
}
