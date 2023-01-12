package typings.storybookStore.anon

import typings.storybookStore.distTs3Dot9TypesMod.ModuleExports
import typings.storybookStore.distTs3Dot9TypesMod.ModuleImportFn
import typings.storybookStore.distTs3Dot9TypesMod.Path
import typings.storybookStore.distTs3Dot9TypesMod.PromiseLike
import typings.storybookStore.distTs3Dot9TypesMod.StoryIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cache extends StObject {
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var importFn: ModuleImportFn
  
  var storyIndex: js.UndefOr[StoryIndex] = js.undefined
}
object Cache {
  
  inline def apply(importFn: /* path */ Path => PromiseLike[ModuleExports]): Cache = {
    val __obj = js.Dynamic.literal(importFn = js.Any.fromFunction1(importFn))
    __obj.asInstanceOf[Cache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setImportFn(value: /* path */ Path => PromiseLike[ModuleExports]): Self = StObject.set(x, "importFn", js.Any.fromFunction1(value))
    
    inline def setStoryIndex(value: StoryIndex): Self = StObject.set(x, "storyIndex", value.asInstanceOf[js.Any])
    
    inline def setStoryIndexUndefined: Self = StObject.set(x, "storyIndex", js.undefined)
  }
}
