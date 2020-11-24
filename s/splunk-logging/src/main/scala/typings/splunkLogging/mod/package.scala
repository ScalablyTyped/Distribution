package typings.splunkLogging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function3[
    /* error */ js.UndefOr[typings.std.Error], 
    /* req */ js.Any, 
    /* res */ js.Any, 
    scala.Unit
  ]
  
  type EventFormatter = js.Function2[/* message */ js.Any, /* severity */ java.lang.String, js.Any]
}
