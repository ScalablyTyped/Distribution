package typings
package pusherDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Authorize extends js.Object {
  var authorize: js.Function2[
    /* socketId */ java.lang.String, 
    /* callback */ js.Function2[
      /* errored */ scala.Boolean, 
      /* authInfo */ js.UndefOr[pusherDashJsLib.pusherDashJsMod.pusherNs.AuthInfo], 
      scala.Unit
    ], 
    scala.Unit
  ]
}

