package typings.storybookCoreCommon.typesMod

import typings.storybookCoreCommon.storybookCoreCommonStrings.webpack4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.storybookCoreCommon.typesMod._BuilderConfig because Already inherited */ trait Webpack4BuilderConfig
  extends StObject
     with BuilderConfigObject {
  
  @JSName("name")
  var name_Webpack4BuilderConfig: webpack4
}
object Webpack4BuilderConfig {
  
  inline def apply(): Webpack4BuilderConfig = {
    val __obj = js.Dynamic.literal(name = "webpack4")
    __obj.asInstanceOf[Webpack4BuilderConfig]
  }
  
  extension [Self <: Webpack4BuilderConfig](x: Self) {
    
    inline def setName(value: webpack4): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
