package typings.storybookPreviewWeb.anon

import typings.storybookPreviewWeb.previewMod.MaybePromise
import typings.storybookStore.ts39TypesMod.ModuleExports
import typings.storybookStore.ts39TypesMod.ModuleImportFn
import typings.storybookStore.ts39TypesMod.Path
import typings.storybookStore.ts39TypesMod.PromiseLike
import typings.storybookStore.ts39TypesMod.StoryIndex
import typings.storybookStore.ts39TypesMod.WebProjectAnnotations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProjectAnnotations[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
  
  def getProjectAnnotations(): MaybePromise[WebProjectAnnotations[TFramework]]
  
  var getStoryIndex: js.UndefOr[js.Function0[StoryIndex]] = js.undefined
  
  var importFn: ModuleImportFn
}
object GetProjectAnnotations {
  
  inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    getProjectAnnotations: () => MaybePromise[WebProjectAnnotations[TFramework]],
    importFn: /* path */ Path => PromiseLike[ModuleExports]
  ): GetProjectAnnotations[TFramework] = {
    val __obj = js.Dynamic.literal(getProjectAnnotations = js.Any.fromFunction0(getProjectAnnotations), importFn = js.Any.fromFunction1(importFn))
    __obj.asInstanceOf[GetProjectAnnotations[TFramework]]
  }
  
  extension [Self <: GetProjectAnnotations[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](x: Self & GetProjectAnnotations[TFramework]) {
    
    inline def setGetProjectAnnotations(value: () => MaybePromise[WebProjectAnnotations[TFramework]]): Self = StObject.set(x, "getProjectAnnotations", js.Any.fromFunction0(value))
    
    inline def setGetStoryIndex(value: () => StoryIndex): Self = StObject.set(x, "getStoryIndex", js.Any.fromFunction0(value))
    
    inline def setGetStoryIndexUndefined: Self = StObject.set(x, "getStoryIndex", js.undefined)
    
    inline def setImportFn(value: /* path */ Path => PromiseLike[ModuleExports]): Self = StObject.set(x, "importFn", js.Any.fromFunction1(value))
  }
}
