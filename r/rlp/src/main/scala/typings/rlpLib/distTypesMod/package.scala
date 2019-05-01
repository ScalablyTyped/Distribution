package typings
package rlpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  /* Rewritten from type alias, can be one of: 
    - nodeLib.Buffer
    - java.lang.String
    - scala.Double
    - stdLib.Uint8Array
    - bnDotJsLib.bnDotJsMod.^
    - Dictionary
    - List
    - scala.Null
  */
  type Input = _Input | nodeLib.Buffer | java.lang.String | scala.Double | stdLib.Uint8Array | bnDotJsLib.bnDotJsMod.^  | scala.Null
}
