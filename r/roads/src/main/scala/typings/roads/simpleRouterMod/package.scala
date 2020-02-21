package typings.roads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object simpleRouterMod {
  type Route = js.ThisFunction4[
    /* this */ typings.roads.roadMod.Context, 
    /* path */ java.lang.String, 
    /* body */ java.lang.String, 
    /* headers */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* next */ typings.roads.roadMod.ResponseMiddleware, 
    js.Promise[typings.roads.responseMod.default]
  ]
}
