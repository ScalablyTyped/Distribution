package typings.protractor.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.seleniumWebdriver.remoteMod.DriverService
import typings.seleniumWebdriver.remoteMod.FileDetector
import typings.seleniumWebdriver.remoteMod.SeleniumServer
import typings.seleniumWebdriver.remoteMod.ServiceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofremote extends StObject {
  
  var DriverService: Instantiable2[
    /* executable */ String, 
    /* options */ ServiceOptions, 
    typings.seleniumWebdriver.remoteMod.DriverService
  ]
  
  var FileDetector: Instantiable0[typings.seleniumWebdriver.remoteMod.FileDetector]
  
  var SeleniumServer: Instantiable1[/* jar */ String, typings.seleniumWebdriver.remoteMod.SeleniumServer]
}
object Typeofremote {
  
  inline def apply(
    DriverService: Instantiable2[/* executable */ String, /* options */ ServiceOptions, DriverService],
    FileDetector: Instantiable0[FileDetector],
    SeleniumServer: Instantiable1[/* jar */ String, SeleniumServer]
  ): Typeofremote = {
    val __obj = js.Dynamic.literal(DriverService = DriverService.asInstanceOf[js.Any], FileDetector = FileDetector.asInstanceOf[js.Any], SeleniumServer = SeleniumServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofremote]
  }
  
  extension [Self <: Typeofremote](x: Self) {
    
    inline def setDriverService(value: Instantiable2[/* executable */ String, /* options */ ServiceOptions, DriverService]): Self = StObject.set(x, "DriverService", value.asInstanceOf[js.Any])
    
    inline def setFileDetector(value: Instantiable0[FileDetector]): Self = StObject.set(x, "FileDetector", value.asInstanceOf[js.Any])
    
    inline def setSeleniumServer(value: Instantiable1[/* jar */ String, SeleniumServer]): Self = StObject.set(x, "SeleniumServer", value.asInstanceOf[js.Any])
  }
}
