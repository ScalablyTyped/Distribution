package typings.protractor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JvmArgs extends StObject {
  
  /**
    * Additional command line options to pass to selenium. For example,
    * if you need to change the browser timeout, use
    * seleniumArgs: ['-browserTimeout=60']
    */
  var args: js.UndefOr[Any] = js.undefined
  
  /**
    * Additional command line jvm options to pass to selenium. For example,
    * if you need to change the browser driver, use
    * jvmArgs: ['-Dwebdriver.ie.driver=IEDriverServer_Win32_2.53.1.exe']
    */
  var jvmArgs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The port to start the Selenium Server on, or null if the server should
    * find its own unused port.
    */
  var port: js.UndefOr[Any] = js.undefined
}
object JvmArgs {
  
  inline def apply(): JvmArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JvmArgs]
  }
  
  extension [Self <: JvmArgs](x: Self) {
    
    inline def setArgs(value: Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setJvmArgs(value: js.Array[String]): Self = StObject.set(x, "jvmArgs", value.asInstanceOf[js.Any])
    
    inline def setJvmArgsUndefined: Self = StObject.set(x, "jvmArgs", js.undefined)
    
    inline def setJvmArgsVarargs(value: String*): Self = StObject.set(x, "jvmArgs", js.Array(value*))
    
    inline def setPort(value: Any): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
