package typings.protractor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JvmArgs extends StObject {
  
  /**
    * Additional command line options to pass to selenium. For example,
    * if you need to change the browser timeout, use
    * seleniumArgs: ['-browserTimeout=60']
    */
  var args: js.UndefOr[js.Any] = js.native
  
  /**
    * Additional command line jvm options to pass to selenium. For example,
    * if you need to change the browser driver, use
    * jvmArgs: ['-Dwebdriver.ie.driver=IEDriverServer_Win32_2.53.1.exe']
    */
  var jvmArgs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The port to start the Selenium Server on, or null if the server should
    * find its own unused port.
    */
  var port: js.UndefOr[js.Any] = js.native
}
object JvmArgs {
  
  @scala.inline
  def apply(): JvmArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JvmArgs]
  }
  
  @scala.inline
  implicit class JvmArgsMutableBuilder[Self <: JvmArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setJvmArgs(value: js.Array[String]): Self = StObject.set(x, "jvmArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJvmArgsUndefined: Self = StObject.set(x, "jvmArgs", js.undefined)
    
    @scala.inline
    def setJvmArgsVarargs(value: String*): Self = StObject.set(x, "jvmArgs", js.Array(value :_*))
    
    @scala.inline
    def setPort(value: js.Any): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
