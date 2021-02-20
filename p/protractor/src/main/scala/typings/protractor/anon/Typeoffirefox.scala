package typings.protractor.anon

import org.scalablytyped.runtime.Instantiable0
import typings.seleniumWebdriver.remoteMod.DriverService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoffirefox extends StObject {
  
  var Driver: TypeofDriver = js.native
  
  var Options: Instantiable0[typings.seleniumWebdriver.firefoxMod.Options] = js.native
  
  var ServiceBuilder: Instantiable0[typings.seleniumWebdriver.firefoxMod.ServiceBuilder] = js.native
  
  def createWiresService(binary: String): DriverService = js.native
  def createWiresService(binary: js.Any): DriverService = js.native
  
  def findWires(): String = js.native
  
  def prepareProfile(profile: String, port: Double): js.Any = js.native
  def prepareProfile(profile: js.Any, port: Double): js.Any = js.native
}
