package typings.storybookPreviewWeb.anon

import typings.storybookStore.distTs3Dot9TypesMod.ModuleExports
import typings.storybookStore.distTs3Dot9TypesMod.ModuleImportFn
import typings.storybookStore.distTs3Dot9TypesMod.Path
import typings.storybookStore.distTs3Dot9TypesMod.PromiseLike
import typings.storybookStore.distTs3Dot9TypesMod.StoryIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportFn extends StObject {
  
  var importFn: js.UndefOr[ModuleImportFn] = js.undefined
  
  var storyIndex: js.UndefOr[StoryIndex] = js.undefined
}
object ImportFn {
  
  inline def apply(): ImportFn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportFn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportFn] (val x: Self) extends AnyVal {
    
    inline def setImportFn(value: /* path */ Path => PromiseLike[ModuleExports]): Self = StObject.set(x, "importFn", js.Any.fromFunction1(value))
    
    inline def setImportFnUndefined: Self = StObject.set(x, "importFn", js.undefined)
    
    inline def setStoryIndex(value: StoryIndex): Self = StObject.set(x, "storyIndex", value.asInstanceOf[js.Any])
    
    inline def setStoryIndexUndefined: Self = StObject.set(x, "storyIndex", js.undefined)
  }
}
