package typings.storybookApi

import typings.storybookApi.mod.ModuleFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModulesGlobalsMod {
  
  @JSImport("@storybook/api/dist/ts3.9/modules/globals", "init")
  @js.native
  val init: ModuleFn = js.native
  
  trait SubAPI extends StObject {
    
    def getGlobalTypes(): Any
    
    def getGlobals(): Any
    
    def updateGlobals(
      newGlobals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
    ): Unit
  }
  object SubAPI {
    
    inline def apply(
      getGlobalTypes: () => Any,
      getGlobals: () => Any,
      updateGlobals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any => Unit
    ): SubAPI = {
      val __obj = js.Dynamic.literal(getGlobalTypes = js.Any.fromFunction0(getGlobalTypes), getGlobals = js.Any.fromFunction0(getGlobals), updateGlobals = js.Any.fromFunction1(updateGlobals))
      __obj.asInstanceOf[SubAPI]
    }
    
    extension [Self <: SubAPI](x: Self) {
      
      inline def setGetGlobalTypes(value: () => Any): Self = StObject.set(x, "getGlobalTypes", js.Any.fromFunction0(value))
      
      inline def setGetGlobals(value: () => Any): Self = StObject.set(x, "getGlobals", js.Any.fromFunction0(value))
      
      inline def setUpdateGlobals(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any => Unit
      ): Self = StObject.set(x, "updateGlobals", js.Any.fromFunction1(value))
    }
  }
  
  trait SubState extends StObject {
    
    var globalTypes: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalTypes */ Any
      ] = js.undefined
    
    var globals: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
      ] = js.undefined
  }
  object SubState {
    
    inline def apply(): SubState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubState]
    }
    
    extension [Self <: SubState](x: Self) {
      
      inline def setGlobalTypes(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalTypes */ Any
      ): Self = StObject.set(x, "globalTypes", value.asInstanceOf[js.Any])
      
      inline def setGlobalTypesUndefined: Self = StObject.set(x, "globalTypes", js.undefined)
      
      inline def setGlobals(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
      ): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    }
  }
}
