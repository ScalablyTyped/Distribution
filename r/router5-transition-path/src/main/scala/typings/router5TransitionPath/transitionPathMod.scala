package typings.router5TransitionPath

import org.scalablytyped.runtime.StringDictionary
import typings.router5TransitionPath.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionPathMod {
  
  @JSImport("router5-transition-path/dist/transitionPath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(toState: State): TransitionPath = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(toState.asInstanceOf[js.Any]).asInstanceOf[TransitionPath]
  inline def default(toState: State, fromState: State): TransitionPath = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(toState.asInstanceOf[js.Any], fromState.asInstanceOf[js.Any])).asInstanceOf[TransitionPath]
  
  inline def nameToIDs(name: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("nameToIDs")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  type SegementParams = StringDictionary[String]
  
  trait State
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var meta: js.UndefOr[Options] = js.undefined
    
    var name: String
    
    var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object State {
    
    inline def apply(name: String): State = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setMeta(value: Options): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  trait TransitionPath extends StObject {
    
    var intersection: String
    
    var toActivate: js.Array[String]
    
    var toDeactivate: js.Array[String]
  }
  object TransitionPath {
    
    inline def apply(intersection: String, toActivate: js.Array[String], toDeactivate: js.Array[String]): TransitionPath = {
      val __obj = js.Dynamic.literal(intersection = intersection.asInstanceOf[js.Any], toActivate = toActivate.asInstanceOf[js.Any], toDeactivate = toDeactivate.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionPath]
    }
    
    extension [Self <: TransitionPath](x: Self) {
      
      inline def setIntersection(value: String): Self = StObject.set(x, "intersection", value.asInstanceOf[js.Any])
      
      inline def setToActivate(value: js.Array[String]): Self = StObject.set(x, "toActivate", value.asInstanceOf[js.Any])
      
      inline def setToActivateVarargs(value: String*): Self = StObject.set(x, "toActivate", js.Array(value :_*))
      
      inline def setToDeactivate(value: js.Array[String]): Self = StObject.set(x, "toDeactivate", value.asInstanceOf[js.Any])
      
      inline def setToDeactivateVarargs(value: String*): Self = StObject.set(x, "toDeactivate", js.Array(value :_*))
    }
  }
}
