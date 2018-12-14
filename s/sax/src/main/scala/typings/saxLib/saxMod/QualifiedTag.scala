package typings
package saxLib.saxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(saxLib.saxMod.BaseTag because Would inherit conflicting mutable fields List(name))*/

trait QualifiedTag extends QualifiedName {
  var attributes: org.scalablytyped.runtime.StringDictionary[QualifiedAttribute]
  var ns: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

