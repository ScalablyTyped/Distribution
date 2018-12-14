package typings
package promiseDashDagLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promiseDashDagMod {
  type Run[P /* <: js.Thenable[_] */] = js.Function2[
    /* steps */ org.scalablytyped.runtime.StringDictionary[js.Array[Step]], 
    /* required */ js.UndefOr[js.Array[java.lang.String]], 
    org.scalablytyped.runtime.StringDictionary[P]
  ]
  type Step = java.lang.String | (js.Function1[/* repeated */js.Any, js.Thenable[js.Any]])
}
