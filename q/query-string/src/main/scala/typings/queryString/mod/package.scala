package typings.queryString

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ParsedQuery[T] = org.scalablytyped.runtime.StringDictionary[T | js.Array[T] | scala.Null]
  
  type Stringifiable = js.UndefOr[java.lang.String | scala.Boolean | scala.Double | scala.Null]
  
  type StringifiableRecord = typings.std.Record[
    java.lang.String, 
    typings.queryString.mod.Stringifiable | js.Array[typings.queryString.mod.Stringifiable]
  ]
}
