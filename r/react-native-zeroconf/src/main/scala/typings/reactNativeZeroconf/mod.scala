package typings.reactNativeZeroconf

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.reactNativeZeroconf.reactNativeZeroconfStrings.error
import typings.reactNativeZeroconf.reactNativeZeroconfStrings.found
import typings.reactNativeZeroconf.reactNativeZeroconfStrings.remove
import typings.reactNativeZeroconf.reactNativeZeroconfStrings.resolved
import typings.reactNativeZeroconf.reactNativeZeroconfStrings.start
import typings.reactNativeZeroconf.reactNativeZeroconfStrings.stop
import typings.reactNativeZeroconf.reactNativeZeroconfStrings.update
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-zeroconf", JSImport.Default)
  @js.native
  class default () extends Zeroconf
  
  trait Service extends StObject {
    
    var addresses: js.Array[String]
    
    var fullName: String
    
    var host: String
    
    var name: String
    
    var port: Double
    
    var txt: StringDictionary[js.Any]
  }
  object Service {
    
    @scala.inline
    def apply(
      addresses: js.Array[String],
      fullName: String,
      host: String,
      name: String,
      port: Double,
      txt: StringDictionary[js.Any]
    ): Service = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], txt = txt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    @scala.inline
    implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value :_*))
      
      @scala.inline
      def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTxt(value: StringDictionary[js.Any]): Self = StObject.set(x, "txt", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Zeroconf extends EventEmitter {
    
    /**
      * Add listeners
      *
      * @description If you cleaned the listeners and need to get them back
      * on.
      */
    def addDeviceListeners(): Unit = js.native
    
    /**
      * Returns resolved services.
      *
      * @description Will return all names of services that have been
      * resolved.
      */
    def getServices(): StringDictionary[Service] = js.native
    
    /**
      * Triggered when an error occurs.
      */
    @JSName("on")
    def on_error(e: error, listener: js.Function1[/* err */ Error, js.Any]): this.type = js.native
    /**
      * @param name Name of the the service.
      */
    @JSName("on")
    def on_found(e: found, listener: js.Function1[/* name */ String, js.Any]): this.type = js.native
    @JSName("on")
    def on_remove(e: remove, listener: js.Function1[/* name */ String, js.Any]): this.type = js.native
    /**
      * Triggered when a service is resolved.
      * @description Broadcast a service object once it is fully resolved.
      */
    @JSName("on")
    def on_resolved(e: resolved, listener: js.Function1[/* service */ Service, js.Any]): this.type = js.native
    @JSName("on")
    def on_start(e: start, listener: js.Function0[js.Any]): this.type = js.native
    @JSName("on")
    def on_stop(e: stop, listener: js.Function0[js.Any]): this.type = js.native
    @JSName("on")
    def on_update(e: update, listener: js.Function0[js.Any]): this.type = js.native
    
    /**
      * Publish a service.
      *
      * @description This adds a service for the current device to the
      * discoverable services on the network.
      *
      * @param type Should be both type of the service, for example 'http'.
      * @param protocol Should be protocol of the service, for example 'tcp'.
      * @param domain Should be the domain the service is sitting on, dot
      * suffixed, for example `'local.'`. Defaults to `'local'`.
      * @param name should be unique to the device, often the device name.
      * @param port should be an integer between 0 and 65535.
      * @param txt contains key-value pairs of additional TXT record data.
      */
    def publishService(`type`: String, protocol: String): Unit = js.native
    def publishService(`type`: String, protocol: String, domain: String): Unit = js.native
    def publishService(`type`: String, protocol: String, domain: String, name: String): Unit = js.native
    def publishService(`type`: String, protocol: String, domain: String, name: String, port: Double): Unit = js.native
    def publishService(
      `type`: String,
      protocol: String,
      domain: String,
      name: String,
      port: Double,
      txt: StringDictionary[js.Any]
    ): Unit = js.native
    def publishService(
      `type`: String,
      protocol: String,
      domain: String,
      name: String,
      port: Unit,
      txt: StringDictionary[js.Any]
    ): Unit = js.native
    def publishService(`type`: String, protocol: String, domain: String, name: Unit, port: Double): Unit = js.native
    def publishService(
      `type`: String,
      protocol: String,
      domain: String,
      name: Unit,
      port: Double,
      txt: StringDictionary[js.Any]
    ): Unit = js.native
    def publishService(
      `type`: String,
      protocol: String,
      domain: String,
      name: Unit,
      port: Unit,
      txt: StringDictionary[js.Any]
    ): Unit = js.native
    def publishService(`type`: String, protocol: String, domain: Unit, name: String): Unit = js.native
    def publishService(`type`: String, protocol: String, domain: Unit, name: String, port: Double): Unit = js.native
    def publishService(
      `type`: String,
      protocol: String,
      domain: Unit,
      name: String,
      port: Double,
      txt: StringDictionary[js.Any]
    ): Unit = js.native
    def publishService(
      `type`: String,
      protocol: String,
      domain: Unit,
      name: String,
      port: Unit,
      txt: StringDictionary[js.Any]
    ): Unit = js.native
    def publishService(`type`: String, protocol: String, domain: Unit, name: Unit, port: Double): Unit = js.native
    def publishService(
      `type`: String,
      protocol: String,
      domain: Unit,
      name: Unit,
      port: Double,
      txt: StringDictionary[js.Any]
    ): Unit = js.native
    def publishService(
      `type`: String,
      protocol: String,
      domain: Unit,
      name: Unit,
      port: Unit,
      txt: StringDictionary[js.Any]
    ): Unit = js.native
    
    /**
      * Remove listeners.
      *
      * @description Allow you to clean the listeners, avoiding potential
      * memory leaks.
      *
      * @see https://github.com/balthazar/react-native-zeroconf/issues/33
      */
    def removeDeviceListeners(): Unit = js.native
    
    /**
      * Start the zeroconf scan.
      *
      * @description This will initialize the scan from the `Zeroconf`
      * instance. Will stop another scan if any is running.
      *
      * @param type Default `http`
      * @param protocol Default `tcp`
      * @param domain Default `local`
      */
    def scan(): Unit = js.native
    def scan(`type`: String): Unit = js.native
    def scan(`type`: String, protocol: String): Unit = js.native
    def scan(`type`: String, protocol: String, domain: String): Unit = js.native
    def scan(`type`: String, protocol: Unit, domain: String): Unit = js.native
    def scan(`type`: Unit, protocol: String): Unit = js.native
    def scan(`type`: Unit, protocol: String, domain: String): Unit = js.native
    def scan(`type`: Unit, protocol: Unit, domain: String): Unit = js.native
    
    /**
      * Stop the scan.
      *
      * @description If any scan is running, stop it. Otherwise do nothing.
      */
    def stop(): Unit = js.native
    
    /**
      * Unpublish a service.
      *
      * @description This removes a service from those discoverable on the
      * network.
      *
      * @param name should be the name used when publishing the service.
      */
    def unpublishService(name: String): Unit = js.native
  }
}
