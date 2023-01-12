package typings.spdxCorrect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Upgrade extends StObject {
    
    var upgrade: Boolean
  }
  object Upgrade {
    
    inline def apply(upgrade: Boolean): Upgrade = {
      val __obj = js.Dynamic.literal(upgrade = upgrade.asInstanceOf[js.Any])
      __obj.asInstanceOf[Upgrade]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Upgrade] (val x: Self) extends AnyVal {
      
      inline def setUpgrade(value: Boolean): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
    }
  }
}
