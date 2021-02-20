package typings.qlik.mod

import typings.qlik.qlikStrings.AND
import typings.qlik.qlikStrings.NORMAL
import typings.qlik.qlikStrings.NOT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxFieldSelectionInfo extends StObject {
  
  var qFieldSelectionmode: NORMAL | AND | NOT = js.native
  
  var qName: String = js.native
}
object NxFieldSelectionInfo {
  
  @scala.inline
  def apply(qFieldSelectionmode: NORMAL | AND | NOT, qName: String): NxFieldSelectionInfo = {
    val __obj = js.Dynamic.literal(qFieldSelectionmode = qFieldSelectionmode.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxFieldSelectionInfo]
  }
  
  @scala.inline
  implicit class NxFieldSelectionInfoMutableBuilder[Self <: NxFieldSelectionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQFieldSelectionmode(value: NORMAL | AND | NOT): Self = StObject.set(x, "qFieldSelectionmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
  }
}
