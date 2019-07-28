package typings.promiseDashDag

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promiseDashDagMod {
  type Run[P /* <: js.Thenable[_] */] = js.Function2[
    /* steps */ StringDictionary[js.Array[Step]], 
    /* required */ js.UndefOr[js.Array[String]], 
    StringDictionary[P]
  ]
  type Step = String | (js.Function1[/* repeated */ js.Any, js.Thenable[js.Any]])
}
