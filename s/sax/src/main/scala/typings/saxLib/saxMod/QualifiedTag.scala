package typings
package saxLib.saxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(saxLib.saxMod.BaseTag because Would inherit conflicting mutable fields List(name))*/

trait QualifiedTag extends QualifiedName {
  var attributes: ScalablyTyped.runtime.StringDictionary[QualifiedAttribute]
  var ns: ScalablyTyped.runtime.StringDictionary[java.lang.String]
}

