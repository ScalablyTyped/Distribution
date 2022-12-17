package typings.stdMocks

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
    
    inline def apply(): Optionsprintbooleanundefi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsprintbooleanundefi]
    }
    
    extension [Self <: Optionsprintbooleanundefi](x: Self) {
      
      inline def setPrint(value: Boolean): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      inline def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
  
  /* Inlined std-mocks.std-mocks.Options & {  stderr :false} */
  trait Optionsstderrfalse extends StObject {
    
    var stderr: js.UndefOr[Boolean] = js.undefined
    
    var stdout: js.UndefOr[Boolean] = js.undefined
  }
  object Optionsstderrfalse {
    
    inline def apply(): Optionsstderrfalse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsstderrfalse]
    }
    
    extension [Self <: Optionsstderrfalse](x: Self) {
      
      inline def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
  
  /* Inlined std-mocks.std-mocks.Options & {  stdout :false} */
  trait Optionsstdoutfalse extends StObject {
    
    var stderr: js.UndefOr[Boolean] = js.undefined
    
    var stdout: js.UndefOr[Boolean] = js.undefined
  }
  object Optionsstdoutfalse {
    
    inline def apply(): Optionsstdoutfalse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsstdoutfalse]
    }
    
    extension [Self <: Optionsstdoutfalse](x: Self) {
      
      inline def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
  
  /* Inlined std-mocks.std-mocks.Options & {  stdout :false,   stderr :false} */
  trait Optionsstdoutfalsestderrf extends StObject {
    
    var stderr: js.UndefOr[Boolean] = js.undefined
    
    var stdout: js.UndefOr[Boolean] = js.undefined
  }
  object Optionsstdoutfalsestderrf {
    
    inline def apply(): Optionsstdoutfalsestderrf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsstdoutfalsestderrf]
    }
    
    extension [Self <: Optionsstdoutfalsestderrf](x: Self) {
      
      inline def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
  
  trait Stderr extends StObject {
    
    var stderr: js.Array[String]
  }
  object Stderr {
    
    inline def apply(stderr: js.Array[String]): Stderr = {
      val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stderr]
    }
    
    extension [Self <: Stderr](x: Self) {
      
      inline def setStderr(value: js.Array[String]): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrVarargs(value: String*): Self = StObject.set(x, "stderr", js.Array(value*))
    }
  }
  
  trait StderrStdout extends StObject {
    
    var stderr: js.Array[String]
    
    var stdout: js.Array[String]
  }
  object StderrStdout {
    
    inline def apply(stderr: js.Array[String], stdout: js.Array[String]): StderrStdout = {
      val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[StderrStdout]
    }
    
    extension [Self <: StderrStdout](x: Self) {
      
      inline def setStderr(value: js.Array[String]): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrVarargs(value: String*): Self = StObject.set(x, "stderr", js.Array(value*))
      
      inline def setStdout(value: js.Array[String]): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutVarargs(value: String*): Self = StObject.set(x, "stdout", js.Array(value*))
    }
  }
  
  trait Stdout extends StObject {
    
    var stdout: js.Array[String]
  }
  object Stdout {
    
    inline def apply(stdout: js.Array[String]): Stdout = {
      val __obj = js.Dynamic.literal(stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stdout]
    }
    
    extension [Self <: Stdout](x: Self) {
      
      inline def setStdout(value: js.Array[String]): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutVarargs(value: String*): Self = StObject.set(x, "stdout", js.Array(value*))
    }
  }
}
