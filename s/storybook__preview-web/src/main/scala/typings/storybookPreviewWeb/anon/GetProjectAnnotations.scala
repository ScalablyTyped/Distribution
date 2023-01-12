package typings.storybookPreviewWeb.anon

import typings.storybookPreviewWeb.distTs3Dot9PreviewMod.MaybePromise
import typings.storybookStore.distTs3Dot9TypesMod.ModuleExports
import typings.storybookStore.distTs3Dot9TypesMod.ModuleImportFn
import typings.storybookStore.distTs3Dot9TypesMod.Path
import typings.storybookStore.distTs3Dot9TypesMod.PromiseLike
import typings.storybookStore.distTs3Dot9TypesMod.StoryIndex
import typings.storybookStore.distTs3Dot9TypesMod.WebProjectAnnotations
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetProjectAnnotations[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] (val x: Self & GetProjectAnnotations[TFramework]) extends AnyVal {
    
    inline def setGetProjectAnnotations(value: () => MaybePromise[WebProjectAnnotations[TFramework]]): Self = StObject.set(x, "getProjectAnnotations", js.Any.fromFunction0(value))
    
    inline def setGetStoryIndex(value: () => StoryIndex): Self = StObject.set(x, "getStoryIndex", js.Any.fromFunction0(value))
    
    inline def setGetStoryIndexUndefined: Self = StObject.set(x, "getStoryIndex", js.undefined)
    
    inline def setImportFn(value: /* path */ Path => PromiseLike[ModuleExports]): Self = StObject.set(x, "importFn", js.Any.fromFunction1(value))
  }
}
