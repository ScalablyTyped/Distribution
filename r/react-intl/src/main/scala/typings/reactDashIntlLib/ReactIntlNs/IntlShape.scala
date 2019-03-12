package typings
package reactDashIntlLib.ReactIntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntlShape
  extends propDashTypesLib.propDashTypesMod.Requireable[js.Any]
     with IntlConfig
     with IntlFormat {
  @JSName("now")
  var now_Original: reactLib.reactMod.ReactNs.Requireable[_] = js.native
  def now(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}

