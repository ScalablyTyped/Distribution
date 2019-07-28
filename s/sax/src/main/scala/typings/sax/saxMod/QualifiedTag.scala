package typings.sax.saxMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.sax.saxMod.BaseTag because var conflicts: name. Inlined isSelfClosing */ trait QualifiedTag extends QualifiedName {
  var attributes: StringDictionary[QualifiedAttribute]
  var isSelfClosing: Boolean
  var ns: StringDictionary[String]
}

object QualifiedTag {
  @scala.inline
  def apply(
    attributes: StringDictionary[QualifiedAttribute],
    isSelfClosing: Boolean,
    local: String,
    name: String,
    ns: StringDictionary[String],
    prefix: String,
    uri: String
  ): QualifiedTag = {
    val __obj = js.Dynamic.literal(attributes = attributes, isSelfClosing = isSelfClosing, local = local, name = name, ns = ns, prefix = prefix, uri = uri)
  
    __obj.asInstanceOf[QualifiedTag]
  }
}

