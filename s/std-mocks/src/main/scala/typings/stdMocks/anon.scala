package typings.stdMocks

import typings.stdMocks.stdMocksBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std-mocks.std-mocks.Options & {  print :boolean | undefined} */
  trait Optionsprintbooleanundefi extends StObject {
    
    var print: js.UndefOr[Boolean] = js.undefined
    
    var stderr: js.UndefOr[Boolean] = js.undefined
    
    var stdout: js.UndefOr[Boolean] = js.undefined
  }
  object Optionsprintbooleanundefi {
    
    @scala.inline
    def apply(): Optionsprintbooleanundefi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsprintbooleanundefi]
    }
    
    @scala.inline
    implicit class OptionsprintbooleanundefiMutableBuilder[Self <: Optionsprintbooleanundefi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrint(value: Boolean): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
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
  
  /* Inlined std-mocks.std-mocks.Options & {  stderr :false} */
  trait Optionsstderrfalse extends StObject {
    
    var stderr: js.UndefOr[Boolean] & `false`
    
    var stdout: js.UndefOr[Boolean] = js.undefined
  }
  object Optionsstderrfalse {
    
    @scala.inline
    def apply(stderr: js.UndefOr[Boolean] & `false`): Optionsstderrfalse = {
      val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsstderrfalse]
    }
    
    @scala.inline
    implicit class OptionsstderrfalseMutableBuilder[Self <: Optionsstderrfalse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStderr(value: js.UndefOr[Boolean] & `false`): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
  
  /* Inlined std-mocks.std-mocks.Options & {  stdout :false} */
  trait Optionsstdoutfalse extends StObject {
    
    var stderr: js.UndefOr[Boolean] = js.undefined
    
    var stdout: js.UndefOr[Boolean] & `false`
  }
  object Optionsstdoutfalse {
    
    @scala.inline
    def apply(stdout: js.UndefOr[Boolean] & `false`): Optionsstdoutfalse = {
      val __obj = js.Dynamic.literal(stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsstdoutfalse]
    }
    
    @scala.inline
    implicit class OptionsstdoutfalseMutableBuilder[Self <: Optionsstdoutfalse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      @scala.inline
      def setStdout(value: js.UndefOr[Boolean] & `false`): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std-mocks.std-mocks.Options & {  stdout :false,   stderr :false} */
  trait Optionsstdoutfalsestderrf extends StObject {
    
    var stderr: js.UndefOr[Boolean] & `false`
    
    var stdout: js.UndefOr[Boolean] & `false`
  }
  object Optionsstdoutfalsestderrf {
    
    @scala.inline
    def apply(stderr: js.UndefOr[Boolean] & `false`, stdout: js.UndefOr[Boolean] & `false`): Optionsstdoutfalsestderrf = {
      val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsstdoutfalsestderrf]
    }
    
    @scala.inline
    implicit class OptionsstdoutfalsestderrfMutableBuilder[Self <: Optionsstdoutfalsestderrf] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStderr(value: js.UndefOr[Boolean] & `false`): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdout(value: js.UndefOr[Boolean] & `false`): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stderr extends StObject {
    
    var stderr: js.Array[String]
  }
  object Stderr {
    
    @scala.inline
    def apply(stderr: js.Array[String]): Stderr = {
      val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stderr]
    }
    
    @scala.inline
    implicit class StderrMutableBuilder[Self <: Stderr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStderr(value: js.Array[String]): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrVarargs(value: String*): Self = StObject.set(x, "stderr", js.Array(value :_*))
    }
  }
  
  trait StderrStdout extends StObject {
    
    var stderr: js.Array[String]
    
    var stdout: js.Array[String]
  }
  object StderrStdout {
    
    @scala.inline
    def apply(stderr: js.Array[String], stdout: js.Array[String]): StderrStdout = {
      val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[StderrStdout]
    }
    
    @scala.inline
    implicit class StderrStdoutMutableBuilder[Self <: StderrStdout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStderr(value: js.Array[String]): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrVarargs(value: String*): Self = StObject.set(x, "stderr", js.Array(value :_*))
      
      @scala.inline
      def setStdout(value: js.Array[String]): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutVarargs(value: String*): Self = StObject.set(x, "stdout", js.Array(value :_*))
    }
  }
  
  trait Stdout extends StObject {
    
    var stdout: js.Array[String]
  }
  object Stdout {
    
    @scala.inline
    def apply(stdout: js.Array[String]): Stdout = {
      val __obj = js.Dynamic.literal(stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stdout]
    }
    
    @scala.inline
    implicit class StdoutMutableBuilder[Self <: Stdout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStdout(value: js.Array[String]): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutVarargs(value: String*): Self = StObject.set(x, "stdout", js.Array(value :_*))
    }
  }
}
