package typings.sqlQueryIdentifier

import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_DATABASE
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_TABLE
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DELETE
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_DATABASE
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_TABLE
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.INSERT
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.LISTING
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.MODIFICATION
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SELECT
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.TRUNCATE
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.UNKNOWN
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.UPDATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sql-query-identifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def identify(query: String): js.Array[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("identify")(query.asInstanceOf[js.Any]).asInstanceOf[js.Array[Result]]
  @scala.inline
  def identify(query: String, options: Options): js.Array[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("identify")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Result]]
  
  trait Options extends StObject {
    
    /**
      * Disables strict mode which will ignore unknown types (defaults to true).
      */
    var strict: Boolean
  }
  object Options {
    
    @scala.inline
    def apply(strict: Boolean): Options = {
      val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    }
  }
  
  trait Result extends StObject {
    
    var end: Double
    
    var executionType: LISTING | MODIFICATION | UNKNOWN
    
    var start: Double
    
    var text: String
    
    var `type`: SELECT | INSERT | UPDATE | DELETE | CREATE_TABLE | CREATE_DATABASE | DROP_TABLE | DROP_DATABASE | TRUNCATE | UNKNOWN
  }
  object Result {
    
    @scala.inline
    def apply(
      end: Double,
      executionType: LISTING | MODIFICATION | UNKNOWN,
      start: Double,
      text: String,
      `type`: SELECT | INSERT | UPDATE | DELETE | CREATE_TABLE | CREATE_DATABASE | DROP_TABLE | DROP_DATABASE | TRUNCATE | UNKNOWN
    ): Result = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], executionType = executionType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionType(value: LISTING | MODIFICATION | UNKNOWN): Self = StObject.set(x, "executionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(
        value: SELECT | INSERT | UPDATE | DELETE | CREATE_TABLE | CREATE_DATABASE | DROP_TABLE | DROP_DATABASE | TRUNCATE | UNKNOWN
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
