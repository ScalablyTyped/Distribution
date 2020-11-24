package typings.reactNativePermissions.resultsMod

import typings.reactNativePermissions.reactNativePermissionsStrings.blocked
import typings.reactNativePermissions.reactNativePermissionsStrings.denied
import typings.reactNativePermissions.reactNativePermissionsStrings.granted
import typings.reactNativePermissions.reactNativePermissionsStrings.limited
import typings.reactNativePermissions.reactNativePermissionsStrings.unavailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{ readonly UNAVAILABLE :'unavailable',  readonly BLOCKED :'blocked',  readonly DENIED :'denied',  readonly GRANTED :'granted',  readonly LIMITED :'limited'}> */
@js.native
trait ResultMap extends js.Object {
  
  val BLOCKED: blocked = js.native
  
  val DENIED: denied = js.native
  
  val GRANTED: granted = js.native
  
  val LIMITED: limited = js.native
  
  val UNAVAILABLE: unavailable = js.native
}
object ResultMap {
  
  @scala.inline
  def apply(BLOCKED: blocked, DENIED: denied, GRANTED: granted, LIMITED: limited, UNAVAILABLE: unavailable): ResultMap = {
    val __obj = js.Dynamic.literal(BLOCKED = BLOCKED.asInstanceOf[js.Any], DENIED = DENIED.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any], LIMITED = LIMITED.asInstanceOf[js.Any], UNAVAILABLE = UNAVAILABLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultMap]
  }
  
  @scala.inline
  implicit class ResultMapOps[Self <: ResultMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBLOCKED(value: blocked): Self = this.set("BLOCKED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDENIED(value: denied): Self = this.set("DENIED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGRANTED(value: granted): Self = this.set("GRANTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLIMITED(value: limited): Self = this.set("LIMITED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNAVAILABLE(value: unavailable): Self = this.set("UNAVAILABLE", value.asInstanceOf[js.Any])
  }
}
