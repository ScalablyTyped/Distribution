package typings.storybookApi

import typings.storybookApi.mod.Args
import typings.storybookApi.mod.ModuleFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalsMod {
  
  @JSImport("@storybook/api/dist/modules/globals", "init")
  @js.native
  val init: ModuleFn = js.native
  
  trait SubAPI extends StObject {
    
    def updateGlobals(newGlobals: Args): Unit
  }
  object SubAPI {
    
    inline def apply(updateGlobals: Args => Unit): SubAPI = {
      val __obj = js.Dynamic.literal(updateGlobals = js.Any.fromFunction1(updateGlobals))
      __obj.asInstanceOf[SubAPI]
    }
    
    extension [Self <: SubAPI](x: Self) {
      
      inline def setUpdateGlobals(value: Args => Unit): Self = StObject.set(x, "updateGlobals", js.Any.fromFunction1(value))
    }
  }
  
  trait SubState extends StObject {
    
    var globals: Args
  }
  object SubState {
    
    inline def apply(globals: Args): SubState = {
      val __obj = js.Dynamic.literal(globals = globals.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    extension [Self <: SubState](x: Self) {
      
      inline def setGlobals(value: Args): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    }
  }
}
