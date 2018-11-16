package typings
package reactDashAdalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashAdalMod {
  type LoggingLevel = reactDashAdalLib.reactDashAdalLibNumbers.`0` | reactDashAdalLib.reactDashAdalLibNumbers.`1` | reactDashAdalLib.reactDashAdalLibNumbers.`2` | reactDashAdalLib.reactDashAdalLibNumbers.`3`
  type RequestType = reactDashAdalLib.reactDashAdalLibStrings.LOGIN | reactDashAdalLib.reactDashAdalLibStrings.RENEW_TOKEN | reactDashAdalLib.reactDashAdalLibStrings.UNKNOWN
  type ResponseType = (reactDashAdalLib.reactDashAdalLibStrings.`id_token token`) | reactDashAdalLib.reactDashAdalLibStrings.token
  type TokenCallback = js.Function3[
    /* errorDesc */ java.lang.String | scala.Null, 
    /* token */ java.lang.String | scala.Null, 
    /* error */ js.Any, 
    scala.Unit
  ]
  type UserCallback = js.Function2[
    /* errorDesc */ java.lang.String | scala.Null, 
    /* user */ UserInfo | scala.Null, 
    scala.Unit
  ]
}
