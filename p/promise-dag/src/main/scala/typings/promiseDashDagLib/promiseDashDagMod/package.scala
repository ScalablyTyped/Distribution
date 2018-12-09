package typings
package promiseDashDagLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promiseDashDagMod {
  type Run[P /* <: js.Thenable[_] */] = js.Function2[
    /* steps */ ScalablyTyped.runtime.StringDictionary[js.Array[Step]], 
    /* required */ js.UndefOr[js.Array[java.lang.String]], 
    ScalablyTyped.runtime.StringDictionary[P]
  ]
  type Step = java.lang.String | (js.Function1[/* repeated */js.Any, js.Thenable[js.Any]])
}
