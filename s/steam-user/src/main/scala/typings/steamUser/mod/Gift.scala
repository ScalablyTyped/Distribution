package typings.steamUser.mod

import typings.steamUser.steamUserStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gift extends StObject {
  
  // appears to always be null
  var RecipientAddress: _empty
  
  // appears to alway be ''
  var SenderAddress: _empty
  
  // appears to alway be ''
  var SenderName: String
  
  var TimeAcked: js.Date
  
  var TimeCreated: js.Date
  
  var TimeExpiration: js.Date
  
  var TimeRedeemed: Null
  
  var TimeSent: js.Date
  
  var gid: String
  
  var packageid: Double
}
object Gift {
  
  inline def apply(
    SenderName: String,
    TimeAcked: js.Date,
    TimeCreated: js.Date,
    TimeExpiration: js.Date,
    TimeRedeemed: Null,
    TimeSent: js.Date,
    gid: String,
    packageid: Double
  ): Gift = {
    val __obj = js.Dynamic.literal(RecipientAddress = "", SenderAddress = "", SenderName = SenderName.asInstanceOf[js.Any], TimeAcked = TimeAcked.asInstanceOf[js.Any], TimeCreated = TimeCreated.asInstanceOf[js.Any], TimeExpiration = TimeExpiration.asInstanceOf[js.Any], TimeRedeemed = TimeRedeemed.asInstanceOf[js.Any], TimeSent = TimeSent.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], packageid = packageid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gift]
  }
  
  extension [Self <: Gift](x: Self) {
    
    inline def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setPackageid(value: Double): Self = StObject.set(x, "packageid", value.asInstanceOf[js.Any])
    
    inline def setRecipientAddress(value: _empty): Self = StObject.set(x, "RecipientAddress", value.asInstanceOf[js.Any])
    
    inline def setSenderAddress(value: _empty): Self = StObject.set(x, "SenderAddress", value.asInstanceOf[js.Any])
    
    inline def setSenderName(value: String): Self = StObject.set(x, "SenderName", value.asInstanceOf[js.Any])
    
    inline def setTimeAcked(value: js.Date): Self = StObject.set(x, "TimeAcked", value.asInstanceOf[js.Any])
    
    inline def setTimeCreated(value: js.Date): Self = StObject.set(x, "TimeCreated", value.asInstanceOf[js.Any])
    
    inline def setTimeExpiration(value: js.Date): Self = StObject.set(x, "TimeExpiration", value.asInstanceOf[js.Any])
    
    inline def setTimeRedeemed(value: Null): Self = StObject.set(x, "TimeRedeemed", value.asInstanceOf[js.Any])
    
    inline def setTimeSent(value: js.Date): Self = StObject.set(x, "TimeSent", value.asInstanceOf[js.Any])
  }
}
