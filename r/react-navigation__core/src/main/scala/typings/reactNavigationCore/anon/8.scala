package typings.reactNavigationCore.anon

import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8`[EventName /* <: Extract[/* keyof {} */ String, String] */] extends StObject {
  
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any
  ] = js.undefined
}
object `8` {
  
  @scala.inline
  def apply[EventName /* <: Extract[/* keyof {} */ String, String] */](): `8`[EventName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`8`[EventName]]
  }
  
  @scala.inline
  implicit class `8MutableBuilder`[Self <: `8`[?], EventName /* <: Extract[/* keyof {} */ String, String] */] (val x: Self & `8`[EventName]) extends AnyVal {
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
