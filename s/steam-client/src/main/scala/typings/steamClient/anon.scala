package typings.steamClient

import typings.steamClient.mod.CMsgProtoBufHeader
import typings.steamClient.mod.EMsg
import typings.steamClient.steamClientBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Msg extends StObject {
    
    /**
      * A value from EMsg
      */
    var msg: EMsg = js.native
    
    /**
      * A CMsgProtoBufHeader object if this message is protobuf-backed, otherwise header.proto is falsy.
      */
    var proto: js.UndefOr[CMsgProtoBufHeader | `false`] = js.native
  }
  object Msg {
    
    @scala.inline
    def apply(msg: EMsg): Msg = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Msg]
    }
    
    @scala.inline
    implicit class MsgMutableBuilder[Self <: Msg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMsg(value: EMsg): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProto(value: CMsgProtoBufHeader | `false`): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtoUndefined: Self = StObject.set(x, "proto", js.undefined)
    }
  }
}
