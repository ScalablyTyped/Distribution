package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.tr_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait TROpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_TROpenToken: tr_open
}
object TROpenToken {
  
  @scala.inline
  def apply(level: Double): TROpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("tr_open")
    __obj.asInstanceOf[TROpenToken]
  }
  
  @scala.inline
  implicit class TROpenTokenMutableBuilder[Self <: TROpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: tr_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
