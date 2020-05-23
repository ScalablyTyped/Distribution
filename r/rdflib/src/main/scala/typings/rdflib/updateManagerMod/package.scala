package typings.rdflib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object updateManagerMod {
  type CallBackFunction = js.Function4[
    /* uri */ java.lang.String, 
    /* ok */ scala.Boolean, 
    /* message */ java.lang.String, 
    /* response */ typings.std.Error | typings.std.Response, 
    js.Object | scala.Unit
  ]
}
