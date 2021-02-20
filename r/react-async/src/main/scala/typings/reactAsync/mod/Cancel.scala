package typings.reactAsync.mod

import typings.reactAsync.anon.Dictmeta
import typings.reactAsync.reactAsyncStrings.cancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-async.react-async.AbstractAction & {  type :'cancel'} */
@js.native
trait Cancel
  extends AsyncAction[js.Any] {
  
  var meta: Dictmeta = js.native
  
  var `type`: String with cancel = js.native
}
object Cancel {
  
  @scala.inline
  def apply(meta: Dictmeta, `type`: String with cancel): Cancel = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  
  @scala.inline
  implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeta(value: Dictmeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String with cancel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
