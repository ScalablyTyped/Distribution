package typings
package sammyLib.SammyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLocationProxy
  extends ScalablyTyped.runtime.Instantiable1[/* app */ js.Any, DataLocationProxy]
     with ScalablyTyped.runtime.Instantiable2[/* app */ js.Any, /* run_interval_every */ js.Any, DataLocationProxy]
     with ScalablyTyped.runtime.Instantiable3[
      /* app */ js.Any, 
      /* data_name */ js.Any, 
      /* href_attribute */ js.Any, 
      DataLocationProxy
    ] {
  def _startPolling(every: scala.Double): scala.Unit = js.native
  def bind(): scala.Unit = js.native
  def fullPath(location_obj: js.Any): java.lang.String = js.native
  def setLocation(new_location: java.lang.String): java.lang.String = js.native
  def unbind(): scala.Unit = js.native
}

