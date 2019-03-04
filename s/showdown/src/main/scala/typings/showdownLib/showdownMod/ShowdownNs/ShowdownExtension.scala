package typings
package showdownLib.showdownMod.ShowdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a plugin/extension
  * Each single extension can be one of two types:
  *
  * + Language Extension -- Language extensions are ones that that add new markdown syntax to showdown. For example, say you wanted ^^youtube http://www.youtube.com/watch?v=oHg5SJYRHA0 to automatically render as an embedded YouTube video, that would be a language extension.
  * + Output Modifiers -- After showdown has run, and generated HTML, an output modifier would change that HTML. For example, say you wanted to change <div class="header"> to be <header>, that would be an output modifier.
  *
  * Each extension can provide two combinations of interfaces for showdown.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- showdownLib.showdownMod.ShowdownNs.FilterExtension because var conflicts: `type`. Inlined filter */ trait ShowdownExtension extends RegexReplaceExtension {
  var filter: js.UndefOr[
    js.Function3[
      /* text */ java.lang.String, 
      /* converter */ Converter, 
      /* options */ js.UndefOr[ConverterOptions], 
      java.lang.String
    ]
  ] = js.undefined
}

object ShowdownExtension {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    filter: js.Function3[
      /* text */ java.lang.String, 
      /* converter */ Converter, 
      /* options */ js.UndefOr[ConverterOptions], 
      java.lang.String
    ] = null,
    regex: java.lang.String | stdLib.RegExp = null,
    replace: js.Any = null
  ): ShowdownExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(replace)
    __obj.asInstanceOf[ShowdownExtension]
  }
}

