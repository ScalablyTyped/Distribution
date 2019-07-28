package typings.prettier.prettierMod

import typings.prettier.Anon_Ast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Printer extends js.Object {
  var canAttachComment: js.UndefOr[js.Function1[/* node */ js.Any, Boolean]] = js.undefined
  var embed: js.UndefOr[
    js.Function4[
      /* path */ FastPath[_], 
      /* print */ js.Function1[/* path */ FastPath[_], Doc], 
      /* textToDoc */ js.Function2[/* text */ String, /* options */ Options, Doc], 
      /* options */ ParserOptions, 
      Doc | Null
    ]
  ] = js.undefined
  var handleComments: js.UndefOr[Anon_Ast] = js.undefined
  var hasPrettierIgnore: js.UndefOr[js.Function1[/* path */ FastPath[_], Boolean]] = js.undefined
  var insertPragma: js.UndefOr[js.Function1[/* text */ String, String]] = js.undefined
  /**
    * @returns `null` if you want to remove this node
    * @returns `void` if you want to use modified newNode
    * @returns anything if you want to replace the node with it
    */
  var massageAstNode: js.UndefOr[js.Function3[/* node */ js.Any, /* newNode */ js.Any, /* parent */ js.Any, _]] = js.undefined
  var printComments: js.UndefOr[
    js.Function4[
      /* path */ FastPath[_], 
      /* print */ js.Function1[/* path */ FastPath[_], Doc], 
      /* options */ ParserOptions, 
      /* needsSemi */ Boolean, 
      Doc
    ]
  ] = js.undefined
  var willPrintOwnComments: js.UndefOr[js.Function1[/* path */ FastPath[_], Boolean]] = js.undefined
  def print(path: FastPath[_], options: ParserOptions, print: js.Function1[/* path */ FastPath[_], Doc]): Doc
}

object Printer {
  @scala.inline
  def apply(
    print: (FastPath[_], ParserOptions, js.Function1[/* path */ FastPath[_], Doc]) => Doc,
    canAttachComment: /* node */ js.Any => Boolean = null,
    embed: (/* path */ FastPath[_], /* print */ js.Function1[/* path */ FastPath[_], Doc], /* textToDoc */ js.Function2[/* text */ String, /* options */ Options, Doc], /* options */ ParserOptions) => Doc | Null = null,
    handleComments: Anon_Ast = null,
    hasPrettierIgnore: /* path */ FastPath[_] => Boolean = null,
    insertPragma: /* text */ String => String = null,
    massageAstNode: (/* node */ js.Any, /* newNode */ js.Any, /* parent */ js.Any) => _ = null,
    printComments: (/* path */ FastPath[_], /* print */ js.Function1[/* path */ FastPath[_], Doc], /* options */ ParserOptions, /* needsSemi */ Boolean) => Doc = null,
    willPrintOwnComments: /* path */ FastPath[_] => Boolean = null
  ): Printer = {
    val __obj = js.Dynamic.literal(print = js.Any.fromFunction3(print))
    if (canAttachComment != null) __obj.updateDynamic("canAttachComment")(js.Any.fromFunction1(canAttachComment))
    if (embed != null) __obj.updateDynamic("embed")(js.Any.fromFunction4(embed))
    if (handleComments != null) __obj.updateDynamic("handleComments")(handleComments)
    if (hasPrettierIgnore != null) __obj.updateDynamic("hasPrettierIgnore")(js.Any.fromFunction1(hasPrettierIgnore))
    if (insertPragma != null) __obj.updateDynamic("insertPragma")(js.Any.fromFunction1(insertPragma))
    if (massageAstNode != null) __obj.updateDynamic("massageAstNode")(js.Any.fromFunction3(massageAstNode))
    if (printComments != null) __obj.updateDynamic("printComments")(js.Any.fromFunction4(printComments))
    if (willPrintOwnComments != null) __obj.updateDynamic("willPrintOwnComments")(js.Any.fromFunction1(willPrintOwnComments))
    __obj.asInstanceOf[Printer]
  }
}

