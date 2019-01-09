package typings
package saxLib.saxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- saxLib.saxMod.BaseTag because var conflicts: name. Inlined isSelfClosing */ trait QualifiedTag extends QualifiedName {
  var attributes: org.scalablytyped.runtime.StringDictionary[QualifiedAttribute]
  var isSelfClosing: scala.Boolean
  var ns: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

