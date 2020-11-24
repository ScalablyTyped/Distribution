package typings.rrc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ComponentConstructor[Props] = typings.react.mod.ComponentType[Props]
  
  type GetKeyFunction[Params] = js.Function3[
    /* match */ typings.reactRouter.mod.`match`[Params], 
    /* route */ typings.rrc.mod.RouteConfiguration, 
    /* location */ typings.history.mod.Location[typings.history.mod.LocationState], 
    java.lang.String
  ]
  
  type IsActiveCallback = js.Function0[scala.Boolean]
  
  type OnUpdateCall = js.Function1[
    /* location */ typings.history.mod.Location[typings.history.mod.LocationState], 
    scala.Unit
  ]
  
  type PropIdCallback = js.Function0[java.lang.String]
  
  type WhenActiveReturnType[Props] = js.Function1[
    /* component */ typings.rrc.mod.ComponentConstructor[Props], 
    typings.rrc.mod.ComponentConstructor[Props]
  ]
}
