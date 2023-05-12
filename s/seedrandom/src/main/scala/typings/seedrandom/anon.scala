package typings.seedrandom

import typings.seedrandom.seedrandomBooleans.`false`
import typings.seedrandom.seedrandomBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[State] extends StObject {
    
    var state: State | `true`
  }
  object `0` {
    
    inline def apply[State](state: State | `true`): `0`[State] = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`[State]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`[?], State] (val x: Self & `0`[State]) extends AnyVal {
      
      inline def setState(value: State | `true`): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var state: js.UndefOr[`false`] = js.undefined
  }
  object State {
    
    inline def apply(): State = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setState(value: `false`): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
