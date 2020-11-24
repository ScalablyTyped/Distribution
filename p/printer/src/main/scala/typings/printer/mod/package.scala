package typings.printer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type PrintOnErrorFunction = js.Function1[/* err */ typings.std.Error, js.Any]
  
  type PrintOnSuccessFunction = js.Function1[/* jobId */ java.lang.String, js.Any]
  
  type PrinterDriverOptions = org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[scala.Boolean]]
}
