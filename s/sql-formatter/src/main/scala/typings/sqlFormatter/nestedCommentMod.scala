package typings.sqlFormatter

import typings.sqlFormatter.tokenizerEngineMod.RegExpLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nestedCommentMod {
  
  @JSImport("sql-formatter/lib/src/lexer/NestedComment", "NestedComment")
  @js.native
  open class NestedComment ()
    extends StObject
       with RegExpLike {
    
    /* CompleteClass */
    override def exec(input: String): js.Array[String] | Null = js.native
    
    /* CompleteClass */
    var lastIndex: Double = js.native
    
    /* private */ var matchSection: Any = js.native
  }
}
