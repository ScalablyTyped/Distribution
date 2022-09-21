package typings.schematicsAngular.workspaceModelsMod

import typings.schematicsAngular.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuilderTarget[TBuilder /* <: Builders */, TOptions] extends StObject {
  
  var builder: TBuilder
  
  var configurations: js.UndefOr[Dictkey[TOptions]] = js.undefined
  
  var options: TOptions
}
object BuilderTarget {
  
  inline def apply[TBuilder /* <: Builders */, TOptions](builder: TBuilder, options: TOptions): BuilderTarget[TBuilder, TOptions] = {
    val __obj = js.Dynamic.literal(builder = builder.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuilderTarget[TBuilder, TOptions]]
  }
  
  extension [Self <: BuilderTarget[?, ?], TBuilder /* <: Builders */, TOptions](x: Self & (BuilderTarget[TBuilder, TOptions])) {
    
    inline def setBuilder(value: TBuilder): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
    
    inline def setConfigurations(value: Dictkey[TOptions]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
    inline def setOptions(value: TOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
