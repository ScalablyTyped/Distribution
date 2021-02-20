package typings.runmd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("runmd", "render")
  @js.native
  def render(inputText: String): String = js.native
  @JSImport("runmd", "render")
  @js.native
  def render(inputText: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * name of input file
      */
    var inputName: js.UndefOr[String] = js.native
    
    /**
      * if true, disables RunMD footer
      */
    var lame: js.UndefOr[Boolean] = js.native
    
    /**
      * name of output file
      */
    var outputName: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
      
      @scala.inline
      def setLame(value: Boolean): Self = StObject.set(x, "lame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLameUndefined: Self = StObject.set(x, "lame", js.undefined)
      
      @scala.inline
      def setOutputName(value: String): Self = StObject.set(x, "outputName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputNameUndefined: Self = StObject.set(x, "outputName", js.undefined)
    }
  }
}
