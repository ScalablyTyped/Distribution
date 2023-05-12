package typings.reactBlessed.mod

import typings.react.mod.HTMLAttributes
import typings.react.mod.SVGProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// it isn't possible to use the global JSX namespace because some 'blessed'
// elements will collide with ones set in react defs.
// augment react JSX when old JSX transform is used
/* augmented module */
object reactAugmentingMod {
  
  object JSX {
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped {[ P in std.Exclude<keyof react-blessed.react-blessed.DetailedBlessedProps<react-blessed.react-blessed.ButtonElement>, 'draggable' | 'onBlur' | 'onClick' | 'onFocus' | 'onResize' | 'ref' | 'style'> ]: react-blessed.react-blessed.DetailedBlessedProps<react-blessed.react-blessed.ButtonElement>[P]} */ trait ButtonHTMLAttributes[T]
      extends StObject
         with HTMLAttributes[T]
    object ButtonHTMLAttributes {
      
      inline def apply[T](): ButtonHTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ButtonHTMLAttributes[T]]
      }
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped {[ P in std.Exclude<keyof react-blessed.react-blessed.DetailedBlessedProps<react-blessed.react-blessed.InputElement>, 'draggable' | 'onBlur' | 'onClick' | 'onFocus' | 'onResize' | 'ref' | 'style'> ]: react-blessed.react-blessed.DetailedBlessedProps<react-blessed.react-blessed.InputElement>[P]} */ trait InputHTMLAttributes[T]
      extends StObject
         with HTMLAttributes[T]
    object InputHTMLAttributes {
      
      inline def apply[T](): InputHTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InputHTMLAttributes[T]]
      }
    }
    
    // set IntrinsicElements to 'react-blessed' elements both with and without
    // 'blessed-' prefix
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
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped {[ P in std.Exclude<keyof react-blessed.react-blessed.DetailedBlessedProps<react-blessed.react-blessed.LineElement>, 'focusable' | 'onBlur' | 'onClick' | 'onFocus' | 'onResize' | 'orientation' | 'ref' | 'style'> ]: react-blessed.react-blessed.DetailedBlessedProps<react-blessed.react-blessed.LineElement>[P]} */ trait SVGLineElementAttributes[T]
      extends StObject
         with SVGProps[T]
    object SVGLineElementAttributes {
      
      inline def apply[T](): SVGLineElementAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SVGLineElementAttributes[T]]
      }
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped {[ P in std.Exclude<keyof react-blessed.react-blessed.DetailedBlessedProps<react-blessed.react-blessed.TextElement>, 'fill' | 'focusable' | 'onBlur' | 'onClick' | 'onFocus' | 'onResize' | 'ref' | 'style'> ]: react-blessed.react-blessed.DetailedBlessedProps<react-blessed.react-blessed.TextElement>[P]} */ trait SVGTextElementAttributes[T]
      extends StObject
         with SVGProps[T]
    object SVGTextElementAttributes {
      
      inline def apply[T](): SVGTextElementAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SVGTextElementAttributes[T]]
      }
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped {[ P in std.Exclude<keyof react-blessed.react-blessed.DetailedBlessedProps<react-blessed.react-blessed.TableElement>, 'border' | 'draggable' | 'onBlur' | 'onClick' | 'onFocus' | 'onResize' | 'ref' | 'style'> ]: react-blessed.react-blessed.DetailedBlessedProps<react-blessed.react-blessed.TableElement>[P]} */ trait TableHTMLAttributes[T]
      extends StObject
         with HTMLAttributes[T]
    object TableHTMLAttributes {
      
      inline def apply[T](): TableHTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableHTMLAttributes[T]]
      }
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped {[ P in std.Exclude<keyof react-blessed.react-blessed.DetailedBlessedProps<react-blessed.react-blessed.TextElement>, 'draggable' | 'fill' | 'focusable' | 'onBlur' | 'onClick' | 'onFocus' | 'onResize' | 'ref' | 'style'> ]: react-blessed.react-blessed.DetailedBlessedProps<react-blessed.react-blessed.TextElement>[P]} */ trait TextareaHTMLAttributes[T]
      extends StObject
         with HTMLAttributes[T]
    object TextareaHTMLAttributes {
      
      inline def apply[T](): TextareaHTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextareaHTMLAttributes[T]]
      }
    }
  }
}
