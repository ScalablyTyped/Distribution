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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofremote extends StObject {
  
  var DriverService: (Instantiable2[
    /* executable */ String, 
    /* options */ ServiceOptions, 
    typings.seleniumWebdriver.remoteMod.DriverService
  ]) with TypeofDriverService = js.native
  
  var FileDetector: Instantiable0[typings.seleniumWebdriver.remoteMod.FileDetector] = js.native
  
  var SeleniumServer: Instantiable1[/* jar */ String, typings.seleniumWebdriver.remoteMod.SeleniumServer] = js.native
}
object Typeofremote {
  
  @scala.inline
  def apply(
    DriverService: (Instantiable2[/* executable */ String, /* options */ ServiceOptions, DriverService]) with TypeofDriverService,
    FileDetector: Instantiable0[FileDetector],
    SeleniumServer: Instantiable1[/* jar */ String, SeleniumServer]
  ): Typeofremote = {
    val __obj = js.Dynamic.literal(DriverService = DriverService.asInstanceOf[js.Any], FileDetector = FileDetector.asInstanceOf[js.Any], SeleniumServer = SeleniumServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofremote]
  }
  
  @scala.inline
  implicit class TypeofremoteMutableBuilder[Self <: Typeofremote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriverService(
      value: (Instantiable2[/* executable */ String, /* options */ ServiceOptions, DriverService]) with TypeofDriverService
    ): Self = StObject.set(x, "DriverService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileDetector(value: Instantiable0[FileDetector]): Self = StObject.set(x, "FileDetector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeleniumServer(value: Instantiable1[/* jar */ String, SeleniumServer]): Self = StObject.set(x, "SeleniumServer", value.asInstanceOf[js.Any])
  }
}
