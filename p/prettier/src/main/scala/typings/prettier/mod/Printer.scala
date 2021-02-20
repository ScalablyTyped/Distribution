package typings.prettier.mod

import typings.prettier.anon.EndOfLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Printer[T] extends StObject {
  
  var canAttachComment: js.UndefOr[js.Function1[/* node */ T, Boolean]] = js.native
  
  var embed: js.UndefOr[
    js.Function4[
      /* path */ FastPath[T], 
      /* print */ js.Function1[/* path */ FastPath[T], Doc_], 
      /* textToDoc */ js.Function2[/* text */ String, /* options */ Options, Doc_], 
      /* options */ ParserOptions[T], 
      Doc_ | Null
    ]
  ] = js.native
  
  var handleComments: js.UndefOr[EndOfLine[T]] = js.native
  
  var hasPrettierIgnore: js.UndefOr[js.Function1[/* path */ FastPath[T], Boolean]] = js.native
  
  var insertPragma: js.UndefOr[js.Function1[/* text */ String, String]] = js.native
  
  /**
    * @returns `null` if you want to remove this node
    * @returns `void` if you want to use modified newNode
    * @returns anything if you want to replace the node with it
    */
  var massageAstNode: js.UndefOr[js.Function3[/* node */ js.Any, /* newNode */ js.Any, /* parent */ js.Any, _]] = js.native
  
  def print(path: FastPath[T], options: ParserOptions[T], print: js.Function1[/* path */ FastPath[T], Doc_]): Doc_ = js.native
  
  var printComments: js.UndefOr[
    js.Function4[
      /* path */ FastPath[T], 
      /* print */ js.Function1[/* path */ FastPath[T], Doc_], 
      /* options */ ParserOptions[T], 
      /* needsSemi */ Boolean, 
      Doc_
    ]
  ] = js.native
  
  var willPrintOwnComments: js.UndefOr[js.Function1[/* path */ FastPath[T], Boolean]] = js.native
}
object Printer {
  
  @scala.inline
  def apply[T](print: (FastPath[T], ParserOptions[T], js.Function1[/* path */ FastPath[T], Doc_]) => Doc_): Printer[T] = {
    val __obj = js.Dynamic.literal(print = js.Any.fromFunction3(print))
    __obj.asInstanceOf[Printer[T]]
  }
  
  @scala.inline
  implicit class PrinterMutableBuilder[Self <: Printer[_], T] (val x: Self with Printer[T]) extends AnyVal {
    
    @scala.inline
    def setCanAttachComment(value: /* node */ T => Boolean): Self = StObject.set(x, "canAttachComment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCanAttachCommentUndefined: Self = StObject.set(x, "canAttachComment", js.undefined)
    
    @scala.inline
    def setEmbed(
      value: (/* path */ FastPath[T], /* print */ js.Function1[/* path */ FastPath[T], Doc_], /* textToDoc */ js.Function2[/* text */ String, /* options */ Options, Doc_], /* options */ ParserOptions[T]) => Doc_ | Null
    ): Self = StObject.set(x, "embed", js.Any.fromFunction4(value))
    
    @scala.inline
    def setEmbedUndefined: Self = StObject.set(x, "embed", js.undefined)
    
    @scala.inline
    def setHandleComments(value: EndOfLine[T]): Self = StObject.set(x, "handleComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleCommentsUndefined: Self = StObject.set(x, "handleComments", js.undefined)
    
    @scala.inline
    def setHasPrettierIgnore(value: /* path */ FastPath[T] => Boolean): Self = StObject.set(x, "hasPrettierIgnore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasPrettierIgnoreUndefined: Self = StObject.set(x, "hasPrettierIgnore", js.undefined)
    
    @scala.inline
    def setInsertPragma(value: /* text */ String => String): Self = StObject.set(x, "insertPragma", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertPragmaUndefined: Self = StObject.set(x, "insertPragma", js.undefined)
    
    @scala.inline
    def setMassageAstNode(value: (/* node */ js.Any, /* newNode */ js.Any, /* parent */ js.Any) => _): Self = StObject.set(x, "massageAstNode", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMassageAstNodeUndefined: Self = StObject.set(x, "massageAstNode", js.undefined)
    
    @scala.inline
    def setPrint(value: (FastPath[T], ParserOptions[T], js.Function1[/* path */ FastPath[T], Doc_]) => Doc_): Self = StObject.set(x, "print", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPrintComments(
      value: (/* path */ FastPath[T], /* print */ js.Function1[/* path */ FastPath[T], Doc_], /* options */ ParserOptions[T], /* needsSemi */ Boolean) => Doc_
    ): Self = StObject.set(x, "printComments", js.Any.fromFunction4(value))
    
    @scala.inline
    def setPrintCommentsUndefined: Self = StObject.set(x, "printComments", js.undefined)
    
    @scala.inline
    def setWillPrintOwnComments(value: /* path */ FastPath[T] => Boolean): Self = StObject.set(x, "willPrintOwnComments", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWillPrintOwnCommentsUndefined: Self = StObject.set(x, "willPrintOwnComments", js.undefined)
  }
}
