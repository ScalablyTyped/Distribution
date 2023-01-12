package typings.storybookStore.distTs3Dot9TypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizedStoriesSpecifier extends StObject {
  
  var glob: js.UndefOr[String] = js.undefined
  
  var specifier: js.UndefOr[StoriesSpecifier] = js.undefined
}
object NormalizedStoriesSpecifier {
  
  inline def apply(): NormalizedStoriesSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizedStoriesSpecifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NormalizedStoriesSpecifier] (val x: Self) extends AnyVal {
    
    inline def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
    
    inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
    
    inline def setSpecifier(value: StoriesSpecifier): Self = StObject.set(x, "specifier", value.asInstanceOf[js.Any])
    
    inline def setSpecifierUndefined: Self = StObject.set(x, "specifier", js.undefined)
  }
}
