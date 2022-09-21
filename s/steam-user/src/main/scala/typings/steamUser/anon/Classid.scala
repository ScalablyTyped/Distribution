package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classid extends StObject {
  
  var classid: Double
  
  var instanceid: js.UndefOr[Double] = js.undefined
}
object Classid {
  
  inline def apply(classid: Double): Classid = {
    val __obj = js.Dynamic.literal(classid = classid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classid]
  }
  
  extension [Self <: Classid](x: Self) {
    
    inline def setClassid(value: Double): Self = StObject.set(x, "classid", value.asInstanceOf[js.Any])
    
    inline def setInstanceid(value: Double): Self = StObject.set(x, "instanceid", value.asInstanceOf[js.Any])
    
    inline def setInstanceidUndefined: Self = StObject.set(x, "instanceid", js.undefined)
  }
}
