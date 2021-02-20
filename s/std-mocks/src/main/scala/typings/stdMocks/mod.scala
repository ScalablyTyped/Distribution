package typings.stdMocks

import typings.stdMocks.anon.Optionsprintbooleanundefi
import typings.stdMocks.anon.Optionsstderrfalse
import typings.stdMocks.anon.Optionsstdoutfalse
import typings.stdMocks.anon.Optionsstdoutfalsestderrf
import typings.stdMocks.anon.Stderr
import typings.stdMocks.anon.StderrStdout
import typings.stdMocks.anon.Stdout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("std-mocks", "flush")
  @js.native
  def flush(): StderrStdout = js.native
  @JSImport("std-mocks", "flush")
  @js.native
  def flush(opts: Optionsstderrfalse): Stdout = js.native
  @JSImport("std-mocks", "flush")
  @js.native
  def flush(opts: Optionsstdoutfalse): Stderr = js.native
  @JSImport("std-mocks", "flush")
  @js.native
  def flush(opts: Optionsstdoutfalsestderrf): js.Object = js.native
  @JSImport("std-mocks", "flush")
  @js.native
  def flush(opts: Options): StderrStdout = js.native
  
  @JSImport("std-mocks", "restore")
  @js.native
  def restore(): Unit = js.native
  @JSImport("std-mocks", "restore")
  @js.native
  def restore(opts: Options): Unit = js.native
  
  @JSImport("std-mocks", "use")
  @js.native
  def use(): Unit = js.native
  @JSImport("std-mocks", "use")
  @js.native
  def use(opts: Optionsprintbooleanundefi): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var stderr: js.UndefOr[Boolean] = js.native
    
    var stdout: js.UndefOr[Boolean] = js.native
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
      def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      @scala.inline
      def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
}
