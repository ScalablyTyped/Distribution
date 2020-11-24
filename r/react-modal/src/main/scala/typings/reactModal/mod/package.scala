package typings.reactModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /** Describes unction that will be run after the modal has opened */
  type OnAfterOpenCallback = js.Function1[
    /* obj */ js.UndefOr[typings.reactModal.mod.OnAfterOpenCallbackOptions], 
    scala.Unit
  ]
}
