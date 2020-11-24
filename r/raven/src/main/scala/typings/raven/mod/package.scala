package typings.raven

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CaptureCallback = js.Function2[
    /* sendErr */ js.UndefOr[typings.std.Error | scala.Null], 
    /* eventId */ js.Any, 
    scala.Unit
  ]
  
  type DataCallback = js.Function1[/* data */ org.scalablytyped.runtime.StringDictionary[js.Any], js.Any]
  
  type FatalErrorCallback = js.Function3[
    /* err */ typings.std.Error, 
    /* sendErr */ js.UndefOr[typings.std.Error | scala.Null], 
    /* eventId */ java.lang.String, 
    scala.Unit
  ]
  
  type ShouldSendCallback = js.Function1[/* data */ org.scalablytyped.runtime.StringDictionary[js.Any], scala.Boolean]
  
  type parseUserCallback = js.Function1[/* req */ js.Any, js.Any]
}
