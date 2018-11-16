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
/* RemoveMultipleInheritance: Dropped parents List(showdownLib.showdownMod.ShowdownNs.FilterExtension because Would inherit conflicting mutable fields List(`type`))*/

trait ShowdownExtension extends RegexReplaceExtension

