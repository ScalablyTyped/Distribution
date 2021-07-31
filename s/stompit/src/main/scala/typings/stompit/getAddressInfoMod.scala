package typings.stompit

import typings.stompit.connectMod.ConnectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAddressInfoMod {
  
  @scala.inline
  def apply(args: ConnectOptions): AddressInfo = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[AddressInfo]
  
  @JSImport("stompit/lib/connect-failover/getAddressInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AddressInfo extends StObject {
    
    var connectArgs: ConnectOptions
    
    var host: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var pseudoUri: String
    
    var transport: String
    
    var transportPath: String
  }
  object AddressInfo {
    
    @scala.inline
    def apply(connectArgs: ConnectOptions, pseudoUri: String, transport: String, transportPath: String): AddressInfo = {
      val __obj = js.Dynamic.literal(connectArgs = connectArgs.asInstanceOf[js.Any], pseudoUri = pseudoUri.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any], transportPath = transportPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressInfo]
    }
    
    @scala.inline
    implicit class AddressInfoMutableBuilder[Self <: AddressInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectArgs(value: ConnectOptions): Self = StObject.set(x, "connectArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPseudoUri(value: String): Self = StObject.set(x, "pseudoUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportPath(value: String): Self = StObject.set(x, "transportPath", value.asInstanceOf[js.Any])
    }
  }
}
