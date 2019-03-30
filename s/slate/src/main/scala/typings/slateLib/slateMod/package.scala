package typings
package slateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object slateMod {
  type CommandFunc = js.Function2[/* editor */ Editor, /* repeated */ js.Any, Editor]
  /* Rewritten from type alias, can be one of: 
    - Document[org.scalablytyped.runtime.StringDictionary[js.Any]]
    - Block
    - Inline
    - Text
  */
  type Node = _Node | Document[org.scalablytyped.runtime.StringDictionary[js.Any]]
  type Path = immutableLib.immutableMod.List[scala.Double] | java.lang.String | scala.Double
  type QueryFunc = js.Function2[/* editor */ Editor, /* repeated */ js.Any, js.Any]
  type resetMemoization = js.Function0[scala.Unit]
  type useMemoization = js.Function0[scala.Unit]
}
