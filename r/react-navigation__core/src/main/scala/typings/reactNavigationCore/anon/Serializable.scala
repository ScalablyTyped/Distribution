package typings.reactNavigationCore.anon

import typings.reactNavigationCore.reactNavigationCoreBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Serializable extends StObject {
  
  var serializable: `true`
}
object Serializable {
  
  inline def apply(): Serializable = {
    val __obj = js.Dynamic.literal(serializable = true)
    __obj.asInstanceOf[Serializable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Serializable] (val x: Self) extends AnyVal {
    
    inline def setSerializable(value: `true`): Self = StObject.set(x, "serializable", value.asInstanceOf[js.Any])
  }
}
