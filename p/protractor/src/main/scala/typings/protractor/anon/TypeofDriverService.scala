package typings.protractor.anon

import org.scalablytyped.runtime.Instantiable1
import typings.seleniumWebdriver.remoteMod.DriverService.Builder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofDriverService extends js.Object {
  /**
    * Creates {@link DriverService} objects that manage a WebDriver server in a
    * child process.
    */
  var Builder: Instantiable1[/* exe */ String, typings.seleniumWebdriver.remoteMod.DriverService.Builder] = js.native
}

object TypeofDriverService {
  @scala.inline
  def apply(Builder: Instantiable1[/* exe */ String, Builder]): TypeofDriverService = {
    val __obj = js.Dynamic.literal(Builder = Builder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDriverService]
  }
  @scala.inline
  implicit class TypeofDriverServiceOps[Self <: TypeofDriverService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuilder(value: Instantiable1[/* exe */ String, Builder]): Self = this.set("Builder", value.asInstanceOf[js.Any])
  }
  
}

