package typings.qlik.mod

import typings.qlik.qlikStrings.AND
import typings.qlik.qlikStrings.NORMAL
import typings.qlik.qlikStrings.NOT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxFieldSelectionInfo extends StObject {
  
  var qFieldSelectionmode: NORMAL | AND | NOT
  
  var qName: String
}
object NxFieldSelectionInfo {
  
  inline def apply(qFieldSelectionmode: NORMAL | AND | NOT, qName: String): NxFieldSelectionInfo = {
    val __obj = js.Dynamic.literal(qFieldSelectionmode = qFieldSelectionmode.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxFieldSelectionInfo]
  }
  
  extension [Self <: NxFieldSelectionInfo](x: Self) {
    
    inline def setQFieldSelectionmode(value: NORMAL | AND | NOT): Self = StObject.set(x, "qFieldSelectionmode", value.asInstanceOf[js.Any])
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
  }
}
