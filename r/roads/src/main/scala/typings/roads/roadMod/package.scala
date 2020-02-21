package typings.roads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object roadMod {
  type Middleware = js.ThisFunction5[
    /* this */ typings.roads.roadMod.Context, 
    /* method */ java.lang.String, 
    /* path */ java.lang.String, 
    /* body */ java.lang.String, 
    /* headers */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* next */ typings.roads.roadMod.ResponseMiddleware, 
    js.Promise[typings.roads.responseMod.default]
  ]
  type ResponseMiddleware = js.Function0[js.Promise[typings.roads.responseMod.default]]
}
