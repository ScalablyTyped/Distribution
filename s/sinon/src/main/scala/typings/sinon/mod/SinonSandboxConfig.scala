package typings.sinon.mod

import typings.sinon.anon.PartialSinonFakeTimersCon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SinonSandboxConfig extends StObject {
  
  /**
    * The sandbox’s methods can be injected into another object for convenience.
    * The injectInto configuration option can name an object to add properties to.
    */
  var injectInto: js.Object | Null
  
  /**
    * What properties to inject.
    * Note that simply naming “server” here is not sufficient to have a server property show up in the target object,
    * you also have to set useFakeServer to true.
    */
  var properties: js.Array[String]
  
  /**
    * If true, server and requests properties are added to the sandbox. Can also be an object to use for fake server.
    * The default one is sinon.fakeServer, but if you’re using jQuery 1.3.x or some other library that does not set the XHR’s onreadystatechange handler,
    * you might want to do:
    */
  var useFakeServer: Boolean | SinonFakeServer
  
  /**
    * If set to true, the sandbox will have a clock property.
    * You can optionally pass in a configuration object that follows the specification for fake timers, such as { toFake: ["setTimeout", "setInterval"] }.
    */
  var useFakeTimers: Boolean | PartialSinonFakeTimersCon
}
object SinonSandboxConfig {
  
  inline def apply(
    properties: js.Array[String],
    useFakeServer: Boolean | SinonFakeServer,
    useFakeTimers: Boolean | PartialSinonFakeTimersCon
  ): SinonSandboxConfig = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], useFakeServer = useFakeServer.asInstanceOf[js.Any], useFakeTimers = useFakeTimers.asInstanceOf[js.Any], injectInto = null)
    __obj.asInstanceOf[SinonSandboxConfig]
  }
  
  extension [Self <: SinonSandboxConfig](x: Self) {
    
    inline def setInjectInto(value: js.Object): Self = StObject.set(x, "injectInto", value.asInstanceOf[js.Any])
    
    inline def setInjectIntoNull: Self = StObject.set(x, "injectInto", null)
    
    inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    inline def setUseFakeServer(value: Boolean | SinonFakeServer): Self = StObject.set(x, "useFakeServer", value.asInstanceOf[js.Any])
    
    inline def setUseFakeTimers(value: Boolean | PartialSinonFakeTimersCon): Self = StObject.set(x, "useFakeTimers", value.asInstanceOf[js.Any])
  }
}
