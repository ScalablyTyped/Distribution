package typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`

import typings.storybookComponents.anon.EndOfLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Printer[T] extends StObject {
  
  var canAttachComment: js.UndefOr[js.Function1[/* node */ T, Boolean]] = js.undefined
  
  var embed: js.UndefOr[
    js.Function4[
      /* path */ AstPath[T], 
      /* print */ js.Function1[/* path */ AstPath[T], Doc_], 
      /* textToDoc */ js.Function2[/* text */ String, /* options */ Options, Doc_], 
      /* options */ ParserOptions[T], 
      Doc_ | Null
    ]
  ] = js.undefined
  
  var handleComments: js.UndefOr[EndOfLine[T]] = js.undefined
  
  var hasPrettierIgnore: js.UndefOr[js.Function1[/* path */ AstPath[T], Boolean]] = js.undefined
  
  var insertPragma: js.UndefOr[js.Function1[/* text */ String, String]] = js.undefined
  
  var isBlockComment: js.UndefOr[js.Function1[/* node */ T, Boolean]] = js.undefined
  
  /**
    * @returns `null` if you want to remove this node
    * @returns `void` if you want to use modified newNode
    * @returns anything if you want to replace the node with it
    */
  var massageAstNode: js.UndefOr[js.Function3[/* node */ Any, /* newNode */ Any, /* parent */ Any, Any]] = js.undefined
  
  def print(path: AstPath[T], options: ParserOptions[T], print: js.Function1[/* path */ AstPath[T], Doc_]): Doc_
  
  var printComment: js.UndefOr[js.Function2[/* commentPath */ AstPath[T], /* options */ ParserOptions[T], Doc_]] = js.undefined
  
  var willPrintOwnComments: js.UndefOr[js.Function1[/* path */ AstPath[T], Boolean]] = js.undefined
}
object Printer {
  
  inline def apply[T](print: (AstPath[T], ParserOptions[T], js.Function1[/* path */ AstPath[T], Doc_]) => Doc_): Printer[T] = {
    val __obj = js.Dynamic.literal(print = js.Any.fromFunction3(print))
    __obj.asInstanceOf[Printer[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Printer[?], T] (val x: Self & Printer[T]) extends AnyVal {
    
    inline def setCanAttachComment(value: /* node */ T => Boolean): Self = StObject.set(x, "canAttachComment", js.Any.fromFunction1(value))
    
    inline def setCanAttachCommentUndefined: Self = StObject.set(x, "canAttachComment", js.undefined)
    
    inline def setEmbed(
      value: (/* path */ AstPath[T], /* print */ js.Function1[/* path */ AstPath[T], Doc_], /* textToDoc */ js.Function2[/* text */ String, /* options */ Options, Doc_], /* options */ ParserOptions[T]) => Doc_ | Null
    ): Self = StObject.set(x, "embed", js.Any.fromFunction4(value))
    
    inline def setEmbedUndefined: Self = StObject.set(x, "embed", js.undefined)
    
    inline def setHandleComments(value: EndOfLine[T]): Self = StObject.set(x, "handleComments", value.asInstanceOf[js.Any])
    
    inline def setHandleCommentsUndefined: Self = StObject.set(x, "handleComments", js.undefined)
    
    inline def setHasPrettierIgnore(value: /* path */ AstPath[T] => Boolean): Self = StObject.set(x, "hasPrettierIgnore", js.Any.fromFunction1(value))
    
    inline def setHasPrettierIgnoreUndefined: Self = StObject.set(x, "hasPrettierIgnore", js.undefined)
    
    inline def setInsertPragma(value: /* text */ String => String): Self = StObject.set(x, "insertPragma", js.Any.fromFunction1(value))
    
    inline def setInsertPragmaUndefined: Self = StObject.set(x, "insertPragma", js.undefined)
    
    inline def setIsBlockComment(value: /* node */ T => Boolean): Self = StObject.set(x, "isBlockComment", js.Any.fromFunction1(value))
    
    inline def setIsBlockCommentUndefined: Self = StObject.set(x, "isBlockComment", js.undefined)
    
    inline def setMassageAstNode(value: (/* node */ Any, /* newNode */ Any, /* parent */ Any) => Any): Self = StObject.set(x, "massageAstNode", js.Any.fromFunction3(value))
    
    inline def setMassageAstNodeUndefined: Self = StObject.set(x, "massageAstNode", js.undefined)
    
    inline def setPrint(value: (AstPath[T], ParserOptions[T], js.Function1[/* path */ AstPath[T], Doc_]) => Doc_): Self = StObject.set(x, "print", js.Any.fromFunction3(value))
    
    inline def setPrintComment(value: (/* commentPath */ AstPath[T], /* options */ ParserOptions[T]) => Doc_): Self = StObject.set(x, "printComment", js.Any.fromFunction2(value))
    
    inline def setPrintCommentUndefined: Self = StObject.set(x, "printComment", js.undefined)
    
    inline def setWillPrintOwnComments(value: /* path */ AstPath[T] => Boolean): Self = StObject.set(x, "willPrintOwnComments", js.Any.fromFunction1(value))
    
    inline def setWillPrintOwnCommentsUndefined: Self = StObject.set(x, "willPrintOwnComments", js.undefined)
  }
}
