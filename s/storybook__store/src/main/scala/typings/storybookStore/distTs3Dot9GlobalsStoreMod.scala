package typings.storybookStore

import typings.std.Set
import typings.storybookStore.anon.GlobalTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9GlobalsStoreMod {
  
  @JSImport("@storybook/store/dist/ts3.9/GlobalsStore", "GlobalsStore")
  @js.native
  open class GlobalsStore () extends StObject {
    
    var allowedGlobalNames: Set[String] = js.native
    
    def filterAllowedGlobals(
      globals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
    ): Any = js.native
    
    def get(): Any = js.native
    
    var globals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any = js.native
    
    var initialGlobals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any = js.native
    
    def set(hasGlobalsGlobalTypes: GlobalTypes): Unit = js.native
    
    def update(
      newGlobals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
    ): Unit = js.native
    
    def updateFromPersisted(
      persisted: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
    ): Unit = js.native
  }
}
