package typings.rcFieldForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fieldMod {
  
  type ChildProps = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ShouldUpdate[Values] = scala.Boolean | (js.Function3[
    /* prevValues */ Values, 
    /* nextValues */ Values, 
    /* info */ typings.rcFieldForm.anon.Source, 
    scala.Boolean
  ])
}
