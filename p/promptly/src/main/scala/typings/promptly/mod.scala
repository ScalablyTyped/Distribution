package typings.promptly

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promptly", "choose")
  @js.native
  def choose(message: String, choices: js.Array[String]): js.Any = js.native
  @JSImport("promptly", "choose")
  @js.native
  def choose(message: String, choices: js.Array[String], fn: Callback): js.Any = js.native
  @JSImport("promptly", "choose")
  @js.native
  def choose(message: String, choices: js.Array[String], opts: Options): js.Any = js.native
  @JSImport("promptly", "choose")
  @js.native
  def choose(message: String, choices: js.Array[String], opts: Options, fn: Callback): js.Any = js.native
  
  @JSImport("promptly", "confirm")
  @js.native
  def confirm(message: String): js.Any = js.native
  @JSImport("promptly", "confirm")
  @js.native
  def confirm(message: String, fn: Callback): js.Any = js.native
  @JSImport("promptly", "confirm")
  @js.native
  def confirm(message: String, opts: Options): js.Any = js.native
  @JSImport("promptly", "confirm")
  @js.native
  def confirm(message: String, opts: Options, fn: Callback): js.Any = js.native
  
  @JSImport("promptly", "password")
  @js.native
  def password(message: String): js.Any = js.native
  @JSImport("promptly", "password")
  @js.native
  def password(message: String, fn: Callback): js.Any = js.native
  @JSImport("promptly", "password")
  @js.native
  def password(message: String, opts: Options): js.Any = js.native
  @JSImport("promptly", "password")
  @js.native
  def password(message: String, opts: Options, fn: Callback): js.Any = js.native
  
  @JSImport("promptly", "prompt")
  @js.native
  def prompt(message: String): js.Any = js.native
  @JSImport("promptly", "prompt")
  @js.native
  def prompt(message: String, fn: Callback): js.Any = js.native
  @JSImport("promptly", "prompt")
  @js.native
  def prompt(message: String, opts: Options): js.Any = js.native
  @JSImport("promptly", "prompt")
  @js.native
  def prompt(message: String, opts: Options, fn: Callback): js.Any = js.native
  
  type Callback = js.Function2[/* err */ Error, /* value */ String, Unit]
  
  @js.native
  trait Options extends StObject {
    
    var default: js.UndefOr[String] = js.native
    
    var input: js.UndefOr[ReadableStream] = js.native
    
    var output: js.UndefOr[WritableStream] = js.native
    
    var replace: js.UndefOr[String] = js.native
    
    var retry: js.UndefOr[Boolean] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
    
    var trim: js.UndefOr[Boolean] = js.native
    
    var validator: js.UndefOr[js.Any] = js.native
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
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setInput(value: ReadableStream): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setOutput(value: WritableStream): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setReplace(value: String): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setRetry(value: Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      @scala.inline
      def setValidator(value: js.Any): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
}
