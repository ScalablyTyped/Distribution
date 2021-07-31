package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GHO2 extends StObject {
  
  var GHO2: `12`
  
  var GO: Damage
  
  var XGHO2: `13`
}
object GHO2 {
  
  @scala.inline
  def apply(GHO2: `12`, GO: Damage, XGHO2: `13`): GHO2 = {
    val __obj = js.Dynamic.literal(GHO2 = GHO2.asInstanceOf[js.Any], GO = GO.asInstanceOf[js.Any], XGHO2 = XGHO2.asInstanceOf[js.Any])
    __obj.asInstanceOf[GHO2]
  }
  
  @scala.inline
  implicit class GHO2MutableBuilder[Self <: GHO2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGHO2(value: `12`): Self = StObject.set(x, "GHO2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGO(value: Damage): Self = StObject.set(x, "GO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXGHO2(value: `13`): Self = StObject.set(x, "XGHO2", value.asInstanceOf[js.Any])
  }
}
