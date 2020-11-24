package typings.riot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ComponentEnhancer = js.Function1[
    /* component */ typings.riot.mod.RiotComponent[js.Any, js.Any], 
    typings.riot.mod.RiotComponent[js.Any, js.Any]
  ]
  
  type InstalledPluginsSet = typings.std.Set[typings.riot.mod.ComponentEnhancer]
  
  type PureComponentFactoryFunction[InitialProps, Context] = js.Function1[
    /* hasSlotsAttributesProps */ typings.riot.anon.Attributes[InitialProps], 
    typings.riot.mod.RiotPureComponent[Context]
  ]
  
  type RegisteredComponentsMap = typings.std.Map[
    java.lang.String, 
    js.Function0[typings.riot.mod.RiotComponent[js.Object, js.Object]]
  ]
}
