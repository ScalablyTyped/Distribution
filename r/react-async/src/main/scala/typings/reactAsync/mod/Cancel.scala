package typings.reactAsync.mod

import typings.reactAsync.anon.Dictmeta
import typings.reactAsync.reactAsyncStrings.cancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel
  extends StObject
     with AbstractAction
     with AsyncAction[Any] {
  
  @JSName("type")
  var type_Cancel: cancel
}
object Cancel {
  
  inline def apply(meta: Dictmeta): Cancel = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cancel")
    __obj.asInstanceOf[Cancel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
    
    inline def setType(value: cancel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
