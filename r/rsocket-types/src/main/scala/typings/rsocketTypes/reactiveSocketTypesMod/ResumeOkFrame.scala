package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0`
import typings.rsocketTypes.rsocketTypesNumbers.`0x0e`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResumeOkFrame extends Frame {
  
  var clientPosition: Double = js.native
  
  var flags: Double = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var streamId: `0` = js.native
  
  var `type`: `0x0e` = js.native
}
object ResumeOkFrame {
  
  @scala.inline
  def apply(clientPosition: Double, flags: Double, streamId: `0`, `type`: `0x0e`): ResumeOkFrame = {
    val __obj = js.Dynamic.literal(clientPosition = clientPosition.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeOkFrame]
  }
  
  @scala.inline
  implicit class ResumeOkFrameMutableBuilder[Self <: ResumeOkFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientPosition(value: Double): Self = StObject.set(x, "clientPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setStreamId(value: `0`): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `0x0e`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
