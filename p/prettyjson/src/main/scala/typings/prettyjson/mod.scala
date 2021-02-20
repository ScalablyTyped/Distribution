package typings.prettyjson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prettyjson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prettyjson", "render")
  @js.native
  def render(data: js.Any): String = js.native
  @JSImport("prettyjson", "render")
  @js.native
  def render(data: js.Any, options: js.UndefOr[scala.Nothing], indentation: Double): String = js.native
  @JSImport("prettyjson", "render")
  @js.native
  def render(data: js.Any, options: RendererOptions): String = js.native
  @JSImport("prettyjson", "render")
  @js.native
  def render(data: js.Any, options: RendererOptions, indentation: Double): String = js.native
  
  @JSImport("prettyjson", "renderString")
  @js.native
  def renderString(data: String): String = js.native
  @JSImport("prettyjson", "renderString")
  @js.native
  def renderString(data: String, options: js.UndefOr[scala.Nothing], indentation: Double): String = js.native
  @JSImport("prettyjson", "renderString")
  @js.native
  def renderString(data: String, options: RendererOptions): String = js.native
  @JSImport("prettyjson", "renderString")
  @js.native
  def renderString(data: String, options: RendererOptions, indentation: Double): String = js.native
  
  @JSImport("prettyjson", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @js.native
  trait RendererOptions extends StObject {
    
    var dashColor: js.UndefOr[String] = js.native
    
    var defaultIndentation: js.UndefOr[Double] = js.native
    
    /**
      * Define behavior for Array objects
      */
    var emptyArrayMsg: js.UndefOr[String] = js.native
    
    // default: (empty)
    var inlineArrays: js.UndefOr[Boolean] = js.native
    
    var keysColor: js.UndefOr[String] = js.native
    
    var noAlign: js.UndefOr[Boolean] = js.native
    
    /**
      * Color definition
      */
    var noColor: js.UndefOr[Boolean] = js.native
    
    var numberColor: js.UndefOr[String] = js.native
    
    var stringColor: js.UndefOr[String] = js.native
  }
  object RendererOptions {
    
    @scala.inline
    def apply(): RendererOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RendererOptions]
    }
    
    @scala.inline
    implicit class RendererOptionsMutableBuilder[Self <: RendererOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDashColor(value: String): Self = StObject.set(x, "dashColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashColorUndefined: Self = StObject.set(x, "dashColor", js.undefined)
      
      @scala.inline
      def setDefaultIndentation(value: Double): Self = StObject.set(x, "defaultIndentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultIndentationUndefined: Self = StObject.set(x, "defaultIndentation", js.undefined)
      
      @scala.inline
      def setEmptyArrayMsg(value: String): Self = StObject.set(x, "emptyArrayMsg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyArrayMsgUndefined: Self = StObject.set(x, "emptyArrayMsg", js.undefined)
      
      @scala.inline
      def setInlineArrays(value: Boolean): Self = StObject.set(x, "inlineArrays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineArraysUndefined: Self = StObject.set(x, "inlineArrays", js.undefined)
      
      @scala.inline
      def setKeysColor(value: String): Self = StObject.set(x, "keysColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysColorUndefined: Self = StObject.set(x, "keysColor", js.undefined)
      
      @scala.inline
      def setNoAlign(value: Boolean): Self = StObject.set(x, "noAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAlignUndefined: Self = StObject.set(x, "noAlign", js.undefined)
      
      @scala.inline
      def setNoColor(value: Boolean): Self = StObject.set(x, "noColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoColorUndefined: Self = StObject.set(x, "noColor", js.undefined)
      
      @scala.inline
      def setNumberColor(value: String): Self = StObject.set(x, "numberColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberColorUndefined: Self = StObject.set(x, "numberColor", js.undefined)
      
      @scala.inline
      def setStringColor(value: String): Self = StObject.set(x, "stringColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringColorUndefined: Self = StObject.set(x, "stringColor", js.undefined)
    }
  }
}
