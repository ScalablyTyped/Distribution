package typings.reactNavigationCore.anon

import typings.reactNavigationCore.reactNavigationCoreBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Serializable extends StObject {
  
  var serializable: `true` = js.native
}
object Serializable {
  
  @scala.inline
  def apply(serializable: `true`): Serializable = {
    val __obj = js.Dynamic.literal(serializable = serializable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serializable]
  }
  
  @scala.inline
  implicit class SerializableMutableBuilder[Self <: Serializable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerializable(value: `true`): Self = StObject.set(x, "serializable", value.asInstanceOf[js.Any])
  }
}
