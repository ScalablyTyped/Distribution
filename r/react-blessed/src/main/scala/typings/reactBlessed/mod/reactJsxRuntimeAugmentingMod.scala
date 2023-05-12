package typings.reactBlessed.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// augment react/jsx-runtime JSX when new JSX transform is used
/* augmented module */
object reactJsxRuntimeAugmentingMod {
  
  object JSX {
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.reactBlessed.mod.BlessedIntrinsicElements because var conflicts: bigtext, box, checkbox, element, filemanager, layout, list, listbar, listtable, loading, log, message, progressbar, prompt, question, radiobutton, radioset, scrollablebox, scrollabletext, terminal, textbox. Inlined  */ trait IntrinsicElements
      extends StObject
         with BlessedIntrinsicElementsPrefixed
    object IntrinsicElements {
      
      inline def apply(
        bigtext: DetailedBlessedProps[BigTextElement],
        box: DetailedBlessedProps[BoxElement],
        checkbox: DetailedBlessedProps[CheckboxElement],
        element: DetailedBlessedProps[Element],
        filemanager: DetailedBlessedProps[FileManagerElement],
        layout: DetailedBlessedProps[typings.blessed.mod.Widgets.LayoutElement],
        list: DetailedBlessedProps[ListElement],
        listbar: DetailedBlessedProps[ListbarElement],
        listtable: DetailedBlessedProps[ListTableElement],
        loading: DetailedBlessedProps[LoadingElement],
        log: DetailedBlessedProps[LogElement],
        message: DetailedBlessedProps[MessageElement],
        progressbar: DetailedBlessedProps[ProgressBarElement],
        prompt: DetailedBlessedProps[PromptElement],
        question: DetailedBlessedProps[QuestionElement],
        radiobutton: DetailedBlessedProps[RadioButtonElement],
        radioset: DetailedBlessedProps[RadioSetElement],
        scrollablebox: DetailedBlessedProps[ScrollableBoxElement],
        scrollabletext: DetailedBlessedProps[ScrollableTextElement],
        terminal: DetailedBlessedProps[typings.blessed.mod.Widgets.TerminalElement],
        textbox: DetailedBlessedProps[TextboxElement]
      ): IntrinsicElements = {
        val __obj = js.Dynamic.literal(bigtext = bigtext.asInstanceOf[js.Any], box = box.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], filemanager = filemanager.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listbar = listbar.asInstanceOf[js.Any], listtable = listtable.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], progressbar = progressbar.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], radiobutton = radiobutton.asInstanceOf[js.Any], radioset = radioset.asInstanceOf[js.Any], scrollablebox = scrollablebox.asInstanceOf[js.Any], scrollabletext = scrollabletext.asInstanceOf[js.Any], terminal = terminal.asInstanceOf[js.Any], textbox = textbox.asInstanceOf[js.Any])
        __obj.asInstanceOf[IntrinsicElements]
      }
    }
  }
}
