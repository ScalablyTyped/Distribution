package typings
package slateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object slateMod {
  /* Rewritten from type alias, can be one of: 
    - Document[org.scalablytyped.runtime.StringDictionary[js.Any]]
    - Block
    - Inline
    - Text
  */
  type Node = _Node | Document[org.scalablytyped.runtime.StringDictionary[js.Any]]
  type Path = immutableLib.immutableMod.List[scala.Double] | java.lang.String | scala.Double
  type resetMemoization = js.Function0[scala.Unit]
  type useMemoization = js.Function0[scala.Unit]
}
