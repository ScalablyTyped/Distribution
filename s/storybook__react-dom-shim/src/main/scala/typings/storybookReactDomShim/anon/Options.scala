package typings.storybookReactDomShim.anon

import typings.std.Record
import typings.storybookReactDomShim.distPresetMod.BuilderName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var name: BuilderName
  
  var options: js.UndefOr[Record[String, Any]] = js.undefined
}
object Options {
  
  inline def apply(name: BuilderName): Options = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setName(value: BuilderName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Record[String, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
