package typings
package snappyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object snappyMod {
  type booleanCallback = js.Function2[/* err */ nodeLib.Error | scala.Null, /* data */ scala.Boolean, scala.Unit]
  type bufferCallback = js.Function2[/* err */ nodeLib.Error | scala.Null, /* data */ nodeLib.Buffer, scala.Unit]
  type bufferOrStringCallback = js.Function2[
    /* err */ nodeLib.Error | scala.Null, 
    /* data */ nodeLib.Buffer | java.lang.String, 
    scala.Unit
  ]
}
