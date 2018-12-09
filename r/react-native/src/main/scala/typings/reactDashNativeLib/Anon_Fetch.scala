package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Fetch extends js.Object {
  /**
           * eventName is expected to be `change`(deprecated) or `connectionChange`
           */
  var addEventListener: js.Function2[
    /* eventName */ java.lang.String, 
    /* listener */ js.Function1[/* result */ scala.Boolean, scala.Unit], 
    scala.Unit
  ]
  var fetch: js.Function0[js.Promise[scala.Boolean]]
  /**
           * eventName is expected to be `change`(deprecated) or `connectionChange`
           */
  var removeEventListener: js.Function2[
    /* eventName */ java.lang.String, 
    /* listener */ js.Function1[/* result */ scala.Boolean, scala.Unit], 
    scala.Unit
  ]
}

