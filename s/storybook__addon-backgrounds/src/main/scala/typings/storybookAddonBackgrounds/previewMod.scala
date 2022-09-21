package typings.storybookAddonBackgrounds

import typings.storybookAddonBackgrounds.anon.Grid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewMod {
  
  @JSImport("@storybook/addon-backgrounds/dist/ts3.9/preview", "decorators")
  @js.native
  val decorators: js.Array[
    js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_csf.PartialStoryFn<imported_csf.AnyFramework, imported_csf.Args> */ /* StoryFn */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_csf.StoryContext<imported_csf.AnyFramework, imported_csf.Args> */ /* context */ Any, 
      Any
    ]
  ] = js.native
  
  object parameters {
    
    @JSImport("@storybook/addon-backgrounds/dist/ts3.9/preview", "parameters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-backgrounds/dist/ts3.9/preview", "parameters.backgrounds")
    @js.native
    def backgrounds: Grid = js.native
    inline def backgrounds_=(x: Grid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgrounds")(x.asInstanceOf[js.Any])
  }
}
