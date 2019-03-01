package typings
package socketDotIoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Except extends js.Object {
  var except: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var flags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  var rooms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Except {
  @scala.inline
  def apply(
    except: js.Array[java.lang.String] = null,
    flags: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    rooms: js.Array[java.lang.String] = null
  ): Anon_Except = {
    val __obj = js.Dynamic.literal()
    if (except != null) __obj.updateDynamic("except")(except)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (rooms != null) __obj.updateDynamic("rooms")(rooms)
    __obj.asInstanceOf[Anon_Except]
  }
}

