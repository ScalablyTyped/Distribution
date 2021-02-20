package typings.sipJs

import org.scalablytyped.runtime.StringDictionary
import typings.sipJs.sipJsStrings.`class`
import typings.sipJs.sipJsStrings.any
import typings.sipJs.sipJsStrings.end
import typings.sipJs.sipJsStrings.literal
import typings.sipJs.sipJsStrings.other
import typings.std.Array
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGrammarMod {
  
  @JSImport("sip.js/lib/grammar/pegjs/dist/grammar", "SyntaxError")
  @js.native
  class SyntaxError protected () extends Error {
    def this(message: String, expected: js.Array[Expectation], found: String, location: IFileRange) = this()
    def this(message: String, expected: js.Array[Expectation], found: Null, location: IFileRange) = this()
    
    var expected: js.Array[Expectation] = js.native
    
    var found: String | Null = js.native
    
    var location: IFileRange = js.native
  }
  /* static members */
  object SyntaxError {
    
    @JSImport("sip.js/lib/grammar/pegjs/dist/grammar", "SyntaxError.buildMessage")
    @js.native
    def buildMessage(expected: js.Array[Expectation]): String = js.native
    @JSImport("sip.js/lib/grammar/pegjs/dist/grammar", "SyntaxError.buildMessage")
    @js.native
    def buildMessage(expected: js.Array[Expectation], found: String): String = js.native
  }
  
  @JSImport("sip.js/lib/grammar/pegjs/dist/grammar", "parse")
  @js.native
  val parse: ParseFunction = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.sipJs.distGrammarMod.ILiteralExpectation
    - typings.sipJs.distGrammarMod.IClassExpectation
    - typings.sipJs.distGrammarMod.IAnyExpectation
    - typings.sipJs.distGrammarMod.IEndExpectation
    - typings.sipJs.distGrammarMod.IOtherExpectation
  */
  trait Expectation extends StObject
  object Expectation {
    
    @scala.inline
    def IAnyExpectation(`type`: any): typings.sipJs.distGrammarMod.IAnyExpectation = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sipJs.distGrammarMod.IAnyExpectation]
    }
    
    @scala.inline
    def IClassExpectation(ignoreCase: Boolean, inverted: Boolean, parts: IClassParts, `type`: `class`): typings.sipJs.distGrammarMod.IClassExpectation = {
      val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sipJs.distGrammarMod.IClassExpectation]
    }
    
    @scala.inline
    def IEndExpectation(`type`: end): typings.sipJs.distGrammarMod.IEndExpectation = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sipJs.distGrammarMod.IEndExpectation]
    }
    
    @scala.inline
    def ILiteralExpectation(ignoreCase: Boolean, text: String, `type`: literal): typings.sipJs.distGrammarMod.ILiteralExpectation = {
      val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sipJs.distGrammarMod.ILiteralExpectation]
    }
    
    @scala.inline
    def IOtherExpectation(description: String, `type`: other): typings.sipJs.distGrammarMod.IOtherExpectation = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sipJs.distGrammarMod.IOtherExpectation]
    }
  }
  
  @js.native
  trait IAnyExpectation extends Expectation {
    
    var `type`: any = js.native
  }
  object IAnyExpectation {
    
    @scala.inline
    def apply(`type`: any): IAnyExpectation = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAnyExpectation]
    }
    
    @scala.inline
    implicit class IAnyExpectationMutableBuilder[Self <: IAnyExpectation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IClassExpectation extends Expectation {
    
    var ignoreCase: Boolean = js.native
    
    var inverted: Boolean = js.native
    
    var parts: IClassParts = js.native
    
    var `type`: `class` = js.native
  }
  object IClassExpectation {
    
    @scala.inline
    def apply(ignoreCase: Boolean, inverted: Boolean, parts: IClassParts, `type`: `class`): IClassExpectation = {
      val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IClassExpectation]
    }
    
    @scala.inline
    implicit class IClassExpectationMutableBuilder[Self <: IClassExpectation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParts(value: IClassParts): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: `class`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IClassParts extends Array[String | IClassParts]
  
  @js.native
  trait IEndExpectation extends Expectation {
    
    var `type`: end = js.native
  }
  object IEndExpectation {
    
    @scala.inline
    def apply(`type`: end): IEndExpectation = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEndExpectation]
    }
    
    @scala.inline
    implicit class IEndExpectationMutableBuilder[Self <: IEndExpectation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: end): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IFilePosition extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
    
    var offset: Double = js.native
  }
  object IFilePosition {
    
    @scala.inline
    def apply(column: Double, line: Double, offset: Double): IFilePosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFilePosition]
    }
    
    @scala.inline
    implicit class IFilePositionMutableBuilder[Self <: IFilePosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IFileRange extends StObject {
    
    var end: IFilePosition = js.native
    
    var start: IFilePosition = js.native
  }
  object IFileRange {
    
    @scala.inline
    def apply(end: IFilePosition, start: IFilePosition): IFileRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileRange]
    }
    
    @scala.inline
    implicit class IFileRangeMutableBuilder[Self <: IFileRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: IFilePosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: IFilePosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ILiteralExpectation extends Expectation {
    
    var ignoreCase: Boolean = js.native
    
    var text: String = js.native
    
    var `type`: literal = js.native
  }
  object ILiteralExpectation {
    
    @scala.inline
    def apply(ignoreCase: Boolean, text: String, `type`: literal): ILiteralExpectation = {
      val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILiteralExpectation]
    }
    
    @scala.inline
    implicit class ILiteralExpectationMutableBuilder[Self <: ILiteralExpectation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IOtherExpectation extends Expectation {
    
    var description: String = js.native
    
    var `type`: other = js.native
  }
  object IOtherExpectation {
    
    @scala.inline
    def apply(description: String, `type`: other): IOtherExpectation = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOtherExpectation]
    }
    
    @scala.inline
    implicit class IOtherExpectationMutableBuilder[Self <: IOtherExpectation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: other): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IParseOptions
    extends /* key */ StringDictionary[js.Any] {
    
    var filename: js.UndefOr[String] = js.native
    
    var startRule: js.UndefOr[String] = js.native
    
    var tracer: js.UndefOr[js.Any] = js.native
  }
  object IParseOptions {
    
    @scala.inline
    def apply(): IParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IParseOptions]
    }
    
    @scala.inline
    implicit class IParseOptionsMutableBuilder[Self <: IParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setStartRule(value: String): Self = StObject.set(x, "startRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartRuleUndefined: Self = StObject.set(x, "startRule", js.undefined)
      
      @scala.inline
      def setTracer(value: js.Any): Self = StObject.set(x, "tracer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracerUndefined: Self = StObject.set(x, "tracer", js.undefined)
    }
  }
  
  type ParseFunction = js.Function2[/* input */ String, /* options */ js.UndefOr[IParseOptions], js.Any]
}
