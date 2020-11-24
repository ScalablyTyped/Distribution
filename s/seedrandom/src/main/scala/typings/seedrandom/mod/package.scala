package typings.seedrandom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type State = js.Object
  
  type seedrandomCallback = js.Function4[
    /* prng */ js.UndefOr[typings.seedrandom.mod.prng], 
    /* shortseed */ js.UndefOr[java.lang.String], 
    /* global */ js.UndefOr[scala.Boolean], 
    /* state */ js.UndefOr[typings.seedrandom.mod.State], 
    typings.seedrandom.mod.prng
  ]
}
