package typings.prettier.mod

import typings.prettier.anon.EndOfLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Printer[T] extends js.Object {
  
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
  implicit class PrinterOps[Self <: Printer[_], T] (val x: Self with Printer[T]) extends AnyVal {
    
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
    def setPrint(value: (FastPath[T], ParserOptions[T], js.Function1[/* path */ FastPath[T], Doc_]) => Doc_): Self = this.set("print", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCanAttachComment(value: /* node */ T => Boolean): Self = this.set("canAttachComment", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCanAttachComment: Self = this.set("canAttachComment", js.undefined)
    
    @scala.inline
    def setEmbed(
      value: (/* path */ FastPath[T], /* print */ js.Function1[/* path */ FastPath[T], Doc_], /* textToDoc */ js.Function2[/* text */ String, /* options */ Options, Doc_], /* options */ ParserOptions[T]) => Doc_ | Null
    ): Self = this.set("embed", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteEmbed: Self = this.set("embed", js.undefined)
    
    @scala.inline
    def setHandleComments(value: EndOfLine[T]): Self = this.set("handleComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleComments: Self = this.set("handleComments", js.undefined)
    
    @scala.inline
    def setHasPrettierIgnore(value: /* path */ FastPath[T] => Boolean): Self = this.set("hasPrettierIgnore", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasPrettierIgnore: Self = this.set("hasPrettierIgnore", js.undefined)
    
    @scala.inline
    def setInsertPragma(value: /* text */ String => String): Self = this.set("insertPragma", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInsertPragma: Self = this.set("insertPragma", js.undefined)
    
    @scala.inline
    def setMassageAstNode(value: (/* node */ js.Any, /* newNode */ js.Any, /* parent */ js.Any) => _): Self = this.set("massageAstNode", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteMassageAstNode: Self = this.set("massageAstNode", js.undefined)
    
    @scala.inline
    def setPrintComments(
      value: (/* path */ FastPath[T], /* print */ js.Function1[/* path */ FastPath[T], Doc_], /* options */ ParserOptions[T], /* needsSemi */ Boolean) => Doc_
    ): Self = this.set("printComments", js.Any.fromFunction4(value))
    
    @scala.inline
    def deletePrintComments: Self = this.set("printComments", js.undefined)
    
    @scala.inline
    def setWillPrintOwnComments(value: /* path */ FastPath[T] => Boolean): Self = this.set("willPrintOwnComments", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWillPrintOwnComments: Self = this.set("willPrintOwnComments", js.undefined)
  }
}
