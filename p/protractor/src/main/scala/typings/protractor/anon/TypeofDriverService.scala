package typings.protractor.anon

import org.scalablytyped.runtime.Instantiable1
import typings.seleniumWebdriver.remoteMod.DriverService.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDriverService extends StObject {
  
  /**
    * Creates {@link DriverService} objects that manage a WebDriver server in a
    * child process.
    */
  var Builder: Instantiable1[/* exe */ String, typings.seleniumWebdriver.remoteMod.DriverService.Builder]
}
object TypeofDriverService {
  
  @scala.inline
  def apply(Builder: Instantiable1[/* exe */ String, Builder]): TypeofDriverService = {
    val __obj = js.Dynamic.literal(Builder = Builder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDriverService]
  }
  
  @scala.inline
  implicit class TypeofDriverServiceMutableBuilder[Self <: TypeofDriverService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuilder(value: Instantiable1[/* exe */ String, Builder]): Self = StObject.set(x, "Builder", value.asInstanceOf[js.Any])
  }
}
