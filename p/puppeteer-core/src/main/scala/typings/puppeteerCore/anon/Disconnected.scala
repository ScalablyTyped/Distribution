package typings.puppeteerCore.anon

import typings.puppeteerCore.puppeteerCoreStrings.disconnected
import typings.puppeteerCore.puppeteerCoreStrings.targetchanged
import typings.puppeteerCore.puppeteerCoreStrings.targetcreated
import typings.puppeteerCore.puppeteerCoreStrings.targetdestroyed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disconnected extends StObject {
  
  val Disconnected: disconnected
  
  val TargetChanged: targetchanged
  
  val TargetCreated: targetcreated
  
  val TargetDestroyed: targetdestroyed
}
object Disconnected {
  
  inline def apply(): Disconnected = {
    val __obj = js.Dynamic.literal(Disconnected = "disconnected", TargetChanged = "targetchanged", TargetCreated = "targetcreated", TargetDestroyed = "targetdestroyed")
    __obj.asInstanceOf[Disconnected]
  }
  
  extension [Self <: Disconnected](x: Self) {
    
    inline def setDisconnected(value: disconnected): Self = StObject.set(x, "Disconnected", value.asInstanceOf[js.Any])
    
    inline def setTargetChanged(value: targetchanged): Self = StObject.set(x, "TargetChanged", value.asInstanceOf[js.Any])
    
    inline def setTargetCreated(value: targetcreated): Self = StObject.set(x, "TargetCreated", value.asInstanceOf[js.Any])
    
    inline def setTargetDestroyed(value: targetdestroyed): Self = StObject.set(x, "TargetDestroyed", value.asInstanceOf[js.Any])
  }
}
