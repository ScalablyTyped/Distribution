package typings.ractive.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children
  extends StObject
     with Array[Ractive[/* ractive.ractive.Ractive<any> */ Any]] {
  
  /** Lists of instances targeting anchors by name. */
  var byName: StringDictionary[js.Array[Ractive[/* ractive.ractive.Ractive<any> */ Any]]] = js.native
}
