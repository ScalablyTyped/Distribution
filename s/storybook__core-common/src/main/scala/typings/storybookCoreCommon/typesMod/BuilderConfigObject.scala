package typings.storybookCoreCommon.typesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuilderConfigObject
  extends StObject
     with _BuilderConfig {
  
  var name: BuilderName
  
  var options: js.UndefOr[Record[String, Any]] = js.undefined
}
object BuilderConfigObject {
  
  inline def apply(name: BuilderName): BuilderConfigObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuilderConfigObject]
  }
  
  extension [Self <: BuilderConfigObject](x: Self) {
    
    inline def setName(value: BuilderName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Record[String, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
