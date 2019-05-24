package typings
package sqlDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqlDotJsMod {
  type ParamsCallback = js.Function1[/* obj */ ParamsObject, scala.Unit]
  type ParamsObject = stdLib.Record[java.lang.String, ValueType]
  type ValueType = scala.Double | java.lang.String | stdLib.Uint8Array
}
