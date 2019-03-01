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

object QualifiedTag {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[QualifiedAttribute],
    isSelfClosing: scala.Boolean,
    local: java.lang.String,
    name: java.lang.String,
    ns: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    prefix: java.lang.String,
    uri: java.lang.String
  ): QualifiedTag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("isSelfClosing")(isSelfClosing)
    __obj.updateDynamic("local")(local)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("ns")(ns)
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[QualifiedTag]
  }
}

