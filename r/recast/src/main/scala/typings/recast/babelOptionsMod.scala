package typings.recast

import typings.recast.anon.ParserOptionspluginsArray
import typings.recast.recastStrings.module
import typings.recast.recastStrings.script
import typings.recast.recastStrings.unambiguous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object babelOptionsMod {
  
  @JSImport("recast/parsers/_babel_options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): ParserOptionspluginsArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ParserOptionspluginsArray]
  @scala.inline
  def default(options: Overrides): ParserOptionspluginsArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[ParserOptionspluginsArray]
  
  /* Inlined std.Partial<{  sourceType :@babel/parser.@babel/parser.ParserOptions['sourceType'],   strictMode :@babel/parser.@babel/parser.ParserOptions['strictMode']}> */
  trait Overrides extends StObject {
    
    var sourceType: js.UndefOr[script | module | unambiguous] = js.undefined
    
    var strictMode: js.UndefOr[Boolean] = js.undefined
  }
  object Overrides {
    
    @scala.inline
    def apply(): Overrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Overrides]
    }
    
    @scala.inline
    implicit class OverridesMutableBuilder[Self <: Overrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceType(value: script | module | unambiguous): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
      
      @scala.inline
      def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
    }
  }
}
