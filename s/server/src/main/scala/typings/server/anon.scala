package typings.server

import typings.bodyParser.mod.OptionsJson
import typings.bodyParser.mod.OptionsText
import typings.bodyParser.mod.OptionsUrlencoded
import typings.express.mod.CookieOptions
import typings.server.commonMod.LogFn
import typings.server.commonMod.LogLevel
import typings.server.optionsMod.CsurfOptions
import typings.server.optionsMod.DataParserOptions
import typings.server.serverBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Body extends StObject {
    
    var body: js.UndefOr[OptionsUrlencoded] = js.native
    
    var cookie: js.UndefOr[CookieOptions] = js.native
    
    var data: js.UndefOr[DataParserOptions] = js.native
    
    var json: js.UndefOr[OptionsJson] = js.native
    
    var text: js.UndefOr[OptionsText] = js.native
  }
  object Body {
    
    @scala.inline
    def apply(): Body = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: OptionsUrlencoded): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCookie(value: CookieOptions): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setData(value: DataParserOptions): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setJson(value: OptionsJson): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setText(value: OptionsText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait Csurf extends StObject {
    
    var csurf: js.UndefOr[`false` | CsurfOptions] = js.native
  }
  object Csurf {
    
    @scala.inline
    def apply(): Csurf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Csurf]
    }
    
    @scala.inline
    implicit class CsurfMutableBuilder[Self <: Csurf] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCsurf(value: `false` | CsurfOptions): Self = StObject.set(x, "csurf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsurfUndefined: Self = StObject.set(x, "csurf", js.undefined)
    }
  }
  
  @js.native
  trait Level extends StObject {
    
    var level: LogLevel = js.native
    
    def report(content: String, `type`: LogLevel): Unit = js.native
  }
  object Level {
    
    @scala.inline
    def apply(level: LogLevel, report: (String, LogLevel) => Unit): Level = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], report = js.Any.fromFunction2(report))
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReport(value: (String, LogLevel) => Unit): Self = StObject.set(x, "report", js.Any.fromFunction2(value))
    }
  }
  
  /* Inlined {[ key in server.server/typings/common.LogLevel ]: server.server/typings/common.LogFn} */
  @js.native
  trait keyinLogLevelLogFn extends StObject {
    
    def alert(template: String, tokens: String*): Unit = js.native
    @JSName("alert")
    var alert_Original: LogFn = js.native
    
    def critical(template: String, tokens: String*): Unit = js.native
    @JSName("critical")
    var critical_Original: LogFn = js.native
    
    def debug(template: String, tokens: String*): Unit = js.native
    @JSName("debug")
    var debug_Original: LogFn = js.native
    
    def emergency(template: String, tokens: String*): Unit = js.native
    @JSName("emergency")
    var emergency_Original: LogFn = js.native
    
    def error(template: String, tokens: String*): Unit = js.native
    @JSName("error")
    var error_Original: LogFn = js.native
    
    def info(template: String, tokens: String*): Unit = js.native
    @JSName("info")
    var info_Original: LogFn = js.native
    
    def notice(template: String, tokens: String*): Unit = js.native
    @JSName("notice")
    var notice_Original: LogFn = js.native
    
    def warning(template: String, tokens: String*): Unit = js.native
    @JSName("warning")
    var warning_Original: LogFn = js.native
  }
}
