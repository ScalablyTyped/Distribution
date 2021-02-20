package typings.senchaTouch.Ext.fx

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnimation extends IBase {
  
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.native
}
object IAnimation {
  
  @scala.inline
  def apply(): IAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnimation]
  }
  
  @scala.inline
  implicit class IAnimationMutableBuilder[Self <: IAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
