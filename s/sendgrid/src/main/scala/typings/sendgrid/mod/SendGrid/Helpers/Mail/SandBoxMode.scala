package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.anon.EnableBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SandBoxMode extends StObject {
  
  def getEnable(): Boolean
  
  def setEnable(enabled: Boolean): Unit
  
  def toJSON(): EnableBoolean
}
object SandBoxMode {
  
  @scala.inline
  def apply(getEnable: () => Boolean, setEnable: Boolean => Unit, toJSON: () => EnableBoolean): SandBoxMode = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), setEnable = js.Any.fromFunction1(setEnable), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[SandBoxMode]
  }
  
  @scala.inline
  implicit class SandBoxModeMutableBuilder[Self <: SandBoxMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEnable(value: () => Boolean): Self = StObject.set(x, "getEnable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetEnable(value: Boolean => Unit): Self = StObject.set(x, "setEnable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => EnableBoolean): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
