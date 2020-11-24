package typings.ravenJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type RavenCallback = js.Function2[
    /* data */ js.Any, 
    /* orig */ js.UndefOr[js.Function1[/* data */ js.Any, js.Any]], 
    js.Any | scala.Unit
  ]
  
  type RavenPlugin = js.Function2[
    /* raven */ typings.ravenJs.mod.RavenStatic, 
    /* repeated */ js.Any, 
    typings.ravenJs.mod.RavenStatic
  ]
}
