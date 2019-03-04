package typings
package reactDashSelectLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsWithStyles extends js.Object {
  /*
    Get the styles of a particular part of the select. Pass in the name of the
    property as the first argument, and the current props as the second argument.
    See the `styles` object for the properties available.
    */
  def getStyles(name: java.lang.String, props: js.Any): js.Object
}

object PropsWithStyles {
  @scala.inline
  def apply(getStyles: js.Function2[java.lang.String, js.Any, js.Object]): PropsWithStyles = {
    val __obj = js.Dynamic.literal(getStyles = getStyles)
  
    __obj.asInstanceOf[PropsWithStyles]
  }
}

