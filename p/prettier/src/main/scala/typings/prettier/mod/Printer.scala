package typings.prettier.mod

import typings.prettier.anon.EndOfLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Printer[T] extends StObject {
  
  var canAttachComment: js.UndefOr[js.Function1[/* node */ T, Boolean]] = js.native
  
  var embed: js.UndefOr[
    js.Function4[
      /* path */ AstPath[T], 
      /* print */ js.Function1[/* path */ AstPath[T], Doc_], 
      /* textToDoc */ js.Function2[/* text */ String, /* options */ Options, Doc_], 
      /* options */ ParserOptions[T], 
      Doc_ | Null
    ]
  ] = js.native
  
  var handleComments: js.UndefOr[EndOfLine[T]] = js.native
  
  var hasPrettierIgnore: js.UndefOr[js.Function1[/* path */ AstPath[T], Boolean]] = js.native
  
  var insertPragma: js.UndefOr[js.Function1[/* text */ String, String]] = js.native
  
  var isBlockComment: js.UndefOr[js.Function1[/* node */ T, Boolean]] = js.native
  
  /**
    * @returns `null` if you want to remove this node
    * @returns `void` if you want to use modified newNode
    * @returns anything if you want to replace the node with it
    */
  var massageAstNode: js.UndefOr[js.Function3[/* node */ Any, /* newNode */ Any, /* parent */ Any, Any]] = js.native
  
  var preprocess: js.UndefOr[js.Function2[/* ast */ AST, /* options */ ParserOptions[T], AST]] = js.native
  
  def print(path: AstPath[T], options: ParserOptions[T], print: js.Function1[/* path */ AstPath[T], Doc_]): Doc_ = js.native
  def print(
    path: AstPath[T],
    options: ParserOptions[T],
    print: js.Function1[/* path */ AstPath[T], Doc_],
    args: Any
  ): Doc_ = js.native
  
  var printComment: js.UndefOr[js.Function2[/* commentPath */ AstPath[T], /* options */ ParserOptions[T], Doc_]] = js.native
  
  var willPrintOwnComments: js.UndefOr[js.Function1[/* path */ AstPath[T], Boolean]] = js.native
}
