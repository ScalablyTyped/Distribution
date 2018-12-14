package typings
package ravenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ravenMod {
  type CaptureCallback = js.Function2[
    /* sendErr */ js.UndefOr[nodeLib.Error | scala.Null], 
    /* eventId */ js.Any, 
    scala.Unit
  ]
  type DataCallback = js.Function1[/* data */ org.scalablytyped.runtime.StringDictionary[js.Any], js.Any]
  type FatalErrorCallback = js.Function3[
    /* err */ nodeLib.Error, 
    /* sendErr */ js.UndefOr[nodeLib.Error | scala.Null], 
    /* eventId */ java.lang.String, 
    scala.Unit
  ]
  type ShouldSendCallback = js.Function1[/* data */ org.scalablytyped.runtime.StringDictionary[js.Any], scala.Boolean]
  type parseUserCallback = js.Function1[/* req */ js.Any, js.Any]
}
