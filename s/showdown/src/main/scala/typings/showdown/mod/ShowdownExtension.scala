package typings.showdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a plugin/extension
  * Each single extension can be one of two types:
  *
  * + Language Extension -- Language extensions are ones that that add new markdown syntax to showdown. For example, say you wanted ^^youtube http://www.youtube.com/watch?v=oHg5SJYRHA0 to automatically render as an embedded YouTube video, that would be a language extension.
  * + Output Modifiers -- After showdown has run, and generated HTML, an output modifier would change that HTML. For example, say you wanted to change <div class="header"> to be <header>, that would be an output modifier.
  * + Listener Extension -- Listener extensions for listen to conversion events.
  * 
  * Each extension can provide two combinations of interfaces for showdown.
  * 
  * @example
  * ```ts
  * let myext: ShowdownExtension = {
  *   type: 'output',
  *   filter(text, converter, options) {
  *      // ... do stuff to text ...
  *      return text;
  *   },
  *   listeners: {
  *      ['lists.after'](evtName, text, converter, options, globals){
  *          // ... do stuff to text ...
  *          return text;
  *      },
  *      // ... 
  *   }
  * };
  * ```
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.showdown.mod.Extension_ because Already inherited
- typings.showdown.mod.FilterExtension because var conflicts: listeners, `type`. Inlined filter */ @js.native
trait ShowdownExtension extends RegexReplaceExtension {
  
  var filter: js.UndefOr[
    js.Function3[
      /* text */ String, 
      /* converter */ Converter, 
      /* options */ js.UndefOr[ConverterOptions], 
      String
    ]
  ] = js.native
}
object ShowdownExtension {
  
  @scala.inline
  def apply(`type`: String): ShowdownExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowdownExtension]
  }
  
  @scala.inline
  implicit class ShowdownExtensionOps[Self <: ShowdownExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilter(
      value: (/* text */ String, /* converter */ Converter, /* options */ js.UndefOr[ConverterOptions]) => String
    ): Self = this.set("filter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
}
