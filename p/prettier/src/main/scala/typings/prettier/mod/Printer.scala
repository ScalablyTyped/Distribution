package typings.prettier.mod

import typings.prettier.anon.EndOfLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Printer extends js.Object {
  var canAttachComment: js.UndefOr[js.Function1[/* node */ js.Any, Boolean]] = js.native
  var embed: js.UndefOr[
    js.Function4[
      /* path */ FastPath[_], 
      /* print */ js.Function1[/* path */ FastPath[_], Doc_], 
      /* textToDoc */ js.Function2[/* text */ String, /* options */ Options, Doc_], 
      /* options */ ParserOptions, 
      Doc_ | Null
    ]
  ] = js.native
  var handleComments: js.UndefOr[EndOfLine] = js.native
  var hasPrettierIgnore: js.UndefOr[js.Function1[/* path */ FastPath[_], Boolean]] = js.native
  var insertPragma: js.UndefOr[js.Function1[/* text */ String, String]] = js.native
  /**
    * @returns `null` if you want to remove this node
    * @returns `void` if you want to use modified newNode
    * @returns anything if you want to replace the node with it
    */
  var massageAstNode: js.UndefOr[js.Function3[/* node */ js.Any, /* newNode */ js.Any, /* parent */ js.Any, _]] = js.native
  var printComments: js.UndefOr[
    js.Function4[
      /* path */ FastPath[_], 
      /* print */ js.Function1[/* path */ FastPath[_], Doc_], 
      /* options */ ParserOptions, 
      /* needsSemi */ Boolean, 
      Doc_
    ]
  ] = js.native
  var willPrintOwnComments: js.UndefOr[js.Function1[/* path */ FastPath[_], Boolean]] = js.native
  def print(path: FastPath[_], options: ParserOptions, print: js.Function1[/* path */ FastPath[_], Doc_]): Doc_ = js.native
}

object Printer {
  @scala.inline
  def apply(print: (FastPath[_], ParserOptions, js.Function1[/* path */ FastPath[_], Doc_]) => Doc_): Printer = {
    val __obj = js.Dynamic.literal(print = js.Any.fromFunction3(print))
    __obj.asInstanceOf[Printer]
  }
  @scala.inline
  implicit class PrinterOps[Self <: Printer] (val x: Self) extends AnyVal {
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
    def setPrint(value: (FastPath[_], ParserOptions, js.Function1[/* path */ FastPath[_], Doc_]) => Doc_): Self = this.set("print", js.Any.fromFunction3(value))
    @scala.inline
    def setCanAttachComment(value: /* node */ js.Any => Boolean): Self = this.set("canAttachComment", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCanAttachComment: Self = this.set("canAttachComment", js.undefined)
    @scala.inline
    def setEmbed(
      value: (/* path */ FastPath[_], /* print */ js.Function1[/* path */ FastPath[_], Doc_], /* textToDoc */ js.Function2[/* text */ String, /* options */ Options, Doc_], /* options */ ParserOptions) => Doc_ | Null
    ): Self = this.set("embed", js.Any.fromFunction4(value))
    @scala.inline
    def deleteEmbed: Self = this.set("embed", js.undefined)
    @scala.inline
    def setHandleComments(value: EndOfLine): Self = this.set("handleComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleComments: Self = this.set("handleComments", js.undefined)
    @scala.inline
    def setHasPrettierIgnore(value: /* path */ FastPath[_] => Boolean): Self = this.set("hasPrettierIgnore", js.Any.fromFunction1(value))
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
      value: (/* path */ FastPath[_], /* print */ js.Function1[/* path */ FastPath[_], Doc_], /* options */ ParserOptions, /* needsSemi */ Boolean) => Doc_
    ): Self = this.set("printComments", js.Any.fromFunction4(value))
    @scala.inline
    def deletePrintComments: Self = this.set("printComments", js.undefined)
    @scala.inline
    def setWillPrintOwnComments(value: /* path */ FastPath[_] => Boolean): Self = this.set("willPrintOwnComments", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWillPrintOwnComments: Self = this.set("willPrintOwnComments", js.undefined)
  }
  
}

