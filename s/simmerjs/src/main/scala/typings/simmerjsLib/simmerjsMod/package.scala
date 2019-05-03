package typings
package simmerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object simmerjsMod {
  type QueryEngine = js.Function2[
    /* selector */ java.lang.String, 
    /* onError */ js.Function1[/* error */ js.Any, scala.Unit], 
    stdLib.ArrayLike[stdLib.Element]
  ]
}
