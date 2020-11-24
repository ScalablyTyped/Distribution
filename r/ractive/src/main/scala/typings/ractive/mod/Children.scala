package typings.ractive.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children
  extends Array[Ractive[Ractive[js.Any]]] {
  
  /** Lists of instances targetting anchors by name. */
  var byName: StringDictionary[js.Array[Ractive[Ractive[_]]]] = js.native
}
