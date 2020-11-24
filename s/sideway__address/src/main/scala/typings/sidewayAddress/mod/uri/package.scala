package typings.sidewayAddress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object uri {
  
  type Options = typings.hapiHoek.mod.ts.XOR[
    typings.sidewayAddress.mod.uri.Options.Options, 
    typings.sidewayAddress.mod.uri.Options.Relative
  ]
}
