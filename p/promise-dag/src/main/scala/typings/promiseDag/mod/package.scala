package typings.promiseDag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Run_[P /* <: js.Thenable[_] */] = js.Function2[
    /* steps */ org.scalablytyped.runtime.StringDictionary[js.Array[typings.promiseDag.mod.Step]], 
    /* required */ js.UndefOr[js.Array[java.lang.String]], 
    org.scalablytyped.runtime.StringDictionary[P]
  ]
  
  type Step = java.lang.String | (js.Function1[/* repeated */ js.Any, js.Thenable[js.Any]])
}
