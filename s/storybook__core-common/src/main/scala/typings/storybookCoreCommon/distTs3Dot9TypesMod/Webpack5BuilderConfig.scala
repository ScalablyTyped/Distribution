package typings.storybookCoreCommon.distTs3Dot9TypesMod

import typings.storybookCoreCommon.anon.FsCache
import typings.storybookCoreCommon.storybookCoreCommonStrings.webpack5
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.storybookCoreCommon.distTs3Dot9TypesMod._BuilderConfig because Already inherited */ trait Webpack5BuilderConfig
  extends StObject
     with BuilderConfigObject {
  
  @JSName("name")
  var name_Webpack5BuilderConfig: webpack5
  
  @JSName("options")
  var options_Webpack5BuilderConfig: js.UndefOr[FsCache] = js.undefined
}
object Webpack5BuilderConfig {
  
  inline def apply(): Webpack5BuilderConfig = {
    val __obj = js.Dynamic.literal(name = "webpack5")
    __obj.asInstanceOf[Webpack5BuilderConfig]
  }
  
  extension [Self <: Webpack5BuilderConfig](x: Self) {
    
    inline def setName(value: webpack5): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: FsCache): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
